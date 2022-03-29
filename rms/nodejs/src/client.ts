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

// condition
export class XCondition extends $tea.Model {
  // 表达式
  expr: string;
  // operator
  operator: string;
  // value
  value?: string;
  //  
  values?: string[];
  //  
  all?: boolean;
  static names(): { [key: string]: string } {
    return {
      expr: 'expr',
      operator: 'operator',
      value: 'value',
      values: 'values',
      all: 'all',
    };
  }

  static types(): { [key: string]: any } {
    return {
      expr: 'string',
      operator: 'string',
      value: 'string',
      values: { 'type': 'array', 'itemType': 'string' },
      all: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// metric query metadata
export class XMetricQueryMetadata extends $tea.Model {
  // query clause name
  name?: string;
  // 32位datasource uuid
  datasourceUuid: string;
  // metric name
  metricName?: string;
  //  
  tableName?: string;
  //  
  conditions?: XCondition[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      datasourceUuid: 'datasource_uuid',
      metricName: 'metric_name',
      tableName: 'table_name',
      conditions: 'conditions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      datasourceUuid: 'string',
      metricName: 'string',
      tableName: 'string',
      conditions: { 'type': 'array', 'itemType': XCondition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Translate Expression
export class XTranslateExpression extends $tea.Model {
  // expression type
  type: string;
  //  from
  from: string;
  // to
  to: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      from: 'string',
      to: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// x
export class XCalculationParameter extends $tea.Model {
  // x
  expression?: string;
  // x
  constant?: boolean;
  static names(): { [key: string]: string } {
    return {
      expression: 'expression',
      constant: 'constant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      expression: 'string',
      constant: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XMetricInfo extends $tea.Model {
  //  
  name: string;
  //  
  description?: string;
  //  
  type?: string;
  //  
  unit?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      type: 'type',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      type: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XTranslate extends $tea.Model {
  //  
  defaultValue?: string;
  //  
  includeNotMatched?: boolean;
  //  
  translateExpressions?: XTranslateExpression[];
  static names(): { [key: string]: string } {
    return {
      defaultValue: 'default_value',
      includeNotMatched: 'include_not_matched',
      translateExpressions: 'translate_expressions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultValue: 'string',
      includeNotMatched: 'boolean',
      translateExpressions: { 'type': 'array', 'itemType': XTranslateExpression },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// x
export class XCalculationExpression extends $tea.Model {
  // x
  function?: string;
  // x
  parameters?: XCalculationParameter[];
  // PromQL
  query?: string;
  //  
  queryMetadatas?: XMetricQueryMetadata[];
  // calculation type
  type?: string;
  static names(): { [key: string]: string } {
    return {
      function: 'function',
      parameters: 'parameters',
      query: 'query',
      queryMetadatas: 'query_metadatas',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      function: 'string',
      parameters: { 'type': 'array', 'itemType': XCalculationParameter },
      query: 'string',
      queryMetadatas: { 'type': 'array', 'itemType': XMetricQueryMetadata },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AiExtraAttr
export class AiExtraAttr extends $tea.Model {
  // time_range_thres
  timeRangeThres: string;
  // abnormal_value_thres
  abnormalValueThres: string;
  // value_range_thres
  valueRangeThres: string;
  // algo_score_thres
  algoScoreThres: string;
  static names(): { [key: string]: string } {
    return {
      timeRangeThres: 'time_range_thres',
      abnormalValueThres: 'abnormal_value_thres',
      valueRangeThres: 'value_range_thres',
      algoScoreThres: 'algo_score_thres',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeRangeThres: 'string',
      abnormalValueThres: 'string',
      valueRangeThres: 'string',
      algoScoreThres: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// match expression
export class XMatchExpression extends $tea.Model {
  // match expression type
  type: string;
  // metadata field expr
  expr?: string;
  // left character
  left?: string;
  // left index
  leftIndex?: number;
  //  
  right?: string;
  //  
  valueType?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      expr: 'expr',
      left: 'left',
      leftIndex: 'left_index',
      right: 'right',
      valueType: 'value_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      expr: 'string',
      left: 'string',
      leftIndex: 'number',
      right: 'string',
      valueType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Threshold
export class Threshold extends $tea.Model {
  // level1
  level1: string;
  // level2
  level2: string;
  // level3
  level3: string;
  // im
  im: string;
  // sms
  sms: string;
  // control_plan
  controlPlan: string;
  static names(): { [key: string]: string } {
    return {
      level1: 'level1',
      level2: 'level2',
      level3: 'level3',
      im: 'im',
      sms: 'sms',
      controlPlan: 'control_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      level1: 'string',
      level2: 'string',
      level3: 'string',
      im: 'string',
      sms: 'string',
      controlPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// string key value
export class XStringKeyValue extends $tea.Model {
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

// DimFilter
export class DimFilter extends $tea.Model {
  // dim_index
  dimIndex: number;
  // dim_name
  dimName: string;
  // white_names
  whiteNames: string[];
  // black_names
  blackNames: string[];
  static names(): { [key: string]: string } {
    return {
      dimIndex: 'dim_index',
      dimName: 'dim_name',
      whiteNames: 'white_names',
      blackNames: 'black_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimIndex: 'number',
      dimName: 'string',
      whiteNames: { 'type': 'array', 'itemType': 'string' },
      blackNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceDTO
export class WorkspaceDTO extends $tea.Model {
  // id
  id: number;
  // name
  name: string;
  // display_name
  displayName: string;
  // outside_ws_id
  outsideWsId: string;
  // tenant_id
  tenantId: number;
  // outside_tenant_id
  outsideTenantId: string;
  // stack_view
  stackView: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      outsideWsId: 'outside_ws_id',
      tenantId: 'tenant_id',
      outsideTenantId: 'outside_tenant_id',
      stackView: 'stack_view',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      displayName: 'string',
      outsideWsId: 'string',
      tenantId: 'number',
      outsideTenantId: 'string',
      stackView: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AiAlarmParams
export class AiAlarmParams extends $tea.Model {
  // value_fields
  valueFields: string[];
  // ai_algo_code
  aiAlgoCode: string;
  // ai_extra_attr
  aiExtraAttr: AiExtraAttr;
  static names(): { [key: string]: string } {
    return {
      valueFields: 'value_fields',
      aiAlgoCode: 'ai_algo_code',
      aiExtraAttr: 'ai_extra_attr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      valueFields: { 'type': 'array', 'itemType': 'string' },
      aiAlgoCode: 'string',
      aiExtraAttr: AiExtraAttr,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TimeRange
export class TimeRange extends $tea.Model {
  // start
  start: number;
  // end
  end: number;
  static names(): { [key: string]: string } {
    return {
      start: 'start',
      end: 'end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      start: 'number',
      end: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Trigger
export class Trigger extends $tea.Model {
  // value_field
  valueField: string;
  // value_index
  valueIndex: number;
  // type
  type: string;
  // n
  n: number;
  // compare
  compare: string;
  // compare_percent
  comparePercent: string;
  // threshold
  threshold: Threshold;
  // threshold_copy
  thresholdCopy: Threshold;
  // value_is_percent
  valueIsPercent: boolean;
  static names(): { [key: string]: string } {
    return {
      valueField: 'value_field',
      valueIndex: 'value_index',
      type: 'type',
      n: 'n',
      compare: 'compare',
      comparePercent: 'compare_percent',
      threshold: 'threshold',
      thresholdCopy: 'threshold_copy',
      valueIsPercent: 'value_is_percent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      valueField: 'string',
      valueIndex: 'number',
      type: 'string',
      n: 'number',
      compare: 'string',
      comparePercent: 'string',
      threshold: Threshold,
      thresholdCopy: Threshold,
      valueIsPercent: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TimeFilter
export class TimeFilter extends $tea.Model {
  // from
  from: string;
  // to
  to: string;
  // weeks
  weeks: number[];
  static names(): { [key: string]: string } {
    return {
      from: 'from',
      to: 'to',
      weeks: 'weeks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      from: 'string',
      to: 'string',
      weeks: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BizDomain
export class BizDomain extends $tea.Model {
  // id
  id: number;
  // name
  name: string;
  // tenant_id
  // 
  tenantId: number;
  // config
  config: string;
  // outside_domain_id
  outsideDomainId: string;
  // entity_list
  entityList: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      tenantId: 'tenant_id',
      config: 'config',
      outsideDomainId: 'outside_domain_id',
      entityList: 'entity_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      tenantId: 'number',
      config: 'string',
      outsideDomainId: 'string',
      entityList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Expression
export class XExpression extends $tea.Model {
  // name
  name?: string;
  //  
  description?: string;
  //  
  matchExpression?: XMatchExpression;
  //   
  translateExpression?: XTranslate;
  //  metric type
  type?: string;
  //  
  unit?: string;
  //  
  downsampleFunc?: string;
  //  
  aggregationFunc?: string;
  // prometheus tags
  expressionTags?: XMetricInfo[];
  // prometheus metric-tags 是否采集
  enabled?: boolean;
  // line filter
  values?: string[];
  //  
  displayName?: string;
  //  
  pathParameters?: XStringKeyValue[];
  // x
  calculationExpression?: XCalculationExpression;
  // 计算数据源使用的原始指标名称
  sourceName?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      matchExpression: 'match_expression',
      translateExpression: 'translate_expression',
      type: 'type',
      unit: 'unit',
      downsampleFunc: 'downsample_func',
      aggregationFunc: 'aggregation_func',
      expressionTags: 'expression_tags',
      enabled: 'enabled',
      values: 'values',
      displayName: 'display_name',
      pathParameters: 'path_parameters',
      calculationExpression: 'calculation_expression',
      sourceName: 'source_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      matchExpression: XMatchExpression,
      translateExpression: XTranslate,
      type: 'string',
      unit: 'string',
      downsampleFunc: 'string',
      aggregationFunc: 'string',
      expressionTags: { 'type': 'array', 'itemType': XMetricInfo },
      enabled: 'boolean',
      values: { 'type': 'array', 'itemType': 'string' },
      displayName: 'string',
      pathParameters: { 'type': 'array', 'itemType': XStringKeyValue },
      calculationExpression: XCalculationExpression,
      sourceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ControlPlan
export class ControlPlan extends $tea.Model {
  // action_id
  actionId: number;
  // name
  name: string;
  // plugin_type
  pluginType: string;
  // plugin_id
  pluginId: string;
  // file_id
  fileId: number;
  // ds_name
  dsName: string;
  static names(): { [key: string]: string } {
    return {
      actionId: 'action_id',
      name: 'name',
      pluginType: 'plugin_type',
      pluginId: 'plugin_id',
      fileId: 'file_id',
      dsName: 'ds_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionId: 'number',
      name: 'string',
      pluginType: 'string',
      pluginId: 'string',
      fileId: 'number',
      dsName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NavWorkspace
export class NavWorkspace extends $tea.Model {
  // workspace
  workspace: WorkspaceDTO;
  static names(): { [key: string]: string } {
    return {
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspace: WorkspaceDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户
export class Tenant extends $tea.Model {
  // ID
  id: number;
  // 租户名称
  name: string;
  // 展示名称
  displayName: string;
  // outsideTenantId
  outsideTenantId: string;
  // status
  status: string;
  // config
  config: string;
  // stack_view
  stackView: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      outsideTenantId: 'outside_tenant_id',
      status: 'status',
      config: 'config',
      stackView: 'stack_view',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      displayName: 'string',
      outsideTenantId: 'string',
      status: 'string',
      config: 'string',
      stackView: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 列值翻译映射关系
export class TranslateMapping extends $tea.Model {
  // 原始列值
  from: string;
  // 翻译后列值
  to: string;
  // 正则类型 (完整正则或简单正则)
  mode: string;
  static names(): { [key: string]: string } {
    return {
      from: 'from',
      to: 'to',
      mode: 'mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      from: 'string',
      to: 'string',
      mode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LogSubRule
export class XLogSubRule extends $tea.Model {
  // log path
  path?: string;
  //  
  metrics: XExpression[];
  //  
  ruleTags?: XExpression[];
  // 白名单
  includeLines?: XExpression[];
  //  
  excludeLines?: XExpression[];
  // x
  paths?: string[];
  // x
  pathLinkPrefix?: string;
  //  
  pathExpression?: XExpression;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      metrics: 'metrics',
      ruleTags: 'rule_tags',
      includeLines: 'include_lines',
      excludeLines: 'exclude_lines',
      paths: 'paths',
      pathLinkPrefix: 'path_link_prefix',
      pathExpression: 'path_expression',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      metrics: { 'type': 'array', 'itemType': XExpression },
      ruleTags: { 'type': 'array', 'itemType': XExpression },
      includeLines: { 'type': 'array', 'itemType': XExpression },
      excludeLines: { 'type': 'array', 'itemType': XExpression },
      paths: { 'type': 'array', 'itemType': 'string' },
      pathLinkPrefix: 'string',
      pathExpression: XExpression,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NavBizDomain
export class NavBizDomain extends $tea.Model {
  // biz_domain
  bizDomain: BizDomain;
  static names(): { [key: string]: string } {
    return {
      bizDomain: 'biz_domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizDomain: BizDomain,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Rule
export class Rule extends $tea.Model {
  // ai_alarm_params
  aiAlarmParams: AiAlarmParams;
  // name
  name: string;
  // run_type
  runType: string;
  // cal_time_range
  calTimeRange: TimeRange;
  // exclude_data_time_range
  excludeDataTimeRange: TimeRange;
  // dim_filters
  dimFilters: DimFilter[];
  // time_filter
  timeFilter: TimeFilter;
  // triggers
  triggers: Trigger[];
  // andor
  andor: string;
  // control_plan_auto
  controlPlanAuto: boolean;
  // control_plans
  controlPlans: ControlPlan[];
  // function_id
  functionId: number;
  // from_tmp_rule
  fromTmpRule: number;
  // rule_type
  ruleType: string;
  // ports
  ports: string[];
  // group_by
  groupBy: string[];
  static names(): { [key: string]: string } {
    return {
      aiAlarmParams: 'ai_alarm_params',
      name: 'name',
      runType: 'run_type',
      calTimeRange: 'cal_time_range',
      excludeDataTimeRange: 'exclude_data_time_range',
      dimFilters: 'dim_filters',
      timeFilter: 'time_filter',
      triggers: 'triggers',
      andor: 'andor',
      controlPlanAuto: 'control_plan_auto',
      controlPlans: 'control_plans',
      functionId: 'function_id',
      fromTmpRule: 'from_tmp_rule',
      ruleType: 'rule_type',
      ports: 'ports',
      groupBy: 'group_by',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aiAlarmParams: AiAlarmParams,
      name: 'string',
      runType: 'string',
      calTimeRange: TimeRange,
      excludeDataTimeRange: TimeRange,
      dimFilters: { 'type': 'array', 'itemType': DimFilter },
      timeFilter: TimeFilter,
      triggers: { 'type': 'array', 'itemType': Trigger },
      andor: 'string',
      controlPlanAuto: 'boolean',
      controlPlans: { 'type': 'array', 'itemType': ControlPlan },
      functionId: 'number',
      fromTmpRule: 'number',
      ruleType: 'string',
      ports: { 'type': 'array', 'itemType': 'string' },
      groupBy: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NavTenant
export class NavTenant extends $tea.Model {
  // tenant
  tenant: Tenant;
  // view_power
  viewPower: boolean;
  // nav_workspaces
  navWorkspaces: NavWorkspace[];
  // nav_biz_domains
  navBizDomains: NavBizDomain[];
  static names(): { [key: string]: string } {
    return {
      tenant: 'tenant',
      viewPower: 'view_power',
      navWorkspaces: 'nav_workspaces',
      navBizDomains: 'nav_biz_domains',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenant: Tenant,
      viewPower: 'boolean',
      navWorkspaces: { 'type': 'array', 'itemType': NavWorkspace },
      navBizDomains: { 'type': 'array', 'itemType': NavBizDomain },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XRule extends $tea.Model {
  // rule type
  type: string;
  //  
  interval: number;
  // rule timeout
  timeout?: number;
  //  
  externalTags?: XExpression[];
  // log rules
  rules?: XLogSubRule[];
  // metrics
  metrics?: XExpression[];
  // prometheus port
  port?: number;
  // prometheus path
  path?: string;
  //  
  scheme?: string;
  //  
  method?: string;
  // tcp ports
  ports?: number[];
  //  
  tags?: XExpression[];
  //  
  expression?: string;
  //  
  target?: XMatchExpression;
  //  
  localHost?: boolean;
  //   
  caFile?: string;
  //  
  certFile?: string;
  //  
  keyFile?: string;
  //  
  bearerTokenFile?: string;
  //  
  insecureSkipVerify?: boolean;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      interval: 'interval',
      timeout: 'timeout',
      externalTags: 'external_tags',
      rules: 'rules',
      metrics: 'metrics',
      port: 'port',
      path: 'path',
      scheme: 'scheme',
      method: 'method',
      ports: 'ports',
      tags: 'tags',
      expression: 'expression',
      target: 'target',
      localHost: 'local_host',
      caFile: 'ca_file',
      certFile: 'cert_file',
      keyFile: 'key_file',
      bearerTokenFile: 'bearer_token_file',
      insecureSkipVerify: 'insecure_skip_verify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      interval: 'number',
      timeout: 'number',
      externalTags: { 'type': 'array', 'itemType': XExpression },
      rules: { 'type': 'array', 'itemType': XLogSubRule },
      metrics: { 'type': 'array', 'itemType': XExpression },
      port: 'number',
      path: 'string',
      scheme: 'string',
      method: 'string',
      ports: { 'type': 'array', 'itemType': 'number' },
      tags: { 'type': 'array', 'itemType': XExpression },
      expression: 'string',
      target: XMatchExpression,
      localHost: 'boolean',
      caFile: 'string',
      certFile: 'string',
      keyFile: 'string',
      bearerTokenFile: 'string',
      insecureSkipVerify: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Model
export class Model extends $tea.Model {
  // rules
  rules: Rule[];
  // batch_rule_id
  batchRuleId: string;
  static names(): { [key: string]: string } {
    return {
      rules: 'rules',
      batchRuleId: 'batch_rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rules: { 'type': 'array', 'itemType': Rule },
      batchRuleId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Site
export class Site extends $tea.Model {
  // id
  id: number;
  // name
  name: string;
  // display_name
  displayName: string;
  // local
  local: string;
  // domain
  domain: string;
  // token
  token: string;
  // config
  config: string;
  // url_preffix
  urlPreffix: string;
  // readonly
  readonly: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      local: 'local',
      domain: 'domain',
      token: 'token',
      config: 'config',
      urlPreffix: 'url_preffix',
      readonly: 'readonly',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      displayName: 'string',
      local: 'string',
      domain: 'string',
      token: 'string',
      config: 'string',
      urlPreffix: 'string',
      readonly: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 列值翻译
export class Translate extends $tea.Model {
  // 列值翻译的默认值
  defaultValue?: string;
  // 列值翻译映射关系
  mappings?: TranslateMapping[];
  static names(): { [key: string]: string } {
    return {
      defaultValue: 'default_value',
      mappings: 'mappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultValue: 'string',
      mappings: { 'type': 'array', 'itemType': TranslateMapping },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// resource target
export class XTarget extends $tea.Model {
  // target type
  type: string;
  // resource kind
  metadataKind?: string;
  // resource name
  metadataName?: string;
  // where 条件
  conditions?: XCondition[];
  //  
  frontType?: string;
  //  
  fromDatasourceUuid?: string;
  //  
  fromDatasourceName?: string;
  //  
  fromDatasourceMd5?: string;
  //  
  fromDatasourceMetricName?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      metadataKind: 'metadata_kind',
      metadataName: 'metadata_name',
      conditions: 'conditions',
      frontType: 'front_type',
      fromDatasourceUuid: 'from_datasource_uuid',
      fromDatasourceName: 'from_datasource_name',
      fromDatasourceMd5: 'from_datasource_md5',
      fromDatasourceMetricName: 'from_datasource_metric_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      metadataKind: 'string',
      metadataName: 'string',
      conditions: { 'type': 'array', 'itemType': XCondition },
      frontType: 'string',
      fromDatasourceUuid: 'string',
      fromDatasourceName: 'string',
      fromDatasourceMd5: 'string',
      fromDatasourceMetricName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsFilter
export class OpsFilter extends $tea.Model {
  // black
  black: boolean;
  // names
  names: string[];
  static names(): { [key: string]: string } {
    return {
      black: 'black',
      names: 'names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      black: 'boolean',
      names: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指标时序值
export class MetricValue extends $tea.Model {
  // 时间戳
  timestamp: number;
  // double类型值
  value: string;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// spec
export class XSpec extends $tea.Model {
  //  
  target: XTarget;
  //  
  rule: XRule;
  static names(): { [key: string]: string } {
    return {
      target: 'target',
      rule: 'rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      target: XTarget,
      rule: XRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NavSite
export class NavSite extends $tea.Model {
  // site
  site: Site;
  // nav_tenants
  navTenants: NavTenant[];
  static names(): { [key: string]: string } {
    return {
      site: 'site',
      navTenants: 'nav_tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      site: Site,
      navTenants: { 'type': 'array', 'itemType': NavTenant },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryStatsDTO
export class AlarmHistoryStatsDTO extends $tea.Model {
  // alarm_time
  alarmTime: number;
  // alarm_level
  alarmLevel: number;
  // count
  count: number;
  static names(): { [key: string]: string } {
    return {
      alarmTime: 'alarm_time',
      alarmLevel: 'alarm_level',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alarmTime: 'number',
      alarmLevel: 'number',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Metrics 中的一个 field
export class TimeSeriesMetricsField extends $tea.Model {
  // Field key
  key?: string;
  // Field value
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

// time and value
export class XTimeStringValue extends $tea.Model {
  // unix timestamp (s)
  timestamp: number;
  // double string
  value: string;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日志过滤列
export class UniqueDim extends $tea.Model {
  // 列名称
  name: string;
  // 左起第几个
  leftIndex: number;
  // 左起字符串
  left?: string;
  // 右至字符串
  right?: string;
  // 列值翻译
  translate?: Translate;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      leftIndex: 'left_index',
      left: 'left',
      right: 'right',
      translate: 'translate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      leftIndex: 'number',
      left: 'string',
      right: 'string',
      translate: Translate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源基本信息
export class XResource extends $tea.Model {
  // 全球唯一标识符（32位）。
  // Update操作，必填
  // Create操作，非必填，默认不传，后端会自动生成。特殊情况可以传入，比如一些领域需要固定该UUID。
  uuid?: string;
  // 名称。命名规则：^[a-zA-Z\u4E00-\u9FA5][a-zA-Z0-9_-\u4E00-\u9FA5]*$$
  name: string;
  // 描述。
  // 
  description: string;
  // 父目录UUID。全球唯一标识符（32位）。
  // 00000000000000000000000000000000特指根目录UUID
  parentUuid: string;
  // 作用范围
  scope: string;
  // 是否生效。默认true
  enabled?: boolean;
  // 是否开放。默认为false
  open?: boolean;
  // 资源版本
  version?: number;
  // inner tenant id
  tenantId?: number;
  // inner workspace id
  workspaceId?: number;
  // 创建者
  createdBy?: string;
  // unix time 秒
  createdAt?: number;
  // 更新者
  updatedBy?: string;
  // 更新时间
  updatedAt?: number;
  // 资源类型
  type: string;
  //  
  md5?: string;
  //  
  priority?: string;
  //  
  timeToLive?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      description: 'description',
      parentUuid: 'parent_uuid',
      scope: 'scope',
      enabled: 'enabled',
      open: 'open',
      version: 'version',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      createdBy: 'created_by',
      createdAt: 'created_at',
      updatedBy: 'updated_by',
      updatedAt: 'updated_at',
      type: 'type',
      md5: 'md5',
      priority: 'priority',
      timeToLive: 'time_to_live',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      description: 'string',
      parentUuid: 'string',
      scope: 'string',
      enabled: 'boolean',
      open: 'boolean',
      version: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      createdBy: 'string',
      createdAt: 'number',
      updatedBy: 'string',
      updatedAt: 'number',
      type: 'string',
      md5: 'string',
      priority: 'string',
      timeToLive: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计算配置包含值对象
export class ContainVals extends $tea.Model {
  // 包含值列表
  vals?: string[];
  static names(): { [key: string]: string } {
    return {
      vals: 'vals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vals: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StackState
export class StackState extends $tea.Model {
  // state
  state: string;
  // values
  values: string[];
  // is_black
  isBlack: boolean;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      values: 'values',
      isBlack: 'is_black',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      values: { 'type': 'array', 'itemType': 'string' },
      isBlack: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对应Map结构
export class KeySet extends $tea.Model {
  // key
  key?: string;
  // value
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

// 用户组关联关系
export class UserGroupRelation extends $tea.Model {
  // ID
  id: number;
  // 用户组 ID
  userGroupId: number;
  // 钉钉机器人webhook
  dingtalkWebhook: string;
  // 联系人登录名
  userLoginName: string;
  // 用户展示名
  userDisplayName?: string;
  // 钉钉机器人
  dingDingRobot?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      userGroupId: 'user_group_id',
      dingtalkWebhook: 'dingtalk_webhook',
      userLoginName: 'user_login_name',
      userDisplayName: 'user_display_name',
      dingDingRobot: 'ding_ding_robot',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      userGroupId: 'number',
      dingtalkWebhook: 'string',
      userLoginName: 'string',
      userDisplayName: 'string',
      dingDingRobot: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TopAlarmDO
export class TopAlarmDO extends $tea.Model {
  // error
  error: string;
  // error_count
  errorCount: number;
  // warn
  warn: string;
  // warn_count
  warnCount: number;
  // alarm_level
  alarmLevel: number;
  // max_alarm_count
  maxAlarmCount: number;
  // emergency_copy
  emergencyCopy: string;
  // emergency_url
  emergencyUrl: string;
  static names(): { [key: string]: string } {
    return {
      error: 'error',
      errorCount: 'error_count',
      warn: 'warn',
      warnCount: 'warn_count',
      alarmLevel: 'alarm_level',
      maxAlarmCount: 'max_alarm_count',
      emergencyCopy: 'emergency_copy',
      emergencyUrl: 'emergency_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      error: 'string',
      errorCount: 'number',
      warn: 'string',
      warnCount: 'number',
      alarmLevel: 'number',
      maxAlarmCount: 'number',
      emergencyCopy: 'string',
      emergencyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmDO
export class AlarmDO extends $tea.Model {
  // model
  model: Model;
  // level
  level: string;
  // frequency
  frequency: number;
  // silent_minute
  silentMinute: string;
  // emergency_copy
  emergencyCopy: string;
  // emergency_url
  emergencyUrl: string;
  // time_zone
  timeZone: string;
  // time_zone_custom
  timeZoneCustom: boolean;
  static names(): { [key: string]: string } {
    return {
      model: 'model',
      level: 'level',
      frequency: 'frequency',
      silentMinute: 'silent_minute',
      emergencyCopy: 'emergency_copy',
      emergencyUrl: 'emergency_url',
      timeZone: 'time_zone',
      timeZoneCustom: 'time_zone_custom',
    };
  }

  static types(): { [key: string]: any } {
    return {
      model: Model,
      level: 'string',
      frequency: 'number',
      silentMinute: 'string',
      emergencyCopy: 'string',
      emergencyUrl: 'string',
      timeZone: 'string',
      timeZoneCustom: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistory
export class AlarmHistory extends $tea.Model {
  // alarm_level
  alarmLevel: number;
  // alarmPkgId
  alarmPkgId: number;
  // alarm_rule_name
  alarmRuleName: string;
  // alarmSourceType
  alarmSourceType: string;
  // alarm_time
  alarmTime: number;
  // biz_domain_id
  bizDomainId: number;
  // context
  context: string;
  // custom_plugin_id
  customPluginId: number;
  // id
  id: number;
  // meta_group_id
  metaGroupId: number;
  // msg
  msg: string;
  // stack_entity_id
  stackEntityId: number;
  // stack_id
  stackId: number;
  // stack_monitor_item_name
  stackMonitorItemName: string;
  // stack_universal_table_id
  stackUniversalTableId: string;
  // tag_value_id
  tagValueId: number;
  // tenant_id
  tenantId: number;
  // workspace_id
  workspaceId: number;
  static names(): { [key: string]: string } {
    return {
      alarmLevel: 'alarm_level',
      alarmPkgId: 'alarm_pkg_id',
      alarmRuleName: 'alarm_rule_name',
      alarmSourceType: 'alarm_source_type',
      alarmTime: 'alarm_time',
      bizDomainId: 'biz_domain_id',
      context: 'context',
      customPluginId: 'custom_plugin_id',
      id: 'id',
      metaGroupId: 'meta_group_id',
      msg: 'msg',
      stackEntityId: 'stack_entity_id',
      stackId: 'stack_id',
      stackMonitorItemName: 'stack_monitor_item_name',
      stackUniversalTableId: 'stack_universal_table_id',
      tagValueId: 'tag_value_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alarmLevel: 'number',
      alarmPkgId: 'number',
      alarmRuleName: 'string',
      alarmSourceType: 'string',
      alarmTime: 'number',
      bizDomainId: 'number',
      context: 'string',
      customPluginId: 'number',
      id: 'number',
      metaGroupId: 'number',
      msg: 'string',
      stackEntityId: 'number',
      stackId: 'number',
      stackMonitorItemName: 'string',
      stackUniversalTableId: 'string',
      tagValueId: 'number',
      tenantId: 'number',
      workspaceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XTimeMetricsValue extends $tea.Model {
  //  
  values: XStringKeyValue[];
  //  
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      values: 'values',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      values: { 'type': 'array', 'itemType': XStringKeyValue },
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NavContent
export class NavContent extends $tea.Model {
  // hasw
  hasw: boolean;
  // hast
  hast: boolean;
  // hasbiz
  hasbiz: boolean;
  // nav_sites
  navSites: NavSite[];
  static names(): { [key: string]: string } {
    return {
      hasw: 'hasw',
      hast: 'hast',
      hasbiz: 'hasbiz',
      navSites: 'nav_sites',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hasw: 'boolean',
      hast: 'boolean',
      hasbiz: 'boolean',
      navSites: { 'type': 'array', 'itemType': NavSite },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指标数据
export class MetricData extends $tea.Model {
  // 维度信息
  tags: KeySet[];
  // 时序数据
  values: MetricValue[];
  static names(): { [key: string]: string } {
    return {
      tags: 'tags',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tags: { 'type': 'array', 'itemType': KeySet },
      values: { 'type': 'array', 'itemType': MetricValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日志过滤规则
export class Filter extends $tea.Model {
  // 过滤列
  dim: UniqueDim;
  // 过滤目标值列表
  values: string[];
  static names(): { [key: string]: string } {
    return {
      dim: 'dim',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dim: UniqueDim,
      values: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// metric data
export class XMetricData extends $tea.Model {
  // key value
  metric: XStringKeyValue[];
  // time value
  value?: XTimeStringValue;
  //  
  values?: XTimeStringValue[];
  static names(): { [key: string]: string } {
    return {
      metric: 'metric',
      value: 'value',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metric: { 'type': 'array', 'itemType': XStringKeyValue },
      value: XTimeStringValue,
      values: { 'type': 'array', 'itemType': XTimeStringValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Condition
export class Condition extends $tea.Model {
  // plugin
  plugin: string;
  // content_type
  contentType: string;
  // tag
  tag: string;
  // ds_id
  dsId: string;
  // new_cp_id
  newCpId: string;
  // start
  start: number;
  // end
  end: number;
  // tick_interval
  tickInterval: number;
  // use_new
  useNew: boolean;
  // groupby
  groupby: string[];
  // values
  values: KeySet[];
  // tenant_id
  tenantId: number;
  // workspace_id
  workspaceId: number;
  // am_old_data_struct
  amOldDataStruct: boolean;
  // am_is_spm
  amIsSpm: boolean;
  // old_ds_id
  oldDsId: string;
  static names(): { [key: string]: string } {
    return {
      plugin: 'plugin',
      contentType: 'content_type',
      tag: 'tag',
      dsId: 'ds_id',
      newCpId: 'new_cp_id',
      start: 'start',
      end: 'end',
      tickInterval: 'tick_interval',
      useNew: 'use_new',
      groupby: 'groupby',
      values: 'values',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      amOldDataStruct: 'am_old_data_struct',
      amIsSpm: 'am_is_spm',
      oldDsId: 'old_ds_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      plugin: 'string',
      contentType: 'string',
      tag: 'string',
      dsId: 'string',
      newCpId: 'string',
      start: 'number',
      end: 'number',
      tickInterval: 'number',
      useNew: 'boolean',
      groupby: { 'type': 'array', 'itemType': 'string' },
      values: { 'type': 'array', 'itemType': KeySet },
      tenantId: 'number',
      workspaceId: 'number',
      amOldDataStruct: 'boolean',
      amIsSpm: 'boolean',
      oldDsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NodeTopItem
export class NodeTopItem extends $tea.Model {
  // 主机名称
  node: string;
  // 应用TopN统计值，有可能有小数，使用前转换为数值
  value: string;
  static names(): { [key: string]: string } {
    return {
      node: 'node',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      node: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasAppGroupDto
export class TraasAppGroupDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // parent_uuid
  parentUuid?: string;
  // layer
  layer?: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // outside_id
  outsideId?: string;
  // outside_parent_id
  outsideParentId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      parentUuid: 'parent_uuid',
      layer: 'layer',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      outsideId: 'outside_id',
      outsideParentId: 'outside_parent_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      parentUuid: 'string',
      layer: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      outsideId: 'string',
      outsideParentId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryStatsDTOsKeySet
export class AlarmHistoryStatsDTOsKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: AlarmHistoryStatsDTO[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: { 'type': 'array', 'itemType': AlarmHistoryStatsDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryListKeySet
export class AlarmHistoryListKeySet extends $tea.Model {
  // key
  key: string;
  // AlarmHistoryListKeySet
  value: AlarmHistory[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: { 'type': 'array', 'itemType': AlarmHistory },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PontusTrendRequest
export class PontusTrendRequest extends $tea.Model {
  // token
  token: string;
  // metric_table
  metricTable: string;
  // site_env
  siteEnv: string;
  // view_id
  viewId: string;
  // period_type
  periodType: string;
  // extraDimNames
  extraDimNames: string[];
  // metric_filter
  metricFilter: string;
  // start
  start: number;
  // end
  end: number;
  // dim_conditions_list
  dimConditionsList: KeySet[];
  // dim_expression
  dimExpression: KeySet;
  // dim_expression_list
  dimExpressionList: KeySet[];
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      metricTable: 'metric_table',
      siteEnv: 'site_env',
      viewId: 'view_id',
      periodType: 'period_type',
      extraDimNames: 'extra_dim_names',
      metricFilter: 'metric_filter',
      start: 'start',
      end: 'end',
      dimConditionsList: 'dim_conditions_list',
      dimExpression: 'dim_expression',
      dimExpressionList: 'dim_expression_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      metricTable: 'string',
      siteEnv: 'string',
      viewId: 'string',
      periodType: 'string',
      extraDimNames: { 'type': 'array', 'itemType': 'string' },
      metricFilter: 'string',
      start: 'number',
      end: 'number',
      dimConditionsList: { 'type': 'array', 'itemType': KeySet },
      dimExpression: KeySet,
      dimExpressionList: { 'type': 'array', 'itemType': KeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MonitorUser
export class MonitorUser extends $tea.Model {
  // 用户来源
  identityType: string;
  // 用户上的权限
  superViewer: boolean;
  // 是否为超级管理员
  superAdmin: boolean;
  // 显示名，花名 
  nickName: string;
  // emp_id
  empId: string;
  // id
  id: number;
  // 登录名，等于_id, _id实在太难辨别了，域帐号  yerui.yr
  loginName: string;
  // 展示名称
  displayName: string;
  // 兼容UniversalRead里返回的userDisplayName
  userDisplayName: string;
  // 真名
  realName: string;
  // phone_num
  phoneNum: string;
  // email
  email: string;
  // enterprise_id（金融云专属）
  enterpriseId: string;
  // token
  token: string;
  // 一方化标记位
  isFromAliyun: boolean;
  static names(): { [key: string]: string } {
    return {
      identityType: 'identity_type',
      superViewer: 'super_viewer',
      superAdmin: 'super_admin',
      nickName: 'nick_name',
      empId: 'emp_id',
      id: 'id',
      loginName: 'login_name',
      displayName: 'display_name',
      userDisplayName: 'user_display_name',
      realName: 'real_name',
      phoneNum: 'phone_num',
      email: 'email',
      enterpriseId: 'enterprise_id',
      token: 'token',
      isFromAliyun: 'is_from_aliyun',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identityType: 'string',
      superViewer: 'boolean',
      superAdmin: 'boolean',
      nickName: 'string',
      empId: 'string',
      id: 'number',
      loginName: 'string',
      displayName: 'string',
      userDisplayName: 'string',
      realName: 'string',
      phoneNum: 'string',
      email: 'string',
      enterpriseId: 'string',
      token: 'string',
      isFromAliyun: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XPrometheusQuery extends $tea.Model {
  //  
  port: number;
  //  
  ip?: string;
  //  
  path: string;
  //  
  target?: XTarget;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
      ip: 'ip',
      path: 'path',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'number',
      ip: 'string',
      path: 'string',
      target: XTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统计方式
export class Cal extends $tea.Model {
  // 统计功能
  fun: string;
  // 值对象
  val?: UniqueDim;
  // 值对象备份
  valBak?: UniqueDim;
  // topn
  topn?: number;
  // 所包含的值
  containVals?: ContainVals;
  static names(): { [key: string]: string } {
    return {
      fun: 'fun',
      val: 'val',
      valBak: 'val_bak',
      topn: 'topn',
      containVals: 'contain_vals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fun: 'string',
      val: UniqueDim,
      valBak: UniqueDim,
      topn: 'number',
      containVals: ContainVals,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsmetaSchema
export class OpsmetaSchema extends $tea.Model {
  // envs
  envs: string[];
  // idc
  idc: OpsFilter;
  // ldc
  ldc: OpsFilter;
  // server
  server: OpsFilter;
  static names(): { [key: string]: string } {
    return {
      envs: 'envs',
      idc: 'idc',
      ldc: 'ldc',
      server: 'server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envs: { 'type': 'array', 'itemType': 'string' },
      idc: OpsFilter,
      ldc: OpsFilter,
      server: OpsFilter,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dashboard query
export class XDashboardQuery extends $tea.Model {
  //  
  uuid?: string;
  //  
  parentUuid?: string;
  //  
  name?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      parentUuid: 'parent_uuid',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      parentUuid: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FolderPath
export class FolderPath extends $tea.Model {
  // id
  id: number;
  // name
  name: string;
  // v
  type: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// KV对
export class KeyValuePair extends $tea.Model {
  // key
  key?: string;
  // value
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

// oneconsole需要的workspace
export class OneConsoleWorkspace extends $tea.Model {
  // ws id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DatasourceCRULResponseCURequest
export class XDatasourceCRULResponseCURequest extends $tea.Model {
  //  
  apiVersion?: string;
  //  
  metadata: XResource;
  //  
  spec: XSpec;
  static names(): { [key: string]: string } {
    return {
      apiVersion: 'api_version',
      metadata: 'metadata',
      spec: 'spec',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiVersion: 'string',
      metadata: XResource,
      spec: XSpec,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警历史对象
export class UnifiedAlarmHistoryVO extends $tea.Model {
  // 主键
  id: number;
  // 事件id
  eventId: string;
  // 告警规则id
  alarmRuleId: number;
  // 告警规则唯一标识
  uniqueIdentity: string;
  // 告警规则名字
  alarmRuleName: string;
  // 告警等级
  alarmLevel: number;
  // 告警时间
  alarmTime: number;
  // 告警内容
  alarmContent: string;
  // 告警对象
  alarmTarget: string;
  // 触发状态
  status: number;
  // 租户id
  tenantId: number;
  // 工作区id
  workspaceId: number;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // type
  alarmTargetType?: string;
  // 告警详情
  alarmDetail: string;
  // 数据源名称
  dataSourceName?: string;
  // 数据源跳转url
  alarmUrl?: string;
  // 告警类型
  alarmType?: string;
  // 目标对象是否已经删除
  alarmTargetDeleted?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      eventId: 'event_id',
      alarmRuleId: 'alarm_rule_id',
      uniqueIdentity: 'unique_identity',
      alarmRuleName: 'alarm_rule_name',
      alarmLevel: 'alarm_level',
      alarmTime: 'alarm_time',
      alarmContent: 'alarm_content',
      alarmTarget: 'alarm_target',
      status: 'status',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      alarmTargetType: 'alarm_target_type',
      alarmDetail: 'alarm_detail',
      dataSourceName: 'data_source_name',
      alarmUrl: 'alarm_url',
      alarmType: 'alarm_type',
      alarmTargetDeleted: 'alarm_target_deleted',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      eventId: 'string',
      alarmRuleId: 'number',
      uniqueIdentity: 'string',
      alarmRuleName: 'string',
      alarmLevel: 'number',
      alarmTime: 'number',
      alarmContent: 'string',
      alarmTarget: 'string',
      status: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      alarmTargetType: 'string',
      alarmDetail: 'string',
      dataSourceName: 'string',
      alarmUrl: 'string',
      alarmType: 'string',
      alarmTargetDeleted: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用TopN信息
export class AppTopItem extends $tea.Model {
  // 应用名
  appName: string;
  // 应用TopN统计值，有可能有小数，使用前转换为数值
  value: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// stats
export class XSiteExportStats extends $tea.Model {
  //  
  alert?: number;
  //  
  alertDatasource?: number;
  //  
  dashboard?: number;
  //  
  dashboardDatasource?: number;
  //  
  datasource?: number;
  // 通知对象的数量
  alarmSubscriberCount?: number;
  static names(): { [key: string]: string } {
    return {
      alert: 'alert',
      alertDatasource: 'alert_datasource',
      dashboard: 'dashboard',
      dashboardDatasource: 'dashboard_datasource',
      datasource: 'datasource',
      alarmSubscriberCount: 'alarm_subscriber_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alert: 'number',
      alertDatasource: 'number',
      dashboard: 'number',
      dashboardDatasource: 'number',
      datasource: 'number',
      alarmSubscriberCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// trace span
export class TraceSpan extends $tea.Model {
  // 组件类型
  component?: string;
  // 毫秒耗时
  duration?: number;
  // 服务描述信息
  info?: string;
  // span kind, CLIENT SERVER PRODUCER CONSUMER
  kind?: string;
  // local endpoint ip
  localIp?: string;
  // local endpoint service name
  localServiceName?: string;
  // local idc name
  localIdcName?: string;
  // local cell name
  localCellName?: string;
  // name
  name?: string;
  // parent_id
  parentId?: string;
  // remote endpoint ip
  remoteIp?: string;
  // remote endpoint service name
  remoteServiceName?: string;
  // remote idc name
  remoteIdcName?: string;
  // remote cell name
  remoteCellName?: string;
  // span_id
  spanId?: string;
  // 开始时间, 毫秒时间戳
  startTime?: number;
  // 状态码
  status?: string;
  // span tags, 是关于span的键值对
  tags?: KeySet[];
  // trace id
  traceId?: string;
  static names(): { [key: string]: string } {
    return {
      component: 'component',
      duration: 'duration',
      info: 'info',
      kind: 'kind',
      localIp: 'local_ip',
      localServiceName: 'local_service_name',
      localIdcName: 'local_idc_name',
      localCellName: 'local_cell_name',
      name: 'name',
      parentId: 'parent_id',
      remoteIp: 'remote_ip',
      remoteServiceName: 'remote_service_name',
      remoteIdcName: 'remote_idc_name',
      remoteCellName: 'remote_cell_name',
      spanId: 'span_id',
      startTime: 'start_time',
      status: 'status',
      tags: 'tags',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      component: 'string',
      duration: 'number',
      info: 'string',
      kind: 'string',
      localIp: 'string',
      localServiceName: 'string',
      localIdcName: 'string',
      localCellName: 'string',
      name: 'string',
      parentId: 'string',
      remoteIp: 'string',
      remoteServiceName: 'string',
      remoteIdcName: 'string',
      remoteCellName: 'string',
      spanId: 'string',
      startTime: 'number',
      status: 'string',
      tags: { 'type': 'array', 'itemType': KeySet },
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Spm
export class Spm extends $tea.Model {
  // resultDim
  resultDim?: UniqueDim;
  // costDim
  costDim?: UniqueDim;
  // countDim
  countDim?: UniqueDim;
  static names(): { [key: string]: string } {
    return {
      resultDim: 'result_dim',
      costDim: 'cost_dim',
      countDim: 'count_dim',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultDim: UniqueDim,
      costDim: UniqueDim,
      countDim: UniqueDim,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StackExpression
export class StackExpression extends $tea.Model {
  // states
  states: StackState[];
  // andor
  andor: boolean;
  static names(): { [key: string]: string } {
    return {
      states: 'states',
      andor: 'andor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      states: { 'type': 'array', 'itemType': StackState },
      andor: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Metrics 中具体时间点的数据
export class TimeSeriesMetricsPoint extends $tea.Model {
  // 时间戳 (毫秒)
  timestamp?: number;
  // Metrics 某时间点的具体值
  value?: TimeSeriesMetricsField[];
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      value: { 'type': 'array', 'itemType': TimeSeriesMetricsField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StatusDO
export class StatusDO extends $tea.Model {
  // creater
  creater: string;
  // create_time
  createTime: number;
  // operator
  operator: string;
  // update_time
  updateTime: number;
  // status_desc
  statusDesc: string;
  // compute_close
  computeClose: boolean;
  // degrade_reason
  degradeReason: string;
  // degrade_operator
  degradeOperator: string;
  // degrade_time
  degradeTime: string;
  // degrade_time_v2
  degradeTimeV2: number;
  static names(): { [key: string]: string } {
    return {
      creater: 'creater',
      createTime: 'create_time',
      operator: 'operator',
      updateTime: 'update_time',
      statusDesc: 'status_desc',
      computeClose: 'compute_close',
      degradeReason: 'degrade_reason',
      degradeOperator: 'degrade_operator',
      degradeTime: 'degrade_time',
      degradeTimeV2: 'degrade_time_v2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creater: 'string',
      createTime: 'number',
      operator: 'string',
      updateTime: 'number',
      statusDesc: 'string',
      computeClose: 'boolean',
      degradeReason: 'string',
      degradeOperator: 'string',
      degradeTime: 'string',
      degradeTimeV2: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmNotifyStats
export class AlarmNotifyStats extends $tea.Model {
  // alarm_time
  alarmTime: number;
  // count
  count: number;
  // notify_channel
  notifyChannel: string;
  static names(): { [key: string]: string } {
    return {
      alarmTime: 'alarm_time',
      count: 'count',
      notifyChannel: 'notify_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alarmTime: 'number',
      count: 'number',
      notifyChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LongListKeySet
export class LongListKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// datasource query
export class XDatasourceQuery extends $tea.Model {
  //  
  uuid?: string;
  //  
  parentUuid?: string;
  //  
  name?: string;
  //  
  enabled?: boolean;
  //  
  targetResourceKind?: string;
  //  
  targetResourceName?: string;
  //  
  ruleType?: string;
  //  
  createdBy?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      parentUuid: 'parent_uuid',
      name: 'name',
      enabled: 'enabled',
      targetResourceKind: 'target_resource_kind',
      targetResourceName: 'target_resource_name',
      ruleType: 'rule_type',
      createdBy: 'created_by',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      parentUuid: 'string',
      name: 'string',
      enabled: 'boolean',
      targetResourceKind: 'string',
      targetResourceName: 'string',
      ruleType: 'string',
      createdBy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 菜单
export class Menu extends $tea.Model {
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmPkgDO
export class AlarmPkgDO extends $tea.Model {
  // biz_groupby_name
  bizGroupbyName: string;
  // id
  id: number;
  // name
  name: string;
  // stack_metric_group_metric_table
  stackMetricGroupMetricTable: string;
  // tag_value
  tagValue: string;
  // uuid
  uuid: string;
  // alarm
  alarm: AlarmDO;
  // top_alarm
  topAlarm: TopAlarmDO;
  static names(): { [key: string]: string } {
    return {
      bizGroupbyName: 'biz_groupby_name',
      id: 'id',
      name: 'name',
      stackMetricGroupMetricTable: 'stack_metric_group_metric_table',
      tagValue: 'tag_value',
      uuid: 'uuid',
      alarm: 'alarm',
      topAlarm: 'top_alarm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizGroupbyName: 'string',
      id: 'number',
      name: 'string',
      stackMetricGroupMetricTable: 'string',
      tagValue: 'string',
      uuid: 'string',
      alarm: AlarmDO,
      topAlarm: TopAlarmDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmTypeStatsVO
export class AlarmTypeStatsVO extends $tea.Model {
  // custom_plugin
  customPlugin: number;
  // meta_group
  metaGroup: number;
  // stack_universal_table
  stackUniversalTable: number;
  static names(): { [key: string]: string } {
    return {
      customPlugin: 'custom_plugin',
      metaGroup: 'meta_group',
      stackUniversalTable: 'stack_universal_table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customPlugin: 'number',
      metaGroup: 'number',
      stackUniversalTable: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SaveSchema
export class SaveSchema extends $tea.Model {
  // capacity
  capacity: number;
  // reserved
  reserved: string;
  // max_key_size
  maxKeySize: number;
  static names(): { [key: string]: string } {
    return {
      capacity: 'capacity',
      reserved: 'reserved',
      maxKeySize: 'max_key_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      capacity: 'number',
      reserved: 'string',
      maxKeySize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryDTO
export class AlarmHistoryDTO extends $tea.Model {
  // id
  id: number;
  // alarm_rule_name
  alarmRuleName: string;
  // msg
  msg: string;
  // alarm_pkg_id
  alarmPkgId: number;
  // custom_plugin_id
  customPluginId: number;
  // meta_group_id
  metaGroupId: number;
  // stack_universal_tableId
  stackUniversalTableId: string;
  // tag_value_id
  tagValueId: number;
  // tenant_id
  tenantId: number;
  // workspace_id
  workspaceId: number;
  // biz_domain_id
  bizDomainId: number;
  // alarm_time
  alarmTime: number;
  // alarm_level
  alarmLevel: number;
  // stack_id
  stackId: number;
  // stack_entity_id
  stackEntityId: number;
  // stack_monitor_item_name
  stackMonitorItemName: string;
  // alarm_source_type
  alarmSourceType: string;
  // biz_id
  bizId: number;
  // biz_groupby_name
  bizGroupbyName: string;
  // multi_alarm_id
  multiAlarmId: number;
  // context
  context: KeySet[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      alarmRuleName: 'alarm_rule_name',
      msg: 'msg',
      alarmPkgId: 'alarm_pkg_id',
      customPluginId: 'custom_plugin_id',
      metaGroupId: 'meta_group_id',
      stackUniversalTableId: 'stack_universal_table_id',
      tagValueId: 'tag_value_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      bizDomainId: 'biz_domain_id',
      alarmTime: 'alarm_time',
      alarmLevel: 'alarm_level',
      stackId: 'stack_id',
      stackEntityId: 'stack_entity_id',
      stackMonitorItemName: 'stack_monitor_item_name',
      alarmSourceType: 'alarm_source_type',
      bizId: 'biz_id',
      bizGroupbyName: 'biz_groupby_name',
      multiAlarmId: 'multi_alarm_id',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      alarmRuleName: 'string',
      msg: 'string',
      alarmPkgId: 'number',
      customPluginId: 'number',
      metaGroupId: 'number',
      stackUniversalTableId: 'string',
      tagValueId: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      bizDomainId: 'number',
      alarmTime: 'number',
      alarmLevel: 'number',
      stackId: 'number',
      stackEntityId: 'number',
      stackMonitorItemName: 'string',
      alarmSourceType: 'string',
      bizId: 'number',
      bizGroupbyName: 'string',
      multiAlarmId: 'number',
      context: { 'type': 'array', 'itemType': KeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dashboard
export class XDashboardCRULResponseCURequest extends $tea.Model {
  // API版本
  apiVersion?: string;
  // Dashboard元数据信息
  metadata: XResource;
  // Dashboard配置JSON字符串。
  // Dashboard目录不需要填写
  config?: string;
  static names(): { [key: string]: string } {
    return {
      apiVersion: 'api_version',
      metadata: 'metadata',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiVersion: 'string',
      metadata: XResource,
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OPS分组方式
export class OpsGroupBy extends $tea.Model {
  // 是否按环境分组
  env?: boolean;
  // 是否按部署单元分组
  deployUnit?: boolean;
  // 是否按应用分组
  app?: boolean;
  // 是否按idc分组
  idc?: boolean;
  // 是否按ldc分组
  ldc?: boolean;
  // 是否按server分组
  server?: boolean;
  // 附加信息
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      env: 'env',
      deployUnit: 'deploy_unit',
      app: 'app',
      idc: 'idc',
      ldc: 'ldc',
      server: 'server',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      env: 'boolean',
      deployUnit: 'boolean',
      app: 'boolean',
      idc: 'boolean',
      ldc: 'boolean',
      server: 'boolean',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警统计信息
export class AlarmCountInfo extends $tea.Model {
  // 自定义监控告警数量
  customPluginCount: number;
  // 应用组告警数量
  appGroupCount: number;
  // 应用监控告警数量
  appCount: number;
  static names(): { [key: string]: string } {
    return {
      customPluginCount: 'custom_plugin_count',
      appGroupCount: 'app_group_count',
      appCount: 'app_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customPluginCount: 'number',
      appGroupCount: 'number',
      appCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自定义监控日志
export class Log extends $tea.Model {
  // 应用名列表
  apps: string[];
  // 采集日志文件
  path: string;
  // 日志编码
  charset?: string;
  // 日志限制流量，单位KB/min
  agentLimitKB?: number;
  // 日志路径软连接描述
  symlinkPath?: string;
  static names(): { [key: string]: string } {
    return {
      apps: 'apps',
      path: 'path',
      charset: 'charset',
      agentLimitKB: 'agent_limit_k_b',
      symlinkPath: 'symlink_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apps: { 'type': 'array', 'itemType': 'string' },
      path: 'string',
      charset: 'string',
      agentLimitKB: 'number',
      symlinkPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体拓扑节点
export class TraasEntityTopoNode extends $tea.Model {
  // name
  name: string;
  // field
  field: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      field: 'field',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      field: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmLevelStatsVO
export class AlarmLevelStatsVO extends $tea.Model {
  // l0
  l0: number;
  // l1
  l1: number;
  // l2
  l2: number;
  static names(): { [key: string]: string } {
    return {
      l0: 'l0',
      l1: 'l1',
      l2: 'l2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      l0: 'number',
      l1: 'number',
      l2: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户组
export class UserGroup extends $tea.Model {
  // ID
  id: number;
  // 通知组名称
  name: string;
  // 最后修改人
  modifier: string;
  // 最后修改时间
  gmtModified: number;
  // 用户组关联关系
  relations: UserGroupRelation[];
  // 全局订阅
  scopeGlobal?: boolean;
  // 0、当前workspace有效；
  // 1、租户有效；
  validScope?: number;
  // 当前用户组的告警规则定阅数量
  subscribeCount?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      modifier: 'modifier',
      gmtModified: 'gmt_modified',
      relations: 'relations',
      scopeGlobal: 'scope_global',
      validScope: 'valid_scope',
      subscribeCount: 'subscribe_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      modifier: 'string',
      gmtModified: 'number',
      relations: { 'type': 'array', 'itemType': UserGroupRelation },
      scopeGlobal: 'boolean',
      validScope: 'number',
      subscribeCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PageQuery
export class PageQuery extends $tea.Model {
  // page_size
  pageSize: number;
  // page_index
  pageIndex: number;
  // cur_index
  curIndex: number;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      pageIndex: 'page_index',
      curIndex: 'cur_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageIndex: 'number',
      curIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XTableData extends $tea.Model {
  //  
  tags?: XStringKeyValue[];
  //  
  metricValues?: XTimeMetricsValue[];
  static names(): { [key: string]: string } {
    return {
      tags: 'tags',
      metricValues: 'metric_values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tags: { 'type': 'array', 'itemType': XStringKeyValue },
      metricValues: { 'type': 'array', 'itemType': XTimeMetricsValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一告警规则
export class UnifiedAlarmRuleVO extends $tea.Model {
  // 主键
  id?: number;
  // 告警规则名称
  name?: string;
  // 分类 用于区分pql规则和自定义规则
  category?: string;
  // 规则配置
  ruleConfig?: string;
  // 告警等级
  level?: number;
  // 检测频率
  step?: number;
  // 触发周期
  pendingHit?: number;
  // 恢复周期
  recoveredHit?: number;
  // 静默时间
  silenceTime?: number;
  // 时区
  timeZone?: string;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 指标无数据触发告警 是个开关 1:打开 0:关闭
  alarmEmpty?: number;
  // 告警触发时通知 1:勾选 0:不勾选
  notifyFiring?: number;
  // 告警恢复时通知 1:勾选 0:不勾选
  notifyRecovered?: number;
  // 告警无数据时通知 1:勾选 0:不勾选
  notifyEmpty?: number;
  // 通知渠道
  channels?: string;
  // 通知模板id
  notifyTplId?: number;
  // 通知时间
  notifyTimeFilter?: string;
  // 暂停开始时间
  suspendedStartTime?: number;
  // 暂停结束时间
  suspendedEndTime?: number;
  // 暂停的原因
  suspendedReason?: string;
  // 唯一 ID，保证迁移前后不变
  uniqueIdentity?: string;
  // 标识告警规则迁移之前的 ID
  sourceId?: string;
  // 启停状态 开关
  status?: number;
  // 软删除
  deleted?: number;
  // 租户id
  tenantId?: number;
  // 工作空间id
  workspaceId?: number;
  // 创建人
  creator?: string;
  // 修改人
  modifier?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 告警状态
  alarmStatus?: number;
  // 告警条件简介
  conditionsDes?: string[];
  // 告警类型
  alarmType?: string;
  // 告警数据源跳转url
  alarmUrl?: string;
  // 数据源名称
  dataSourceName?: string;
  // 目标对象是否删除
  alarmTargetDeleted?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      level: 'level',
      step: 'step',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      silenceTime: 'silence_time',
      timeZone: 'time_zone',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      alarmEmpty: 'alarm_empty',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyEmpty: 'notify_empty',
      channels: 'channels',
      notifyTplId: 'notify_tpl_id',
      notifyTimeFilter: 'notify_time_filter',
      suspendedStartTime: 'suspended_start_time',
      suspendedEndTime: 'suspended_end_time',
      suspendedReason: 'suspended_reason',
      uniqueIdentity: 'unique_identity',
      sourceId: 'source_id',
      status: 'status',
      deleted: 'deleted',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      alarmStatus: 'alarm_status',
      conditionsDes: 'conditions_des',
      alarmType: 'alarm_type',
      alarmUrl: 'alarm_url',
      dataSourceName: 'data_source_name',
      alarmTargetDeleted: 'alarm_target_deleted',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      level: 'number',
      step: 'number',
      pendingHit: 'number',
      recoveredHit: 'number',
      silenceTime: 'number',
      timeZone: 'string',
      emergency: 'string',
      emergencyUrl: 'string',
      alarmEmpty: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyEmpty: 'number',
      channels: 'string',
      notifyTplId: 'number',
      notifyTimeFilter: 'string',
      suspendedStartTime: 'number',
      suspendedEndTime: 'number',
      suspendedReason: 'string',
      uniqueIdentity: 'string',
      sourceId: 'string',
      status: 'number',
      deleted: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      alarmStatus: 'number',
      conditionsDes: { 'type': 'array', 'itemType': 'string' },
      alarmType: 'string',
      alarmUrl: 'string',
      dataSourceName: 'string',
      alarmTargetDeleted: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 能登陆监控的用户
export class MonitorUserDO extends $tea.Model {
  // 登录名
  loginName: string;
  // 昵称(花名或显示名)
  nickName: string;
  // 手机号码
  phoneNum: string;
  // 真名
  realName: string;
  // 一方化标记位
  fromAliyun: boolean;
  // 是否未超级管理员
  superAdmin: boolean;
  // 用户上的权限
  superViewer: boolean;
  // super_admin或者super_viewer
  isSuper: boolean;
  // 用户 ID
  id: number;
  // 用户来源
  identityType: string;
  static names(): { [key: string]: string } {
    return {
      loginName: 'login_name',
      nickName: 'nick_name',
      phoneNum: 'phone_num',
      realName: 'real_name',
      fromAliyun: 'from_aliyun',
      superAdmin: 'super_admin',
      superViewer: 'super_viewer',
      isSuper: 'is_super',
      id: 'id',
      identityType: 'identity_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loginName: 'string',
      nickName: 'string',
      phoneNum: 'string',
      realName: 'string',
      fromAliyun: 'boolean',
      superAdmin: 'boolean',
      superViewer: 'boolean',
      isSuper: 'boolean',
      id: 'number',
      identityType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间
export class Workspace extends $tea.Model {
  // ID
  id: number;
  // 名称
  name: string;
  // 展示名称
  displayName: string;
  // 租户ID
  tenantId: number;
  // outsideWsId
  outsideWsId: string;
  // outsideTenantId
  outsideTenantId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      tenantId: 'tenant_id',
      outsideWsId: 'outside_ws_id',
      outsideTenantId: 'outside_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      displayName: 'string',
      tenantId: 'number',
      outsideWsId: 'string',
      outsideTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UserAuthRsp
export class UserAuthRsp extends $tea.Model {
  // powers
  powers: LongListKeySet[];
  // bd_powers
  bdPowers: LongListKeySet[];
  // w_powers
  wPowers: LongListKeySet[];
  // t_powers
  tPowers: LongListKeySet[];
  // super_admin
  superAdmin: boolean;
  // super_view
  superView: boolean;
  // biz_domains
  bizDomains: BizDomain[];
  // auth_url
  authUrl: string;
  static names(): { [key: string]: string } {
    return {
      powers: 'powers',
      bdPowers: 'bd_powers',
      wPowers: 'w_powers',
      tPowers: 't_powers',
      superAdmin: 'super_admin',
      superView: 'super_view',
      bizDomains: 'biz_domains',
      authUrl: 'auth_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      powers: { 'type': 'array', 'itemType': LongListKeySet },
      bdPowers: { 'type': 'array', 'itemType': LongListKeySet },
      wPowers: { 'type': 'array', 'itemType': LongListKeySet },
      tPowers: { 'type': 'array', 'itemType': LongListKeySet },
      superAdmin: 'boolean',
      superView: 'boolean',
      bizDomains: { 'type': 'array', 'itemType': BizDomain },
      authUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ModelTreeNode
export class ModelTreeNode extends $tea.Model {
  // name
  name: string;
  // id
  id: number;
  // plugin_name
  pluginName: string;
  // type
  type: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      pluginName: 'plugin_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'number',
      pluginName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件夹实体类
export class FolderDO extends $tea.Model {
  // 文件夹ID
  id: number;
  // 文件夹名称
  name: string;
  // 父目录 ID
  parentFolderId: string;
  // 排序号
  sortIndex?: string;
  // 监控租户 ID
  tenantId: number;
  // 监控工作空间 ID
  workspaceId: string;
  // 创建者
  creater: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 修改者
  modifier: string;
  // 是否告警
  alarmed: boolean;
  // 是否置顶
  top: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      parentFolderId: 'parent_folder_id',
      sortIndex: 'sort_index',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      creater: 'creater',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      modifier: 'modifier',
      alarmed: 'alarmed',
      top: 'top',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      parentFolderId: 'string',
      sortIndex: 'string',
      tenantId: 'number',
      workspaceId: 'string',
      creater: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      modifier: 'string',
      alarmed: 'boolean',
      top: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一告警订阅
export class UnifiedAlarmSubVO extends $tea.Model {
  // 主键
  id?: number;
  // 告警规则id
  alarmRuleId?: number;
  // 告警模板id
  alarmTplId?: number;
  // 订阅者的类型
  subscriberType?: string;
  // 订阅者
  subscriber?: string;
  // 订阅者名称
  subscriberName?: string;
  // 租户id
  tenantId?: number;
  // 工作空间id
  workspaceId?: number;
  // 创建人,可以理解为当前登录用户
  creator?: string;
  // 修改人,同creator
  modifier?: string;
  // 创建日期
  gmtCreate?: string;
  // 修改日期
  gmtModified?: string;
  // 静默时间
  silenceTime?: number;
  // 通知渠道
  channel?: string;
  // 订阅者来源
  subscriberSource?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      alarmRuleId: 'alarm_rule_id',
      alarmTplId: 'alarm_tpl_id',
      subscriberType: 'subscriber_type',
      subscriber: 'subscriber',
      subscriberName: 'subscriber_name',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      silenceTime: 'silence_time',
      channel: 'channel',
      subscriberSource: 'subscriber_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      alarmRuleId: 'number',
      alarmTplId: 'number',
      subscriberType: 'string',
      subscriber: 'string',
      subscriberName: 'string',
      tenantId: 'number',
      workspaceId: 'number',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      silenceTime: 'number',
      channel: 'string',
      subscriberSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IpFileOs
export class IpFileOs extends $tea.Model {
  // error_msg
  errorMsg: string;
  // ip
  ip: string;
  // next_file_id
  nextFileId: string;
  // next_offset
  nextOffset: number;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      errorMsg: 'error_msg',
      ip: 'ip',
      nextFileId: 'next_file_id',
      nextOffset: 'next_offset',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorMsg: 'string',
      ip: 'string',
      nextFileId: 'string',
      nextOffset: 'number',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自定义监控指标DO
export class CustomPluginDO extends $tea.Model {
  // ID
  id?: number;
  // 自定义监控名称
  name: string;
  // 监控类型id
  pluginId: number;
  // 监控类型
  pluginType: string;
  // 父级文件夹 ID
  parentFolderId: number;
  // 创建者
  creater?: string;
  // 最后修改者
  modifier?: string;
  // 创建时间 - 时间戳
  gmtCreate?: number;
  // 最后修改时间 - 时间戳
  gmtModified?: number;
  // 是否有报警
  alarmed?: boolean;
  // 日志
  log?: Log;
  // 存储信息
  saveSchema?: SaveSchema;
  // 采集元数据过滤项
  opsmetaSchema?: OpsmetaSchema;
  // 属性扩展包
  spm?: Spm;
  // 告警套餐列表
  alarmPkgs?: AlarmPkgDO[];
  // 日志筛选黑名单
  blackFilters?: Filter[];
  // 日志筛选白名单
  whiteFilters?: Filter[];
  // OPS分组方式
  opsGroupBy?: OpsGroupBy;
  // 统计方式
  cal?: Cal;
  // 配置状态
  status?: StatusDO;
  // top预警
  topAlarm?: TopAlarmDO;
  // 分组规则
  groupBy?: Filter[];
  // 状态描述信息
  statusDesc?: string;
  // 是否需要动态key
  dkNeed?: boolean;
  // 推荐的动态key列表, 分号间隔
  dks?: string;
  // 是否需要大盘显示基线
  baselineNeed?: boolean;
  // 是否需要快速刷入实时缓存
  flushBasin?: boolean;
  // 所属应用
  xflushApps?: string;
  // script (JSON String格式)
  scriptNew?: string;
  // 是否开启
  isOpen?: boolean;
  // 插件类型别名
  pluginTypeAlias: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      pluginId: 'plugin_id',
      pluginType: 'plugin_type',
      parentFolderId: 'parent_folder_id',
      creater: 'creater',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      alarmed: 'alarmed',
      log: 'log',
      saveSchema: 'save_schema',
      opsmetaSchema: 'opsmeta_schema',
      spm: 'spm',
      alarmPkgs: 'alarm_pkgs',
      blackFilters: 'black_filters',
      whiteFilters: 'white_filters',
      opsGroupBy: 'ops_group_by',
      cal: 'cal',
      status: 'status',
      topAlarm: 'top_alarm',
      groupBy: 'group_by',
      statusDesc: 'status_desc',
      dkNeed: 'dk_need',
      dks: 'dks',
      baselineNeed: 'baseline_need',
      flushBasin: 'flush_basin',
      xflushApps: 'xflush_apps',
      scriptNew: 'script_new',
      isOpen: 'is_open',
      pluginTypeAlias: 'plugin_type_alias',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      pluginId: 'number',
      pluginType: 'string',
      parentFolderId: 'number',
      creater: 'string',
      modifier: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      alarmed: 'boolean',
      log: Log,
      saveSchema: SaveSchema,
      opsmetaSchema: OpsmetaSchema,
      spm: Spm,
      alarmPkgs: { 'type': 'array', 'itemType': AlarmPkgDO },
      blackFilters: { 'type': 'array', 'itemType': Filter },
      whiteFilters: { 'type': 'array', 'itemType': Filter },
      opsGroupBy: OpsGroupBy,
      cal: Cal,
      status: StatusDO,
      topAlarm: TopAlarmDO,
      groupBy: { 'type': 'array', 'itemType': Filter },
      statusDesc: 'string',
      dkNeed: 'boolean',
      dks: 'string',
      baselineNeed: 'boolean',
      flushBasin: 'boolean',
      xflushApps: 'string',
      scriptNew: 'string',
      isOpen: 'boolean',
      pluginTypeAlias: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警消息历史
export class UnifiedAlarmNotifyHistoryVO extends $tea.Model {
  // 主键
  id?: number;
  // 告警历史id
  alarmHistoryId?: number;
  // 告警事件id
  alarmEventId?: string;
  // 告警规则id
  alarmRuleId?: number;
  // 告警等级
  alarmLevel?: number;
  // 告警静默期
  alarmSilenceTime?: number;
  // 告警时间
  alarmTime?: number;
  // 通知渠道
  channel?: string;
  // 订阅人的类型
  subscriberType?: string;
  // 订阅人
  subscriber?: string;
  // 聚合条数
  aggCount?: number;
  // 通知状态
  status?: number;
  // 租户id
  tenantId?: number;
  // 工作空间id
  workspaceId?: number;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 消息内容
  notifyContent?: string;
  // 告警规则名
  alarmRuleName?: string;
  // 订阅人
  subscriberName?: string;
  // 订阅者来源
  subscriberSource?: string;
  // 告警消息的状态
  alarmStatus?: number;
  // 告警类型
  alarmType?: string;
  // 告警数据源跳转url
  alarmUrl?: string;
  // 数据源名称
  dataSourceName?: string;
  // 目标对象是否删除
  alarmTargetDeleted?: boolean;
  // 描述消息发送错误原因
  errorMessage?: string;
  // 告警消息的日志跟踪字段
  traceId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      alarmHistoryId: 'alarm_history_id',
      alarmEventId: 'alarm_event_id',
      alarmRuleId: 'alarm_rule_id',
      alarmLevel: 'alarm_level',
      alarmSilenceTime: 'alarm_silence_time',
      alarmTime: 'alarm_time',
      channel: 'channel',
      subscriberType: 'subscriber_type',
      subscriber: 'subscriber',
      aggCount: 'agg_count',
      status: 'status',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      notifyContent: 'notify_content',
      alarmRuleName: 'alarm_rule_name',
      subscriberName: 'subscriber_name',
      subscriberSource: 'subscriber_source',
      alarmStatus: 'alarm_status',
      alarmType: 'alarm_type',
      alarmUrl: 'alarm_url',
      dataSourceName: 'data_source_name',
      alarmTargetDeleted: 'alarm_target_deleted',
      errorMessage: 'error_message',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      alarmHistoryId: 'number',
      alarmEventId: 'string',
      alarmRuleId: 'number',
      alarmLevel: 'number',
      alarmSilenceTime: 'number',
      alarmTime: 'number',
      channel: 'string',
      subscriberType: 'string',
      subscriber: 'string',
      aggCount: 'number',
      status: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      notifyContent: 'string',
      alarmRuleName: 'string',
      subscriberName: 'string',
      subscriberSource: 'string',
      alarmStatus: 'number',
      alarmType: 'string',
      alarmUrl: 'string',
      dataSourceName: 'string',
      alarmTargetDeleted: 'boolean',
      errorMessage: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasAppDto
export class TraasAppDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // 应用所属的上层所有祖先分组
  ancestorAppGroups?: TraasAppGroupDto[];
  // app_group_uuid
  appGroupUuid?: string;
  // app_group_name
  appGroupName?: string;
  // app_server_count
  appServerCount?: number;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      ancestorAppGroups: 'ancestor_app_groups',
      appGroupUuid: 'app_group_uuid',
      appGroupName: 'app_group_name',
      appServerCount: 'app_server_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      ancestorAppGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
      appGroupUuid: 'string',
      appGroupName: 'string',
      appServerCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UniversalBodyCmd
export class UniversalBodyCmd extends $tea.Model {
  // body
  body: string;
  // id
  id: number;
  // model_name
  modelName: string;
  // op
  op: string;
  // parse_long_text
  parseLongText: boolean;
  // page_size
  pageSize: number;
  // page_index
  pageIndex: number;
  // cur_index
  curIndex: number;
  static names(): { [key: string]: string } {
    return {
      body: 'body',
      id: 'id',
      modelName: 'model_name',
      op: 'op',
      parseLongText: 'parse_long_text',
      pageSize: 'page_size',
      pageIndex: 'page_index',
      curIndex: 'cur_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      body: 'string',
      id: 'number',
      modelName: 'string',
      op: 'string',
      parseLongText: 'boolean',
      pageSize: 'number',
      pageIndex: 'number',
      curIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链路查询结果的关键字段取值集
export class TraceQuerySummary extends $tea.Model {
  // local endpoint ip
  localIp?: string[];
  // local endpoint service name
  localServiceName?: string[];
  // remote endpoint ip
  remoteIp?: string[];
  // remote endpoint service name
  remoteServiceName?: string[];
  // 状态
  status?: string[];
  static names(): { [key: string]: string } {
    return {
      localIp: 'local_ip',
      localServiceName: 'local_service_name',
      remoteIp: 'remote_ip',
      remoteServiceName: 'remote_service_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      localIp: { 'type': 'array', 'itemType': 'string' },
      localServiceName: { 'type': 'array', 'itemType': 'string' },
      remoteIp: { 'type': 'array', 'itemType': 'string' },
      remoteServiceName: { 'type': 'array', 'itemType': 'string' },
      status: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FolderRequestCmd
export class FolderRequestCmd extends $tea.Model {
  // custom_plugin_id
  customPluginId: number;
  // folder_id
  folderId: number;
  // include_me
  includeMe: boolean;
  // include_plugin_name
  includePluginName: boolean;
  static names(): { [key: string]: string } {
    return {
      customPluginId: 'custom_plugin_id',
      folderId: 'folder_id',
      includeMe: 'include_me',
      includePluginName: 'include_plugin_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customPluginId: 'number',
      folderId: 'number',
      includeMe: 'boolean',
      includePluginName: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmTypeStatsVOKeySet
export class AlarmTypeStatsVOKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: AlarmTypeStatsVO;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: AlarmTypeStatsVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉机器人
export class DingDingRobot extends $tea.Model {
  // 钉钉机器人名称
  name: string;
  // 钉钉机器人token
  token: string;
  // 钉钉机器人ID
  id?: number;
  // 是否全局有效
  scopeGlobal?: boolean;
  // 订阅类型：0、当前workspace有效； 1、当前租户有效
  validScope?: number;
  // 订阅告警规则数量
  subscribeCount?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      token: 'token',
      id: 'id',
      scopeGlobal: 'scope_global',
      validScope: 'valid_scope',
      subscribeCount: 'subscribe_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      token: 'string',
      id: 'number',
      scopeGlobal: 'boolean',
      validScope: 'number',
      subscribeCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// agent实例信息
export class AgentInstance extends $tea.Model {
  // agent版本
  version: string;
  // agent 采集对象的唯一标识符
  collectId: string;
  // app 名称
  appName?: string;
  // IP 地址
  ip: string;
  // hostname 名称
  hostname?: string;
  // 租户 ID
  tenantId: number;
  // 工作空间 ID
  workspaceId: number;
  // agent 状态
  status: number;
  // 容器/ECS
  deployType: string;
  // agent 附加信息
  extraInfo?: string;
  // 更新时间
  gmtModified?: number;
  // 是否开启告警标志
  label: number;
  static names(): { [key: string]: string } {
    return {
      version: 'version',
      collectId: 'collect_id',
      appName: 'app_name',
      ip: 'ip',
      hostname: 'hostname',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      status: 'status',
      deployType: 'deploy_type',
      extraInfo: 'extra_info',
      gmtModified: 'gmt_modified',
      label: 'label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      version: 'string',
      collectId: 'string',
      appName: 'string',
      ip: 'string',
      hostname: 'string',
      tenantId: 'number',
      workspaceId: 'number',
      status: 'number',
      deployType: 'string',
      extraInfo: 'string',
      gmtModified: 'number',
      label: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// time series
export class XMetricResponse extends $tea.Model {
  // timeseries
  result: XMetricData[];
  // result type
  resultType: string;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      resultType: 'result_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: { 'type': 'array', 'itemType': XMetricData },
      resultType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent版本策略
export class AgentVersionStrategy extends $tea.Model {
  // agent 地址
  url: string;
  // agent 版本号
  version: string;
  // 0 容器，1经典
  type: number;
  // 0 生效，1失效
  status: number;
  // agent 版本内容
  content?: string;
  // 生效范围
  scope: string;
  // 生效范围的唯一标识
  scopeIdentity: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      version: 'version',
      type: 'type',
      status: 'status',
      content: 'content',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      version: 'string',
      type: 'number',
      status: 'number',
      content: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 时间点 - 告警统计信息 KeySet
export class AlarmCountInfoKeySet extends $tea.Model {
  // 键值 (时间戳字符串)
  key: string;
  // 某一时刻对应的告警统计信息
  value: AlarmCountInfo;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: AlarmCountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CallErrorMessage
export class CallErrorMessage extends $tea.Model {
  // error_code
  errorCode: string;
  // message
  message: string;
  // cause
  cause?: string;
  static names(): { [key: string]: string } {
    return {
      errorCode: 'error_code',
      message: 'message',
      cause: 'cause',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorCode: 'string',
      message: 'string',
      cause: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppStats
export class AppStats extends $tea.Model {
  // app_list
  appList: string[];
  // page_query
  pageQuery: PageQuery;
  static names(): { [key: string]: string } {
    return {
      appList: 'app_list',
      pageQuery: 'page_query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appList: { 'type': 'array', 'itemType': 'string' },
      pageQuery: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmOverviewDTO
export class AlarmOverviewDTO extends $tea.Model {
  // level1_alarm_count
  level1AlarmCount: number;
  // level2_alarm_count
  level2AlarmCount: number;
  // level3_alarm_count
  level3AlarmCount: number;
  // alarm_sub_count
  alarmSubCount: number;
  // alarm_pkg_count
  alarmPkgCount: number;
  // recent_alarms
  recentAlarms: AlarmHistoryDTO[];
  static names(): { [key: string]: string } {
    return {
      level1AlarmCount: 'level1_alarm_count',
      level2AlarmCount: 'level2_alarm_count',
      level3AlarmCount: 'level3_alarm_count',
      alarmSubCount: 'alarm_sub_count',
      alarmPkgCount: 'alarm_pkg_count',
      recentAlarms: 'recent_alarms',
    };
  }

  static types(): { [key: string]: any } {
    return {
      level1AlarmCount: 'number',
      level2AlarmCount: 'number',
      level3AlarmCount: 'number',
      alarmSubCount: 'number',
      alarmPkgCount: 'number',
      recentAlarms: { 'type': 'array', 'itemType': AlarmHistoryDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XPrometheusData extends $tea.Model {
  //  
  metrics?: XExpression[];
  //  
  query?: XPrometheusQuery;
  static names(): { [key: string]: string } {
    return {
      metrics: 'metrics',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metrics: { 'type': 'array', 'itemType': XExpression },
      query: XPrometheusQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RequestParams
export class RequestParams extends $tea.Model {
  // req_type
  reqType: string;
  // condition
  condition: Condition;
  // dimCondition
  dimCondition: PontusTrendRequest;
  // tenant
  tenant: string;
  // zones
  zones: string;
  // from_front
  fromFront: boolean;
  // fuzzy
  fuzzy: boolean;
  // validKeyCount
  validKeyCount: number;
  // can_switch
  canSwitch: boolean;
  static names(): { [key: string]: string } {
    return {
      reqType: 'req_type',
      condition: 'condition',
      dimCondition: 'dim_condition',
      tenant: 'tenant',
      zones: 'zones',
      fromFront: 'from_front',
      fuzzy: 'fuzzy',
      validKeyCount: 'valid_key_count',
      canSwitch: 'can_switch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqType: 'string',
      condition: Condition,
      dimCondition: PontusTrendRequest,
      tenant: 'string',
      zones: 'string',
      fromFront: 'boolean',
      fuzzy: 'boolean',
      validKeyCount: 'number',
      canSwitch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmAppStats
export class AlarmAppStats extends $tea.Model {
  // app
  app: string;
  // alarm_level
  alarmLevel: number;
  // count
  count: number;
  // stack_universal_table_id
  stackUniversalTableId: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      alarmLevel: 'alarm_level',
      count: 'count',
      stackUniversalTableId: 'stack_universal_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      alarmLevel: 'number',
      count: 'number',
      stackUniversalTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体拓扑边
export class TraasEntityTopoEdge extends $tea.Model {
  // source_node
  sourceNode: TraasEntityTopoNode;
  // target_node
  targetNode: TraasEntityTopoNode;
  // relation
  relation: string;
  static names(): { [key: string]: string } {
    return {
      sourceNode: 'source_node',
      targetNode: 'target_node',
      relation: 'relation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceNode: TraasEntityTopoNode,
      targetNode: TraasEntityTopoNode,
      relation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WebHook结构体
export class AlarmWebHook extends $tea.Model {
  // 主键 ID
  id: number;
  // 名称
  name: string;
  // url
  url: string;
  // method (POST, GET等)
  method: string;
  // headers
  headers?: KeySet[];
  // params
  params?: KeySet[];
  // config
  config?: KeySet[];
  // body_template
  bodyTemplate?: string;
  // 是否该 scope 内全局
  scopeGlobal?: boolean;
  // creator
  creator?: string;
  // modifier
  modifier?: string;
  // gmtCreate
  gmtCreate?: number;
  // gmtModified
  gmtModified?: number;
  // webhook订阅的规则数量
  subscribeCount?: number;
  // 当前租户有效还是当前workspace有效
  validScope?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      url: 'url',
      method: 'method',
      headers: 'headers',
      params: 'params',
      config: 'config',
      bodyTemplate: 'body_template',
      scopeGlobal: 'scope_global',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      subscribeCount: 'subscribe_count',
      validScope: 'valid_scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      url: 'string',
      method: 'string',
      headers: { 'type': 'array', 'itemType': KeySet },
      params: { 'type': 'array', 'itemType': KeySet },
      config: { 'type': 'array', 'itemType': KeySet },
      bodyTemplate: 'string',
      scopeGlobal: 'boolean',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      subscribeCount: 'number',
      validScope: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 总览页应用统计信息
export class AppOverviewDTO extends $tea.Model {
  // 应用总数
  totalAppCount: number;
  // 正常运行应用数
  normalAppCount: number;
  // 告警应用数
  alarmAppCount: number;
  // 自定义监控配置数
  customPluginCount: number;
  // 告警规则配置数
  alarmRuleCount: number;
  // 告警模板配置数
  alarmTplCount: number;
  // 日志路径数
  logConfigCount: number;
  // mem top排序应用
  memTopApps: AppTopItem[];
  // cpu top排序应用
  cpuTopApps: AppTopItem[];
  // 磁盘 top排序应用
  diskTopApps: AppTopItem[];
  // 告警top排序应用
  alarmTopApps?: AppTopItem[];
  // error top排序应用
  errorTopApps?: AppTopItem[];
  static names(): { [key: string]: string } {
    return {
      totalAppCount: 'total_app_count',
      normalAppCount: 'normal_app_count',
      alarmAppCount: 'alarm_app_count',
      customPluginCount: 'custom_plugin_count',
      alarmRuleCount: 'alarm_rule_count',
      alarmTplCount: 'alarm_tpl_count',
      logConfigCount: 'log_config_count',
      memTopApps: 'mem_top_apps',
      cpuTopApps: 'cpu_top_apps',
      diskTopApps: 'disk_top_apps',
      alarmTopApps: 'alarm_top_apps',
      errorTopApps: 'error_top_apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalAppCount: 'number',
      normalAppCount: 'number',
      alarmAppCount: 'number',
      customPluginCount: 'number',
      alarmRuleCount: 'number',
      alarmTplCount: 'number',
      logConfigCount: 'number',
      memTopApps: { 'type': 'array', 'itemType': AppTopItem },
      cpuTopApps: { 'type': 'array', 'itemType': AppTopItem },
      diskTopApps: { 'type': 'array', 'itemType': AppTopItem },
      alarmTopApps: { 'type': 'array', 'itemType': AppTopItem },
      errorTopApps: { 'type': 'array', 'itemType': AppTopItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权限
export class AuthDO extends $tea.Model {
  // ID
  id: number;
  // 登录名
  userLoginName: string;
  // 权限码
  auth: string;
  // 权限的资源类型
  resourceType: string;
  // 权限的资源ID (如果FOLDER或CUSTOM_PLUGIN，需要自行转成Number类型)
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      userLoginName: 'user_login_name',
      auth: 'auth',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      userLoginName: 'string',
      auth: 'string',
      resourceType: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 时间统计
export class EventStat extends $tea.Model {
  // 告警时间
  alarmTime?: number;
  // 告警等级
  alarmLevel?: number;
  // 告警统计数
  count?: number;
  static names(): { [key: string]: string } {
    return {
      alarmTime: 'alarm_time',
      alarmLevel: 'alarm_level',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alarmTime: 'number',
      alarmLevel: 'number',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// APP配置
export class AppSetting extends $tea.Model {
  // 租户ID
  tenantId: number;
  // 工作空间ID
  workspaceId: number;
  // 配置信息
  setting?: string;
  // 应用名称
  appName: string;
  // 应用监控是否开启采集
  collectEnable: boolean;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      setting: 'setting',
      appName: 'app_name',
      collectEnable: 'collect_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'number',
      workspaceId: 'number',
      setting: 'string',
      appName: 'string',
      collectEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链路搜索页面的tags配置项
export class TraceSpanSearchTagConfig extends $tea.Model {
  // 字段的key
  key?: string;
  // 中文标签
  name?: string;
  // 是否支持多选
  multiple?: boolean;
  // 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
  values?: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      name: 'name',
      multiple: 'multiple',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      name: 'string',
      multiple: 'boolean',
      values: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XSiteExport extends $tea.Model {
  //  
  dashboards?: XDashboardQuery[];
  //  
  datasources?: XDatasourceQuery[];
  // alert uuids
  alerts?: string[];
  static names(): { [key: string]: string } {
    return {
      dashboards: 'dashboards',
      datasources: 'datasources',
      alerts: 'alerts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dashboards: { 'type': 'array', 'itemType': XDashboardQuery },
      datasources: { 'type': 'array', 'itemType': XDatasourceQuery },
      alerts: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 总览页配置信息统计
export class ConfigOverviewDto extends $tea.Model {
  // 自定义监控配置数
  customPluginCount: number;
  // 告警规则配置数
  alarmRuleCount: number;
  // 告警规则配置数
  alarmTplCount: number;
  static names(): { [key: string]: string } {
    return {
      customPluginCount: 'custom_plugin_count',
      alarmRuleCount: 'alarm_rule_count',
      alarmTplCount: 'alarm_tpl_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customPluginCount: 'number',
      alarmRuleCount: 'number',
      alarmTplCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用监控 - 单个应用
export class MonitorApp extends $tea.Model {
  // 应用 ID
  id: number;
  // 应用展示名称
  displayName: string;
  // 来源
  sourceFrom: string;
  // 应用描述
  description?: string;
  // 拼接好的stack_universal_table_id
  stackUniversalTableId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      sourceFrom: 'source_from',
      description: 'description',
      stackUniversalTableId: 'stack_universal_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      displayName: 'string',
      sourceFrom: 'string',
      description: 'string',
      stackUniversalTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用告警规则总数
export class AppAlarmRuleCount extends $tea.Model {
  // 应用名称
  appName: string;
  // 应用告警规则总数
  alarmRuleCount: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      alarmRuleCount: 'alarm_rule_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      alarmRuleCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物理机信息
export class MtmNc extends $tea.Model {
  // id
  id: number;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 主机名
  hostname: string;
  // ip
  ip: string;
  // sn
  sn: string;
  // 分组
  nodeGroup: string;
  // cpu_num
  cpuNum: number;
  // 内存 M
  memMega: number;
  // 磁盘 M
  diskMega: number;
  // 物理机房
  idc: string;
  // 状态
  status: string;
  // 机型
  smName: string;
  // 采集ip
  collectIp: string;
  // idc 机房
  idcName: string;
  // sigma 集群
  cluster: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      hostname: 'hostname',
      ip: 'ip',
      sn: 'sn',
      nodeGroup: 'node_group',
      cpuNum: 'cpu_num',
      memMega: 'mem_mega',
      diskMega: 'disk_mega',
      idc: 'idc',
      status: 'status',
      smName: 'sm_name',
      collectIp: 'collect_ip',
      idcName: 'idc_name',
      cluster: 'cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'number',
      gmtModified: 'number',
      hostname: 'string',
      ip: 'string',
      sn: 'string',
      nodeGroup: 'string',
      cpuNum: 'number',
      memMega: 'number',
      diskMega: 'number',
      idc: 'string',
      status: 'string',
      smName: 'string',
      collectIp: 'string',
      idcName: 'string',
      cluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// metric query
export class XMetricQuery extends $tea.Model {
  //  
  timeout?: number;
  // start timestamp
  start?: number;
  // end timestamp
  end?: number;
  // value step
  step?: number;
  // instant time
  time?: number;
  // query clause
  query?: string;
  //  
  queryMetadatas?: XMetricQueryMetadata[];
  //  
  datasourceUuid?: string;
  //  
  metricName?: string;
  //  
  tableName?: string;
  //  
  conditions?: XCondition[];
  //  
  tag?: string;
  //  
  tenantId?: number;
  //  
  workspaceId?: number;
  //  
  datasourceType?: string;
  //  
  nullValueType?: string;
  static names(): { [key: string]: string } {
    return {
      timeout: 'timeout',
      start: 'start',
      end: 'end',
      step: 'step',
      time: 'time',
      query: 'query',
      queryMetadatas: 'query_metadatas',
      datasourceUuid: 'datasource_uuid',
      metricName: 'metric_name',
      tableName: 'table_name',
      conditions: 'conditions',
      tag: 'tag',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      datasourceType: 'datasource_type',
      nullValueType: 'null_value_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeout: 'number',
      start: 'number',
      end: 'number',
      step: 'number',
      time: 'number',
      query: 'string',
      queryMetadatas: { 'type': 'array', 'itemType': XMetricQueryMetadata },
      datasourceUuid: 'string',
      metricName: 'string',
      tableName: 'string',
      conditions: { 'type': 'array', 'itemType': XCondition },
      tag: 'string',
      tenantId: 'number',
      workspaceId: 'number',
      datasourceType: 'string',
      nullValueType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一告警规则模板
export class UnifiedAlarmTplVO extends $tea.Model {
  // 主键
  id?: number;
  // 模板名称
  name?: string;
  // 用于区分规则模板和消息模板
  category?: string;
  // 规则配置
  ruleConfig?: string;
  // 告警等级
  level?: number;
  // 检测频率
  step?: number;
  // 触发周期
  pendingHit?: number;
  // 恢复周期
  recoveredHit?: number;
  // 静默时间
  silenceTime?: number;
  // 时区
  timeZone?: string;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 无数据告警 这是个开关
  alarmEmpty?: number;
  // 告警触发时通知 开关
  notifyFiring?: number;
  // 告警恢复时通知 开关
  notifyRecovered?: number;
  // 告警无数据时通知 开关
  notifyEmpty?: number;
  // 通知渠道
  channels?: string;
  // 通知模板id
  notifyTplId?: number;
  // 通知时间
  notifyTimeFilter?: string;
  // 生效范围
  scope?: string;
  // 如scope为租户 则值为tenant_id
  scopeIdentity?: number;
  // 订阅关系的对象
  alarmSub?: string;
  // 租户id
  tenantId?: number;
  // 工作空间id
  workspaceId?: number;
  // 创建人
  creator?: string;
  // 修改人
  modifier?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      level: 'level',
      step: 'step',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      silenceTime: 'silence_time',
      timeZone: 'time_zone',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      alarmEmpty: 'alarm_empty',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyEmpty: 'notify_empty',
      channels: 'channels',
      notifyTplId: 'notify_tpl_id',
      notifyTimeFilter: 'notify_time_filter',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      alarmSub: 'alarm_sub',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      level: 'number',
      step: 'number',
      pendingHit: 'number',
      recoveredHit: 'number',
      silenceTime: 'number',
      timeZone: 'string',
      emergency: 'string',
      emergencyUrl: 'string',
      alarmEmpty: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyEmpty: 'number',
      channels: 'string',
      notifyTplId: 'number',
      notifyTimeFilter: 'string',
      scope: 'string',
      scopeIdentity: 'number',
      alarmSub: 'string',
      tenantId: 'number',
      workspaceId: 'number',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasCellDto
export class TraasCellDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // tenant_name
  tenantUuid: string;
  // tenant_name
  tenantName: string;
  // workspace_uuid
  workspaceUuid: string;
  // workspace_name
  workspaceName: string;
  // zone_uuid
  zoneUuid: string;
  // zone_name
  zoneName: string;
  // outside_id
  outsideId: string;
  // source_from
  sourceFrom: string;
  // extension
  extension: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasAppServerDto
export class TraasAppServerDto extends $tea.Model {
  // uuid
  uuid: string;
  // hostname
  hostname: string;
  // ip
  ip: string;
  // collect_id
  collectId: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // cell_uuid
  cellUuid?: string;
  // zone_uuid
  zoneUuid?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  // app_service_uuid
  appServiceUuid?: string;
  // vm_uuid
  vmUuid?: string;
  // pod_uuid
  podUuid?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // status
  status: boolean;
  // host_ip
  hostIp: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      hostname: 'hostname',
      ip: 'ip',
      collectId: 'collect_id',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      cellUuid: 'cell_uuid',
      zoneUuid: 'zone_uuid',
      appUuid: 'app_uuid',
      appName: 'app_name',
      appServiceUuid: 'app_service_uuid',
      vmUuid: 'vm_uuid',
      podUuid: 'pod_uuid',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      status: 'status',
      hostIp: 'host_ip',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      hostname: 'string',
      ip: 'string',
      collectId: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      cellUuid: 'string',
      zoneUuid: 'string',
      appUuid: 'string',
      appName: 'string',
      appServiceUuid: 'string',
      vmUuid: 'string',
      podUuid: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      status: 'boolean',
      hostIp: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指标
export class UnifiedAlarmMetric extends $tea.Model {
  // 指标
  metric: string;
  // 指标数据
  data: MetricData[];
  static names(): { [key: string]: string } {
    return {
      metric: 'metric',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metric: 'string',
      data: { 'type': 'array', 'itemType': MetricData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户操作记录
export class UserOplogDO extends $tea.Model {
  // 操作记录ID
  id: number;
  // 表名
  tableName: string;
  // 表实体对应ID
  tableEntityId: number;
  // 操作类型(可以是CREATE、UPDATE、DELETE)
  opType: string;
  // 操作时间 (直接取日志创建时间)
  gmtCreate: number;
  // 操作人
  creater: string;
  // tableName+table_entity_id，方便查询
  combineQuery: string;
  // 实体类型
  entityType?: string;
  // 名称
  name?: string;
  // 操作前的内容 (JSON String)
  opBeforeContext?: string;
  // 操作后的内容 (JSON String)
  opAfterContext?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tableName: 'table_name',
      tableEntityId: 'table_entity_id',
      opType: 'op_type',
      gmtCreate: 'gmt_create',
      creater: 'creater',
      combineQuery: 'combine_query',
      entityType: 'entity_type',
      name: 'name',
      opBeforeContext: 'op_before_context',
      opAfterContext: 'op_after_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      tableName: 'string',
      tableEntityId: 'number',
      opType: 'string',
      gmtCreate: 'number',
      creater: 'string',
      combineQuery: 'string',
      entityType: 'string',
      name: 'string',
      opBeforeContext: 'string',
      opAfterContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LongKeySet
export class LongKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: number;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppAlarmStats
export class AppAlarmStats extends $tea.Model {
  // app_name
  appName: string;
  // count
  count: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TokenConfig
export class TokenConfig extends $tea.Model {
  // token
  token?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // last_editor
  lastEditor?: string;
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      lastEditor: 'last_editor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      lastEditor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监控告警传输对象
export class AlarmSubDTO extends $tea.Model {
  // ID
  id: number;
  // 告警展示名称
  displayName: string;
  // 修改人
  modifier: string;
  // 修改时间
  gmtModified: number;
  // 告警订阅类型(folder、customplugin)
  subscriptionType: string;
  // 通知组列表
  userGroups?: UserGroup[];
  // 联系人登录名数组
  userLoginNames?: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      modifier: 'modifier',
      gmtModified: 'gmt_modified',
      subscriptionType: 'subscription_type',
      userGroups: 'user_groups',
      userLoginNames: 'user_login_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      displayName: 'string',
      modifier: 'string',
      gmtModified: 'number',
      subscriptionType: 'string',
      userGroups: { 'type': 'array', 'itemType': UserGroup },
      userLoginNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 拓扑节点
export class TopologyNode extends $tea.Model {
  // 应用名
  app?: string;
  // 节点类型: APP DB MQ CACHE
  type?: string;
  // 节点id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      type: 'type',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      type: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XSiteExportData extends $tea.Model {
  //  
  dashboards?: XDashboardCRULResponseCURequest[];
  //  
  datasources?: XDatasourceCRULResponseCURequest[];
  //  
  alerts?: UnifiedAlarmRuleVO[];
  //  
  stats?: XSiteExportStats;
  // 自定义告警的BASE64编码
  alarmRulesV2Custom?: string;
  static names(): { [key: string]: string } {
    return {
      dashboards: 'dashboards',
      datasources: 'datasources',
      alerts: 'alerts',
      stats: 'stats',
      alarmRulesV2Custom: 'alarm_rules_v2_custom',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dashboards: { 'type': 'array', 'itemType': XDashboardCRULResponseCURequest },
      datasources: { 'type': 'array', 'itemType': XDatasourceCRULResponseCURequest },
      alerts: { 'type': 'array', 'itemType': UnifiedAlarmRuleVO },
      stats: XSiteExportStats,
      alarmRulesV2Custom: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryListKeySetMap
export class AlarmHistoryListKeySetMap extends $tea.Model {
  // key
  key: string;
  // value
  entity: AlarmHistoryListKeySet[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      entity: 'entity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      entity: { 'type': 'array', 'itemType': AlarmHistoryListKeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主机元数据
export class TraasHostMachineDto extends $tea.Model {
  // uuid
  uuid: string;
  // hostname
  hostname: string;
  // ip
  ip: string;
  // collect_ip
  collectIp: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // zone_uuid
  zoneUuid?: string;
  // zone_name
  zoneName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      hostname: 'hostname',
      ip: 'ip',
      collectIp: 'collect_ip',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      hostname: 'string',
      ip: 'string',
      collectIp: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// drm 推送配置地址
export class SiteWithDrm extends $tea.Model {
  // 站点名称
  siteName: string;
  // 端点
  endpoint: string;
  // ldc
  ldcs: string[];
  static names(): { [key: string]: string } {
    return {
      siteName: 'site_name',
      endpoint: 'endpoint',
      ldcs: 'ldcs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteName: 'string',
      endpoint: 'string',
      ldcs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单链路树状图树节点
export class TraceTreeItem extends $tea.Model {
  // 应用名
  app?: string;
  // 组件类型
  component?: string;
  // 耗时, 毫秒
  duration?: number;
  // 本地应用机房信息
  idcName?: string;
  // 描述信息
  info?: string;
  // ip
  ip?: string;
  // 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
  kind?: string;
  // parent span id
  parentId?: string;
  // 请求体字节大小, 如果取不到就为-1
  requestSize?: number;
  // 响应体大小, 如果取不到就为-1
  responseSize?: number;
  // span id
  spanId?: string;
  // 开始时间, 毫秒时间戳
  startTime?: number;
  // 状态码，0或者00代表成功
  status?: string;
  // 键值对
  tags?: KeySet[];
  // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
  treeId?: string;
  // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
  treeParentId?: string;
  // 方法名
  name?: string;
  // 本地应用所属单元
  cellName?: string;
  // 远端应用名
  remoteApp?: string;
  // 远端应用ip
  remoteIp?: string;
  // 远端应用机房信息
  remoteIdcName?: string;
  // 远端应用所属单元
  remoteCellName?: string;
  // 代表是否本节点数据缺失
  missing?: boolean;
  // 代表是否有子节点
  hasChildren?: boolean;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      component: 'component',
      duration: 'duration',
      idcName: 'idc_name',
      info: 'info',
      ip: 'ip',
      kind: 'kind',
      parentId: 'parent_id',
      requestSize: 'request_size',
      responseSize: 'response_size',
      spanId: 'span_id',
      startTime: 'start_time',
      status: 'status',
      tags: 'tags',
      treeId: 'tree_id',
      treeParentId: 'tree_parent_id',
      name: 'name',
      cellName: 'cell_name',
      remoteApp: 'remote_app',
      remoteIp: 'remote_ip',
      remoteIdcName: 'remote_idc_name',
      remoteCellName: 'remote_cell_name',
      missing: 'missing',
      hasChildren: 'has_children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      component: 'string',
      duration: 'number',
      idcName: 'string',
      info: 'string',
      ip: 'string',
      kind: 'string',
      parentId: 'string',
      requestSize: 'number',
      responseSize: 'number',
      spanId: 'string',
      startTime: 'number',
      status: 'string',
      tags: { 'type': 'array', 'itemType': KeySet },
      treeId: 'string',
      treeParentId: 'string',
      name: 'string',
      cellName: 'string',
      remoteApp: 'string',
      remoteIp: 'string',
      remoteIdcName: 'string',
      remoteCellName: 'string',
      missing: 'boolean',
      hasChildren: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// agent版本
export class AgentVersion extends $tea.Model {
  // 版本号
  version: string;
  // 存储url
  url: string;
  static names(): { [key: string]: string } {
    return {
      version: 'version',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      version: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PluginModelDO
export class PluginModelDO extends $tea.Model {
  // id
  id: number;
  // parent_folder_id
  parentFolderId: number;
  // plugin_id
  pluginId: number;
  // plugin_type
  pluginType: string;
  // name
  name: string;
  // xflush_apps
  xflushApps: string;
  // stack_expression
  stackExpression: StackExpression;
  // cal_conf
  calConf: string;
  // opsmeta_schema
  opsmetaSchema: OpsmetaSchema;
  // save_schema
  saveSchema: SaveSchema;
  // status
  status: StatusDO;
  // outside_domain_id
  outsideDomainId: number;
  // old_folder_id
  oldFolderId: number;
  // tenant_id
  tenantId: number;
  // workspace_id
  workspaceId: number;
  // biz_domain_id
  bizDomainId: number;
  // creater
  creater: string;
  // gmt_create
  gmtCreate: number;
  // modifier
  modifier: string;
  // gmt_modified
  gmtModified: number;
  // alarm_pkgs
  alarmPkgs: AlarmPkgDO[];
  // noc
  noc: string;
  // position
  position: string;
  // alarmed
  alarmed: boolean;
  // recent_alarm_history_id
  recentAlarmHistoryId: string;
  // recent_alarm
  recentAlarm: number;
  // key_cms
  keyCms: boolean;
  // key_cms_sort
  keyCmsSort: number;
  // status_desc
  statusDesc: string;
  // data_from
  dataFrom: number;
  // data_to
  dataTo: number;
  // from_source
  fromSource: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      parentFolderId: 'parent_folder_id',
      pluginId: 'plugin_id',
      pluginType: 'plugin_type',
      name: 'name',
      xflushApps: 'xflush_apps',
      stackExpression: 'stack_expression',
      calConf: 'cal_conf',
      opsmetaSchema: 'opsmeta_schema',
      saveSchema: 'save_schema',
      status: 'status',
      outsideDomainId: 'outside_domain_id',
      oldFolderId: 'old_folder_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      bizDomainId: 'biz_domain_id',
      creater: 'creater',
      gmtCreate: 'gmt_create',
      modifier: 'modifier',
      gmtModified: 'gmt_modified',
      alarmPkgs: 'alarm_pkgs',
      noc: 'noc',
      position: 'position',
      alarmed: 'alarmed',
      recentAlarmHistoryId: 'recent_alarm_history_id',
      recentAlarm: 'recent_alarm',
      keyCms: 'key_cms',
      keyCmsSort: 'key_cms_sort',
      statusDesc: 'status_desc',
      dataFrom: 'data_from',
      dataTo: 'data_to',
      fromSource: 'from_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      parentFolderId: 'number',
      pluginId: 'number',
      pluginType: 'string',
      name: 'string',
      xflushApps: 'string',
      stackExpression: StackExpression,
      calConf: 'string',
      opsmetaSchema: OpsmetaSchema,
      saveSchema: SaveSchema,
      status: StatusDO,
      outsideDomainId: 'number',
      oldFolderId: 'number',
      tenantId: 'number',
      workspaceId: 'number',
      bizDomainId: 'number',
      creater: 'string',
      gmtCreate: 'number',
      modifier: 'string',
      gmtModified: 'number',
      alarmPkgs: { 'type': 'array', 'itemType': AlarmPkgDO },
      noc: 'string',
      position: 'string',
      alarmed: 'boolean',
      recentAlarmHistoryId: 'string',
      recentAlarm: 'number',
      keyCms: 'boolean',
      keyCmsSort: 'number',
      statusDesc: 'string',
      dataFrom: 'number',
      dataTo: 'number',
      fromSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasAppTagDto
export class TraasAppTagDto extends $tea.Model {
  // uuid
  uuid: string;
  // tag_value
  tagValue?: string;
  // tag_key
  tagKey: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      tagValue: 'tag_value',
      tagKey: 'tag_key',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      appUuid: 'app_uuid',
      appName: 'app_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      tagValue: 'string',
      tagKey: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      appUuid: 'string',
      appName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警历史时间页面显示对象
export class UnifiedAlarmEventVO extends $tea.Model {
  // 告警事件id
  alarmEventId?: string;
  // 告警内容
  alarmContent?: string;
  // 告警等级
  alarmLevel?: number;
  // 触发状态
  status?: number;
  // 告警对象
  alarmTarget?: string;
  // 告警产生时间
  alarmStartTime?: string;
  // 告警恢复时间
  alarmRecoverTime?: string;
  // 分组的告警历史集合
  alarmHistoryList?: UnifiedAlarmHistoryVO[];
  // 历史id
  alarmHistoryId?: number;
  // type
  alarmTargetType?: string;
  // 告警类型
  alarmType?: string;
  // 数据源跳转url
  alarmUrl?: string;
  // 数据源名称
  dataSourceName?: string;
  // 目标对象是否已经删除
  alarmTargetDeleted?: boolean;
  // 静默剩余时间
  silenceRemainTime?: number;
  // 告警规则ID
  alarmRuleId?: number;
  static names(): { [key: string]: string } {
    return {
      alarmEventId: 'alarm_event_id',
      alarmContent: 'alarm_content',
      alarmLevel: 'alarm_level',
      status: 'status',
      alarmTarget: 'alarm_target',
      alarmStartTime: 'alarm_start_time',
      alarmRecoverTime: 'alarm_recover_time',
      alarmHistoryList: 'alarm_history_list',
      alarmHistoryId: 'alarm_history_id',
      alarmTargetType: 'alarm_target_type',
      alarmType: 'alarm_type',
      alarmUrl: 'alarm_url',
      dataSourceName: 'data_source_name',
      alarmTargetDeleted: 'alarm_target_deleted',
      silenceRemainTime: 'silence_remain_time',
      alarmRuleId: 'alarm_rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alarmEventId: 'string',
      alarmContent: 'string',
      alarmLevel: 'number',
      status: 'number',
      alarmTarget: 'string',
      alarmStartTime: 'string',
      alarmRecoverTime: 'string',
      alarmHistoryList: { 'type': 'array', 'itemType': UnifiedAlarmHistoryVO },
      alarmHistoryId: 'number',
      alarmTargetType: 'string',
      alarmType: 'string',
      alarmUrl: 'string',
      dataSourceName: 'string',
      alarmTargetDeleted: 'boolean',
      silenceRemainTime: 'number',
      alarmRuleId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// traasmeta zone
export class TraasZoneDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // region_uuid
  regionUuid: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      regionUuid: 'region_uuid',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      regionUuid: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// traasmeta tenant
export class TraasTenantDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class XKeyJson extends $tea.Model {
  //  
  key: string;
  // json string
  json: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      json: 'json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      json: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警规则绑定关系
export class UnifiedAlarmRuleBindingVO extends $tea.Model {
  // 租户 ID
  tenantId: number;
  // 工作空间 ID
  workspaceId: number;
  // 监控对象类型
  alarmTargetType: string;
  // 监控对象名称
  alarmTargetIdentity?: string;
  // 告警规则 ID
  alarmRuleId: number;
  // 数据源类型
  datasourceType?: string;
  // 数据源 ID
  datasource?: string;
  // 告警规则详情
  alarmRule?: UnifiedAlarmRuleVO;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      alarmTargetType: 'alarm_target_type',
      alarmTargetIdentity: 'alarm_target_identity',
      alarmRuleId: 'alarm_rule_id',
      datasourceType: 'datasource_type',
      datasource: 'datasource',
      alarmRule: 'alarm_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'number',
      workspaceId: 'number',
      alarmTargetType: 'string',
      alarmTargetIdentity: 'string',
      alarmRuleId: 'number',
      datasourceType: 'string',
      datasource: 'string',
      alarmRule: UnifiedAlarmRuleVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链路详情的拓扑节点
export class TraceDetailTopologyItem extends $tea.Model {
  // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
  treeId?: string;
  // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
  treeParentId?: string;
  // 应用名
  app?: string;
  // 应用ip
  ip?: string;
  // 客户端是否经过mesh
  hasClientMesh?: boolean;
  // 服务端是否经过mesh
  hasServerMesh?: boolean;
  // 数据中心
  idcName?: string;
  // 单元名
  cellName?: string;
  // 方法名
  name?: string;
  // 客户端开始时间, 毫秒时间戳
  clientStartTime?: number;
  // 服务端开始时间, 毫秒时间戳
  serverStartTime?: number;
  // 客户端毫秒耗时
  clientDuration?: number;
  // 服务端毫秒耗时
  serverDuration?: number;
  // 客户端状态码
  clientStatus?: string;
  // 服务端状态码
  serverStatus?: string;
  // 客户端组件类型
  clientComponent?: string;
  // 服务端组件类型
  serverComponent?: string;
  // 整体状态码
  status?: string;
  // 健康度耗时配置
  apdexThreshold?: string;
  // 健康度
  apdexStatus?: string;
  // 健康度数值
  apdexValue?: string;
  static names(): { [key: string]: string } {
    return {
      treeId: 'tree_id',
      treeParentId: 'tree_parent_id',
      app: 'app',
      ip: 'ip',
      hasClientMesh: 'has_client_mesh',
      hasServerMesh: 'has_server_mesh',
      idcName: 'idc_name',
      cellName: 'cell_name',
      name: 'name',
      clientStartTime: 'client_start_time',
      serverStartTime: 'server_start_time',
      clientDuration: 'client_duration',
      serverDuration: 'server_duration',
      clientStatus: 'client_status',
      serverStatus: 'server_status',
      clientComponent: 'client_component',
      serverComponent: 'server_component',
      status: 'status',
      apdexThreshold: 'apdex_threshold',
      apdexStatus: 'apdex_status',
      apdexValue: 'apdex_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      treeId: 'string',
      treeParentId: 'string',
      app: 'string',
      ip: 'string',
      hasClientMesh: 'boolean',
      hasServerMesh: 'boolean',
      idcName: 'string',
      cellName: 'string',
      name: 'string',
      clientStartTime: 'number',
      serverStartTime: 'number',
      clientDuration: 'number',
      serverDuration: 'number',
      clientStatus: 'string',
      serverStatus: 'string',
      clientComponent: 'string',
      serverComponent: 'string',
      status: 'string',
      apdexThreshold: 'string',
      apdexStatus: 'string',
      apdexValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 栈告警套餐配置
export class StackAlarmRule extends $tea.Model {
  // ID
  id: number;
  // 告警套餐配置
  config: string;
  // 栈 ID
  stackId: number;
  // 指标 ID (如pv对应的ID)
  stackMetricId: number;
  // 关联报警relation (如果未关联，默认为-1)
  stackRelationId: number;
  // 实体对象复合 ID
  stackUniversalTableId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      config: 'config',
      stackId: 'stack_id',
      stackMetricId: 'stack_metric_id',
      stackRelationId: 'stack_relation_id',
      stackUniversalTableId: 'stack_universal_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      config: 'string',
      stackId: 'number',
      stackMetricId: 'number',
      stackRelationId: 'number',
      stackUniversalTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈产品配置
export class StackGeneratedConfig extends $tea.Model {
  // 配置 ID
  id: number;
  // 所属技术栈 ID
  stackId: number;
  // 技术栈名称
  stackName: string;
  // 技术栈版本
  stackVersion: string;
  // 栈的一个实体对象 ID
  stackEntityId: number;
  // 栈的一个实体对象名称
  stackEntityName: string;
  // 实体的一个监控项 ID
  stackMonitorItemId: number;
  // 实体的一个监控项名称
  stackMonitorItemName: string;
  // 栈实体
  stackUniversalTableId: string;
  // xflush应用名称
  xflushApp: string;
  // 是否迁移过来
  xflushMove: boolean;
  // xflush_type
  xflushType: string;
  // 是否开启
  isOpen: boolean;
  // 存储规则(JSON String, 使用前需要解析)
  storageConfig: string;
  // 是否自定义
  useCustom: boolean;
  // xflush配置(JSON String, 使用前需要解析)
  xflushConfig?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      stackId: 'stack_id',
      stackName: 'stack_name',
      stackVersion: 'stack_version',
      stackEntityId: 'stack_entity_id',
      stackEntityName: 'stack_entity_name',
      stackMonitorItemId: 'stack_monitor_item_id',
      stackMonitorItemName: 'stack_monitor_item_name',
      stackUniversalTableId: 'stack_universal_table_id',
      xflushApp: 'xflush_app',
      xflushMove: 'xflush_move',
      xflushType: 'xflush_type',
      isOpen: 'is_open',
      storageConfig: 'storage_config',
      useCustom: 'use_custom',
      xflushConfig: 'xflush_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      stackId: 'number',
      stackName: 'string',
      stackVersion: 'string',
      stackEntityId: 'number',
      stackEntityName: 'string',
      stackMonitorItemId: 'number',
      stackMonitorItemName: 'string',
      stackUniversalTableId: 'string',
      xflushApp: 'string',
      xflushMove: 'boolean',
      xflushType: 'string',
      isOpen: 'boolean',
      storageConfig: 'string',
      useCustom: 'boolean',
      xflushConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链路搜索的数据库配置
export class TraceSpanSearchDbConfig extends $tea.Model {
  // tracer插件名
  tracerPluginName: string;
  // 数据源tag key
  datasourceKey: string;
  // 数据库tag key
  databaseKey: string;
  // 支持的数据库类型列表
  supportedDbTypes: string[];
  static names(): { [key: string]: string } {
    return {
      tracerPluginName: 'tracer_plugin_name',
      datasourceKey: 'datasource_key',
      databaseKey: 'database_key',
      supportedDbTypes: 'supported_db_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tracerPluginName: 'string',
      datasourceKey: 'string',
      databaseKey: 'string',
      supportedDbTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasWorkspaceGroupDto
export class TraasWorkspaceGroupDto extends $tea.Model {
  // uuid
  uuid: string;
  // uuid
  name: string;
  // display_name
  displayName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体字段
export class TraasEntityFieldDto extends $tea.Model {
  // name
  name: string;
  // display_name
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链路工作空间配置
export class TraceWorkspaceSetting extends $tea.Model {
  // 工作空间名
  workspaceName: string;
  // 是否开启采样率，false代表全采
  sampleEnabled?: boolean;
  // 采样率
  sampleRate?: string;
  // 是否开启链路
  traceEnabled?: boolean;
  // 是否开启异常链路全采样
  errorTraceEnabled?: boolean;
  // 是否开启链路瘦身
  narrowSpanEnabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      workspaceName: 'workspace_name',
      sampleEnabled: 'sample_enabled',
      sampleRate: 'sample_rate',
      traceEnabled: 'trace_enabled',
      errorTraceEnabled: 'error_trace_enabled',
      narrowSpanEnabled: 'narrow_span_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceName: 'string',
      sampleEnabled: 'boolean',
      sampleRate: 'string',
      traceEnabled: 'boolean',
      errorTraceEnabled: 'boolean',
      narrowSpanEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 拓扑边
export class TopologyEdge extends $tea.Model {
  // id
  id?: string;
  // source节点的id
  source?: string;
  // target节点的id
  target?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      source: 'source',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      source: 'string',
      target: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈信息，用于查询告警规则、历史。
export class AlarmStackInfo extends $tea.Model {
  // 是应用监控，还是自定义监控
  datasourceType?: string;
  // 数据源
  datasource?: string;
  // 应用类型
  alarmTargetType?: string;
  // 应用名称
  alarmTargetIdentify?: string;
  static names(): { [key: string]: string } {
    return {
      datasourceType: 'datasource_type',
      datasource: 'datasource',
      alarmTargetType: 'alarm_target_type',
      alarmTargetIdentify: 'alarm_target_identify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      datasourceType: 'string',
      datasource: 'string',
      alarmTargetType: 'string',
      alarmTargetIdentify: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmLevelStatsVOKeySet
export class AlarmLevelStatsVOKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: AlarmLevelStatsVO;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: AlarmLevelStatsVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// app详情
export class AppMeta extends $tea.Model {
  // workspace_id
  workspaceId: number;
  // 应用名
  appName: string;
  // app_id
  appId: number;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      appName: 'app_name',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'number',
      appName: 'string',
      appId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云开通信息
export class AliyunOpenState extends $tea.Model {
  // 阿里云用户ID
  aliyunUserId: number;
  // 阿里云实例ID
  aliyunInstanceId: string;
  // 监控租户ID
  tenantId: number;
  // 监控租户名称
  tenantName: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 开通状态，0未开通，1开通
  state: number;
  static names(): { [key: string]: string } {
    return {
      aliyunUserId: 'aliyun_user_id',
      aliyunInstanceId: 'aliyun_instance_id',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aliyunUserId: 'number',
      aliyunInstanceId: 'string',
      tenantId: 'number',
      tenantName: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户资源收藏状态
export class UserFavoriteVO extends $tea.Model {
  // 收藏资源 ID
  resourceId: string;
  // 收藏资源类型
  resourceType: string;
  // 用户收藏的 ID
  userFavoriteId: number;
  static names(): { [key: string]: string } {
    return {
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      userFavoriteId: 'user_favorite_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourceId: 'string',
      resourceType: 'string',
      userFavoriteId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单链路紧凑树状图树节点
export class TraceCompactTreeItem extends $tea.Model {
  // 方法名
  name?: string;
  // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
  treeId?: string;
  // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
  treeParentId?: string;
  // 客户端span是否缺失
  clientMissing?: boolean;
  // 服务端span是否缺失
  serverMissing?: boolean;
  // 客户端是否经过mesh
  hasClientMesh?: boolean;
  // 服务端是否经过mesh
  hasServerMesh?: boolean;
  // 是否包含子节点
  hasChildren?: boolean;
  // 客户端应用名
  clientApp?: string;
  // 服务端应用名
  serverApp?: string;
  // 客户端 ip
  clientIp?: string;
  // 服务端 ip
  serverIp?: string;
  // 客户端 idc
  clientIdcName?: string;
  // 服务端 idc
  serverIdcName?: string;
  // 客户端 cell
  clientCellName?: string;
  // 服务端 cell
  serverCellName?: string;
  // 客户端开始时间, 毫秒时间戳
  clientStartTime?: number;
  // 服务端开始时间, 毫秒时间戳
  serverStartTime?: number;
  // 客户端毫秒耗时
  clientDuration?: number;
  // 服务端毫秒耗时
  serverDuration?: number;
  // 客户端状态码
  clientStatus?: string;
  // 服务端状态码
  serverStatus?: string;
  // 客户端组件类型
  clientComponent?: string;
  // 服务端组件类型
  serverComponent?: string;
  // 客户端span
  clientSpan?: TraceSpan;
  // 服务端span
  serverSpan?: TraceSpan;
  // 整体状态码
  status?: string;
  // 健康度耗时配置
  apdexThreshold?: string;
  // 健康度
  apdexStatus?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      treeId: 'tree_id',
      treeParentId: 'tree_parent_id',
      clientMissing: 'client_missing',
      serverMissing: 'server_missing',
      hasClientMesh: 'has_client_mesh',
      hasServerMesh: 'has_server_mesh',
      hasChildren: 'has_children',
      clientApp: 'client_app',
      serverApp: 'server_app',
      clientIp: 'client_ip',
      serverIp: 'server_ip',
      clientIdcName: 'client_idc_name',
      serverIdcName: 'server_idc_name',
      clientCellName: 'client_cell_name',
      serverCellName: 'server_cell_name',
      clientStartTime: 'client_start_time',
      serverStartTime: 'server_start_time',
      clientDuration: 'client_duration',
      serverDuration: 'server_duration',
      clientStatus: 'client_status',
      serverStatus: 'server_status',
      clientComponent: 'client_component',
      serverComponent: 'server_component',
      clientSpan: 'client_span',
      serverSpan: 'server_span',
      status: 'status',
      apdexThreshold: 'apdex_threshold',
      apdexStatus: 'apdex_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      treeId: 'string',
      treeParentId: 'string',
      clientMissing: 'boolean',
      serverMissing: 'boolean',
      hasClientMesh: 'boolean',
      hasServerMesh: 'boolean',
      hasChildren: 'boolean',
      clientApp: 'string',
      serverApp: 'string',
      clientIp: 'string',
      serverIp: 'string',
      clientIdcName: 'string',
      serverIdcName: 'string',
      clientCellName: 'string',
      serverCellName: 'string',
      clientStartTime: 'number',
      serverStartTime: 'number',
      clientDuration: 'number',
      serverDuration: 'number',
      clientStatus: 'string',
      serverStatus: 'string',
      clientComponent: 'string',
      serverComponent: 'string',
      clientSpan: TraceSpan,
      serverSpan: TraceSpan,
      status: 'string',
      apdexThreshold: 'string',
      apdexStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈监控项
export class StackMonitorItem extends $tea.Model {
  // 监控项 ID
  id: number;
  // 技术栈 ID
  stackId: number;
  // 名称，必须是英文
  name: string;
  // 显示名
  displayName: string;
  // 能否自定义
  canCustom: boolean;
  // 管理实体 ID
  manageEntityId: number;
  // metric类型(dependency、error、service、resource等)
  metricType?: string;
  // 配置(JSON String, 使用前需要解析)
  config?: string;
  // 标题
  title?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      stackId: 'stack_id',
      name: 'name',
      displayName: 'display_name',
      canCustom: 'can_custom',
      manageEntityId: 'manage_entity_id',
      metricType: 'metric_type',
      config: 'config',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      stackId: 'number',
      name: 'string',
      displayName: 'string',
      canCustom: 'boolean',
      manageEntityId: 'number',
      metricType: 'string',
      config: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ErrorRealte
export class ErrorRealte extends $tea.Model {
  // ips
  ips: string[];
  // log_paths
  logPaths: string[];
  static names(): { [key: string]: string } {
    return {
      ips: 'ips',
      logPaths: 'log_paths',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ips: { 'type': 'array', 'itemType': 'string' },
      logPaths: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NodeOverviewDTO
export class NodeOverviewDTO extends $tea.Model {
  // 磁盘 top排序应用
  diskTopNodes: NodeTopItem[];
  // 	
  // cpu top排序应用
  cpuTopNodes: NodeTopItem[];
  // mem top排序应用
  memTopNodes: NodeTopItem[];
  static names(): { [key: string]: string } {
    return {
      diskTopNodes: 'disk_top_nodes',
      cpuTopNodes: 'cpu_top_nodes',
      memTopNodes: 'mem_top_nodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      diskTopNodes: { 'type': 'array', 'itemType': NodeTopItem },
      cpuTopNodes: { 'type': 'array', 'itemType': NodeTopItem },
      memTopNodes: { 'type': 'array', 'itemType': NodeTopItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// InitInfo
export class InitInfo extends $tea.Model {
  // auth_url
  authUrl: string;
  // user
  user: MonitorUser;
  // nav_head
  navHead: NavContent;
  static names(): { [key: string]: string } {
    return {
      authUrl: 'auth_url',
      user: 'user',
      navHead: 'nav_head',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authUrl: 'string',
      user: MonitorUser,
      navHead: NavContent,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SpiConfig
export class SpiConfig extends $tea.Model {
  // end_point或token
  endPoint?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // last_editor
  lastEditor?: string;
  // 字段格式
  fieldNamingStrategy?: string;
  // 云厂商类型
  cloudVendorType?: string;
  static names(): { [key: string]: string } {
    return {
      endPoint: 'end_point',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      lastEditor: 'last_editor',
      fieldNamingStrategy: 'field_naming_strategy',
      cloudVendorType: 'cloud_vendor_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endPoint: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      lastEditor: 'string',
      fieldNamingStrategy: 'string',
      cloudVendorType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试演示
export class AlarmTest extends $tea.Model {
  // 工作空间名称
  workspaceName: string;
  // 告警规则id 
  alarmRuleId: number;
  static names(): { [key: string]: string } {
    return {
      workspaceName: 'workspace_name',
      alarmRuleId: 'alarm_rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceName: 'string',
      alarmRuleId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FolderPaths
export class FolderPaths extends $tea.Model {
  // paths
  paths: FolderPath[];
  static names(): { [key: string]: string } {
    return {
      paths: 'paths',
    };
  }

  static types(): { [key: string]: any } {
    return {
      paths: { 'type': 'array', 'itemType': FolderPath },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmNotifyStatsKeySet
export class AlarmNotifyStatsKeySet extends $tea.Model {
  // key
  key: string;
  // value
  value: AlarmNotifyStats;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: AlarmNotifyStats,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// traasmeta region
export class TraasRegionDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 只包含一个string value的结构体, 用于解决阿里云POP OpenAPI的限制问题.
export class StringValue extends $tea.Model {
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsDataCheck
export class OpsDataCheck extends $tea.Model {
  // id
  id: number;
  // 指标名称
  targetName: string;
  // 指标类型
  targetType: string;
  // 0：异常 1：正常
  status: number;
  // check_result
  checkResult: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      targetName: 'target_name',
      targetType: 'target_type',
      status: 'status',
      checkResult: 'check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      targetName: 'string',
      targetType: 'string',
      status: 'number',
      checkResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一告警传输对象
export class UnifiedAlarmSubDTO extends $tea.Model {
  // 订阅者id
  subscriber: string;
  // 订阅者类型
  subscriberType: string;
  // 订阅者来源
  subscriberSource: string;
  // 告警对象的名称
  subscriberName: string;
  static names(): { [key: string]: string } {
    return {
      subscriber: 'subscriber',
      subscriberType: 'subscriber_type',
      subscriberSource: 'subscriber_source',
      subscriberName: 'subscriber_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subscriber: 'string',
      subscriberType: 'string',
      subscriberSource: 'string',
      subscriberName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 菜单配置
export class MenuConfig extends $tea.Model {
  // 是否需要在顶部菜单展示各个入口
  showTopNavPages: boolean;
  // 需要隐藏的菜单
  hideMenus: Menu[];
  static names(): { [key: string]: string } {
    return {
      showTopNavPages: 'show_top_nav_pages',
      hideMenus: 'hide_menus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      showTopNavPages: 'boolean',
      hideMenus: { 'type': 'array', 'itemType': Menu },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// x
export class XTableResponse extends $tea.Model {
  //  
  resultType: string;
  //  
  result: XTableData[];
  static names(): { [key: string]: string } {
    return {
      resultType: 'result_type',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultType: 'string',
      result: { 'type': 'array', 'itemType': XTableData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsCheckResult
export class OpsCheckResult extends $tea.Model {
  // 应用名
  app: string;
  // 实际实例数
  actualInstanceNum: number;
  // 预期实例数
  expectInstanceNum: number;
  // 应用监控指标健康数
  appHealthyNum: number;
  // 	
  // 应用监控指标异常数
  appUnhealthyNum: number;
  // 自定义监控指标健康数
  customHealthyNum: number;
  // 自定义监控指标异常数
  customUnhealthyNum: number;
  // id
  id: number;
  // 规则状态 0：已关闭 1：已开启
  ruleStatus: number;
  // rule_id
  ruleId?: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      actualInstanceNum: 'actual_instance_num',
      expectInstanceNum: 'expect_instance_num',
      appHealthyNum: 'app_healthy_num',
      appUnhealthyNum: 'app_unhealthy_num',
      customHealthyNum: 'custom_healthy_num',
      customUnhealthyNum: 'custom_unhealthy_num',
      id: 'id',
      ruleStatus: 'rule_status',
      ruleId: 'rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      actualInstanceNum: 'number',
      expectInstanceNum: 'number',
      appHealthyNum: 'number',
      appUnhealthyNum: 'number',
      customHealthyNum: 'number',
      customUnhealthyNum: 'number',
      id: 'number',
      ruleStatus: 'number',
      ruleId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceSettingDetail
export class WorkspaceSettingDetail extends $tea.Model {
  // old_alarm_lang
  oldAlarmLang?: string;
  // 旧版告警开关
  oldAlarmEnable?: boolean;
  // unified_alarm_lang
  unifiedAlarmLang?: string;
  // unified_alarm_enable
  unifiedAlarmEnable?: boolean;
  // trace_enable
  traceEnable?: boolean;
  // 监控诊断开关
  diagnoseEnable?: boolean;
  static names(): { [key: string]: string } {
    return {
      oldAlarmLang: 'old_alarm_lang',
      oldAlarmEnable: 'old_alarm_enable',
      unifiedAlarmLang: 'unified_alarm_lang',
      unifiedAlarmEnable: 'unified_alarm_enable',
      traceEnable: 'trace_enable',
      diagnoseEnable: 'diagnose_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      oldAlarmLang: 'string',
      oldAlarmEnable: 'boolean',
      unifiedAlarmLang: 'string',
      unifiedAlarmEnable: 'boolean',
      traceEnable: 'boolean',
      diagnoseEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警对象
export class AlarmTarget extends $tea.Model {
  // 告警对象标识:
  targetIdentity?: string;
  // 告警对象类型
  targetType?: string;
  static names(): { [key: string]: string } {
    return {
      targetIdentity: 'target_identity',
      targetType: 'target_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      targetIdentity: 'string',
      targetType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OneConsoleRegion
export class OneConsoleRegion extends $tea.Model {
  // region id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  // workspaces
  workspaces: OneConsoleWorkspace[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      name: 'string',
      workspaces: { 'type': 'array', 'itemType': OneConsoleWorkspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AlarmHistoryStatsVO
export class AlarmHistoryStatsVO extends $tea.Model {
  // trends
  trends: AlarmHistoryStatsDTOsKeySet[];
  static names(): { [key: string]: string } {
    return {
      trends: 'trends',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trends: { 'type': 'array', 'itemType': AlarmHistoryStatsDTOsKeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TraasWorkspaceDto
export class TraasWorkspaceDto extends $tea.Model {
  // uuid
  uuid: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_group_uuid
  workspaceGroupUuid?: string;
  // region_uuid
  regionUuid?: string;
  // zone_uuids
  zoneUuids?: string[];
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceGroupUuid: 'workspace_group_uuid',
      regionUuid: 'region_uuid',
      zoneUuids: 'zone_uuids',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceGroupUuid: 'string',
      regionUuid: 'string',
      zoneUuids: { 'type': 'array', 'itemType': 'string' },
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警订阅结构体
export class AlarmSub extends $tea.Model {
  // 主键 ID
  id: number;
  // 用户登录名
  userLoginName?: string;
  // 告警组 ID
  userGroupId?: number;
  // the notifyChannel
  notifyChannel?: string;
  // 告警套餐 ID
  alarmPkgId?: number;
  // 自定义监控 ID
  customPluginId?: number;
  // the stackAlarmRuleId
  stackAlarmRuleId?: number;
  // 文件夹 ID
  folderId?: number;
  // the metaGroupId
  metaGroupId?: number;
  // 技术栈实体
  stackUniversalTableId?: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified?: number;
  // 创建者
  creater: string;
  // 修改人
  modifier?: string;
  // 告警级别
  alarmLevel: number;
  // 降频通知开关
  notifyReduceSwitch: number;
  // web hook id
  alarmHttpWebHookId?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      userLoginName: 'user_login_name',
      userGroupId: 'user_group_id',
      notifyChannel: 'notify_channel',
      alarmPkgId: 'alarm_pkg_id',
      customPluginId: 'custom_plugin_id',
      stackAlarmRuleId: 'stack_alarm_rule_id',
      folderId: 'folder_id',
      metaGroupId: 'meta_group_id',
      stackUniversalTableId: 'stack_universal_table_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      creater: 'creater',
      modifier: 'modifier',
      alarmLevel: 'alarm_level',
      notifyReduceSwitch: 'notify_reduce_switch',
      alarmHttpWebHookId: 'alarm_http_web_hook_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      userLoginName: 'string',
      userGroupId: 'number',
      notifyChannel: 'string',
      alarmPkgId: 'number',
      customPluginId: 'number',
      stackAlarmRuleId: 'number',
      folderId: 'number',
      metaGroupId: 'number',
      stackUniversalTableId: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      creater: 'string',
      modifier: 'string',
      alarmLevel: 'number',
      notifyReduceSwitch: 'number',
      alarmHttpWebHookId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 拉取日志的返回对象
export class LogTail extends $tea.Model {
  // 代理IP
  agent: string;
  // 应用名
  app: string;
  // 日志行数据
  lines: string[];
  // collectId
  nc: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      app: 'app',
      lines: 'lines',
      nc: 'nc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      app: 'string',
      lines: { 'type': 'array', 'itemType': 'string' },
      nc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 时序指标数据, 相当于一条时间线
export class TimeSeriesMetrics extends $tea.Model {
  // 开始时间, 毫秒时间戳
  startTime?: number;
  // 结束时间, 毫秒时间戳
  endTime?: number;
  // 标识 metrics，类似 sql 查询条件
  tags?: KeyValuePair[];
  // 指标的分类
  type?: string;
  // Metrics 多个 point 的集合
  values?: TimeSeriesMetricsPoint[];
  static names(): { [key: string]: string } {
    return {
      startTime: 'start_time',
      endTime: 'end_time',
      tags: 'tags',
      type: 'type',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      startTime: 'number',
      endTime: 'number',
      tags: { 'type': 'array', 'itemType': KeyValuePair },
      type: 'string',
      values: { 'type': 'array', 'itemType': TimeSeriesMetricsPoint },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgentloglocateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // batch_ip_files
  batchIpFiles: IpFileOs[];
  // charset_str
  charsetStr: string;
  // error_msg
  errorMsg: string;
  // ips
  ips: string[];
  // ip_file
  ipFile: IpFileOs;
  // is_batch
  isBatch: boolean;
  // log_path
  logPath: string;
  // log_paths
  logPaths: string[];
  // time
  time: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      batchIpFiles: 'batch_ip_files',
      charsetStr: 'charset_str',
      errorMsg: 'error_msg',
      ips: 'ips',
      ipFile: 'ip_file',
      isBatch: 'is_batch',
      logPath: 'log_path',
      logPaths: 'log_paths',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      batchIpFiles: { 'type': 'array', 'itemType': IpFileOs },
      charsetStr: 'string',
      errorMsg: 'string',
      ips: { 'type': 'array', 'itemType': 'string' },
      ipFile: IpFileOs,
      isBatch: 'boolean',
      logPath: 'string',
      logPaths: { 'type': 'array', 'itemType': 'string' },
      time: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgentloglocateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // error_message
  errorMessage?: CallErrorMessage;
  // result
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorMessage: 'error_message',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorMessage: CallErrorMessage,
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgenttailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // tenant_id
  tenantId: string;
  // app_name
  appName: string;
  // prefer_host
  preferHost: string;
  // full_path
  fullPath: string;
  // scan_dirs
  scanDirs: string[];
  // need_bytes
  needBytes: number;
  // line_break_str
  lineBreakStr: string;
  // extra_suffixs
  extraSuffixs: string[];
  // charset_str
  charsetStr: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      appName: 'app_name',
      preferHost: 'prefer_host',
      fullPath: 'full_path',
      scanDirs: 'scan_dirs',
      needBytes: 'need_bytes',
      lineBreakStr: 'line_break_str',
      extraSuffixs: 'extra_suffixs',
      charsetStr: 'charset_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      appName: 'string',
      preferHost: 'string',
      fullPath: 'string',
      scanDirs: { 'type': 'array', 'itemType': 'string' },
      needBytes: 'number',
      lineBreakStr: 'string',
      extraSuffixs: { 'type': 'array', 'itemType': 'string' },
      charsetStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgenttailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // error_message
  errorMessage?: CallErrorMessage;
  // result
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorMessage: 'error_message',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorMessage: CallErrorMessage,
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgentbrowserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_name
  appName: string;
  // extra_suffixs
  extraSuffixs: string[];
  // scan_dirs
  scanDirs: string[];
  // prefer_host
  preferHost: string;
  // tenant_id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      extraSuffixs: 'extra_suffixs',
      scanDirs: 'scan_dirs',
      preferHost: 'prefer_host',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      extraSuffixs: { 'type': 'array', 'itemType': 'string' },
      scanDirs: { 'type': 'array', 'itemType': 'string' },
      preferHost: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAgentbrowserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // error_message
  errorMessage?: CallErrorMessage;
  // result
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorMessage: 'error_message',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorMessage: CallErrorMessage,
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistorytypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // from
  from: number;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      from: 'number',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistorytypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmTypeStatsVOKeySet[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmTypeStatsVOKeySet },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistorylevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // from
  from: number;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      from: 'number',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistorylevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmLevelStatsVOKeySet[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmLevelStatsVOKeySet },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsNotifyhistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // from
  from: number;
  // login_name
  loginName: string;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      from: 'from',
      loginName: 'login_name',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      from: 'number',
      loginName: 'string',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsNotifyhistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmNotifyStats[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmNotifyStats },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsStackentityRequest extends $tea.Model {
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

export class QueryRmsStackentityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LongKeySet[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': LongKeySet },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistoryappcountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_list
  appList: AppStats;
  // from
  from: number;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appList: 'app_list',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appList: AppStats,
      from: 'number',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistoryappcountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmAppStats[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmAppStats },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistoryappstatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_list
  appList: AppStats;
  // from
  from: number;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appList: 'app_list',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appList: AppStats,
      from: 'number',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAlarmhistoryappstatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmHistoryListKeySetMap[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmHistoryListKeySetMap },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAppstatspageableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_list
  appList: AppStats;
  // from
  from: number;
  // to
  to: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appList: 'app_list',
      from: 'from',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appList: AppStats,
      from: 'number',
      to: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsAppstatspageableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmHistoryListKeySetMap[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AlarmHistoryListKeySetMap },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsLogreaderrorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app
  app: string;
  // time
  time: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      app: 'app',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      app: 'string',
      time: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsLogreaderrorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ErrorRealte;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ErrorRealte,
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalreadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cmds
  cmds: UniversalBodyCmd[];
  // rid
  rid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cmds: 'cmds',
      rid: 'rid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cmds: { 'type': 'array', 'itemType': UniversalBodyCmd },
      rid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalreadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalwriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cmds
  cmds: UniversalBodyCmd[];
  // rid
  rid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cmds: 'cmds',
      rid: 'rid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cmds: { 'type': 'array', 'itemType': UniversalBodyCmd },
      rid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalwriteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: boolean;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: boolean;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: boolean;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: boolean;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: boolean;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'boolean',
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginbytypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginbytypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: PluginModelDO[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': PluginModelDO },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginbyfolderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginbyfolderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ModelTreeNode[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ModelTreeNode },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: PluginModelDO;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: PluginModelDO,
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPlugintestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // body
  body: string;
  // file_id
  fileId: number;
  // id
  id: number;
  // outside_bizdomain
  outsideBizdomain: string;
  // plugin_id
  pluginId: number;
  // table
  table: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
      fileId: 'file_id',
      id: 'id',
      outsideBizdomain: 'outside_bizdomain',
      pluginId: 'plugin_id',
      table: 'table',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
      fileId: 'number',
      id: 'number',
      outsideBizdomain: 'string',
      pluginId: 'number',
      table: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPlugintestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Threshold;
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: Threshold,
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPathRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // requests
  requests: FolderRequestCmd[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requests: 'requests',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requests: { 'type': 'array', 'itemType': FolderRequestCmd },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsPathResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: FolderPaths[];
  // error_code
  errorCode?: string;
  // rid
  rid?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorCode: 'error_code',
      rid: 'rid',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': FolderPaths },
      errorCode: 'string',
      rid: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRmsUniversalcleankeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // req_params
  reqParams: KeySet[];
  // tenant_id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      reqParams: 'req_params',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      reqParams: { 'type': 'array', 'itemType': KeySet },
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRmsUniversalcleankeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // error_message
  errorMessage?: CallErrorMessage;
  // part_suc
  partSuc?: boolean;
  // result
  result?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorMessage: 'error_message',
      partSuc: 'part_suc',
      result: 'result',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorMessage: CallErrorMessage,
      partSuc: 'boolean',
      result: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // post_body
  postBody: string;
  // tenant_id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      postBody: 'post_body',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      postBody: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsUniversalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
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

export class QueryRmsTracespanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
  app?: string;
  // 最大的毫秒开始时间戳
  endTime?: number;
  // 万能扩展字段
  extensions?: KeySet[];
  // 最大毫秒耗时
  maxDuration?: number;
  // 最小毫秒耗时
  minDuration?: number;
  // 分页号
  pageNumber?: number;
  // 分页大小
  pageSize?: number;
  // 搜索的毫秒开始时间戳
  startTime?: number;
  // 结果码
  status?: string;
  // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
  tags?: KeySet[];
  // 按traceId搜索时会用到 此时其他条件自动失效
  traceId?: string;
  // workspace_id
  workspaceId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      app: 'app',
      endTime: 'end_time',
      extensions: 'extensions',
      maxDuration: 'max_duration',
      minDuration: 'min_duration',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      startTime: 'start_time',
      status: 'status',
      tags: 'tags',
      traceId: 'trace_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      app: 'string',
      endTime: 'number',
      extensions: { 'type': 'array', 'itemType': KeySet },
      maxDuration: 'number',
      minDuration: 'number',
      pageNumber: 'number',
      pageSize: 'number',
      startTime: 'number',
      status: 'string',
      tags: { 'type': 'array', 'itemType': KeySet },
      traceId: 'string',
      workspaceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRmsTracespanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页号
  pageNumber?: number;
  // 分页大小
  pageSize?: number;
  // 搜索出的spans, 查无结果时为空数组
  spans?: TraceSpan[];
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      spans: 'spans',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      spans: { 'type': 'array', 'itemType': TraceSpan },
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRmsTracespanqueryconfigRequest extends $tea.Model {
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

export class GetRmsTracespanqueryconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支持的tags列表
  tagConfigs?: TraceSpanSearchTagConfig[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tagConfigs: 'tag_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tagConfigs: { 'type': 'array', 'itemType': TraceSpanSearchTagConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTracetreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // trace_id
  traceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTracetreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 树状图结构体
  // 找不到数据时 trace_tree_items 为空数组, 并不会报错
  traceTreeItems?: TraceTreeItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceTreeItems: 'trace_tree_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceTreeItems: { 'type': 'array', 'itemType': TraceTreeItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiCompletecommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 南天门的请求体都是做成json字符串放在data字段里
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiCompletecommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiPayordercallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiPayordercallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiCompleteorderparamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // data
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiCompleteorderparamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // data
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // data
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiLifecycleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // data
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSpiLifecycleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // a synchro
  synchro?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      synchro: 'synchro',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      synchro: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTimeseriesmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // sum或none
  aggregator: string;
  // 结束毫秒时间戳
  endTime: number;
  // metrics字段名称
  metrics: StringValue[];
  // 开始毫秒时间戳
  startTime: number;
  // 扩展字段tags
  tags?: KeyValuePair[];
  // metrics类型
  type: string;
  // workspace_id或workspace_name选填一个
  workspaceId?: number;
  // workspace_id或workspace_name选填一个
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      aggregator: 'aggregator',
      endTime: 'end_time',
      metrics: 'metrics',
      startTime: 'start_time',
      tags: 'tags',
      type: 'type',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      aggregator: 'string',
      endTime: 'number',
      metrics: { 'type': 'array', 'itemType': StringValue },
      startTime: 'number',
      tags: { 'type': 'array', 'itemType': KeyValuePair },
      type: 'string',
      workspaceId: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTimeseriesmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // metrics reulsts
  results?: TimeSeriesMetrics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      results: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTopologyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 结束毫秒时间戳
  endTime?: number;
  // 开始毫秒时间戳
  startTime?: number;
  // workspace_id或workspace_name二选一
  workspaceId?: number;
  // workspace_id或workspace_name二选一
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      endTime: 'end_time',
      startTime: 'start_time',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      endTime: 'number',
      startTime: 'number',
      workspaceId: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRmsTopologyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拓扑节点
  nodes?: TopologyNode[];
  // 拓扑边
  edges?: TopologyEdge[];
  // 节点性能指标
  nodeMetrics?: TimeSeriesMetrics[];
  // 边性能指标
  edgeMetrics?: TimeSeriesMetrics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodes: 'nodes',
      edges: 'edges',
      nodeMetrics: 'node_metrics',
      edgeMetrics: 'edge_metrics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodes: { 'type': 'array', 'itemType': TopologyNode },
      edges: { 'type': 'array', 'itemType': TopologyEdge },
      nodeMetrics: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      edgeMetrics: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // 插件类型
  plugin: string;
  // 监控指标 ID
  dsId: string;
  // contentType
  contentType?: string;
  // 工作空间
  workspaceName: string;
  // //采集频率
  periodType?: string;
  // 查询目标列
  fields?: string[];
  // 查询条件
  where?: KeySet[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      start: 'start',
      end: 'end',
      plugin: 'plugin',
      dsId: 'ds_id',
      contentType: 'content_type',
      workspaceName: 'workspace_name',
      periodType: 'period_type',
      fields: 'fields',
      where: 'where',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      start: 'number',
      end: 'number',
      plugin: 'string',
      dsId: 'string',
      contentType: 'string',
      workspaceName: 'string',
      periodType: 'string',
      fields: { 'type': 'array', 'itemType': 'string' },
      where: { 'type': 'array', 'itemType': KeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询数据结果
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

export class QueryTraceSpanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 搜索的毫秒开始时间戳
  startTime: number;
  // 最大的毫秒开始时间戳
  endTime: number;
  // 按traceId搜索时会用到 此时其他条件自动失效
  traceId?: string;
  // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
  app?: string;
  // 最小毫秒耗时
  minDuration?: number;
  // 最大毫秒耗时
  maxDuration?: number;
  // 分页号
  currentPage?: number;
  // 每页记录条数
  pageSize?: number;
  // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
  tags?: KeySet[];
  // 总页数，小于0或不填代表第一次查询，用来获取总页数
  totalPage?: number;
  // 总数，小于0或不填代表第一次查询，用来获取总数
  totalSize?: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 传递需要过滤的字段
  filter?: TraceQuerySummary;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      startTime: 'start_time',
      endTime: 'end_time',
      traceId: 'trace_id',
      app: 'app',
      minDuration: 'min_duration',
      maxDuration: 'max_duration',
      currentPage: 'current_page',
      pageSize: 'page_size',
      tags: 'tags',
      totalPage: 'total_page',
      totalSize: 'total_size',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      filter: 'filter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      startTime: 'number',
      endTime: 'number',
      traceId: 'string',
      app: 'string',
      minDuration: 'number',
      maxDuration: 'number',
      currentPage: 'number',
      pageSize: 'number',
      tags: { 'type': 'array', 'itemType': KeySet },
      totalPage: 'number',
      totalSize: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      filter: TraceQuerySummary,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceSpanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  // 搜索出的spans, 查无结果时为空数组
  spans?: TraceSpan[];
  // 链路查询结果的关键字段取值集
  summary?: TraceQuerySummary;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
      spans: 'spans',
      summary: 'summary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
      spans: { 'type': 'array', 'itemType': TraceSpan },
      summary: TraceQuerySummary,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppNameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实际SQL查询时LIMIT的第一个字段
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppNameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名称列表
  appNames?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appNames: 'app_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 自定义监控指标详细信息 (嵌套对象)
  customPlugin: CustomPluginDO;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      customPlugin: 'custom_plugin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      customPlugin: CustomPluginDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustompluginResponse extends $tea.Model {
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

export class DeleteCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 监控产品类型
  pluginType: string;
  // id
  id: number;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pluginType: 'plugin_type',
      id: 'id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pluginType: 'string',
      id: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCustompluginResponse extends $tea.Model {
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

export class CreateFolderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 文件夹名称
  name: string;
  // 父级文件夹id
  parentFolderId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      name: 'name',
      parentFolderId: 'parent_folder_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      name: 'string',
      parentFolderId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFolderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件夹 ID
  folderId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      folderId: 'folder_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      folderId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFolderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文件夹id
  id: number;
  // 文件夹新名称
  name: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      name: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFolderResponse extends $tea.Model {
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

export class QueryTraceConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链路配置
  tags?: TraceSpanSearchTagConfig[];
  // 链路搜索的大类
  categories?: string[];
  // 数据库配置
  dbconfigs?: TraceSpanSearchDbConfig[];
  // 消息队列的kind取值范围
  mqkinds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tags: 'tags',
      categories: 'categories',
      dbconfigs: 'dbconfigs',
      mqkinds: 'mqkinds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tags: { 'type': 'array', 'itemType': TraceSpanSearchTagConfig },
      categories: { 'type': 'array', 'itemType': 'string' },
      dbconfigs: { 'type': 'array', 'itemType': TraceSpanSearchDbConfig },
      mqkinds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFolderPathRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 自定义监控 ID 
  customPluginId?: number;
  // 文件夹 ID
  folderId: number;
  // 是否包含插件名
  includePluginName: boolean;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customPluginId: 'custom_plugin_id',
      folderId: 'folder_id',
      includePluginName: 'include_plugin_name',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customPluginId: 'number',
      folderId: 'number',
      includePluginName: 'boolean',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFolderPathResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件夹路径
  paths?: FolderPath[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paths: 'paths',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paths: { 'type': 'array', 'itemType': FolderPath },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // traceId
  traceId: string;
  // 备选的入口ip
  backupEntryip?: string;
  // 是否为第一次查询
  firstQuery: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      traceId: 'trace_id',
      backupEntryip: 'backup_entryip',
      firstQuery: 'first_query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      traceId: 'string',
      backupEntryip: 'string',
      firstQuery: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 节点
  items?: TraceTreeItem[];
  // 描述整体链路的额外信息，比span总数，应用总数之类的
  attributes?: KeySet[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      items: 'items',
      attributes: 'attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      items: { 'type': 'array', 'itemType': TraceTreeItem },
      attributes: { 'type': 'array', 'itemType': KeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceTopologyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // trace_id
  traceId?: string;
  // app
  app?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      startTime: 'start_time',
      endTime: 'end_time',
      traceId: 'trace_id',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      startTime: 'number',
      endTime: 'number',
      traceId: 'string',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceTopologyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拓扑节点
  nodes?: TopologyNode[];
  // 拓扑边
  edges?: TopologyEdge[];
  // 节点性能指标
  nodeMetrics?: TimeSeriesMetrics[];
  // 边性能指标
  edgeMetrics?: TimeSeriesMetrics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodes: 'nodes',
      edges: 'edges',
      nodeMetrics: 'node_metrics',
      edgeMetrics: 'edge_metrics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodes: { 'type': 'array', 'itemType': TopologyNode },
      edges: { 'type': 'array', 'itemType': TopologyEdge },
      nodeMetrics: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      edgeMetrics: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceMetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // sum或none
  aggregator: string;
  // 结束毫秒时间戳
  endTime: number;
  // 开始毫秒时间戳
  startTime: number;
  // metrics字段名称
  metrics: string[];
  // 扩展字段tags
  tags?: KeyValuePair[];
  // metrics类型
  type: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      aggregator: 'aggregator',
      endTime: 'end_time',
      startTime: 'start_time',
      metrics: 'metrics',
      tags: 'tags',
      type: 'type',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      aggregator: 'string',
      endTime: 'number',
      startTime: 'number',
      metrics: { 'type': 'array', 'itemType': 'string' },
      tags: { 'type': 'array', 'itemType': KeyValuePair },
      type: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceMetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // metrics reulsts
  result?: TimeSeriesMetrics;
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
      result: TimeSeriesMetrics,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 自定义监控指标 ID
  id: number;
  // 类型
  pluginType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
      pluginType: 'plugin_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
      pluginType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCustompluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 自定义监控指标详情
  customPlugin?: CustomPluginDO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customPlugin: 'custom_plugin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customPlugin: CustomPluginDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 应用名称模糊搜索
  keyword?: string;
  // 应用名称列表 
  appNames?: string[];
  // 为true时表示查询我的应用
  onlyMine?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      currentPage: 'current_page',
      pageSize: 'page_size',
      keyword: 'keyword',
      appNames: 'app_names',
      onlyMine: 'only_mine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      currentPage: 'number',
      pageSize: 'number',
      keyword: 'string',
      appNames: { 'type': 'array', 'itemType': 'string' },
      onlyMine: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用列表
  apps?: MonitorApp[];
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': MonitorApp },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserFavoriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 收藏资源类型
  resourceType: string;
  //  收藏资源 ID
  resourceId: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      resourceType: 'string',
      resourceId: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserFavoriteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否收藏
  status?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFolderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 父目录 ID
  parentFolderId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      parentFolderId: 'parent_folder_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      parentFolderId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFolderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件夹列表
  folders?: FolderDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      folders: 'folders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      folders: { 'type': 'array', 'itemType': FolderDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 父级文件夹 ID
  parentFolderId: number;
  // 插件类型
  pluginType?: string;
  // 当前页码
  currentPage?: number;
  // 每页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      parentFolderId: 'parent_folder_id',
      pluginType: 'plugin_type',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      parentFolderId: 'number',
      pluginType: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustompluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 自定义指标监控配置列表
  customPlugins?: CustomPluginDO[];
  // 页面大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customPlugins: 'custom_plugins',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customPlugins: { 'type': 'array', 'itemType': CustomPluginDO },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserFavoriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 收藏资源 ID 列表
  resourceIds: string[];
  // 收藏资源类型
  resourceType: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      resourceIds: 'resource_ids',
      resourceType: 'resource_type',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      resourceIds: { 'type': 'array', 'itemType': 'string' },
      resourceType: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserFavoriteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户收藏的资源列表
  favorites?: UserFavoriteVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      favorites: 'favorites',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      favorites: { 'type': 'array', 'itemType': UserFavoriteVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmPauseRequest extends $tea.Model {
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

export class QueryAlarmPauseResponse extends $tea.Model {
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

export class CountAlarmAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始时间 - 时间戳
  start: number;
  // 结束时间 - 时间戳
  end: number;
  // 应用名称模糊搜索
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAlarmAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警应用
  alarmApps?: AlarmAppStats[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmApps: 'alarm_apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmApps: { 'type': 'array', 'itemType': AlarmAppStats },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmApprelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始时间 - 时间戳
  from: number;
  // 结束时间 - 时间戳
  to: number;
  // 应用名称
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      from: 'from',
      to: 'to',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      from: 'number',
      to: 'number',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmApprelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警应用关联信息
  result?: AlarmHistoryListKeySetMap[];
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
      result: { 'type': 'array', 'itemType': AlarmHistoryListKeySetMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryStackGeneratedconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名列表
  appNames?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appNames: 'app_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryStackGeneratedconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 技术栈配置列表
  generatedConfigs?: StackGeneratedConfig[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      generatedConfigs: 'generated_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      generatedConfigs: { 'type': 'array', 'itemType': StackGeneratedConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 大盘类型：MINE(我的大盘)、CORE(关键大盘)
  dashboardType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      dashboardType: 'dashboard_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      dashboardType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大盘列表
  dashboards?: PluginModelDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dashboards: 'dashboards',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dashboards: { 'type': 'array', 'itemType': PluginModelDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackGeneratedconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 栈实体对象复合ID
  stackUniversalTableId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      stackUniversalTableId: 'stack_universal_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      stackUniversalTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackGeneratedconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 栈配置列表
  generatedConfigs?: StackGeneratedConfig[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      generatedConfigs: 'generated_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      generatedConfigs: { 'type': 'array', 'itemType': StackGeneratedConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackMonitoritemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 技术栈 ID
  stackId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      stackId: 'stack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      stackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackMonitoritemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监控项列表
  monitorItems?: StackMonitorItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorItems: 'monitor_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorItems: { 'type': 'array', 'itemType': StackMonitorItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 联系人登录名称数组
  userLoginNames?: string;
  // 页面大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 通知组名称
  keyword?: string;
  // 是否只查询当前操作者的
  onlyCurrentStaff?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      userLoginNames: 'user_login_names',
      pageSize: 'page_size',
      currentPage: 'current_page',
      keyword: 'keyword',
      onlyCurrentStaff: 'only_current_staff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      userLoginNames: 'string',
      pageSize: 'number',
      currentPage: 'number',
      keyword: 'string',
      onlyCurrentStaff: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsergroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知组列表
  userGroups?: UserGroup[];
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userGroups: 'user_groups',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userGroups: { 'type': 'array', 'itemType': UserGroup },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUsergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 通知组名称
  name: string;
  // 钉钉机器人token数组
  dingtalkWebhooks?: string[];
  // 联系人登录名称数组
  userLoginNames?: string[];
  // 0、当前workspace有效；
  // 1、当前租户有效
  validScope?: number;
  // 钉钉机器人
  dingDingRobots?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      name: 'name',
      dingtalkWebhooks: 'dingtalk_webhooks',
      userLoginNames: 'user_login_names',
      validScope: 'valid_scope',
      dingDingRobots: 'ding_ding_robots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      name: 'string',
      dingtalkWebhooks: { 'type': 'array', 'itemType': 'string' },
      userLoginNames: { 'type': 'array', 'itemType': 'string' },
      validScope: 'number',
      dingDingRobots: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUsergroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知组 ID
  groupId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      groupId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUsergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 通知组 ID
  id: number;
  // 通知组名称
  name: string;
  // 钉钉机器人token数组
  dingtalkWebhooks?: string[];
  // 联系人登录名称数组
  userLoginNames?: string[];
  // 全局订阅
  scopeGlobal?: boolean;
  // 0、当前workspace有效；
  // 1、租户有效；
  validScope?: number;
  // 钉钉机器人
  dingDingRobots?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
      name: 'name',
      dingtalkWebhooks: 'dingtalk_webhooks',
      userLoginNames: 'user_login_names',
      scopeGlobal: 'scope_global',
      validScope: 'valid_scope',
      dingDingRobots: 'ding_ding_robots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
      name: 'string',
      dingtalkWebhooks: { 'type': 'array', 'itemType': 'string' },
      userLoginNames: { 'type': 'array', 'itemType': 'string' },
      scopeGlobal: 'boolean',
      validScope: 'number',
      dingDingRobots: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUsergroupResponse extends $tea.Model {
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

export class DeleteUsergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 通知组 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUsergroupResponse extends $tea.Model {
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

export class QueryAlarmTrendRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // 告警类型 (固定传入自定义、应用、应用组3个告警类型)
  alarmTypes: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      alarmTypes: 'alarm_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      alarmTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmTrendResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: AlarmCountInfoKeySet[];
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
      data: { 'type': 'array', 'itemType': AlarmCountInfoKeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // 是否查询所有告警类型
  allTypes: boolean;
  // 告警类型数组
  alarmTypes?: string[];
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // dsid
  dsid?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      allTypes: 'all_types',
      alarmTypes: 'alarm_types',
      currentPage: 'current_page',
      pageSize: 'page_size',
      dsid: 'dsid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      allTypes: 'boolean',
      alarmTypes: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      pageSize: 'number',
      dsid: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警历史数组
  alarmHistorys?: AlarmHistory[];
  // 总记录数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmHistorys: 'alarm_historys',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmHistorys: { 'type': 'array', 'itemType': AlarmHistory },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 是否只查询我的订阅
  onlyMine?: boolean;
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      onlyMine: 'only_mine',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      onlyMine: 'boolean',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmSubscriptionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警订阅数组
  alarmSubscriptions?: AlarmSubDTO[];
  // 总记录数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmSubscriptions: 'alarm_subscriptions',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmSubscriptions: { 'type': 'array', 'itemType': AlarmSubDTO },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackAlarmruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 栈实体对象复合ID
  stackUniversalTableId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      stackUniversalTableId: 'stack_universal_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      stackUniversalTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStackAlarmruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警套餐配置数组
  alarmRules?: StackAlarmRule[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmRules: 'alarm_rules',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmRules: { 'type': 'array', 'itemType': StackAlarmRule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 自定义监控指标详细信息 (嵌套对象)
  customPlugin: CustomPluginDO;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      customPlugin: 'custom_plugin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      customPlugin: CustomPluginDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCustompluginResponse extends $tea.Model {
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

export class QueryAgentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 每页大小
  pageSize?: number;
  // 当前页码
  currentPage?: number;
  // agent部署类型：容器CONTAINER、经典MACHINE
  deployType?: string;
  // 模糊搜索关键字
  keyword?: string;
  // app 模糊搜索关键字
  appKeyword?: string;
  // 服务 IP 模糊搜索关键字
  serviceIpKeyword?: string;
  // 主机 IP 模糊搜索关键字
  hostIpKeyword?: string;
  // agent 状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      pageSize: 'page_size',
      currentPage: 'current_page',
      deployType: 'deploy_type',
      keyword: 'keyword',
      appKeyword: 'app_keyword',
      serviceIpKeyword: 'service_ip_keyword',
      hostIpKeyword: 'host_ip_keyword',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      pageSize: 'number',
      currentPage: 'number',
      deployType: 'string',
      keyword: 'string',
      appKeyword: 'string',
      serviceIpKeyword: 'string',
      hostIpKeyword: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // agent 实例列表
  agentInstances?: AgentInstance[];
  // agent 实例总数
  totalCount?: number;
  // 每页大小
  pageSize?: number;
  // 当前页码
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agentInstances: 'agent_instances',
      totalCount: 'total_count',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agentInstances: { 'type': 'array', 'itemType': AgentInstance },
      totalCount: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InstallAgentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 需要安装 agent 的目标列表
  collectIds?: string[];
  // 0 容器，1经典
  type?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      collectIds: 'collect_ids',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      collectIds: { 'type': 'array', 'itemType': 'string' },
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InstallAgentResponse extends $tea.Model {
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

export class GetAgentVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // agent 机器对应的唯一标识
  collectId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      collectId: 'collect_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      collectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAgentVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // agent版本信息
  agentVersion?: AgentVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agentVersion: 'agent_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agentVersion: AgentVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableAgentVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // agent版本号
  agentVersion: string;
  // agent存储url
  agentUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      agentVersion: 'agent_version',
      agentUrl: 'agent_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      agentVersion: 'string',
      agentUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableAgentVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本信息
  agentVersion?: AgentVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agentVersion: 'agent_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agentVersion: AgentVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间
  workspace?: Workspace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: Workspace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantRequest extends $tea.Model {
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

export class GetTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户
  tenant?: Tenant;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: Tenant,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKernelstackGeneratedconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 不带租户id和workspaceId的universalTableId后缀
  simpleTableId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      simpleTableId: 'simple_table_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      simpleTableId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKernelstackGeneratedconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 栈配置列表
  generatedConfigs?: StackGeneratedConfig[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      generatedConfigs: 'generated_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      generatedConfigs: { 'type': 'array', 'itemType': StackGeneratedConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAliyunStatusRequest extends $tea.Model {
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

export class GetAliyunStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 阿里云开通状态
  status?: AliyunOpenState;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: AliyunOpenState,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 工作空间展示名称
  workspaceDisplayName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      workspaceDisplayName: 'workspace_display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      workspaceDisplayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间信息
  workspace?: Workspace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: Workspace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStackGeneratedconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 待修改的技术栈配置
  generatedConfig: StackGeneratedConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      generatedConfig: 'generated_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      generatedConfig: StackGeneratedConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStackGeneratedconfigResponse extends $tea.Model {
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

export class QueryUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 用户名(支持模糊搜索)
  keyword: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      keyword: 'keyword',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      keyword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户列表
  users?: MonitorUserDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      users: 'users',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      users: { 'type': 'array', 'itemType': MonitorUserDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 权限码
  auth: string;
  // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
  resourceType: string;
  // 资源ID列表
  resourceIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      auth: 'auth',
      resourceType: 'resource_type',
      resourceIds: 'resource_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      auth: 'string',
      resourceType: 'string',
      resourceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权限列表
  data?: AuthDO[];
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
      data: { 'type': 'array', 'itemType': AuthDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 待删除的权限ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAuthResponse extends $tea.Model {
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

export class CreateAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 权限码
  auth: string;
  // 用户名列表
  userNames: string[];
  // 权限的资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
  resourceType: string;
  // 权限对应的资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      auth: 'auth',
      userNames: 'user_names',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      auth: 'string',
      userNames: { 'type': 'array', 'itemType': 'string' },
      resourceType: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAuthResponse extends $tea.Model {
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

export class BatchcreateUserFavoriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 收藏资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
  resourceType: string;
  // 收藏资源ID列表，需要是相同类型下的ID (如果是自定义监控或文件夹，为数值类型，如果是用户应用，是复杂组合字符串)
  resourceIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      resourceType: 'resource_type',
      resourceIds: 'resource_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      resourceType: 'string',
      resourceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUserFavoriteResponse extends $tea.Model {
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

export class BatchdeleteUserFavoriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 资源类型
  resourceType: string;
  // 已收藏资源ID列表（文件夹，传入文件夹ID；自定义监控，传入自定义监控ID；应用，传入universal_table_id）
  resourceIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      resourceType: 'resource_type',
      resourceIds: 'resource_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      resourceType: 'string',
      resourceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteUserFavoriteResponse extends $tea.Model {
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

export class QueryUserOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // 表名
  tableName: string;
  // 表实体对应ID
  tableEntityId: number;
  // 页面大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      tableName: 'table_name',
      tableEntityId: 'table_entity_id',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      tableName: 'string',
      tableEntityId: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作日志列表
  operations?: UserOplogDO[];
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operations: 'operations',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operations: { 'type': 'array', 'itemType': UserOplogDO },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 告警等级 (-1表示全部订阅)
  alarmLevel: number;
  // 是否开启通知降频 (0 - 关闭，1 - 开启)
  notifyReduceSwitch: number;
  // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
  resourceType: string;
  // 资源 ID
  resourceId: string;
  // 用户登录名列表
  userLoginNames?: string[];
  // 用户组 ID列表
  userGroupIds?: number[];
  // http web hook id列表
  alarmWebHookIds?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      alarmLevel: 'alarm_level',
      notifyReduceSwitch: 'notify_reduce_switch',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
      userLoginNames: 'user_login_names',
      userGroupIds: 'user_group_ids',
      alarmWebHookIds: 'alarm_web_hook_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      alarmLevel: 'number',
      notifyReduceSwitch: 'number',
      resourceType: 'string',
      resourceId: 'string',
      userLoginNames: { 'type': 'array', 'itemType': 'string' },
      userGroupIds: { 'type': 'array', 'itemType': 'number' },
      alarmWebHookIds: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmSubscriptionResponse extends $tea.Model {
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

export class DeleteAlarmSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 待删除的告警订阅 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAlarmSubscriptionResponse extends $tea.Model {
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

export class PauseAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 告警暂停开始时间
  start: number;
  // 告警暂停结束时间
  end: number;
  // 告警关闭原因
  reason: string;
  // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
  resourceType: string;
  // 资源 ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      reason: 'reason',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      reason: 'string',
      resourceType: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseAlarmResponse extends $tea.Model {
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

export class ResumeAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 待恢复的告警 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeAlarmResponse extends $tea.Model {
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

export class GetLogTailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 应用名
  appName: string;
  // the preferHost
  preferHost?: string;
  // 日志完整路径
  fullPath?: string;
  // 扫描路径
  scanDirs?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      preferHost: 'prefer_host',
      fullPath: 'full_path',
      scanDirs: 'scan_dirs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      preferHost: 'string',
      fullPath: 'string',
      scanDirs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLogTailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回对象
  logTail?: LogTail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logTail: 'log_tail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logTail: LogTail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLogBrowserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 扫描根目录
  scanDirs: string[];
  // preferHost
  preferHost?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      scanDirs: 'scan_dirs',
      preferHost: 'prefer_host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      scanDirs: { 'type': 'array', 'itemType': 'string' },
      preferHost: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLogBrowserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果，JSON String
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

export class DeleteFolderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 主键 ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFolderResponse extends $tea.Model {
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

export class GetAppOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 查询截止时间，unix timestamp in ms
  endTime: number;
  // 查询开始时间，unix timestamp in ms
  startTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      endTime: 'end_time',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      endTime: 'number',
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: AppOverviewDTO;
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
      data: AppOverviewDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // 当前页码
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 应用 / 主机
  alarmTargetType?: string;
  // 告警对象
  alarmTarget?: string;
  // 告警级别
  alarmLevel?: number;
  // 触发状态
  status?: number;
  // 根据应用过滤告警历史
  alarmStackInfo?: AlarmStackInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
      currentPage: 'current_page',
      pageSize: 'page_size',
      alarmTargetType: 'alarm_target_type',
      alarmTarget: 'alarm_target',
      alarmLevel: 'alarm_level',
      status: 'status',
      alarmStackInfo: 'alarm_stack_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
      currentPage: 'number',
      pageSize: 'number',
      alarmTargetType: 'string',
      alarmTarget: 'string',
      alarmLevel: 'number',
      status: 'number',
      alarmStackInfo: AlarmStackInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警历史列表
  alarmHistories?: UnifiedAlarmHistoryVO[];
  // 总数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 每页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmHistories: 'alarm_histories',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmHistories: { 'type': 'array', 'itemType': UnifiedAlarmHistoryVO },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAlarmTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 告警规则的唯一名称
  alarmUniqueName: string;
  // 类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      alarmUniqueName: 'alarm_unique_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      alarmUniqueName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAlarmTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据结果
  result?: string;
  // 测试
  alarmContext?: AlarmTest[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      alarmContext: 'alarm_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
      alarmContext: { 'type': 'array', 'itemType': AlarmTest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmwebhookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // createOrModifyByMe
  createOrModifyByMe: boolean;
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // webhook名称
  name?: string;
  // 修改人
  modifier?: string;
  // ID列表
  ids?: number[];
  // 是否只查询当前操作者的
  onlyCurrentStaff?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      createOrModifyByMe: 'create_or_modify_by_me',
      currentPage: 'current_page',
      pageSize: 'page_size',
      name: 'name',
      modifier: 'modifier',
      ids: 'ids',
      onlyCurrentStaff: 'only_current_staff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      createOrModifyByMe: 'boolean',
      currentPage: 'number',
      pageSize: 'number',
      name: 'string',
      modifier: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
      onlyCurrentStaff: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmwebhookResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // webhook列表
  webHooks?: AlarmWebHook[];
  // 当前页
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      webHooks: 'web_hooks',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      webHooks: { 'type': 'array', 'itemType': AlarmWebHook },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警规则名称
  name: string;
  // 标识符 区分规则是自定义规则还是pql规则
  category: string;
  // 规则配置
  ruleConfig: string;
  // 指标无数据触发告警 这是个开关 1表示打开 0表示闭合
  alarmNodata: number;
  // 告警等级
  level: number;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 触发周期
  pendingHit: number;
  // 恢复周期
  recoveredHit: number;
  // 检测频率
  step: number;
  // 通知渠道
  channels: string[];
  // 通知对象
  notifyTarget?: UnifiedAlarmSubDTO[];
  // 静默时间
  silenceTime: number;
  // 告警触发时通知 1:勾选 0:不勾选
  notifyFiring: number;
  // 告警恢复时通知 1:勾选 0:不勾选
  notifyRecovered: number;
  // 告警无数据时通知 1:勾选 0:不勾选
  notifyNodata: number;
  // 通知时间
  notifyTimeFilter?: TimeFilter;
  // 工作区名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      alarmNodata: 'alarm_nodata',
      level: 'level',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      step: 'step',
      channels: 'channels',
      notifyTarget: 'notify_target',
      silenceTime: 'silence_time',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyNodata: 'notify_nodata',
      notifyTimeFilter: 'notify_time_filter',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      alarmNodata: 'number',
      level: 'number',
      emergency: 'string',
      emergencyUrl: 'string',
      pendingHit: 'number',
      recoveredHit: 'number',
      step: 'number',
      channels: { 'type': 'array', 'itemType': 'string' },
      notifyTarget: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
      silenceTime: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyNodata: 'number',
      notifyTimeFilter: TimeFilter,
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedalarmRuleResponse extends $tea.Model {
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

export class UpdateUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主键
  id: number;
  // 规则名称
  name: string;
  // 规则分类
  category: string;
  // 规则配置
  ruleConfig: string;
  // 指标无数据时触发告警
  alarmNodata: number;
  // 告警等级
  level: number;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 触发周期
  pendingHit: number;
  // 恢复周期
  recoveredHit: number;
  // 检测频率
  step: number;
  // 通知渠道 
  channels: string[];
  // 通知对象
  notifyTarget?: UnifiedAlarmSubDTO[];
  // 静默时间
  silenceTime: number;
  // 告警触发时通知 
  notifyFiring: number;
  // 告警恢复时通知
  notifyRecovered: number;
  // 告警无数据时通知
  notifyNodata: number;
  // 通知时间
  notifyTimeFilter?: TimeFilter;
  // 启停状态
  status?: string;
  // 暂停开始时间
  suspendedStartTime?: number;
  // 告警结束时间
  suspendedEndTime?: number;
  // 暂停原因
  suspendedReason?: string;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      alarmNodata: 'alarm_nodata',
      level: 'level',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      step: 'step',
      channels: 'channels',
      notifyTarget: 'notify_target',
      silenceTime: 'silence_time',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyNodata: 'notify_nodata',
      notifyTimeFilter: 'notify_time_filter',
      status: 'status',
      suspendedStartTime: 'suspended_start_time',
      suspendedEndTime: 'suspended_end_time',
      suspendedReason: 'suspended_reason',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      alarmNodata: 'number',
      level: 'number',
      emergency: 'string',
      emergencyUrl: 'string',
      pendingHit: 'number',
      recoveredHit: 'number',
      step: 'number',
      channels: { 'type': 'array', 'itemType': 'string' },
      notifyTarget: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
      silenceTime: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyNodata: 'number',
      notifyTimeFilter: TimeFilter,
      status: 'string',
      suspendedStartTime: 'number',
      suspendedEndTime: 'number',
      suspendedReason: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUnifiedalarmRuleResponse extends $tea.Model {
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

export class QueryUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警规则名称模糊搜索
  keyword?: string;
  // 告警等级
  level?: number;
  // 告警对象
  alarmTarget?: AlarmTarget;
  // 启停状态
  ruleStatus?: number;
  // 告警状态
  alarmStatus?: number;
  // 只看我
  onlyMe?: boolean;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 工作区名
  workspaceName: string;
  // 告警规则id
  ruleId?: number;
  // 告警唯一标识
  ruleUniqueIdentity?: string;
  // 标识符 区分规则是自定义规则还是pql规则
  category: string;
  //  
  refDatasourceType?: string;
  // 根据用户组过滤
  filterUserGroup?: number;
  // 根据webhook过滤
  filterWebhook?: number;
  // 钉钉机器人过滤
  filterDingRobot?: number;
  // 根据应栈信息对告警规则做过滤
  alarmStackInfo?: AlarmStackInfo;
  // CUSTOM,STACK,HOST
  dataSourceType?: string;
  // 过滤的告警级别
  levels?: number[];
  // 告警事件id
  alarmEventId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      keyword: 'keyword',
      level: 'level',
      alarmTarget: 'alarm_target',
      ruleStatus: 'rule_status',
      alarmStatus: 'alarm_status',
      onlyMe: 'only_me',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspaceName: 'workspace_name',
      ruleId: 'rule_id',
      ruleUniqueIdentity: 'rule_unique_identity',
      category: 'category',
      refDatasourceType: 'ref_datasource_type',
      filterUserGroup: 'filter_user_group',
      filterWebhook: 'filter_webhook',
      filterDingRobot: 'filter_ding_robot',
      alarmStackInfo: 'alarm_stack_info',
      dataSourceType: 'data_source_type',
      levels: 'levels',
      alarmEventId: 'alarm_event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      keyword: 'string',
      level: 'number',
      alarmTarget: AlarmTarget,
      ruleStatus: 'number',
      alarmStatus: 'number',
      onlyMe: 'boolean',
      currentPage: 'number',
      pageSize: 'number',
      workspaceName: 'string',
      ruleId: 'number',
      ruleUniqueIdentity: 'string',
      category: 'string',
      refDatasourceType: 'string',
      filterUserGroup: 'number',
      filterWebhook: 'number',
      filterDingRobot: 'number',
      alarmStackInfo: AlarmStackInfo,
      dataSourceType: 'string',
      levels: { 'type': 'array', 'itemType': 'number' },
      alarmEventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警规则列表
  alarmRules?: UnifiedAlarmRuleVO[];
  // 总记录数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmRules: 'alarm_rules',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmRules: { 'type': 'array', 'itemType': UnifiedAlarmRuleVO },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警规则id
  id: number;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedalarmRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警规则详情
  alarmRule?: UnifiedAlarmRuleVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmRule: 'alarm_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmRule: UnifiedAlarmRuleVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警规则 id
  id: number;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedalarmRuleResponse extends $tea.Model {
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

export class QueryUnifiedalarmNotifyhistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发送状态
  status?: number;
  // 通知渠道
  channel?: string;
  // 通知人id
  subscriber?: string;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 工作区名
  workspaceName: string;
  // 事件id
  eventId?: string;
  // 开始时间
  startTime: number;
  // 结束时间
  endTime: number;
  // 查询告警内容
  keyword?: string;
  // 告警规则 ID
  alarmRuleId?: number;
  // 告警状态
  alarmStatus?: number;
  // 根据应用过滤告警历史
  alarmStackInfo?: AlarmStackInfo;
  // 是否根据通知对象过滤
  alarmSubscribers?: UnifiedAlarmSubDTO[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      status: 'status',
      channel: 'channel',
      subscriber: 'subscriber',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspaceName: 'workspace_name',
      eventId: 'event_id',
      startTime: 'start_time',
      endTime: 'end_time',
      keyword: 'keyword',
      alarmRuleId: 'alarm_rule_id',
      alarmStatus: 'alarm_status',
      alarmStackInfo: 'alarm_stack_info',
      alarmSubscribers: 'alarm_subscribers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      status: 'number',
      channel: 'string',
      subscriber: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspaceName: 'string',
      eventId: 'string',
      startTime: 'number',
      endTime: 'number',
      keyword: 'string',
      alarmRuleId: 'number',
      alarmStatus: 'number',
      alarmStackInfo: AlarmStackInfo,
      alarmSubscribers: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmNotifyhistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总记录数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 响应结果
  alarmNotifyHistories?: UnifiedAlarmNotifyHistoryVO[];
  // 告警通知历史中对应的通知对象
  alarmNotifySubs?: UnifiedAlarmSubDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
      alarmNotifyHistories: 'alarm_notify_histories',
      alarmNotifySubs: 'alarm_notify_subs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
      alarmNotifyHistories: { 'type': 'array', 'itemType': UnifiedAlarmNotifyHistoryVO },
      alarmNotifySubs: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUnifiedalarmSubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 通知对象 可能有多个
  alarmSubs: UnifiedAlarmSubDTO[];
  // 告警规则id集合
  alarmRuleIds?: number[];
  // 是否全部订阅
  subAll?: boolean;
  // 工作区名
  workspaceName: string;
  // 订阅成员是新增吗？新增时，不做旧的订阅关系做覆盖
  isAppend?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alarmSubs: 'alarm_subs',
      alarmRuleIds: 'alarm_rule_ids',
      subAll: 'sub_all',
      workspaceName: 'workspace_name',
      isAppend: 'is_append',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alarmSubs: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
      alarmRuleIds: { 'type': 'array', 'itemType': 'number' },
      subAll: 'boolean',
      workspaceName: 'string',
      isAppend: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUnifiedalarmSubResponse extends $tea.Model {
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

export class DeleteUnifiedalarmSubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 通知对象 可能为多个
  alarmSub: UnifiedAlarmSubDTO;
  // 规则id集合
  ruleId: number;
  // 工作区名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alarmSub: 'alarm_sub',
      ruleId: 'rule_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alarmSub: UnifiedAlarmSubDTO,
      ruleId: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedalarmSubResponse extends $tea.Model {
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

export class QueryUnifiedalarmSubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 通知人
  subscriber?: string;
  // 通知人的类型
  subscriberType?: string;
  // 是否包含我 
  onlyMe?: boolean;
  // 工作区名
  workspaceName: string;
  // 规则id 
  alarmRuleId?: number;
  // 模板id
  alarmTplId?: number;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 订阅人来源
  subscriberSource?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      subscriber: 'subscriber',
      subscriberType: 'subscriber_type',
      onlyMe: 'only_me',
      workspaceName: 'workspace_name',
      alarmRuleId: 'alarm_rule_id',
      alarmTplId: 'alarm_tpl_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      subscriberSource: 'subscriber_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      subscriber: 'string',
      subscriberType: 'string',
      onlyMe: 'boolean',
      workspaceName: 'string',
      alarmRuleId: 'number',
      alarmTplId: 'number',
      currentPage: 'number',
      pageSize: 'number',
      subscriberSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmSubResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警订阅关系列表
  alarmSubs?: UnifiedAlarmSubVO[];
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmSubs: 'alarm_subs',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmSubs: { 'type': 'array', 'itemType': UnifiedAlarmSubVO },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedalarmTplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板名称
  name: string;
  // 区分自定义还是pql
  category: string;
  // 规则配置
  ruleConfig: string;
  // 告警等级
  level: number;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 触发周期
  pendingHit: number;
  // 恢复周期
  recoveredHit: number;
  // 检测频率
  step: number;
  // 通知渠道
  channels: string[];
  // 通知对象
  alarmSubs?: UnifiedAlarmSubDTO[];
  // 静默期
  silenceTime: number;
  // 告警触发时通知
  notifyFiring: number;
  // 告警恢复时通知
  notifyRecovered: number;
  // 告警无数据时通知
  notifyNodata: number;
  // 通知时间
  notifyTimeFilter?: TimeFilter;
  // 工作区名
  workspaceName: string;
  // 指标无数据触发告警 这是个开关 1表示打开 0表示闭合
  alarmNodata: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      level: 'level',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      step: 'step',
      channels: 'channels',
      alarmSubs: 'alarm_subs',
      silenceTime: 'silence_time',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyNodata: 'notify_nodata',
      notifyTimeFilter: 'notify_time_filter',
      workspaceName: 'workspace_name',
      alarmNodata: 'alarm_nodata',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      level: 'number',
      emergency: 'string',
      emergencyUrl: 'string',
      pendingHit: 'number',
      recoveredHit: 'number',
      step: 'number',
      channels: { 'type': 'array', 'itemType': 'string' },
      alarmSubs: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
      silenceTime: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyNodata: 'number',
      notifyTimeFilter: TimeFilter,
      workspaceName: 'string',
      alarmNodata: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnifiedalarmTplResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true 成功 false 失败
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUnifiedalarmTplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主键
  id: number;
  // 模板名称
  name: string;
  // 区分自定义还是pql
  category: string;
  // 规则配置
  ruleConfig: string;
  // 告警等级
  level: number;
  // 应急处理人
  emergency?: string;
  // 应急处理链接
  emergencyUrl?: string;
  // 触发周期
  pendingHit: number;
  // 恢复周期
  recoveredHit: number;
  // 检测频率
  step: number;
  // 通知渠道
  channels: string[];
  // 通知对象 可能有多个
  alarmSubs?: UnifiedAlarmSubDTO[];
  // 静默期
  silenceTime: number;
  // 告警触发时通知
  notifyFiring: number;
  // 告警恢复时通知
  notifyRecovered: number;
  // 告警无数据时通知
  notifyNodata: number;
  // 通知时间
  notifyTimeFilter?: TimeFilter;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
      category: 'category',
      ruleConfig: 'rule_config',
      level: 'level',
      emergency: 'emergency',
      emergencyUrl: 'emergency_url',
      pendingHit: 'pending_hit',
      recoveredHit: 'recovered_hit',
      step: 'step',
      channels: 'channels',
      alarmSubs: 'alarm_subs',
      silenceTime: 'silence_time',
      notifyFiring: 'notify_firing',
      notifyRecovered: 'notify_recovered',
      notifyNodata: 'notify_nodata',
      notifyTimeFilter: 'notify_time_filter',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      name: 'string',
      category: 'string',
      ruleConfig: 'string',
      level: 'number',
      emergency: 'string',
      emergencyUrl: 'string',
      pendingHit: 'number',
      recoveredHit: 'number',
      step: 'number',
      channels: { 'type': 'array', 'itemType': 'string' },
      alarmSubs: { 'type': 'array', 'itemType': UnifiedAlarmSubDTO },
      silenceTime: 'number',
      notifyFiring: 'number',
      notifyRecovered: 'number',
      notifyNodata: 'number',
      notifyTimeFilter: TimeFilter,
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUnifiedalarmTplResponse extends $tea.Model {
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

export class QueryUnifiedalarmTplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页
  // 
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 工作区名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmTplResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警模板集合
  alarmTpls?: UnifiedAlarmTplVO[];
  // 总记录数
  totalCount?: number;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmTpls: 'alarm_tpls',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmTpls: { 'type': 'array', 'itemType': UnifiedAlarmTplVO },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedalarmTplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主键
  id: number;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnifiedalarmTplResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警规则模板详情
  alarmTpl?: UnifiedAlarmTplVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmTpl: 'alarm_tpl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmTpl: UnifiedAlarmTplVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedalarmTplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主键
  id: number;
  // 工作空间名
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUnifiedalarmTplResponse extends $tea.Model {
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

export class SwitchUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主键
  id: number;
  // 告警开始时间
  suspendStartTime?: number;
  // 告警结束时间
  suspendedEndTime?: number;
  // 告警暂停原因
  suspendedReason?: string;
  // 启停状态
  status: number;
  // 工作空间名
  workspaceName: string;
  // 批量暂停与恢复
  ids?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      suspendStartTime: 'suspend_start_time',
      suspendedEndTime: 'suspended_end_time',
      suspendedReason: 'suspended_reason',
      status: 'status',
      workspaceName: 'workspace_name',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
      suspendStartTime: 'number',
      suspendedEndTime: 'number',
      suspendedReason: 'string',
      status: 'number',
      workspaceName: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchUnifiedalarmRuleResponse extends $tea.Model {
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

export class ListAlarmSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 资源类型
  resourceType: string;
  // 资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      resourceType: 'resource_type',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      resourceType: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAlarmSubscriptionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警订阅列表
  alarmSubs?: AlarmSub[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmSubs: 'alarm_subs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmSubs: { 'type': 'array', 'itemType': AlarmSub },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlarmSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 告警订阅主键 ID
  id: number;
  // 告警级别
  alarmLevel: number;
  // 降频通知开关
  notifyReduceSwitch: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
      alarmLevel: 'alarm_level',
      notifyReduceSwitch: 'notify_reduce_switch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
      alarmLevel: 'number',
      notifyReduceSwitch: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlarmSubscriptionResponse extends $tea.Model {
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

export class ListCustompluginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 插件类型
  pluginType?: string;
  // 过滤类型
  filterType?: string;
  // 过滤条件，如app名称
  filter?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      pluginType: 'plugin_type',
      filterType: 'filter_type',
      filter: 'filter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      pluginType: 'string',
      filterType: 'string',
      filter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCustompluginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 自定义指标监控配置列表
  customPlugins?: CustomPluginDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customPlugins: 'custom_plugins',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customPlugins: { 'type': 'array', 'itemType': CustomPluginDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区
  workspaceName: string;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 告警等级
  alarmLevel?: number;
  // 触发状态
  status?: number;
  // 告警对象类型
  alarmTargetType?: string;
  // 模糊查询字段
  keyword?: string;
  // 开始时间
  startTime?: number;
  // 结束时间
  endTime?: number;
  // 告警规则 ID
  alarmRuleId?: number;
  // 根据应用栈过滤
  alarmStackInfo?: AlarmStackInfo;
  // 查询告警事件产生时间所在区间的开始时间
  fireStartTime?: number;
  // 查询告警事件产生时间所在区间的结束时间
  fireEndTime?: number;
  // 查询告警事件恢复时间所在区间的开始时间
  recoveredStartTime?: number;
  // 查询告警事件恢复时间所在区间的结束时间
  recoveredEndTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      currentPage: 'current_page',
      pageSize: 'page_size',
      alarmLevel: 'alarm_level',
      status: 'status',
      alarmTargetType: 'alarm_target_type',
      keyword: 'keyword',
      startTime: 'start_time',
      endTime: 'end_time',
      alarmRuleId: 'alarm_rule_id',
      alarmStackInfo: 'alarm_stack_info',
      fireStartTime: 'fire_start_time',
      fireEndTime: 'fire_end_time',
      recoveredStartTime: 'recovered_start_time',
      recoveredEndTime: 'recovered_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      currentPage: 'number',
      pageSize: 'number',
      alarmLevel: 'number',
      status: 'number',
      alarmTargetType: 'string',
      keyword: 'string',
      startTime: 'number',
      endTime: 'number',
      alarmRuleId: 'number',
      alarmStackInfo: AlarmStackInfo,
      fireStartTime: 'number',
      fireEndTime: 'number',
      recoveredStartTime: 'number',
      recoveredEndTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警事件列表
  unifiedAlarmEventList?: UnifiedAlarmEventVO[];
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      unifiedAlarmEventList: 'unified_alarm_event_list',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      unifiedAlarmEventList: { 'type': 'array', 'itemType': UnifiedAlarmEventVO },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmMetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警规则唯一标识
  ruleUniqueIdentity?: string;
  // metrics查询唯一id
  muid?: string;
  // 维度筛选
  tags?: KeySet[];
  // 开始时间
  start: number;
  // 结束时间
  end: number;
  // workspace_name
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ruleUniqueIdentity: 'rule_unique_identity',
      muid: 'muid',
      tags: 'tags',
      start: 'start',
      end: 'end',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ruleUniqueIdentity: 'string',
      muid: 'string',
      tags: { 'type': 'array', 'itemType': KeySet },
      start: 'number',
      end: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmMetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指标数据
  results?: UnifiedAlarmMetric[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      results: { 'type': 'array', 'itemType': UnifiedAlarmMetric },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUnifiedalarmHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // json格式上下文信息
  context: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUnifiedalarmHistoryResponse extends $tea.Model {
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

export class BatchcreateUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 模板 ID
  tplId: number;
  // 监控对象名称列表
  alarmTargets: AlarmTarget[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      tplId: 'tpl_id',
      alarmTargets: 'alarm_targets',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      tplId: 'number',
      alarmTargets: { 'type': 'array', 'itemType': AlarmTarget },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateUnifiedalarmRuleResponse extends $tea.Model {
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

export class QueryUnifiedalarmEventstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警等级
  alarmLevel?: number;
  // 触发状态
  status?: number;
  // 时间戳
  startTime: number;
  // 时间戳
  endTime: number;
  // 工作空间名
  workspaceName: string;
  // 模糊查询告警内容
  keyword?: string;
  // 告警规则 ID
  alarmRuleId?: number;
  // alarm_target_type
  alarmTargetType?: string;
  // 根据应用过滤
  alarmStackInfo?: AlarmStackInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alarmLevel: 'alarm_level',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      workspaceName: 'workspace_name',
      keyword: 'keyword',
      alarmRuleId: 'alarm_rule_id',
      alarmTargetType: 'alarm_target_type',
      alarmStackInfo: 'alarm_stack_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alarmLevel: 'number',
      status: 'number',
      startTime: 'number',
      endTime: 'number',
      workspaceName: 'string',
      keyword: 'string',
      alarmRuleId: 'number',
      alarmTargetType: 'string',
      alarmStackInfo: AlarmStackInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmEventstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 历史事件统计
  alarmHistoryList?: EventStat[];
  // 时间分段
  timeSlots?: number[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alarmHistoryList: 'alarm_history_list',
      timeSlots: 'time_slots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alarmHistoryList: { 'type': 'array', 'itemType': EventStat },
      timeSlots: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmNotifystatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 开始时间
  startTime: number;
  // 结束时间
  endTime: number;
  // 发送状态
  status?: number;
  // 通知渠道
  channel?: string;
  // 模糊查询通知内容
  keyword?: string;
  // 工作空间名称
  workspaceName: string;
  // 告警规则 ID
  alarmRuleId?: number;
  // 事件ID
  eventId?: string;
  // 根据应用过滤
  alarmStackInfo?: AlarmStackInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      startTime: 'start_time',
      endTime: 'end_time',
      status: 'status',
      channel: 'channel',
      keyword: 'keyword',
      workspaceName: 'workspace_name',
      alarmRuleId: 'alarm_rule_id',
      eventId: 'event_id',
      alarmStackInfo: 'alarm_stack_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      startTime: 'number',
      endTime: 'number',
      status: 'number',
      channel: 'string',
      keyword: 'string',
      workspaceName: 'string',
      alarmRuleId: 'number',
      eventId: 'string',
      alarmStackInfo: AlarmStackInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmNotifystatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统计通知历史
  notifyStatList?: EventStat[];
  // 时间分段
  timeSlots?: number[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notifyStatList: 'notify_stat_list',
      timeSlots: 'time_slots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notifyStatList: { 'type': 'array', 'itemType': EventStat },
      timeSlots: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 	
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物理机信息
  mtmNcs?: MtmNc[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mtmNcs: 'mtm_ncs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mtmNcs: { 'type': 'array', 'itemType': MtmNc },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteUnifiedalarmRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // id
  idsRepeatList: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      idsRepeatList: 'ids_repeat_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      idsRepeatList: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteUnifiedalarmRuleResponse extends $tea.Model {
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

export class CreateXdashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspaceName: string;
  // request data
  data: XDashboardCRULResponseCURequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDashboardCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateXdashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // response data
  data?: XDashboardCRULResponseCURequest;
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
      data: XDashboardCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXdashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // external workspace name
  workspaceName: string;
  // update
  data: XDashboardCRULResponseCURequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDashboardCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXdashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dashboard body
  data?: XDashboardCRULResponseCURequest;
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
      data: XDashboardCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //   
  data: XDashboardQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDashboardQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dashboard body
  data?: XDashboardCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDashboardCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXdashboardDirectoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  // uuid必填
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXdashboardDirectoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dashboard body list
  data?: XDashboardCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDashboardCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteXdashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  // 其中uuid和type必填
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteXdashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除成功资源列表
  data?: XResource[];
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
      data: { 'type': 'array', 'itemType': XResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricInstantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  time 必填
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricInstantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XMetricResponse;
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
      data: XMetricResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricRangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  start end 必填
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricRangeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //   
  data?: XMetricResponse;
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
      data: XMetricResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricdatasourceInstantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //   
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricdatasourceInstantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XMetricResponse;
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
      data: XMetricResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricdatasourceRangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricdatasourceRangeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XTableResponse;
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
      data: XTableResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetrictagKeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetrictagKeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tag keys
  data?: XMetricInfo[];
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
      data: { 'type': 'array', 'itemType': XMetricInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetrictagValueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetrictagValueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLogserviceDesenstypesRequest extends $tea.Model {
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

export class ListLogserviceDesenstypesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可配置的脱敏类型
  desensTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      desensTypes: 'desens_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      desensTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLogserviceDesensconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLogserviceDesensconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 已配置的脱敏类型
  desensTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      desensTypes: 'desens_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      desensTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLogserviceDesensconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需配置的脱敏类型
  desensTypes: string[];
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      desensTypes: 'desens_types',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      desensTypes: { 'type': 'array', 'itemType': 'string' },
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLogserviceDesensconfigResponse extends $tea.Model {
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

export class DetailUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // auth_url
  authUrl?: string;
  // user
  user?: MonitorUser;
  // nav_head
  navHead?: NavContent;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authUrl: 'auth_url',
      user: 'user',
      navHead: 'nav_head',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authUrl: 'string',
      user: MonitorUser,
      navHead: NavContent,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  // login_name
  loginName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // powers
  powers?: LongListKeySet[];
  // bd_powers
  bdPowers?: LongListKeySet[];
  // w_powers
  wPowers?: LongListKeySet[];
  // t_powers
  tPowers?: LongListKeySet[];
  // super_admin
  superAdmin?: boolean;
  // super_view
  superView?: boolean;
  // biz_domains
  bizDomains?: BizDomain[];
  // auth_url
  authUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      powers: 'powers',
      bdPowers: 'bd_powers',
      wPowers: 'w_powers',
      tPowers: 't_powers',
      superAdmin: 'super_admin',
      superView: 'super_view',
      bizDomains: 'biz_domains',
      authUrl: 'auth_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      powers: { 'type': 'array', 'itemType': LongListKeySet },
      bdPowers: { 'type': 'array', 'itemType': LongListKeySet },
      wPowers: { 'type': 'array', 'itemType': LongListKeySet },
      tPowers: { 'type': 'array', 'itemType': LongListKeySet },
      superAdmin: 'boolean',
      superView: 'boolean',
      bizDomains: { 'type': 'array', 'itemType': BizDomain },
      authUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLogpathMetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名
  appName: string;
  // 日志路径
  fullpath: string;
  // 工作空间名
  workspaceName: string;
  // 监控数据起始时间
  start: number;
  // 监控数据结束时间
  end: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      fullpath: 'fullpath',
      workspaceName: 'workspace_name',
      start: 'start',
      end: 'end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      fullpath: 'string',
      workspaceName: 'string',
      start: 'number',
      end: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLogpathMetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  results?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      results: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricNameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricNameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XMetricInfo[];
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
      data: { 'type': 'array', 'itemType': XMetricInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmwebhookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // web hook 名称
  name: string;
  // web hook http url
  url: string;
  // web hook http method
  httpMethod: string;
  // web hook http headers
  headers?: KeySet[];
  // web hook http params
  params?: KeySet[];
  // 配置项（timeOut，retryCount）
  config?: KeySet[];
  // body_template
  bodyTemplate?: string;
  // scope_global
  scopeGlobal: boolean;
  // 当前workspace有效，还是当前租户有效
  validScope: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      name: 'name',
      url: 'url',
      httpMethod: 'http_method',
      headers: 'headers',
      params: 'params',
      config: 'config',
      bodyTemplate: 'body_template',
      scopeGlobal: 'scope_global',
      validScope: 'valid_scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      name: 'string',
      url: 'string',
      httpMethod: 'string',
      headers: { 'type': 'array', 'itemType': KeySet },
      params: { 'type': 'array', 'itemType': KeySet },
      config: { 'type': 'array', 'itemType': KeySet },
      bodyTemplate: 'string',
      scopeGlobal: 'boolean',
      validScope: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmwebhookResponse extends $tea.Model {
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

export class CreateXdatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XDatasourceCRULResponseCURequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDatasourceCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateXdatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest;
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
      data: XDatasourceCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXdatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XDatasourceCRULResponseCURequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDatasourceCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXdatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest;
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
      data: XDatasourceCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXdatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXdatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest;
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
      data: XDatasourceCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteXdatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteXdatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //   
  data?: XResource[];
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
      data: { 'type': 'array', 'itemType': XResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXdatasourceDirectoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXdatasourceDirectoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDatasourceCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlarmwebhookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  // id
  id: number;
  // name
  name: string;
  // web hook http url
  url: string;
  // web hook http method
  httpMethod: string;
  // headers
  headers?: KeySet[];
  // params
  params?: KeySet[];
  // config
  config?: KeySet[];
  // body_template
  bodyTemplate?: string;
  // scope_global
  scopeGlobal: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
      name: 'name',
      url: 'url',
      httpMethod: 'http_method',
      headers: 'headers',
      params: 'params',
      config: 'config',
      bodyTemplate: 'body_template',
      scopeGlobal: 'scope_global',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
      name: 'string',
      url: 'string',
      httpMethod: 'string',
      headers: { 'type': 'array', 'itemType': KeySet },
      params: { 'type': 'array', 'itemType': KeySet },
      config: { 'type': 'array', 'itemType': KeySet },
      bodyTemplate: 'string',
      scopeGlobal: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlarmwebhookResponse extends $tea.Model {
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

export class DeleteAlarmwebhookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  // id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAlarmwebhookResponse extends $tea.Model {
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

export class QueryXdatasourceTableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourceTableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XMetricQuery;
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
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAlarmOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 	
  // 工作空间
  workspaceName: string;
  // end_time
  endTime: number;
  // alarm_type
  alarmType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      endTime: 'end_time',
      alarmType: 'alarm_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      endTime: 'number',
      alarmType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAlarmOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AlarmOverviewDTO
  data?: AlarmOverviewDTO;
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
      data: AlarmOverviewDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppAlarmstatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // end_time
  endTime: number;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      endTime: 'end_time',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      endTime: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppAlarmstatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppAlarmStats[];
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
      data: { 'type': 'array', 'itemType': AppAlarmStats },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmhistoryAlarmtrendsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // alarm_type
  alarmType: string;
  // group_by
  groupBy: string;
  // from
  from: number;
  // to
  to: number;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alarmType: 'alarm_type',
      groupBy: 'group_by',
      from: 'from',
      to: 'to',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alarmType: 'string',
      groupBy: 'string',
      from: 'number',
      to: 'number',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmhistoryAlarmtrendsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AlarmHistoryStatsVO;
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
      data: AlarmHistoryStatsVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否拥有kubeconfig
  hasKubeconfig?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hasKubeconfig: 'has_kubeconfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hasKubeconfig: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAgentVersionstrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 0 容器，1经典
  type: number;
  // TENANT、WORKSPACE
  scope: string;
  // agent 地址，容器为镜像地址，经典为 OSS 地址
  agentUrl: string;
  // 版本号
  agentVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      type: 'type',
      scope: 'scope',
      agentUrl: 'agent_url',
      agentVersion: 'agent_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      type: 'number',
      scope: 'string',
      agentUrl: 'string',
      agentVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAgentVersionstrategyResponse extends $tea.Model {
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

export class GetAgentVersionstrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 0 容器，1经典
  type: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAgentVersionstrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // agent 版本策略
  agentVersionStrategy?: AgentVersionStrategy;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agentVersionStrategy: 'agent_version_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agentVersionStrategy: AgentVersionStrategy,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSystemTimeRequest extends $tea.Model {
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

export class GetSystemTimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务器系统时间
  time?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      time: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecXdatasourceMoveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XResource[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: { 'type': 'array', 'itemType': XResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecXdatasourceMoveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XResource[];
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
      data: { 'type': 'array', 'itemType': XResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetadataTagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //   
  data: XTarget;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetadataTagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XRule;
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
      data: XRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourceSearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  name?: string;
  //  
  enabled?: boolean;
  //  
  targetResourceKind?: string;
  //  
  targetResourceName?: string;
  //  
  ruleType?: string;
  //  
  createdBy?: string;
  //  
  parentUuid?: string;
  //  
  datasourceType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      name: 'name',
      enabled: 'enabled',
      targetResourceKind: 'target_resource_kind',
      targetResourceName: 'target_resource_name',
      ruleType: 'rule_type',
      createdBy: 'created_by',
      parentUuid: 'parent_uuid',
      datasourceType: 'datasource_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      name: 'string',
      enabled: 'boolean',
      targetResourceKind: 'string',
      targetResourceName: 'string',
      ruleType: 'string',
      createdBy: 'string',
      parentUuid: 'string',
      datasourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourceSearchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDatasourceCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySetupConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  key: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySetupConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // key jsonString
  data?: XKeyJson;
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
      data: XKeyJson,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSetupConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XKeyJson;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XKeyJson,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSetupConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XKeyJson;
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
      data: XKeyJson,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSetupConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  key: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSetupConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XKeyJson;
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
      data: XKeyJson,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWorkspaceSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  // workspace_setting_detail
  workspaceSettingDetail: WorkspaceSettingDetail;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      workspaceSettingDetail: 'workspace_setting_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      workspaceSettingDetail: WorkspaceSettingDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWorkspaceSettingResponse extends $tea.Model {
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

export class ExportXsiteConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XSiteExport;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XSiteExport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportXsiteConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XSiteExportData;
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
      data: XSiteExportData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportXsiteConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XSiteExportData;
  // 替换前的字符串
  origin?: string;
  // 替换后的字符串
  replaced?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
      origin: 'origin',
      replaced: 'replaced',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XSiteExportData,
      origin: 'string',
      replaced: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportXsiteConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XResource[];
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
      data: { 'type': 'array', 'itemType': XResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourceTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data?: XDatasourceQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDatasourceQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourceTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDatasourceCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDatasourceCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdashboardTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XDashboardQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XDashboardQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdashboardTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDashboardCRULResponseCURequest[];
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
      data: { 'type': 'array', 'itemType': XDashboardCRULResponseCURequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXdashboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XResource;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XResource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXdashboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XDashboardCRULResponseCURequest;
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
      data: XDashboardCRULResponseCURequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourcePrometheusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName?: string;
  //  
  data: XPrometheusQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XPrometheusQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXdatasourcePrometheusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XPrometheusData;
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
      data: XPrometheusData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetNodeOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 查询开始时间，unix timestamp in ms
  startTime?: number;
  // 	
  // 查询截止时间，unix timestamp in ms
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetNodeOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: NodeOverviewDTO;
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
      data: NodeOverviewDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_name
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总览页配置统计信息
  data?: ConfigOverviewDto;
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
      data: ConfigOverviewDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间配置
  workspaceSettingDetail?: WorkspaceSettingDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceSettingDetail: 'workspace_setting_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceSettingDetail: WorkspaceSettingDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTraceWorkspacesettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间，用来鉴权
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTraceWorkspacesettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间配置
  traceWorkspaceSettings?: TraceWorkspaceSetting[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceWorkspaceSettings: 'trace_workspace_settings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceWorkspaceSettings: { 'type': 'array', 'itemType': TraceWorkspaceSetting },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraceWorkspacesettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间配置
  traceWorkspaceSettings: TraceWorkspaceSetting[];
  // 工作空间，用来鉴权
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      traceWorkspaceSettings: 'trace_workspace_settings',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      traceWorkspaceSettings: { 'type': 'array', 'itemType': TraceWorkspaceSetting },
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraceWorkspacesettingResponse extends $tea.Model {
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

export class ListAppSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // APP配置列表
  appSettings?: AppSetting[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appSettings: 'app_settings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appSettings: { 'type': 'array', 'itemType': AppSetting },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否开启应用监控采集
  collectEnable: boolean;
  // 工作空间名称
  workspaceName: string;
  // 配置信息
  setting?: string;
  // 应用名称
  appName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      collectEnable: 'collect_enable',
      workspaceName: 'workspace_name',
      setting: 'setting',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      collectEnable: 'boolean',
      workspaceName: 'string',
      setting: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppSettingResponse extends $tea.Model {
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

export class GetAppSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 应用名称
  appName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // APP配置
  appSetting?: AppSetting;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appSetting: 'app_setting',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appSetting: AppSetting,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmEventdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // event id
  eventId: string;
  // 告警规则 ID
  alarmRuleId?: number;
  // 当前页
  currentPage?: number;
  // 按page_size做记录切分。
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      eventId: 'event_id',
      alarmRuleId: 'alarm_rule_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      eventId: 'string',
      alarmRuleId: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmEventdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 总记录数
  totalCount?: number;
  // 页面尺寸
  pageSize?: number;
  // 告警消息列表
  alarmHistoryList?: UnifiedAlarmHistoryVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      totalCount: 'total_count',
      pageSize: 'page_size',
      alarmHistoryList: 'alarm_history_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      totalCount: 'number',
      pageSize: 'number',
      alarmHistoryList: { 'type': 'array', 'itemType': UnifiedAlarmHistoryVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmMonitorlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户名称
  tenantId: number;
  // 应用名称
  appName: string;
  // 查询哪个技术栈下的告警指标。
  stackId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      appName: 'app_name',
      stackId: 'stack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'number',
      appName: 'string',
      stackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmMonitorlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 缺省的监控指标。
  stackMonitorList?: StackMonitorItem[];
  // 用户定制的告警项。
  customPluginList?: CustomPluginDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stackMonitorList: 'stack_monitor_list',
      customPluginList: 'custom_plugin_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stackMonitorList: { 'type': 'array', 'itemType': StackMonitorItem },
      customPluginList: { 'type': 'array', 'itemType': CustomPluginDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricTableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  workspaceName: string;
  //  
  data: XMetricQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      data: XMetricQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXmetricTableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: XTableResponse;
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
      data: XTableResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppsqlmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppsqlmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppsqlstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppsqlstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppnosqlmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppnosqlmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqconsumemetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqconsumemetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcclientmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcclientmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcservermetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcservermetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpclientmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpclientmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpservermetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpservermetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppnosqlstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppnosqlstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqconsumestatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqconsumestatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpclientstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpclientstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpserverstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpserverstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcclientstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcclientstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcserverstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApprpcserverstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraceWorkspacesettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraceWorkspacesettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间配置
  traceWorkspaceSetting?: TraceWorkspaceSetting;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceWorkspaceSetting: 'trace_workspace_setting',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceWorkspaceSetting: TraceWorkspaceSetting,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqproducemetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqproducemetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqproducestatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppmqproducestatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMeasurementStatusRequest extends $tea.Model {
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

export class GetMeasurementStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 计量计费是否开启
  measurementEnable?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      measurementEnable: 'measurement_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      measurementEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLogserviceAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 命名空间
  workspaceName: string;
  // 租户名称
  tenantName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLogserviceAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace id
  workspaceId?: number;
  // tenant_id
  tenantId?: number;
  // 总量
  totalCount?: number;
  // 应用详情列表
  result?: AppMeta[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      totalCount: 'total_count',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceId: 'number',
      tenantId: 'number',
      totalCount: 'number',
      result: { 'type': 'array', 'itemType': AppMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpserverstatusmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceApphttpserverstatusmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppAlarmrulesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 指标栈ID
  stackId: number;
  // 应用名称
  appName: string;
  // 查询所有，还是查询当前设置的告警指标。
  all: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      stackId: 'stack_id',
      appName: 'app_name',
      all: 'all',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      stackId: 'number',
      appName: 'string',
      all: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppAlarmrulesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 技术栈指标
  stackMetrics?: StackMonitorItem[];
  // 应用自定义指标
  customPlugins?: CustomPluginDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stackMetrics: 'stack_metrics',
      customPlugins: 'custom_plugins',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stackMetrics: { 'type': 'array', 'itemType': StackMonitorItem },
      customPlugins: { 'type': 'array', 'itemType': CustomPluginDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceCompactdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // traceId
  traceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceCompactdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 节点
  items?: TraceCompactTreeItem[];
  // 描述整体链路的额外信息，比span总数，应用总数之类的
  attributes?: KeySet[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      items: 'items',
      attributes: 'attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      items: { 'type': 'array', 'itemType': TraceCompactTreeItem },
      attributes: { 'type': 'array', 'itemType': KeySet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppexceptionmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppexceptionmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
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
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppexceptionstatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 应用名
  appName: string;
  // 开始毫秒时间戳
  startTime: number;
  // 结束毫秒时间戳
  endTime: number;
  // 排序字段
  sortBy?: string;
  // 排序是否逆序
  sortReverse?: boolean;
  // 分页页数
  pageNumber?: number;
  // 每页记录条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      startTime: 'start_time',
      endTime: 'end_time',
      sortBy: 'sort_by',
      sortReverse: 'sort_reverse',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      appName: 'string',
      startTime: 'number',
      endTime: 'number',
      sortBy: 'string',
      sortReverse: 'boolean',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceAppexceptionstatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: TimeSeriesMetrics[];
  // 分页号
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 查询总数
  totalSize?: number;
  // 查询总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': TimeSeriesMetrics },
      currentPage: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmRulebindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 告警对象类型：APP应用，HOST主机
  alarmTargetType?: string;
  // 告警对象名称
  alarmTargetIdentity?: string;
  // 告警规则ID
  alarmRuleId?: number;
  // 数据源 ID
  datasource?: string;
  // 数据源类型：CUSTOM自定义监控，STACK技术栈监控
  datasourceType?: string;
  // 监控指标 URL
  url?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      alarmTargetType: 'alarm_target_type',
      alarmTargetIdentity: 'alarm_target_identity',
      alarmRuleId: 'alarm_rule_id',
      datasource: 'datasource',
      datasourceType: 'datasource_type',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      alarmTargetType: 'string',
      alarmTargetIdentity: 'string',
      alarmRuleId: 'number',
      datasource: 'string',
      datasourceType: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnifiedalarmRulebindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 告警规则绑定列表
  ruleBindings?: UnifiedAlarmRuleBindingVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ruleBindings: 'rule_bindings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ruleBindings: { 'type': 'array', 'itemType': UnifiedAlarmRuleBindingVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsCheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 当前页
  currentPage?: number;
  // 	
  // 页面大小
  pageSize?: number;
  // 应用名
  app?: string;
  // 应用监控指标状态 0：异常 1：正常 不传：全部
  appStatus?: number;
  // 自定义监控指标状态 0：异常 1：正常 不传：全部
  customStatus?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      currentPage: 'current_page',
      pageSize: 'page_size',
      app: 'app',
      appStatus: 'app_status',
      customStatus: 'custom_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      currentPage: 'number',
      pageSize: 'number',
      app: 'string',
      appStatus: 'number',
      customStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsCheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ops_check_results
  opsCheckResults?: OpsCheckResult[];
  // total_count
  totalCount?: number;
  // current_page
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsCheckResults: 'ops_check_results',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsCheckResults: { 'type': 'array', 'itemType': OpsCheckResult },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsAppcheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  // 应用名称
  app: string;
  // 0：异常 1：正常
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      app: 'app',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      app: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsAppcheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用诊断
  opsDataChecks?: OpsDataCheck[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsDataChecks: 'ops_data_checks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsDataChecks: { 'type': 'array', 'itemType': OpsDataCheck },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmDingdingrobotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // 钉钉机器人列表
  robots: DingDingRobot[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      robots: 'robots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      robots: { 'type': 'array', 'itemType': DingDingRobot },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlarmDingdingrobotResponse extends $tea.Model {
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

export class QueryAlarmDingdingrobotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // 只看当前用户创建的钉钉机器人
  onlyCurrentStaff?: boolean;
  // 当前页
  currentPage?: number;
  // 页面尺寸
  pageSize?: number;
  // 机器人名称
  name?: string;
  // 根据token过滤
  token?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      onlyCurrentStaff: 'only_current_staff',
      currentPage: 'current_page',
      pageSize: 'page_size',
      name: 'name',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      onlyCurrentStaff: 'boolean',
      currentPage: 'number',
      pageSize: 'number',
      name: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmDingdingrobotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 钉钉机器人列表
  robots?: DingDingRobot[];
  // 当前页
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 总记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      robots: 'robots',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      robots: { 'type': 'array', 'itemType': DingDingRobot },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAlarmDingdingrobotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // 要删除的机器人列表
  robots: DingDingRobot[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      robots: 'robots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      robots: { 'type': 'array', 'itemType': DingDingRobot },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAlarmDingdingrobotResponse extends $tea.Model {
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

export class UpdateAlarmDingdingrobotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作区名
  workspaceName: string;
  // 更新的机器人清单
  robots: DingDingRobot[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      robots: 'robots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      robots: { 'type': 'array', 'itemType': DingDingRobot },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlarmDingdingrobotResponse extends $tea.Model {
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

export class QueryAppsAlarmrulecountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 查询app清单
  apps: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsAlarmrulecountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用告警规则数清单
  appAlarmRuleCounts?: AppAlarmRuleCount[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appAlarmRuleCounts: 'app_alarm_rule_counts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appAlarmRuleCounts: { 'type': 'array', 'itemType': AppAlarmRuleCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsUnifiedalarmstatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 告警开始时间
  startTime?: number;
  // 告警结束时间
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsUnifiedalarmstatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 正在告警的所有应用状态
  appAlarmStatus?: AppAlarmStats[];
  // 总应用数
  totalAppCount?: number;
  // 正在告警的应用数
  alarmAppCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appAlarmStatus: 'app_alarm_status',
      totalAppCount: 'total_app_count',
      alarmAppCount: 'alarm_app_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appAlarmStatus: { 'type': 'array', 'itemType': AppAlarmStats },
      totalAppCount: 'number',
      alarmAppCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchOpsAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // DATA_OPS： 诊断告警
  // AGENT：agent告警
  // 
  alarmTargetType: string;
  // 1：开启告警
  // 0：暂停告警
  status: number;
  // 应用
  alarmTargetIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      alarmTargetType: 'alarm_target_type',
      status: 'status',
      alarmTargetIdentity: 'alarm_target_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      alarmTargetType: 'string',
      status: 'number',
      alarmTargetIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchOpsAlarmResponse extends $tea.Model {
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

export class AllTraasmetaTenantRequest extends $tea.Model {
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

export class AllTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenants
  tenants?: TraasTenantDto[];
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
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaRegionRequest extends $tea.Model {
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

export class AllTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regions
  regions?: TraasRegionDto[];
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
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenants
  tenants?: TraasTenantDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenants: 'tenants',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenant
  tenant?: TraasTenantDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: TraasTenantDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenants
  tenants?: TraasTenantDto[];
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
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid数组
  uuids?: string[];
  // names
  names?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenants
  tenants?: TraasTenantDto[];
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
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // tenant name
  name: string;
  // display_name
  displayName?: string;
  // outsideId
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenant
  tenant?: TraasTenantDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: TraasTenantDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户列表
  tenants: TraasTenantDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenants
  tenants?: TraasTenantDto[];
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
      tenants: { 'type': 'array', 'itemType': TraasTenantDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // display_name
  displayName: string;
  // outside_id
  outsideId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      displayName: 'display_name',
      outsideId: 'outside_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      displayName: 'string',
      outsideId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenant
  tenant?: TraasTenantDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: TraasTenantDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaTenantResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaTenantResponse extends $tea.Model {
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

export class GetTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // traasregiondto
  region?: TraasRegionDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      region: TraasRegionDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaZoneRequest extends $tea.Model {
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

export class AllTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  zones?: TraasZoneDto[];
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
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zone
  zone?: TraasZoneDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zone: TraasZoneDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // region
  region?: TraasRegionDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      region: TraasRegionDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentLabelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 唯一标识数组
  collectIds: string[];
  // 标记是否开启告警
  // 1：开启告警
  // 0：关闭告警
  label: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      collectIds: 'collect_ids',
      label: 'label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      collectIds: { 'type': 'array', 'itemType': 'string' },
      label: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentLabelResponse extends $tea.Model {
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

export class CreateTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // region_uuid
  regionUuid: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      regionUuid: 'region_uuid',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      regionUuid: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zone
  zone?: TraasZoneDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zone: TraasZoneDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaRegionResponse extends $tea.Model {
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

export class DeleteTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaZoneResponse extends $tea.Model {
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

export class UpdateTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // extension
  extension?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      displayName: 'display_name',
      outsideId: 'outside_id',
      extension: 'extension',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      displayName: 'string',
      outsideId: 'string',
      extension: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // region
  region?: TraasRegionDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      region: TraasRegionDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // extension
  extension?: string;
  // region_uuid
  regionUuid?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      extension: 'extension',
      regionUuid: 'region_uuid',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      extension: 'string',
      regionUuid: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zone
  zone?: TraasZoneDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zone: TraasZoneDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regions
  // 
  regions?: TraasRegionDto[];
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
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  // 
  zones?: TraasZoneDto[];
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
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize?: number;
  // 	
  // 当前页
  currentPage?: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      search: 'search',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      search: 'boolean',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regions
  regions?: TraasRegionDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      regions: 'regions',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      search: 'search',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      search: 'boolean',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  zones?: TraasZoneDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zones: 'zones',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regions
  regions?: TraasRegionDto[];
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
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // regions
  regions: TraasRegionDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regions: 'regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regions
  regions?: TraasRegionDto[];
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
      regions: { 'type': 'array', 'itemType': TraasRegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // zones
  zones: TraasZoneDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  zones?: TraasZoneDto[];
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
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  zones?: TraasZoneDto[];
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
      zones: { 'type': 'array', 'itemType': TraasZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaRegionResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaZoneResponse extends $tea.Model {
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

export class AllTraasmetaAppRequest extends $tea.Model {
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

export class AllTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // appdto
  apps?: TraasAppDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaAppgroupRequest extends $tea.Model {
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

export class AllTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // appgroupsdto
  appGroups?: TraasAppGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaAppserverRequest extends $tea.Model {
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

export class AllTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_servers
  appServers?: TraasAppServerDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServers: 'app_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaApptagRequest extends $tea.Model {
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

export class AllTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tags
  appTags?: TraasAppTagDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTags: 'app_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaWorkspaceRequest extends $tea.Model {
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

export class AllTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  workspaces?: TraasWorkspaceDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaWorkspacegroupRequest extends $tea.Model {
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

export class AllTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_groups
  workspaceGroups?: TraasWorkspaceGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_groups
  workspaceGroups: TraasWorkspaceGroupDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_groups
  workspaceGroups?: TraasWorkspaceGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // apps
  apps: TraasAppDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // apps
  apps?: TraasAppDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_groups
  appGroups: TraasAppGroupDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appGroups: 'app_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_groups
  appGroups?: TraasAppGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_servers
  appServers: TraasAppServerDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServers: 'app_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_servers
  appServers?: TraasAppServerDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServers: 'app_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_tags
  appTags: TraasAppTagDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appTags: 'app_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tags
  appTags?: TraasAppTagDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTags: 'app_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspaces
  workspaces: TraasWorkspaceDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  workspaces?: TraasWorkspaceDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaAppResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaWorkspaceResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaApptagResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaAppserverResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaAppgroupResponse extends $tea.Model {
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

export class BatchdeleteTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaWorkspacegroupResponse extends $tea.Model {
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

export class BatchqueryTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_groups
  workspaceGroups?: TraasWorkspaceGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  workspaces?: TraasWorkspaceDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // app_names
  appNames?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // tag_keys
  tagKeys?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      appNames: 'app_names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      tagKeys: 'tag_keys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      appNames: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
      tagKeys: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tags
  appTags?: TraasAppTagDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTags: 'app_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // hostnames
  hostnames?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // ips
  ips?: string[];
  // app_names
  appNames?: string[];
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      hostnames: 'hostnames',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      ips: 'ips',
      appNames: 'app_names',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      hostnames: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
      ips: { 'type': 'array', 'itemType': 'string' },
      appNames: { 'type': 'array', 'itemType': 'string' },
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_servers
  appServers?: TraasAppServerDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServers: 'app_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_groups
  appGroups?: TraasAppGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // apps
  apps?: TraasAppDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaAppResponse extends $tea.Model {
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

export class DeleteTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaAppgroupResponse extends $tea.Model {
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

export class DeleteTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaAppserverResponse extends $tea.Model {
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

export class DeleteTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaApptagResponse extends $tea.Model {
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

export class DeleteTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaWorkspaceResponse extends $tea.Model {
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

export class DeleteTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaWorkspacegroupResponse extends $tea.Model {
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

export class GetTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app
  app?: TraasAppDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      app: TraasAppDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_group
  appGroup?: TraasAppGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroup: 'app_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroup: TraasAppGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // ip
  ip?: string;
  // app_name
  appName?: string;
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      ip: 'ip',
      appName: 'app_name',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      ip: 'string',
      appName: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_server
  appServer?: TraasAppServerDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServer: 'app_server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServer: TraasAppServerDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // app_name
  appName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // tag_key
  tagKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      appName: 'app_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      tagKey: 'tag_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      appName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      tagKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tag
  appTag?: TraasAppTagDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTag: 'app_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTag: TraasAppTagDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace
  workspace?: TraasWorkspaceDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: TraasWorkspaceDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_group
  workspaceGroup?: TraasWorkspaceGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroup: TraasWorkspaceGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // 
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  // 
  tenantName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      search: 'search',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      search: 'boolean',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_groups
  workspaceGroups?: TraasWorkspaceGroupDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // 
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  // 
  tenantName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      search: 'search',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      search: 'boolean',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  workspaces?: TraasWorkspaceDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // app_name
  appName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      appName: 'app_name',
      search: 'search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      appName: 'string',
      search: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tags
  appTags?: TraasAppTagDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTags: 'app_tags',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // 
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  // 
  tenantName?: string;
  // workspace_name
  workspaceName?: string;
  // host_ip
  hostIp?: string;
  // app_name
  appName?: string;
  // ip
  ip?: string;
  // hotsname
  hotsname?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceName: 'workspace_name',
      hostIp: 'host_ip',
      appName: 'app_name',
      ip: 'ip',
      hotsname: 'hotsname',
      search: 'search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceName: 'string',
      hostIp: 'string',
      appName: 'string',
      ip: 'string',
      hotsname: 'string',
      search: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_servers
  appServers?: TraasAppServerDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServers: 'app_servers',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  // 
  tenantName?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      name: 'name',
      search: 'search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      name: 'string',
      search: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_groups
  appGroups?: TraasAppGroupDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 每页大小
  pageSize: number;
  // 当前页
  currentPage: number;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  // 
  tenantName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // name
  // 
  name?: string;
  // app_group_name
  appGroupName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      search: 'search',
      name: 'name',
      appGroupName: 'app_group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      tenantUuid: 'string',
      tenantName: 'string',
      search: 'boolean',
      name: 'string',
      appGroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // apps
  apps?: TraasAppDto[];
  // 每页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 	
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_groups
  workspaceGroups?: TraasWorkspaceGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': TraasWorkspaceGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  workspaces?: TraasWorkspaceDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': TraasWorkspaceDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // app_name
  appName?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // tag_key
  tagKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      appName: 'app_name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      tagKey: 'tag_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      appName: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
      tagKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tags
  appTags?: TraasAppTagDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTags: 'app_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTags: { 'type': 'array', 'itemType': TraasAppTagDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // hostname
  hostname?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_name
  workspaceName?: string;
  // app_name
  appName?: string;
  // ip
  ip?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      hostname: 'hostname',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceName: 'workspace_name',
      appName: 'app_name',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      hostname: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceName: 'string',
      appName: 'string',
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_servers
  appServers?: TraasAppServerDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServers: 'app_servers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServers: { 'type': 'array', 'itemType': TraasAppServerDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_groups
  appGroups?: TraasAppGroupDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': TraasAppGroupDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // apps
  apps?: TraasAppDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TraasAppDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app
  app?: TraasAppDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      app: TraasAppDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app
  app?: TraasAppDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      app: TraasAppDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // tenant_name
  workspaceGroup?: TraasWorkspaceGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroup: TraasWorkspaceGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // parent_uuid
  parentUuid?: string;
  // layer
  layer?: number;
  // outside_parent_id
  outsideParentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      parentUuid: 'parent_uuid',
      layer: 'layer',
      outsideParentId: 'outside_parent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      parentUuid: 'string',
      layer: 'number',
      outsideParentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_group
  appGroup?: TraasAppGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroup: 'app_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroup: TraasAppGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // parent_uuid
  parentUuid?: string;
  // layer
  layer?: number;
  // outside_parent_id
  outsideParentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      parentUuid: 'parent_uuid',
      layer: 'layer',
      outsideParentId: 'outside_parent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      parentUuid: 'string',
      layer: 'number',
      outsideParentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_group
  appGroup?: TraasAppGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroup: 'app_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroup: TraasAppGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_group_uuid
  workspaceGroupUuid?: string;
  // region_uuid
  regionUuid?: string;
  // zone_uuid
  zoneUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceGroupUuid: 'workspace_group_uuid',
      regionUuid: 'region_uuid',
      zoneUuid: 'zone_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceGroupUuid: 'string',
      regionUuid: 'string',
      zoneUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zone_uuid
  workspace?: TraasWorkspaceDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: TraasWorkspaceDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_group_uuid
  workspaceGroupUuid?: string;
  // region_uuid
  regionUuid?: string;
  // zone_uuid
  zoneUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceGroupUuid: 'workspace_group_uuid',
      regionUuid: 'region_uuid',
      zoneUuid: 'zone_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceGroupUuid: 'string',
      regionUuid: 'string',
      zoneUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zone_uuid
  workspace?: TraasWorkspaceDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: TraasWorkspaceDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // tag_key
  tagKey?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  // tag_value
  tagValue?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      tagKey: 'tag_key',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      appUuid: 'app_uuid',
      appName: 'app_name',
      tagValue: 'tag_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      tagKey: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      appUuid: 'string',
      appName: 'string',
      tagValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tag
  appTag?: TraasAppTagDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTag: 'app_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTag: TraasAppTagDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaApptagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // tag_key
  tagKey: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // tag_value
  tagValue?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tagKey: 'tag_key',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      tagValue: 'tag_value',
      appUuid: 'app_uuid',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tagKey: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      tagValue: 'string',
      appUuid: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaApptagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_tag
  appTag?: TraasAppTagDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTag: 'app_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTag: TraasAppTagDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // hostname
  hostname: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // ip
  ip?: string;
  // host_ip
  hostIp?: string;
  // collect_id
  collectId?: string;
  // status
  status?: boolean;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // cell_uuid
  cellUuid?: string;
  // zone_uuid
  zoneUuid?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  // app_service_uuid
  appServiceUuid?: string;
  // vm_uuid
  vmUuid?: string;
  // pod_uuid
  podUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      hostname: 'hostname',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      ip: 'ip',
      hostIp: 'host_ip',
      collectId: 'collect_id',
      status: 'status',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      cellUuid: 'cell_uuid',
      zoneUuid: 'zone_uuid',
      appUuid: 'app_uuid',
      appName: 'app_name',
      appServiceUuid: 'app_service_uuid',
      vmUuid: 'vm_uuid',
      podUuid: 'pod_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      hostname: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      ip: 'string',
      hostIp: 'string',
      collectId: 'string',
      status: 'boolean',
      workspaceUuid: 'string',
      workspaceName: 'string',
      cellUuid: 'string',
      zoneUuid: 'string',
      appUuid: 'string',
      appName: 'string',
      appServiceUuid: 'string',
      vmUuid: 'string',
      podUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_server
  appServer?: TraasAppServerDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServer: 'app_server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServer: TraasAppServerDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppserverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // hostname
  hostname?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // ip
  ip?: string;
  // host_ip
  hostIp?: string;
  // collect_id
  collectId?: string;
  // status
  status?: boolean;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // cell_uuid
  cellUuid?: string;
  // zone_uuid
  zoneUuid?: string;
  // app_uuid
  appUuid?: string;
  // app_name
  appName?: string;
  // app_service_uuid
  appServiceUuid?: string;
  // vm_uuid
  vmUuid?: string;
  // pod_uuid
  podUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      hostname: 'hostname',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      ip: 'ip',
      hostIp: 'host_ip',
      collectId: 'collect_id',
      status: 'status',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      cellUuid: 'cell_uuid',
      zoneUuid: 'zone_uuid',
      appUuid: 'app_uuid',
      appName: 'app_name',
      appServiceUuid: 'app_service_uuid',
      vmUuid: 'vm_uuid',
      podUuid: 'pod_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      hostname: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      ip: 'string',
      hostIp: 'string',
      collectId: 'string',
      status: 'boolean',
      workspaceUuid: 'string',
      workspaceName: 'string',
      cellUuid: 'string',
      zoneUuid: 'string',
      appUuid: 'string',
      appName: 'string',
      appServiceUuid: 'string',
      vmUuid: 'string',
      podUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaAppserverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_server
  appServer?: TraasAppServerDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServer: 'app_server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServer: TraasAppServerDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSetupModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间名称
  workspaceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSetupModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主站试点的产品是否打开
  betaPlugin?: boolean;
  // showBizDomain
  showBizDomain?: boolean;
  // drm 推送的地址列表, 如果为空，前端默认主站，如果不为空，按照配置来渲染
  siteDrms?: SiteWithDrm[];
  // 是不是租户总览用空间总览
  tenantUseWsOverview?: boolean;
  // iaas监控开关
  iaasMonitor?: boolean;
  // 应用监控的技术栈
  appStack?: string;
  // 应用监控的技术栈实体
  appStackEntity?: string;
  // 站点
  siteEnv?: string;
  // useNewAlarmConfig
  useNewAlarmConfig?: boolean;
  // goc推送开关
  gocPushOpen?: boolean;
  // 是否打开高级产品配置，脚本、联合计算等
  advCustomPluinOpen?: boolean;
  // 导航是否鉴权
  navAuth?: boolean;
  // unFocusPageShutFresh
  unFocusPageShutFresh?: boolean;
  // lineChartIncreFresh
  lineChartIncreFresh?: boolean;
  // ws开关
  showWs?: boolean;
  // Tenant开关
  showTenant?: boolean;
  // searchEagleEye
  searchEagleEye?: boolean;
  // 系统指标默认显示的周期
  sysMetricInterval?: string;
  // uuidWithWorkspace
  uuidWithWorkspace?: boolean;
  // 封网变更标志
  blockChange?: boolean;
  // bizEditors
  bizEditors?: string[];
  // 数据接口还使用fiber接口的租户
  useFiberDataTenants?: string[];
  // 平台运维技术栈（前端利用这个值来判断将哪些技术栈展示在平台运维版块）
  platformMonitorStackNames?: string[];
  // 菜单配置
  menuConfig?: MenuConfig;
  // 是否开启秒级监控配置，默认关闭
  secondMonitorEnable?: boolean;
  // 是否允许前端显示应用分组
  showAppGroup?: boolean;
  // 是否禁用老版告警
  disableOldAlarm?: boolean;
  // frontDatasource
  frontDatasource?: string;
  // frontDashboard
  frontDashboard?: string;
  // showAllChartType
  showAllChartType?: string;
  // showImportReplace
  showImportReplace?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      betaPlugin: 'beta_plugin',
      showBizDomain: 'show_biz_domain',
      siteDrms: 'site_drms',
      tenantUseWsOverview: 'tenant_use_ws_overview',
      iaasMonitor: 'iaas_monitor',
      appStack: 'app_stack',
      appStackEntity: 'app_stack_entity',
      siteEnv: 'site_env',
      useNewAlarmConfig: 'use_new_alarm_config',
      gocPushOpen: 'goc_push_open',
      advCustomPluinOpen: 'adv_custom_pluin_open',
      navAuth: 'nav_auth',
      unFocusPageShutFresh: 'un_focus_page_shut_fresh',
      lineChartIncreFresh: 'line_chart_incre_fresh',
      showWs: 'show_ws',
      showTenant: 'show_tenant',
      searchEagleEye: 'search_eagle_eye',
      sysMetricInterval: 'sys_metric_interval',
      uuidWithWorkspace: 'uuid_with_workspace',
      blockChange: 'block_change',
      bizEditors: 'biz_editors',
      useFiberDataTenants: 'use_fiber_data_tenants',
      platformMonitorStackNames: 'platform_monitor_stack_names',
      menuConfig: 'menu_config',
      secondMonitorEnable: 'second_monitor_enable',
      showAppGroup: 'show_app_group',
      disableOldAlarm: 'disable_old_alarm',
      frontDatasource: 'front_datasource',
      frontDashboard: 'front_dashboard',
      showAllChartType: 'show_all_chart_type',
      showImportReplace: 'show_import_replace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      betaPlugin: 'boolean',
      showBizDomain: 'boolean',
      siteDrms: { 'type': 'array', 'itemType': SiteWithDrm },
      tenantUseWsOverview: 'boolean',
      iaasMonitor: 'boolean',
      appStack: 'string',
      appStackEntity: 'string',
      siteEnv: 'string',
      useNewAlarmConfig: 'boolean',
      gocPushOpen: 'boolean',
      advCustomPluinOpen: 'boolean',
      navAuth: 'boolean',
      unFocusPageShutFresh: 'boolean',
      lineChartIncreFresh: 'boolean',
      showWs: 'boolean',
      showTenant: 'boolean',
      searchEagleEye: 'boolean',
      sysMetricInterval: 'string',
      uuidWithWorkspace: 'boolean',
      blockChange: 'boolean',
      bizEditors: { 'type': 'array', 'itemType': 'string' },
      useFiberDataTenants: { 'type': 'array', 'itemType': 'string' },
      platformMonitorStackNames: { 'type': 'array', 'itemType': 'string' },
      menuConfig: MenuConfig,
      secondMonitorEnable: 'boolean',
      showAppGroup: 'boolean',
      disableOldAlarm: 'boolean',
      frontDatasource: 'string',
      frontDashboard: 'string',
      showAllChartType: 'string',
      showImportReplace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaWorkspacegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaWorkspacegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace_group
  workspaceGroup?: TraasWorkspaceGroupDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroup: TraasWorkspaceGroupDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // workspace_name
  workspaceName?: string;
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      workspaceName: 'workspace_name',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      workspaceName: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell
  cell?: TraasCellDto;
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
      cell: TraasCellDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // page_size
  pageSize: number;
  // current_page
  currentPage: number;
  // cell name
  name?: string;
  // workspace name
  workspaceName?: string;
  // workspace uuid
  workspaceUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      name: 'name',
      workspaceName: 'workspace_name',
      workspaceUuid: 'workspace_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      name: 'string',
      workspaceName: 'string',
      workspaceUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  cells?: TraasCellDto[];
  // page size
  pageSize?: number;
  // current page
  currentPage?: number;
  // total count
  totalCount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cells: 'cells',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cells: { 'type': 'array', 'itemType': TraasCellDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // workspace_name
  workspaceName?: string;
  // ip
  ip?: string;
  // workspace_uuid
  workspaceUuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      workspaceName: 'workspace_name',
      ip: 'ip',
      workspaceUuid: 'workspace_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      workspaceName: 'string',
      ip: 'string',
      workspaceUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // host_machine
  hostMachine?: TraasHostMachineDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hostMachine: 'host_machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hostMachine: TraasHostMachineDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // page_size
  pageSize: number;
  // currentPage
  currentPage: number;
  // workspace_name
  workspaceName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // hostname
  hostname?: string;
  // ip
  ip?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageSize: 'page_size',
      currentPage: 'current_page',
      workspaceName: 'workspace_name',
      workspaceUuid: 'workspace_uuid',
      hostname: 'hostname',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageSize: 'number',
      currentPage: 'number',
      workspaceName: 'string',
      workspaceUuid: 'string',
      hostname: 'string',
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // host_machines
  hostMachines?: TraasHostMachineDto[];
  // page_size
  pageSize?: number;
  // current_page
  currentPage?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hostMachines: 'host_machines',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hostMachines: { 'type': 'array', 'itemType': TraasHostMachineDto },
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceDetailtopologyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // trace_id
  traceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraceDetailtopologyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拓扑节点
  items?: TraceDetailTopologyItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      items: { 'type': 'array', 'itemType': TraceDetailTopologyItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTenantconfigSpiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // configKey参数名称
  entityName: string;
  // end_point
  endPoint: string;
  // 默认为CamelCase
  fieldNamingStrategy?: string;
  // 云厂商类型
  cloudVendorType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      entityName: 'entity_name',
      endPoint: 'end_point',
      fieldNamingStrategy: 'field_naming_strategy',
      cloudVendorType: 'cloud_vendor_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      entityName: 'string',
      endPoint: 'string',
      fieldNamingStrategy: 'string',
      cloudVendorType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTenantconfigSpiResponse extends $tea.Model {
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

export class QueryTenantconfigSpiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 模块名称
  entityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantconfigSpiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // entity_name
  entityName?: string;
  // spi_config
  configValue?: SpiConfig;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      entityName: 'entity_name',
      configValue: 'config_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      entityName: 'string',
      configValue: SpiConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListOneconsoleWorkspaceRequest extends $tea.Model {
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

export class ListOneconsoleWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: OneConsoleRegion[];
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
      data: { 'type': 'array', 'itemType': OneConsoleRegion },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTenantconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // 模块名称
  entityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTenantconfigResponse extends $tea.Model {
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

export class QueryTenantconfigTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // configKey对应值
  entityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantconfigTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // token_config
  configValue?: TokenConfig;
  // entity_name
  entityName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configValue: 'config_value',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configValue: TokenConfig,
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTenantconfigTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceName: string;
  // configKey对应值
  entityName: string;
  // token值
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceName: 'workspace_name',
      entityName: 'entity_name',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceName: 'string',
      entityName: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTenantconfigTokenResponse extends $tea.Model {
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

export class QueryTraasmetaEntityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // entity_name
  entityName: string;
  // 工作空间名称
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      entityName: 'entity_name',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      entityName: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaEntityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实体名称
  name?: string;
  // 展示名称
  displayName?: string;
  // 实体所属分组名称
  groupName?: string;
  // 实例所属分组展示名称
  groupDisplayName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      displayName: 'display_name',
      groupName: 'group_name',
      groupDisplayName: 'group_display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      displayName: 'string',
      groupName: 'string',
      groupDisplayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTraasmetaEntityfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实体名称
  entityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTraasmetaEntityfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fields
  fields?: TraasEntityFieldDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fields: 'fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fields: { 'type': 'array', 'itemType': TraasEntityFieldDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaEntitytopoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // entity_name
  entityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      entityName: 'entity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      entityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaEntitytopoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // edges
  edges?: TraasEntityTopoEdge[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      edges: 'edges',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      edges: { 'type': 'array', 'itemType': TraasEntityTopoEdge },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTraasmetaHostmachineRequest extends $tea.Model {
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

export class AllTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // hosts
  hosts?: TraasHostMachineDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hosts: 'hosts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hosts: { 'type': 'array', 'itemType': TraasHostMachineDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // hosts
  hosts: TraasHostMachineDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      hosts: 'hosts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      hosts: { 'type': 'array', 'itemType': TraasHostMachineDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // hosts
  hosts?: TraasHostMachineDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hosts: 'hosts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hosts: { 'type': 'array', 'itemType': TraasHostMachineDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaHostmachineResponse extends $tea.Model {
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

export class BatchqueryTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // ips
  ips?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      ips: 'ips',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      ips: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // hosts
  hosts?: TraasHostMachineDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hosts: 'hosts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hosts: { 'type': 'array', 'itemType': TraasHostMachineDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // hostname
  hostname: string;
  // ip
  ip: string;
  // collect_id
  collectId: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // zone_uuid
  zoneUuid?: string;
  // zone_name
  zoneName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      hostname: 'hostname',
      ip: 'ip',
      collectId: 'collect_id',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      hostname: 'string',
      ip: 'string',
      collectId: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // host
  host?: TraasHostMachineDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      host: 'host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      host: TraasHostMachineDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaHostmachineResponse extends $tea.Model {
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

export class QueryTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // ip
  ip?: string;
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      ip: 'ip',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      ip: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // hosts
  hosts?: TraasHostMachineDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hosts: 'hosts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hosts: { 'type': 'array', 'itemType': TraasHostMachineDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaHostmachineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // hostname
  hostname?: string;
  // collect_id
  collectId?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // zone_uuid
  zoneUuid?: string;
  // zone_name
  zoneName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  // ip
  ip?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      hostname: 'hostname',
      collectId: 'collect_id',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      hostname: 'string',
      collectId: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaHostmachineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // host
  host?: TraasHostMachineDto;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      host: 'host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      host: TraasHostMachineDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // cells
  cells: TraasCellDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cells: { 'type': 'array', 'itemType': TraasCellDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  cells?: TraasCellDto[];
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
      cells: { 'type': 'array', 'itemType': TraasCellDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteTraasmetaCellResponse extends $tea.Model {
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

export class BatchqueryTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuids
  uuids?: string[];
  // names
  names?: string[];
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuids: 'uuids',
      names: 'names',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuids: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  cells?: TraasCellDto[];
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
      cells: { 'type': 'array', 'itemType': TraasCellDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  // name
  name?: string;
  // display_name
  displayName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // zone_uuid
  zoneUuid?: string;
  // zone_name
  zoneName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom?: string;
  // extension
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell
  cell?: TraasCellDto;
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
      cell: TraasCellDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  // zone_uuid
  zoneUuid?: string;
  // zone_name
  zoneName?: string;
  // outside_id
  outsideId?: string;
  // source_from
  sourceFrom: string;
  // extension
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      displayName: 'display_name',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
      zoneUuid: 'zone_uuid',
      zoneName: 'zone_name',
      outsideId: 'outside_id',
      sourceFrom: 'source_from',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      displayName: 'string',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
      zoneUuid: 'string',
      zoneName: 'string',
      outsideId: 'string',
      sourceFrom: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell
  cell?: TraasCellDto;
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
      cell: TraasCellDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTraasmetaCellResponse extends $tea.Model {
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

export class AllTraasmetaCellRequest extends $tea.Model {
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

export class AllTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  cells?: TraasCellDto[];
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
      cells: { 'type': 'array', 'itemType': TraasCellDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // uuid
  uuid?: string;
  // name
  name?: string;
  // 	
  // 是否是模糊搜索，默认为false
  search: boolean;
  // tenant_uuid
  tenantUuid?: string;
  // tenant_name
  tenantName?: string;
  // workspace_uuid
  workspaceUuid?: string;
  // workspace_name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uuid: 'uuid',
      name: 'name',
      search: 'search',
      tenantUuid: 'tenant_uuid',
      tenantName: 'tenant_name',
      workspaceUuid: 'workspace_uuid',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uuid: 'string',
      name: 'string',
      search: 'boolean',
      tenantUuid: 'string',
      tenantName: 'string',
      workspaceUuid: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraasmetaCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  cells?: TraasCellDto[];
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
      cells: { 'type': 'array', 'itemType': TraasCellDto },
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
          sdk_version: "1.3.273",
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
   * Description: /agent/logLocate
   * Summary: /agent/logLocate
   */
  async queryRmsAgentloglocate(request: QueryRmsAgentloglocateRequest): Promise<QueryRmsAgentloglocateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAgentloglocateEx(request, headers, runtime);
  }

  /**
   * Description: /agent/logLocate
   * Summary: /agent/logLocate
   */
  async queryRmsAgentloglocateEx(request: QueryRmsAgentloglocateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAgentloglocateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAgentloglocateResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.agentloglocate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAgentloglocateResponse({}));
  }

  /**
   * Description: /agent/tail
   * Summary: /agent/tail
   */
  async queryRmsAgenttail(request: QueryRmsAgenttailRequest): Promise<QueryRmsAgenttailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAgenttailEx(request, headers, runtime);
  }

  /**
   * Description: /agent/tail
   * Summary: /agent/tail
   */
  async queryRmsAgenttailEx(request: QueryRmsAgenttailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAgenttailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAgenttailResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.agenttail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAgenttailResponse({}));
  }

  /**
   * Description: /agent/browser
   * Summary: /agent/browser
   */
  async queryRmsAgentbrowser(request: QueryRmsAgentbrowserRequest): Promise<QueryRmsAgentbrowserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAgentbrowserEx(request, headers, runtime);
  }

  /**
   * Description: /agent/browser
   * Summary: /agent/browser
   */
  async queryRmsAgentbrowserEx(request: QueryRmsAgentbrowserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAgentbrowserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAgentbrowserResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.agentbrowser.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAgentbrowserResponse({}));
  }

  /**
   * Description: rms.alarmhistorytype.query
   * Summary: alarmTypeStats
   */
  async queryRmsAlarmhistorytype(request: QueryRmsAlarmhistorytypeRequest): Promise<QueryRmsAlarmhistorytypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAlarmhistorytypeEx(request, headers, runtime);
  }

  /**
   * Description: rms.alarmhistorytype.query
   * Summary: alarmTypeStats
   */
  async queryRmsAlarmhistorytypeEx(request: QueryRmsAlarmhistorytypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAlarmhistorytypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAlarmhistorytypeResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.alarmhistorytype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAlarmhistorytypeResponse({}));
  }

  /**
   * Description: alarmLevelStats
   * Summary: alarmLevelStats
   */
  async queryRmsAlarmhistorylevel(request: QueryRmsAlarmhistorylevelRequest): Promise<QueryRmsAlarmhistorylevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAlarmhistorylevelEx(request, headers, runtime);
  }

  /**
   * Description: alarmLevelStats
   * Summary: alarmLevelStats
   */
  async queryRmsAlarmhistorylevelEx(request: QueryRmsAlarmhistorylevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAlarmhistorylevelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAlarmhistorylevelResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.alarmhistorylevel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAlarmhistorylevelResponse({}));
  }

  /**
   * Description: /stats/notify/history
   * Summary: notifyHistoryStatsV2
   */
  async queryRmsNotifyhistory(request: QueryRmsNotifyhistoryRequest): Promise<QueryRmsNotifyhistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsNotifyhistoryEx(request, headers, runtime);
  }

  /**
   * Description: /stats/notify/history
   * Summary: notifyHistoryStatsV2
   */
  async queryRmsNotifyhistoryEx(request: QueryRmsNotifyhistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsNotifyhistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsNotifyhistoryResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.notifyhistory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsNotifyhistoryResponse({}));
  }

  /**
   * Description: /stats/stack/entity
   * Summary: stackEntityStats
   */
  async queryRmsStackentity(request: QueryRmsStackentityRequest): Promise<QueryRmsStackentityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsStackentityEx(request, headers, runtime);
  }

  /**
   * Description: /stats/stack/entity
   * Summary: stackEntityStats
   */
  async queryRmsStackentityEx(request: QueryRmsStackentityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsStackentityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsStackentityResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.stackentity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsStackentityResponse({}));
  }

  /**
   * Description: /stats/alarm/history/appCount
   * Summary: alarmHistoryAppCount
   */
  async queryRmsAlarmhistoryappcount(request: QueryRmsAlarmhistoryappcountRequest): Promise<QueryRmsAlarmhistoryappcountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAlarmhistoryappcountEx(request, headers, runtime);
  }

  /**
   * Description: /stats/alarm/history/appCount
   * Summary: alarmHistoryAppCount
   */
  async queryRmsAlarmhistoryappcountEx(request: QueryRmsAlarmhistoryappcountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAlarmhistoryappcountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAlarmhistoryappcountResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappcount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAlarmhistoryappcountResponse({}));
  }

  /**
   * Description: /alarm/history/appStats
   * Summary: alarmHistoryAppStats
   */
  async queryRmsAlarmhistoryappstats(request: QueryRmsAlarmhistoryappstatsRequest): Promise<QueryRmsAlarmhistoryappstatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAlarmhistoryappstatsEx(request, headers, runtime);
  }

  /**
   * Description: /alarm/history/appStats
   * Summary: alarmHistoryAppStats
   */
  async queryRmsAlarmhistoryappstatsEx(request: QueryRmsAlarmhistoryappstatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAlarmhistoryappstatsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAlarmhistoryappstatsResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.alarmhistoryappstats.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAlarmhistoryappstatsResponse({}));
  }

  /**
   * Description: /alarm/history/appStatsPageable
   * Summary: appstatspageable
   */
  async queryRmsAppstatspageable(request: QueryRmsAppstatspageableRequest): Promise<QueryRmsAppstatspageableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsAppstatspageableEx(request, headers, runtime);
  }

  /**
   * Description: /alarm/history/appStatsPageable
   * Summary: appstatspageable
   */
  async queryRmsAppstatspageableEx(request: QueryRmsAppstatspageableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsAppstatspageableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsAppstatspageableResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.appstatspageable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsAppstatspageableResponse({}));
  }

  /**
   * Description: /logread/error
   * Summary: /logread/error
   */
  async queryRmsLogreaderror(request: QueryRmsLogreaderrorRequest): Promise<QueryRmsLogreaderrorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsLogreaderrorEx(request, headers, runtime);
  }

  /**
   * Description: /logread/error
   * Summary: /logread/error
   */
  async queryRmsLogreaderrorEx(request: QueryRmsLogreaderrorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsLogreaderrorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsLogreaderrorResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.logreaderror.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsLogreaderrorResponse({}));
  }

  /**
   * Description: /universal/read
   * Summary: /universal/read
   */
  async queryRmsUniversalread(request: QueryRmsUniversalreadRequest): Promise<QueryRmsUniversalreadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsUniversalreadEx(request, headers, runtime);
  }

  /**
   * Description: /universal/read
   * Summary: /universal/read
   */
  async queryRmsUniversalreadEx(request: QueryRmsUniversalreadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsUniversalreadResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsUniversalreadResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.universalread.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsUniversalreadResponse({}));
  }

  /**
   * Description: /universal/write
   * Summary: /universal/write
   */
  async queryRmsUniversalwrite(request: QueryRmsUniversalwriteRequest): Promise<QueryRmsUniversalwriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsUniversalwriteEx(request, headers, runtime);
  }

  /**
   * Description: /universal/write
   * Summary: /universal/write
   */
  async queryRmsUniversalwriteEx(request: QueryRmsUniversalwriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsUniversalwriteResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsUniversalwriteResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.universalwrite.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsUniversalwriteResponse({}));
  }

  /**
   * Description: /modeling/plugin/create
   * Summary: create
   */
  async createRmsPlugin(request: CreateRmsPluginRequest): Promise<CreateRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/create
   * Summary: create
   */
  async createRmsPluginEx(request: CreateRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/delete
   * Summary: delete
   */
  async deleteRmsPlugin(request: DeleteRmsPluginRequest): Promise<DeleteRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/delete
   * Summary: delete
   */
  async deleteRmsPluginEx(request: DeleteRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/close
   * Summary: close
   */
  async closeRmsPlugin(request: CloseRmsPluginRequest): Promise<CloseRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/close
   * Summary: close
   */
  async closeRmsPluginEx(request: CloseRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/open
   * Summary: open
   */
  async openRmsPlugin(request: OpenRmsPluginRequest): Promise<OpenRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/open
   * Summary: open
   */
  async openRmsPluginEx(request: OpenRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/update
   * Summary: update
   */
  async updateRmsPlugin(request: UpdateRmsPluginRequest): Promise<UpdateRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/update
   * Summary: update
   */
  async updateRmsPluginEx(request: UpdateRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/queryByPluginType
   * Summary: queryByPluginType
   */
  async queryRmsPluginbytype(request: QueryRmsPluginbytypeRequest): Promise<QueryRmsPluginbytypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsPluginbytypeEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/queryByPluginType
   * Summary: queryByPluginType
   */
  async queryRmsPluginbytypeEx(request: QueryRmsPluginbytypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsPluginbytypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsPluginbytypeResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.pluginbytype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsPluginbytypeResponse({}));
  }

  /**
   * Description: /modeling/plugin/queryByFolder
   * Summary: queryByFolder
   */
  async queryRmsPluginbyfolder(request: QueryRmsPluginbyfolderRequest): Promise<QueryRmsPluginbyfolderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsPluginbyfolderEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/queryByFolder
   * Summary: queryByFolder
   */
  async queryRmsPluginbyfolderEx(request: QueryRmsPluginbyfolderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsPluginbyfolderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsPluginbyfolderResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.pluginbyfolder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsPluginbyfolderResponse({}));
  }

  /**
   * Description: /modeling/plugin/query
   * Summary: query
   */
  async queryRmsPlugin(request: QueryRmsPluginRequest): Promise<QueryRmsPluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsPluginEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/query
   * Summary: query
   */
  async queryRmsPluginEx(request: QueryRmsPluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsPluginResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsPluginResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsPluginResponse({}));
  }

  /**
   * Description: /modeling/plugin/querytest
   * Summary: querytest
   */
  async queryRmsPlugintest(request: QueryRmsPlugintestRequest): Promise<QueryRmsPlugintestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsPlugintestEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/plugin/querytest
   * Summary: querytest
   */
  async queryRmsPlugintestEx(request: QueryRmsPlugintestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsPlugintestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsPlugintestResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.plugintest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsPlugintestResponse({}));
  }

  /**
   * Description: /modeling/folder/path
   * Summary: queryPath
   */
  async queryRmsPath(request: QueryRmsPathRequest): Promise<QueryRmsPathResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsPathEx(request, headers, runtime);
  }

  /**
   * Description: /modeling/folder/path
   * Summary: queryPath
   */
  async queryRmsPathEx(request: QueryRmsPathRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsPathResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsPathResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.path.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsPathResponse({}));
  }

  /**
   * Description: /{tenantId}/webapi/cleankey
   * Summary: cleankey
   */
  async execRmsUniversalcleankey(request: ExecRmsUniversalcleankeyRequest): Promise<ExecRmsUniversalcleankeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRmsUniversalcleankeyEx(request, headers, runtime);
  }

  /**
   * Description: /{tenantId}/webapi/cleankey
   * Summary: cleankey
   */
  async execRmsUniversalcleankeyEx(request: ExecRmsUniversalcleankeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRmsUniversalcleankeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRmsUniversalcleankeyResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.universalcleankey.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRmsUniversalcleankeyResponse({}));
  }

  /**
   * Description: /{tenantId}/universalQuery
   * Summary: universalQuery
   */
  async queryRmsUniversal(request: QueryRmsUniversalRequest): Promise<QueryRmsUniversalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsUniversalEx(request, headers, runtime);
  }

  /**
   * Description: /{tenantId}/universalQuery
   * Summary: universalQuery
   */
  async queryRmsUniversalEx(request: QueryRmsUniversalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsUniversalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsUniversalResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.universal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsUniversalResponse({}));
  }

  /**
   * Description: 链路搜索
   * Summary: 链路搜索
   */
  async queryRmsTracespan(request: QueryRmsTracespanRequest): Promise<QueryRmsTracespanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRmsTracespanEx(request, headers, runtime);
  }

  /**
   * Description: 链路搜索
   * Summary: 链路搜索
   */
  async queryRmsTracespanEx(request: QueryRmsTracespanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRmsTracespanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRmsTracespanResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.tracespan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRmsTracespanResponse({}));
  }

  /**
   * Description: 查询链路搜索页面的配置
   * Summary: 查询链路搜索页面的配置
   */
  async getRmsTracespanqueryconfig(request: GetRmsTracespanqueryconfigRequest): Promise<GetRmsTracespanqueryconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRmsTracespanqueryconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询链路搜索页面的配置
   * Summary: 查询链路搜索页面的配置
   */
  async getRmsTracespanqueryconfigEx(request: GetRmsTracespanqueryconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRmsTracespanqueryconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRmsTracespanqueryconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.tracespanqueryconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRmsTracespanqueryconfigResponse({}));
  }

  /**
   * Description: 单链路树状图查询
   * Summary: 单链路树状图查询
   */
  async describeRmsTracetree(request: DescribeRmsTracetreeRequest): Promise<DescribeRmsTracetreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeRmsTracetreeEx(request, headers, runtime);
  }

  /**
   * Description: 单链路树状图查询
   * Summary: 单链路树状图查询
   */
  async describeRmsTracetreeEx(request: DescribeRmsTracetreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeRmsTracetreeResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeRmsTracetreeResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.tracetree.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeRmsTracetreeResponse({}));
  }

  /**
   * Description: 南天门 - 商品补全接口
   * Summary: 南天门 - 商品补全接口
   */
  async callbackSpiCompletecommodity(request: CallbackSpiCompletecommodityRequest): Promise<CallbackSpiCompletecommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiCompletecommodityEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 商品补全接口
   * Summary: 南天门 - 商品补全接口
   */
  async callbackSpiCompletecommodityEx(request: CallbackSpiCompletecommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiCompletecommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiCompletecommodityResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.completecommodity.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiCompletecommodityResponse({}));
  }

  /**
   * Description: 南天门 - 支付后回调
   * Summary: 南天门 - 支付后回调
   */
  async callbackSpiPayordercallback(request: CallbackSpiPayordercallbackRequest): Promise<CallbackSpiPayordercallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiPayordercallbackEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 支付后回调
   * Summary: 南天门 - 支付后回调
   */
  async callbackSpiPayordercallbackEx(request: CallbackSpiPayordercallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiPayordercallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiPayordercallbackResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.payordercallback.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiPayordercallbackResponse({}));
  }

  /**
   * Description: 南天门 - 补全订单
   * Summary: 南天门 - 补全订单
   */
  async callbackSpiCompleteorderparam(request: CallbackSpiCompleteorderparamRequest): Promise<CallbackSpiCompleteorderparamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiCompleteorderparamEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 补全订单
   * Summary: 南天门 - 补全订单
   */
  async callbackSpiCompleteorderparamEx(request: CallbackSpiCompleteorderparamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiCompleteorderparamResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiCompleteorderparamResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.completeorderparam.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiCompleteorderparamResponse({}));
  }

  /**
   * Description: 南天门 - 订单校验回调
   * Summary: 南天门 - 订单校验回调
   */
  async callbackSpiVerify(request: CallbackSpiVerifyRequest): Promise<CallbackSpiVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 订单校验回调
   * Summary: 南天门 - 订单校验回调
   */
  async callbackSpiVerifyEx(request: CallbackSpiVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiVerifyResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.verify.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiVerifyResponse({}));
  }

  /**
   * Description: 南天门 - 退款
   * Summary: 南天门 - 退款
   */
  async callbackSpiRefund(request: CallbackSpiRefundRequest): Promise<CallbackSpiRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiRefundEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 退款
   * Summary: 南天门 - 退款
   */
  async callbackSpiRefundEx(request: CallbackSpiRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiRefundResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.refund.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiRefundResponse({}));
  }

  /**
   * Description: 南天门 - 商品实例生命周期回调
   * Summary: 南天门 - 商品实例生命周期回调
   */
  async callbackSpiLifecycle(request: CallbackSpiLifecycleRequest): Promise<CallbackSpiLifecycleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSpiLifecycleEx(request, headers, runtime);
  }

  /**
   * Description: 南天门 - 商品实例生命周期回调
   * Summary: 南天门 - 商品实例生命周期回调
   */
  async callbackSpiLifecycleEx(request: CallbackSpiLifecycleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSpiLifecycleResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSpiLifecycleResponse>(await this.doRequest("1.0", "antcloud.monitor.spi.lifecycle.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSpiLifecycleResponse({}));
  }

  /**
   * Description: 查询时序指标
   * Summary: 查询时序指标
   */
  async describeRmsTimeseriesmetrics(request: DescribeRmsTimeseriesmetricsRequest): Promise<DescribeRmsTimeseriesmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeRmsTimeseriesmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询时序指标
   * Summary: 查询时序指标
   */
  async describeRmsTimeseriesmetricsEx(request: DescribeRmsTimeseriesmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeRmsTimeseriesmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeRmsTimeseriesmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.timeseriesmetrics.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeRmsTimeseriesmetricsResponse({}));
  }

  /**
   * Description: 获取调用拓扑
   * Summary: 获取调用拓扑
   */
  async describeRmsTopology(request: DescribeRmsTopologyRequest): Promise<DescribeRmsTopologyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeRmsTopologyEx(request, headers, runtime);
  }

  /**
   * Description: 获取调用拓扑
   * Summary: 获取调用拓扑
   */
  async describeRmsTopologyEx(request: DescribeRmsTopologyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeRmsTopologyResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeRmsTopologyResponse>(await this.doRequest("1.0", "antcloud.monitor.rms.topology.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeRmsTopologyResponse({}));
  }

  /**
   * Description: 监控指标数据查询
   * Summary: 监控指标数据查询
   */
  async queryMetrics(request: QueryMetricsRequest): Promise<QueryMetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsEx(request, headers, runtime);
  }

  /**
   * Description: 监控指标数据查询
   * Summary: 监控指标数据查询
   */
  async queryMetricsEx(request: QueryMetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.metrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsResponse({}));
  }

  /**
   * Description: 链路Span查询搜索
   * Summary: 链路查询
   */
  async queryTraceSpan(request: QueryTraceSpanRequest): Promise<QueryTraceSpanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceSpanEx(request, headers, runtime);
  }

  /**
   * Description: 链路Span查询搜索
   * Summary: 链路查询
   */
  async queryTraceSpanEx(request: QueryTraceSpanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceSpanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceSpanResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.span.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceSpanResponse({}));
  }

  /**
   * Description: 获取应用列表
   * Summary: 获取应用列表
   */
  async listAppName(request: ListAppNameRequest): Promise<ListAppNameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppNameEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用列表
   * Summary: 获取应用列表
   */
  async listAppNameEx(request: ListAppNameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppNameResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppNameResponse>(await this.doRequest("1.0", "antcloud.monitor.app.name.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppNameResponse({}));
  }

  /**
   * Description: 创建自定义监控指标
   * Summary: 创建自定义监控指标
   */
  async createCustomplugin(request: CreateCustompluginRequest): Promise<CreateCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCustompluginEx(request, headers, runtime);
  }

  /**
   * Description: 创建自定义监控指标
   * Summary: 创建自定义监控指标
   */
  async createCustompluginEx(request: CreateCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCustompluginResponse({}));
  }

  /**
   * Description: 删除自定义监控指标
   * Summary: 删除自定义监控指标
   */
  async deleteCustomplugin(request: DeleteCustompluginRequest): Promise<DeleteCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCustompluginEx(request, headers, runtime);
  }

  /**
   * Description: 删除自定义监控指标
   * Summary: 删除自定义监控指标
   */
  async deleteCustompluginEx(request: DeleteCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCustompluginResponse({}));
  }

  /**
   * Description: 自定义监控 - 添加文件夹
   * Summary: 自定义监控 - 添加文件夹
   */
  async createFolder(request: CreateFolderRequest): Promise<CreateFolderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFolderEx(request, headers, runtime);
  }

  /**
   * Description: 自定义监控 - 添加文件夹
   * Summary: 自定义监控 - 添加文件夹
   */
  async createFolderEx(request: CreateFolderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFolderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFolderResponse>(await this.doRequest("1.0", "antcloud.monitor.folder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFolderResponse({}));
  }

  /**
   * Description: 自定义监控 - 文件夹更新
   * Summary: 自定义监控 - 文件夹更新
   */
  async updateFolder(request: UpdateFolderRequest): Promise<UpdateFolderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFolderEx(request, headers, runtime);
  }

  /**
   * Description: 自定义监控 - 文件夹更新
   * Summary: 自定义监控 - 文件夹更新
   */
  async updateFolderEx(request: UpdateFolderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFolderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFolderResponse>(await this.doRequest("1.0", "antcloud.monitor.folder.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFolderResponse({}));
  }

  /**
   * Description: 链路查询时可选参数的配置查询
   * Summary: 链路查询时可选参数的配置查询
   */
  async queryTraceConfig(request: QueryTraceConfigRequest): Promise<QueryTraceConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceConfigEx(request, headers, runtime);
  }

  /**
   * Description: 链路查询时可选参数的配置查询
   * Summary: 链路查询时可选参数的配置查询
   */
  async queryTraceConfigEx(request: QueryTraceConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceConfigResponse({}));
  }

  /**
   * Description: 查询文件夹路径
   * Summary: 查询文件夹路径
   */
  async queryFolderPath(request: QueryFolderPathRequest): Promise<QueryFolderPathResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFolderPathEx(request, headers, runtime);
  }

  /**
   * Description: 查询文件夹路径
   * Summary: 查询文件夹路径
   */
  async queryFolderPathEx(request: QueryFolderPathRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFolderPathResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFolderPathResponse>(await this.doRequest("1.0", "antcloud.monitor.folder.path.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFolderPathResponse({}));
  }

  /**
   * Description: 查询链路详情
   * Summary: 查询链路详情
   */
  async queryTraceDetail(request: QueryTraceDetailRequest): Promise<QueryTraceDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceDetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询链路详情
   * Summary: 查询链路详情
   */
  async queryTraceDetailEx(request: QueryTraceDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceDetailResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceDetailResponse({}));
  }

  /**
   * Description: 获取链路拓扑图
   * Summary: 获取链路拓扑图
   */
  async queryTraceTopology(request: QueryTraceTopologyRequest): Promise<QueryTraceTopologyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceTopologyEx(request, headers, runtime);
  }

  /**
   * Description: 获取链路拓扑图
   * Summary: 获取链路拓扑图
   */
  async queryTraceTopologyEx(request: QueryTraceTopologyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceTopologyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceTopologyResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.topology.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceTopologyResponse({}));
  }

  /**
   * Description: 查询链路关联指标
   * Summary: 查询链路关联指标
   */
  async queryTraceMetrics(request: QueryTraceMetricsRequest): Promise<QueryTraceMetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceMetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询链路关联指标
   * Summary: 查询链路关联指标
   */
  async queryTraceMetricsEx(request: QueryTraceMetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceMetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceMetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.metrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceMetricsResponse({}));
  }

  /**
   * Description: 获取自定义监控指标详情
   * Summary: 获取自定义监控指标详情
   */
  async getCustomplugin(request: GetCustompluginRequest): Promise<GetCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCustompluginEx(request, headers, runtime);
  }

  /**
   * Description: 获取自定义监控指标详情
   * Summary: 获取自定义监控指标详情
   */
  async getCustompluginEx(request: GetCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCustompluginResponse({}));
  }

  /**
   * Description: 查询应用监控
   * Summary: 查询应用监控
   */
  async queryApp(request: QueryAppRequest): Promise<QueryAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用监控
   * Summary: 查询应用监控
   */
  async queryAppEx(request: QueryAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppResponse>(await this.doRequest("1.0", "antcloud.monitor.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppResponse({}));
  }

  /**
   * Description: 获取用户收藏资源状态
   * Summary: 获取用户收藏资源状态
   */
  async getUserFavorite(request: GetUserFavoriteRequest): Promise<GetUserFavoriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUserFavoriteEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户收藏资源状态
   * Summary: 获取用户收藏资源状态
   */
  async getUserFavoriteEx(request: GetUserFavoriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUserFavoriteResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUserFavoriteResponse>(await this.doRequest("1.0", "antcloud.monitor.user.favorite.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUserFavoriteResponse({}));
  }

  /**
   * Description: 查询文件夹列表
   * Summary: 查询文件夹列表
   */
  async queryFolder(request: QueryFolderRequest): Promise<QueryFolderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFolderEx(request, headers, runtime);
  }

  /**
   * Description: 查询文件夹列表
   * Summary: 查询文件夹列表
   */
  async queryFolderEx(request: QueryFolderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFolderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFolderResponse>(await this.doRequest("1.0", "antcloud.monitor.folder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFolderResponse({}));
  }

  /**
   * Description:  查询自定义监控配置列表
   * Summary:  查询自定义监控配置列表
   */
  async queryCustomplugin(request: QueryCustompluginRequest): Promise<QueryCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustompluginEx(request, headers, runtime);
  }

  /**
   * Description:  查询自定义监控配置列表
   * Summary:  查询自定义监控配置列表
   */
  async queryCustompluginEx(request: QueryCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustompluginResponse({}));
  }

  /**
   * Description: 查询用户收藏列表
   * Summary: 查询用户收藏列表
   */
  async queryUserFavorite(request: QueryUserFavoriteRequest): Promise<QueryUserFavoriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserFavoriteEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户收藏列表
   * Summary: 查询用户收藏列表
   */
  async queryUserFavoriteEx(request: QueryUserFavoriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserFavoriteResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserFavoriteResponse>(await this.doRequest("1.0", "antcloud.monitor.user.favorite.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserFavoriteResponse({}));
  }

  /**
   * Description: 告警暂停列表查询
   * Summary: 告警暂停列表查询
   */
  async queryAlarmPause(request: QueryAlarmPauseRequest): Promise<QueryAlarmPauseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmPauseEx(request, headers, runtime);
  }

  /**
   * Description: 告警暂停列表查询
   * Summary: 告警暂停列表查询
   */
  async queryAlarmPauseEx(request: QueryAlarmPauseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmPauseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmPauseResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.pause.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmPauseResponse({}));
  }

  /**
   * Description: 获取告警应用统计信息
   * Summary: 获取告警应用统计信息
   */
  async countAlarmApp(request: CountAlarmAppRequest): Promise<CountAlarmAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countAlarmAppEx(request, headers, runtime);
  }

  /**
   * Description: 获取告警应用统计信息
   * Summary: 获取告警应用统计信息
   */
  async countAlarmAppEx(request: CountAlarmAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountAlarmAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CountAlarmAppResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.app.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountAlarmAppResponse({}));
  }

  /**
   * Description: 查询告警应用关联Map
   * Summary: 查询告警应用关联Map
   */
  async queryAlarmApprelation(request: QueryAlarmApprelationRequest): Promise<QueryAlarmApprelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmApprelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警应用关联Map
   * Summary: 查询告警应用关联Map
   */
  async queryAlarmApprelationEx(request: QueryAlarmApprelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmApprelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmApprelationResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.apprelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmApprelationResponse({}));
  }

  /**
   * Description: 批量查询栈配置
   * Summary: 批量查询栈配置
   */
  async batchqueryStackGeneratedconfig(request: BatchqueryStackGeneratedconfigRequest): Promise<BatchqueryStackGeneratedconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryStackGeneratedconfigEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询栈配置
   * Summary: 批量查询栈配置
   */
  async batchqueryStackGeneratedconfigEx(request: BatchqueryStackGeneratedconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryStackGeneratedconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryStackGeneratedconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryStackGeneratedconfigResponse({}));
  }

  /**
   * Description: 获取大盘列表
   * Summary: 获取大盘列表
   */
  async listDashboard(request: ListDashboardRequest): Promise<ListDashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDashboardEx(request, headers, runtime);
  }

  /**
   * Description: 获取大盘列表
   * Summary: 获取大盘列表
   */
  async listDashboardEx(request: ListDashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.dashboard.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDashboardResponse({}));
  }

  /**
   * Description: 查询技术栈配置详情
   * Summary: 查询技术栈配置详情
   */
  async queryStackGeneratedconfig(request: QueryStackGeneratedconfigRequest): Promise<QueryStackGeneratedconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStackGeneratedconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询技术栈配置详情
   * Summary: 查询技术栈配置详情
   */
  async queryStackGeneratedconfigEx(request: QueryStackGeneratedconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStackGeneratedconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStackGeneratedconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStackGeneratedconfigResponse({}));
  }

  /**
   * Description: 查询监控项
   * Summary: 查询监控项
   */
  async queryStackMonitoritem(request: QueryStackMonitoritemRequest): Promise<QueryStackMonitoritemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStackMonitoritemEx(request, headers, runtime);
  }

  /**
   * Description: 查询监控项
   * Summary: 查询监控项
   */
  async queryStackMonitoritemEx(request: QueryStackMonitoritemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStackMonitoritemResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStackMonitoritemResponse>(await this.doRequest("1.0", "antcloud.monitor.stack.monitoritem.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStackMonitoritemResponse({}));
  }

  /**
   * Description: 分页查询通知组
   * Summary: 分页查询通知组
   */
  async queryUsergroup(request: QueryUsergroupRequest): Promise<QueryUsergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsergroupEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询通知组
   * Summary: 分页查询通知组
   */
  async queryUsergroupEx(request: QueryUsergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsergroupResponse>(await this.doRequest("1.0", "antcloud.monitor.usergroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsergroupResponse({}));
  }

  /**
   * Description: 创建通知组
   * Summary: 创建通知组
   */
  async createUsergroup(request: CreateUsergroupRequest): Promise<CreateUsergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUsergroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建通知组
   * Summary: 创建通知组
   */
  async createUsergroupEx(request: CreateUsergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUsergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUsergroupResponse>(await this.doRequest("1.0", "antcloud.monitor.usergroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUsergroupResponse({}));
  }

  /**
   * Description: 更新通知组
   * Summary: 更新通知组
   */
  async updateUsergroup(request: UpdateUsergroupRequest): Promise<UpdateUsergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUsergroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新通知组
   * Summary: 更新通知组
   */
  async updateUsergroupEx(request: UpdateUsergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUsergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUsergroupResponse>(await this.doRequest("1.0", "antcloud.monitor.usergroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUsergroupResponse({}));
  }

  /**
   * Description: 删除通知组
   * Summary: 删除通知组
   */
  async deleteUsergroup(request: DeleteUsergroupRequest): Promise<DeleteUsergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUsergroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除通知组
   * Summary: 删除通知组
   */
  async deleteUsergroupEx(request: DeleteUsergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUsergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUsergroupResponse>(await this.doRequest("1.0", "antcloud.monitor.usergroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUsergroupResponse({}));
  }

  /**
   * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
   * Summary: 查询过去某一时段内的告警趋势
   */
  async queryAlarmTrend(request: QueryAlarmTrendRequest): Promise<QueryAlarmTrendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmTrendEx(request, headers, runtime);
  }

  /**
   * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
   * Summary: 查询过去某一时段内的告警趋势
   */
  async queryAlarmTrendEx(request: QueryAlarmTrendRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmTrendResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmTrendResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.trend.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmTrendResponse({}));
  }

  /**
   * Description: 查询过去某一时段的告警详情
   * Summary: 查询过去某一时段的告警详情
   */
  async queryAlarmHistory(request: QueryAlarmHistoryRequest): Promise<QueryAlarmHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询过去某一时段的告警详情
   * Summary: 查询过去某一时段的告警详情
   */
  async queryAlarmHistoryEx(request: QueryAlarmHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmHistoryResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.history.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmHistoryResponse({}));
  }

  /**
   * Description: 查询告警订阅
   * Summary: 查询告警订阅
   */
  async queryAlarmSubscription(request: QueryAlarmSubscriptionRequest): Promise<QueryAlarmSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警订阅
   * Summary: 查询告警订阅
   */
  async queryAlarmSubscriptionEx(request: QueryAlarmSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmSubscriptionResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.subscription.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmSubscriptionResponse({}));
  }

  /**
   * Description: 查询某个应用监控的告警套餐
   * Summary: 查询某个应用监控的告警套餐
   */
  async queryStackAlarmrule(request: QueryStackAlarmruleRequest): Promise<QueryStackAlarmruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStackAlarmruleEx(request, headers, runtime);
  }

  /**
   * Description: 查询某个应用监控的告警套餐
   * Summary: 查询某个应用监控的告警套餐
   */
  async queryStackAlarmruleEx(request: QueryStackAlarmruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStackAlarmruleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStackAlarmruleResponse>(await this.doRequest("1.0", "antcloud.monitor.stack.alarmrule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStackAlarmruleResponse({}));
  }

  /**
   * Description: 修改自定义监控指标
   * Summary: 修改自定义监控指标
   */
  async updateCustomplugin(request: UpdateCustompluginRequest): Promise<UpdateCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCustompluginEx(request, headers, runtime);
  }

  /**
   * Description: 修改自定义监控指标
   * Summary: 修改自定义监控指标
   */
  async updateCustompluginEx(request: UpdateCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCustompluginResponse({}));
  }

  /**
   * Description: 查询 agent 安装信息列表
   * Summary: 查询 agent 安装信息列表
   */
  async queryAgent(request: QueryAgentRequest): Promise<QueryAgentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAgentEx(request, headers, runtime);
  }

  /**
   * Description: 查询 agent 安装信息列表
   * Summary: 查询 agent 安装信息列表
   */
  async queryAgentEx(request: QueryAgentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAgentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAgentResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAgentResponse({}));
  }

  /**
   * Description: 安装 agent 组件
   * Summary: 安装 agent 组件
   */
  async installAgent(request: InstallAgentRequest): Promise<InstallAgentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.installAgentEx(request, headers, runtime);
  }

  /**
   * Description: 安装 agent 组件
   * Summary: 安装 agent 组件
   */
  async installAgentEx(request: InstallAgentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InstallAgentResponse> {
    Util.validateModel(request);
    return $tea.cast<InstallAgentResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.install", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InstallAgentResponse({}));
  }

  /**
   * Description: 获取需要安装的 agent 版本
   * Summary: 获取需要安装的 agent 版本
   */
  async getAgentVersion(request: GetAgentVersionRequest): Promise<GetAgentVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAgentVersionEx(request, headers, runtime);
  }

  /**
   * Description: 获取需要安装的 agent 版本
   * Summary: 获取需要安装的 agent 版本
   */
  async getAgentVersionEx(request: GetAgentVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAgentVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAgentVersionResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.version.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAgentVersionResponse({}));
  }

  /**
   * Description:  设置默认最新agent版本
   * Summary:  设置默认最新agent版本
   */
  async enableAgentVersion(request: EnableAgentVersionRequest): Promise<EnableAgentVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableAgentVersionEx(request, headers, runtime);
  }

  /**
   * Description:  设置默认最新agent版本
   * Summary:  设置默认最新agent版本
   */
  async enableAgentVersionEx(request: EnableAgentVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableAgentVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableAgentVersionResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.version.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableAgentVersionResponse({}));
  }

  /**
   * Description: 获取当前工作空间
   * Summary: 获取当前工作空间
   */
  async getWorkspace(request: GetWorkspaceRequest): Promise<GetWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前工作空间
   * Summary: 获取当前工作空间
   */
  async getWorkspaceEx(request: GetWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.workspace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspaceResponse({}));
  }

  /**
   * Description: 获取当前租户
   * Summary: 获取当前租户
   */
  async getTenant(request: GetTenantRequest): Promise<GetTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTenantEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前租户
   * Summary: 获取当前租户
   */
  async getTenantEx(request: GetTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTenantResponse({}));
  }

  /**
   * Description: 查询核心态监控配置
   * Summary: 查询核心态监控配置
   */
  async queryKernelstackGeneratedconfig(request: QueryKernelstackGeneratedconfigRequest): Promise<QueryKernelstackGeneratedconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKernelstackGeneratedconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询核心态监控配置
   * Summary: 查询核心态监控配置
   */
  async queryKernelstackGeneratedconfigEx(request: QueryKernelstackGeneratedconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKernelstackGeneratedconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKernelstackGeneratedconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.kernelstack.generatedconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKernelstackGeneratedconfigResponse({}));
  }

  /**
   * Description: 获取阿里云开通状态
   * Summary: 获取阿里云开通状态
   */
  async getAliyunStatus(request: GetAliyunStatusRequest): Promise<GetAliyunStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAliyunStatusEx(request, headers, runtime);
  }

  /**
   * Description: 获取阿里云开通状态
   * Summary: 获取阿里云开通状态
   */
  async getAliyunStatusEx(request: GetAliyunStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAliyunStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAliyunStatusResponse>(await this.doRequest("1.0", "antcloud.monitor.aliyun.status.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAliyunStatusResponse({}));
  }

  /**
   * Description: 监控工作空间开通
   * Summary: 监控工作空间开通
   */
  async openWorkspace(request: OpenWorkspaceRequest): Promise<OpenWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 监控工作空间开通
   * Summary: 监控工作空间开通
   */
  async openWorkspaceEx(request: OpenWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.workspace.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenWorkspaceResponse({}));
  }

  /**
   * Description: 更新技术栈配置
   * Summary: 更新技术栈配置
   */
  async updateStackGeneratedconfig(request: UpdateStackGeneratedconfigRequest): Promise<UpdateStackGeneratedconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateStackGeneratedconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新技术栈配置
   * Summary: 更新技术栈配置
   */
  async updateStackGeneratedconfigEx(request: UpdateStackGeneratedconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateStackGeneratedconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateStackGeneratedconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.stack.generatedconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateStackGeneratedconfigResponse({}));
  }

  /**
   * Description: 查询用户列表
   * Summary: 查询用户列表
   */
  async queryUser(request: QueryUserRequest): Promise<QueryUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户列表
   * Summary: 查询用户列表
   */
  async queryUserEx(request: QueryUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserResponse>(await this.doRequest("1.0", "antcloud.monitor.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserResponse({}));
  }

  /**
   * Description: 获取用户权限列表
   * Summary: 获取用户权限列表
   */
  async listAuth(request: ListAuthRequest): Promise<ListAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAuthEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户权限列表
   * Summary: 获取用户权限列表
   */
  async listAuthEx(request: ListAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAuthResponse>(await this.doRequest("1.0", "antcloud.monitor.auth.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAuthResponse({}));
  }

  /**
   * Description: 删除用户权限
   * Summary: 删除用户权限
   */
  async deleteAuth(request: DeleteAuthRequest): Promise<DeleteAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAuthEx(request, headers, runtime);
  }

  /**
   * Description: 删除用户权限
   * Summary: 删除用户权限
   */
  async deleteAuthEx(request: DeleteAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAuthResponse>(await this.doRequest("1.0", "antcloud.monitor.auth.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAuthResponse({}));
  }

  /**
   * Description: 新建用户权限
   * Summary: 新建用户权限
   */
  async createAuth(request: CreateAuthRequest): Promise<CreateAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAuthEx(request, headers, runtime);
  }

  /**
   * Description: 新建用户权限
   * Summary: 新建用户权限
   */
  async createAuthEx(request: CreateAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAuthResponse>(await this.doRequest("1.0", "antcloud.monitor.auth.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAuthResponse({}));
  }

  /**
   * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
   * Summary: 用户添加收藏资源
   */
  async batchcreateUserFavorite(request: BatchcreateUserFavoriteRequest): Promise<BatchcreateUserFavoriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateUserFavoriteEx(request, headers, runtime);
  }

  /**
   * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
   * Summary: 用户添加收藏资源
   */
  async batchcreateUserFavoriteEx(request: BatchcreateUserFavoriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateUserFavoriteResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateUserFavoriteResponse>(await this.doRequest("1.0", "antcloud.monitor.user.favorite.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateUserFavoriteResponse({}));
  }

  /**
   * Description: 批量取消收藏
   * Summary: 批量取消收藏
   */
  async batchdeleteUserFavorite(request: BatchdeleteUserFavoriteRequest): Promise<BatchdeleteUserFavoriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteUserFavoriteEx(request, headers, runtime);
  }

  /**
   * Description: 批量取消收藏
   * Summary: 批量取消收藏
   */
  async batchdeleteUserFavoriteEx(request: BatchdeleteUserFavoriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteUserFavoriteResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteUserFavoriteResponse>(await this.doRequest("1.0", "antcloud.monitor.user.favorite.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteUserFavoriteResponse({}));
  }

  /**
   * Description: 分页查询用户的操作历史
   * Summary: 查询用户的操作历史
   */
  async queryUserOperation(request: QueryUserOperationRequest): Promise<QueryUserOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserOperationEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询用户的操作历史
   * Summary: 查询用户的操作历史
   */
  async queryUserOperationEx(request: QueryUserOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserOperationResponse>(await this.doRequest("1.0", "antcloud.monitor.user.operation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserOperationResponse({}));
  }

  /**
   * Description: 新增告警订阅
   * Summary: 新增告警订阅
   */
  async createAlarmSubscription(request: CreateAlarmSubscriptionRequest): Promise<CreateAlarmSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAlarmSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 新增告警订阅
   * Summary: 新增告警订阅
   */
  async createAlarmSubscriptionEx(request: CreateAlarmSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAlarmSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAlarmSubscriptionResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.subscription.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAlarmSubscriptionResponse({}));
  }

  /**
   * Description: 取消告警订阅 (删除)
   * Summary: 取消告警订阅
   */
  async deleteAlarmSubscription(request: DeleteAlarmSubscriptionRequest): Promise<DeleteAlarmSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAlarmSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 取消告警订阅 (删除)
   * Summary: 取消告警订阅
   */
  async deleteAlarmSubscriptionEx(request: DeleteAlarmSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAlarmSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAlarmSubscriptionResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.subscription.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAlarmSubscriptionResponse({}));
  }

  /**
   * Description: 暂停告警
   * Summary: 暂停告警
   */
  async pauseAlarm(request: PauseAlarmRequest): Promise<PauseAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 暂停告警
   * Summary: 暂停告警
   */
  async pauseAlarmEx(request: PauseAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseAlarmResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseAlarmResponse({}));
  }

  /**
   * Description: 恢复告警
   * Summary: 恢复告警
   */
  async resumeAlarm(request: ResumeAlarmRequest): Promise<ResumeAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 恢复告警
   * Summary: 恢复告警
   */
  async resumeAlarmEx(request: ResumeAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeAlarmResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeAlarmResponse({}));
  }

  /**
   * Description: 拉取日志，返回LogTail
   * Summary: 拉取日志
   */
  async getLogTail(request: GetLogTailRequest): Promise<GetLogTailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLogTailEx(request, headers, runtime);
  }

  /**
   * Description: 拉取日志，返回LogTail
   * Summary: 拉取日志
   */
  async getLogTailEx(request: GetLogTailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLogTailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLogTailResponse>(await this.doRequest("1.0", "antcloud.monitor.log.tail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLogTailResponse({}));
  }

  /**
   * Description: 获取文件浏览结果
   * Summary: 获取文件浏览结果
   */
  async getLogBrowser(request: GetLogBrowserRequest): Promise<GetLogBrowserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLogBrowserEx(request, headers, runtime);
  }

  /**
   * Description: 获取文件浏览结果
   * Summary: 获取文件浏览结果
   */
  async getLogBrowserEx(request: GetLogBrowserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLogBrowserResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLogBrowserResponse>(await this.doRequest("1.0", "antcloud.monitor.log.browser.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLogBrowserResponse({}));
  }

  /**
   * Description: 按ID删除文件夹
   * Summary: 删除文件夹
   */
  async deleteFolder(request: DeleteFolderRequest): Promise<DeleteFolderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFolderEx(request, headers, runtime);
  }

  /**
   * Description: 按ID删除文件夹
   * Summary: 删除文件夹
   */
  async deleteFolderEx(request: DeleteFolderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFolderResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFolderResponse>(await this.doRequest("1.0", "antcloud.monitor.folder.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFolderResponse({}));
  }

  /**
   * Description: 获取总览页应用统计信息
   * Summary: 获取总览页应用统计信息
   */
  async getAppOverview(request: GetAppOverviewRequest): Promise<GetAppOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppOverviewEx(request, headers, runtime);
  }

  /**
   * Description: 获取总览页应用统计信息
   * Summary: 获取总览页应用统计信息
   */
  async getAppOverviewEx(request: GetAppOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppOverviewResponse>(await this.doRequest("1.0", "antcloud.monitor.app.overview.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppOverviewResponse({}));
  }

  /**
   * Description: 查询统一告警历史记录
   * Summary: 查询统一告警历史记录
   */
  async queryUnifiedalarmHistory(request: QueryUnifiedalarmHistoryRequest): Promise<QueryUnifiedalarmHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询统一告警历史记录
   * Summary: 查询统一告警历史记录
   */
  async queryUnifiedalarmHistoryEx(request: QueryUnifiedalarmHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmHistoryResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.history.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmHistoryResponse({}));
  }

  /**
   * Description: 测试演示
   * Summary: 测试演示
   */
  async getAlarmTest(request: GetAlarmTestRequest): Promise<GetAlarmTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAlarmTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试演示
   * Summary: 测试演示
   */
  async getAlarmTestEx(request: GetAlarmTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAlarmTestResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAlarmTestResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.test.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAlarmTestResponse({}));
  }

  /**
   * Description: 获取webhook列表
   * Summary: 获取webhook列表
   */
  async queryAlarmwebhook(request: QueryAlarmwebhookRequest): Promise<QueryAlarmwebhookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmwebhookEx(request, headers, runtime);
  }

  /**
   * Description: 获取webhook列表
   * Summary: 获取webhook列表
   */
  async queryAlarmwebhookEx(request: QueryAlarmwebhookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmwebhookResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmwebhookResponse>(await this.doRequest("1.0", "antcloud.monitor.alarmwebhook.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmwebhookResponse({}));
  }

  /**
   * Description: 创建告警规则
   * Summary: 创建告警规则
   */
  async createUnifiedalarmRule(request: CreateUnifiedalarmRuleRequest): Promise<CreateUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 创建告警规则
   * Summary: 创建告警规则
   */
  async createUnifiedalarmRuleEx(request: CreateUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 更新告警规则
   * Summary: 更新告警规则
   */
  async updateUnifiedalarmRule(request: UpdateUnifiedalarmRuleRequest): Promise<UpdateUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 更新告警规则
   * Summary: 更新告警规则
   */
  async updateUnifiedalarmRuleEx(request: UpdateUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 查询告警规则列表
   * Summary: 查询告警规则列表
   */
  async queryUnifiedalarmRule(request: QueryUnifiedalarmRuleRequest): Promise<QueryUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警规则列表
   * Summary: 查询告警规则列表
   */
  async queryUnifiedalarmRuleEx(request: QueryUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 查询告警规则详情
   * Summary: 查询告警规则详情
   */
  async getUnifiedalarmRule(request: GetUnifiedalarmRuleRequest): Promise<GetUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警规则详情
   * Summary: 查询告警规则详情
   */
  async getUnifiedalarmRuleEx(request: GetUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 删除告警规则
   * Summary: 删除告警规则
   */
  async deleteUnifiedalarmRule(request: DeleteUnifiedalarmRuleRequest): Promise<DeleteUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 删除告警规则
   * Summary: 删除告警规则
   */
  async deleteUnifiedalarmRuleEx(request: DeleteUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 查询告警消息历史
   * Summary: 查询告警消息历史
   */
  async queryUnifiedalarmNotifyhistory(request: QueryUnifiedalarmNotifyhistoryRequest): Promise<QueryUnifiedalarmNotifyhistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmNotifyhistoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警消息历史
   * Summary: 查询告警消息历史
   */
  async queryUnifiedalarmNotifyhistoryEx(request: QueryUnifiedalarmNotifyhistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmNotifyhistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmNotifyhistoryResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.notifyhistory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmNotifyhistoryResponse({}));
  }

  /**
   * Description: 批量订阅告警
   * Summary: 批量订阅告警
   */
  async batchcreateUnifiedalarmSub(request: BatchcreateUnifiedalarmSubRequest): Promise<BatchcreateUnifiedalarmSubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateUnifiedalarmSubEx(request, headers, runtime);
  }

  /**
   * Description: 批量订阅告警
   * Summary: 批量订阅告警
   */
  async batchcreateUnifiedalarmSubEx(request: BatchcreateUnifiedalarmSubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateUnifiedalarmSubResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateUnifiedalarmSubResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateUnifiedalarmSubResponse({}));
  }

  /**
   * Description: 取消订阅
   * Summary: 批量取消订阅
   */
  async deleteUnifiedalarmSub(request: DeleteUnifiedalarmSubRequest): Promise<DeleteUnifiedalarmSubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUnifiedalarmSubEx(request, headers, runtime);
  }

  /**
   * Description: 取消订阅
   * Summary: 批量取消订阅
   */
  async deleteUnifiedalarmSubEx(request: DeleteUnifiedalarmSubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUnifiedalarmSubResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUnifiedalarmSubResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUnifiedalarmSubResponse({}));
  }

  /**
   * Description: 查询告警订阅关系列表
   * Summary: 查询告警订阅关系列表
   */
  async queryUnifiedalarmSub(request: QueryUnifiedalarmSubRequest): Promise<QueryUnifiedalarmSubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmSubEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警订阅关系列表
   * Summary: 查询告警订阅关系列表
   */
  async queryUnifiedalarmSubEx(request: QueryUnifiedalarmSubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmSubResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmSubResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.sub.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmSubResponse({}));
  }

  /**
   * Description: 创建告警规则模板
   * Summary: 创建告警规则模板
   */
  async createUnifiedalarmTpl(request: CreateUnifiedalarmTplRequest): Promise<CreateUnifiedalarmTplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnifiedalarmTplEx(request, headers, runtime);
  }

  /**
   * Description: 创建告警规则模板
   * Summary: 创建告警规则模板
   */
  async createUnifiedalarmTplEx(request: CreateUnifiedalarmTplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnifiedalarmTplResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnifiedalarmTplResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnifiedalarmTplResponse({}));
  }

  /**
   * Description: 更新告警规则模板
   * Summary: 更新告警规则模板
   */
  async updateUnifiedalarmTpl(request: UpdateUnifiedalarmTplRequest): Promise<UpdateUnifiedalarmTplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUnifiedalarmTplEx(request, headers, runtime);
  }

  /**
   * Description: 更新告警规则模板
   * Summary: 更新告警规则模板
   */
  async updateUnifiedalarmTplEx(request: UpdateUnifiedalarmTplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUnifiedalarmTplResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUnifiedalarmTplResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUnifiedalarmTplResponse({}));
  }

  /**
   * Description: 查询告警规则模板列表
   * Summary: 查询告警规则模板列表
   */
  async queryUnifiedalarmTpl(request: QueryUnifiedalarmTplRequest): Promise<QueryUnifiedalarmTplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmTplEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警规则模板列表
   * Summary: 查询告警规则模板列表
   */
  async queryUnifiedalarmTplEx(request: QueryUnifiedalarmTplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmTplResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmTplResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmTplResponse({}));
  }

  /**
   * Description: 查询告警规则模板详情
   * Summary: 查询告警规则模板详情
   */
  async getUnifiedalarmTpl(request: GetUnifiedalarmTplRequest): Promise<GetUnifiedalarmTplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnifiedalarmTplEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警规则模板详情
   * Summary: 查询告警规则模板详情
   */
  async getUnifiedalarmTplEx(request: GetUnifiedalarmTplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnifiedalarmTplResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnifiedalarmTplResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnifiedalarmTplResponse({}));
  }

  /**
   * Description: 删除告警规则模板
   * Summary: 删除告警规则模板
   */
  async deleteUnifiedalarmTpl(request: DeleteUnifiedalarmTplRequest): Promise<DeleteUnifiedalarmTplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUnifiedalarmTplEx(request, headers, runtime);
  }

  /**
   * Description: 删除告警规则模板
   * Summary: 删除告警规则模板
   */
  async deleteUnifiedalarmTplEx(request: DeleteUnifiedalarmTplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUnifiedalarmTplResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUnifiedalarmTplResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.tpl.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUnifiedalarmTplResponse({}));
  }

  /**
   * Description: 暂停/开启告警规则
   * Summary: 暂停告警规则
   */
  async switchUnifiedalarmRule(request: SwitchUnifiedalarmRuleRequest): Promise<SwitchUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 暂停/开启告警规则
   * Summary: 暂停告警规则
   */
  async switchUnifiedalarmRuleEx(request: SwitchUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 根据资源类型获取告警订阅列表
   * Summary: 获取告警订阅列表
   */
  async listAlarmSubscription(request: ListAlarmSubscriptionRequest): Promise<ListAlarmSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAlarmSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 根据资源类型获取告警订阅列表
   * Summary: 获取告警订阅列表
   */
  async listAlarmSubscriptionEx(request: ListAlarmSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAlarmSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAlarmSubscriptionResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.subscription.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAlarmSubscriptionResponse({}));
  }

  /**
   * Description: 更新告警订阅
   * Summary: 更新告警订阅
   */
  async updateAlarmSubscription(request: UpdateAlarmSubscriptionRequest): Promise<UpdateAlarmSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAlarmSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 更新告警订阅
   * Summary: 更新告警订阅
   */
  async updateAlarmSubscriptionEx(request: UpdateAlarmSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAlarmSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAlarmSubscriptionResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.subscription.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAlarmSubscriptionResponse({}));
  }

  /**
   * Description: 查询 custom plugin 列表
   * Summary: 查询 custom plugin 列表
   */
  async listCustomplugin(request: ListCustompluginRequest): Promise<ListCustompluginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCustompluginEx(request, headers, runtime);
  }

  /**
   * Description: 查询 custom plugin 列表
   * Summary: 查询 custom plugin 列表
   */
  async listCustompluginEx(request: ListCustompluginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCustompluginResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCustompluginResponse>(await this.doRequest("1.0", "antcloud.monitor.customplugin.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCustompluginResponse({}));
  }

  /**
   * Description: 查询事件列表
   * Summary: 查询事件列表
   */
  async queryUnifiedalarmEvent(request: QueryUnifiedalarmEventRequest): Promise<QueryUnifiedalarmEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmEventEx(request, headers, runtime);
  }

  /**
   * Description: 查询事件列表
   * Summary: 查询事件列表
   */
  async queryUnifiedalarmEventEx(request: QueryUnifiedalarmEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmEventResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmEventResponse({}));
  }

  /**
   * Description: 告警指标查询
   * Summary: 告警指标查询
   */
  async queryUnifiedalarmMetrics(request: QueryUnifiedalarmMetricsRequest): Promise<QueryUnifiedalarmMetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmMetricsEx(request, headers, runtime);
  }

  /**
   * Description: 告警指标查询
   * Summary: 告警指标查询
   */
  async queryUnifiedalarmMetricsEx(request: QueryUnifiedalarmMetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmMetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmMetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.metrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmMetricsResponse({}));
  }

  /**
   * Description: 批量创建告警历史
   * Summary: 批量创建告警历史
   */
  async batchcreateUnifiedalarmHistory(request: BatchcreateUnifiedalarmHistoryRequest): Promise<BatchcreateUnifiedalarmHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateUnifiedalarmHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建告警历史
   * Summary: 批量创建告警历史
   */
  async batchcreateUnifiedalarmHistoryEx(request: BatchcreateUnifiedalarmHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateUnifiedalarmHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateUnifiedalarmHistoryResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.history.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateUnifiedalarmHistoryResponse({}));
  }

  /**
   * Description: 根据模板批量创建规则
   * Summary: 根据模板批量创建规则
   */
  async batchcreateUnifiedalarmRule(request: BatchcreateUnifiedalarmRuleRequest): Promise<BatchcreateUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 根据模板批量创建规则
   * Summary: 根据模板批量创建规则
   */
  async batchcreateUnifiedalarmRuleEx(request: BatchcreateUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: 告警事件统计信息
   * Summary: 告警事件统计信息
   */
  async queryUnifiedalarmEventstat(request: QueryUnifiedalarmEventstatRequest): Promise<QueryUnifiedalarmEventstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmEventstatEx(request, headers, runtime);
  }

  /**
   * Description: 告警事件统计信息
   * Summary: 告警事件统计信息
   */
  async queryUnifiedalarmEventstatEx(request: QueryUnifiedalarmEventstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmEventstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmEventstatResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.eventstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmEventstatResponse({}));
  }

  /**
   * Description: 通知历史统计
   * Summary: 通知历史统计
   */
  async queryUnifiedalarmNotifystat(request: QueryUnifiedalarmNotifystatRequest): Promise<QueryUnifiedalarmNotifystatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmNotifystatEx(request, headers, runtime);
  }

  /**
   * Description: 通知历史统计
   * Summary: 通知历史统计
   */
  async queryUnifiedalarmNotifystatEx(request: QueryUnifiedalarmNotifystatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmNotifystatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmNotifystatResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.notifystat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmNotifystatResponse({}));
  }

  /**
   * Description: 查询主机ip列表
   * Summary: 查询主机ip列表
   */
  async queryMetaNode(request: QueryMetaNodeRequest): Promise<QueryMetaNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetaNodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询主机ip列表
   * Summary: 查询主机ip列表
   */
  async queryMetaNodeEx(request: QueryMetaNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetaNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetaNodeResponse>(await this.doRequest("1.0", "antcloud.monitor.meta.node.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetaNodeResponse({}));
  }

  /**
   * Description: 批量删除告警规则
   * Summary: 批量删除告警规则
   */
  async batchdeleteUnifiedalarmRule(request: BatchdeleteUnifiedalarmRuleRequest): Promise<BatchdeleteUnifiedalarmRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteUnifiedalarmRuleEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除告警规则
   * Summary: 批量删除告警规则
   */
  async batchdeleteUnifiedalarmRuleEx(request: BatchdeleteUnifiedalarmRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteUnifiedalarmRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteUnifiedalarmRuleResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rule.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteUnifiedalarmRuleResponse({}));
  }

  /**
   * Description: dashboard创建
   * Summary: dashboard创建
   */
  async createXdashboard(request: CreateXdashboardRequest): Promise<CreateXdashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createXdashboardEx(request, headers, runtime);
  }

  /**
   * Description: dashboard创建
   * Summary: dashboard创建
   */
  async createXdashboardEx(request: CreateXdashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateXdashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateXdashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateXdashboardResponse({}));
  }

  /**
   * Description: dashboard更新
   * Summary: dashboard更新
   */
  async updateXdashboard(request: UpdateXdashboardRequest): Promise<UpdateXdashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateXdashboardEx(request, headers, runtime);
  }

  /**
   * Description: dashboard更新
   * Summary: dashboard更新
   */
  async updateXdashboardEx(request: UpdateXdashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateXdashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateXdashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateXdashboardResponse({}));
  }

  /**
   * Description: dashboard查询
   * Summary: dashboard查询
   */
  async queryXdashboard(request: QueryXdashboardRequest): Promise<QueryXdashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdashboardEx(request, headers, runtime);
  }

  /**
   * Description: dashboard查询
   * Summary: dashboard查询
   */
  async queryXdashboardEx(request: QueryXdashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdashboardResponse({}));
  }

  /**
   * Description: dashboard目录列表
   * Summary: dashboard目录列表
   */
  async listXdashboardDirectory(request: ListXdashboardDirectoryRequest): Promise<ListXdashboardDirectoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listXdashboardDirectoryEx(request, headers, runtime);
  }

  /**
   * Description: dashboard目录列表
   * Summary: dashboard目录列表
   */
  async listXdashboardDirectoryEx(request: ListXdashboardDirectoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListXdashboardDirectoryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListXdashboardDirectoryResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.directory.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListXdashboardDirectoryResponse({}));
  }

  /**
   * Description: dashboard删除。
  单个dashboard删除或者整个目录删除
   * Summary: dashboard删除
   */
  async deleteXdashboard(request: DeleteXdashboardRequest): Promise<DeleteXdashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteXdashboardEx(request, headers, runtime);
  }

  /**
   * Description: dashboard删除。
  单个dashboard删除或者整个目录删除
   * Summary: dashboard删除
   */
  async deleteXdashboardEx(request: DeleteXdashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteXdashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteXdashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteXdashboardResponse({}));
  }

  /**
   * Description: instant query
   * Summary: instant query
   */
  async queryXmetricInstant(request: QueryXmetricInstantRequest): Promise<QueryXmetricInstantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricInstantEx(request, headers, runtime);
  }

  /**
   * Description: instant query
   * Summary: instant query
   */
  async queryXmetricInstantEx(request: QueryXmetricInstantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricInstantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricInstantResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetric.instant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricInstantResponse({}));
  }

  /**
   * Description: range query
   * Summary: range query
   */
  async queryXmetricRange(request: QueryXmetricRangeRequest): Promise<QueryXmetricRangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricRangeEx(request, headers, runtime);
  }

  /**
   * Description: range query
   * Summary: range query
   */
  async queryXmetricRangeEx(request: QueryXmetricRangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricRangeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricRangeResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetric.range.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricRangeResponse({}));
  }

  /**
   * Description: datasource metric
   * Summary: datasource metric
   */
  async queryXmetricdatasourceInstant(request: QueryXmetricdatasourceInstantRequest): Promise<QueryXmetricdatasourceInstantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricdatasourceInstantEx(request, headers, runtime);
  }

  /**
   * Description: datasource metric
   * Summary: datasource metric
   */
  async queryXmetricdatasourceInstantEx(request: QueryXmetricdatasourceInstantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricdatasourceInstantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricdatasourceInstantResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetricdatasource.instant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricdatasourceInstantResponse({}));
  }

  /**
   * Description: datasource metric
   * Summary: datasource metric
   */
  async queryXmetricdatasourceRange(request: QueryXmetricdatasourceRangeRequest): Promise<QueryXmetricdatasourceRangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricdatasourceRangeEx(request, headers, runtime);
  }

  /**
   * Description: datasource metric
   * Summary: datasource metric
   */
  async queryXmetricdatasourceRangeEx(request: QueryXmetricdatasourceRangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricdatasourceRangeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricdatasourceRangeResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetricdatasource.range.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricdatasourceRangeResponse({}));
  }

  /**
   * Description: metric tag keys
   * Summary: metric tag keys
   */
  async queryXmetrictagKey(request: QueryXmetrictagKeyRequest): Promise<QueryXmetrictagKeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetrictagKeyEx(request, headers, runtime);
  }

  /**
   * Description: metric tag keys
   * Summary: metric tag keys
   */
  async queryXmetrictagKeyEx(request: QueryXmetrictagKeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetrictagKeyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetrictagKeyResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetrictag.key.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetrictagKeyResponse({}));
  }

  /**
   * Description: metric tag values
   * Summary: metric tag values
   */
  async queryXmetrictagValue(request: QueryXmetrictagValueRequest): Promise<QueryXmetrictagValueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetrictagValueEx(request, headers, runtime);
  }

  /**
   * Description: metric tag values
   * Summary: metric tag values
   */
  async queryXmetrictagValueEx(request: QueryXmetrictagValueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetrictagValueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetrictagValueResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetrictag.value.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetrictagValueResponse({}));
  }

  /**
   * Description: 日志脱敏类型列表查询
   * Summary: 日志脱敏类型列表查询
   */
  async listLogserviceDesenstypes(request: ListLogserviceDesenstypesRequest): Promise<ListLogserviceDesenstypesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLogserviceDesenstypesEx(request, headers, runtime);
  }

  /**
   * Description: 日志脱敏类型列表查询
   * Summary: 日志脱敏类型列表查询
   */
  async listLogserviceDesenstypesEx(request: ListLogserviceDesenstypesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLogserviceDesenstypesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLogserviceDesenstypesResponse>(await this.doRequest("1.0", "antcloud.monitor.logservice.desenstypes.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLogserviceDesenstypesResponse({}));
  }

  /**
   * Description: 日志脱敏配置查询
   * Summary: 日志脱敏配置查询
   */
  async getLogserviceDesensconfig(request: GetLogserviceDesensconfigRequest): Promise<GetLogserviceDesensconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLogserviceDesensconfigEx(request, headers, runtime);
  }

  /**
   * Description: 日志脱敏配置查询
   * Summary: 日志脱敏配置查询
   */
  async getLogserviceDesensconfigEx(request: GetLogserviceDesensconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLogserviceDesensconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLogserviceDesensconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.logservice.desensconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLogserviceDesensconfigResponse({}));
  }

  /**
   * Description: 日志脱敏配置更新
   * Summary: 日志脱敏配置更新
   */
  async updateLogserviceDesensconfig(request: UpdateLogserviceDesensconfigRequest): Promise<UpdateLogserviceDesensconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLogserviceDesensconfigEx(request, headers, runtime);
  }

  /**
   * Description: 日志脱敏配置更新
   * Summary: 日志脱敏配置更新
   */
  async updateLogserviceDesensconfigEx(request: UpdateLogserviceDesensconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLogserviceDesensconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLogserviceDesensconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.logservice.desensconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLogserviceDesensconfigResponse({}));
  }

  /**
   * Description: 获取登录用户信息
   * Summary: 获取登录用户信息
   */
  async detailUser(request: DetailUserRequest): Promise<DetailUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailUserEx(request, headers, runtime);
  }

  /**
   * Description: 获取登录用户信息
   * Summary: 获取登录用户信息
   */
  async detailUserEx(request: DetailUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailUserResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailUserResponse>(await this.doRequest("1.0", "antcloud.monitor.user.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailUserResponse({}));
  }

  /**
   * Description: 通过登录名获取鉴权
   * Summary: 通过登录名获取鉴权
   */
  async authUser(request: AuthUserRequest): Promise<AuthUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authUserEx(request, headers, runtime);
  }

  /**
   * Description: 通过登录名获取鉴权
   * Summary: 通过登录名获取鉴权
   */
  async authUserEx(request: AuthUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthUserResponse>(await this.doRequest("1.0", "antcloud.monitor.user.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthUserResponse({}));
  }

  /**
   * Description: 获取持久化日志路径级别的监控数据
   * Summary: 持久化日志监控
   */
  async queryLogpathMetrics(request: QueryLogpathMetricsRequest): Promise<QueryLogpathMetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLogpathMetricsEx(request, headers, runtime);
  }

  /**
   * Description: 获取持久化日志路径级别的监控数据
   * Summary: 持久化日志监控
   */
  async queryLogpathMetricsEx(request: QueryLogpathMetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLogpathMetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLogpathMetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.logpath.metrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLogpathMetricsResponse({}));
  }

  /**
   * Description: query metric names
   * Summary: query metric names
   */
  async queryXmetricName(request: QueryXmetricNameRequest): Promise<QueryXmetricNameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricNameEx(request, headers, runtime);
  }

  /**
   * Description: query metric names
   * Summary: query metric names
   */
  async queryXmetricNameEx(request: QueryXmetricNameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricNameResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricNameResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetric.name.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricNameResponse({}));
  }

  /**
   * Description: 创建alarmwebhook
   * Summary: 创建alarmwebhook
   */
  async createAlarmwebhook(request: CreateAlarmwebhookRequest): Promise<CreateAlarmwebhookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAlarmwebhookEx(request, headers, runtime);
  }

  /**
   * Description: 创建alarmwebhook
   * Summary: 创建alarmwebhook
   */
  async createAlarmwebhookEx(request: CreateAlarmwebhookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAlarmwebhookResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAlarmwebhookResponse>(await this.doRequest("1.0", "antcloud.monitor.alarmwebhook.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAlarmwebhookResponse({}));
  }

  /**
   * Description: datasource 创建
   * Summary: datasource 创建
   */
  async createXdatasource(request: CreateXdatasourceRequest): Promise<CreateXdatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createXdatasourceEx(request, headers, runtime);
  }

  /**
   * Description: datasource 创建
   * Summary: datasource 创建
   */
  async createXdatasourceEx(request: CreateXdatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateXdatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateXdatasourceResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateXdatasourceResponse({}));
  }

  /**
   * Description:  
   * Summary: datasource update
   */
  async updateXdatasource(request: UpdateXdatasourceRequest): Promise<UpdateXdatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateXdatasourceEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: datasource update
   */
  async updateXdatasourceEx(request: UpdateXdatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateXdatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateXdatasourceResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateXdatasourceResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async getXdatasource(request: GetXdatasourceRequest): Promise<GetXdatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getXdatasourceEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async getXdatasourceEx(request: GetXdatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetXdatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetXdatasourceResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetXdatasourceResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async deleteXdatasource(request: DeleteXdatasourceRequest): Promise<DeleteXdatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteXdatasourceEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async deleteXdatasourceEx(request: DeleteXdatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteXdatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteXdatasourceResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteXdatasourceResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async listXdatasourceDirectory(request: ListXdatasourceDirectoryRequest): Promise<ListXdatasourceDirectoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listXdatasourceDirectoryEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async listXdatasourceDirectoryEx(request: ListXdatasourceDirectoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListXdatasourceDirectoryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListXdatasourceDirectoryResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.directory.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListXdatasourceDirectoryResponse({}));
  }

  /**
   * Description: 更新alarmwebhook
   * Summary: 更新alarmwebhook
   */
  async updateAlarmwebhook(request: UpdateAlarmwebhookRequest): Promise<UpdateAlarmwebhookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAlarmwebhookEx(request, headers, runtime);
  }

  /**
   * Description: 更新alarmwebhook
   * Summary: 更新alarmwebhook
   */
  async updateAlarmwebhookEx(request: UpdateAlarmwebhookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAlarmwebhookResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAlarmwebhookResponse>(await this.doRequest("1.0", "antcloud.monitor.alarmwebhook.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAlarmwebhookResponse({}));
  }

  /**
   * Description: 删除alarmwebhook
   * Summary: 删除alarmwebhook
   */
  async deleteAlarmwebhook(request: DeleteAlarmwebhookRequest): Promise<DeleteAlarmwebhookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAlarmwebhookEx(request, headers, runtime);
  }

  /**
   * Description: 删除alarmwebhook
   * Summary: 删除alarmwebhook
   */
  async deleteAlarmwebhookEx(request: DeleteAlarmwebhookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAlarmwebhookResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAlarmwebhookResponse>(await this.doRequest("1.0", "antcloud.monitor.alarmwebhook.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAlarmwebhookResponse({}));
  }

  /**
   * Description: datasource table
   * Summary: datasource table
   */
  async queryXdatasourceTable(request: QueryXdatasourceTableRequest): Promise<QueryXdatasourceTableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdatasourceTableEx(request, headers, runtime);
  }

  /**
   * Description: datasource table
   * Summary: datasource table
   */
  async queryXdatasourceTableEx(request: QueryXdatasourceTableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdatasourceTableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdatasourceTableResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.table.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdatasourceTableResponse({}));
  }

  /**
   * Description: 告警总览
   * Summary: 告警总览
   */
  async getAlarmOverview(request: GetAlarmOverviewRequest): Promise<GetAlarmOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAlarmOverviewEx(request, headers, runtime);
  }

  /**
   * Description: 告警总览
   * Summary: 告警总览
   */
  async getAlarmOverviewEx(request: GetAlarmOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAlarmOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAlarmOverviewResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.overview.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAlarmOverviewResponse({}));
  }

  /**
   * Description: 查询应用的告警数据
   * Summary: 查询应用的告警数据
   */
  async queryAppAlarmstats(request: QueryAppAlarmstatsRequest): Promise<QueryAppAlarmstatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppAlarmstatsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的告警数据
   * Summary: 查询应用的告警数据
   */
  async queryAppAlarmstatsEx(request: QueryAppAlarmstatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppAlarmstatsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppAlarmstatsResponse>(await this.doRequest("1.0", "antcloud.monitor.app.alarmstats.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppAlarmstatsResponse({}));
  }

  /**
   * Description: 告警趋势
   * Summary: 告警趋势
   */
  async queryAlarmhistoryAlarmtrends(request: QueryAlarmhistoryAlarmtrendsRequest): Promise<QueryAlarmhistoryAlarmtrendsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmhistoryAlarmtrendsEx(request, headers, runtime);
  }

  /**
   * Description: 告警趋势
   * Summary: 告警趋势
   */
  async queryAlarmhistoryAlarmtrendsEx(request: QueryAlarmhistoryAlarmtrendsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmhistoryAlarmtrendsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmhistoryAlarmtrendsResponse>(await this.doRequest("1.0", "antcloud.monitor.alarmhistory.alarmtrends.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmhistoryAlarmtrendsResponse({}));
  }

  /**
   * Description: 获取workspace的配置
   * Summary: 获取workspace的配置
   */
  async getWorkspaceConfig(request: GetWorkspaceConfigRequest): Promise<GetWorkspaceConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspaceConfigEx(request, headers, runtime);
  }

  /**
   * Description: 获取workspace的配置
   * Summary: 获取workspace的配置
   */
  async getWorkspaceConfigEx(request: GetWorkspaceConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspaceConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspaceConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.workspace.config.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspaceConfigResponse({}));
  }

  /**
   * Description: Agent版本策略配置
   * Summary: Agent版本策略配置
   */
  async setAgentVersionstrategy(request: SetAgentVersionstrategyRequest): Promise<SetAgentVersionstrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setAgentVersionstrategyEx(request, headers, runtime);
  }

  /**
   * Description: Agent版本策略配置
   * Summary: Agent版本策略配置
   */
  async setAgentVersionstrategyEx(request: SetAgentVersionstrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetAgentVersionstrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<SetAgentVersionstrategyResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.versionstrategy.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetAgentVersionstrategyResponse({}));
  }

  /**
   * Description: 获取agent版本策略详情
   * Summary: 获取agent版本策略详情
   */
  async getAgentVersionstrategy(request: GetAgentVersionstrategyRequest): Promise<GetAgentVersionstrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAgentVersionstrategyEx(request, headers, runtime);
  }

  /**
   * Description: 获取agent版本策略详情
   * Summary: 获取agent版本策略详情
   */
  async getAgentVersionstrategyEx(request: GetAgentVersionstrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAgentVersionstrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAgentVersionstrategyResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.versionstrategy.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAgentVersionstrategyResponse({}));
  }

  /**
   * Description: 获取服务器系统时间
   * Summary: 获取服务器系统时间
   */
  async getSystemTime(request: GetSystemTimeRequest): Promise<GetSystemTimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSystemTimeEx(request, headers, runtime);
  }

  /**
   * Description: 获取服务器系统时间
   * Summary: 获取服务器系统时间
   */
  async getSystemTimeEx(request: GetSystemTimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSystemTimeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSystemTimeResponse>(await this.doRequest("1.0", "antcloud.monitor.system.time.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSystemTimeResponse({}));
  }

  /**
   * Description: move datasource
   * Summary: move datasource
   */
  async execXdatasourceMove(request: ExecXdatasourceMoveRequest): Promise<ExecXdatasourceMoveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execXdatasourceMoveEx(request, headers, runtime);
  }

  /**
   * Description: move datasource
   * Summary: move datasource
   */
  async execXdatasourceMoveEx(request: ExecXdatasourceMoveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecXdatasourceMoveResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecXdatasourceMoveResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.move.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecXdatasourceMoveResponse({}));
  }

  /**
   * Description: metadata default tags
   * Summary: default tags
   */
  async queryXmetadataTag(request: QueryXmetadataTagRequest): Promise<QueryXmetadataTagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetadataTagEx(request, headers, runtime);
  }

  /**
   * Description: metadata default tags
   * Summary: default tags
   */
  async queryXmetadataTagEx(request: QueryXmetadataTagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetadataTagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetadataTagResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetadata.tag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetadataTagResponse({}));
  }

  /**
   * Description: search datasource
   * Summary: search datasource
   */
  async queryXdatasourceSearch(request: QueryXdatasourceSearchRequest): Promise<QueryXdatasourceSearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdatasourceSearchEx(request, headers, runtime);
  }

  /**
   * Description: search datasource
   * Summary: search datasource
   */
  async queryXdatasourceSearchEx(request: QueryXdatasourceSearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdatasourceSearchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdatasourceSearchResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.search.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdatasourceSearchResponse({}));
  }

  /**
   * Description:  
   * Summary: query setup config
   */
  async querySetupConfig(request: QuerySetupConfigRequest): Promise<QuerySetupConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySetupConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: query setup config
   */
  async querySetupConfigEx(request: QuerySetupConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySetupConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySetupConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.setup.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySetupConfigResponse({}));
  }

  /**
   * Description:  
   * Summary: update or insert 
   */
  async updateSetupConfig(request: UpdateSetupConfigRequest): Promise<UpdateSetupConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSetupConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: update or insert 
   */
  async updateSetupConfigEx(request: UpdateSetupConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSetupConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSetupConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.setup.config.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSetupConfigResponse({}));
  }

  /**
   * Description:  
   * Summary: delete config
   */
  async deleteSetupConfig(request: DeleteSetupConfigRequest): Promise<DeleteSetupConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSetupConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: delete config
   */
  async deleteSetupConfigEx(request: DeleteSetupConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSetupConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSetupConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.setup.config.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSetupConfigResponse({}));
  }

  /**
   * Description: 告警开关配置更新
   * Summary: 告警开关配置更新
   */
  async updateWorkspaceSetting(request: UpdateWorkspaceSettingRequest): Promise<UpdateWorkspaceSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWorkspaceSettingEx(request, headers, runtime);
  }

  /**
   * Description: 告警开关配置更新
   * Summary: 告警开关配置更新
   */
  async updateWorkspaceSettingEx(request: UpdateWorkspaceSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWorkspaceSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWorkspaceSettingResponse>(await this.doRequest("1.0", "antcloud.monitor.workspace.setting.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWorkspaceSettingResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async exportXsiteConfig(request: ExportXsiteConfigRequest): Promise<ExportXsiteConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportXsiteConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async exportXsiteConfigEx(request: ExportXsiteConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportXsiteConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportXsiteConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.xsite.config.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportXsiteConfigResponse({}));
  }

  /**
   * Description:  
   * Summary: import
   */
  async importXsiteConfig(request: ImportXsiteConfigRequest): Promise<ImportXsiteConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importXsiteConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: import
   */
  async importXsiteConfigEx(request: ImportXsiteConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportXsiteConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportXsiteConfigResponse>(await this.doRequest("1.0", "antcloud.monitor.xsite.config.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportXsiteConfigResponse({}));
  }

  /**
   * Description:  
   * Summary: tree
   */
  async queryXdatasourceTree(request: QueryXdatasourceTreeRequest): Promise<QueryXdatasourceTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdatasourceTreeEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: tree
   */
  async queryXdatasourceTreeEx(request: QueryXdatasourceTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdatasourceTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdatasourceTreeResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.tree.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdatasourceTreeResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async queryXdashboardTree(request: QueryXdashboardTreeRequest): Promise<QueryXdashboardTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdashboardTreeEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async queryXdashboardTreeEx(request: QueryXdashboardTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdashboardTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdashboardTreeResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.tree.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdashboardTreeResponse({}));
  }

  /**
   * Description:  
   * Summary: dashboard查询
   */
  async getXdashboard(request: GetXdashboardRequest): Promise<GetXdashboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getXdashboardEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: dashboard查询
   */
  async getXdashboardEx(request: GetXdashboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetXdashboardResponse> {
    Util.validateModel(request);
    return $tea.cast<GetXdashboardResponse>(await this.doRequest("1.0", "antcloud.monitor.xdashboard.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetXdashboardResponse({}));
  }

  /**
   * Description:  
   * Summary: prometheus metrics
   */
  async queryXdatasourcePrometheus(request: QueryXdatasourcePrometheusRequest): Promise<QueryXdatasourcePrometheusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXdatasourcePrometheusEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: prometheus metrics
   */
  async queryXdatasourcePrometheusEx(request: QueryXdatasourcePrometheusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXdatasourcePrometheusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXdatasourcePrometheusResponse>(await this.doRequest("1.0", "antcloud.monitor.xdatasource.prometheus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXdatasourcePrometheusResponse({}));
  }

  /**
   * Description:  获取总览页主机统计信息
   * Summary:  获取总览页主机统计信息
   */
  async getNodeOverview(request: GetNodeOverviewRequest): Promise<GetNodeOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNodeOverviewEx(request, headers, runtime);
  }

  /**
   * Description:  获取总览页主机统计信息
   * Summary:  获取总览页主机统计信息
   */
  async getNodeOverviewEx(request: GetNodeOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNodeOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNodeOverviewResponse>(await this.doRequest("1.0", "antcloud.monitor.node.overview.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNodeOverviewResponse({}));
  }

  /**
   * Description: 总览页配置信息统计
   * Summary: 总览页配置信息统计
   */
  async getConfigOverview(request: GetConfigOverviewRequest): Promise<GetConfigOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigOverviewEx(request, headers, runtime);
  }

  /**
   * Description: 总览页配置信息统计
   * Summary: 总览页配置信息统计
   */
  async getConfigOverviewEx(request: GetConfigOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigOverviewResponse>(await this.doRequest("1.0", "antcloud.monitor.config.overview.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigOverviewResponse({}));
  }

  /**
   * Description: 获取workspace具体配置
   * Summary: 获取workspace具体配置
   */
  async getWorkspaceSetting(request: GetWorkspaceSettingRequest): Promise<GetWorkspaceSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspaceSettingEx(request, headers, runtime);
  }

  /**
   * Description: 获取workspace具体配置
   * Summary: 获取workspace具体配置
   */
  async getWorkspaceSettingEx(request: GetWorkspaceSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspaceSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspaceSettingResponse>(await this.doRequest("1.0", "antcloud.monitor.workspace.setting.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspaceSettingResponse({}));
  }

  /**
   * Description: 获取链路工作空间配置
   * Summary: 获取链路工作空间配置
   */
  async listTraceWorkspacesetting(request: ListTraceWorkspacesettingRequest): Promise<ListTraceWorkspacesettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTraceWorkspacesettingEx(request, headers, runtime);
  }

  /**
   * Description: 获取链路工作空间配置
   * Summary: 获取链路工作空间配置
   */
  async listTraceWorkspacesettingEx(request: ListTraceWorkspacesettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTraceWorkspacesettingResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTraceWorkspacesettingResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTraceWorkspacesettingResponse({}));
  }

  /**
   * Description: 链路工作空间配置更新
   * Summary: 链路工作空间配置更新
   */
  async updateTraceWorkspacesetting(request: UpdateTraceWorkspacesettingRequest): Promise<UpdateTraceWorkspacesettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraceWorkspacesettingEx(request, headers, runtime);
  }

  /**
   * Description: 链路工作空间配置更新
   * Summary: 链路工作空间配置更新
   */
  async updateTraceWorkspacesettingEx(request: UpdateTraceWorkspacesettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraceWorkspacesettingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraceWorkspacesettingResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraceWorkspacesettingResponse({}));
  }

  /**
   * Description: APP配置列表
   * Summary: APP配置列表
   */
  async listAppSetting(request: ListAppSettingRequest): Promise<ListAppSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppSettingEx(request, headers, runtime);
  }

  /**
   * Description: APP配置列表
   * Summary: APP配置列表
   */
  async listAppSettingEx(request: ListAppSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppSettingResponse>(await this.doRequest("1.0", "antcloud.monitor.app.setting.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppSettingResponse({}));
  }

  /**
   * Description: 创建APP配置信息
   * Summary: 创建APP配置信息
   */
  async updateAppSetting(request: UpdateAppSettingRequest): Promise<UpdateAppSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppSettingEx(request, headers, runtime);
  }

  /**
   * Description: 创建APP配置信息
   * Summary: 创建APP配置信息
   */
  async updateAppSettingEx(request: UpdateAppSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppSettingResponse>(await this.doRequest("1.0", "antcloud.monitor.app.setting.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppSettingResponse({}));
  }

  /**
   * Description: 获取APP配置信息
   * Summary: 获取APP配置信息
   */
  async getAppSetting(request: GetAppSettingRequest): Promise<GetAppSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppSettingEx(request, headers, runtime);
  }

  /**
   * Description: 获取APP配置信息
   * Summary: 获取APP配置信息
   */
  async getAppSettingEx(request: GetAppSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppSettingResponse>(await this.doRequest("1.0", "antcloud.monitor.app.setting.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppSettingResponse({}));
  }

  /**
   * Description: 查询某一告警事件相关的告警列表
   * Summary: 查询某一告警事件相关的告警列表
   */
  async queryUnifiedalarmEventdetail(request: QueryUnifiedalarmEventdetailRequest): Promise<QueryUnifiedalarmEventdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmEventdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询某一告警事件相关的告警列表
   * Summary: 查询某一告警事件相关的告警列表
   */
  async queryUnifiedalarmEventdetailEx(request: QueryUnifiedalarmEventdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmEventdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmEventdetailResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.eventdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmEventdetailResponse({}));
  }

  /**
   * Description: 查询应用的告警指标清单
   * Summary: 查询应用的告警指标清单
   */
  async queryUnifiedalarmMonitorlist(request: QueryUnifiedalarmMonitorlistRequest): Promise<QueryUnifiedalarmMonitorlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmMonitorlistEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的告警指标清单
   * Summary: 查询应用的告警指标清单
   */
  async queryUnifiedalarmMonitorlistEx(request: QueryUnifiedalarmMonitorlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmMonitorlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmMonitorlistResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.monitorlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmMonitorlistResponse({}));
  }

  /**
   * Description:  
   * Summary:  
   */
  async queryXmetricTable(request: QueryXmetricTableRequest): Promise<QueryXmetricTableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXmetricTableEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary:  
   */
  async queryXmetricTableEx(request: QueryXmetricTableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXmetricTableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXmetricTableResponse>(await this.doRequest("1.0", "antcloud.monitor.xmetric.table.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXmetricTableResponse({}));
  }

  /**
   * Description: 查询应用的SQL调用指标
   * Summary: 查询应用的SQL调用指标
   */
  async queryTraceAppsqlmetrics(request: QueryTraceAppsqlmetricsRequest): Promise<QueryTraceAppsqlmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppsqlmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的SQL调用指标
   * Summary: 查询应用的SQL调用指标
   */
  async queryTraceAppsqlmetricsEx(request: QueryTraceAppsqlmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppsqlmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppsqlmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appsqlmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppsqlmetricsResponse({}));
  }

  /**
   * Description: 查询应用的SQL请求调用明细
   * Summary: 查询应用的SQL请求调用明细
   */
  async queryTraceAppsqlstat(request: QueryTraceAppsqlstatRequest): Promise<QueryTraceAppsqlstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppsqlstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的SQL请求调用明细
   * Summary: 查询应用的SQL请求调用明细
   */
  async queryTraceAppsqlstatEx(request: QueryTraceAppsqlstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppsqlstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppsqlstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appsqlstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppsqlstatResponse({}));
  }

  /**
   * Description: 查询应用的NoSQL调用指标
   * Summary: 查询应用的NoSQL调用指标
   */
  async queryTraceAppnosqlmetrics(request: QueryTraceAppnosqlmetricsRequest): Promise<QueryTraceAppnosqlmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppnosqlmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的NoSQL调用指标
   * Summary: 查询应用的NoSQL调用指标
   */
  async queryTraceAppnosqlmetricsEx(request: QueryTraceAppnosqlmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppnosqlmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppnosqlmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appnosqlmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppnosqlmetricsResponse({}));
  }

  /**
   * Description: 查询应用的MQ消费调用指标
   * Summary: 查询应用的MQ消费调用指标
   */
  async queryTraceAppmqconsumemetrics(request: QueryTraceAppmqconsumemetricsRequest): Promise<QueryTraceAppmqconsumemetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppmqconsumemetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的MQ消费调用指标
   * Summary: 查询应用的MQ消费调用指标
   */
  async queryTraceAppmqconsumemetricsEx(request: QueryTraceAppmqconsumemetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppmqconsumemetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppmqconsumemetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appmqconsumemetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppmqconsumemetricsResponse({}));
  }

  /**
   * Description: 查询应用的RPC客户端调用指标
   * Summary: 查询应用的RPC客户端调用指标
   */
  async queryTraceApprpcclientmetrics(request: QueryTraceApprpcclientmetricsRequest): Promise<QueryTraceApprpcclientmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApprpcclientmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的RPC客户端调用指标
   * Summary: 查询应用的RPC客户端调用指标
   */
  async queryTraceApprpcclientmetricsEx(request: QueryTraceApprpcclientmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApprpcclientmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApprpcclientmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apprpcclientmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApprpcclientmetricsResponse({}));
  }

  /**
   * Description: 查询应用的RPC服务端指标
   * Summary:  查询应用的RPC服务端指标
   */
  async queryTraceApprpcservermetrics(request: QueryTraceApprpcservermetricsRequest): Promise<QueryTraceApprpcservermetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApprpcservermetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的RPC服务端指标
   * Summary:  查询应用的RPC服务端指标
   */
  async queryTraceApprpcservermetricsEx(request: QueryTraceApprpcservermetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApprpcservermetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApprpcservermetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apprpcservermetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApprpcservermetricsResponse({}));
  }

  /**
   * Description: 查询应用的HTTP客户端调用指标
   * Summary: 查询应用的HTTP客户端调用指标
   */
  async queryTraceApphttpclientmetrics(request: QueryTraceApphttpclientmetricsRequest): Promise<QueryTraceApphttpclientmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApphttpclientmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的HTTP客户端调用指标
   * Summary: 查询应用的HTTP客户端调用指标
   */
  async queryTraceApphttpclientmetricsEx(request: QueryTraceApphttpclientmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApphttpclientmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApphttpclientmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apphttpclientmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApphttpclientmetricsResponse({}));
  }

  /**
   * Description: 查询应用的HTTP服务端指标
   * Summary: 查询应用的HTTP服务端指标
   */
  async queryTraceApphttpservermetrics(request: QueryTraceApphttpservermetricsRequest): Promise<QueryTraceApphttpservermetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApphttpservermetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的HTTP服务端指标
   * Summary: 查询应用的HTTP服务端指标
   */
  async queryTraceApphttpservermetricsEx(request: QueryTraceApphttpservermetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApphttpservermetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApphttpservermetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apphttpservermetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApphttpservermetricsResponse({}));
  }

  /**
   * Description: 查询应用的NoSQL请求调用明细
   * Summary: 查询应用的NoSQL请求调用明细
   */
  async queryTraceAppnosqlstat(request: QueryTraceAppnosqlstatRequest): Promise<QueryTraceAppnosqlstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppnosqlstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的NoSQL请求调用明细
   * Summary: 查询应用的NoSQL请求调用明细
   */
  async queryTraceAppnosqlstatEx(request: QueryTraceAppnosqlstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppnosqlstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppnosqlstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appnosqlstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppnosqlstatResponse({}));
  }

  /**
   * Description: 查询应用的MQ消费调用明细
   * Summary: 查询应用的MQ消费调用明细
   */
  async queryTraceAppmqconsumestat(request: QueryTraceAppmqconsumestatRequest): Promise<QueryTraceAppmqconsumestatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppmqconsumestatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的MQ消费调用明细
   * Summary: 查询应用的MQ消费调用明细
   */
  async queryTraceAppmqconsumestatEx(request: QueryTraceAppmqconsumestatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppmqconsumestatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppmqconsumestatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appmqconsumestat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppmqconsumestatResponse({}));
  }

  /**
   * Description: 查询应用的HTTP客户端请求调用明细
   * Summary: 查询应用的HTTP客户端请求调用明细
   */
  async queryTraceApphttpclientstat(request: QueryTraceApphttpclientstatRequest): Promise<QueryTraceApphttpclientstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApphttpclientstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的HTTP客户端请求调用明细
   * Summary: 查询应用的HTTP客户端请求调用明细
   */
  async queryTraceApphttpclientstatEx(request: QueryTraceApphttpclientstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApphttpclientstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApphttpclientstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apphttpclientstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApphttpclientstatResponse({}));
  }

  /**
   * Description: 查询应用的HTTP服务端调用明细
   * Summary: 查询应用的HTTP服务端调用明细
   */
  async queryTraceApphttpserverstat(request: QueryTraceApphttpserverstatRequest): Promise<QueryTraceApphttpserverstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApphttpserverstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的HTTP服务端调用明细
   * Summary: 查询应用的HTTP服务端调用明细
   */
  async queryTraceApphttpserverstatEx(request: QueryTraceApphttpserverstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApphttpserverstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApphttpserverstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apphttpserverstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApphttpserverstatResponse({}));
  }

  /**
   * Description: 查询应用的RPC客户端请求调用明细
   * Summary: 查询应用的RPC客户端请求调用明细
   */
  async queryTraceApprpcclientstat(request: QueryTraceApprpcclientstatRequest): Promise<QueryTraceApprpcclientstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApprpcclientstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的RPC客户端请求调用明细
   * Summary: 查询应用的RPC客户端请求调用明细
   */
  async queryTraceApprpcclientstatEx(request: QueryTraceApprpcclientstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApprpcclientstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApprpcclientstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apprpcclientstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApprpcclientstatResponse({}));
  }

  /**
   * Description: 查询应用的RPC服务端调用明细
   * Summary: 查询应用的RPC服务端调用明细
   */
  async queryTraceApprpcserverstat(request: QueryTraceApprpcserverstatRequest): Promise<QueryTraceApprpcserverstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApprpcserverstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的RPC服务端调用明细
   * Summary: 查询应用的RPC服务端调用明细
   */
  async queryTraceApprpcserverstatEx(request: QueryTraceApprpcserverstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApprpcserverstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApprpcserverstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apprpcserverstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApprpcserverstatResponse({}));
  }

  /**
   * Description: 获取链路单工作空间配置
   * Summary: 获取链路单工作空间配置
   */
  async getTraceWorkspacesetting(request: GetTraceWorkspacesettingRequest): Promise<GetTraceWorkspacesettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraceWorkspacesettingEx(request, headers, runtime);
  }

  /**
   * Description: 获取链路单工作空间配置
   * Summary: 获取链路单工作空间配置
   */
  async getTraceWorkspacesettingEx(request: GetTraceWorkspacesettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraceWorkspacesettingResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraceWorkspacesettingResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.workspacesetting.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraceWorkspacesettingResponse({}));
  }

  /**
   * Description: 查询应用的MQ生产调用指标
   * Summary: 查询应用的MQ生产调用指标
   */
  async queryTraceAppmqproducemetrics(request: QueryTraceAppmqproducemetricsRequest): Promise<QueryTraceAppmqproducemetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppmqproducemetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的MQ生产调用指标
   * Summary: 查询应用的MQ生产调用指标
   */
  async queryTraceAppmqproducemetricsEx(request: QueryTraceAppmqproducemetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppmqproducemetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppmqproducemetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appmqproducemetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppmqproducemetricsResponse({}));
  }

  /**
   * Description: 查询应用的MQ生产调用明细
   * Summary: 查询应用的MQ生产调用明细
   */
  async queryTraceAppmqproducestat(request: QueryTraceAppmqproducestatRequest): Promise<QueryTraceAppmqproducestatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppmqproducestatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的MQ生产调用明细
   * Summary: 查询应用的MQ生产调用明细
   */
  async queryTraceAppmqproducestatEx(request: QueryTraceAppmqproducestatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppmqproducestatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppmqproducestatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appmqproducestat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppmqproducestatResponse({}));
  }

  /**
   * Description: 计量计费是否开启
   * Summary: 计量计费是否开启
   */
  async getMeasurementStatus(request: GetMeasurementStatusRequest): Promise<GetMeasurementStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMeasurementStatusEx(request, headers, runtime);
  }

  /**
   * Description: 计量计费是否开启
   * Summary: 计量计费是否开启
   */
  async getMeasurementStatusEx(request: GetMeasurementStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMeasurementStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMeasurementStatusResponse>(await this.doRequest("1.0", "antcloud.monitor.measurement.status.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMeasurementStatusResponse({}));
  }

  /**
   * Description: 日志查询页面获取应用列表
   * Summary: 获取应用列表
   */
  async queryLogserviceApps(request: QueryLogserviceAppsRequest): Promise<QueryLogserviceAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLogserviceAppsEx(request, headers, runtime);
  }

  /**
   * Description: 日志查询页面获取应用列表
   * Summary: 获取应用列表
   */
  async queryLogserviceAppsEx(request: QueryLogserviceAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLogserviceAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLogserviceAppsResponse>(await this.doRequest("1.0", "antcloud.monitor.logservice.apps.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLogserviceAppsResponse({}));
  }

  /**
   * Description: 查询应用的HTTP服务端状态指标
   * Summary: 查询应用的HTTP服务端状态指标
   */
  async queryTraceApphttpserverstatusmetrics(request: QueryTraceApphttpserverstatusmetricsRequest): Promise<QueryTraceApphttpserverstatusmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceApphttpserverstatusmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的HTTP服务端状态指标
   * Summary: 查询应用的HTTP服务端状态指标
   */
  async queryTraceApphttpserverstatusmetricsEx(request: QueryTraceApphttpserverstatusmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceApphttpserverstatusmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceApphttpserverstatusmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.apphttpserverstatusmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceApphttpserverstatusmetricsResponse({}));
  }

  /**
   * Description: 查询应用的告警指标，或应用已经配置。
   * Summary: 查询应用的告警指标清单
   */
  async queryAppAlarmrules(request: QueryAppAlarmrulesRequest): Promise<QueryAppAlarmrulesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppAlarmrulesEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的告警指标，或应用已经配置。
   * Summary: 查询应用的告警指标清单
   */
  async queryAppAlarmrulesEx(request: QueryAppAlarmrulesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppAlarmrulesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppAlarmrulesResponse>(await this.doRequest("1.0", "antcloud.monitor.app.alarmrules.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppAlarmrulesResponse({}));
  }

  /**
   * Description: 查询链路紧凑详情
   * Summary: 查询链路紧凑详情
   */
  async queryTraceCompactdetail(request: QueryTraceCompactdetailRequest): Promise<QueryTraceCompactdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceCompactdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询链路紧凑详情
   * Summary: 查询链路紧凑详情
   */
  async queryTraceCompactdetailEx(request: QueryTraceCompactdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceCompactdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceCompactdetailResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.compactdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceCompactdetailResponse({}));
  }

  /**
   * Description: 查询应用的异常调用指标
   * Summary: 查询应用的异常调用指标
   */
  async queryTraceAppexceptionmetrics(request: QueryTraceAppexceptionmetricsRequest): Promise<QueryTraceAppexceptionmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppexceptionmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的异常调用指标
   * Summary: 查询应用的异常调用指标
   */
  async queryTraceAppexceptionmetricsEx(request: QueryTraceAppexceptionmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppexceptionmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppexceptionmetricsResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appexceptionmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppexceptionmetricsResponse({}));
  }

  /**
   * Description: 查询应用的异常请求调用明细
   * Summary: 查询应用的异常请求调用明细
   */
  async queryTraceAppexceptionstat(request: QueryTraceAppexceptionstatRequest): Promise<QueryTraceAppexceptionstatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceAppexceptionstatEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用的异常请求调用明细
   * Summary: 查询应用的异常请求调用明细
   */
  async queryTraceAppexceptionstatEx(request: QueryTraceAppexceptionstatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceAppexceptionstatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceAppexceptionstatResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.appexceptionstat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceAppexceptionstatResponse({}));
  }

  /**
   * Description: 查询告警绑定关系
   * Summary: 罗予
   */
  async queryUnifiedalarmRulebinding(request: QueryUnifiedalarmRulebindingRequest): Promise<QueryUnifiedalarmRulebindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnifiedalarmRulebindingEx(request, headers, runtime);
  }

  /**
   * Description: 查询告警绑定关系
   * Summary: 罗予
   */
  async queryUnifiedalarmRulebindingEx(request: QueryUnifiedalarmRulebindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnifiedalarmRulebindingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnifiedalarmRulebindingResponse>(await this.doRequest("1.0", "antcloud.monitor.unifiedalarm.rulebinding.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnifiedalarmRulebindingResponse({}));
  }

  /**
   * Description: 监控数据诊断列表查询
   * Summary: 监控数据诊断列表查询
   */
  async queryOpsCheck(request: QueryOpsCheckRequest): Promise<QueryOpsCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsCheckEx(request, headers, runtime);
  }

  /**
   * Description: 监控数据诊断列表查询
   * Summary: 监控数据诊断列表查询
   */
  async queryOpsCheckEx(request: QueryOpsCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsCheckResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsCheckResponse>(await this.doRequest("1.0", "antcloud.monitor.ops.check.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsCheckResponse({}));
  }

  /**
   * Description: 应用诊断
   * Summary: 应用诊断
   */
  async queryOpsAppcheck(request: QueryOpsAppcheckRequest): Promise<QueryOpsAppcheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsAppcheckEx(request, headers, runtime);
  }

  /**
   * Description: 应用诊断
   * Summary: 应用诊断
   */
  async queryOpsAppcheckEx(request: QueryOpsAppcheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsAppcheckResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsAppcheckResponse>(await this.doRequest("1.0", "antcloud.monitor.ops.appcheck.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsAppcheckResponse({}));
  }

  /**
   * Description: 添加钉钉机器人
   * Summary: 添加钉钉机器人
   */
  async createAlarmDingdingrobot(request: CreateAlarmDingdingrobotRequest): Promise<CreateAlarmDingdingrobotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAlarmDingdingrobotEx(request, headers, runtime);
  }

  /**
   * Description: 添加钉钉机器人
   * Summary: 添加钉钉机器人
   */
  async createAlarmDingdingrobotEx(request: CreateAlarmDingdingrobotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAlarmDingdingrobotResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAlarmDingdingrobotResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAlarmDingdingrobotResponse({}));
  }

  /**
   * Description: 查询钉钉机器人
   * Summary: 查询钉钉机器人
   */
  async queryAlarmDingdingrobot(request: QueryAlarmDingdingrobotRequest): Promise<QueryAlarmDingdingrobotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmDingdingrobotEx(request, headers, runtime);
  }

  /**
   * Description: 查询钉钉机器人
   * Summary: 查询钉钉机器人
   */
  async queryAlarmDingdingrobotEx(request: QueryAlarmDingdingrobotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmDingdingrobotResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmDingdingrobotResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmDingdingrobotResponse({}));
  }

  /**
   * Description: 删除钉钉机器人
   * Summary: 删除钉钉机器人
   */
  async deleteAlarmDingdingrobot(request: DeleteAlarmDingdingrobotRequest): Promise<DeleteAlarmDingdingrobotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAlarmDingdingrobotEx(request, headers, runtime);
  }

  /**
   * Description: 删除钉钉机器人
   * Summary: 删除钉钉机器人
   */
  async deleteAlarmDingdingrobotEx(request: DeleteAlarmDingdingrobotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAlarmDingdingrobotResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAlarmDingdingrobotResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAlarmDingdingrobotResponse({}));
  }

  /**
   * Description: 更新钉钉机器人
   * Summary: 更新钉钉机器人
   */
  async updateAlarmDingdingrobot(request: UpdateAlarmDingdingrobotRequest): Promise<UpdateAlarmDingdingrobotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAlarmDingdingrobotEx(request, headers, runtime);
  }

  /**
   * Description: 更新钉钉机器人
   * Summary: 更新钉钉机器人
   */
  async updateAlarmDingdingrobotEx(request: UpdateAlarmDingdingrobotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAlarmDingdingrobotResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAlarmDingdingrobotResponse>(await this.doRequest("1.0", "antcloud.monitor.alarm.dingdingrobot.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAlarmDingdingrobotResponse({}));
  }

  /**
   * Description: 查询应用告警统计
   * Summary: 查询应用告警统计
   */
  async queryAppsAlarmrulecount(request: QueryAppsAlarmrulecountRequest): Promise<QueryAppsAlarmrulecountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppsAlarmrulecountEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用告警统计
   * Summary: 查询应用告警统计
   */
  async queryAppsAlarmrulecountEx(request: QueryAppsAlarmrulecountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppsAlarmrulecountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppsAlarmrulecountResponse>(await this.doRequest("1.0", "antcloud.monitor.apps.alarmrulecount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppsAlarmrulecountResponse({}));
  }

  /**
   * Description: 根据app维度查询统一告警状态
   * Summary: 根据app维度查询统一告警状态
   */
  async queryAppsUnifiedalarmstats(request: QueryAppsUnifiedalarmstatsRequest): Promise<QueryAppsUnifiedalarmstatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppsUnifiedalarmstatsEx(request, headers, runtime);
  }

  /**
   * Description: 根据app维度查询统一告警状态
   * Summary: 根据app维度查询统一告警状态
   */
  async queryAppsUnifiedalarmstatsEx(request: QueryAppsUnifiedalarmstatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppsUnifiedalarmstatsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppsUnifiedalarmstatsResponse>(await this.doRequest("1.0", "antcloud.monitor.apps.unifiedalarmstats.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppsUnifiedalarmstatsResponse({}));
  }

  /**
   * Description: 开启监控数据诊断告警
   * Summary: 开启监控数据诊断告警
   */
  async switchOpsAlarm(request: SwitchOpsAlarmRequest): Promise<SwitchOpsAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchOpsAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 开启监控数据诊断告警
   * Summary: 开启监控数据诊断告警
   */
  async switchOpsAlarmEx(request: SwitchOpsAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchOpsAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchOpsAlarmResponse>(await this.doRequest("1.0", "antcloud.monitor.ops.alarm.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchOpsAlarmResponse({}));
  }

  /**
   * Description: 获取所有租户
   * Summary: 获取所有租户
   */
  async allTraasmetaTenant(request: AllTraasmetaTenantRequest): Promise<AllTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有租户
   * Summary: 获取所有租户
   */
  async allTraasmetaTenantEx(request: AllTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaTenantResponse({}));
  }

  /**
   * Description: 获取所有region
   * Summary: 获取所有region
   */
  async allTraasmetaRegion(request: AllTraasmetaRegionRequest): Promise<AllTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有region
   * Summary: 获取所有region
   */
  async allTraasmetaRegionEx(request: AllTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaRegionResponse({}));
  }

  /**
   * Description: 租户分页查询
   * Summary: 租户分页查询
   */
  async pagequeryTraasmetaTenant(request: PagequeryTraasmetaTenantRequest): Promise<PagequeryTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 租户分页查询
   * Summary: 租户分页查询
   */
  async pagequeryTraasmetaTenantEx(request: PagequeryTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaTenantResponse({}));
  }

  /**
   * Description: 获取单个租户
   * Summary: 获取单个租户
   */
  async getTraasmetaTenant(request: GetTraasmetaTenantRequest): Promise<GetTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个租户
   * Summary: 获取单个租户
   */
  async getTraasmetaTenantEx(request: GetTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaTenantResponse({}));
  }

  /**
   * Description: 租户查询
   * Summary: 租户查询
   */
  async queryTraasmetaTenant(request: QueryTraasmetaTenantRequest): Promise<QueryTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 租户查询
   * Summary: 租户查询
   */
  async queryTraasmetaTenantEx(request: QueryTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaTenantResponse({}));
  }

  /**
   * Description: 批量查询租户
   * Summary: 批量查询租户
   */
  async batchqueryTraasmetaTenant(request: BatchqueryTraasmetaTenantRequest): Promise<BatchqueryTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询租户
   * Summary: 批量查询租户
   */
  async batchqueryTraasmetaTenantEx(request: BatchqueryTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaTenantResponse({}));
  }

  /**
   * Description: 创建tenant
   * Summary: 创建tenant
   */
  async createTraasmetaTenant(request: CreateTraasmetaTenantRequest): Promise<CreateTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 创建tenant
   * Summary: 创建tenant
   */
  async createTraasmetaTenantEx(request: CreateTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaTenantResponse({}));
  }

  /**
   * Description: 批量创建租户
   * Summary: 批量创建租户
   */
  async batchcreateTraasmetaTenant(request: BatchcreateTraasmetaTenantRequest): Promise<BatchcreateTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建租户
   * Summary: 批量创建租户
   */
  async batchcreateTraasmetaTenantEx(request: BatchcreateTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaTenantResponse({}));
  }

  /**
   * Description: 更新租户
   * Summary: 更新租户
   */
  async updateTraasmetaTenant(request: UpdateTraasmetaTenantRequest): Promise<UpdateTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 更新租户
   * Summary: 更新租户
   */
  async updateTraasmetaTenantEx(request: UpdateTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaTenantResponse({}));
  }

  /**
   * Description: 删除租户
   * Summary: 删除租户
   */
  async deleteTraasmetaTenant(request: DeleteTraasmetaTenantRequest): Promise<DeleteTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 删除租户
   * Summary: 删除租户
   */
  async deleteTraasmetaTenantEx(request: DeleteTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaTenantResponse({}));
  }

  /**
   * Description: 批量删除租户
   * Summary: 批量删除租户
   */
  async batchdeleteTraasmetaTenant(request: BatchdeleteTraasmetaTenantRequest): Promise<BatchdeleteTraasmetaTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaTenantEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除租户
   * Summary: 批量删除租户
   */
  async batchdeleteTraasmetaTenantEx(request: BatchdeleteTraasmetaTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaTenantResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.tenant.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaTenantResponse({}));
  }

  /**
   * Description: 获取单个地域
   * Summary: 获取单个地域
   */
  async getTraasmetaRegion(request: GetTraasmetaRegionRequest): Promise<GetTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个地域
   * Summary: 获取单个地域
   */
  async getTraasmetaRegionEx(request: GetTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaRegionResponse({}));
  }

  /**
   * Description: 获取所有机房
   * Summary: 获取所有机房
   */
  async allTraasmetaZone(request: AllTraasmetaZoneRequest): Promise<AllTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有机房
   * Summary: 获取所有机房
   */
  async allTraasmetaZoneEx(request: AllTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaZoneResponse({}));
  }

  /**
   * Description: 获取单个机房
   * Summary: 获取单个机房
   */
  async getTraasmetaZone(request: GetTraasmetaZoneRequest): Promise<GetTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个机房
   * Summary: 获取单个机房
   */
  async getTraasmetaZoneEx(request: GetTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaZoneResponse({}));
  }

  /**
   * Description: 创建单个地域
   * Summary: 创建单个地域
   */
  async createTraasmetaRegion(request: CreateTraasmetaRegionRequest): Promise<CreateTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个地域
   * Summary: 创建单个地域
   */
  async createTraasmetaRegionEx(request: CreateTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaRegionResponse({}));
  }

  /**
   * Description: 批量修改agent是否开启告警标记
   * Summary: agent批量打标
   */
  async updateAgentLabel(request: UpdateAgentLabelRequest): Promise<UpdateAgentLabelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAgentLabelEx(request, headers, runtime);
  }

  /**
   * Description: 批量修改agent是否开启告警标记
   * Summary: agent批量打标
   */
  async updateAgentLabelEx(request: UpdateAgentLabelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAgentLabelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAgentLabelResponse>(await this.doRequest("1.0", "antcloud.monitor.agent.label.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAgentLabelResponse({}));
  }

  /**
   * Description: 创建单个机房
   * Summary: 创建单个机房
   */
  async createTraasmetaZone(request: CreateTraasmetaZoneRequest): Promise<CreateTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个机房
   * Summary: 创建单个机房
   */
  async createTraasmetaZoneEx(request: CreateTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaZoneResponse({}));
  }

  /**
   * Description: 删除单个地域
   * Summary: 删除单个地域
   */
  async deleteTraasmetaRegion(request: DeleteTraasmetaRegionRequest): Promise<DeleteTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个地域
   * Summary: 删除单个地域
   */
  async deleteTraasmetaRegionEx(request: DeleteTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaRegionResponse({}));
  }

  /**
   * Description: 删除单个机房
   * Summary: 删除单个机房
   */
  async deleteTraasmetaZone(request: DeleteTraasmetaZoneRequest): Promise<DeleteTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个机房
   * Summary: 删除单个机房
   */
  async deleteTraasmetaZoneEx(request: DeleteTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaZoneResponse({}));
  }

  /**
   * Description: 更新单个地域
   * Summary: 更新单个地域
   */
  async updateTraasmetaRegion(request: UpdateTraasmetaRegionRequest): Promise<UpdateTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个地域
   * Summary: 更新单个地域
   */
  async updateTraasmetaRegionEx(request: UpdateTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaRegionResponse({}));
  }

  /**
   * Description: 更新单个机房
   * Summary: 更新单个机房
   */
  async updateTraasmetaZone(request: UpdateTraasmetaZoneRequest): Promise<UpdateTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个机房
   * Summary: 更新单个机房
   */
  async updateTraasmetaZoneEx(request: UpdateTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaZoneResponse({}));
  }

  /**
   * Description: 地域查询
   * Summary: 地域查询
   */
  async queryTraasmetaRegion(request: QueryTraasmetaRegionRequest): Promise<QueryTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 地域查询
   * Summary: 地域查询
   */
  async queryTraasmetaRegionEx(request: QueryTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaRegionResponse({}));
  }

  /**
   * Description: 机房查询
   * Summary: 机房查询
   */
  async queryTraasmetaZone(request: QueryTraasmetaZoneRequest): Promise<QueryTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 机房查询
   * Summary: 机房查询
   */
  async queryTraasmetaZoneEx(request: QueryTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaZoneResponse({}));
  }

  /**
   * Description: 地域分页查询
   * Summary: 地域分页查询
   */
  async pagequeryTraasmetaRegion(request: PagequeryTraasmetaRegionRequest): Promise<PagequeryTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 地域分页查询
   * Summary: 地域分页查询
   */
  async pagequeryTraasmetaRegionEx(request: PagequeryTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaRegionResponse({}));
  }

  /**
   * Description: 机房分页查询
   * Summary: 机房分页查询
   */
  async pagequeryTraasmetaZone(request: PagequeryTraasmetaZoneRequest): Promise<PagequeryTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 机房分页查询
   * Summary: 机房分页查询
   */
  async pagequeryTraasmetaZoneEx(request: PagequeryTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaZoneResponse({}));
  }

  /**
   * Description: 批量查询地域
   * Summary: 批量查询地域
   */
  async batchqueryTraasmetaRegion(request: BatchqueryTraasmetaRegionRequest): Promise<BatchqueryTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询地域
   * Summary: 批量查询地域
   */
  async batchqueryTraasmetaRegionEx(request: BatchqueryTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaRegionResponse({}));
  }

  /**
   * Description: 批量创建地域
   * Summary: 批量创建地域
   */
  async batchcreateTraasmetaRegion(request: BatchcreateTraasmetaRegionRequest): Promise<BatchcreateTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建地域
   * Summary: 批量创建地域
   */
  async batchcreateTraasmetaRegionEx(request: BatchcreateTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaRegionResponse({}));
  }

  /**
   * Description: 批量创建机房
   * Summary: 批量创建机房
   */
  async batchcreateTraasmetaZone(request: BatchcreateTraasmetaZoneRequest): Promise<BatchcreateTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建机房
   * Summary: 批量创建机房
   */
  async batchcreateTraasmetaZoneEx(request: BatchcreateTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaZoneResponse({}));
  }

  /**
   * Description: 批量查询机房
   * Summary: 批量查询机房
   */
  async batchqueryTraasmetaZone(request: BatchqueryTraasmetaZoneRequest): Promise<BatchqueryTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询机房
   * Summary: 批量查询机房
   */
  async batchqueryTraasmetaZoneEx(request: BatchqueryTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaZoneResponse({}));
  }

  /**
   * Description: 批量删除地域
   * Summary: 批量删除地域
   */
  async batchdeleteTraasmetaRegion(request: BatchdeleteTraasmetaRegionRequest): Promise<BatchdeleteTraasmetaRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaRegionEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除地域
   * Summary: 批量删除地域
   */
  async batchdeleteTraasmetaRegionEx(request: BatchdeleteTraasmetaRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaRegionResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.region.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaRegionResponse({}));
  }

  /**
   * Description: 批量删除机房
   * Summary: 批量删除机房
   */
  async batchdeleteTraasmetaZone(request: BatchdeleteTraasmetaZoneRequest): Promise<BatchdeleteTraasmetaZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaZoneEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除机房
   * Summary: 批量删除机房
   */
  async batchdeleteTraasmetaZoneEx(request: BatchdeleteTraasmetaZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaZoneResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.zone.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaZoneResponse({}));
  }

  /**
   * Description: 获取所有应用
   * Summary: 获取所有应用
   */
  async allTraasmetaApp(request: AllTraasmetaAppRequest): Promise<AllTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有应用
   * Summary: 获取所有应用
   */
  async allTraasmetaAppEx(request: AllTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaAppResponse({}));
  }

  /**
   * Description: 获取所有应用分组
   * Summary: 获取所有应用分组
   */
  async allTraasmetaAppgroup(request: AllTraasmetaAppgroupRequest): Promise<AllTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有应用分组
   * Summary: 获取所有应用分组
   */
  async allTraasmetaAppgroupEx(request: AllTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 获取所有应用服务器
   * Summary: 获取所有应用服务器
   */
  async allTraasmetaAppserver(request: AllTraasmetaAppserverRequest): Promise<AllTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有应用服务器
   * Summary: 获取所有应用服务器
   */
  async allTraasmetaAppserverEx(request: AllTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 获取所有应用标签
   * Summary: 获取所有应用标签
   */
  async allTraasmetaApptag(request: AllTraasmetaApptagRequest): Promise<AllTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有应用标签
   * Summary: 获取所有应用标签
   */
  async allTraasmetaApptagEx(request: AllTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaApptagResponse({}));
  }

  /**
   * Description: 获取所有工作空间
   * Summary: 获取所有工作空间
   */
  async allTraasmetaWorkspace(request: AllTraasmetaWorkspaceRequest): Promise<AllTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有工作空间
   * Summary: 获取所有工作空间
   */
  async allTraasmetaWorkspaceEx(request: AllTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 获取所有工作空间组
   * Summary: 获取所有工作空间组
   */
  async allTraasmetaWorkspacegroup(request: AllTraasmetaWorkspacegroupRequest): Promise<AllTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有工作空间组
   * Summary: 获取所有工作空间组
   */
  async allTraasmetaWorkspacegroupEx(request: AllTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 批量创建工作空间组
   * Summary: 批量创建工作空间组
   */
  async batchcreateTraasmetaWorkspacegroup(request: BatchcreateTraasmetaWorkspacegroupRequest): Promise<BatchcreateTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建工作空间组
   * Summary: 批量创建工作空间组
   */
  async batchcreateTraasmetaWorkspacegroupEx(request: BatchcreateTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 批量创建应用
   * Summary: 批量创建应用
   */
  async batchcreateTraasmetaApp(request: BatchcreateTraasmetaAppRequest): Promise<BatchcreateTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建应用
   * Summary: 批量创建应用
   */
  async batchcreateTraasmetaAppEx(request: BatchcreateTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaAppResponse({}));
  }

  /**
   * Description: 批量创建应用组
   * Summary: 批量创建应用组
   */
  async batchcreateTraasmetaAppgroup(request: BatchcreateTraasmetaAppgroupRequest): Promise<BatchcreateTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建应用组
   * Summary: 批量创建应用组
   */
  async batchcreateTraasmetaAppgroupEx(request: BatchcreateTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 批量创建应用服务器
   * Summary: 批量创建应用服务器
   */
  async batchcreateTraasmetaAppserver(request: BatchcreateTraasmetaAppserverRequest): Promise<BatchcreateTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建应用服务器
   * Summary: 批量创建应用服务器
   */
  async batchcreateTraasmetaAppserverEx(request: BatchcreateTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 批量创建应用标签
   * Summary: 批量创建应用标签
   */
  async batchcreateTraasmetaApptag(request: BatchcreateTraasmetaApptagRequest): Promise<BatchcreateTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建应用标签
   * Summary: 批量创建应用标签
   */
  async batchcreateTraasmetaApptagEx(request: BatchcreateTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaApptagResponse({}));
  }

  /**
   * Description: 批量创建工作空间
   * Summary: 批量创建工作空间
   */
  async batchcreateTraasmetaWorkspace(request: BatchcreateTraasmetaWorkspaceRequest): Promise<BatchcreateTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建工作空间
   * Summary: 批量创建工作空间
   */
  async batchcreateTraasmetaWorkspaceEx(request: BatchcreateTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 批量删除应用
   * Summary: 批量删除应用
   */
  async batchdeleteTraasmetaApp(request: BatchdeleteTraasmetaAppRequest): Promise<BatchdeleteTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除应用
   * Summary: 批量删除应用
   */
  async batchdeleteTraasmetaAppEx(request: BatchdeleteTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaAppResponse({}));
  }

  /**
   * Description: 批量删除工作空间
   * Summary: 批量删除工作空间
   */
  async batchdeleteTraasmetaWorkspace(request: BatchdeleteTraasmetaWorkspaceRequest): Promise<BatchdeleteTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除工作空间
   * Summary: 批量删除工作空间
   */
  async batchdeleteTraasmetaWorkspaceEx(request: BatchdeleteTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 批量删除应用标签
   * Summary: 批量删除应用标签
   */
  async batchdeleteTraasmetaApptag(request: BatchdeleteTraasmetaApptagRequest): Promise<BatchdeleteTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除应用标签
   * Summary: 批量删除应用标签
   */
  async batchdeleteTraasmetaApptagEx(request: BatchdeleteTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaApptagResponse({}));
  }

  /**
   * Description: 批量删除应用服务器
   * Summary: 批量删除应用服务器
   */
  async batchdeleteTraasmetaAppserver(request: BatchdeleteTraasmetaAppserverRequest): Promise<BatchdeleteTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除应用服务器
   * Summary: 批量删除应用服务器
   */
  async batchdeleteTraasmetaAppserverEx(request: BatchdeleteTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 批量删除应用组
   * Summary: 批量删除应用组
   */
  async batchdeleteTraasmetaAppgroup(request: BatchdeleteTraasmetaAppgroupRequest): Promise<BatchdeleteTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除应用组
   * Summary: 批量删除应用组
   */
  async batchdeleteTraasmetaAppgroupEx(request: BatchdeleteTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 批量删除工作空间组
   * Summary: 批量删除工作空间组
   */
  async batchdeleteTraasmetaWorkspacegroup(request: BatchdeleteTraasmetaWorkspacegroupRequest): Promise<BatchdeleteTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除工作空间组
   * Summary: 批量删除工作空间组
   */
  async batchdeleteTraasmetaWorkspacegroupEx(request: BatchdeleteTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 批量查询工作空间组
   * Summary: 批量查询工作空间组
   */
  async batchqueryTraasmetaWorkspacegroup(request: BatchqueryTraasmetaWorkspacegroupRequest): Promise<BatchqueryTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询工作空间组
   * Summary: 批量查询工作空间组
   */
  async batchqueryTraasmetaWorkspacegroupEx(request: BatchqueryTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 批量查询工作空间
   * Summary: 批量查询工作空间
   */
  async batchqueryTraasmetaWorkspace(request: BatchqueryTraasmetaWorkspaceRequest): Promise<BatchqueryTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询工作空间
   * Summary: 批量查询工作空间
   */
  async batchqueryTraasmetaWorkspaceEx(request: BatchqueryTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 批量查询应用标签
   * Summary: 批量查询应用标签
   */
  async batchqueryTraasmetaApptag(request: BatchqueryTraasmetaApptagRequest): Promise<BatchqueryTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询应用标签
   * Summary: 批量查询应用标签
   */
  async batchqueryTraasmetaApptagEx(request: BatchqueryTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaApptagResponse({}));
  }

  /**
   * Description: 批量查询应用服务器
   * Summary: 批量查询应用服务器
   */
  async batchqueryTraasmetaAppserver(request: BatchqueryTraasmetaAppserverRequest): Promise<BatchqueryTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询应用服务器
   * Summary: 批量查询应用服务器
   */
  async batchqueryTraasmetaAppserverEx(request: BatchqueryTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 批量查询应用组
   * Summary: 批量查询应用组
   */
  async batchqueryTraasmetaAppgroup(request: BatchqueryTraasmetaAppgroupRequest): Promise<BatchqueryTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询应用组
   * Summary: 批量查询应用组
   */
  async batchqueryTraasmetaAppgroupEx(request: BatchqueryTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 批量查询应用
   * Summary: 批量查询应用
   */
  async batchqueryTraasmetaApp(request: BatchqueryTraasmetaAppRequest): Promise<BatchqueryTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询应用
   * Summary: 批量查询应用
   */
  async batchqueryTraasmetaAppEx(request: BatchqueryTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaAppResponse({}));
  }

  /**
   * Description: 删除单个应用
   * Summary: 删除单个应用
   */
  async deleteTraasmetaApp(request: DeleteTraasmetaAppRequest): Promise<DeleteTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个应用
   * Summary: 删除单个应用
   */
  async deleteTraasmetaAppEx(request: DeleteTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaAppResponse({}));
  }

  /**
   * Description: 删除单个应用组
   * Summary: 删除单个应用组
   */
  async deleteTraasmetaAppgroup(request: DeleteTraasmetaAppgroupRequest): Promise<DeleteTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个应用组
   * Summary: 删除单个应用组
   */
  async deleteTraasmetaAppgroupEx(request: DeleteTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 删除单个应用服务器
   * Summary: 删除单个应用服务器
   */
  async deleteTraasmetaAppserver(request: DeleteTraasmetaAppserverRequest): Promise<DeleteTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个应用服务器
   * Summary: 删除单个应用服务器
   */
  async deleteTraasmetaAppserverEx(request: DeleteTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 删除单个应用标签
   * Summary: 删除单个应用标签
   */
  async deleteTraasmetaApptag(request: DeleteTraasmetaApptagRequest): Promise<DeleteTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个应用标签
   * Summary: 删除单个应用标签
   */
  async deleteTraasmetaApptagEx(request: DeleteTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaApptagResponse({}));
  }

  /**
   * Description: 删除单个工作空间
   * Summary: 删除单个工作空间
   */
  async deleteTraasmetaWorkspace(request: DeleteTraasmetaWorkspaceRequest): Promise<DeleteTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个工作空间
   * Summary: 删除单个工作空间
   */
  async deleteTraasmetaWorkspaceEx(request: DeleteTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 删除单个工作空间组
   * Summary: 删除单个工作空间组
   */
  async deleteTraasmetaWorkspacegroup(request: DeleteTraasmetaWorkspacegroupRequest): Promise<DeleteTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个工作空间组
   * Summary: 删除单个工作空间组
   */
  async deleteTraasmetaWorkspacegroupEx(request: DeleteTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 获取单个应用
   * Summary: 获取单个应用
   */
  async getTraasmetaApp(request: GetTraasmetaAppRequest): Promise<GetTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个应用
   * Summary: 获取单个应用
   */
  async getTraasmetaAppEx(request: GetTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaAppResponse({}));
  }

  /**
   * Description: 获取单个应用组
   * Summary: 获取单个应用组
   */
  async getTraasmetaAppgroup(request: GetTraasmetaAppgroupRequest): Promise<GetTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个应用组
   * Summary: 获取单个应用组
   */
  async getTraasmetaAppgroupEx(request: GetTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 获取单个应用服务器
   * Summary: 获取单个应用服务器
   */
  async getTraasmetaAppserver(request: GetTraasmetaAppserverRequest): Promise<GetTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个应用服务器
   * Summary: 获取单个应用服务器
   */
  async getTraasmetaAppserverEx(request: GetTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 获取单个应用标签
   * Summary: 获取单个应用标签
   */
  async getTraasmetaApptag(request: GetTraasmetaApptagRequest): Promise<GetTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个应用标签
   * Summary: 获取单个应用标签
   */
  async getTraasmetaApptagEx(request: GetTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaApptagResponse({}));
  }

  /**
   * Description: 获取单个工作空间
   * Summary: 获取单个工作空间
   */
  async getTraasmetaWorkspace(request: GetTraasmetaWorkspaceRequest): Promise<GetTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个工作空间
   * Summary: 获取单个工作空间
   */
  async getTraasmetaWorkspaceEx(request: GetTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 获取单个工作空间组
   * Summary: 获取单个工作空间组
   */
  async getTraasmetaWorkspacegroup(request: GetTraasmetaWorkspacegroupRequest): Promise<GetTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个工作空间组
   * Summary: 获取单个工作空间组
   */
  async getTraasmetaWorkspacegroupEx(request: GetTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 工作空间组分页查询
   * Summary: 工作空间组分页查询
   */
  async pagequeryTraasmetaWorkspacegroup(request: PagequeryTraasmetaWorkspacegroupRequest): Promise<PagequeryTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 工作空间组分页查询
   * Summary: 工作空间组分页查询
   */
  async pagequeryTraasmetaWorkspacegroupEx(request: PagequeryTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 工作空间分页查询
   * Summary: 工作空间分页查询
   */
  async pagequeryTraasmetaWorkspace(request: PagequeryTraasmetaWorkspaceRequest): Promise<PagequeryTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 工作空间分页查询
   * Summary: 工作空间分页查询
   */
  async pagequeryTraasmetaWorkspaceEx(request: PagequeryTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 应用标签分页查询
   * Summary: 应用标签分页查询
   */
  async pagequeryTraasmetaApptag(request: PagequeryTraasmetaApptagRequest): Promise<PagequeryTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 应用标签分页查询
   * Summary: 应用标签分页查询
   */
  async pagequeryTraasmetaApptagEx(request: PagequeryTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaApptagResponse({}));
  }

  /**
   * Description: 应用服务器分页查询
   * Summary: 应用服务器分页查询
   */
  async pagequeryTraasmetaAppserver(request: PagequeryTraasmetaAppserverRequest): Promise<PagequeryTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 应用服务器分页查询
   * Summary: 应用服务器分页查询
   */
  async pagequeryTraasmetaAppserverEx(request: PagequeryTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 应用组分页查询
   * Summary: 应用组分页查询
   */
  async pagequeryTraasmetaAppgroup(request: PagequeryTraasmetaAppgroupRequest): Promise<PagequeryTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用组分页查询
   * Summary: 应用组分页查询
   */
  async pagequeryTraasmetaAppgroupEx(request: PagequeryTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 应用分页查询
   * Summary: 应用分页查询
   */
  async pagequeryTraasmetaApp(request: PagequeryTraasmetaAppRequest): Promise<PagequeryTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用分页查询
   * Summary: 应用分页查询
   */
  async pagequeryTraasmetaAppEx(request: PagequeryTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaAppResponse({}));
  }

  /**
   * Description: 工作空间组查询
   * Summary: 工作空间组查询
   */
  async queryTraasmetaWorkspacegroup(request: QueryTraasmetaWorkspacegroupRequest): Promise<QueryTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 工作空间组查询
   * Summary: 工作空间组查询
   */
  async queryTraasmetaWorkspacegroupEx(request: QueryTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 工作空间查询
   * Summary: 工作空间查询
   */
  async queryTraasmetaWorkspace(request: QueryTraasmetaWorkspaceRequest): Promise<QueryTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 工作空间查询
   * Summary: 工作空间查询
   */
  async queryTraasmetaWorkspaceEx(request: QueryTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 应用标签查询
   * Summary: 应用标签查询
   */
  async queryTraasmetaApptag(request: QueryTraasmetaApptagRequest): Promise<QueryTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 应用标签查询
   * Summary: 应用标签查询
   */
  async queryTraasmetaApptagEx(request: QueryTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaApptagResponse({}));
  }

  /**
   * Description: 应用服务器查询
   * Summary: 应用服务器查询
   */
  async queryTraasmetaAppserver(request: QueryTraasmetaAppserverRequest): Promise<QueryTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 应用服务器查询
   * Summary: 应用服务器查询
   */
  async queryTraasmetaAppserverEx(request: QueryTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 应用组查询
   * Summary: 应用组查询
   */
  async queryTraasmetaAppgroup(request: QueryTraasmetaAppgroupRequest): Promise<QueryTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用组查询
   * Summary: 应用组查询
   */
  async queryTraasmetaAppgroupEx(request: QueryTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 应用查询
   * Summary: 应用查询
   */
  async queryTraasmetaApp(request: QueryTraasmetaAppRequest): Promise<QueryTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用查询
   * Summary: 应用查询
   */
  async queryTraasmetaAppEx(request: QueryTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaAppResponse({}));
  }

  /**
   * Description: 更新单个应用
   * Summary: 更新单个应用
   */
  async updateTraasmetaApp(request: UpdateTraasmetaAppRequest): Promise<UpdateTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个应用
   * Summary: 更新单个应用
   */
  async updateTraasmetaAppEx(request: UpdateTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaAppResponse({}));
  }

  /**
   * Description: 创建单个应用
   * Summary: 创建单个应用
   */
  async createTraasmetaApp(request: CreateTraasmetaAppRequest): Promise<CreateTraasmetaAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaAppEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个应用
   * Summary: 创建单个应用
   */
  async createTraasmetaAppEx(request: CreateTraasmetaAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaAppResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.app.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaAppResponse({}));
  }

  /**
   * Description: 更新单个工作空间组
   * Summary: 更新单个工作空间组
   */
  async updateTraasmetaWorkspacegroup(request: UpdateTraasmetaWorkspacegroupRequest): Promise<UpdateTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个工作空间组
   * Summary: 更新单个工作空间组
   */
  async updateTraasmetaWorkspacegroupEx(request: UpdateTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 更新单个应用组
   * Summary: 更新单个应用组
   */
  async updateTraasmetaAppgroup(request: UpdateTraasmetaAppgroupRequest): Promise<UpdateTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个应用组
   * Summary: 更新单个应用组
   */
  async updateTraasmetaAppgroupEx(request: UpdateTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 创建单个应用组
   * Summary: 创建单个应用组
   */
  async createTraasmetaAppgroup(request: CreateTraasmetaAppgroupRequest): Promise<CreateTraasmetaAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个应用组
   * Summary: 创建单个应用组
   */
  async createTraasmetaAppgroupEx(request: CreateTraasmetaAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaAppgroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appgroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaAppgroupResponse({}));
  }

  /**
   * Description: 创建单个工作空间
   * Summary: 创建单个工作空间
   */
  async createTraasmetaWorkspace(request: CreateTraasmetaWorkspaceRequest): Promise<CreateTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个工作空间
   * Summary: 创建单个工作空间
   */
  async createTraasmetaWorkspaceEx(request: CreateTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 更新单个工作空间
   * Summary: 更新单个工作空间
   */
  async updateTraasmetaWorkspace(request: UpdateTraasmetaWorkspaceRequest): Promise<UpdateTraasmetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个工作空间
   * Summary: 更新单个工作空间
   */
  async updateTraasmetaWorkspaceEx(request: UpdateTraasmetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspace.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaWorkspaceResponse({}));
  }

  /**
   * Description: 更新单个应用标签
   * Summary: 更新单个应用标签
   */
  async updateTraasmetaApptag(request: UpdateTraasmetaApptagRequest): Promise<UpdateTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个应用标签
   * Summary: 更新单个应用标签
   */
  async updateTraasmetaApptagEx(request: UpdateTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaApptagResponse({}));
  }

  /**
   * Description: 创建单个应用标签
   * Summary: 创建单个应用标签
   */
  async createTraasmetaApptag(request: CreateTraasmetaApptagRequest): Promise<CreateTraasmetaApptagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaApptagEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个应用标签
   * Summary: 创建单个应用标签
   */
  async createTraasmetaApptagEx(request: CreateTraasmetaApptagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaApptagResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaApptagResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.apptag.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaApptagResponse({}));
  }

  /**
   * Description: 创建单个应用服务器
   * Summary: 创建单个应用服务器
   */
  async createTraasmetaAppserver(request: CreateTraasmetaAppserverRequest): Promise<CreateTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个应用服务器
   * Summary: 创建单个应用服务器
   */
  async createTraasmetaAppserverEx(request: CreateTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 更新单个应用服务器
   * Summary: 更新单个应用服务器
   */
  async updateTraasmetaAppserver(request: UpdateTraasmetaAppserverRequest): Promise<UpdateTraasmetaAppserverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaAppserverEx(request, headers, runtime);
  }

  /**
   * Description: 更新单个应用服务器
   * Summary: 更新单个应用服务器
   */
  async updateTraasmetaAppserverEx(request: UpdateTraasmetaAppserverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaAppserverResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaAppserverResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.appserver.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaAppserverResponse({}));
  }

  /**
   * Description: 获取SetupModel
   * Summary: 获取SetupModel
   */
  async getSetupModel(request: GetSetupModelRequest): Promise<GetSetupModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSetupModelEx(request, headers, runtime);
  }

  /**
   * Description: 获取SetupModel
   * Summary: 获取SetupModel
   */
  async getSetupModelEx(request: GetSetupModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSetupModelResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSetupModelResponse>(await this.doRequest("1.0", "antcloud.monitor.setup.model.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSetupModelResponse({}));
  }

  /**
   * Description: 创建单个工作空间组
   * Summary: 创建单个工作空间组
   */
  async createTraasmetaWorkspacegroup(request: CreateTraasmetaWorkspacegroupRequest): Promise<CreateTraasmetaWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个工作空间组
   * Summary: 创建单个工作空间组
   */
  async createTraasmetaWorkspacegroupEx(request: CreateTraasmetaWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.workspacegroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaWorkspacegroupResponse({}));
  }

  /**
   * Description: 获取单个cell
   * Summary: 获取单个cell
   */
  async getTraasmetaCell(request: GetTraasmetaCellRequest): Promise<GetTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个cell
   * Summary: 获取单个cell
   */
  async getTraasmetaCellEx(request: GetTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaCellResponse({}));
  }

  /**
   * Description: 分页查询
   * Summary: 分页查询
   */
  async pagequeryTraasmetaCell(request: PagequeryTraasmetaCellRequest): Promise<PagequeryTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询
   * Summary: 分页查询
   */
  async pagequeryTraasmetaCellEx(request: PagequeryTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaCellResponse({}));
  }

  /**
   * Description: 获取单个主机
   * Summary: 获取单个主机
   */
  async getTraasmetaHostmachine(request: GetTraasmetaHostmachineRequest): Promise<GetTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个主机
   * Summary: 获取单个主机
   */
  async getTraasmetaHostmachineEx(request: GetTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 分页查询主机
   * Summary: 分页查询主机
   */
  async pagequeryTraasmetaHostmachine(request: PagequeryTraasmetaHostmachineRequest): Promise<PagequeryTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询主机
   * Summary: 分页查询主机
   */
  async pagequeryTraasmetaHostmachineEx(request: PagequeryTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 获取单链路详细拓扑
   * Summary: 获取单链路详细拓扑
   */
  async queryTraceDetailtopology(request: QueryTraceDetailtopologyRequest): Promise<QueryTraceDetailtopologyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraceDetailtopologyEx(request, headers, runtime);
  }

  /**
   * Description: 获取单链路详细拓扑
   * Summary: 获取单链路详细拓扑
   */
  async queryTraceDetailtopologyEx(request: QueryTraceDetailtopologyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraceDetailtopologyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraceDetailtopologyResponse>(await this.doRequest("1.0", "antcloud.monitor.trace.detailtopology.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraceDetailtopologyResponse({}));
  }

  /**
   * Description: spi配置-保存spi
   * Summary: spi配置-保存spi
   */
  async saveTenantconfigSpi(request: SaveTenantconfigSpiRequest): Promise<SaveTenantconfigSpiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveTenantconfigSpiEx(request, headers, runtime);
  }

  /**
   * Description: spi配置-保存spi
   * Summary: spi配置-保存spi
   */
  async saveTenantconfigSpiEx(request: SaveTenantconfigSpiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveTenantconfigSpiResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTenantconfigSpiResponse>(await this.doRequest("1.0", "antcloud.monitor.tenantconfig.spi.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveTenantconfigSpiResponse({}));
  }

  /**
   * Description: spi配置-查询spi
   * Summary: spi配置-查询spi
   */
  async queryTenantconfigSpi(request: QueryTenantconfigSpiRequest): Promise<QueryTenantconfigSpiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantconfigSpiEx(request, headers, runtime);
  }

  /**
   * Description: spi配置-查询spi
   * Summary: spi配置-查询spi
   */
  async queryTenantconfigSpiEx(request: QueryTenantconfigSpiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantconfigSpiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantconfigSpiResponse>(await this.doRequest("1.0", "antcloud.monitor.tenantconfig.spi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantconfigSpiResponse({}));
  }

  /**
   * Description: 获取当前用户能够访问的workspace
   * Summary: 获取当前用户能够访问的workspace
   */
  async listOneconsoleWorkspace(request: ListOneconsoleWorkspaceRequest): Promise<ListOneconsoleWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listOneconsoleWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前用户能够访问的workspace
   * Summary: 获取当前用户能够访问的workspace
   */
  async listOneconsoleWorkspaceEx(request: ListOneconsoleWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListOneconsoleWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListOneconsoleWorkspaceResponse>(await this.doRequest("1.0", "antcloud.monitor.oneconsole.workspace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListOneconsoleWorkspaceResponse({}));
  }

  /**
   * Description: spi配置-删除
   * Summary: spi配置-删除
   */
  async deleteTenantconfig(request: DeleteTenantconfigRequest): Promise<DeleteTenantconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTenantconfigEx(request, headers, runtime);
  }

  /**
   * Description: spi配置-删除
   * Summary: spi配置-删除
   */
  async deleteTenantconfigEx(request: DeleteTenantconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTenantconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTenantconfigResponse>(await this.doRequest("1.0", "antcloud.monitor.tenantconfig.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTenantconfigResponse({}));
  }

  /**
   * Description: spi配置-查询token
   * Summary: spi配置-查询token
   */
  async queryTenantconfigToken(request: QueryTenantconfigTokenRequest): Promise<QueryTenantconfigTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantconfigTokenEx(request, headers, runtime);
  }

  /**
   * Description: spi配置-查询token
   * Summary: spi配置-查询token
   */
  async queryTenantconfigTokenEx(request: QueryTenantconfigTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantconfigTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantconfigTokenResponse>(await this.doRequest("1.0", "antcloud.monitor.tenantconfig.token.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantconfigTokenResponse({}));
  }

  /**
   * Description: spi配置-保存token
   * Summary: spi配置-保存token
   */
  async saveTenantconfigToken(request: SaveTenantconfigTokenRequest): Promise<SaveTenantconfigTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveTenantconfigTokenEx(request, headers, runtime);
  }

  /**
   * Description: spi配置-保存token
   * Summary: spi配置-保存token
   */
  async saveTenantconfigTokenEx(request: SaveTenantconfigTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveTenantconfigTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTenantconfigTokenResponse>(await this.doRequest("1.0", "antcloud.monitor.tenantconfig.token.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveTenantconfigTokenResponse({}));
  }

  /**
   * Description: 查询元数据实体基本信息
   * Summary: 查询元数据实体基本信息
   */
  async queryTraasmetaEntity(request: QueryTraasmetaEntityRequest): Promise<QueryTraasmetaEntityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaEntityEx(request, headers, runtime);
  }

  /**
   * Description: 查询元数据实体基本信息
   * Summary: 查询元数据实体基本信息
   */
  async queryTraasmetaEntityEx(request: QueryTraasmetaEntityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaEntityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaEntityResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.entity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaEntityResponse({}));
  }

  /**
   * Description: 获取实体字段列表
   * Summary: 获取实体字段列表
   */
  async listTraasmetaEntityfield(request: ListTraasmetaEntityfieldRequest): Promise<ListTraasmetaEntityfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTraasmetaEntityfieldEx(request, headers, runtime);
  }

  /**
   * Description: 获取实体字段列表
   * Summary: 获取实体字段列表
   */
  async listTraasmetaEntityfieldEx(request: ListTraasmetaEntityfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTraasmetaEntityfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTraasmetaEntityfieldResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.entityfield.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTraasmetaEntityfieldResponse({}));
  }

  /**
   * Description: 查询实体拓扑
   * Summary: 查询实体拓扑
   */
  async queryTraasmetaEntitytopo(request: QueryTraasmetaEntitytopoRequest): Promise<QueryTraasmetaEntitytopoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaEntitytopoEx(request, headers, runtime);
  }

  /**
   * Description: 查询实体拓扑
   * Summary: 查询实体拓扑
   */
  async queryTraasmetaEntitytopoEx(request: QueryTraasmetaEntitytopoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaEntitytopoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaEntitytopoResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.entitytopo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaEntitytopoResponse({}));
  }

  /**
   * Description: 获取所有主机
   * Summary: 获取所有主机
   */
  async allTraasmetaHostmachine(request: AllTraasmetaHostmachineRequest): Promise<AllTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有主机
   * Summary: 获取所有主机
   */
  async allTraasmetaHostmachineEx(request: AllTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 批量创建主机
   * Summary: 批量创建主机
   */
  async batchcreateTraasmetaHostmachine(request: BatchcreateTraasmetaHostmachineRequest): Promise<BatchcreateTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建主机
   * Summary: 批量创建主机
   */
  async batchcreateTraasmetaHostmachineEx(request: BatchcreateTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 批量删除主机
   * Summary: 批量删除主机
   */
  async batchdeleteTraasmetaHostmachine(request: BatchdeleteTraasmetaHostmachineRequest): Promise<BatchdeleteTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除主机
   * Summary: 批量删除主机
   */
  async batchdeleteTraasmetaHostmachineEx(request: BatchdeleteTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 批量查询主机
   * Summary: 批量查询主机
   */
  async batchqueryTraasmetaHostmachine(request: BatchqueryTraasmetaHostmachineRequest): Promise<BatchqueryTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询主机
   * Summary: 批量查询主机
   */
  async batchqueryTraasmetaHostmachineEx(request: BatchqueryTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 创建单个主机
   * Summary: 创建单个主机
   */
  async createTraasmetaHostmachine(request: CreateTraasmetaHostmachineRequest): Promise<CreateTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个主机
   * Summary: 创建单个主机
   */
  async createTraasmetaHostmachineEx(request: CreateTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 删除主机
   * Summary: 删除主机
   */
  async deleteTraasmetaHostmachine(request: DeleteTraasmetaHostmachineRequest): Promise<DeleteTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 删除主机
   * Summary: 删除主机
   */
  async deleteTraasmetaHostmachineEx(request: DeleteTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 查询主机
   * Summary: 查询主机
   */
  async queryTraasmetaHostmachine(request: QueryTraasmetaHostmachineRequest): Promise<QueryTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 查询主机
   * Summary: 查询主机
   */
  async queryTraasmetaHostmachineEx(request: QueryTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 更新主机
   * Summary: 更新主机
   */
  async updateTraasmetaHostmachine(request: UpdateTraasmetaHostmachineRequest): Promise<UpdateTraasmetaHostmachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaHostmachineEx(request, headers, runtime);
  }

  /**
   * Description: 更新主机
   * Summary: 更新主机
   */
  async updateTraasmetaHostmachineEx(request: UpdateTraasmetaHostmachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaHostmachineResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaHostmachineResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.hostmachine.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaHostmachineResponse({}));
  }

  /**
   * Description: 批量创建cell
   * Summary: 批量创建cell
   */
  async batchcreateTraasmetaCell(request: BatchcreateTraasmetaCellRequest): Promise<BatchcreateTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建cell
   * Summary: 批量创建cell
   */
  async batchcreateTraasmetaCellEx(request: BatchcreateTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTraasmetaCellResponse({}));
  }

  /**
   * Description: 批量删除cell
   * Summary: 批量删除cell
   */
  async batchdeleteTraasmetaCell(request: BatchdeleteTraasmetaCellRequest): Promise<BatchdeleteTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除cell
   * Summary: 批量删除cell
   */
  async batchdeleteTraasmetaCellEx(request: BatchdeleteTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteTraasmetaCellResponse({}));
  }

  /**
   * Description: 批量查询cell
   * Summary: 批量查询cell
   */
  async batchqueryTraasmetaCell(request: BatchqueryTraasmetaCellRequest): Promise<BatchqueryTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询cell
   * Summary: 批量查询cell
   */
  async batchqueryTraasmetaCellEx(request: BatchqueryTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTraasmetaCellResponse({}));
  }

  /**
   * Description: 更新cell
   * Summary: 更新cell
   */
  async updateTraasmetaCell(request: UpdateTraasmetaCellRequest): Promise<UpdateTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 更新cell
   * Summary: 更新cell
   */
  async updateTraasmetaCellEx(request: UpdateTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTraasmetaCellResponse({}));
  }

  /**
   * Description: 创建单个cell
   * Summary: 创建单个cell
   */
  async createTraasmetaCell(request: CreateTraasmetaCellRequest): Promise<CreateTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个cell
   * Summary: 创建单个cell
   */
  async createTraasmetaCellEx(request: CreateTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTraasmetaCellResponse({}));
  }

  /**
   * Description: 删除单个cell
   * Summary: 删除单个cell
   */
  async deleteTraasmetaCell(request: DeleteTraasmetaCellRequest): Promise<DeleteTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个cell
   * Summary: 删除单个cell
   */
  async deleteTraasmetaCellEx(request: DeleteTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTraasmetaCellResponse({}));
  }

  /**
   * Description: 获取所有cell
   * Summary: 获取所有cell
   */
  async allTraasmetaCell(request: AllTraasmetaCellRequest): Promise<AllTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有cell
   * Summary: 获取所有cell
   */
  async allTraasmetaCellEx(request: AllTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTraasmetaCellResponse({}));
  }

  /**
   * Description: 查询cell
   * Summary: 查询cell
   */
  async queryTraasmetaCell(request: QueryTraasmetaCellRequest): Promise<QueryTraasmetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraasmetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询cell
   * Summary: 查询cell
   */
  async queryTraasmetaCellEx(request: QueryTraasmetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraasmetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraasmetaCellResponse>(await this.doRequest("1.0", "antcloud.monitor.traasmeta.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraasmetaCellResponse({}));
  }

}
