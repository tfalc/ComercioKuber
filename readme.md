#App de e-commerce com arquitetura de microsserviços
Criação de um app de e-commerce utilizando arquitetura de microsserviços para rodar a aplicação

## Tecnologias utilizadas
- Spring
- Apache Kafka
    - Serviço de mensageria e streaming para troca de informações entre módulos. Abaixo uma descrição dos serviços de mensageria:
        - Mensagens
        - Tópicos
        - Produtores
        - Consumidiores
        - Brokers
        - Clusters
        - Apache Zookeeper
- Avro
    - Será utilizado para manter integridade dos dados utilizados através de serialização.
- Schema Registry
    - Será utilizado para organizar e armazenar os dados utilizados pelo Avro.
- Kubernetes
    - Hospedagem de microsserviço escolhido para rodar aplicações.
- Zookeeper
- Serviço de Stream (podem ser utilizados)
    - Microsoft Event Hub
    - Amazon Kinesis
    - Google Pub/Sub

### Como a arquitetura foi pensada
[Domínio](img/arch/01 - ecommerce.jpg)
[Arquitetura](img/arch/02 - checkout.jpg)
[Comunicação](img/arch/03 - Comunicacao.jpg)