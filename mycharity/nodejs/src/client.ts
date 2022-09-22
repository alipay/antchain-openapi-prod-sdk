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

// 批次详情
export class BatchDetailVO extends $tea.Model {
  // id
  id: string;
  // 实施内容id
  combinationId: string;
  // 批次名称
  name: string;
  // 备注
  remarks: string;
  // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
  issueWay: number;
  // 确认接收人 0发前确认 1发后确认
  affirmanceReceivers: number;
  // 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
  receiveCheckWay: number;
  // 发放数量
  issueAmount: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      combinationId: 'combination_id',
      name: 'name',
      remarks: 'remarks',
      issueWay: 'issue_way',
      affirmanceReceivers: 'affirmance_receivers',
      receiveCheckWay: 'receive_check_way',
      issueAmount: 'issue_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      combinationId: 'string',
      name: 'string',
      remarks: 'string',
      issueWay: 'number',
      affirmanceReceivers: 'number',
      receiveCheckWay: 'number',
      issueAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目详情
export class ProjectVO extends $tea.Model {
  // 公益项目ID
  id: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 公益项目名称
  pjName: string;
  // 机构ID
  orgId: string;
  // 公益方向
  publicWelfareDirection: string;
  // 测试项目:0正式项目(默认),1测试项目
  testFlag?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      pjName: 'pj_name',
      orgId: 'org_id',
      publicWelfareDirection: 'public_welfare_direction',
      testFlag: 'test_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      pjName: 'string',
      orgId: 'string',
      publicWelfareDirection: 'string',
      testFlag: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分期详情
export class StagesDetailVO extends $tea.Model {
  // 分期id
  id: string;
  // 计划开始时间
  startTime?: number;
  // 计划结束时间
  endTime?: number;
  // 目标捐赠金额
  targetMoney?: number;
  // 目标捐赠人数
  targetNum?: number;
  // 说明
  note?: string;
  // 公开募捐编号
  publicFundraisingNo?: string;
  // 静态文件地址‘,’分割
  coverUrl?: string;
  // 管理费用金额(单位：分)
  administrativeRate?: number;
  // 项目状态，0进行中（默认），1已结项
  state?: number;
  // 签约id,关联签约表
  signId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      startTime: 'start_time',
      endTime: 'end_time',
      targetMoney: 'target_money',
      targetNum: 'target_num',
      note: 'note',
      publicFundraisingNo: 'public_fundraising_no',
      coverUrl: 'cover_url',
      administrativeRate: 'administrative_rate',
      state: 'state',
      signId: 'sign_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      startTime: 'number',
      endTime: 'number',
      targetMoney: 'number',
      targetNum: 'number',
      note: 'string',
      publicFundraisingNo: 'string',
      coverUrl: 'string',
      administrativeRate: 'number',
      state: 'number',
      signId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实施内容信息
export class SubjectCombinationMessage extends $tea.Model {
  // 实施内容id
  id: string;
  // 实施内容名称
  name?: string;
  // 实施内容类型：0善款类，1实物类、2服务类
  type?: number;
  // 单位
  unit?: string;
  // 说明
  note?: string;
  // 单价是否固定，0:不固定，1:固定
  priceDeterminedFlag?: number;
  // 单价
  price?: number;
  // 预估发放数量
  totalNum?: number;
  // 操作类型0-新增，1-修改，2-删除
  operate: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
      unit: 'unit',
      note: 'note',
      priceDeterminedFlag: 'price_determined_flag',
      price: 'price',
      totalNum: 'total_num',
      operate: 'operate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      type: 'number',
      unit: 'string',
      note: 'string',
      priceDeterminedFlag: 'number',
      price: 'number',
      totalNum: 'number',
      operate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实施内容详情
export class OpenSubjectCombinationVO extends $tea.Model {
  // 实施内容id
  id?: string;
  // 实施内容名称
  name?: string;
  // 实施内容类型
  type?: number;
  // 单位
  unit?: string;
  // 说明
  note?: string;
  // 单价是否固定，0:不固定，1:固定
  priceDeterminedFlag?: number;
  // 单价
  price?: number;
  // 预估发放个数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
      unit: 'unit',
      note: 'note',
      priceDeterminedFlag: 'price_determined_flag',
      price: 'price',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      type: 'number',
      unit: 'string',
      note: 'string',
      priceDeterminedFlag: 'number',
      price: 'number',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 执行记录
export class ReceivedRecord extends $tea.Model {
  // 执行记录id
  id: string;
  // 支付宝用户标识
  receiverAlipayUserId: string;
  // 领取人姓名
  receiverName: string;
  // 领取人身份证号码
  receiverCardNo: string;
  // 联系号码 
  receiverPhoneNo?: string;
  // 是否是受益人本人 0本人，1代领
  agentFlag: number;
  // 领取人和受益人关系
  relationship?: string;
  // 受益人信息
  beneficiaryMessage?: string;
  // 领取人所属机构
  receiverOrg?: string;
  // 领取说明
  receiveNote?: string;
  // 受益人数
  benefitNumber?: number;
  // 快递地址
  expressAddress?: string;
  // 发放数量
  issueAmount?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      receiverAlipayUserId: 'receiver_alipay_user_id',
      receiverName: 'receiver_name',
      receiverCardNo: 'receiver_card_no',
      receiverPhoneNo: 'receiver_phone_no',
      agentFlag: 'agent_flag',
      relationship: 'relationship',
      beneficiaryMessage: 'beneficiary_message',
      receiverOrg: 'receiver_org',
      receiveNote: 'receive_note',
      benefitNumber: 'benefit_number',
      expressAddress: 'express_address',
      issueAmount: 'issue_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      receiverAlipayUserId: 'string',
      receiverName: 'string',
      receiverCardNo: 'string',
      receiverPhoneNo: 'string',
      agentFlag: 'number',
      relationship: 'string',
      beneficiaryMessage: 'string',
      receiverOrg: 'string',
      receiveNote: 'string',
      benefitNumber: 'number',
      expressAddress: 'string',
      issueAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构详情结构
export class OrgVO extends $tea.Model {
  // 机构ID
  id: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 机构名称
  name: string;
  // 统一社会信用代码
  unifiedSocialCreditCode: string;
  // 机构简介
  introduction: string;
  // 签约时间
  signTime: number;
  //  测试项目:0正式机构(默认),1测试机构
  testFlag?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      name: 'name',
      unifiedSocialCreditCode: 'unified_social_credit_code',
      introduction: 'introduction',
      signTime: 'sign_time',
      testFlag: 'test_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      name: 'string',
      unifiedSocialCreditCode: 'string',
      introduction: 'string',
      signTime: 'number',
      testFlag: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlipaysignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签约记录id
  id: string;
  // 机构id
  orgId: string;
  // 支付宝代扣账号
  alipayAccount: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      orgId: 'org_id',
      alipayAccount: 'alipay_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      orgId: 'string',
      alipayAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlipaysignResponse extends $tea.Model {
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

export class QueryAlipaysignStateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签约记录id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlipaysignStateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代扣账号签约状态 0.未签约 1.已签约
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlipaysignQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlipaysignQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账号签约二维码url
  signUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signUrl: 'sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePersonPermissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构ID(第三方指定ID 50字符)
  orgId: string;
  // 项目角色ID(1项目管理员、2项目执行人、3项目财务)
  roleId: number;
  // 项目ID(第三方指定ID 50字符)
  pjId: string;
  // 被授权人支付宝用户标识(16字符)
  alipayUserId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      roleId: 'role_id',
      pjId: 'pj_id',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      roleId: 'number',
      pjId: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePersonPermissionResponse extends $tea.Model {
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

export class DeletePersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构ID(第三方指定ID 50字符)
  orgId: string;
  // 项目角色ID(1项目管理员、2项目执行人、3项目财务)
  roleId: number;
  // 项目ID(第三方指定ID 50字符)
  pjId: string;
  // 被授权人支付宝用户标识（16字符）
  alipayUserId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      roleId: 'role_id',
      pjId: 'pj_id',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      roleId: 'number',
      pjId: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeletePersonResponse extends $tea.Model {
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

export class InitBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // 实施内容id
  combinationId: string;
  // 批次名称
  name: string;
  // 发放备注
  remarks: string;
  // 确认接收人 0发前确认 1发后确认
  affirmanceReceivers: number;
  // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式，6：现场组织】
  issueWay: number;
  // 接收验证方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3快递签收验证，4登录确认，5直接导入）
  receiveCheckWay: number;
  // 分期ID
  stagesId: string;
  // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
  issueAmount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      combinationId: 'combination_id',
      name: 'name',
      remarks: 'remarks',
      affirmanceReceivers: 'affirmance_receivers',
      issueWay: 'issue_way',
      receiveCheckWay: 'receive_check_way',
      stagesId: 'stages_id',
      issueAmount: 'issue_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      combinationId: 'string',
      name: 'string',
      remarks: 'string',
      affirmanceReceivers: 'number',
      issueWay: 'number',
      receiveCheckWay: 'number',
      stagesId: 'string',
      issueAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitBatchResponse extends $tea.Model {
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

export class UpdateBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // 批次暂停状态 2继续发放（领取中），3暂停发放，4领取完成
  status: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBatchResponse extends $tea.Model {
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

export class DeleteBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBatchResponse extends $tea.Model {
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

export class CreateStagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分期id
  id: string;
  // 项目id
  pjId: string;
  // 计划开始时间
  startTime?: number;
  // 计划结束时间
  endTime?: number;
  // 目标捐赠金额
  targetMoney?: number;
  // 目标捐赠人数
  targetNum?: number;
  // 说明
  note?: string;
  // 公开募捐编号
  publicFundraisingNo?: string;
  // 静态文件地址‘,’分割
  coverUrl?: string;
  // 管理费用金额(单位：分)
  administrativeRate?: number;
  // 签约id,关联签约表
  signId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      pjId: 'pj_id',
      startTime: 'start_time',
      endTime: 'end_time',
      targetMoney: 'target_money',
      targetNum: 'target_num',
      note: 'note',
      publicFundraisingNo: 'public_fundraising_no',
      coverUrl: 'cover_url',
      administrativeRate: 'administrative_rate',
      signId: 'sign_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      pjId: 'string',
      startTime: 'number',
      endTime: 'number',
      targetMoney: 'number',
      targetNum: 'number',
      note: 'string',
      publicFundraisingNo: 'string',
      coverUrl: 'string',
      administrativeRate: 'number',
      signId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStagesResponse extends $tea.Model {
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

export class QueryBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次详情
  batchDetailVo?: BatchDetailVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchDetailVo: 'batch_detail_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchDetailVo: BatchDetailVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分期id
  id: string;
  // 计划开始时间
  startTime?: number;
  // 计划结束时间
  endTime?: number;
  // 目标捐赠金额
  targetMoney?: number;
  // 目标捐赠人数
  targetNum?: number;
  // 说明
  note?: string;
  // 公开募捐编号
  publicFundraisingNo?: string;
  // 静态文件地址‘,’分割
  coverUrl?: string;
  // 管理费用金额(单位：分)
  administrativeRate?: number;
  // 项目状态，0进行中（默认），1已结项
  state?: number;
  // 签约id,关联签约表
  signId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      startTime: 'start_time',
      endTime: 'end_time',
      targetMoney: 'target_money',
      targetNum: 'target_num',
      note: 'note',
      publicFundraisingNo: 'public_fundraising_no',
      coverUrl: 'cover_url',
      administrativeRate: 'administrative_rate',
      state: 'state',
      signId: 'sign_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      startTime: 'number',
      endTime: 'number',
      targetMoney: 'number',
      targetNum: 'number',
      note: 'string',
      publicFundraisingNo: 'string',
      coverUrl: 'string',
      administrativeRate: 'number',
      state: 'number',
      signId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStagesResponse extends $tea.Model {
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

export class CreateOrgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  // 50字符 机构名称
  name: string;
  // 500字符 机构简介
  introduction: string;
  // 社会统一信用代码固定18位
  unifiedSocialCreditCode: string;
  // 测试机构说明:0正式机构(未填写默认0),1测试机构
  testFlag?: number;
  // 13位时间戳 签约时间
  signTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      introduction: 'introduction',
      unifiedSocialCreditCode: 'unified_social_credit_code',
      testFlag: 'test_flag',
      signTime: 'sign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      name: 'string',
      introduction: 'string',
      unifiedSocialCreditCode: 'string',
      testFlag: 'number',
      signTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrgResponse extends $tea.Model {
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

export class QueryStagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分期id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分期详情
  openStagesDetailVo?: StagesDetailVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      openStagesDetailVo: 'open_stages_detail_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      openStagesDetailVo: StagesDetailVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOrgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  // 500字符 机构简介
  introduction?: string;
  // 社会统一信用代码固定18位
  unifiedSocialCreditCode?: string;
  // 13位时间戳 签约时间
  signTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      introduction: 'introduction',
      unifiedSocialCreditCode: 'unified_social_credit_code',
      signTime: 'sign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      introduction: 'string',
      unifiedSocialCreditCode: 'string',
      signTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOrgResponse extends $tea.Model {
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

export class CreateCombinationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实施内容id
  id: string;
  // 分期id
  stagesId: string;
  // 名称
  name: string;
  // 实施内容类型：0善款类，1实物类、2服务类
  type: number;
  // 单位
  unit: string;
  // 说明
  note?: string;
  // 单价是否固定，0:不固定，1:固定
  priceDeterminedFlag: number;
  // 单位分，预估单价
  price: number;
  // 预估发放数量
  totalNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      stagesId: 'stages_id',
      name: 'name',
      type: 'type',
      unit: 'unit',
      note: 'note',
      priceDeterminedFlag: 'price_determined_flag',
      price: 'price',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      stagesId: 'string',
      name: 'string',
      type: 'number',
      unit: 'string',
      note: 'string',
      priceDeterminedFlag: 'number',
      price: 'number',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCombinationResponse extends $tea.Model {
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

export class DetailOrgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailOrgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 机构详情结构体
  orgVo?: OrgVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgVo: 'org_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgVo: OrgVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCombinationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实施内容id
  id: string;
  // 名称
  name?: string;
  // 实施内容类型：0善款类，1实物类、2服务类
  type?: number;
  // 单位
  unit?: string;
  // 说明
  note?: string;
  // 单价是否固定，0:不固定，1:固定
  priceDeterminedFlag?: number;
  // 单位分，预估单价
  price?: number;
  // 预估发放数量
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      type: 'type',
      unit: 'unit',
      note: 'note',
      priceDeterminedFlag: 'price_determined_flag',
      price: 'price',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      name: 'string',
      type: 'number',
      unit: 'string',
      note: 'string',
      priceDeterminedFlag: 'number',
      price: 'number',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCombinationResponse extends $tea.Model {
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

export class CreateProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  // 50字符 机构id
  orgId: string;
  // 100字符 项目名称
  pjName: string;
  // 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
  publicWelfareDirection: string;
  // 测试项目说明:0正式项目(未填写默认0),1测试项目
  testFlag?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      orgId: 'org_id',
      pjName: 'pj_name',
      publicWelfareDirection: 'public_welfare_direction',
      testFlag: 'test_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      orgId: 'string',
      pjName: 'string',
      publicWelfareDirection: 'string',
      testFlag: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectResponse extends $tea.Model {
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

export class UpdateProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  // 100字符 项目名称
  pjName?: string;
  // 64字符 公益领域（系统判断是否维护公益领域字典表，数据库存id）
  publicWelfareDirection?: string;
  // 测试项目说明:0正式项目(未填写默认0),1测试项目
  testFlag?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      pjName: 'pj_name',
      publicWelfareDirection: 'public_welfare_direction',
      testFlag: 'test_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      pjName: 'string',
      publicWelfareDirection: 'string',
      testFlag: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateProjectResponse extends $tea.Model {
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

export class DetailProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 50字符，单平台幂等
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目结构体
  projectVo?: ProjectVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectVo: 'project_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectVo: ProjectVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCombinationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实施内容id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCombinationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实施内容详情
  openSubjectCombinationVo?: OpenSubjectCombinationVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      openSubjectCombinationVo: 'open_subject_combination_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      openSubjectCombinationVo: OpenSubjectCombinationVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateRecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次id
  batchId: string;
  // 执行记录数组
  receivedRecordList: ReceivedRecord[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      receivedRecordList: 'received_record_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      receivedRecordList: { 'type': 'array', 'itemType': ReceivedRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateRecordResponse extends $tea.Model {
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

export class CreateBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // 分期ID
  stagesId: string;
  // 实施内容id
  combinationId: string;
  // 批次名称
  name: string;
  // 备注
  remarks: string;
  // 接收验证方式（0扫脸验证、2扫二维码验证, 3快递签收验证，4登录确认）
  issueWay: number;
  // 确认接收人 0发前确认 1发后确认
  affirmanceReceivers: number;
  // 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
  receiveCheckWay: number;
  // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
  issueAmount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      stagesId: 'stages_id',
      combinationId: 'combination_id',
      name: 'name',
      remarks: 'remarks',
      issueWay: 'issue_way',
      affirmanceReceivers: 'affirmance_receivers',
      receiveCheckWay: 'receive_check_way',
      issueAmount: 'issue_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      stagesId: 'string',
      combinationId: 'string',
      name: 'string',
      remarks: 'string',
      issueWay: 'number',
      affirmanceReceivers: 'number',
      receiveCheckWay: 'number',
      issueAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBatchResponse extends $tea.Model {
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

export class UpdateRecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
  expressNumber?: string;
  // 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
  expressCompany?: string;
  // 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
  expressAddress?: string;
  // 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
  paySerialNumber?: string;
  // 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
  transferMethod?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      expressNumber: 'express_number',
      expressCompany: 'express_company',
      expressAddress: 'express_address',
      paySerialNumber: 'pay_serial_number',
      transferMethod: 'transfer_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      expressNumber: 'string',
      expressCompany: 'string',
      expressAddress: 'string',
      paySerialNumber: 'string',
      transferMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRecordResponse extends $tea.Model {
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

export class BatchcreateCombinationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分期id
  stagesId: string;
  // 实施内容信息集合
  combinationMessageList: SubjectCombinationMessage[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      stagesId: 'stages_id',
      combinationMessageList: 'combination_message_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      stagesId: 'string',
      combinationMessageList: { 'type': 'array', 'itemType': SubjectCombinationMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateCombinationResponse extends $tea.Model {
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
          sdk_version: "1.0.13",
          _prod_code: "MYCHARITY",
          _prod_channel: "undefined",
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
   * Description: 待签约账号创建
   * Summary: 待签约账号创建
   */
  async createAlipaysign(request: CreateAlipaysignRequest): Promise<CreateAlipaysignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAlipaysignEx(request, headers, runtime);
  }

  /**
   * Description: 待签约账号创建
   * Summary: 待签约账号创建
   */
  async createAlipaysignEx(request: CreateAlipaysignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAlipaysignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAlipaysignResponse>(await this.doRequest("1.0", "antchain.mycharity.alipaysign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAlipaysignResponse({}));
  }

  /**
   * Description: 机构下代扣账号签约状态查询
   * Summary: 机构下代扣账号签约状态查询
   */
  async queryAlipaysignState(request: QueryAlipaysignStateRequest): Promise<QueryAlipaysignStateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlipaysignStateEx(request, headers, runtime);
  }

  /**
   * Description: 机构下代扣账号签约状态查询
   * Summary: 机构下代扣账号签约状态查询
   */
  async queryAlipaysignStateEx(request: QueryAlipaysignStateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlipaysignStateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlipaysignStateResponse>(await this.doRequest("1.0", "antchain.mycharity.alipaysign.state.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlipaysignStateResponse({}));
  }

  /**
   * Description: 账号签约二维码获取
   * Summary: 账号签约二维码获取
   */
  async queryAlipaysignQrcode(request: QueryAlipaysignQrcodeRequest): Promise<QueryAlipaysignQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlipaysignQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 账号签约二维码获取
   * Summary: 账号签约二维码获取
   */
  async queryAlipaysignQrcodeEx(request: QueryAlipaysignQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlipaysignQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlipaysignQrcodeResponse>(await this.doRequest("1.0", "antchain.mycharity.alipaysign.qrcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlipaysignQrcodeResponse({}));
  }

  /**
   * Description: 创建人员并配置权限。如人员已经存在，则不创建。
   * Summary: 创建人员及配置权限
   */
  async createPersonPermission(request: CreatePersonPermissionRequest): Promise<CreatePersonPermissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPersonPermissionEx(request, headers, runtime);
  }

  /**
   * Description: 创建人员并配置权限。如人员已经存在，则不创建。
   * Summary: 创建人员及配置权限
   */
  async createPersonPermissionEx(request: CreatePersonPermissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePersonPermissionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePersonPermissionResponse>(await this.doRequest("1.0", "antchain.mycharity.person.permission.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePersonPermissionResponse({}));
  }

  /**
   * Description: 允许已授权的用户通过此接口删除人员权限。
   * Summary: 配置权限删除
   */
  async deletePerson(request: DeletePersonRequest): Promise<DeletePersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deletePersonEx(request, headers, runtime);
  }

  /**
   * Description: 允许已授权的用户通过此接口删除人员权限。
   * Summary: 配置权限删除
   */
  async deletePersonEx(request: DeletePersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeletePersonResponse> {
    Util.validateModel(request);
    return $tea.cast<DeletePersonResponse>(await this.doRequest("1.0", "antchain.mycharity.person.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeletePersonResponse({}));
  }

  /**
   * Description: 创建批次
   * Summary: 创建批次
   */
  async initBatch(request: InitBatchRequest): Promise<InitBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initBatchEx(request, headers, runtime);
  }

  /**
   * Description: 创建批次
   * Summary: 创建批次
   */
  async initBatchEx(request: InitBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<InitBatchResponse>(await this.doRequest("1.0", "antchain.mycharity.batch.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitBatchResponse({}));
  }

  /**
   * Description: 修改批次状态
   * Summary: 修改批次状态
   */
  async updateBatch(request: UpdateBatchRequest): Promise<UpdateBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBatchEx(request, headers, runtime);
  }

  /**
   * Description: 修改批次状态
   * Summary: 修改批次状态
   */
  async updateBatchEx(request: UpdateBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBatchResponse>(await this.doRequest("1.0", "antchain.mycharity.batch.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBatchResponse({}));
  }

  /**
   * Description: 删除批次
   * Summary: 删除批次
   */
  async deleteBatch(request: DeleteBatchRequest): Promise<DeleteBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteBatchEx(request, headers, runtime);
  }

  /**
   * Description: 删除批次
   * Summary: 删除批次
   */
  async deleteBatchEx(request: DeleteBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBatchResponse>(await this.doRequest("1.0", "antchain.mycharity.batch.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteBatchResponse({}));
  }

  /**
   * Description: 创建项目分期
   * Summary: 创建分期
   */
  async createStages(request: CreateStagesRequest): Promise<CreateStagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStagesEx(request, headers, runtime);
  }

  /**
   * Description: 创建项目分期
   * Summary: 创建分期
   */
  async createStagesEx(request: CreateStagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStagesResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStagesResponse>(await this.doRequest("1.0", "antchain.mycharity.stages.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStagesResponse({}));
  }

  /**
   * Description: 查询批次
   * Summary: 查询批次
   */
  async queryBatch(request: QueryBatchRequest): Promise<QueryBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBatchEx(request, headers, runtime);
  }

  /**
   * Description: 查询批次
   * Summary: 查询批次
   */
  async queryBatchEx(request: QueryBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBatchResponse>(await this.doRequest("1.0", "antchain.mycharity.batch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBatchResponse({}));
  }

  /**
   * Description: 更新项目分期
   * Summary: 更新分期
   */
  async updateStages(request: UpdateStagesRequest): Promise<UpdateStagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateStagesEx(request, headers, runtime);
  }

  /**
   * Description: 更新项目分期
   * Summary: 更新分期
   */
  async updateStagesEx(request: UpdateStagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateStagesResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateStagesResponse>(await this.doRequest("1.0", "antchain.mycharity.stages.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateStagesResponse({}));
  }

  /**
   * Description: 创建机构
   * Summary: 创建机构
   */
  async createOrg(request: CreateOrgRequest): Promise<CreateOrgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOrgEx(request, headers, runtime);
  }

  /**
   * Description: 创建机构
   * Summary: 创建机构
   */
  async createOrgEx(request: CreateOrgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOrgResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOrgResponse>(await this.doRequest("1.0", "antchain.mycharity.org.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOrgResponse({}));
  }

  /**
   * Description: 查询分期
   * Summary: 查询分期
   */
  async queryStages(request: QueryStagesRequest): Promise<QueryStagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStagesEx(request, headers, runtime);
  }

  /**
   * Description: 查询分期
   * Summary: 查询分期
   */
  async queryStagesEx(request: QueryStagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStagesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStagesResponse>(await this.doRequest("1.0", "antchain.mycharity.stages.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStagesResponse({}));
  }

  /**
   * Description: 更新机构
   * Summary: 更新机构
   */
  async updateOrg(request: UpdateOrgRequest): Promise<UpdateOrgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOrgEx(request, headers, runtime);
  }

  /**
   * Description: 更新机构
   * Summary: 更新机构
   */
  async updateOrgEx(request: UpdateOrgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOrgResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOrgResponse>(await this.doRequest("1.0", "antchain.mycharity.org.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOrgResponse({}));
  }

  /**
   * Description: 创建实施内容
   * Summary: 创建实施内容
   */
  async createCombination(request: CreateCombinationRequest): Promise<CreateCombinationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCombinationEx(request, headers, runtime);
  }

  /**
   * Description: 创建实施内容
   * Summary: 创建实施内容
   */
  async createCombinationEx(request: CreateCombinationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCombinationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCombinationResponse>(await this.doRequest("1.0", "antchain.mycharity.combination.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCombinationResponse({}));
  }

  /**
   * Description: 机构详情
   * Summary: 机构详情
   */
  async detailOrg(request: DetailOrgRequest): Promise<DetailOrgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailOrgEx(request, headers, runtime);
  }

  /**
   * Description: 机构详情
   * Summary: 机构详情
   */
  async detailOrgEx(request: DetailOrgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailOrgResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailOrgResponse>(await this.doRequest("1.0", "antchain.mycharity.org.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailOrgResponse({}));
  }

  /**
   * Description: 修改实施内容
   * Summary: 修改实施内容
   */
  async updateCombination(request: UpdateCombinationRequest): Promise<UpdateCombinationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCombinationEx(request, headers, runtime);
  }

  /**
   * Description: 修改实施内容
   * Summary: 修改实施内容
   */
  async updateCombinationEx(request: UpdateCombinationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCombinationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCombinationResponse>(await this.doRequest("1.0", "antchain.mycharity.combination.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCombinationResponse({}));
  }

  /**
   * Description: 创建项目
   * Summary: 创建项目
   */
  async createProject(request: CreateProjectRequest): Promise<CreateProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProjectEx(request, headers, runtime);
  }

  /**
   * Description: 创建项目
   * Summary: 创建项目
   */
  async createProjectEx(request: CreateProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProjectResponse>(await this.doRequest("1.0", "antchain.mycharity.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProjectResponse({}));
  }

  /**
   * Description: 更新项目
   * Summary: 更新项目
   */
  async updateProject(request: UpdateProjectRequest): Promise<UpdateProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateProjectEx(request, headers, runtime);
  }

  /**
   * Description: 更新项目
   * Summary: 更新项目
   */
  async updateProjectEx(request: UpdateProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateProjectResponse>(await this.doRequest("1.0", "antchain.mycharity.project.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateProjectResponse({}));
  }

  /**
   * Description: 项目详情
   * Summary: 项目详情
   */
  async detailProject(request: DetailProjectRequest): Promise<DetailProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailProjectEx(request, headers, runtime);
  }

  /**
   * Description: 项目详情
   * Summary: 项目详情
   */
  async detailProjectEx(request: DetailProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailProjectResponse>(await this.doRequest("1.0", "antchain.mycharity.project.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailProjectResponse({}));
  }

  /**
   * Description: 查询实施内容
   * Summary: 查询实施内容
   */
  async queryCombination(request: QueryCombinationRequest): Promise<QueryCombinationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCombinationEx(request, headers, runtime);
  }

  /**
   * Description: 查询实施内容
   * Summary: 查询实施内容
   */
  async queryCombinationEx(request: QueryCombinationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCombinationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCombinationResponse>(await this.doRequest("1.0", "antchain.mycharity.combination.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCombinationResponse({}));
  }

  /**
   * Description: 批量创建执行记录
   * Summary: 批量创建执行记录
   */
  async batchcreateRecord(request: BatchcreateRecordRequest): Promise<BatchcreateRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateRecordEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建执行记录
   * Summary: 批量创建执行记录
   */
  async batchcreateRecordEx(request: BatchcreateRecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateRecordResponse>(await this.doRequest("1.0", "antchain.mycharity.record.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateRecordResponse({}));
  }

  /**
   * Description: 创建批次
   * Summary: 创建批次
   */
  async createBatch(request: CreateBatchRequest): Promise<CreateBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBatchEx(request, headers, runtime);
  }

  /**
   * Description: 创建批次
   * Summary: 创建批次
   */
  async createBatchEx(request: CreateBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBatchResponse>(await this.doRequest("1.0", "antchain.mycharity.batch.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBatchResponse({}));
  }

  /**
   * Description: 修改执行记录状态
   * Summary: 修改执行记录状态
   */
  async updateRecord(request: UpdateRecordRequest): Promise<UpdateRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRecordEx(request, headers, runtime);
  }

  /**
   * Description: 修改执行记录状态
   * Summary: 修改执行记录状态
   */
  async updateRecordEx(request: UpdateRecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRecordResponse>(await this.doRequest("1.0", "antchain.mycharity.record.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRecordResponse({}));
  }

  /**
   * Description: 批量创建、修改、删除实施内容
   * Summary: 批量创建、修改、删除实施内容
   */
  async batchcreateCombination(request: BatchcreateCombinationRequest): Promise<BatchcreateCombinationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateCombinationEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建、修改、删除实施内容
   * Summary: 批量创建、修改、删除实施内容
   */
  async batchcreateCombinationEx(request: BatchcreateCombinationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateCombinationResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateCombinationResponse>(await this.doRequest("1.0", "antchain.mycharity.combination.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateCombinationResponse({}));
  }

}
