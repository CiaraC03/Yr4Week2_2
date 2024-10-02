package ie.atu.week3_microservice_2;

@FeignClient(name = "notification-service", url = "http://localhost:8082")
public interface NotificationsClient {
}
