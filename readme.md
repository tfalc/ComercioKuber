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
#### Formato do domínio
![Domínio](https://github.com/tfalc/ComercioKuber/blob/master/img/arch/01%20-%20ecommerce.png)
#### Arquitetura do serviço
![Arquitetura](https://github.com/tfalc/ComercioKuber/blob/master/img/arch/02%20-%20checkout.png)
#### Como o app irá se comunicar
![Comunicação](https://github.com/tfalc/ComercioKuber/blob/master/img/arch/03%20-%20Comunicacao.png)
