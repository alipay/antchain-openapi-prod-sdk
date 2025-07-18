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

// 规则
export class Rule extends $tea.Model {
  // 字段值的类型，常见有 string | number| boolean | _array_
  type: string;
  // type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
  len: number;
  // type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
  max: number;
  // type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
  min: number;
  // 校验出错时显示的错误消息
  message: string;
  // 是否必填
  required: boolean;
  // 正则表达式,
  regPattern: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      len: 'len',
      max: 'max',
      min: 'min',
      message: 'message',
      required: 'required',
      regPattern: 'reg_pattern',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      len: 'number',
      max: 'number',
      min: 'number',
      message: 'string',
      required: 'boolean',
      regPattern: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 忘记密码
export class ForgetMeta extends $tea.Model {
  // 字段名称
  label: string;
  // 忘记密码的链接地址，供重置用
  link: string;
  static names(): { [key: string]: string } {
    return {
      label: 'label',
      link: 'link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      label: 'string',
      link: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 逻辑
export class Logic extends $tea.Model {
  // 操作符
  //  equal = _equal_, // 相等比较
  //   notEqual = _notEqual_, // 不相等比较
  //   AND = _AND_, // 与逻辑
  //   OR = _OR_, // 或逻辑
  op: string;
  //  只有 op 是 AND 或者 OR 才是可选，其他情况为必选
  key: string;
  // 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
  value: string;
  // 只有 op 是 AND 或者 OR 才需要这个字段
  // [{op: _AND_, // 与逻辑
  //         children: [
  //           {
  //             op: _equal_, // 相等比较
  //             key: _validationMethod_, // 表示：验证方式
  //             value: _smsCode_  // 表示：短信验证码
  //           },
  //           { // 判断登录信息的值不为 null
  //             op: _notEqual_, // 不相等比较
  //             key: _username_,  // 表示：登录信息
  //             value: null
  //           }]}]
  children: string;
  static names(): { [key: string]: string } {
    return {
      op: 'op',
      key: 'key',
      value: 'value',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      op: 'string',
      key: 'string',
      value: 'string',
      children: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 选择组件
export class SelectOption extends $tea.Model {
  // 选项名称
  lable: string;
  // 选项的值，一般是 id 之类的唯一标识符，给后端传这个
  value: string;
  static names(): { [key: string]: string } {
    return {
      lable: 'lable',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lable: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 组件
export class Key extends $tea.Model {
  // 名称（key的中文名称）
  key: string;
  // id
  id: string;
  // input, // 普通输入框
  // dropdownSelect, // 下拉选择
  // cardSelect, // 平铺选择
  // password, // 密码输入框，这个类型会包含忘记密码按钮
  // smsCode, // 手机验证码
  // qrcodeLogin, // 二维码登录
  // hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
  type: string;
  // 字段名称 例如：密码
  label: string;
  // 输入框的值类型，字符串还是数字，默认 string/number/paassword
  inputType: string;
  // 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
  initialValue: string;
  // 占位符，比如”请输入密码“
  placeholder: string;
  // 是否为禁用状态，true 表示禁用，默认 false
  disabled: boolean;
  // 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
  readOnly: string;
  // 这个字段的提示说明文案
  tooltip: string;
  // 校验规则
  rules: Rule[];
  // 逻辑列表
  logics: Logic[];
  // 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
  selectOptions: SelectOption[];
  // 忘记密码元素
  forgetMeta: ForgetMeta;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      id: 'id',
      type: 'type',
      label: 'label',
      inputType: 'input_type',
      initialValue: 'initial_value',
      placeholder: 'placeholder',
      disabled: 'disabled',
      readOnly: 'read_only',
      tooltip: 'tooltip',
      rules: 'rules',
      logics: 'logics',
      selectOptions: 'select_options',
      forgetMeta: 'forget_meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      id: 'string',
      type: 'string',
      label: 'string',
      inputType: 'string',
      initialValue: 'string',
      placeholder: 'string',
      disabled: 'boolean',
      readOnly: 'string',
      tooltip: 'string',
      rules: { 'type': 'array', 'itemType': Rule },
      logics: { 'type': 'array', 'itemType': Logic },
      selectOptions: { 'type': 'array', 'itemType': SelectOption },
      forgetMeta: ForgetMeta,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权文件信息
export class AgreementFile extends $tea.Model {
  // 授权文件名称
  fileName: string;
  // 授权文件内容
  fileContentBase64String: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileContentBase64String: 'file_content_base64_string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileContentBase64String: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 配对
export class Pair extends $tea.Model {
  // left
  left: string;
  // right
  right: Key;
  static names(): { [key: string]: string } {
    return {
      left: 'left',
      right: 'right',
    };
  }

  static types(): { [key: string]: any } {
    return {
      left: 'string',
      right: Key,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// card
export class Card extends $tea.Model {
  // 名称（该页面的名称，可能做展示用）
  name: string;
  // 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
  tabShowName: string;
  // 当前模版所有需要填充元素
  keyValues: Pair;
  // true：是，false：不是
  // 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
  isSelected: string;
  // 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/
  returnValueKey: string[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      tabShowName: 'tab_show_name',
      keyValues: 'key_values',
      isSelected: 'is_selected',
      returnValueKey: 'return_value_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      tabShowName: 'string',
      keyValues: Pair,
      isSelected: 'string',
      returnValueKey: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地区请求
export class DistrictExtRequest extends $tea.Model {
  // 地区编码
  cityCode?: string;
  // 省或者直辖市代码
  provCode?: string;
  static names(): { [key: string]: string } {
    return {
      cityCode: 'city_code',
      provCode: 'prov_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityCode: 'string',
      provCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用同步授权扩展字段
export class AgreementExtRequest extends $tea.Model {
  // 证书类型
  type: string;
  // 是否盖章，true：是 false：否
  isSeal: string;
  // 地址
  address: string;
  // 授权文件信息
  agreementFile?: AgreementFile;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      isSeal: 'is_seal',
      address: 'address',
      agreementFile: 'agreement_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      isSeal: 'string',
      address: 'string',
      agreementFile: AgreementFile,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地区
export class RiskEvaluationDistrictExtRequest extends $tea.Model {
  // 地区编码
  cityCode: string;
  // 省级编码
  provCode: string;
  static names(): { [key: string]: string } {
    return {
      cityCode: 'city_code',
      provCode: 'prov_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityCode: 'string',
      provCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权扩展信息
export class StandardAuthExtendInfoRequest extends $tea.Model {
  // 协议列表
  agreementList: AgreementExtRequest[];
  // 地区请求
  districtextRequest: DistrictExtRequest;
  static names(): { [key: string]: string } {
    return {
      agreementList: 'agreement_list',
      districtextRequest: 'districtext_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementList: { 'type': 'array', 'itemType': AgreementExtRequest },
      districtextRequest: DistrictExtRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 树节点
export class TreeNode extends $tea.Model {
  // 节点id，按树的前序排列
  id: number;
  // 父节点id，不存在为null
  parentNodeId: string;
  // 深度
  depth: number;
  // 是否叶子结点
  isLeefNode: string;
  // 模版
  card: Card;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      parentNodeId: 'parent_node_id',
      depth: 'depth',
      isLeefNode: 'is_leef_node',
      card: 'card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      parentNodeId: 'string',
      depth: 'number',
      isLeefNode: 'string',
      card: Card,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 协议扩展
export class RiskEvaluationAgreementExtRequest extends $tea.Model {
  // URL：文件地址
  // CONTENT:Base64的文件流
  // 
  type: string;
  // 文件类型
  // PDF
  fileType?: string;
  // type为url是传入文件地址
  // type为CONTENT时传入Base64文件内容编码
  // 
  content: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fileType: 'file_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      fileType: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票明细
export class InvoiceItem extends $tea.Model {
  // 税收分类编码	
  spbm: string;
  // 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
  mc: string;
  // 单位
  jldw?: string;
  // 数量
  shul?: string;
  // 含税金额,2位小数
  je: string;
  // 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
  sl?: string;
  // 税额,当fplx!=51or53时，必填
  se?: string;
  // 明细序号,从1开始递增
  mxxh: string;
  // 单价
  dj: string;
  // 规格型号
  ggxh?: string;
  static names(): { [key: string]: string } {
    return {
      spbm: 'spbm',
      mc: 'mc',
      jldw: 'jldw',
      shul: 'shul',
      je: 'je',
      sl: 'sl',
      se: 'se',
      mxxh: 'mxxh',
      dj: 'dj',
      ggxh: 'ggxh',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spbm: 'string',
      mc: 'string',
      jldw: 'string',
      shul: 'string',
      je: 'string',
      sl: 'string',
      se: 'string',
      mxxh: 'string',
      dj: 'string',
      ggxh: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 税号信息
export class IdentityInfo extends $tea.Model {
  // 需要打标的税号
  identityId: string;
  // 授权编号
  authCode: string;
  // 授权开始时间
  authStartTime?: string;
  // 授权截止时间
  authEndTime?: string;
  // 授权书url
  authUrl?: string;
  static names(): { [key: string]: string } {
    return {
      identityId: 'identity_id',
      authCode: 'auth_code',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      authUrl: 'auth_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identityId: 'string',
      authCode: 'string',
      authStartTime: 'string',
      authEndTime: 'string',
      authUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 婚姻状况查验服务结果对象
export class MarriageCheckEvaluationFacade extends $tea.Model {
  // 婚姻状况查验结果
  checkResult: string;
  static names(): { [key: string]: string } {
    return {
      checkResult: 'check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      checkResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 税号批次清单
export class IdentityIdGroup extends $tea.Model {
  // 数据源
  channel: string;
  // 上传的文件
  fileUrl: string;
  static names(): { [key: string]: string } {
    return {
      channel: 'channel',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channel: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回详情
export class ReturnDetail extends $tea.Model {
  // 结果对象内容
  bizContent: string;
  // 返回形式
  returnType: string;
  // 文件列表
  fileUrls: string[];
  // 文件类型
  fileType: string;
  // 加密模式
  encryptModel: string;
  // 密钥信封
  secretEnvelope: string;
  static names(): { [key: string]: string } {
    return {
      bizContent: 'biz_content',
      returnType: 'return_type',
      fileUrls: 'file_urls',
      fileType: 'file_type',
      encryptModel: 'encrypt_model',
      secretEnvelope: 'secret_envelope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizContent: 'string',
      returnType: 'string',
      fileUrls: { 'type': 'array', 'itemType': 'string' },
      fileType: 'string',
      encryptModel: 'string',
      secretEnvelope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TreeTemplate
export class TreeTemplate extends $tea.Model {
  // 树节点
  treeNode: TreeNode;
  // Id
  id: string;
  // 版本号
  version: string;
  // 向上兼容的最小版本号
  compatibleMinVersion: string;
  static names(): { [key: string]: string } {
    return {
      treeNode: 'tree_node',
      id: 'id',
      version: 'version',
      compatibleMinVersion: 'compatible_min_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      treeNode: TreeNode,
      id: 'string',
      version: 'string',
      compatibleMinVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用base授权
export class BaseAuthRequest extends $tea.Model {
  // 租户号
  instCode: string;
  // 授权类型
  authType: string;
  // xdsadsfsdf
  orderNo: string;
  // 扩展信息
  extendInfo: StandardAuthExtendInfoRequest;
  static names(): { [key: string]: string } {
    return {
      instCode: 'inst_code',
      authType: 'auth_type',
      orderNo: 'order_no',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instCode: 'string',
      authType: 'string',
      orderNo: 'string',
      extendInfo: StandardAuthExtendInfoRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 纳税人状态
export class IndentityState extends $tea.Model {
  // 纳税人识别号
  nsrshb: string;
  // 纳税人名称
  nsrmc: string;
  // 税务机构名称
  swjgmc: string;
  // 纳税人识别号状态
  state: string;
  // 查询时间
  time: string;
  static names(): { [key: string]: string } {
    return {
      nsrshb: 'nsrshb',
      nsrmc: 'nsrmc',
      swjgmc: 'swjgmc',
      state: 'state',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nsrshb: 'string',
      nsrmc: 'string',
      swjgmc: 'string',
      state: 'string',
      time: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人授权
export class StandardRealPersonAuthRequest extends $tea.Model {
  // 个人证件号
  identityId: string;
  // 名字
  identityName: string;
  static names(): { [key: string]: string } {
    return {
      identityId: 'identity_id',
      identityName: 'identity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identityId: 'string',
      identityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果集合
export class DataProcessGlobalResponse extends $tea.Model {
  // 处理结果数据
  data: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收入评估服务B结果对象
export class SocialIncomeEvaluationFacade extends $tea.Model {
  // 查询结果
  scoreResult: string;
  // 收入评分
  rangeScore?: string;
  // 历史稳定性评估
  historyScore?: string;
  // 近期稳定性评估
  stabilityScore?: string;
  static names(): { [key: string]: string } {
    return {
      scoreResult: 'score_result',
      rangeScore: 'range_score',
      historyScore: 'history_score',
      stabilityScore: 'stability_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scoreResult: 'string',
      rangeScore: 'string',
      historyScore: 'string',
      stabilityScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收入评估服务A结果
export class PersonalIncomeEvaluationFacade extends $tea.Model {
  // 查询结果
  scoreResult: string;
  // 收入评分
  incomeScore?: string;
  static names(): { [key: string]: string } {
    return {
      scoreResult: 'score_result',
      incomeScore: 'income_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scoreResult: 'string',
      incomeScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据流转统一入参
export class DataProcessGlobalRequest extends $tea.Model {
  // 产品码
  productCode: string;
  // 租户类型
  instCode: string;
  // 参数
  param: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      instCode: 'inst_code',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      instCode: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二维码
export class QrCodeValue extends $tea.Model {
  // 二维码链接
  qrCodeUrl: string;
  // 二维码描述信息。例如：请使用 xxx app 扫码登录
  desc: string;
  // 二维码在多长时间后失效，单位：秒
  timeout: number;
  static names(): { [key: string]: string } {
    return {
      qrCodeUrl: 'qr_code_url',
      desc: 'desc',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      qrCodeUrl: 'string',
      desc: 'string',
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 扩展信息
export class RiskEvaluationExtendInfoRequest extends $tea.Model {
  // 协议集合
  agreementList: RiskEvaluationAgreementExtRequest[];
  // 地区请求
  districtExt: RiskEvaluationDistrictExtRequest;
  static names(): { [key: string]: string } {
    return {
      agreementList: 'agreement_list',
      districtExt: 'district_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementList: { 'type': 'array', 'itemType': RiskEvaluationAgreementExtRequest },
      districtExt: RiskEvaluationDistrictExtRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 要素授权打标返回结果
export class DataMarkFileResult extends $tea.Model {
  // 返回数据再oss上的地址
  fileUrl: string;
  // 秘钥
  secret: string;
  static names(): { [key: string]: string } {
    return {
      fileUrl: 'file_url',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileUrl: 'string',
      secret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票标准模型
export class Invoice extends $tea.Model {
  // 备注
  bz?: string;
  // 复核人
  fhr?: string;
  // 发票代码, 发票代码+发票号码唯一
  fpdm: string;
  // 发票号码,发票代码+发票号码唯一
  fphm: string;
  // 发票类型代码,
  // 默认填:20:广东电子普通发票
  // 01：增值税专用发票
  // 04：增值税普通发票
  // 10：增值税电子普通发票
  // 51：重庆通用机打一联发票76
  // 53：重庆通用机打三联发票210
  // 90：重庆通用机打三联发票190
  fplx: string;
  // 发票明细集合
  fpxxmxs?: InvoiceItem[];
  // 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
  fpztdm: string;
  // 购买方地址、电话
  gfdzdh?: string;
  // 购买方名称
  gfmc: string;
  // 购买方纳税人识别号
  gfsh?: string;
  // 购买方银行账号
  gfyhzh?: string;
  // 购买方类型,1企业 2个人 3其他
  gmflx?: string;
  // 金额
  je: string;
  // 价税合计	， 单位：元（2 位小数）
  jshj: string;
  // 开票类型,0-蓝字发票；1-红字发票；
  kplx: string;
  // 开票人
  kpr: string;
  // 开票日期
  kprq: string;
  // 清单标志,00:无清单 01:有清单
  qdbz?: string;
  // 认证状态
  rzdklbdjgdm?: string;
  // 认证日期
  rzdklbdrq?: string;
  // 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
  se?: string;
  // 收款人
  skr?: string;
  // 税率标识,0不含税税率；1含税税率
  slbz: string;
  // 所属税务机关代码:
  // 山东省343
  // 重庆市350
  // 广东省347
  ssdq: string;
  // 销售方地址、电话
  xfdzdh?: string;
  // 销售方名称
  xfmc: string;
  // 销售方纳税人识别号
  xfsh: string;
  // 销售方银行账号
  xfyhzh?: string;
  // 原发票代码, kplx开票类型为1时必填
  yfpdm?: string;
  // 原发票号码,kplx开票类型为1时必填
  yfphm?: string;
  // 作废标志,0:未作废，1作废
  zfbz: string;
  // 作废时间
  zfsj?: string;
  // 扩展字段
  extFiled: string;
  static names(): { [key: string]: string } {
    return {
      bz: 'bz',
      fhr: 'fhr',
      fpdm: 'fpdm',
      fphm: 'fphm',
      fplx: 'fplx',
      fpxxmxs: 'fpxxmxs',
      fpztdm: 'fpztdm',
      gfdzdh: 'gfdzdh',
      gfmc: 'gfmc',
      gfsh: 'gfsh',
      gfyhzh: 'gfyhzh',
      gmflx: 'gmflx',
      je: 'je',
      jshj: 'jshj',
      kplx: 'kplx',
      kpr: 'kpr',
      kprq: 'kprq',
      qdbz: 'qdbz',
      rzdklbdjgdm: 'rzdklbdjgdm',
      rzdklbdrq: 'rzdklbdrq',
      se: 'se',
      skr: 'skr',
      slbz: 'slbz',
      ssdq: 'ssdq',
      xfdzdh: 'xfdzdh',
      xfmc: 'xfmc',
      xfsh: 'xfsh',
      xfyhzh: 'xfyhzh',
      yfpdm: 'yfpdm',
      yfphm: 'yfphm',
      zfbz: 'zfbz',
      zfsj: 'zfsj',
      extFiled: 'ext_filed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bz: 'string',
      fhr: 'string',
      fpdm: 'string',
      fphm: 'string',
      fplx: 'string',
      fpxxmxs: { 'type': 'array', 'itemType': InvoiceItem },
      fpztdm: 'string',
      gfdzdh: 'string',
      gfmc: 'string',
      gfsh: 'string',
      gfyhzh: 'string',
      gmflx: 'string',
      je: 'string',
      jshj: 'string',
      kplx: 'string',
      kpr: 'string',
      kprq: 'string',
      qdbz: 'string',
      rzdklbdjgdm: 'string',
      rzdklbdrq: 'string',
      se: 'string',
      skr: 'string',
      slbz: 'string',
      ssdq: 'string',
      xfdzdh: 'string',
      xfmc: 'string',
      xfsh: 'string',
      xfyhzh: 'string',
      yfpdm: 'string',
      yfphm: 'string',
      zfbz: 'string',
      zfsj: 'string',
      extFiled: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCorpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业注册地址和电话号码
  corpAddressPhoneNo: string;
  // 企业银行账号
  corpBankNo: string;
  // 填写公司名称
  corpName: string;
  // 企业授权秘钥
  corpPrivateKey: string;
  // 企业纳税人识别号
  corpTaxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpAddressPhoneNo: 'corp_address_phone_no',
      corpBankNo: 'corp_bank_no',
      corpName: 'corp_name',
      corpPrivateKey: 'corp_private_key',
      corpTaxId: 'corp_tax_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpAddressPhoneNo: 'string',
      corpBankNo: 'string',
      corpName: 'string',
      corpPrivateKey: 'string',
      corpTaxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCorpResponse extends $tea.Model {
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

export class PushChargeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  bizTenant: string;
  // 平台分发,子业务类型，对应原来的authType.
  bizType: string;
  // 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
  customerId: string;
  // 系统编码,平台分发，定义枚举，全局用
  systemCode: string;
  // 请求id
  taskRequestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      bizType: 'biz_type',
      customerId: 'customer_id',
      systemCode: 'system_code',
      taskRequestId: 'task_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      bizType: 'string',
      customerId: 'string',
      systemCode: 'string',
      taskRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushChargeResponse extends $tea.Model {
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

export class QueryChargeAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  bizTenant: string;
  // 授权类型,业务类型
  bizType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChargeAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OPEN:开通
  // STOP：停止
  // NOT_SALE：未授权
  authType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  pch: string;
  // 发票信息（json格式）
  fpxx: string;
  // 发票类型
  // 01：增值税专用发票
  // 04：增值税普通发票
  // 10：增值税电子普通发票
  fplx: string;
  // 是否是历史数据推送
  islsp: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pch: 'pch',
      fpxx: 'fpxx',
      fplx: 'fplx',
      islsp: 'islsp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pch: 'string',
      fpxx: 'string',
      fplx: 'string',
      islsp: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceResponse extends $tea.Model {
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

export class QueryIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ISV名称，用于标识合作的企业
  appId: string;
  // 授权类型
  // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
  authType: string;
  //  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
  // 
  callbackUrl?: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  endAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  endDate?: string;
  // 非必填，不填则查询所有类型发票
  // "01": "增值税专用发票"
  // "04": "增值税普通发票"
  // "10": "增值税电子普通发票"
  invoiceType?: string;
  // 查询的企业纳税人识别号
  nsrsbh: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  startAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  startDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      authType: 'auth_type',
      callbackUrl: 'callback_url',
      endAmount: 'end_amount',
      endDate: 'end_date',
      invoiceType: 'invoice_type',
      nsrsbh: 'nsrsbh',
      requestId: 'request_id',
      startAmount: 'start_amount',
      startDate: 'start_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      authType: 'string',
      callbackUrl: 'string',
      endAmount: 'number',
      endDate: 'string',
      invoiceType: 'string',
      nsrsbh: 'string',
      requestId: 'string',
      startAmount: 'number',
      startDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIcmInvoiceResponse extends $tea.Model {
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

export class PushIcmInvoiceinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上票ISV app_id即secret_id
  appId: string;
  // 发票号码	
  invoice: Invoice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      invoice: 'invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      invoice: Invoice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceinfoResponse extends $tea.Model {
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

export class DescribeIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发票销方税号
  xfsh: string;
  // 发票代码
  fpdm: string;
  // 发票号码
  fphm: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      xfsh: 'xfsh',
      fpdm: 'fpdm',
      fphm: 'fphm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      xfsh: 'string',
      fpdm: 'string',
      fphm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeIcmInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易hash即txhash
  txhash?: string;
  // 交易块号
  blockNumber?: string;
  // 交易时间
  timestamp?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txhash: 'txhash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txhash: 'string',
      blockNumber: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // 查询的企业纳税人识别号
  // 
  nsrsbh: string;
  // 企业名称
  corpName: string;
  // 身份证号
  identityNumber: string;
  // 已认证的法人手机号
  cognizantMobile: string;
  // 已认证的法人姓名
  cognizantName: string;
  // 透传字段
  bizContext?: string;
  // 授权业务类型
  authType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      nsrsbh: 'nsrsbh',
      corpName: 'corp_name',
      identityNumber: 'identity_number',
      cognizantMobile: 'cognizant_mobile',
      cognizantName: 'cognizant_name',
      bizContext: 'biz_context',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      nsrsbh: 'string',
      corpName: 'string',
      identityNumber: 'string',
      cognizantMobile: 'string',
      cognizantName: 'string',
      bizContext: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权是否成功：true：成功 false：失败
  success?: string;
  // 透传字段
  bizContext?: string;
  // 纳税人识别号
  nsrsbh?: string;
  // 过期时间
  expiredTime?: string;
  // 业务请求id
  requestId?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      bizContext: 'biz_context',
      nsrsbh: 'nsrsbh',
      expiredTime: 'expired_time',
      requestId: 'request_id',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'string',
      bizContext: 'string',
      nsrsbh: 'string',
      expiredTime: 'string',
      requestId: 'string',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础授权请求
  request: BaseAuthRequest;
  // 个人证件号
  identityId: string;
  // 名字
  identityName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
      identityId: 'identity_id',
      identityName: 'identity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: BaseAuthRequest,
      identityId: 'string',
      identityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否授权成功true是，false否
  authSuccess?: boolean;
  // 订单号
  orderNo?: string;
  // 过期时间
  expireTime?: string;
  // 授权时间 unix时间戳
  authTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authSuccess: 'auth_success',
      orderNo: 'order_no',
      expireTime: 'expire_time',
      authTime: 'auth_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authSuccess: 'boolean',
      orderNo: 'string',
      expireTime: 'string',
      authTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIcmSyncgatheringRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构号码
  instCode: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 纳税人识别号(必填)
  identityId: string;
  // 授权类型(必填)
  authType: string;
  // 订单号
  orderNo: string;
  // 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
  content: string;
  // 查询类型
  // NORMAL 正常调用
  // BATCH_HAND  批刷
  queryType?: string;
  // 子机构编码，字典由系统预设白名单
  subTenant?: string;
  // 优先级，越大优先级越高
  usePriority?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      content: 'content',
      queryType: 'query_type',
      subTenant: 'sub_tenant',
      usePriority: 'use_priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      content: 'string',
      queryType: 'string',
      subTenant: 'string',
      usePriority: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIcmSyncgatheringResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的请求对象jsonString
  bizContent?: string;
  // unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  // 返回模式
  returnMode?: string;
  // 返回结果
  returnResult?: ReturnDetail[];
  // 是否查得
  nullDataFlag?: boolean;
  // 参考区块链给出的标准字段定义
  queryType?: string;
  // 是否需要重新授权
  reauth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizContent: 'biz_content',
      queryTime: 'query_time',
      returnMode: 'return_mode',
      returnResult: 'return_result',
      nullDataFlag: 'null_data_flag',
      queryType: 'query_type',
      reauth: 'reauth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizContent: 'string',
      queryTime: 'string',
      returnMode: 'string',
      returnResult: { 'type': 'array', 'itemType': ReturnDetail },
      nullDataFlag: 'boolean',
      queryType: 'string',
      reauth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthteplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务订单号
  orderNo: string;
  // 身份ID 身份证或者统一社会信用编码
  identityId: string;
  // 名称
  identityName: string;
  // 业务类型
  // 11 税
  // 12票
  // 13税+票
  authType: string;
  // 法人名称
  cognizantName: string;
  // 法人证件号
  coidentityNumber: string;
  // 法人手机号
  cognizantMobile: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      identityId: 'identity_id',
      identityName: 'identity_name',
      authType: 'auth_type',
      cognizantName: 'cognizant_name',
      coidentityNumber: 'coidentity_number',
      cognizantMobile: 'cognizant_mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      identityId: 'string',
      identityName: 'string',
      authType: 'string',
      cognizantName: 'string',
      coidentityNumber: 'string',
      cognizantMobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthteplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // JWT生成，设置失效时间，维持会话数据
  token?: string;
  // Unix时间戳 秒
  expireTime?: number;
  // 模版树
  treeTemplate?: TreeTemplate;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
      expireTime: 'expire_time',
      treeTemplate: 'tree_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
      expireTime: 'number',
      treeTemplate: TreeTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecApiAuthtemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // token
  token: string;
  // 树的模版id
  treeTemplateId: string;
  // 模版对应的版本号
  treeVersion: string;
  // 对应节点ID
  nodeId: string;
  // 当前卡片所有需要填充元素key
  // 和value值
  pairs: Pair;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
      treeTemplateId: 'tree_template_id',
      treeVersion: 'tree_version',
      nodeId: 'node_id',
      pairs: 'pairs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
      treeTemplateId: 'string',
      treeVersion: 'string',
      nodeId: 'string',
      pairs: Pair,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecApiAuthtemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的下一层节点集合
  nodes?: TreeNode[];
  // 树id
  treeTemplateId?: string;
  // 授权状态,提交接口此字段为空
  // 1、正在处理中
  // 2、登陆成功
  authState?: string;
  // 请求是否成功
  // true 成功
  // false 失败
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodes: 'nodes',
      treeTemplateId: 'tree_template_id',
      authState: 'auth_state',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodes: { 'type': 'array', 'itemType': TreeNode },
      treeTemplateId: 'string',
      authState: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthtemplatedefineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // token
  token: string;
  // message：短信
  // qrCode：二维码
  actionType: string;
  // 依赖的数据值 比如身份证
  dependsValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
      actionType: 'action_type',
      dependsValue: 'depends_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
      actionType: 'string',
      dependsValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthtemplatedefineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二维码类型返回二维码描述
  // 短信无返回，接口成功即可
  value?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthtemplateresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务授权订单号 用户幂等控制，调用方保证唯一
  orderNo: string;
  // 身份ID
  identityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      identityId: 'identity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      identityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthtemplateresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 授权状态
  // 1、正在处理中
  // 2、登陆成功
  authState?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      authState: 'auth_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      authState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmEnterpriseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份id，统一社会信用编码or其他
  identityId: string;
  // 企业名称
  identityName?: string;
  // 授权类型，不动产100，电力200
  authType: string;
  // 授权订单号
  orderNo: string;
  // 扩展信息	
  extendInfo: StandardAuthExtendInfoRequest;
  // 法人姓名
  cognizantName?: string;
  // 法人手机号
  cognizantMobile?: string;
  // 法人身份证号
  cognizantId?: string;
  // 字典由系统设置，子机构编码
  subTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      identityName: 'identity_name',
      authType: 'auth_type',
      orderNo: 'order_no',
      extendInfo: 'extend_info',
      cognizantName: 'cognizant_name',
      cognizantMobile: 'cognizant_mobile',
      cognizantId: 'cognizant_id',
      subTenant: 'sub_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      identityName: 'string',
      authType: 'string',
      orderNo: 'string',
      extendInfo: StandardAuthExtendInfoRequest,
      cognizantName: 'string',
      cognizantMobile: 'string',
      cognizantId: 'string',
      subTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIcmEnterpriseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否授权成功true是，false否
  // 
  authSuccess?: boolean;
  // 授权订单订单号
  // 
  orderNo?: string;
  // 过期时间，unix时间戳 毫秒
  expireTime?: number;
  // unix时间戳 毫秒
  authTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authSuccess: 'auth_success',
      orderNo: 'order_no',
      expireTime: 'expire_time',
      authTime: 'auth_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authSuccess: 'boolean',
      orderNo: 'string',
      expireTime: 'number',
      authTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiAuthurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
  authType: string;
  // 纳税人识别号
  nsrsbh: string;
  // 企业名称
  corpName: string;
  // 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
  callBackUrl: string;
  // 机构代码
  instCode: string;
  // 已认证的法人手机号
  cognizantMobile?: string;
  // 已认证的法人姓名
  cognizantName?: string;
  // 已认证的法人身份证号
  identityNumber?: string;
  // 订单号，用于幂等控制，每次新生成，如果不填我方会自动生成一个
  orderNo?: string;
  // 登录方式，ACCOUNT_PASS：账密，ALL：全部(包括账密和扫码)，默认为ALL（全部）
  loginMode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authType: 'auth_type',
      nsrsbh: 'nsrsbh',
      corpName: 'corp_name',
      callBackUrl: 'call_back_url',
      instCode: 'inst_code',
      cognizantMobile: 'cognizant_mobile',
      cognizantName: 'cognizant_name',
      identityNumber: 'identity_number',
      orderNo: 'order_no',
      loginMode: 'login_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authType: 'string',
      nsrsbh: 'string',
      corpName: 'string',
      callBackUrl: 'string',
      instCode: 'string',
      cognizantMobile: 'string',
      cognizantName: 'string',
      identityNumber: 'string',
      orderNo: 'string',
      loginMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiAuthurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单号
  orderNo?: string;
  // 短链接地址
  loginUrl?: string;
  // 授权原始链接
  originLoginUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      loginUrl: 'login_url',
      originLoginUrl: 'origin_login_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      loginUrl: 'string',
      originLoginUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchIcmSimpleauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
  instCode: string;
  // 纳税人识别号
  identityId: string;
  // 用于幂等控制
  bizRequestId: string;
  // 产品类型
  authType?: string;
  // 授权编号
  authCode: string;
  // 请求模式，queryMode=0，与异步接口的轮询逻辑保持一致;queryMode=1， 与同步接口的调度逻辑保持一致
  queryMode?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authType: 'auth_type',
      authCode: 'auth_code',
      queryMode: 'query_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authType: 'string',
      authCode: 'string',
      queryMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchIcmSimpleauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支持的数据类型
  coverResult?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      coverResult: 'cover_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      coverResult: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIcmSimpleauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户名称
  instCode: string;
  // 纳税人识别号
  identityId: string;
  // 请求id，用于幂等控制
  bizRequestId: string;
  // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
  authType: string;
  // 行方生成的授权编号
  authCode: string;
  // 如果有的话，作为透传字段
  bizContext?: string;
  // 机构id
  instituteId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authType: 'auth_type',
      authCode: 'auth_code',
      bizContext: 'biz_context',
      instituteId: 'institute_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authType: 'string',
      authCode: 'string',
      bizContext: 'string',
      instituteId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIcmSimpleauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支持的数据类型，结果数据
  returnResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      returnResult: 'return_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      returnResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiSimpleauthasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
  instCode: string;
  // 纳税人识别号
  identityId: string;
  // 用于幂等控制
  bizRequestId: string;
  // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
  authType: string;
  // 行方生成的授权编号
  // 
  authCode?: string;
  // 机构id
  instituteId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authType: 'auth_type',
      authCode: 'auth_code',
      instituteId: 'institute_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authType: 'string',
      authCode: 'string',
      instituteId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiSimpleauthasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功
  returnResult?: string;
  // false 有值
  // true  无值
  nullDataFlag?: string;
  // json格式，其他内容
  bizContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      returnResult: 'return_result',
      nullDataFlag: 'null_data_flag',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      returnResult: 'string',
      nullDataFlag: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人身份证号
  identityId: string;
  // 个人姓名
  identityName?: string;
  // 企业的统一社会信用编码
  enterpriseId?: string;
  // 企业的名称
  enterpriseName?: string;
  // 企业或者个人企业：ENTERPRISE  个人：PERSONAL
  // 
  identityType: string;
  // 授权的业务类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
  // 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
  // 
  subTenant?: string;
  //  扩展信息
  extendInfo: RiskEvaluationExtendInfoRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      identityName: 'identity_name',
      enterpriseId: 'enterprise_id',
      enterpriseName: 'enterprise_name',
      identityType: 'identity_type',
      authType: 'auth_type',
      orderNo: 'order_no',
      subTenant: 'sub_tenant',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      identityName: 'string',
      enterpriseId: 'string',
      enterpriseName: 'string',
      identityType: 'string',
      authType: 'string',
      orderNo: 'string',
      subTenant: 'string',
      extendInfo: RiskEvaluationExtendInfoRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权订单订单号
  orderNo?: string;
  // 是否授权成功true是，false否
  authSuccess?: boolean;
  // 过期时间，unix时间戳 毫秒
  expireTime?: number;
  // 授权时间，unix时间戳 毫秒
  authTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      authSuccess: 'auth_success',
      expireTime: 'expire_time',
      authTime: 'auth_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      authSuccess: 'boolean',
      expireTime: 'number',
      authTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 信贷用户的纳税人识别号或者身份证号
  identityId: string;
  // 授权类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 机构编码
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  // 是否查的，空数据标识
  nullDataFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryTime: 'query_time',
      nullDataFlag: 'null_data_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryTime: 'string',
      nullDataFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullApiSimpleauthasyncpollingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号	
  // 
  instCode: string;
  // 纳税人识别号	
  identityId: string;
  // 用于幂等控制	
  // 
  bizRequestId: string;
  // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303	
  // 
  authType: string;
  // 行方生成的授权编号	
  // 
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authType: 'auth_type',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authType: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullApiSimpleauthasyncpollingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户号
  instCode?: string;
  // 纳税人识别号
  identityId?: string;
  // 和查询的biz_request_id相同
  bizRequestId?: string;
  // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
  authType?: string;
  // 行方生成的授权编号
  authCode?: string;
  // 时间戳
  timestamp?: string;
  // 极简授权文件地址列表
  fileList?: string[];
  // 秘钥
  secret?: string;
  // 0：不含进项发票。  1：包含进项发票。
  proceedsInvoice?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instCode: 'inst_code',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authType: 'auth_type',
      authCode: 'auth_code',
      timestamp: 'timestamp',
      fileList: 'file_list',
      secret: 'secret',
      proceedsInvoice: 'proceeds_invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instCode: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authType: 'string',
      authCode: 'string',
      timestamp: 'string',
      fileList: { 'type': 'array', 'itemType': 'string' },
      secret: 'string',
      proceedsInvoice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiSimpleauthstandardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 纳税人识别号
  identityId: string;
  // 用于幂等控制
  bizRequestId: string;
  // 该请求最终发起方(金融机构)的租户号，若是征信通道模式，则是征信机构终端客户的租户号，该租户号由我方分配。
  instCode: string;
  // 产品类型；
  // 发票数据：301；税务数据：302；发票及税务数据：303； (通过征信机构链接时请在数字前加“ZX”，如：ZX301)
  authType: string;
  // 是指行方生成的授权编号
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      instCode: 'inst_code',
      authType: 'auth_type',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      instCode: 'string',
      authType: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiSimpleauthstandardResponse extends $tea.Model {
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

export class ExecApiSimpleauthmarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号
  instCode: string;
  // 请求id
  bizUniqueId: string;
  // 产品类型
  authType: string;
  // 申请打标的税号
  identityIdList: IdentityInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      bizUniqueId: 'biz_unique_id',
      authType: 'auth_type',
      identityIdList: 'identity_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      bizUniqueId: 'string',
      authType: 'string',
      identityIdList: { 'type': 'array', 'itemType': IdentityInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecApiSimpleauthmarkResponse extends $tea.Model {
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

export class SubmitApiSimpleauthmarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 打标之后的结果
  identityGroupList: IdentityIdGroup[];
  // 产品类型
  authType?: string;
  // 租户信息
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityGroupList: 'identity_group_list',
      authType: 'auth_type',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityGroupList: { 'type': 'array', 'itemType': IdentityIdGroup },
      authType: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitApiSimpleauthmarkResponse extends $tea.Model {
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

export class PullApiSimpleauthmarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用租户
  instCode: string;
  // 请求id，用于幂等控制
  bizUniqueId: string;
  // 产品类型
  authType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      bizUniqueId: 'biz_unique_id',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      bizUniqueId: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullApiSimpleauthmarkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拉取推送系统时间
  timestamp?: string;
  // 请求id，幂等控制
  bizUniqueId?: string;
  // 调用的租户
  instCode?: string;
  // oss文件的域名地址
  // 测试环境域名：http://invoice-oss-sit.oss-cn-hangzhou.aliyuncs.com
  // 生产环境域名：http://invoice-commercial-prod.oss-cn-hangzhou.aliyuncs.com
  // 端口是默认的80
  resultList?: DataMarkFileResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      timestamp: 'timestamp',
      bizUniqueId: 'biz_unique_id',
      instCode: 'inst_code',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      timestamp: 'string',
      bizUniqueId: 'string',
      instCode: 'string',
      resultList: { 'type': 'array', 'itemType': DataMarkFileResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 信贷用户的纳税人识别号或者身份证号
  identityId: string;
  // 授权类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 机构编码
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1322324243	unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  // 内容，List<JsonObject>
  bizContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryTime: 'query_time',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryTime: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimpleauthIdentitystateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 纳税人识别号
  identity: string;
  // 租户号
  instCode: string;
  // 请求id
  bizUniqueId: string;
  // 产品类型
  authType: string;
  // 授权编码
  authCode: string;
  // 纳税人名称
  nsrmc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identity: 'identity',
      instCode: 'inst_code',
      bizUniqueId: 'biz_unique_id',
      authType: 'auth_type',
      authCode: 'auth_code',
      nsrmc: 'nsrmc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identity: 'string',
      instCode: 'string',
      bizUniqueId: 'string',
      authType: 'string',
      authCode: 'string',
      nsrmc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimpleauthIdentitystateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  bizRequestId?: string;
  // 返回结果
  data?: IndentityState[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizRequestId: 'biz_request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizRequestId: 'string',
      data: { 'type': 'array', 'itemType': IndentityState },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiHaiguanasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
  instCode: string;
  // 产品类型，海关数据: ZX500
  authType: string;
  // 身份id，企业税号
  identityId: string;
  // 用于幂等控制
  bizRequestId: string;
  // 行方生成的授权编号
  authCode: string;
  // 公网可访问的地址，PDF格式
  authUrl: string;
  // 格式：yyyy-MM-dd HH:mm:ss
  authStartTime: string;
  // 格式：yyyy-MM-dd HH:mm:ss
  authEndTime: string;
  // 企业名称
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      authType: 'auth_type',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      authCode: 'auth_code',
      authUrl: 'auth_url',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      authType: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      authCode: 'string',
      authUrl: 'string',
      authStartTime: 'string',
      authEndTime: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiHaiguanasyncResponse extends $tea.Model {
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

export class PullApiHaiguanasyncpollingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号/子租户号
  instCode: string;
  // 产品类型，海关数据: ZX500
  authType: string;
  // 身份id，企业税号
  identityId: string;
  // 用于幂等控制
  bizRequestId: string;
  // 企业名称
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      authType: 'auth_type',
      identityId: 'identity_id',
      bizRequestId: 'biz_request_id',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      authType: 'string',
      identityId: 'string',
      bizRequestId: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullApiHaiguanasyncpollingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
  instCode?: string;
  // 请求id
  bizRequestId?: string;
  // 身份id，企业税号
  identityId?: string;
  // 数据文件地址集合，目前只会包含一个txt文件
  fileList?: string[];
  // 解密密钥信封
  secret?: string;
  // 产品类型
  authType?: string;
  // 行方生成的授权编号
  authCode?: string;
  // 系统时间
  timestamp?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instCode: 'inst_code',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      fileList: 'file_list',
      secret: 'secret',
      authType: 'auth_type',
      authCode: 'auth_code',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instCode: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      fileList: { 'type': 'array', 'itemType': 'string' },
      secret: 'string',
      authType: 'string',
      authCode: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人身份证号
  identityId: string;
  // 个人姓名
  identityName?: string;
  // 企业的统一社会信用编码
  enterpriseId?: string;
  // 某某某公司
  enterpriseName?: string;
  // 企业或者个人企业：ENTERPRISE 个人：PERSONAL
  identityType: string;
  // 101
  authType: string;
  // 授权订单号
  orderNo: string;
  // 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
  bizRequestId: string;
  // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
  subTenant: string;
  // 扩展信息
  extendInfo: RiskEvaluationExtendInfoRequest;
  // 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
  searchModel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      identityName: 'identity_name',
      enterpriseId: 'enterprise_id',
      enterpriseName: 'enterprise_name',
      identityType: 'identity_type',
      authType: 'auth_type',
      orderNo: 'order_no',
      bizRequestId: 'biz_request_id',
      subTenant: 'sub_tenant',
      extendInfo: 'extend_info',
      searchModel: 'search_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      identityName: 'string',
      enterpriseId: 'string',
      enterpriseName: 'string',
      identityType: 'string',
      authType: 'string',
      orderNo: 'string',
      bizRequestId: 'string',
      subTenant: 'string',
      extendInfo: RiskEvaluationExtendInfoRequest,
      searchModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权订单订单号
  orderNo?: string;
  // 是否授权成功true是，false否
  authSuccess?: string;
  // 过期时间，unix时间戳 毫秒
  expireTime?: number;
  // 授权时间，unix时间戳 毫秒
  authTime?: number;
  // 预测的常驻省份
  predictProvCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      authSuccess: 'auth_success',
      expireTime: 'expire_time',
      authTime: 'auth_time',
      predictProvCode: 'predict_prov_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      authSuccess: 'string',
      expireTime: 'number',
      authTime: 'number',
      predictProvCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseElectronicasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权类型，401
  authType: string;
  // 调用机构编码
  instCode: string;
  // 本次调用id
  bizUniqueId: string;
  // 身份id，统一社会信用编码or其他
  identityId: string;
  // 授权单号，使用授权接口返回的orderNo
  orderNo: string;
  // 地区行政编码
  areaCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authType: 'auth_type',
      instCode: 'inst_code',
      bizUniqueId: 'biz_unique_id',
      identityId: 'identity_id',
      orderNo: 'order_no',
      areaCode: 'area_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authType: 'string',
      instCode: 'string',
      bizUniqueId: 'string',
      identityId: 'string',
      orderNo: 'string',
      areaCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseElectronicasyncResponse extends $tea.Model {
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

export class QueryApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品名称
  productCode: string;
  // 账户自护
  instCode: string;
  // 业务参数
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      instCode: 'inst_code',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      instCode: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class InitApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品code
  productCode: string;
  // 租户code
  instCode: string;
  // 请求参数
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      instCode: 'inst_code',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      instCode: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果集
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

export class JudgeApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品编码
  productCode: string;
  // 租户code
  instCode: string;
  // 业务参数
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      instCode: 'inst_code',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      instCode: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class ExecApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品code
  productCode: string;
  // 租户code
  instCode: string;
  // 请求参数
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      instCode: 'inst_code',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      instCode: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的业务数据
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

export class RunApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数json
  bizParam: string;
  // 产品code
  productCode: string;
  // 调用的方法
  methodCode: string;
  // 租户编码
  instCode?: string;
  // RSA-DESede
  // 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
  algorithm?: string;
  // 是否采用加密算法
  encryption?: boolean;
  // 对称秘钥加密后的数据
  encryptionKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizParam: 'biz_param',
      productCode: 'product_code',
      methodCode: 'method_code',
      instCode: 'inst_code',
      algorithm: 'algorithm',
      encryption: 'encryption',
      encryptionKey: 'encryption_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizParam: 'string',
      productCode: 'string',
      methodCode: 'string',
      instCode: 'string',
      algorithm: 'string',
      encryption: 'boolean',
      encryptionKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class QueryIcmInvoicecontinuedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号
  appId: string;
  // 授权类型
  authType: string;
  // 纳税人识别号
  nsrsbh: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // 数据通知地址接口 ，用于数据采集完毕后通知该接口如何取发票数据，也可以通过后台指定配置
  callbackUrl?: string;
  // 贷款期限，格式:yyyy-MM-dd，不晚于当前时间，包含贷款截止日期当天
  creditTerm: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      authType: 'auth_type',
      nsrsbh: 'nsrsbh',
      requestId: 'request_id',
      callbackUrl: 'callback_url',
      creditTerm: 'credit_term',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      authType: 'string',
      nsrsbh: 'string',
      requestId: 'string',
      callbackUrl: 'string',
      creditTerm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIcmInvoicecontinuedResponse extends $tea.Model {
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

export class QueryApiAuthweblogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号
  instCode: string;
  // 埋点日志日期（yyyyMMdd）
  logDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      logDate: 'log_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      logDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiAuthweblogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件地址
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataPersonalincomeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId?: string;
  // 姓名
  name?: string;
  // 身份证
  certNo?: string;
  // 手机号
  phoneNo?: string;
  // 授权编码
  authorizationCode?: string;
  // 授权凭证
  authorizationCredential?: string;
  // 凭证格式
  credentialType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      certNo: 'cert_no',
      phoneNo: 'phone_no',
      authorizationCode: 'authorization_code',
      authorizationCredential: 'authorization_credential',
      credentialType: 'credential_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      certNo: 'string',
      phoneNo: 'string',
      authorizationCode: 'string',
      authorizationCredential: 'string',
      credentialType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataPersonalincomeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  scoreResult?: string;
  // 收入评分
  incomeScore?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scoreResult: 'score_result',
      incomeScore: 'income_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scoreResult: 'string',
      incomeScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataSocialincomeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId?: string;
  // 姓名
  name?: string;
  // 身份证
  certNo?: string;
  // 手机号
  phoneNo?: string;
  // 授权编号
  authorizationCode?: string;
  // 授权凭证
  authorizationCredential?: string;
  // 凭证格式
  credentialType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      certNo: 'cert_no',
      phoneNo: 'phone_no',
      authorizationCode: 'authorization_code',
      authorizationCredential: 'authorization_credential',
      credentialType: 'credential_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      certNo: 'string',
      phoneNo: 'string',
      authorizationCode: 'string',
      authorizationCredential: 'string',
      credentialType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataSocialincomeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  scoreResult?: string;
  // 收入评分
  rangeScore?: string;
  // 历史稳定性评估
  historyScore?: string;
  // 近期稳定性评估
  stabilityScore?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scoreResult: 'score_result',
      rangeScore: 'range_score',
      historyScore: 'history_score',
      stabilityScore: 'stability_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scoreResult: 'string',
      rangeScore: 'string',
      historyScore: 'string',
      stabilityScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPdataMarriageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId?: string;
  // 姓名
  name: string;
  // 身份证
  certNo: string;
  // 授权凭证
  authorizationCredential: string;
  // 授权编号(同一机构内唯一)
  authorizationNo: string;
  // 授权格式
  credentialType: string;
  // 授权有效期
  authorizationExpirationTime?: string;
  // 授权对象
  authorizationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      certNo: 'cert_no',
      authorizationCredential: 'authorization_credential',
      authorizationNo: 'authorization_no',
      credentialType: 'credential_type',
      authorizationExpirationTime: 'authorization_expiration_time',
      authorizationType: 'authorization_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      certNo: 'string',
      authorizationCredential: 'string',
      authorizationNo: 'string',
      credentialType: 'string',
      authorizationExpirationTime: 'string',
      authorizationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPdataMarriageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 婚姻状况查验结果
  checkResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkResult: 'check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId: string;
  // 姓名
  name?: string;
  // 身份证号
  certNo?: string;
  // 手机号
  phoneNo?: string;
  // 渠道编码
  channelCode: string;
  // 模型id
  modelId: string;
  // 授权编号
  authorizationCode?: string;
  // 授权凭证
  authorizationCredential?: string;
  // 凭证格式
  credentialType?: string;
  // 主键类型
  keyType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      certNo: 'cert_no',
      phoneNo: 'phone_no',
      channelCode: 'channel_code',
      modelId: 'model_id',
      authorizationCode: 'authorization_code',
      authorizationCredential: 'authorization_credential',
      credentialType: 'credential_type',
      keyType: 'key_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      certNo: 'string',
      phoneNo: 'string',
      channelCode: 'string',
      modelId: 'string',
      authorizationCode: 'string',
      authorizationCredential: 'string',
      credentialType: 'string',
      keyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  scoreResult?: string;
  // 风险评分
  score?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scoreResult: 'score_result',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scoreResult: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataUnderwriteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId?: string;
  // 加密后的入参数据（包括姓名和身份ID）
  encryptData?: string;
  // 省份行政区划代码list
  recommandProvinceList?: string[];
  // 授权编号
  authorizationNo?: string;
  // 授权凭证
  authorizationCredential?: string;
  // 凭证格式
  credentialType?: string;
  // 授权有效期
  authorizationExpirationTime?: string;
  // 授权对象
  authorizationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      encryptData: 'encrypt_data',
      recommandProvinceList: 'recommand_province_list',
      authorizationNo: 'authorization_no',
      authorizationCredential: 'authorization_credential',
      credentialType: 'credential_type',
      authorizationExpirationTime: 'authorization_expiration_time',
      authorizationType: 'authorization_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      encryptData: 'string',
      recommandProvinceList: { 'type': 'array', 'itemType': 'string' },
      authorizationNo: 'string',
      authorizationCredential: 'string',
      credentialType: 'string',
      authorizationExpirationTime: 'string',
      authorizationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdataUnderwriteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 姓名（md5）
  name?: string;
  // 身份证(md5)
  cardNo?: string;
  // 成功的请求省份行政区划代码
  successRecommandProvinceList?: string[];
  // 失败的请求省份行政区划代码
  failRecommandProvinceList?: string[];
  // 加密后的出参数据
  encryptData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      cardNo: 'card_no',
      successRecommandProvinceList: 'success_recommand_province_list',
      failRecommandProvinceList: 'fail_recommand_province_list',
      encryptData: 'encrypt_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      cardNo: 'string',
      successRecommandProvinceList: { 'type': 'array', 'itemType': 'string' },
      failRecommandProvinceList: { 'type': 'array', 'itemType': 'string' },
      encryptData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPortraiteconomyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // biz_id
  bizId: string;
  // cert_no
  certNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      certNo: 'cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      certNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPortraiteconomyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // score
  score?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
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
    if (Util.isUnset(config)) {
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
          sdk_version: "1.8.45",
          _prod_code: "TAX",
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
   * Description: 目前仅用于广州区块链发票开通企业信息推送
   * Summary: 区块链发票开通企业信息推送
   */
  async authCorp(request: AuthCorpRequest): Promise<AuthCorpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authCorpEx(request, headers, runtime);
  }

  /**
   * Description: 目前仅用于广州区块链发票开通企业信息推送
   * Summary: 区块链发票开通企业信息推送
   */
  async authCorpEx(request: AuthCorpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthCorpResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthCorpResponse>(await this.doRequest("1.0", "blockchain.tax.corp.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthCorpResponse({}));
  }

  /**
   * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
   * Summary: 计费推送
   */
  async pushCharge(request: PushChargeRequest): Promise<PushChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushChargeEx(request, headers, runtime);
  }

  /**
   * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
   * Summary: 计费推送
   */
  async pushChargeEx(request: PushChargeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushChargeResponse>(await this.doRequest("1.0", "blockchain.tax.charge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushChargeResponse({}));
  }

  /**
   * Description: 查询计收费授权情况
   * Summary: 查询计收费授权情况
   */
  async queryChargeAuth(request: QueryChargeAuthRequest): Promise<QueryChargeAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChargeAuthEx(request, headers, runtime);
  }

  /**
   * Description: 查询计收费授权情况
   * Summary: 查询计收费授权情况
   */
  async queryChargeAuthEx(request: QueryChargeAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChargeAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChargeAuthResponse>(await this.doRequest("1.0", "blockchain.tax.charge.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChargeAuthResponse({}));
  }

  /**
   * Description: 目前仅用于广州区块链发票信息推送
   * Summary:  区块链发票信息推送
   */
  async pushIcmInvoice(request: PushIcmInvoiceRequest): Promise<PushIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 目前仅用于广州区块链发票信息推送
   * Summary:  区块链发票信息推送
   */
  async pushIcmInvoiceEx(request: PushIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIcmInvoiceResponse({}));
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryIcmInvoice(request: QueryIcmInvoiceRequest): Promise<QueryIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryIcmInvoiceEx(request: QueryIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIcmInvoiceResponse({}));
  }

  /**
   * Description: 标准发票推送
   * Summary: 标准发票推送
   */
  async pushIcmInvoiceinfo(request: PushIcmInvoiceinfoRequest): Promise<PushIcmInvoiceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIcmInvoiceinfoEx(request, headers, runtime);
  }

  /**
   * Description: 标准发票推送
   * Summary: 标准发票推送
   */
  async pushIcmInvoiceinfoEx(request: PushIcmInvoiceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIcmInvoiceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIcmInvoiceinfoResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoiceinfo.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIcmInvoiceinfoResponse({}));
  }

  /**
   * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
   * Summary: 获取数据的上链信息描述
   */
  async describeIcmInvoice(request: DescribeIcmInvoiceRequest): Promise<DescribeIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
   * Summary: 获取数据的上链信息描述
   */
  async describeIcmInvoiceEx(request: DescribeIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeIcmInvoiceResponse({}));
  }

  /**
   * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
   * Summary: 区块链银行授权接口
   */
  async authIcmInvoice(request: AuthIcmInvoiceRequest): Promise<AuthIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
   * Summary: 区块链银行授权接口
   */
  async authIcmInvoiceEx(request: AuthIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthIcmInvoiceResponse({}));
  }

  /**
   * Description: 个人数据使用授权
   * Summary: 个人数据使用授权
   */
  async authIcmRealperson(request: AuthIcmRealpersonRequest): Promise<AuthIcmRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authIcmRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 个人数据使用授权
   * Summary: 个人数据使用授权
   */
  async authIcmRealpersonEx(request: AuthIcmRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthIcmRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthIcmRealpersonResponse>(await this.doRequest("1.0", "blockchain.tax.icm.realperson.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthIcmRealpersonResponse({}));
  }

  /**
   * Description: 采集，不限制同步 异步
   * Summary: 采集
   */
  async execIcmSyncgathering(request: ExecIcmSyncgatheringRequest): Promise<ExecIcmSyncgatheringResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execIcmSyncgatheringEx(request, headers, runtime);
  }

  /**
   * Description: 采集，不限制同步 异步
   * Summary: 采集
   */
  async execIcmSyncgatheringEx(request: ExecIcmSyncgatheringRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecIcmSyncgatheringResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecIcmSyncgatheringResponse>(await this.doRequest("1.0", "blockchain.tax.icm.syncgathering.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecIcmSyncgatheringResponse({}));
  }

  /**
   * Description: 获取授权模版和token
   * Summary: 获取授权模版和token
   */
  async queryApiAuthteplate(request: QueryApiAuthteplateRequest): Promise<QueryApiAuthteplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiAuthteplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取授权模版和token
   * Summary: 获取授权模版和token
   */
  async queryApiAuthteplateEx(request: QueryApiAuthteplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiAuthteplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiAuthteplateResponse>(await this.doRequest("1.0", "blockchain.tax.api.authteplate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiAuthteplateResponse({}));
  }

  /**
   * Description: 提交
   * Summary: 提交
   */
  async execApiAuthtemplate(request: ExecApiAuthtemplateRequest): Promise<ExecApiAuthtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execApiAuthtemplateEx(request, headers, runtime);
  }

  /**
   * Description: 提交
   * Summary: 提交
   */
  async execApiAuthtemplateEx(request: ExecApiAuthtemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecApiAuthtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecApiAuthtemplateResponse>(await this.doRequest("1.0", "blockchain.tax.api.authtemplate.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecApiAuthtemplateResponse({}));
  }

  /**
   * Description: 获取要素信息
   * Summary: 获取要素信息
   */
  async queryApiAuthtemplatedefine(request: QueryApiAuthtemplatedefineRequest): Promise<QueryApiAuthtemplatedefineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiAuthtemplatedefineEx(request, headers, runtime);
  }

  /**
   * Description: 获取要素信息
   * Summary: 获取要素信息
   */
  async queryApiAuthtemplatedefineEx(request: QueryApiAuthtemplatedefineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiAuthtemplatedefineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiAuthtemplatedefineResponse>(await this.doRequest("1.0", "blockchain.tax.api.authtemplatedefine.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiAuthtemplatedefineResponse({}));
  }

  /**
   * Description: 获取授权结果
   * Summary: 获取授权结果
   */
  async queryApiAuthtemplateresult(request: QueryApiAuthtemplateresultRequest): Promise<QueryApiAuthtemplateresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiAuthtemplateresultEx(request, headers, runtime);
  }

  /**
   * Description: 获取授权结果
   * Summary: 获取授权结果
   */
  async queryApiAuthtemplateresultEx(request: QueryApiAuthtemplateresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiAuthtemplateresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiAuthtemplateresultResponse>(await this.doRequest("1.0", "blockchain.tax.api.authtemplateresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiAuthtemplateresultResponse({}));
  }

  /**
   * Description: 授权接口
   * Summary: 授权
   */
  async authIcmEnterprise(request: AuthIcmEnterpriseRequest): Promise<AuthIcmEnterpriseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authIcmEnterpriseEx(request, headers, runtime);
  }

  /**
   * Description: 授权接口
   * Summary: 授权
   */
  async authIcmEnterpriseEx(request: AuthIcmEnterpriseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthIcmEnterpriseResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthIcmEnterpriseResponse>(await this.doRequest("1.0", "blockchain.tax.icm.enterprise.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthIcmEnterpriseResponse({}));
  }

  /**
   * Description: 该接口为支持授权链接的生成
   * Summary: 可信授权链接获取接口
   */
  async createApiAuthurl(request: CreateApiAuthurlRequest): Promise<CreateApiAuthurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiAuthurlEx(request, headers, runtime);
  }

  /**
   * Description: 该接口为支持授权链接的生成
   * Summary: 可信授权链接获取接口
   */
  async createApiAuthurlEx(request: CreateApiAuthurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiAuthurlResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiAuthurlResponse>(await this.doRequest("1.0", "blockchain.tax.api.authurl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiAuthurlResponse({}));
  }

  /**
   * Description: 极简授权-判断该企业是否支持要素授权
   * Summary: 极简授权-判断该企业是否支持要素授权
   */
  async matchIcmSimpleauth(request: MatchIcmSimpleauthRequest): Promise<MatchIcmSimpleauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchIcmSimpleauthEx(request, headers, runtime);
  }

  /**
   * Description: 极简授权-判断该企业是否支持要素授权
   * Summary: 极简授权-判断该企业是否支持要素授权
   */
  async matchIcmSimpleauthEx(request: MatchIcmSimpleauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchIcmSimpleauthResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchIcmSimpleauthResponse>(await this.doRequest("1.0", "blockchain.tax.icm.simpleauth.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchIcmSimpleauthResponse({}));
  }

  /**
   * Description: 极简授权-获取数据，用于获取指标类的数据
   * Summary: 极简授权-获取数据
   */
  async queryIcmSimpleauth(request: QueryIcmSimpleauthRequest): Promise<QueryIcmSimpleauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIcmSimpleauthEx(request, headers, runtime);
  }

  /**
   * Description: 极简授权-获取数据，用于获取指标类的数据
   * Summary: 极简授权-获取数据
   */
  async queryIcmSimpleauthEx(request: QueryIcmSimpleauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIcmSimpleauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIcmSimpleauthResponse>(await this.doRequest("1.0", "blockchain.tax.icm.simpleauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIcmSimpleauthResponse({}));
  }

  /**
   * Description: 极简授权异步查询接口
   * Summary: 极简授权-异步获取数据
   */
  async queryApiSimpleauthasync(request: QueryApiSimpleauthasyncRequest): Promise<QueryApiSimpleauthasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiSimpleauthasyncEx(request, headers, runtime);
  }

  /**
   * Description: 极简授权异步查询接口
   * Summary: 极简授权-异步获取数据
   */
  async queryApiSimpleauthasyncEx(request: QueryApiSimpleauthasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiSimpleauthasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiSimpleauthasyncResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthasync.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiSimpleauthasyncResponse({}));
  }

  /**
   * Description: 授权接口
   * Summary: 授权接口
   */
  async authRiskEvaluation(request: AuthRiskEvaluationRequest): Promise<AuthRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 授权接口
   * Summary: 授权接口
   */
  async authRiskEvaluationEx(request: AuthRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthRiskEvaluationResponse({}));
  }

  /**
   * Description: 查询
   * Summary: 查询
   */
  async queryRiskEvaluation(request: QueryRiskEvaluationRequest): Promise<QueryRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 查询
   * Summary: 查询
   */
  async queryRiskEvaluationEx(request: QueryRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskEvaluationResponse({}));
  }

  /**
   * Description: 极简授权-异步查询数据-轮询拉取结果
   * Summary: 极简授权-异步查询数据-轮询拉取结果
   */
  async pullApiSimpleauthasyncpolling(request: PullApiSimpleauthasyncpollingRequest): Promise<PullApiSimpleauthasyncpollingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullApiSimpleauthasyncpollingEx(request, headers, runtime);
  }

  /**
   * Description: 极简授权-异步查询数据-轮询拉取结果
   * Summary: 极简授权-异步查询数据-轮询拉取结果
   */
  async pullApiSimpleauthasyncpollingEx(request: PullApiSimpleauthasyncpollingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullApiSimpleauthasyncpollingResponse> {
    Util.validateModel(request);
    return $tea.cast<PullApiSimpleauthasyncpollingResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthasyncpolling.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullApiSimpleauthasyncpollingResponse({}));
  }

  /**
   * Description: 极简授权异步查询接口
   * Summary: 极简授权-异步获取数据
   */
  async queryApiSimpleauthstandard(request: QueryApiSimpleauthstandardRequest): Promise<QueryApiSimpleauthstandardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiSimpleauthstandardEx(request, headers, runtime);
  }

  /**
   * Description: 极简授权异步查询接口
   * Summary: 极简授权-异步获取数据
   */
  async queryApiSimpleauthstandardEx(request: QueryApiSimpleauthstandardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiSimpleauthstandardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiSimpleauthstandardResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthstandard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiSimpleauthstandardResponse({}));
  }

  /**
   * Description: 给对应的税号进行打标
   * Summary: 要素授权打标接口
   */
  async execApiSimpleauthmark(request: ExecApiSimpleauthmarkRequest): Promise<ExecApiSimpleauthmarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execApiSimpleauthmarkEx(request, headers, runtime);
  }

  /**
   * Description: 给对应的税号进行打标
   * Summary: 要素授权打标接口
   */
  async execApiSimpleauthmarkEx(request: ExecApiSimpleauthmarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecApiSimpleauthmarkResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecApiSimpleauthmarkResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecApiSimpleauthmarkResponse({}));
  }

  /**
   * Description: 提交打标结果，仅限内部使用
   * Summary: 提交打标结果
   */
  async submitApiSimpleauthmark(request: SubmitApiSimpleauthmarkRequest): Promise<SubmitApiSimpleauthmarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitApiSimpleauthmarkEx(request, headers, runtime);
  }

  /**
   * Description: 提交打标结果，仅限内部使用
   * Summary: 提交打标结果
   */
  async submitApiSimpleauthmarkEx(request: SubmitApiSimpleauthmarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitApiSimpleauthmarkResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitApiSimpleauthmarkResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitApiSimpleauthmarkResponse({}));
  }

  /**
   * Description: blockchain.tax.api.simpleauthmark.exec
   * Summary: 数据打标拉取接口
   */
  async pullApiSimpleauthmark(request: PullApiSimpleauthmarkRequest): Promise<PullApiSimpleauthmarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullApiSimpleauthmarkEx(request, headers, runtime);
  }

  /**
   * Description: blockchain.tax.api.simpleauthmark.exec
   * Summary: 数据打标拉取接口
   */
  async pullApiSimpleauthmarkEx(request: PullApiSimpleauthmarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullApiSimpleauthmarkResponse> {
    Util.validateModel(request);
    return $tea.cast<PullApiSimpleauthmarkResponse>(await this.doRequest("1.0", "blockchain.tax.api.simpleauthmark.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullApiSimpleauthmarkResponse({}));
  }

  /**
   * Description: 查询-同步返回提额数据
   * Summary: 查询-同步提额数据返回
   */
  async syncRiskEvaluation(request: SyncRiskEvaluationRequest): Promise<SyncRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 查询-同步返回提额数据
   * Summary: 查询-同步提额数据返回
   */
  async syncRiskEvaluationEx(request: SyncRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRiskEvaluationResponse({}));
  }

  /**
   * Description: 纳税人状态查询
   * Summary: 纳税人状态查询
   */
  async querySimpleauthIdentitystate(request: QuerySimpleauthIdentitystateRequest): Promise<QuerySimpleauthIdentitystateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySimpleauthIdentitystateEx(request, headers, runtime);
  }

  /**
   * Description: 纳税人状态查询
   * Summary: 纳税人状态查询
   */
  async querySimpleauthIdentitystateEx(request: QuerySimpleauthIdentitystateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySimpleauthIdentitystateResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySimpleauthIdentitystateResponse>(await this.doRequest("1.0", "blockchain.tax.simpleauth.identitystate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySimpleauthIdentitystateResponse({}));
  }

  /**
   * Description: 海关-异步查询数据
   * Summary: 海关-异步查询数据
   */
  async queryApiHaiguanasync(request: QueryApiHaiguanasyncRequest): Promise<QueryApiHaiguanasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiHaiguanasyncEx(request, headers, runtime);
  }

  /**
   * Description: 海关-异步查询数据
   * Summary: 海关-异步查询数据
   */
  async queryApiHaiguanasyncEx(request: QueryApiHaiguanasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiHaiguanasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiHaiguanasyncResponse>(await this.doRequest("1.0", "blockchain.tax.api.haiguanasync.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiHaiguanasyncResponse({}));
  }

  /**
   * Description: 海关-异步查询数据-轮询拉取数据
   * Summary: 海关-异步查询数据-轮询拉取数据
   */
  async pullApiHaiguanasyncpolling(request: PullApiHaiguanasyncpollingRequest): Promise<PullApiHaiguanasyncpollingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullApiHaiguanasyncpollingEx(request, headers, runtime);
  }

  /**
   * Description: 海关-异步查询数据-轮询拉取数据
   * Summary: 海关-异步查询数据-轮询拉取数据
   */
  async pullApiHaiguanasyncpollingEx(request: PullApiHaiguanasyncpollingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullApiHaiguanasyncpollingResponse> {
    Util.validateModel(request);
    return $tea.cast<PullApiHaiguanasyncpollingResponse>(await this.doRequest("1.0", "blockchain.tax.api.haiguanasyncpolling.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullApiHaiguanasyncpollingResponse({}));
  }

  /**
   * Description: 提额资质评估授权并查询,支持省级查询
   * Summary: 提额资质评估授权并查询
   */
  async startRiskEvaluation(request: StartRiskEvaluationRequest): Promise<StartRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 提额资质评估授权并查询,支持省级查询
   * Summary: 提额资质评估授权并查询
   */
  async startRiskEvaluationEx(request: StartRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRiskEvaluationResponse({}));
  }

  /**
   * Description: 电力异步接口
   * Summary: 电力异步接口
   */
  async queryEnterpriseElectronicasync(request: QueryEnterpriseElectronicasyncRequest): Promise<QueryEnterpriseElectronicasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseElectronicasyncEx(request, headers, runtime);
  }

  /**
   * Description: 电力异步接口
   * Summary: 电力异步接口
   */
  async queryEnterpriseElectronicasyncEx(request: QueryEnterpriseElectronicasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseElectronicasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseElectronicasyncResponse>(await this.doRequest("1.0", "blockchain.tax.enterprise.electronicasync.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseElectronicasyncResponse({}));
  }

  /**
   * Description: 查询指定账户的数据
   * Summary: 查询指定账户的数据
   */
  async queryApiDataprocess(request: QueryApiDataprocessRequest): Promise<QueryApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定账户的数据
   * Summary: 查询指定账户的数据
   */
  async queryApiDataprocessEx(request: QueryApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiDataprocessResponse({}));
  }

  /**
   * Description: 校验当前目标查询数据初始化接口
   * Summary: 校验当前目标查询数据初始化接口
   */
  async initApiDataprocess(request: InitApiDataprocessRequest): Promise<InitApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 校验当前目标查询数据初始化接口
   * Summary: 校验当前目标查询数据初始化接口
   */
  async initApiDataprocessEx(request: InitApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<InitApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitApiDataprocessResponse({}));
  }

  /**
   * Description: 数据流转目标客户是否可用接口
   * Summary: 数据流转目标客户是否可用接口
   */
  async judgeApiDataprocess(request: JudgeApiDataprocessRequest): Promise<JudgeApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 数据流转目标客户是否可用接口
   * Summary: 数据流转目标客户是否可用接口
   */
  async judgeApiDataprocessEx(request: JudgeApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeApiDataprocessResponse({}));
  }

  /**
   * Description: 初始化与查询合并统一执行接口
   * Summary: 初始化与查询合并统一执行接口
   */
  async execApiDataprocess(request: ExecApiDataprocessRequest): Promise<ExecApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 初始化与查询合并统一执行接口
   * Summary: 初始化与查询合并统一执行接口
   */
  async execApiDataprocessEx(request: ExecApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecApiDataprocessResponse({}));
  }

  /**
   * Description: 数据流转通用执行接口
   * Summary: 数据流转通用执行接口
   */
  async runApiDataprocess(request: RunApiDataprocessRequest): Promise<RunApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 数据流转通用执行接口
   * Summary: 数据流转通用执行接口
   */
  async runApiDataprocessEx(request: RunApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<RunApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunApiDataprocessResponse({}));
  }

  /**
   * Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
   * Summary: 区块链发票信息持续取数查询
   */
  async queryIcmInvoicecontinued(request: QueryIcmInvoicecontinuedRequest): Promise<QueryIcmInvoicecontinuedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIcmInvoicecontinuedEx(request, headers, runtime);
  }

  /**
   * Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
   * Summary: 区块链发票信息持续取数查询
   */
  async queryIcmInvoicecontinuedEx(request: QueryIcmInvoicecontinuedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIcmInvoicecontinuedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIcmInvoicecontinuedResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoicecontinued.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIcmInvoicecontinuedResponse({}));
  }

  /**
   * Description: 票税RPA授权埋点数据查询
   * Summary: 票税RPA授权埋点数据查询
   */
  async queryApiAuthweblog(request: QueryApiAuthweblogRequest): Promise<QueryApiAuthweblogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiAuthweblogEx(request, headers, runtime);
  }

  /**
   * Description: 票税RPA授权埋点数据查询
   * Summary: 票税RPA授权埋点数据查询
   */
  async queryApiAuthweblogEx(request: QueryApiAuthweblogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiAuthweblogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiAuthweblogResponse>(await this.doRequest("1.0", "blockchain.tax.api.authweblog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiAuthweblogResponse({}));
  }

  /**
   * Description: 收入评估服务A
  https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
   * Summary: 收入评估服务A
   */
  async queryPdataPersonalincome(request: QueryPdataPersonalincomeRequest): Promise<QueryPdataPersonalincomeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdataPersonalincomeEx(request, headers, runtime);
  }

  /**
   * Description: 收入评估服务A
  https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
   * Summary: 收入评估服务A
   */
  async queryPdataPersonalincomeEx(request: QueryPdataPersonalincomeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdataPersonalincomeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdataPersonalincomeResponse>(await this.doRequest("1.0", "blockchain.tax.pdata.personalincome.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdataPersonalincomeResponse({}));
  }

  /**
   * Description: 收入评估服务B
   * Summary: 收入评估服务B
   */
  async queryPdataSocialincome(request: QueryPdataSocialincomeRequest): Promise<QueryPdataSocialincomeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdataSocialincomeEx(request, headers, runtime);
  }

  /**
   * Description: 收入评估服务B
   * Summary: 收入评估服务B
   */
  async queryPdataSocialincomeEx(request: QueryPdataSocialincomeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdataSocialincomeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdataSocialincomeResponse>(await this.doRequest("1.0", "blockchain.tax.pdata.socialincome.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdataSocialincomeResponse({}));
  }

  /**
   * Description: 婚姻状况查验服务
  https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
   * Summary: 婚姻状况查验
   */
  async checkPdataMarriage(request: CheckPdataMarriageRequest): Promise<CheckPdataMarriageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPdataMarriageEx(request, headers, runtime);
  }

  /**
   * Description: 婚姻状况查验服务
  https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
   * Summary: 婚姻状况查验
   */
  async checkPdataMarriageEx(request: CheckPdataMarriageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPdataMarriageResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPdataMarriageResponse>(await this.doRequest("1.0", "blockchain.tax.pdata.marriage.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPdataMarriageResponse({}));
  }

  /**
   * Description: 断卡行动风险识别服务
   * Summary: 断卡行动风险识别服务
   */
  async queryPdataRisk(request: QueryPdataRiskRequest): Promise<QueryPdataRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdataRiskEx(request, headers, runtime);
  }

  /**
   * Description: 断卡行动风险识别服务
   * Summary: 断卡行动风险识别服务
   */
  async queryPdataRiskEx(request: QueryPdataRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdataRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdataRiskResponse>(await this.doRequest("1.0", "blockchain.tax.pdata.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdataRiskResponse({}));
  }

  /**
   * Description: 核保医疗查询
   * Summary: 核保医疗查询
   */
  async queryPdataUnderwrite(request: QueryPdataUnderwriteRequest): Promise<QueryPdataUnderwriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdataUnderwriteEx(request, headers, runtime);
  }

  /**
   * Description: 核保医疗查询
   * Summary: 核保医疗查询
   */
  async queryPdataUnderwriteEx(request: QueryPdataUnderwriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdataUnderwriteResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdataUnderwriteResponse>(await this.doRequest("1.0", "blockchain.tax.pdata.underwrite.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdataUnderwriteResponse({}));
  }

  /**
   * Description: 经济画像
   * Summary: 财富洞察经济画像
   */
  async queryPortraiteconomy(request: QueryPortraiteconomyRequest): Promise<QueryPortraiteconomyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPortraiteconomyEx(request, headers, runtime);
  }

  /**
   * Description: 经济画像
   * Summary: 财富洞察经济画像
   */
  async queryPortraiteconomyEx(request: QueryPortraiteconomyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPortraiteconomyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPortraiteconomyResponse>(await this.doRequest("1.0", "blockchain.tax.portraiteconomy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPortraiteconomyResponse({}));
  }

}
