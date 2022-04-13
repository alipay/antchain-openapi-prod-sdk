// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodSpec extends TeaModel {
    // Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers
    @NameInMap("active_deadline_seconds")
    public Long activeDeadlineSeconds;

    // If specified, the pod_s scheduling constraints
    // 
    @NameInMap("affinity")
    public Affinity affinity;

    // AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
    // 
    @NameInMap("automount_service_account_token")
    public Boolean automountServiceAccountToken;

    // List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
    // 
    @NameInMap("containers")
    @Validation(required = true)
    public java.util.List<ContainerSpec> containers;

    // Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
    @NameInMap("dns_config")
    public PodDNSConfig dnsConfig;

    // Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are _ClusterFirstWithHostNet_, _ClusterFirst_, _Default_ or _None_. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to _ClusterFirstWithHostNet_.
    @NameInMap("dns_policy")
    public String dnsPolicy;

    // EnableServiceLinks indicates whether information about services should be injected into pod_s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
    // 
    @NameInMap("enable_service_links")
    public Boolean enableServiceLinks;

    // HostAliases is an optional list of hosts and IPs that will be injected into the pod_s hosts file if specified. This is only valid for non-hostNetwork pods.
    @NameInMap("host_aliases")
    public HostAlias hostAliases;

    // Use the host_s ipc namespace. Optional: Default to false.
    // 
    @NameInMap("host_ipc")
    public Boolean hostIpc;

    // Host networking requested for this pod. Use the host_s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
    // 
    @NameInMap("host_network")
    public Boolean hostNetwork;

    // Use the host_s pid namespace. Optional: Default to false.
    // 
    @NameInMap("host_pid")
    public Boolean hostPid;

    // Specifies the hostname of the Pod If not specified, the pod_s hostname will be set to a system-defined value.
    // 
    @NameInMap("hostname")
    public String hostname;

    // ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec
    @NameInMap("image_pull_secrets")
    public java.util.List<String> imagePullSecrets;

    // List of initialization containers belonging to the pod
    @NameInMap("init_containers")
    public java.util.List<ContainerSpec> initContainers;

    // NodeName is a request to schedule this pod onto a specific node. 
    @NameInMap("node_name")
    public String nodeName;

    // NodeSelector is a selector which must be true for the pod to fit on a node
    @NameInMap("node_selector")
    public java.util.List<PodNodeSelector> nodeSelector;

    // The priority value. Various system components use this field to find the priority of the pod.
    @NameInMap("priority")
    public Long priority;

    // If specified, indicates the pod_s priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority
    @NameInMap("priority_class_name")
    public String priorityClassName;

    // If specified, all readiness gates will be evaluated for pod readiness
    @NameInMap("readiness_gates")
    public PodReadinessGate readinessGates;

    // Restart policy for all containers within the pod
    @NameInMap("restart_policy")
    public String restartPolicy;

    // ServiceAccountName is the name of the ServiceAccount to use to run this pod
    @NameInMap("service_account_name")
    public String serviceAccountName;

    // If specified, the pod_s tolerations.
    // 
    @NameInMap("tolerations")
    public java.util.List<Toleration> tolerations;

    // List of volumes that can be mounted by containers belonging to the pod
    @NameInMap("volumes")
    public java.util.List<Volume> volumes;

    public static PodSpec build(java.util.Map<String, ?> map) throws Exception {
        PodSpec self = new PodSpec();
        return TeaModel.build(map, self);
    }

    public PodSpec setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public PodSpec setAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }
    public Affinity getAffinity() {
        return this.affinity;
    }

    public PodSpec setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }
    public Boolean getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken;
    }

    public PodSpec setContainers(java.util.List<ContainerSpec> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ContainerSpec> getContainers() {
        return this.containers;
    }

    public PodSpec setDnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public PodDNSConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public PodSpec setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public PodSpec setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
        return this;
    }
    public Boolean getEnableServiceLinks() {
        return this.enableServiceLinks;
    }

    public PodSpec setHostAliases(HostAlias hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public HostAlias getHostAliases() {
        return this.hostAliases;
    }

    public PodSpec setHostIpc(Boolean hostIpc) {
        this.hostIpc = hostIpc;
        return this;
    }
    public Boolean getHostIpc() {
        return this.hostIpc;
    }

    public PodSpec setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public PodSpec setHostPid(Boolean hostPid) {
        this.hostPid = hostPid;
        return this;
    }
    public Boolean getHostPid() {
        return this.hostPid;
    }

    public PodSpec setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public PodSpec setImagePullSecrets(java.util.List<String> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public java.util.List<String> getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public PodSpec setInitContainers(java.util.List<ContainerSpec> initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public java.util.List<ContainerSpec> getInitContainers() {
        return this.initContainers;
    }

    public PodSpec setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public PodSpec setNodeSelector(java.util.List<PodNodeSelector> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public java.util.List<PodNodeSelector> getNodeSelector() {
        return this.nodeSelector;
    }

    public PodSpec setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public PodSpec setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }
    public String getPriorityClassName() {
        return this.priorityClassName;
    }

    public PodSpec setReadinessGates(PodReadinessGate readinessGates) {
        this.readinessGates = readinessGates;
        return this;
    }
    public PodReadinessGate getReadinessGates() {
        return this.readinessGates;
    }

    public PodSpec setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public PodSpec setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    public PodSpec setTolerations(java.util.List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public java.util.List<Toleration> getTolerations() {
        return this.tolerations;
    }

    public PodSpec setVolumes(java.util.List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<Volume> getVolumes() {
        return this.volumes;
    }

}
