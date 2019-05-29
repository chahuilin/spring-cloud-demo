# spring-cloud-demo
Spring Cloud 从入门到精通

# eureka-server

eureka的服务注册中心

# eureka-client

eureka的服务提供方

# eureka-consumer-feign

eureka的服务消费者,Spring Cloud Feign是一套基于Netflix Feign实现的声明式服务调用客户端.
由于Feign是基于Ribbon实现的，所以它自带了客户端负载均衡功能，也可以通过Ribbon的IRule进行策略扩展。

# eureka-consumer-ribbon-hystrix

服务容错保护（Hystrix服务降级）

# hystrix-dashboard

Hystrix监控面板

访问： http://localhost:1301/hystrix

填入： http://localhost:2102/actuator/hystrix.stream，去监控节点

# api-gateway

服务网关

访问：http://localhost:1101/eureka-consumer-ribbon-hystrix/consumer

该请求将最终被路由到eureka-consumer-ribbon-hystrix的/consumer接口上