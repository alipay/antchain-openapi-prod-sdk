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

// 进行中事务数统计
export class Ongoing extends $tea.Model {
  // 进行中分支事务数
  actionNum: number;
  // 进行中事务数
  activityNum: number;
  static names(): { [key: string]: string } {
    return {
      actionNum: 'action_num',
      activityNum: 'activity_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionNum: 'number',
      activityNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 当天事务数统计
export class Today extends $tea.Model {
  // 当天分支事务数
  actionNum: number;
  // 当天事务数
  activityNum: number;
  static names(): { [key: string]: string } {
    return {
      actionNum: 'action_num',
      activityNum: 'activity_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionNum: 'number',
      activityNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异常事务数
export class ExceptionStats extends $tea.Model {
  // 异常事务数
  total: number;
  static names(): { [key: string]: string } {
    return {
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 页面展示的发起方数据源信息
export class ActivityDsVO extends $tea.Model {
  // 9
  actionTableIndexEnd: number;
  // 0
  actionTableIndexStart: number;
  // .
  actionTableNameFormat: string;
  // activity_table_index_end
  activityTableIndexEnd: number;
  // a
  activityTableIndexStart: number;
  // 主事务表
  activityTableNameFormat: string;
  // DB最小连接数
  dbConnectMin: number;
  // DB最大连接数
  dbConnMax: number;
  // 数据库类型
  dbType: number;
  // 统一数据源索引结束值
  dsIndexEnd: number;
  // 统一数据源索引起始值
  dsIndexStart: number;
  // 统一数据源
  dsNameFormat: string;
  // 唯一id
  id: number;
  // 部署模式
  // true：rzone部署，false：gzone部署
  isLdc: boolean;
  // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
  isLocalDs: boolean;
  // gzone部署，国际IPAY站点使用
  zone: string;
  // .
  taskNameFormat: string;
  // .
  taskIndexStart?: number;
  // .
  taskIndexEnd?: number;
  static names(): { [key: string]: string } {
    return {
      actionTableIndexEnd: 'action_table_index_end',
      actionTableIndexStart: 'action_table_index_start',
      actionTableNameFormat: 'action_table_name_format',
      activityTableIndexEnd: 'activity_table_index_end',
      activityTableIndexStart: 'activity_table_index_start',
      activityTableNameFormat: 'activity_table_name_format',
      dbConnectMin: 'db_connect_min',
      dbConnMax: 'db_conn_max',
      dbType: 'db_type',
      dsIndexEnd: 'ds_index_end',
      dsIndexStart: 'ds_index_start',
      dsNameFormat: 'ds_name_format',
      id: 'id',
      isLdc: 'is_ldc',
      isLocalDs: 'is_local_ds',
      zone: 'zone',
      taskNameFormat: 'task_name_format',
      taskIndexStart: 'task_index_start',
      taskIndexEnd: 'task_index_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionTableIndexEnd: 'number',
      actionTableIndexStart: 'number',
      actionTableNameFormat: 'string',
      activityTableIndexEnd: 'number',
      activityTableIndexStart: 'number',
      activityTableNameFormat: 'string',
      dbConnectMin: 'number',
      dbConnMax: 'number',
      dbType: 'number',
      dsIndexEnd: 'number',
      dsIndexStart: 'number',
      dsNameFormat: 'string',
      id: 'number',
      isLdc: 'boolean',
      isLocalDs: 'boolean',
      zone: 'string',
      taskNameFormat: 'string',
      taskIndexStart: 'number',
      taskIndexEnd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TransactionNode
export class TransactionNode extends $tea.Model {
  // id
  id: number;
  // start_time
  startTime: string;
  // end_time
  endTime: string;
  // role
  role: string;
  // name
  name: string;
  // label
  label: string;
  // is_end
  isEnd: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      startTime: 'start_time',
      endTime: 'end_time',
      role: 'role',
      name: 'name',
      label: 'label',
      isEnd: 'is_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      startTime: 'string',
      endTime: 'string',
      role: 'string',
      name: 'string',
      label: 'string',
      isEnd: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事务统计信息
export class Stats extends $tea.Model {
  // 异常事务数
  exception: ExceptionStats;
  // 进行中事务数统计
  ongoing: Ongoing;
  // 当天事务数统计
  today: Today;
  static names(): { [key: string]: string } {
    return {
      exception: 'exception',
      ongoing: 'ongoing',
      today: 'today',
    };
  }

  static types(): { [key: string]: any } {
    return {
      exception: ExceptionStats,
      ongoing: Ongoing,
      today: Today,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用列表，发起方 view object
export class AppRecoveryVO extends $tea.Model {
  // app
  appName: string;
  // 客户端模式
  clientVersion: string;
  // 数据源数组
  dsArray: ActivityDsVO[];
  // 唯一id
  id: number;
  // 是否异步化
  isAsyn: boolean;
  // 数据源配置是否在dds中
  isDds: boolean;
  // 压测
  isLoadTest: boolean;
  // 是否混合模式 
  isMix: boolean;
  // 单条恢复数
  recoveryLimit: number;
  // 恢复任务线程数
  recoveryThreadNum: number;
  // 是否被使用
  used: boolean;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      clientVersion: 'client_version',
      dsArray: 'ds_array',
      id: 'id',
      isAsyn: 'is_asyn',
      isDds: 'is_dds',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
      used: 'used',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      clientVersion: 'string',
      dsArray: { 'type': 'array', 'itemType': ActivityDsVO },
      id: 'number',
      isAsyn: 'boolean',
      isDds: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
      used: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联调记录中的发起方信息
export class DebugInitiator extends $tea.Model {
  // 应用名
  appName: string;
  // 数据源名
  dsName: string;
  // 主事务记录表
  activityTableName: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      dsName: 'ds_name',
      activityTableName: 'activity_table_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      dsName: 'string',
      activityTableName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class AppInfo extends $tea.Model {
  // 应用名
  appName: string;
  // 创建人
  creator: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 应用owner
  owner: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      creator: 'creator',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      owner: 'owner',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      creator: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      owner: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主事务趋势图
export class ActivityTrend extends $tea.Model {
  // 时间点
  time: number;
  // 总数
  total: number;
  // 成功数
  success: number;
  // 回滚数
  rollback: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      total: 'total',
      success: 'success',
      rollback: 'rollback',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'number',
      total: 'number',
      success: 'number',
      rollback: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参与者信息
export class Participator extends $tea.Model {
  // 参与者名称
  actionName?: string;
  // 应用名
  appName?: string;
  // 类全名，包括完整包名
  className?: string;
  // 提交方法名称
  commitMethodName?: string;
  // 提交方法参数
  commitMethodParamsType?: number;
  // 弹性key
  elasticKey?: string;
  // 弹性路由规则（Groovy脚本）
  elasticRouteRule?: string;
  // 记录id，更新必传
  id?: number;
  // instance_id
  instanceId?: string;
  // rpc是否ldc调用
  isZoneRoute?: boolean;
  // 回滚方法名称
  rollbackMethodName?: string;
  // 回滚方法的参数类型
  rollbackMethodParamsType?: number;
  // rpc接口测试地址
  testUrl?: string;
  // rpc uniqueId
  uniqueId?: string;
  // 是否被使用
  used?: boolean;
  // rpc协议，ws或tr
  wsTr?: string;
  static names(): { [key: string]: string } {
    return {
      actionName: 'action_name',
      appName: 'app_name',
      className: 'class_name',
      commitMethodName: 'commit_method_name',
      commitMethodParamsType: 'commit_method_params_type',
      elasticKey: 'elastic_key',
      elasticRouteRule: 'elastic_route_rule',
      id: 'id',
      instanceId: 'instance_id',
      isZoneRoute: 'is_zone_route',
      rollbackMethodName: 'rollback_method_name',
      rollbackMethodParamsType: 'rollback_method_params_type',
      testUrl: 'test_url',
      uniqueId: 'unique_id',
      used: 'used',
      wsTr: 'ws_tr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionName: 'string',
      appName: 'string',
      className: 'string',
      commitMethodName: 'string',
      commitMethodParamsType: 'number',
      elasticKey: 'string',
      elasticRouteRule: 'string',
      id: 'number',
      instanceId: 'string',
      isZoneRoute: 'boolean',
      rollbackMethodName: 'string',
      rollbackMethodParamsType: 'number',
      testUrl: 'string',
      uniqueId: 'string',
      used: 'boolean',
      wsTr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起方数据源
export class InitiatorDatasource extends $tea.Model {
  // 分支事务表索引结束点
  actionTableIndexEnd?: number;
  // 分支事务表索引起始点
  actionTableIndexStart?: number;
  // 分支事务表模板
  actionTableNameFormat?: string;
  // 主事务表索引结束点
  activityTableIndexEnd?: number;
  // 主事务表索引起始点
  activityTableIndexStart?: number;
  // 主事务表模板
  activityTableNameFormat?: string;
  // DB最小连接数
  dbConnectMin: number;
  // DB最大连接数
  dbConnMax: number;
  // 数据库类型
  dbType: number;
  // 数据源索引结束点
  dsIndexEnd?: number;
  // 数据源索引起始点
  dsIndexStart?: number;
  // 数据源名字
  dsNameFormat?: string;
  // 唯一键，更新时需要
  id?: number;
  // 环境唯一标识
  instanceId: string;
  // true：rzone部署，false：gzone部署
  isLdc: boolean;
  // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
  isLocalDs: boolean;
  // gzone部署，国际IPAY站点使用
  zone: string;
  static names(): { [key: string]: string } {
    return {
      actionTableIndexEnd: 'action_table_index_end',
      actionTableIndexStart: 'action_table_index_start',
      actionTableNameFormat: 'action_table_name_format',
      activityTableIndexEnd: 'activity_table_index_end',
      activityTableIndexStart: 'activity_table_index_start',
      activityTableNameFormat: 'activity_table_name_format',
      dbConnectMin: 'db_connect_min',
      dbConnMax: 'db_conn_max',
      dbType: 'db_type',
      dsIndexEnd: 'ds_index_end',
      dsIndexStart: 'ds_index_start',
      dsNameFormat: 'ds_name_format',
      id: 'id',
      instanceId: 'instance_id',
      isLdc: 'is_ldc',
      isLocalDs: 'is_local_ds',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionTableIndexEnd: 'number',
      actionTableIndexStart: 'number',
      actionTableNameFormat: 'string',
      activityTableIndexEnd: 'number',
      activityTableIndexStart: 'number',
      activityTableNameFormat: 'string',
      dbConnectMin: 'number',
      dbConnMax: 'number',
      dbType: 'number',
      dsIndexEnd: 'number',
      dsIndexStart: 'number',
      dsNameFormat: 'string',
      id: 'number',
      instanceId: 'string',
      isLdc: 'boolean',
      isLocalDs: 'boolean',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分库分表规则
export class SplitRule extends $tea.Model {
  // db_split_rule
  dbSplitRule: number;
  // db_split_template
  dbSplitTemplate?: string;
  // table_split_rule
  tableSplitRule: number;
  // table_split_template
  tableSplitTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      dbSplitRule: 'db_split_rule',
      dbSplitTemplate: 'db_split_template',
      tableSplitRule: 'table_split_rule',
      tableSplitTemplate: 'table_split_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dbSplitRule: 'number',
      dbSplitTemplate: 'string',
      tableSplitRule: 'number',
      tableSplitTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事务详情
export class TransactionInfo extends $tea.Model {
  // Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
  actionMode?: number;
  // 业务码
  bizType: string;
  // 业务id
  businessId: string;
  // 结束时间
  endTime: string;
  // 发起方ip
  initiatorIp: string;
  // 发起方名称
  initiatorName: string;
  // 最近修改时间
  modifyTime: string;
  // 参与者id列表
  participatorIds: string[];
  // 开始时间
  startTime: string;
  // 事务状态
  status: string;
  // 事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      actionMode: 'action_mode',
      bizType: 'biz_type',
      businessId: 'business_id',
      endTime: 'end_time',
      initiatorIp: 'initiator_ip',
      initiatorName: 'initiator_name',
      modifyTime: 'modify_time',
      participatorIds: 'participator_ids',
      startTime: 'start_time',
      status: 'status',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionMode: 'number',
      bizType: 'string',
      businessId: 'string',
      endTime: 'string',
      initiatorIp: 'string',
      initiatorName: 'string',
      modifyTime: 'string',
      participatorIds: { 'type': 'array', 'itemType': 'string' },
      startTime: 'string',
      status: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联调记录中的参与者信息
export class DebugParticipator extends $tea.Model {
  // 主事务id
  txId: string;
  // 分支事务id
  actionId: string;
  // 参与者名称
  actionName: string;
  // 1：提交，2：回滚
  actionType: number;
  // 主事务上下文
  activityContext: string;
  // 分支事务上下文
  actionContext: string;
  static names(): { [key: string]: string } {
    return {
      txId: 'tx_id',
      actionId: 'action_id',
      actionName: 'action_name',
      actionType: 'action_type',
      activityContext: 'activity_context',
      actionContext: 'action_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txId: 'string',
      actionId: 'string',
      actionName: 'string',
      actionType: 'number',
      activityContext: 'string',
      actionContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分支事务数趋势图
export class ActionTrend extends $tea.Model {
  // 时间点
  time: number;
  // 总数
  total: number;
  // 成功数
  success: number;
  // 回滚数
  rollback: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      total: 'total',
      success: 'success',
      rollback: 'rollback',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'number',
      total: 'number',
      success: 'number',
      rollback: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异常事务数趋势图
export class ExceptionTrend extends $tea.Model {
  // 时间点
  time: number;
  // 异常事务数
  total: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事务详情 参与者信息
export class TransactionsParticipator extends $tea.Model {
  // app_name
  appName: string;
  // id
  id: string;
  // method_name
  methodName: string;
  // method_type
  methodType: string;
  // rsDesc
  rsDesc: string;
  // rs_type
  rsType: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      id: 'id',
      methodName: 'method_name',
      methodType: 'method_type',
      rsDesc: 'rs_desc',
      rsType: 'rs_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      id: 'string',
      methodName: 'string',
      methodType: 'string',
      rsDesc: 'string',
      rsType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TransactionEdge
export class TransactionEdge extends $tea.Model {
  // id
  id: number;
  // source
  source: number;
  // target
  target: number;
  // type
  type: string;
  // content
  content: string;
  // isError
  isError: boolean;
  // error_message
  errorMessage: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      source: 'source',
      target: 'target',
      type: 'type',
      content: 'content',
      isError: 'is_error',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      source: 'number',
      target: 'number',
      type: 'string',
      content: 'string',
      isError: 'boolean',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环境信息
export class EnvInfo extends $tea.Model {
  // 环境
  env: string;
  // 是否公有云环境
  isPublicCloud: boolean;
  // 租户
  tenant: string;
  // server / client
  recoveryMode: string;
  static names(): { [key: string]: string } {
    return {
      env: 'env',
      isPublicCloud: 'is_public_cloud',
      tenant: 'tenant',
      recoveryMode: 'recovery_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      env: 'string',
      isPublicCloud: 'boolean',
      tenant: 'string',
      recoveryMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起方数据源存储实体
export class RecoveryDsDTO extends $tea.Model {
  // 分支事务表索引结束点
  actionTableIndexEnd?: number;
  // 分支事务表索引起始点
  // 
  actionTableIndexStart?: number;
  // 分支事务表模板
  // 
  actionTableNameFormat?: string;
  // 主事务表索引结束点
  activityTableIndexEnd?: number;
  // 主事务表索引起始点
  // 
  activityTableIndexStart?: number;
  // 主事务表模板
  activityTableNameFormat?: string;
  // DB最小连接数
  // 
  dbConnectMin?: number;
  // DB最大连接数
  dbConnMax?: number;
  // 数据库类型
  // 
  dbType?: number;
  // 数据源索引结束点
  // 
  dsIndexEnd?: number;
  // 数据源索引起始点
  // 
  dsIndexStart?: number;
  // 数据源名字
  dsNameFormat?: string;
  // 发起方组groupid
  groupId?: string;
  // 主键id 更新时传一下
  id?: number;
  // true：rzone部署，false：gzone部署
  isLdc?: boolean;
  // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
  isLocalDs?: boolean;
  // gzone部署，国际IPAY站点使用
  zone?: string;
  // 恢复任务名称模板
  taskNameFormat?: string;
  // 恢复任务起始索引
  taskIndexStart?: number;
  // 恢复任务结束索引
  taskIndexEnd?: number;
  static names(): { [key: string]: string } {
    return {
      actionTableIndexEnd: 'action_table_index_end',
      actionTableIndexStart: 'action_table_index_start',
      actionTableNameFormat: 'action_table_name_format',
      activityTableIndexEnd: 'activity_table_index_end',
      activityTableIndexStart: 'activity_table_index_start',
      activityTableNameFormat: 'activity_table_name_format',
      dbConnectMin: 'db_connect_min',
      dbConnMax: 'db_conn_max',
      dbType: 'db_type',
      dsIndexEnd: 'ds_index_end',
      dsIndexStart: 'ds_index_start',
      dsNameFormat: 'ds_name_format',
      groupId: 'group_id',
      id: 'id',
      isLdc: 'is_ldc',
      isLocalDs: 'is_local_ds',
      zone: 'zone',
      taskNameFormat: 'task_name_format',
      taskIndexStart: 'task_index_start',
      taskIndexEnd: 'task_index_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionTableIndexEnd: 'number',
      actionTableIndexStart: 'number',
      actionTableNameFormat: 'string',
      activityTableIndexEnd: 'number',
      activityTableIndexStart: 'number',
      activityTableNameFormat: 'string',
      dbConnectMin: 'number',
      dbConnMax: 'number',
      dbType: 'number',
      dsIndexEnd: 'number',
      dsIndexStart: 'number',
      dsNameFormat: 'string',
      groupId: 'string',
      id: 'number',
      isLdc: 'boolean',
      isLocalDs: 'boolean',
      zone: 'string',
      taskNameFormat: 'string',
      taskIndexStart: 'number',
      taskIndexEnd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Instance信息
export class InstanceDTO extends $tea.Model {
  // instance id
  instanceId: string;
  // 租户id
  tenantId: string;
  // 工作空间
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 切换动作
export class SwitchoverAction extends $tea.Model {
  // 目标单元
  destCell?: string;
  // 来源单元
  sourceCell?: string;
  static names(): { [key: string]: string } {
    return {
      destCell: 'dest_cell',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      destCell: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事务趋势图
export class Trend extends $tea.Model {
  // 分支事务数趋势图
  actionTrend: ActionTrend[];
  // 主事务数趋势图
  activityTrend: ActivityTrend[];
  // 事务失败数趋势图
  exceptionTrend: ExceptionTrend[];
  static names(): { [key: string]: string } {
    return {
      actionTrend: 'action_trend',
      activityTrend: 'activity_trend',
      exceptionTrend: 'exception_trend',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionTrend: { 'type': 'array', 'itemType': ActionTrend },
      activityTrend: { 'type': 'array', 'itemType': ActivityTrend },
      exceptionTrend: { 'type': 'array', 'itemType': ExceptionTrend },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用列表 应用信息
export class AppInfoVO extends $tea.Model {
  // 参与者数组
  actionArray: Participator[];
  // 10
  actionCount: number;
  // 10
  activityCount: number;
  // 1 同库 2 异库
  activityMode: number;
  // app
  appName: string;
  // 分库规则
  dbRuleName: string;
  // 分库规则
  dbRuleTemplate: string;
  // 一句话描述
  desc: string;
  // 唯一id
  id: number;
  // 1
  recoveryArray: AppRecoveryVO[];
  // 分表类型
  tableRuleName: string;
  // 分表规则
  tableRuleTemplate: string;
  // 是否被使用
  used: boolean;
  // 1 单库单表 2 分库分表
  spliteMode: number;
  static names(): { [key: string]: string } {
    return {
      actionArray: 'action_array',
      actionCount: 'action_count',
      activityCount: 'activity_count',
      activityMode: 'activity_mode',
      appName: 'app_name',
      dbRuleName: 'db_rule_name',
      dbRuleTemplate: 'db_rule_template',
      desc: 'desc',
      id: 'id',
      recoveryArray: 'recovery_array',
      tableRuleName: 'table_rule_name',
      tableRuleTemplate: 'table_rule_template',
      used: 'used',
      spliteMode: 'splite_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionArray: { 'type': 'array', 'itemType': Participator },
      actionCount: 'number',
      activityCount: 'number',
      activityMode: 'number',
      appName: 'string',
      dbRuleName: 'string',
      dbRuleTemplate: 'string',
      desc: 'string',
      id: 'number',
      recoveryArray: { 'type': 'array', 'itemType': AppRecoveryVO },
      tableRuleName: 'string',
      tableRuleTemplate: 'string',
      used: 'boolean',
      spliteMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DsName & DsNameFormat
export class DsNameInfo extends $tea.Model {
  // ds_name
  dsName: string;
  // ds_name_format
  dsNameFormat: string;
  static names(): { [key: string]: string } {
    return {
      dsName: 'ds_name',
      dsNameFormat: 'ds_name_format',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dsName: 'string',
      dsNameFormat: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量添加发起方 DO
export class RecoveryDTO extends $tea.Model {
  // 客户端版本
  // 
  clientVersion?: string;
  // 发起方组编号
  groupId?: string;
  // 主键id，更新时需要
  id?: number;
  // 是否异步化
  isAsyn?: boolean;
  // 是否压测任务
  isLoadTest?: boolean;
  // 是否混合模式
  isMix?: boolean;
  // 恢复条数/分/表
  recoveryLimit?: number;
  // 恢复线程数
  recoveryThreadNum?: number;
  static names(): { [key: string]: string } {
    return {
      clientVersion: 'client_version',
      groupId: 'group_id',
      id: 'id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientVersion: 'string',
      groupId: 'string',
      id: 'number',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k:v
export class Pair extends $tea.Model {
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

// app and action view object
export class AppActionVO extends $tea.Model {
  // 应用名
  appName: string;
  // 参与者名称数组
  actionArray: string[];
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      actionArray: 'action_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      actionArray: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起方信息
export class Initiator extends $tea.Model {
  // 应用名
  appName: string;
  // 客户端版本
  clientVersion: string;
  // 记录id
  id: number;
  // 环境唯一标识
  instanceId: string;
  // 是否异步化
  isAsyn: boolean;
  // 是否压测任务
  isLoadTest: boolean;
  // 是否混合模式
  isMix: boolean;
  // 发起方数据源
  recoveryDatasources: InitiatorDatasource[];
  // 恢复条数/分/表
  recoveryLimit?: number;
  // 恢复线程数
  recoveryThreadNum?: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      clientVersion: 'client_version',
      id: 'id',
      instanceId: 'instance_id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryDatasources: 'recovery_datasources',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      clientVersion: 'string',
      id: 'number',
      instanceId: 'string',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryDatasources: { 'type': 'array', 'itemType': InitiatorDatasource },
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起方appinfo
export class TrasactionAppInfo extends $tea.Model {
  // 应用名
  appName: string;
  // recovery_id
  recoveryId: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      recoveryId: 'recovery_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      recoveryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// app信息及统计信息
export class AppStats extends $tea.Model {
  // app name
  appName?: string;
  // 异常数
  exceptionTotal?: number;
  // 时间
  gmtCreate?: string;
  // 发起方
  initiator?: string[];
  // 参与者
  participator?: string[];
  // 今日事务总数
  todayTotal?: number;
  // Saga模式返回3，其它模式不返回
  actionMode?: number;
  // 字段ID
  id?: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      exceptionTotal: 'exception_total',
      gmtCreate: 'gmt_create',
      initiator: 'initiator',
      participator: 'participator',
      todayTotal: 'today_total',
      actionMode: 'action_mode',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      exceptionTotal: 'number',
      gmtCreate: 'string',
      initiator: { 'type': 'array', 'itemType': 'string' },
      participator: { 'type': 'array', 'itemType': 'string' },
      todayTotal: 'number',
      actionMode: 'number',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 悬挂事务恢复详情
export class Correction extends $tea.Model {
  // 分支事务上下文
  actionContext: string;
  // 参与者名称
  actionName: string;
  // 1：提交，2：回滚
  actionType: number;
  // 主事务上下文
  activityContext: string;
  // 应用名
  appName: string;
  // 创建时间
  gmtCreate: string;
  // 记录id
  id: number;
  // 操作人
  operator: string;
  // 0 已提交  4 已执行
  state: string;
  // 是否同步主账务；0、不同步，1、同步
  syncAcctrans: number;
  // 是否同步统一支付；0、不同步，1同步
  syncPaycore: number;
  // tracer上下文
  tracerContext?: string;
  // 事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      actionContext: 'action_context',
      actionName: 'action_name',
      actionType: 'action_type',
      activityContext: 'activity_context',
      appName: 'app_name',
      gmtCreate: 'gmt_create',
      id: 'id',
      operator: 'operator',
      state: 'state',
      syncAcctrans: 'sync_acctrans',
      syncPaycore: 'sync_paycore',
      tracerContext: 'tracer_context',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionContext: 'string',
      actionName: 'string',
      actionType: 'number',
      activityContext: 'string',
      appName: 'string',
      gmtCreate: 'string',
      id: 'number',
      operator: 'string',
      state: 'string',
      syncAcctrans: 'number',
      syncPaycore: 'number',
      tracerContext: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异库模式应用事务信息
export class AsynDbTxInfo extends $tea.Model {
  // action_mode
  actionMode?: number;
  // activity_mode
  activityMode: number;
  // app_name
  appName: string;
  // biz_type
  bizType: string;
  // desc
  desc?: string;
  // instance_id
  instanceId: string;
  // role
  role: number;
  // split_rule
  splitRule?: SplitRule;
  static names(): { [key: string]: string } {
    return {
      actionMode: 'action_mode',
      activityMode: 'activity_mode',
      appName: 'app_name',
      bizType: 'biz_type',
      desc: 'desc',
      instanceId: 'instance_id',
      role: 'role',
      splitRule: 'split_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionMode: 'number',
      activityMode: 'number',
      appName: 'string',
      bizType: 'string',
      desc: 'string',
      instanceId: 'string',
      role: 'number',
      splitRule: SplitRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参与者信息
export class ActionInfo extends $tea.Model {
  // action_mode
  actionMode?: string;
  // action_name
  actionName: string;
  // app_name
  appName: string;
  // commit
  commit: string;
  // rollback
  rollback: string;
  // ws_tr
  wsTr: string;
  static names(): { [key: string]: string } {
    return {
      actionMode: 'action_mode',
      actionName: 'action_name',
      appName: 'app_name',
      commit: 'commit',
      rollback: 'rollback',
      wsTr: 'ws_tr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionMode: 'string',
      actionName: 'string',
      appName: 'string',
      commit: 'string',
      rollback: 'string',
      wsTr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 排序
export class OrderByParams extends $tea.Model {
  // 排序字段
  orderName: string;
  // asc 正序  desc 倒序
  orderType: string;
  static names(): { [key: string]: string } {
    return {
      orderName: 'order_name',
      orderType: 'order_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderName: 'string',
      orderType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联调记录，包括发起方联调和参与者联调
export class DebugRecord extends $tea.Model {
  // 应用名
  appName: string;
  // 1：发起方联调，2：参与者联调
  debugType: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 记录id
  id: number;
  // 发起方信息
  initiator: DebugInitiator;
  // 环境唯一标识
  instanceId: string;
  // 执行人
  operator: string;
  // 参与者信息
  participator: DebugParticipator;
  // 状态
  state: string;
  // 联调结果信息
  msg: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      debugType: 'debug_type',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      initiator: 'initiator',
      instanceId: 'instance_id',
      operator: 'operator',
      participator: 'participator',
      state: 'state',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      debugType: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      initiator: DebugInitiator,
      instanceId: 'string',
      operator: 'string',
      participator: DebugParticipator,
      state: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分表规则
export class TableSplitRule extends $tea.Model {
  // 分表规则名
  ruleName: string;
  // 格式模板
  ruleTemplate: string;
  static names(): { [key: string]: string } {
    return {
      ruleName: 'rule_name',
      ruleTemplate: 'rule_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleName: 'string',
      ruleTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 白名单信息
export class WhiteListInfo extends $tea.Model {
  // app_ame
  appName: string;
  // 2018-10-10T10:10:00Z
  gmtCreate: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  // 机房选择：0非弹机房，1弹性机房；
  isElastic: number;
  // 0正常流量，1影子流量；
  isLoadTest: number;
  // 数据源名称
  logicalDsName: string;
  // business_type
  businessType?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      gmtCreate: 'gmt_create',
      id: 'id',
      instanceId: 'instance_id',
      isElastic: 'is_elastic',
      isLoadTest: 'is_load_test',
      logicalDsName: 'logical_ds_name',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      gmtCreate: 'string',
      id: 'number',
      instanceId: 'string',
      isElastic: 'number',
      isLoadTest: 'number',
      logicalDsName: 'string',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 全局统计数据
export class GlobalStats extends $tea.Model {
  // 异常事务数
  exception: number;
  // 进行中事务数
  activity: number;
  // 当天事务数
  today: number;
  // connection
  connection?: number;
  static names(): { [key: string]: string } {
    return {
      exception: 'exception',
      activity: 'activity',
      today: 'today',
      connection: 'connection',
    };
  }

  static types(): { [key: string]: any } {
    return {
      exception: 'number',
      activity: 'number',
      today: 'number',
      connection: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 组合对象，事务详情和参与者详情
export class TransactionParticipators extends $tea.Model {
  // 参与者详情列表
  participators: TransactionsParticipator[];
  // 事务详情
  transactionInfo: TransactionInfo;
  static names(): { [key: string]: string } {
    return {
      participators: 'participators',
      transactionInfo: 'transaction_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      participators: { 'type': 'array', 'itemType': TransactionsParticipator },
      transactionInfo: TransactionInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// app简要信息
export class AppTxInfo extends $tea.Model {
  // appInfo
  appInfo: AppInfo;
  // Stats
  stats: Stats;
  static names(): { [key: string]: string } {
    return {
      appInfo: 'app_info',
      stats: 'stats',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appInfo: AppInfo,
      stats: Stats,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TransactionChartInfo
export class TransactionChartInfo extends $tea.Model {
  // a
  bizId: string;
  // biz_type
  bizType: string;
  // cost
  cost: number;
  // edges
  edges: TransactionEdge[];
  // end_time
  endTime?: string;
  // last_handle_time
  lastHandleTime?: string;
  // lowerLineCount
  lowerLineCount: number;
  // nodes
  nodes: TransactionNode[];
  // participatorNum
  participatorNum: number;
  // starter_ip
  starterIp: string;
  // starterName
  starterName: string;
  // start_time
  startTime: string;
  // state
  state: string;
  // txid
  txId: string;
  // upper_line_count
  upperLineCount: number;
  // action_mode
  actionMode?: number;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizType: 'biz_type',
      cost: 'cost',
      edges: 'edges',
      endTime: 'end_time',
      lastHandleTime: 'last_handle_time',
      lowerLineCount: 'lower_line_count',
      nodes: 'nodes',
      participatorNum: 'participator_num',
      starterIp: 'starter_ip',
      starterName: 'starter_name',
      startTime: 'start_time',
      state: 'state',
      txId: 'tx_id',
      upperLineCount: 'upper_line_count',
      actionMode: 'action_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizType: 'string',
      cost: 'number',
      edges: { 'type': 'array', 'itemType': TransactionEdge },
      endTime: 'string',
      lastHandleTime: 'string',
      lowerLineCount: 'number',
      nodes: { 'type': 'array', 'itemType': TransactionNode },
      participatorNum: 'number',
      starterIp: 'string',
      starterName: 'string',
      startTime: 'string',
      state: 'string',
      txId: 'string',
      upperLineCount: 'number',
      actionMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1：同库模式，事务记录表在业务侧；
  // 2：异库模式。
  activityMode: number;
  // 应用名
  appName: string;
  // 应用描述
  desc: string;
  // 环境唯一标识
  instanceId: string;
  // 分库分表规则
  splitRule?: SplitRule;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityMode: 'activity_mode',
      appName: 'app_name',
      desc: 'desc',
      instanceId: 'instance_id',
      splitRule: 'split_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityMode: 'number',
      appName: 'string',
      desc: 'string',
      instanceId: 'string',
      splitRule: SplitRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回消息
  msg?: string;
  // 返回结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecoveryInitiatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // action_mode
  actionMode?: number;
  // activity_mode
  activityMode: number;
  // 应用名
  appName: string;
  // 业务码
  bizType: string;
  // Client 版本
  clientVersion: string;
  // 应用描述
  // 
  desc?: string;
  // 环境唯一标识
  instanceId: string;
  // 是否异步化
  isAsyn: boolean;
  // 是否压测任务
  isLoadTest: boolean;
  // 是否混合模式
  isMix: boolean;
  // 发起方数据源
  recoveryDatasources: InitiatorDatasource[];
  // 恢复条数/分/表
  recoveryLimit: number;
  // 恢复线程数
  recoveryThreadNum: number;
  // SINGLE：单库单表 SPLIT：分库分表
  // 
  splitMode?: string;
  // 分库分表规则
  // 
  splitRule?: SplitRule;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionMode: 'action_mode',
      activityMode: 'activity_mode',
      appName: 'app_name',
      bizType: 'biz_type',
      clientVersion: 'client_version',
      desc: 'desc',
      instanceId: 'instance_id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryDatasources: 'recovery_datasources',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
      splitMode: 'split_mode',
      splitRule: 'split_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionMode: 'number',
      activityMode: 'number',
      appName: 'string',
      bizType: 'string',
      clientVersion: 'string',
      desc: 'string',
      instanceId: 'string',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryDatasources: { 'type': 'array', 'itemType': InitiatorDatasource },
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
      splitMode: 'string',
      splitRule: SplitRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecoveryInitiatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的结果文本
  msg?: string;
  // 返回结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppsStatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  bizType: string;
  // 环境唯一标识
  instanceId: string;
  // app_name
  appName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      instanceId: 'instance_id',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      instanceId: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppsStatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用统计信息
  data?: AppTxInfo;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AppTxInfo,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsBiztypesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsBiztypesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // bizType列表
  data?: string[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportAppsConfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  // 类型（发起方/参与者）
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportAppsConfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回码
  success?: boolean;
  // 接口返回文件URL
  url?: string;
  // 导出配置信息，json
  context?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      url: 'url',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      url: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppsAppnamesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppsAppnamesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // appname列表
  data?: string[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName?: string;
  // bizType查询条件
  bizType?: string;
  // 当前页
  currentPage: number;
  // 环境唯一标识
  instanceId: string;
  // 单页大小
  pageSize: number;
  // initiator|participator  app_name作为发起者还是参与者
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizType: 'biz_type',
      currentPage: 'current_page',
      instanceId: 'instance_id',
      pageSize: 'page_size',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizType: 'string',
      currentPage: 'number',
      instanceId: 'string',
      pageSize: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 应用列表
  data?: AppStats[];
  // 单页大小
  pageSize?: number;
  // 接口返回码
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': AppStats },
      pageSize: 'number',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRecoveryParticipatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // biz_type
  bizType: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      id: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRecoveryParticipatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // action_name
  actionName?: string;
  // app_name
  appName?: string;
  // biz_type
  bizType?: string;
  // 关联关系表的id，用于更新
  bizTypeId?: number;
  // class_name
  className?: string;
  // commit_method_name
  commitMethodName?: string;
  // commit_method_params_type
  commitMethodParamsType?: number;
  // elastic_key
  elasticKey?: string;
  // elastic_route_rule
  elasticRouteRule?: string;
  // id
  id?: number;
  // instance_id
  instanceId?: string;
  // is_zone_route
  isZoneRoute?: boolean;
  // rollback_method_name
  rollbackMethodName?: string;
  // rollback_method_params_type
  rollbackMethodParamsType?: number;
  // test_url
  testUrl?: string;
  // unique_id
  uniqueId?: string;
  // ws_tr
  wsTr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionName: 'action_name',
      appName: 'app_name',
      bizType: 'biz_type',
      bizTypeId: 'biz_type_id',
      className: 'class_name',
      commitMethodName: 'commit_method_name',
      commitMethodParamsType: 'commit_method_params_type',
      elasticKey: 'elastic_key',
      elasticRouteRule: 'elastic_route_rule',
      id: 'id',
      instanceId: 'instance_id',
      isZoneRoute: 'is_zone_route',
      rollbackMethodName: 'rollback_method_name',
      rollbackMethodParamsType: 'rollback_method_params_type',
      testUrl: 'test_url',
      uniqueId: 'unique_id',
      wsTr: 'ws_tr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionName: 'string',
      appName: 'string',
      bizType: 'string',
      bizTypeId: 'number',
      className: 'string',
      commitMethodName: 'string',
      commitMethodParamsType: 'number',
      elasticKey: 'string',
      elasticRouteRule: 'string',
      id: 'number',
      instanceId: 'string',
      isZoneRoute: 'boolean',
      rollbackMethodName: 'string',
      rollbackMethodParamsType: 'number',
      testUrl: 'string',
      uniqueId: 'string',
      wsTr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAppsConfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName?: string;
  // 上传文件名
  fileName?: string;
  // instance_id
  instanceId: string;
  // initiator|participator
  type?: string;
  // 导入的内容，严格的json
  context?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      fileName: 'file_name',
      instanceId: 'instance_id',
      type: 'type',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      fileName: 'string',
      instanceId: 'string',
      type: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAppsConfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // msg
  msg?: string;
  // 上传成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUploadUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // app_name
  appName: string;
  // 文件名
  fileName: string;
  // 文件类型，对应folder
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      appName: 'app_name',
      fileName: 'file_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      appName: 'string',
      fileName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUploadUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件URL
  url?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsBiztypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName: string;
  // biz_type
  bizType: string;
  // instance_id
  instanceId: string;
  // saga状态机定义id
  statemachineId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizType: 'biz_type',
      instanceId: 'instance_id',
      statemachineId: 'statemachine_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizType: 'string',
      instanceId: 'string',
      statemachineId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsBiztypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异库模式更新信息
  asynInfo?: AsynDbTxInfo;
  // Saga状态机的json定义
  content?: string;
  // initiator
  initiator?: Initiator;
  // participators
  participators?: Participator[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      asynInfo: 'asyn_info',
      content: 'content',
      initiator: 'initiator',
      participators: 'participators',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      asynInfo: AsynDbTxInfo,
      content: 'string',
      initiator: Initiator,
      participators: { 'type': 'array', 'itemType': Participator },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsRecoverydsnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppsRecoverydsnameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据源列表
  data?: string[];
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppsBiztypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名称
  appName: string;
  // 业务类型
  bizType: string;
  // 000001
  instanceId: string;
  // saga状态机定义id
  statemachineId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizType: 'biz_type',
      instanceId: 'instance_id',
      statemachineId: 'statemachine_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizType: 'string',
      instanceId: 'string',
      statemachineId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppsBiztypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名
  appName?: string;
  // 参与者信息
  data?: ActionInfo[];
  // Saga状态机的json定义
  statemachineJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appName: 'app_name',
      data: 'data',
      statemachineJson: 'statemachine_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appName: 'string',
      data: { 'type': 'array', 'itemType': ActionInfo },
      statemachineJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppsBiztypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName: string;
  // biz_type
  bizType: string;
  // client_version
  clientVersion: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  // is_asyn
  isAsyn: boolean;
  // is_load_test
  isLoadTest: boolean;
  // is_mix
  isMix: boolean;
  // participators
  participators: Participator[];
  // recovery_datasources
  recoveryDatasources: InitiatorDatasource[];
  // recovery_limit
  recoveryLimit: number;
  // recovery_thread_num
  recoveryThreadNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizType: 'biz_type',
      clientVersion: 'client_version',
      id: 'id',
      instanceId: 'instance_id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      participators: 'participators',
      recoveryDatasources: 'recovery_datasources',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizType: 'string',
      clientVersion: 'string',
      id: 'number',
      instanceId: 'string',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      participators: { 'type': 'array', 'itemType': Participator },
      recoveryDatasources: { 'type': 'array', 'itemType': InitiatorDatasource },
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppsBiztypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
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

export class CreateAppsConfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发起方配置
  initiator?: Initiator;
  // 参与者列表
  participators?: Participator[];
  // 应用名
  appName: string;
  // 应用的描述
  desc?: string;
  // 环境唯一标识
  instanceId: string;
  // 1：同库模式，事务记录表在业务侧； 2：异库模式。
  activityMode: number;
  // 分表分表规则
  shardingRule?: SplitRule;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      initiator: 'initiator',
      participators: 'participators',
      appName: 'app_name',
      desc: 'desc',
      instanceId: 'instance_id',
      activityMode: 'activity_mode',
      shardingRule: 'sharding_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      initiator: Initiator,
      participators: { 'type': 'array', 'itemType': Participator },
      appName: 'string',
      desc: 'string',
      instanceId: 'string',
      activityMode: 'number',
      shardingRule: SplitRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsConfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  success?: boolean;
  // 返回的结果文本
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAppsNewconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // 导入的内容，严格的json
  context?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAppsNewconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // msg
  msg?: string;
  // 上传成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportAppsNewconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportAppsNewconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导出配置信息，json
  context?: string;
  // 接口返回码
  success?: boolean;
  // 接口返回文件URL
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      context: 'context',
      success: 'success',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      context: 'string',
      success: 'boolean',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTxConfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 导入的内容，严格的json
  context: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      context: 'context',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      context: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTxConfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // msg
  msg?: string;
  // 上传成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportTxConfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 环境唯一标识
  instanceId: string;
  // id 列表
  bizType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportTxConfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导出配置信息，json
  context?: string;
  // 接口返回码
  success?: boolean;
  // 接口返回文件URL
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      context: 'context',
      success: 'success',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      context: 'string',
      success: 'boolean',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListNewAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支持模糊查询
  appName?: string;
  // 1
  currentPage: number;
  // 000001
  instanceId: string;
  // 10
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      currentPage: 'current_page',
      instanceId: 'instance_id',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      currentPage: 'number',
      instanceId: 'string',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListNewAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // .
  currentPage?: number;
  // app
  data?: AppInfoVO[];
  // 10
  pageSize?: number;
  // 10
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': AppInfoVO },
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
  appId: number;
  // instance
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppsDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用信息
  data?: AppInfoVO;
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
      data: AppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  appId: number;
  // 000001
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppsResponse extends $tea.Model {
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

export class DeleteAppsRecoveryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 000001
  instanceId: string;
  // 发起方id
  recoveryId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      recoveryId: 'recovery_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      recoveryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppsRecoveryResponse extends $tea.Model {
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

export class DeleteAppsActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参与者id
  actionId: number;
  // 00001
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionId: 'action_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppsActionResponse extends $tea.Model {
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

export class BatchcreateAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参与者数组
  actionArray?: Participator[];
  // 1 同库； 2 异库
  activityMode?: number;
  // app
  appName?: string;
  // Hash
  dbRuleName?: string;
  // xxx
  dbRuleTemplete?: string;
  // 描述
  desc?: string;
  // 编辑时传
  id?: number;
  // 实例id
  instanceId: string;
  // 发起方信息
  recoveryArray?: RecoveryDTO[];
  // 数据源数组
  recoveryDsArray?: RecoveryDsDTO[];
  // hash
  tableRuleName?: string;
  // xxx
  tableRuleTemplete?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionArray: 'action_array',
      activityMode: 'activity_mode',
      appName: 'app_name',
      dbRuleName: 'db_rule_name',
      dbRuleTemplete: 'db_rule_templete',
      desc: 'desc',
      id: 'id',
      instanceId: 'instance_id',
      recoveryArray: 'recovery_array',
      recoveryDsArray: 'recovery_ds_array',
      tableRuleName: 'table_rule_name',
      tableRuleTemplete: 'table_rule_templete',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionArray: { 'type': 'array', 'itemType': Participator },
      activityMode: 'number',
      appName: 'string',
      dbRuleName: 'string',
      dbRuleTemplete: 'string',
      desc: 'string',
      id: 'number',
      instanceId: 'string',
      recoveryArray: { 'type': 'array', 'itemType': RecoveryDTO },
      recoveryDsArray: { 'type': 'array', 'itemType': RecoveryDsDTO },
      tableRuleName: 'string',
      tableRuleTemplete: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 编辑后的应用信息
  data?: AppInfoVO;
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
      data: AppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsRecoveryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 000001
  instanceId: string;
  // 发起方信息
  recovery: RecoveryDTO;
  // 数据源信息
  recoveryDsArray: RecoveryDsDTO[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
      recovery: 'recovery',
      recoveryDsArray: 'recovery_ds_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
      recovery: RecoveryDTO,
      recoveryDsArray: { 'type': 'array', 'itemType': RecoveryDsDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsRecoveryResponse extends $tea.Model {
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

export class CreateAppsActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参与者名称
  // 
  actionName: string;
  // app_name
  appName: string;
  // 类全名，包括完整包名
  // 
  className: string;
  // 提交方法名称
  // 
  commitMethodName: string;
  // 提交方法参数
  // 
  commitMethodParamsType: number;
  // 弹性key
  // 
  elasticKey?: string;
  // 弹性路由规则（Groovy脚本）
  // 
  elasticRouteRule?: string;
  // 更新时需要
  id?: number;
  // 00001
  instanceId: string;
  // rpc是否ldc调用
  // 
  isZoneRoute: boolean;
  // 回滚方法名称
  // 
  rollbackMethodName: string;
  // 回滚方法的参数类型
  // 
  rollbackMethodParamsType: number;
  // rpc接口测试地址
  // 
  testUrl?: string;
  // rpc uniqueId
  // 
  uniqueId?: string;
  // rpc协议，ws或tr
  // 
  wsTr: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionName: 'action_name',
      appName: 'app_name',
      className: 'class_name',
      commitMethodName: 'commit_method_name',
      commitMethodParamsType: 'commit_method_params_type',
      elasticKey: 'elastic_key',
      elasticRouteRule: 'elastic_route_rule',
      id: 'id',
      instanceId: 'instance_id',
      isZoneRoute: 'is_zone_route',
      rollbackMethodName: 'rollback_method_name',
      rollbackMethodParamsType: 'rollback_method_params_type',
      testUrl: 'test_url',
      uniqueId: 'unique_id',
      wsTr: 'ws_tr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionName: 'string',
      appName: 'string',
      className: 'string',
      commitMethodName: 'string',
      commitMethodParamsType: 'number',
      elasticKey: 'string',
      elasticRouteRule: 'string',
      id: 'number',
      instanceId: 'string',
      isZoneRoute: 'boolean',
      rollbackMethodName: 'string',
      rollbackMethodParamsType: 'number',
      testUrl: 'string',
      uniqueId: 'string',
      wsTr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppsActionResponse extends $tea.Model {
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

export class CreateBiztypeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参与者名称数组
  actionArray: string[];
  // app
  appName: string;
  // biztype
  bizType: string;
  // 一句话描述
  desc: string;
  // 00001
  instanceId: string;
  // add  /  modify
  state: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionArray: 'action_array',
      appName: 'app_name',
      bizType: 'biz_type',
      desc: 'desc',
      instanceId: 'instance_id',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionArray: { 'type': 'array', 'itemType': 'string' },
      appName: 'string',
      bizType: 'string',
      desc: 'string',
      instanceId: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBiztypeRelationResponse extends $tea.Model {
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

export class DeleteAppsBiztypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instanceid
  instanceId: string;
  // biz_type
  bizType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppsBiztypeResponse extends $tea.Model {
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

export class QueryBiztypeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizType: string;
  // 实例id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBiztypeRelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参与者信息
  appAction?: AppActionVO[];
  // 应用名
  appName?: string;
  // 业务类型
  bizType?: string;
  // 描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appAction: 'app_action',
      appName: 'app_name',
      bizType: 'biz_type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appAction: { 'type': 'array', 'itemType': AppActionVO },
      appName: 'string',
      bizType: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTransactionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例id
  instanceId: string;
  // 事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTransactionsResponse extends $tea.Model {
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

export class CreateRecoveryConfigurationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // actionMode取值：1代表TCC模式，2是FMT模式
  actionMode?: number;
  // activityMode取值：1是同库模式，2是异库模式，3是Saga模式
  activityMode: number;
  // 应用名
  appName: string;
  // 业务码
  bizType: string;
  // 应用描述
  desc?: string;
  // 环境的唯一标识
  instanceId: string;
  // 如果修改biztype，要穿老的bizType
  oldBiztype?: string;
  // role取值：1是发起方，2是参与者
  role: number;
  // split_rule
  splitRule?: SplitRule;
  // Saga状态机的json定义
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionMode: 'action_mode',
      activityMode: 'activity_mode',
      appName: 'app_name',
      bizType: 'biz_type',
      desc: 'desc',
      instanceId: 'instance_id',
      oldBiztype: 'old_biztype',
      role: 'role',
      splitRule: 'split_rule',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionMode: 'number',
      activityMode: 'number',
      appName: 'string',
      bizType: 'string',
      desc: 'string',
      instanceId: 'string',
      oldBiztype: 'string',
      role: 'number',
      splitRule: SplitRule,
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecoveryConfigurationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口结果信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGlobalEnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGlobalEnvResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境信息
  data?: EnvInfo;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: EnvInfo,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  tenantId: string;
  // 工作空间
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instance id
  data?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllZoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // env
  env: string;
  // tenant
  tenantName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      env: 'env',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      env: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllZoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zones
  zones?: string[];
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
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRecoveryInitiatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // action_mode
  actionMode: number;
  // 1同库，2异库
  activityMode: number;
  // 应用名
  appName: string;
  // biz_type
  bizType: string;
  // 关联关系表的id，用于更新
  bizTypeId: number;
  // Client 版本
  clientVersion: string;
  // 记录id
  id: number;
  // 环境唯一标识
  instanceId: string;
  // 是否异步化
  isAsyn: boolean;
  // 是否压测任务
  isLoadTest: boolean;
  // 是否混合模式
  isMix: boolean;
  // 发起方数据源
  recoveryDatasources: InitiatorDatasource[];
  // 恢复条数/分/表
  recoveryLimit: number;
  // 恢复线程数
  recoveryThreadNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionMode: 'action_mode',
      activityMode: 'activity_mode',
      appName: 'app_name',
      bizType: 'biz_type',
      bizTypeId: 'biz_type_id',
      clientVersion: 'client_version',
      id: 'id',
      instanceId: 'instance_id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryDatasources: 'recovery_datasources',
      recoveryLimit: 'recovery_limit',
      recoveryThreadNum: 'recovery_thread_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionMode: 'number',
      activityMode: 'number',
      appName: 'string',
      bizType: 'string',
      bizTypeId: 'number',
      clientVersion: 'string',
      id: 'number',
      instanceId: 'string',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryDatasources: { 'type': 'array', 'itemType': InitiatorDatasource },
      recoveryLimit: 'number',
      recoveryThreadNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRecoveryInitiatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBiztypesInitiatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBiztypesInitiatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发起方列表
  data?: Initiator[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Initiator },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllInitiatorsDatasourcesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllInitiatorsDatasourcesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据源名列表
  data?: DsNameInfo[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': DsNameInfo },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllInitiatorsTablesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 数据源名
  dsName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      dsName: 'ds_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      dsName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllInitiatorsTablesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 表名列表
  data?: string[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DebugInitiatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主事务记录表
  activityTableName: string;
  // 应用名
  appName: string;
  // 数据源名称
  dsName: string;
  // 环境唯一标识
  instanceId: string;
  // 记录id
  recoveryId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityTableName: 'activity_table_name',
      appName: 'app_name',
      dsName: 'ds_name',
      instanceId: 'instance_id',
      recoveryId: 'recovery_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityTableName: 'string',
      appName: 'string',
      dsName: 'string',
      instanceId: 'string',
      recoveryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DebugInitiatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRecoveryInitiatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // biz_type
  bizType: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRecoveryInitiatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app_name
  appName?: string;
  // biz_type
  bizType?: string;
  // 关联关系表的id，用于更新
  bizTypeId?: number;
  // client_version
  clientVersion?: string;
  // id
  id?: number;
  // instance_id
  instanceId?: string;
  // is_asyn
  isAsyn?: boolean;
  // is_load_test
  isLoadTest?: boolean;
  // is_mix
  isMix?: boolean;
  // recovery_datasources
  recoveryDatasources?: InitiatorDatasource[];
  // recovery_limit
  recoveryLimit?: number;
  // thread_num
  threadNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appName: 'app_name',
      bizType: 'biz_type',
      bizTypeId: 'biz_type_id',
      clientVersion: 'client_version',
      id: 'id',
      instanceId: 'instance_id',
      isAsyn: 'is_asyn',
      isLoadTest: 'is_load_test',
      isMix: 'is_mix',
      recoveryDatasources: 'recovery_datasources',
      recoveryLimit: 'recovery_limit',
      threadNum: 'thread_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appName: 'string',
      bizType: 'string',
      bizTypeId: 'number',
      clientVersion: 'string',
      id: 'number',
      instanceId: 'string',
      isAsyn: 'boolean',
      isLoadTest: 'boolean',
      isMix: 'boolean',
      recoveryDatasources: { 'type': 'array', 'itemType': InitiatorDatasource },
      recoveryLimit: 'number',
      threadNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecoveryParticipatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批量新增action
  actions: Participator[];
  // biz_type
  bizType: string;
  // 默认TCC
  actionMode: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actions: 'actions',
      bizType: 'biz_type',
      actionMode: 'action_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actions: { 'type': 'array', 'itemType': Participator },
      bizType: 'string',
      actionMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecoveryParticipatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回消息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRecoveryParticipatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // actions
  actions: Participator[];
  // biz_type
  bizType: string;
  // 默认1：TCC
  actionMode: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actions: 'actions',
      bizType: 'biz_type',
      actionMode: 'action_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actions: { 'type': 'array', 'itemType': Participator },
      bizType: 'string',
      actionMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRecoveryParticipatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBiztypesParticipatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBiztypesParticipatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参与者列表
  data?: Participator[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Participator },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllParticipatorsActionamesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllParticipatorsActionamesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参与者名称列表
  data?: string[];
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DebugParticipatorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分支事务上下文
  actionContext: string;
  // 分支事务id
  actionId: string;
  // 参与者名称
  actionName: string;
  // 操作类型，提交或回滚
  actionType: number;
  // 主事务上下文
  activityContext: string;
  // 环境唯一标识
  instanceId: string;
  // 主事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionContext: 'action_context',
      actionId: 'action_id',
      actionName: 'action_name',
      actionType: 'action_type',
      activityContext: 'activity_context',
      instanceId: 'instance_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionContext: 'string',
      actionId: 'string',
      actionName: 'string',
      actionType: 'number',
      activityContext: 'string',
      instanceId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DebugParticipatorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryActionParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // env
  env: string;
  // instance_id
  instanceId: string;
  // tenant
  tenantName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      env: 'env',
      instanceId: 'instance_id',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      env: 'string',
      instanceId: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryActionParamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参数列表
  params?: Pair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      params: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecuteSwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  destCell: string;
  instanceId: string;
  sourceCell: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      destCell: 'dest_cell',
      instanceId: 'instance_id',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      destCell: 'string',
      instanceId: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecuteSwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否达到预期切换状态
  success: boolean;
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

export class CancelSwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  destCell: string;
  instanceId: string;
  sourceCell: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      destCell: 'dest_cell',
      instanceId: 'instance_id',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      destCell: 'string',
      instanceId: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求执行是否成功
  success: boolean;
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

export class QuerySwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 单元切换状态列表
  actions: SwitchoverAction[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actions: 'actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actions: { 'type': 'array', 'itemType': SwitchoverAction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountBiztypesTrendsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // biz_type
  bizType: string;
  // 结束时间
  endTime: string;
  // 环境唯一标识
  instanceId: string;
  // 开始时间
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizType: 'biz_type',
      endTime: 'end_time',
      instanceId: 'instance_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizType: 'string',
      endTime: 'string',
      instanceId: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountBiztypesTrendsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 趋势图
  data?: Trend;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: Trend,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGlobalStatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 站内：租户+环境；站外：instanceId
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGlobalStatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全局统计数
  data?: GlobalStats;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: GlobalStats,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionDebugsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前分页
  currentPage: number;
  // 环境唯一标识
  instanceId: string;
  // id  desc
  orderBy?: OrderByParams[];
  // 分页大小
  pageSize: number;
  // appname
  appName?: string;
  // 1.进行中 4.成功
  state?: string;
  // 1.发起方 2.参与者
  debugType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      instanceId: 'instance_id',
      orderBy: 'order_by',
      pageSize: 'page_size',
      appName: 'app_name',
      state: 'state',
      debugType: 'debug_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      instanceId: 'string',
      orderBy: { 'type': 'array', 'itemType': OrderByParams },
      pageSize: 'number',
      appName: 'string',
      state: 'string',
      debugType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionDebugsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 联调记录分页数据
  data?: DebugRecord[];
  // 分页大小
  pageSize?: number;
  // 接口返回码
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': DebugRecord },
      pageSize: 'number',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsDebugsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 记录id
  debugId: number;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      debugId: 'debug_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      debugId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsDebugsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 单个联调记录详情
  data?: DebugRecord;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: DebugRecord,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTransactionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 业务id
  bizId?: string;
  // 业务码
  businessType?: string;
  // 当前分页
  currentPage: number;
  // 结束时间
  endTime: number;
  // 环境唯一标识
  instanceId: string;
  // 分页大小
  pageSize: number;
  // 开始时间
  startTime: number;
  // 事务状态  默认传 all， 其他可选状态 Activity 、 Exception 、 Finish
  state: string;
  // 事务id
  txId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      bizId: 'biz_id',
      businessType: 'business_type',
      currentPage: 'current_page',
      endTime: 'end_time',
      instanceId: 'instance_id',
      pageSize: 'page_size',
      startTime: 'start_time',
      state: 'state',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      bizId: 'string',
      businessType: 'string',
      currentPage: 'number',
      endTime: 'number',
      instanceId: 'string',
      pageSize: 'number',
      startTime: 'number',
      state: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTransactionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 事务列表
  data?: TransactionInfo[];
  // 分页大小
  pageSize?: number;
  // 接口返回码
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': TransactionInfo },
      pageSize: 'number',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境唯一标识
  instanceId: string;
  // 事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回对象
  data?: TransactionParticipators;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: TransactionParticipators,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransactionsCorrectionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分支事务上下文
  actionContext: string;
  // PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
  actionName: string;
  // 操作类型；1、提交，2、回滚
  actionType: number;
  // 主事务上下文
  activityContext: string;
  // 环境唯一标识
  instanceId: string;
  // 1：提交，2：回滚
  isCommit: number;
  // 是否同步主账务；0、不同步，1、同步
  syncAcctrans: number;
  // 是否同步统一支付；0、不同步，1同步
  syncPaycore: number;
  // 事务id
  txId: string;
  // tracer上下文
  tracerContext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionContext: 'action_context',
      actionName: 'action_name',
      actionType: 'action_type',
      activityContext: 'activity_context',
      instanceId: 'instance_id',
      isCommit: 'is_commit',
      syncAcctrans: 'sync_acctrans',
      syncPaycore: 'sync_paycore',
      txId: 'tx_id',
      tracerContext: 'tracer_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionContext: 'string',
      actionName: 'string',
      actionType: 'number',
      activityContext: 'string',
      instanceId: 'string',
      isCommit: 'number',
      syncAcctrans: 'number',
      syncPaycore: 'number',
      txId: 'string',
      tracerContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransactionsCorrectionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口结果信息
  msg?: string;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsCorrectionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 记录id
  correctionId: number;
  // 环境唯一标识
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      correctionId: 'correction_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      correctionId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionsCorrectionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事务悬挂恢复详情
  data?: Correction;
  // 接口返回码
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: Correction,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTransactionsCorrectionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 执行事务订正 id
  id: number;
  // instanceId
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTransactionsCorrectionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // msg
  msg?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionCorrectionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aaa
  actionType?: string;
  // current_page
  currentPage: number;
  // instanceId
  instanceId: string;
  // id desc
  orderBy?: OrderByParams[];
  // page_size
  pageSize: number;
  // 0 已提交 4 成功
  state?: string;
  // app_name
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actionType: 'action_type',
      currentPage: 'current_page',
      instanceId: 'instance_id',
      orderBy: 'order_by',
      pageSize: 'page_size',
      state: 'state',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actionType: 'string',
      currentPage: 'number',
      instanceId: 'string',
      orderBy: { 'type': 'array', 'itemType': OrderByParams },
      pageSize: 'number',
      state: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionCorrectionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  currentPage?: number;
  // a
  data?: Correction[];
  // 1
  pageSize?: number;
  // true
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': Correction },
      pageSize: 'number',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTransactionAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // apps
  apps?: TrasactionAppInfo[];
  // true
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apps: 'apps',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apps: { 'type': 'array', 'itemType': TrasactionAppInfo },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionChartRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aaaa
  instanceId: string;
  // aaa
  txId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionChartResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // a
  success?: boolean;
  // a
  data?: TransactionChartInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: TransactionChartInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionSagaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // 主事务id
  txId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransactionSagaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态机执行记录json
  statemachineInstJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      statemachineInstJson: 'statemachine_inst_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      statemachineInstJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名筛选
  appName?: string;
  // 当前页
  currentPage: number;
  // 环境唯一标识
  instanceId: string;
  // 每页大小
  pageSize: number;
  // 排序数组
  orderBy?: OrderByParams[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      currentPage: 'current_page',
      instanceId: 'instance_id',
      pageSize: 'page_size',
      orderBy: 'order_by',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      currentPage: 'number',
      instanceId: 'string',
      pageSize: 'number',
      orderBy: { 'type': 'array', 'itemType': OrderByParams },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // data
  data?: WhiteListInfo[];
  // 每页大小
  pageSize?: number;
  // 接口返回码
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': WhiteListInfo },
      pageSize: 'number',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  // 0非弹机房，1弹性机房；
  isElastic: number;
  // 0正常流量，1影子流量；
  isLoadTest: number;
  // 数据源名称
  logicalDsName: string;
  // business_type
  businessType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      id: 'id',
      instanceId: 'instance_id',
      isElastic: 'is_elastic',
      isLoadTest: 'is_load_test',
      logicalDsName: 'logical_ds_name',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      id: 'number',
      instanceId: 'string',
      isElastic: 'number',
      isLoadTest: 'number',
      logicalDsName: 'string',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回描述
  msg?: string;
  // 状态
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // app_name
  appName: string;
  // instance_id
  instanceId: string;
  // 0非弹机房，1弹性机房；
  isElastic: number;
  // 数据源名称
  logicalDsName: string;
  // 业务类型
  businessType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      instanceId: 'instance_id',
      isElastic: 'is_elastic',
      logicalDsName: 'logical_ds_name',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      instanceId: 'string',
      isElastic: 'number',
      logicalDsName: 'string',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 新增白名单成功
  msg?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // ref _id
  refId: number;
  // 1按照服务器推送 2按照集群推送
  type: number;
  // 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
  pushTarget: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      refId: 'ref_id',
      type: 'type',
      pushTarget: 'push_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      refId: 'number',
      type: 'number',
      pushTarget: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 容灾推送到{Master|Failover}成功
  msg?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除成功
  msg?: string;
  // true
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWhitelistZonesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aaaaa
  instanceId: string;
  // app
  appName: string;
  // ds
  dsName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      appName: 'app_name',
      dsName: 'ds_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      appName: 'string',
      dsName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWhitelistZonesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string[];
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
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
      keepAliveDuration: this._keepAliveDurationMillis,
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
          sdk_version: "1.0.166",
          _prod_code: "DTX",
          _prod_channel: "undefined",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "prodapigw-sofastack.cloud.alipay.com"),
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
   * Description: 创建应用
   * Summary: 创建应用
   */
  async createApps(request: CreateAppsRequest): Promise<CreateAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppsEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用
   * Summary: 创建应用
   */
  async createAppsEx(request: CreateAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppsResponse({}));
  }

  /**
   * Description: 发起方接入，新增发起方配置
   * Summary: 发起方接入
   */
  async createRecoveryInitiators(request: CreateRecoveryInitiatorsRequest): Promise<CreateRecoveryInitiatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRecoveryInitiatorsEx(request, headers, runtime);
  }

  /**
   * Description: 发起方接入，新增发起方配置
   * Summary: 发起方接入
   */
  async createRecoveryInitiatorsEx(request: CreateRecoveryInitiatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRecoveryInitiatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRecoveryInitiatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.initiators.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRecoveryInitiatorsResponse({}));
  }

  /**
   * Description: 根据app获取事务概览统计
   * Summary: 获取bizType事务概览统计
   */
  async countAppsStats(request: CountAppsStatsRequest): Promise<CountAppsStatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countAppsStatsEx(request, headers, runtime);
  }

  /**
   * Description: 根据app获取事务概览统计
   * Summary: 获取bizType事务概览统计
   */
  async countAppsStatsEx(request: CountAppsStatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountAppsStatsResponse> {
    Util.validateModel(request);
    return $tea.cast<CountAppsStatsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.stats.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountAppsStatsResponse({}));
  }

  /**
   * Description: 获取bizType列表
   * Summary: 获取bizType列表
   */
  async listAppsBiztypes(request: ListAppsBiztypesRequest): Promise<ListAppsBiztypesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppsBiztypesEx(request, headers, runtime);
  }

  /**
   * Description: 获取bizType列表
   * Summary: 获取bizType列表
   */
  async listAppsBiztypesEx(request: ListAppsBiztypesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppsBiztypesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppsBiztypesResponse>(await this.doRequest("1.0", "sofa.dtx.apps.biztypes.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppsBiztypesResponse({}));
  }

  /**
   * Description: app+发起方/参与者 导出配置
   * Summary: 导出配置
   */
  async exportAppsConfigs(request: ExportAppsConfigsRequest): Promise<ExportAppsConfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportAppsConfigsEx(request, headers, runtime);
  }

  /**
   * Description: app+发起方/参与者 导出配置
   * Summary: 导出配置
   */
  async exportAppsConfigsEx(request: ExportAppsConfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportAppsConfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportAppsConfigsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.configs.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportAppsConfigsResponse({}));
  }

  /**
   * Description: 获取应用名（app_name）列表
   * Summary: 获取应用名（app_name）列表
   */
  async allAppsAppnames(request: AllAppsAppnamesRequest): Promise<AllAppsAppnamesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAppsAppnamesEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用名（app_name）列表
   * Summary: 获取应用名（app_name）列表
   */
  async allAppsAppnamesEx(request: AllAppsAppnamesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAppsAppnamesResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAppsAppnamesResponse>(await this.doRequest("1.0", "sofa.dtx.apps.appnames.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAppsAppnamesResponse({}));
  }

  /**
   * Description: 应用事务列表，分页
   * Summary: 应用事务列表
   */
  async listApps(request: ListAppsRequest): Promise<ListAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppsEx(request, headers, runtime);
  }

  /**
   * Description: 应用事务列表，分页
   * Summary: 应用事务列表
   */
  async listAppsEx(request: ListAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppsResponse({}));
  }

  /**
   * Description: 单个参与者详情
   * Summary: 单个参与者详情
   */
  async getRecoveryParticipators(request: GetRecoveryParticipatorsRequest): Promise<GetRecoveryParticipatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRecoveryParticipatorsEx(request, headers, runtime);
  }

  /**
   * Description: 单个参与者详情
   * Summary: 单个参与者详情
   */
  async getRecoveryParticipatorsEx(request: GetRecoveryParticipatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRecoveryParticipatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRecoveryParticipatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.participators.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRecoveryParticipatorsResponse({}));
  }

  /**
   * Description: 导出配置中需要有app、类型信息（发起方/参与者）
   * Summary: 导入配置
   */
  async importAppsConfigs(request: ImportAppsConfigsRequest): Promise<ImportAppsConfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAppsConfigsEx(request, headers, runtime);
  }

  /**
   * Description: 导出配置中需要有app、类型信息（发起方/参与者）
   * Summary: 导入配置
   */
  async importAppsConfigsEx(request: ImportAppsConfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAppsConfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAppsConfigsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.configs.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAppsConfigsResponse({}));
  }

  /**
   * Description: 获取上传文件URL
   * Summary: 获取上传文件URL
   */
  async getUploadUrl(request: GetUploadUrlRequest): Promise<GetUploadUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUploadUrlEx(request, headers, runtime);
  }

  /**
   * Description: 获取上传文件URL
   * Summary: 获取上传文件URL
   */
  async getUploadUrlEx(request: GetUploadUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUploadUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUploadUrlResponse>(await this.doRequest("1.0", "sofa.dtx.upload.url.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUploadUrlResponse({}));
  }

  /**
   * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
   * Summary: 查询bizType的调用关系
   */
  async queryAppsBiztype(request: QueryAppsBiztypeRequest): Promise<QueryAppsBiztypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppsBiztypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
   * Summary: 查询bizType的调用关系
   */
  async queryAppsBiztypeEx(request: QueryAppsBiztypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppsBiztypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppsBiztypeResponse>(await this.doRequest("1.0", "sofa.dtx.apps.biztype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppsBiztypeResponse({}));
  }

  /**
   * Description: 创建发起者获取数据源
   * Summary: 创建发起者获取数据源
   */
  async listAppsRecoverydsname(request: ListAppsRecoverydsnameRequest): Promise<ListAppsRecoverydsnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppsRecoverydsnameEx(request, headers, runtime);
  }

  /**
   * Description: 创建发起者获取数据源
   * Summary: 创建发起者获取数据源
   */
  async listAppsRecoverydsnameEx(request: ListAppsRecoverydsnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppsRecoverydsnameResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppsRecoverydsnameResponse>(await this.doRequest("1.0", "sofa.dtx.apps.recoverydsname.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppsRecoverydsnameResponse({}));
  }

  /**
   * Description: 单个biztype的关联关系，Saga则是状态机json定义
   * Summary: 单个biztype的关联关系
   */
  async getAppsBiztype(request: GetAppsBiztypeRequest): Promise<GetAppsBiztypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppsBiztypeEx(request, headers, runtime);
  }

  /**
   * Description: 单个biztype的关联关系，Saga则是状态机json定义
   * Summary: 单个biztype的关联关系
   */
  async getAppsBiztypeEx(request: GetAppsBiztypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppsBiztypeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppsBiztypeResponse>(await this.doRequest("1.0", "sofa.dtx.apps.biztype.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppsBiztypeResponse({}));
  }

  /**
   * Description: 事务更新
   * Summary: 事务更新
   */
  async updateAppsBiztype(request: UpdateAppsBiztypeRequest): Promise<UpdateAppsBiztypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppsBiztypeEx(request, headers, runtime);
  }

  /**
   * Description: 事务更新
   * Summary: 事务更新
   */
  async updateAppsBiztypeEx(request: UpdateAppsBiztypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppsBiztypeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppsBiztypeResponse>(await this.doRequest("1.0", "sofa.dtx.apps.biztype.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppsBiztypeResponse({}));
  }

  /**
   * Description: 新增应用配置（包括发起方和参与者）
   * Summary: 新增应用配置（包括发起方和参与者）
   */
  async createAppsConfigs(request: CreateAppsConfigsRequest): Promise<CreateAppsConfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppsConfigsEx(request, headers, runtime);
  }

  /**
   * Description: 新增应用配置（包括发起方和参与者）
   * Summary: 新增应用配置（包括发起方和参与者）
   */
  async createAppsConfigsEx(request: CreateAppsConfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppsConfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppsConfigsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.configs.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppsConfigsResponse({}));
  }

  /**
   * Description: 事务配置-导入配置
   * Summary: 应用配置-导入配置
   */
  async importAppsNewconfigs(request: ImportAppsNewconfigsRequest): Promise<ImportAppsNewconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAppsNewconfigsEx(request, headers, runtime);
  }

  /**
   * Description: 事务配置-导入配置
   * Summary: 应用配置-导入配置
   */
  async importAppsNewconfigsEx(request: ImportAppsNewconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAppsNewconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAppsNewconfigsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.newconfigs.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAppsNewconfigsResponse({}));
  }

  /**
   * Description: app+发起方/参与者 导出配置
   * Summary: 应用配置-导出配置
   */
  async exportAppsNewconfigs(request: ExportAppsNewconfigsRequest): Promise<ExportAppsNewconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportAppsNewconfigsEx(request, headers, runtime);
  }

  /**
   * Description: app+发起方/参与者 导出配置
   * Summary: 应用配置-导出配置
   */
  async exportAppsNewconfigsEx(request: ExportAppsNewconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportAppsNewconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportAppsNewconfigsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.newconfigs.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportAppsNewconfigsResponse({}));
  }

  /**
   * Description: 导出配置中需要有事务信息
   * Summary: 事务配置-导入配置
   */
  async importTxConfigs(request: ImportTxConfigsRequest): Promise<ImportTxConfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTxConfigsEx(request, headers, runtime);
  }

  /**
   * Description: 导出配置中需要有事务信息
   * Summary: 事务配置-导入配置
   */
  async importTxConfigsEx(request: ImportTxConfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTxConfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTxConfigsResponse>(await this.doRequest("1.0", "sofa.dtx.tx.configs.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTxConfigsResponse({}));
  }

  /**
   * Description: 事务导出配置
   * Summary: 事务配置-导出配置
   */
  async exportTxConfigs(request: ExportTxConfigsRequest): Promise<ExportTxConfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportTxConfigsEx(request, headers, runtime);
  }

  /**
   * Description: 事务导出配置
   * Summary: 事务配置-导出配置
   */
  async exportTxConfigsEx(request: ExportTxConfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportTxConfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportTxConfigsResponse>(await this.doRequest("1.0", "sofa.dtx.tx.configs.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportTxConfigsResponse({}));
  }

  /**
   * Description: 管控台1.1 应用配置列表
   * Summary: 应用配置列表
   */
  async listNewApps(request: ListNewAppsRequest): Promise<ListNewAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listNewAppsEx(request, headers, runtime);
  }

  /**
   * Description: 管控台1.1 应用配置列表
   * Summary: 应用配置列表
   */
  async listNewAppsEx(request: ListNewAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListNewAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListNewAppsResponse>(await this.doRequest("1.0", "sofa.dtx.new.apps.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListNewAppsResponse({}));
  }

  /**
   * Description: 新应用详情界面
   * Summary: 应用详情
   */
  async queryAppsDetail(request: QueryAppsDetailRequest): Promise<QueryAppsDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppsDetailEx(request, headers, runtime);
  }

  /**
   * Description: 新应用详情界面
   * Summary: 应用详情
   */
  async queryAppsDetailEx(request: QueryAppsDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppsDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppsDetailResponse>(await this.doRequest("1.0", "sofa.dtx.apps.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppsDetailResponse({}));
  }

  /**
   * Description: 。
   * Summary: 应用删除
   */
  async deleteApps(request: DeleteAppsRequest): Promise<DeleteAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppsEx(request, headers, runtime);
  }

  /**
   * Description: 。
   * Summary: 应用删除
   */
  async deleteAppsEx(request: DeleteAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppsResponse({}));
  }

  /**
   * Description: 发起方删除
   * Summary: 发起方删除
   */
  async deleteAppsRecovery(request: DeleteAppsRecoveryRequest): Promise<DeleteAppsRecoveryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppsRecoveryEx(request, headers, runtime);
  }

  /**
   * Description: 发起方删除
   * Summary: 发起方删除
   */
  async deleteAppsRecoveryEx(request: DeleteAppsRecoveryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppsRecoveryResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppsRecoveryResponse>(await this.doRequest("1.0", "sofa.dtx.apps.recovery.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppsRecoveryResponse({}));
  }

  /**
   * Description: 参与者删除
   * Summary: 参与者删除
   */
  async deleteAppsAction(request: DeleteAppsActionRequest): Promise<DeleteAppsActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppsActionEx(request, headers, runtime);
  }

  /**
   * Description: 参与者删除
   * Summary: 参与者删除
   */
  async deleteAppsActionEx(request: DeleteAppsActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppsActionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppsActionResponse>(await this.doRequest("1.0", "sofa.dtx.apps.action.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppsActionResponse({}));
  }

  /**
   * Description: 批量新增 app下的发起方、参与者
   * Summary: 批量新增 app下的发起方、参与者
   */
  async batchcreateApps(request: BatchcreateAppsRequest): Promise<BatchcreateAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateAppsEx(request, headers, runtime);
  }

  /**
   * Description: 批量新增 app下的发起方、参与者
   * Summary: 批量新增 app下的发起方、参与者
   */
  async batchcreateAppsEx(request: BatchcreateAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateAppsResponse>(await this.doRequest("1.0", "sofa.dtx.apps.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateAppsResponse({}));
  }

  /**
   * Description: 单个发起方新增/编辑
   * Summary: 单个发起方新增/编辑
   */
  async createAppsRecovery(request: CreateAppsRecoveryRequest): Promise<CreateAppsRecoveryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppsRecoveryEx(request, headers, runtime);
  }

  /**
   * Description: 单个发起方新增/编辑
   * Summary: 单个发起方新增/编辑
   */
  async createAppsRecoveryEx(request: CreateAppsRecoveryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppsRecoveryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppsRecoveryResponse>(await this.doRequest("1.0", "sofa.dtx.apps.recovery.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppsRecoveryResponse({}));
  }

  /**
   * Description: 参与者新增/编辑
   * Summary: 参与者新增/编辑
   */
  async createAppsAction(request: CreateAppsActionRequest): Promise<CreateAppsActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppsActionEx(request, headers, runtime);
  }

  /**
   * Description: 参与者新增/编辑
   * Summary: 参与者新增/编辑
   */
  async createAppsActionEx(request: CreateAppsActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppsActionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppsActionResponse>(await this.doRequest("1.0", "sofa.dtx.apps.action.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppsActionResponse({}));
  }

  /**
   * Description: 新建/编辑事务关联关系
   * Summary: 新建/编辑事务关联关系
   */
  async createBiztypeRelation(request: CreateBiztypeRelationRequest): Promise<CreateBiztypeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBiztypeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 新建/编辑事务关联关系
   * Summary: 新建/编辑事务关联关系
   */
  async createBiztypeRelationEx(request: CreateBiztypeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBiztypeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBiztypeRelationResponse>(await this.doRequest("1.0", "sofa.dtx.biztype.relation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBiztypeRelationResponse({}));
  }

  /**
   * Description: 删除biztype关联关系
   * Summary: 删除biztype关联关系
   */
  async deleteAppsBiztype(request: DeleteAppsBiztypeRequest): Promise<DeleteAppsBiztypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppsBiztypeEx(request, headers, runtime);
  }

  /**
   * Description: 删除biztype关联关系
   * Summary: 删除biztype关联关系
   */
  async deleteAppsBiztypeEx(request: DeleteAppsBiztypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppsBiztypeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppsBiztypeResponse>(await this.doRequest("1.0", "sofa.dtx.apps.biztype.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppsBiztypeResponse({}));
  }

  /**
   * Description: 查询biztype与发起方，参与者的关联关系
   * Summary: 查询biztype关联关系
   */
  async queryBiztypeRelation(request: QueryBiztypeRelationRequest): Promise<QueryBiztypeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBiztypeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询biztype与发起方，参与者的关联关系
   * Summary: 查询biztype关联关系
   */
  async queryBiztypeRelationEx(request: QueryBiztypeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBiztypeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBiztypeRelationResponse>(await this.doRequest("1.0", "sofa.dtx.biztype.relation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBiztypeRelationResponse({}));
  }

  /**
   * Description: 根据txid，删除进行中的事务
   * Summary: 删除进行中的事务
   */
  async deleteTransactions(request: DeleteTransactionsRequest): Promise<DeleteTransactionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTransactionsEx(request, headers, runtime);
  }

  /**
   * Description: 根据txid，删除进行中的事务
   * Summary: 删除进行中的事务
   */
  async deleteTransactionsEx(request: DeleteTransactionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTransactionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTransactionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTransactionsResponse({}));
  }

  /**
   * Description: 异库模式下， 发起方和参与者的配置信息。
  role取值：1是发起方，2是参与者；
  activityMode取值：1是同库模式，2是异库模式；
  actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
   * Summary: 异库接入（包括发起方和参与者）
   */
  async createRecoveryConfiguration(request: CreateRecoveryConfigurationRequest): Promise<CreateRecoveryConfigurationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRecoveryConfigurationEx(request, headers, runtime);
  }

  /**
   * Description: 异库模式下， 发起方和参与者的配置信息。
  role取值：1是发起方，2是参与者；
  activityMode取值：1是同库模式，2是异库模式；
  actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
   * Summary: 异库接入（包括发起方和参与者）
   */
  async createRecoveryConfigurationEx(request: CreateRecoveryConfigurationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRecoveryConfigurationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRecoveryConfigurationResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.configuration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRecoveryConfigurationResponse({}));
  }

  /**
   * Description: 获取当前环境信息，例如租户和环境
   * Summary: 获取当前环境
   */
  async getGlobalEnv(request: GetGlobalEnvRequest): Promise<GetGlobalEnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGlobalEnvEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前环境信息，例如租户和环境
   * Summary: 获取当前环境
   */
  async getGlobalEnvEx(request: GetGlobalEnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGlobalEnvResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGlobalEnvResponse>(await this.doRequest("1.0", "sofa.dtx.global.env.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGlobalEnvResponse({}));
  }

  /**
   * Description: 获取instanceId
   * Summary: 获取instanceId
   */
  async getMiddlewareInstance(request: GetMiddlewareInstanceRequest): Promise<GetMiddlewareInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMiddlewareInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取instanceId
   * Summary: 获取instanceId
   */
  async getMiddlewareInstanceEx(request: GetMiddlewareInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMiddlewareInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMiddlewareInstanceResponse>(await this.doRequest("1.0", "sofa.dtx.middleware.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMiddlewareInstanceResponse({}));
  }

  /**
   * Description: 获取zone信息
   * Summary: 获取zone信息
   */
  async allZone(request: AllZoneRequest): Promise<AllZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allZoneEx(request, headers, runtime);
  }

  /**
   * Description: 获取zone信息
   * Summary: 获取zone信息
   */
  async allZoneEx(request: AllZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<AllZoneResponse>(await this.doRequest("1.0", "sofa.dtx.zone.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllZoneResponse({}));
  }

  /**
   * Description: 发起方接入配置的修改
   * Summary: 发起方编辑
   */
  async updateRecoveryInitiators(request: UpdateRecoveryInitiatorsRequest): Promise<UpdateRecoveryInitiatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRecoveryInitiatorsEx(request, headers, runtime);
  }

  /**
   * Description: 发起方接入配置的修改
   * Summary: 发起方编辑
   */
  async updateRecoveryInitiatorsEx(request: UpdateRecoveryInitiatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRecoveryInitiatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRecoveryInitiatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.initiators.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRecoveryInitiatorsResponse({}));
  }

  /**
   * Description: 应用作为参与者查询所有发起者
   * Summary: 应用作为参与者查询所有发起者
   */
  async listBiztypesInitiators(request: ListBiztypesInitiatorsRequest): Promise<ListBiztypesInitiatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBiztypesInitiatorsEx(request, headers, runtime);
  }

  /**
   * Description: 应用作为参与者查询所有发起者
   * Summary: 应用作为参与者查询所有发起者
   */
  async listBiztypesInitiatorsEx(request: ListBiztypesInitiatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBiztypesInitiatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBiztypesInitiatorsResponse>(await this.doRequest("1.0", "sofa.dtx.biztypes.initiators.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBiztypesInitiatorsResponse({}));
  }

  /**
   * Description: 根据app获取数据源列表
   * Summary: 根据app获取数据源列表
   */
  async allInitiatorsDatasources(request: AllInitiatorsDatasourcesRequest): Promise<AllInitiatorsDatasourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allInitiatorsDatasourcesEx(request, headers, runtime);
  }

  /**
   * Description: 根据app获取数据源列表
   * Summary: 根据app获取数据源列表
   */
  async allInitiatorsDatasourcesEx(request: AllInitiatorsDatasourcesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllInitiatorsDatasourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<AllInitiatorsDatasourcesResponse>(await this.doRequest("1.0", "sofa.dtx.initiators.datasources.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllInitiatorsDatasourcesResponse({}));
  }

  /**
   * Description: 根据app+dsName获取所有表
   * Summary: 根据app+dsName获取所有表
   */
  async allInitiatorsTables(request: AllInitiatorsTablesRequest): Promise<AllInitiatorsTablesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allInitiatorsTablesEx(request, headers, runtime);
  }

  /**
   * Description: 根据app+dsName获取所有表
   * Summary: 根据app+dsName获取所有表
   */
  async allInitiatorsTablesEx(request: AllInitiatorsTablesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllInitiatorsTablesResponse> {
    Util.validateModel(request);
    return $tea.cast<AllInitiatorsTablesResponse>(await this.doRequest("1.0", "sofa.dtx.initiators.tables.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllInitiatorsTablesResponse({}));
  }

  /**
   * Description: 发起方联调
   * Summary: 发起方联调
   */
  async debugInitiators(request: DebugInitiatorsRequest): Promise<DebugInitiatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.debugInitiatorsEx(request, headers, runtime);
  }

  /**
   * Description: 发起方联调
   * Summary: 发起方联调
   */
  async debugInitiatorsEx(request: DebugInitiatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DebugInitiatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<DebugInitiatorsResponse>(await this.doRequest("1.0", "sofa.dtx.initiators.debug", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DebugInitiatorsResponse({}));
  }

  /**
   * Description: 单个发起方详情
   * Summary: 单个发起方详情
   */
  async getRecoveryInitiators(request: GetRecoveryInitiatorsRequest): Promise<GetRecoveryInitiatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRecoveryInitiatorsEx(request, headers, runtime);
  }

  /**
   * Description: 单个发起方详情
   * Summary: 单个发起方详情
   */
  async getRecoveryInitiatorsEx(request: GetRecoveryInitiatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRecoveryInitiatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRecoveryInitiatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.initiators.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRecoveryInitiatorsResponse({}));
  }

  /**
   * Description: 参与者接入，录入参与者信息
   * Summary: 参与者接入
   */
  async createRecoveryParticipators(request: CreateRecoveryParticipatorsRequest): Promise<CreateRecoveryParticipatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRecoveryParticipatorsEx(request, headers, runtime);
  }

  /**
   * Description: 参与者接入，录入参与者信息
   * Summary: 参与者接入
   */
  async createRecoveryParticipatorsEx(request: CreateRecoveryParticipatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRecoveryParticipatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRecoveryParticipatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.participators.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRecoveryParticipatorsResponse({}));
  }

  /**
   * Description: 更新参与者配置信息
   * Summary: 参与者编辑
   */
  async updateRecoveryParticipators(request: UpdateRecoveryParticipatorsRequest): Promise<UpdateRecoveryParticipatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRecoveryParticipatorsEx(request, headers, runtime);
  }

  /**
   * Description: 更新参与者配置信息
   * Summary: 参与者编辑
   */
  async updateRecoveryParticipatorsEx(request: UpdateRecoveryParticipatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRecoveryParticipatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRecoveryParticipatorsResponse>(await this.doRequest("1.0", "sofa.dtx.recovery.participators.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRecoveryParticipatorsResponse({}));
  }

  /**
   * Description:  应用作为发起者查询所有参与者
   * Summary:  应用作为发起者查询所有参与者
   */
  async listBiztypesParticipators(request: ListBiztypesParticipatorsRequest): Promise<ListBiztypesParticipatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBiztypesParticipatorsEx(request, headers, runtime);
  }

  /**
   * Description:  应用作为发起者查询所有参与者
   * Summary:  应用作为发起者查询所有参与者
   */
  async listBiztypesParticipatorsEx(request: ListBiztypesParticipatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBiztypesParticipatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBiztypesParticipatorsResponse>(await this.doRequest("1.0", "sofa.dtx.biztypes.participators.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBiztypesParticipatorsResponse({}));
  }

  /**
   * Description: 根据app获取所有的参与者名称
   * Summary: 根据app获取所有的参与者名称
   */
  async allParticipatorsActionames(request: AllParticipatorsActionamesRequest): Promise<AllParticipatorsActionamesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allParticipatorsActionamesEx(request, headers, runtime);
  }

  /**
   * Description: 根据app获取所有的参与者名称
   * Summary: 根据app获取所有的参与者名称
   */
  async allParticipatorsActionamesEx(request: AllParticipatorsActionamesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllParticipatorsActionamesResponse> {
    Util.validateModel(request);
    return $tea.cast<AllParticipatorsActionamesResponse>(await this.doRequest("1.0", "sofa.dtx.participators.actionames.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllParticipatorsActionamesResponse({}));
  }

  /**
   * Description: 参与者联调
   * Summary: 参与者联调
   */
  async debugParticipators(request: DebugParticipatorsRequest): Promise<DebugParticipatorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.debugParticipatorsEx(request, headers, runtime);
  }

  /**
   * Description: 参与者联调
   * Summary: 参与者联调
   */
  async debugParticipatorsEx(request: DebugParticipatorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DebugParticipatorsResponse> {
    Util.validateModel(request);
    return $tea.cast<DebugParticipatorsResponse>(await this.doRequest("1.0", "sofa.dtx.participators.debug", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DebugParticipatorsResponse({}));
  }

  /**
   * Description: 提交回滚方法参数
   * Summary: 获取action的调用参数
   */
  async queryActionParam(request: QueryActionParamRequest): Promise<QueryActionParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryActionParamEx(request, headers, runtime);
  }

  /**
   * Description: 提交回滚方法参数
   * Summary: 获取action的调用参数
   */
  async queryActionParamEx(request: QueryActionParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryActionParamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryActionParamResponse>(await this.doRequest("1.0", "sofa.dtx.action.param.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryActionParamResponse({}));
  }

  /**
   * Description: 分布式事务-执行单元切换
   * Summary: 分布式事务执行单元切换
   */
  async executeSwitchover(request: ExecuteSwitchoverRequest): Promise<ExecuteSwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.executeSwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: 分布式事务-执行单元切换
   * Summary: 分布式事务执行单元切换
   */
  async executeSwitchoverEx(request: ExecuteSwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecuteSwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecuteSwitchoverResponse>(await this.doRequest("1.0", "sofa.dtx.switchover.execute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecuteSwitchoverResponse({}));
  }

  /**
   * Description: 分布式事务-取消单元切换
   * Summary: 分布式事务取消单元切换
   */
  async cancelSwitchover(request: CancelSwitchoverRequest): Promise<CancelSwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: 分布式事务-取消单元切换
   * Summary: 分布式事务取消单元切换
   */
  async cancelSwitchoverEx(request: CancelSwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSwitchoverResponse>(await this.doRequest("1.0", "sofa.dtx.switchover.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSwitchoverResponse({}));
  }

  /**
   * Description: 分布式事务-查询单元切换状态
   * Summary: 查询分布式事务单元切换状态
   */
  async querySwitchover(request: QuerySwitchoverRequest): Promise<QuerySwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: 分布式事务-查询单元切换状态
   * Summary: 查询分布式事务单元切换状态
   */
  async querySwitchoverEx(request: QuerySwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySwitchoverResponse>(await this.doRequest("1.0", "sofa.dtx.switchover.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySwitchoverResponse({}));
  }

  /**
   * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
   * Summary: 事务趋势图
   */
  async countBiztypesTrends(request: CountBiztypesTrendsRequest): Promise<CountBiztypesTrendsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countBiztypesTrendsEx(request, headers, runtime);
  }

  /**
   * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
   * Summary: 事务趋势图
   */
  async countBiztypesTrendsEx(request: CountBiztypesTrendsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountBiztypesTrendsResponse> {
    Util.validateModel(request);
    return $tea.cast<CountBiztypesTrendsResponse>(await this.doRequest("1.0", "sofa.dtx.biztypes.trends.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountBiztypesTrendsResponse({}));
  }

  /**
   * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
   * Summary: 事务概览统计接口
   */
  async getGlobalStats(request: GetGlobalStatsRequest): Promise<GetGlobalStatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGlobalStatsEx(request, headers, runtime);
  }

  /**
   * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
   * Summary: 事务概览统计接口
   */
  async getGlobalStatsEx(request: GetGlobalStatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGlobalStatsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGlobalStatsResponse>(await this.doRequest("1.0", "sofa.dtx.global.stats.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGlobalStatsResponse({}));
  }

  /**
   * Description: 联调历史列表
   * Summary: 联调历史列表
   */
  async listTransactionDebugs(request: ListTransactionDebugsRequest): Promise<ListTransactionDebugsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTransactionDebugsEx(request, headers, runtime);
  }

  /**
   * Description: 联调历史列表
   * Summary: 联调历史列表
   */
  async listTransactionDebugsEx(request: ListTransactionDebugsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTransactionDebugsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTransactionDebugsResponse>(await this.doRequest("1.0", "sofa.dtx.transaction.debugs.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTransactionDebugsResponse({}));
  }

  /**
   * Description: 单个联调记录详情
   * Summary: 单个联调记录详情
   */
  async getTransactionsDebugs(request: GetTransactionsDebugsRequest): Promise<GetTransactionsDebugsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransactionsDebugsEx(request, headers, runtime);
  }

  /**
   * Description: 单个联调记录详情
   * Summary: 单个联调记录详情
   */
  async getTransactionsDebugsEx(request: GetTransactionsDebugsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransactionsDebugsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransactionsDebugsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.debugs.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransactionsDebugsResponse({}));
  }

  /**
   * Description: 事务高级查询
   * Summary: 事务高级查询
   */
  async queryTransactions(request: QueryTransactionsRequest): Promise<QueryTransactionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTransactionsEx(request, headers, runtime);
  }

  /**
   * Description: 事务高级查询
   * Summary: 事务高级查询
   */
  async queryTransactionsEx(request: QueryTransactionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTransactionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTransactionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTransactionsResponse({}));
  }

  /**
   * Description: 单个事务详情
   * Summary: 单个事务详情
   */
  async getTransactions(request: GetTransactionsRequest): Promise<GetTransactionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransactionsEx(request, headers, runtime);
  }

  /**
   * Description: 单个事务详情
   * Summary: 单个事务详情
   */
  async getTransactionsEx(request: GetTransactionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransactionsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransactionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransactionsResponse({}));
  }

  /**
   * Description: 悬挂事务恢复
   * Summary: 创建事务恢复
   */
  async createTransactionsCorrections(request: CreateTransactionsCorrectionsRequest): Promise<CreateTransactionsCorrectionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTransactionsCorrectionsEx(request, headers, runtime);
  }

  /**
   * Description: 悬挂事务恢复
   * Summary: 创建事务恢复
   */
  async createTransactionsCorrectionsEx(request: CreateTransactionsCorrectionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTransactionsCorrectionsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTransactionsCorrectionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.corrections.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTransactionsCorrectionsResponse({}));
  }

  /**
   * Description: 单个事务恢复详情
   * Summary: 单个事务恢复详情
   */
  async getTransactionsCorrections(request: GetTransactionsCorrectionsRequest): Promise<GetTransactionsCorrectionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransactionsCorrectionsEx(request, headers, runtime);
  }

  /**
   * Description: 单个事务恢复详情
   * Summary: 单个事务恢复详情
   */
  async getTransactionsCorrectionsEx(request: GetTransactionsCorrectionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransactionsCorrectionsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransactionsCorrectionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.corrections.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransactionsCorrectionsResponse({}));
  }

  /**
   * Description: 执行事务订正
   * Summary: 执行事务订正
   */
  async execTransactionsCorrections(request: ExecTransactionsCorrectionsRequest): Promise<ExecTransactionsCorrectionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execTransactionsCorrectionsEx(request, headers, runtime);
  }

  /**
   * Description: 执行事务订正
   * Summary: 执行事务订正
   */
  async execTransactionsCorrectionsEx(request: ExecTransactionsCorrectionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecTransactionsCorrectionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecTransactionsCorrectionsResponse>(await this.doRequest("1.0", "sofa.dtx.transactions.corrections.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecTransactionsCorrectionsResponse({}));
  }

  /**
   * Description: 事务订正列表
   * Summary: 事务订正列表
   */
  async listTransactionCorrections(request: ListTransactionCorrectionsRequest): Promise<ListTransactionCorrectionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTransactionCorrectionsEx(request, headers, runtime);
  }

  /**
   * Description: 事务订正列表
   * Summary: 事务订正列表
   */
  async listTransactionCorrectionsEx(request: ListTransactionCorrectionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTransactionCorrectionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTransactionCorrectionsResponse>(await this.doRequest("1.0", "sofa.dtx.transaction.corrections.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTransactionCorrectionsResponse({}));
  }

  /**
   * Description: 发起方app列表
   * Summary: 发起方app列表
   */
  async listTransactionApps(request: ListTransactionAppsRequest): Promise<ListTransactionAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTransactionAppsEx(request, headers, runtime);
  }

  /**
   * Description: 发起方app列表
   * Summary: 发起方app列表
   */
  async listTransactionAppsEx(request: ListTransactionAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTransactionAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTransactionAppsResponse>(await this.doRequest("1.0", "sofa.dtx.transaction.apps.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTransactionAppsResponse({}));
  }

  /**
   * Description: 针对特定图，组装的特定数据结构 接口
   * Summary: 事务详情
   */
  async getTransactionChart(request: GetTransactionChartRequest): Promise<GetTransactionChartResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransactionChartEx(request, headers, runtime);
  }

  /**
   * Description: 针对特定图，组装的特定数据结构 接口
   * Summary: 事务详情
   */
  async getTransactionChartEx(request: GetTransactionChartRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransactionChartResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransactionChartResponse>(await this.doRequest("1.0", "sofa.dtx.transaction.chart.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransactionChartResponse({}));
  }

  /**
   * Description: 获取Saga状态机事务执行记录，返回状态图json
   * Summary: 获取Saga状态机事务执行记录json
   */
  async getTransactionSaga(request: GetTransactionSagaRequest): Promise<GetTransactionSagaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransactionSagaEx(request, headers, runtime);
  }

  /**
   * Description: 获取Saga状态机事务执行记录，返回状态图json
   * Summary: 获取Saga状态机事务执行记录json
   */
  async getTransactionSagaEx(request: GetTransactionSagaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransactionSagaResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransactionSagaResponse>(await this.doRequest("1.0", "sofa.dtx.transaction.saga.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransactionSagaResponse({}));
  }

  /**
   * Description: 白名单列表
   * Summary: 白名单列表
   */
  async listWhitelist(request: ListWhitelistRequest): Promise<ListWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 白名单列表
   * Summary: 白名单列表
   */
  async listWhitelistEx(request: ListWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWhitelistResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWhitelistResponse({}));
  }

  /**
   * Description: 白名单更新
   * Summary: 白名单更新
   */
  async updateWhitelist(request: UpdateWhitelistRequest): Promise<UpdateWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 白名单更新
   * Summary: 白名单更新
   */
  async updateWhitelistEx(request: UpdateWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWhitelistResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWhitelistResponse({}));
  }

  /**
   * Description: 白名单添加
   * Summary: 白名单添加
   */
  async addWhitelist(request: AddWhitelistRequest): Promise<AddWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 白名单添加
   * Summary: 白名单添加
   */
  async addWhitelistEx(request: AddWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<AddWhitelistResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddWhitelistResponse({}));
  }

  /**
   * Description: xts failover容灾推送
   * Summary: 容灾推送
   */
  async pushWhitelist(request: PushWhitelistRequest): Promise<PushWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: xts failover容灾推送
   * Summary: 容灾推送
   */
  async pushWhitelistEx(request: PushWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<PushWhitelistResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushWhitelistResponse({}));
  }

  /**
   * Description: 删除白名单
   * Summary: 删除白名单
   */
  async deleteWhitelist(request: DeleteWhitelistRequest): Promise<DeleteWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 删除白名单
   * Summary: 删除白名单
   */
  async deleteWhitelistEx(request: DeleteWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteWhitelistResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteWhitelistResponse({}));
  }

  /**
   * Description: 弹性位配置列表
   * Summary: 弹性位配置列表
   */
  async listWhitelistZones(request: ListWhitelistZonesRequest): Promise<ListWhitelistZonesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWhitelistZonesEx(request, headers, runtime);
  }

  /**
   * Description: 弹性位配置列表
   * Summary: 弹性位配置列表
   */
  async listWhitelistZonesEx(request: ListWhitelistZonesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWhitelistZonesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWhitelistZonesResponse>(await this.doRequest("1.0", "sofa.dtx.whitelist.zones.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWhitelistZonesResponse({}));
  }

}
