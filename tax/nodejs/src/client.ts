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

// 地区请求
export class DistrictExtRequest extends $tea.Model {
  // 地区编码
  cityCode: string;
  static names(): { [key: string]: string } {
    return {
      cityCode: 'city_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityCode: 'string',
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
  // 短链接地址
  loginUrl?: string;
  // 蚂蚁生成的订单号，此次授权的唯一标识
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loginUrl: 'login_url',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loginUrl: 'string',
      orderNo: 'string',
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
          sdk_version: "1.6.2",
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
   * Description: 企业的授权接口
   * Summary: 企业授权
   */
  async authIcmEnterprise(request: AuthIcmEnterpriseRequest): Promise<AuthIcmEnterpriseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authIcmEnterpriseEx(request, headers, runtime);
  }

  /**
   * Description: 企业的授权接口
   * Summary: 企业授权
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

}
