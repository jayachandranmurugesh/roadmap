For your Senior Java Backend Engineer / Tech Lead interviews, I recommend learning Kubernetes to an intermediate, production-troubleshooting level.

You do NOT need to become a Kubernetes administrator or master every Kubernetes component.

Interviewers generally want to know whether you can:

1. Deploy a Spring Boot application.
2. Understand how it runs inside Kubernetes.
3. Scale applications.
4. Troubleshoot production failures.
5. Configure networking and external dependencies.
6. Understand resource management and high availability.

Given your Java, Spring Boot, Docker and GCP learning path, I'd target approximately 15–20 hours of focused preparation.

# 1. Kubernetes interview preparation roadmap

Phase 1 – Core architecture

Must know

Estimated: 2 hours

- Cluster, Control Plane, Worker Nodes.
- Pod, Container, Node, containerd.
- Kubernetes Scheduler and kubelet.
- Deployment, ReplicaSet and Pod relationship.
- Namespace.

Interview expectation: Explain how a Spring Boot application runs inside Kubernetes.

Phase 2 – Deployment and scaling

Must know

Estimated: 3 hours

- Deployment YAML.
- ReplicaSet and replicas.
- Rolling updates and rollback.
- Horizontal Pod Autoscaler (HPA).
- Node scaling vs Pod scaling.
- ImagePullPolicy and image versions.

Interview expectation: How do you deploy 3 replicas and scale to 10 when traffic increases?

Phase 3 – Networking

Must know

Estimated: 2 hours

- Pod IP and communication.
- ClusterIP Service.
- NodePort.
- LoadBalancer.
- Ingress.
- Kubernetes DNS.

Interview expectation: How does your Order Service communicate with Payment Service running in another Pod?

Phase 4 – Configuration and security

Must know

Estimated: 2 hours

- ConfigMap.
- Secrets.
- Environment variables.
- Service Accounts.
- RBAC basics.
- Persistent Volumes and Persistent Volume Claims.

Interview expectation: How do you manage database credentials across DEV, QA and PROD?

Phase 5 – Health checks and resource management

Must know

Estimated: 3 hours

- Liveness Probe.
- Readiness Probe.
- Startup Probe.
- CPU and Memory Requests.
- CPU and Memory Limits.
- OOMKilled.
- Pod eviction.

Interview expectation: Your Spring Boot application takes 45 seconds to start. How do you prevent Kubernetes from restarting it prematurely?

Phase 6 – Production troubleshooting

Very important

Estimated: 3 hours

- CrashLoopBackOff.
- ImagePullBackOff.
- Pending Pods.
- Container restarts.
- CPU throttling.
- Memory leaks and OOMKilled.
- Logs and events.
- kubectl describe, logs and exec.

Interview expectation: Your Spring Boot application was working yesterday, but today its Pods keep restarting. How would you investigate?

Phase 7 – GKE and advanced concepts

Good to know

Estimated: 2–3 hours

- GKE Standard vs Autopilot.
- Regional vs Zonal clusters.
- Node Pools.
- Cluster Autoscaler.
- Helm basics.
- StatefulSet vs Deployment.
- DaemonSet and Jobs.
- Kubernetes architecture in GCP.

## 2. What you should be able to answer in interviews

These are 15 practical questions I'd prioritize.

| #  | Interview question                           | Priority |
| -- | -------------------------------------------- | -------- |
| 1  | Pod vs Container vs Node?                    | Critical |
| 2  | Deployment vs ReplicaSet?                    | Critical |
| 3  | How does Kubernetes scale Pods?              | Critical |
| 4  | How does Service discovery work?             | Critical |
| 5  | ClusterIP vs NodePort vs LoadBalancer?       | High     |
| 6  | Liveness vs Readiness probes?                | Critical |
| 7  | What happens when a Pod crashes?             | Critical |
| 8  | What causes CrashLoopBackOff?                | Critical |
| 9  | What is OOMKilled?                           | Critical |
| 10 | Requests vs Limits?                          | Critical |
| 11 | How do you configure application properties? | High     |
| 12 | How do you perform rolling deployments?      | High     |
| 13 | How do you troubleshoot a Pending Pod?       | High     |
| 14 | Regional vs Zonal GKE?                       | Medium   |
| 15 | How do you connect Spring Boot to Cloud SQL? | High     |

## 3. Practical commands you must know

You don't need to memorize hundreds of commands. Start with these:

| Command                                       | Purpose                      |
| --------------------------------------------- | ---------------------------- |
| `kubectl get nodes`                           | List worker nodes            |
| `kubectl get pods`                            | List Pods                    |
| `kubectl get deployments`                     | List deployments             |
| `kubectl describe pod <name>`                 | Investigate Pod details      |
| `kubectl logs <pod>`                          | Read application logs        |
| `kubectl logs <pod> --previous`               | Read previous container logs |
| `kubectl exec -it <pod> -- sh`                | Enter container shell        |
| `kubectl apply -f app.yaml`                   | Deploy configuration         |
| `kubectl scale deployment order --replicas=5` | Scale application            |
| `kubectl rollout status deployment/order`     | Check deployment             |
| `kubectl rollout undo deployment/order`       | Rollback deployment          |

## 4. How I recommend we learn

Rather than simply covering definitions, let's use your Spring Boot microservices as our running example.

Our practical project

[Integrate PayPal API with Microservice Architecture for eCommerce Payments](https://images.openai.com/static-rsc-4/Dy9hwHHmt1pQ-JstPK9k6vmIha-jV01k2ClQz1oKvp8lXvMGP8ufpNrPdlLFX3KkyqblSsognkk037NPUJWoG0EpCoVwggyMLqh5FjnzUz0at9f6f1men4NH4cBtifUKUHw1rltXsPDZP3KMXj1XBGKlMjySOUVCsyypfUXliK0?purpose=inline)

[vitochen.com](https://vitochen.com/integrate-paypal-api-with-microservice-architecture/?utm_source=chatgpt.com)

We will deploy:

- Order Service
- Payment Service
- User Service
- PostgreSQL (initially external, then discuss persistence)
- API Gateway

We will progressively understand:

1. Dockerize the Spring Boot services.
2. Deploy them using Kubernetes YAML.
3. Create multiple replicas.
4. Connect services through Kubernetes networking.
5. Simulate failures.
6. Troubleshoot production incidents.

## 5. How much depth should you target?

| Skill                                     | Target level   |
| ----------------------------------------- | -------------- |
| Kubernetes architecture                   | Strong         |
| Deployments and Pods                      | Strong         |
| Networking                                | Strong         |
| Health checks                             | Strong         |
| Troubleshooting                           | Strong         |
| YAML writing                              | Intermediate   |
| Helm                                      | Basic          |
| GKE administration                        | Basic          |
| Kubernetes internals / CNI implementation | Awareness only |
| Cluster administration and upgrades       | Awareness only |

My recommendation: Don't spend weeks learning Kubernetes internals. Your objective is to confidently explain how a Java microservice is deployed, scaled, monitored and troubleshot in production.

## Let's continue: Topic 1 – Deployment vs ReplicaSet vs Pod

This is the next concept we should master. It is the foundation for almost everything else in Kubernetes.

One question to start:

Suppose you create a Kubernetes Deployment with `replicas: 3`.

Who actually ensures that three Pods are continuously running?

A. Kubernetes Scheduler

B. ReplicaSet

C. containerd

D. kubelet

Think about it before answering. We'll build the complete execution flow from there.
