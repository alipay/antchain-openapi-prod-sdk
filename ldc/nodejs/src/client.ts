// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * Model for initing client
 */
export class Config extends $tea.Model {
  accessKeyId?: string;
  accessKeySecret?: string;
  securityToken?: string;
  protocol?: string;
  readTimeout?: number;
  connectTimeout?: number;
  httpProxy?: string;
  httpsProxy?: string;
  endpoint?: string;
  noProxy?: string;
  maxIdleConns?: number;
  userAgent?: string;
  socks5Proxy?: string;
  socks5NetWork?: string;
  maxIdleTimeMillis?: number;
  keepAliveDurationMillis?: number;
  maxRequests?: number;
  maxRequestsPerHost?: number;
  static names(): { [key: string]: string } {
    return {
      accessKeyId: 'accessKeyId',
      accessKeySecret: 'accessKeySecret',
      securityToken: 'securityToken',
      protocol: 'protocol',
      readTimeout: 'readTimeout',
      connectTimeout: 'connectTimeout',
      httpProxy: 'httpProxy',
      httpsProxy: 'httpsProxy',
      endpoint: 'endpoint',
      noProxy: 'noProxy',
      maxIdleConns: 'maxIdleConns',
      userAgent: 'userAgent',
      socks5Proxy: 'socks5Proxy',
      socks5NetWork: 'socks5NetWork',
      maxIdleTimeMillis: 'maxIdleTimeMillis',
      keepAliveDurationMillis: 'keepAliveDurationMillis',
      maxRequests: 'maxRequests',
      maxRequestsPerHost: 'maxRequestsPerHost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKeyId: 'string',
      accessKeySecret: 'string',
      securityToken: 'string',
      protocol: 'string',
      readTimeout: 'number',
      connectTimeout: 'number',
      httpProxy: 'string',
      httpsProxy: 'string',
      endpoint: 'string',
      noProxy: 'string',
      maxIdleConns: 'number',
      userAgent: 'string',
      socks5Proxy: 'string',
      socks5NetWork: 'string',
      maxIdleTimeMillis: 'number',
      keepAliveDurationMillis: 'number',
      maxRequests: 'number',
      maxRequestsPerHost: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// label selector requirement struct
export class LabelSelectorRequirement extends $tea.Model {
  // label key
  key: string;
  // label match operator
  operator: string;
  // label match values
  values: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      operator: 'operator',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      operator: 'string',
      values: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// label of all k8s resource
export class Label extends $tea.Model {
  // label key
  key: string;
  // label value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k8s label selector
export class LabelSelector extends $tea.Model {
  // matchExpressions is a list of label selector requirements.
  matchExpressions?: LabelSelectorRequirement[];
  // matchLabels is a map of {key,value} pairs
  matchLabels?: Label[];
  static names(): { [key: string]: string } {
    return {
      matchExpressions: 'match_expressions',
      matchLabels: 'match_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      matchExpressions: { 'type': 'array', 'itemType': LabelSelectorRequirement },
      matchLabels: { 'type': 'array', 'itemType': Label },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1NodeSelectorRequirement
export class NodeSelectorRequirement extends $tea.Model {
  // key
  key: string;
  // operator
  operator: string;
  // values
  values: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      operator: 'operator',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      operator: 'string',
      values: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// nodeSelectorterm
export class NodeSelectorTerm extends $tea.Model {
  // A list of node selector requirements by node labels.
  // 
  matchExpressions?: NodeSelectorRequirement[];
  // A list of node selector requirements by node fields.
  // 
  matchFields: NodeSelectorRequirement[];
  static names(): { [key: string]: string } {
    return {
      matchExpressions: 'match_expressions',
      matchFields: 'match_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      matchExpressions: { 'type': 'array', 'itemType': NodeSelectorRequirement },
      matchFields: { 'type': 'array', 'itemType': NodeSelectorRequirement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// http方式的健康检查配置
export class HttpGetAction extends $tea.Model {
  // 健康检查url地址。
  path: string;
  // 健康检查端口。
  port: string;
  // 协议类型，http/https。
  scheme: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      port: 'port',
      scheme: 'scheme',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      port: 'string',
      scheme: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 命令行方式的健康检查配置。
export class ExecAction extends $tea.Model {
  // 执行健康检查的命令。
  command: string;
  static names(): { [key: string]: string } {
    return {
      command: 'command',
    };
  }

  static types(): { [key: string]: any } {
    return {
      command: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1PodAffinityTerm
export class PodAffinityTerm extends $tea.Model {
  // labelSelctor
  labelSelector: LabelSelector;
  // namespaces
  namespaces: string[];
  static names(): { [key: string]: string } {
    return {
      labelSelector: 'label_selector',
      namespaces: 'namespaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelSelector: LabelSelector,
      namespaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// tcp方式的健康检查配置。
export class TcpSocketAction extends $tea.Model {
  // 健康检查端口。
  port: string;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1NodeSelector
export class NodeSelector extends $tea.Model {
  // node selector terms
  nodeSelectorTerms: NodeSelectorTerm[];
  static names(): { [key: string]: string } {
    return {
      nodeSelectorTerms: 'node_selector_terms',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeSelectorTerms: { 'type': 'array', 'itemType': NodeSelectorTerm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基于configmap&secret的volume。
export class ConfigmapSecretVolumeSource extends $tea.Model {
  // 引用volume名称。
  volumeRefName: string;
  static names(): { [key: string]: string } {
    return {
      volumeRefName: 'volume_ref_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      volumeRefName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// volume mount of PersistentVolumeClaim.
export class PersistentVolumeClaimSource extends $tea.Model {
  // 引用的PVC名称。
  pvcName: string;
  static names(): { [key: string]: string } {
    return {
      pvcName: 'pvc_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pvcName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1WeightedPodAffinityTerm
export class WeightedPodAffinityTerm extends $tea.Model {
  // Pod Affinity Term
  podAffinityTerm: PodAffinityTerm;
  // weight
  weight: number;
  static names(): { [key: string]: string } {
    return {
      podAffinityTerm: 'pod_affinity_term',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      podAffinityTerm: PodAffinityTerm,
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k8s prefer schedule term
export class PreferredSchedulingTerm extends $tea.Model {
  // A null or empty node selector term matches no objects
  preference?: NodeSelectorTerm;
  // Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
  // 
  weight: number;
  static names(): { [key: string]: string } {
    return {
      preference: 'preference',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preference: NodeSelectorTerm,
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本地磁盘volume。
export class LocalDiskVolumeSource extends $tea.Model {
  // 主机路径。
  hostDirectoryPath: string;
  // 是否允许创建。
  createIfNotPresent: boolean;
  static names(): { [key: string]: string } {
    return {
      hostDirectoryPath: 'host_directory_path',
      createIfNotPresent: 'create_if_not_present',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostDirectoryPath: 'string',
      createIfNotPresent: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 表示容器的环境变量来源。
export class EnvVarSource extends $tea.Model {
  // 对应的ConfigMap或Secret名称。
  objectName: string;
  // 对应的Object类型。
  // 取值：ConfigMap | Secret
  objectType: string;
  // 引用的ConfigMap或则Secret的key。
  key: string;
  static names(): { [key: string]: string } {
    return {
      objectName: 'object_name',
      objectType: 'object_type',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      objectName: 'string',
      objectType: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// EmptyDir based volume.
export class EmptyDirVolumeSource extends $tea.Model {
  // 存储介质。
  medium: string;
  // volume name。
  name: string;
  // 存储大小。
  sizeLimit: string;
  static names(): { [key: string]: string } {
    return {
      medium: 'medium',
      name: 'name',
      sizeLimit: 'size_limit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      medium: 'string',
      name: 'string',
      sizeLimit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 健康检查探针
// 
export class HealthCheckProbe extends $tea.Model {
  // 基于命令行类型的探针必填
  execAction?: ExecAction;
  // 探针运行失败阈值
  // 
  failureThreshold: number;
  // 基于HTTP GET请求的探针必填
  // 
  httpGetAction?: HttpGetAction;
  // 探针初始运行延迟时间
  // 
  initialDelaySeconds: number;
  // 探针运行间隔时间
  // 
  periodSeconds: number;
  // 探针运行成功阈值
  // 
  successThreshold: number;
  // 基于TCP连接的探针必填
  // 
  tcpSocketAction?: TcpSocketAction;
  // 探针运行超时时间
  // 
  timeOutSeconds: number;
  static names(): { [key: string]: string } {
    return {
      execAction: 'exec_action',
      failureThreshold: 'failure_threshold',
      httpGetAction: 'http_get_action',
      initialDelaySeconds: 'initial_delay_seconds',
      periodSeconds: 'period_seconds',
      successThreshold: 'success_threshold',
      tcpSocketAction: 'tcp_socket_action',
      timeOutSeconds: 'time_out_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      execAction: ExecAction,
      failureThreshold: 'number',
      httpGetAction: HttpGetAction,
      initialDelaySeconds: 'number',
      periodSeconds: 'number',
      successThreshold: 'number',
      tcpSocketAction: TcpSocketAction,
      timeOutSeconds: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodAntiAffinity
export class PodAntiAffinity extends $tea.Model {
  // The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
  preferredDuringSchedulingIgnoredDuringExecution?: WeightedPodAffinityTerm[];
  // If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
  requiredDuringSchedulingIgnoredDuringExecution?: PodAffinityTerm[];
  static names(): { [key: string]: string } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: 'preferred_during_scheduling_ignored_during_execution',
      requiredDuringSchedulingIgnoredDuringExecution: 'required_during_scheduling_ignored_during_execution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: { 'type': 'array', 'itemType': WeightedPodAffinityTerm },
      requiredDuringSchedulingIgnoredDuringExecution: { 'type': 'array', 'itemType': PodAffinityTerm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性伸缩指标目标值类型
export class HPABasedElasticConfigMetricTargetResourceValue extends $tea.Model {
  // 数值
  value: number;
  // 数值单位:
  // Byte, Ki, Mi, Gi, Ti, Pi
  // m, C
  unit: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'number',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Container Spec 字段 Override 对象
export class FieldOverride extends $tea.Model {
  // 部署单元名称
  cell: string;
  // 字段名称
  name: string;
  // 字段值
  value: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性扩缩容规则策略
export class HPAScalePolicy extends $tea.Model {
  // 枚举型：
  // - pods：按pod个数扩缩容；
  // - percent：基于当前副本数的百分比扩缩容。
  type: string;
  // 当type为percent时，value值为增长副本数的百分比，900%表示在原先副本数的基础上增加9倍（单位：%）；当type为pods时，value值为增加的副本数目（单位：个）。
  value: number;
  // 每次扩缩容动作间隔时间：600表示每10分钟操作一次
  periodSeconds?: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      value: 'value',
      periodSeconds: 'period_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      value: 'number',
      periodSeconds: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodAffinity
export class PodAffinity extends $tea.Model {
  // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
  preferredDuringSchedulingIgnoredDuringExecution?: WeightedPodAffinityTerm[];
  // f the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
  requiredDuringDchedulingIgnoredDuringExecution: PodAffinityTerm[];
  static names(): { [key: string]: string } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: 'preferred_during_scheduling_ignored_during_execution',
      requiredDuringDchedulingIgnoredDuringExecution: 'required_during_dcheduling_ignored_during_execution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: { 'type': 'array', 'itemType': WeightedPodAffinityTerm },
      requiredDuringDchedulingIgnoredDuringExecution: { 'type': 'array', 'itemType': PodAffinityTerm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日志配置实体
export class LogConfigEntity extends $tea.Model {
  // 配置名称
  configName: string;
  // 输入类型
  inputType: string;
  // 日志库名称
  logstoreName: string;
  // 日志目录
  logPath: string;
  // file_pattern
  filePattern?: string;
  static names(): { [key: string]: string } {
    return {
      configName: 'config_name',
      inputType: 'input_type',
      logstoreName: 'logstore_name',
      logPath: 'log_path',
      filePattern: 'file_pattern',
    };
  }

  static types(): { [key: string]: any } {
    return {
      configName: 'string',
      inputType: 'string',
      logstoreName: 'string',
      logPath: 'string',
      filePattern: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Node affinity is a group of node affinity scheduling rules.
export class NodeAffinity extends $tea.Model {
  // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions
  preferredDuringSchedulingIgnoredDuringExecution?: PreferredSchedulingTerm[];
  // If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
  requiredDuringDchedulingIgnoredDuringExecution: NodeSelector;
  static names(): { [key: string]: string } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: 'preferred_during_scheduling_ignored_during_execution',
      requiredDuringDchedulingIgnoredDuringExecution: 'required_during_dcheduling_ignored_during_execution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preferredDuringSchedulingIgnoredDuringExecution: { 'type': 'array', 'itemType': PreferredSchedulingTerm },
      requiredDuringDchedulingIgnoredDuringExecution: NodeSelector,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 健康检查配置
// 
export class HealthCheckConfig extends $tea.Model {
  // liveness 检查
  // 
  livenessProbe?: HealthCheckProbe;
  // readiness 检查
  // 
  readinessProbe?: HealthCheckProbe;
  static names(): { [key: string]: string } {
    return {
      livenessProbe: 'liveness_probe',
      readinessProbe: 'readiness_probe',
    };
  }

  static types(): { [key: string]: any } {
    return {
      livenessProbe: HealthCheckProbe,
      readinessProbe: HealthCheckProbe,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 表示容器的环境变量。
export class EnvVar extends $tea.Model {
  // 环境变量名称。
  name: string;
  // 环境变量value。
  value?: string;
  // 环境变量的取值来源。
  valueFrom?: EnvVarSource;
  // EnvVar类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
      valueFrom: 'value_from',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
      valueFrom: EnvVarSource,
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Pod container VolumeMount info。
export class VolumeMount extends $tea.Model {
  // 引用Configmap&Secret的存储。
  configmapSecretVolumeSource?: ConfigmapSecretVolumeSource;
  // 基于empty dir的存储。
  emptyDirVolumeSource?: EmptyDirVolumeSource;
  // 基于本地磁盘的存储资源。
  localDiskVolumeSource?: LocalDiskVolumeSource;
  // 容器内挂载路径。
  mountPath: string;
  // 引用的volume名称。
  name?: string;
  // 是否只读。
  readOnly: boolean;
  // 容器内挂载路径子路径。
  subPath?: string;
  // 数据卷类型，取值 LOCAL_STORAGE：主机挂载， CONFIGMAP：配置项， SECRET：保密字典
  volumeSourceCategoryType: string;
  // 引用的PVC信息。
  pvcSource?: PersistentVolumeClaimSource;
  // 容器内挂载子路径的表达式，与sub_path互斥
  subPathExpr?: string;
  static names(): { [key: string]: string } {
    return {
      configmapSecretVolumeSource: 'configmap_secret_volume_source',
      emptyDirVolumeSource: 'empty_dir_volume_source',
      localDiskVolumeSource: 'local_disk_volume_source',
      mountPath: 'mount_path',
      name: 'name',
      readOnly: 'read_only',
      subPath: 'sub_path',
      volumeSourceCategoryType: 'volume_source_category_type',
      pvcSource: 'pvc_source',
      subPathExpr: 'sub_path_expr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      configmapSecretVolumeSource: ConfigmapSecretVolumeSource,
      emptyDirVolumeSource: EmptyDirVolumeSource,
      localDiskVolumeSource: LocalDiskVolumeSource,
      mountPath: 'string',
      name: 'string',
      readOnly: 'boolean',
      subPath: 'string',
      volumeSourceCategoryType: 'string',
      pvcSource: PersistentVolumeClaimSource,
      subPathExpr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环境变量配置覆盖。
export class EnvVarOverride extends $tea.Model {
  // 部署单元名称。
  cell: string;
  // 环境变量名称。
  name: string;
  // 环境变量取值。
  value: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MapStringToStringEntity
export class MapStringToString extends $tea.Model {
  // key
  key: string;
  // value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器生命周期hook。
export class LifecycleHook extends $tea.Model {
  // 启动后执行命令。
  postStartExec?: ExecAction;
  // 启动后执行http get。
  postStartHttp?: HttpGetAction;
  // 启动后执行TCP请求。
  postStartTcp?: TcpSocketAction;
  // 停止前执行命令。
  preStopExec?: ExecAction;
  // 停止前http get。
  preStopHttp?: HttpGetAction;
  // 停止前TCP请求。
  preStopTcp?: TcpSocketAction;
  static names(): { [key: string]: string } {
    return {
      postStartExec: 'post_start_exec',
      postStartHttp: 'post_start_http',
      postStartTcp: 'post_start_tcp',
      preStopExec: 'pre_stop_exec',
      preStopHttp: 'pre_stop_http',
      preStopTcp: 'pre_stop_tcp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      postStartExec: ExecAction,
      postStartHttp: HttpGetAction,
      postStartTcp: TcpSocketAction,
      preStopExec: ExecAction,
      preStopHttp: HttpGetAction,
      preStopTcp: TcpSocketAction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1PodDNSConfigOption， PodDNSConfigOption defines DNS resolver options of a pod.
// 
// 
export class PodDNSConfigOption extends $tea.Model {
  // name
  name?: string;
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodAffinityTermEntity
export class PodAffinityTermEntity extends $tea.Model {
  // label_selector
  labelSelector?: MapStringToString[];
  // namespaces
  namespaces?: string[];
  // topology_key
  topologyKey?: string;
  static names(): { [key: string]: string } {
    return {
      labelSelector: 'label_selector',
      namespaces: 'namespaces',
      topologyKey: 'topology_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelSelector: { 'type': 'array', 'itemType': MapStringToString },
      namespaces: { 'type': 'array', 'itemType': 'string' },
      topologyKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// affinity MatchExpression
export class MatchExpression extends $tea.Model {
  // key
  key: string;
  // operator
  operator: string;
  // values
  values?: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      operator: 'operator',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      operator: 'string',
      values: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
export class Toleration extends $tea.Model {
  // 取值：NoExecute、PreferNoSchedule、NoSchedule
  effect: string;
  // Key is the taint key that the toleration applies to.
  key: string;
  // 取值：Equal、Exists
  operator?: string;
  // TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. 
  tolerationSeconds?: number;
  // Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
  value?: string;
  static names(): { [key: string]: string } {
    return {
      effect: 'effect',
      key: 'key',
      operator: 'operator',
      tolerationSeconds: 'toleration_seconds',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      effect: 'string',
      key: 'string',
      operator: 'string',
      tolerationSeconds: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container state running
export class ContainerStateRunning extends $tea.Model {
  // container启动时间
  startedAt: string;
  static names(): { [key: string]: string } {
    return {
      startedAt: 'started_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      startedAt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k8s resource annotations
export class Annotation extends $tea.Model {
  // annotation key
  key: string;
  // annotation value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器配置。
export class ContainerSpec extends $tea.Model {
  // 最大CPU限制，格式 1/1m。
  cpuLimit: string;
  // 最少需要的CPU核数，格式 1/1m。
  cpuRequest: string;
  // 启动命令。
  entryPoints?: string[];
  // 环境变量。
  envs?: EnvVar[];
  // 容器环境变量配置覆盖。
  envOverrides?: EnvVarOverride[];
  // 健康检查配置
  // 
  healthCheckConfig?: HealthCheckConfig;
  // 地址，格式形如 repository:tag。
  image: string;
  // 镜像构建名。
  imageBuildName?: string;
  // image pull secret
  imagePullSecret?: string;
  // 镜像来源，构建/普通镜像。
  imageSource: string;
  // 生命周期钩子。
  lifecycleHook?: LifecycleHook;
  // 日志服务配置
  logConfigs?: LogConfigEntity[];
  // 最大内存限制，单位 Byte/Ki/Mi/Gi/Ti/Pi。
  memoryLimit: string;
  // 最小需要的内存大小，单位 Byte/Ki/Mi/Gi/Ti/Pi。
  memoryRequest: string;
  // 容器名称。
  name: string;
  // 重启策略。
  restartPolicy: string;
  // 容器类型。
  type: string;
  // 存储卷
  // 
  volumeMounts?: VolumeMount[];
  // volumeMountV2, json格式，方便扩展, 与volumes_str搭配使用，启用后废弃volume_mount字段
  // {
  // 	"volumeMounts": [{
  // 		"mountPath": "/container/config",
  // 		"name": "aarm-base-configmap-volume",
  // 		"readOnly": true
  // 	}, {
  // 		"mountPath": "/container/scrt",
  // 		"name": "panling-secret-volume",
  // 		"readOnly": true
  // 	}, {
  // 		"mountPath": "/container/pvc",
  // 		"name": "afa-public-data-pv",
  // 		"readOnly": true
  // 	}, {
  // 		"mountPath": "/container/local",
  // 		"name": "container-local-host-volume",
  // 		"readOnly": true
  // 	}]
  // }
  // 这里会兼容原来OpenAPI传过来的volume_mount字段
  volumeMountsStr?: string;
  // 与volume_mounts_str搭配使用，描述pod的volume部分
  // {
  // 	"volumes": [{
  // 			"configMap": {
  // 				"defaultMode": 256,
  // 				"name": "aarm-base"
  // 			},
  // 			"name": "aarm-base-configmap-volume"
  // 		},
  // 		{
  // 			"name": "panling-secret-volume",
  // 			"secret": {
  // 				"defaultMode": 256,
  // 				"secretName": "panling"
  // 			}
  // 		},
  // 		{
  // 			"name": "afa-public-data-pv",
  // 			"persistentVolumeClaim": {
  // 				"claimName": "afa-public-data"
  // 			}
  // 		},
  // 		{
  // 			"hostPath": {
  // 				"path": "/local"
  // 			},
  // 			"name": "container-local-host-volume"
  // 		}
  // 	]
  // }
  volumesStr?: string;
  // 基础字段覆盖
  fieldOverrides?: FieldOverride[];
  static names(): { [key: string]: string } {
    return {
      cpuLimit: 'cpu_limit',
      cpuRequest: 'cpu_request',
      entryPoints: 'entry_points',
      envs: 'envs',
      envOverrides: 'env_overrides',
      healthCheckConfig: 'health_check_config',
      image: 'image',
      imageBuildName: 'image_build_name',
      imagePullSecret: 'image_pull_secret',
      imageSource: 'image_source',
      lifecycleHook: 'lifecycle_hook',
      logConfigs: 'log_configs',
      memoryLimit: 'memory_limit',
      memoryRequest: 'memory_request',
      name: 'name',
      restartPolicy: 'restart_policy',
      type: 'type',
      volumeMounts: 'volume_mounts',
      volumeMountsStr: 'volume_mounts_str',
      volumesStr: 'volumes_str',
      fieldOverrides: 'field_overrides',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpuLimit: 'string',
      cpuRequest: 'string',
      entryPoints: { 'type': 'array', 'itemType': 'string' },
      envs: { 'type': 'array', 'itemType': EnvVar },
      envOverrides: { 'type': 'array', 'itemType': EnvVarOverride },
      healthCheckConfig: HealthCheckConfig,
      image: 'string',
      imageBuildName: 'string',
      imagePullSecret: 'string',
      imageSource: 'string',
      lifecycleHook: LifecycleHook,
      logConfigs: { 'type': 'array', 'itemType': LogConfigEntity },
      memoryLimit: 'string',
      memoryRequest: 'string',
      name: 'string',
      restartPolicy: 'string',
      type: 'string',
      volumeMounts: { 'type': 'array', 'itemType': VolumeMount },
      volumeMountsStr: 'string',
      volumesStr: 'string',
      fieldOverrides: { 'type': 'array', 'itemType': FieldOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性伸缩指标目标值
export class HPABasedElasticConfigMetricTarget extends $tea.Model {
  // 支持两种类型：AverageValue，Utilization
  type: string;
  // value
  value?: HPABasedElasticConfigMetricTargetResourceValue;
  // 利用率
  utilization?: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      value: 'value',
      utilization: 'utilization',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      value: HPABasedElasticConfigMetricTargetResourceValue,
      utilization: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodReadinessGate contains the reference to a pod condition
export class PodReadinessGate extends $tea.Model {
  // ConditionType refers to a condition in the pod_s condition list with matching type.
  conditionType: string;
  static names(): { [key: string]: string } {
    return {
      conditionType: 'condition_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conditionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性扩缩容高级配置规则
export class HPAScaleRule extends $tea.Model {
  // 冷却窗口时间
  stabilizationWindowSeconds?: number;
  // 扩缩容策略
  policies?: HPAScalePolicy[];
  static names(): { [key: string]: string } {
    return {
      stabilizationWindowSeconds: 'stabilization_window_seconds',
      policies: 'policies',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stabilizationWindowSeconds: 'number',
      policies: { 'type': 'array', 'itemType': HPAScalePolicy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Affinity is a group of affinity scheduling rules.
export class Affinity extends $tea.Model {
  // Describes node affinity scheduling rules for the pod.
  // 
  nodeAffinity?: NodeAffinity;
  // Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
  podAffinity?: PodAffinity;
  // Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
  // 
  podAntiAffinity?: PodAntiAffinity;
  static names(): { [key: string]: string } {
    return {
      nodeAffinity: 'node_affinity',
      podAffinity: 'pod_affinity',
      podAntiAffinity: 'pod_anti_affinity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeAffinity: NodeAffinity,
      podAffinity: PodAffinity,
      podAntiAffinity: PodAntiAffinity,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container state terminated
export class ContainerStateTerminated extends $tea.Model {
  // container id
  containerId: string;
  // exit code
  exitCode: number;
  // container结束时间
  finishedAt: string;
  // message
  message: string;
  // reason
  reason: string;
  // signal
  signal: string;
  // container start time
  startedAt: string;
  static names(): { [key: string]: string } {
    return {
      containerId: 'container_id',
      exitCode: 'exit_code',
      finishedAt: 'finished_at',
      message: 'message',
      reason: 'reason',
      signal: 'signal',
      startedAt: 'started_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerId: 'string',
      exitCode: 'number',
      finishedAt: 'string',
      message: 'string',
      reason: 'string',
      signal: 'string',
      startedAt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ResourceValue
export class ResourceValue extends $tea.Model {
  // value
  value: number;
  // Ki、Mi、Gi、Ti、Pi、m、c
  unit: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'number',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod_s hosts file.
export class HostAlias extends $tea.Model {
  // Hostnames for the above IP address.
  hostnames?: string[];
  // IP address of the host file entry.
  // 
  ip?: string;
  static names(): { [key: string]: string } {
    return {
      hostnames: 'hostnames',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostnames: { 'type': 'array', 'itemType': 'string' },
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
export class PodDNSConfig extends $tea.Model {
  // A list of DNS name server IP addresses
  nameservers?: string[];
  // A list of DNS resolver options. 
  options?: PodDNSConfigOption[];
  // A list of DNS search domains for host-name lookup
  searches: string[];
  static names(): { [key: string]: string } {
    return {
      nameservers: 'nameservers',
      options: 'options',
      searches: 'searches',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nameservers: { 'type': 'array', 'itemType': 'string' },
      options: { 'type': 'array', 'itemType': PodDNSConfigOption },
      searches: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// pod volume info.
export class Volume extends $tea.Model {
  // 主机目录[仅针对HostPath类型volume有效]
  hostPath?: string;
  // Volume名称。
  name: string;
  // 关联的资源名称。
  refResourceName?: string;
  //  LOCAL_STORAGE：主机挂载|CONFIGMAP：配置项|SECRET：保密字典
  type: string;
  // Volume是否只读
  readOnly?: boolean;
  static names(): { [key: string]: string } {
    return {
      hostPath: 'host_path',
      name: 'name',
      refResourceName: 'ref_resource_name',
      type: 'type',
      readOnly: 'read_only',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostPath: 'string',
      name: 'string',
      refResourceName: 'string',
      type: 'string',
      readOnly: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodNodeSelector
export class PodNodeSelector extends $tea.Model {
  // key
  key: string;
  // value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container state waiting
export class ContainerStateWaiting extends $tea.Model {
  // message
  message: string;
  // reason
  reason: string;
  static names(): { [key: string]: string } {
    return {
      message: 'message',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      message: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// pod detail info
export class PodDetailInfo extends $tea.Model {
  // 集群名称
  // 
  cluster: string;
  // pod created time
  createdTime: string;
  // 已经具备的finalizers
  finalizers?: string[];
  // pod的生命周期当前阶段
  lifecycleStage?: string;
  // pod name
  name: string;
  // pod namespace
  namespace: string;
  // pod ip
  podIp: string;
  // pod的版本
  revision?: string;
  // pod status
  status: string;
  // pod uid
  uid?: string;
  // 描述Pod当前状态的信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      createdTime: 'created_time',
      finalizers: 'finalizers',
      lifecycleStage: 'lifecycle_stage',
      name: 'name',
      namespace: 'namespace',
      podIp: 'pod_ip',
      revision: 'revision',
      status: 'status',
      uid: 'uid',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      createdTime: 'string',
      finalizers: { 'type': 'array', 'itemType': 'string' },
      lifecycleStage: 'string',
      name: 'string',
      namespace: 'string',
      podIp: 'string',
      revision: 'string',
      status: 'string',
      uid: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// deployment strategy rolling update
export class RollingUpdateDeployment extends $tea.Model {
  // The maximum number of pods that can be scheduled above the desired number of pods.
  maxSurge?: string;
  // The maximum number of pods that can be unavailable during the update.
  maxUnavailable?: string;
  static names(): { [key: string]: string } {
    return {
      maxSurge: 'max_surge',
      maxUnavailable: 'max_unavailable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxSurge: 'string',
      maxUnavailable: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 扩缩容策略高级配置项
export class HPAScaleBehavior extends $tea.Model {
  // 扩容高级规则
  scaleUp?: HPAScaleRule;
  // 缩容高级规则
  scaleDown?: HPAScaleRule;
  static names(): { [key: string]: string } {
    return {
      scaleUp: 'scale_up',
      scaleDown: 'scale_down',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scaleUp: HPAScaleRule,
      scaleDown: HPAScaleRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MapResourceNameToValue
export class MapResourceNameToValue extends $tea.Model {
  // key
  key: string;
  // value
  value: ResourceValue;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: ResourceValue,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LoadBalancer监听。
export class LoadBalancerListener extends $tea.Model {
  // 负载均衡实例后端使用的端口。
  // 取值：1-65535。
  backendServerPort: number;
  // 监听的带宽峰值，取值：
  // -1：不限制带宽峰值。
  // 1~5120：监听的带宽峰值，所有监听的带宽峰值之和不能超过实例的带宽峰值。
  bandWidth?: number;
  // CA证书ID。
  // 若既上传CA证书又上传服务器证书，即采用双向认证。
  // 若用户只上传服务器证书，即为单向认证。
  caCertificateId?: string;
  // 服务器上配置的Cookie。
  // 长度为1~200个字符，只能包含ASCII英文字母和数字字符，不能包含逗号、分号或空格，也不能以开头。
  cookie?: string;
  // Cookie超时时间
  cookieTimeout?: number;
  // 连接超时时间（秒）
  establishedTimeout?: number;
  // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。
  // 取值: 2-10。
  healthyThreshold?: number;
  // 是否开启健康检查。
  // 取值：ON | OFF。
  healthCheck?: string;
  // 健康检查端口。
  healthCheckConnectPort?: number;
  // 健康检查链接超时时间。
  healthCheckConnectTimeout?: number;
  // 用于健康检查的域名。取值：
  // ip： 后端服务器的私网IP。当指定了IP或该参数未指定时，负载均衡会使用各后端服务器的私网IP当做健康检查使用的域名。
  // domain：域名长度为1-80，只能包含字母、数字、点号（.）和连字符（-）。
  healthCheckDomain?: string;
  // 健康检查正常的HTTP状态码，多个状态码用逗号分隔。
  // 默认值为http_2xx。
  healthCheckHttpCode?: string;
  // 健康检查的时间间隔。
  // 取值:1-50（秒）。
  healthCheckInterval?: number;
  // 健康检查threshold。
  healthCheckThreshold?: number;
  // 接收来自运行状况检查的响应需要等待的时间。如果后端ECS在指定的时间内没有正确响应，则判定为健康检查失败。
  // 取值：1-300（秒）。
  healthCheckTimeout?: number;
  // 用于健康检查的URI。
  // 当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
  healthCheckUri?: string;
  // 负载均衡实例前端使用的端口。
  // 取值：1-65535。
  listenerPort?: number;
  // TCP 会话保持的超时时间（秒）
  persistenceTimeout?: number;
  // 监听使用协议。
  protocol?: string;
  // 负载均衡策略（RR 轮询 | WLC 最小连接数）
  scheduler?: string;
  // 0不开会话保持 / 1植入Cookie / 2重写Cookie。
  // 开启会话保持功能后，负载均衡会把来自同一客户端的访问请求分发到同一台后端服务器上进行处理。
  // HTTP协议会话保持基于Cookie。负载均衡提供了两种Cookie处理方式：
  // 植入Cookie：您只需要指定Cookie的过期时间。
  // 客户端第一次访问时，负载均衡会在返回请求中植入Cookie（即在HTTP/HTTPS响应报文中插入SERVERID），下次客户端携带此Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器上。
  // 重写Cookie：可以根据需要指定HTTPS/HTTP响应中插入的Cookie。您需要在后端服务器上维护该Cookie的过期时间和生存时间。
  // 负载均衡服务发现用户自定义了Cookie，将会对原来的Cookie进行重写，下次客户端携带新的Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器
  sessionStickyType: number;
  // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。
  // 取值：2-10。
  unhealthyThreshold?: number;
  // 是否开启通过 X-Forwarded-For 的方式获取来访者真实 IP
  xforwardFor?: boolean;
  // 统一接入域名
  domain?: string;
  // 统一接入转发路径
  path?: string;
  static names(): { [key: string]: string } {
    return {
      backendServerPort: 'backend_server_port',
      bandWidth: 'band_width',
      caCertificateId: 'ca_certificate_id',
      cookie: 'cookie',
      cookieTimeout: 'cookie_timeout',
      establishedTimeout: 'established_timeout',
      healthyThreshold: 'healthy_threshold',
      healthCheck: 'health_check',
      healthCheckConnectPort: 'health_check_connect_port',
      healthCheckConnectTimeout: 'health_check_connect_timeout',
      healthCheckDomain: 'health_check_domain',
      healthCheckHttpCode: 'health_check_http_code',
      healthCheckInterval: 'health_check_interval',
      healthCheckThreshold: 'health_check_threshold',
      healthCheckTimeout: 'health_check_timeout',
      healthCheckUri: 'health_check_uri',
      listenerPort: 'listener_port',
      persistenceTimeout: 'persistence_timeout',
      protocol: 'protocol',
      scheduler: 'scheduler',
      sessionStickyType: 'session_sticky_type',
      unhealthyThreshold: 'unhealthy_threshold',
      xforwardFor: 'xforward_for',
      domain: 'domain',
      path: 'path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backendServerPort: 'number',
      bandWidth: 'number',
      caCertificateId: 'string',
      cookie: 'string',
      cookieTimeout: 'number',
      establishedTimeout: 'number',
      healthyThreshold: 'number',
      healthCheck: 'string',
      healthCheckConnectPort: 'number',
      healthCheckConnectTimeout: 'number',
      healthCheckDomain: 'string',
      healthCheckHttpCode: 'string',
      healthCheckInterval: 'number',
      healthCheckThreshold: 'number',
      healthCheckTimeout: 'number',
      healthCheckUri: 'string',
      listenerPort: 'number',
      persistenceTimeout: 'number',
      protocol: 'string',
      scheduler: 'string',
      sessionStickyType: 'number',
      unhealthyThreshold: 'number',
      xforwardFor: 'boolean',
      domain: 'string',
      path: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 某一部署单元或集群对应的副本数。
export class ReplicaCount extends $tea.Model {
  // 副本数量是部署单元维度还是集群维度。目前只支持Cell
  type: string;
  // 部署单元名称或集群名称。
  name: string;
  // 对应副本数量。
  count: number;
  // （针对huanyu场景），original_count该单元当前的副本个数（count对应期望的副本个数）
  originalCount?: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      count: 'count',
      originalCount: 'original_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      name: 'string',
      count: 'number',
      originalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// node affinity entity
export class NodeAffinityConfig extends $tea.Model {
  // match_expressions
  matchExpressions?: MatchExpression[];
  // requested
  requested?: boolean;
  // weight
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      matchExpressions: 'match_expressions',
      requested: 'requested',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      matchExpressions: { 'type': 'array', 'itemType': MatchExpression },
      requested: 'boolean',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 每个cell副本数map
export class CellReplicasMap extends $tea.Model {
  // cell name
  name: string;
  // 副本数
  replicas: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      replicas: 'replicas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      replicas: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Specification of the desired behavior of the pod. 
export class PodSpec extends $tea.Model {
  // Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers
  activeDeadlineSeconds?: number;
  // If specified, the pod_s scheduling constraints
  // 
  affinity?: Affinity;
  // AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
  // 
  automountServiceAccountToken?: boolean;
  // List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
  // 
  containers: ContainerSpec[];
  // Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
  dnsConfig?: PodDNSConfig;
  // Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are _ClusterFirstWithHostNet_, _ClusterFirst_, _Default_ or _None_. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to _ClusterFirstWithHostNet_.
  dnsPolicy?: string;
  // EnableServiceLinks indicates whether information about services should be injected into pod_s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
  // 
  enableServiceLinks?: boolean;
  // HostAliases is an optional list of hosts and IPs that will be injected into the pod_s hosts file if specified. This is only valid for non-hostNetwork pods.
  hostAliases?: HostAlias;
  // Use the host_s ipc namespace. Optional: Default to false.
  // 
  hostIpc?: boolean;
  // Host networking requested for this pod. Use the host_s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
  // 
  hostNetwork?: boolean;
  // Use the host_s pid namespace. Optional: Default to false.
  // 
  hostPid?: boolean;
  // Specifies the hostname of the Pod If not specified, the pod_s hostname will be set to a system-defined value.
  // 
  hostname?: string;
  // ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec
  imagePullSecrets?: string[];
  // List of initialization containers belonging to the pod
  initContainers?: ContainerSpec[];
  // NodeName is a request to schedule this pod onto a specific node. 
  nodeName?: string;
  // NodeSelector is a selector which must be true for the pod to fit on a node
  nodeSelector?: PodNodeSelector[];
  // The priority value. Various system components use this field to find the priority of the pod.
  priority?: number;
  // If specified, indicates the pod_s priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority
  priorityClassName?: string;
  // If specified, all readiness gates will be evaluated for pod readiness
  readinessGates?: PodReadinessGate;
  // Restart policy for all containers within the pod
  restartPolicy?: string;
  // ServiceAccountName is the name of the ServiceAccount to use to run this pod
  serviceAccountName?: string;
  // If specified, the pod_s tolerations.
  // 
  tolerations?: Toleration[];
  // List of volumes that can be mounted by containers belonging to the pod
  volumes?: Volume[];
  static names(): { [key: string]: string } {
    return {
      activeDeadlineSeconds: 'active_deadline_seconds',
      affinity: 'affinity',
      automountServiceAccountToken: 'automount_service_account_token',
      containers: 'containers',
      dnsConfig: 'dns_config',
      dnsPolicy: 'dns_policy',
      enableServiceLinks: 'enable_service_links',
      hostAliases: 'host_aliases',
      hostIpc: 'host_ipc',
      hostNetwork: 'host_network',
      hostPid: 'host_pid',
      hostname: 'hostname',
      imagePullSecrets: 'image_pull_secrets',
      initContainers: 'init_containers',
      nodeName: 'node_name',
      nodeSelector: 'node_selector',
      priority: 'priority',
      priorityClassName: 'priority_class_name',
      readinessGates: 'readiness_gates',
      restartPolicy: 'restart_policy',
      serviceAccountName: 'service_account_name',
      tolerations: 'tolerations',
      volumes: 'volumes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeDeadlineSeconds: 'number',
      affinity: Affinity,
      automountServiceAccountToken: 'boolean',
      containers: { 'type': 'array', 'itemType': ContainerSpec },
      dnsConfig: PodDNSConfig,
      dnsPolicy: 'string',
      enableServiceLinks: 'boolean',
      hostAliases: HostAlias,
      hostIpc: 'boolean',
      hostNetwork: 'boolean',
      hostPid: 'boolean',
      hostname: 'string',
      imagePullSecrets: { 'type': 'array', 'itemType': 'string' },
      initContainers: { 'type': 'array', 'itemType': ContainerSpec },
      nodeName: 'string',
      nodeSelector: { 'type': 'array', 'itemType': PodNodeSelector },
      priority: 'number',
      priorityClassName: 'string',
      readinessGates: PodReadinessGate,
      restartPolicy: 'string',
      serviceAccountName: 'string',
      tolerations: { 'type': 'array', 'itemType': Toleration },
      volumes: { 'type': 'array', 'itemType': Volume },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性伸缩指标
export class HPABasedElasticConfigMetric extends $tea.Model {
  // 指标名称：
  // CPU，Memory，QPS，RT
  name: string;
  // 目标值
  target: HPABasedElasticConfigMetricTarget;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      target: HPABasedElasticConfigMetricTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k8s meta元数据
export class ObjectMeta extends $tea.Model {
  // k8s meta annotation
  annotations?: Annotation[];
  // 创建时间戳
  creationTimestamp?: string;
  // k8s meta labels
  labels: Label[];
  // 名称
  name?: string;
  // 命名空间
  namespace?: string;
  static names(): { [key: string]: string } {
    return {
      annotations: 'annotations',
      creationTimestamp: 'creation_timestamp',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annotations: { 'type': 'array', 'itemType': Annotation },
      creationTimestamp: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PodAffinityConfigEntity
export class PodAffinityConfig extends $tea.Model {
  // anti_affinity
  antiAffinity?: boolean;
  // pod_affinity_term
  podAffinityTerm?: PodAffinityTermEntity;
  // requested
  requested?: boolean;
  // weight
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      antiAffinity: 'anti_affinity',
      podAffinityTerm: 'pod_affinity_term',
      requested: 'requested',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antiAffinity: 'boolean',
      podAffinityTerm: PodAffinityTermEntity,
      requested: 'boolean',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container state
export class ContainerState extends $tea.Model {
  // container running state
  running: ContainerStateRunning;
  // container terminated state
  terminated: ContainerStateTerminated;
  // container waiting state
  waiting: ContainerStateWaiting;
  static names(): { [key: string]: string } {
    return {
      running: 'running',
      terminated: 'terminated',
      waiting: 'waiting',
    };
  }

  static types(): { [key: string]: any } {
    return {
      running: ContainerStateRunning,
      terminated: ContainerStateTerminated,
      waiting: ContainerStateWaiting,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AffinityEntity
export class AffinityEntity extends $tea.Model {
  // NodeAffinityConfig list
  nodeAffinity?: NodeAffinityConfig[];
  // pod_affinity list
  podAffinity?: PodAffinityConfig[];
  static names(): { [key: string]: string } {
    return {
      nodeAffinity: 'node_affinity',
      podAffinity: 'pod_affinity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeAffinity: { 'type': 'array', 'itemType': NodeAffinityConfig },
      podAffinity: { 'type': 'array', 'itemType': PodAffinityConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ResourceRequirementConfig
export class ResourceRequirementConfig extends $tea.Model {
  // limits
  limits?: MapResourceNameToValue[];
  // requests
  requests?: MapResourceNameToValue[];
  static names(): { [key: string]: string } {
    return {
      limits: 'limits',
      requests: 'requests',
    };
  }

  static types(): { [key: string]: any } {
    return {
      limits: { 'type': 'array', 'itemType': MapResourceNameToValue },
      requests: { 'type': 'array', 'itemType': MapResourceNameToValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个计算容器上正在执行的任务。
export class OpsComputerTask extends $tea.Model {
  // 任务描述
  description?: string;
  // 执行详情。如果任务成功，为执行日志；如果任务失败，为错误信息
  executeDetails?: string;
  // 任务结束时间
  finishTime?: string;
  // 任务名称
  name?: string;
  // 任务开始时间
  startTime?: string;
  // 任务状态。取值列表： EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败
  status?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      executeDetails: 'execute_details',
      finishTime: 'finish_time',
      name: 'name',
      startTime: 'start_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      executeDetails: 'string',
      finishTime: 'string',
      name: 'string',
      startTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 镜像中心账户信息
export class RegistryAccout extends $tea.Model {
  // registry email url
  email?: string;
  // registry password
  password: string;
  // registry url
  registry: string;
  // registry username
  username: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      password: 'password',
      registry: 'registry',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      password: 'string',
      registry: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基于弹性伸缩的应用服务配置
export class HPABasedElasticConfig extends $tea.Model {
  // pod要发布的部署单元及每个部署单元副本数的映射关系列表
  cells: CellReplicasMap[];
  // 最小副本数
  minReplica: number;
  // 最大副本数
  maxReplica: number;
  // 弹性伸缩指标列表
  metrics: HPABasedElasticConfigMetric[];
  // 扩缩容规则高级配置
  behavior?: HPAScaleBehavior;
  static names(): { [key: string]: string } {
    return {
      cells: 'cells',
      minReplica: 'min_replica',
      maxReplica: 'max_replica',
      metrics: 'metrics',
      behavior: 'behavior',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cells: { 'type': 'array', 'itemType': CellReplicasMap },
      minReplica: 'number',
      maxReplica: 'number',
      metrics: { 'type': 'array', 'itemType': HPABasedElasticConfigMetric },
      behavior: HPAScaleBehavior,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单元服务器(pod)信息
export class CellServer extends $tea.Model {
  // 单元名字
  cell: string;
  // server或pod组
  servers?: string[];
  // cell中host的数量
  count: number;
  // servers列表对应的服务器/pod ip地址列表，目前仅在antcloud.ldc.opsplan.stages.export方法中返回
  serverIps?: string[];
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      servers: 'servers',
      count: 'count',
      serverIps: 'server_ips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      servers: { 'type': 'array', 'itemType': 'string' },
      count: 'number',
      serverIps: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 固定副本数弹性配置。
export class FixedReplicaElasticConfig extends $tea.Model {
  // 各部署单元/集群的副本数配置。
  replicas: ReplicaCount[];
  static names(): { [key: string]: string } {
    return {
      replicas: 'replicas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      replicas: { 'type': 'array', 'itemType': ReplicaCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用发布单个cell发布进度详情
export class AppDeployCell extends $tea.Model {
  // 单元名字
  cellName: string;
  // 执行到当前cell的pod总数
  partition: number;
  // 当前分组发布的pod数
  releaseCount: number;
  // 当前cell发布的pod列表
  podList: PodDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      cellName: 'cell_name',
      partition: 'partition',
      releaseCount: 'release_count',
      podList: 'pod_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellName: 'string',
      partition: 'number',
      releaseCount: 'number',
      podList: { 'type': 'array', 'itemType': PodDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DeploymentCondition describes the state of a deployment at a certain point.
export class DeploymentCondition extends $tea.Model {
  // Last time the condition transitioned from one status to another.
  lastTransitionTime?: string;
  // The last time this condition was updated.
  // 
  lastUpdateTime?: string;
  // A human readable message indicating details about the transition.
  // 
  message?: string;
  // The reason for the condition_s last transition.
  // 
  reason?: string;
  // Status of the condition, one of True, False, Unknown.
  // 
  status: string;
  // Type of deployment condition.
  // 
  type: string;
  static names(): { [key: string]: string } {
    return {
      lastTransitionTime: 'last_transition_time',
      lastUpdateTime: 'last_update_time',
      message: 'message',
      reason: 'reason',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lastTransitionTime: 'string',
      lastUpdateTime: 'string',
      message: 'string',
      reason: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入listener需要配置转发规则。
export class LoadBalancerListenerWithRule extends $tea.Model {
  // 统一接入域名。
  domain: string;
  // 负载均衡监听。
  listener: LoadBalancerListener;
  // 转发路径。
  path: string;
  // 权重。
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      listener: 'listener',
      path: 'path',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: 'string',
      listener: LoadBalancerListener,
      path: 'string',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Deployment PodTemplateSpec
export class PodTemplateSpec extends $tea.Model {
  // k8s Standard object_s metadata. 
  metadata: ObjectMeta;
  // Specification of the desired behavior of the pod.
  spec: PodSpec;
  static names(): { [key: string]: string } {
    return {
      metadata: 'metadata',
      spec: 'spec',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metadata: ObjectMeta,
      spec: PodSpec,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container status
export class ContainerStatus extends $tea.Model {
  // container id
  containerId: string;
  // image
  image: string;
  // 上一次启动时间
  lastStartTime: string;
  // container name
  name: string;
  // 是否ready
  ready: boolean;
  // 重启次数
  restartCount: number;
  // container state
  state: ContainerState;
  static names(): { [key: string]: string } {
    return {
      containerId: 'container_id',
      image: 'image',
      lastStartTime: 'last_start_time',
      name: 'name',
      ready: 'ready',
      restartCount: 'restart_count',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerId: 'string',
      image: 'string',
      lastStartTime: 'string',
      name: 'string',
      ready: 'boolean',
      restartCount: 'number',
      state: ContainerState,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入集群子集群覆盖配置项
export class SpannerSubClusterOverrides extends $tea.Model {
  // 机房/可用区
  zone: string;
  // spanner镜像地址
  image: string;
  static names(): { [key: string]: string } {
    return {
      zone: 'zone',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      zone: 'string',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// The deployment strategy to use to replace existing pods with new ones.
export class DeploymentStrategy extends $tea.Model {
  // Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
  rollingUpdate?: RollingUpdateDeployment;
  // Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
  type: string;
  static names(): { [key: string]: string } {
    return {
      rollingUpdate: 'rolling_update',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rollingUpdate: RollingUpdateDeployment,
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元内Pods
export class CellPods extends $tea.Model {
  // 部署单元名称
  cell: string;
  // pod标识列表
  podNames: string[];
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      podNames: 'pod_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      podNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务访问配置端口映射。
export class ServicePortMapping extends $tea.Model {
  // 访问配置前端端口。
  port: number;
  // 访问配置协议。
  protocol: string;
  // 访问配置后端端口。
  targetPort: number;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
      protocol: 'protocol',
      targetPort: 'target_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'number',
      protocol: 'string',
      targetPort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例http entry status
export class HttpEntryStatus extends $tea.Model {
  // 此entry分配到的spanner后端端口（l7 listener 端口）
  backendPort?: number;
  // 此entry对应service分配到的节点端口
  nodePort?: number;
  static names(): { [key: string]: string } {
    return {
      backendPort: 'backend_port',
      nodePort: 'node_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backendPort: 'number',
      nodePort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 配置项数据
export class ConfigMapData extends $tea.Model {
  // configmap data key
  key: string;
  // configmap data value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 守夜人类型卡点配置
export class HasHookConfig extends $tea.Model {
  // 前置脚本类型，巡检或预案
  preType?: string;
  // 前置巡检或预案id
  preRefId?: string;
  // 前置巡检或预案名称
  preName?: string;
  // 前置巡检或预案参数
  preParam?: string;
  // 后置脚本类型，巡检或预案
  postType?: string;
  // 后置巡检或预案id
  postRefId?: string;
  // 后置巡检或预案参数
  postParam?: string;
  // 后置巡检或预案名称
  postName?: string;
  static names(): { [key: string]: string } {
    return {
      preType: 'pre_type',
      preRefId: 'pre_ref_id',
      preName: 'pre_name',
      preParam: 'pre_param',
      postType: 'post_type',
      postRefId: 'post_ref_id',
      postParam: 'post_param',
      postName: 'post_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preType: 'string',
      preRefId: 'string',
      preName: 'string',
      preParam: 'string',
      postType: 'string',
      postRefId: 'string',
      postParam: 'string',
      postName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维变更对象
export class OperationChangeInstance extends $tea.Model {
  // 主机名
  hostname?: string;
  // 部署单元
  cell: string;
  // ip
  ip?: string;
  // 资源ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      hostname: 'hostname',
      cell: 'cell',
      ip: 'ip',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostname: 'string',
      cell: 'string',
      ip: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// headless service 配置
export class HeadlessService extends $tea.Model {
  // headless service 的名称，不能以-0~-9结尾
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Container环境变量集群override
export class EnvVarClusterOverride extends $tea.Model {
  // 环境变量名称
  name: string;
  // 环境变量取值
  value: string;
  // Pod容器名称
  containerName: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
      containerName: 'container_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
      containerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务运维
export class OpsContainerService extends $tea.Model {
  // 命名空间
  namespace: string;
  // 容器服务名称
  name: string;
  // 待操作目标pods列表
  selectedPods?: CellPods[];
  static names(): { [key: string]: string } {
    return {
      namespace: 'namespace',
      name: 'name',
      selectedPods: 'selected_pods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      namespace: 'string',
      name: 'string',
      selectedPods: { 'type': 'array', 'itemType': CellPods },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务部署配置。
export class DeployConfig extends $tea.Model {
  // 节点亲和性配置
  affinity?: AffinityEntity;
  // annotations
  annotations?: string;
  // 用户自定义标签，将会在pod上生效
  customLabels?: string;
  // 最小分组数
  groupCount?: number;
  // 容器服务部署分组策略。
  groupStrategy?: string;
  // labels
  labels?: string;
  // 单个分组最大Pod数量。
  maxGroupCapacity?: number;
  // 是否需要beta confirm。
  needBeta?: boolean;
  // 是否需要分组确认。
  needConfirm?: boolean;
  // 已废弃
  enableSofaMesh?: boolean;
  // 只支持InPlace
  upgradeStrategy?: string;
  // 分组确认策略，FIRST：第一个分组需要确认，EACH：每个分组都需要确认（默认）
  confirmStrategy?: string;
  // pod name 命名规则，lks 1.23.0 开始支持。Default/PersistentSequence
  podNamingPolicy?: string;
  // [已废除] 是否开启强制步长控制。对于ALL_ONE, ALL_ONE_CELL_BETA等分组模式，group_count与max_group_capacity字段将生效，提供精细化分组，以满足用户的pod发布并发控制需求
  forceStrideControl?: boolean;
  // 每个部署单元单批次最大变更pod比例，仅当group_strategy为ALL_CELL_PERCENTAGE时生效
  maxCellPodPercentage?: number;
  static names(): { [key: string]: string } {
    return {
      affinity: 'affinity',
      annotations: 'annotations',
      customLabels: 'custom_labels',
      groupCount: 'group_count',
      groupStrategy: 'group_strategy',
      labels: 'labels',
      maxGroupCapacity: 'max_group_capacity',
      needBeta: 'need_beta',
      needConfirm: 'need_confirm',
      enableSofaMesh: 'enable_sofa_mesh',
      upgradeStrategy: 'upgrade_strategy',
      confirmStrategy: 'confirm_strategy',
      podNamingPolicy: 'pod_naming_policy',
      forceStrideControl: 'force_stride_control',
      maxCellPodPercentage: 'max_cell_pod_percentage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      affinity: AffinityEntity,
      annotations: 'string',
      customLabels: 'string',
      groupCount: 'number',
      groupStrategy: 'string',
      labels: 'string',
      maxGroupCapacity: 'number',
      needBeta: 'boolean',
      needConfirm: 'boolean',
      enableSofaMesh: 'boolean',
      upgradeStrategy: 'string',
      confirmStrategy: 'string',
      podNamingPolicy: 'string',
      forceStrideControl: 'boolean',
      maxCellPodPercentage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例的https entry status
export class HttpsEntryStatus extends $tea.Model {
  // 统一接入实例https entry分配到的spanner 后端端口
  backendPort?: number;
  // 统一接入实例对应的service分配到的节点端口
  nodePort?: number;
  static names(): { [key: string]: string } {
    return {
      backendPort: 'backend_port',
      nodePort: 'node_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backendPort: 'number',
      nodePort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务弹性配置。
export class ElasticConfig extends $tea.Model {
  // 固定副本数配置。
  fixedReplica?: FixedReplicaElasticConfig;
  // 弹性伸缩配置
  hpa?: HPABasedElasticConfig;
  // 弹性配置模式：
  // FIXED 固定副本数
  // HPA 弹性伸缩
  mode?: string;
  static names(): { [key: string]: string } {
    return {
      fixedReplica: 'fixed_replica',
      hpa: 'hpa',
      mode: 'mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fixedReplica: FixedReplicaElasticConfig,
      hpa: HPABasedElasticConfig,
      mode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入配置。
export class IngressConfig extends $tea.Model {
  // 统一接入域名。
  domain?: string;
  // 监听及转发规则配置。
  listeners?: LoadBalancerListenerWithRule[];
  // 关联的负载均衡实例的ID。
  loadBalancerIaasId?: string;
  // 关联负载均衡实例名称。
  loadBalancerName?: string;
  // 负载均衡网络类型。
  loadBalancerType?: string;
  // ingress名称。
  name: string;
  // Spanner集群名称。
  spannerClusterId?: string;
  // 统一接入协议（http|https）
  unifiedAccessEntries?: string[];
  // 与统一接入协议相对应的统一接入实例入端口列表
  unifiedAccessEntryPorts?: number[];
  // 所属统一接入实例
  unifiedAccessInstanceName?: string;
  // 统一接入实例联邦负载均衡id
  unifiedAccessInstanceFederatedId?: string;
  // 监听及转发规则配置 V2
  listenersV2?: LoadBalancerListener[];
  // 统一接入路由模式（LDC|NONLDC）
  unifiedAccessRouteRule?: string;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      listeners: 'listeners',
      loadBalancerIaasId: 'load_balancer_iaas_id',
      loadBalancerName: 'load_balancer_name',
      loadBalancerType: 'load_balancer_type',
      name: 'name',
      spannerClusterId: 'spanner_cluster_id',
      unifiedAccessEntries: 'unified_access_entries',
      unifiedAccessEntryPorts: 'unified_access_entry_ports',
      unifiedAccessInstanceName: 'unified_access_instance_name',
      unifiedAccessInstanceFederatedId: 'unified_access_instance_federated_id',
      listenersV2: 'listeners_v2',
      unifiedAccessRouteRule: 'unified_access_route_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: 'string',
      listeners: { 'type': 'array', 'itemType': LoadBalancerListenerWithRule },
      loadBalancerIaasId: 'string',
      loadBalancerName: 'string',
      loadBalancerType: 'string',
      name: 'string',
      spannerClusterId: 'string',
      unifiedAccessEntries: { 'type': 'array', 'itemType': 'string' },
      unifiedAccessEntryPorts: { 'type': 'array', 'itemType': 'number' },
      unifiedAccessInstanceName: 'string',
      unifiedAccessInstanceFederatedId: 'string',
      listenersV2: { 'type': 'array', 'itemType': LoadBalancerListener },
      unifiedAccessRouteRule: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DeploymentStatus
export class DeploymentStatus extends $tea.Model {
  // Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
  // 
  availableReplicas: number;
  // Represents the latest available observations of a deployment_s current state.
  // 
  conditions: DeploymentCondition[];
  // The generation observed by the deployment controller.
  // 
  observedGeneration?: number;
  // Total number of ready pods targeted by this deployment.
  // 
  readyReplicas: number;
  // Total number of non-terminated pods targeted by this deployment (their labels match the selector).
  // 
  replicas: number;
  // Total number of unavailable pods targeted by this deployment. 
  unavailableReplicas: number;
  // Total number of non-terminated pods targeted by this deployment that have the desired template spec.
  updatedReplicas: number;
  static names(): { [key: string]: string } {
    return {
      availableReplicas: 'available_replicas',
      conditions: 'conditions',
      observedGeneration: 'observed_generation',
      readyReplicas: 'ready_replicas',
      replicas: 'replicas',
      unavailableReplicas: 'unavailable_replicas',
      updatedReplicas: 'updated_replicas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableReplicas: 'number',
      conditions: { 'type': 'array', 'itemType': DeploymentCondition },
      observedGeneration: 'number',
      readyReplicas: 'number',
      replicas: 'number',
      unavailableReplicas: 'number',
      updatedReplicas: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1FederatedDeploymentStatusTopologies
export class FederatedDeploymentStatusTopologies extends $tea.Model {
  // message
  message: string;
  // name
  name: string;
  // status
  status: string;
  // time
  time: string;
  static names(): { [key: string]: string } {
    return {
      message: 'message',
      name: 'name',
      status: 'status',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      message: 'string',
      name: 'string',
      status: 'string',
      time: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api类型自定义卡点配置
export class ApiHookConfig extends $tea.Model {
  // 卡点要调用的api地址
  postUrl: string;
  // 授权码
  authKey?: string;
  // 接口超时时间，单位ms
  timeout?: string;
  // 查询异步卡点接口执行结果api
  checkUrl?: string;
  static names(): { [key: string]: string } {
    return {
      postUrl: 'post_url',
      authKey: 'auth_key',
      timeout: 'timeout',
      checkUrl: 'check_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      postUrl: 'string',
      authKey: 'string',
      timeout: 'string',
      checkUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群内ClusterIP类型Service。
export class ClusterIpService extends $tea.Model {
  // 对应ClusterIP service名称。
  name: string;
  // ClusterIP service暴露的端口列表。
  ports?: ServicePortMapping[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      ports: 'ports',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      ports: { 'type': 'array', 'itemType': ServicePortMapping },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 描述本地spanner集群一组容器的详细信息
export class LocalSubClusterDetail extends $tea.Model {
  // 可用实例数
  available?: number;
  // 期望实例数
  desired?: number;
  // 容器镜像地址
  image: string;
  // 发布容器带的标签
  labels?: Label[];
  // 可能存在的错误信息
  message?: string;
  // 健康实例数
  ready?: number;
  // 实际sub cluster 状态
  state: string;
  // 已更新实例数
  updated?: number;
  // 容器版本
  version: string;
  // 多个机房下的覆盖配置项
  overrides?: SpannerSubClusterOverrides[];
  static names(): { [key: string]: string } {
    return {
      available: 'available',
      desired: 'desired',
      image: 'image',
      labels: 'labels',
      message: 'message',
      ready: 'ready',
      state: 'state',
      updated: 'updated',
      version: 'version',
      overrides: 'overrides',
    };
  }

  static types(): { [key: string]: any } {
    return {
      available: 'number',
      desired: 'number',
      image: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      message: 'string',
      ready: 'number',
      state: 'string',
      updated: 'number',
      version: 'string',
      overrides: { 'type': 'array', 'itemType': SpannerSubClusterOverrides },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LoadBalancer类型Service。
export class LoadBalancerService extends $tea.Model {
  // 域名。
  domain?: string;
  // 负载均衡实例监听列表。
  listeners: LoadBalancerListener[];
  // 关联的负载均衡实例的ID。
  loadBalancerIaasId?: string;
  // LoadBalancer类型service关联负载均衡实例名称。
  loadBalancerName?: string;
  // LoadBalancer类型service名称。
  name: string;
  // Spanner集群名称。
  spannerClusterId?: string;
  // 负载均衡实例的网络类型（internet | intranet | office | multidomain）
  addressType?: string;
  // 该服务在每个 cell 下要复用的负载均衡实例 ID
  cellSlbIaasIdMap?: MapStringToString[];
  // custom address type模式下，指定各cell负载均衡vip
  cellLbVipMap?: MapStringToString[];
  // 是否使用联邦负载均衡实例
  useFedLoadbalancer?: boolean;
  // 联邦负载均衡实例名称
  fedLoadbalancerName?: string;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      listeners: 'listeners',
      loadBalancerIaasId: 'load_balancer_iaas_id',
      loadBalancerName: 'load_balancer_name',
      name: 'name',
      spannerClusterId: 'spanner_cluster_id',
      addressType: 'address_type',
      cellSlbIaasIdMap: 'cell_slb_iaas_id_map',
      cellLbVipMap: 'cell_lb_vip_map',
      useFedLoadbalancer: 'use_fed_loadbalancer',
      fedLoadbalancerName: 'fed_loadbalancer_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: 'string',
      listeners: { 'type': 'array', 'itemType': LoadBalancerListener },
      loadBalancerIaasId: 'string',
      loadBalancerName: 'string',
      name: 'string',
      spannerClusterId: 'string',
      addressType: 'string',
      cellSlbIaasIdMap: { 'type': 'array', 'itemType': MapStringToString },
      cellLbVipMap: { 'type': 'array', 'itemType': MapStringToString },
      useFedLoadbalancer: 'boolean',
      fedLoadbalancerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 有状态应用数据卷模板配置
export class VolumeClaimConfig extends $tea.Model {
  // name
  name?: string;
  // storage_class
  storageClass?: string;
  // resourceRequirementConfig
  resourceRequirementConfig?: ResourceRequirementConfig;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      storageClass: 'storage_class',
      resourceRequirementConfig: 'resource_requirement_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      storageClass: 'string',
      resourceRequirementConfig: ResourceRequirementConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Secret数据
export class SecretData extends $tea.Model {
  // secret data key
  key: string;
  // secret data value
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布批次对象
export class ReleaseBatchObj extends $tea.Model {
  // 第一个批次
  batchNum: number;
  // 单元内服务数组
  cellServers: CellServer[];
  static names(): { [key: string]: string } {
    return {
      batchNum: 'batch_num',
      cellServers: 'cell_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchNum: 'number',
      cellServers: { 'type': 'array', 'itemType': CellServer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维操作中的应用
export class OpsApplication extends $tea.Model {
  // 应用名称
  name?: string;
  // 应用发布版本（部分运维操作可能不包含版本信息，为null）
  version?: string;
  // 应用（服务）当前运维状态。取值列表： INITING：初始化中； INIT_FAILED：初始化失败； INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； ROLLBACKED：已回滚； CANCELED：已取消
  status?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      version: 'version',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      version: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DeploymentSpec
export class DeploymentSpec extends $tea.Model {
  // Minimum number of seconds for which a newly created pod should be ready without any of its container crashing
  minReadySeconds?: number;
  // Indicates that the deployment is paused.
  // 
  paused?: boolean;
  // he maximum time in seconds for a deployment to make progress before it is considered to be failed.
  progressDeadlineSeconds?: number;
  // Number of desired pods. 
  replicas: number;
  // The number of old ReplicaSets to retain to allow rollback.
  revisionHistoryLimit?: number;
  // Label selector for pods. 
  selector?: LabelSelector;
  // The deployment strategy to use to replace existing pods with new ones.
  // 
  strategy?: DeploymentStrategy;
  // Template describes the pods that will be created.
  template: PodTemplateSpec;
  static names(): { [key: string]: string } {
    return {
      minReadySeconds: 'min_ready_seconds',
      paused: 'paused',
      progressDeadlineSeconds: 'progress_deadline_seconds',
      replicas: 'replicas',
      revisionHistoryLimit: 'revision_history_limit',
      selector: 'selector',
      strategy: 'strategy',
      template: 'template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      minReadySeconds: 'number',
      paused: 'boolean',
      progressDeadlineSeconds: 'number',
      replicas: 'number',
      revisionHistoryLimit: 'number',
      selector: LabelSelector,
      strategy: DeploymentStrategy,
      template: PodTemplateSpec,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar 模版
export class SidecarTemplate extends $tea.Model {
  // sidecar模版id
  id?: string;
  // region_id
  regionId?: string;
  // 	
  // 模板生效范围
  scope: string;
  // sidecar名称
  sidecarName: string;
  // sidecar模版版本
  sidecarVersion: string;
  // sidercar模版
  template: string;
  // 这个字段是lhc专用，表示此模板的来源，META为sidecar元数据来源，XFLUSH为系统模板
  // 本结构体同时还暂时兼容了调用sidecar元数据openapi的使用，后期会只用于LHC用途，届时会去掉sidecar元数据接口的字段。
  type: string;
  // workspace_group_id
  workspaceGroupId?: string;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      regionId: 'region_id',
      scope: 'scope',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      template: 'template',
      type: 'type',
      workspaceGroupId: 'workspace_group_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      regionId: 'string',
      scope: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      template: 'string',
      type: 'string',
      workspaceGroupId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed image pull Secret override
export class FedImagePullSecretOverride extends $tea.Model {
  // override data
  data: RegistryAccout;
  // cell name
  name: string;
  // cell name override
  nameOverride: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      name: 'name',
      nameOverride: 'name_override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: RegistryAccout,
      name: 'string',
      nameOverride: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解决方案应用发布配置
export class AppReleaseConfig extends $tea.Model {
  // 名称
  name: string;
  // 应用镜像
  image: string;
  // commitID
  commitId: string;
  // 代码分支
  commitBranch: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      image: 'image',
      commitId: 'commit_id',
      commitBranch: 'commit_branch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      image: 'string',
      commitId: 'string',
      commitBranch: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1FederatedAppInstanceRevisionSpecOverridesAppinstance
export class ResourceOverride extends $tea.Model {
  // 部署单元名称，ALL 代表所有部署单元
  cell: string;
  // fed 资源路径
  path: string;
  // 值
  value: string;
  // 值的字段类型，支持 string、number、boolean
  type?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      path: 'path',
      value: 'value',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      path: 'string',
      value: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用发布任务，发布详情可操作(跳过、确认、重试等)单元
export class AppDeployTask extends $tea.Model {
  // 操作code
  actionCode: string;
  // 当前任务的发布单元列表
  appDeployCells: AppDeployCell[];
  // 是否支持确认操作
  confirmSupported: boolean;
  // 上下文数据，json字符串
  data: string;
  // id
  id: string;
  // 是否支持跳过操作
  ignoreSupported: boolean;
  // 是否支持重试操作
  retrySupported: boolean;
  // 当前状态
  state: string;
  // 开始时间。
  startedTime: string;
  // 结束时间。
  finishedTime: string;
  // message detail
  messageDetail?: string;
  // 任务类型
  taskType?: string;
  // 任务显示名称，自定义卡点任务才会有值
  taskDisplayName?: string;
  static names(): { [key: string]: string } {
    return {
      actionCode: 'action_code',
      appDeployCells: 'app_deploy_cells',
      confirmSupported: 'confirm_supported',
      data: 'data',
      id: 'id',
      ignoreSupported: 'ignore_supported',
      retrySupported: 'retry_supported',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      messageDetail: 'message_detail',
      taskType: 'task_type',
      taskDisplayName: 'task_display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionCode: 'string',
      appDeployCells: { 'type': 'array', 'itemType': AppDeployCell },
      confirmSupported: 'boolean',
      data: 'string',
      id: 'string',
      ignoreSupported: 'boolean',
      retrySupported: 'boolean',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      messageDetail: 'string',
      taskType: 'string',
      taskDisplayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器信息
export class ContainerInfo extends $tea.Model {
  // 容器id
  containerId: string;
  // 容器镜像
  image: string;
  // 最后启动时间
  lastStartTime: string;
  // 容器镜像
  name: string;
  // 重启次数
  restartCount: number;
  // 容器运行状态
  state: string;
  // 容器spec配置。
  spec: ContainerSpec;
  static names(): { [key: string]: string } {
    return {
      containerId: 'container_id',
      image: 'image',
      lastStartTime: 'last_start_time',
      name: 'name',
      restartCount: 'restart_count',
      state: 'state',
      spec: 'spec',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerId: 'string',
      image: 'string',
      lastStartTime: 'string',
      name: 'string',
      restartCount: 'number',
      state: 'string',
      spec: ContainerSpec,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解决方案拓展Linke配置
export class UnireleaseSolutionExtInfoLinkeInfo extends $tea.Model {
  // linke发布窗口 
  releaseWindow: string;
  // ["EI61640467"]
  iterations: string[];
  // 发布接口人列表,要求为域账号
  publisher?: string[];
  // inke发布Id
  releaseId?: string;
  static names(): { [key: string]: string } {
    return {
      releaseWindow: 'release_window',
      iterations: 'iterations',
      publisher: 'publisher',
      releaseId: 'release_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      releaseWindow: 'string',
      iterations: { 'type': 'array', 'itemType': 'string' },
      publisher: { 'type': 'array', 'itemType': 'string' },
      releaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个正在进行运维操作的计算容器。
export class OpsComputer extends $tea.Model {
  // 计算容器id
  id?: string;
  // 计算容器内网ip
  innerIp?: string;
  // 计算容器名称
  name?: string;
  // 计算容器当前运维状态。取值列表： INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELED：已取消； IGNORED：已忽略
  status?: string;
  // 计算容器上执行的任务信息。任务信息列表中包含正在执行和执行完成的任务。
  tasks?: OpsComputerTask[];
  // 展示机器失败的摘要信息
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      innerIp: 'inner_ip',
      name: 'name',
      status: 'status',
      tasks: 'tasks',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      innerIp: 'string',
      name: 'string',
      status: 'string',
      tasks: { 'type': 'array', 'itemType': OpsComputerTask },
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灰度发布场景下，给入口流量添加的单个判断规则
export class GrayLabelDownstreamRule extends $tea.Model {
  // 判断入口流量的方式，目前支持通过header或cookie判断
  type: string;
  // 用于判断的键
  key: string;
  // 判断条件，目前支持相等或者不相等
  condition: string;
  // 用于判断的值
  value: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      key: 'key',
      condition: 'condition',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      key: 'string',
      condition: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// pod状态
export class PodStatus extends $tea.Model {
  // 节点ip
  hostIp?: string;
  // pod状态
  phase: string;
  // podip
  podIp?: string;
  // pod container status
  containerStatuses: ContainerStatus[];
  static names(): { [key: string]: string } {
    return {
      hostIp: 'host_ip',
      phase: 'phase',
      podIp: 'pod_ip',
      containerStatuses: 'container_statuses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostIp: 'string',
      phase: 'string',
      podIp: 'string',
      containerStatuses: { 'type': 'array', 'itemType': ContainerStatus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar运维流程任务
export class SidecarOpsMachineTask extends $tea.Model {
  // 分组ID
  id: string;
  // 执行状态
  status: string;
  // 扩展属性 - JSON string
  properties?: string;
  // 执行信息
  message?: string;
  // 任务名称
  target?: string;
  // 开始时间
  startTime?: string;
  // 结束时间
  endTime?: string;
  // 任务描述
  targetDesc?: string;
  // 状态描述
  statusDesc?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      status: 'status',
      properties: 'properties',
      message: 'message',
      target: 'target',
      startTime: 'start_time',
      endTime: 'end_time',
      targetDesc: 'target_desc',
      statusDesc: 'status_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      status: 'string',
      properties: 'string',
      message: 'string',
      target: 'string',
      startTime: 'string',
      endTime: 'string',
      targetDesc: 'string',
      statusDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SidecarConfig
export class SidecarConfig extends $tea.Model {
  // Sidercar 名称
  name: string;
  // 表达是否修改feature
  changeFeature: boolean;
  // FEATURE_GATES
  featureGates?: string;
  // 镜像地址
  image: string;
  // 需要修改或自定义新增的sidecar环境变量。
  changeEnvs?: string;
  // sidecar的pvc挂载配置
  volumeMounts?: VolumeMount[];
  // 扩展字段
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      changeFeature: 'change_feature',
      featureGates: 'feature_gates',
      image: 'image',
      changeEnvs: 'change_envs',
      volumeMounts: 'volume_mounts',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      changeFeature: 'boolean',
      featureGates: 'string',
      image: 'string',
      changeEnvs: 'string',
      volumeMounts: { 'type': 'array', 'itemType': VolumeMount },
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Workspace info
// 
export class Workspace extends $tea.Model {
  // workspace id
  id: string;
  // workspace name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一组执行运维操作的应用，同一个组中的应用将并行执行操作。
export class OpsApplicationGroup extends $tea.Model {
  // 此运维应用组中包含的应用列表
  applications?: OpsApplication[];
  static names(): { [key: string]: string } {
    return {
      applications: 'applications',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applications: { 'type': 'array', 'itemType': OpsApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一解决方案App信息
export class UnireleaseSolutionApp extends $tea.Model {
  // 应用名称
  app: string;
  // 应用依赖信息
  dependsOn: string[];
  // 应用发布配置
  releaseConfig: AppReleaseConfig;
  // 中间件配置
  middlewareConfigs: string[];
  // 机构/租户信息
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      dependsOn: 'depends_on',
      releaseConfig: 'release_config',
      middlewareConfigs: 'middleware_configs',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      dependsOn: { 'type': 'array', 'itemType': 'string' },
      releaseConfig: AppReleaseConfig,
      middlewareConfigs: { 'type': 'array', 'itemType': 'string' },
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务示例
export class AppService extends $tea.Model {
  // 应用服务实例名称
  name?: string;
  // 工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布|运维分组执行进度
export class OpsGroupTaskProgress extends $tea.Model {
  // 任务码
  actionCode: string;
  // 任务名称
  actionName: string;
  // 任务状态
  state: string;
  // 任务开始时间
  startedTime: string;
  // 任务结束时间
  finishedTime: string;
  static names(): { [key: string]: string } {
    return {
      actionCode: 'action_code',
      actionName: 'action_name',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionCode: 'string',
      actionName: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灰度发布场景下，给进入的流量加灰度label的规则
export class GrayLabelApplyRule extends $tea.Model {
  // 多个指定条件的计算方式，目前支持AND和OR
  operator: string;
  // 入口流量的多个规则，将根据operator进行与、或运算
  downstreamRules: GrayLabelDownstreamRule[];
  static names(): { [key: string]: string } {
    return {
      operator: 'operator',
      downstreamRules: 'downstream_rules',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operator: 'string',
      downstreamRules: { 'type': 'array', 'itemType': GrayLabelDownstreamRule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FedDeployment cluster override
export class FedDeploymentClusterOverride extends $tea.Model {
  // 集群名称
  cluster: string;
  // 集群Deployment replica数量
  replica: number;
  // 环境变量配置覆盖
  envVarOverride: EnvVarClusterOverride[];
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      replica: 'replica',
      envVarOverride: 'env_var_override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      replica: 'number',
      envVarOverride: { 'type': 'array', 'itemType': EnvVarClusterOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息。
export class AppInfo extends $tea.Model {
  // buildpack版本。
  buildpackVersion?: string;
  // 应用描述。
  description?: string;
  // 应用id。
  id: string;
  // 应用名称。
  name: string;
  // 应用owner。
  owner: string;
  // 技术栈。
  techstackIdentity: string;
  // ownerId
  ownerId?: string;
  static names(): { [key: string]: string } {
    return {
      buildpackVersion: 'buildpack_version',
      description: 'description',
      id: 'id',
      name: 'name',
      owner: 'owner',
      techstackIdentity: 'techstack_identity',
      ownerId: 'owner_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackVersion: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      owner: 'string',
      techstackIdentity: 'string',
      ownerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 拓展配置
export class UnireleaseSolutionExtInfo extends $tea.Model {
  // Linke配置信息
  linkeInfo: UnireleaseSolutionExtInfoLinkeInfo;
  static names(): { [key: string]: string } {
    return {
      linkeInfo: 'linke_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      linkeInfo: UnireleaseSolutionExtInfoLinkeInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务下相关对象的元信息
export class ContainerServiceObjectMeta extends $tea.Model {
  // UID
  uid: string;
  // 命名空间
  namespace: string;
  // 名称
  name: string;
  // 部署单元名称
  cellDisplayName: string;
  // 集群名称
  cluster: string;
  // 创建时间
  createdTime: string;
  static names(): { [key: string]: string } {
    return {
      uid: 'uid',
      namespace: 'namespace',
      name: 'name',
      cellDisplayName: 'cell_display_name',
      cluster: 'cluster',
      createdTime: 'created_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uid: 'string',
      namespace: 'string',
      name: 'string',
      cellDisplayName: 'string',
      cluster: 'string',
      createdTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务配置。
export class ContainerServiceConfig extends $tea.Model {
  // 容器服务业务实时监控路径。
  bizMonitorPaths?: string[];
  // 内网访问配置。
  clusterIpServices?: ClusterIpService[];
  // 容器配置。
  containerSpecs: ContainerSpec[];
  // 容器服务部署配置。
  deployConfig: DeployConfig;
  // 弹性配置。
  elasticConfig: ElasticConfig;
  // 容器服务是否开启业务实时监控。
  enableBizMonitor?: boolean;
  // 容器服务是否开启日志监控。
  enableLogConfig?: boolean;
  // 容器服务是否开启SofaMesh。
  enableSofaMesh?: boolean;
  // 统一接入配置。
  ingresses?: IngressConfig[];
  // 内网负载均衡访问配置（旧版）
  innerLoadBalancerServices?: LoadBalancerService[];
  // 公网访问负载均衡配置（旧版）
  publicLoadBalancerServices?: LoadBalancerService[];
  // sidecar 模版配置
  sidecarConfigs?: SidecarTemplate[];
  // 容器服务关联的Pod是否使用宿主机网络。
  useHostNetwork?: boolean;
  // 负载均衡配置
  loadBalancerServices?: LoadBalancerService[];
  // volumeClaimConfigs
  volumeClaimConfigs?: VolumeClaimConfig[];
  // 容忍度配置
  tolerations?: Toleration[];
  // 启用的sidercar列表，只针对首次发布生效
  sidercars?: SidecarConfig[];
  // headless service 配置
  headlessServices?: HeadlessService[];
  // 资源overrides（lks 1.24.0后开始支持）
  resourceOverrides?: ResourceOverride[];
  static names(): { [key: string]: string } {
    return {
      bizMonitorPaths: 'biz_monitor_paths',
      clusterIpServices: 'cluster_ip_services',
      containerSpecs: 'container_specs',
      deployConfig: 'deploy_config',
      elasticConfig: 'elastic_config',
      enableBizMonitor: 'enable_biz_monitor',
      enableLogConfig: 'enable_log_config',
      enableSofaMesh: 'enable_sofa_mesh',
      ingresses: 'ingresses',
      innerLoadBalancerServices: 'inner_load_balancer_services',
      publicLoadBalancerServices: 'public_load_balancer_services',
      sidecarConfigs: 'sidecar_configs',
      useHostNetwork: 'use_host_network',
      loadBalancerServices: 'load_balancer_services',
      volumeClaimConfigs: 'volume_claim_configs',
      tolerations: 'tolerations',
      sidercars: 'sidercars',
      headlessServices: 'headless_services',
      resourceOverrides: 'resource_overrides',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizMonitorPaths: { 'type': 'array', 'itemType': 'string' },
      clusterIpServices: { 'type': 'array', 'itemType': ClusterIpService },
      containerSpecs: { 'type': 'array', 'itemType': ContainerSpec },
      deployConfig: DeployConfig,
      elasticConfig: ElasticConfig,
      enableBizMonitor: 'boolean',
      enableLogConfig: 'boolean',
      enableSofaMesh: 'boolean',
      ingresses: { 'type': 'array', 'itemType': IngressConfig },
      innerLoadBalancerServices: { 'type': 'array', 'itemType': LoadBalancerService },
      publicLoadBalancerServices: { 'type': 'array', 'itemType': LoadBalancerService },
      sidecarConfigs: { 'type': 'array', 'itemType': SidecarTemplate },
      useHostNetwork: 'boolean',
      loadBalancerServices: { 'type': 'array', 'itemType': LoadBalancerService },
      volumeClaimConfigs: { 'type': 'array', 'itemType': VolumeClaimConfig },
      tolerations: { 'type': 'array', 'itemType': Toleration },
      sidercars: { 'type': 'array', 'itemType': SidecarConfig },
      headlessServices: { 'type': 'array', 'itemType': HeadlessService },
      resourceOverrides: { 'type': 'array', 'itemType': ResourceOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元
export class Cell extends $tea.Model {
  // 所属逻辑单元名称[单元化模式特有]。
  cellGroup?: string;
  // 蓝绿着色信息[单元化模式特有]。
  color?: string;
  // 创建时间。
  createdTime: string;
  // 部署单元标识，创建之后不允许修改。
  identity: string;
  // 是否灰度[单元化模式特有]。
  isGray?: boolean;
  // 部署单元名称，主要用作页面展示。
  name: string;
  // 压测权重
  pressWeight?: number;
  // 部署单元类型[单元化模式特有]。
  type?: string;
  // 默认权重[单元化模式特有]。
  weight?: number;
  // 所属工作空间名称。
  workspace: string;
  // 所属机房信息。
  zone: string;
  // cell名称，与name一样，为了兼容已有代码
  displayName: string;
  // 所属cluster
  cluster?: string;
  static names(): { [key: string]: string } {
    return {
      cellGroup: 'cell_group',
      color: 'color',
      createdTime: 'created_time',
      identity: 'identity',
      isGray: 'is_gray',
      name: 'name',
      pressWeight: 'press_weight',
      type: 'type',
      weight: 'weight',
      workspace: 'workspace',
      zone: 'zone',
      displayName: 'display_name',
      cluster: 'cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellGroup: 'string',
      color: 'string',
      createdTime: 'string',
      identity: 'string',
      isGray: 'boolean',
      name: 'string',
      pressWeight: 'number',
      type: 'string',
      weight: 'number',
      workspace: 'string',
      zone: 'string',
      displayName: 'string',
      cluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群部署单元状态
export class ClusteCellStatus extends $tea.Model {
  // 集群名称
  cluster: string;
  // 部署单元名称
  cell: string;
  // Cell资源状态
  status: string;
  // 详细说明或错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      cell: 'cell',
      status: 'status',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      cell: 'string',
      status: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维操作单元。
export class OpsUnit extends $tea.Model {
  // 单元所属部署区
  cell?: string;
  // 包含在此单元中进行运维操作的计算容器列表
  computers?: OpsComputer[];
  // 单元所属地域
  region?: string;
  // 单元所属可用区
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      computers: 'computers',
      region: 'region',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      computers: { 'type': 'array', 'itemType': OpsComputer },
      region: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询返回spanner cluster的详细信息
export class QuerySpannerClusterDetail extends $tea.Model {
  // 用于描述联邦spanner 集群内容器实例采用内网还是外网 
  addressType: string;
  // cpu 核数
  cpu?: number;
  // 创建时间
  createTimestamp?: string;
  // 盘大小
  disk?: number;
  // 将cpu,mem,disk按照单位拼接起来
  flavor: string;
  // 描述集群容器是否采用了host网络	
  // 
  hostNetwork: boolean;
  // 集群id
  id: string;
  // 关联的实例数
  instances: number;
  // mem 大小
  mem?: number;
  // 可能存在的错误信息
  message?: string;
  // 集群名称
  name: string;
  // 描述集群状态	
  // 
  state: string;
  // 租户名称
  tenant: string;
  // 最后更新的时间戳
  updateTimestamp?: string;
  // 工作空间组
  workspaceGroup: string;
  // 期望集群状态
  expectClusterState?: string;
  static names(): { [key: string]: string } {
    return {
      addressType: 'address_type',
      cpu: 'cpu',
      createTimestamp: 'create_timestamp',
      disk: 'disk',
      flavor: 'flavor',
      hostNetwork: 'host_network',
      id: 'id',
      instances: 'instances',
      mem: 'mem',
      message: 'message',
      name: 'name',
      state: 'state',
      tenant: 'tenant',
      updateTimestamp: 'update_timestamp',
      workspaceGroup: 'workspace_group',
      expectClusterState: 'expect_cluster_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addressType: 'string',
      cpu: 'number',
      createTimestamp: 'string',
      disk: 'number',
      flavor: 'string',
      hostNetwork: 'boolean',
      id: 'string',
      instances: 'number',
      mem: 'number',
      message: 'string',
      name: 'string',
      state: 'string',
      tenant: 'string',
      updateTimestamp: 'string',
      workspaceGroup: 'string',
      expectClusterState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器健康检查-ReadinessProbe。
export class ReadinessProbe extends $tea.Model {
  // 命令行方式的健康监测配置。
  execAction?: ExecAction;
  // 不健康阈值。
  failureThreshold: number;
  // http方式的健康监测配置。
  httpGetAction?: HttpGetAction;
  // 首次检查延时。
  initialDelaySeconds: number;
  // 不健康阈值。
  periodSeconds: number;
  // 健康阈值。
  successThreshold: number;
  // tcp方式的健康监测配置。
  tcpSocketAction?: TcpSocketAction;
  // 检查超时。
  timeoutSeconds: number;
  static names(): { [key: string]: string } {
    return {
      execAction: 'exec_action',
      failureThreshold: 'failure_threshold',
      httpGetAction: 'http_get_action',
      initialDelaySeconds: 'initial_delay_seconds',
      periodSeconds: 'period_seconds',
      successThreshold: 'success_threshold',
      tcpSocketAction: 'tcp_socket_action',
      timeoutSeconds: 'timeout_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      execAction: ExecAction,
      failureThreshold: 'number',
      httpGetAction: HttpGetAction,
      initialDelaySeconds: 'number',
      periodSeconds: 'number',
      successThreshold: 'number',
      tcpSocketAction: TcpSocketAction,
      timeoutSeconds: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维容器服务列表
export class OpsContainerServiceGroup extends $tea.Model {
  // 运维容器服务列表
  containerServices: OpsContainerService[];
  static names(): { [key: string]: string } {
    return {
      containerServices: 'container_services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerServices: { 'type': 'array', 'itemType': OpsContainerService },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed image pull secret list
export class FedImagePullSecretOverrideList extends $tea.Model {
  // fed image pull secret overrides
  list: FedImagePullSecretOverride[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': FedImagePullSecretOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异构机房部署单元
export class SiteCell extends $tea.Model {
  // 异构机房名
  siteName: string;
  // 部署单元名
  name: string;
  // 地域
  region: string;
  static names(): { [key: string]: string } {
    return {
      siteName: 'site_name',
      name: 'name',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteName: 'string',
      name: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// pod信息
export class PodInfo extends $tea.Model {
  // 部署单元名称
  cellDisplayName: string;
  // 集群名称
  cluster: string;
  // pod containers info
  containers: ContainerInfo[];
  // create time
  createdTime: string;
  // pod 名称
  name: string;
  // 命名空间名称
  namespace: string;
  // pod状态
  status: PodStatus;
  // pod uid
  uid: string;
  // Pod volume信息。
  volumes?: Volume[];
  static names(): { [key: string]: string } {
    return {
      cellDisplayName: 'cell_display_name',
      cluster: 'cluster',
      containers: 'containers',
      createdTime: 'created_time',
      name: 'name',
      namespace: 'namespace',
      status: 'status',
      uid: 'uid',
      volumes: 'volumes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellDisplayName: 'string',
      cluster: 'string',
      containers: { 'type': 'array', 'itemType': ContainerInfo },
      createdTime: 'string',
      name: 'string',
      namespace: 'string',
      status: PodStatus,
      uid: 'string',
      volumes: { 'type': 'array', 'itemType': Volume },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联邦负载均衡实例对应的local lb实例信息（per cell)
export class LocalLoadBalancer extends $tea.Model {
  // local lb所在部署单元
  cell: string;
  // local lb实例对应的iaas id
  iaasId?: string;
  // local lb实例对应的vip
  vip?: string;
  // 当前cell lb的phase
  phase?: string;
  // 空代表无错误信息，非空时即报错信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      iaasId: 'iaas_id',
      vip: 'vip',
      phase: 'phase',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      iaasId: 'string',
      vip: 'string',
      phase: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UID 分片范围
export class UidRange extends $tea.Model {
  // UID 起始值
  start: number;
  // UID 终止值
  end: number;
  // 弹性
  elastic?: boolean;
  static names(): { [key: string]: string } {
    return {
      start: 'start',
      end: 'end',
      elastic: 'elastic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      start: 'number',
      end: 'number',
      elastic: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器应用服务运维
export class ContainerServiceOperation extends $tea.Model {
  // 容器服务名称。
  containerServiceName: string;
  // 依赖的容器应用服务名称。
  dependContainerServiceNames?: string[];
  // 待操作目标pods列表
  selectedPods?: CellPods[];
  // 自定义发布批次
  batches?: ReleaseBatchObj[];
  // 缩放副本数量，扩缩容时使用
  scaleReplicas?: ReplicaCount[];
  // 应用服务当前版本
  containerServiceRevision?: string;
  // [huanyu场景使用]，灰度平台pods分批序列化为json的结果
  graycoreBatches?: string;
  static names(): { [key: string]: string } {
    return {
      containerServiceName: 'container_service_name',
      dependContainerServiceNames: 'depend_container_service_names',
      selectedPods: 'selected_pods',
      batches: 'batches',
      scaleReplicas: 'scale_replicas',
      containerServiceRevision: 'container_service_revision',
      graycoreBatches: 'graycore_batches',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerServiceName: 'string',
      dependContainerServiceNames: { 'type': 'array', 'itemType': 'string' },
      selectedPods: { 'type': 'array', 'itemType': CellPods },
      batches: { 'type': 'array', 'itemType': ReleaseBatchObj },
      scaleReplicas: { 'type': 'array', 'itemType': ReplicaCount },
      containerServiceRevision: 'string',
      graycoreBatches: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联邦负载均衡实例与应用服务之间的关联关系，以及占用端口情况。
export class FedLoadBalancerContainerServiceRel extends $tea.Model {
  // 应用服务名字
  containerServiceName: string;
  // 应用服务命名空间
  namespace: string;
  // 联邦负载均衡实例当前已被占用的端口
  occupiedPorts: number[];
  static names(): { [key: string]: string } {
    return {
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      occupiedPorts: 'occupied_ports',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerServiceName: 'string',
      namespace: 'string',
      occupiedPorts: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组概要信息
export class AppGroupSimpleView extends $tea.Model {
  // 应用id列表
  appIdList: string[];
  // 服务分组id
  id: string;
  // 状态
  state: string;
  static names(): { [key: string]: string } {
    return {
      appIdList: 'app_id_list',
      id: 'id',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appIdList: { 'type': 'array', 'itemType': 'string' },
      id: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cluster overview info
export class ClusterOverviewInfo extends $tea.Model {
  // available cpu core
  availableCPU?: number;
  // available disk
  availableDisk?: number;
  // available memory
  availableMemory?: number;
  // available Node Number
  availableNodeNumber?: number;
  // total cpu core number
  totalCPU?: number;
  // total disk
  totalDisk?: number;
  // total memory
  totalMemory?: number;
  // total node number
  totalNodeNumber?: number;
  static names(): { [key: string]: string } {
    return {
      availableCPU: 'available_c_p_u',
      availableDisk: 'available_disk',
      availableMemory: 'available_memory',
      availableNodeNumber: 'available_node_number',
      totalCPU: 'total_c_p_u',
      totalDisk: 'total_disk',
      totalMemory: 'total_memory',
      totalNodeNumber: 'total_node_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableCPU: 'number',
      availableDisk: 'number',
      availableMemory: 'number',
      availableNodeNumber: 'number',
      totalCPU: 'number',
      totalDisk: 'number',
      totalMemory: 'number',
      totalNodeNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单|应用执行进度，按状态区分
export class AppDeployPodStateSummary extends $tea.Model {
  // 执行对象ID
  id: string;
  // 执行对象状态
  state: string;
  // 总计
  total: number;
  // 执行中个数
  executing: number;
  // 成功数
  succeeded: number;
  // 等待个数
  waiting: number;
  // 失败个数
  failed: number;
  // 初始化个数
  // 
  inited: number;
  // 阻塞个数
  blocked: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      state: 'state',
      total: 'total',
      executing: 'executing',
      succeeded: 'succeeded',
      waiting: 'waiting',
      failed: 'failed',
      inited: 'inited',
      blocked: 'blocked',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      state: 'string',
      total: 'number',
      executing: 'number',
      succeeded: 'number',
      waiting: 'number',
      failed: 'number',
      inited: 'number',
      blocked: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 具体sidecar的服务配置，包含sidecar名称，版本，feature，image，env，releaseVersion等
export class SidecarReleaseInfo extends $tea.Model {
  // sidecar类型名称
  sidecarName: string;
  // sidecar的发布版本
  sidecarVersion: string;
  // mosn对应打开的feature-gates配置。
  featureGates?: string;
  // 所用的image
  image: string;
  // 应用基线当前所用的自定义env
  changeEnvs?: string;
  // sidecar的发布版本号
  releaseVersion: string;
  //  上一次的发布版本号
  lastReleaseVersion?: string;
  static names(): { [key: string]: string } {
    return {
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      featureGates: 'feature_gates',
      image: 'image',
      changeEnvs: 'change_envs',
      releaseVersion: 'release_version',
      lastReleaseVersion: 'last_release_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sidecarName: 'string',
      sidecarVersion: 'string',
      featureGates: 'string',
      image: 'string',
      changeEnvs: 'string',
      releaseVersion: 'string',
      lastReleaseVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器应用服务部署
export class ContainerServiceDeployment extends $tea.Model {
  // 容器服务名称。
  containerServiceName: string;
  // 容器服务版本号。
  containerServiceRevision: string;
  // 依赖的容器应用服务名称。
  dependContainerServiceNames: string[];
  // 限定需要发布的部署单元
  restrictedCells?: string[];
  // 自定义发布批次
  batches?: ReleaseBatchObj[];
  // 默认ByIndex
  upgradePolicy?: string;
  // 发布模板名称
  deploymentTemplateName?: string;
  static names(): { [key: string]: string } {
    return {
      containerServiceName: 'container_service_name',
      containerServiceRevision: 'container_service_revision',
      dependContainerServiceNames: 'depend_container_service_names',
      restrictedCells: 'restricted_cells',
      batches: 'batches',
      upgradePolicy: 'upgrade_policy',
      deploymentTemplateName: 'deployment_template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerServiceName: 'string',
      containerServiceRevision: 'string',
      dependContainerServiceNames: { 'type': 'array', 'itemType': 'string' },
      restrictedCells: { 'type': 'array', 'itemType': 'string' },
      batches: { 'type': 'array', 'itemType': ReleaseBatchObj },
      upgradePolicy: 'string',
      deploymentTemplateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// master cluster info
export class MasterCluster extends $tea.Model {
  // master cluster name
  name: string;
  // workspace id
  workspaceId: string;
  // workspace name
  workspaceName?: string;
  // region id
  regionId: string;
  // region name
  regionName?: string;
  // zone id
  zoneId: string;
  // zone name
  zoneName?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
      regionId: 'region_id',
      regionName: 'region_name',
      zoneId: 'zone_id',
      zoneName: 'zone_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      workspaceId: 'string',
      workspaceName: 'string',
      regionId: 'string',
      regionName: 'string',
      zoneId: 'string',
      zoneName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FedSecret cluster override
export class FedSecretOverride extends $tea.Model {
  // fed secret data override
  data: SecretData[];
  // cluster name
  // 
  name: string;
  // name cell override
  nameOverride: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      name: 'name',
      nameOverride: 'name_override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': SecretData },
      name: 'string',
      nameOverride: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例接入settings （vip, id, etc.)
export class EntrySettings extends $tea.Model {
  // 是否自定义uai entry
  customized?: boolean;
  // 统一接入实例每个datacenter的用户自定义入口负载均衡实例id列表
  entryIds?: MapStringToString[];
  // 统一接入实例每个datacenter用户自定义入口负载均衡实例的vip
  entryVips?: MapStringToString[];
  static names(): { [key: string]: string } {
    return {
      customized: 'customized',
      entryIds: 'entry_ids',
      entryVips: 'entry_vips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customized: 'boolean',
      entryIds: { 'type': 'array', 'itemType': MapStringToString },
      entryVips: { 'type': 'array', 'itemType': MapStringToString },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署参数
export class OpsParam extends $tea.Model {
  // 部署参数键值
  key?: string;
  // 部署参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例详细信息
export class UnifiedAccessInstanceLocalDetailInfo extends $tea.Model {
  // 所属集群名称
  clusterName: string;
  // 所在可用区，即AZ信息
  dataCenter: string;
  // local实例详细信息显示，包含错误状态信息等
  messageDetails?: string;
  // local实例状态描述：创建中、创建成功、创建失败
  status: string;
  // vip信息
  vip: string;
  // http entry的状态
  httpEntryStatus?: HttpEntryStatus;
  // https entry的状态
  httpsEntryStatus?: HttpsEntryStatus;
  static names(): { [key: string]: string } {
    return {
      clusterName: 'cluster_name',
      dataCenter: 'data_center',
      messageDetails: 'message_details',
      status: 'status',
      vip: 'vip',
      httpEntryStatus: 'http_entry_status',
      httpsEntryStatus: 'https_entry_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterName: 'string',
      dataCenter: 'string',
      messageDetails: 'string',
      status: 'string',
      vip: 'string',
      httpEntryStatus: HttpEntryStatus,
      httpsEntryStatus: HttpsEntryStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// zone info
export class ZoneInfo extends $tea.Model {
  // zone identity
  id: string;
  // zone name
  name?: string;
  // 所属region信息。
  region?: string;
  // zone display name
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      region: 'region',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      region: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元对应的流量规则
export class CellFlow extends $tea.Model {
  // 部署单元名称
  name: string;
  // 蓝绿着色。
  // BLUE：蓝
  // GREEN：绿
  // 非着色单元为 null
  color?: string;
  // 部署单元所占单元组的流量比。
  percent: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      color: 'color',
      percent: 'percent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      color: 'string',
      percent: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本地 spanner cluster 详细信息
export class LocalSpannerClusterDetail extends $tea.Model {
  // 可用区
  az: string;
  // 本地集群名称
  clusterName: string;
  // 可能存在的错误信息
  message?: string;
  // 集群状态
  phase?: string;
  // spanner cluster 集群id
  spannerClusterId?: string;
  // 描述spanner cluster健康状态
  state?: string;
  // 若干组容器信息
  subClustersDetails?: LocalSubClusterDetail[];
  static names(): { [key: string]: string } {
    return {
      az: 'az',
      clusterName: 'cluster_name',
      message: 'message',
      phase: 'phase',
      spannerClusterId: 'spanner_cluster_id',
      state: 'state',
      subClustersDetails: 'sub_clusters_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      az: 'string',
      clusterName: 'string',
      message: 'string',
      phase: 'string',
      spannerClusterId: 'string',
      state: 'string',
      subClustersDetails: { 'type': 'array', 'itemType': LocalSubClusterDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单自定义卡点。暂时不支持
export class CustomHook extends $tea.Model {
  // 卡点范围，目前只支持分批
  hookScope: string;
  // 卡点类型：api或has
  hookType: string;
  // 卡点名称
  hookName?: string;
  // 卡点执行策略：each-每个分组，first-第一个分组，last-最后一个分组，custom-自定义分组。
  // 默认每个分组都会执行。
  hookStrategy?: string;
  // 自定义批次编号，从0开始。hook_strategy=custom时有效
  customNum?: number;
  // api类型卡点配置，当hook_type=api时不能为空
  apiHookConfig?: ApiHookConfig;
  // 守夜人类型卡点配置，当hook_type=has时不能为空
  hasHookConfig?: HasHookConfig;
  // 【暂不支持】是否允许忽略
  ignoreSupported?: boolean;
  // 【暂不支持】任务超时时间，单位毫秒，默认10分钟
  timeoutMillis?: number;
  // 【暂不支持】默认false
  unOverride?: boolean;
  static names(): { [key: string]: string } {
    return {
      hookScope: 'hook_scope',
      hookType: 'hook_type',
      hookName: 'hook_name',
      hookStrategy: 'hook_strategy',
      customNum: 'custom_num',
      apiHookConfig: 'api_hook_config',
      hasHookConfig: 'has_hook_config',
      ignoreSupported: 'ignore_supported',
      timeoutMillis: 'timeout_millis',
      unOverride: 'un_override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hookScope: 'string',
      hookType: 'string',
      hookName: 'string',
      hookStrategy: 'string',
      customNum: 'number',
      apiHookConfig: ApiHookConfig,
      hasHookConfig: HasHookConfig,
      ignoreSupported: 'boolean',
      timeoutMillis: 'number',
      unOverride: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Federated Deployment Status
export class FederatedDeploymentStatus extends $tea.Model {
  // Federated Deployment Conditions
  conditions: DeploymentCondition[];
  // V1FederatedDeploymentStatus Topologies
  topologies: FederatedDeploymentStatusTopologies[];
  static names(): { [key: string]: string } {
    return {
      conditions: 'conditions',
      topologies: 'topologies',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conditions: { 'type': 'array', 'itemType': DeploymentCondition },
      topologies: { 'type': 'array', 'itemType': FederatedDeploymentStatusTopologies },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// https连接
export class HttpsEntry extends $tea.Model {
  // 端口
  port: number;
  // 是否使用websocket连接方式
  websocketConnect: boolean;
  // CA证书ID
  caCertificateId: string;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
      websocketConnect: 'websocket_connect',
      caCertificateId: 'ca_certificate_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'number',
      websocketConnect: 'boolean',
      caCertificateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// service端口映射
export class ServicePort extends $tea.Model {
  // 此端口映射名称
  name: string;
  // service端口映射在k8s层面的协议名，包括"TCP", "UDP", and "SCTP".
  protocol?: string;
  // service端口映射前端端口
  port: number;
  // service分配到的节点端口
  nodePort?: number;
  // 后端端口，这里仅支持整数类型
  targetPort?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      protocol: 'protocol',
      port: 'port',
      nodePort: 'node_port',
      targetPort: 'target_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      protocol: 'string',
      port: 'number',
      nodePort: 'number',
      targetPort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群事件
export class KubernetesEvents extends $tea.Model {
  // 事件发生时间
  creationTimestamp: string;
  // 事件数目
  count: number;
  // 事件内容
  message: string;
  static names(): { [key: string]: string } {
    return {
      creationTimestamp: 'creation_timestamp',
      count: 'count',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTimestamp: 'string',
      count: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// spanner集群单元信息
export class SpannerClusterUnitInfo extends $tea.Model {
  // 单元IP地址
  address: string;
  // 所属集群id
  clusterId: string;
  // 容器id
  containerId: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModify: string;
  // 集群单元状态 ： 1-下线状态 2- 上线状态 3-删除状态
  status: number;
  // 扩展信息，json字符串格式
  extendProperties?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      clusterId: 'cluster_id',
      containerId: 'container_id',
      gmtCreate: 'gmt_create',
      gmtModify: 'gmt_modify',
      status: 'status',
      extendProperties: 'extend_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      clusterId: 'string',
      containerId: 'string',
      gmtCreate: 'string',
      gmtModify: 'string',
      status: 'number',
      extendProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器健康检查-LivenessProbe。
export class LivenessProbe extends $tea.Model {
  // 命令行方式的健康监测配置。
  execAction?: ExecAction;
  // 不健康阈值。
  failureThreshold: number;
  // http方式的健康监测配置。
  httpGetAction?: HttpGetAction;
  // 首次检查延时。
  initialDelaySeconds: number;
  // 检查间隔。
  periodSeconds: number;
  // 健康阈值。
  // 
  successThreshold: number;
  // tcp方式的健康监测配置。
  tcpSocketAction?: TcpSocketAction;
  // 检查超时。
  timeoutSeconds: number;
  static names(): { [key: string]: string } {
    return {
      execAction: 'exec_action',
      failureThreshold: 'failure_threshold',
      httpGetAction: 'http_get_action',
      initialDelaySeconds: 'initial_delay_seconds',
      periodSeconds: 'period_seconds',
      successThreshold: 'success_threshold',
      tcpSocketAction: 'tcp_socket_action',
      timeoutSeconds: 'timeout_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      execAction: ExecAction,
      failureThreshold: 'number',
      httpGetAction: HttpGetAction,
      initialDelaySeconds: 'number',
      periodSeconds: 'number',
      successThreshold: 'number',
      tcpSocketAction: TcpSocketAction,
      timeoutSeconds: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed k8s resource cluster state map
export class ClusterState extends $tea.Model {
  // 集群名称
  clusterName: string;
  // k8s resource state
  state: string;
  // 详细描述或错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      clusterName: 'cluster_name',
      state: 'state',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterName: 'string',
      state: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务发布信息
export class ContainerServiceReleaseInfo extends $tea.Model {
  // 发布单id
  createdPlanId?: string;
  // 发布开始时间
  latestDeploymentStartTime?: string;
  // 发布完成时间
  latestDeploymentEndTime?: string;
  static names(): { [key: string]: string } {
    return {
      createdPlanId: 'created_plan_id',
      latestDeploymentStartTime: 'latest_deployment_start_time',
      latestDeploymentEndTime: 'latest_deployment_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdPlanId: 'string',
      latestDeploymentStartTime: 'string',
      latestDeploymentEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Service 状态
export class ServiceStatus extends $tea.Model {
  // 负载均衡地址
  loadBalancerIp?: string;
  static names(): { [key: string]: string } {
    return {
      loadBalancerIp: 'load_balancer_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loadBalancerIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k8s v1Deployment
export class Deployment extends $tea.Model {
  // Standard object metadata.
  // 
  metadata: ObjectMeta;
  // Specification of the desired behavior of the Deployment.
  // 
  spec: DeploymentSpec;
  // Most recently observed status of the Deployment.
  // 
  status: DeploymentStatus;
  static names(): { [key: string]: string } {
    return {
      metadata: 'metadata',
      spec: 'spec',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metadata: ObjectMeta,
      spec: DeploymentSpec,
      status: DeploymentStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed configmap override struct
export class FedConfigmapOverride extends $tea.Model {
  // fed configmap data override
  data: ConfigMapData[];
  // cluster name
  name: string;
  // name cell  override
  nameOverride: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      name: 'name',
      nameOverride: 'name_override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': ConfigMapData },
      name: 'string',
      nameOverride: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元权重
export class CellWeightInfo extends $tea.Model {
  // 部署单元所属工作空间
  workspace: string;
  // 部署单元名称
  name: string;
  // 部署单元所占单元组流量比重
  weight: number;
  static names(): { [key: string]: string } {
    return {
      workspace: 'workspace',
      name: 'name',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspace: 'string',
      name: 'string',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灾备信息
export class DisasterInfo extends $tea.Model {
  // 同城灾备单元(组)
  localFailoverTarget: string;
  // 异地灾备单元(组)
  remoteFailoverTarget: string;
  // 逻辑单元&部署单元名称
  source: string;
  // 容灾类型
  type: string;
  // 正常容灾状态。
  disasterRecoveryState: string;
  // 压测容灾状态。
  pressDisasterRecoveryState: string;
  static names(): { [key: string]: string } {
    return {
      localFailoverTarget: 'local_failover_target',
      remoteFailoverTarget: 'remote_failover_target',
      source: 'source',
      type: 'type',
      disasterRecoveryState: 'disaster_recovery_state',
      pressDisasterRecoveryState: 'press_disaster_recovery_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      localFailoverTarget: 'string',
      remoteFailoverTarget: 'string',
      source: 'string',
      type: 'string',
      disasterRecoveryState: 'string',
      pressDisasterRecoveryState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用发布分组，一个分组一般包含前置任务(可多个)、发布任务(一个)、后置任务(可多个)
export class AppDeployGroup extends $tea.Model {
  // 发布任务
  deployTask: AppDeployTask;
  // 后置任务列表
  postTasks: AppDeployTask[];
  // 前置任务列表
  preTasks: AppDeployTask[];
  static names(): { [key: string]: string } {
    return {
      deployTask: 'deploy_task',
      postTasks: 'post_tasks',
      preTasks: 'pre_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deployTask: AppDeployTask,
      postTasks: { 'type': 'array', 'itemType': AppDeployTask },
      preTasks: { 'type': 'array', 'itemType': AppDeployTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例关联的应用服务信息
export class UnifiedAccessInstanceContainerServiceInfo extends $tea.Model {
  // 应用服务名称
  containerServiceName: string;
  // 命名空间
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerServiceName: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar运维任务上下文
export class SidecarOperationTaskContext extends $tea.Model {
  // sidecar开启特性
  enabledFeatures?: string;
  // sidecar类型
  sidecarTypes: string[];
  // sidecar版本
  sidecarVersionMap: string;
  // sidecar支持特性
  supportedFeatures?: string;
  // 变更资源列表
  changeInstances: OperationChangeInstance[];
  // 应用名称
  appName: string;
  static names(): { [key: string]: string } {
    return {
      enabledFeatures: 'enabled_features',
      sidecarTypes: 'sidecar_types',
      sidecarVersionMap: 'sidecar_version_map',
      supportedFeatures: 'supported_features',
      changeInstances: 'change_instances',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enabledFeatures: 'string',
      sidecarTypes: { 'type': 'array', 'itemType': 'string' },
      sidecarVersionMap: 'string',
      supportedFeatures: 'string',
      changeInstances: { 'type': 'array', 'itemType': OperationChangeInstance },
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UID 分片
export class UidShard extends $tea.Model {
  // UID 起始值
  minUid: number;
  // UID 终止值
  maxUid: number;
  static names(): { [key: string]: string } {
    return {
      minUid: 'min_uid',
      maxUid: 'max_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      minUid: 'number',
      maxUid: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// http接入方式
export class HttpEntry extends $tea.Model {
  // 端口
  port: number;
  // 是否使用websocket连接方式
  websocketConnect: boolean;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
      websocketConnect: 'websocket_connect',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'number',
      websocketConnect: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar运维对象 - 机器（computer|pod）
export class SidecarOpsMachine extends $tea.Model {
  // 机器运维流程ID
  id: string;
  // 运维机器名称
  target: string;
  // 执行状态
  status: string;
  // 执行状态描述
  statusDesc?: string;
  // 扩展属性
  properties?: string;
  // 执行消息日志
  message?: string;
  // 机器sidecar运维任务列表
  subTargets: SidecarOpsMachineTask[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      target: 'target',
      status: 'status',
      statusDesc: 'status_desc',
      properties: 'properties',
      message: 'message',
      subTargets: 'sub_targets',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      target: 'string',
      status: 'string',
      statusDesc: 'string',
      properties: 'string',
      message: 'string',
      subTargets: { 'type': 'array', 'itemType': SidecarOpsMachineTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LksServiceProcessLog
export class ServiceProcessLog extends $tea.Model {
  // Logs属性
  attributes: string;
  // 错误追溯
  errorStackTraces: string;
  // 发布阶段，INIT，PARSE， EXECUTE
  execPhase: string;
  // 关联对象类型，RPV2，RP_STAGE，POD
  invObjectKind: string;
  // 对应object的name
  invObjectName: string;
  // 对应object的namespace
  invObjectNamespace: string;
  // log_time
  logTime: string;
  // Logs详情
  message: string;
  // Logs原因
  reason: string;
  // 关联的ldc_plan id
  refPlan: string;
  // 关联的lks_service id
  refService: string;
  // Logs的来源，ldcconsole，orch_event，opsware_event
  source: string;
  static names(): { [key: string]: string } {
    return {
      attributes: 'attributes',
      errorStackTraces: 'error_stack_traces',
      execPhase: 'exec_phase',
      invObjectKind: 'inv_object_kind',
      invObjectName: 'inv_object_name',
      invObjectNamespace: 'inv_object_namespace',
      logTime: 'log_time',
      message: 'message',
      reason: 'reason',
      refPlan: 'ref_plan',
      refService: 'ref_service',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributes: 'string',
      errorStackTraces: 'string',
      execPhase: 'string',
      invObjectKind: 'string',
      invObjectName: 'string',
      invObjectNamespace: 'string',
      logTime: 'string',
      message: 'string',
      reason: 'string',
      refPlan: 'string',
      refService: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维应用操作链。一个操作链中包含一个顺序的运维应用组列表，这些运维应用组将依次串行的执行运维操作。不同的操作链将并行执行。
export class OpsApplicationChain extends $tea.Model {
  // 此运维应用链中包含的应用组列表
  groups?: OpsApplicationGroup[];
  static names(): { [key: string]: string } {
    return {
      groups: 'groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groups: { 'type': 'array', 'itemType': OpsApplicationGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组概要信息列表
export class AppGroupSimpleViewList extends $tea.Model {
  // 应用分组列表
  appGroupList: AppGroupSimpleView[];
  static names(): { [key: string]: string } {
    return {
      appGroupList: 'app_group_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appGroupList: { 'type': 'array', 'itemType': AppGroupSimpleView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// App配置依赖
export class AppReleaseConfigDependOn extends $tea.Model {
  // 类型
  kind: string;
  // 名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      kind: 'kind',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      kind: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可用区
export class Zone extends $tea.Model {
  // 数据中心名
  dataCenter: string;
  // 可用区展示名
  displayName: string;
  // 可用区名
  name: string;
  // 所属地域
  region: string;
  // 可用区id
  zoneId: string;
  // 地域id
  regionId: string;
  static names(): { [key: string]: string } {
    return {
      dataCenter: 'data_center',
      displayName: 'display_name',
      name: 'name',
      region: 'region',
      zoneId: 'zone_id',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataCenter: 'string',
      displayName: 'string',
      name: 'string',
      region: 'string',
      zoneId: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// drm 推送记录
export class DrmOpsRecord extends $tea.Model {
  // 应用
  apps?: string[];
  // 操作人
  operator: string;
  // 推送时间
  pushTime?: string;
  // 推送结果，包括（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
  resultCode: string;
  // 结果信息
  resultMsg?: string;
  // 推送目标
  targets?: string[];
  // 推送值
  value?: string;
  // 规则类型
  ruleType: string;
  static names(): { [key: string]: string } {
    return {
      apps: 'apps',
      operator: 'operator',
      pushTime: 'push_time',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      targets: 'targets',
      value: 'value',
      ruleType: 'rule_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apps: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
      pushTime: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      targets: { 'type': 'array', 'itemType': 'string' },
      value: 'string',
      ruleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器应用服务版本信息。
export class ContainerServiceRevision extends $tea.Model {
  // 应用信息。
  appInfo: AppInfo;
  // 容器服务配置。
  containerServiceConfig: ContainerServiceConfig;
  // 容器服务服务名称。
  containerServiceName: string;
  // 容器服务发布信息
  containerServiceReleaseInfo?: ContainerServiceReleaseInfo;
  // 创建时间。
  createdTime: string;
  // 发布状态。
  deployStatus?: string;
  // container service description
  description?: string;
  // 关联的最近一次发布单。
  lastPlanId?: string;
  // 元数据状态。
  metaStatus?: string;
  // 更新时间。
  modifiedTime: string;
  // 所属命名空间名称。
  namespace: string;
  // 版本提交人。
  operator: string;
  // 版本备注。
  remarks?: string;
  // 版本号。
  revision: string;
  static names(): { [key: string]: string } {
    return {
      appInfo: 'app_info',
      containerServiceConfig: 'container_service_config',
      containerServiceName: 'container_service_name',
      containerServiceReleaseInfo: 'container_service_release_info',
      createdTime: 'created_time',
      deployStatus: 'deploy_status',
      description: 'description',
      lastPlanId: 'last_plan_id',
      metaStatus: 'meta_status',
      modifiedTime: 'modified_time',
      namespace: 'namespace',
      operator: 'operator',
      remarks: 'remarks',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appInfo: AppInfo,
      containerServiceConfig: ContainerServiceConfig,
      containerServiceName: 'string',
      containerServiceReleaseInfo: ContainerServiceReleaseInfo,
      createdTime: 'string',
      deployStatus: 'string',
      description: 'string',
      lastPlanId: 'string',
      metaStatus: 'string',
      modifiedTime: 'string',
      namespace: 'string',
      operator: 'string',
      remarks: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务的sidecar配置
export class AppServiceSidecarReleaseInfo extends $tea.Model {
  // 服务所属app名称
  appName: string;
  // 应用服务名
  containerServiceName: string;
  // 应用服务所包含的sidecar配置信息，可以有mosn，odp等等不同sidecar类型的配置
  releaseInfos: SidecarReleaseInfo[];
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      containerServiceName: 'container_service_name',
      releaseInfos: 'release_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      containerServiceName: 'string',
      releaseInfos: { 'type': 'array', 'itemType': SidecarReleaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed configmap override list
export class FedSecretOverrideList extends $tea.Model {
  // fed configmap override list
  list: FedSecretOverride[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': FedSecretOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联邦无状态工作负载
export class FederatedDeployment extends $tea.Model {
  // Standard object metadata.
  // 
  metadata: ObjectMeta;
  // Federated Deployment Override
  overrides: FedDeploymentClusterOverride[];
  // Federated Deployment Template
  template: Deployment;
  // 联邦无状态工作负载状态
  status: FederatedDeploymentStatus;
  static names(): { [key: string]: string } {
    return {
      metadata: 'metadata',
      overrides: 'overrides',
      template: 'template',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metadata: ObjectMeta,
      overrides: { 'type': 'array', 'itemType': FedDeploymentClusterOverride },
      template: Deployment,
      status: FederatedDeploymentStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// region info
export class RegionInfo extends $tea.Model {
  // region name
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ReleasePipeline ref event
export class RpReleaseEvent extends $tea.Model {
  // 集群名
  cluster: string;
  // 结束时间
  endTime: string;
  // 事件关联的对象类型
  // 
  invObjKind: string;
  // 事件关联对象名字
  // 
  invObjName: string;
  // 事件关联对象的namespace
  // 
  invObjNamespace: string;
  // 事件关联对象版本
  // 
  invObjVersion: string;
  // 事件详情
  // 
  message: string;
  // 事件原因
  // 
  reason: string;
  // 事件来源组件
  // 
  sourceComp: string;
  // start_time
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      endTime: 'end_time',
      invObjKind: 'inv_obj_kind',
      invObjName: 'inv_obj_name',
      invObjNamespace: 'inv_obj_namespace',
      invObjVersion: 'inv_obj_version',
      message: 'message',
      reason: 'reason',
      sourceComp: 'source_comp',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      endTime: 'string',
      invObjKind: 'string',
      invObjName: 'string',
      invObjNamespace: 'string',
      invObjVersion: 'string',
      message: 'string',
      reason: 'string',
      sourceComp: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ContainerServiceOperationList
export class ContainerServiceOperationList extends $tea.Model {
  // ContainerServiceOperationList
  list: ContainerServiceOperation[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ContainerServiceOperation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布模板
export class DeploymentTemplate extends $tea.Model {
  // 模板编码
  name: string;
  // 中文名称
  displayName: string;
  // 模板描述
  description?: string;
  // 是否覆盖版本中的发布策略
  overrideDeployConfig: boolean;
  // 发布策略
  deployConfig?: DeployConfig;
  // 是否开启变更卡点
  enableCustomHook: boolean;
  // 卡点类型：api或has
  hookType?: string;
  // 自定义卡点配置列表
  // 
  customHooks?: CustomHook[];
  // 操作人
  operator?: string;
  // 创建时间
  createdTime?: string;
  // 更新时间
  modifiedTime?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      displayName: 'display_name',
      description: 'description',
      overrideDeployConfig: 'override_deploy_config',
      deployConfig: 'deploy_config',
      enableCustomHook: 'enable_custom_hook',
      hookType: 'hook_type',
      customHooks: 'custom_hooks',
      operator: 'operator',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      displayName: 'string',
      description: 'string',
      overrideDeployConfig: 'boolean',
      deployConfig: DeployConfig,
      enableCustomHook: 'boolean',
      hookType: 'string',
      customHooks: { 'type': 'array', 'itemType': CustomHook },
      operator: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// uid 信息
export class UidInfo extends $tea.Model {
  // UID
  uid: number;
  // 当前分组
  currentGroup: string;
  // 默认分组
  defaultGroup: string;
  // 是否弹性
  elastic?: boolean;
  // 是否压测
  press?: boolean;
  // 是否灰度
  gray?: boolean;
  static names(): { [key: string]: string } {
    return {
      uid: 'uid',
      currentGroup: 'current_group',
      defaultGroup: 'default_group',
      elastic: 'elastic',
      press: 'press',
      gray: 'gray',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uid: 'number',
      currentGroup: 'string',
      defaultGroup: 'string',
      elastic: 'boolean',
      press: 'boolean',
      gray: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 获取单个spanner cluster的详细信息
export class GetSpannerClusterDetail extends $tea.Model {
  // 联邦 spanner cluster 详细信息
  clusterDetail: QuerySpannerClusterDetail;
  // 若干组本地集群信息
  localClusters: LocalSpannerClusterDetail[];
  static names(): { [key: string]: string } {
    return {
      clusterDetail: 'cluster_detail',
      localClusters: 'local_clusters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterDetail: QuerySpannerClusterDetail,
      localClusters: { 'type': 'array', 'itemType': LocalSpannerClusterDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cell weight info list.
export class CellWeightInfoList extends $tea.Model {
  // weight info list.
  data: CellWeightInfo[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': CellWeightInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed secret struct
// 
export class FedSecret extends $tea.Model {
  // fed secret annotations
  // 
  annotations?: Annotation[];
  // FedSecret Cell Cluster Status
  cellStatus: ClusteCellStatus[];
  // fed clusters
  // 
  clusters: string[];
  // 创建时间
  createTimeStamp: string;
  // fed secret data
  // 
  data: SecretData[];
  // fed secret labels
  // 
  labels?: Label[];
  // fed secret name
  // 
  name: string;
  // fed secret namespace
  // 
  namespace: string;
  // fed secret override
  // 
  overrides: FedSecretOverride[];
  // 原因描述
  reason?: string;
  // FedSecret同步状态
  status: string;
  // opaque
  type: string;
  static names(): { [key: string]: string } {
    return {
      annotations: 'annotations',
      cellStatus: 'cell_status',
      clusters: 'clusters',
      createTimeStamp: 'create_time_stamp',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      reason: 'reason',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annotations: { 'type': 'array', 'itemType': Annotation },
      cellStatus: { 'type': 'array', 'itemType': ClusteCellStatus },
      clusters: { 'type': 'array', 'itemType': 'string' },
      createTimeStamp: 'string',
      data: { 'type': 'array', 'itemType': SecretData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: { 'type': 'array', 'itemType': FedSecretOverride },
      reason: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 前后置任务
export class OpsPrePostTask extends $tea.Model {
  // 
  //           任务类型。
  //           中间件任务：
  //           MESSAGE_BROKER_TOPIC：消息中间件TOPIC；
  //           MESSAGE_BROKER_TOPIC_SUB：消息中间件绑定关系；
  //           DRM_RESOURCE：DRM资源；
  //           SCHEDULER_TASK：定时任务；
  //           其他类型任务待定。
  //         
  type?: string;
  // 
  //           操作类型。取值列表：
  //           CREATE：新建；
  //           UPDATE：更新；
  //           DELETE：删除；
  //           UNDEFINED：未定义；
  //         
  operationType?: string;
  // 
  //           任务详情，JSON字符串
  //         
  detail?: string;
  // 
  //           任务状态。取值列表：EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；IGNORED：已忽略
  //         
  status?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      operationType: 'operation_type',
      detail: 'detail',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      operationType: 'string',
      detail: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布(运维)单状态汇总数据
export class LdcPlanStateCount extends $tea.Model {
  // 发布单状态类型
  state: string;
  // 数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布解决方案
export class UnireleaseSolution extends $tea.Model {
  // 发布单ID
  id: string;
  // 发布单标题
  title: string;
  // 解决方案平台源
  sourceSystem: string;
  // 发布类型，容器/经典
  type: string;
  // 需求人/操作者
  submitter: string;
  // 解决方案状态
  state: string;
  // 解决方案提出时间
  createTimeStamp: string;
  // 是否自动执行
  autoExecute: boolean;
  // 环境信息
  env: string;
  // 变更人员
  operator: string;
  // 解决方案拓展信息
  extInfo: UnireleaseSolutionExtInfo;
  // 解决方案包含的应用配置信息
  apps: UnireleaseSolutionApp[];
  // 租户列表
  tenants: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      title: 'title',
      sourceSystem: 'source_system',
      type: 'type',
      submitter: 'submitter',
      state: 'state',
      createTimeStamp: 'create_time_stamp',
      autoExecute: 'auto_execute',
      env: 'env',
      operator: 'operator',
      extInfo: 'ext_info',
      apps: 'apps',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      title: 'string',
      sourceSystem: 'string',
      type: 'string',
      submitter: 'string',
      state: 'string',
      createTimeStamp: 'string',
      autoExecute: 'boolean',
      env: 'string',
      operator: 'string',
      extInfo: UnireleaseSolutionExtInfo,
      apps: { 'type': 'array', 'itemType': UnireleaseSolutionApp },
      tenants: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// master clusters info of each zone
export class MasterClustersOfZone extends $tea.Model {
  // master clusters of specific zone
  clusters: MasterCluster[];
  // zone name
  zoneName: string;
  // if the az has imported cluster
  hasImported: boolean;
  static names(): { [key: string]: string } {
    return {
      clusters: 'clusters',
      zoneName: 'zone_name',
      hasImported: 'has_imported',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusters: { 'type': 'array', 'itemType': MasterCluster },
      zoneName: 'string',
      hasImported: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹出 UID
export class PopOutUid extends $tea.Model {
  // 弹出的 UID 值
  value: number;
  // 弹出的目标部署单元
  cell: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'number',
      cell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// container_services list
export class SontainerServicesList extends $tea.Model {
  // ContainerServiceDeployment
  list: ContainerServiceDeployment[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ContainerServiceDeployment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联邦负载均衡实例属性
export class FedLoadBalancer extends $tea.Model {
  // 联邦负载均衡实例名称
  name: string;
  // 地址类型，比如公网、内网
  addrType: string;
  // 联邦负载均衡实例的状态，由多个local 负载均衡实例的状态汇聚计算而来
  state?: string;
  // 创建时间
  createTime: string;
  // 关联的应用服务情况
  containerServicesInfo?: FedLoadBalancerContainerServiceRel[];
  // local lb实例信息
  localLoadbalancerInstances?: LocalLoadBalancer[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      addrType: 'addr_type',
      state: 'state',
      createTime: 'create_time',
      containerServicesInfo: 'container_services_info',
      localLoadbalancerInstances: 'local_loadbalancer_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      addrType: 'string',
      state: 'string',
      createTime: 'string',
      containerServicesInfo: { 'type': 'array', 'itemType': FedLoadBalancerContainerServiceRel },
      localLoadbalancerInstances: { 'type': 'array', 'itemType': LocalLoadBalancer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar元数据
export class SideCar extends $tea.Model {
  // region id
  regionId?: string;
  // sidecar description
  description: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope: string;
  // sidecar_name
  sidecarName: string;
  // workspace_group_id
  workspaceGroupId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      regionId: 'region_id',
      description: 'description',
      scope: 'scope',
      sidecarName: 'sidecar_name',
      workspaceGroupId: 'workspace_group_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regionId: 'string',
      description: 'string',
      scope: 'string',
      sidecarName: 'string',
      workspaceGroupId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 逻辑单元
export class CellGroup extends $tea.Model {
  // 包含部署单元列表。
  cells: Cell[];
  // 机房名称。
  datacenter?: string;
  // 默认全局域
  defaultGzone?: string;
  // 逻辑单元灾备信息
  disasterInfo: DisasterInfo[];
  // 修改时间
  modifiedTime: string;
  // 逻辑单元名称
  name: string;
  // 操作人
  operator: string;
  // 逻辑单元类型
  type: string;
  // 所属地域：CZone Group 必填
  region?: string;
  static names(): { [key: string]: string } {
    return {
      cells: 'cells',
      datacenter: 'datacenter',
      defaultGzone: 'default_gzone',
      disasterInfo: 'disaster_info',
      modifiedTime: 'modified_time',
      name: 'name',
      operator: 'operator',
      type: 'type',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cells: { 'type': 'array', 'itemType': Cell },
      datacenter: 'string',
      defaultGzone: 'string',
      disasterInfo: { 'type': 'array', 'itemType': DisasterInfo },
      modifiedTime: 'string',
      name: 'string',
      operator: 'string',
      type: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云原生技术栈版本
export class NativeTechStackVersion extends $tea.Model {
  // 版本描述
  description: string;
  // 用户扩展的自定义Dockerfile指令
  extendCommands: string[];
  // 版本扩展信息，e.g 公共环境变量
  extendProperties: string;
  // 基础镜像存放地址
  fromImage: string;
  // 唯一标识ID
  id: string;
  // 可见范围：全局可见|租户内可见
  scope: string;
  // 所属技术栈
  techStack: string;
  // 所属技术栈标识id
  techStackId: string;
  // 技术栈版本
  version: string;
  // 创建时间（UTC）
  utcCreated: string;
  // 最近修改时间（UTC）
  utcModified: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      extendCommands: 'extend_commands',
      extendProperties: 'extend_properties',
      fromImage: 'from_image',
      id: 'id',
      scope: 'scope',
      techStack: 'tech_stack',
      techStackId: 'tech_stack_id',
      version: 'version',
      utcCreated: 'utc_created',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      extendCommands: { 'type': 'array', 'itemType': 'string' },
      extendProperties: 'string',
      fromImage: 'string',
      id: 'string',
      scope: 'string',
      techStack: 'string',
      techStackId: 'string',
      version: 'string',
      utcCreated: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cloudconfig
export class CloudConfigEntity extends $tea.Model {
  // 配置详情
  cloudConfig: string;
  // 操作时间
  gmtCreate: string;
  // 操作类型
  operation: string;
  // admin
  operator: string;
  static names(): { [key: string]: string } {
    return {
      cloudConfig: 'cloud_config',
      gmtCreate: 'gmt_create',
      operation: 'operation',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cloudConfig: 'string',
      gmtCreate: 'string',
      operation: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class Application extends $tea.Model {
  // 应用部署时指定的自定义参数
  customParams?: OpsParam[];
  // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
  depends?: string[];
  // 应用名称
  name?: string;
  // 指定应用下的应用服务实例
  services?: AppService[];
  // 应用包版本
  version?: string;
  static names(): { [key: string]: string } {
    return {
      customParams: 'custom_params',
      depends: 'depends',
      name: 'name',
      services: 'services',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customParams: { 'type': 'array', 'itemType': OpsParam },
      depends: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      services: { 'type': 'array', 'itemType': AppService },
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Kubernetes Event
export class KubeEvent extends $tea.Model {
  // 事件类型
  type: string;
  // 发布次数
  count: number;
  // 事件原因
  reason: string;
  // 事件内容
  message: string;
  // 更新时间
  modifiedTime: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      count: 'count',
      reason: 'reason',
      message: 'message',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      count: 'number',
      reason: 'string',
      message: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// node info
export class NodeInfo extends $tea.Model {
  // cell name
  cellName?: string;
  // node ip
  ip?: string;
  // true
  isSchedulable?: boolean;
  // number of capacity cpu core
  limitedCpu?: number;
  // quantity of capacity memory
  limitedMemory?: number;
  // node name
  name: string;
  // pod number of one node
  podNumber?: string;
  // node state
  state?: string;
  // quantity of used cpu core
  usedCpu?: number;
  // quantity of used memory
  usedMemory?: number;
  // zone name
  zoneName?: string;
  // node labels
  labels?: Label[];
  // node annotations
  annotations?: Annotation[];
  // node created time
  createdTime?: string;
  // node system infos
  systemInfos?: Annotation[];
  // max pod amount of node
  maxPodAmount?: number;
  // running pod amount of node
  runningPodAmount?: number;
  static names(): { [key: string]: string } {
    return {
      cellName: 'cell_name',
      ip: 'ip',
      isSchedulable: 'is_schedulable',
      limitedCpu: 'limited_cpu',
      limitedMemory: 'limited_memory',
      name: 'name',
      podNumber: 'pod_number',
      state: 'state',
      usedCpu: 'used_cpu',
      usedMemory: 'used_memory',
      zoneName: 'zone_name',
      labels: 'labels',
      annotations: 'annotations',
      createdTime: 'created_time',
      systemInfos: 'system_infos',
      maxPodAmount: 'max_pod_amount',
      runningPodAmount: 'running_pod_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellName: 'string',
      ip: 'string',
      isSchedulable: 'boolean',
      limitedCpu: 'number',
      limitedMemory: 'number',
      name: 'string',
      podNumber: 'string',
      state: 'string',
      usedCpu: 'number',
      usedMemory: 'number',
      zoneName: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      annotations: { 'type': 'array', 'itemType': Annotation },
      createdTime: 'string',
      systemInfos: { 'type': 'array', 'itemType': Annotation },
      maxPodAmount: 'number',
      runningPodAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// secured Group Info
export class SecuredGroupInfo extends $tea.Model {
  // secured group name
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户应用发布状态
export class TenantAppReleasePipeline extends $tea.Model {
  // 机构名称
  tenant: string;
  // 环境
  workspaceGroup: string;
  // 应用发布releaseId
  releaseId: string;
  // 发布单序列号
  releaseTimeSeriesId: string;
  // 应用发布状态
  state: string;
  // 应用发布单详情url
  url?: string;
  // 应用列表
  apps: string[];
  // 操作人员
  operator: string;
  // 发布单ID
  approvePlanId?: string;
  // 发布审批单Url
  approvePlanUrl?: string;
  static names(): { [key: string]: string } {
    return {
      tenant: 'tenant',
      workspaceGroup: 'workspace_group',
      releaseId: 'release_id',
      releaseTimeSeriesId: 'release_time_series_id',
      state: 'state',
      url: 'url',
      apps: 'apps',
      operator: 'operator',
      approvePlanId: 'approve_plan_id',
      approvePlanUrl: 'approve_plan_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenant: 'string',
      workspaceGroup: 'string',
      releaseId: 'string',
      releaseTimeSeriesId: 'string',
      state: 'string',
      url: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
      approvePlanId: 'string',
      approvePlanUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MasterClusterForWorkspaces
export class MasterClusterForWorkspaces extends $tea.Model {
  // workspace id
  workspaceId: string[];
  // master cluster info to init minion cluster
  masterClusterInfo: MasterCluster;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      masterClusterInfo: 'master_cluster_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: { 'type': 'array', 'itemType': 'string' },
      masterClusterInfo: MasterCluster,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// namespace detail 
export class NamespaceDetail extends $tea.Model {
  // name
  name: string;
  // labels
  labels?: Label[];
  // status
  status?: string;
  // created time
  createdTime: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      labels: 'labels',
      status: 'status',
      createdTime: 'created_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      status: 'string',
      createdTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// kubernetes集群事件信息
export class ClusterEvents extends $tea.Model {
  // 集群名称
  cluster: string;
  // 集群事件
  events: KubernetesEvents[];
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      events: 'events',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      events: { 'type': 'array', 'itemType': KubernetesEvents },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器服务service信息。
export class NativeServiceView extends $tea.Model {
  // 服务名称。
  name: string;
  // 服务类型。
  type: string;
  // 负载均衡实例id。
  loadBalancerId?: string;
  // VIP地址信息。
  vipAddresses?: string[];
  // VIP地址信息类型。
  vipAddressType?: string;
  // ClusterIP信息。
  clusterIp?: string;
  // 创建时间。
  createdTimestamp: string;
  // 修改时间。
  modifiedTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      loadBalancerId: 'load_balancer_id',
      vipAddresses: 'vip_addresses',
      vipAddressType: 'vip_address_type',
      clusterIp: 'cluster_ip',
      createdTimestamp: 'created_timestamp',
      modifiedTimestamp: 'modified_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      loadBalancerId: 'string',
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      vipAddressType: 'string',
      clusterIp: 'string',
      createdTimestamp: 'string',
      modifiedTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流量权重定义
export class ServiceWeight extends $tea.Model {
  // 统一接入名称
  ingressName: string;
  // 蓝区流量权重，取值0-100
  blue: number;
  // 绿区流量权重，取值0-100
  green: number;
  // 状态：succeed、updating、fail
  status?: string;
  // 错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      ingressName: 'ingress_name',
      blue: 'blue',
      green: 'green',
      status: 'status',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ingressName: 'string',
      blue: 'number',
      green: 'number',
      status: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 健康检查配置。
export class HealthCheckConfigInfo extends $tea.Model {
  // 容器健康检查配置liveness probe。
  livenessProbe?: LivenessProbe;
  // 容器健康检查配置readiness probe。
  readinessProbe?: ReadinessProbe;
  static names(): { [key: string]: string } {
    return {
      livenessProbe: 'liveness_probe',
      readinessProbe: 'readiness_probe',
    };
  }

  static types(): { [key: string]: any } {
    return {
      livenessProbe: LivenessProbe,
      readinessProbe: ReadinessProbe,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单摘要信息
export class PlanSimpleView extends $tea.Model {
  // 发布单涉及的应用个数
  appCount: number;
  // 创建时间
  createdTime: string;
  // 执行人
  executor: string;
  // 结束时间
  finishedTime?: string;
  // 发布单id
  id: string;
  // 运维单类型
  mode: string;
  // 发布单标题
  name: string;
  // 开始时间
  startedTime?: string;
  // 发布单状态
  state: string;
  // 发布单号
  timeSeriesId: string;
  // 发布单类型
  type: string;
  // 工作空间组id
  workspaceGroupId?: string;
  // Pod 数量
  podCount?: number;
  static names(): { [key: string]: string } {
    return {
      appCount: 'app_count',
      createdTime: 'created_time',
      executor: 'executor',
      finishedTime: 'finished_time',
      id: 'id',
      mode: 'mode',
      name: 'name',
      startedTime: 'started_time',
      state: 'state',
      timeSeriesId: 'time_series_id',
      type: 'type',
      workspaceGroupId: 'workspace_group_id',
      podCount: 'pod_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appCount: 'number',
      createdTime: 'string',
      executor: 'string',
      finishedTime: 'string',
      id: 'string',
      mode: 'string',
      name: 'string',
      startedTime: 'string',
      state: 'string',
      timeSeriesId: 'string',
      type: 'string',
      workspaceGroupId: 'string',
      podCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MasterClusterInfoForWorkspaces
export class MasterClusterInfoForWorkspaces extends $tea.Model {
  // master cluster info
  masterClusterInfo: MasterCluster;
  // workspace ids
  workspaceIds: string[];
  static names(): { [key: string]: string } {
    return {
      masterClusterInfo: 'master_cluster_info',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      masterClusterInfo: MasterCluster,
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Ingress 信息
export class IngressInfo extends $tea.Model {
  // 元信息
  meta: ContainerServiceObjectMeta;
  // 所属统一接入实例名称
  unifiedAccessInstanceName?: string;
  static names(): { [key: string]: string } {
    return {
      meta: 'meta',
      unifiedAccessInstanceName: 'unified_access_instance_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      meta: ContainerServiceObjectMeta,
      unifiedAccessInstanceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 添加antvipdomain请求
export class AntvipDomain extends $tea.Model {
  // 应用名称
  application: string;
  // 部署单元cell名称
  cell: string;
  // 健康检查端口，非必填项
  healthCheckDefaultPort?: number;
  // 健康检查类型，默认为TCP
  healthCheckType?: string;
  static names(): { [key: string]: string } {
    return {
      application: 'application',
      cell: 'cell',
      healthCheckDefaultPort: 'health_check_default_port',
      healthCheckType: 'health_check_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      application: 'string',
      cell: 'string',
      healthCheckDefaultPort: 'number',
      healthCheckType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// V1ReleasePlanSpec appService
export class ReleasePlanSpecAppService extends $tea.Model {
  // 依赖的应用服务名字列表
  dependencies: string[];
  // 应用服务名字
  name: string;
  // container service revision
  revision: string;
  static names(): { [key: string]: string } {
    return {
      dependencies: 'dependencies',
      name: 'name',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dependencies: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cluster info
export class ClusterInfo extends $tea.Model {
  // created time
  createdTime?: string;
  // env
  env?: string;
  // cluster is healthy or not
  isHealthy: boolean;
  // cluster name
  name: string;
  // cluster overview info
  overviewInfo: ClusterOverviewInfo;
  // region name
  regionName?: string;
  // 独占 or 共享
  type?: string;
  // version
  version?: string;
  // zone name
  zoneName?: string;
  // workspace名称[如果存在]。
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      createdTime: 'created_time',
      env: 'env',
      isHealthy: 'is_healthy',
      name: 'name',
      overviewInfo: 'overview_info',
      regionName: 'region_name',
      type: 'type',
      version: 'version',
      zoneName: 'zone_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdTime: 'string',
      env: 'string',
      isHealthy: 'boolean',
      name: 'string',
      overviewInfo: ClusterOverviewInfo,
      regionName: 'string',
      type: 'string',
      version: 'string',
      zoneName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 包含sidecar template表的主要元信息
export class SidecarTemplateMeta extends $tea.Model {
  // 名称
  sidecarName: string;
  // sidecar版本
  sidecarVersion: string;
  // 具体的模板信息
  template: string;
  // 工作空间
  workspaceId: string;
  // 工作空间组id
  workspaceGroupId: string;
  // 镜像地址
  image: string;
  // 保留扩展
  extension: string;
  // 基线所应用的scope范围
  scope: string;
  static names(): { [key: string]: string } {
    return {
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      template: 'template',
      workspaceId: 'workspace_id',
      workspaceGroupId: 'workspace_group_id',
      image: 'image',
      extension: 'extension',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sidecarName: 'string',
      sidecarVersion: 'string',
      template: 'string',
      workspaceId: 'string',
      workspaceGroupId: 'string',
      image: 'string',
      extension: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AKS集群cluster
export class Cluster extends $tea.Model {
  // 集群创建时间
  createdTime?: string;
  // env
  env: string;
  // 集群是否健康
  isHealthy: boolean;
  // 集群名称
  name: string;
  // region name
  // 
  regionName: string;
  // 独占
  type?: string;
  // 集群版本
  version: string;
  // 环境名称
  workspace: string;
  // 机房名称
  zoneName: string;
  static names(): { [key: string]: string } {
    return {
      createdTime: 'created_time',
      env: 'env',
      isHealthy: 'is_healthy',
      name: 'name',
      regionName: 'region_name',
      type: 'type',
      version: 'version',
      workspace: 'workspace',
      zoneName: 'zone_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdTime: 'string',
      env: 'string',
      isHealthy: 'boolean',
      name: 'string',
      regionName: 'string',
      type: 'string',
      version: 'string',
      workspace: 'string',
      zoneName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed namespace
export class FedNamespace extends $tea.Model {
  // fed namespace annotations
  annotations: Annotation[];
  // fed namespace clusters
  clusters: string[];
  // fed namespace cluster state map
  clusterStateMap: ClusterState[];
  // fed namespace labels
  labels: Label[];
  // fed namespace name
  name: string;
  // Fed CRD namespace
  namespace: string;
  // 创建时间
  createTimeStamp: string;
  // fed 资源的状态
  status?: string;
  // 导致 fed 资源处于该状态的原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      annotations: 'annotations',
      clusters: 'clusters',
      clusterStateMap: 'cluster_state_map',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      createTimeStamp: 'create_time_stamp',
      status: 'status',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annotations: { 'type': 'array', 'itemType': Annotation },
      clusters: { 'type': 'array', 'itemType': 'string' },
      clusterStateMap: { 'type': 'array', 'itemType': ClusterState },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      createTimeStamp: 'string',
      status: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用摘要信息
export class AppSimpleInfo extends $tea.Model {
  // 应用id
  appId: string;
  // 应用分组名字
  appInstanceGroupName: string;
  // 应用名字
  appName: string;
  // 执行者
  executor: string;
  // 结束时间
  finishTime: string;
  // 分组个数
  groupNum: number;
  // 分组策略
  groupStrategy: string;
  // id
  id: string;
  // 命名空间
  namespace?: string;
  // 操作类型
  operationType: string;
  // 发布版本号
  revision: string;
  // 回滚revision
  rollbackRevision?: string;
  // 是否可单独执行
  standaloneExecutable: boolean;
  // 开始时间
  startTime: string;
  // 应用状态
  state: string;
  // Pod 数量
  podCount?: number;
  // 回滚原因
  rollbackReason?: string;
  // 依赖的应用服务名
  dependContainerServiceNames?: string[];
  // 错误信息
  message?: string;
  // 发布模板名称
  deploymentTemplateName?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appInstanceGroupName: 'app_instance_group_name',
      appName: 'app_name',
      executor: 'executor',
      finishTime: 'finish_time',
      groupNum: 'group_num',
      groupStrategy: 'group_strategy',
      id: 'id',
      namespace: 'namespace',
      operationType: 'operation_type',
      revision: 'revision',
      rollbackRevision: 'rollback_revision',
      standaloneExecutable: 'standalone_executable',
      startTime: 'start_time',
      state: 'state',
      podCount: 'pod_count',
      rollbackReason: 'rollback_reason',
      dependContainerServiceNames: 'depend_container_service_names',
      message: 'message',
      deploymentTemplateName: 'deployment_template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appInstanceGroupName: 'string',
      appName: 'string',
      executor: 'string',
      finishTime: 'string',
      groupNum: 'number',
      groupStrategy: 'string',
      id: 'string',
      namespace: 'string',
      operationType: 'string',
      revision: 'string',
      rollbackRevision: 'string',
      standaloneExecutable: 'boolean',
      startTime: 'string',
      state: 'string',
      podCount: 'number',
      rollbackReason: 'string',
      dependContainerServiceNames: { 'type': 'array', 'itemType': 'string' },
      message: 'string',
      deploymentTemplateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用技术栈
export class TechStack extends $tea.Model {
  // 技术栈描述
  description: string;
  // 该字段为字符串类型Map，序列化为字符串用于存储扩展信息，e.g： 云原生下打包存放目录 /home/admin/release
  extendProperties: string;
  // 技术栈id
  id?: string;
  // 技术栈名称
  name: string;
  // 技术栈可见范围，全局可见|租户内可见
  scope: string;
  // 创建时间（UTC）
  utcCreated: string;
  // 最近修改时间（UTC）
  utcModified: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      extendProperties: 'extend_properties',
      id: 'id',
      name: 'name',
      scope: 'scope',
      utcCreated: 'utc_created',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      extendProperties: 'string',
      id: 'string',
      name: 'string',
      scope: 'string',
      utcCreated: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单|应用执行进度，按状态区分
export class ExecuteProgress extends $tea.Model {
  // 阻塞个数
  blocked: number;
  // 执行中个数
  executing: number;
  // 失败个数
  failed: number;
  // 执行对象ID
  id: string;
  // 初始化机器个数
  inited: number;
  // 执行对象状态
  state: string;
  // 成功个数
  success: number;
  // 总计
  total: number;
  // 等待中个数
  waiting: number;
  static names(): { [key: string]: string } {
    return {
      blocked: 'blocked',
      executing: 'executing',
      failed: 'failed',
      id: 'id',
      inited: 'inited',
      state: 'state',
      success: 'success',
      total: 'total',
      waiting: 'waiting',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blocked: 'number',
      executing: 'number',
      failed: 'number',
      id: 'string',
      inited: 'number',
      state: 'string',
      success: 'number',
      total: 'number',
      waiting: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 守夜人预案信息
export class EmergencyPlan extends $tea.Model {
  // 预案id
  id: string;
  // 预案名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FedConfigMapOverride 列表
export class FedConfigMapOverrideList extends $tea.Model {
  // fed configmap override list
  list: FedConfigmapOverride[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': FedConfigmapOverride },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性场景
export class ElasticScene extends $tea.Model {
  // 场景名
  name: string;
  // 弹性场景状态，有效值（VALID，INVALID）
  status: string;
  // 弹性场景ID
  id?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      status: 'status',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      status: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// the uid shard list.
export class UidShardList extends $tea.Model {
  // the uid shard list.
  data: UidShard[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': UidShard },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Region info
export class Region extends $tea.Model {
  // region id
  id: string;
  // region name
  name?: string;
  // workspace list
  workspaces?: Workspace[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      workspaces: { 'type': 'array', 'itemType': Workspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OB租户信息
export class OBTenant extends $tea.Model {
  // 租户描述
  description?: string;
  // 扩展属性，序列化后的JSON字符串
  extendProperties?: string;
  // 唯一标识
  id: string;
  // 租户名称
  name: string;
  // 租户类型（单库GZONE|分片库RZONE）：存放对应业务库
  type: string;
  // 租户对应uid分段，用于存放对应的业务分片库
  uids?: number[];
  // 工作空间组唯一标识
  workspaceGroupId: string;
  // 创建日期
  createdTime?: string;
  // 修改时间
  modifiedTime?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      extendProperties: 'extend_properties',
      id: 'id',
      name: 'name',
      type: 'type',
      uids: 'uids',
      workspaceGroupId: 'workspace_group_id',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      extendProperties: 'string',
      id: 'string',
      name: 'string',
      type: 'string',
      uids: { 'type': 'array', 'itemType': 'number' },
      workspaceGroupId: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维操作组
export class OpsGroup extends $tea.Model {
  // 运维操作组当前状态。取值列表： INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELED：已取消； CONFIRM_WAITING：待确认
  status?: string;
  // 包含在此运维操作组中的运维单元列表
  units?: OpsUnit[];
  // 运维任务进度列表
  progresses?: OpsGroupTaskProgress[];
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      units: 'units',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      units: { 'type': 'array', 'itemType': OpsUnit },
      progresses: { 'type': 'array', 'itemType': OpsGroupTaskProgress },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性信息
export class ElasticInfoView extends $tea.Model {
  // 全局弹性状态，有效值：NORMAL，ELASTIC
  status: string;
  // 弹性值
  elasticValues?: string[];
  // 是否压测
  press?: boolean;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      elasticValues: 'elastic_values',
      press: 'press',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      elasticValues: { 'type': 'array', 'itemType': 'string' },
      press: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar升级状态
export class SidecarReleaseStatus extends $tea.Model {
  // 运维单号
  orderNum: string;
  // 部署单元
  cellName: string;
  // 所处状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      orderNum: 'order_num',
      cellName: 'cell_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNum: 'string',
      cellName: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Service 信息
export class ServiceInfo extends $tea.Model {
  // 元信息
  meta: ContainerServiceObjectMeta;
  // Service 类型
  type: string;
  // 负载均衡服务的网络类型（internet | intranet | office | multidomain）
  loadBalancerAddressType?: string;
  // Service 状态
  status?: ServiceStatus;
  // service端口映射列表
  ports?: ServicePort[];
  static names(): { [key: string]: string } {
    return {
      meta: 'meta',
      type: 'type',
      loadBalancerAddressType: 'load_balancer_address_type',
      status: 'status',
      ports: 'ports',
    };
  }

  static types(): { [key: string]: any } {
    return {
      meta: ContainerServiceObjectMeta,
      type: 'string',
      loadBalancerAddressType: 'string',
      status: ServiceStatus,
      ports: { 'type': 'array', 'itemType': ServicePort },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元组的流量规则
export class UnitFlow extends $tea.Model {
  // 部署单元组的名称
  name: string;
  // 部署单元组的类型
  type: string;
  // 该部署单元组下的部署单元流量规则
  cellFlows: CellFlow[];
  // 该部署单元组下的部署单元 uid 分配
  uidRanges: UidRange[];
  // 是否弹性部署单元组
  elastic: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      cellFlows: 'cell_flows',
      uidRanges: 'uid_ranges',
      elastic: 'elastic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      cellFlows: { 'type': 'array', 'itemType': CellFlow },
      uidRanges: { 'type': 'array', 'itemType': UidRange },
      elastic: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布版本信息
export class ReleaseVersion extends $tea.Model {
  // 镜像
  image: string;
  static names(): { [key: string]: string } {
    return {
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用发布进度
export class AppDeployProgress extends $tea.Model {
  // 应用发布所需要组件列表
  componentList: string[];
  // 应用发布分组列表
  executeGroups: AppDeployGroup[];
  // 结束时间
  finishTime: string;
  // service id
  id: string;
  // 当前应用是否是一个回滚的应用
  isRollBack: boolean;
  // 发布进度pod状态统计数据
  podStateSummary: AppDeployPodStateSummary;
  // 后置任务列表
  postTasks: AppDeployTask[];
  // 前置任务列表
  preTasks: AppDeployTask[];
  // 当前服务关联的一个回滚服务的id，如果该值不为空则表示当前服务被回滚过
  rollBackServiceId?: string;
  // 开始时间
  startTime: string;
  // 当前发布状态
  state: string;
  // 容器服务命名空间
  namespace: string;
  // 错误信息
  message?: string;
  // task id
  taskId?: string;
  // 操作code
  actionCode?: string;
  static names(): { [key: string]: string } {
    return {
      componentList: 'component_list',
      executeGroups: 'execute_groups',
      finishTime: 'finish_time',
      id: 'id',
      isRollBack: 'is_roll_back',
      podStateSummary: 'pod_state_summary',
      postTasks: 'post_tasks',
      preTasks: 'pre_tasks',
      rollBackServiceId: 'roll_back_service_id',
      startTime: 'start_time',
      state: 'state',
      namespace: 'namespace',
      message: 'message',
      taskId: 'task_id',
      actionCode: 'action_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentList: { 'type': 'array', 'itemType': 'string' },
      executeGroups: { 'type': 'array', 'itemType': AppDeployGroup },
      finishTime: 'string',
      id: 'string',
      isRollBack: 'boolean',
      podStateSummary: AppDeployPodStateSummary,
      postTasks: { 'type': 'array', 'itemType': AppDeployTask },
      preTasks: { 'type': 'array', 'itemType': AppDeployTask },
      rollBackServiceId: 'string',
      startTime: 'string',
      state: 'string',
      namespace: 'string',
      message: 'string',
      taskId: 'string',
      actionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Spanner集群信息
export class SpannerClusterInfo extends $tea.Model {
  // 容器的CPU个数
  containerCpu: number;
  // 容器是否独占CPU
  containerCpuExclusive: boolean;
  // 容器所在物理机节点的标签
  containerDeviceType: string;
  // 容器的磁盘大小
  containerDisk: number;
  // 容器的内存大小(G)
  containerMem: number;
  // 容器网络
  containerNetwork: string;
  // 创建时间
  createdTime?: string;
  // 扩展属性，json字符串
  extendProperties?: string;
  // ID 
  id: string;
  // 修改时间
  modifiedTime?: string;
  // 集群名称
  name: string;
  // 集群的状态： 1 运行状态  2 维护状态
  status: number;
  // 集群单元信息
  unitInfos: SpannerClusterUnitInfo[];
  // 0 表示集群单元类型为容器
  unitType: number;
  // 已使用的端口
  usedPorts?: number[];
  // internet/intranet/multidomain/office
  addressType: string;
  static names(): { [key: string]: string } {
    return {
      containerCpu: 'container_cpu',
      containerCpuExclusive: 'container_cpu_exclusive',
      containerDeviceType: 'container_device_type',
      containerDisk: 'container_disk',
      containerMem: 'container_mem',
      containerNetwork: 'container_network',
      createdTime: 'created_time',
      extendProperties: 'extend_properties',
      id: 'id',
      modifiedTime: 'modified_time',
      name: 'name',
      status: 'status',
      unitInfos: 'unit_infos',
      unitType: 'unit_type',
      usedPorts: 'used_ports',
      addressType: 'address_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerCpu: 'number',
      containerCpuExclusive: 'boolean',
      containerDeviceType: 'string',
      containerDisk: 'number',
      containerMem: 'number',
      containerNetwork: 'string',
      createdTime: 'string',
      extendProperties: 'string',
      id: 'string',
      modifiedTime: 'string',
      name: 'string',
      status: 'number',
      unitInfos: { 'type': 'array', 'itemType': SpannerClusterUnitInfo },
      unitType: 'number',
      usedPorts: { 'type': 'array', 'itemType': 'number' },
      addressType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灰度发布参数
export class GrayReleaseConfig extends $tea.Model {
  // 加到流量上的灰度标签
  grayLabel: string;
  // 提供南北流量网关服务的类型
  provider: string;
  // 给流量添加灰度label的策略，可选byWeight或者byRule
  // 在byWeight模式下，会按照用户指定的比例，给进入的流量加上灰度标签
  // 在byRule模式下，会按照用户指定的规则（条件），给进入的流量加上灰度标签。
  labelApplyPolicy: string;
  // 给进入的流量添加灰度label的比例，仅当label_apply_policy为byWeight时生效
  weight?: number;
  // 给进入的流量添加灰度label的规则，仅当label_apply_policy为byRule时生效
  rule?: GrayLabelApplyRule;
  // 在各部署单元期望部署的pod个数，若应用服务当前不部署在其中的部署单元，则该不会在该部署单元上为应用进行部署
  scaleReplicas?: ReplicaCount[];
  static names(): { [key: string]: string } {
    return {
      grayLabel: 'gray_label',
      provider: 'provider',
      labelApplyPolicy: 'label_apply_policy',
      weight: 'weight',
      rule: 'rule',
      scaleReplicas: 'scale_replicas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      grayLabel: 'string',
      provider: 'string',
      labelApplyPolicy: 'string',
      weight: 'number',
      rule: GrayLabelApplyRule,
      scaleReplicas: { 'type': 'array', 'itemType': ReplicaCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cell info
export class CellInfo extends $tea.Model {
  // cell display name
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维容器服务分组依赖链
export class OpsContainerServiceChain extends $tea.Model {
  // 运维容器分组列表
  groups: OpsContainerServiceGroup[];
  static names(): { [key: string]: string } {
    return {
      groups: 'groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groups: { 'type': 'array', 'itemType': OpsContainerServiceGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// network info
export class NetworkInfo extends $tea.Model {
  // networt description
  description: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar运维机器分组信息
export class SidecarOpsMachineGroup extends $tea.Model {
  // 分组ID
  id: string;
  // 分组名称
  target?: string;
  // 状态
  status: string;
  // 扩展属性
  properties?: string;
  // 执行日志
  messages?: string;
  // sidecar 运维机器列表
  subTargets: SidecarOpsMachine[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      target: 'target',
      status: 'status',
      properties: 'properties',
      messages: 'messages',
      subTargets: 'sub_targets',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      target: 'string',
      status: 'string',
      properties: 'string',
      messages: 'string',
      subTargets: { 'type': 'array', 'itemType': SidecarOpsMachine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 负载均衡实例。
export class LoadBalancerInstance extends $tea.Model {
  // 负责均衡iaas id。
  iaasId: string;
  // 监听器。
  listeners: LoadBalancerListener[];
  // 负载均衡名称。
  name: string;
  // 负责均衡PAAS id。
  paasId?: string;
  // 负责均衡类型。
  type: string;
  // 负载均衡vip地址。
  vipAddresses?: string[];
  // 统一接入域名。
  domain: string;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      listeners: 'listeners',
      name: 'name',
      paasId: 'paas_id',
      type: 'type',
      vipAddresses: 'vip_addresses',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      listeners: { 'type': 'array', 'itemType': LoadBalancerListener },
      name: 'string',
      paasId: 'string',
      type: 'string',
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Pod Overview Info
export class PodOverviewInfo extends $tea.Model {
  // pod number
  podNumber?: number;
  // unhealthy pod number
  unhealthyPodNumber?: number;
  static names(): { [key: string]: string } {
    return {
      podNumber: 'pod_number',
      unhealthyPodNumber: 'unhealthy_pod_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      podNumber: 'number',
      unhealthyPodNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例监听配置（http/https）
export class UnifiedAccessInstanceListener extends $tea.Model {
  // CA证书ID。 若既上传CA证书又上传服务器证书，即采用双向认证。 若用户只上传服务器证书，即为单向认证。
  caCertificateId?: string;
  // 统一接入实例监听端口。 取值：1-65535。
  listenerPort: number;
  // 协议类型，目前支持http和https两种
  protocol: string;
  // 是否使用websocket连接方式
  websocketConnect: boolean;
  static names(): { [key: string]: string } {
    return {
      caCertificateId: 'ca_certificate_id',
      listenerPort: 'listener_port',
      protocol: 'protocol',
      websocketConnect: 'websocket_connect',
    };
  }

  static types(): { [key: string]: any } {
    return {
      caCertificateId: 'string',
      listenerPort: 'number',
      protocol: 'string',
      websocketConnect: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// node event
export class NodeEvent extends $tea.Model {
  // event count
  count: number;
  // event message
  message: string;
  // event modified time
  modifiedTime: string;
  // event reason
  reason: string;
  // event type
  type: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      message: 'message',
      modifiedTime: 'modified_time',
      reason: 'reason',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      message: 'string',
      modifiedTime: 'string',
      reason: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Linke解决方案返回结果数据
export class LinkeReleaseData extends $tea.Model {
  // Linke release ID
  releaseId: string;
  static names(): { [key: string]: string } {
    return {
      releaseId: 'release_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      releaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar运维任务
export class SidecarOperationTask extends $tea.Model {
  // 业务流水号
  bizId: string;
  // 操作人
  operator: string;
  // 名称
  title: string;
  // sidecar运维内容上下文信息
  context: SidecarOperationTaskContext;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      operator: 'operator',
      title: 'title',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      operator: 'string',
      title: 'string',
      context: SidecarOperationTaskContext,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群状态信息
export class ClusterStatus extends $tea.Model {
  // 集群名称
  name: string;
  // 集群资源概览
  overviewInfo: ClusterOverviewInfo;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      overviewInfo: 'overview_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      overviewInfo: ClusterOverviewInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构应用发布结果
export class TenantAppReleaseData extends $tea.Model {
  // 是否成功
  success: boolean;
  // 机构名称
  tenant: string;
  // 发布单ID
  releaseId: string;
  // 环境
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      tenant: 'tenant',
      releaseId: 'release_id',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      tenant: 'string',
      releaseId: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
export class LocalObjectReference extends $tea.Model {
  // name
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性规则
export class ElasticRuleView extends $tea.Model {
  // ID
  id?: number;
  // 弹性类型，有效值：SERVICE，MSGBROKER
  type: string;
  // 弹性值
  name: string;
  // 关联应用
  appName: string;
  // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
  status: string;
  // 操作人
  operator: string;
  // 场景 ID
  sceneId: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      type: 'type',
      name: 'name',
      appName: 'app_name',
      status: 'status',
      operator: 'operator',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      type: 'string',
      name: 'string',
      appName: 'string',
      status: 'string',
      operator: 'string',
      sceneId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 弹性子规则
export class ElasticSubRuleView extends $tea.Model {
  // 弹性子规则ID
  id: number;
  // 所属APP
  appName: string;
  // 关联的弹性规则ID
  elasticRuleId: number;
  // 父节点
  parentId?: number;
  // 值
  value: string;
  // 是否使用默认eid，默认 false
  useDefaultEid?: boolean;
  // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
  status: string;
  // 规则类型
  type: string;
  // 场景ID
  sceneId: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      appName: 'app_name',
      elasticRuleId: 'elastic_rule_id',
      parentId: 'parent_id',
      value: 'value',
      useDefaultEid: 'use_default_eid',
      status: 'status',
      type: 'type',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      appName: 'string',
      elasticRuleId: 'number',
      parentId: 'number',
      value: 'string',
      useDefaultEid: 'boolean',
      status: 'string',
      type: 'string',
      sceneId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 规则推送结果
export class PushRuleResult extends $tea.Model {
  // site名字
  name?: string;
  // site描述
  desc?: string;
  // 推送成功的zone
  succeedList?: string[];
  // 推送失败的zone
  failedList?: string[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      desc: 'desc',
      succeedList: 'succeed_list',
      failedList: 'failed_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      desc: 'string',
      succeedList: { 'type': 'array', 'itemType': 'string' },
      failedList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器应用服务基础信息。
export class ContainerServiceBasicInfo extends $tea.Model {
  // 镜像构建id。
  appBuild?: string;
  // 应用id
  appId: string;
  // 应用名称。
  appName: string;
  // 创建时间。
  createdTime: string;
  // 当前最新镜像。
  currentImage?: string;
  // 发布中的版本。
  deployingRevision?: string;
  // 发布部署状态。
  deploymentStatus?: string;
  // container service描述
  description?: string;
  // 当前应用服务草稿对应的版本号。
  draftedRevision?: string;
  // 草稿更新时间。
  draftedTime?: string;
  // 最近一次发布的版本。
  lastDeployedRevision?: string;
  // 最近一次发布的结束时间。
  lastDeployEndTime?: string;
  // 最近一次关联的发布单。
  lastDeployPlanId?: string;
  // 最近一次发布的开始时间。
  lastDeployStartTime?: string;
  // 容器服务元数据状态。
  metadataStatus: string;
  // 创建时间。
  modifiedTime: string;
  // 容器应用服务名称。
  name: string;
  // 所属命名空间名称。
  namespace: string;
  // 负责人。
  owner: string;
  // 容器服务的Pod列表。
  podList: PodInfo[];
  // 更新中pod数量
  processingCount?: string;
  // replicas数量
  replicas: string;
  // runding pod数量
  runningCount?: string;
  // 运行时版本。
  runtimeRevision?: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 容器服务Service列表。
  serviceList?: LoadBalancerService[];
  // message信息
  messageDetail?: string;
  static names(): { [key: string]: string } {
    return {
      appBuild: 'app_build',
      appId: 'app_id',
      appName: 'app_name',
      createdTime: 'created_time',
      currentImage: 'current_image',
      deployingRevision: 'deploying_revision',
      deploymentStatus: 'deployment_status',
      description: 'description',
      draftedRevision: 'drafted_revision',
      draftedTime: 'drafted_time',
      lastDeployedRevision: 'last_deployed_revision',
      lastDeployEndTime: 'last_deploy_end_time',
      lastDeployPlanId: 'last_deploy_plan_id',
      lastDeployStartTime: 'last_deploy_start_time',
      metadataStatus: 'metadata_status',
      modifiedTime: 'modified_time',
      name: 'name',
      namespace: 'namespace',
      owner: 'owner',
      podList: 'pod_list',
      processingCount: 'processing_count',
      replicas: 'replicas',
      runningCount: 'running_count',
      runtimeRevision: 'runtime_revision',
      workspaceGroup: 'workspace_group',
      serviceList: 'service_list',
      messageDetail: 'message_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appBuild: 'string',
      appId: 'string',
      appName: 'string',
      createdTime: 'string',
      currentImage: 'string',
      deployingRevision: 'string',
      deploymentStatus: 'string',
      description: 'string',
      draftedRevision: 'string',
      draftedTime: 'string',
      lastDeployedRevision: 'string',
      lastDeployEndTime: 'string',
      lastDeployPlanId: 'string',
      lastDeployStartTime: 'string',
      metadataStatus: 'string',
      modifiedTime: 'string',
      name: 'string',
      namespace: 'string',
      owner: 'string',
      podList: { 'type': 'array', 'itemType': PodInfo },
      processingCount: 'string',
      replicas: 'string',
      runningCount: 'string',
      runtimeRevision: 'string',
      workspaceGroup: 'string',
      serviceList: { 'type': 'array', 'itemType': LoadBalancerService },
      messageDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 系统url
export class SystemURL extends $tea.Model {
  // 平台名称
  platformName: string;
  // url
  url: string;
  // 上线问配置
  context?: string;
  static names(): { [key: string]: string } {
    return {
      platformName: 'platform_name',
      url: 'url',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformName: 'string',
      url: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed image pull secret 
export class FedImagePullSecret extends $tea.Model {
  // annotations
  annotations?: string[];
  // image pull secret registry account info
  data: RegistryAccout;
  // labels
  labels?: string[];
  // name
  name: string;
  // namesapce
  namespace: string;
  // cell overrides
  overrides: FedImagePullSecretOverrideList;
  // workspace group name
  workspaceGroupName: string;
  // cell list
  cells: string[];
  static names(): { [key: string]: string } {
    return {
      annotations: 'annotations',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      workspaceGroupName: 'workspace_group_name',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annotations: { 'type': 'array', 'itemType': 'string' },
      data: RegistryAccout,
      labels: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      namespace: 'string',
      overrides: FedImagePullSecretOverrideList,
      workspaceGroupName: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询pod列表的可选参数
export class ListPodOption extends $tea.Model {
  // 根据pod number列举pod的方式：RANGE为范围查询；ARRAY为指定pod number查询；ALL查询全量
  type: string;
  // [type为RANGE时生效]范围查询的左边界（包含）
  podNumerFrom?: number;
  // [type为RANGE时生效]范围查询的右边界（不包含）
  podNumberTo?: number;
  // [type为ARRAY时生效]指定pod number的查询
  podNumbers?: number[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      podNumerFrom: 'pod_numer_from',
      podNumberTo: 'pod_number_to',
      podNumbers: 'pod_numbers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      podNumerFrom: 'number',
      podNumberTo: 'number',
      podNumbers: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OAM应用配置
export class OAMApplicationConfiguration extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class PushSite extends $tea.Model {
  // 是否当前站点
  current: boolean;
  // 站点描述
  description?: string;
  // 站点唯一标识
  id: number;
  // 接口类型，可选（RPC，REST）
  interfaceType: string;
  // 站点 DRM endpoints
  interfaceUrls?: string[];
  // 站点名称
  name: string;
  // 站点部署单元
  siteCells?: SiteCell[];
  // 站点类型，可选（MAIN，ISOMERISM）
  siteType: string;
  static names(): { [key: string]: string } {
    return {
      current: 'current',
      description: 'description',
      id: 'id',
      interfaceType: 'interface_type',
      interfaceUrls: 'interface_urls',
      name: 'name',
      siteCells: 'site_cells',
      siteType: 'site_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      current: 'boolean',
      description: 'string',
      id: 'number',
      interfaceType: 'string',
      interfaceUrls: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      siteCells: { 'type': 'array', 'itemType': SiteCell },
      siteType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// fed configmap struct
export class FedConfigmap extends $tea.Model {
  // fed configmap annotations
  annotations: Annotation[];
  // Fed资源集群Cell状态
  cellStatus?: ClusteCellStatus[];
  // fed clusters
  clusters: string[];
  // 创建时间
  createTimeStamp: string;
  // fed configmap data
  data: ConfigMapData[];
  // fed configmap labels
  labels: Label[];
  // fed configmap name
  name: string;
  // fed configmap namespace
  namespace: string;
  // fed configmap override
  overrides: FedConfigmapOverride[];
  // 原因
  reason?: string;
  // propagation状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      annotations: 'annotations',
      cellStatus: 'cell_status',
      clusters: 'clusters',
      createTimeStamp: 'create_time_stamp',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      reason: 'reason',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annotations: { 'type': 'array', 'itemType': Annotation },
      cellStatus: { 'type': 'array', 'itemType': ClusteCellStatus },
      clusters: { 'type': 'array', 'itemType': 'string' },
      createTimeStamp: 'string',
      data: { 'type': 'array', 'itemType': ConfigMapData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: { 'type': 'array', 'itemType': FedConfigmapOverride },
      reason: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一接入实例信息
export class UnifiedAccessInstanceInfo extends $tea.Model {
  // 统一接入实例创建的时间
  createdTime?: string;
  // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
  spannerCluster: string;
  // 关联的应用服务信息
  unifiedAccessInstanceContainerServiceInfos?: UnifiedAccessInstanceContainerServiceInfo[];
  // https协议配置
  unifiedAccessInstanceHttpsEntry?: HttpsEntry;
  // http协议配置
  unifiedAccessInstanceHttpEntry: HttpEntry;
  // 统一接入实例ID
  unifiedAccessInstanceId: string;
  // 本地集群详细信息
  unifiedAccessInstanceLocalDetailInfos: UnifiedAccessInstanceLocalDetailInfo[];
  // 统一接入实例详细信息显示，包含错误状态信息等
  unifiedAccessInstanceMessageDetails?: string;
  // 统一接入实例名称
  unifiedAccessInstanceName: string;
  // 统一接入实例状态描述：创建中、创建成功、创建失败
  unifiedAccessInstanceStatus: string;
  // 统一接入实例网络类型，内网（intranet），公网（internet）
  unifiedAccessInstanceType: string;
  // custom模式下，用户自定义entryId以及entryVip信息
  entrySettings?: EntrySettings;
  static names(): { [key: string]: string } {
    return {
      createdTime: 'created_time',
      spannerCluster: 'spanner_cluster',
      unifiedAccessInstanceContainerServiceInfos: 'unified_access_instance_container_service_infos',
      unifiedAccessInstanceHttpsEntry: 'unified_access_instance_https_entry',
      unifiedAccessInstanceHttpEntry: 'unified_access_instance_http_entry',
      unifiedAccessInstanceId: 'unified_access_instance_id',
      unifiedAccessInstanceLocalDetailInfos: 'unified_access_instance_local_detail_infos',
      unifiedAccessInstanceMessageDetails: 'unified_access_instance_message_details',
      unifiedAccessInstanceName: 'unified_access_instance_name',
      unifiedAccessInstanceStatus: 'unified_access_instance_status',
      unifiedAccessInstanceType: 'unified_access_instance_type',
      entrySettings: 'entry_settings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdTime: 'string',
      spannerCluster: 'string',
      unifiedAccessInstanceContainerServiceInfos: { 'type': 'array', 'itemType': UnifiedAccessInstanceContainerServiceInfo },
      unifiedAccessInstanceHttpsEntry: HttpsEntry,
      unifiedAccessInstanceHttpEntry: HttpEntry,
      unifiedAccessInstanceId: 'string',
      unifiedAccessInstanceLocalDetailInfos: { 'type': 'array', 'itemType': UnifiedAccessInstanceLocalDetailInfo },
      unifiedAccessInstanceMessageDetails: 'string',
      unifiedAccessInstanceName: 'string',
      unifiedAccessInstanceStatus: 'string',
      unifiedAccessInstanceType: 'string',
      entrySettings: EntrySettings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// zone list of workspace
export class ZoneOfWorkspace extends $tea.Model {
  // workspace id
  workspaceId: string;
  // workspace name
  workspaceName: string;
  // zone list of workspace
  zones: ZoneInfo[];
  // region name
  regionName: string;
  // region id
  regionId: string;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
      zones: 'zones',
      regionName: 'region_name',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'string',
      workspaceName: 'string',
      zones: { 'type': 'array', 'itemType': ZoneInfo },
      regionName: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  applicationName: string;
  // 应用服务名称
  appServiceName: string;
  // 部署单元名称列表。 n代表第n个应用的名称，n从1开始，最大100。每个部署单元名称最大60个UTF-8字符。如果要输入多个部署单元，使用如下形式：cell_ids.1=RZ01A&cell_ids.2=RZ02B
  cellIds: string[];
  // 工作空间名称
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      appServiceName: 'app_service_name',
      cellIds: 'cell_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      appServiceName: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  applicationName: string;
  // 应用服务名称
  appServiceName: string;
  // 部署单元名称列表。 n代表第n个应用的名称，n从1开始，最大100。每个部署单元名称最大60个UTF-8字符。如果要输入多个部署单元，使用如下形式：cell_ids.1=RZ01A&cell_ids.2=RZ02B
  cellIds: string[];
  // 工作空间名称
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      appServiceName: 'app_service_name',
      cellIds: 'cell_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      appServiceName: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 执行运维操作的目标应用列表,可通过services指定应用下待运维的应用服务实例. 如果要指定多个应用, 使用如下形式: applications.1.name=app1&applications.2.name=app2&applications.2.services.1.name=app2-sv1&applications.2.services.1.workspace=shdev
  applications?: Application[];
  // 是否自动执行运维单, 默认为false.当设置为true是,创建完成并初始化成功后会自动执行该运维单.
  autoExecution?: boolean;
  // 执行运维操作的目标机器id列表。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: string[];
  // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
  opsAction: string;
  // 执行ops_action所需要的参数。
  opsActionParams?: OpsParam[];
  // 应用运维的维度，有两种取值：APPLICATION和MACHINE。设置为APPLICATION，表示在非应用服务环境下该应用执行该应用运维操作；设置为MACHINE，表示应用下的一台或多台机器执行该应用运维操作。
  opsDemension: string;
  // 应用运维单标题
  title: string;
  // 工作空间组名称
  workspaceGroup: string;
  // Map<String, String> 序列化后字符串
  context?: string;
  // 机器分组策略，默认采用快速分组
  // QUICK         -     快速分组
  // ALL_ONE    - 共分一组
  // EACH_ONE - 每台一组
  // 
  groupStrategy?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applications: 'applications',
      autoExecution: 'auto_execution',
      computers: 'computers',
      opsAction: 'ops_action',
      opsActionParams: 'ops_action_params',
      opsDemension: 'ops_demension',
      title: 'title',
      workspaceGroup: 'workspace_group',
      context: 'context',
      groupStrategy: 'group_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applications: { 'type': 'array', 'itemType': Application },
      autoExecution: 'boolean',
      computers: { 'type': 'array', 'itemType': 'string' },
      opsAction: 'string',
      opsActionParams: { 'type': 'array', 'itemType': OpsParam },
      opsDemension: 'string',
      title: 'string',
      workspaceGroup: 'string',
      context: 'string',
      groupStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建完成的运维单id
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运维单id
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 此运维操作中所有被操作的应用详情，以操作链的形式体现
  applicationChains: OpsApplicationChain[];
  // 运维操作执行者
  executor: string;
  // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
  opsAction: string;
  // 应用运维的维度，有两种取值：APPLICATION和MACHINE。设置为APPLICATION，表示对整个应用都执行该应用运维操作；设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
  opsDimension: string;
  // 部署单状态。取值列表： INITING：初始化中； INIT_FAILED：初始化失败； INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELING：取消中； CANCELED：已取消
  status: string;
  // 应用运维单标题
  title: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationChains: 'application_chains',
      executor: 'executor',
      opsAction: 'ops_action',
      opsDimension: 'ops_dimension',
      status: 'status',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationChains: { 'type': 'array', 'itemType': OpsApplicationChain },
      executor: 'string',
      opsAction: 'string',
      opsDimension: 'string',
      status: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待查询的应用名称，必须是运维单中包含的应用
  applicationName: string;
  // 运维单id
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 此应用下所有计算容器分组运维状态详情
  groups?: OpsGroup[];
  // 应用当前运维状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groups: 'groups',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单或运维单time_series_id
  operationId: string;
  // 操作人，lks1.23.0才支持
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运维单id
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运维单id
  operationId: string;
  // 取消原因。长度不超过100个UTF-8字符
  reason: string;
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      reason: 'reason',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      reason: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运维单id
  operationId: string;
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单id
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作执行者
  executor: string;
  // 
  //                   发布单状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；CANCELING：取消中；CANCELED：已取消
  //                 
  status: string;
  // 标题
  title: string;
  // 此发布部署操作中所有被操作的应用详情，以操作链的形式体现
  applicationChains: OpsApplicationChain[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executor: 'executor',
      status: 'status',
      title: 'title',
      applicationChains: 'application_chains',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executor: 'string',
      status: 'string',
      title: 'string',
      applicationChains: { 'type': 'array', 'itemType': OpsApplicationChain },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单id
  operationId: string;
  // 待查询的应用名称，必须是部署单中包含的应用
  applicationName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 
  //                   应用当前部署状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败
  //                 
  status: string;
  // 
  //                   应用发布版本
  //                 
  version: string;
  // 此应用下所有计算容器分组部署状态详情
  groups: OpsGroup[];
  // 应用前置任务
  preTasks: OpsPrePostTask[];
  // 应用后置任务
  postTasks: OpsPrePostTask[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      version: 'version',
      groups: 'groups',
      preTasks: 'pre_tasks',
      postTasks: 'post_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      version: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      preTasks: { 'type': 'array', 'itemType': OpsPrePostTask },
      postTasks: { 'type': 'array', 'itemType': OpsPrePostTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentRollbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单id
  operationId: string;
  // 待查询的应用名称，必须是部署单中包含的应用
  applicationName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentRollbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 
  //                   应用当前部署状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败
  //                 
  status: string;
  // 应用回滚版本
  version: string;
  // 此应用下所有计算容器分组部署状态详情
  groups: OpsGroup[];
  // 应用前置任务
  preTasks: OpsPrePostTask[];
  // 应用后置任务
  postTasks: OpsPrePostTask[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      version: 'version',
      groups: 'groups',
      preTasks: 'pre_tasks',
      postTasks: 'post_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      version: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      preTasks: { 'type': 'array', 'itemType': OpsPrePostTask },
      postTasks: { 'type': 'array', 'itemType': OpsPrePostTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeploymentRollbackableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单id
  operationId: string;
  // 待查询的应用名称，必须是部署单中包含的应用
  applicationName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeploymentRollbackableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可回滚的版本
  versions: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      versions: 'versions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      versions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackDeploymentApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单id
  operationId: string;
  // 待回滚的应用名称，必须是部署单中包含的应用
  applicationName: string;
  // 应用的回滚版本，如果不指定，默认回滚到最近一次发布成功的版本
  versionNo?: string;
  // 回滚时的分组策略，取值为：
  //                              QUICK：快速分组；
  //                              EACH_ONE：每台一组；
  //                              UNIT：按逻辑单元分组；
  //                              CELL：按部署单元分组；
  //                              默认为QUICK
  //                 
  groupStrategy?: string;
  // 分组数，默认为3
  groupCount?: number;
  // 回滚原因
  reason: string;
  // 操作人
  operatorName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      applicationName: 'application_name',
      versionNo: 'version_no',
      groupStrategy: 'group_strategy',
      groupCount: 'group_count',
      reason: 'reason',
      operatorName: 'operator_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      applicationName: 'string',
      versionNo: 'string',
      groupStrategy: 'string',
      groupCount: 'number',
      reason: 'string',
      operatorName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackDeploymentApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushFlowRouteclientRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 流量类型
  // NORMAL：正常流量
  // PRESS：压测流量
  flowType: string;
  // 异构机房列表
  isomerismSites?: string[];
  // 操作人
  operatorName: string;
  // 推送类型
  // DRM：DRM推送
  // JMX：JMX推送
  // SPANNER：SPANNER推送
  pushType: string;
  // 工作空间
  workspaceGroup: string;
  // 部署单元组的流量规则
  unitFlows: UnitFlow[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      flowType: 'flow_type',
      isomerismSites: 'isomerism_sites',
      operatorName: 'operator_name',
      pushType: 'push_type',
      workspaceGroup: 'workspace_group',
      unitFlows: 'unit_flows',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      flowType: 'string',
      isomerismSites: { 'type': 'array', 'itemType': 'string' },
      operatorName: 'string',
      pushType: 'string',
      workspaceGroup: 'string',
      unitFlows: { 'type': 'array', 'itemType': UnitFlow },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushFlowRouteclientResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // k8s resource labels
  labels?: Label[];
  // FedNamespace名称
  name: string;
  // workspaceGroup名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labels: 'labels',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fed namespace info
  data?: FedNamespace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: FedNamespace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // fed namespace labels
  labels?: Label[];
  // Fed Namespace name
  name: string;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labels: 'labels',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fed namespace data
  data?: FedNamespace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: FedNamespace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // fed namespace name
  name: string;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fed namespace info
  data?: FedNamespace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: FedNamespace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // fed namespace name
  name: string;
  // workspaceGroup Name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除操作成功或失败
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationConfigmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // Cell name list
  cells: string[];
  // FedConfigMap data
  data: ConfigMapData[];
  // FedConfigMap labels
  labels?: Label[];
  // FedConfigMap name
  name: string;
  // Federation ConfigMap namespace
  namespace: string;
  // FedCofigmap Cluster Overrides
  overrides?: FedConfigMapOverrideList;
  // workspace group 名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      data: { 'type': 'array', 'itemType': ConfigMapData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: FedConfigMapOverrideList,
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationConfigmapResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedConfigMap 数据
  configmap?: FedConfigmap;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configmap: 'configmap',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configmap: FedConfigmap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationConfigmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cell list
  cells: string[];
  // FedConfigMap data
  data: ConfigMapData[];
  // FedConfigMap labels
  labels?: Label[];
  // FedConfigMap name
  name: string;
  // FedConfigMap命名空间
  namespace: string;
  // FedConfigMap overrides
  overrides?: FedConfigMapOverrideList;
  // workspaceGroup名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      data: { 'type': 'array', 'itemType': ConfigMapData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: FedConfigMapOverrideList,
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationConfigmapResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fedconfigmap data
  configmap?: FedConfigmap;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configmap: 'configmap',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configmap: FedConfigmap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationConfigmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedConfigmap name
  name: string;
  // 所属命名空间名称。
  namespace: string;
  // workspaceGroup 名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationConfigmapResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedConfigMap获取结果
  configmap?: FedConfigmap;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configmap: 'configmap',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configmap: FedConfigmap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationConfigmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedConfigMap name
  name: string;
  // workspaceGroupName
  workspaceGroupName: string;
  // 所属命名空间名称。
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationConfigmapResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除结果
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationConfigmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // List labelSelector
  labelSelector?: string;
  // aaaa
  namespace: string;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labelSelector: 'label_selector',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labelSelector: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationConfigmapResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedConfigMap List
  configmaps?: FedConfigmap[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configmaps: 'configmaps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configmaps: { 'type': 'array', 'itemType': FedConfigmap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // k8s resource label selector
  labelSelector?: string;
  // workspace group名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labelSelector: 'label_selector',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labelSelector: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fed namespace list
  data?: FedNamespace[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': FedNamespace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属应用名称
  appName?: string;
  // 容器服务部署状态。取值可以由多个部署状态组成一个JSON数组，不同状态之间用绊脚逗号(,)隔开，取值范围：
  // . WAITING_FOR_DEPLOY: 待发布
  // . INITIALIZING: 初始化中
  // . INITIALIZED: 初始化完成
  // . INITIALIZE_FAILED: 初始化失败
  // . CONFIRM_WAITING: 待确认
  // . CONFIRMED: 已确认
  // . EXECUTING: 发布中
  // . PAUSED: 暂停
  // . CANCELING: 取消中
  // . CANCELED: 已取消
  // . ROLLBACKING: 回滚中
  // . ROLLBACK_PAUSED: 回滚暂停
  // . ROLLBACKED: 已回滚
  // . SUCCEEDED: 发布完成
  // . FAILED: 发布失败
  // . DELETING: 删除中
  // . DELETE_FAILED: 删除失败
  deploymentStatus?: string[];
  // 容器服务元数据状态。取值可以由多个元数据状态组成一个JSON数组，不同状态之间用半角逗号（,）隔开。状态取值范围：
  // . DRAFTED: 草稿
  // . CREATING: 创建中
  // . CREATED: 已创建
  // . UPDATING: 更新中
  // . UPDATED: 已更新
  // . DELETING: 删除中
  // . DELETED: 已删除
  // . DEPLOYED: 已发布
  // . CREATE_FAILED: 创建失败
  // . UPDATE_FAILED: 更新失败
  // . DELETE_FAILED: 删除失败
  metadataStatus?: string[];
  // 容器应用服务名称，支持使用通配符*进行模糊搜索。
  name?: string;
  // 当前命名空间名称。
  namespace: string;
  // 实例状态列表的页码。起始值：1。默认值：1 。
  pageNumber?: number;
  // 分页查询时设置的每页行数。最大值：100。默认值：10。
  pageSize?: number;
  // 当前工作空间组名称。
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      deploymentStatus: 'deployment_status',
      metadataStatus: 'metadata_status',
      name: 'name',
      namespace: 'namespace',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      deploymentStatus: { 'type': 'array', 'itemType': 'string' },
      metadataStatus: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      namespace: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器应用服务列表。
  containerServiceList?: ContainerServiceBasicInfo[];
  // 实例列表的页码。
  pageNumber?: number;
  // 输入时设置的每页行数。
  pageSize?: number;
  // 查询到的容器应用服务总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      containerServiceList: 'container_service_list',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      containerServiceList: { 'type': 'array', 'itemType': ContainerServiceBasicInfo },
      pageNumber: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterMasterclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group name
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterMasterclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // master clusters of different zones
  data?: MasterClustersOfZone[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': MasterClustersOfZone },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitMulticlusterClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // federation namespace
  fedNamespace?: string;
  // master cluster info 
  masterClusterInfo: MasterCluster[];
  // workspace group name
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fedNamespace: 'fed_namespace',
      masterClusterInfo: 'master_cluster_info',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fedNamespace: 'string',
      masterClusterInfo: { 'type': 'array', 'itemType': MasterCluster },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitMulticlusterClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // import cluster success or false
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group name
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // minion cluster infos
  data?: ClusterInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ClusterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContainerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 最近一次草稿版本。
  draftedRevision?: string;
  // 最近一次草稿时间
  draftedTime?: string;
  // 容器应用服务名称。
  name: string;
  // 当前命名空间名称。
  namespace: string;
  // 提交人。
  operator: string;
  // 所属工作空间组名称
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      draftedRevision: 'drafted_revision',
      draftedTime: 'drafted_time',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      draftedRevision: 'string',
      draftedTime: 'string',
      name: 'string',
      namespace: 'string',
      operator: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContainerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务列表。
  containerServices: SontainerServicesList;
  // 是否自动执行，默认false
  isAutoExecute?: boolean;
  // 所属命名空间
  namespace: string;
  // 默认CLOUD_NATIVE_GROUP_RELEASE
  opsType?: string;
  // operator调用专用字段，ReleasePlan唯一标识
  releasePlanUniqueId?: string;
  // tenant 名字，operator调用专用字段
  tenantName?: string;
  // 发布单名称。
  title: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 审批人账号id
  assigneeIds?: string[];
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  // 灰度发布的参数，仅当ops_type为GRAY_RELEASE时生效
  grayReleaseConfig?: GrayReleaseConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServices: 'container_services',
      isAutoExecute: 'is_auto_execute',
      namespace: 'namespace',
      opsType: 'ops_type',
      releasePlanUniqueId: 'release_plan_unique_id',
      tenantName: 'tenant_name',
      title: 'title',
      workspaceGroup: 'workspace_group',
      assigneeIds: 'assignee_ids',
      operator: 'operator',
      grayReleaseConfig: 'gray_release_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServices: SontainerServicesList,
      isAutoExecute: 'boolean',
      namespace: 'string',
      opsType: 'string',
      releasePlanUniqueId: 'string',
      tenantName: 'string',
      title: 'string',
      workspaceGroup: 'string',
      assigneeIds: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
      grayReleaseConfig: GrayReleaseConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建完成的部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationSecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cell name list
  cells: string[];
  // FedSecret data
  // 
  data: SecretData[];
  // FedSecret labels
  // 
  labels?: Label[];
  // FedSecret name
  // 
  name: string;
  // Federation Secret namespace
  namespace: string;
  // FedSecret Cluster Overrides
  // 
  overrides?: FedSecretOverrideList;
  // Fed Secret type
  type: string;
  // workspace group 名称
  // 
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      type: 'type',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      data: { 'type': 'array', 'itemType': SecretData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: FedSecretOverrideList,
      type: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationSecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedSecret 数据
  // 
  secret?: FedSecret;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secret: FedSecret,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationSecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedSecretname
  name: string;
  // 所属命名空间名称。
  namespace: string;
  // workspaceGroup 名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationSecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedSecret获取结果
  // 
  secret?: FedSecret;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secret: FedSecret,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationSecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedSecret name
  // 
  name: string;
  // workspaceGroupName
  workspaceGroupName: string;
  // 所属命名空间名称。
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationSecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除结果
  // 
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationSecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cell list
  cells: string[];
  // FedSecret data
  // 
  data: SecretData[];
  // FedSecret labels
  // 
  labels?: Label[];
  // FedSecret name
  // 
  name: string;
  // FedSecret命名空间
  // 
  namespace: string;
  // FedSecret overrides
  // 
  overrides?: FedSecretOverrideList;
  // workspaceGroup名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
      data: 'data',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      data: { 'type': 'array', 'itemType': SecretData },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: FedSecretOverrideList,
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFederationSecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fedsecret data
  // 
  secret?: FedSecret;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secret: FedSecret,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationSecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // List labelSelector
  // 
  labelSelector?: string;
  // antcloud
  namespace: string;
  // workspace group name
  // 
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labelSelector: 'label_selector',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labelSelector: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationSecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FedSecret List
  secretList?: FedSecret[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secretList: 'secret_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secretList: { 'type': 'array', 'itemType': FedSecret },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务名称。
  name: string;
  // 命名空间名称。
  namespace: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务版本信息。
  revision?: ContainerServiceRevision;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: ContainerServiceRevision,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器应用服务名称。
  name: string;
  // 版本号。
  revision: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // fed namespace
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      revision: 'revision',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      revision: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务版本信息。
  revision?: ContainerServiceRevision;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: ContainerServiceRevision,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 取值范围： . WAITING_FOR_DEPLOY: 待发布 . INITIALIZING: 初始化中 . INITIALIZED: 初始化完成 . INITIALIZE_FAILED: 初始化失败 . CONFIRM_WAITING: 待确认 . CONFIRMED: 已确认 . EXECUTING: 发布中 . PAUSED: 暂停 . CANCELING: 取消中 . CANCELED: 已取消 . ROLLBACKING: 回滚中 . ROLLBACK_PAUSED: 回滚暂停 . ROLLBACKED: 已回滚 . SUCCEEDED: 发布完成 . FAILED: 发布失败 . DELETING: 删除中 . DELETE_FAILED: 删除失败
  deploymentStatus?: string[];
  // 状态取值范围： . DRAFTED: 草稿 . CREATING: 创建中 . CREATED: 已创建 . UPDATING: 更新中 . UPDATED: 已更新 . DELETING: 删除中 . DELETED: 已删除 . DEPLOYED: 已发布 . CREATE_FAILED: 创建失败 . UPDATE_FAILED: 更新失败 . DELETE_FAILED: 删除失败
  metadataStatus?: string[];
  // 容器应用服务名称。
  name: string;
  // 命名空间名称。
  namespace: string;
  // 容器服务版本列表的页码。起始值：1。默认值：1 。
  pageNumber?: number;
  // 分页查询时设置的每页行数。最大值：100。默认值：10。
  pageSize?: number;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 可以根据版本号模糊搜索，lks1.25.0开始支持
  revision?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      deploymentStatus: 'deployment_status',
      metadataStatus: 'metadata_status',
      name: 'name',
      namespace: 'namespace',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      workspaceGroup: 'workspace_group',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      deploymentStatus: { 'type': 'array', 'itemType': 'string' },
      metadataStatus: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      namespace: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      workspaceGroup: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本列表的页码。
  pageNumber?: number;
  // 输入时设置的每页行数。
  pageSize?: number;
  // 容器服务版本列表。
  revisionList?: ContainerServiceRevision[];
  // 查询到的容器应用版本总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      revisionList: 'revision_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      revisionList: { 'type': 'array', 'itemType': ContainerServiceRevision },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 容器应用服务名称。
  name: string;
  // 容器应用服务版本号。
  revision: string;
  // 版本备注信息。
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      name: 'name',
      revision: 'revision',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      name: 'string',
      revision: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 更新镜像的完整地址
  image: string;
  // 容器应用服务名称。
  name: string;
  // 容器服务所在命名空间
  namespace: string;
  // 操作人。
  operator?: string;
  // 容器应用服务版本。
  revision: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      image: 'image',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      revision: 'revision',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      image: 'string',
      name: 'string',
      namespace: 'string',
      operator: 'string',
      revision: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的容器应用服务版本号。
  revision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceReplicasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 扩缩容replica详情
  fixedReplicaElasticConfig: FixedReplicaElasticConfig;
  // 容器应用服务名称。
  name: string;
  // namespace
  namespace: string;
  // 操作人
  operator?: string;
  // 容器应用服务版本号。
  revision: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fixedReplicaElasticConfig: 'fixed_replica_elastic_config',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      revision: 'revision',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fixedReplicaElasticConfig: FixedReplicaElasticConfig,
      name: 'string',
      namespace: 'string',
      operator: 'string',
      revision: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceReplicasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建完成的部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属应用名称。
  appName: string;
  // 必填，且不能重复。保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
  clientToken?: string;
  // 容器服务配置。
  config: ContainerServiceConfig;
  // 容器服务描述
  description?: string;
  // 容器服务名称。
  name: string;
  // 所属命名空间名称。
  namespace: string;
  // 操作人iam账号名，通过pop调用时该参数无效。
  operator: string;
  // owner_id（废弃）
  ownerId?: string;
  // owner_name（废弃）
  ownerName?: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 应用appid
  appId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      clientToken: 'client_token',
      config: 'config',
      description: 'description',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      ownerId: 'owner_id',
      ownerName: 'owner_name',
      workspaceGroup: 'workspace_group',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      clientToken: 'string',
      config: ContainerServiceConfig,
      description: 'string',
      name: 'string',
      namespace: 'string',
      operator: 'string',
      ownerId: 'string',
      ownerName: 'string',
      workspaceGroup: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务版本号。
  revision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app id
  appId: string;
  // 所属应用名称。
  appName: string;
  // 必填：保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
  clientToken?: string;
  // 容器服务配置。
  // 
  config: ContainerServiceConfig;
  // 应用服务名称
  name: string;
  // 命名空间
  namespace: string;
  // 操作人账号
  operator?: string;
  // 应用负责人id
  ownerId?: string;
  // 应用负责人名称
  ownerName?: string;
  // 工作环境组
  workspaceGroup: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      appName: 'app_name',
      clientToken: 'client_token',
      config: 'config',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      ownerId: 'owner_id',
      ownerName: 'owner_name',
      workspaceGroup: 'workspace_group',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      appName: 'string',
      clientToken: 'string',
      config: ContainerServiceConfig,
      name: 'string',
      namespace: 'string',
      operator: 'string',
      ownerId: 'string',
      ownerName: 'string',
      workspaceGroup: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // container service版本号
  revision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistContainerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 所属命名空间名称。
  namespace: string;
  // 容器服务名称。
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistContainerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务是否存在。
  // 取值：true | false
  exist?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      exist: 'exist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      exist: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterBasicinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterBasicinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell infos
  cellInfos?: CellInfo[];
  // created time
  createdTime?: string;
  // cluster display name
  displayName?: string;
  // network info
  networkInfo?: NetworkInfo;
  // region info
  regionInfo?: RegionInfo;
  // secured group infos
  securedGroupInfos?: SecuredGroupInfo[];
  // cluster status
  // 
  status?: string;
  // zone info
  zoneInfo?: ZoneInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellInfos: 'cell_infos',
      createdTime: 'created_time',
      displayName: 'display_name',
      networkInfo: 'network_info',
      regionInfo: 'region_info',
      securedGroupInfos: 'secured_group_infos',
      status: 'status',
      zoneInfo: 'zone_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellInfos: { 'type': 'array', 'itemType': CellInfo },
      createdTime: 'string',
      displayName: 'string',
      networkInfo: NetworkInfo,
      regionInfo: RegionInfo,
      securedGroupInfos: { 'type': 'array', 'itemType': SecuredGroupInfo },
      status: 'string',
      zoneInfo: ZoneInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterOverviewinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterOverviewinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cpu
  limitedCpu?: number;
  // cpu unit
  limitedCpuUnit?: string;
  // memory
  limitedMemory?: number;
  // memory unit
  limitedMemoryUnit?: string;
  // pod overview info
  podOverviewInfo?: PodOverviewInfo;
  // total node number
  totalNodeNum?: string;
  // unhealthy node num
  unHealthyNodeNum?: string;
  // used cpu
  usedCpu?: number;
  // used cpu unit
  usedCpuUnit?: string;
  // used memory
  usedMemory?: number;
  // used memory unit
  usedMemoryUnit?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      limitedCpu: 'limited_cpu',
      limitedCpuUnit: 'limited_cpu_unit',
      limitedMemory: 'limited_memory',
      limitedMemoryUnit: 'limited_memory_unit',
      podOverviewInfo: 'pod_overview_info',
      totalNodeNum: 'total_node_num',
      unHealthyNodeNum: 'un_healthy_node_num',
      usedCpu: 'used_cpu',
      usedCpuUnit: 'used_cpu_unit',
      usedMemory: 'used_memory',
      usedMemoryUnit: 'used_memory_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      limitedCpu: 'number',
      limitedCpuUnit: 'string',
      limitedMemory: 'number',
      limitedMemoryUnit: 'string',
      podOverviewInfo: PodOverviewInfo,
      totalNodeNum: 'string',
      unHealthyNodeNum: 'string',
      usedCpu: 'number',
      usedCpuUnit: 'string',
      usedMemory: 'number',
      usedMemoryUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境。
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部署单元列表。
  cellList?: CellInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellList: 'cell_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellList: { 'type': 'array', 'itemType': CellInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterPodoverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  // node name
  nodeName: string;
  // workspace group name
  workspaceGroupName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      nodeName: 'node_name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      nodeName: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterPodoverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pod detail infos
  data?: PodOverviewInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: PodOverviewInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodeinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node infos of specific cluster
  data?: NodeInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': NodeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateClusterNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // namespace labels
  labels: Label[];
  // name
  name: string;
  // tenant id
  tenantId: string;
  // tenant name
  tenantName: string;
  // workspace group id
  workspaceGroupId: string;
  // workspace group name
  workspaceGroupName: string;
  // cluster name to create namespace in
  clusterName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      labels: 'labels',
      name: 'name',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      workspaceGroupId: 'workspace_group_id',
      workspaceGroupName: 'workspace_group_name',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      tenantId: 'string',
      tenantName: 'string',
      workspaceGroupId: 'string',
      workspaceGroupName: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateClusterNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // is create namespace succeed
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // tenant id
  tenantId: string;
  // tenant name
  tenantName: string;
  // workspace group id
  workspaceGroupId: string;
  // workspace group name
  workspaceGroupName: string;
  // cluster name
  clusterName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      workspaceGroupId: 'workspace_group_id',
      workspaceGroupName: 'workspace_group_name',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      tenantName: 'string',
      workspaceGroupId: 'string',
      workspaceGroupName: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // namespace detail infos
  data?: NamespaceDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': NamespaceDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteClusterNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  // name of namespace
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteClusterNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // is delete namespace success
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterNodeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  // node name
  nodeName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      nodeName: 'node_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      nodeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetClusterNodeinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node detail info
  data?: NodeInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: NodeInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationImagepullsecretRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cells
  cells: string[];
  // labels
  labels?: Label[];
  // image pull secret name
  name: string;
  // image pull secret namespace
  namespace: string;
  // fed image pull secret list
  overrides: FedImagePullSecretOverrideList;
  // registry account
  registryAccount: RegistryAccout;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
      labels: 'labels',
      name: 'name',
      namespace: 'namespace',
      overrides: 'overrides',
      registryAccount: 'registry_account',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      labels: { 'type': 'array', 'itemType': Label },
      name: 'string',
      namespace: 'string',
      overrides: FedImagePullSecretOverrideList,
      registryAccount: RegistryAccout,
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationImagepullsecretResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // image pull secret
  secret?: FedSecret;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secret: FedSecret,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodepodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  // node name
  nodeName: string;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      nodeName: 'node_name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      nodeName: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodepodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pod infos
  data?: PodDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': PodDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodeeventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name
  clusterName: string;
  // node name
  nodeName: string;
  // workspace group name
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      nodeName: 'node_name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      nodeName: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterNodeeventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node events
  data?: NodeEvent[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': NodeEvent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  // 
  appName?: string;
  // 发布单创建起始时间
  // 
  creationTimeFrom?: string;
  // 发布单创建截止时间
  // 
  creationTimeTo?: string;
  // 当前页码，从1开始
  currentPage: number;
  // 发布单名称前缀
  name?: string;
  // 运维单类型：REBOOT,ONLINE,OFFLINE
  mode?: string;
  // 分页大小
  pageSize: number;
  // 发布单id列表
  // 
  planIds?: string[];
  // 发布单状态列表
  stateList?: string[];
  // 发布单号
  // 
  timeSeriesId?: string;
  // 发布单类型列表， e.g: 分组发布|重启
  // 
  types: string[];
  // 工作空间组名称
  // 
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
      currentPage: 'current_page',
      name: 'name',
      mode: 'mode',
      pageSize: 'page_size',
      planIds: 'plan_ids',
      stateList: 'state_list',
      timeSeriesId: 'time_series_id',
      types: 'types',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
      currentPage: 'number',
      name: 'string',
      mode: 'string',
      pageSize: 'number',
      planIds: { 'type': 'array', 'itemType': 'string' },
      stateList: { 'type': 'array', 'itemType': 'string' },
      timeSeriesId: 'string',
      types: { 'type': 'array', 'itemType': 'string' },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  currentPage?: number;
  // 发布单摘要信息列表
  list?: PlanSimpleView[];
  // 分页大小
  pageSize?: number;
  // 发布单列表起始下标
  startIndex?: number;
  // 总条数
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      list: 'list',
      pageSize: 'page_size',
      startIndex: 'start_index',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      list: { 'type': 'array', 'itemType': PlanSimpleView },
      pageSize: 'number',
      startIndex: 'number',
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanStatesummaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组名称
  // 
  workspaceGroup: string;
  // 发布单类型列表
  // 
  types: string[];
  // 发布单号
  // 
  timeSeriesId?: string;
  // 发布单状态列表
  // 
  stateList?: string[];
  // 发布单id列表
  // 
  planIds?: string[];
  // 发布单名称前缀
  // 
  name?: string;
  // 分页大小
  // 
  pageSize: number;
  // 当前页码，从1开始
  // 
  currentPage: number;
  // 发布单创建起始时间
  creationTimeFrom?: string;
  // 发布单创建截止时间
  // 
  creationTimeTo?: string;
  // 应用名称
  // 
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      types: 'types',
      timeSeriesId: 'time_series_id',
      stateList: 'state_list',
      planIds: 'plan_ids',
      name: 'name',
      pageSize: 'page_size',
      currentPage: 'current_page',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      types: { 'type': 'array', 'itemType': 'string' },
      timeSeriesId: 'string',
      stateList: { 'type': 'array', 'itemType': 'string' },
      planIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      pageSize: 'number',
      currentPage: 'number',
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanStatesummaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单状态汇总数据
  data?: LdcPlanStateCount[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': LdcPlanStateCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单id
  timeSeriesId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      timeSeriesId: 'time_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      timeSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单包含的应用数
  appCount?: number;
  // 应用信息列表
  appInfos?: AppSimpleInfo[];
  // 执行人
  executor?: string;
  // 发布结束时间
  finishTime?: string;
  // 应用分组概要信息列表
  groupCollectionList?: AppGroupSimpleViewList[];
  // 发布单id
  id?: string;
  // 错误信息
  messageDetail?: string;
  // 运维单类型
  // 
  mode?: string;
  // 发布单标题
  name?: string;
  // 备注信息
  remark?: string;
  // 发布开始时间
  startTime?: string;
  // 发布单状态
  // 
  state?: string;
  // 发布单号
  timeSeriesId?: string;
  // 发布单类型
  type?: string;
  // pod数量
  podCount?: number;
  // 审批状态：AGREE-同意，REJECTED-拒绝，CANCELED-取消
  approvalStatus?: string;
  // 审批详情url
  approvalUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appCount: 'app_count',
      appInfos: 'app_infos',
      executor: 'executor',
      finishTime: 'finish_time',
      groupCollectionList: 'group_collection_list',
      id: 'id',
      messageDetail: 'message_detail',
      mode: 'mode',
      name: 'name',
      remark: 'remark',
      startTime: 'start_time',
      state: 'state',
      timeSeriesId: 'time_series_id',
      type: 'type',
      podCount: 'pod_count',
      approvalStatus: 'approval_status',
      approvalUrl: 'approval_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appCount: 'number',
      appInfos: { 'type': 'array', 'itemType': AppSimpleInfo },
      executor: 'string',
      finishTime: 'string',
      groupCollectionList: { 'type': 'array', 'itemType': AppGroupSimpleViewList },
      id: 'string',
      messageDetail: 'string',
      mode: 'string',
      name: 'string',
      remark: 'string',
      startTime: 'string',
      state: 'string',
      timeSeriesId: 'string',
      type: 'string',
      podCount: 'number',
      approvalStatus: 'string',
      approvalUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackTechstackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackTechstackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前租户内可见的技术栈分类：包括公共可见以及租户自定义分类
  list?: TechStack[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': TechStack },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackNativetechstackversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 技术栈名称。
  // 原则上允许用户定义同名自定义技术栈（e.g,用户创建和全局同名的技术栈SOFA），此时优先获取用户自定义技术栈下技术栈版本；
  techStack: string;
  // 当前页码， 默认值为1
  currentPage?: number;
  // 一页获取个数，默认值10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      techStack: 'tech_stack',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      techStack: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackNativetechstackversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总个数
  totalCount?: number;
  // 云原生技术栈版本列表
  list?: NativeTechStackVersion[];
  // 当前页码
  currentPage?: number;
  // 一页包含个数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      list: 'list',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      list: { 'type': 'array', 'itemType': NativeTechStackVersion },
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceNativebpversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名称
  name: string;
  // 容器服务所在命名空间
  namespace: string;
  // 云原生技术栈版本
  nativeBuildPackVersion: string;
  // 操作人
  operator: string;
  // 环境名称
  workspaceGroup: string;
  // 容器服务版本
  revision: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      nativeBuildPackVersion: 'native_build_pack_version',
      operator: 'operator',
      workspaceGroup: 'workspace_group',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      nativeBuildPackVersion: 'string',
      operator: 'string',
      workspaceGroup: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceNativebpversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的容器应用服务版本号
  revision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      revision: 'revision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      revision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadContainerserviceDockerfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名称
  name: string;
  // 应用包地址，可以为相对目录，或者远程可访问存储地址.
  // 用于组装Dockerfile模板中对应的应用包获取地址
  packageUrl: string;
  // 环境名称
  workspaceGroup: string;
  // 容器服务所在namespace
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      packageUrl: 'package_url',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      packageUrl: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadContainerserviceDockerfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Dockerfile指令列表
  commands?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commands: 'commands',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commands: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackNativetechstackversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ce4456_jdk8_tengine6
  displayVersion: string;
  // 版本描述
  description?: string;
  // 完整的镜像地址
  fromImage: string;
  // 所属技术栈大类
  techStack: string;
  // 技术栈大类对应的id，如不填写，后台默认根据名称校验所属技术栈大类
  techStackId?: string;
  // 指定该版本可见范围：
  // PUBLIC - 全站点各个租户都可见；
  // TENANT - 仅创建改版本对应的租户内可见
  scope: string;
  // 扩展的Dockerfile指令。
  // 用于在FromImage的基础上扩展Dockerfile指令
  extCommands?: string[];
  // 扩展属性 - 表现为Map<String,String>序列化后的字符串
  extendProperties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayVersion: 'display_version',
      description: 'description',
      fromImage: 'from_image',
      techStack: 'tech_stack',
      techStackId: 'tech_stack_id',
      scope: 'scope',
      extCommands: 'ext_commands',
      extendProperties: 'extend_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayVersion: 'string',
      description: 'string',
      fromImage: 'string',
      techStack: 'string',
      techStackId: 'string',
      scope: 'string',
      extCommands: { 'type': 'array', 'itemType': 'string' },
      extendProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackNativetechstackversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建后生成的对象信息
  data?: NativeTechStackVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: NativeTechStackVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group name
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones of workspace group
  data?: ZoneOfWorkspace[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ZoneOfWorkspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecOpsplanAppopstaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作类型
  controlType: string;
  // pipeline stage 名字
  actionCode: string;
  // 任务id
  id: string;
  // operator名字
  operator?: string;
  // [huanyu场景使用]，当cancel_plan_flag为true, control_type=CANCEL且action_code=CLOUD_NATIVE_DEPLOY时，整个运维单将被取消
  cancelPlanFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      controlType: 'control_type',
      actionCode: 'action_code',
      id: 'id',
      operator: 'operator',
      cancelPlanFlag: 'cancel_plan_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      controlType: 'string',
      actionCode: 'string',
      id: 'string',
      operator: 'string',
      cancelPlanFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecOpsplanAppopstaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanProgressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单序列号
  timeSeriesId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      timeSeriesId: 'time_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      timeSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanProgressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用执行进度
  appExecuteProgress?: ExecuteProgress[];
  // 发布单进度
  executeProgress?: ExecuteProgress;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appExecuteProgress: 'app_execute_progress',
      executeProgress: 'execute_progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appExecuteProgress: { 'type': 'array', 'itemType': ExecuteProgress },
      executeProgress: ExecuteProgress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanAppprogressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用id
  id: string;
  // 运维单id
  timeSeriesId?: string;
  // 批次stage的id
  stageId?: string;
  // [huanyu场景使用] 是否需要返回affected_cell_pods
  needExportCellPods?: boolean;
  // [huanyu场景使用] 返回给opscloud的变更对象类型。如果为NONE，则不返回变更对象信息
  opscloudChangeTargetType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      timeSeriesId: 'time_series_id',
      stageId: 'stage_id',
      needExportCellPods: 'need_export_cell_pods',
      opscloudChangeTargetType: 'opscloud_change_target_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      timeSeriesId: 'string',
      stageId: 'string',
      needExportCellPods: 'boolean',
      opscloudChangeTargetType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanAppprogressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用发布进度详情
  appDeployProgress?: AppDeployProgress;
  // [huanyu场景使用] 查询涉及的部署单元及pod详情列表
  affectedCellPods?: AppDeployCell[];
  // [huanyu场景使用] json格式的变更对象信息列表
  opscloudChangeTargetJsonStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appDeployProgress: 'app_deploy_progress',
      affectedCellPods: 'affected_cell_pods',
      opscloudChangeTargetJsonStr: 'opscloud_change_target_json_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appDeployProgress: AppDeployProgress,
      affectedCellPods: { 'type': 'array', 'itemType': AppDeployCell },
      opscloudChangeTargetJsonStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerservicePodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务名称
  containerServiceName: string;
  // namespace
  namespace: string;
  // 工作空间组名称。
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerservicePodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pod信息列表
  podList?: PodInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      podList: 'pod_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      podList: { 'type': 'array', 'itemType': PodInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceKubeeventsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceKubeeventsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // mock
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPodEventsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名称
  cluster: string;
  // Pod名称
  name: string;
  // 所属命名空间名称
  namespace: string;
  // 所属环境名称
  workspaceGroup: string;
  // pod uid
  uid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cluster: 'cluster',
      name: 'name',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cluster: 'string',
      name: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPodEventsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Pod事件列表
  events?: KubeEvent[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      events: 'events',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      events: { 'type': 'array', 'itemType': KubeEvent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPodContainersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境名称
  workspaceGroup: string;
  // 所属集群名称
  cluster: string;
  // 所属工作空间名称
  namespace: string;
  // Pod名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      cluster: 'cluster',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      cluster: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPodContainersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Pod容器列表
  containers?: ContainerInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      containers: 'containers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      containers: { 'type': 'array', 'itemType': ContainerInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // container service name
  containerServiceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserviceCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell list
  cellList?: CellInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellList: 'cell_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellList: { 'type': 'array', 'itemType': CellInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属idc
  datacenter?: string;
  // 默认全局域
  defaultGzone?: string;
  // 逻辑单元名称
  name: string;
  // 逻辑单元类型
  type: string;
  // 所属环境名称。
  workspaceGroup: string;
  // 操作人。
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      datacenter: 'datacenter',
      defaultGzone: 'default_gzone',
      name: 'name',
      type: 'type',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      datacenter: 'string',
      defaultGzone: 'string',
      name: 'string',
      type: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境名称
  workspaceGroup: string;
  // cell group查询前缀
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 逻辑单元列表
  cellGroupList?: CellGroup[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellGroupList: 'cell_group_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellGroupList: { 'type': 'array', 'itemType': CellGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellgroupDisasterinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 灾备信息。
  disasterInfo: DisasterInfo[];
  // 逻辑单元名称。
  name: string;
  // 所属环境名称。
  workspaceGroup: string;
  // 操作人。
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      disasterInfo: 'disaster_info',
      name: 'name',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      disasterInfo: { 'type': 'array', 'itemType': DisasterInfo },
      name: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellgroupDisasterinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCellgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境名称
  workspaceGroup: string;
  // 逻辑单元名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCellgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元名称前缀
  name?: string;
  // 环境名称
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部署单元列表
  cells?: Cell[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cells: { 'type': 'array', 'itemType': Cell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属逻辑单元名称[单元化模式特有]。
  cellGroup?: string;
  // 蓝绿着色信息[单元化模式特有]。
  color?: string;
  // 部署单元标识。
  identity: string;
  // 是否灰度[单元化模式特有]。
  isGray?: boolean;
  // 部署单元名称。
  name: string;
  // 部署单元类型[单元化模式特有]。
  type?: string;
  // 权重[单元化模式特有]。
  weight?: number;
  // 所属环境名称。
  workspaceGroup: string;
  // 所属机房。
  zone: string;
  // 所属工作空间名称。
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cellGroup: 'cell_group',
      color: 'color',
      identity: 'identity',
      isGray: 'is_gray',
      name: 'name',
      type: 'type',
      weight: 'weight',
      workspaceGroup: 'workspace_group',
      zone: 'zone',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cellGroup: 'string',
      color: 'string',
      identity: 'string',
      isGray: 'boolean',
      name: 'string',
      type: 'string',
      weight: 'number',
      workspaceGroup: 'string',
      zone: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元名称。
  name: string;
  // 所属环境名称。
  workspaceGroup: string;
  // 所属工作空间名称。
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroup: 'workspace_group',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroup: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeletePodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境名称。
  workspaceGroup: string;
  // 命名空间名称。
  namespace: string;
  // 容器应用服务名称。
  containerService?: string;
  // 集群名称。
  cluster: string;
  // pod名称。
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      containerService: 'container_service',
      cluster: 'cluster',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      containerService: 'string',
      cluster: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeletePodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupTopologyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境(WorkspaceGroup)名称。
  name: string;
  // 地域
  region: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupTopologyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境逻辑单元信息。
  cellGroups?: CellGroup[];
  // 环境(WorkspaceGroup)名称。
  name?: string;
  // 环境机房信息。
  zones?: ZoneInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellGroups: 'cell_groups',
      name: 'name',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellGroups: { 'type': 'array', 'itemType': CellGroup },
      name: 'string',
      zones: { 'type': 'array', 'itemType': ZoneInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowCellweightRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元组
  cellGroup: string;
  // 操作人
  operator: string;
  // 是否压测流量，默认 false
  press?: boolean;
  // 部署单元权重信息
  weightInfoList: CellWeightInfoList;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cellGroup: 'cell_group',
      operator: 'operator',
      press: 'press',
      weightInfoList: 'weight_info_list',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cellGroup: 'string',
      operator: 'string',
      press: 'boolean',
      weightInfoList: CellWeightInfoList,
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowCellweightResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowUidrangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元组
  cellGroup: string;
  // 是否灰度流量（默认false）
  gray?: boolean;
  // 操作人
  operator: string;
  // 是否压测流量（默认 false）
  press?: boolean;
  // uid 范围
  uidRanges: UidShardList;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cellGroup: 'cell_group',
      gray: 'gray',
      operator: 'operator',
      press: 'press',
      uidRanges: 'uid_ranges',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cellGroup: 'string',
      gray: 'boolean',
      operator: 'string',
      press: 'boolean',
      uidRanges: UidShardList,
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowUidrangeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableFlowElasticuidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹出的 UID 信息
  popOutUids: PopOutUid[];
  // 是否压测流量（默认 false）
  press?: boolean;
  // 是否灰度流量（默认 false）
  gray?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      popOutUids: 'pop_out_uids',
      press: 'press',
      gray: 'gray',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      popOutUids: { 'type': 'array', 'itemType': PopOutUid },
      press: 'boolean',
      gray: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableFlowElasticuidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableFlowElasticuidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹回的 UID 分片
  resumeUids: number[];
  // 是否压测（默认 false）
  press?: boolean;
  // 是否灰度（默认 false）
  gray?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      resumeUids: 'resume_uids',
      press: 'press',
      gray: 'gray',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      resumeUids: { 'type': 'array', 'itemType': 'number' },
      press: 'boolean',
      gray: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableFlowElasticuidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportFlowRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 参与规则生成的应用列表
  apps?: string[];
  // 是否灰度（默认 false）
  gray?: boolean;
  // 操作人
  operator: string;
  // 规则类型，支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
  ruleType: string;
  // 工作空间组
  workspaceGroup: string;
  // 是否进行规则校验，默认 false
  check?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apps: 'apps',
      gray: 'gray',
      operator: 'operator',
      ruleType: 'rule_type',
      workspaceGroup: 'workspace_group',
      check: 'check',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
      gray: 'boolean',
      operator: 'string',
      ruleType: 'string',
      workspaceGroup: 'string',
      check: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportFlowRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流量规则的 JSON 字符串
  rule?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rule: 'rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rule: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushFlowRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 包含系统列表
  apps?: string[];
  // 是否灰度（默认 false）
  gray?: boolean;
  // 操作人
  operator: string;
  // 站点是否全局推送
  pushAll?: boolean;
  // 规则类型,支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
  ruleType: string;
  // 规则文本
  ruleValue: string;
  // 全量的targets信息
  targets?: string[];
  // 工作空间组
  workspaceGroup: string;
  // 是否覆盖其他应用的规则，默认 false
  override?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apps: 'apps',
      gray: 'gray',
      operator: 'operator',
      pushAll: 'push_all',
      ruleType: 'rule_type',
      ruleValue: 'rule_value',
      targets: 'targets',
      workspaceGroup: 'workspace_group',
      override: 'override',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
      gray: 'boolean',
      operator: 'string',
      pushAll: 'boolean',
      ruleType: 'string',
      ruleValue: 'string',
      targets: { 'type': 'array', 'itemType': 'string' },
      workspaceGroup: 'string',
      override: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushFlowRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否灰度环境
  gray?: boolean;
  // 推送结果
  ruleResultList?: PushRuleResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      gray: 'gray',
      ruleResultList: 'rule_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      gray: 'boolean',
      ruleResultList: { 'type': 'array', 'itemType': PushRuleResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFlowElasticruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属应用名称
  appName: string;
  // MSGBROKER 需要填写。
  // 弹性规则消息类型事件码。
  // 如果包含所有eventCode，可以用英文星号"*"表示。
  eventCodes?: string[];
  // 弹性规则方法名称，RPC类型需要填写。
  // 如果包含所有方法，则填写英文星号"*"
  methods?: string[];
  // 操作人
  operator: string;
  // 弹性规则类型，包括：APP、RPC、MSGBROKER，ANTQ
  ruleType: string;
  // 适用的弹性场景名称
  sceneName: string;
  // 弹性规则服务名称。
  // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
  // APP：对应应用名，例如：cif。
  // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
  serviceName: string;
  // 弹性规则状态，有效值：VALID（线上生效）、PRESS（仅压测生效）、INVALID（无效状态）
  status: string;
  // MSGBROKER 和 ANTQ 需要填写。
  // 弹性规则消息类型topic。
  // 如果包含所有topic，可以用英文星号"*"表示。
  topic?: string;
  // 是否使用默认EID（默认 false）
  useDefaultEid?: boolean;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      eventCodes: 'event_codes',
      methods: 'methods',
      operator: 'operator',
      ruleType: 'rule_type',
      sceneName: 'scene_name',
      serviceName: 'service_name',
      status: 'status',
      topic: 'topic',
      useDefaultEid: 'use_default_eid',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      eventCodes: { 'type': 'array', 'itemType': 'string' },
      methods: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
      ruleType: 'string',
      sceneName: 'string',
      serviceName: 'string',
      status: 'string',
      topic: 'string',
      useDefaultEid: 'boolean',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFlowElasticruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 弹性规则 ID
  id: number;
  // 操作人
  operator: string;
  // 弹性规则服务名称。
  // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
  // APP：对应应用名，例如：cif。
  // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
  serviceName: string;
  // 弹性规则状态，可选值 VALID("线上生效")，PRESS("仅压测生效")，INVALID("无效状态");
  status: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      operator: 'operator',
      serviceName: 'service_name',
      status: 'status',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      operator: 'string',
      serviceName: 'string',
      status: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 弹性规则 ID
  id: number;
  // 操作人
  operator: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      operator: 'operator',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      operator: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFlowElasticsubruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 消息eventCode, MSGBROKER必填
  eventCode?: string;
  // 操作人
  operator: string;
  // 父规则ID
  parentId: number;
  // 规则值, RPC必填
  rpcMethod?: string;
  // 所属规则类型，可选值：RPC, MSGBROKER, ANTQ, APP
  ruleType: string;
  // VALID("线上生效"), PRESS("仅压测生效"), INVALID("无效状态");
  status: string;
  // 消息topic, MSGBROKER和ANTQ必填
  topic?: string;
  // 是否使用默认eid, RPC必填
  useDefaultEid?: boolean;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      eventCode: 'event_code',
      operator: 'operator',
      parentId: 'parent_id',
      rpcMethod: 'rpc_method',
      ruleType: 'rule_type',
      status: 'status',
      topic: 'topic',
      useDefaultEid: 'use_default_eid',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      eventCode: 'string',
      operator: 'string',
      parentId: 'number',
      rpcMethod: 'string',
      ruleType: 'string',
      status: 'string',
      topic: 'string',
      useDefaultEid: 'boolean',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFlowElasticsubruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticsubruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 规则 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticsubruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticrulestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 命名空间
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹性规则ID列表
  elasticRuleIds: number[];
  // VALID("线上生效"), PRESS("仅压测生效"),  INVALID("无效状态");
  newStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      elasticRuleIds: 'elastic_rule_ids',
      newStatus: 'new_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      elasticRuleIds: { 'type': 'array', 'itemType': 'number' },
      newStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticrulestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteFlowElasticruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹性规则ID列表
  elasticRuleIds: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      elasticRuleIds: 'elastic_rule_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      elasticRuleIds: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteFlowElasticruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowElasticsceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 场景名
  name: string;
  // 场景状态，可选值（VALID，INVALID）
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowElasticsceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticsceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹性场景 ID
  id: number;
  // 弹性场景名
  name: string;
  // 弹性场景状态，可选值（VALID，INVALID）
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      id: 'id',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      id: 'number',
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowElasticsceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticsceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 弹性规则场景 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowElasticsceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetFlowElasticvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 弹性值，对应zdal里的弹性位，比如52，53等
  elasticValues: string[];
  // 是否灰度（默认 false）
  gray?: boolean;
  // 操作人
  operator: string;
  // 是否弹性（默认 false）
  press?: boolean;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      elasticValues: 'elastic_values',
      gray: 'gray',
      operator: 'operator',
      press: 'press',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      elasticValues: { 'type': 'array', 'itemType': 'string' },
      gray: 'boolean',
      operator: 'string',
      press: 'boolean',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetFlowElasticvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableFlowElasticvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 是否弹性（默认 false）
  press?: boolean;
  // 是否灰度（默认 false）
  gray?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      press: 'press',
      gray: 'gray',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      press: 'boolean',
      gray: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableFlowElasticvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowSiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 描述
  description?: string;
  // 推送接口类型，可选值（RPC，REST）
  interfaceType: string;
  // 推送接口 url
  interfaceUrls: string[];
  // 站点名
  name: string;
  // 操作人
  operator: string;
  // 站点类型，可选值 MAIN（主站点）， ISOMERISM（异构机房）
  siteType: string;
  // opssla uniqueId
  uniqueId?: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      interfaceType: 'interface_type',
      interfaceUrls: 'interface_urls',
      name: 'name',
      operator: 'operator',
      siteType: 'site_type',
      uniqueId: 'unique_id',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      interfaceType: 'string',
      interfaceUrls: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      operator: 'string',
      siteType: 'string',
      uniqueId: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowSiteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowSiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 站点 ID
  id: number;
  // 站点名
  name: string;
  // 描述
  description?: string;
  // 站点类型，可选值（MAIN， ISOMERISM）
  siteType: string;
  // 接口类型（RPC，REST）
  interfaceType: string;
  // 推送接口url
  interfaceUrls: string[];
  // opssla uniqueId
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      id: 'id',
      name: 'name',
      description: 'description',
      siteType: 'site_type',
      interfaceType: 'interface_type',
      interfaceUrls: 'interface_urls',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      id: 'number',
      name: 'string',
      description: 'string',
      siteType: 'string',
      interfaceType: 'string',
      interfaceUrls: { 'type': 'array', 'itemType': 'string' },
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFlowSiteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowSiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人
  operator: string;
  // 站点 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      operator: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowSiteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpsplanRestartRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否自动执行
  autoExecute?: boolean;
  // 运维单扩展信息，jsonStr格式
  context?: string;
  // 容器服务间依赖顺序。
  // e.g 先发 A，B， 再发C， D
  // {"groups": [{container_services: [{"name": A}, {"name": B}]}, {"container_services": [{"name": C}, {"name": D}]}]}
  dependency?: OpsContainerServiceChain;
  // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
  groupAmount: number;
  // 用户可自定义分组发布的顺序，结合具体的分组策略并通过指定具体分组维度对应的名称生效。
  // e.g, 当分组策略为机房时，可以指定先发机房A，再发机房B ["A", "B"]
  groupOrders?: string[];
  // 分组策略（维度）
  // 按部署单元（CELL） - 按部署单元依次重启
  // 按机房（ZONE）- 按机房依次重启
  // 按逻辑单元（UNIT） - 按逻辑单元重启
  // 共分一组（ALL） - 所有容器一起重启，仍遵循分组个数控制
  groupStrategy: string;
  // 是否需要beta卡点
  needBeta: boolean;
  // 限定操作的部署单元
  restrictedCells?: string[];
  // 限定操作的机房
  restrictedZones?: string[];
  // 选定的容器服务列表
  selectedContainerServices: OpsContainerServiceGroup;
  // 重启单标题
  title: string;
  // 工作空间组
  workspaceGroup: string;
  // 命名空间
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      autoExecute: 'auto_execute',
      context: 'context',
      dependency: 'dependency',
      groupAmount: 'group_amount',
      groupOrders: 'group_orders',
      groupStrategy: 'group_strategy',
      needBeta: 'need_beta',
      restrictedCells: 'restricted_cells',
      restrictedZones: 'restricted_zones',
      selectedContainerServices: 'selected_container_services',
      title: 'title',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      autoExecute: 'boolean',
      context: 'string',
      dependency: OpsContainerServiceChain,
      groupAmount: 'number',
      groupOrders: { 'type': 'array', 'itemType': 'string' },
      groupStrategy: 'string',
      needBeta: 'boolean',
      restrictedCells: { 'type': 'array', 'itemType': 'string' },
      restrictedZones: { 'type': 'array', 'itemType': 'string' },
      selectedContainerServices: OpsContainerServiceGroup,
      title: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpsplanRestartResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单号
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceCommentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // wsg
  workspaceGroup: string;
  // fed namespace
  namespace: string;
  // container service name
  name: string;
  // specific container service revision
  revision: string;
  // 版本注释
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      name: 'name',
      revision: 'revision',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      name: 'string',
      revision: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceCommentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackContainerserviceDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属工作空间组名称
  workspaceGroup: string;
  // 容器服务名字
  containerServiceName: string;
  // 所属命名空间名称
  namespace: string;
  // 回滚的版本
  revision: string;
  // 部署单ID
  operationId: string;
  // 操作人账号
  operator: string;
  // 分组数，默认为3
  groupCount?: number;
  // 回滚时的分组策略，取值为： QUICK：快速分组； EACH_ONE：每台一组； UNIT：按逻辑单元分组； CELL：按部署单元分组； 默认为CELL
  groupStrategy?: string;
  // 回滚原因
  reason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      revision: 'revision',
      operationId: 'operation_id',
      operator: 'operator',
      groupCount: 'group_count',
      groupStrategy: 'group_strategy',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      containerServiceName: 'string',
      namespace: 'string',
      revision: 'string',
      operationId: 'string',
      operator: 'string',
      groupCount: 'number',
      groupStrategy: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackContainerserviceDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowUidinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否弹性（默认 false）
  elastic?: boolean;
  // 是否灰度（默认 false）
  gray?: boolean;
  // 是否压测（默认 false）
  press?: boolean;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      elastic: 'elastic',
      gray: 'gray',
      press: 'press',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      elastic: 'boolean',
      gray: 'boolean',
      press: 'boolean',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowUidinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // UID 列表
  uidInfoList?: UidInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uidInfoList: 'uid_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uidInfoList: { 'type': 'array', 'itemType': UidInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowSiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowSiteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前环境的站点列表
  sites?: PushSite[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sites: 'sites',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sites: { 'type': 'array', 'itemType': PushSite },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元名称。
  name: string;
  // 所属环境信息。
  workspaceGroup: string;
  // 所属工作空间名称。
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroup: 'workspace_group',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroup: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部署单元信息。
  cell?: Cell;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cell: Cell,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCellgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属环境信息。
  workspaceGroup: string;
  // 逻辑单元名称。
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCellgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 逻辑单元信息。
  cellGroup?: CellGroup;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellGroup: 'cell_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellGroup: CellGroup,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 蓝绿着色信息。
  color?: string;
  // 是否灰度。
  isGray?: boolean;
  // 部署单元名称。
  name: string;
  // 默认权重。
  weight?: number;
  // 所属环境信息。
  workspaceGroup: string;
  // 所属工作空间名称。
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      color: 'color',
      isGray: 'is_gray',
      name: 'name',
      weight: 'weight',
      workspaceGroup: 'workspace_group',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      color: 'string',
      isGray: 'boolean',
      name: 'string',
      weight: 'number',
      workspaceGroup: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEventsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名
  cluster: string;
  // 容器名称
  containerName?: string;
  // pod名称
  name: string;
  // namespace
  namespace: string;
  //  pod uid
  uid: string;
  // wsg
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cluster: 'cluster',
      containerName: 'container_name',
      name: 'name',
      namespace: 'namespace',
      uid: 'uid',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cluster: 'string',
      containerName: 'string',
      name: 'string',
      namespace: 'string',
      uid: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEventsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件列表
  events?: KubeEvent[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      events: 'events',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      events: { 'type': 'array', 'itemType': KubeEvent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地域列表
  regions?: Region[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      regions: 'regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      regions: { 'type': 'array', 'itemType': Region },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可用区列表
  zones?: Zone[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zones: { 'type': 'array', 'itemType': Zone },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPodLogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名称
  cluster: string;
  // 容器名称
  // The container for which to stream logs. Defaults to only container if there is one container in the pod. (optional)
  containerName?: string;
  // namespace
  namespace: string;
  // pod名称
  podName: string;
  // A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. (optional)
  sinceSeconds?: number;
  // the number of lines from the end of the logs to show
  tailLines?: number;
  // If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. (optional)
  timestamps?: boolean;
  // cluster对应的aks中minion cluster的id
  minionClusterId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cluster: 'cluster',
      containerName: 'container_name',
      namespace: 'namespace',
      podName: 'pod_name',
      sinceSeconds: 'since_seconds',
      tailLines: 'tail_lines',
      timestamps: 'timestamps',
      minionClusterId: 'minion_cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cluster: 'string',
      containerName: 'string',
      namespace: 'string',
      podName: 'string',
      sinceSeconds: 'number',
      tailLines: 'number',
      timestamps: 'boolean',
      minionClusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPodLogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // the logs
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpannerClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器的CPU个数(Core)
  containerCpu: number;
  // 容器是否独占CPU
  containerCpuExclusive: boolean;
  // 容器所在的物理机节点标签
  containerDeviceType: string;
  // 容器的磁盘大小(G)
  containerDisk: number;
  // 容器的内存大小（G）
  containerMem: number;
  // 容器网络
  containerNetwork: string;
  // 集群名称
  name: string;
  // 集群单元类型，默认为 0 : 
  // 0 - 容器
  unitType?: number;
  // 工作空间组
  workspaceGroup: string;
  // 集群网络类型，internet/intranet/multidomain/office
  addressType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerCpu: 'container_cpu',
      containerCpuExclusive: 'container_cpu_exclusive',
      containerDeviceType: 'container_device_type',
      containerDisk: 'container_disk',
      containerMem: 'container_mem',
      containerNetwork: 'container_network',
      name: 'name',
      unitType: 'unit_type',
      workspaceGroup: 'workspace_group',
      addressType: 'address_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerCpu: 'number',
      containerCpuExclusive: 'boolean',
      containerDeviceType: 'string',
      containerDisk: 'number',
      containerMem: 'number',
      containerNetwork: 'string',
      name: 'string',
      unitType: 'number',
      workspaceGroup: 'string',
      addressType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpannerClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群id
  clusterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpannerClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 集群id
  clusterId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpannerClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // spanner 集群信息
  data?: SpannerClusterInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: SpannerClusterInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleSpannerClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  // 需要扩容的单元数目
  containerCount: number;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      containerCount: 'container_count',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      containerCount: 'number',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleSpannerClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群id
  clusterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpannerClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpannerClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // spanner集群列表
  list?: SpannerClusterInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': SpannerClusterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSpannerClusterstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  // 设置集群的状态： 1 运行状态  2 维护状态
  status: number;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      status: 'status',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      status: 'number',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSpannerClusterstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSpannerUnitstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 集群id
  clusterId: string;
  // 容器id列表
  containerIds: string[];
  // 集群单元状态： 1-下线状态 2- 上线状态 3-删除状态
  status: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      clusterId: 'cluster_id',
      containerIds: 'container_ids',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      clusterId: 'string',
      containerIds: { 'type': 'array', 'itemType': 'string' },
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSpannerUnitstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelOpsplanServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单下应用服务对应的发布id
  id?: string;
  // 取消原因
  reason: string;
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  // [huanyu场景使用]huanyu变更单唯一id
  huanyuExecNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      reason: 'reason',
      operator: 'operator',
      huanyuExecNo: 'huanyu_exec_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      reason: 'string',
      operator: 'string',
      huanyuExecNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelOpsplanServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSystemUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspaceGroup name
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSystemUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 系统配置的url列表
  urlList?: SystemURL[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      urlList: 'url_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      urlList: { 'type': 'array', 'itemType': SystemURL },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowRecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app 名称
  app?: string;
  // 结束时间
  endTime?: string;
  // 查询页
  pageNo?: number;
  // 页大小
  pageSize?: number;
  // 推送状态，可选（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
  resultCode?: string;
  // 开始时间
  startTime?: string;
  // 环境
  workspaceGroup: string;
  // 规则类型
  ruleType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      app: 'app',
      endTime: 'end_time',
      pageNo: 'page_no',
      pageSize: 'page_size',
      resultCode: 'result_code',
      startTime: 'start_time',
      workspaceGroup: 'workspace_group',
      ruleType: 'rule_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      app: 'string',
      endTime: 'string',
      pageNo: 'number',
      pageSize: 'number',
      resultCode: 'string',
      startTime: 'string',
      workspaceGroup: 'string',
      ruleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowRecordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 推送记录
  data?: DrmOpsRecord[];
  // 页大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': DrmOpsRecord },
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveFlowEnvrelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标环境
  dest: string;
  // 源环境
  src: string;
  // 关联关系：可选（PROD，GRAY）
  type: string;
  // 环境
  workspaceGroup: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dest: 'dest',
      src: 'src',
      type: 'type',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dest: 'string',
      src: 'string',
      type: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveFlowEnvrelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowEnvrelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标环境
  dest: string;
  // 源环境
  src: string;
  // 关联类型（PROD，GRAY）
  type: string;
  // 环境
  workspaceGroup: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dest: 'dest',
      src: 'src',
      type: 'type',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dest: 'string',
      src: 'string',
      type: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowEnvrelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowEnvrelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  // 源环境
  src: string;
  // 关联类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      src: 'src',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      src: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowEnvrelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 源环境
  src?: string;
  // 目标环境
  dest?: string;
  // 关联类型（PROD，GRAY）
  type?: string;
  // 创建时间
  createdTime?: string;
  // 修改时间
  modifiedTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      src: 'src',
      dest: 'dest',
      type: 'type',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      src: 'string',
      dest: 'string',
      type: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowSitecellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 异构机房部署单元
  name: string;
  // 异构机房地域
  region: string;
  // 异构机房名称
  siteName: string;
  // 环境
  workspaceGroup: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      region: 'region',
      siteName: 'site_name',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      region: 'string',
      siteName: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowSitecellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowSitecellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部署单元
  name: string;
  // 异构机房名
  siteName: string;
  // 环境
  workspaceGroup: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      siteName: 'site_name',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      siteName: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFlowSitecellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowSitecellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 异构机房名
  siteName: string;
  // 环境
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      siteName: 'site_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      siteName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowSitecellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部署单元列表
  siteCells?: SiteCell[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      siteCells: 'site_cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      siteCells: { 'type': 'array', 'itemType': SiteCell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOpsplanServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 发布单下应用服务对应的发布id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOpsplanServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布应用服务详情
  data?: AppSimpleInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AppSimpleInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  // 规则类型：ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR
  ruleType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      ruleType: 'rule_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      ruleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 规则文本
  rule?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rule: 'rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rule: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属应用
  app: string;
  // clusters
  clusters: string[];
  // FedDeploymentClusterOverride描述
  clusterOverrides?: FedDeploymentClusterOverride[];
  // DNS配置
  dnsPolicy?: string;
  // Host networking requested for this pod
  hostNetwork?: boolean;
  // 名称
  name: string;
  // 命名空间
  namespace: string;
  // Pod模板描述
  podSpec: PodSpec;
  // Deployment 副本数
  replicas: number;
  // Pod volume list
  volumes?: Volume[];
  // 环境组名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      app: 'app',
      clusters: 'clusters',
      clusterOverrides: 'cluster_overrides',
      dnsPolicy: 'dns_policy',
      hostNetwork: 'host_network',
      name: 'name',
      namespace: 'namespace',
      podSpec: 'pod_spec',
      replicas: 'replicas',
      volumes: 'volumes',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      app: 'string',
      clusters: { 'type': 'array', 'itemType': 'string' },
      clusterOverrides: { 'type': 'array', 'itemType': FedDeploymentClusterOverride },
      dnsPolicy: 'string',
      hostNetwork: 'boolean',
      name: 'string',
      namespace: 'string',
      podSpec: PodSpec,
      replicas: 'number',
      volumes: { 'type': 'array', 'itemType': Volume },
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFederationDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // name
  name?: string;
  // 命名空间
  namespace?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 负载均衡类型。
  type: string;
  // 工作空间组名称。
  workspaceGroup: string;
  // 所属namespace名称。
  namespace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      type: 'type',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      type: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 负载均衡实例列表。
  loadBalancers?: LoadBalancerInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loadBalancers: 'load_balancers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loadBalancers: { 'type': 'array', 'itemType': LoadBalancerInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务名称
  containerServiceName: string;
  // 命名空间名称
  namespace: string;
  // 工作空间组名称
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务 Service 列表
  services?: ServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      services: 'services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      services: { 'type': 'array', 'itemType': ServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region_id
  regionId?: string;
  // scope
  scope: string;
  // workspace
  workspace?: string;
  // workspace_group_id
  workspaceGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      scope: 'scope',
      workspace: 'workspace',
      workspaceGroupId: 'workspace_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      scope: 'string',
      workspace: 'string',
      workspaceGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sidecars
  sidecars?: SideCar[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecars: 'sidecars',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecars: { 'type': 'array', 'itemType': SideCar },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region_id
  regionId?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope: string;
  // sidecar_name
  sidecarName?: string;
  // sidecar version
  sidecarVersion?: string;
  // 环境
  workspace?: string;
  // workspace_group_id
  workspaceGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      scope: 'scope',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      workspace: 'workspace',
      workspaceGroupId: 'workspace_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      scope: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      workspace: 'string',
      workspaceGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sidecar 模板列表
  sidecarTemplates?: SidecarTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarTemplates: 'sidecar_templates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarTemplates: { 'type': 'array', 'itemType': SidecarTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region_id
  regionId?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope: string;
  // sidecar 名称
  sidecarName: string;
  // sidecar 版本
  sidecarVersion: string;
  // 环境
  workspace?: string;
  // wsg id
  workspaceGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      scope: 'scope',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      workspace: 'workspace',
      workspaceGroupId: 'workspace_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      scope: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      workspace: 'string',
      workspaceGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sidecar 版本详情
  sidecarTemplate?: SidecarTemplate;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarTemplate: 'sidecar_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarTemplate: SidecarTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedDeployment名称
  name: string;
  // workspaceGroup 名称
  // 
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFederationDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联邦无状态工作负载
  data?: FederatedDeployment;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: FederatedDeployment,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // namespace
  namespace: string;
  // 环境组名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFederationDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // FederatedDeploymment列表
  data?: FederatedDeployment[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': FederatedDeployment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // FedDeployment名称
  name: string;
  // 环境组名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFederationDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除成功标志
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetFlowDefaultuidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  // 是否压测，默认 false
  press?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      press: 'press',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      press: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetFlowDefaultuidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartOpsplanServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务发布ID
  id: string;
  // 工作空间组
  workspaceGroup: string;
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceGroup: 'workspace_group',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceGroup: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartOpsplanServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmOpsplanServicerollbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务发布id
  id: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmOpsplanServicerollbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryOpsplanServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务发布id
  id: string;
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryOpsplanServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticsceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticsceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 弹性场景列表
  scenes?: ElasticScene[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scenes: 'scenes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scenes: { 'type': 'array', 'itemType': ElasticScene },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  // 规则名称
  name?: string;
  // 所属类型
  type?: string;
  // 所属应用名称
  appName?: string;
  // 场景名称
  sceneName?: string;
  // 分页大小，默认 10
  pageSize?: number;
  // 当前页，默认 1
  pageNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      name: 'name',
      type: 'type',
      appName: 'app_name',
      sceneName: 'scene_name',
      pageSize: 'page_size',
      pageNo: 'page_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      name: 'string',
      type: 'string',
      appName: 'string',
      sceneName: 'string',
      pageSize: 'number',
      pageNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 弹性规则列表
  elasticRules?: ElasticRuleView[];
  // 总数
  total?: number;
  // 当前页
  pageNo?: number;
  // 分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      elasticRules: 'elastic_rules',
      total: 'total',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      elasticRules: { 'type': 'array', 'itemType': ElasticRuleView },
      total: 'number',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticsubruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  // 弹性规则ID
  elasticRuleId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      elasticRuleId: 'elastic_rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      elasticRuleId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticsubruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 子规则列表
  subRules?: ElasticSubRuleView[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subRules: 'sub_rules',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subRules: { 'type': 'array', 'itemType': ElasticSubRuleView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowElasticvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 弹性信息
  elasticInfo?: ElasticInfoView[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      elasticInfo: 'elastic_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      elasticInfo: { 'type': 'array', 'itemType': ElasticInfoView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSystemSwitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSystemSwitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 开关集合jarrya son string
  switches?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      switches: 'switches',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      switches: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadBuildpackDockerfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 技术栈大版本
  techStack: string;
  // 云原生技术栈版本
  techStackVersion: string;
  // 应用包地址，可以为相对目录，或者远程可访问存储地址. 用于组装Dockerfile模板中对应的应用包获取地址
  packageUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      techStack: 'tech_stack',
      techStackVersion: 'tech_stack_version',
      packageUrl: 'package_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      techStack: 'string',
      techStackVersion: 'string',
      packageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadBuildpackDockerfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Dockerfile指令列表
  commands?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commands: 'commands',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commands: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpsplanPodofflineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否自动执行
  autoExecute?: boolean;
  // 运维单扩展信息，jsonStr格式
  context?: string;
  // 容器服务间依赖顺序。 e.g 先发 A，B， 再发C， D {"groups": [{container_services: [{"name": A}, {"name": B}]}, {"container_services": [{"name": C}, {"name": D}]}]}
  dependency?: OpsContainerServiceChain;
  // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
  groupAmount: number;
  // 用户可自定义分组发布的顺序，结合具体的分组策略并通过指定具体分组维度对应的名称生效。 e.g, 当分组策略为机房时，可以指定先发机房A，再发机房B ["A", "B"]
  groupOrders?: string[];
  // 分组策略（维度）：
  // - 按部署单元（CELL），按部署单元依次缩容；
  // - 按机房（ZONE），按机房依次缩容；
  // - 按逻辑单元（UNIT），按逻辑单元缩容；
  // - 共分一组（ALL），所有容器一起缩容，仍遵循分组个数控制；
  groupStrategy: string;
  // 命名空间
  namespace: string;
  // 是否需要beta卡点
  needBeta: boolean;
  // 限定操作的部署单元
  restrictedCells?: string[];
  // 限定操作的机房
  restrictedZones?: string[];
  // 选定的容器服务列表
  selectedContainerServices: OpsContainerServiceGroup;
  // 缩容指定pod的标题
  title: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      autoExecute: 'auto_execute',
      context: 'context',
      dependency: 'dependency',
      groupAmount: 'group_amount',
      groupOrders: 'group_orders',
      groupStrategy: 'group_strategy',
      namespace: 'namespace',
      needBeta: 'need_beta',
      restrictedCells: 'restricted_cells',
      restrictedZones: 'restricted_zones',
      selectedContainerServices: 'selected_container_services',
      title: 'title',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      autoExecute: 'boolean',
      context: 'string',
      dependency: OpsContainerServiceChain,
      groupAmount: 'number',
      groupOrders: { 'type': 'array', 'itemType': 'string' },
      groupStrategy: 'string',
      namespace: 'string',
      needBeta: 'boolean',
      restrictedCells: { 'type': 'array', 'itemType': 'string' },
      restrictedZones: { 'type': 'array', 'itemType': 'string' },
      selectedContainerServices: OpsContainerServiceGroup,
      title: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpsplanPodofflineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单号
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDbflowObtenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 描述信息
  description?: string;
  // 租户扩展属性，格式为序列化后的json字符串
  extendProperties?: string;
  // OB租户名称
  name: string;
  // 用于存放对应的业务库租户类型：单库类型或分片库
  type: string;
  // 租户存放的uid段，用于存放对应业务分片库
  uids?: number[];
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      extendProperties: 'extend_properties',
      name: 'name',
      type: 'type',
      uids: 'uids',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      extendProperties: 'string',
      name: 'string',
      type: 'string',
      uids: { 'type': 'array', 'itemType': 'number' },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDbflowObtenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDbflowObtenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 租户类型GZONE|RZONE，分别用于存放单库或分片库
  type?: string;
  // 租户名称前缀
  name?: string;
  // 当前页码，默认为1
  pageNumber?: number;
  // 单页个数，默认为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      type: 'type',
      name: 'name',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      type: 'string',
      name: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDbflowObtenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户列表
  list?: OBTenant[];
  // 当前页码
  pageNumber?: number;
  // 单页个数
  pageSize?: number;
  // 总计
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': OBTenant },
      pageNumber: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDbflowObtenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // OB租户唯一标识
  id: string;
  // OB租户名称
  name: string;
  // 用于存放对应的业务库租户类型：单库类型或分片库
  type: string;
  // 租户描述
  description?: string;
  // 对应uid分片段，用于存放对应分片库
  uids?: number[];
  // 租户扩展属性，格式为序列化后的json字符串
  extendProperties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      id: 'id',
      name: 'name',
      type: 'type',
      description: 'description',
      uids: 'uids',
      extendProperties: 'extend_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      id: 'string',
      name: 'string',
      type: 'string',
      description: 'string',
      uids: { 'type': 'array', 'itemType': 'number' },
      extendProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDbflowObtenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDbflowObtenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 租户唯一标识
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDbflowObtenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpackNativetechstackversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 技术栈类别
  techStack: string;
  // 云原生技术栈版本名称
  techStackVersion: string;
  // 基础镜像名称
  fromImage: string;
  // 版本描述信息
  description?: string;
  // 扩展指令列表
  extCommands?: string[];
  // 扩展属性 - 表现为Map<String,String>序列化后的字符串
  extendProperties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      techStack: 'tech_stack',
      techStackVersion: 'tech_stack_version',
      fromImage: 'from_image',
      description: 'description',
      extCommands: 'ext_commands',
      extendProperties: 'extend_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      techStack: 'string',
      techStackVersion: 'string',
      fromImage: 'string',
      description: 'string',
      extCommands: { 'type': 'array', 'itemType': 'string' },
      extendProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpackNativetechstackversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspacegroupRegionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group 名称
  // 
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspacegroupRegionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // region列表
  regions?: Region[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      regions: 'regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      regions: { 'type': 'array', 'itemType': Region },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group name
  // 
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群列表
  data?: Cluster[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Cluster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace group name
  // 
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群资源概览信息
  data?: ClusterStatus[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ClusterStatus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCertificatesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCertificatesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书列表。
  certificates?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificates: 'certificates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificates: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLoadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组名称。
  workspaceGroup: string;
  // 命名空间名称。
  namespace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLoadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 已经被使用的lb iaas ids。
  boundIaasIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      boundIaasIds: 'bound_iaas_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      boundIaasIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCloudconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCloudconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cluod_config raw txt
  cloudConfig?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cloudConfig: 'cloud_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cloudConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCloudconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cloud_config json描述
  cloudConfig: string;
  // UPDATE或ROLLBACK
  option: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cloudConfig: 'cloud_config',
      option: 'option',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cloudConfig: 'string',
      option: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCloudconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCloudconfigHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCloudconfigHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 配置历史列表
  configLists?: CloudConfigEntity[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configLists: 'config_lists',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configLists: { 'type': 'array', 'itemType': CloudConfigEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境信息，对应workspace_group名称
  env: string;
  // sidecar运维动作：
  // 接入 open
  // 升级 upgrade
  serviceKey: string;
  // sidecar运维请求体
  executeTaskRequest: SidecarOperationTask;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      env: 'env',
      serviceKey: 'service_key',
      executeTaskRequest: 'execute_task_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      env: 'string',
      serviceKey: 'string',
      executeTaskRequest: SidecarOperationTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sidecar运维ID
  operationId?: string;
  // 跳转链接
  changeUrl?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
      changeUrl: 'change_url',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
      changeUrl: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetrySidecarOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // operation ID
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetrySidecarOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跳转链接
  changeUrl?: string;
  // sidecar运维请求ID
  operationId?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      changeUrl: 'change_url',
      operationId: 'operation_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      changeUrl: 'string',
      operationId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSidecarOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // Opeartion ID 
  operationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSidecarOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跳转链接
  changeUrl?: string;
  // sidecar运维请求
  operationId?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      changeUrl: 'change_url',
      operationId: 'operation_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      changeUrl: 'string',
      operationId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cluster name to apply a service
  clusterName: string;
  // a string service yaml
  rawTemplate: string;
  // xxx
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      rawTemplate: 'raw_template',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      rawTemplate: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGpaasReleaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // aig
  appInstanceGroup: string;
  // 应用名字
  appName: string;
  // 发布批次分组
  batches: ReleaseBatchObj[];
  // 是否是第一次发布
  isFirstRelease: boolean;
  // operator
  operator: string;
  // 发布单名字，或者说标题
  releaseName: string;
  // 发布版本信息，包括镜像等
  releaseVersion: ReleaseVersion;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appInstanceGroup: 'app_instance_group',
      appName: 'app_name',
      batches: 'batches',
      isFirstRelease: 'is_first_release',
      operator: 'operator',
      releaseName: 'release_name',
      releaseVersion: 'release_version',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appInstanceGroup: 'string',
      appName: 'string',
      batches: { 'type': 'array', 'itemType': ReleaseBatchObj },
      isFirstRelease: 'boolean',
      operator: 'string',
      releaseName: 'string',
      releaseVersion: ReleaseVersion,
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGpaasReleaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  releaseId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      releaseId: 'release_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      releaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecarOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运维单号
  operationId: string;
  // 是否带运维单执行详情
  withDetail?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      withDetail: 'with_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      withDetail: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecarOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 是否结束
  finished?: boolean;
  // 执行状态
  operationStatus?: string;
  // 执行详情
  targetProcesses?: string[];
  // 发布分组执行详情
  processDetailList?: SidecarOpsMachineGroup[];
  // 扩展信息
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      finished: 'finished',
      operationStatus: 'operation_status',
      targetProcesses: 'target_processes',
      processDetailList: 'process_detail_list',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      finished: 'boolean',
      operationStatus: 'string',
      targetProcesses: { 'type': 'array', 'itemType': 'string' },
      processDetailList: { 'type': 'array', 'itemType': SidecarOpsMachineGroup },
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKubernetesResourcesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 标签选择器。
  labelSelector?: string;
  // kubernetes资源路径。
  path: string;
  // 命名空间名称。
  namespace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      labelSelector: 'label_selector',
      path: 'path',
      namespace: 'namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      labelSelector: 'string',
      path: 'string',
      namespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKubernetesResourcesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // "item1","item2"
  items?: string[];
  // 资源总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      items: 'items',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      items: { 'type': 'array', 'itemType': 'string' },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryReleasepipelinestageEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单发布分组的id，对应ReleasePipeline中的stage
  stageId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      stageId: 'stage_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      stageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryReleasepipelinestageEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件列表
  eventList?: RpReleaseEvent[];
  // ReleasePipelineStage id
  stageId?: string;
  // 返回列表中类型和对象摘要
  typeInsSummary?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventList: 'event_list',
      stageId: 'stage_id',
      typeInsSummary: 'type_ins_summary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventList: { 'type': 'array', 'itemType': RpReleaseEvent },
      stageId: 'string',
      typeInsSummary: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSlsProjectnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_group
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSlsProjectnameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sls projectName
  projectName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectName: 'project_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryReleasepipelineEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单对应的service id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryReleasepipelineEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件列表
  eventList?: RpReleaseEvent[];
  // ReleasePipeline service_id
  serviceId?: string;
  // 返回列表中类型和对象摘要
  typeInsSummary?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventList: 'event_list',
      serviceId: 'service_id',
      typeInsSummary: 'type_ins_summary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventList: { 'type': 'array', 'itemType': RpReleaseEvent },
      serviceId: 'string',
      typeInsSummary: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPodEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单对应的service_id
  serviceId: string;
  // POD对应的u_id
  uId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
      uId: 'u_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
      uId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPodEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件列表
  eventList?: RpReleaseEvent[];
  // 发布单对应的service_id
  serviceId?: string;
  // POD对应的uid
  uId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventList: 'event_list',
      serviceId: 'service_id',
      uId: 'u_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventList: { 'type': 'array', 'itemType': RpReleaseEvent },
      serviceId: 'string',
      uId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceProcesslogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 观测对象类型，RPV2，RP_STAGE，POD
  objectKind: string;
  // 观测对象名称
  objectName: string;
  // 发布单对应的service_id
  serviceId: string;
  // 发布单id
  planId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      objectKind: 'object_kind',
      objectName: 'object_name',
      serviceId: 'service_id',
      planId: 'plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      objectKind: 'string',
      objectName: 'string',
      serviceId: 'string',
      planId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceProcesslogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Log列表
  logList?: ServiceProcessLog[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logList: 'log_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logList: { 'type': 'array', 'itemType': ServiceProcessLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 根据应用名称查询，不能为空，不支持一次性查询所有应用，是精准查询，不支持模糊匹配
  appName: string;
  // 容器服务名
  containerServiceName?: string;
  // 当前页码，从1开始，默认为1
  currentPage?: number;
  // 部署状态
  deploymentStates?: string[];
  // 所属命名空间
  namespace?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  order?: string;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 container_service_name
  queryType?: string;
  // 工作空间组id列表
  workspaceGroupNames?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      containerServiceName: 'container_service_name',
      currentPage: 'current_page',
      deploymentStates: 'deployment_states',
      namespace: 'namespace',
      order: 'order',
      pageSize: 'page_size',
      queryType: 'query_type',
      workspaceGroupNames: 'workspace_group_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      containerServiceName: 'string',
      currentPage: 'number',
      deploymentStates: { 'type': 'array', 'itemType': 'string' },
      namespace: 'string',
      order: 'string',
      pageSize: 'number',
      queryType: 'string',
      workspaceGroupNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前应用关联的容器服务列表
  containerServiceList?: ContainerServiceBasicInfo[];
  // 当前页码，从1开始，默认为1
  currentPage?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 总数
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      containerServiceList: 'container_service_list',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      containerServiceList: { 'type': 'array', 'itemType': ContainerServiceBasicInfo },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称，精准查询
  appName: string;
  // 当前页码，从1开始，默认为1
  currentPage?: number;
  // 排序规则，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  order?: string;
  // 分页大小，默认为10
  pageSize?: number;
  // 状态筛选列表
  states?: string[];
  // 查询指定发布单 timeseries_id 列表
  timeseriesIds?: string[];
  // 工作空间组id列表
  workspaceGroupNames?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      currentPage: 'current_page',
      order: 'order',
      pageSize: 'page_size',
      states: 'states',
      timeseriesIds: 'timeseries_ids',
      workspaceGroupNames: 'workspace_group_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      currentPage: 'number',
      order: 'string',
      pageSize: 'number',
      states: { 'type': 'array', 'itemType': 'string' },
      timeseriesIds: { 'type': 'array', 'itemType': 'string' },
      workspaceGroupNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppPlanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码，从1开始，默认为1
  currentPage?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 发布单列表
  planList?: PlanSimpleView[];
  // 发布单数
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      planList: 'plan_list',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageSize: 'number',
      planList: { 'type': 'array', 'itemType': PlanSimpleView },
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedaccessinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
  spannerCluster: string;
  // https协议配置
  unifiedAccessInstanceHttpsEntry?: HttpsEntry;
  // http协议配置
  unifiedAccessInstanceHttpEntry: HttpEntry;
  // 统一接入实例名称
  unifiedAccessInstanceName: string;
  // 统一接入网络类型，内网（intranet），公网（internet）
  unifiedAccessInstanceType: string;
  // 工作空间组
  workspaceGroup: string;
  // 用户自定义实例entry相关信息（vip/id），datacenter粒度
  entrySettings?: EntrySettings;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      spannerCluster: 'spanner_cluster',
      unifiedAccessInstanceHttpsEntry: 'unified_access_instance_https_entry',
      unifiedAccessInstanceHttpEntry: 'unified_access_instance_http_entry',
      unifiedAccessInstanceName: 'unified_access_instance_name',
      unifiedAccessInstanceType: 'unified_access_instance_type',
      workspaceGroup: 'workspace_group',
      entrySettings: 'entry_settings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      spannerCluster: 'string',
      unifiedAccessInstanceHttpsEntry: HttpsEntry,
      unifiedAccessInstanceHttpEntry: HttpEntry,
      unifiedAccessInstanceName: 'string',
      unifiedAccessInstanceType: 'string',
      workspaceGroup: 'string',
      entrySettings: EntrySettings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedaccessinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedaccessinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 可以用来过滤实例
  instanceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      instanceName: 'instance_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      instanceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedaccessinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统一接入实例列表信息
  list?: UnifiedAccessInstanceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': UnifiedAccessInstanceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedaccessinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 统一接入实例名称
  unifiedAccessInstanceName: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      unifiedAccessInstanceName: 'unified_access_instance_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      unifiedAccessInstanceName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedaccessinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统一接入实例信息
  data?: UnifiedAccessInstanceInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: UnifiedAccessInstanceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedaccessinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 统一接入实例名称
  unifiedAccessInstanceName: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      unifiedAccessInstanceName: 'unified_access_instance_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      unifiedAccessInstanceName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedaccessinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUnifiedaccessinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 统一接入实例信息
  data: UnifiedAccessInstanceInfo;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: UnifiedAccessInstanceInfo,
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUnifiedaccessinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnireleasespiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求方法
  requestMethod: string;
  // 请求参数的 JSON 字符串
  requestParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestMethod: 'request_method',
      requestParam: 'request_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestMethod: 'string',
      requestParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnireleasespiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求结果的 JSON 字符串
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用于描述联邦spanner 集群内容器实例采用内网还是外网
  addressType: string;
  // 用于描述联邦spanner 集群内容器实例 cpu大小， 单位core 
  cpu: string;
  // 用于描述联邦spanner 集群内容器实例disk大小， 单位Gi 
  disk: string;
  // 用于描述联邦spanner 集群内容器实例的网络是否采用host网络
  hostNetwork: boolean;
  // 用于描述联邦spanner 集群内容器实例mem 大小， 单位 Gi  
  mem: string;
  // 用于描述联邦spanner 集群名称
  name: string;
  // 描述集群初始状态
  state: string;
  // 定义了container的spec信息，包含多版本，镜像，副本数，标签等
  subClustersConfig: string;
  // 工作空间组信息
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      addressType: 'address_type',
      cpu: 'cpu',
      disk: 'disk',
      hostNetwork: 'host_network',
      mem: 'mem',
      name: 'name',
      state: 'state',
      subClustersConfig: 'sub_clusters_config',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      addressType: 'string',
      cpu: 'string',
      disk: 'string',
      hostNetwork: 'boolean',
      mem: 'string',
      name: 'string',
      state: 'string',
      subClustersConfig: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fed集群名称
  clusterName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名称，模糊匹配
  clusterName?: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询集群列表时的简略信息
  data?: QuerySpannerClusterDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': QuerySpannerClusterDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // fed集群名称
  clusterName: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取单个联邦 spanner集群详细信息，包含所含的本地集群信息
  data?: GetSpannerClusterDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: GetSpannerClusterDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名称
  clusterName?: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // list 集群列表
  data?: QuerySpannerClusterDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': QuerySpannerClusterDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // fed spanner cluster name
  clusterName: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 批量指定fed集群名称
  clusterNames: string[];
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterNames: 'cluster_names',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterNames: { 'type': 'array', 'itemType': 'string' },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedspannerclusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用于描述联邦spanner 集群内容器实例采用内网还是外网
  addressType: string;
  // 集群名称
  clusterName: string;
  // 用于描述联邦spanner 集群内容器实例 cpu大小， 单位core
  cpu: string;
  // 用于描述联邦spanner 集群内容器实例disk大小， 单位Gi
  disk: string;
  // 用于描述联邦spanner 集群内容器实例的网络是否采用host网络
  hostNetwork: boolean;
  // 用于描述联邦spanner 集群内容器实例mem 大小， 单位 Gi
  mem: string;
  // 用于描述联邦spanner 集群名称
  name: string;
  // 描述集群状态
  state: string;
  // 定义了sub cluster的config信息，包含多版本，镜像，副本数，标签等
  subClustersConfig: string;
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      addressType: 'address_type',
      clusterName: 'cluster_name',
      cpu: 'cpu',
      disk: 'disk',
      hostNetwork: 'host_network',
      mem: 'mem',
      name: 'name',
      state: 'state',
      subClustersConfig: 'sub_clusters_config',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      addressType: 'string',
      clusterName: 'string',
      cpu: 'string',
      disk: 'string',
      hostNetwork: 'boolean',
      mem: 'string',
      name: 'string',
      state: 'string',
      subClustersConfig: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedspannerclusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateReleaseplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 创建发布单需要的应用服务信息
  appServices: ReleasePlanSpecAppService[];
  // 命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 是否自动执行
  isAutoExecute?: boolean;
  // 发布单标题
  title: string;
  // 默认CLOUD_NATIVE_GROUP_RELEASE
  opsType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServices: 'app_services',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      isAutoExecute: 'is_auto_execute',
      title: 'title',
      opsType: 'ops_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServices: { 'type': 'array', 'itemType': ReleasePlanSpecAppService },
      namespace: 'string',
      workspaceGroup: 'string',
      isAutoExecute: 'boolean',
      title: 'string',
      opsType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateReleaseplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单的唯一标识，可以认为是timeSeriesId
  planUniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      planUniqueId: 'plan_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      planUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedspannerclusterStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // fed spanner cluster 集群名称
  clusterName: string;
  // 期望的集群状态
  clusterStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      clusterName: 'cluster_name',
      clusterStatus: 'cluster_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      clusterName: 'string',
      clusterStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedspannerclusterStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntvipDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组名称
  workspaceGroup: string;
  // 应用名称
  application: string;
  // 要添加的部署单元名称列表
  cells: string[];
  // 健康检查类型，默认为TCP
  healthCheckType?: string;
  // 健康检查端口，非必填项
  healthCheckDefaultPort?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      application: 'application',
      cells: 'cells',
      healthCheckType: 'health_check_type',
      healthCheckDefaultPort: 'health_check_default_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      application: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      healthCheckType: 'string',
      healthCheckDefaultPort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntvipDomainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建的antvip域名全称
  vipDomains?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vipDomains: 'vip_domains',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vipDomains: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntvipDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组名称
  workspaceGroup: string;
  // 应用名称
  application: string;
  // 部署单元cell名称
  cell: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      application: 'application',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      application: 'string',
      cell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntvipDomainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceIngressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务名称
  containerServiceName: string;
  // 命名空间名称
  namespace: string;
  // 工作空间组名称
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContainerserviceIngressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容器服务 Ingress 列表
  ingresses?: IngressInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ingresses: 'ingresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ingresses: { 'type': 'array', 'itemType': IngressInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务列表。	
  containerServices: ContainerServiceOperationList;
  // 分组策略：ALL_ONE、EACH_ONE、CELL，默认EACH_ONE
  groupStrategy?: string;
  // 是否自动执行，默认false
  isAutoExecute?: boolean;
  // 是否需要beta卡点，默认 true
  isNeedBeta?: boolean;
  // 所属命名空间
  namespace: string;
  // 运维类型：重启等
  opsMode: string;
  // 默认值：CLOUD_NATIVE_OPERATION
  opsType?: string;
  // 运维单名称
  title: string;
  // 所属工作空间组名称。
  workspaceGroup: string;
  // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
  groupAmount?: number;
  // 审批人账号id，暂时不支持
  assigneeIds?: string[];
  // 操作人账号，lks1.23.0才支持
  operator?: string;
  // [huanyu场景使用]huanyu变更单id
  huanyuExecNo?: string;
  // 每个批次最大涉及变更的pod个数
  maxGroupCapacity?: number;
  // 每个部署单元单批次变更pod数量百分比，仅当group_strategey为ALL_CELL_PERCENTAGE时生效
  maxCellPodPercentage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServices: 'container_services',
      groupStrategy: 'group_strategy',
      isAutoExecute: 'is_auto_execute',
      isNeedBeta: 'is_need_beta',
      namespace: 'namespace',
      opsMode: 'ops_mode',
      opsType: 'ops_type',
      title: 'title',
      workspaceGroup: 'workspace_group',
      groupAmount: 'group_amount',
      assigneeIds: 'assignee_ids',
      operator: 'operator',
      huanyuExecNo: 'huanyu_exec_no',
      maxGroupCapacity: 'max_group_capacity',
      maxCellPodPercentage: 'max_cell_pod_percentage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServices: ContainerServiceOperationList,
      groupStrategy: 'string',
      isAutoExecute: 'boolean',
      isNeedBeta: 'boolean',
      namespace: 'string',
      opsMode: 'string',
      opsType: 'string',
      title: 'string',
      workspaceGroup: 'string',
      groupAmount: 'number',
      assigneeIds: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
      huanyuExecNo: 'string',
      maxGroupCapacity: 'number',
      maxCellPodPercentage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContainerserviceOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建完成的部署单id	
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterEventsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 环境组名称
  workspaceGroup: string;
  // 命名空间
  namespace?: string;
  // 容器服务名称
  containerService?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      containerService: 'container_service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      containerService: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMulticlusterEventsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // kubernetes集群事件信息
  data?: ClusterEvents[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ClusterEvents },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContainerserviceDeploymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单time_series_id
  timeSeriesId: string;
  // 审批人账号id
  assigneeIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      timeSeriesId: 'time_series_id',
      assigneeIds: 'assignee_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      timeSeriesId: 'string',
      assigneeIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContainerserviceDeploymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审批状态
  approvalStatus?: string;
  // 审批详情页面地址
  approvalUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      approvalStatus: 'approval_status',
      approvalUrl: 'approval_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      approvalStatus: 'string',
      approvalUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIngressTrafficweightRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 流量权重列表
  serviceWeights: ServiceWeight[];
  // service id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceWeights: 'service_weights',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceWeights: { 'type': 'array', 'itemType': ServiceWeight },
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIngressTrafficweightResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOpsplanBluedetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // antcloud.ldc.opsplan.detail.query 接口返回的 group_collection_list. app_group_list.id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOpsplanBluedetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pod信息列表
  podList?: PodInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      podList: 'pod_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      podList: { 'type': 'array', 'itemType': PodInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIngressTrafficweightRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lks_service_id，antcloud.ldc.opsplan.detail.query 接口返回的 group_collection_list. app_group_list.id，和查询应用服务发布单详情的id一样
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIngressTrafficweightResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流量权重列表
  serviceWeights?: ServiceWeight[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceWeights: 'service_weights',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceWeights: { 'type': 'array', 'itemType': ServiceWeight },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOamserviceApplicationconfigurationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ApplicationConfiguration yaml字符串
  yamlcontent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      yamlcontent: 'yamlcontent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      yamlcontent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOamserviceApplicationconfigurationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  applicationconfiguraion?: OAMApplicationConfiguration;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationconfiguraion: 'applicationconfiguraion',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationconfiguraion: OAMApplicationConfiguration,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFedloadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 联邦负载均衡实例名称，RFC1035 主机名规范 [a-z]([-a-z0-9]*[a-z0-9])?
  name: string;
  // 命名空间
  namespace: string;
  // 地址类型，例如公网、内网
  addrType: string;
  // 指定负载均衡规格大小
  spec?: string;
  // 联邦负载均衡实例对应的部署单元列表
  cells: string[];
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      addrType: 'addr_type',
      spec: 'spec',
      cells: 'cells',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      addrType: 'string',
      spec: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFedloadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联邦负载均衡名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedloadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 联邦负载均衡实例名称
  name: string;
  // 联邦负载均衡实例所在命名空间
  namespace: string;
  // 地址类型，例如公网、内网
  addrType: string;
  // 指定负载均衡规格
  spec?: string;
  // 联邦负载均衡实例对应的部署单元列表
  cells: string[];
  // 工作空间组
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namespace: 'namespace',
      addrType: 'addr_type',
      spec: 'spec',
      cells: 'cells',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namespace: 'string',
      addrType: 'string',
      spec: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFedloadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFedloadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 命名空间
  namespace: string;
  // 支持模糊搜索
  name?: string;
  // 页数
  pageNumber?: number;
  // 分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      name: 'name',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      name: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFedloadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联邦负载均衡实例列表
  fedLoadbalancerList?: FedLoadBalancer[];
  // 查询到的联邦负载均衡实例总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fedLoadbalancerList: 'fed_loadbalancer_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fedLoadbalancerList: { 'type': 'array', 'itemType': FedLoadBalancer },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFedloadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 命名空间
  namespace: string;
  // 联邦负载均衡实例的名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFedloadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFedloadbalancerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组
  workspaceGroup: string;
  // 命名空间
  namespace: string;
  // 联邦负载均衡名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFedloadbalancerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联邦负载均衡实例信息
  fedLoadbalancer?: FedLoadBalancer;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fedLoadbalancer: 'fed_loadbalancer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fedLoadbalancer: FedLoadBalancer,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportUnireleaseSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // Line迭代发布Json String
  solution: string;
  // 机构列表信息；如果不填默认是所有机构统一发布
  tenants?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      solution: 'solution',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      solution: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportUnireleaseSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  success?: boolean;
  // 解决方案ID
  solutionId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnireleaseSolutionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  // 操作人
  operator?: string;
  // 发布名称
  name?: string;
  // 创建时间初始值
  creationTimeFrom?: string;
  // 创建时间结束值
  creationTimeTo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      page: 'page',
      pageSize: 'page_size',
      operator: 'operator',
      name: 'name',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      page: 'number',
      pageSize: 'number',
      operator: 'string',
      name: 'string',
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnireleaseSolutionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解决方案列表返回
  data?: UnireleaseSolution[];
  // 总数
  totalSize?: number;
  // 页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalSize: 'total_size',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': UnireleaseSolution },
      totalSize: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 解决方案发布ID
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解决方案详情
  data?: UnireleaseSolution;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: UnireleaseSolution,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleasePipelineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 解决方案发布单ID
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleasePipelineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pipeline ID
  id?: string;
  // 解决方案ID
  solutionId?: string;
  // 发布单状态
  state?: string;
  // 应用发布状态
  tenantPipelines?: TenantAppReleasePipeline[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      solutionId: 'solution_id',
      state: 'state',
      tenantPipelines: 'tenant_pipelines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      solutionId: 'string',
      state: 'string',
      tenantPipelines: { 'type': 'array', 'itemType': TenantAppReleasePipeline },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnireleasePipelinesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 解决方案ID
  solutionId: string;
  // 租户/机构名称列表，不填默认当前机构所有租户
  tenants?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      solutionId: 'solution_id',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      solutionId: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnireleasePipelinesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseTenantsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 解决方案Json
  solution: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      solution: 'solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      solution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseTenantsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解决方案租户列表信息
  tenants?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContainerserviceMiddlewareconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 应用服务名
  containerServiceName: string;
  // 应用服务版本
  containerServiceRevision: string;
  // 操作人账号
  operator: string;
  // 中间件配置
  middlewareConfigs: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      containerServiceName: 'container_service_name',
      containerServiceRevision: 'container_service_revision',
      operator: 'operator',
      middlewareConfigs: 'middleware_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      containerServiceName: 'string',
      containerServiceRevision: 'string',
      operator: 'string',
      middlewareConfigs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContainerserviceMiddlewareconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportOpsplanStagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 容器服务列表
  containerService?: ContainerServiceOperation;
  // Pod分组策略。
  groupStrategy?: string;
  // 工作空间组名称
  workspaceGroupName?: string;
  // 命名空间
  namespace?: string;
  // 目前支持：REBOOT | REPLACE | DEPLOY | SCALEINOUT，其余默认DEPLOY
  operation?: string;
  // 最小分组数
  groupAmount?: number;
  // 每个分组的最大涉及变更pod个数
  maxGroupCapacity?: number;
  // 是否开启beta分组，目前仅在扩缩容场景下使用，默认false
  needBeta?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerService: 'container_service',
      groupStrategy: 'group_strategy',
      workspaceGroupName: 'workspace_group_name',
      namespace: 'namespace',
      operation: 'operation',
      groupAmount: 'group_amount',
      maxGroupCapacity: 'max_group_capacity',
      needBeta: 'need_beta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerService: ContainerServiceOperation,
      groupStrategy: 'string',
      workspaceGroupName: 'string',
      namespace: 'string',
      operation: 'string',
      groupAmount: 'number',
      maxGroupCapacity: 'number',
      needBeta: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportOpsplanStagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 计算的分批结果，包含各批次及其Pods
  batches?: ReleaseBatchObj[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batches: 'batches',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batches: { 'type': 'array', 'itemType': ReleaseBatchObj },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAppMetainfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间组的label：SIT, DEV, ...
  workspaceGroupLabel?: string;
  // 应用名字
  // app:appService在此场景下为1:1，否则会报错
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroupLabel: 'workspace_group_label',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroupLabel: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAppMetainfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间组的名字
  workspaceGroupName?: string;
  // 名称空间
  namespace?: string;
  // 应用服务名字
  containerServiceName?: string;
  // 应用服务当前revision
  containerServiceRevision?: string;
  // 中间件instanceId
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroupName: 'workspace_group_name',
      namespace: 'namespace',
      containerServiceName: 'container_service_name',
      containerServiceRevision: 'container_service_revision',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroupName: 'string',
      namespace: 'string',
      containerServiceName: 'string',
      containerServiceRevision: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  appName: string;
  // 保证请求幂等性
  clientToken?: string;
  // 所属命名空间
  namespace: string;
  // 所属工作空间组
  workspaceGroup: string;
  // sidecar的类型，如mosn，odp
  sidecarConfig: SidecarConfig;
  // 指定sidecar的基线模板版本进行升级，可选，不填时，默认选中指定sidecar的最新版本进行升级
  sidecarVersion?: string;
  // 单元名称
  cellName: string;
  // 要更新的hostname列表
  serverIdentities: string[];
  // 工单id
  orderNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      clientToken: 'client_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      sidecarConfig: 'sidecar_config',
      sidecarVersion: 'sidecar_version',
      cellName: 'cell_name',
      serverIdentities: 'server_identities',
      orderNum: 'order_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      clientToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      sidecarConfig: SidecarConfig,
      sidecarVersion: 'string',
      cellName: 'string',
      serverIdentities: { 'type': 'array', 'itemType': 'string' },
      orderNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 返回被更新的podNumber list；可用于回滚流程的入参
  updatedPodNumbers?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      updatedPodNumbers: 'updated_pod_numbers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      updatedPodNumbers: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountContainerserviceCellreplicasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名称
  containerServiceName: string;
  // 应用服务的名称空间
  namespace: string;
  // 工作空间名称
  workspaceGroupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      namespace: 'namespace',
      workspaceGroupName: 'workspace_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      namespace: 'string',
      workspaceGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountContainerserviceCellreplicasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用服务当前的部署单元，及其部署副本数
  cellReplicasList?: ReplicaCount[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cellReplicasList: 'cell_replicas_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cellReplicasList: { 'type': 'array', 'itemType': ReplicaCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecaropsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // sidecar类型
  sidecarName: string;
  // sidecar版本
  sidecarVersion?: string;
  // 工作空间组
  workspaceGroupId?: string;
  // 工作空间组名
  workspaceGroupLabel: string;
  // 工作空间
  workspaceId?: string;
  // 镜像地址
  image?: string;
  // 可以根据租户名称筛选应用于该租户的基线模板
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      workspaceGroupId: 'workspace_group_id',
      workspaceGroupLabel: 'workspace_group_label',
      workspaceId: 'workspace_id',
      image: 'image',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      workspaceGroupId: 'string',
      workspaceGroupLabel: 'string',
      workspaceId: 'string',
      image: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecaropsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的特定类型的sidecar版本信息列表，只取最近的20条
  sidecarTemplates?: SidecarTemplateMeta[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarTemplates: 'sidecar_templates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarTemplates: { 'type': 'array', 'itemType': SidecarTemplateMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsConsistencyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  appName: string;
  // 请求唯一性验证
  clientToken?: string;
  // 命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 需要更新的cell名称数组
  cellNames: string[];
  // 需要更新的sidecar属性
  sidecarConfig: SidecarConfig;
  // 指定sidecar版本进行升级，不填入此字段时，默认使用对应sidecar的最新版本
  sidecarVersion?: string;
  // 发布单号
  orderNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      clientToken: 'client_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      cellNames: 'cell_names',
      sidecarConfig: 'sidecar_config',
      sidecarVersion: 'sidecar_version',
      orderNum: 'order_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      clientToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      cellNames: { 'type': 'array', 'itemType': 'string' },
      sidecarConfig: SidecarConfig,
      sidecarVersion: 'string',
      orderNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsConsistencyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 已经更新的cell列表
  updatedCells?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      updatedCells: 'updated_cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      updatedCells: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishSidecaropsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  appName: string;
  // 请求token
  clientToken?: string;
  // 命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 请求单号
  orderNum: string;
  // 部署单元列表
  cellNames: string[];
  // sidecar配置
  sidecarConfig: SidecarConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      clientToken: 'client_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      orderNum: 'order_num',
      cellNames: 'cell_names',
      sidecarConfig: 'sidecar_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      clientToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      orderNum: 'string',
      cellNames: { 'type': 'array', 'itemType': 'string' },
      sidecarConfig: SidecarConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishSidecaropsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsStateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  appName: string;
  // 命名空间
  namespace: string;
  // 命名空间组名称
  workspaceGroup: string;
  // 需要查询的部署单元列表
  cellNames: string[];
  // 运维单号
  orderNum: string;
  // sidecar配置
  sidecarConfig: SidecarConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      cellNames: 'cell_names',
      orderNum: 'order_num',
      sidecarConfig: 'sidecar_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      cellNames: { 'type': 'array', 'itemType': 'string' },
      orderNum: 'string',
      sidecarConfig: SidecarConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsStateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sidecar运维状态列表
  releaseInfo?: SidecarReleaseStatus[];
  // 状态
  state?: string;
  // 变更核心所需变更后改动的podIp
  changeTargets?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      releaseInfo: 'release_info',
      state: 'state',
      changeTargets: 'change_targets',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      releaseInfo: { 'type': 'array', 'itemType': SidecarReleaseStatus },
      state: 'string',
      changeTargets: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSidecaropsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // sidecar名称
  sidecarName: string;
  // 镜像地址
  image: string;
  // 新的模板
  template?: string;
  // 基线模板作用域范围，如：["gray", "prod"]，不填时默认全局
  scope?: string[];
  // 版本描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sidecarName: 'sidecar_name',
      image: 'image',
      template: 'template',
      scope: 'scope',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sidecarName: 'string',
      image: 'string',
      template: 'string',
      scope: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSidecaropsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsReleaseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称（借花场景即为应用服务名）
  appName: string;
  // sidecar类型
  sidecarType: string;
  // 工作空间组
  workspaceGroup: string;
  // 命名空间
  namespace: string;
  // 变更单号
  orderNum?: string;
  // 应用服务发布sidecar的版本号，每次发布程序会自己分配一个，可用于作为查询key
  releaseVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      sidecarType: 'sidecar_type',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      orderNum: 'order_num',
      releaseVersion: 'release_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      sidecarType: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      orderNum: 'string',
      releaseVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsReleaseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 所查询版本的实际sidecarConfig信息
  sidecarConfig?: SidecarConfig;
  // 应用服务名
  containerServiceName?: string;
  // sidecar模板的版本号，与应用无关
  sidecarVersion?: string;
  // 发布相关的应用参数，如feature等
  param?: string;
  // 发布所处状态
  status?: string;
  // 以时间戳生成的发布版本号
  releaseVersion?: string;
  // 上一个版本号
  lastReleaseVersion?: string;
  // 执行单号，调用方唯一确定一次发布的单号；
  orderNum?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarConfig: 'sidecar_config',
      containerServiceName: 'container_service_name',
      sidecarVersion: 'sidecar_version',
      param: 'param',
      status: 'status',
      releaseVersion: 'release_version',
      lastReleaseVersion: 'last_release_version',
      orderNum: 'order_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarConfig: SidecarConfig,
      containerServiceName: 'string',
      sidecarVersion: 'string',
      param: 'string',
      status: 'string',
      releaseVersion: 'string',
      lastReleaseVersion: 'string',
      orderNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSidecaropsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名称
  containerServiceName: string;
  // 预留用于防止请求重放
  clientToken?: string;
  // 应用服务所属命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 需要被注入的sidecar配置列表，可以同时注入多个
  sidecarConfigs: SidecarConfig[];
  // 部署单元名称
  cellName: string;
  // 要被注入的pod列表，列表元素为pod的名称
  serverIdentities: string[];
  // 执行单号，所以批次共用同一单号
  orderNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      clientToken: 'client_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      sidecarConfigs: 'sidecar_configs',
      cellName: 'cell_name',
      serverIdentities: 'server_identities',
      orderNum: 'order_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      clientToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      sidecarConfigs: { 'type': 'array', 'itemType': SidecarConfig },
      cellName: 'string',
      serverIdentities: { 'type': 'array', 'itemType': 'string' },
      orderNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSidecaropsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RebootSidecaropsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名
  containerServiceName: string;
  // 防重放
  clientToken?: string;
  // 命名空间
  namespace: string;
  // 工作空间组
  workspaceGroup: string;
  // 部署单元名称
  cellName: string;
  // 需要重启的pod列表，元素值为pod的名称
  serverIdentities: string[];
  // 执行单号
  orderNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      containerServiceName: 'container_service_name',
      clientToken: 'client_token',
      namespace: 'namespace',
      workspaceGroup: 'workspace_group',
      cellName: 'cell_name',
      serverIdentities: 'server_identities',
      orderNum: 'order_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      containerServiceName: 'string',
      clientToken: 'string',
      namespace: 'string',
      workspaceGroup: 'string',
      cellName: 'string',
      serverIdentities: { 'type': 'array', 'itemType': 'string' },
      orderNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RebootSidecaropsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContainerserviceRevisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务名称
  name: string;
  // 版本号
  revision: string;
  // 所属工作空间组
  workspaceGroup: string;
  // 所属命名空间
  namespace: string;
  // 操作人账号
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      revision: 'revision',
      workspaceGroup: 'workspace_group',
      namespace: 'namespace',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      revision: 'string',
      workspaceGroup: 'string',
      namespace: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContainerserviceRevisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContainerserviceApihookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // url地址
  url: string;
  // GET/POST
  httpMethod: string;
  // 请求参数
  queryParams?: string;
  // 请求body
  body?: string;
  // application/x-www-form-urlencoded或application/json
  contentType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      url: 'url',
      httpMethod: 'http_method',
      queryParams: 'query_params',
      body: 'body',
      contentType: 'content_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      url: 'string',
      httpMethod: 'string',
      queryParams: 'string',
      body: 'string',
      contentType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContainerserviceApihookResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回结果
  apiResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiResult: 'api_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsAllservicesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用于label到metaservice换取wsgName
  workspaceGroupLabel: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroupLabel: 'workspace_group_label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroupLabel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySidecaropsAllservicesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 根据wsglabel换到的wsgname
  workspaceGroupName?: string;
  // 所属命名空间
  namespace?: string;
  // 应用服务详细配置信息，主要为sidecar当前在用的参数信息
  servicesSidecarInfo?: AppServiceSidecarReleaseInfo[];
  // 不满足升级条件的服务信息，包含服务不唯一应用及正在升级的应用。
  unsatisfiedServicesInfo?: AppServiceSidecarReleaseInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroupName: 'workspace_group_name',
      namespace: 'namespace',
      servicesSidecarInfo: 'services_sidecar_info',
      unsatisfiedServicesInfo: 'unsatisfied_services_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroupName: 'string',
      namespace: 'string',
      servicesSidecarInfo: { 'type': 'array', 'itemType': AppServiceSidecarReleaseInfo },
      unsatisfiedServicesInfo: { 'type': 'array', 'itemType': AppServiceSidecarReleaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的sidecar名称
  sidecarName: string;
  // 指定要更新的sidecar版本
  sidecarVersion?: string;
  // 根据image筛选要更新的基线
  image?: string;
  // 要更新的sidecar模板
  template?: string;
  // 要设置成的scope
  scope?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      image: 'image',
      template: 'template',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      image: 'string',
      template: 'string',
      scope: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecaropsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeploymentTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板编码
  name: string;
  // 中文名称
  displayName: string;
  // 模板描述
  description?: string;
  // 是否覆盖版本中的发布策略
  overrideDeployConfig: boolean;
  // 发布策略
  deployConfig?: DeployConfig;
  // 是否开启变更卡点
  enableCustomHook: boolean;
  // 卡点类型：api或has
  hookType?: string;
  // 自定义卡点配置列表
  customHooks?: CustomHook[];
  // 操作人
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      description: 'description',
      overrideDeployConfig: 'override_deploy_config',
      deployConfig: 'deploy_config',
      enableCustomHook: 'enable_custom_hook',
      hookType: 'hook_type',
      customHooks: 'custom_hooks',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      description: 'string',
      overrideDeployConfig: 'boolean',
      deployConfig: DeployConfig,
      enableCustomHook: 'boolean',
      hookType: 'string',
      customHooks: { 'type': 'array', 'itemType': CustomHook },
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeploymentTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnireleaseSolutionfilesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日期
  date: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnireleaseSolutionfilesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布方案列表
  solutionFiles?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      solutionFiles: 'solution_files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      solutionFiles: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseSolutionfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // Sftp目录：/sftp/linkw/unionpay/date/id/prod/timestamp-solution.json
  // 
  filePath: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      filePath: 'file_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      filePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnireleaseSolutionfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布方案内容，Json文件
  soultionContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      soultionContent: 'soultion_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      soultionContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeploymentTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板编码
  name: string;
  // 中文名称
  displayName: string;
  // 模板描述
  description?: string;
  // 是否覆盖版本中的发布策略
  overrideDeployConfig: boolean;
  // 发布策略
  deployConfig?: DeployConfig;
  // 是否开启变更卡点
  enableCustomHook: boolean;
  // 卡点类型：api或has
  hookType?: string;
  // 自定义卡点配置列表
  customHooks?: CustomHook[];
  // 操作人
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      description: 'description',
      overrideDeployConfig: 'override_deploy_config',
      deployConfig: 'deploy_config',
      enableCustomHook: 'enable_custom_hook',
      hookType: 'hook_type',
      customHooks: 'custom_hooks',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      description: 'string',
      overrideDeployConfig: 'boolean',
      deployConfig: DeployConfig,
      enableCustomHook: 'boolean',
      hookType: 'string',
      customHooks: { 'type': 'array', 'itemType': CustomHook },
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeploymentTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDeploymentTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板编码或名称模糊搜索
  name?: string;
  // 当前页码，从1开始，默认为1
  pageNumber?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询方式，默认FUZZY，模糊查询
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDeploymentTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  totalCount?: number;
  // 模板列表
  data?: DeploymentTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': DeploymentTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDeploymentTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板编码
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDeploymentTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEmergencyPlansRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 预案名称
  name?: string;
  // 当前第几页
  pageNumber?: number;
  // 每页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEmergencyPlansResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  totalCount?: number;
  // 预案列表
  data?: EmergencyPlan[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': EmergencyPlan },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceGrayreleaseconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单的time series id
  timeSeriesId?: string;
  // lks service id，与plan_id同时传时前者生效。
  lksServiceId?: string;
  // 灰度规则
  grayReleaseConfig: GrayReleaseConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      timeSeriesId: 'time_series_id',
      lksServiceId: 'lks_service_id',
      grayReleaseConfig: 'gray_release_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      timeSeriesId: 'string',
      lksServiceId: 'string',
      grayReleaseConfig: GrayReleaseConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContainerserviceGrayreleaseconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserivceGrayreleaseconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发布单的time_series_id
  timeSeriesId?: string;
  // lks service的id，如果time_series_id与lks_service_id同时指定，后者生效
  lksServiceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      timeSeriesId: 'time_series_id',
      lksServiceId: 'lks_service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      timeSeriesId: 'string',
      lksServiceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContainerserivceGrayreleaseconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 灰度发布配置
  grayReleaseConfig?: GrayReleaseConfig;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      grayReleaseConfig: 'gray_release_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      grayReleaseConfig: GrayReleaseConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client {
  _endpoint: string;
  _regionId: string;
  _accessKeyId: string;
  _accessKeySecret: string;
  _protocol: string;
  _userAgent: string;
  _readTimeout: number;
  _connectTimeout: number;
  _httpProxy: string;
  _httpsProxy: string;
  _socks5Proxy: string;
  _socks5NetWork: string;
  _noProxy: string;
  _maxIdleConns: number;
  _securityToken: string;
  _maxIdleTimeMillis: number;
  _keepAliveDurationMillis: number;
  _maxRequests: number;
  _maxRequestsPerHost: number;

  /**
   * Init client with Config
   * @param config config contains the necessary information to create a client
   */
  constructor(config: Config) {
    if (Util.isUnset($tea.toMap(config))) {
      throw $tea.newError({
        code: "ParameterMissing",
        message: "'config' can not be unset",
      });
    }

    this._accessKeyId = config.accessKeyId;
    this._accessKeySecret = config.accessKeySecret;
    this._securityToken = config.securityToken;
    this._endpoint = config.endpoint;
    this._protocol = config.protocol;
    this._userAgent = config.userAgent;
    this._readTimeout = Util.defaultNumber(config.readTimeout, 20000);
    this._connectTimeout = Util.defaultNumber(config.connectTimeout, 20000);
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = Util.defaultNumber(config.maxIdleConns, 60000);
    this._maxIdleTimeMillis = Util.defaultNumber(config.maxIdleTimeMillis, 5);
    this._keepAliveDurationMillis = Util.defaultNumber(config.keepAliveDurationMillis, 5000);
    this._maxRequests = Util.defaultNumber(config.maxRequests, 100);
    this._maxRequestsPerHost = Util.defaultNumber(config.maxRequestsPerHost, 100);
  }

  /**
   * Encapsulate the request and invoke the network
   * @param action api name
   * @param protocol http or https
   * @param method e.g. GET
   * @param pathname pathname of every api
   * @param request which contains request params
   * @param runtime which controls some details of call api, such as retry times
   * @return the response
   */
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
      maxIdleTimeMillis: this._maxIdleTimeMillis,
      keepAliveDurationMillis: this._keepAliveDurationMillis,
      maxRequests: this._maxRequests,
      maxRequestsPerHost: this._maxRequestsPerHost,
      retry: {
        retryable: runtime.autoretry,
        maxAttempts: Util.defaultNumber(runtime.maxAttempts, 3),
      },
      backoff: {
        policy: Util.defaultString(runtime.backoffPolicy, "no"),
        period: Util.defaultNumber(runtime.backoffPeriod, 1),
      },
      ignoreSSL: runtime.ignoreSSL,
    }

    let _lastRequest = null;
    let _now = Date.now();
    let _retryTimes = 0;
    while ($tea.allowRetry(_runtime['retry'], _retryTimes, _now)) {
      if (_retryTimes > 0) {
        let _backoffTime = $tea.getBackoffTime(_runtime['backoff'], _retryTimes);
        if (_backoffTime > 0) {
          await $tea.sleep(_backoffTime);
        }
      }

      _retryTimes = _retryTimes + 1;
      try {
        let request_ = new $tea.Request();
        request_.protocol = Util.defaultString(this._protocol, protocol);
        request_.method = method;
        request_.pathname = pathname;
        request_.query = {
          method: action,
          version: version,
          sign_type: "HmacSHA1",
          req_time: AntchainUtil.getTimestamp(),
          req_msg_id: AntchainUtil.getNonce(),
          access_key: this._accessKeyId,
          base_sdk_version: "TeaSDK-2.0",
          sdk_version: "1.12.15",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "openapi.antchain.antgroup.com"),
          'user-agent': Util.getUserAgent(this._userAgent),
          ...headers,
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AntchainUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let raw = await Util.readAsString(response_.body);
        let obj = Util.parseJSON(raw);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AntchainUtil.hasError(raw, this._accessKeySecret)) {
          throw $tea.newError({
            message: resp["result_msg"],
            data: resp,
            code: resp["result_code"],
          });
        }

        return resp;
      } catch (ex) {
        if ($tea.isRetryable(ex)) {
          continue;
        }
        throw ex;
      }
    }

    throw $tea.newUnretryableError(_lastRequest);
  }

  /**
   * Description: 关联单元化应用服务实例
   * Summary: 关联单元化应用服务实例
   */
  async bindAppservice(request: BindAppserviceRequest): Promise<BindAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 关联单元化应用服务实例
   * Summary: 关联单元化应用服务实例
   */
  async bindAppserviceEx(request: BindAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAppserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.appservice.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAppserviceResponse({}));
  }

  /**
   * Description: 解除关联的单元化应用服务实例
   * Summary: 解除关联的单元化应用服务实例
   */
  async unbindAppservice(request: UnbindAppserviceRequest): Promise<UnbindAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 解除关联的单元化应用服务实例
   * Summary: 解除关联的单元化应用服务实例
   */
  async unbindAppserviceEx(request: UnbindAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindAppserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.appservice.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindAppserviceResponse({}));
  }

  /**
   * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
   * Summary: 创建一个应用运维单
   */
  async createAppops(request: CreateAppopsRequest): Promise<CreateAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
   * Summary: 创建一个应用运维单
   */
  async createAppopsEx(request: CreateAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppopsResponse({}));
  }

  /**
   * Description: 查询一个已经创建成功的部署操作
   * Summary: 查询一个已经创建成功的部署操作。
   */
  async getAppops(request: GetAppopsRequest): Promise<GetAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个已经创建成功的部署操作
   * Summary: 查询一个已经创建成功的部署操作。
   */
  async getAppopsEx(request: GetAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppopsResponse({}));
  }

  /**
   * Description: 查询一个运维操作中某个应用的详情
   * Summary: 查询一个运维操作中某个应用的详情
   */
  async getAppopsApplication(request: GetAppopsApplicationRequest): Promise<GetAppopsApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppopsApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个运维操作中某个应用的详情
   * Summary: 查询一个运维操作中某个应用的详情
   */
  async getAppopsApplicationEx(request: GetAppopsApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppopsApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppopsApplicationResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.application.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppopsApplicationResponse({}));
  }

  /**
   * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始执行一个已经创建成功的运维操作。
   */
  async startAppops(request: StartAppopsRequest): Promise<StartAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始执行一个已经创建成功的运维操作。
   */
  async startAppopsEx(request: StartAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAppopsResponse({}));
  }

  /**
   * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化一个初始化失败的运维单。
   */
  async reinitAppops(request: ReinitAppopsRequest): Promise<ReinitAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化一个初始化失败的运维单。
   */
  async reinitAppopsEx(request: ReinitAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitAppopsResponse({}));
  }

  /**
   * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
   * Summary: 对一个运维单执行取消操作。
   */
  async cancelAppops(request: CancelAppopsRequest): Promise<CancelAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
   * Summary: 对一个运维单执行取消操作。
   */
  async cancelAppopsEx(request: CancelAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAppopsResponse({}));
  }

  /**
   * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryAppops(request: RetryAppopsRequest): Promise<RetryAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryAppopsEx(request: RetryAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAppopsResponse>(await this.doRequest("1.0", "antcloud.ldc.appops.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAppopsResponse({}));
  }

  /**
   * Description: 查询发布单
   * Summary: 查询发布单
   */
  async getDeployment(request: GetDeploymentRequest): Promise<GetDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布单
   * Summary: 查询发布单
   */
  async getDeploymentEx(request: GetDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeploymentResponse({}));
  }

  /**
   * Description: 查询部署单中某个应用的详情
   * Summary: 查询部署单中某个应用的详情
   */
  async getDeploymentApplication(request: GetDeploymentApplicationRequest): Promise<GetDeploymentApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeploymentApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单中某个应用的详情
   * Summary: 查询部署单中某个应用的详情
   */
  async getDeploymentApplicationEx(request: GetDeploymentApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeploymentApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeploymentApplicationResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.application.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeploymentApplicationResponse({}));
  }

  /**
   * Description: 查询部署单中某个应用的回滚详情
   * Summary: 查询部署单中某个应用的回滚详情
   */
  async getDeploymentRollback(request: GetDeploymentRollbackRequest): Promise<GetDeploymentRollbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeploymentRollbackEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单中某个应用的回滚详情
   * Summary: 查询部署单中某个应用的回滚详情
   */
  async getDeploymentRollbackEx(request: GetDeploymentRollbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeploymentRollbackResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeploymentRollbackResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.rollback.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeploymentRollbackResponse({}));
  }

  /**
   * Description: 查询可回滚的版本信息
   * Summary: 查询可回滚的版本信息
   */
  async queryDeploymentRollbackable(request: QueryDeploymentRollbackableRequest): Promise<QueryDeploymentRollbackableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeploymentRollbackableEx(request, headers, runtime);
  }

  /**
   * Description: 查询可回滚的版本信息
   * Summary: 查询可回滚的版本信息
   */
  async queryDeploymentRollbackableEx(request: QueryDeploymentRollbackableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeploymentRollbackableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeploymentRollbackableResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.rollbackable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeploymentRollbackableResponse({}));
  }

  /**
   * Description: 回滚指定的应用
   * Summary: 回滚指定的应用
   */
  async rollbackDeploymentApplication(request: RollbackDeploymentApplicationRequest): Promise<RollbackDeploymentApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackDeploymentApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 回滚指定的应用
   * Summary: 回滚指定的应用
   */
  async rollbackDeploymentApplicationEx(request: RollbackDeploymentApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackDeploymentApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackDeploymentApplicationResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.application.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackDeploymentApplicationResponse({}));
  }

  /**
   * Description: 推送 LDC 流量规则
   * Summary: 推送 LDC 流量规则
   */
  async pushFlowRouteclient(request: PushFlowRouteclientRequest): Promise<PushFlowRouteclientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushFlowRouteclientEx(request, headers, runtime);
  }

  /**
   * Description: 推送 LDC 流量规则
   * Summary: 推送 LDC 流量规则
   */
  async pushFlowRouteclientEx(request: PushFlowRouteclientRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushFlowRouteclientResponse> {
    Util.validateModel(request);
    return $tea.cast<PushFlowRouteclientResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.routeclient.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushFlowRouteclientResponse({}));
  }

  /**
   * Description: fedNamespace创建
   * Summary: FedNamespace创建
   */
  async createFederationNamespace(request: CreateFederationNamespaceRequest): Promise<CreateFederationNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFederationNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: fedNamespace创建
   * Summary: FedNamespace创建
   */
  async createFederationNamespaceEx(request: CreateFederationNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFederationNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFederationNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.namespace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFederationNamespaceResponse({}));
  }

  /**
   * Description: FedNamespace更新API
   * Summary: FedNamespace更新
   */
  async updateFederationNamespace(request: UpdateFederationNamespaceRequest): Promise<UpdateFederationNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFederationNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: FedNamespace更新API
   * Summary: FedNamespace更新
   */
  async updateFederationNamespaceEx(request: UpdateFederationNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFederationNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFederationNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.namespace.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFederationNamespaceResponse({}));
  }

  /**
   * Description: 获取单个FedNamespace 
   * Summary: FedNamespace get
   */
  async getFederationNamespace(request: GetFederationNamespaceRequest): Promise<GetFederationNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFederationNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个FedNamespace 
   * Summary: FedNamespace get
   */
  async getFederationNamespaceEx(request: GetFederationNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFederationNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFederationNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.namespace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFederationNamespaceResponse({}));
  }

  /**
   * Description: FedNamespace 删除
   * Summary: FedNamespace 删除
   */
  async deleteFederationNamespace(request: DeleteFederationNamespaceRequest): Promise<DeleteFederationNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFederationNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: FedNamespace 删除
   * Summary: FedNamespace 删除
   */
  async deleteFederationNamespaceEx(request: DeleteFederationNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFederationNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFederationNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.namespace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFederationNamespaceResponse({}));
  }

  /**
   * Description: 创建FedConfigMap
   * Summary: 创建FedConfigMap
   */
  async createFederationConfigmap(request: CreateFederationConfigmapRequest): Promise<CreateFederationConfigmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFederationConfigmapEx(request, headers, runtime);
  }

  /**
   * Description: 创建FedConfigMap
   * Summary: 创建FedConfigMap
   */
  async createFederationConfigmapEx(request: CreateFederationConfigmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFederationConfigmapResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFederationConfigmapResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.configmap.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFederationConfigmapResponse({}));
  }

  /**
   * Description: FedConfigMap更新
   * Summary: FedConfigMap更新
   */
  async updateFederationConfigmap(request: UpdateFederationConfigmapRequest): Promise<UpdateFederationConfigmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFederationConfigmapEx(request, headers, runtime);
  }

  /**
   * Description: FedConfigMap更新
   * Summary: FedConfigMap更新
   */
  async updateFederationConfigmapEx(request: UpdateFederationConfigmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFederationConfigmapResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFederationConfigmapResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.configmap.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFederationConfigmapResponse({}));
  }

  /**
   * Description: FedConfigMap Get
   * Summary: FedConfigMap Get
   */
  async getFederationConfigmap(request: GetFederationConfigmapRequest): Promise<GetFederationConfigmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFederationConfigmapEx(request, headers, runtime);
  }

  /**
   * Description: FedConfigMap Get
   * Summary: FedConfigMap Get
   */
  async getFederationConfigmapEx(request: GetFederationConfigmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFederationConfigmapResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFederationConfigmapResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.configmap.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFederationConfigmapResponse({}));
  }

  /**
   * Description: FedConfigMap 删除
   * Summary: FedConfigMap 删除
   */
  async deleteFederationConfigmap(request: DeleteFederationConfigmapRequest): Promise<DeleteFederationConfigmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFederationConfigmapEx(request, headers, runtime);
  }

  /**
   * Description: FedConfigMap 删除
   * Summary: FedConfigMap 删除
   */
  async deleteFederationConfigmapEx(request: DeleteFederationConfigmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFederationConfigmapResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFederationConfigmapResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.configmap.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFederationConfigmapResponse({}));
  }

  /**
   * Description: FedConfigMap List
   * Summary: FedConfigMap List
   */
  async listFederationConfigmap(request: ListFederationConfigmapRequest): Promise<ListFederationConfigmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFederationConfigmapEx(request, headers, runtime);
  }

  /**
   * Description: FedConfigMap List
   * Summary: FedConfigMap List
   */
  async listFederationConfigmapEx(request: ListFederationConfigmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFederationConfigmapResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFederationConfigmapResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.configmap.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFederationConfigmapResponse({}));
  }

  /**
   * Description: List FeNamespace 
   * Summary: List FeNamespace 
   */
  async listFederationNamespace(request: ListFederationNamespaceRequest): Promise<ListFederationNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFederationNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: List FeNamespace 
   * Summary: List FeNamespace 
   */
  async listFederationNamespaceEx(request: ListFederationNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFederationNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFederationNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.namespace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFederationNamespaceResponse({}));
  }

  /**
   * Description: 查询容器应用服务OpenAPI
   * Summary: 查询容器应用服务
   */
  async queryContainerservice(request: QueryContainerserviceRequest): Promise<QueryContainerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContainerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询容器应用服务OpenAPI
   * Summary: 查询容器应用服务
   */
  async queryContainerserviceEx(request: QueryContainerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContainerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContainerserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContainerserviceResponse({}));
  }

  /**
   * Description: get master clusters for each zone
   * Summary: getMasterClusters
   */
  async listMulticlusterMastercluster(request: ListMulticlusterMasterclusterRequest): Promise<ListMulticlusterMasterclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMulticlusterMasterclusterEx(request, headers, runtime);
  }

  /**
   * Description: get master clusters for each zone
   * Summary: getMasterClusters
   */
  async listMulticlusterMasterclusterEx(request: ListMulticlusterMasterclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMulticlusterMasterclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMulticlusterMasterclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.multicluster.mastercluster.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMulticlusterMasterclusterResponse({}));
  }

  /**
   * Description: import master clusters
   * Summary: importMasterCluster
   */
  async initMulticlusterCluster(request: InitMulticlusterClusterRequest): Promise<InitMulticlusterClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initMulticlusterClusterEx(request, headers, runtime);
  }

  /**
   * Description: import master clusters
   * Summary: importMasterCluster
   */
  async initMulticlusterClusterEx(request: InitMulticlusterClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitMulticlusterClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<InitMulticlusterClusterResponse>(await this.doRequest("1.0", "antcloud.ldc.multicluster.cluster.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitMulticlusterClusterResponse({}));
  }

  /**
   * Description: list multi clusters
   * Summary: list MultiCluster
   */
  async listMulticluster(request: ListMulticlusterRequest): Promise<ListMulticlusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMulticlusterEx(request, headers, runtime);
  }

  /**
   * Description: list multi clusters
   * Summary: list MultiCluster
   */
  async listMulticlusterEx(request: ListMulticlusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMulticlusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMulticlusterResponse>(await this.doRequest("1.0", "antcloud.ldc.multicluster.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMulticlusterResponse({}));
  }

  /**
   * Description: 删除容器应用服务
   * Summary: 删除容器应用服务
   */
  async deleteContainerservice(request: DeleteContainerserviceRequest): Promise<DeleteContainerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContainerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 删除容器应用服务
   * Summary: 删除容器应用服务
   */
  async deleteContainerserviceEx(request: DeleteContainerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContainerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContainerserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContainerserviceResponse({}));
  }

  /**
   * Description: 创建一个部署单
   * Summary: 创建一个部署单
   */
  async createContainerserviceDeployment(request: CreateContainerserviceDeploymentRequest): Promise<CreateContainerserviceDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContainerserviceDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个部署单
   * Summary: 创建一个部署单
   */
  async createContainerserviceDeploymentEx(request: CreateContainerserviceDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContainerserviceDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContainerserviceDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContainerserviceDeploymentResponse({}));
  }

  /**
   * Description: 创建FedSecret
   * Summary: 创建FedSecret
   */
  async createFederationSecret(request: CreateFederationSecretRequest): Promise<CreateFederationSecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFederationSecretEx(request, headers, runtime);
  }

  /**
   * Description: 创建FedSecret
   * Summary: 创建FedSecret
   */
  async createFederationSecretEx(request: CreateFederationSecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFederationSecretResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFederationSecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.secret.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFederationSecretResponse({}));
  }

  /**
   * Description: FedSecret Get
   * Summary: FedSecret Get
   */
  async getFederationSecret(request: GetFederationSecretRequest): Promise<GetFederationSecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFederationSecretEx(request, headers, runtime);
  }

  /**
   * Description: FedSecret Get
   * Summary: FedSecret Get
   */
  async getFederationSecretEx(request: GetFederationSecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFederationSecretResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFederationSecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.secret.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFederationSecretResponse({}));
  }

  /**
   * Description: FedSecret 删除
   * Summary: FedSecret 删除
   */
  async deleteFederationSecret(request: DeleteFederationSecretRequest): Promise<DeleteFederationSecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFederationSecretEx(request, headers, runtime);
  }

  /**
   * Description: FedSecret 删除
   * Summary: FedSecret 删除
   */
  async deleteFederationSecretEx(request: DeleteFederationSecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFederationSecretResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFederationSecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.secret.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFederationSecretResponse({}));
  }

  /**
   * Description: FedSecret 更新
   * Summary: FedSecret 更新
   */
  async updateFederationSecret(request: UpdateFederationSecretRequest): Promise<UpdateFederationSecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFederationSecretEx(request, headers, runtime);
  }

  /**
   * Description: FedSecret 更新
   * Summary: FedSecret 更新
   */
  async updateFederationSecretEx(request: UpdateFederationSecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFederationSecretResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFederationSecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.secret.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFederationSecretResponse({}));
  }

  /**
   * Description: FedSecret List
   * Summary: FedSecret List
   */
  async listFederationSecret(request: ListFederationSecretRequest): Promise<ListFederationSecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFederationSecretEx(request, headers, runtime);
  }

  /**
   * Description: FedSecret List
   * Summary: FedSecret List
   */
  async listFederationSecretEx(request: ListFederationSecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFederationSecretResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFederationSecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.secret.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFederationSecretResponse({}));
  }

  /**
   * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
  调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
   * Summary: 获取容器服务最新发布的版本
   */
  async describeContainerserviceRevision(request: DescribeContainerserviceRevisionRequest): Promise<DescribeContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
  调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
   * Summary: 获取容器服务最新发布的版本
   */
  async describeContainerserviceRevisionEx(request: DescribeContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeContainerserviceRevisionResponse({}));
  }

  /**
   * Description: 获取某一个版本的配置信息
   * Summary: 获取某一个版本的配置信息
   */
  async getContainerserviceRevision(request: GetContainerserviceRevisionRequest): Promise<GetContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 获取某一个版本的配置信息
   * Summary: 获取某一个版本的配置信息
   */
  async getContainerserviceRevisionEx(request: GetContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContainerserviceRevisionResponse({}));
  }

  /**
   * Description: 查询容器服务版本列表
   * Summary: 查询容器服务版本列表
   */
  async queryContainerserviceRevision(request: QueryContainerserviceRevisionRequest): Promise<QueryContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 查询容器服务版本列表
   * Summary: 查询容器服务版本列表
   */
  async queryContainerserviceRevisionEx(request: QueryContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContainerserviceRevisionResponse({}));
  }

  /**
   * Description: 为某一版本加上备注
   * Summary: 为某一版本加上备注
   */
  async updateContainerserviceRevision(request: UpdateContainerserviceRevisionRequest): Promise<UpdateContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 为某一版本加上备注
   * Summary: 为某一版本加上备注
   */
  async updateContainerserviceRevisionEx(request: UpdateContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceRevisionResponse({}));
  }

  /**
   * Description: 快速更新镜像
   * Summary: 快速更新镜像
   */
  async updateContainerserviceImage(request: UpdateContainerserviceImageRequest): Promise<UpdateContainerserviceImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceImageEx(request, headers, runtime);
  }

  /**
   * Description: 快速更新镜像
   * Summary: 快速更新镜像
   */
  async updateContainerserviceImageEx(request: UpdateContainerserviceImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceImageResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceImageResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.image.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceImageResponse({}));
  }

  /**
   * Description: 快速更新容器服务副本数
   * Summary: 快速更新容器服务副本数
   */
  async updateContainerserviceReplicas(request: UpdateContainerserviceReplicasRequest): Promise<UpdateContainerserviceReplicasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceReplicasEx(request, headers, runtime);
  }

  /**
   * Description: 快速更新容器服务副本数
   * Summary: 快速更新容器服务副本数
   */
  async updateContainerserviceReplicasEx(request: UpdateContainerserviceReplicasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceReplicasResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceReplicasResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.replicas.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceReplicasResponse({}));
  }

  /**
   * Description: 创建容器应用服务。
   * Summary: 创建容器应用服务
   */
  async createContainerservice(request: CreateContainerserviceRequest): Promise<CreateContainerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContainerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 创建容器应用服务。
   * Summary: 创建容器应用服务
   */
  async createContainerserviceEx(request: CreateContainerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContainerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContainerserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContainerserviceResponse({}));
  }

  /**
   * Description: 保存容器服务草稿。
   * Summary: 保存容器服务草稿
   */
  async saveContainerserviceRevision(request: SaveContainerserviceRevisionRequest): Promise<SaveContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 保存容器服务草稿。
   * Summary: 保存容器服务草稿
   */
  async saveContainerserviceRevisionEx(request: SaveContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveContainerserviceRevisionResponse({}));
  }

  /**
   * Description: container service 更新
   * Summary: container service 更新
   */
  async updateContainerservice(request: UpdateContainerserviceRequest): Promise<UpdateContainerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceEx(request, headers, runtime);
  }

  /**
   * Description: container service 更新
   * Summary: container service 更新
   */
  async updateContainerserviceEx(request: UpdateContainerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceResponse({}));
  }

  /**
   * Description: 检查对应容器服务是否存在。
   * Summary: 检查对应容器服务是否存在
   */
  async existContainerservice(request: ExistContainerserviceRequest): Promise<ExistContainerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existContainerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 检查对应容器服务是否存在。
   * Summary: 检查对应容器服务是否存在
   */
  async existContainerserviceEx(request: ExistContainerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistContainerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistContainerserviceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistContainerserviceResponse({}));
  }

  /**
   * Description: get cluster basic info by name
   * Summary: getClusterBasicInfo
   */
  async getClusterBasicinfo(request: GetClusterBasicinfoRequest): Promise<GetClusterBasicinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getClusterBasicinfoEx(request, headers, runtime);
  }

  /**
   * Description: get cluster basic info by name
   * Summary: getClusterBasicInfo
   */
  async getClusterBasicinfoEx(request: GetClusterBasicinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetClusterBasicinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetClusterBasicinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.basicinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetClusterBasicinfoResponse({}));
  }

  /**
   * Description: get cluster overview info 
   * Summary: getClusterOverview
   */
  async getClusterOverviewinfo(request: GetClusterOverviewinfoRequest): Promise<GetClusterOverviewinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getClusterOverviewinfoEx(request, headers, runtime);
  }

  /**
   * Description: get cluster overview info 
   * Summary: getClusterOverview
   */
  async getClusterOverviewinfoEx(request: GetClusterOverviewinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetClusterOverviewinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetClusterOverviewinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.overviewinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetClusterOverviewinfoResponse({}));
  }

  /**
   * Description: 查询部署单元。
   * Summary: 查询部署单元
   */
  async queryCell(request: QueryCellRequest): Promise<QueryCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元。
   * Summary: 查询部署单元
   */
  async queryCellEx(request: QueryCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCellResponse({}));
  }

  /**
   * Description: get pod overview infos of specific cluster
   * Summary: getPodOverviewInfo
   */
  async getClusterPodoverview(request: GetClusterPodoverviewRequest): Promise<GetClusterPodoverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getClusterPodoverviewEx(request, headers, runtime);
  }

  /**
   * Description: get pod overview infos of specific cluster
   * Summary: getPodOverviewInfo
   */
  async getClusterPodoverviewEx(request: GetClusterPodoverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetClusterPodoverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetClusterPodoverviewResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.podoverview.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetClusterPodoverviewResponse({}));
  }

  /**
   * Description: list all nodes info of specific cluster
   * Summary: listNodeInfo
   */
  async listClusterNodeinfo(request: ListClusterNodeinfoRequest): Promise<ListClusterNodeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterNodeinfoEx(request, headers, runtime);
  }

  /**
   * Description: list all nodes info of specific cluster
   * Summary: listNodeInfo
   */
  async listClusterNodeinfoEx(request: ListClusterNodeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterNodeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterNodeinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.nodeinfo.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterNodeinfoResponse({}));
  }

  /**
   * Description: create namespace of a specific cluster
   * Summary: createNamespace
   */
  async createClusterNamespace(request: CreateClusterNamespaceRequest): Promise<CreateClusterNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createClusterNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: create namespace of a specific cluster
   * Summary: createNamespace
   */
  async createClusterNamespaceEx(request: CreateClusterNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateClusterNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateClusterNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.namespace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateClusterNamespaceResponse({}));
  }

  /**
   * Description: list namespace
   * Summary: list namespace
   */
  async listClusterNamespace(request: ListClusterNamespaceRequest): Promise<ListClusterNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: list namespace
   * Summary: list namespace
   */
  async listClusterNamespaceEx(request: ListClusterNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.namespace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterNamespaceResponse({}));
  }

  /**
   * Description: query namespace detail info
   * Summary: query namespace 
   */
  async queryClusterNamespace(request: QueryClusterNamespaceRequest): Promise<QueryClusterNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: query namespace detail info
   * Summary: query namespace 
   */
  async queryClusterNamespaceEx(request: QueryClusterNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.namespace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterNamespaceResponse({}));
  }

  /**
   * Description: delete namespace of specific cluster
   * Summary: delete namespace
   */
  async deleteClusterNamespace(request: DeleteClusterNamespaceRequest): Promise<DeleteClusterNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteClusterNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: delete namespace of specific cluster
   * Summary: delete namespace
   */
  async deleteClusterNamespaceEx(request: DeleteClusterNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteClusterNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteClusterNamespaceResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.namespace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteClusterNamespaceResponse({}));
  }

  /**
   * Description: get node detail info by name
   * Summary: get node detail info
   */
  async getClusterNodeinfo(request: GetClusterNodeinfoRequest): Promise<GetClusterNodeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getClusterNodeinfoEx(request, headers, runtime);
  }

  /**
   * Description: get node detail info by name
   * Summary: get node detail info
   */
  async getClusterNodeinfoEx(request: GetClusterNodeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetClusterNodeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetClusterNodeinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.nodeinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetClusterNodeinfoResponse({}));
  }

  /**
   * Description: ImagePullSecret创建
   * Summary: ImagePullSecret创建
   */
  async createFederationImagepullsecret(request: CreateFederationImagepullsecretRequest): Promise<CreateFederationImagepullsecretResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFederationImagepullsecretEx(request, headers, runtime);
  }

  /**
   * Description: ImagePullSecret创建
   * Summary: ImagePullSecret创建
   */
  async createFederationImagepullsecretEx(request: CreateFederationImagepullsecretRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFederationImagepullsecretResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFederationImagepullsecretResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.imagepullsecret.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFederationImagepullsecretResponse({}));
  }

  /**
   * Description: list all pods of specific node
   * Summary: listtPodsOfNode
   */
  async listClusterNodepod(request: ListClusterNodepodRequest): Promise<ListClusterNodepodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterNodepodEx(request, headers, runtime);
  }

  /**
   * Description: list all pods of specific node
   * Summary: listtPodsOfNode
   */
  async listClusterNodepodEx(request: ListClusterNodepodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterNodepodResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterNodepodResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.nodepod.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterNodepodResponse({}));
  }

  /**
   * Description: list all events of specific node
   * Summary: listEventOfNode
   */
  async listClusterNodeevent(request: ListClusterNodeeventRequest): Promise<ListClusterNodeeventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterNodeeventEx(request, headers, runtime);
  }

  /**
   * Description: list all events of specific node
   * Summary: listEventOfNode
   */
  async listClusterNodeeventEx(request: ListClusterNodeeventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterNodeeventResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterNodeeventResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.nodeevent.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterNodeeventResponse({}));
  }

  /**
   * Description: 分页查询发布单列表
   * Summary: 分页查询发布单列表
   */
  async queryOpsplan(request: QueryOpsplanRequest): Promise<QueryOpsplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询发布单列表
   * Summary: 分页查询发布单列表
   */
  async queryOpsplanEx(request: QueryOpsplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanResponse({}));
  }

  /**
   * Description: 分页查询发布单状态概要列表
   * Summary: 分页查询发布单状态概要列表
   */
  async queryOpsplanStatesummary(request: QueryOpsplanStatesummaryRequest): Promise<QueryOpsplanStatesummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanStatesummaryEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询发布单状态概要列表
   * Summary: 分页查询发布单状态概要列表
   */
  async queryOpsplanStatesummaryEx(request: QueryOpsplanStatesummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanStatesummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanStatesummaryResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.statesummary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanStatesummaryResponse({}));
  }

  /**
   * Description: 发布/运维单详情查询
   * Summary: 发布/运维单详情查询
   */
  async queryOpsplanDetail(request: QueryOpsplanDetailRequest): Promise<QueryOpsplanDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanDetailEx(request, headers, runtime);
  }

  /**
   * Description: 发布/运维单详情查询
   * Summary: 发布/运维单详情查询
   */
  async queryOpsplanDetailEx(request: QueryOpsplanDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanDetailResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanDetailResponse({}));
  }

  /**
   * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
   * Summary: 查询公共的以及租户内自定义技术栈分类
   */
  async queryBuildpackTechstack(request: QueryBuildpackTechstackRequest): Promise<QueryBuildpackTechstackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackTechstackEx(request, headers, runtime);
  }

  /**
   * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
   * Summary: 查询公共的以及租户内自定义技术栈分类
   */
  async queryBuildpackTechstackEx(request: QueryBuildpackTechstackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackTechstackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackTechstackResponse>(await this.doRequest("1.0", "antcloud.ldc.buildpack.techstack.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackTechstackResponse({}));
  }

  /**
   * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
  e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
   * Summary: 获取云原生技术栈小版本列表信息
   */
  async queryBuildpackNativetechstackversion(request: QueryBuildpackNativetechstackversionRequest): Promise<QueryBuildpackNativetechstackversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackNativetechstackversionEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
  e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
   * Summary: 获取云原生技术栈小版本列表信息
   */
  async queryBuildpackNativetechstackversionEx(request: QueryBuildpackNativetechstackversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackNativetechstackversionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackNativetechstackversionResponse>(await this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackNativetechstackversionResponse({}));
  }

  /**
   * Description: 更新容器应用服务的云原生技术栈版本。
  e.g: 更新为 ce44610
   * Summary: 更新容器应用服务对应的云原生技术栈版本
   */
  async updateContainerserviceNativebpversion(request: UpdateContainerserviceNativebpversionRequest): Promise<UpdateContainerserviceNativebpversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceNativebpversionEx(request, headers, runtime);
  }

  /**
   * Description: 更新容器应用服务的云原生技术栈版本。
  e.g: 更新为 ce44610
   * Summary: 更新容器应用服务对应的云原生技术栈版本
   */
  async updateContainerserviceNativebpversionEx(request: UpdateContainerserviceNativebpversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceNativebpversionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceNativebpversionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.nativebpversion.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceNativebpversionResponse({}));
  }

  /**
   * Description: 生成Dockerfile命令列表并获取
   * Summary: 获取容器服务对应的Dockerfile
   */
  async loadContainerserviceDockerfile(request: LoadContainerserviceDockerfileRequest): Promise<LoadContainerserviceDockerfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadContainerserviceDockerfileEx(request, headers, runtime);
  }

  /**
   * Description: 生成Dockerfile命令列表并获取
   * Summary: 获取容器服务对应的Dockerfile
   */
  async loadContainerserviceDockerfileEx(request: LoadContainerserviceDockerfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadContainerserviceDockerfileResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadContainerserviceDockerfileResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.dockerfile.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadContainerserviceDockerfileResponse({}));
  }

  /**
   * Description: 创建云原生技术栈版本
   * Summary: 创建云原生技术栈版本
   */
  async createBuildpackNativetechstackversion(request: CreateBuildpackNativetechstackversionRequest): Promise<CreateBuildpackNativetechstackversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBuildpackNativetechstackversionEx(request, headers, runtime);
  }

  /**
   * Description: 创建云原生技术栈版本
   * Summary: 创建云原生技术栈版本
   */
  async createBuildpackNativetechstackversionEx(request: CreateBuildpackNativetechstackversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBuildpackNativetechstackversionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBuildpackNativetechstackversionResponse>(await this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBuildpackNativetechstackversionResponse({}));
  }

  /**
   * Description: get zonelist of each workspace in a workspace group
   * Summary: getZoneListOfWSG
   */
  async listMulticlusterZone(request: ListMulticlusterZoneRequest): Promise<ListMulticlusterZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMulticlusterZoneEx(request, headers, runtime);
  }

  /**
   * Description: get zonelist of each workspace in a workspace group
   * Summary: getZoneListOfWSG
   */
  async listMulticlusterZoneEx(request: ListMulticlusterZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMulticlusterZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMulticlusterZoneResponse>(await this.doRequest("1.0", "antcloud.ldc.multicluster.zone.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMulticlusterZoneResponse({}));
  }

  /**
   * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
   * Summary: 发布/运维单发布任务操作
   */
  async execOpsplanAppopstask(request: ExecOpsplanAppopstaskRequest): Promise<ExecOpsplanAppopstaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execOpsplanAppopstaskEx(request, headers, runtime);
  }

  /**
   * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
   * Summary: 发布/运维单发布任务操作
   */
  async execOpsplanAppopstaskEx(request: ExecOpsplanAppopstaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecOpsplanAppopstaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecOpsplanAppopstaskResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.appopstask.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecOpsplanAppopstaskResponse({}));
  }

  /**
   * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
   * Summary: 发布单进度查询
   */
  async queryOpsplanProgress(request: QueryOpsplanProgressRequest): Promise<QueryOpsplanProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanProgressEx(request, headers, runtime);
  }

  /**
   * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
   * Summary: 发布单进度查询
   */
  async queryOpsplanProgressEx(request: QueryOpsplanProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanProgressResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.progress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanProgressResponse({}));
  }

  /**
   * Description: 发布(运维)单应进度查询
   * Summary: 发布(运维)单应进度查询
   */
  async queryOpsplanAppprogress(request: QueryOpsplanAppprogressRequest): Promise<QueryOpsplanAppprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanAppprogressEx(request, headers, runtime);
  }

  /**
   * Description: 发布(运维)单应进度查询
   * Summary: 发布(运维)单应进度查询
   */
  async queryOpsplanAppprogressEx(request: QueryOpsplanAppprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanAppprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanAppprogressResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.appprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanAppprogressResponse({}));
  }

  /**
   * Description: 容器服务pod列表
   * Summary: 容器服务pod列表
   */
  async listContainerservicePod(request: ListContainerservicePodRequest): Promise<ListContainerservicePodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContainerservicePodEx(request, headers, runtime);
  }

  /**
   * Description: 容器服务pod列表
   * Summary: 容器服务pod列表
   */
  async listContainerservicePodEx(request: ListContainerservicePodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContainerservicePodResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContainerservicePodResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.pod.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContainerservicePodResponse({}));
  }

  /**
   * Description: To list kubeevents
   * Summary: To list kubeevents
   */
  async listContainerserviceKubeevents(request: ListContainerserviceKubeeventsRequest): Promise<ListContainerserviceKubeeventsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContainerserviceKubeeventsEx(request, headers, runtime);
  }

  /**
   * Description: To list kubeevents
   * Summary: To list kubeevents
   */
  async listContainerserviceKubeeventsEx(request: ListContainerserviceKubeeventsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContainerserviceKubeeventsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContainerserviceKubeeventsResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.kubeevents.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContainerserviceKubeeventsResponse({}));
  }

  /**
   * Description: 查询Pod事件列表
   * Summary: 查询Pod事件列表
   */
  async listPodEvents(request: ListPodEventsRequest): Promise<ListPodEventsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listPodEventsEx(request, headers, runtime);
  }

  /**
   * Description: 查询Pod事件列表
   * Summary: 查询Pod事件列表
   */
  async listPodEventsEx(request: ListPodEventsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListPodEventsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListPodEventsResponse>(await this.doRequest("1.0", "antcloud.ldc.pod.events.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListPodEventsResponse({}));
  }

  /**
   * Description: 查询Pod事件列表
   * Summary: 查询Pod容器列表
   */
  async listPodContainers(request: ListPodContainersRequest): Promise<ListPodContainersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listPodContainersEx(request, headers, runtime);
  }

  /**
   * Description: 查询Pod事件列表
   * Summary: 查询Pod容器列表
   */
  async listPodContainersEx(request: ListPodContainersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListPodContainersResponse> {
    Util.validateModel(request);
    return $tea.cast<ListPodContainersResponse>(await this.doRequest("1.0", "antcloud.ldc.pod.containers.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListPodContainersResponse({}));
  }

  /**
   * Description: query replica cell
   * Summary: query replica cell
   */
  async queryContainerserviceCell(request: QueryContainerserviceCellRequest): Promise<QueryContainerserviceCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContainerserviceCellEx(request, headers, runtime);
  }

  /**
   * Description: query replica cell
   * Summary: query replica cell
   */
  async queryContainerserviceCellEx(request: QueryContainerserviceCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContainerserviceCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContainerserviceCellResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContainerserviceCellResponse({}));
  }

  /**
   * Description: 创建逻辑单元
   * Summary: 创建逻辑单元
   */
  async createCellgroup(request: CreateCellgroupRequest): Promise<CreateCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建逻辑单元
   * Summary: 创建逻辑单元
   */
  async createCellgroupEx(request: CreateCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCellgroupResponse>(await this.doRequest("1.0", "antcloud.ldc.cellgroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCellgroupResponse({}));
  }

  /**
   * Description: 获取cellgroup列表
   * Summary: 获取cellgroup列表
   */
  async listCellgroup(request: ListCellgroupRequest): Promise<ListCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取cellgroup列表
   * Summary: 获取cellgroup列表
   */
  async listCellgroupEx(request: ListCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCellgroupResponse>(await this.doRequest("1.0", "antcloud.ldc.cellgroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCellgroupResponse({}));
  }

  /**
   * Description: 配置逻辑单元灾备信息
   * Summary: 配置逻辑单元灾备信息
   */
  async updateCellgroupDisasterinfo(request: UpdateCellgroupDisasterinfoRequest): Promise<UpdateCellgroupDisasterinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCellgroupDisasterinfoEx(request, headers, runtime);
  }

  /**
   * Description: 配置逻辑单元灾备信息
   * Summary: 配置逻辑单元灾备信息
   */
  async updateCellgroupDisasterinfoEx(request: UpdateCellgroupDisasterinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCellgroupDisasterinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCellgroupDisasterinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cellgroup.disasterinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCellgroupDisasterinfoResponse({}));
  }

  /**
   * Description: 删除逻辑单元
   * Summary: 删除逻辑单元
   */
  async deleteCellgroup(request: DeleteCellgroupRequest): Promise<DeleteCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除逻辑单元
   * Summary: 删除逻辑单元
   */
  async deleteCellgroupEx(request: DeleteCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCellgroupResponse>(await this.doRequest("1.0", "antcloud.ldc.cellgroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCellgroupResponse({}));
  }

  /**
   * Description: 查询部署单元列表
   * Summary: 查询部署单元列表
   */
  async listCell(request: ListCellRequest): Promise<ListCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元列表
   * Summary: 查询部署单元列表
   */
  async listCellEx(request: ListCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCellResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCellResponse({}));
  }

  /**
   * Description: 创建部署单元。
   * Summary: 创建部署单元
   */
  async createCell(request: CreateCellRequest): Promise<CreateCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCellEx(request, headers, runtime);
  }

  /**
   * Description: 创建部署单元。
   * Summary: 创建部署单元
   */
  async createCellEx(request: CreateCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCellResponse({}));
  }

  /**
   * Description: 删除部署单元。
   * Summary: 删除部署单元
   */
  async deleteCell(request: DeleteCellRequest): Promise<DeleteCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCellEx(request, headers, runtime);
  }

  /**
   * Description: 删除部署单元。
   * Summary: 删除部署单元
   */
  async deleteCellEx(request: DeleteCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCellResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCellResponse({}));
  }

  /**
   * Description: 删除pod
   * Summary: 删除pod
   */
  async deletePod(request: DeletePodRequest): Promise<DeletePodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deletePodEx(request, headers, runtime);
  }

  /**
   * Description: 删除pod
   * Summary: 删除pod
   */
  async deletePodEx(request: DeletePodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeletePodResponse> {
    Util.validateModel(request);
    return $tea.cast<DeletePodResponse>(await this.doRequest("1.0", "antcloud.ldc.pod.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeletePodResponse({}));
  }

  /**
   * Description: 查询环境部署单元拓扑
   * Summary: 查询环境部署单元拓扑
   */
  async getWorkspacegroupTopology(request: GetWorkspacegroupTopologyRequest): Promise<GetWorkspacegroupTopologyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspacegroupTopologyEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境部署单元拓扑
   * Summary: 查询环境部署单元拓扑
   */
  async getWorkspacegroupTopologyEx(request: GetWorkspacegroupTopologyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspacegroupTopologyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspacegroupTopologyResponse>(await this.doRequest("1.0", "antcloud.ldc.workspacegroup.topology.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspacegroupTopologyResponse({}));
  }

  /**
   * Description: 修改 cell 权重
   * Summary: 修改 cell 权重
   */
  async updateFlowCellweight(request: UpdateFlowCellweightRequest): Promise<UpdateFlowCellweightResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowCellweightEx(request, headers, runtime);
  }

  /**
   * Description: 修改 cell 权重
   * Summary: 修改 cell 权重
   */
  async updateFlowCellweightEx(request: UpdateFlowCellweightRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowCellweightResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowCellweightResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.cellweight.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowCellweightResponse({}));
  }

  /**
   * Description: uid 分片调整
   * Summary: uid 分片调整
   */
  async updateFlowUidrange(request: UpdateFlowUidrangeRequest): Promise<UpdateFlowUidrangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowUidrangeEx(request, headers, runtime);
  }

  /**
   * Description: uid 分片调整
   * Summary: uid 分片调整
   */
  async updateFlowUidrangeEx(request: UpdateFlowUidrangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowUidrangeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowUidrangeResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.uidrange.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowUidrangeResponse({}));
  }

  /**
   * Description: 弹出 UID 到弹性部署单元
   * Summary: 弹出 UID 到弹性部署单元
   */
  async enableFlowElasticuid(request: EnableFlowElasticuidRequest): Promise<EnableFlowElasticuidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableFlowElasticuidEx(request, headers, runtime);
  }

  /**
   * Description: 弹出 UID 到弹性部署单元
   * Summary: 弹出 UID 到弹性部署单元
   */
  async enableFlowElasticuidEx(request: EnableFlowElasticuidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableFlowElasticuidResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableFlowElasticuidResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticuid.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableFlowElasticuidResponse({}));
  }

  /**
   * Description: 弹回 UID 分片
   * Summary: 弹回 UID 分片
   */
  async disableFlowElasticuid(request: DisableFlowElasticuidRequest): Promise<DisableFlowElasticuidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableFlowElasticuidEx(request, headers, runtime);
  }

  /**
   * Description: 弹回 UID 分片
   * Summary: 弹回 UID 分片
   */
  async disableFlowElasticuidEx(request: DisableFlowElasticuidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableFlowElasticuidResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableFlowElasticuidResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticuid.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableFlowElasticuidResponse({}));
  }

  /**
   * Description: 导出当前的流量规则
   * Summary: 导出当前的流量规则
   */
  async exportFlowRule(request: ExportFlowRuleRequest): Promise<ExportFlowRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportFlowRuleEx(request, headers, runtime);
  }

  /**
   * Description: 导出当前的流量规则
   * Summary: 导出当前的流量规则
   */
  async exportFlowRuleEx(request: ExportFlowRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportFlowRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportFlowRuleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.rule.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportFlowRuleResponse({}));
  }

  /**
   * Description: 推送流量规则
   * Summary: 推送流量规则
   */
  async pushFlowRule(request: PushFlowRuleRequest): Promise<PushFlowRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushFlowRuleEx(request, headers, runtime);
  }

  /**
   * Description: 推送流量规则
   * Summary: 推送流量规则
   */
  async pushFlowRuleEx(request: PushFlowRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushFlowRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<PushFlowRuleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.rule.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushFlowRuleResponse({}));
  }

  /**
   * Description: 创建弹性规则
   * Summary: 创建弹性规则
   */
  async addFlowElasticrule(request: AddFlowElasticruleRequest): Promise<AddFlowElasticruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addFlowElasticruleEx(request, headers, runtime);
  }

  /**
   * Description: 创建弹性规则
   * Summary: 创建弹性规则
   */
  async addFlowElasticruleEx(request: AddFlowElasticruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddFlowElasticruleResponse> {
    Util.validateModel(request);
    return $tea.cast<AddFlowElasticruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddFlowElasticruleResponse({}));
  }

  /**
   * Description: 更新弹性规则
   * Summary: 更新弹性规则
   */
  async updateFlowElasticrule(request: UpdateFlowElasticruleRequest): Promise<UpdateFlowElasticruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowElasticruleEx(request, headers, runtime);
  }

  /**
   * Description: 更新弹性规则
   * Summary: 更新弹性规则
   */
  async updateFlowElasticruleEx(request: UpdateFlowElasticruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowElasticruleResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowElasticruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowElasticruleResponse({}));
  }

  /**
   * Description: 删除弹性规则
   * Summary: 删除弹性规则
   */
  async deleteFlowElasticrule(request: DeleteFlowElasticruleRequest): Promise<DeleteFlowElasticruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowElasticruleEx(request, headers, runtime);
  }

  /**
   * Description: 删除弹性规则
   * Summary: 删除弹性规则
   */
  async deleteFlowElasticruleEx(request: DeleteFlowElasticruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowElasticruleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowElasticruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowElasticruleResponse({}));
  }

  /**
   * Description: 添加弹性子规则
   * Summary: 添加弹性子规则
   */
  async addFlowElasticsubrule(request: AddFlowElasticsubruleRequest): Promise<AddFlowElasticsubruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addFlowElasticsubruleEx(request, headers, runtime);
  }

  /**
   * Description: 添加弹性子规则
   * Summary: 添加弹性子规则
   */
  async addFlowElasticsubruleEx(request: AddFlowElasticsubruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddFlowElasticsubruleResponse> {
    Util.validateModel(request);
    return $tea.cast<AddFlowElasticsubruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddFlowElasticsubruleResponse({}));
  }

  /**
   * Description: 删除子弹性规则
   * Summary: 删除子弹性规则
   */
  async deleteFlowElasticsubrule(request: DeleteFlowElasticsubruleRequest): Promise<DeleteFlowElasticsubruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowElasticsubruleEx(request, headers, runtime);
  }

  /**
   * Description: 删除子弹性规则
   * Summary: 删除子弹性规则
   */
  async deleteFlowElasticsubruleEx(request: DeleteFlowElasticsubruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowElasticsubruleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowElasticsubruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowElasticsubruleResponse({}));
  }

  /**
   * Description: 批量更新弹性规则状态
   * Summary: 批量更新弹性规则状态
   */
  async updateFlowElasticrulestatus(request: UpdateFlowElasticrulestatusRequest): Promise<UpdateFlowElasticrulestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowElasticrulestatusEx(request, headers, runtime);
  }

  /**
   * Description: 批量更新弹性规则状态
   * Summary: 批量更新弹性规则状态
   */
  async updateFlowElasticrulestatusEx(request: UpdateFlowElasticrulestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowElasticrulestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowElasticrulestatusResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrulestatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowElasticrulestatusResponse({}));
  }

  /**
   * Description: 批量删除弹性规则
   * Summary: 批量删除弹性规则
   */
  async batchdeleteFlowElasticrule(request: BatchdeleteFlowElasticruleRequest): Promise<BatchdeleteFlowElasticruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteFlowElasticruleEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除弹性规则
   * Summary: 批量删除弹性规则
   */
  async batchdeleteFlowElasticruleEx(request: BatchdeleteFlowElasticruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteFlowElasticruleResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteFlowElasticruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteFlowElasticruleResponse({}));
  }

  /**
   * Description: 创建弹性场景
   * Summary: 创建弹性场景
   */
  async createFlowElasticscene(request: CreateFlowElasticsceneRequest): Promise<CreateFlowElasticsceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowElasticsceneEx(request, headers, runtime);
  }

  /**
   * Description: 创建弹性场景
   * Summary: 创建弹性场景
   */
  async createFlowElasticsceneEx(request: CreateFlowElasticsceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowElasticsceneResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowElasticsceneResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowElasticsceneResponse({}));
  }

  /**
   * Description: 修改弹性场景
   * Summary: 修改弹性场景
   */
  async updateFlowElasticscene(request: UpdateFlowElasticsceneRequest): Promise<UpdateFlowElasticsceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowElasticsceneEx(request, headers, runtime);
  }

  /**
   * Description: 修改弹性场景
   * Summary: 修改弹性场景
   */
  async updateFlowElasticsceneEx(request: UpdateFlowElasticsceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowElasticsceneResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowElasticsceneResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowElasticsceneResponse({}));
  }

  /**
   * Description: 删除弹性场景
   * Summary: 删除弹性场景
   */
  async deleteFlowElasticscene(request: DeleteFlowElasticsceneRequest): Promise<DeleteFlowElasticsceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowElasticsceneEx(request, headers, runtime);
  }

  /**
   * Description: 删除弹性场景
   * Summary: 删除弹性场景
   */
  async deleteFlowElasticsceneEx(request: DeleteFlowElasticsceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowElasticsceneResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowElasticsceneResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowElasticsceneResponse({}));
  }

  /**
   * Description: 配置弹性值
   * Summary: 配置弹性值
   */
  async setFlowElasticvalue(request: SetFlowElasticvalueRequest): Promise<SetFlowElasticvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setFlowElasticvalueEx(request, headers, runtime);
  }

  /**
   * Description: 配置弹性值
   * Summary: 配置弹性值
   */
  async setFlowElasticvalueEx(request: SetFlowElasticvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetFlowElasticvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<SetFlowElasticvalueResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetFlowElasticvalueResponse({}));
  }

  /**
   * Description: 恢复弹性值
   * Summary: 恢复弹性值
   */
  async disableFlowElasticvalue(request: DisableFlowElasticvalueRequest): Promise<DisableFlowElasticvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableFlowElasticvalueEx(request, headers, runtime);
  }

  /**
   * Description: 恢复弹性值
   * Summary: 恢复弹性值
   */
  async disableFlowElasticvalueEx(request: DisableFlowElasticvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableFlowElasticvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableFlowElasticvalueResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableFlowElasticvalueResponse({}));
  }

  /**
   * Description: 创建站点
   * Summary: 创建站点
   */
  async createFlowSite(request: CreateFlowSiteRequest): Promise<CreateFlowSiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowSiteEx(request, headers, runtime);
  }

  /**
   * Description: 创建站点
   * Summary: 创建站点
   */
  async createFlowSiteEx(request: CreateFlowSiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowSiteResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowSiteResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.site.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowSiteResponse({}));
  }

  /**
   * Description: 修改站点信息
   * Summary: 修改站点信息
   */
  async updateFlowSite(request: UpdateFlowSiteRequest): Promise<UpdateFlowSiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFlowSiteEx(request, headers, runtime);
  }

  /**
   * Description: 修改站点信息
   * Summary: 修改站点信息
   */
  async updateFlowSiteEx(request: UpdateFlowSiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFlowSiteResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFlowSiteResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.site.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFlowSiteResponse({}));
  }

  /**
   * Description: 删除站点
   * Summary: 删除站点
   */
  async deleteFlowSite(request: DeleteFlowSiteRequest): Promise<DeleteFlowSiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowSiteEx(request, headers, runtime);
  }

  /**
   * Description: 删除站点
   * Summary: 删除站点
   */
  async deleteFlowSiteEx(request: DeleteFlowSiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowSiteResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowSiteResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.site.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowSiteResponse({}));
  }

  /**
   * Description: 指定应用或指定pods创建重启运维单
   * Summary: 创建重启运维单
   */
  async createOpsplanRestart(request: CreateOpsplanRestartRequest): Promise<CreateOpsplanRestartResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOpsplanRestartEx(request, headers, runtime);
  }

  /**
   * Description: 指定应用或指定pods创建重启运维单
   * Summary: 创建重启运维单
   */
  async createOpsplanRestartEx(request: CreateOpsplanRestartRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOpsplanRestartResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOpsplanRestartResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.restart.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOpsplanRestartResponse({}));
  }

  /**
   * Description: 容器应用服务revision添加备注
   * Summary: 容器应用服务revision添加备注
   */
  async updateContainerserviceComment(request: UpdateContainerserviceCommentRequest): Promise<UpdateContainerserviceCommentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceCommentEx(request, headers, runtime);
  }

  /**
   * Description: 容器应用服务revision添加备注
   * Summary: 容器应用服务revision添加备注
   */
  async updateContainerserviceCommentEx(request: UpdateContainerserviceCommentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceCommentResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceCommentResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.comment.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceCommentResponse({}));
  }

  /**
   * Description: 回滚容器服务到指定版本
   * Summary: 回滚容器服务到指定版本
   */
  async rollbackContainerserviceDeployment(request: RollbackContainerserviceDeploymentRequest): Promise<RollbackContainerserviceDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackContainerserviceDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 回滚容器服务到指定版本
   * Summary: 回滚容器服务到指定版本
   */
  async rollbackContainerserviceDeploymentEx(request: RollbackContainerserviceDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackContainerserviceDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackContainerserviceDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackContainerserviceDeploymentResponse({}));
  }

  /**
   * Description: 查询 uid 信息
   * Summary: 查询 uid 信息
   */
  async queryFlowUidinfo(request: QueryFlowUidinfoRequest): Promise<QueryFlowUidinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowUidinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询 uid 信息
   * Summary: 查询 uid 信息
   */
  async queryFlowUidinfoEx(request: QueryFlowUidinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowUidinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowUidinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.uidinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowUidinfoResponse({}));
  }

  /**
   * Description: 查询站点
   * Summary: 查询站点
   */
  async queryFlowSite(request: QueryFlowSiteRequest): Promise<QueryFlowSiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowSiteEx(request, headers, runtime);
  }

  /**
   * Description: 查询站点
   * Summary: 查询站点
   */
  async queryFlowSiteEx(request: QueryFlowSiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowSiteResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowSiteResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.site.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowSiteResponse({}));
  }

  /**
   * Description: 查询部署单元信息
   * Summary: 查询部署单元信息
   */
  async getCell(request: GetCellRequest): Promise<GetCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元信息
   * Summary: 查询部署单元信息
   */
  async getCellEx(request: GetCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCellResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCellResponse({}));
  }

  /**
   * Description: 查询逻辑单元信息。
   * Summary: 查询逻辑单元信息。
   */
  async getCellgroup(request: GetCellgroupRequest): Promise<GetCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询逻辑单元信息。
   * Summary: 查询逻辑单元信息。
   */
  async getCellgroupEx(request: GetCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCellgroupResponse>(await this.doRequest("1.0", "antcloud.ldc.cellgroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCellgroupResponse({}));
  }

  /**
   * Description: 更新部署单元信息。
   * Summary: 更新部署单元信息。
   */
  async updateCell(request: UpdateCellRequest): Promise<UpdateCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCellEx(request, headers, runtime);
  }

  /**
   * Description: 更新部署单元信息。
   * Summary: 更新部署单元信息。
   */
  async updateCellEx(request: UpdateCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCellResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCellResponse>(await this.doRequest("1.0", "antcloud.ldc.cell.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCellResponse({}));
  }

  /**
   * Description: 查询Pod/容器事件列表
   * Summary: 查询Pod/容器事件列表
   */
  async listEvents(request: ListEventsRequest): Promise<ListEventsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEventsEx(request, headers, runtime);
  }

  /**
   * Description: 查询Pod/容器事件列表
   * Summary: 查询Pod/容器事件列表
   */
  async listEventsEx(request: ListEventsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEventsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEventsResponse>(await this.doRequest("1.0", "antcloud.ldc.events.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEventsResponse({}));
  }

  /**
   * Description: 获取地域信息
   * Summary: 获取地域信息
   */
  async listRegion(request: ListRegionRequest): Promise<ListRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegionEx(request, headers, runtime);
  }

  /**
   * Description: 获取地域信息
   * Summary: 获取地域信息
   */
  async listRegionEx(request: ListRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegionResponse>(await this.doRequest("1.0", "antcloud.ldc.region.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegionResponse({}));
  }

  /**
   * Description: 可用区列表
   * Summary: 可用区列表
   */
  async listZone(request: ListZoneRequest): Promise<ListZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listZoneEx(request, headers, runtime);
  }

  /**
   * Description: 可用区列表
   * Summary: 可用区列表
   */
  async listZoneEx(request: ListZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListZoneResponse>(await this.doRequest("1.0", "antcloud.ldc.zone.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListZoneResponse({}));
  }

  /**
   * Description: 查询pod下container 日志
   * Summary: 查询pod日志
   */
  async queryPodLog(request: QueryPodLogRequest): Promise<QueryPodLogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPodLogEx(request, headers, runtime);
  }

  /**
   * Description: 查询pod下container 日志
   * Summary: 查询pod日志
   */
  async queryPodLogEx(request: QueryPodLogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPodLogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPodLogResponse>(await this.doRequest("1.0", "antcloud.ldc.pod.log.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPodLogResponse({}));
  }

  /**
   * Description: 创建spanner集群
   * Summary: 创建spanner集群
   */
  async createSpannerCluster(request: CreateSpannerClusterRequest): Promise<CreateSpannerClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSpannerClusterEx(request, headers, runtime);
  }

  /**
   * Description: 创建spanner集群
   * Summary: 创建spanner集群
   */
  async createSpannerClusterEx(request: CreateSpannerClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSpannerClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSpannerClusterResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.cluster.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSpannerClusterResponse({}));
  }

  /**
   * Description: 获取集群详情
   * Summary: 获取集群详情
   */
  async getSpannerCluster(request: GetSpannerClusterRequest): Promise<GetSpannerClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSpannerClusterEx(request, headers, runtime);
  }

  /**
   * Description: 获取集群详情
   * Summary: 获取集群详情
   */
  async getSpannerClusterEx(request: GetSpannerClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSpannerClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSpannerClusterResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.cluster.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSpannerClusterResponse({}));
  }

  /**
   * Description: 扩容spanner集群
   * Summary: 扩容spanner集群
   */
  async scaleSpannerCluster(request: ScaleSpannerClusterRequest): Promise<ScaleSpannerClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleSpannerClusterEx(request, headers, runtime);
  }

  /**
   * Description: 扩容spanner集群
   * Summary: 扩容spanner集群
   */
  async scaleSpannerClusterEx(request: ScaleSpannerClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleSpannerClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleSpannerClusterResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.cluster.scale", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleSpannerClusterResponse({}));
  }

  /**
   * Description: 查询集群列表
   * Summary: 查询集群列表
   */
  async querySpannerCluster(request: QuerySpannerClusterRequest): Promise<QuerySpannerClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySpannerClusterEx(request, headers, runtime);
  }

  /**
   * Description: 查询集群列表
   * Summary: 查询集群列表
   */
  async querySpannerClusterEx(request: QuerySpannerClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySpannerClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySpannerClusterResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.cluster.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySpannerClusterResponse({}));
  }

  /**
   * Description: 更新spanner集群状态
   * Summary: 更新spanner集群状态
   */
  async updateSpannerClusterstatus(request: UpdateSpannerClusterstatusRequest): Promise<UpdateSpannerClusterstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSpannerClusterstatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新spanner集群状态
   * Summary: 更新spanner集群状态
   */
  async updateSpannerClusterstatusEx(request: UpdateSpannerClusterstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSpannerClusterstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSpannerClusterstatusResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.clusterstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSpannerClusterstatusResponse({}));
  }

  /**
   * Description: 更新集群单元状态
   * Summary: 更新集群单元状态
   */
  async updateSpannerUnitstatus(request: UpdateSpannerUnitstatusRequest): Promise<UpdateSpannerUnitstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSpannerUnitstatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新集群单元状态
   * Summary: 更新集群单元状态
   */
  async updateSpannerUnitstatusEx(request: UpdateSpannerUnitstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSpannerUnitstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSpannerUnitstatusResponse>(await this.doRequest("1.0", "antcloud.ldc.spanner.unitstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSpannerUnitstatusResponse({}));
  }

  /**
   * Description: 取消应用服务发布|运维
   * Summary: 取消应用服务发布|运维
   */
  async cancelOpsplanService(request: CancelOpsplanServiceRequest): Promise<CancelOpsplanServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelOpsplanServiceEx(request, headers, runtime);
  }

  /**
   * Description: 取消应用服务发布|运维
   * Summary: 取消应用服务发布|运维
   */
  async cancelOpsplanServiceEx(request: CancelOpsplanServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelOpsplanServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelOpsplanServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.service.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelOpsplanServiceResponse({}));
  }

  /**
   * Description: 查询系统配置url
   * Summary: 系统url查询
   */
  async listSystemUrl(request: ListSystemUrlRequest): Promise<ListSystemUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSystemUrlEx(request, headers, runtime);
  }

  /**
   * Description: 查询系统配置url
   * Summary: 系统url查询
   */
  async listSystemUrlEx(request: ListSystemUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSystemUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSystemUrlResponse>(await this.doRequest("1.0", "antcloud.ldc.system.url.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSystemUrlResponse({}));
  }

  /**
   * Description: 查询流量推送记录
   * Summary: 查询
   */
  async queryFlowRecord(request: QueryFlowRecordRequest): Promise<QueryFlowRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowRecordEx(request, headers, runtime);
  }

  /**
   * Description: 查询流量推送记录
   * Summary: 查询
   */
  async queryFlowRecordEx(request: QueryFlowRecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowRecordResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.record.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowRecordResponse({}));
  }

  /**
   * Description: 保存环境关联
   * Summary: 保存环境关联
   */
  async saveFlowEnvrel(request: SaveFlowEnvrelRequest): Promise<SaveFlowEnvrelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveFlowEnvrelEx(request, headers, runtime);
  }

  /**
   * Description: 保存环境关联
   * Summary: 保存环境关联
   */
  async saveFlowEnvrelEx(request: SaveFlowEnvrelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveFlowEnvrelResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveFlowEnvrelResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.envrel.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveFlowEnvrelResponse({}));
  }

  /**
   * Description: 删除环境关联
   * Summary: 删除环境关联
   */
  async deleteFlowEnvrel(request: DeleteFlowEnvrelRequest): Promise<DeleteFlowEnvrelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowEnvrelEx(request, headers, runtime);
  }

  /**
   * Description: 删除环境关联
   * Summary: 删除环境关联
   */
  async deleteFlowEnvrelEx(request: DeleteFlowEnvrelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowEnvrelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowEnvrelResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.envrel.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowEnvrelResponse({}));
  }

  /**
   * Description: 查询关联
   * Summary: 查询关联
   */
  async queryFlowEnvrel(request: QueryFlowEnvrelRequest): Promise<QueryFlowEnvrelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowEnvrelEx(request, headers, runtime);
  }

  /**
   * Description: 查询关联
   * Summary: 查询关联
   */
  async queryFlowEnvrelEx(request: QueryFlowEnvrelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowEnvrelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowEnvrelResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.envrel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowEnvrelResponse({}));
  }

  /**
   * Description: 创建异构机房部署单元
   * Summary: 创建异构机房部署单元
   */
  async createFlowSitecell(request: CreateFlowSitecellRequest): Promise<CreateFlowSitecellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowSitecellEx(request, headers, runtime);
  }

  /**
   * Description: 创建异构机房部署单元
   * Summary: 创建异构机房部署单元
   */
  async createFlowSitecellEx(request: CreateFlowSitecellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowSitecellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowSitecellResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.sitecell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowSitecellResponse({}));
  }

  /**
   * Description: 删除异构机房部署单元
   * Summary: 删除异构机房部署单元
   */
  async deleteFlowSitecell(request: DeleteFlowSitecellRequest): Promise<DeleteFlowSitecellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFlowSitecellEx(request, headers, runtime);
  }

  /**
   * Description: 删除异构机房部署单元
   * Summary: 删除异构机房部署单元
   */
  async deleteFlowSitecellEx(request: DeleteFlowSitecellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFlowSitecellResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFlowSitecellResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.sitecell.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFlowSitecellResponse({}));
  }

  /**
   * Description: 查询异构机房部署单元
   * Summary: 查询异构机房部署单元
   */
  async queryFlowSitecell(request: QueryFlowSitecellRequest): Promise<QueryFlowSitecellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowSitecellEx(request, headers, runtime);
  }

  /**
   * Description: 查询异构机房部署单元
   * Summary: 查询异构机房部署单元
   */
  async queryFlowSitecellEx(request: QueryFlowSitecellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowSitecellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowSitecellResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.sitecell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowSitecellResponse({}));
  }

  /**
   * Description: 获取发布单下应用服务详情
   * Summary: 获取发布单下应用服务详情
   */
  async getOpsplanService(request: GetOpsplanServiceRequest): Promise<GetOpsplanServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOpsplanServiceEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布单下应用服务详情
   * Summary: 获取发布单下应用服务详情
   */
  async getOpsplanServiceEx(request: GetOpsplanServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOpsplanServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOpsplanServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.service.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOpsplanServiceResponse({}));
  }

  /**
   * Description: 获取当前生效的路由规则
   * Summary: 获取当前生效的路由规则
   */
  async queryFlowRule(request: QueryFlowRuleRequest): Promise<QueryFlowRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowRuleEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前生效的路由规则
   * Summary: 获取当前生效的路由规则
   */
  async queryFlowRuleEx(request: QueryFlowRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowRuleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowRuleResponse({}));
  }

  /**
   * Description: 创建FedDeployment
   * Summary: 创建FedDeployment
   */
  async createFederationDeployment(request: CreateFederationDeploymentRequest): Promise<CreateFederationDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFederationDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 创建FedDeployment
   * Summary: 创建FedDeployment
   */
  async createFederationDeploymentEx(request: CreateFederationDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFederationDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFederationDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.deployment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFederationDeploymentResponse({}));
  }

  /**
   * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
   * Summary: 查询负责均衡实例。
   */
  async queryLoadbalancer(request: QueryLoadbalancerRequest): Promise<QueryLoadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
   * Summary: 查询负责均衡实例。
   */
  async queryLoadbalancerEx(request: QueryLoadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.loadbalancer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalancerResponse({}));
  }

  /**
   * Description: 查询容器服务 Service 列表。
   * Summary: 查询容器服务 Service 列表。
   */
  async listContainerserviceService(request: ListContainerserviceServiceRequest): Promise<ListContainerserviceServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContainerserviceServiceEx(request, headers, runtime);
  }

  /**
   * Description: 查询容器服务 Service 列表。
   * Summary: 查询容器服务 Service 列表。
   */
  async listContainerserviceServiceEx(request: ListContainerserviceServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContainerserviceServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContainerserviceServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.service.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContainerserviceServiceResponse({}));
  }

  /**
   * Description: 查询sidecar元信息列表
   * Summary: 查询sidecar元信息列表
   */
  async listSidecar(request: ListSidecarRequest): Promise<ListSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 查询sidecar元信息列表
   * Summary: 查询sidecar元信息列表
   */
  async listSidecarEx(request: ListSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarResponse({}));
  }

  /**
   * Description: list template
   * Summary: list template
   */
  async listSidecarTemplate(request: ListSidecarTemplateRequest): Promise<ListSidecarTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarTemplateEx(request, headers, runtime);
  }

  /**
   * Description: list template
   * Summary: list template
   */
  async listSidecarTemplateEx(request: ListSidecarTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarTemplateResponse({}));
  }

  /**
   * Description: 获取sidecar版本详情
   * Summary: 版本详情
   */
  async getSidecarTemplate(request: GetSidecarTemplateRequest): Promise<GetSidecarTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSidecarTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar版本详情
   * Summary: 版本详情
   */
  async getSidecarTemplateEx(request: GetSidecarTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSidecarTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSidecarTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.template.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSidecarTemplateResponse({}));
  }

  /**
   * Description: 获取FedDeployment详情
   * Summary: 获取FedDeployment详情
   */
  async getFederationDeployment(request: GetFederationDeploymentRequest): Promise<GetFederationDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFederationDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 获取FedDeployment详情
   * Summary: 获取FedDeployment详情
   */
  async getFederationDeploymentEx(request: GetFederationDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFederationDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFederationDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.deployment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFederationDeploymentResponse({}));
  }

  /**
   * Description: 获取FederatedDeployment列表信息
   * Summary: 获取FedDeploy列表
   */
  async listFederationDeployment(request: ListFederationDeploymentRequest): Promise<ListFederationDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFederationDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 获取FederatedDeployment列表信息
   * Summary: 获取FedDeploy列表
   */
  async listFederationDeploymentEx(request: ListFederationDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFederationDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFederationDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.deployment.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFederationDeploymentResponse({}));
  }

  /**
   * Description: 删除FedDeployment
   * Summary: 删除FedDeployment
   */
  async deleteFederationDeployment(request: DeleteFederationDeploymentRequest): Promise<DeleteFederationDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFederationDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 删除FedDeployment
   * Summary: 删除FedDeployment
   */
  async deleteFederationDeploymentEx(request: DeleteFederationDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFederationDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFederationDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.federation.deployment.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFederationDeploymentResponse({}));
  }

  /**
   * Description: 设置当前uid规则为默认uid规则
   * Summary: 设置当前uid规则为默认uid规则
   */
  async setFlowDefaultuid(request: SetFlowDefaultuidRequest): Promise<SetFlowDefaultuidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setFlowDefaultuidEx(request, headers, runtime);
  }

  /**
   * Description: 设置当前uid规则为默认uid规则
   * Summary: 设置当前uid规则为默认uid规则
   */
  async setFlowDefaultuidEx(request: SetFlowDefaultuidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetFlowDefaultuidResponse> {
    Util.validateModel(request);
    return $tea.cast<SetFlowDefaultuidResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.defaultuid.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetFlowDefaultuidResponse({}));
  }

  /**
   * Description: 开始执行应用服务发布|运维
   * Summary: 开始执行应用服务发布|运维
   */
  async startOpsplanService(request: StartOpsplanServiceRequest): Promise<StartOpsplanServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startOpsplanServiceEx(request, headers, runtime);
  }

  /**
   * Description: 开始执行应用服务发布|运维
   * Summary: 开始执行应用服务发布|运维
   */
  async startOpsplanServiceEx(request: StartOpsplanServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartOpsplanServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<StartOpsplanServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.service.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartOpsplanServiceResponse({}));
  }

  /**
   * Description: 回滚确认应用服务
   * Summary: 回滚确认应用服务
   */
  async confirmOpsplanServicerollback(request: ConfirmOpsplanServicerollbackRequest): Promise<ConfirmOpsplanServicerollbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmOpsplanServicerollbackEx(request, headers, runtime);
  }

  /**
   * Description: 回滚确认应用服务
   * Summary: 回滚确认应用服务
   */
  async confirmOpsplanServicerollbackEx(request: ConfirmOpsplanServicerollbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmOpsplanServicerollbackResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmOpsplanServicerollbackResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.servicerollback.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmOpsplanServicerollbackResponse({}));
  }

  /**
   * Description: 重试发布服务
   * Summary: 重试发布服务
   */
  async retryOpsplanService(request: RetryOpsplanServiceRequest): Promise<RetryOpsplanServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryOpsplanServiceEx(request, headers, runtime);
  }

  /**
   * Description: 重试发布服务
   * Summary: 重试发布服务
   */
  async retryOpsplanServiceEx(request: RetryOpsplanServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryOpsplanServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryOpsplanServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.service.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryOpsplanServiceResponse({}));
  }

  /**
   * Description: 查询弹性场景
   * Summary: 查询弹性场景
   */
  async queryFlowElasticscene(request: QueryFlowElasticsceneRequest): Promise<QueryFlowElasticsceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowElasticsceneEx(request, headers, runtime);
  }

  /**
   * Description: 查询弹性场景
   * Summary: 查询弹性场景
   */
  async queryFlowElasticsceneEx(request: QueryFlowElasticsceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowElasticsceneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowElasticsceneResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticscene.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowElasticsceneResponse({}));
  }

  /**
   * Description: 查询弹性规则
   * Summary: 查询弹性规则
   */
  async queryFlowElasticrule(request: QueryFlowElasticruleRequest): Promise<QueryFlowElasticruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowElasticruleEx(request, headers, runtime);
  }

  /**
   * Description: 查询弹性规则
   * Summary: 查询弹性规则
   */
  async queryFlowElasticruleEx(request: QueryFlowElasticruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowElasticruleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowElasticruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticrule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowElasticruleResponse({}));
  }

  /**
   * Description: 查询弹性子规则
   * Summary: 查询弹性子规则
   */
  async queryFlowElasticsubrule(request: QueryFlowElasticsubruleRequest): Promise<QueryFlowElasticsubruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowElasticsubruleEx(request, headers, runtime);
  }

  /**
   * Description: 查询弹性子规则
   * Summary: 查询弹性子规则
   */
  async queryFlowElasticsubruleEx(request: QueryFlowElasticsubruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowElasticsubruleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowElasticsubruleResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticsubrule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowElasticsubruleResponse({}));
  }

  /**
   * Description: 查询当前弹性状态
   * Summary: 查询当前弹性状态
   */
  async queryFlowElasticvalue(request: QueryFlowElasticvalueRequest): Promise<QueryFlowElasticvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowElasticvalueEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前弹性状态
   * Summary: 查询当前弹性状态
   */
  async queryFlowElasticvalueEx(request: QueryFlowElasticvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowElasticvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowElasticvalueResponse>(await this.doRequest("1.0", "antcloud.ldc.flow.elasticvalue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowElasticvalueResponse({}));
  }

  /**
   * Description: 开关配置
   * Summary: 开关配置
   */
  async listSystemSwitch(request: ListSystemSwitchRequest): Promise<ListSystemSwitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSystemSwitchEx(request, headers, runtime);
  }

  /**
   * Description: 开关配置
   * Summary: 开关配置
   */
  async listSystemSwitchEx(request: ListSystemSwitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSystemSwitchResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSystemSwitchResponse>(await this.doRequest("1.0", "antcloud.ldc.system.switch.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSystemSwitchResponse({}));
  }

  /**
   * Description: 获取云原生技术栈对应的Dockerfile
   * Summary: 获取技术栈对应的Dockerfile
   */
  async loadBuildpackDockerfile(request: LoadBuildpackDockerfileRequest): Promise<LoadBuildpackDockerfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadBuildpackDockerfileEx(request, headers, runtime);
  }

  /**
   * Description: 获取云原生技术栈对应的Dockerfile
   * Summary: 获取技术栈对应的Dockerfile
   */
  async loadBuildpackDockerfileEx(request: LoadBuildpackDockerfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadBuildpackDockerfileResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadBuildpackDockerfileResponse>(await this.doRequest("1.0", "antcloud.ldc.buildpack.dockerfile.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadBuildpackDockerfileResponse({}));
  }

  /**
   * Description: 指定pod创建缩容运维单
   * Summary: 创建pod缩容运维单
   */
  async createOpsplanPodoffline(request: CreateOpsplanPodofflineRequest): Promise<CreateOpsplanPodofflineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOpsplanPodofflineEx(request, headers, runtime);
  }

  /**
   * Description: 指定pod创建缩容运维单
   * Summary: 创建pod缩容运维单
   */
  async createOpsplanPodofflineEx(request: CreateOpsplanPodofflineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOpsplanPodofflineResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOpsplanPodofflineResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.podoffline.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOpsplanPodofflineResponse({}));
  }

  /**
   * Description: 添加OB租户信息以及对应的uid分片段
   * Summary: 添加OB租户信息
   */
  async createDbflowObtenant(request: CreateDbflowObtenantRequest): Promise<CreateDbflowObtenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDbflowObtenantEx(request, headers, runtime);
  }

  /**
   * Description: 添加OB租户信息以及对应的uid分片段
   * Summary: 添加OB租户信息
   */
  async createDbflowObtenantEx(request: CreateDbflowObtenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDbflowObtenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDbflowObtenantResponse>(await this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDbflowObtenantResponse({}));
  }

  /**
   * Description: 分页查询ob租户列表
   * Summary: 分页查询ob租户列表
   */
  async queryDbflowObtenant(request: QueryDbflowObtenantRequest): Promise<QueryDbflowObtenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDbflowObtenantEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询ob租户列表
   * Summary: 分页查询ob租户列表
   */
  async queryDbflowObtenantEx(request: QueryDbflowObtenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDbflowObtenantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDbflowObtenantResponse>(await this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDbflowObtenantResponse({}));
  }

  /**
   * Description: 更新OB租户信息，包括uid映射
   * Summary: 更新OB租户信息
   */
  async updateDbflowObtenant(request: UpdateDbflowObtenantRequest): Promise<UpdateDbflowObtenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDbflowObtenantEx(request, headers, runtime);
  }

  /**
   * Description: 更新OB租户信息，包括uid映射
   * Summary: 更新OB租户信息
   */
  async updateDbflowObtenantEx(request: UpdateDbflowObtenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDbflowObtenantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDbflowObtenantResponse>(await this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDbflowObtenantResponse({}));
  }

  /**
   * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
   * Summary: 删除PaaS中记录的OB租户信息
   */
  async deleteDbflowObtenant(request: DeleteDbflowObtenantRequest): Promise<DeleteDbflowObtenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDbflowObtenantEx(request, headers, runtime);
  }

  /**
   * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
   * Summary: 删除PaaS中记录的OB租户信息
   */
  async deleteDbflowObtenantEx(request: DeleteDbflowObtenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDbflowObtenantResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDbflowObtenantResponse>(await this.doRequest("1.0", "antcloud.ldc.dbflow.obtenant.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDbflowObtenantResponse({}));
  }

  /**
   * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
   * Summary: 更新原生技术栈版本信息
   */
  async updateBuildpackNativetechstackversion(request: UpdateBuildpackNativetechstackversionRequest): Promise<UpdateBuildpackNativetechstackversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBuildpackNativetechstackversionEx(request, headers, runtime);
  }

  /**
   * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
   * Summary: 更新原生技术栈版本信息
   */
  async updateBuildpackNativetechstackversionEx(request: UpdateBuildpackNativetechstackversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBuildpackNativetechstackversionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBuildpackNativetechstackversionResponse>(await this.doRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBuildpackNativetechstackversionResponse({}));
  }

  /**
   * Description: 获取当前环境组的region列表信息
   * Summary: 获取环境组region信息
   */
  async listWorkspacegroupRegions(request: ListWorkspacegroupRegionsRequest): Promise<ListWorkspacegroupRegionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWorkspacegroupRegionsEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前环境组的region列表信息
   * Summary: 获取环境组region信息
   */
  async listWorkspacegroupRegionsEx(request: ListWorkspacegroupRegionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWorkspacegroupRegionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWorkspacegroupRegionsResponse>(await this.doRequest("1.0", "antcloud.ldc.workspacegroup.regions.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWorkspacegroupRegionsResponse({}));
  }

  /**
   * Description: 获取集群列表信息
   * Summary: 获取集群列表
   */
  async listClusterInfo(request: ListClusterInfoRequest): Promise<ListClusterInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterInfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取集群列表信息
   * Summary: 获取集群列表
   */
  async listClusterInfoEx(request: ListClusterInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterInfoResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.info.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterInfoResponse({}));
  }

  /**
   * Description: 获取集群资源状态信息
   * Summary: 获取集群资源状态信息
   */
  async listClusterOverview(request: ListClusterOverviewRequest): Promise<ListClusterOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterOverviewEx(request, headers, runtime);
  }

  /**
   * Description: 获取集群资源状态信息
   * Summary: 获取集群资源状态信息
   */
  async listClusterOverviewEx(request: ListClusterOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterOverviewResponse>(await this.doRequest("1.0", "antcloud.ldc.cluster.overview.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterOverviewResponse({}));
  }

  /**
   * Description: 查询ALB证书信息。
   * Summary: 查询ALB证书信息。
   */
  async listCertificates(request: ListCertificatesRequest): Promise<ListCertificatesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCertificatesEx(request, headers, runtime);
  }

  /**
   * Description: 查询ALB证书信息。
   * Summary: 查询ALB证书信息。
   */
  async listCertificatesEx(request: ListCertificatesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCertificatesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCertificatesResponse>(await this.doRequest("1.0", "antcloud.ldc.certificates.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCertificatesResponse({}));
  }

  /**
   * Description: 获取所有已被使用的lb iaas id。
   * Summary: 获取所有已被使用的lb iaas id。
   */
  async listLoadbalancer(request: ListLoadbalancerRequest): Promise<ListLoadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLoadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有已被使用的lb iaas id。
   * Summary: 获取所有已被使用的lb iaas id。
   */
  async listLoadbalancerEx(request: ListLoadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLoadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLoadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.loadbalancer.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLoadbalancerResponse({}));
  }

  /**
   * Description: 获取cloudconfig当前配置
   * Summary: 获取cloudconfig当前配置
   */
  async getCloudconfig(request: GetCloudconfigRequest): Promise<GetCloudconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCloudconfigEx(request, headers, runtime);
  }

  /**
   * Description: 获取cloudconfig当前配置
   * Summary: 获取cloudconfig当前配置
   */
  async getCloudconfigEx(request: GetCloudconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCloudconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCloudconfigResponse>(await this.doRequest("1.0", "antcloud.ldc.cloudconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCloudconfigResponse({}));
  }

  /**
   * Description: 更新cloudconfig
   * Summary: 更新cloudconfig
   */
  async updateCloudconfig(request: UpdateCloudconfigRequest): Promise<UpdateCloudconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCloudconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新cloudconfig
   * Summary: 更新cloudconfig
   */
  async updateCloudconfigEx(request: UpdateCloudconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCloudconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCloudconfigResponse>(await this.doRequest("1.0", "antcloud.ldc.cloudconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCloudconfigResponse({}));
  }

  /**
   * Description: 版本历史
   * Summary: 版本历史
   */
  async listCloudconfigHistory(request: ListCloudconfigHistoryRequest): Promise<ListCloudconfigHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCloudconfigHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 版本历史
   * Summary: 版本历史
   */
  async listCloudconfigHistoryEx(request: ListCloudconfigHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCloudconfigHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCloudconfigHistoryResponse>(await this.doRequest("1.0", "antcloud.ldc.cloudconfig.history.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCloudconfigHistoryResponse({}));
  }

  /**
   * Description: sidecar运维能力创建（接入|升级）
   * Summary: sidecar运维创建（接入|升级）
   */
  async createSidecarOperation(request: CreateSidecarOperationRequest): Promise<CreateSidecarOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSidecarOperationEx(request, headers, runtime);
  }

  /**
   * Description: sidecar运维能力创建（接入|升级）
   * Summary: sidecar运维创建（接入|升级）
   */
  async createSidecarOperationEx(request: CreateSidecarOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSidecarOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSidecarOperationResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.operation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSidecarOperationResponse({}));
  }

  /**
   * Description: 指定operationId重试sidecar运维
   * Summary: 重试sidecar运维
   */
  async retrySidecarOperation(request: RetrySidecarOperationRequest): Promise<RetrySidecarOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retrySidecarOperationEx(request, headers, runtime);
  }

  /**
   * Description: 指定operationId重试sidecar运维
   * Summary: 重试sidecar运维
   */
  async retrySidecarOperationEx(request: RetrySidecarOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetrySidecarOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<RetrySidecarOperationResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.operation.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetrySidecarOperationResponse({}));
  }

  /**
   * Description: 取消sidecar运维
   * Summary: 取消sidecar运维
   */
  async cancelSidecarOperation(request: CancelSidecarOperationRequest): Promise<CancelSidecarOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSidecarOperationEx(request, headers, runtime);
  }

  /**
   * Description: 取消sidecar运维
   * Summary: 取消sidecar运维
   */
  async cancelSidecarOperationEx(request: CancelSidecarOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSidecarOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSidecarOperationResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.operation.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSidecarOperationResponse({}));
  }

  /**
   * Description: create or update a service
   * Summary: patch a service
   */
  async updateService(request: UpdateServiceRequest): Promise<UpdateServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateServiceEx(request, headers, runtime);
  }

  /**
   * Description: create or update a service
   * Summary: patch a service
   */
  async updateServiceEx(request: UpdateServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.service.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateServiceResponse({}));
  }

  /**
   * Description: 九州通过LHC创建发布单
   * Summary: 九州通过LHC创建发布单
   */
  async createGpaasRelease(request: CreateGpaasReleaseRequest): Promise<CreateGpaasReleaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGpaasReleaseEx(request, headers, runtime);
  }

  /**
   * Description: 九州通过LHC创建发布单
   * Summary: 九州通过LHC创建发布单
   */
  async createGpaasReleaseEx(request: CreateGpaasReleaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGpaasReleaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGpaasReleaseResponse>(await this.doRequest("1.0", "antcloud.ldc.gpaas.release.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGpaasReleaseResponse({}));
  }

  /**
   * Description: 查询sidecar运维进度
   * Summary: 查询sidecar运维进度
   */
  async querySidecarOperation(request: QuerySidecarOperationRequest): Promise<QuerySidecarOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySidecarOperationEx(request, headers, runtime);
  }

  /**
   * Description: 查询sidecar运维进度
   * Summary: 查询sidecar运维进度
   */
  async querySidecarOperationEx(request: QuerySidecarOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySidecarOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySidecarOperationResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecar.operation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySidecarOperationResponse({}));
  }

  /**
   * Description: 查询Kubernetes原生资源
   * Summary: 查询Kubernetes原生资源
   */
  async listKubernetesResources(request: ListKubernetesResourcesRequest): Promise<ListKubernetesResourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listKubernetesResourcesEx(request, headers, runtime);
  }

  /**
   * Description: 查询Kubernetes原生资源
   * Summary: 查询Kubernetes原生资源
   */
  async listKubernetesResourcesEx(request: ListKubernetesResourcesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListKubernetesResourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListKubernetesResourcesResponse>(await this.doRequest("1.0", "antcloud.ldc.kubernetes.resources.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListKubernetesResourcesResponse({}));
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryReleasepipelinestageEvent(request: QueryReleasepipelinestageEventRequest): Promise<QueryReleasepipelinestageEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryReleasepipelinestageEventEx(request, headers, runtime);
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryReleasepipelinestageEventEx(request: QueryReleasepipelinestageEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryReleasepipelinestageEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryReleasepipelinestageEventResponse>(await this.doRequest("1.0", "antcloud.ldc.releasepipelinestage.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryReleasepipelinestageEventResponse({}));
  }

  /**
   * Description: 获取projectname
   * Summary: 获取projectname
   */
  async getSlsProjectname(request: GetSlsProjectnameRequest): Promise<GetSlsProjectnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSlsProjectnameEx(request, headers, runtime);
  }

  /**
   * Description: 获取projectname
   * Summary: 获取projectname
   */
  async getSlsProjectnameEx(request: GetSlsProjectnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSlsProjectnameResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSlsProjectnameResponse>(await this.doRequest("1.0", "antcloud.ldc.sls.projectname.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSlsProjectnameResponse({}));
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryReleasepipelineEvent(request: QueryReleasepipelineEventRequest): Promise<QueryReleasepipelineEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryReleasepipelineEventEx(request, headers, runtime);
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryReleasepipelineEventEx(request: QueryReleasepipelineEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryReleasepipelineEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryReleasepipelineEventResponse>(await this.doRequest("1.0", "antcloud.ldc.releasepipeline.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryReleasepipelineEventResponse({}));
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryPodEvent(request: QueryPodEventRequest): Promise<QueryPodEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPodEventEx(request, headers, runtime);
  }

  /**
   * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关k8s事件查询
   */
  async queryPodEventEx(request: QueryPodEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPodEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPodEventResponse>(await this.doRequest("1.0", "antcloud.ldc.pod.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPodEventResponse({}));
  }

  /**
   * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关logs查询
   */
  async queryServiceProcesslog(request: QueryServiceProcesslogRequest): Promise<QueryServiceProcesslogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceProcesslogEx(request, headers, runtime);
  }

  /**
   * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
   * Summary: ldc发布单相关logs查询
   */
  async queryServiceProcesslogEx(request: QueryServiceProcesslogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceProcesslogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceProcesslogResponse>(await this.doRequest("1.0", "antcloud.ldc.service.processlog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceProcesslogResponse({}));
  }

  /**
   * Description: 应用管理-在应用维度查询容器应用服务
   * Summary: 应用管理-在应用维度查询容器应用服务
   */
  async queryAppService(request: QueryAppServiceRequest): Promise<QueryAppServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppServiceEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-在应用维度查询容器应用服务
   * Summary: 应用管理-在应用维度查询容器应用服务
   */
  async queryAppServiceEx(request: QueryAppServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppServiceResponse>(await this.doRequest("1.0", "antcloud.ldc.app.service.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppServiceResponse({}));
  }

  /**
   * Description: 应用管理-应用维度查询容器应用服务发布单
   * Summary: 应用管理-应用维度查询容器应用服务发布单
   */
  async queryAppPlan(request: QueryAppPlanRequest): Promise<QueryAppPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppPlanEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-应用维度查询容器应用服务发布单
   * Summary: 应用管理-应用维度查询容器应用服务发布单
   */
  async queryAppPlanEx(request: QueryAppPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppPlanResponse>(await this.doRequest("1.0", "antcloud.ldc.app.plan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppPlanResponse({}));
  }

  /**
   * Description: 创建统一接入实例，支持单元化和非单元化两种模式
   * Summary: 创建统一接入实例
   */
  async createUnifiedaccessinstance(request: CreateUnifiedaccessinstanceRequest): Promise<CreateUnifiedaccessinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnifiedaccessinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 创建统一接入实例，支持单元化和非单元化两种模式
   * Summary: 创建统一接入实例
   */
  async createUnifiedaccessinstanceEx(request: CreateUnifiedaccessinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnifiedaccessinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnifiedaccessinstanceResponse>(await this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnifiedaccessinstanceResponse({}));
  }

  /**
   * Description: 查询统一接入实例列表信息
   * Summary: 查询统一接入实例列表信息
   */
  async queryUnifiedaccessinstance(request: QueryUnifiedaccessinstanceRequest): Promise<QueryUnifiedaccessinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedaccessinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询统一接入实例列表信息
   * Summary: 查询统一接入实例列表信息
   */
  async queryUnifiedaccessinstanceEx(request: QueryUnifiedaccessinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedaccessinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedaccessinstanceResponse>(await this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedaccessinstanceResponse({}));
  }

  /**
   * Description: 获取统一接入单个实例信息
   * Summary: 获取统一接入单个实例信息
   */
  async getUnifiedaccessinstance(request: GetUnifiedaccessinstanceRequest): Promise<GetUnifiedaccessinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnifiedaccessinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取统一接入单个实例信息
   * Summary: 获取统一接入单个实例信息
   */
  async getUnifiedaccessinstanceEx(request: GetUnifiedaccessinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnifiedaccessinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnifiedaccessinstanceResponse>(await this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnifiedaccessinstanceResponse({}));
  }

  /**
   * Description: 删除统一接入实例
   * Summary: 删除统一接入实例
   */
  async deleteUnifiedaccessinstance(request: DeleteUnifiedaccessinstanceRequest): Promise<DeleteUnifiedaccessinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUnifiedaccessinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 删除统一接入实例
   * Summary: 删除统一接入实例
   */
  async deleteUnifiedaccessinstanceEx(request: DeleteUnifiedaccessinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUnifiedaccessinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUnifiedaccessinstanceResponse>(await this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUnifiedaccessinstanceResponse({}));
  }

  /**
   * Description: 更新统一接入实例信息
   * Summary: 更新统一接入实例信息
   */
  async updateUnifiedaccessinstance(request: UpdateUnifiedaccessinstanceRequest): Promise<UpdateUnifiedaccessinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUnifiedaccessinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 更新统一接入实例信息
   * Summary: 更新统一接入实例信息
   */
  async updateUnifiedaccessinstanceEx(request: UpdateUnifiedaccessinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUnifiedaccessinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUnifiedaccessinstanceResponse>(await this.doRequest("1.0", "antcloud.ldc.unifiedaccessinstance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUnifiedaccessinstanceResponse({}));
  }

  /**
   * Description: ldc 对接统一发布 openAPI
   * Summary: ldc 对接统一发布 openAPI
   */
  async execUnireleasespi(request: ExecUnireleasespiRequest): Promise<ExecUnireleasespiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execUnireleasespiEx(request, headers, runtime);
  }

  /**
   * Description: ldc 对接统一发布 openAPI
   * Summary: ldc 对接统一发布 openAPI
   */
  async execUnireleasespiEx(request: ExecUnireleasespiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecUnireleasespiResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecUnireleasespiResponse>(await this.doRequest("1.0", "antcloud.ldc.unireleasespi.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecUnireleasespiResponse({}));
  }

  /**
   * Description: 用于创建 fed spanner 集群
   * Summary: 创建 fed spanner 集群
   */
  async createFedspannercluster(request: CreateFedspannerclusterRequest): Promise<CreateFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 用于创建 fed spanner 集群
   * Summary: 创建 fed spanner 集群
   */
  async createFedspannerclusterEx(request: CreateFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFedspannerclusterResponse({}));
  }

  /**
   * Description: 查询联邦fed spanner 集群状态信息
   * Summary: 查询 fed spanner 集群
   */
  async queryFedspannercluster(request: QueryFedspannerclusterRequest): Promise<QueryFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 查询联邦fed spanner 集群状态信息
   * Summary: 查询 fed spanner 集群
   */
  async queryFedspannerclusterEx(request: QueryFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFedspannerclusterResponse({}));
  }

  /**
   * Description: 通过fed集群 name 获取单个集群详细信息
   * Summary: 获取单个fed spanner 集群信息
   */
  async getFedspannercluster(request: GetFedspannerclusterRequest): Promise<GetFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 通过fed集群 name 获取单个集群详细信息
   * Summary: 获取单个fed spanner 集群信息
   */
  async getFedspannerclusterEx(request: GetFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFedspannerclusterResponse({}));
  }

  /**
   * Description: 展示所有联邦 spanner 集群
   * Summary: 展示所有联邦 spanner 集群
   */
  async listFedspannercluster(request: ListFedspannerclusterRequest): Promise<ListFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 展示所有联邦 spanner 集群
   * Summary: 展示所有联邦 spanner 集群
   */
  async listFedspannerclusterEx(request: ListFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFedspannerclusterResponse({}));
  }

  /**
   * Description: 删除指定fed spanner集群
   * Summary: 删除 联邦spanner集群
   */
  async deleteFedspannercluster(request: DeleteFedspannerclusterRequest): Promise<DeleteFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定fed spanner集群
   * Summary: 删除 联邦spanner集群
   */
  async deleteFedspannerclusterEx(request: DeleteFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFedspannerclusterResponse({}));
  }

  /**
   * Description: 批量删除指定集群
   * Summary: 批量删除 fed spanner 集群
   */
  async batchdeleteFedspannercluster(request: BatchdeleteFedspannerclusterRequest): Promise<BatchdeleteFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除指定集群
   * Summary: 批量删除 fed spanner 集群
   */
  async batchdeleteFedspannerclusterEx(request: BatchdeleteFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteFedspannerclusterResponse({}));
  }

  /**
   * Description: 更新 fed spanner 集群
   * Summary: 更新 fed spanner 集群
   */
  async updateFedspannercluster(request: UpdateFedspannerclusterRequest): Promise<UpdateFedspannerclusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFedspannerclusterEx(request, headers, runtime);
  }

  /**
   * Description: 更新 fed spanner 集群
   * Summary: 更新 fed spanner 集群
   */
  async updateFedspannerclusterEx(request: UpdateFedspannerclusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFedspannerclusterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFedspannerclusterResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFedspannerclusterResponse({}));
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createReleaseplan(request: CreateReleaseplanRequest): Promise<CreateReleaseplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createReleaseplanEx(request, headers, runtime);
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createReleaseplanEx(request: CreateReleaseplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateReleaseplanResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateReleaseplanResponse>(await this.doRequest("1.0", "antcloud.ldc.releaseplan.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateReleaseplanResponse({}));
  }

  /**
   * Description: 需要指定fed spanner cluster name 和期望的合法状态
   * Summary: 更新 spanner 集群 状态
   */
  async updateFedspannerclusterStatus(request: UpdateFedspannerclusterStatusRequest): Promise<UpdateFedspannerclusterStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFedspannerclusterStatusEx(request, headers, runtime);
  }

  /**
   * Description: 需要指定fed spanner cluster name 和期望的合法状态
   * Summary: 更新 spanner 集群 状态
   */
  async updateFedspannerclusterStatusEx(request: UpdateFedspannerclusterStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFedspannerclusterStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFedspannerclusterStatusResponse>(await this.doRequest("1.0", "antcloud.ldc.fedspannercluster.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFedspannerclusterStatusResponse({}));
  }

  /**
   * Description: 添加antvip域名
   * Summary: 添加antvip域名
   */
  async addAntvipDomain(request: AddAntvipDomainRequest): Promise<AddAntvipDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAntvipDomainEx(request, headers, runtime);
  }

  /**
   * Description: 添加antvip域名
   * Summary: 添加antvip域名
   */
  async addAntvipDomainEx(request: AddAntvipDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAntvipDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAntvipDomainResponse>(await this.doRequest("1.0", "antcloud.ldc.antvip.domain.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAntvipDomainResponse({}));
  }

  /**
   * Description: 删除antvip域名
   * Summary: 删除antvip域名
   */
  async deleteAntvipDomain(request: DeleteAntvipDomainRequest): Promise<DeleteAntvipDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAntvipDomainEx(request, headers, runtime);
  }

  /**
   * Description: 删除antvip域名
   * Summary: 删除antvip域名
   */
  async deleteAntvipDomainEx(request: DeleteAntvipDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAntvipDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAntvipDomainResponse>(await this.doRequest("1.0", "antcloud.ldc.antvip.domain.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAntvipDomainResponse({}));
  }

  /**
   * Description: 查询容器服务 Ingress 列表。
   * Summary: 查询容器服务 Ingress 列表。
   */
  async listContainerserviceIngress(request: ListContainerserviceIngressRequest): Promise<ListContainerserviceIngressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContainerserviceIngressEx(request, headers, runtime);
  }

  /**
   * Description: 查询容器服务 Ingress 列表。
   * Summary: 查询容器服务 Ingress 列表。
   */
  async listContainerserviceIngressEx(request: ListContainerserviceIngressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContainerserviceIngressResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContainerserviceIngressResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.ingress.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContainerserviceIngressResponse({}));
  }

  /**
   * Description: 创建一个运维单
   * Summary: 创建一个运维单
   */
  async createContainerserviceOperation(request: CreateContainerserviceOperationRequest): Promise<CreateContainerserviceOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContainerserviceOperationEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个运维单
   * Summary: 创建一个运维单
   */
  async createContainerserviceOperationEx(request: CreateContainerserviceOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContainerserviceOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContainerserviceOperationResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.operation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContainerserviceOperationResponse({}));
  }

  /**
   * Description: 查询多集群k8s事件
   * Summary: 查询多集群k8s event
   */
  async listMulticlusterEvents(request: ListMulticlusterEventsRequest): Promise<ListMulticlusterEventsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMulticlusterEventsEx(request, headers, runtime);
  }

  /**
   * Description: 查询多集群k8s事件
   * Summary: 查询多集群k8s event
   */
  async listMulticlusterEventsEx(request: ListMulticlusterEventsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMulticlusterEventsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMulticlusterEventsResponse>(await this.doRequest("1.0", "antcloud.ldc.multicluster.events.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMulticlusterEventsResponse({}));
  }

  /**
   * Description: 部署单提交审批申请
   * Summary: 部署单提交审批申请
   */
  async applyContainerserviceDeployment(request: ApplyContainerserviceDeploymentRequest): Promise<ApplyContainerserviceDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContainerserviceDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 部署单提交审批申请
   * Summary: 部署单提交审批申请
   */
  async applyContainerserviceDeploymentEx(request: ApplyContainerserviceDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContainerserviceDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContainerserviceDeploymentResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.deployment.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContainerserviceDeploymentResponse({}));
  }

  /**
   * Description: 蓝绿发布调整Ingress流量权重比例
   * Summary: 蓝绿发布调整Ingress流量权重比例
   */
  async updateIngressTrafficweight(request: UpdateIngressTrafficweightRequest): Promise<UpdateIngressTrafficweightResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIngressTrafficweightEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布调整Ingress流量权重比例
   * Summary: 蓝绿发布调整Ingress流量权重比例
   */
  async updateIngressTrafficweightEx(request: UpdateIngressTrafficweightRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIngressTrafficweightResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIngressTrafficweightResponse>(await this.doRequest("1.0", "antcloud.ldc.ingress.trafficweight.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIngressTrafficweightResponse({}));
  }

  /**
   * Description: 蓝绿发布查询单蓝区信息
   * Summary: 蓝绿发布查询单蓝区信息
   */
  async getOpsplanBluedetail(request: GetOpsplanBluedetailRequest): Promise<GetOpsplanBluedetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOpsplanBluedetailEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布查询单蓝区信息
   * Summary: 蓝绿发布查询单蓝区信息
   */
  async getOpsplanBluedetailEx(request: GetOpsplanBluedetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOpsplanBluedetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOpsplanBluedetailResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.bluedetail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOpsplanBluedetailResponse({}));
  }

  /**
   * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
   * Summary: 蓝绿发布查询Ingress流量权重
   */
  async listIngressTrafficweight(request: ListIngressTrafficweightRequest): Promise<ListIngressTrafficweightResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIngressTrafficweightEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
   * Summary: 蓝绿发布查询Ingress流量权重
   */
  async listIngressTrafficweightEx(request: ListIngressTrafficweightRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIngressTrafficweightResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIngressTrafficweightResponse>(await this.doRequest("1.0", "antcloud.ldc.ingress.trafficweight.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIngressTrafficweightResponse({}));
  }

  /**
   * Description: 基于OAM模型创建包含多应用服务的应用
   * Summary: 创建包含多应用服务的应用
   */
  async createOamserviceApplicationconfiguration(request: CreateOamserviceApplicationconfigurationRequest): Promise<CreateOamserviceApplicationconfigurationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOamserviceApplicationconfigurationEx(request, headers, runtime);
  }

  /**
   * Description: 基于OAM模型创建包含多应用服务的应用
   * Summary: 创建包含多应用服务的应用
   */
  async createOamserviceApplicationconfigurationEx(request: CreateOamserviceApplicationconfigurationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOamserviceApplicationconfigurationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOamserviceApplicationconfigurationResponse>(await this.doRequest("1.0", "antcloud.ldc.oamservice.applicationconfiguration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOamserviceApplicationconfigurationResponse({}));
  }

  /**
   * Description: 用于创建联邦负载均衡实例
   * Summary: 创建联邦负载均衡实例
   */
  async createFedloadbalancer(request: CreateFedloadbalancerRequest): Promise<CreateFedloadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFedloadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 用于创建联邦负载均衡实例
   * Summary: 创建联邦负载均衡实例
   */
  async createFedloadbalancerEx(request: CreateFedloadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFedloadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFedloadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFedloadbalancerResponse({}));
  }

  /**
   * Description: 更新联邦负载均衡实例
   * Summary: 更新联邦负载均衡实例
   */
  async updateFedloadbalancer(request: UpdateFedloadbalancerRequest): Promise<UpdateFedloadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFedloadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 更新联邦负载均衡实例
   * Summary: 更新联邦负载均衡实例
   */
  async updateFedloadbalancerEx(request: UpdateFedloadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFedloadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFedloadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFedloadbalancerResponse({}));
  }

  /**
   * Description: list联邦负载均衡实例
   * Summary: list联邦负载均衡实例
   */
  async listFedloadbalancer(request: ListFedloadbalancerRequest): Promise<ListFedloadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFedloadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: list联邦负载均衡实例
   * Summary: list联邦负载均衡实例
   */
  async listFedloadbalancerEx(request: ListFedloadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFedloadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFedloadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFedloadbalancerResponse({}));
  }

  /**
   * Description: 删除联邦负载均衡
   * Summary: 删除联邦负载均衡实例
   */
  async deleteFedloadbalancer(request: DeleteFedloadbalancerRequest): Promise<DeleteFedloadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFedloadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 删除联邦负载均衡
   * Summary: 删除联邦负载均衡实例
   */
  async deleteFedloadbalancerEx(request: DeleteFedloadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFedloadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFedloadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFedloadbalancerResponse({}));
  }

  /**
   * Description: 查询单个联邦负载均衡实例
   * Summary: 查询单个联邦负载均衡实例
   */
  async getFedloadbalancer(request: GetFedloadbalancerRequest): Promise<GetFedloadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFedloadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个联邦负载均衡实例
   * Summary: 查询单个联邦负载均衡实例
   */
  async getFedloadbalancerEx(request: GetFedloadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFedloadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFedloadbalancerResponse>(await this.doRequest("1.0", "antcloud.ldc.fedloadbalancer.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFedloadbalancerResponse({}));
  }

  /**
   * Description: 导入统一解决方案
   * Summary: 导入统一解决方案
   */
  async importUnireleaseSolution(request: ImportUnireleaseSolutionRequest): Promise<ImportUnireleaseSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importUnireleaseSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 导入统一解决方案
   * Summary: 导入统一解决方案
   */
  async importUnireleaseSolutionEx(request: ImportUnireleaseSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportUnireleaseSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportUnireleaseSolutionResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.solution.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportUnireleaseSolutionResponse({}));
  }

  /**
   * Description: 查询解决方案列表
   * Summary: 查询解决方案列表
   */
  async listUnireleaseSolutions(request: ListUnireleaseSolutionsRequest): Promise<ListUnireleaseSolutionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnireleaseSolutionsEx(request, headers, runtime);
  }

  /**
   * Description: 查询解决方案列表
   * Summary: 查询解决方案列表
   */
  async listUnireleaseSolutionsEx(request: ListUnireleaseSolutionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnireleaseSolutionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnireleaseSolutionsResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.solutions.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnireleaseSolutionsResponse({}));
  }

  /**
   * Description: 查询解决方案发布详情
   * Summary: 查询解决方案发布详情
   */
  async getUnireleaseSolution(request: GetUnireleaseSolutionRequest): Promise<GetUnireleaseSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnireleaseSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 查询解决方案发布详情
   * Summary: 查询解决方案发布详情
   */
  async getUnireleaseSolutionEx(request: GetUnireleaseSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnireleaseSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnireleaseSolutionResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.solution.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnireleaseSolutionResponse({}));
  }

  /**
   * Description: 查询解决方案发布状态
   * Summary: 查询解决方案发布状态
   */
  async getUnireleasePipeline(request: GetUnireleasePipelineRequest): Promise<GetUnireleasePipelineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnireleasePipelineEx(request, headers, runtime);
  }

  /**
   * Description: 查询解决方案发布状态
   * Summary: 查询解决方案发布状态
   */
  async getUnireleasePipelineEx(request: GetUnireleasePipelineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnireleasePipelineResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnireleasePipelineResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.pipeline.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnireleasePipelineResponse({}));
  }

  /**
   * Description: 执行机构发布单
   * Summary: 执行机构发布单
   */
  async execUnireleasePipelines(request: ExecUnireleasePipelinesRequest): Promise<ExecUnireleasePipelinesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execUnireleasePipelinesEx(request, headers, runtime);
  }

  /**
   * Description: 执行机构发布单
   * Summary: 执行机构发布单
   */
  async execUnireleasePipelinesEx(request: ExecUnireleasePipelinesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecUnireleasePipelinesResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecUnireleasePipelinesResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.pipelines.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecUnireleasePipelinesResponse({}));
  }

  /**
   * Description: 根据解决方案反查相关租户信息
   * Summary: 根据解决方案反查相关租户信息
   */
  async getUnireleaseTenants(request: GetUnireleaseTenantsRequest): Promise<GetUnireleaseTenantsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnireleaseTenantsEx(request, headers, runtime);
  }

  /**
   * Description: 根据解决方案反查相关租户信息
   * Summary: 根据解决方案反查相关租户信息
   */
  async getUnireleaseTenantsEx(request: GetUnireleaseTenantsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnireleaseTenantsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnireleaseTenantsResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.tenants.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnireleaseTenantsResponse({}));
  }

  /**
   * Description: 添加中间接变更配置
   * Summary: 添加中间接变更配置
   */
  async addContainerserviceMiddlewareconfig(request: AddContainerserviceMiddlewareconfigRequest): Promise<AddContainerserviceMiddlewareconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContainerserviceMiddlewareconfigEx(request, headers, runtime);
  }

  /**
   * Description: 添加中间接变更配置
   * Summary: 添加中间接变更配置
   */
  async addContainerserviceMiddlewareconfigEx(request: AddContainerserviceMiddlewareconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContainerserviceMiddlewareconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContainerserviceMiddlewareconfigResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.middlewareconfig.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContainerserviceMiddlewareconfigResponse({}));
  }

  /**
   * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
   * Summary: 计算分批结果
   */
  async exportOpsplanStages(request: ExportOpsplanStagesRequest): Promise<ExportOpsplanStagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportOpsplanStagesEx(request, headers, runtime);
  }

  /**
   * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
   * Summary: 计算分批结果
   */
  async exportOpsplanStagesEx(request: ExportOpsplanStagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportOpsplanStagesResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportOpsplanStagesResponse>(await this.doRequest("1.0", "antcloud.ldc.opsplan.stages.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportOpsplanStagesResponse({}));
  }

  /**
   * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
   * Summary: 应用（服务）基础信息
   */
  async detailAppMetainfo(request: DetailAppMetainfoRequest): Promise<DetailAppMetainfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAppMetainfoEx(request, headers, runtime);
  }

  /**
   * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
   * Summary: 应用（服务）基础信息
   */
  async detailAppMetainfoEx(request: DetailAppMetainfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAppMetainfoResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAppMetainfoResponse>(await this.doRequest("1.0", "antcloud.ldc.app.metainfo.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAppMetainfoResponse({}));
  }

  /**
   * Description: 为指定sidecar更新版本信息，如镜像，feature等
   * Summary: 更新sidecar版本
   */
  async updateSidecarops(request: UpdateSidecaropsRequest): Promise<UpdateSidecaropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecaropsEx(request, headers, runtime);
  }

  /**
   * Description: 为指定sidecar更新版本信息，如镜像，feature等
   * Summary: 更新sidecar版本
   */
  async updateSidecaropsEx(request: UpdateSidecaropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecaropsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecaropsResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecaropsResponse({}));
  }

  /**
   * Description: 查询应用服务当前的部署单元，及部署副本数
   * Summary: 查询应用服务当前的部署单元，及部署副本数
   */
  async countContainerserviceCellreplicas(request: CountContainerserviceCellreplicasRequest): Promise<CountContainerserviceCellreplicasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countContainerserviceCellreplicasEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务当前的部署单元，及部署副本数
   * Summary: 查询应用服务当前的部署单元，及部署副本数
   */
  async countContainerserviceCellreplicasEx(request: CountContainerserviceCellreplicasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountContainerserviceCellreplicasResponse> {
    Util.validateModel(request);
    return $tea.cast<CountContainerserviceCellreplicasResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.cellreplicas.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountContainerserviceCellreplicasResponse({}));
  }

  /**
   * Description: 获取指定类型sidecar的template列表，最多20条。
   * Summary: 获取sidecar的template列表
   */
  async listSidecaropsTemplate(request: ListSidecaropsTemplateRequest): Promise<ListSidecaropsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecaropsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定类型sidecar的template列表，最多20条。
   * Summary: 获取sidecar的template列表
   */
  async listSidecaropsTemplateEx(request: ListSidecaropsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecaropsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecaropsTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecaropsTemplateResponse({}));
  }

  /**
   * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
   * Summary: 应用sidecar更新的一致性拉齐
   */
  async updateSidecaropsConsistency(request: UpdateSidecaropsConsistencyRequest): Promise<UpdateSidecaropsConsistencyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecaropsConsistencyEx(request, headers, runtime);
  }

  /**
   * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
   * Summary: 应用sidecar更新的一致性拉齐
   */
  async updateSidecaropsConsistencyEx(request: UpdateSidecaropsConsistencyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecaropsConsistencyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecaropsConsistencyResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.consistency.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecaropsConsistencyResponse({}));
  }

  /**
   * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
   * Summary: 版本清理
   */
  async finishSidecarops(request: FinishSidecaropsRequest): Promise<FinishSidecaropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishSidecaropsEx(request, headers, runtime);
  }

  /**
   * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
   * Summary: 版本清理
   */
  async finishSidecaropsEx(request: FinishSidecaropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishSidecaropsResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishSidecaropsResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishSidecaropsResponse({}));
  }

  /**
   * Description: 查询rd的当前状态。
   * Summary: 查询更新状态
   */
  async querySidecaropsState(request: QuerySidecaropsStateRequest): Promise<QuerySidecaropsStateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySidecaropsStateEx(request, headers, runtime);
  }

  /**
   * Description: 查询rd的当前状态。
   * Summary: 查询更新状态
   */
  async querySidecaropsStateEx(request: QuerySidecaropsStateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySidecaropsStateResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySidecaropsStateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.state.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySidecaropsStateResponse({}));
  }

  /**
   * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
   * Summary: 添加sidecar基础模板
   */
  async addSidecaropsTemplate(request: AddSidecaropsTemplateRequest): Promise<AddSidecaropsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addSidecaropsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
   * Summary: 添加sidecar基础模板
   */
  async addSidecaropsTemplateEx(request: AddSidecaropsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddSidecaropsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AddSidecaropsTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.template.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddSidecaropsTemplateResponse({}));
  }

  /**
   * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
   * Summary: 查询应用发布sidecar升级的相关记录
   */
  async querySidecaropsReleaseinfo(request: QuerySidecaropsReleaseinfoRequest): Promise<QuerySidecaropsReleaseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySidecaropsReleaseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
   * Summary: 查询应用发布sidecar升级的相关记录
   */
  async querySidecaropsReleaseinfoEx(request: QuerySidecaropsReleaseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySidecaropsReleaseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySidecaropsReleaseinfoResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.releaseinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySidecaropsReleaseinfoResponse({}));
  }

  /**
   * Description: 给存量应用服务注入sidecar，应用服务需已经创建
   * Summary: 初始化注入sidecar
   */
  async initSidecarops(request: InitSidecaropsRequest): Promise<InitSidecaropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initSidecaropsEx(request, headers, runtime);
  }

  /**
   * Description: 给存量应用服务注入sidecar，应用服务需已经创建
   * Summary: 初始化注入sidecar
   */
  async initSidecaropsEx(request: InitSidecaropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitSidecaropsResponse> {
    Util.validateModel(request);
    return $tea.cast<InitSidecaropsResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitSidecaropsResponse({}));
  }

  /**
   * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
   * Summary: 重启sidecar容器
   */
  async rebootSidecarops(request: RebootSidecaropsRequest): Promise<RebootSidecaropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rebootSidecaropsEx(request, headers, runtime);
  }

  /**
   * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
   * Summary: 重启sidecar容器
   */
  async rebootSidecaropsEx(request: RebootSidecaropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RebootSidecaropsResponse> {
    Util.validateModel(request);
    return $tea.cast<RebootSidecaropsResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.reboot", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RebootSidecaropsResponse({}));
  }

  /**
   * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
   * Summary: 删除指定版本
   */
  async deleteContainerserviceRevision(request: DeleteContainerserviceRevisionRequest): Promise<DeleteContainerserviceRevisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContainerserviceRevisionEx(request, headers, runtime);
  }

  /**
   * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
   * Summary: 删除指定版本
   */
  async deleteContainerserviceRevisionEx(request: DeleteContainerserviceRevisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContainerserviceRevisionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContainerserviceRevisionResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.revision.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContainerserviceRevisionResponse({}));
  }

  /**
   * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
   * Summary: 手动执行 hook 配置的 api
   */
  async execContainerserviceApihook(request: ExecContainerserviceApihookRequest): Promise<ExecContainerserviceApihookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContainerserviceApihookEx(request, headers, runtime);
  }

  /**
   * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
   * Summary: 手动执行 hook 配置的 api
   */
  async execContainerserviceApihookEx(request: ExecContainerserviceApihookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContainerserviceApihookResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContainerserviceApihookResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.apihook.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContainerserviceApihookResponse({}));
  }

  /**
   * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
   * Summary: 获取已发布应用服务配置
   */
  async querySidecaropsAllservices(request: QuerySidecaropsAllservicesRequest): Promise<QuerySidecaropsAllservicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySidecaropsAllservicesEx(request, headers, runtime);
  }

  /**
   * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
   * Summary: 获取已发布应用服务配置
   */
  async querySidecaropsAllservicesEx(request: QuerySidecaropsAllservicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySidecaropsAllservicesResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySidecaropsAllservicesResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.allservices.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySidecaropsAllservicesResponse({}));
  }

  /**
   * Description: 可用于更新基线模板的作用范围等
   * Summary: 更新sidecar基线模板
   */
  async updateSidecaropsTemplate(request: UpdateSidecaropsTemplateRequest): Promise<UpdateSidecaropsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecaropsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 可用于更新基线模板的作用范围等
   * Summary: 更新sidecar基线模板
   */
  async updateSidecaropsTemplateEx(request: UpdateSidecaropsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecaropsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecaropsTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.sidecarops.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecaropsTemplateResponse({}));
  }

  /**
   * Description: 创建发布模板
   * Summary: 创建发布模板
   */
  async createDeploymentTemplate(request: CreateDeploymentTemplateRequest): Promise<CreateDeploymentTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeploymentTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 创建发布模板
   * Summary: 创建发布模板
   */
  async createDeploymentTemplateEx(request: CreateDeploymentTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeploymentTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeploymentTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeploymentTemplateResponse({}));
  }

  /**
   * Description: 查询发布方案文件列表
   * Summary: 查询发布方案文件列表
   */
  async queryUnireleaseSolutionfiles(request: QueryUnireleaseSolutionfilesRequest): Promise<QueryUnireleaseSolutionfilesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnireleaseSolutionfilesEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布方案文件列表
   * Summary: 查询发布方案文件列表
   */
  async queryUnireleaseSolutionfilesEx(request: QueryUnireleaseSolutionfilesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnireleaseSolutionfilesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnireleaseSolutionfilesResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.solutionfiles.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnireleaseSolutionfilesResponse({}));
  }

  /**
   * Description: 获取发布方案文件内容
   * Summary: 获取发布方案文件内容
   */
  async getUnireleaseSolutionfile(request: GetUnireleaseSolutionfileRequest): Promise<GetUnireleaseSolutionfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnireleaseSolutionfileEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布方案文件内容
   * Summary: 获取发布方案文件内容
   */
  async getUnireleaseSolutionfileEx(request: GetUnireleaseSolutionfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnireleaseSolutionfileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnireleaseSolutionfileResponse>(await this.doRequest("1.0", "antcloud.ldc.unirelease.solutionfile.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnireleaseSolutionfileResponse({}));
  }

  /**
   * Description: 更新发布模板
   * Summary: 更新发布模板
   */
  async updateDeploymentTemplate(request: UpdateDeploymentTemplateRequest): Promise<UpdateDeploymentTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDeploymentTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 更新发布模板
   * Summary: 更新发布模板
   */
  async updateDeploymentTemplateEx(request: UpdateDeploymentTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDeploymentTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDeploymentTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDeploymentTemplateResponse({}));
  }

  /**
   * Description: 查询发布模板
   * Summary: 查询发布模板
   */
  async listDeploymentTemplate(request: ListDeploymentTemplateRequest): Promise<ListDeploymentTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDeploymentTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布模板
   * Summary: 查询发布模板
   */
  async listDeploymentTemplateEx(request: ListDeploymentTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDeploymentTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDeploymentTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDeploymentTemplateResponse({}));
  }

  /**
   * Description: 删除发布模板
   * Summary: 删除发布模板
   */
  async deleteDeploymentTemplate(request: DeleteDeploymentTemplateRequest): Promise<DeleteDeploymentTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDeploymentTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 删除发布模板
   * Summary: 删除发布模板
   */
  async deleteDeploymentTemplateEx(request: DeleteDeploymentTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDeploymentTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDeploymentTemplateResponse>(await this.doRequest("1.0", "antcloud.ldc.deployment.template.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDeploymentTemplateResponse({}));
  }

  /**
   * Description: 查询守夜人预案列表
   * Summary: 查询守夜人预案列表
   */
  async listEmergencyPlans(request: ListEmergencyPlansRequest): Promise<ListEmergencyPlansResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEmergencyPlansEx(request, headers, runtime);
  }

  /**
   * Description: 查询守夜人预案列表
   * Summary: 查询守夜人预案列表
   */
  async listEmergencyPlansEx(request: ListEmergencyPlansRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEmergencyPlansResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEmergencyPlansResponse>(await this.doRequest("1.0", "antcloud.ldc.emergency.plans.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEmergencyPlansResponse({}));
  }

  /**
   * Description: 修改灰度发布规则
   * Summary: 修改灰度发布规则
   */
  async updateContainerserviceGrayreleaseconfig(request: UpdateContainerserviceGrayreleaseconfigRequest): Promise<UpdateContainerserviceGrayreleaseconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContainerserviceGrayreleaseconfigEx(request, headers, runtime);
  }

  /**
   * Description: 修改灰度发布规则
   * Summary: 修改灰度发布规则
   */
  async updateContainerserviceGrayreleaseconfigEx(request: UpdateContainerserviceGrayreleaseconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContainerserviceGrayreleaseconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContainerserviceGrayreleaseconfigResponse>(await this.doRequest("1.0", "antcloud.ldc.containerservice.grayreleaseconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContainerserviceGrayreleaseconfigResponse({}));
  }

  /**
   * Description: 查询（灰度）发布单的灰度发布配置
   * Summary: 查询（灰度）发布单的灰度发布配置
   */
  async queryContainerserivceGrayreleaseconfig(request: QueryContainerserivceGrayreleaseconfigRequest): Promise<QueryContainerserivceGrayreleaseconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContainerserivceGrayreleaseconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询（灰度）发布单的灰度发布配置
   * Summary: 查询（灰度）发布单的灰度发布配置
   */
  async queryContainerserivceGrayreleaseconfigEx(request: QueryContainerserivceGrayreleaseconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContainerserivceGrayreleaseconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContainerserivceGrayreleaseconfigResponse>(await this.doRequest("1.0", "antcloud.ldc.containerserivce.grayreleaseconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContainerserivceGrayreleaseconfigResponse({}));
  }

}
