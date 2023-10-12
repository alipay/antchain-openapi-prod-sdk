// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

/**
 * Model for initing client
 */
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	Socks5NetWork *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
	// 长链接最大空闲时长
	MaxIdleTimeMillis *int `json:"maxIdleTimeMillis,omitempty" xml:"maxIdleTimeMillis,omitempty"`
	// 长链接最大连接时长
	KeepAliveDurationMillis *int `json:"keepAliveDurationMillis,omitempty" xml:"keepAliveDurationMillis,omitempty"`
	// 最大连接数（长链接最大总数）
	MaxRequests *int `json:"maxRequests,omitempty" xml:"maxRequests,omitempty"`
	// 每个目标主机的最大连接数（分主机域名的长链接最大总数
	MaxRequestsPerHost *int `json:"maxRequestsPerHost,omitempty" xml:"maxRequestsPerHost,omitempty"`
}

func (s Config) String() string {
	return tea.Prettify(s)
}

func (s Config) GoString() string {
	return s.String()
}

func (s *Config) SetAccessKeyId(v string) *Config {
	s.AccessKeyId = &v
	return s
}

func (s *Config) SetAccessKeySecret(v string) *Config {
	s.AccessKeySecret = &v
	return s
}

func (s *Config) SetSecurityToken(v string) *Config {
	s.SecurityToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetReadTimeout(v int) *Config {
	s.ReadTimeout = &v
	return s
}

func (s *Config) SetConnectTimeout(v int) *Config {
	s.ConnectTimeout = &v
	return s
}

func (s *Config) SetHttpProxy(v string) *Config {
	s.HttpProxy = &v
	return s
}

func (s *Config) SetHttpsProxy(v string) *Config {
	s.HttpsProxy = &v
	return s
}

func (s *Config) SetEndpoint(v string) *Config {
	s.Endpoint = &v
	return s
}

func (s *Config) SetNoProxy(v string) *Config {
	s.NoProxy = &v
	return s
}

func (s *Config) SetMaxIdleConns(v int) *Config {
	s.MaxIdleConns = &v
	return s
}

func (s *Config) SetUserAgent(v string) *Config {
	s.UserAgent = &v
	return s
}

func (s *Config) SetSocks5Proxy(v string) *Config {
	s.Socks5Proxy = &v
	return s
}

func (s *Config) SetSocks5NetWork(v string) *Config {
	s.Socks5NetWork = &v
	return s
}

func (s *Config) SetMaxIdleTimeMillis(v int) *Config {
	s.MaxIdleTimeMillis = &v
	return s
}

func (s *Config) SetKeepAliveDurationMillis(v int) *Config {
	s.KeepAliveDurationMillis = &v
	return s
}

func (s *Config) SetMaxRequests(v int) *Config {
	s.MaxRequests = &v
	return s
}

func (s *Config) SetMaxRequestsPerHost(v int) *Config {
	s.MaxRequestsPerHost = &v
	return s
}

// 规则
type Rule struct {
	// 字段值的类型，常见有 string | number| boolean | _array_
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
	Len *int64 `json:"len,omitempty" xml:"len,omitempty" require:"true"`
	// type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
	Max *int64 `json:"max,omitempty" xml:"max,omitempty" require:"true"`
	// type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
	Min *int64 `json:"min,omitempty" xml:"min,omitempty" require:"true"`
	// 校验出错时显示的错误消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 正则表达式,
	RegPattern *string `json:"reg_pattern,omitempty" xml:"reg_pattern,omitempty" require:"true"`
}

func (s Rule) String() string {
	return tea.Prettify(s)
}

func (s Rule) GoString() string {
	return s.String()
}

func (s *Rule) SetType(v string) *Rule {
	s.Type = &v
	return s
}

func (s *Rule) SetLen(v int64) *Rule {
	s.Len = &v
	return s
}

func (s *Rule) SetMax(v int64) *Rule {
	s.Max = &v
	return s
}

func (s *Rule) SetMin(v int64) *Rule {
	s.Min = &v
	return s
}

func (s *Rule) SetMessage(v string) *Rule {
	s.Message = &v
	return s
}

func (s *Rule) SetRequired(v bool) *Rule {
	s.Required = &v
	return s
}

func (s *Rule) SetRegPattern(v string) *Rule {
	s.RegPattern = &v
	return s
}

// 忘记密码
type ForgetMeta struct {
	// 字段名称
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 忘记密码的链接地址，供重置用
	Link *string `json:"link,omitempty" xml:"link,omitempty" require:"true"`
}

func (s ForgetMeta) String() string {
	return tea.Prettify(s)
}

func (s ForgetMeta) GoString() string {
	return s.String()
}

func (s *ForgetMeta) SetLabel(v string) *ForgetMeta {
	s.Label = &v
	return s
}

func (s *ForgetMeta) SetLink(v string) *ForgetMeta {
	s.Link = &v
	return s
}

// 逻辑
type Logic struct {
	// 操作符
	//  equal = _equal_, // 相等比较
	//   notEqual = _notEqual_, // 不相等比较
	//   AND = _AND_, // 与逻辑
	//   OR = _OR_, // 或逻辑
	Op *string `json:"op,omitempty" xml:"op,omitempty" require:"true"`
	//  只有 op 是 AND 或者 OR 才是可选，其他情况为必选
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
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
	Children *string `json:"children,omitempty" xml:"children,omitempty" require:"true"`
}

func (s Logic) String() string {
	return tea.Prettify(s)
}

func (s Logic) GoString() string {
	return s.String()
}

func (s *Logic) SetOp(v string) *Logic {
	s.Op = &v
	return s
}

func (s *Logic) SetKey(v string) *Logic {
	s.Key = &v
	return s
}

func (s *Logic) SetValue(v string) *Logic {
	s.Value = &v
	return s
}

func (s *Logic) SetChildren(v string) *Logic {
	s.Children = &v
	return s
}

// 选择组件
type SelectOption struct {
	// 选项名称
	Lable *string `json:"lable,omitempty" xml:"lable,omitempty" require:"true"`
	// 选项的值，一般是 id 之类的唯一标识符，给后端传这个
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s SelectOption) String() string {
	return tea.Prettify(s)
}

func (s SelectOption) GoString() string {
	return s.String()
}

func (s *SelectOption) SetLable(v string) *SelectOption {
	s.Lable = &v
	return s
}

func (s *SelectOption) SetValue(v string) *SelectOption {
	s.Value = &v
	return s
}

// 组件
type Key struct {
	// 名称（key的中文名称）
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// input, // 普通输入框
	// dropdownSelect, // 下拉选择
	// cardSelect, // 平铺选择
	// password, // 密码输入框，这个类型会包含忘记密码按钮
	// smsCode, // 手机验证码
	// qrcodeLogin, // 二维码登录
	// hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 字段名称 例如：密码
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 输入框的值类型，字符串还是数字，默认 string/number/paassword
	InputType *string `json:"input_type,omitempty" xml:"input_type,omitempty" require:"true"`
	// 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
	InitialValue *string `json:"initial_value,omitempty" xml:"initial_value,omitempty" require:"true"`
	// 占位符，比如”请输入密码“
	Placeholder *string `json:"placeholder,omitempty" xml:"placeholder,omitempty" require:"true"`
	// 是否为禁用状态，true 表示禁用，默认 false
	Disabled *bool `json:"disabled,omitempty" xml:"disabled,omitempty" require:"true"`
	// 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
	ReadOnly *string `json:"read_only,omitempty" xml:"read_only,omitempty" require:"true"`
	// 这个字段的提示说明文案
	Tooltip *string `json:"tooltip,omitempty" xml:"tooltip,omitempty" require:"true"`
	// 校验规则
	Rules []*Rule `json:"rules,omitempty" xml:"rules,omitempty" require:"true" type:"Repeated"`
	// 逻辑列表
	Logics []*Logic `json:"logics,omitempty" xml:"logics,omitempty" require:"true" type:"Repeated"`
	// 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
	SelectOptions []*SelectOption `json:"select_options,omitempty" xml:"select_options,omitempty" require:"true" type:"Repeated"`
	// 忘记密码元素
	ForgetMeta *ForgetMeta `json:"forget_meta,omitempty" xml:"forget_meta,omitempty" require:"true"`
}

func (s Key) String() string {
	return tea.Prettify(s)
}

func (s Key) GoString() string {
	return s.String()
}

func (s *Key) SetKey(v string) *Key {
	s.Key = &v
	return s
}

func (s *Key) SetId(v string) *Key {
	s.Id = &v
	return s
}

func (s *Key) SetType(v string) *Key {
	s.Type = &v
	return s
}

func (s *Key) SetLabel(v string) *Key {
	s.Label = &v
	return s
}

func (s *Key) SetInputType(v string) *Key {
	s.InputType = &v
	return s
}

func (s *Key) SetInitialValue(v string) *Key {
	s.InitialValue = &v
	return s
}

func (s *Key) SetPlaceholder(v string) *Key {
	s.Placeholder = &v
	return s
}

func (s *Key) SetDisabled(v bool) *Key {
	s.Disabled = &v
	return s
}

func (s *Key) SetReadOnly(v string) *Key {
	s.ReadOnly = &v
	return s
}

func (s *Key) SetTooltip(v string) *Key {
	s.Tooltip = &v
	return s
}

func (s *Key) SetRules(v []*Rule) *Key {
	s.Rules = v
	return s
}

func (s *Key) SetLogics(v []*Logic) *Key {
	s.Logics = v
	return s
}

func (s *Key) SetSelectOptions(v []*SelectOption) *Key {
	s.SelectOptions = v
	return s
}

func (s *Key) SetForgetMeta(v *ForgetMeta) *Key {
	s.ForgetMeta = v
	return s
}

// 授权文件信息
type AgreementFile struct {
	// 授权文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 授权文件内容
	FileContentBase64String *string `json:"file_content_base64_string,omitempty" xml:"file_content_base64_string,omitempty" require:"true"`
}

func (s AgreementFile) String() string {
	return tea.Prettify(s)
}

func (s AgreementFile) GoString() string {
	return s.String()
}

func (s *AgreementFile) SetFileName(v string) *AgreementFile {
	s.FileName = &v
	return s
}

func (s *AgreementFile) SetFileContentBase64String(v string) *AgreementFile {
	s.FileContentBase64String = &v
	return s
}

// 配对
type Pair struct {
	// left
	Left *string `json:"left,omitempty" xml:"left,omitempty" require:"true"`
	// right
	Right *Key `json:"right,omitempty" xml:"right,omitempty" require:"true"`
}

func (s Pair) String() string {
	return tea.Prettify(s)
}

func (s Pair) GoString() string {
	return s.String()
}

func (s *Pair) SetLeft(v string) *Pair {
	s.Left = &v
	return s
}

func (s *Pair) SetRight(v *Key) *Pair {
	s.Right = v
	return s
}

// card
type Card struct {
	// 名称（该页面的名称，可能做展示用）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
	TabShowName *string `json:"tab_show_name,omitempty" xml:"tab_show_name,omitempty" require:"true"`
	// 当前模版所有需要填充元素
	KeyValues *Pair `json:"key_values,omitempty" xml:"key_values,omitempty" require:"true"`
	// true：是，false：不是
	// 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
	IsSelected *string `json:"is_selected,omitempty" xml:"is_selected,omitempty" require:"true"`
	// 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/
	ReturnValueKey []*string `json:"return_value_key,omitempty" xml:"return_value_key,omitempty" require:"true" type:"Repeated"`
}

func (s Card) String() string {
	return tea.Prettify(s)
}

func (s Card) GoString() string {
	return s.String()
}

func (s *Card) SetName(v string) *Card {
	s.Name = &v
	return s
}

func (s *Card) SetTabShowName(v string) *Card {
	s.TabShowName = &v
	return s
}

func (s *Card) SetKeyValues(v *Pair) *Card {
	s.KeyValues = v
	return s
}

func (s *Card) SetIsSelected(v string) *Card {
	s.IsSelected = &v
	return s
}

func (s *Card) SetReturnValueKey(v []*string) *Card {
	s.ReturnValueKey = v
	return s
}

// 地区请求
type DistrictExtRequest struct {
	// 地区编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
}

func (s DistrictExtRequest) String() string {
	return tea.Prettify(s)
}

func (s DistrictExtRequest) GoString() string {
	return s.String()
}

func (s *DistrictExtRequest) SetCityCode(v string) *DistrictExtRequest {
	s.CityCode = &v
	return s
}

// 通用同步授权扩展字段
type AgreementExtRequest struct {
	// 证书类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 是否盖章，true：是 false：否
	IsSeal *string `json:"is_seal,omitempty" xml:"is_seal,omitempty" require:"true"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 授权文件信息
	AgreementFile *AgreementFile `json:"agreement_file,omitempty" xml:"agreement_file,omitempty"`
}

func (s AgreementExtRequest) String() string {
	return tea.Prettify(s)
}

func (s AgreementExtRequest) GoString() string {
	return s.String()
}

func (s *AgreementExtRequest) SetType(v string) *AgreementExtRequest {
	s.Type = &v
	return s
}

func (s *AgreementExtRequest) SetIsSeal(v string) *AgreementExtRequest {
	s.IsSeal = &v
	return s
}

func (s *AgreementExtRequest) SetAddress(v string) *AgreementExtRequest {
	s.Address = &v
	return s
}

func (s *AgreementExtRequest) SetAgreementFile(v *AgreementFile) *AgreementExtRequest {
	s.AgreementFile = v
	return s
}

// 地区
type RiskEvaluationDistrictExtRequest struct {
	// 地区编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
}

func (s RiskEvaluationDistrictExtRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationDistrictExtRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationDistrictExtRequest) SetCityCode(v string) *RiskEvaluationDistrictExtRequest {
	s.CityCode = &v
	return s
}

// 授权扩展信息
type StandardAuthExtendInfoRequest struct {
	// 协议列表
	AgreementList []*AgreementExtRequest `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" require:"true" type:"Repeated"`
	// 地区请求
	DistrictextRequest *DistrictExtRequest `json:"districtext_request,omitempty" xml:"districtext_request,omitempty" require:"true"`
}

func (s StandardAuthExtendInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s StandardAuthExtendInfoRequest) GoString() string {
	return s.String()
}

func (s *StandardAuthExtendInfoRequest) SetAgreementList(v []*AgreementExtRequest) *StandardAuthExtendInfoRequest {
	s.AgreementList = v
	return s
}

func (s *StandardAuthExtendInfoRequest) SetDistrictextRequest(v *DistrictExtRequest) *StandardAuthExtendInfoRequest {
	s.DistrictextRequest = v
	return s
}

// 树节点
type TreeNode struct {
	// 节点id，按树的前序排列
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 父节点id，不存在为null
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty" require:"true"`
	// 深度
	Depth *int64 `json:"depth,omitempty" xml:"depth,omitempty" require:"true"`
	// 是否叶子结点
	IsLeefNode *string `json:"is_leef_node,omitempty" xml:"is_leef_node,omitempty" require:"true"`
	// 模版
	Card *Card `json:"card,omitempty" xml:"card,omitempty" require:"true"`
}

func (s TreeNode) String() string {
	return tea.Prettify(s)
}

func (s TreeNode) GoString() string {
	return s.String()
}

func (s *TreeNode) SetId(v int64) *TreeNode {
	s.Id = &v
	return s
}

func (s *TreeNode) SetParentNodeId(v string) *TreeNode {
	s.ParentNodeId = &v
	return s
}

func (s *TreeNode) SetDepth(v int64) *TreeNode {
	s.Depth = &v
	return s
}

func (s *TreeNode) SetIsLeefNode(v string) *TreeNode {
	s.IsLeefNode = &v
	return s
}

func (s *TreeNode) SetCard(v *Card) *TreeNode {
	s.Card = v
	return s
}

// 协议扩展
type RiskEvaluationAgreementExtRequest struct {
	// URL：文件地址
	// CONTENT:Base64的文件流
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 文件类型
	// PDF
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// type为url是传入文件地址
	// type为CONTENT时传入Base64文件内容编码
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s RiskEvaluationAgreementExtRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationAgreementExtRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationAgreementExtRequest) SetType(v string) *RiskEvaluationAgreementExtRequest {
	s.Type = &v
	return s
}

func (s *RiskEvaluationAgreementExtRequest) SetFileType(v string) *RiskEvaluationAgreementExtRequest {
	s.FileType = &v
	return s
}

func (s *RiskEvaluationAgreementExtRequest) SetContent(v string) *RiskEvaluationAgreementExtRequest {
	s.Content = &v
	return s
}

// 发票明细
type InvoiceItem struct {
	// 税收分类编码
	Spbm *string `json:"spbm,omitempty" xml:"spbm,omitempty" require:"true"`
	// 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
	Mc *string `json:"mc,omitempty" xml:"mc,omitempty" require:"true"`
	// 单位
	Jldw *string `json:"jldw,omitempty" xml:"jldw,omitempty"`
	// 数量
	Shul *string `json:"shul,omitempty" xml:"shul,omitempty"`
	// 含税金额,2位小数
	Je *string `json:"je,omitempty" xml:"je,omitempty" require:"true"`
	// 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
	Sl *string `json:"sl,omitempty" xml:"sl,omitempty"`
	// 税额,当fplx!=51or53时，必填
	Se *string `json:"se,omitempty" xml:"se,omitempty"`
	// 明细序号,从1开始递增
	Mxxh *string `json:"mxxh,omitempty" xml:"mxxh,omitempty" require:"true"`
	// 单价
	Dj *string `json:"dj,omitempty" xml:"dj,omitempty" require:"true"`
	// 规格型号
	Ggxh *string `json:"ggxh,omitempty" xml:"ggxh,omitempty"`
}

func (s InvoiceItem) String() string {
	return tea.Prettify(s)
}

func (s InvoiceItem) GoString() string {
	return s.String()
}

func (s *InvoiceItem) SetSpbm(v string) *InvoiceItem {
	s.Spbm = &v
	return s
}

func (s *InvoiceItem) SetMc(v string) *InvoiceItem {
	s.Mc = &v
	return s
}

func (s *InvoiceItem) SetJldw(v string) *InvoiceItem {
	s.Jldw = &v
	return s
}

func (s *InvoiceItem) SetShul(v string) *InvoiceItem {
	s.Shul = &v
	return s
}

func (s *InvoiceItem) SetJe(v string) *InvoiceItem {
	s.Je = &v
	return s
}

func (s *InvoiceItem) SetSl(v string) *InvoiceItem {
	s.Sl = &v
	return s
}

func (s *InvoiceItem) SetSe(v string) *InvoiceItem {
	s.Se = &v
	return s
}

func (s *InvoiceItem) SetMxxh(v string) *InvoiceItem {
	s.Mxxh = &v
	return s
}

func (s *InvoiceItem) SetDj(v string) *InvoiceItem {
	s.Dj = &v
	return s
}

func (s *InvoiceItem) SetGgxh(v string) *InvoiceItem {
	s.Ggxh = &v
	return s
}

// 税号信息
type IdentityInfo struct {
	// 需要打标的税号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权编号
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
}

func (s IdentityInfo) String() string {
	return tea.Prettify(s)
}

func (s IdentityInfo) GoString() string {
	return s.String()
}

func (s *IdentityInfo) SetIdentityId(v string) *IdentityInfo {
	s.IdentityId = &v
	return s
}

func (s *IdentityInfo) SetAuthCode(v string) *IdentityInfo {
	s.AuthCode = &v
	return s
}

// 婚姻状况查验服务结果对象
type MarriageCheckEvaluationFacade struct {
	// 婚姻状况查验结果
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty" require:"true"`
}

func (s MarriageCheckEvaluationFacade) String() string {
	return tea.Prettify(s)
}

func (s MarriageCheckEvaluationFacade) GoString() string {
	return s.String()
}

func (s *MarriageCheckEvaluationFacade) SetCheckResult(v string) *MarriageCheckEvaluationFacade {
	s.CheckResult = &v
	return s
}

// 税号批次清单
type IdentityIdGroup struct {
	// 44-20230810-9-channel
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 打标数据返回的url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 请求id，用于幂等控制
	BizUniqueId *string `json:"biz_unique_id,omitempty" xml:"biz_unique_id,omitempty" require:"true"`
}

func (s IdentityIdGroup) String() string {
	return tea.Prettify(s)
}

func (s IdentityIdGroup) GoString() string {
	return s.String()
}

func (s *IdentityIdGroup) SetGroupId(v string) *IdentityIdGroup {
	s.GroupId = &v
	return s
}

func (s *IdentityIdGroup) SetFileUrl(v string) *IdentityIdGroup {
	s.FileUrl = &v
	return s
}

func (s *IdentityIdGroup) SetBizUniqueId(v string) *IdentityIdGroup {
	s.BizUniqueId = &v
	return s
}

// 返回详情
type ReturnDetail struct {
	// 结果对象内容
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 返回形式
	ReturnType *string `json:"return_type,omitempty" xml:"return_type,omitempty" require:"true"`
	// 文件列表
	FileUrls []*string `json:"file_urls,omitempty" xml:"file_urls,omitempty" require:"true" type:"Repeated"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 加密模式
	EncryptModel *string `json:"encrypt_model,omitempty" xml:"encrypt_model,omitempty" require:"true"`
	// 密钥信封
	SecretEnvelope *string `json:"secret_envelope,omitempty" xml:"secret_envelope,omitempty" require:"true"`
}

func (s ReturnDetail) String() string {
	return tea.Prettify(s)
}

func (s ReturnDetail) GoString() string {
	return s.String()
}

func (s *ReturnDetail) SetBizContent(v string) *ReturnDetail {
	s.BizContent = &v
	return s
}

func (s *ReturnDetail) SetReturnType(v string) *ReturnDetail {
	s.ReturnType = &v
	return s
}

func (s *ReturnDetail) SetFileUrls(v []*string) *ReturnDetail {
	s.FileUrls = v
	return s
}

func (s *ReturnDetail) SetFileType(v string) *ReturnDetail {
	s.FileType = &v
	return s
}

func (s *ReturnDetail) SetEncryptModel(v string) *ReturnDetail {
	s.EncryptModel = &v
	return s
}

func (s *ReturnDetail) SetSecretEnvelope(v string) *ReturnDetail {
	s.SecretEnvelope = &v
	return s
}

// TreeTemplate
type TreeTemplate struct {
	// 树节点
	TreeNode *TreeNode `json:"tree_node,omitempty" xml:"tree_node,omitempty" require:"true"`
	// Id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 向上兼容的最小版本号
	CompatibleMinVersion *string `json:"compatible_min_version,omitempty" xml:"compatible_min_version,omitempty" require:"true"`
}

func (s TreeTemplate) String() string {
	return tea.Prettify(s)
}

func (s TreeTemplate) GoString() string {
	return s.String()
}

func (s *TreeTemplate) SetTreeNode(v *TreeNode) *TreeTemplate {
	s.TreeNode = v
	return s
}

func (s *TreeTemplate) SetId(v string) *TreeTemplate {
	s.Id = &v
	return s
}

func (s *TreeTemplate) SetVersion(v string) *TreeTemplate {
	s.Version = &v
	return s
}

func (s *TreeTemplate) SetCompatibleMinVersion(v string) *TreeTemplate {
	s.CompatibleMinVersion = &v
	return s
}

// 通用base授权
type BaseAuthRequest struct {
	// 租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// xdsadsfsdf
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 扩展信息
	ExtendInfo *StandardAuthExtendInfoRequest `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
}

func (s BaseAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s BaseAuthRequest) GoString() string {
	return s.String()
}

func (s *BaseAuthRequest) SetInstCode(v string) *BaseAuthRequest {
	s.InstCode = &v
	return s
}

func (s *BaseAuthRequest) SetAuthType(v string) *BaseAuthRequest {
	s.AuthType = &v
	return s
}

func (s *BaseAuthRequest) SetOrderNo(v string) *BaseAuthRequest {
	s.OrderNo = &v
	return s
}

func (s *BaseAuthRequest) SetExtendInfo(v *StandardAuthExtendInfoRequest) *BaseAuthRequest {
	s.ExtendInfo = v
	return s
}

// 纳税人状态
type IndentityState struct {
	// 纳税人识别号
	Nsrshb *string `json:"nsrshb,omitempty" xml:"nsrshb,omitempty" require:"true"`
	// 纳税人名称
	Nsrmc *string `json:"nsrmc,omitempty" xml:"nsrmc,omitempty" require:"true"`
	// 税务机构名称
	Swjgmc *string `json:"swjgmc,omitempty" xml:"swjgmc,omitempty" require:"true"`
	// 纳税人识别号状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 查询时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
}

func (s IndentityState) String() string {
	return tea.Prettify(s)
}

func (s IndentityState) GoString() string {
	return s.String()
}

func (s *IndentityState) SetNsrshb(v string) *IndentityState {
	s.Nsrshb = &v
	return s
}

func (s *IndentityState) SetNsrmc(v string) *IndentityState {
	s.Nsrmc = &v
	return s
}

func (s *IndentityState) SetSwjgmc(v string) *IndentityState {
	s.Swjgmc = &v
	return s
}

func (s *IndentityState) SetState(v string) *IndentityState {
	s.State = &v
	return s
}

func (s *IndentityState) SetTime(v string) *IndentityState {
	s.Time = &v
	return s
}

// 个人授权
type StandardRealPersonAuthRequest struct {
	// 个人证件号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 名字
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty" require:"true"`
}

func (s StandardRealPersonAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s StandardRealPersonAuthRequest) GoString() string {
	return s.String()
}

func (s *StandardRealPersonAuthRequest) SetIdentityId(v string) *StandardRealPersonAuthRequest {
	s.IdentityId = &v
	return s
}

func (s *StandardRealPersonAuthRequest) SetIdentityName(v string) *StandardRealPersonAuthRequest {
	s.IdentityName = &v
	return s
}

// 收入评估服务B结果对象
type SocialIncomeEvaluationFacade struct {
	// 查询结果
	ScoreResult *string `json:"score_result,omitempty" xml:"score_result,omitempty" require:"true"`
	// 收入评分
	RangeScore *string `json:"range_score,omitempty" xml:"range_score,omitempty"`
	// 历史稳定性评估
	HistoryScore *string `json:"history_score,omitempty" xml:"history_score,omitempty"`
	// 近期稳定性评估
	StabilityScore *string `json:"stability_score,omitempty" xml:"stability_score,omitempty"`
}

func (s SocialIncomeEvaluationFacade) String() string {
	return tea.Prettify(s)
}

func (s SocialIncomeEvaluationFacade) GoString() string {
	return s.String()
}

func (s *SocialIncomeEvaluationFacade) SetScoreResult(v string) *SocialIncomeEvaluationFacade {
	s.ScoreResult = &v
	return s
}

func (s *SocialIncomeEvaluationFacade) SetRangeScore(v string) *SocialIncomeEvaluationFacade {
	s.RangeScore = &v
	return s
}

func (s *SocialIncomeEvaluationFacade) SetHistoryScore(v string) *SocialIncomeEvaluationFacade {
	s.HistoryScore = &v
	return s
}

func (s *SocialIncomeEvaluationFacade) SetStabilityScore(v string) *SocialIncomeEvaluationFacade {
	s.StabilityScore = &v
	return s
}

// 收入评估服务A结果
type PersonalIncomeEvaluationFacade struct {
	// 查询结果
	ScoreResult *string `json:"score_result,omitempty" xml:"score_result,omitempty" require:"true"`
	// 收入评分
	IncomeScore *string `json:"income_score,omitempty" xml:"income_score,omitempty"`
}

func (s PersonalIncomeEvaluationFacade) String() string {
	return tea.Prettify(s)
}

func (s PersonalIncomeEvaluationFacade) GoString() string {
	return s.String()
}

func (s *PersonalIncomeEvaluationFacade) SetScoreResult(v string) *PersonalIncomeEvaluationFacade {
	s.ScoreResult = &v
	return s
}

func (s *PersonalIncomeEvaluationFacade) SetIncomeScore(v string) *PersonalIncomeEvaluationFacade {
	s.IncomeScore = &v
	return s
}

// 二维码
type QrCodeValue struct {
	// 二维码链接
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty" require:"true"`
	// 二维码描述信息。例如：请使用 xxx app 扫码登录
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 二维码在多长时间后失效，单位：秒
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QrCodeValue) String() string {
	return tea.Prettify(s)
}

func (s QrCodeValue) GoString() string {
	return s.String()
}

func (s *QrCodeValue) SetQrCodeUrl(v string) *QrCodeValue {
	s.QrCodeUrl = &v
	return s
}

func (s *QrCodeValue) SetDesc(v string) *QrCodeValue {
	s.Desc = &v
	return s
}

func (s *QrCodeValue) SetTimeout(v int64) *QrCodeValue {
	s.Timeout = &v
	return s
}

// 扩展信息
type RiskEvaluationExtendInfoRequest struct {
	// 协议集合
	AgreementList []*RiskEvaluationAgreementExtRequest `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" require:"true" type:"Repeated"`
	// 地区请求
	DistrictExt *RiskEvaluationDistrictExtRequest `json:"district_ext,omitempty" xml:"district_ext,omitempty" require:"true"`
}

func (s RiskEvaluationExtendInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s RiskEvaluationExtendInfoRequest) GoString() string {
	return s.String()
}

func (s *RiskEvaluationExtendInfoRequest) SetAgreementList(v []*RiskEvaluationAgreementExtRequest) *RiskEvaluationExtendInfoRequest {
	s.AgreementList = v
	return s
}

func (s *RiskEvaluationExtendInfoRequest) SetDistrictExt(v *RiskEvaluationDistrictExtRequest) *RiskEvaluationExtendInfoRequest {
	s.DistrictExt = v
	return s
}

// 发票标准模型
type Invoice struct {
	// 备注
	Bz *string `json:"bz,omitempty" xml:"bz,omitempty"`
	// 复核人
	Fhr *string `json:"fhr,omitempty" xml:"fhr,omitempty"`
	// 发票代码, 发票代码+发票号码唯一
	Fpdm *string `json:"fpdm,omitempty" xml:"fpdm,omitempty" require:"true"`
	// 发票号码,发票代码+发票号码唯一
	Fphm *string `json:"fphm,omitempty" xml:"fphm,omitempty" require:"true"`
	// 发票类型代码,
	// 默认填:20:广东电子普通发票
	// 01：增值税专用发票
	// 04：增值税普通发票
	// 10：增值税电子普通发票
	// 51：重庆通用机打一联发票76
	// 53：重庆通用机打三联发票210
	// 90：重庆通用机打三联发票190
	Fplx *string `json:"fplx,omitempty" xml:"fplx,omitempty" require:"true"`
	// 发票明细集合
	Fpxxmxs []*InvoiceItem `json:"fpxxmxs,omitempty" xml:"fpxxmxs,omitempty" type:"Repeated"`
	// 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
	Fpztdm *string `json:"fpztdm,omitempty" xml:"fpztdm,omitempty" require:"true"`
	// 购买方地址、电话
	Gfdzdh *string `json:"gfdzdh,omitempty" xml:"gfdzdh,omitempty"`
	// 购买方名称
	Gfmc *string `json:"gfmc,omitempty" xml:"gfmc,omitempty" require:"true"`
	// 购买方纳税人识别号
	Gfsh *string `json:"gfsh,omitempty" xml:"gfsh,omitempty"`
	// 购买方银行账号
	Gfyhzh *string `json:"gfyhzh,omitempty" xml:"gfyhzh,omitempty"`
	// 购买方类型,1企业 2个人 3其他
	Gmflx *string `json:"gmflx,omitempty" xml:"gmflx,omitempty"`
	// 金额
	Je *string `json:"je,omitempty" xml:"je,omitempty" require:"true"`
	// 价税合计	， 单位：元（2 位小数）
	Jshj *string `json:"jshj,omitempty" xml:"jshj,omitempty" require:"true"`
	// 开票类型,0-蓝字发票；1-红字发票；
	Kplx *string `json:"kplx,omitempty" xml:"kplx,omitempty" require:"true"`
	// 开票人
	Kpr *string `json:"kpr,omitempty" xml:"kpr,omitempty" require:"true"`
	// 开票日期
	Kprq *string `json:"kprq,omitempty" xml:"kprq,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 清单标志,00:无清单 01:有清单
	Qdbz *string `json:"qdbz,omitempty" xml:"qdbz,omitempty"`
	// 认证状态
	Rzdklbdjgdm *string `json:"rzdklbdjgdm,omitempty" xml:"rzdklbdjgdm,omitempty"`
	// 认证日期
	Rzdklbdrq *string `json:"rzdklbdrq,omitempty" xml:"rzdklbdrq,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
	Se *string `json:"se,omitempty" xml:"se,omitempty"`
	// 收款人
	Skr *string `json:"skr,omitempty" xml:"skr,omitempty"`
	// 税率标识,0不含税税率；1含税税率
	Slbz *string `json:"slbz,omitempty" xml:"slbz,omitempty" require:"true"`
	// 所属税务机关代码:
	// 山东省343
	// 重庆市350
	// 广东省347
	Ssdq *string `json:"ssdq,omitempty" xml:"ssdq,omitempty" require:"true"`
	// 销售方地址、电话
	Xfdzdh *string `json:"xfdzdh,omitempty" xml:"xfdzdh,omitempty"`
	// 销售方名称
	Xfmc *string `json:"xfmc,omitempty" xml:"xfmc,omitempty" require:"true"`
	// 销售方纳税人识别号
	Xfsh *string `json:"xfsh,omitempty" xml:"xfsh,omitempty" require:"true"`
	// 销售方银行账号
	Xfyhzh *string `json:"xfyhzh,omitempty" xml:"xfyhzh,omitempty"`
	// 原发票代码, kplx开票类型为1时必填
	Yfpdm *string `json:"yfpdm,omitempty" xml:"yfpdm,omitempty"`
	// 原发票号码,kplx开票类型为1时必填
	Yfphm *string `json:"yfphm,omitempty" xml:"yfphm,omitempty"`
	// 作废标志,0:未作废，1作废
	Zfbz *string `json:"zfbz,omitempty" xml:"zfbz,omitempty" require:"true"`
	// 作废时间
	Zfsj *string `json:"zfsj,omitempty" xml:"zfsj,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 扩展字段
	ExtFiled *string `json:"ext_filed,omitempty" xml:"ext_filed,omitempty" require:"true"`
}

func (s Invoice) String() string {
	return tea.Prettify(s)
}

func (s Invoice) GoString() string {
	return s.String()
}

func (s *Invoice) SetBz(v string) *Invoice {
	s.Bz = &v
	return s
}

func (s *Invoice) SetFhr(v string) *Invoice {
	s.Fhr = &v
	return s
}

func (s *Invoice) SetFpdm(v string) *Invoice {
	s.Fpdm = &v
	return s
}

func (s *Invoice) SetFphm(v string) *Invoice {
	s.Fphm = &v
	return s
}

func (s *Invoice) SetFplx(v string) *Invoice {
	s.Fplx = &v
	return s
}

func (s *Invoice) SetFpxxmxs(v []*InvoiceItem) *Invoice {
	s.Fpxxmxs = v
	return s
}

func (s *Invoice) SetFpztdm(v string) *Invoice {
	s.Fpztdm = &v
	return s
}

func (s *Invoice) SetGfdzdh(v string) *Invoice {
	s.Gfdzdh = &v
	return s
}

func (s *Invoice) SetGfmc(v string) *Invoice {
	s.Gfmc = &v
	return s
}

func (s *Invoice) SetGfsh(v string) *Invoice {
	s.Gfsh = &v
	return s
}

func (s *Invoice) SetGfyhzh(v string) *Invoice {
	s.Gfyhzh = &v
	return s
}

func (s *Invoice) SetGmflx(v string) *Invoice {
	s.Gmflx = &v
	return s
}

func (s *Invoice) SetJe(v string) *Invoice {
	s.Je = &v
	return s
}

func (s *Invoice) SetJshj(v string) *Invoice {
	s.Jshj = &v
	return s
}

func (s *Invoice) SetKplx(v string) *Invoice {
	s.Kplx = &v
	return s
}

func (s *Invoice) SetKpr(v string) *Invoice {
	s.Kpr = &v
	return s
}

func (s *Invoice) SetKprq(v string) *Invoice {
	s.Kprq = &v
	return s
}

func (s *Invoice) SetQdbz(v string) *Invoice {
	s.Qdbz = &v
	return s
}

func (s *Invoice) SetRzdklbdjgdm(v string) *Invoice {
	s.Rzdklbdjgdm = &v
	return s
}

func (s *Invoice) SetRzdklbdrq(v string) *Invoice {
	s.Rzdklbdrq = &v
	return s
}

func (s *Invoice) SetSe(v string) *Invoice {
	s.Se = &v
	return s
}

func (s *Invoice) SetSkr(v string) *Invoice {
	s.Skr = &v
	return s
}

func (s *Invoice) SetSlbz(v string) *Invoice {
	s.Slbz = &v
	return s
}

func (s *Invoice) SetSsdq(v string) *Invoice {
	s.Ssdq = &v
	return s
}

func (s *Invoice) SetXfdzdh(v string) *Invoice {
	s.Xfdzdh = &v
	return s
}

func (s *Invoice) SetXfmc(v string) *Invoice {
	s.Xfmc = &v
	return s
}

func (s *Invoice) SetXfsh(v string) *Invoice {
	s.Xfsh = &v
	return s
}

func (s *Invoice) SetXfyhzh(v string) *Invoice {
	s.Xfyhzh = &v
	return s
}

func (s *Invoice) SetYfpdm(v string) *Invoice {
	s.Yfpdm = &v
	return s
}

func (s *Invoice) SetYfphm(v string) *Invoice {
	s.Yfphm = &v
	return s
}

func (s *Invoice) SetZfbz(v string) *Invoice {
	s.Zfbz = &v
	return s
}

func (s *Invoice) SetZfsj(v string) *Invoice {
	s.Zfsj = &v
	return s
}

func (s *Invoice) SetExtFiled(v string) *Invoice {
	s.ExtFiled = &v
	return s
}

type AuthCorpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业注册地址和电话号码
	CorpAddressPhoneNo *string `json:"corp_address_phone_no,omitempty" xml:"corp_address_phone_no,omitempty" require:"true"`
	// 企业银行账号
	CorpBankNo *string `json:"corp_bank_no,omitempty" xml:"corp_bank_no,omitempty" require:"true"`
	// 填写公司名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 企业授权秘钥
	CorpPrivateKey *string `json:"corp_private_key,omitempty" xml:"corp_private_key,omitempty" require:"true"`
	// 企业纳税人识别号
	CorpTaxId *string `json:"corp_tax_id,omitempty" xml:"corp_tax_id,omitempty" require:"true"`
}

func (s AuthCorpRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthCorpRequest) GoString() string {
	return s.String()
}

func (s *AuthCorpRequest) SetAuthToken(v string) *AuthCorpRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthCorpRequest) SetProductInstanceId(v string) *AuthCorpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthCorpRequest) SetCorpAddressPhoneNo(v string) *AuthCorpRequest {
	s.CorpAddressPhoneNo = &v
	return s
}

func (s *AuthCorpRequest) SetCorpBankNo(v string) *AuthCorpRequest {
	s.CorpBankNo = &v
	return s
}

func (s *AuthCorpRequest) SetCorpName(v string) *AuthCorpRequest {
	s.CorpName = &v
	return s
}

func (s *AuthCorpRequest) SetCorpPrivateKey(v string) *AuthCorpRequest {
	s.CorpPrivateKey = &v
	return s
}

func (s *AuthCorpRequest) SetCorpTaxId(v string) *AuthCorpRequest {
	s.CorpTaxId = &v
	return s
}

type AuthCorpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthCorpResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthCorpResponse) GoString() string {
	return s.String()
}

func (s *AuthCorpResponse) SetReqMsgId(v string) *AuthCorpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthCorpResponse) SetResultCode(v string) *AuthCorpResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthCorpResponse) SetResultMsg(v string) *AuthCorpResponse {
	s.ResultMsg = &v
	return s
}

type PushChargeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	BizTenant *string `json:"biz_tenant,omitempty" xml:"biz_tenant,omitempty" require:"true"`
	// 平台分发,子业务类型，对应原来的authType.
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 系统编码,平台分发，定义枚举，全局用
	SystemCode *string `json:"system_code,omitempty" xml:"system_code,omitempty" require:"true"`
	// 请求id
	TaskRequestId *string `json:"task_request_id,omitempty" xml:"task_request_id,omitempty" require:"true"`
}

func (s PushChargeRequest) String() string {
	return tea.Prettify(s)
}

func (s PushChargeRequest) GoString() string {
	return s.String()
}

func (s *PushChargeRequest) SetAuthToken(v string) *PushChargeRequest {
	s.AuthToken = &v
	return s
}

func (s *PushChargeRequest) SetProductInstanceId(v string) *PushChargeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushChargeRequest) SetBizTenant(v string) *PushChargeRequest {
	s.BizTenant = &v
	return s
}

func (s *PushChargeRequest) SetBizType(v string) *PushChargeRequest {
	s.BizType = &v
	return s
}

func (s *PushChargeRequest) SetCustomerId(v string) *PushChargeRequest {
	s.CustomerId = &v
	return s
}

func (s *PushChargeRequest) SetSystemCode(v string) *PushChargeRequest {
	s.SystemCode = &v
	return s
}

func (s *PushChargeRequest) SetTaskRequestId(v string) *PushChargeRequest {
	s.TaskRequestId = &v
	return s
}

type PushChargeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushChargeResponse) String() string {
	return tea.Prettify(s)
}

func (s PushChargeResponse) GoString() string {
	return s.String()
}

func (s *PushChargeResponse) SetReqMsgId(v string) *PushChargeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushChargeResponse) SetResultCode(v string) *PushChargeResponse {
	s.ResultCode = &v
	return s
}

func (s *PushChargeResponse) SetResultMsg(v string) *PushChargeResponse {
	s.ResultMsg = &v
	return s
}

type QueryChargeAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	BizTenant *string `json:"biz_tenant,omitempty" xml:"biz_tenant,omitempty" require:"true"`
	// 授权类型,业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
}

func (s QueryChargeAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChargeAuthRequest) GoString() string {
	return s.String()
}

func (s *QueryChargeAuthRequest) SetAuthToken(v string) *QueryChargeAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChargeAuthRequest) SetProductInstanceId(v string) *QueryChargeAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChargeAuthRequest) SetBizTenant(v string) *QueryChargeAuthRequest {
	s.BizTenant = &v
	return s
}

func (s *QueryChargeAuthRequest) SetBizType(v string) *QueryChargeAuthRequest {
	s.BizType = &v
	return s
}

type QueryChargeAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OPEN:开通
	// STOP：停止
	// NOT_SALE：未授权
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
}

func (s QueryChargeAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChargeAuthResponse) GoString() string {
	return s.String()
}

func (s *QueryChargeAuthResponse) SetReqMsgId(v string) *QueryChargeAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChargeAuthResponse) SetResultCode(v string) *QueryChargeAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChargeAuthResponse) SetResultMsg(v string) *QueryChargeAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChargeAuthResponse) SetAuthType(v string) *QueryChargeAuthResponse {
	s.AuthType = &v
	return s
}

type PushIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	Pch *string `json:"pch,omitempty" xml:"pch,omitempty" require:"true"`
	// 发票信息（json格式）
	Fpxx *string `json:"fpxx,omitempty" xml:"fpxx,omitempty" require:"true"`
	// 发票类型
	// 01：增值税专用发票
	// 04：增值税普通发票
	// 10：增值税电子普通发票
	Fplx *string `json:"fplx,omitempty" xml:"fplx,omitempty" require:"true"`
	// 是否是历史数据推送
	Islsp *bool `json:"islsp,omitempty" xml:"islsp,omitempty" require:"true"`
}

func (s PushIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceRequest) SetAuthToken(v string) *PushIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetProductInstanceId(v string) *PushIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetPch(v string) *PushIcmInvoiceRequest {
	s.Pch = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetFpxx(v string) *PushIcmInvoiceRequest {
	s.Fpxx = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetFplx(v string) *PushIcmInvoiceRequest {
	s.Fplx = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetIslsp(v bool) *PushIcmInvoiceRequest {
	s.Islsp = &v
	return s
}

type PushIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceResponse) SetReqMsgId(v string) *PushIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushIcmInvoiceResponse) SetResultCode(v string) *PushIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *PushIcmInvoiceResponse) SetResultMsg(v string) *PushIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type QueryIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ISV名称，用于标识合作的企业
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 授权类型
	// 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	//  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
	//
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// java long型
	// 起始金额，当type=03（报销查询）时必填
	EndAmount *int64 `json:"end_amount,omitempty" xml:"end_amount,omitempty"`
	// 查询起始时间(当auth_type=02或者03时必填)
	// 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
	// 最大查询范围为6.1-6.30
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 非必填，不填则查询所有类型发票
	// "01": "增值税专用发票"
	// "04": "增值税普通发票"
	// "10": "增值税电子普通发票"
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty"`
	// 查询的企业纳税人识别号
	Nsrsbh *string `json:"nsrsbh,omitempty" xml:"nsrsbh,omitempty" require:"true"`
	// 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// java long型
	// 起始金额，当type=03（报销查询）时必填
	StartAmount *int64 `json:"start_amount,omitempty" xml:"start_amount,omitempty"`
	// 查询起始时间(当auth_type=02或者03时必填)
	// 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
	// 最大查询范围为6.1-6.30
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryIcmInvoiceRequest) SetAuthToken(v string) *QueryIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetProductInstanceId(v string) *QueryIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetAppId(v string) *QueryIcmInvoiceRequest {
	s.AppId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetAuthType(v string) *QueryIcmInvoiceRequest {
	s.AuthType = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetCallbackUrl(v string) *QueryIcmInvoiceRequest {
	s.CallbackUrl = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetEndAmount(v int64) *QueryIcmInvoiceRequest {
	s.EndAmount = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetEndDate(v string) *QueryIcmInvoiceRequest {
	s.EndDate = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetInvoiceType(v string) *QueryIcmInvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetNsrsbh(v string) *QueryIcmInvoiceRequest {
	s.Nsrsbh = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetRequestId(v string) *QueryIcmInvoiceRequest {
	s.RequestId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetStartAmount(v int64) *QueryIcmInvoiceRequest {
	s.StartAmount = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetStartDate(v string) *QueryIcmInvoiceRequest {
	s.StartDate = &v
	return s
}

type QueryIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryIcmInvoiceResponse) SetReqMsgId(v string) *QueryIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIcmInvoiceResponse) SetResultCode(v string) *QueryIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIcmInvoiceResponse) SetResultMsg(v string) *QueryIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type PushIcmInvoiceinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上票ISV app_id即secret_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发票号码
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
}

func (s PushIcmInvoiceinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceinfoRequest) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceinfoRequest) SetAuthToken(v string) *PushIcmInvoiceinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetProductInstanceId(v string) *PushIcmInvoiceinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetAppId(v string) *PushIcmInvoiceinfoRequest {
	s.AppId = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetInvoice(v *Invoice) *PushIcmInvoiceinfoRequest {
	s.Invoice = v
	return s
}

type PushIcmInvoiceinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushIcmInvoiceinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceinfoResponse) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceinfoResponse) SetReqMsgId(v string) *PushIcmInvoiceinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushIcmInvoiceinfoResponse) SetResultCode(v string) *PushIcmInvoiceinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushIcmInvoiceinfoResponse) SetResultMsg(v string) *PushIcmInvoiceinfoResponse {
	s.ResultMsg = &v
	return s
}

type DescribeIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发票销方税号
	Xfsh *string `json:"xfsh,omitempty" xml:"xfsh,omitempty" require:"true" maxLength:"30"`
	// 发票代码
	Fpdm *string `json:"fpdm,omitempty" xml:"fpdm,omitempty" require:"true" maxLength:"100"`
	// 发票号码
	Fphm *string `json:"fphm,omitempty" xml:"fphm,omitempty" require:"true" maxLength:"100"`
}

func (s DescribeIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *DescribeIcmInvoiceRequest) SetAuthToken(v string) *DescribeIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeIcmInvoiceRequest) SetProductInstanceId(v string) *DescribeIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DescribeIcmInvoiceRequest) SetXfsh(v string) *DescribeIcmInvoiceRequest {
	s.Xfsh = &v
	return s
}

func (s *DescribeIcmInvoiceRequest) SetFpdm(v string) *DescribeIcmInvoiceRequest {
	s.Fpdm = &v
	return s
}

func (s *DescribeIcmInvoiceRequest) SetFphm(v string) *DescribeIcmInvoiceRequest {
	s.Fphm = &v
	return s
}

type DescribeIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易hash即txhash
	Txhash *string `json:"txhash,omitempty" xml:"txhash,omitempty"`
	// 交易块号
	BlockNumber *string `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易时间
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s DescribeIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *DescribeIcmInvoiceResponse) SetReqMsgId(v string) *DescribeIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeIcmInvoiceResponse) SetResultCode(v string) *DescribeIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeIcmInvoiceResponse) SetResultMsg(v string) *DescribeIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeIcmInvoiceResponse) SetTxhash(v string) *DescribeIcmInvoiceResponse {
	s.Txhash = &v
	return s
}

func (s *DescribeIcmInvoiceResponse) SetBlockNumber(v string) *DescribeIcmInvoiceResponse {
	s.BlockNumber = &v
	return s
}

func (s *DescribeIcmInvoiceResponse) SetTimestamp(v string) *DescribeIcmInvoiceResponse {
	s.Timestamp = &v
	return s
}

type AuthIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 查询的企业纳税人识别号
	//
	Nsrsbh *string `json:"nsrsbh,omitempty" xml:"nsrsbh,omitempty" require:"true"`
	// 企业名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 身份证号
	IdentityNumber *string `json:"identity_number,omitempty" xml:"identity_number,omitempty" require:"true"`
	// 已认证的法人手机号
	CognizantMobile *string `json:"cognizant_mobile,omitempty" xml:"cognizant_mobile,omitempty" require:"true"`
	// 已认证的法人姓名
	CognizantName *string `json:"cognizant_name,omitempty" xml:"cognizant_name,omitempty" require:"true"`
	// 透传字段
	BizContext *string `json:"biz_context,omitempty" xml:"biz_context,omitempty"`
	// 授权业务类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
}

func (s AuthIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *AuthIcmInvoiceRequest) SetAuthToken(v string) *AuthIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetProductInstanceId(v string) *AuthIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetRequestId(v string) *AuthIcmInvoiceRequest {
	s.RequestId = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetNsrsbh(v string) *AuthIcmInvoiceRequest {
	s.Nsrsbh = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetCorpName(v string) *AuthIcmInvoiceRequest {
	s.CorpName = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetIdentityNumber(v string) *AuthIcmInvoiceRequest {
	s.IdentityNumber = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetCognizantMobile(v string) *AuthIcmInvoiceRequest {
	s.CognizantMobile = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetCognizantName(v string) *AuthIcmInvoiceRequest {
	s.CognizantName = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetBizContext(v string) *AuthIcmInvoiceRequest {
	s.BizContext = &v
	return s
}

func (s *AuthIcmInvoiceRequest) SetAuthType(v string) *AuthIcmInvoiceRequest {
	s.AuthType = &v
	return s
}

type AuthIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权是否成功：true：成功 false：失败
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
	// 透传字段
	BizContext *string `json:"biz_context,omitempty" xml:"biz_context,omitempty"`
	// 纳税人识别号
	Nsrsbh *string `json:"nsrsbh,omitempty" xml:"nsrsbh,omitempty"`
	// 过期时间
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty"`
	// 业务请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s AuthIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *AuthIcmInvoiceResponse) SetReqMsgId(v string) *AuthIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetResultCode(v string) *AuthIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetResultMsg(v string) *AuthIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetSuccess(v string) *AuthIcmInvoiceResponse {
	s.Success = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetBizContext(v string) *AuthIcmInvoiceResponse {
	s.BizContext = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetNsrsbh(v string) *AuthIcmInvoiceResponse {
	s.Nsrsbh = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetExpiredTime(v string) *AuthIcmInvoiceResponse {
	s.ExpiredTime = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetRequestId(v string) *AuthIcmInvoiceResponse {
	s.RequestId = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetErrorCode(v string) *AuthIcmInvoiceResponse {
	s.ErrorCode = &v
	return s
}

func (s *AuthIcmInvoiceResponse) SetErrorMsg(v string) *AuthIcmInvoiceResponse {
	s.ErrorMsg = &v
	return s
}

type AuthIcmRealpersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 基础授权请求
	Request *BaseAuthRequest `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 个人证件号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 名字
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty" require:"true"`
}

func (s AuthIcmRealpersonRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmRealpersonRequest) GoString() string {
	return s.String()
}

func (s *AuthIcmRealpersonRequest) SetAuthToken(v string) *AuthIcmRealpersonRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthIcmRealpersonRequest) SetProductInstanceId(v string) *AuthIcmRealpersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthIcmRealpersonRequest) SetRequest(v *BaseAuthRequest) *AuthIcmRealpersonRequest {
	s.Request = v
	return s
}

func (s *AuthIcmRealpersonRequest) SetIdentityId(v string) *AuthIcmRealpersonRequest {
	s.IdentityId = &v
	return s
}

func (s *AuthIcmRealpersonRequest) SetIdentityName(v string) *AuthIcmRealpersonRequest {
	s.IdentityName = &v
	return s
}

type AuthIcmRealpersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否授权成功true是，false否
	AuthSuccess *bool `json:"auth_success,omitempty" xml:"auth_success,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 过期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// 授权时间 unix时间戳
	AuthTime *string `json:"auth_time,omitempty" xml:"auth_time,omitempty"`
}

func (s AuthIcmRealpersonResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmRealpersonResponse) GoString() string {
	return s.String()
}

func (s *AuthIcmRealpersonResponse) SetReqMsgId(v string) *AuthIcmRealpersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetResultCode(v string) *AuthIcmRealpersonResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetResultMsg(v string) *AuthIcmRealpersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetAuthSuccess(v bool) *AuthIcmRealpersonResponse {
	s.AuthSuccess = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetOrderNo(v string) *AuthIcmRealpersonResponse {
	s.OrderNo = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetExpireTime(v string) *AuthIcmRealpersonResponse {
	s.ExpireTime = &v
	return s
}

func (s *AuthIcmRealpersonResponse) SetAuthTime(v string) *AuthIcmRealpersonResponse {
	s.AuthTime = &v
	return s
}

type ExecIcmSyncgatheringRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构号码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 纳税人识别号(必填)
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型(必填)
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 查询类型
	// NORMAL 正常调用
	// BATCH_HAND  批刷
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty"`
	// 子机构编码，字典由系统预设白名单
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty"`
	// 优先级，越大优先级越高
	UsePriority *string `json:"use_priority,omitempty" xml:"use_priority,omitempty"`
}

func (s ExecIcmSyncgatheringRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecIcmSyncgatheringRequest) GoString() string {
	return s.String()
}

func (s *ExecIcmSyncgatheringRequest) SetAuthToken(v string) *ExecIcmSyncgatheringRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetProductInstanceId(v string) *ExecIcmSyncgatheringRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetInstCode(v string) *ExecIcmSyncgatheringRequest {
	s.InstCode = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetBizRequestId(v string) *ExecIcmSyncgatheringRequest {
	s.BizRequestId = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetIdentityId(v string) *ExecIcmSyncgatheringRequest {
	s.IdentityId = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetAuthType(v string) *ExecIcmSyncgatheringRequest {
	s.AuthType = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetOrderNo(v string) *ExecIcmSyncgatheringRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetContent(v string) *ExecIcmSyncgatheringRequest {
	s.Content = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetQueryType(v string) *ExecIcmSyncgatheringRequest {
	s.QueryType = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetSubTenant(v string) *ExecIcmSyncgatheringRequest {
	s.SubTenant = &v
	return s
}

func (s *ExecIcmSyncgatheringRequest) SetUsePriority(v string) *ExecIcmSyncgatheringRequest {
	s.UsePriority = &v
	return s
}

type ExecIcmSyncgatheringResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的请求对象jsonString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
	// 返回模式
	ReturnMode *string `json:"return_mode,omitempty" xml:"return_mode,omitempty"`
	// 返回结果
	ReturnResult []*ReturnDetail `json:"return_result,omitempty" xml:"return_result,omitempty" type:"Repeated"`
	// 是否查得
	NullDataFlag *bool `json:"null_data_flag,omitempty" xml:"null_data_flag,omitempty"`
	// 参考区块链给出的标准字段定义
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty"`
	// 是否需要重新授权
	Reauth *bool `json:"reauth,omitempty" xml:"reauth,omitempty"`
}

func (s ExecIcmSyncgatheringResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecIcmSyncgatheringResponse) GoString() string {
	return s.String()
}

func (s *ExecIcmSyncgatheringResponse) SetReqMsgId(v string) *ExecIcmSyncgatheringResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetResultCode(v string) *ExecIcmSyncgatheringResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetResultMsg(v string) *ExecIcmSyncgatheringResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetBizContent(v string) *ExecIcmSyncgatheringResponse {
	s.BizContent = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetQueryTime(v string) *ExecIcmSyncgatheringResponse {
	s.QueryTime = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetReturnMode(v string) *ExecIcmSyncgatheringResponse {
	s.ReturnMode = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetReturnResult(v []*ReturnDetail) *ExecIcmSyncgatheringResponse {
	s.ReturnResult = v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetNullDataFlag(v bool) *ExecIcmSyncgatheringResponse {
	s.NullDataFlag = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetQueryType(v string) *ExecIcmSyncgatheringResponse {
	s.QueryType = &v
	return s
}

func (s *ExecIcmSyncgatheringResponse) SetReauth(v bool) *ExecIcmSyncgatheringResponse {
	s.Reauth = &v
	return s
}

type QueryApiAuthteplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 身份ID 身份证或者统一社会信用编码
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 名称
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty" require:"true"`
	// 业务类型
	// 11 税
	// 12票
	// 13税+票
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 法人名称
	CognizantName *string `json:"cognizant_name,omitempty" xml:"cognizant_name,omitempty" require:"true"`
	// 法人证件号
	CoidentityNumber *string `json:"coidentity_number,omitempty" xml:"coidentity_number,omitempty" require:"true"`
	// 法人手机号
	CognizantMobile *string `json:"cognizant_mobile,omitempty" xml:"cognizant_mobile,omitempty" require:"true"`
}

func (s QueryApiAuthteplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthteplateRequest) GoString() string {
	return s.String()
}

func (s *QueryApiAuthteplateRequest) SetAuthToken(v string) *QueryApiAuthteplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetProductInstanceId(v string) *QueryApiAuthteplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetOrderNo(v string) *QueryApiAuthteplateRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetIdentityId(v string) *QueryApiAuthteplateRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetIdentityName(v string) *QueryApiAuthteplateRequest {
	s.IdentityName = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetAuthType(v string) *QueryApiAuthteplateRequest {
	s.AuthType = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetCognizantName(v string) *QueryApiAuthteplateRequest {
	s.CognizantName = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetCoidentityNumber(v string) *QueryApiAuthteplateRequest {
	s.CoidentityNumber = &v
	return s
}

func (s *QueryApiAuthteplateRequest) SetCognizantMobile(v string) *QueryApiAuthteplateRequest {
	s.CognizantMobile = &v
	return s
}

type QueryApiAuthteplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// JWT生成，设置失效时间，维持会话数据
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// Unix时间戳 秒
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// 模版树
	TreeTemplate *TreeTemplate `json:"tree_template,omitempty" xml:"tree_template,omitempty"`
}

func (s QueryApiAuthteplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthteplateResponse) GoString() string {
	return s.String()
}

func (s *QueryApiAuthteplateResponse) SetReqMsgId(v string) *QueryApiAuthteplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiAuthteplateResponse) SetResultCode(v string) *QueryApiAuthteplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiAuthteplateResponse) SetResultMsg(v string) *QueryApiAuthteplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiAuthteplateResponse) SetToken(v string) *QueryApiAuthteplateResponse {
	s.Token = &v
	return s
}

func (s *QueryApiAuthteplateResponse) SetExpireTime(v int64) *QueryApiAuthteplateResponse {
	s.ExpireTime = &v
	return s
}

func (s *QueryApiAuthteplateResponse) SetTreeTemplate(v *TreeTemplate) *QueryApiAuthteplateResponse {
	s.TreeTemplate = v
	return s
}

type ExecApiAuthtemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 树的模版id
	TreeTemplateId *string `json:"tree_template_id,omitempty" xml:"tree_template_id,omitempty" require:"true"`
	// 模版对应的版本号
	TreeVersion *string `json:"tree_version,omitempty" xml:"tree_version,omitempty" require:"true"`
	// 对应节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 当前卡片所有需要填充元素key
	// 和value值
	Pairs *Pair `json:"pairs,omitempty" xml:"pairs,omitempty" require:"true"`
}

func (s ExecApiAuthtemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecApiAuthtemplateRequest) GoString() string {
	return s.String()
}

func (s *ExecApiAuthtemplateRequest) SetAuthToken(v string) *ExecApiAuthtemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetProductInstanceId(v string) *ExecApiAuthtemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetToken(v string) *ExecApiAuthtemplateRequest {
	s.Token = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetTreeTemplateId(v string) *ExecApiAuthtemplateRequest {
	s.TreeTemplateId = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetTreeVersion(v string) *ExecApiAuthtemplateRequest {
	s.TreeVersion = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetNodeId(v string) *ExecApiAuthtemplateRequest {
	s.NodeId = &v
	return s
}

func (s *ExecApiAuthtemplateRequest) SetPairs(v *Pair) *ExecApiAuthtemplateRequest {
	s.Pairs = v
	return s
}

type ExecApiAuthtemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的下一层节点集合
	Nodes []*TreeNode `json:"nodes,omitempty" xml:"nodes,omitempty" type:"Repeated"`
	// 树id
	TreeTemplateId *string `json:"tree_template_id,omitempty" xml:"tree_template_id,omitempty"`
	// 授权状态,提交接口此字段为空
	// 1、正在处理中
	// 2、登陆成功
	AuthState *string `json:"auth_state,omitempty" xml:"auth_state,omitempty"`
	// 请求是否成功
	// true 成功
	// false 失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecApiAuthtemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecApiAuthtemplateResponse) GoString() string {
	return s.String()
}

func (s *ExecApiAuthtemplateResponse) SetReqMsgId(v string) *ExecApiAuthtemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetResultCode(v string) *ExecApiAuthtemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetResultMsg(v string) *ExecApiAuthtemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetNodes(v []*TreeNode) *ExecApiAuthtemplateResponse {
	s.Nodes = v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetTreeTemplateId(v string) *ExecApiAuthtemplateResponse {
	s.TreeTemplateId = &v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetAuthState(v string) *ExecApiAuthtemplateResponse {
	s.AuthState = &v
	return s
}

func (s *ExecApiAuthtemplateResponse) SetSuccess(v bool) *ExecApiAuthtemplateResponse {
	s.Success = &v
	return s
}

type QueryApiAuthtemplatedefineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// message：短信
	// qrCode：二维码
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// 依赖的数据值 比如身份证
	DependsValue *string `json:"depends_value,omitempty" xml:"depends_value,omitempty" require:"true"`
}

func (s QueryApiAuthtemplatedefineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthtemplatedefineRequest) GoString() string {
	return s.String()
}

func (s *QueryApiAuthtemplatedefineRequest) SetAuthToken(v string) *QueryApiAuthtemplatedefineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiAuthtemplatedefineRequest) SetProductInstanceId(v string) *QueryApiAuthtemplatedefineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiAuthtemplatedefineRequest) SetToken(v string) *QueryApiAuthtemplatedefineRequest {
	s.Token = &v
	return s
}

func (s *QueryApiAuthtemplatedefineRequest) SetActionType(v string) *QueryApiAuthtemplatedefineRequest {
	s.ActionType = &v
	return s
}

func (s *QueryApiAuthtemplatedefineRequest) SetDependsValue(v string) *QueryApiAuthtemplatedefineRequest {
	s.DependsValue = &v
	return s
}

type QueryApiAuthtemplatedefineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二维码类型返回二维码描述
	// 短信无返回，接口成功即可
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s QueryApiAuthtemplatedefineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthtemplatedefineResponse) GoString() string {
	return s.String()
}

func (s *QueryApiAuthtemplatedefineResponse) SetReqMsgId(v string) *QueryApiAuthtemplatedefineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiAuthtemplatedefineResponse) SetResultCode(v string) *QueryApiAuthtemplatedefineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiAuthtemplatedefineResponse) SetResultMsg(v string) *QueryApiAuthtemplatedefineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiAuthtemplatedefineResponse) SetValue(v string) *QueryApiAuthtemplatedefineResponse {
	s.Value = &v
	return s
}

type QueryApiAuthtemplateresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务授权订单号 用户幂等控制，调用方保证唯一
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 身份ID
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
}

func (s QueryApiAuthtemplateresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthtemplateresultRequest) GoString() string {
	return s.String()
}

func (s *QueryApiAuthtemplateresultRequest) SetAuthToken(v string) *QueryApiAuthtemplateresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiAuthtemplateresultRequest) SetProductInstanceId(v string) *QueryApiAuthtemplateresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiAuthtemplateresultRequest) SetOrderNo(v string) *QueryApiAuthtemplateresultRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryApiAuthtemplateresultRequest) SetIdentityId(v string) *QueryApiAuthtemplateresultRequest {
	s.IdentityId = &v
	return s
}

type QueryApiAuthtemplateresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 授权状态
	// 1、正在处理中
	// 2、登陆成功
	AuthState *string `json:"auth_state,omitempty" xml:"auth_state,omitempty"`
}

func (s QueryApiAuthtemplateresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiAuthtemplateresultResponse) GoString() string {
	return s.String()
}

func (s *QueryApiAuthtemplateresultResponse) SetReqMsgId(v string) *QueryApiAuthtemplateresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiAuthtemplateresultResponse) SetResultCode(v string) *QueryApiAuthtemplateresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiAuthtemplateresultResponse) SetResultMsg(v string) *QueryApiAuthtemplateresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiAuthtemplateresultResponse) SetSuccess(v bool) *QueryApiAuthtemplateresultResponse {
	s.Success = &v
	return s
}

func (s *QueryApiAuthtemplateresultResponse) SetAuthState(v string) *QueryApiAuthtemplateresultResponse {
	s.AuthState = &v
	return s
}

type AuthIcmEnterpriseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份id，统一社会信用编码or其他
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 企业名称
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty"`
	// 授权类型，不动产100，电力200
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 扩展信息
	ExtendInfo *StandardAuthExtendInfoRequest `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
	// 法人姓名
	CognizantName *string `json:"cognizant_name,omitempty" xml:"cognizant_name,omitempty"`
	// 法人手机号
	CognizantMobile *string `json:"cognizant_mobile,omitempty" xml:"cognizant_mobile,omitempty"`
	// 法人身份证号
	CognizantId *string `json:"cognizant_id,omitempty" xml:"cognizant_id,omitempty"`
	// 字典由系统设置，子机构编码
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty"`
}

func (s AuthIcmEnterpriseRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmEnterpriseRequest) GoString() string {
	return s.String()
}

func (s *AuthIcmEnterpriseRequest) SetAuthToken(v string) *AuthIcmEnterpriseRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetProductInstanceId(v string) *AuthIcmEnterpriseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetIdentityId(v string) *AuthIcmEnterpriseRequest {
	s.IdentityId = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetIdentityName(v string) *AuthIcmEnterpriseRequest {
	s.IdentityName = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetAuthType(v string) *AuthIcmEnterpriseRequest {
	s.AuthType = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetOrderNo(v string) *AuthIcmEnterpriseRequest {
	s.OrderNo = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetExtendInfo(v *StandardAuthExtendInfoRequest) *AuthIcmEnterpriseRequest {
	s.ExtendInfo = v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetCognizantName(v string) *AuthIcmEnterpriseRequest {
	s.CognizantName = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetCognizantMobile(v string) *AuthIcmEnterpriseRequest {
	s.CognizantMobile = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetCognizantId(v string) *AuthIcmEnterpriseRequest {
	s.CognizantId = &v
	return s
}

func (s *AuthIcmEnterpriseRequest) SetSubTenant(v string) *AuthIcmEnterpriseRequest {
	s.SubTenant = &v
	return s
}

type AuthIcmEnterpriseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否授权成功true是，false否
	//
	AuthSuccess *bool `json:"auth_success,omitempty" xml:"auth_success,omitempty"`
	// 授权订单订单号
	//
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 过期时间，unix时间戳 毫秒
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// unix时间戳 毫秒
	AuthTime *int64 `json:"auth_time,omitempty" xml:"auth_time,omitempty"`
}

func (s AuthIcmEnterpriseResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthIcmEnterpriseResponse) GoString() string {
	return s.String()
}

func (s *AuthIcmEnterpriseResponse) SetReqMsgId(v string) *AuthIcmEnterpriseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetResultCode(v string) *AuthIcmEnterpriseResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetResultMsg(v string) *AuthIcmEnterpriseResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetAuthSuccess(v bool) *AuthIcmEnterpriseResponse {
	s.AuthSuccess = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetOrderNo(v string) *AuthIcmEnterpriseResponse {
	s.OrderNo = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetExpireTime(v int64) *AuthIcmEnterpriseResponse {
	s.ExpireTime = &v
	return s
}

func (s *AuthIcmEnterpriseResponse) SetAuthTime(v int64) *AuthIcmEnterpriseResponse {
	s.AuthTime = &v
	return s
}

type CreateApiAuthurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 纳税人识别号
	Nsrsbh *string `json:"nsrsbh,omitempty" xml:"nsrsbh,omitempty" require:"true"`
	// 企业名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
	CallBackUrl *string `json:"call_back_url,omitempty" xml:"call_back_url,omitempty" require:"true"`
	// 机构代码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 已认证的法人手机号
	CognizantMobile *string `json:"cognizant_mobile,omitempty" xml:"cognizant_mobile,omitempty"`
	// 已认证的法人姓名
	CognizantName *string `json:"cognizant_name,omitempty" xml:"cognizant_name,omitempty"`
	// 已认证的法人身份证号
	IdentityNumber *string `json:"identity_number,omitempty" xml:"identity_number,omitempty"`
	// 订单号，用于幂等控制，每次新生成，如果不填我方会自动生成一个
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s CreateApiAuthurlRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiAuthurlRequest) GoString() string {
	return s.String()
}

func (s *CreateApiAuthurlRequest) SetAuthToken(v string) *CreateApiAuthurlRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetProductInstanceId(v string) *CreateApiAuthurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetAuthType(v string) *CreateApiAuthurlRequest {
	s.AuthType = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetNsrsbh(v string) *CreateApiAuthurlRequest {
	s.Nsrsbh = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetCorpName(v string) *CreateApiAuthurlRequest {
	s.CorpName = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetCallBackUrl(v string) *CreateApiAuthurlRequest {
	s.CallBackUrl = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetInstCode(v string) *CreateApiAuthurlRequest {
	s.InstCode = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetCognizantMobile(v string) *CreateApiAuthurlRequest {
	s.CognizantMobile = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetCognizantName(v string) *CreateApiAuthurlRequest {
	s.CognizantName = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetIdentityNumber(v string) *CreateApiAuthurlRequest {
	s.IdentityNumber = &v
	return s
}

func (s *CreateApiAuthurlRequest) SetOrderNo(v string) *CreateApiAuthurlRequest {
	s.OrderNo = &v
	return s
}

type CreateApiAuthurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 短链接地址
	LoginUrl *string `json:"login_url,omitempty" xml:"login_url,omitempty"`
	// 授权原始链接
	OriginLoginUrl *string `json:"origin_login_url,omitempty" xml:"origin_login_url,omitempty"`
}

func (s CreateApiAuthurlResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiAuthurlResponse) GoString() string {
	return s.String()
}

func (s *CreateApiAuthurlResponse) SetReqMsgId(v string) *CreateApiAuthurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiAuthurlResponse) SetResultCode(v string) *CreateApiAuthurlResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiAuthurlResponse) SetResultMsg(v string) *CreateApiAuthurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApiAuthurlResponse) SetOrderNo(v string) *CreateApiAuthurlResponse {
	s.OrderNo = &v
	return s
}

func (s *CreateApiAuthurlResponse) SetLoginUrl(v string) *CreateApiAuthurlResponse {
	s.LoginUrl = &v
	return s
}

func (s *CreateApiAuthurlResponse) SetOriginLoginUrl(v string) *CreateApiAuthurlResponse {
	s.OriginLoginUrl = &v
	return s
}

type MatchIcmSimpleauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 用于幂等控制
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 产品类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 授权编号
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
}

func (s MatchIcmSimpleauthRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchIcmSimpleauthRequest) GoString() string {
	return s.String()
}

func (s *MatchIcmSimpleauthRequest) SetAuthToken(v string) *MatchIcmSimpleauthRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetProductInstanceId(v string) *MatchIcmSimpleauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetInstCode(v string) *MatchIcmSimpleauthRequest {
	s.InstCode = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetIdentityId(v string) *MatchIcmSimpleauthRequest {
	s.IdentityId = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetBizRequestId(v string) *MatchIcmSimpleauthRequest {
	s.BizRequestId = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetAuthType(v string) *MatchIcmSimpleauthRequest {
	s.AuthType = &v
	return s
}

func (s *MatchIcmSimpleauthRequest) SetAuthCode(v string) *MatchIcmSimpleauthRequest {
	s.AuthCode = &v
	return s
}

type MatchIcmSimpleauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支持的数据类型
	CoverResult []*string `json:"cover_result,omitempty" xml:"cover_result,omitempty" type:"Repeated"`
}

func (s MatchIcmSimpleauthResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchIcmSimpleauthResponse) GoString() string {
	return s.String()
}

func (s *MatchIcmSimpleauthResponse) SetReqMsgId(v string) *MatchIcmSimpleauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchIcmSimpleauthResponse) SetResultCode(v string) *MatchIcmSimpleauthResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchIcmSimpleauthResponse) SetResultMsg(v string) *MatchIcmSimpleauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *MatchIcmSimpleauthResponse) SetCoverResult(v []*string) *MatchIcmSimpleauthResponse {
	s.CoverResult = v
	return s
}

type QueryIcmSimpleauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户名称
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 请求id，用于幂等控制
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 行方生成的授权编号
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 如果有的话，作为透传字段
	BizContext *string `json:"biz_context,omitempty" xml:"biz_context,omitempty"`
}

func (s QueryIcmSimpleauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmSimpleauthRequest) GoString() string {
	return s.String()
}

func (s *QueryIcmSimpleauthRequest) SetAuthToken(v string) *QueryIcmSimpleauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetProductInstanceId(v string) *QueryIcmSimpleauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetInstCode(v string) *QueryIcmSimpleauthRequest {
	s.InstCode = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetIdentityId(v string) *QueryIcmSimpleauthRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetBizRequestId(v string) *QueryIcmSimpleauthRequest {
	s.BizRequestId = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetAuthType(v string) *QueryIcmSimpleauthRequest {
	s.AuthType = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetAuthCode(v string) *QueryIcmSimpleauthRequest {
	s.AuthCode = &v
	return s
}

func (s *QueryIcmSimpleauthRequest) SetBizContext(v string) *QueryIcmSimpleauthRequest {
	s.BizContext = &v
	return s
}

type QueryIcmSimpleauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支持的数据类型，结果数据
	ReturnResult *string `json:"return_result,omitempty" xml:"return_result,omitempty"`
}

func (s QueryIcmSimpleauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmSimpleauthResponse) GoString() string {
	return s.String()
}

func (s *QueryIcmSimpleauthResponse) SetReqMsgId(v string) *QueryIcmSimpleauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIcmSimpleauthResponse) SetResultCode(v string) *QueryIcmSimpleauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIcmSimpleauthResponse) SetResultMsg(v string) *QueryIcmSimpleauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIcmSimpleauthResponse) SetReturnResult(v string) *QueryIcmSimpleauthResponse {
	s.ReturnResult = &v
	return s
}

type QueryApiSimpleauthasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 用于幂等控制
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 行方生成的授权编号
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s QueryApiSimpleauthasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiSimpleauthasyncRequest) GoString() string {
	return s.String()
}

func (s *QueryApiSimpleauthasyncRequest) SetAuthToken(v string) *QueryApiSimpleauthasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetProductInstanceId(v string) *QueryApiSimpleauthasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetInstCode(v string) *QueryApiSimpleauthasyncRequest {
	s.InstCode = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetIdentityId(v string) *QueryApiSimpleauthasyncRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetBizRequestId(v string) *QueryApiSimpleauthasyncRequest {
	s.BizRequestId = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetAuthType(v string) *QueryApiSimpleauthasyncRequest {
	s.AuthType = &v
	return s
}

func (s *QueryApiSimpleauthasyncRequest) SetAuthCode(v string) *QueryApiSimpleauthasyncRequest {
	s.AuthCode = &v
	return s
}

type QueryApiSimpleauthasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	ReturnResult *string `json:"return_result,omitempty" xml:"return_result,omitempty"`
	// false 有值
	// true  无值
	NullDataFlag *string `json:"null_data_flag,omitempty" xml:"null_data_flag,omitempty"`
	// json格式，其他内容
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryApiSimpleauthasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiSimpleauthasyncResponse) GoString() string {
	return s.String()
}

func (s *QueryApiSimpleauthasyncResponse) SetReqMsgId(v string) *QueryApiSimpleauthasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiSimpleauthasyncResponse) SetResultCode(v string) *QueryApiSimpleauthasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiSimpleauthasyncResponse) SetResultMsg(v string) *QueryApiSimpleauthasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiSimpleauthasyncResponse) SetReturnResult(v string) *QueryApiSimpleauthasyncResponse {
	s.ReturnResult = &v
	return s
}

func (s *QueryApiSimpleauthasyncResponse) SetNullDataFlag(v string) *QueryApiSimpleauthasyncResponse {
	s.NullDataFlag = &v
	return s
}

func (s *QueryApiSimpleauthasyncResponse) SetBizContent(v string) *QueryApiSimpleauthasyncResponse {
	s.BizContent = &v
	return s
}

type AuthRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true" maxLength:"30"`
	// 个人姓名
	IdentityName *string `json:"identity_name,omitempty" xml:"identity_name,omitempty" maxLength:"128"`
	// 企业的统一社会信用编码
	EnterpriseId *string `json:"enterprise_id,omitempty" xml:"enterprise_id,omitempty" maxLength:"64"`
	// 企业的名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty"`
	// 企业或者个人企业：ENTERPRISE  个人：PERSONAL
	//
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 授权的业务类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
	// 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
	//
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty"`
	//  扩展信息
	ExtendInfo *RiskEvaluationExtendInfoRequest `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
}

func (s AuthRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *AuthRiskEvaluationRequest) SetAuthToken(v string) *AuthRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetProductInstanceId(v string) *AuthRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetIdentityId(v string) *AuthRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetIdentityName(v string) *AuthRiskEvaluationRequest {
	s.IdentityName = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetEnterpriseId(v string) *AuthRiskEvaluationRequest {
	s.EnterpriseId = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetEnterpriseName(v string) *AuthRiskEvaluationRequest {
	s.EnterpriseName = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetIdentityType(v string) *AuthRiskEvaluationRequest {
	s.IdentityType = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetAuthType(v string) *AuthRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetOrderNo(v string) *AuthRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetSubTenant(v string) *AuthRiskEvaluationRequest {
	s.SubTenant = &v
	return s
}

func (s *AuthRiskEvaluationRequest) SetExtendInfo(v *RiskEvaluationExtendInfoRequest) *AuthRiskEvaluationRequest {
	s.ExtendInfo = v
	return s
}

type AuthRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权订单订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 是否授权成功true是，false否
	AuthSuccess *bool `json:"auth_success,omitempty" xml:"auth_success,omitempty"`
	// 过期时间，unix时间戳 毫秒
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty"`
	// 授权时间，unix时间戳 毫秒
	AuthTime *string `json:"auth_time,omitempty" xml:"auth_time,omitempty"`
}

func (s AuthRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *AuthRiskEvaluationResponse) SetReqMsgId(v string) *AuthRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetResultCode(v string) *AuthRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetResultMsg(v string) *AuthRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetOrderNo(v string) *AuthRiskEvaluationResponse {
	s.OrderNo = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetAuthSuccess(v bool) *AuthRiskEvaluationResponse {
	s.AuthSuccess = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetExpireTime(v int64) *AuthRiskEvaluationResponse {
	s.ExpireTime = &v
	return s
}

func (s *AuthRiskEvaluationResponse) SetAuthTime(v string) *AuthRiskEvaluationResponse {
	s.AuthTime = &v
	return s
}

type QueryRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 信贷用户的纳税人识别号或者身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 机构编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
}

func (s QueryRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskEvaluationRequest) SetAuthToken(v string) *QueryRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetProductInstanceId(v string) *QueryRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetBizRequestId(v string) *QueryRiskEvaluationRequest {
	s.BizRequestId = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetIdentityId(v string) *QueryRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetAuthType(v string) *QueryRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetOrderNo(v string) *QueryRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryRiskEvaluationRequest) SetInstCode(v string) *QueryRiskEvaluationRequest {
	s.InstCode = &v
	return s
}

type QueryRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
}

func (s QueryRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskEvaluationResponse) SetReqMsgId(v string) *QueryRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskEvaluationResponse) SetResultCode(v string) *QueryRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskEvaluationResponse) SetResultMsg(v string) *QueryRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskEvaluationResponse) SetQueryTime(v string) *QueryRiskEvaluationResponse {
	s.QueryTime = &v
	return s
}

type PullApiSimpleauthasyncpollingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
	//
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 用于幂等控制
	//
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
	//
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 行方生成的授权编号
	//
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
}

func (s PullApiSimpleauthasyncpollingRequest) String() string {
	return tea.Prettify(s)
}

func (s PullApiSimpleauthasyncpollingRequest) GoString() string {
	return s.String()
}

func (s *PullApiSimpleauthasyncpollingRequest) SetAuthToken(v string) *PullApiSimpleauthasyncpollingRequest {
	s.AuthToken = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetProductInstanceId(v string) *PullApiSimpleauthasyncpollingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetInstCode(v string) *PullApiSimpleauthasyncpollingRequest {
	s.InstCode = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetIdentityId(v string) *PullApiSimpleauthasyncpollingRequest {
	s.IdentityId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetBizRequestId(v string) *PullApiSimpleauthasyncpollingRequest {
	s.BizRequestId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetAuthType(v string) *PullApiSimpleauthasyncpollingRequest {
	s.AuthType = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingRequest) SetAuthCode(v string) *PullApiSimpleauthasyncpollingRequest {
	s.AuthCode = &v
	return s
}

type PullApiSimpleauthasyncpollingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty"`
	// 和查询的biz_request_id相同
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty"`
	// 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 行方生成的授权编号
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty"`
	// 时间戳
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 极简授权文件地址列表
	FileList []*string `json:"file_list,omitempty" xml:"file_list,omitempty" type:"Repeated"`
	// 秘钥
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
}

func (s PullApiSimpleauthasyncpollingResponse) String() string {
	return tea.Prettify(s)
}

func (s PullApiSimpleauthasyncpollingResponse) GoString() string {
	return s.String()
}

func (s *PullApiSimpleauthasyncpollingResponse) SetReqMsgId(v string) *PullApiSimpleauthasyncpollingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetResultCode(v string) *PullApiSimpleauthasyncpollingResponse {
	s.ResultCode = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetResultMsg(v string) *PullApiSimpleauthasyncpollingResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetInstCode(v string) *PullApiSimpleauthasyncpollingResponse {
	s.InstCode = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetIdentityId(v string) *PullApiSimpleauthasyncpollingResponse {
	s.IdentityId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetBizRequestId(v string) *PullApiSimpleauthasyncpollingResponse {
	s.BizRequestId = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetAuthType(v string) *PullApiSimpleauthasyncpollingResponse {
	s.AuthType = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetAuthCode(v string) *PullApiSimpleauthasyncpollingResponse {
	s.AuthCode = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetTimestamp(v string) *PullApiSimpleauthasyncpollingResponse {
	s.Timestamp = &v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetFileList(v []*string) *PullApiSimpleauthasyncpollingResponse {
	s.FileList = v
	return s
}

func (s *PullApiSimpleauthasyncpollingResponse) SetSecret(v string) *PullApiSimpleauthasyncpollingResponse {
	s.Secret = &v
	return s
}

type QueryApiSimpleauthstandardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 纳税人识别号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 用于幂等控制
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 该请求最终发起方(金融机构)的租户号，若是征信通道模式，则是征信机构终端客户的租户号，该租户号由我方分配。
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 产品类型；
	// 发票数据：301；税务数据：302；发票及税务数据：303； (通过征信机构链接时请在数字前加“ZX”，如：ZX301)
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 是指行方生成的授权编号
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
}

func (s QueryApiSimpleauthstandardRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiSimpleauthstandardRequest) GoString() string {
	return s.String()
}

func (s *QueryApiSimpleauthstandardRequest) SetAuthToken(v string) *QueryApiSimpleauthstandardRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetProductInstanceId(v string) *QueryApiSimpleauthstandardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetIdentityId(v string) *QueryApiSimpleauthstandardRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetBizRequestId(v string) *QueryApiSimpleauthstandardRequest {
	s.BizRequestId = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetInstCode(v string) *QueryApiSimpleauthstandardRequest {
	s.InstCode = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetAuthType(v string) *QueryApiSimpleauthstandardRequest {
	s.AuthType = &v
	return s
}

func (s *QueryApiSimpleauthstandardRequest) SetAuthCode(v string) *QueryApiSimpleauthstandardRequest {
	s.AuthCode = &v
	return s
}

type QueryApiSimpleauthstandardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryApiSimpleauthstandardResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiSimpleauthstandardResponse) GoString() string {
	return s.String()
}

func (s *QueryApiSimpleauthstandardResponse) SetReqMsgId(v string) *QueryApiSimpleauthstandardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiSimpleauthstandardResponse) SetResultCode(v string) *QueryApiSimpleauthstandardResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiSimpleauthstandardResponse) SetResultMsg(v string) *QueryApiSimpleauthstandardResponse {
	s.ResultMsg = &v
	return s
}

type ExecApiSimpleauthmarkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 税号清单
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty" require:"true"`
	// 租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 请求id
	BizUniqueId *string `json:"biz_unique_id,omitempty" xml:"biz_unique_id,omitempty" require:"true"`
	// 产品类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
}

func (s ExecApiSimpleauthmarkRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecApiSimpleauthmarkRequest) GoString() string {
	return s.String()
}

func (s *ExecApiSimpleauthmarkRequest) SetAuthToken(v string) *ExecApiSimpleauthmarkRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecApiSimpleauthmarkRequest) SetProductInstanceId(v string) *ExecApiSimpleauthmarkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecApiSimpleauthmarkRequest) SetIdentityInfo(v string) *ExecApiSimpleauthmarkRequest {
	s.IdentityInfo = &v
	return s
}

func (s *ExecApiSimpleauthmarkRequest) SetInstCode(v string) *ExecApiSimpleauthmarkRequest {
	s.InstCode = &v
	return s
}

func (s *ExecApiSimpleauthmarkRequest) SetBizUniqueId(v string) *ExecApiSimpleauthmarkRequest {
	s.BizUniqueId = &v
	return s
}

func (s *ExecApiSimpleauthmarkRequest) SetAuthType(v string) *ExecApiSimpleauthmarkRequest {
	s.AuthType = &v
	return s
}

type ExecApiSimpleauthmarkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecApiSimpleauthmarkResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecApiSimpleauthmarkResponse) GoString() string {
	return s.String()
}

func (s *ExecApiSimpleauthmarkResponse) SetReqMsgId(v string) *ExecApiSimpleauthmarkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecApiSimpleauthmarkResponse) SetResultCode(v string) *ExecApiSimpleauthmarkResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecApiSimpleauthmarkResponse) SetResultMsg(v string) *ExecApiSimpleauthmarkResponse {
	s.ResultMsg = &v
	return s
}

type SubmitApiSimpleauthmarkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 打标之后的结果
	IdentityGroupList []*IdentityIdGroup `json:"identity_group_list,omitempty" xml:"identity_group_list,omitempty" require:"true" type:"Repeated"`
	// 产品类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
}

func (s SubmitApiSimpleauthmarkRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitApiSimpleauthmarkRequest) GoString() string {
	return s.String()
}

func (s *SubmitApiSimpleauthmarkRequest) SetAuthToken(v string) *SubmitApiSimpleauthmarkRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitApiSimpleauthmarkRequest) SetProductInstanceId(v string) *SubmitApiSimpleauthmarkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitApiSimpleauthmarkRequest) SetIdentityGroupList(v []*IdentityIdGroup) *SubmitApiSimpleauthmarkRequest {
	s.IdentityGroupList = v
	return s
}

func (s *SubmitApiSimpleauthmarkRequest) SetAuthType(v string) *SubmitApiSimpleauthmarkRequest {
	s.AuthType = &v
	return s
}

type SubmitApiSimpleauthmarkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitApiSimpleauthmarkResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitApiSimpleauthmarkResponse) GoString() string {
	return s.String()
}

func (s *SubmitApiSimpleauthmarkResponse) SetReqMsgId(v string) *SubmitApiSimpleauthmarkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitApiSimpleauthmarkResponse) SetResultCode(v string) *SubmitApiSimpleauthmarkResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitApiSimpleauthmarkResponse) SetResultMsg(v string) *SubmitApiSimpleauthmarkResponse {
	s.ResultMsg = &v
	return s
}

type PullApiSimpleauthmarkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用租户
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 请求id，用于幂等控制
	BizUniqueId *string `json:"biz_unique_id,omitempty" xml:"biz_unique_id,omitempty" require:"true"`
	// 产品类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
}

func (s PullApiSimpleauthmarkRequest) String() string {
	return tea.Prettify(s)
}

func (s PullApiSimpleauthmarkRequest) GoString() string {
	return s.String()
}

func (s *PullApiSimpleauthmarkRequest) SetAuthToken(v string) *PullApiSimpleauthmarkRequest {
	s.AuthToken = &v
	return s
}

func (s *PullApiSimpleauthmarkRequest) SetProductInstanceId(v string) *PullApiSimpleauthmarkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullApiSimpleauthmarkRequest) SetInstCode(v string) *PullApiSimpleauthmarkRequest {
	s.InstCode = &v
	return s
}

func (s *PullApiSimpleauthmarkRequest) SetBizUniqueId(v string) *PullApiSimpleauthmarkRequest {
	s.BizUniqueId = &v
	return s
}

func (s *PullApiSimpleauthmarkRequest) SetAuthType(v string) *PullApiSimpleauthmarkRequest {
	s.AuthType = &v
	return s
}

type PullApiSimpleauthmarkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 拉取推送系统时间
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 请求id，幂等控制
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty"`
	// 调用的租户
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty"`
	// oss文件的域名地址
	// 测试环境域名：http://invoice-oss-sit.oss-cn-hangzhou.aliyuncs.com
	// 生产环境域名：http://invoice-commercial-prod.oss-cn-hangzhou.aliyuncs.com
	// 端口是默认的80
	ResultList []*string `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
	// 解密的秘钥
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
}

func (s PullApiSimpleauthmarkResponse) String() string {
	return tea.Prettify(s)
}

func (s PullApiSimpleauthmarkResponse) GoString() string {
	return s.String()
}

func (s *PullApiSimpleauthmarkResponse) SetReqMsgId(v string) *PullApiSimpleauthmarkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetResultCode(v string) *PullApiSimpleauthmarkResponse {
	s.ResultCode = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetResultMsg(v string) *PullApiSimpleauthmarkResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetTimestamp(v string) *PullApiSimpleauthmarkResponse {
	s.Timestamp = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetBizRequestId(v string) *PullApiSimpleauthmarkResponse {
	s.BizRequestId = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetInstCode(v string) *PullApiSimpleauthmarkResponse {
	s.InstCode = &v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetResultList(v []*string) *PullApiSimpleauthmarkResponse {
	s.ResultList = v
	return s
}

func (s *PullApiSimpleauthmarkResponse) SetSecret(v string) *PullApiSimpleauthmarkResponse {
	s.Secret = &v
	return s
}

type SyncRiskEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 信贷用户的纳税人识别号或者身份证号
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 机构编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
}

func (s SyncRiskEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncRiskEvaluationRequest) GoString() string {
	return s.String()
}

func (s *SyncRiskEvaluationRequest) SetAuthToken(v string) *SyncRiskEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetProductInstanceId(v string) *SyncRiskEvaluationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetBizRequestId(v string) *SyncRiskEvaluationRequest {
	s.BizRequestId = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetIdentityId(v string) *SyncRiskEvaluationRequest {
	s.IdentityId = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetAuthType(v string) *SyncRiskEvaluationRequest {
	s.AuthType = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetOrderNo(v string) *SyncRiskEvaluationRequest {
	s.OrderNo = &v
	return s
}

func (s *SyncRiskEvaluationRequest) SetInstCode(v string) *SyncRiskEvaluationRequest {
	s.InstCode = &v
	return s
}

type SyncRiskEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1322324243	unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
	// 内容，List<JsonObject>
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s SyncRiskEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncRiskEvaluationResponse) GoString() string {
	return s.String()
}

func (s *SyncRiskEvaluationResponse) SetReqMsgId(v string) *SyncRiskEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncRiskEvaluationResponse) SetResultCode(v string) *SyncRiskEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncRiskEvaluationResponse) SetResultMsg(v string) *SyncRiskEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncRiskEvaluationResponse) SetQueryTime(v string) *SyncRiskEvaluationResponse {
	s.QueryTime = &v
	return s
}

func (s *SyncRiskEvaluationResponse) SetBizContent(v string) *SyncRiskEvaluationResponse {
	s.BizContent = &v
	return s
}

type QuerySimpleauthIdentitystateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 纳税人识别号
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 租户号
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 请求id
	BizUniqueId *string `json:"biz_unique_id,omitempty" xml:"biz_unique_id,omitempty" require:"true"`
	// 产品类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 授权编码
	AuthCode *string `json:"auth_code,omitempty" xml:"auth_code,omitempty" require:"true"`
	// 纳税人名称
	Nsrsmc *string `json:"nsrsmc,omitempty" xml:"nsrsmc,omitempty" require:"true"`
}

func (s QuerySimpleauthIdentitystateRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySimpleauthIdentitystateRequest) GoString() string {
	return s.String()
}

func (s *QuerySimpleauthIdentitystateRequest) SetAuthToken(v string) *QuerySimpleauthIdentitystateRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetProductInstanceId(v string) *QuerySimpleauthIdentitystateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetIdentity(v string) *QuerySimpleauthIdentitystateRequest {
	s.Identity = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetInstCode(v string) *QuerySimpleauthIdentitystateRequest {
	s.InstCode = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetBizUniqueId(v string) *QuerySimpleauthIdentitystateRequest {
	s.BizUniqueId = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetAuthType(v string) *QuerySimpleauthIdentitystateRequest {
	s.AuthType = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetAuthCode(v string) *QuerySimpleauthIdentitystateRequest {
	s.AuthCode = &v
	return s
}

func (s *QuerySimpleauthIdentitystateRequest) SetNsrsmc(v string) *QuerySimpleauthIdentitystateRequest {
	s.Nsrsmc = &v
	return s
}

type QuerySimpleauthIdentitystateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty"`
	// 返回结果
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QuerySimpleauthIdentitystateResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySimpleauthIdentitystateResponse) GoString() string {
	return s.String()
}

func (s *QuerySimpleauthIdentitystateResponse) SetReqMsgId(v string) *QuerySimpleauthIdentitystateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySimpleauthIdentitystateResponse) SetResultCode(v string) *QuerySimpleauthIdentitystateResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySimpleauthIdentitystateResponse) SetResultMsg(v string) *QuerySimpleauthIdentitystateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySimpleauthIdentitystateResponse) SetBizRequestId(v string) *QuerySimpleauthIdentitystateResponse {
	s.BizRequestId = &v
	return s
}

func (s *QuerySimpleauthIdentitystateResponse) SetData(v []*string) *QuerySimpleauthIdentitystateResponse {
	s.Data = v
	return s
}

type QueryPdataPersonalincomeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 身份证
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty"`
	// 授权编码
	AuthorizationCode *string `json:"authorization_code,omitempty" xml:"authorization_code,omitempty"`
	// 授权凭证
	AuthorizationCredential *string `json:"authorization_credential,omitempty" xml:"authorization_credential,omitempty"`
	// 凭证格式
	CredentialType *string `json:"credential_type,omitempty" xml:"credential_type,omitempty"`
}

func (s QueryPdataPersonalincomeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataPersonalincomeRequest) GoString() string {
	return s.String()
}

func (s *QueryPdataPersonalincomeRequest) SetAuthToken(v string) *QueryPdataPersonalincomeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetProductInstanceId(v string) *QueryPdataPersonalincomeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetBizId(v string) *QueryPdataPersonalincomeRequest {
	s.BizId = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetName(v string) *QueryPdataPersonalincomeRequest {
	s.Name = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetCertNo(v string) *QueryPdataPersonalincomeRequest {
	s.CertNo = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetPhoneNo(v string) *QueryPdataPersonalincomeRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetAuthorizationCode(v string) *QueryPdataPersonalincomeRequest {
	s.AuthorizationCode = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetAuthorizationCredential(v string) *QueryPdataPersonalincomeRequest {
	s.AuthorizationCredential = &v
	return s
}

func (s *QueryPdataPersonalincomeRequest) SetCredentialType(v string) *QueryPdataPersonalincomeRequest {
	s.CredentialType = &v
	return s
}

type QueryPdataPersonalincomeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ScoreResult *string `json:"score_result,omitempty" xml:"score_result,omitempty"`
	// 收入评分
	IncomeScore *string `json:"income_score,omitempty" xml:"income_score,omitempty"`
}

func (s QueryPdataPersonalincomeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataPersonalincomeResponse) GoString() string {
	return s.String()
}

func (s *QueryPdataPersonalincomeResponse) SetReqMsgId(v string) *QueryPdataPersonalincomeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPdataPersonalincomeResponse) SetResultCode(v string) *QueryPdataPersonalincomeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPdataPersonalincomeResponse) SetResultMsg(v string) *QueryPdataPersonalincomeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPdataPersonalincomeResponse) SetScoreResult(v string) *QueryPdataPersonalincomeResponse {
	s.ScoreResult = &v
	return s
}

func (s *QueryPdataPersonalincomeResponse) SetIncomeScore(v string) *QueryPdataPersonalincomeResponse {
	s.IncomeScore = &v
	return s
}

type QueryPdataSocialincomeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 身份证
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty"`
	// 授权编号
	AuthorizationCode *string `json:"authorization_code,omitempty" xml:"authorization_code,omitempty"`
	// 授权凭证
	AuthorizationCredential *string `json:"authorization_credential,omitempty" xml:"authorization_credential,omitempty"`
	// 凭证格式
	CredentialType *string `json:"credential_type,omitempty" xml:"credential_type,omitempty"`
}

func (s QueryPdataSocialincomeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataSocialincomeRequest) GoString() string {
	return s.String()
}

func (s *QueryPdataSocialincomeRequest) SetAuthToken(v string) *QueryPdataSocialincomeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetProductInstanceId(v string) *QueryPdataSocialincomeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetBizId(v string) *QueryPdataSocialincomeRequest {
	s.BizId = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetName(v string) *QueryPdataSocialincomeRequest {
	s.Name = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetCertNo(v string) *QueryPdataSocialincomeRequest {
	s.CertNo = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetPhoneNo(v string) *QueryPdataSocialincomeRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetAuthorizationCode(v string) *QueryPdataSocialincomeRequest {
	s.AuthorizationCode = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetAuthorizationCredential(v string) *QueryPdataSocialincomeRequest {
	s.AuthorizationCredential = &v
	return s
}

func (s *QueryPdataSocialincomeRequest) SetCredentialType(v string) *QueryPdataSocialincomeRequest {
	s.CredentialType = &v
	return s
}

type QueryPdataSocialincomeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ScoreResult *string `json:"score_result,omitempty" xml:"score_result,omitempty"`
	// 收入评分
	RangeScore *string `json:"range_score,omitempty" xml:"range_score,omitempty"`
	// 历史稳定性评估
	HistoryScore *string `json:"history_score,omitempty" xml:"history_score,omitempty"`
	// 近期稳定性评估
	StabilityScore *string `json:"stability_score,omitempty" xml:"stability_score,omitempty"`
}

func (s QueryPdataSocialincomeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataSocialincomeResponse) GoString() string {
	return s.String()
}

func (s *QueryPdataSocialincomeResponse) SetReqMsgId(v string) *QueryPdataSocialincomeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetResultCode(v string) *QueryPdataSocialincomeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetResultMsg(v string) *QueryPdataSocialincomeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetScoreResult(v string) *QueryPdataSocialincomeResponse {
	s.ScoreResult = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetRangeScore(v string) *QueryPdataSocialincomeResponse {
	s.RangeScore = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetHistoryScore(v string) *QueryPdataSocialincomeResponse {
	s.HistoryScore = &v
	return s
}

func (s *QueryPdataSocialincomeResponse) SetStabilityScore(v string) *QueryPdataSocialincomeResponse {
	s.StabilityScore = &v
	return s
}

type CheckPdataMarriageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 身份证
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 授权凭证
	AuthorizationCredential *string `json:"authorization_credential,omitempty" xml:"authorization_credential,omitempty" require:"true"`
	// 授权编号(同一机构内唯一)
	AuthorizationNo *string `json:"authorization_no,omitempty" xml:"authorization_no,omitempty" require:"true"`
	// 授权格式
	CredentialType *string `json:"credential_type,omitempty" xml:"credential_type,omitempty" require:"true"`
	// 授权有效期
	AuthorizationExpirationTime *string `json:"authorization_expiration_time,omitempty" xml:"authorization_expiration_time,omitempty"`
	// 授权对象
	AuthorizationType *string `json:"authorization_type,omitempty" xml:"authorization_type,omitempty"`
}

func (s CheckPdataMarriageRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckPdataMarriageRequest) GoString() string {
	return s.String()
}

func (s *CheckPdataMarriageRequest) SetAuthToken(v string) *CheckPdataMarriageRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetProductInstanceId(v string) *CheckPdataMarriageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetBizId(v string) *CheckPdataMarriageRequest {
	s.BizId = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetName(v string) *CheckPdataMarriageRequest {
	s.Name = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetCertNo(v string) *CheckPdataMarriageRequest {
	s.CertNo = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetAuthorizationCredential(v string) *CheckPdataMarriageRequest {
	s.AuthorizationCredential = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetAuthorizationNo(v string) *CheckPdataMarriageRequest {
	s.AuthorizationNo = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetCredentialType(v string) *CheckPdataMarriageRequest {
	s.CredentialType = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetAuthorizationExpirationTime(v string) *CheckPdataMarriageRequest {
	s.AuthorizationExpirationTime = &v
	return s
}

func (s *CheckPdataMarriageRequest) SetAuthorizationType(v string) *CheckPdataMarriageRequest {
	s.AuthorizationType = &v
	return s
}

type CheckPdataMarriageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 婚姻状况查验结果
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty"`
}

func (s CheckPdataMarriageResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckPdataMarriageResponse) GoString() string {
	return s.String()
}

func (s *CheckPdataMarriageResponse) SetReqMsgId(v string) *CheckPdataMarriageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckPdataMarriageResponse) SetResultCode(v string) *CheckPdataMarriageResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckPdataMarriageResponse) SetResultMsg(v string) *CheckPdataMarriageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckPdataMarriageResponse) SetCheckResult(v string) *CheckPdataMarriageResponse {
	s.CheckResult = &v
	return s
}

type QueryPdataRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty"`
	// 渠道编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 授权编号
	AuthorizationCode *string `json:"authorization_code,omitempty" xml:"authorization_code,omitempty"`
	// 授权凭证
	AuthorizationCredential *string `json:"authorization_credential,omitempty" xml:"authorization_credential,omitempty"`
	// 凭证格式
	CredentialType *string `json:"credential_type,omitempty" xml:"credential_type,omitempty"`
	// 主键类型
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
}

func (s QueryPdataRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryPdataRiskRequest) SetAuthToken(v string) *QueryPdataRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPdataRiskRequest) SetProductInstanceId(v string) *QueryPdataRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPdataRiskRequest) SetBizId(v string) *QueryPdataRiskRequest {
	s.BizId = &v
	return s
}

func (s *QueryPdataRiskRequest) SetName(v string) *QueryPdataRiskRequest {
	s.Name = &v
	return s
}

func (s *QueryPdataRiskRequest) SetCertNo(v string) *QueryPdataRiskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryPdataRiskRequest) SetPhoneNo(v string) *QueryPdataRiskRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryPdataRiskRequest) SetChannelCode(v string) *QueryPdataRiskRequest {
	s.ChannelCode = &v
	return s
}

func (s *QueryPdataRiskRequest) SetModelId(v string) *QueryPdataRiskRequest {
	s.ModelId = &v
	return s
}

func (s *QueryPdataRiskRequest) SetAuthorizationCode(v string) *QueryPdataRiskRequest {
	s.AuthorizationCode = &v
	return s
}

func (s *QueryPdataRiskRequest) SetAuthorizationCredential(v string) *QueryPdataRiskRequest {
	s.AuthorizationCredential = &v
	return s
}

func (s *QueryPdataRiskRequest) SetCredentialType(v string) *QueryPdataRiskRequest {
	s.CredentialType = &v
	return s
}

func (s *QueryPdataRiskRequest) SetKeyType(v string) *QueryPdataRiskRequest {
	s.KeyType = &v
	return s
}

type QueryPdataRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ScoreResult *string `json:"score_result,omitempty" xml:"score_result,omitempty"`
	// 风险评分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s QueryPdataRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPdataRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryPdataRiskResponse) SetReqMsgId(v string) *QueryPdataRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPdataRiskResponse) SetResultCode(v string) *QueryPdataRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPdataRiskResponse) SetResultMsg(v string) *QueryPdataRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPdataRiskResponse) SetScoreResult(v string) *QueryPdataRiskResponse {
	s.ScoreResult = &v
	return s
}

func (s *QueryPdataRiskResponse) SetScore(v string) *QueryPdataRiskResponse {
	s.Score = &v
	return s
}

type Client struct {
	Endpoint                *string
	RegionId                *string
	AccessKeyId             *string
	AccessKeySecret         *string
	Protocol                *string
	UserAgent               *string
	ReadTimeout             *int
	ConnectTimeout          *int
	HttpProxy               *string
	HttpsProxy              *string
	Socks5Proxy             *string
	Socks5NetWork           *string
	NoProxy                 *string
	MaxIdleConns            *int
	SecurityToken           *string
	MaxIdleTimeMillis       *int
	KeepAliveDurationMillis *int
	MaxRequests             *int
	MaxRequestsPerHost      *int
}

/**
 * Init client with Config
 * @param config config contains the necessary information to create a client
 */
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(tea.ToMap(config))) {
		_err = tea.NewSDKError(map[string]interface{}{
			"code":    "ParameterMissing",
			"message": "'config' can not be unset",
		})
		return _err
	}

	client.AccessKeyId = config.AccessKeyId
	client.AccessKeySecret = config.AccessKeySecret
	client.SecurityToken = config.SecurityToken
	client.Endpoint = config.Endpoint
	client.Protocol = config.Protocol
	client.UserAgent = config.UserAgent
	client.ReadTimeout = util.DefaultNumber(config.ReadTimeout, tea.Int(20000))
	client.ConnectTimeout = util.DefaultNumber(config.ConnectTimeout, tea.Int(20000))
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = util.DefaultNumber(config.MaxIdleConns, tea.Int(60000))
	client.MaxIdleTimeMillis = util.DefaultNumber(config.MaxIdleTimeMillis, tea.Int(5))
	client.KeepAliveDurationMillis = util.DefaultNumber(config.KeepAliveDurationMillis, tea.Int(5000))
	client.MaxRequests = util.DefaultNumber(config.MaxRequests, tea.Int(100))
	client.MaxRequestsPerHost = util.DefaultNumber(config.MaxRequestsPerHost, tea.Int(100))
	return nil
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, headers map[string]*string, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":          "retry",
		"readTimeout":        tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":     tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":          tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":         tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":            tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":       tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":  tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDuration":  tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":        tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost": tea.IntValue(client.MaxRequestsPerHost),
		"retry": map[string]interface{}{
			"retryable":   tea.BoolValue(runtime.Autoretry),
			"maxAttempts": tea.IntValue(util.DefaultNumber(runtime.MaxAttempts, tea.Int(3))),
		},
		"backoff": map[string]interface{}{
			"policy": tea.StringValue(util.DefaultString(runtime.BackoffPolicy, tea.String("no"))),
			"period": tea.IntValue(util.DefaultNumber(runtime.BackoffPeriod, tea.Int(1))),
		},
		"ignoreSSL": tea.BoolValue(runtime.IgnoreSSL),
	}

	_resp := make(map[string]interface{})
	for _retryTimes := 0; tea.BoolValue(tea.AllowRetry(_runtime["retry"], tea.Int(_retryTimes))); _retryTimes++ {
		if _retryTimes > 0 {
			_backoffTime := tea.GetBackoffTime(_runtime["backoff"], tea.Int(_retryTimes))
			if tea.IntValue(_backoffTime) > 0 {
				tea.Sleep(_backoffTime)
			}
		}

		_resp, _err = func() (map[string]interface{}, error) {
			request_ := tea.NewRequest()
			request_.Protocol = util.DefaultString(client.Protocol, protocol)
			request_.Method = method
			request_.Pathname = pathname
			request_.Query = map[string]*string{
				"method":           action,
				"version":          version,
				"sign_type":        tea.String("HmacSHA1"),
				"req_time":         antchainutil.GetTimestamp(),
				"req_msg_id":       antchainutil.GetNonce(),
				"access_key":       client.AccessKeyId,
				"base_sdk_version": tea.String("TeaSDK-2.0"),
				"sdk_version":      tea.String("1.7.12"),
				"_prod_code":       tea.String("TAX"),
				"_prod_channel":    tea.String("undefined"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("openapi.antchain.antgroup.com")),
				"user-agent": util.GetUserAgent(client.UserAgent),
			}, headers)
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = antchainutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			raw, _err := util.ReadAsString(response_.Body)
			if _err != nil {
				return _result, _err
			}

			obj := util.ParseJSON(raw)
			res, _err := util.AssertAsMap(obj)
			if _err != nil {
				return _result, _err
			}

			resp, _err := util.AssertAsMap(res["response"])
			if _err != nil {
				return _result, _err
			}

			if tea.BoolValue(antchainutil.HasError(raw, client.AccessKeySecret)) {
				_err = tea.NewSDKError(map[string]interface{}{
					"message": resp["result_msg"],
					"data":    resp,
					"code":    resp["result_code"],
				})
				return _result, _err
			}

			_result = resp
			return _result, _err
		}()
		if !tea.BoolValue(tea.Retryable(_err)) {
			break
		}
	}

	return _resp, _err
}

/**
 * Description: 目前仅用于广州区块链发票开通企业信息推送
 * Summary: 区块链发票开通企业信息推送
 */
func (client *Client) AuthCorp(request *AuthCorpRequest) (_result *AuthCorpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthCorpResponse{}
	_body, _err := client.AuthCorpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票开通企业信息推送
 * Summary: 区块链发票开通企业信息推送
 */
func (client *Client) AuthCorpEx(request *AuthCorpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthCorpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthCorpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.corp.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
 * Summary: 计费推送
 */
func (client *Client) PushCharge(request *PushChargeRequest) (_result *PushChargeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushChargeResponse{}
	_body, _err := client.PushChargeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
 * Summary: 计费推送
 */
func (client *Client) PushChargeEx(request *PushChargeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushChargeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushChargeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.charge.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询计收费授权情况
 * Summary: 查询计收费授权情况
 */
func (client *Client) QueryChargeAuth(request *QueryChargeAuthRequest) (_result *QueryChargeAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChargeAuthResponse{}
	_body, _err := client.QueryChargeAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询计收费授权情况
 * Summary: 查询计收费授权情况
 */
func (client *Client) QueryChargeAuthEx(request *QueryChargeAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChargeAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChargeAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.charge.auth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票信息推送
 * Summary:  区块链发票信息推送
 */
func (client *Client) PushIcmInvoice(request *PushIcmInvoiceRequest) (_result *PushIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushIcmInvoiceResponse{}
	_body, _err := client.PushIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票信息推送
 * Summary:  区块链发票信息推送
 */
func (client *Client) PushIcmInvoiceEx(request *PushIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
 * Summary:  区块链发票信息查询
 */
func (client *Client) QueryIcmInvoice(request *QueryIcmInvoiceRequest) (_result *QueryIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIcmInvoiceResponse{}
	_body, _err := client.QueryIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
 * Summary:  区块链发票信息查询
 */
func (client *Client) QueryIcmInvoiceEx(request *QueryIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标准发票推送
 * Summary: 标准发票推送
 */
func (client *Client) PushIcmInvoiceinfo(request *PushIcmInvoiceinfoRequest) (_result *PushIcmInvoiceinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushIcmInvoiceinfoResponse{}
	_body, _err := client.PushIcmInvoiceinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标准发票推送
 * Summary: 标准发票推送
 */
func (client *Client) PushIcmInvoiceinfoEx(request *PushIcmInvoiceinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushIcmInvoiceinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushIcmInvoiceinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoiceinfo.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
 * Summary: 获取数据的上链信息描述
 */
func (client *Client) DescribeIcmInvoice(request *DescribeIcmInvoiceRequest) (_result *DescribeIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeIcmInvoiceResponse{}
	_body, _err := client.DescribeIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
 * Summary: 获取数据的上链信息描述
 */
func (client *Client) DescribeIcmInvoiceEx(request *DescribeIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
 * Summary: 区块链银行授权接口
 */
func (client *Client) AuthIcmInvoice(request *AuthIcmInvoiceRequest) (_result *AuthIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthIcmInvoiceResponse{}
	_body, _err := client.AuthIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
 * Summary: 区块链银行授权接口
 */
func (client *Client) AuthIcmInvoiceEx(request *AuthIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人数据使用授权
 * Summary: 个人数据使用授权
 */
func (client *Client) AuthIcmRealperson(request *AuthIcmRealpersonRequest) (_result *AuthIcmRealpersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthIcmRealpersonResponse{}
	_body, _err := client.AuthIcmRealpersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人数据使用授权
 * Summary: 个人数据使用授权
 */
func (client *Client) AuthIcmRealpersonEx(request *AuthIcmRealpersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthIcmRealpersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthIcmRealpersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.realperson.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 采集，不限制同步 异步
 * Summary: 采集
 */
func (client *Client) ExecIcmSyncgathering(request *ExecIcmSyncgatheringRequest) (_result *ExecIcmSyncgatheringResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecIcmSyncgatheringResponse{}
	_body, _err := client.ExecIcmSyncgatheringEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 采集，不限制同步 异步
 * Summary: 采集
 */
func (client *Client) ExecIcmSyncgatheringEx(request *ExecIcmSyncgatheringRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecIcmSyncgatheringResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecIcmSyncgatheringResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.syncgathering.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授权模版和token
 * Summary: 获取授权模版和token
 */
func (client *Client) QueryApiAuthteplate(request *QueryApiAuthteplateRequest) (_result *QueryApiAuthteplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiAuthteplateResponse{}
	_body, _err := client.QueryApiAuthteplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权模版和token
 * Summary: 获取授权模版和token
 */
func (client *Client) QueryApiAuthteplateEx(request *QueryApiAuthteplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiAuthteplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiAuthteplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.authteplate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交
 * Summary: 提交
 */
func (client *Client) ExecApiAuthtemplate(request *ExecApiAuthtemplateRequest) (_result *ExecApiAuthtemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecApiAuthtemplateResponse{}
	_body, _err := client.ExecApiAuthtemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交
 * Summary: 提交
 */
func (client *Client) ExecApiAuthtemplateEx(request *ExecApiAuthtemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecApiAuthtemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecApiAuthtemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.authtemplate.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取要素信息
 * Summary: 获取要素信息
 */
func (client *Client) QueryApiAuthtemplatedefine(request *QueryApiAuthtemplatedefineRequest) (_result *QueryApiAuthtemplatedefineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiAuthtemplatedefineResponse{}
	_body, _err := client.QueryApiAuthtemplatedefineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取要素信息
 * Summary: 获取要素信息
 */
func (client *Client) QueryApiAuthtemplatedefineEx(request *QueryApiAuthtemplatedefineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiAuthtemplatedefineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiAuthtemplatedefineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.authtemplatedefine.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授权结果
 * Summary: 获取授权结果
 */
func (client *Client) QueryApiAuthtemplateresult(request *QueryApiAuthtemplateresultRequest) (_result *QueryApiAuthtemplateresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiAuthtemplateresultResponse{}
	_body, _err := client.QueryApiAuthtemplateresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权结果
 * Summary: 获取授权结果
 */
func (client *Client) QueryApiAuthtemplateresultEx(request *QueryApiAuthtemplateresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiAuthtemplateresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiAuthtemplateresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.authtemplateresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权
 */
func (client *Client) AuthIcmEnterprise(request *AuthIcmEnterpriseRequest) (_result *AuthIcmEnterpriseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthIcmEnterpriseResponse{}
	_body, _err := client.AuthIcmEnterpriseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权
 */
func (client *Client) AuthIcmEnterpriseEx(request *AuthIcmEnterpriseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthIcmEnterpriseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthIcmEnterpriseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.enterprise.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口为支持授权链接的生成
 * Summary: 可信授权链接获取接口
 */
func (client *Client) CreateApiAuthurl(request *CreateApiAuthurlRequest) (_result *CreateApiAuthurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiAuthurlResponse{}
	_body, _err := client.CreateApiAuthurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口为支持授权链接的生成
 * Summary: 可信授权链接获取接口
 */
func (client *Client) CreateApiAuthurlEx(request *CreateApiAuthurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiAuthurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiAuthurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.authurl.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简授权-判断该企业是否支持要素授权
 * Summary: 极简授权-判断该企业是否支持要素授权
 */
func (client *Client) MatchIcmSimpleauth(request *MatchIcmSimpleauthRequest) (_result *MatchIcmSimpleauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchIcmSimpleauthResponse{}
	_body, _err := client.MatchIcmSimpleauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简授权-判断该企业是否支持要素授权
 * Summary: 极简授权-判断该企业是否支持要素授权
 */
func (client *Client) MatchIcmSimpleauthEx(request *MatchIcmSimpleauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchIcmSimpleauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchIcmSimpleauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.simpleauth.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简授权-获取数据，用于获取指标类的数据
 * Summary: 极简授权-获取数据
 */
func (client *Client) QueryIcmSimpleauth(request *QueryIcmSimpleauthRequest) (_result *QueryIcmSimpleauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIcmSimpleauthResponse{}
	_body, _err := client.QueryIcmSimpleauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简授权-获取数据，用于获取指标类的数据
 * Summary: 极简授权-获取数据
 */
func (client *Client) QueryIcmSimpleauthEx(request *QueryIcmSimpleauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIcmSimpleauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIcmSimpleauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.simpleauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简授权异步查询接口
 * Summary: 极简授权-异步获取数据
 */
func (client *Client) QueryApiSimpleauthasync(request *QueryApiSimpleauthasyncRequest) (_result *QueryApiSimpleauthasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiSimpleauthasyncResponse{}
	_body, _err := client.QueryApiSimpleauthasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简授权异步查询接口
 * Summary: 极简授权-异步获取数据
 */
func (client *Client) QueryApiSimpleauthasyncEx(request *QueryApiSimpleauthasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiSimpleauthasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiSimpleauthasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthasync.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权接口
 */
func (client *Client) AuthRiskEvaluation(request *AuthRiskEvaluationRequest) (_result *AuthRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthRiskEvaluationResponse{}
	_body, _err := client.AuthRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权接口
 * Summary: 授权接口
 */
func (client *Client) AuthRiskEvaluationEx(request *AuthRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询
 * Summary: 查询
 */
func (client *Client) QueryRiskEvaluation(request *QueryRiskEvaluationRequest) (_result *QueryRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskEvaluationResponse{}
	_body, _err := client.QueryRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询
 * Summary: 查询
 */
func (client *Client) QueryRiskEvaluationEx(request *QueryRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简授权-异步查询数据-轮询拉取结果
 * Summary: 极简授权-异步查询数据-轮询拉取结果
 */
func (client *Client) PullApiSimpleauthasyncpolling(request *PullApiSimpleauthasyncpollingRequest) (_result *PullApiSimpleauthasyncpollingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullApiSimpleauthasyncpollingResponse{}
	_body, _err := client.PullApiSimpleauthasyncpollingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简授权-异步查询数据-轮询拉取结果
 * Summary: 极简授权-异步查询数据-轮询拉取结果
 */
func (client *Client) PullApiSimpleauthasyncpollingEx(request *PullApiSimpleauthasyncpollingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullApiSimpleauthasyncpollingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullApiSimpleauthasyncpollingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthasyncpolling.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 极简授权异步查询接口
 * Summary: 极简授权-异步获取数据
 */
func (client *Client) QueryApiSimpleauthstandard(request *QueryApiSimpleauthstandardRequest) (_result *QueryApiSimpleauthstandardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiSimpleauthstandardResponse{}
	_body, _err := client.QueryApiSimpleauthstandardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 极简授权异步查询接口
 * Summary: 极简授权-异步获取数据
 */
func (client *Client) QueryApiSimpleauthstandardEx(request *QueryApiSimpleauthstandardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiSimpleauthstandardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiSimpleauthstandardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthstandard.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 给对应的税号进行打标
 * Summary: 要素授权打标接口
 */
func (client *Client) ExecApiSimpleauthmark(request *ExecApiSimpleauthmarkRequest) (_result *ExecApiSimpleauthmarkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecApiSimpleauthmarkResponse{}
	_body, _err := client.ExecApiSimpleauthmarkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 给对应的税号进行打标
 * Summary: 要素授权打标接口
 */
func (client *Client) ExecApiSimpleauthmarkEx(request *ExecApiSimpleauthmarkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecApiSimpleauthmarkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecApiSimpleauthmarkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthmark.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交打标结果，仅限内部使用
 * Summary: 提交打标结果
 */
func (client *Client) SubmitApiSimpleauthmark(request *SubmitApiSimpleauthmarkRequest) (_result *SubmitApiSimpleauthmarkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitApiSimpleauthmarkResponse{}
	_body, _err := client.SubmitApiSimpleauthmarkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交打标结果，仅限内部使用
 * Summary: 提交打标结果
 */
func (client *Client) SubmitApiSimpleauthmarkEx(request *SubmitApiSimpleauthmarkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitApiSimpleauthmarkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitApiSimpleauthmarkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthmark.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: blockchain.tax.api.simpleauthmark.exec
 * Summary: 数据打标拉取接口
 */
func (client *Client) PullApiSimpleauthmark(request *PullApiSimpleauthmarkRequest) (_result *PullApiSimpleauthmarkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullApiSimpleauthmarkResponse{}
	_body, _err := client.PullApiSimpleauthmarkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: blockchain.tax.api.simpleauthmark.exec
 * Summary: 数据打标拉取接口
 */
func (client *Client) PullApiSimpleauthmarkEx(request *PullApiSimpleauthmarkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullApiSimpleauthmarkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullApiSimpleauthmarkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.simpleauthmark.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询-同步返回提额数据
 * Summary: 查询-同步提额数据返回
 */
func (client *Client) SyncRiskEvaluation(request *SyncRiskEvaluationRequest) (_result *SyncRiskEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncRiskEvaluationResponse{}
	_body, _err := client.SyncRiskEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询-同步返回提额数据
 * Summary: 查询-同步提额数据返回
 */
func (client *Client) SyncRiskEvaluationEx(request *SyncRiskEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncRiskEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncRiskEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.risk.evaluation.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纳税人状态查询
 * Summary: 纳税人状态查询
 */
func (client *Client) QuerySimpleauthIdentitystate(request *QuerySimpleauthIdentitystateRequest) (_result *QuerySimpleauthIdentitystateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySimpleauthIdentitystateResponse{}
	_body, _err := client.QuerySimpleauthIdentitystateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纳税人状态查询
 * Summary: 纳税人状态查询
 */
func (client *Client) QuerySimpleauthIdentitystateEx(request *QuerySimpleauthIdentitystateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySimpleauthIdentitystateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySimpleauthIdentitystateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.simpleauth.identitystate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 收入评估服务A
https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
 * Summary: 收入评估服务A
*/
func (client *Client) QueryPdataPersonalincome(request *QueryPdataPersonalincomeRequest) (_result *QueryPdataPersonalincomeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPdataPersonalincomeResponse{}
	_body, _err := client.QueryPdataPersonalincomeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 收入评估服务A
https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
 * Summary: 收入评估服务A
*/
func (client *Client) QueryPdataPersonalincomeEx(request *QueryPdataPersonalincomeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPdataPersonalincomeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPdataPersonalincomeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.pdata.personalincome.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 收入评估服务B
 * Summary: 收入评估服务B
 */
func (client *Client) QueryPdataSocialincome(request *QueryPdataSocialincomeRequest) (_result *QueryPdataSocialincomeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPdataSocialincomeResponse{}
	_body, _err := client.QueryPdataSocialincomeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 收入评估服务B
 * Summary: 收入评估服务B
 */
func (client *Client) QueryPdataSocialincomeEx(request *QueryPdataSocialincomeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPdataSocialincomeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPdataSocialincomeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.pdata.socialincome.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 婚姻状况查验服务
https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
 * Summary: 婚姻状况查验
*/
func (client *Client) CheckPdataMarriage(request *CheckPdataMarriageRequest) (_result *CheckPdataMarriageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckPdataMarriageResponse{}
	_body, _err := client.CheckPdataMarriageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 婚姻状况查验服务
https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
 * Summary: 婚姻状况查验
*/
func (client *Client) CheckPdataMarriageEx(request *CheckPdataMarriageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckPdataMarriageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckPdataMarriageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.pdata.marriage.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 断卡行动风险识别服务
 * Summary: 断卡行动风险识别服务
 */
func (client *Client) QueryPdataRisk(request *QueryPdataRiskRequest) (_result *QueryPdataRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPdataRiskResponse{}
	_body, _err := client.QueryPdataRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 断卡行动风险识别服务
 * Summary: 断卡行动风险识别服务
 */
func (client *Client) QueryPdataRiskEx(request *QueryPdataRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPdataRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPdataRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.pdata.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
