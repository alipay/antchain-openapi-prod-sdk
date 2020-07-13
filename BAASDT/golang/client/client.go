// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	alipayutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

/**
 * Model for initing client
 */
type Config struct {
	AccessKeyId     *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	SecurityToken   *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	Protocol        *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	ReadTimeout     *int    `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	ConnectTimeout  *int    `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	HttpProxy       *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	HttpsProxy      *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	Endpoint        *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	NoProxy         *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	MaxIdleConns    *int    `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	UserAgent       *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	Socks5Proxy     *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	Socks5NetWork   *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
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

// 交易日志
type LogEntry struct {
	// 交易发起方
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// log信息
	LogData *string `json:"log_data,omitempty" xml:"log_data,omitempty"`
	// 交易接受方
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 交易topic
	Topics []*string `json:"topics,omitempty" xml:"topics,omitempty" type:"Repeated"`
}

func (s LogEntry) String() string {
	return tea.Prettify(s)
}

func (s LogEntry) GoString() string {
	return s.String()
}

func (s *LogEntry) SetFrom(v string) *LogEntry {
	s.From = &v
	return s
}

func (s *LogEntry) SetLogData(v string) *LogEntry {
	s.LogData = &v
	return s
}

func (s *LogEntry) SetTo(v string) *LogEntry {
	s.To = &v
	return s
}

func (s *LogEntry) SetTopics(v []*string) *LogEntry {
	s.Topics = v
	return s
}

// 交易扩展字段
type Extension struct {
	// key
	Key *int64 `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s Extension) String() string {
	return tea.Prettify(s)
}

func (s Extension) GoString() string {
	return s.String()
}

func (s *Extension) SetKey(v int64) *Extension {
	s.Key = &v
	return s
}

func (s *Extension) SetValue(v string) *Extension {
	s.Value = &v
	return s
}

// 用户价格
type UserPrice struct {
	// 具体价格
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 相对比例
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 对租户价格(需要和当前生效价格匹配)
	SnapshotTenantPrice *string `json:"snapshot_tenant_price,omitempty" xml:"snapshot_tenant_price,omitempty"`
	// 价格类型(数值/比例)
	UserPriceType *int64 `json:"user_price_type,omitempty" xml:"user_price_type,omitempty"`
	// 租户用户价格包括费率
	UserPriceWithCommission *string `json:"user_price_with_commission,omitempty" xml:"user_price_with_commission,omitempty"`
}

func (s UserPrice) String() string {
	return tea.Prettify(s)
}

func (s UserPrice) GoString() string {
	return s.String()
}

func (s *UserPrice) SetPrice(v string) *UserPrice {
	s.Price = &v
	return s
}

func (s *UserPrice) SetRatio(v string) *UserPrice {
	s.Ratio = &v
	return s
}

func (s *UserPrice) SetSnapshotTenantPrice(v string) *UserPrice {
	s.SnapshotTenantPrice = &v
	return s
}

func (s *UserPrice) SetUserPriceType(v int64) *UserPrice {
	s.UserPriceType = &v
	return s
}

func (s *UserPrice) SetUserPriceWithCommission(v string) *UserPrice {
	s.UserPriceWithCommission = &v
	return s
}

// 交易
type BlockTransaction struct {
	// 交易信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 交易扩展信息
	Extension []*Extension `json:"extension,omitempty" xml:"extension,omitempty" type:"Repeated"`
	// 交易发起方
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// 交易gas消耗
	Gas *int64 `json:"gas,omitempty" xml:"gas,omitempty"`
	// 分组id，暂时没用
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
	// 交易哈希
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 交易随机数
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 交易时间
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// 交易签名
	Signature []*string `json:"signature,omitempty" xml:"signature,omitempty" type:"Repeated"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 交易接收方
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 2
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 交易转账金额
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
	// 2
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s BlockTransaction) String() string {
	return tea.Prettify(s)
}

func (s BlockTransaction) GoString() string {
	return s.String()
}

func (s *BlockTransaction) SetData(v string) *BlockTransaction {
	s.Data = &v
	return s
}

func (s *BlockTransaction) SetExtension(v []*Extension) *BlockTransaction {
	s.Extension = v
	return s
}

func (s *BlockTransaction) SetFrom(v string) *BlockTransaction {
	s.From = &v
	return s
}

func (s *BlockTransaction) SetGas(v int64) *BlockTransaction {
	s.Gas = &v
	return s
}

func (s *BlockTransaction) SetGroupId(v string) *BlockTransaction {
	s.GroupId = &v
	return s
}

func (s *BlockTransaction) SetHash(v string) *BlockTransaction {
	s.Hash = &v
	return s
}

func (s *BlockTransaction) SetNonce(v string) *BlockTransaction {
	s.Nonce = &v
	return s
}

func (s *BlockTransaction) SetPeriod(v int64) *BlockTransaction {
	s.Period = &v
	return s
}

func (s *BlockTransaction) SetSignature(v []*string) *BlockTransaction {
	s.Signature = v
	return s
}

func (s *BlockTransaction) SetTimestamp(v int64) *BlockTransaction {
	s.Timestamp = &v
	return s
}

func (s *BlockTransaction) SetTo(v string) *BlockTransaction {
	s.To = &v
	return s
}

func (s *BlockTransaction) SetType(v int64) *BlockTransaction {
	s.Type = &v
	return s
}

func (s *BlockTransaction) SetValue(v int64) *BlockTransaction {
	s.Value = &v
	return s
}

func (s *BlockTransaction) SetVersion(v int64) *BlockTransaction {
	s.Version = &v
	return s
}

// 交易收据
type BlockReceipt struct {
	// 使用的gas数量
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	// 收据log信息
	Logs []*LogEntry `json:"logs,omitempty" xml:"logs,omitempty" type:"Repeated"`
	// 交易输出
	Output *string `json:"output,omitempty" xml:"output,omitempty"`
	// 交易结果，0为成功
	Result *int64 `json:"result,omitempty" xml:"result,omitempty"`
}

func (s BlockReceipt) String() string {
	return tea.Prettify(s)
}

func (s BlockReceipt) GoString() string {
	return s.String()
}

func (s *BlockReceipt) SetGasUsed(v int64) *BlockReceipt {
	s.GasUsed = &v
	return s
}

func (s *BlockReceipt) SetLogs(v []*LogEntry) *BlockReceipt {
	s.Logs = v
	return s
}

func (s *BlockReceipt) SetOutput(v string) *BlockReceipt {
	s.Output = &v
	return s
}

func (s *BlockReceipt) SetResult(v int64) *BlockReceipt {
	s.Result = &v
	return s
}

// 区块体
type BlockBody struct {
	// 区块共识证明(HEX)
	ConsensusProof *string `json:"consensus_proof,omitempty" xml:"consensus_proof,omitempty"`
	// 区块中交易回执列表
	ReceiptList []*BlockReceipt `json:"receipt_list,omitempty" xml:"receipt_list,omitempty" type:"Repeated"`
	// 区块中交易列表
	TransactionList []*BlockTransaction `json:"transaction_list,omitempty" xml:"transaction_list,omitempty" type:"Repeated"`
}

func (s BlockBody) String() string {
	return tea.Prettify(s)
}

func (s BlockBody) GoString() string {
	return s.String()
}

func (s *BlockBody) SetConsensusProof(v string) *BlockBody {
	s.ConsensusProof = &v
	return s
}

func (s *BlockBody) SetReceiptList(v []*BlockReceipt) *BlockBody {
	s.ReceiptList = v
	return s
}

func (s *BlockBody) SetTransactionList(v []*BlockTransaction) *BlockBody {
	s.TransactionList = v
	return s
}

// 商户备付金账户
type Provision struct {
	// 授信上限
	CreditMax *string `json:"credit_max,omitempty" xml:"credit_max,omitempty"`
	// 授信已使用
	CreditUsed *string `json:"credit_used,omitempty" xml:"credit_used,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 余额
	Debit *string `json:"debit,omitempty" xml:"debit,omitempty"`
}

func (s Provision) String() string {
	return tea.Prettify(s)
}

func (s Provision) GoString() string {
	return s.String()
}

func (s *Provision) SetCreditMax(v string) *Provision {
	s.CreditMax = &v
	return s
}

func (s *Provision) SetCreditUsed(v string) *Provision {
	s.CreditUsed = &v
	return s
}

func (s *Provision) SetCurrency(v string) *Provision {
	s.Currency = &v
	return s
}

func (s *Provision) SetDebit(v string) *Provision {
	s.Debit = &v
	return s
}

// 权益附属信息
type EquityExtInfo struct {
	// 费率
	Commission *string `json:"commission,omitempty" xml:"commission,omitempty"`
	// 指定兑换日限制已使用
	LimitPerDayUsed *int64 `json:"limit_per_day_used,omitempty" xml:"limit_per_day_used,omitempty"`
	// 指定兑换月限制已使用
	LimitPerMonthUsed *int64 `json:"limit_per_month_used,omitempty" xml:"limit_per_month_used,omitempty"`
	// 权益开放的租户ID
	OpenToTenantId *string `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	// 指定日期
	TargetDate *string `json:"target_date,omitempty" xml:"target_date,omitempty"`
	// 权益对租户价格
	TenantPrice *string `json:"tenant_price,omitempty" xml:"tenant_price,omitempty"`
	// 租户价格包括费率
	TenantPriceWithCommission *string `json:"tenant_price_with_commission,omitempty" xml:"tenant_price_with_commission,omitempty"`
	// 授权给租户用户的价格
	TenantUserPrice *UserPrice `json:"tenant_user_price,omitempty" xml:"tenant_user_price,omitempty"`
}

func (s EquityExtInfo) String() string {
	return tea.Prettify(s)
}

func (s EquityExtInfo) GoString() string {
	return s.String()
}

func (s *EquityExtInfo) SetCommission(v string) *EquityExtInfo {
	s.Commission = &v
	return s
}

func (s *EquityExtInfo) SetLimitPerDayUsed(v int64) *EquityExtInfo {
	s.LimitPerDayUsed = &v
	return s
}

func (s *EquityExtInfo) SetLimitPerMonthUsed(v int64) *EquityExtInfo {
	s.LimitPerMonthUsed = &v
	return s
}

func (s *EquityExtInfo) SetOpenToTenantId(v string) *EquityExtInfo {
	s.OpenToTenantId = &v
	return s
}

func (s *EquityExtInfo) SetTargetDate(v string) *EquityExtInfo {
	s.TargetDate = &v
	return s
}

func (s *EquityExtInfo) SetTenantPrice(v string) *EquityExtInfo {
	s.TenantPrice = &v
	return s
}

func (s *EquityExtInfo) SetTenantPriceWithCommission(v string) *EquityExtInfo {
	s.TenantPriceWithCommission = &v
	return s
}

func (s *EquityExtInfo) SetTenantUserPrice(v *UserPrice) *EquityExtInfo {
	s.TenantUserPrice = v
	return s
}

// 权益详情
type EquityDetail struct {
	// 权益描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权益描述图片OSS地址（分号;分隔）
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 权益名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益类型
	EquityType *string `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 权益面值(元)
	EquityValue *string `json:"equity_value,omitempty" xml:"equity_value,omitempty"`
	// 权益主图片OSS地址（分号;分隔）
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 对客价(元)
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 权益SKU
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s EquityDetail) String() string {
	return tea.Prettify(s)
}

func (s EquityDetail) GoString() string {
	return s.String()
}

func (s *EquityDetail) SetDescription(v string) *EquityDetail {
	s.Description = &v
	return s
}

func (s *EquityDetail) SetDescImages(v string) *EquityDetail {
	s.DescImages = &v
	return s
}

func (s *EquityDetail) SetEquityId(v string) *EquityDetail {
	s.EquityId = &v
	return s
}

func (s *EquityDetail) SetEquityName(v string) *EquityDetail {
	s.EquityName = &v
	return s
}

func (s *EquityDetail) SetEquityType(v string) *EquityDetail {
	s.EquityType = &v
	return s
}

func (s *EquityDetail) SetEquityValue(v string) *EquityDetail {
	s.EquityValue = &v
	return s
}

func (s *EquityDetail) SetImages(v string) *EquityDetail {
	s.Images = &v
	return s
}

func (s *EquityDetail) SetPrice(v string) *EquityDetail {
	s.Price = &v
	return s
}

func (s *EquityDetail) SetSkuId(v string) *EquityDetail {
	s.SkuId = &v
	return s
}

// 资产附属信息
type AssetExtInfo struct {
	// 发放账户余额
	DispenseBalance *string `json:"dispense_balance,omitempty" xml:"dispense_balance,omitempty"`
	// 发放账户归属租户ID
	DispenseTenantId *string `json:"dispense_tenant_id,omitempty" xml:"dispense_tenant_id,omitempty"`
	// 用户账户余额
	UserCreditBalance *string `json:"user_credit_balance,omitempty" xml:"user_credit_balance,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s AssetExtInfo) String() string {
	return tea.Prettify(s)
}

func (s AssetExtInfo) GoString() string {
	return s.String()
}

func (s *AssetExtInfo) SetDispenseBalance(v string) *AssetExtInfo {
	s.DispenseBalance = &v
	return s
}

func (s *AssetExtInfo) SetDispenseTenantId(v string) *AssetExtInfo {
	s.DispenseTenantId = &v
	return s
}

func (s *AssetExtInfo) SetUserCreditBalance(v string) *AssetExtInfo {
	s.UserCreditBalance = &v
	return s
}

func (s *AssetExtInfo) SetUserId(v string) *AssetExtInfo {
	s.UserId = &v
	return s
}

// 区块头
type BlockHeader struct {
	// gas总消耗
	GasUsed *int64 `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	// 十六进制区块哈希值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// log bloom
	LogBloom *string `json:"log_bloom,omitempty" xml:"log_bloom,omitempty"`
	// 区块高度
	Number *int64 `json:"number,omitempty" xml:"number,omitempty"`
	// 十六进制区块父hash
	ParentHash *string `json:"parent_hash,omitempty" xml:"parent_hash,omitempty"`
	// 交易单据树根
	ReceiptRoot *string `json:"receipt_root,omitempty" xml:"receipt_root,omitempty"`
	// 状态树根
	StateRoot *string `json:"state_root,omitempty" xml:"state_root,omitempty"`
	// 区块时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 十六进制交易merkle树根
	TransactionRoot *string `json:"transaction_root,omitempty" xml:"transaction_root,omitempty"`
	// 区块版本
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s BlockHeader) String() string {
	return tea.Prettify(s)
}

func (s BlockHeader) GoString() string {
	return s.String()
}

func (s *BlockHeader) SetGasUsed(v int64) *BlockHeader {
	s.GasUsed = &v
	return s
}

func (s *BlockHeader) SetHash(v string) *BlockHeader {
	s.Hash = &v
	return s
}

func (s *BlockHeader) SetLogBloom(v string) *BlockHeader {
	s.LogBloom = &v
	return s
}

func (s *BlockHeader) SetNumber(v int64) *BlockHeader {
	s.Number = &v
	return s
}

func (s *BlockHeader) SetParentHash(v string) *BlockHeader {
	s.ParentHash = &v
	return s
}

func (s *BlockHeader) SetReceiptRoot(v string) *BlockHeader {
	s.ReceiptRoot = &v
	return s
}

func (s *BlockHeader) SetStateRoot(v string) *BlockHeader {
	s.StateRoot = &v
	return s
}

func (s *BlockHeader) SetTimestamp(v int64) *BlockHeader {
	s.Timestamp = &v
	return s
}

func (s *BlockHeader) SetTransactionRoot(v string) *BlockHeader {
	s.TransactionRoot = &v
	return s
}

func (s *BlockHeader) SetVersion(v int64) *BlockHeader {
	s.Version = &v
	return s
}

// 卡密信息
type Card struct {
	// 计算理论上应该变为的状态
	CalStatus *int64 `json:"cal_status,omitempty" xml:"cal_status,omitempty"`
	// 卡密ID
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	// 充值时间
	ChargeTime *int64 `json:"charge_time,omitempty" xml:"charge_time,omitempty"`
	// 数量
	CountOfMinUnit *int64 `json:"count_of_min_unit,omitempty" xml:"count_of_min_unit,omitempty"`
	// 卡密创建时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 创建卡密时的交易hash
	CreateTxHash *string `json:"create_tx_hash,omitempty" xml:"create_tx_hash,omitempty"`
	// 脱敏手机信息
	DesensitizedUid *string `json:"desensitized_uid,omitempty" xml:"desensitized_uid,omitempty"`
	// 附加信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 最小单位数量
	MinUnit *int64 `json:"min_unit,omitempty" xml:"min_unit,omitempty"`
	// 公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 公钥信息
	UidPublicKey *string `json:"uid_public_key,omitempty" xml:"uid_public_key,omitempty"`
	// 卡密在该时间后有效
	ValidAfter *int64 `json:"valid_after,omitempty" xml:"valid_after,omitempty"`
	// 卡密在该时间前有效
	ValidBefore *int64 `json:"valid_before,omitempty" xml:"valid_before,omitempty"`
	// 有效天数
	ValidDays *int64 `json:"valid_days,omitempty" xml:"valid_days,omitempty"`
	// 价值
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
	// 卡密版本
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
}

func (s Card) String() string {
	return tea.Prettify(s)
}

func (s Card) GoString() string {
	return s.String()
}

func (s *Card) SetCalStatus(v int64) *Card {
	s.CalStatus = &v
	return s
}

func (s *Card) SetCardId(v string) *Card {
	s.CardId = &v
	return s
}

func (s *Card) SetChargeTime(v int64) *Card {
	s.ChargeTime = &v
	return s
}

func (s *Card) SetCountOfMinUnit(v int64) *Card {
	s.CountOfMinUnit = &v
	return s
}

func (s *Card) SetCreateTime(v int64) *Card {
	s.CreateTime = &v
	return s
}

func (s *Card) SetCreateTxHash(v string) *Card {
	s.CreateTxHash = &v
	return s
}

func (s *Card) SetDesensitizedUid(v string) *Card {
	s.DesensitizedUid = &v
	return s
}

func (s *Card) SetExtInfo(v string) *Card {
	s.ExtInfo = &v
	return s
}

func (s *Card) SetMinUnit(v int64) *Card {
	s.MinUnit = &v
	return s
}

func (s *Card) SetPublicKey(v string) *Card {
	s.PublicKey = &v
	return s
}

func (s *Card) SetStatus(v int64) *Card {
	s.Status = &v
	return s
}

func (s *Card) SetUidPublicKey(v string) *Card {
	s.UidPublicKey = &v
	return s
}

func (s *Card) SetValidAfter(v int64) *Card {
	s.ValidAfter = &v
	return s
}

func (s *Card) SetValidBefore(v int64) *Card {
	s.ValidBefore = &v
	return s
}

func (s *Card) SetValidDays(v int64) *Card {
	s.ValidDays = &v
	return s
}

func (s *Card) SetValue(v int64) *Card {
	s.Value = &v
	return s
}

func (s *Card) SetVersion(v int64) *Card {
	s.Version = &v
	return s
}

// 商品详情
type SKUItem struct {
	// 集分宝销售费率
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty"`
	// 包含集分宝个数
	SkuAmount *int64 `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 商品名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	// 商品面值（单位：元）
	SkuPrice *string `json:"sku_price,omitempty" xml:"sku_price,omitempty"`
	// 商品状态：0可用，1冻结，2下线
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SKUItem) String() string {
	return tea.Prettify(s)
}

func (s SKUItem) GoString() string {
	return s.String()
}

func (s *SKUItem) SetRate(v string) *SKUItem {
	s.Rate = &v
	return s
}

func (s *SKUItem) SetSkuAmount(v int64) *SKUItem {
	s.SkuAmount = &v
	return s
}

func (s *SKUItem) SetSkuId(v string) *SKUItem {
	s.SkuId = &v
	return s
}

func (s *SKUItem) SetSkuName(v string) *SKUItem {
	s.SkuName = &v
	return s
}

func (s *SKUItem) SetSkuPrice(v string) *SKUItem {
	s.SkuPrice = &v
	return s
}

func (s *SKUItem) SetStatus(v int64) *SKUItem {
	s.Status = &v
	return s
}

// 手续费信息
type Commission struct {
	// 手续费生效时间（时间戳 ms）
	BeginTime *int64 `json:"begin_time,omitempty" xml:"begin_time,omitempty"`
	// 手续费
	Commission *string `json:"commission,omitempty" xml:"commission,omitempty"`
	// 手续费结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 要更新的手续费状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s Commission) String() string {
	return tea.Prettify(s)
}

func (s Commission) GoString() string {
	return s.String()
}

func (s *Commission) SetBeginTime(v int64) *Commission {
	s.BeginTime = &v
	return s
}

func (s *Commission) SetCommission(v string) *Commission {
	s.Commission = &v
	return s
}

func (s *Commission) SetEndTime(v int64) *Commission {
	s.EndTime = &v
	return s
}

func (s *Commission) SetStatus(v int64) *Commission {
	s.Status = &v
	return s
}

// 图片OSS URL，包含四个不同大小的图片
type MultiURL struct {
	// 上传的图片正常大小
	Normal *string `json:"normal,omitempty" xml:"normal,omitempty"`
	// style150
	Style150 *string `json:"style_150,omitempty" xml:"style_150,omitempty"`
	// style200
	Style200 *string `json:"style_200,omitempty" xml:"style_200,omitempty"`
	// style70
	Style70 *string `json:"style_70,omitempty" xml:"style_70,omitempty"`
}

func (s MultiURL) String() string {
	return tea.Prettify(s)
}

func (s MultiURL) GoString() string {
	return s.String()
}

func (s *MultiURL) SetNormal(v string) *MultiURL {
	s.Normal = &v
	return s
}

func (s *MultiURL) SetStyle150(v string) *MultiURL {
	s.Style150 = &v
	return s
}

func (s *MultiURL) SetStyle200(v string) *MultiURL {
	s.Style200 = &v
	return s
}

func (s *MultiURL) SetStyle70(v string) *MultiURL {
	s.Style70 = &v
	return s
}

// 权益流水
type EInstruction struct {
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产的汇率
	AssetRate *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	// 资产扣减数量(单位:个)
	DeductAssetAmount *string `json:"deduct_asset_amount,omitempty" xml:"deduct_asset_amount,omitempty"`
	// 扣减商户备付金授信额(单位:元)
	DeductCreditAmount *string `json:"deduct_credit_amount,omitempty" xml:"deduct_credit_amount,omitempty"`
	// 扣减商户备付金余额(单位:元)
	DeductDebitAmount *string `json:"deduct_debit_amount,omitempty" xml:"deduct_debit_amount,omitempty"`
	// 被扣减备付金的租户ID
	DeductTenantId *string `json:"deduct_tenant_id,omitempty" xml:"deduct_tenant_id,omitempty"`
	// 权益ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 权益名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益对用户价格(单位:元)
	EquityPrice *string `json:"equity_price,omitempty" xml:"equity_price,omitempty"`
	// 权益面值(单位:元)
	EquityValue *string `json:"equity_value,omitempty" xml:"equity_value,omitempty"`
	// 附言Deliver/Complete/OutOfStore/WriteOff)
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 发起操作的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 业务交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 对换单流水状态：
	// 0        // 权益兑换单创建
	// 1        // 权益兑换单接单
	// 2        // 权益兑换单发货
	// 3        // 权益兑换单确认收货
	// 4        // 权益兑换单缺货
	// 5        // 权益兑换单核销
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 权益归属租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 交易时间戳
	TimeStamp *int64 `json:"time_stamp,omitempty" xml:"time_stamp,omitempty"`
	// 兑换类型(商户身份/用户身份)
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 用户身份兑换/商户兑换的受益用户
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s EInstruction) String() string {
	return tea.Prettify(s)
}

func (s EInstruction) GoString() string {
	return s.String()
}

func (s *EInstruction) SetAssetId(v string) *EInstruction {
	s.AssetId = &v
	return s
}

func (s *EInstruction) SetAssetRate(v string) *EInstruction {
	s.AssetRate = &v
	return s
}

func (s *EInstruction) SetDeductAssetAmount(v string) *EInstruction {
	s.DeductAssetAmount = &v
	return s
}

func (s *EInstruction) SetDeductCreditAmount(v string) *EInstruction {
	s.DeductCreditAmount = &v
	return s
}

func (s *EInstruction) SetDeductDebitAmount(v string) *EInstruction {
	s.DeductDebitAmount = &v
	return s
}

func (s *EInstruction) SetDeductTenantId(v string) *EInstruction {
	s.DeductTenantId = &v
	return s
}

func (s *EInstruction) SetEquityId(v string) *EInstruction {
	s.EquityId = &v
	return s
}

func (s *EInstruction) SetEquityName(v string) *EInstruction {
	s.EquityName = &v
	return s
}

func (s *EInstruction) SetEquityPrice(v string) *EInstruction {
	s.EquityPrice = &v
	return s
}

func (s *EInstruction) SetEquityValue(v string) *EInstruction {
	s.EquityValue = &v
	return s
}

func (s *EInstruction) SetMemo(v string) *EInstruction {
	s.Memo = &v
	return s
}

func (s *EInstruction) SetOptTenantId(v string) *EInstruction {
	s.OptTenantId = &v
	return s
}

func (s *EInstruction) SetOutTxId(v string) *EInstruction {
	s.OutTxId = &v
	return s
}

func (s *EInstruction) SetStatus(v int64) *EInstruction {
	s.Status = &v
	return s
}

func (s *EInstruction) SetTenantId(v string) *EInstruction {
	s.TenantId = &v
	return s
}

func (s *EInstruction) SetTimeStamp(v int64) *EInstruction {
	s.TimeStamp = &v
	return s
}

func (s *EInstruction) SetType(v int64) *EInstruction {
	s.Type = &v
	return s
}

func (s *EInstruction) SetUserId(v string) *EInstruction {
	s.UserId = &v
	return s
}

// 接口白名单信息
type APIWhiteListInfo struct {
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 权限级别，暂时不用
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s APIWhiteListInfo) String() string {
	return tea.Prettify(s)
}

func (s APIWhiteListInfo) GoString() string {
	return s.String()
}

func (s *APIWhiteListInfo) SetChainId(v string) *APIWhiteListInfo {
	s.ChainId = &v
	return s
}

func (s *APIWhiteListInfo) SetExtension(v string) *APIWhiteListInfo {
	s.Extension = &v
	return s
}

func (s *APIWhiteListInfo) SetLevel(v int64) *APIWhiteListInfo {
	s.Level = &v
	return s
}

func (s *APIWhiteListInfo) SetTenantId(v string) *APIWhiteListInfo {
	s.TenantId = &v
	return s
}

func (s *APIWhiteListInfo) SetUpdateTime(v string) *APIWhiteListInfo {
	s.UpdateTime = &v
	return s
}

// 链上交易结构
type Transaction struct {
	// 交易数据，转换位十六进制
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 卡密管理员链上ID，64位十六进制。
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// 交易hash，十六进制编码
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 交易随机数
	Nonce *int64 `json:"nonce,omitempty" xml:"nonce,omitempty"`
	// 交易时间
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// from账户对应的公钥，128位十六进制。
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 交易签名，十六进制编码
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 交易目标地址，64位十六进制。
	To *string `json:"to,omitempty" xml:"to,omitempty"`
}

func (s Transaction) String() string {
	return tea.Prettify(s)
}

func (s Transaction) GoString() string {
	return s.String()
}

func (s *Transaction) SetData(v string) *Transaction {
	s.Data = &v
	return s
}

func (s *Transaction) SetFrom(v string) *Transaction {
	s.From = &v
	return s
}

func (s *Transaction) SetHash(v string) *Transaction {
	s.Hash = &v
	return s
}

func (s *Transaction) SetNonce(v int64) *Transaction {
	s.Nonce = &v
	return s
}

func (s *Transaction) SetPeriod(v int64) *Transaction {
	s.Period = &v
	return s
}

func (s *Transaction) SetPublicKey(v string) *Transaction {
	s.PublicKey = &v
	return s
}

func (s *Transaction) SetSignature(v string) *Transaction {
	s.Signature = &v
	return s
}

func (s *Transaction) SetTimestamp(v int64) *Transaction {
	s.Timestamp = &v
	return s
}

func (s *Transaction) SetTo(v string) *Transaction {
	s.To = &v
	return s
}

// 租户的备付金列表
type DiscreteValue struct {
	// 序号
	SortId *int64 `json:"sort_id,omitempty" xml:"sort_id,omitempty"`
	// 文本信息
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 文本值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s DiscreteValue) String() string {
	return tea.Prettify(s)
}

func (s DiscreteValue) GoString() string {
	return s.String()
}

func (s *DiscreteValue) SetSortId(v int64) *DiscreteValue {
	s.SortId = &v
	return s
}

func (s *DiscreteValue) SetText(v string) *DiscreteValue {
	s.Text = &v
	return s
}

func (s *DiscreteValue) SetValue(v string) *DiscreteValue {
	s.Value = &v
	return s
}

// 权益
type Equity struct {
	// 权益管理员ID
	AdminId *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	// 权益授权类型
	AuthType *int64 `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 权益锚定币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 权益默认价格
	DefaultPrice *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	// 权益描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权益描述图片OSS地址 分号分隔
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益附属信息
	EquityExtInfo *EquityExtInfo `json:"equity_ext_info,omitempty" xml:"equity_ext_info,omitempty"`
	// 权益ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 权益名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
	EquityType *string `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 权益主图片OSS地址 分号;分隔
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 是否为公开权益
	IsPublic *bool `json:"is_public,omitempty" xml:"is_public,omitempty"`
	// 商户每日兑换上限
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 商户每月兑换上限
	LimitPerMerchantAndMonth *int64 `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	// 用户每日兑换上限
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 用户每月兑换上限
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 附言
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 权益状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 权益库存
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 权益使用有效期右闭区间
	UseValidNotAfter *int64 `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 权益使用有效期左闭区间
	UseValidNotBefore *int64 `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 权益兑换有效期右闭区间
	ValidNotAfter *int64 `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 权益兑换有效期左闭区间
	ValidNotBefore *int64 `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	// 权益面值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s Equity) String() string {
	return tea.Prettify(s)
}

func (s Equity) GoString() string {
	return s.String()
}

func (s *Equity) SetAdminId(v string) *Equity {
	s.AdminId = &v
	return s
}

func (s *Equity) SetAuthType(v int64) *Equity {
	s.AuthType = &v
	return s
}

func (s *Equity) SetCurrency(v string) *Equity {
	s.Currency = &v
	return s
}

func (s *Equity) SetDefaultPrice(v string) *Equity {
	s.DefaultPrice = &v
	return s
}

func (s *Equity) SetDescription(v string) *Equity {
	s.Description = &v
	return s
}

func (s *Equity) SetDescImages(v string) *Equity {
	s.DescImages = &v
	return s
}

func (s *Equity) SetEquityExtInfo(v *EquityExtInfo) *Equity {
	s.EquityExtInfo = v
	return s
}

func (s *Equity) SetEquityId(v string) *Equity {
	s.EquityId = &v
	return s
}

func (s *Equity) SetEquityName(v string) *Equity {
	s.EquityName = &v
	return s
}

func (s *Equity) SetEquityType(v string) *Equity {
	s.EquityType = &v
	return s
}

func (s *Equity) SetImages(v string) *Equity {
	s.Images = &v
	return s
}

func (s *Equity) SetIsPublic(v bool) *Equity {
	s.IsPublic = &v
	return s
}

func (s *Equity) SetLimitPerMerchantAndDay(v int64) *Equity {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *Equity) SetLimitPerMerchantAndMonth(v int64) *Equity {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *Equity) SetLimitPerUserAndDay(v int64) *Equity {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *Equity) SetLimitPerUserAndMonth(v int64) *Equity {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *Equity) SetMemo(v string) *Equity {
	s.Memo = &v
	return s
}

func (s *Equity) SetStatus(v int64) *Equity {
	s.Status = &v
	return s
}

func (s *Equity) SetTenantId(v string) *Equity {
	s.TenantId = &v
	return s
}

func (s *Equity) SetTotalCount(v string) *Equity {
	s.TotalCount = &v
	return s
}

func (s *Equity) SetUseValidNotAfter(v int64) *Equity {
	s.UseValidNotAfter = &v
	return s
}

func (s *Equity) SetUseValidNotBefore(v int64) *Equity {
	s.UseValidNotBefore = &v
	return s
}

func (s *Equity) SetValidNotAfter(v int64) *Equity {
	s.ValidNotAfter = &v
	return s
}

func (s *Equity) SetValidNotBefore(v int64) *Equity {
	s.ValidNotBefore = &v
	return s
}

func (s *Equity) SetValue(v string) *Equity {
	s.Value = &v
	return s
}

// 区块
type Block struct {
	// 区块体
	Body *BlockBody `json:"body,omitempty" xml:"body,omitempty"`
	// 区块头
	Header *BlockHeader `json:"header,omitempty" xml:"header,omitempty"`
}

func (s Block) String() string {
	return tea.Prettify(s)
}

func (s Block) GoString() string {
	return s.String()
}

func (s *Block) SetBody(v *BlockBody) *Block {
	s.Body = v
	return s
}

func (s *Block) SetHeader(v *BlockHeader) *Block {
	s.Header = v
	return s
}

// 已授权给商户的权益信息
type OpenedEquity struct {
	// 商户管理员ID
	AdminId *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 默认价格
	DefaultPrice *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	// 权益详情
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权益详情图片
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益ID
	EquityD *string `json:"equity_d,omitempty" xml:"equity_d,omitempty"`
	// 权益名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益类型
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 权益主图片
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 是否是公开权益
	IsPublic *bool `json:"is_public,omitempty" xml:"is_public,omitempty"`
	// 每日商户对换限制
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 每月商户对换限制
	LimitPerMerchantAndMonth *int64 `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	// 每日用户对换限制
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 每月用户对换限制
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 权益附言
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 被授权的租户ID
	OpenToTenantId *string `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	// 权益状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 授权价格
	TenantPrice *string `json:"tenant_price,omitempty" xml:"tenant_price,omitempty"`
	// 库存
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 可用右区间
	UseValidNotAfter *int64 `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 可用左区间
	UseValidNotBefore *int64 `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 有效右区间
	ValidNotAfter *int64 `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 有效左时间
	ValidNotBefore *int64 `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	// 价值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s OpenedEquity) String() string {
	return tea.Prettify(s)
}

func (s OpenedEquity) GoString() string {
	return s.String()
}

func (s *OpenedEquity) SetAdminId(v string) *OpenedEquity {
	s.AdminId = &v
	return s
}

func (s *OpenedEquity) SetAuthType(v string) *OpenedEquity {
	s.AuthType = &v
	return s
}

func (s *OpenedEquity) SetCurrency(v string) *OpenedEquity {
	s.Currency = &v
	return s
}

func (s *OpenedEquity) SetDefaultPrice(v string) *OpenedEquity {
	s.DefaultPrice = &v
	return s
}

func (s *OpenedEquity) SetDescription(v string) *OpenedEquity {
	s.Description = &v
	return s
}

func (s *OpenedEquity) SetDescImages(v string) *OpenedEquity {
	s.DescImages = &v
	return s
}

func (s *OpenedEquity) SetEquityD(v string) *OpenedEquity {
	s.EquityD = &v
	return s
}

func (s *OpenedEquity) SetEquityName(v string) *OpenedEquity {
	s.EquityName = &v
	return s
}

func (s *OpenedEquity) SetEquityType(v int64) *OpenedEquity {
	s.EquityType = &v
	return s
}

func (s *OpenedEquity) SetImages(v string) *OpenedEquity {
	s.Images = &v
	return s
}

func (s *OpenedEquity) SetIsPublic(v bool) *OpenedEquity {
	s.IsPublic = &v
	return s
}

func (s *OpenedEquity) SetLimitPerMerchantAndDay(v int64) *OpenedEquity {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *OpenedEquity) SetLimitPerMerchantAndMonth(v int64) *OpenedEquity {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *OpenedEquity) SetLimitPerUserAndDay(v int64) *OpenedEquity {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *OpenedEquity) SetLimitPerUserAndMonth(v int64) *OpenedEquity {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *OpenedEquity) SetMemo(v string) *OpenedEquity {
	s.Memo = &v
	return s
}

func (s *OpenedEquity) SetOpenToTenantId(v string) *OpenedEquity {
	s.OpenToTenantId = &v
	return s
}

func (s *OpenedEquity) SetStatus(v int64) *OpenedEquity {
	s.Status = &v
	return s
}

func (s *OpenedEquity) SetTenantId(v string) *OpenedEquity {
	s.TenantId = &v
	return s
}

func (s *OpenedEquity) SetTenantPrice(v string) *OpenedEquity {
	s.TenantPrice = &v
	return s
}

func (s *OpenedEquity) SetTotalCount(v string) *OpenedEquity {
	s.TotalCount = &v
	return s
}

func (s *OpenedEquity) SetUseValidNotAfter(v int64) *OpenedEquity {
	s.UseValidNotAfter = &v
	return s
}

func (s *OpenedEquity) SetUseValidNotBefore(v int64) *OpenedEquity {
	s.UseValidNotBefore = &v
	return s
}

func (s *OpenedEquity) SetValidNotAfter(v int64) *OpenedEquity {
	s.ValidNotAfter = &v
	return s
}

func (s *OpenedEquity) SetValidNotBefore(v int64) *OpenedEquity {
	s.ValidNotBefore = &v
	return s
}

func (s *OpenedEquity) SetValue(v string) *OpenedEquity {
	s.Value = &v
	return s
}

// 资产
type Asset struct {
	// 资产管理员ID
	AdminId *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	// 资产附属信息
	AssetExtInfo *AssetExtInfo `json:"asset_ext_info,omitempty" xml:"asset_ext_info,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty"`
	// 资产汇率
	AssetRate *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 发行账户余额
	IssueAccountBalance *string `json:"issue_account_balance,omitempty" xml:"issue_account_balance,omitempty"`
	// 过期回收账户余额
	OverdueRecoveryAccountBalance *string `json:"overdue_recovery_account_balance,omitempty" xml:"overdue_recovery_account_balance,omitempty"`
	// 支付收款账户余额
	ReceivePaymentAccountBalance *string `json:"receive_payment_account_balance,omitempty" xml:"receive_payment_account_balance,omitempty"`
	// 中继账户余额
	RelayAccountBalance *string `json:"relay_account_balance,omitempty" xml:"relay_account_balance,omitempty"`
	// 资产状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 资产总发行量
	TotalIssueBalance *string `json:"total_issue_balance,omitempty" xml:"total_issue_balance,omitempty"`
}

func (s Asset) String() string {
	return tea.Prettify(s)
}

func (s Asset) GoString() string {
	return s.String()
}

func (s *Asset) SetAdminId(v string) *Asset {
	s.AdminId = &v
	return s
}

func (s *Asset) SetAssetExtInfo(v *AssetExtInfo) *Asset {
	s.AssetExtInfo = v
	return s
}

func (s *Asset) SetAssetId(v string) *Asset {
	s.AssetId = &v
	return s
}

func (s *Asset) SetAssetName(v string) *Asset {
	s.AssetName = &v
	return s
}

func (s *Asset) SetAssetRate(v string) *Asset {
	s.AssetRate = &v
	return s
}

func (s *Asset) SetCurrency(v string) *Asset {
	s.Currency = &v
	return s
}

func (s *Asset) SetIssueAccountBalance(v string) *Asset {
	s.IssueAccountBalance = &v
	return s
}

func (s *Asset) SetOverdueRecoveryAccountBalance(v string) *Asset {
	s.OverdueRecoveryAccountBalance = &v
	return s
}

func (s *Asset) SetReceivePaymentAccountBalance(v string) *Asset {
	s.ReceivePaymentAccountBalance = &v
	return s
}

func (s *Asset) SetRelayAccountBalance(v string) *Asset {
	s.RelayAccountBalance = &v
	return s
}

func (s *Asset) SetStatus(v int64) *Asset {
	s.Status = &v
	return s
}

func (s *Asset) SetTenantId(v string) *Asset {
	s.TenantId = &v
	return s
}

func (s *Asset) SetTotalIssueBalance(v string) *Asset {
	s.TotalIssueBalance = &v
	return s
}

// 代理授权关系信息
type DelegateRelationInfo struct {
	// 被代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty"`
	// 被授权的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s DelegateRelationInfo) String() string {
	return tea.Prettify(s)
}

func (s DelegateRelationInfo) GoString() string {
	return s.String()
}

func (s *DelegateRelationInfo) SetDelegatedTenantId(v string) *DelegateRelationInfo {
	s.DelegatedTenantId = &v
	return s
}

func (s *DelegateRelationInfo) SetExtension(v string) *DelegateRelationInfo {
	s.Extension = &v
	return s
}

func (s *DelegateRelationInfo) SetStatus(v bool) *DelegateRelationInfo {
	s.Status = &v
	return s
}

func (s *DelegateRelationInfo) SetTenantId(v string) *DelegateRelationInfo {
	s.TenantId = &v
	return s
}

func (s *DelegateRelationInfo) SetUpdateTime(v string) *DelegateRelationInfo {
	s.UpdateTime = &v
	return s
}

// 商户积分库和与预算库信息
type MerchantBudget struct {
	// 预算库代码
	BudgetCode *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	// 预算库描述
	BudgetDesc *string `json:"budget_desc,omitempty" xml:"budget_desc,omitempty"`
	// 预算库截止时间
	BudgetEndTime *string `json:"budget_end_time,omitempty" xml:"budget_end_time,omitempty"`
	// 预算库启用时间
	BudgetStartTime *string `json:"budget_start_time,omitempty" xml:"budget_start_time,omitempty"`
	// 积分库代码
	PointLibCode *string `json:"point_lib_code,omitempty" xml:"point_lib_code,omitempty"`
}

func (s MerchantBudget) String() string {
	return tea.Prettify(s)
}

func (s MerchantBudget) GoString() string {
	return s.String()
}

func (s *MerchantBudget) SetBudgetCode(v string) *MerchantBudget {
	s.BudgetCode = &v
	return s
}

func (s *MerchantBudget) SetBudgetDesc(v string) *MerchantBudget {
	s.BudgetDesc = &v
	return s
}

func (s *MerchantBudget) SetBudgetEndTime(v string) *MerchantBudget {
	s.BudgetEndTime = &v
	return s
}

func (s *MerchantBudget) SetBudgetStartTime(v string) *MerchantBudget {
	s.BudgetStartTime = &v
	return s
}

func (s *MerchantBudget) SetPointLibCode(v string) *MerchantBudget {
	s.PointLibCode = &v
	return s
}

// 可兑换商品列表
type ExchangeableEquityList struct {
	// 页面上数据在总数据中的结束位置（第几个数据）
	EndRow *int64 `json:"end_row,omitempty" xml:"end_row,omitempty"`
	// 权益信息列表
	EquityList []*EquityDetail `json:"equity_list,omitempty" xml:"equity_list,omitempty" type:"Repeated"`
	// 第一页页码
	FirstPage *int64 `json:"first_page,omitempty" xml:"first_page,omitempty"`
	// 是否有下一页
	HasNextPage *bool `json:"has_next_page,omitempty" xml:"has_next_page,omitempty"`
	// 是否有前一页
	HasPreviousPage *bool `json:"has_previous_page,omitempty" xml:"has_previous_page,omitempty"`
	// 是否第一页
	IsFirstPage *bool `json:"is_first_page,omitempty" xml:"is_first_page,omitempty"`
	// 是否最后一页
	IsLastPage *bool `json:"is_last_page,omitempty" xml:"is_last_page,omitempty"`
	// 最后一页页码
	LastPage *int64 `json:"last_page,omitempty" xml:"last_page,omitempty"`
	// 下一页页码
	NextPage *int64 `json:"next_page,omitempty" xml:"next_page,omitempty"`
	// 排序规则
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 可兑换的权益总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 当前页码
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 前一页页码
	PrePage *int64 `json:"pre_page,omitempty" xml:"pre_page,omitempty"`
	// 页面中实际数量
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 页面上数据在总数据中的开始位置（第几个数据）
	StartRow *int64 `json:"start_row,omitempty" xml:"start_row,omitempty"`
	// 可兑换的权益总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ExchangeableEquityList) String() string {
	return tea.Prettify(s)
}

func (s ExchangeableEquityList) GoString() string {
	return s.String()
}

func (s *ExchangeableEquityList) SetEndRow(v int64) *ExchangeableEquityList {
	s.EndRow = &v
	return s
}

func (s *ExchangeableEquityList) SetEquityList(v []*EquityDetail) *ExchangeableEquityList {
	s.EquityList = v
	return s
}

func (s *ExchangeableEquityList) SetFirstPage(v int64) *ExchangeableEquityList {
	s.FirstPage = &v
	return s
}

func (s *ExchangeableEquityList) SetHasNextPage(v bool) *ExchangeableEquityList {
	s.HasNextPage = &v
	return s
}

func (s *ExchangeableEquityList) SetHasPreviousPage(v bool) *ExchangeableEquityList {
	s.HasPreviousPage = &v
	return s
}

func (s *ExchangeableEquityList) SetIsFirstPage(v bool) *ExchangeableEquityList {
	s.IsFirstPage = &v
	return s
}

func (s *ExchangeableEquityList) SetIsLastPage(v bool) *ExchangeableEquityList {
	s.IsLastPage = &v
	return s
}

func (s *ExchangeableEquityList) SetLastPage(v int64) *ExchangeableEquityList {
	s.LastPage = &v
	return s
}

func (s *ExchangeableEquityList) SetNextPage(v int64) *ExchangeableEquityList {
	s.NextPage = &v
	return s
}

func (s *ExchangeableEquityList) SetOrderBy(v string) *ExchangeableEquityList {
	s.OrderBy = &v
	return s
}

func (s *ExchangeableEquityList) SetPages(v int64) *ExchangeableEquityList {
	s.Pages = &v
	return s
}

func (s *ExchangeableEquityList) SetPageNumber(v int64) *ExchangeableEquityList {
	s.PageNumber = &v
	return s
}

func (s *ExchangeableEquityList) SetPageSize(v int64) *ExchangeableEquityList {
	s.PageSize = &v
	return s
}

func (s *ExchangeableEquityList) SetPrePage(v int64) *ExchangeableEquityList {
	s.PrePage = &v
	return s
}

func (s *ExchangeableEquityList) SetSize(v int64) *ExchangeableEquityList {
	s.Size = &v
	return s
}

func (s *ExchangeableEquityList) SetStartRow(v int64) *ExchangeableEquityList {
	s.StartRow = &v
	return s
}

func (s *ExchangeableEquityList) SetTotal(v int64) *ExchangeableEquityList {
	s.Total = &v
	return s
}

// 查询手续费结果信息
type CommissionResult struct {
	// 手续费生效时间
	BeginTime *int64 `json:"begin_time,omitempty" xml:"begin_time,omitempty"`
	// 手续费
	Commission *string `json:"commission,omitempty" xml:"commission,omitempty"`
	// 手续费信息ID
	CommissionId *string `json:"commission_id,omitempty" xml:"commission_id,omitempty"`
	// 手续费失效时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 商品类型
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 手续费状态（0可用，1停用，2禁用）
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CommissionResult) String() string {
	return tea.Prettify(s)
}

func (s CommissionResult) GoString() string {
	return s.String()
}

func (s *CommissionResult) SetBeginTime(v int64) *CommissionResult {
	s.BeginTime = &v
	return s
}

func (s *CommissionResult) SetCommission(v string) *CommissionResult {
	s.Commission = &v
	return s
}

func (s *CommissionResult) SetCommissionId(v string) *CommissionResult {
	s.CommissionId = &v
	return s
}

func (s *CommissionResult) SetEndTime(v int64) *CommissionResult {
	s.EndTime = &v
	return s
}

func (s *CommissionResult) SetEquityType(v int64) *CommissionResult {
	s.EquityType = &v
	return s
}

func (s *CommissionResult) SetStatus(v int64) *CommissionResult {
	s.Status = &v
	return s
}

func (s *CommissionResult) SetTenantId(v string) *CommissionResult {
	s.TenantId = &v
	return s
}

// 设置过自定义价格的权益信息
type UserPriceEquity struct {
	// 权益提供商商户ID
	AdminId *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	// 授权类型
	AuthType *int64 `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 默认价格
	DefaultPrice *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	// 权益描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权益描述图片
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益ID
	EquityD *string `json:"equity_d,omitempty" xml:"equity_d,omitempty"`
	// 权益名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益类型
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 权益主图片
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 是否公开权益
	IsPublic *bool `json:"is_public,omitempty" xml:"is_public,omitempty"`
	// 商户每日兑换上线
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 商户每月兑换上线
	LimitPerMerchantAndMonth *int64 `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	// 用户每日兑换上线
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 用户每月兑换上限
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 权益附言信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 授权的租户ID
	OpenToTenantId *string `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	// 用户价格
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 用户价格比例
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 快照租户价格
	SnapshotTenantPrice *string `json:"snapshot_tenant_price,omitempty" xml:"snapshot_tenant_price,omitempty"`
	// 权益状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 权益提供商租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 权益库存
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 用户价格类型
	UserPriceType *int64 `json:"user_price_type,omitempty" xml:"user_price_type,omitempty"`
	// 可用右区间
	UseValidNotAfter *int64 `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 可用左区间
	UseValidNotBefore *int64 `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 有效右区间
	ValidNotAfter *int64 `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 有效左区间
	ValidNotBefore *int64 `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	// 价值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s UserPriceEquity) String() string {
	return tea.Prettify(s)
}

func (s UserPriceEquity) GoString() string {
	return s.String()
}

func (s *UserPriceEquity) SetAdminId(v string) *UserPriceEquity {
	s.AdminId = &v
	return s
}

func (s *UserPriceEquity) SetAuthType(v int64) *UserPriceEquity {
	s.AuthType = &v
	return s
}

func (s *UserPriceEquity) SetCurrency(v string) *UserPriceEquity {
	s.Currency = &v
	return s
}

func (s *UserPriceEquity) SetDefaultPrice(v string) *UserPriceEquity {
	s.DefaultPrice = &v
	return s
}

func (s *UserPriceEquity) SetDescription(v string) *UserPriceEquity {
	s.Description = &v
	return s
}

func (s *UserPriceEquity) SetDescImages(v string) *UserPriceEquity {
	s.DescImages = &v
	return s
}

func (s *UserPriceEquity) SetEquityD(v string) *UserPriceEquity {
	s.EquityD = &v
	return s
}

func (s *UserPriceEquity) SetEquityName(v string) *UserPriceEquity {
	s.EquityName = &v
	return s
}

func (s *UserPriceEquity) SetEquityType(v int64) *UserPriceEquity {
	s.EquityType = &v
	return s
}

func (s *UserPriceEquity) SetImages(v string) *UserPriceEquity {
	s.Images = &v
	return s
}

func (s *UserPriceEquity) SetIsPublic(v bool) *UserPriceEquity {
	s.IsPublic = &v
	return s
}

func (s *UserPriceEquity) SetLimitPerMerchantAndDay(v int64) *UserPriceEquity {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *UserPriceEquity) SetLimitPerMerchantAndMonth(v int64) *UserPriceEquity {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *UserPriceEquity) SetLimitPerUserAndDay(v int64) *UserPriceEquity {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *UserPriceEquity) SetLimitPerUserAndMonth(v int64) *UserPriceEquity {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *UserPriceEquity) SetMemo(v string) *UserPriceEquity {
	s.Memo = &v
	return s
}

func (s *UserPriceEquity) SetOpenToTenantId(v string) *UserPriceEquity {
	s.OpenToTenantId = &v
	return s
}

func (s *UserPriceEquity) SetPrice(v string) *UserPriceEquity {
	s.Price = &v
	return s
}

func (s *UserPriceEquity) SetRatio(v string) *UserPriceEquity {
	s.Ratio = &v
	return s
}

func (s *UserPriceEquity) SetSnapshotTenantPrice(v string) *UserPriceEquity {
	s.SnapshotTenantPrice = &v
	return s
}

func (s *UserPriceEquity) SetStatus(v int64) *UserPriceEquity {
	s.Status = &v
	return s
}

func (s *UserPriceEquity) SetTenantId(v string) *UserPriceEquity {
	s.TenantId = &v
	return s
}

func (s *UserPriceEquity) SetTotalCount(v string) *UserPriceEquity {
	s.TotalCount = &v
	return s
}

func (s *UserPriceEquity) SetUserPriceType(v int64) *UserPriceEquity {
	s.UserPriceType = &v
	return s
}

func (s *UserPriceEquity) SetUseValidNotAfter(v int64) *UserPriceEquity {
	s.UseValidNotAfter = &v
	return s
}

func (s *UserPriceEquity) SetUseValidNotBefore(v int64) *UserPriceEquity {
	s.UseValidNotBefore = &v
	return s
}

func (s *UserPriceEquity) SetValidNotAfter(v int64) *UserPriceEquity {
	s.ValidNotAfter = &v
	return s
}

func (s *UserPriceEquity) SetValidNotBefore(v int64) *UserPriceEquity {
	s.ValidNotBefore = &v
	return s
}

func (s *UserPriceEquity) SetValue(v string) *UserPriceEquity {
	s.Value = &v
	return s
}

// 商户
type Merchant struct {
	// 商户管理员ID
	AdminId *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	// 商户描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 商户分布式身份ID
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 资金管理员ID
	FundManagerId *string `json:"fund_manager_id,omitempty" xml:"fund_manager_id,omitempty"`
	// 是否可以发行资产
	IsAssetIssuer *bool `json:"is_asset_issuer,omitempty" xml:"is_asset_issuer,omitempty"`
	// 是否可以采购权益
	IsEquityConsumer *bool `json:"is_equity_consumer,omitempty" xml:"is_equity_consumer,omitempty"`
	// 是否可以发行权益
	IsEquityProvider *bool `json:"is_equity_provider,omitempty" xml:"is_equity_provider,omitempty"`
	// 商户的损益账户
	ProfitLossBalance *string `json:"profit_loss_balance,omitempty" xml:"profit_loss_balance,omitempty"`
	// 备付金数据
	Provision *Provision `json:"provision,omitempty" xml:"provision,omitempty"`
	// 商户状态: 0可用, 1下线, 2冻结
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s Merchant) String() string {
	return tea.Prettify(s)
}

func (s Merchant) GoString() string {
	return s.String()
}

func (s *Merchant) SetAdminId(v string) *Merchant {
	s.AdminId = &v
	return s
}

func (s *Merchant) SetDescription(v string) *Merchant {
	s.Description = &v
	return s
}

func (s *Merchant) SetDid(v string) *Merchant {
	s.Did = &v
	return s
}

func (s *Merchant) SetFundManagerId(v string) *Merchant {
	s.FundManagerId = &v
	return s
}

func (s *Merchant) SetIsAssetIssuer(v bool) *Merchant {
	s.IsAssetIssuer = &v
	return s
}

func (s *Merchant) SetIsEquityConsumer(v bool) *Merchant {
	s.IsEquityConsumer = &v
	return s
}

func (s *Merchant) SetIsEquityProvider(v bool) *Merchant {
	s.IsEquityProvider = &v
	return s
}

func (s *Merchant) SetProfitLossBalance(v string) *Merchant {
	s.ProfitLossBalance = &v
	return s
}

func (s *Merchant) SetProvision(v *Provision) *Merchant {
	s.Provision = v
	return s
}

func (s *Merchant) SetStatus(v int64) *Merchant {
	s.Status = &v
	return s
}

func (s *Merchant) SetTenantId(v string) *Merchant {
	s.TenantId = &v
	return s
}

// 用户
type User struct {
	// 用户分布式身份ID
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 用户的链外身份ID
	LocalId *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
	// 用户公钥
	Pk *string `json:"pk,omitempty" xml:"pk,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户VC
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s User) String() string {
	return tea.Prettify(s)
}

func (s User) GoString() string {
	return s.String()
}

func (s *User) SetDid(v string) *User {
	s.Did = &v
	return s
}

func (s *User) SetLocalId(v string) *User {
	s.LocalId = &v
	return s
}

func (s *User) SetPk(v string) *User {
	s.Pk = &v
	return s
}

func (s *User) SetTenantId(v string) *User {
	s.TenantId = &v
	return s
}

func (s *User) SetUserId(v string) *User {
	s.UserId = &v
	return s
}

func (s *User) SetVc(v string) *User {
	s.Vc = &v
	return s
}

type ExecAasAntdaoCardCreateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardCreateRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardCreateRequest) SetAuthToken(v string) *ExecAasAntdaoCardCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardCreateRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardCreateRequest) SetRegionName(v string) *ExecAasAntdaoCardCreateRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardCreateRequest) SetChainId(v string) *ExecAasAntdaoCardCreateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardCreateRequest) SetTx(v *Transaction) *ExecAasAntdaoCardCreateRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardCreateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 卡密ID
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	// 创建卡密的交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ExecAasAntdaoCardCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardCreateResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardCreateResponse) SetReqMsgId(v string) *ExecAasAntdaoCardCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardCreateResponse) SetResultCode(v string) *ExecAasAntdaoCardCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardCreateResponse) SetResultMsg(v string) *ExecAasAntdaoCardCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoCardCreateResponse) SetCardId(v string) *ExecAasAntdaoCardCreateResponse {
	s.CardId = &v
	return s
}

func (s *ExecAasAntdaoCardCreateResponse) SetTxHash(v string) *ExecAasAntdaoCardCreateResponse {
	s.TxHash = &v
	return s
}

type ExecAasAntdaoCardQueryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardQueryRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardQueryRequest) SetAuthToken(v string) *ExecAasAntdaoCardQueryRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardQueryRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardQueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardQueryRequest) SetRegionName(v string) *ExecAasAntdaoCardQueryRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardQueryRequest) SetChainId(v string) *ExecAasAntdaoCardQueryRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardQueryRequest) SetTx(v *Transaction) *ExecAasAntdaoCardQueryRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardQueryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 卡密信息对象
	Card *Card `json:"card,omitempty" xml:"card,omitempty"`
}

func (s ExecAasAntdaoCardQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardQueryResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardQueryResponse) SetReqMsgId(v string) *ExecAasAntdaoCardQueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardQueryResponse) SetResultCode(v string) *ExecAasAntdaoCardQueryResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardQueryResponse) SetResultMsg(v string) *ExecAasAntdaoCardQueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoCardQueryResponse) SetCard(v *Card) *ExecAasAntdaoCardQueryResponse {
	s.Card = v
	return s
}

type ExecAasAntdaoCardBindnameRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易内容
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardBindnameRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardBindnameRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardBindnameRequest) SetAuthToken(v string) *ExecAasAntdaoCardBindnameRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardBindnameRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameRequest) SetRegionName(v string) *ExecAasAntdaoCardBindnameRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameRequest) SetChainId(v string) *ExecAasAntdaoCardBindnameRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameRequest) SetTx(v *Transaction) *ExecAasAntdaoCardBindnameRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardBindnameResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardBindnameResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardBindnameResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardBindnameResponse) SetReqMsgId(v string) *ExecAasAntdaoCardBindnameResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameResponse) SetResultCode(v string) *ExecAasAntdaoCardBindnameResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardBindnameResponse) SetResultMsg(v string) *ExecAasAntdaoCardBindnameResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoCardChargeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardChargeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardChargeRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardChargeRequest) SetAuthToken(v string) *ExecAasAntdaoCardChargeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardChargeRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardChargeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeRequest) SetRegionName(v string) *ExecAasAntdaoCardChargeRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardChargeRequest) SetChainId(v string) *ExecAasAntdaoCardChargeRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeRequest) SetTx(v *Transaction) *ExecAasAntdaoCardChargeRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardChargeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardChargeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardChargeResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardChargeResponse) SetReqMsgId(v string) *ExecAasAntdaoCardChargeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeResponse) SetResultCode(v string) *ExecAasAntdaoCardChargeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardChargeResponse) SetResultMsg(v string) *ExecAasAntdaoCardChargeResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoCardWriteoffRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardWriteoffRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardWriteoffRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardWriteoffRequest) SetAuthToken(v string) *ExecAasAntdaoCardWriteoffRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardWriteoffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffRequest) SetRegionName(v string) *ExecAasAntdaoCardWriteoffRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffRequest) SetChainId(v string) *ExecAasAntdaoCardWriteoffRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffRequest) SetTx(v *Transaction) *ExecAasAntdaoCardWriteoffRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardWriteoffResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardWriteoffResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardWriteoffResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardWriteoffResponse) SetReqMsgId(v string) *ExecAasAntdaoCardWriteoffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffResponse) SetResultCode(v string) *ExecAasAntdaoCardWriteoffResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardWriteoffResponse) SetResultMsg(v string) *ExecAasAntdaoCardWriteoffResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoCardExpiredRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardExpiredRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardExpiredRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardExpiredRequest) SetAuthToken(v string) *ExecAasAntdaoCardExpiredRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardExpiredRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredRequest) SetRegionName(v string) *ExecAasAntdaoCardExpiredRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredRequest) SetChainId(v string) *ExecAasAntdaoCardExpiredRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredRequest) SetTx(v *Transaction) *ExecAasAntdaoCardExpiredRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardExpiredResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardExpiredResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardExpiredResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardExpiredResponse) SetReqMsgId(v string) *ExecAasAntdaoCardExpiredResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredResponse) SetResultCode(v string) *ExecAasAntdaoCardExpiredResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardExpiredResponse) SetResultMsg(v string) *ExecAasAntdaoCardExpiredResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoCardForbiddenRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardForbiddenRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardForbiddenRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardForbiddenRequest) SetAuthToken(v string) *ExecAasAntdaoCardForbiddenRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardForbiddenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenRequest) SetRegionName(v string) *ExecAasAntdaoCardForbiddenRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenRequest) SetChainId(v string) *ExecAasAntdaoCardForbiddenRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenRequest) SetTx(v *Transaction) *ExecAasAntdaoCardForbiddenRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardForbiddenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardForbiddenResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardForbiddenResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardForbiddenResponse) SetReqMsgId(v string) *ExecAasAntdaoCardForbiddenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenResponse) SetResultCode(v string) *ExecAasAntdaoCardForbiddenResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardForbiddenResponse) SetResultMsg(v string) *ExecAasAntdaoCardForbiddenResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoCardChargeresetRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoCardChargeresetRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardChargeresetRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardChargeresetRequest) SetAuthToken(v string) *ExecAasAntdaoCardChargeresetRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetRequest) SetProductInstanceId(v string) *ExecAasAntdaoCardChargeresetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetRequest) SetRegionName(v string) *ExecAasAntdaoCardChargeresetRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetRequest) SetChainId(v string) *ExecAasAntdaoCardChargeresetRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetRequest) SetTx(v *Transaction) *ExecAasAntdaoCardChargeresetRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoCardChargeresetResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoCardChargeresetResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoCardChargeresetResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoCardChargeresetResponse) SetReqMsgId(v string) *ExecAasAntdaoCardChargeresetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetResponse) SetResultCode(v string) *ExecAasAntdaoCardChargeresetResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoCardChargeresetResponse) SetResultMsg(v string) *ExecAasAntdaoCardChargeresetResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoMerchantUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 商户管理下的用户ID
	LocalId *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
}

func (s QueryAasAntdaoMerchantUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantUserRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantUserRequest) SetAuthToken(v string) *QueryAasAntdaoMerchantUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserRequest) SetProductInstanceId(v string) *QueryAasAntdaoMerchantUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserRequest) SetRegionName(v string) *QueryAasAntdaoMerchantUserRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserRequest) SetChainId(v string) *QueryAasAntdaoMerchantUserRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserRequest) SetLocalId(v string) *QueryAasAntdaoMerchantUserRequest {
	s.LocalId = &v
	return s
}

type QueryAasAntdaoMerchantUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户完整信息
	// {
	//             "tenant_id": "ZKUA",
	//             "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
	//             "local_id": "user01",
	//             "did": "",
	//             "vc": "",
	//             "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
	//         }
	//
	User *User `json:"user,omitempty" xml:"user,omitempty"`
}

func (s QueryAasAntdaoMerchantUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantUserResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantUserResponse) SetReqMsgId(v string) *QueryAasAntdaoMerchantUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserResponse) SetResultCode(v string) *QueryAasAntdaoMerchantUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserResponse) SetResultMsg(v string) *QueryAasAntdaoMerchantUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMerchantUserResponse) SetUser(v *User) *QueryAasAntdaoMerchantUserResponse {
	s.User = v
	return s
}

type CreateAasAntdaoMerchantUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 用户的did信息
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 用户外部ID
	LocalId *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateAasAntdaoMerchantUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantUserRequest) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantUserRequest) SetAuthToken(v string) *CreateAasAntdaoMerchantUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetProductInstanceId(v string) *CreateAasAntdaoMerchantUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetRegionName(v string) *CreateAasAntdaoMerchantUserRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetChainId(v string) *CreateAasAntdaoMerchantUserRequest {
	s.ChainId = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetDid(v string) *CreateAasAntdaoMerchantUserRequest {
	s.Did = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetLocalId(v string) *CreateAasAntdaoMerchantUserRequest {
	s.LocalId = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserRequest) SetOutTxId(v string) *CreateAasAntdaoMerchantUserRequest {
	s.OutTxId = &v
	return s
}

type CreateAasAntdaoMerchantUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAasAntdaoMerchantUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantUserResponse) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantUserResponse) SetReqMsgId(v string) *CreateAasAntdaoMerchantUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserResponse) SetResultCode(v string) *CreateAasAntdaoMerchantUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasAntdaoMerchantUserResponse) SetResultMsg(v string) *CreateAasAntdaoMerchantUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoMerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryAasAntdaoMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantRequest) SetAuthToken(v string) *QueryAasAntdaoMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMerchantRequest) SetProductInstanceId(v string) *QueryAasAntdaoMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMerchantRequest) SetRegionName(v string) *QueryAasAntdaoMerchantRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMerchantRequest) SetChainId(v string) *QueryAasAntdaoMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMerchantRequest) SetCurrency(v string) *QueryAasAntdaoMerchantRequest {
	s.Currency = &v
	return s
}

func (s *QueryAasAntdaoMerchantRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoMerchantRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryAasAntdaoMerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询商户信息时的区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 商户完整信息
	// {
	//             "tenant_id": "Z",
	//             "did": "did:mychain:ct",
	//             "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
	//             "fund_manager_id": "b7ecd55bde04827b3e611a741d",
	//             "description": "SK",
	//             "is_equity_provider": true,
	//             "is_equity_consumer": true,
	//             "is_asset_issuer": true,
	//             "status": 0,
	//             "provision": {
	//                 "currency": "CNY",
	//                 "debit": "99999999.0000",
	//                 "credit_max": "99999999.0000",
	//                 "credit_used": "0.0000"
	//             }
	//         }
	Merchant *Merchant `json:"merchant,omitempty" xml:"merchant,omitempty"`
}

func (s QueryAasAntdaoMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantResponse) SetReqMsgId(v string) *QueryAasAntdaoMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMerchantResponse) SetResultCode(v string) *QueryAasAntdaoMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMerchantResponse) SetResultMsg(v string) *QueryAasAntdaoMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMerchantResponse) SetBlockNumber(v int64) *QueryAasAntdaoMerchantResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoMerchantResponse) SetMerchant(v *Merchant) *QueryAasAntdaoMerchantResponse {
	s.Merchant = v
	return s
}

type UploadAasAntdaoImageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 图片MIME类型，目前仅支持 image/jpeg
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 图片信息（base64编码）
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
}

func (s UploadAasAntdaoImageRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAasAntdaoImageRequest) GoString() string {
	return s.String()
}

func (s *UploadAasAntdaoImageRequest) SetAuthToken(v string) *UploadAasAntdaoImageRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetProductInstanceId(v string) *UploadAasAntdaoImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetRegionName(v string) *UploadAasAntdaoImageRequest {
	s.RegionName = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetChainId(v string) *UploadAasAntdaoImageRequest {
	s.ChainId = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetContentType(v string) *UploadAasAntdaoImageRequest {
	s.ContentType = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetDelegatedTenantId(v string) *UploadAasAntdaoImageRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UploadAasAntdaoImageRequest) SetImage(v string) *UploadAasAntdaoImageRequest {
	s.Image = &v
	return s
}

type UploadAasAntdaoImageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时可访问的url，过期时间2小时
	TemporaryUrl *string `json:"temporary_url,omitempty" xml:"temporary_url,omitempty"`
	// 图片的不可访问url，发布权益时使用
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s UploadAasAntdaoImageResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAasAntdaoImageResponse) GoString() string {
	return s.String()
}

func (s *UploadAasAntdaoImageResponse) SetReqMsgId(v string) *UploadAasAntdaoImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAasAntdaoImageResponse) SetResultCode(v string) *UploadAasAntdaoImageResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAasAntdaoImageResponse) SetResultMsg(v string) *UploadAasAntdaoImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAasAntdaoImageResponse) SetTemporaryUrl(v string) *UploadAasAntdaoImageResponse {
	s.TemporaryUrl = &v
	return s
}

func (s *UploadAasAntdaoImageResponse) SetUrl(v string) *UploadAasAntdaoImageResponse {
	s.Url = &v
	return s
}

type GetAasAntdaoPkiPublickeyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户管理员/其用户的链上账户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 商户管理员/其用户归属的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s GetAasAntdaoPkiPublickeyRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAasAntdaoPkiPublickeyRequest) GoString() string {
	return s.String()
}

func (s *GetAasAntdaoPkiPublickeyRequest) SetAuthToken(v string) *GetAasAntdaoPkiPublickeyRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyRequest) SetProductInstanceId(v string) *GetAasAntdaoPkiPublickeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyRequest) SetRegionName(v string) *GetAasAntdaoPkiPublickeyRequest {
	s.RegionName = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyRequest) SetAccountId(v string) *GetAasAntdaoPkiPublickeyRequest {
	s.AccountId = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyRequest) SetOptTenantId(v string) *GetAasAntdaoPkiPublickeyRequest {
	s.OptTenantId = &v
	return s
}

type GetAasAntdaoPkiPublickeyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公钥字符串（base64）
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
}

func (s GetAasAntdaoPkiPublickeyResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAasAntdaoPkiPublickeyResponse) GoString() string {
	return s.String()
}

func (s *GetAasAntdaoPkiPublickeyResponse) SetReqMsgId(v string) *GetAasAntdaoPkiPublickeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyResponse) SetResultCode(v string) *GetAasAntdaoPkiPublickeyResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyResponse) SetResultMsg(v string) *GetAasAntdaoPkiPublickeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAasAntdaoPkiPublickeyResponse) SetPublicKey(v string) *GetAasAntdaoPkiPublickeyResponse {
	s.PublicKey = &v
	return s
}

type ExecAasAntdaoPkiEncryptRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户管理员/其用户的链上账户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 明文（base64编码）
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 商户管理员/其用户归属的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s ExecAasAntdaoPkiEncryptRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoPkiEncryptRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetAuthToken(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetProductInstanceId(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetRegionName(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetAccountId(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.AccountId = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetContent(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.Content = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptRequest) SetOptTenantId(v string) *ExecAasAntdaoPkiEncryptRequest {
	s.OptTenantId = &v
	return s
}

type ExecAasAntdaoPkiEncryptResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 密文 base64编码
	EncryptedContent *string `json:"encrypted_content,omitempty" xml:"encrypted_content,omitempty"`
}

func (s ExecAasAntdaoPkiEncryptResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoPkiEncryptResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoPkiEncryptResponse) SetReqMsgId(v string) *ExecAasAntdaoPkiEncryptResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptResponse) SetResultCode(v string) *ExecAasAntdaoPkiEncryptResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptResponse) SetResultMsg(v string) *ExecAasAntdaoPkiEncryptResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoPkiEncryptResponse) SetEncryptedContent(v string) *ExecAasAntdaoPkiEncryptResponse {
	s.EncryptedContent = &v
	return s
}

type ExecAasAntdaoPkiDecryptRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 商户管理员/其用户的链上账户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 密文（base64）
	EncryptedContent *string `json:"encrypted_content,omitempty" xml:"encrypted_content,omitempty"`
}

func (s ExecAasAntdaoPkiDecryptRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoPkiDecryptRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetAuthToken(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetProductInstanceId(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetRegionName(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetAccountId(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.AccountId = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetDelegatedTenantId(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptRequest) SetEncryptedContent(v string) *ExecAasAntdaoPkiDecryptRequest {
	s.EncryptedContent = &v
	return s
}

type ExecAasAntdaoPkiDecryptResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 明文
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ExecAasAntdaoPkiDecryptResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoPkiDecryptResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoPkiDecryptResponse) SetReqMsgId(v string) *ExecAasAntdaoPkiDecryptResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptResponse) SetResultCode(v string) *ExecAasAntdaoPkiDecryptResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptResponse) SetResultMsg(v string) *ExecAasAntdaoPkiDecryptResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoPkiDecryptResponse) SetContent(v string) *ExecAasAntdaoPkiDecryptResponse {
	s.Content = &v
	return s
}

type UpdateAasAntdaoMerchantFriendRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 友好商户租户ID
	FriendTenantId *string `json:"friend_tenant_id,omitempty" xml:"friend_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 更新类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s UpdateAasAntdaoMerchantFriendRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoMerchantFriendRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetAuthToken(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetProductInstanceId(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetRegionName(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetChainId(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetFriendTenantId(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.FriendTenantId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetOutTxId(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendRequest) SetType(v string) *UpdateAasAntdaoMerchantFriendRequest {
	s.Type = &v
	return s
}

type UpdateAasAntdaoMerchantFriendResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoMerchantFriendResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoMerchantFriendResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoMerchantFriendResponse) SetReqMsgId(v string) *UpdateAasAntdaoMerchantFriendResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendResponse) SetResultCode(v string) *UpdateAasAntdaoMerchantFriendResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoMerchantFriendResponse) SetResultMsg(v string) *UpdateAasAntdaoMerchantFriendResponse {
	s.ResultMsg = &v
	return s
}

type CreateAasAntdaoEquityRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权类型 0 Auto，1Contract
	AuthType *int64 `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 结算币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 权益价格（单位：元）
	DefaultPrice *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品详情信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益商品名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
	IfPublic *bool `json:"if_public,omitempty" xml:"if_public,omitempty"`
	// 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 商户每日兑换上限
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 商户每月兑换上限
	LimitPerMerchantAndMonth *int64 `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	// 用户每日兑换上限
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 用户每月兑换上限
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
	// - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 权益商品库存数量
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 权益商品使用有效期右闭区间（毫秒）
	UseValidNotAfter *int64 `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 权益商品使用有效期左闭区间（毫秒）
	UseValidNotBefore *int64 `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 权益商品兑换有效期右闭区间（毫秒）
	ValidNotAfter *int64 `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 权益商品兑换有效期左闭区间（毫秒）
	ValidNotBefore *int64 `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	// 权益商品面值（单位：元）
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s CreateAasAntdaoEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoEquityRequest) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoEquityRequest) SetAuthToken(v string) *CreateAasAntdaoEquityRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetProductInstanceId(v string) *CreateAasAntdaoEquityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetRegionName(v string) *CreateAasAntdaoEquityRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetAuthType(v int64) *CreateAasAntdaoEquityRequest {
	s.AuthType = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetChainId(v string) *CreateAasAntdaoEquityRequest {
	s.ChainId = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetCurrency(v string) *CreateAasAntdaoEquityRequest {
	s.Currency = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetDefaultPrice(v string) *CreateAasAntdaoEquityRequest {
	s.DefaultPrice = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetDelegatedTenantId(v string) *CreateAasAntdaoEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetDescription(v string) *CreateAasAntdaoEquityRequest {
	s.Description = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetDescImages(v string) *CreateAasAntdaoEquityRequest {
	s.DescImages = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetEquityName(v string) *CreateAasAntdaoEquityRequest {
	s.EquityName = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetEquityType(v int64) *CreateAasAntdaoEquityRequest {
	s.EquityType = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetIfPublic(v bool) *CreateAasAntdaoEquityRequest {
	s.IfPublic = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetImages(v string) *CreateAasAntdaoEquityRequest {
	s.Images = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetLimitPerMerchantAndDay(v int64) *CreateAasAntdaoEquityRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetLimitPerMerchantAndMonth(v int64) *CreateAasAntdaoEquityRequest {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetLimitPerUserAndDay(v int64) *CreateAasAntdaoEquityRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetLimitPerUserAndMonth(v int64) *CreateAasAntdaoEquityRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetMemo(v string) *CreateAasAntdaoEquityRequest {
	s.Memo = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetOutTxId(v string) *CreateAasAntdaoEquityRequest {
	s.OutTxId = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetTotalCount(v string) *CreateAasAntdaoEquityRequest {
	s.TotalCount = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetUseValidNotAfter(v int64) *CreateAasAntdaoEquityRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetUseValidNotBefore(v int64) *CreateAasAntdaoEquityRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetValidNotAfter(v int64) *CreateAasAntdaoEquityRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetValidNotBefore(v int64) *CreateAasAntdaoEquityRequest {
	s.ValidNotBefore = &v
	return s
}

func (s *CreateAasAntdaoEquityRequest) SetValue(v string) *CreateAasAntdaoEquityRequest {
	s.Value = &v
	return s
}

type CreateAasAntdaoEquityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求ID，用于查询异步发布权益结果
	CreateEquityRequestId *string `json:"create_equity_request_id,omitempty" xml:"create_equity_request_id,omitempty"`
}

func (s CreateAasAntdaoEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoEquityResponse) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoEquityResponse) SetReqMsgId(v string) *CreateAasAntdaoEquityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasAntdaoEquityResponse) SetResultCode(v string) *CreateAasAntdaoEquityResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasAntdaoEquityResponse) SetResultMsg(v string) *CreateAasAntdaoEquityResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAasAntdaoEquityResponse) SetCreateEquityRequestId(v string) *CreateAasAntdaoEquityResponse {
	s.CreateEquityRequestId = &v
	return s
}

type OfflineAasAntdaoEquityRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s OfflineAasAntdaoEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineAasAntdaoEquityRequest) GoString() string {
	return s.String()
}

func (s *OfflineAasAntdaoEquityRequest) SetAuthToken(v string) *OfflineAasAntdaoEquityRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineAasAntdaoEquityRequest) SetProductInstanceId(v string) *OfflineAasAntdaoEquityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineAasAntdaoEquityRequest) SetRegionName(v string) *OfflineAasAntdaoEquityRequest {
	s.RegionName = &v
	return s
}

func (s *OfflineAasAntdaoEquityRequest) SetChainId(v string) *OfflineAasAntdaoEquityRequest {
	s.ChainId = &v
	return s
}

func (s *OfflineAasAntdaoEquityRequest) SetEquityId(v string) *OfflineAasAntdaoEquityRequest {
	s.EquityId = &v
	return s
}

func (s *OfflineAasAntdaoEquityRequest) SetOutTxId(v string) *OfflineAasAntdaoEquityRequest {
	s.OutTxId = &v
	return s
}

type OfflineAasAntdaoEquityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OfflineAasAntdaoEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineAasAntdaoEquityResponse) GoString() string {
	return s.String()
}

func (s *OfflineAasAntdaoEquityResponse) SetReqMsgId(v string) *OfflineAasAntdaoEquityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineAasAntdaoEquityResponse) SetResultCode(v string) *OfflineAasAntdaoEquityResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineAasAntdaoEquityResponse) SetResultMsg(v string) *OfflineAasAntdaoEquityResponse {
	s.ResultMsg = &v
	return s
}

type FreezeAasAntdaoEquityRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s FreezeAasAntdaoEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s FreezeAasAntdaoEquityRequest) GoString() string {
	return s.String()
}

func (s *FreezeAasAntdaoEquityRequest) SetAuthToken(v string) *FreezeAasAntdaoEquityRequest {
	s.AuthToken = &v
	return s
}

func (s *FreezeAasAntdaoEquityRequest) SetProductInstanceId(v string) *FreezeAasAntdaoEquityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FreezeAasAntdaoEquityRequest) SetRegionName(v string) *FreezeAasAntdaoEquityRequest {
	s.RegionName = &v
	return s
}

func (s *FreezeAasAntdaoEquityRequest) SetChainId(v string) *FreezeAasAntdaoEquityRequest {
	s.ChainId = &v
	return s
}

func (s *FreezeAasAntdaoEquityRequest) SetEquityId(v string) *FreezeAasAntdaoEquityRequest {
	s.EquityId = &v
	return s
}

func (s *FreezeAasAntdaoEquityRequest) SetOutTxId(v string) *FreezeAasAntdaoEquityRequest {
	s.OutTxId = &v
	return s
}

type FreezeAasAntdaoEquityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FreezeAasAntdaoEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s FreezeAasAntdaoEquityResponse) GoString() string {
	return s.String()
}

func (s *FreezeAasAntdaoEquityResponse) SetReqMsgId(v string) *FreezeAasAntdaoEquityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FreezeAasAntdaoEquityResponse) SetResultCode(v string) *FreezeAasAntdaoEquityResponse {
	s.ResultCode = &v
	return s
}

func (s *FreezeAasAntdaoEquityResponse) SetResultMsg(v string) *FreezeAasAntdaoEquityResponse {
	s.ResultMsg = &v
	return s
}

type OpenAasAntdaoEquityMerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 被授权的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 更新操作，添加或者删除
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s OpenAasAntdaoEquityMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenAasAntdaoEquityMerchantRequest) GoString() string {
	return s.String()
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetAuthToken(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetProductInstanceId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetRegionName(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.RegionName = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetChainId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetDelegatedTenantId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetEquityId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.EquityId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetOptTenantId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.OptTenantId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetOptType(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.OptType = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantRequest) SetOutTxId(v string) *OpenAasAntdaoEquityMerchantRequest {
	s.OutTxId = &v
	return s
}

type OpenAasAntdaoEquityMerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OpenAasAntdaoEquityMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenAasAntdaoEquityMerchantResponse) GoString() string {
	return s.String()
}

func (s *OpenAasAntdaoEquityMerchantResponse) SetReqMsgId(v string) *OpenAasAntdaoEquityMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantResponse) SetResultCode(v string) *OpenAasAntdaoEquityMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenAasAntdaoEquityMerchantResponse) SetResultMsg(v string) *OpenAasAntdaoEquityMerchantResponse {
	s.ResultMsg = &v
	return s
}

type AuthAasAntdaoEquityMerchantuserpriceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户兑换价格（单位：元）。价格和比例二选一，且只能填写一个。
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 操作用户
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 比例。价格和比例二选一，且只能填写一个。
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
}

func (s AuthAasAntdaoEquityMerchantuserpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAasAntdaoEquityMerchantuserpriceRequest) GoString() string {
	return s.String()
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetAuthToken(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetProductInstanceId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetRegionName(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.RegionName = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetAmount(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.Amount = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetChainId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.ChainId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetDelegatedTenantId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetEquityId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.EquityId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetOptTenantId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.OptTenantId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetOutTxId(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.OutTxId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceRequest) SetRatio(v string) *AuthAasAntdaoEquityMerchantuserpriceRequest {
	s.Ratio = &v
	return s
}

type AuthAasAntdaoEquityMerchantuserpriceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthAasAntdaoEquityMerchantuserpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAasAntdaoEquityMerchantuserpriceResponse) GoString() string {
	return s.String()
}

func (s *AuthAasAntdaoEquityMerchantuserpriceResponse) SetReqMsgId(v string) *AuthAasAntdaoEquityMerchantuserpriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceResponse) SetResultCode(v string) *AuthAasAntdaoEquityMerchantuserpriceResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAasAntdaoEquityMerchantuserpriceResponse) SetResultMsg(v string) *AuthAasAntdaoEquityMerchantuserpriceResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoEquityDefaultpriceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 价格
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateAasAntdaoEquityDefaultpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityDefaultpriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetRegionName(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetAmount(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.Amount = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetChainId(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetEquityId(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityDefaultpriceRequest {
	s.OutTxId = &v
	return s
}

type UpdateAasAntdaoEquityDefaultpriceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityDefaultpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityDefaultpriceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityDefaultpriceResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityDefaultpriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceResponse) SetResultCode(v string) *UpdateAasAntdaoEquityDefaultpriceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityDefaultpriceResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityDefaultpriceResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoEquityTenantpriceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 价格（单位：元）
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 定向价格租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateAasAntdaoEquityTenantpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityTenantpriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetRegionName(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetAmount(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.Amount = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetChainId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetEquityId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetOptTenantId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityTenantpriceRequest {
	s.OutTxId = &v
	return s
}

type UpdateAasAntdaoEquityTenantpriceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityTenantpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityTenantpriceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityTenantpriceResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityTenantpriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceResponse) SetResultCode(v string) *UpdateAasAntdaoEquityTenantpriceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityTenantpriceResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityTenantpriceResponse {
	s.ResultMsg = &v
	return s
}

type AddAasAntdaoEquityCountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 权益库存数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s AddAasAntdaoEquityCountRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAasAntdaoEquityCountRequest) GoString() string {
	return s.String()
}

func (s *AddAasAntdaoEquityCountRequest) SetAuthToken(v string) *AddAasAntdaoEquityCountRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetProductInstanceId(v string) *AddAasAntdaoEquityCountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetRegionName(v string) *AddAasAntdaoEquityCountRequest {
	s.RegionName = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetAmount(v int64) *AddAasAntdaoEquityCountRequest {
	s.Amount = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetChainId(v string) *AddAasAntdaoEquityCountRequest {
	s.ChainId = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetDelegatedTenantId(v string) *AddAasAntdaoEquityCountRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetEquityId(v string) *AddAasAntdaoEquityCountRequest {
	s.EquityId = &v
	return s
}

func (s *AddAasAntdaoEquityCountRequest) SetOutTxId(v string) *AddAasAntdaoEquityCountRequest {
	s.OutTxId = &v
	return s
}

type AddAasAntdaoEquityCountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddAasAntdaoEquityCountResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAasAntdaoEquityCountResponse) GoString() string {
	return s.String()
}

func (s *AddAasAntdaoEquityCountResponse) SetReqMsgId(v string) *AddAasAntdaoEquityCountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAasAntdaoEquityCountResponse) SetResultCode(v string) *AddAasAntdaoEquityCountResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAasAntdaoEquityCountResponse) SetResultMsg(v string) *AddAasAntdaoEquityCountResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoEquityExchangelimitRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 商户每日兑换上限
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 商户每月兑换上限
	LimitPerMerchantAndMontn *int64 `json:"limit_per_merchant_and_montn,omitempty" xml:"limit_per_merchant_and_montn,omitempty"`
	// 用户每日兑换上限
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 用户每月兑换上限
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateAasAntdaoEquityExchangelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityExchangelimitRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetRegionName(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetChainId(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetEquityId(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetLimitPerMerchantAndDay(v int64) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetLimitPerMerchantAndMontn(v int64) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.LimitPerMerchantAndMontn = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetLimitPerUserAndDay(v int64) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetLimitPerUserAndMonth(v int64) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityExchangelimitRequest {
	s.OutTxId = &v
	return s
}

type UpdateAasAntdaoEquityExchangelimitResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityExchangelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityExchangelimitResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityExchangelimitResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityExchangelimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitResponse) SetResultCode(v string) *UpdateAasAntdaoEquityExchangelimitResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityExchangelimitResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityExchangelimitResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoEquityValidtimeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 权益商品使用有效期右闭区间
	UseValidNotAfter *string `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 权益商品使用有效期左闭区间
	UseValidNotBefore *string `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 权益商品兑换有效期右闭区间
	ValidNotAfter *string `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 权益商品兑换有效期左闭区间
	ValidNotBefore *string `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
}

func (s UpdateAasAntdaoEquityValidtimeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityValidtimeRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetRegionName(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetChainId(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetEquityId(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetUseValidNotAfter(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetUseValidNotBefore(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetValidNotAfter(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeRequest) SetValidNotBefore(v string) *UpdateAasAntdaoEquityValidtimeRequest {
	s.ValidNotBefore = &v
	return s
}

type UpdateAasAntdaoEquityValidtimeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityValidtimeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityValidtimeResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityValidtimeResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityValidtimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeResponse) SetResultCode(v string) *UpdateAasAntdaoEquityValidtimeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityValidtimeResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityValidtimeResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoEquityRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 被检索商户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 交易限制日期(yyyyMMdd或yyyyMM)(可选)
	TargetDate *string `json:"target_date,omitempty" xml:"target_date,omitempty"`
	// 被检索用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryAasAntdaoEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityRequest) SetAuthToken(v string) *QueryAasAntdaoEquityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetProductInstanceId(v string) *QueryAasAntdaoEquityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetRegionName(v string) *QueryAasAntdaoEquityRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetChainId(v string) *QueryAasAntdaoEquityRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetEquityId(v string) *QueryAasAntdaoEquityRequest {
	s.EquityId = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetOptTenantId(v string) *QueryAasAntdaoEquityRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetTargetDate(v string) *QueryAasAntdaoEquityRequest {
	s.TargetDate = &v
	return s
}

func (s *QueryAasAntdaoEquityRequest) SetUserId(v string) *QueryAasAntdaoEquityRequest {
	s.UserId = &v
	return s
}

type QueryAasAntdaoEquityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益商品完整信息: equityType 权益类型：0积分，1卡券，2实物。 status 权益状态：0可用状态，1下线，2冻结。 authType 权益授权类型：0自动，1合约。
	//  { "equity_id": "6041f851f4d", "tenant_id": "ZEJEZKUA", "admin_id": "ed7b3ac3c061", "equity_type": 1, "equity_name": "FDCardtest", "description": "FDCard", "total_count": "1000000", "status": 0, "auth_type": 0, "currency": "CNY", "value": "10.0000", "default_price": "1.0000", "images": "oss://myexchange/12593acf32dd6d4257fa0.jpeg", "desc_images": "", "memo": "", "is_public": true, "valid_not_before": 112692, "valid_not_after": 112654365244, "use_valid_not_before": 112612, "use_valid_not_after": 11265436524415235, "limit_per_user_and_day": 1000000, "limit_per_user_and_month": 100000, "limit_per_merchant_and_day": 1000000, "limit_per_merchant_and_month": 1000000, "equity_ext_info": { "open_to_tenant_id": "", "tenant_price": "", "tenant_user_price": { "snapshot_tenant_price": "", "user_price_type": 0, "price": "", "ratio": "" }, "target_date": "", "limit_per_day_used": 0, "limit_per_month_used": 0 } }
	Equity *Equity `json:"equity,omitempty" xml:"equity,omitempty"`
	// 权益图片的永久oss地址
	Urls []*string `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityResponse) SetReqMsgId(v string) *QueryAasAntdaoEquityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoEquityResponse) SetResultCode(v string) *QueryAasAntdaoEquityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoEquityResponse) SetResultMsg(v string) *QueryAasAntdaoEquityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoEquityResponse) SetEquity(v *Equity) *QueryAasAntdaoEquityResponse {
	s.Equity = v
	return s
}

func (s *QueryAasAntdaoEquityResponse) SetUrls(v []*string) *QueryAasAntdaoEquityResponse {
	s.Urls = v
	return s
}

type ExecAasAntdaoExchangeByuserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产发行方
	AssetIssuer *string `json:"asset_issuer,omitempty" xml:"asset_issuer,omitempty"`
	// 期望资产汇率
	AssetRate *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理操作专用，要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 权益商品提供方ID
	EquityProvider *string `json:"equity_provider,omitempty" xml:"equity_provider,omitempty"`
	// 期望权益汇率
	EquityRate *string `json:"equity_rate,omitempty" xml:"equity_rate,omitempty"`
	// 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoExchangeByuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeByuserRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetRegionName(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetAssetId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetAssetIssuer(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.AssetIssuer = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetAssetRate(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.AssetRate = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetChainId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetDelegatedTenantId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetEquityId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetEquityProvider(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.EquityProvider = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetEquityRate(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.EquityRate = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetMemo(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserRequest) SetUserId(v string) *ExecAasAntdaoExchangeByuserRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoExchangeByuserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeByuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeByuserResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeByuserResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeByuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserResponse) SetResultCode(v string) *ExecAasAntdaoExchangeByuserResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeByuserResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeByuserResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoExchangeBymerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 当前希望按照上述比例扣减用户资产
	AssetRate *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 期望权益商品价格（单位：元）
	EquityPrice *string `json:"equity_price,omitempty" xml:"equity_price,omitempty"`
	// 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	// 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 权益商品兑换外部流水ID，调用方自定义流水ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
	TxSig *string `json:"tx_sig,omitempty" xml:"tx_sig,omitempty"`
	// 受益用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoExchangeBymerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeBymerchantRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetRegionName(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetAssetId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetAssetRate(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.AssetRate = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetChainId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetEquityId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetEquityPrice(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.EquityPrice = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetMemo(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetTxSig(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.TxSig = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantRequest) SetUserId(v string) *ExecAasAntdaoExchangeBymerchantRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoExchangeBymerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeBymerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeBymerchantResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeBymerchantResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeBymerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantResponse) SetResultCode(v string) *ExecAasAntdaoExchangeBymerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeBymerchantResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeBymerchantResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmAasAntdaoExchangeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 附言。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ConfirmAasAntdaoExchangeRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAasAntdaoExchangeRequest) GoString() string {
	return s.String()
}

func (s *ConfirmAasAntdaoExchangeRequest) SetAuthToken(v string) *ConfirmAasAntdaoExchangeRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetProductInstanceId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetRegionName(v string) *ConfirmAasAntdaoExchangeRequest {
	s.RegionName = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetChainId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.ChainId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetDelegatedTenantId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetEquityId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.EquityId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetMemo(v string) *ConfirmAasAntdaoExchangeRequest {
	s.Memo = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetOriginTxId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.OriginTxId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeRequest) SetOutTxId(v string) *ConfirmAasAntdaoExchangeRequest {
	s.OutTxId = &v
	return s
}

type ConfirmAasAntdaoExchangeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmAasAntdaoExchangeResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAasAntdaoExchangeResponse) GoString() string {
	return s.String()
}

func (s *ConfirmAasAntdaoExchangeResponse) SetReqMsgId(v string) *ConfirmAasAntdaoExchangeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeResponse) SetResultCode(v string) *ConfirmAasAntdaoExchangeResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeResponse) SetResultMsg(v string) *ConfirmAasAntdaoExchangeResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoExchangeOutofstoreRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 缺货时通知给采购方的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoExchangeOutofstoreRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeOutofstoreRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetRegionName(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetChainId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetDelegatedTenantId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetEquityId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetMemo(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetOriginTxId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeOutofstoreRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoExchangeOutofstoreResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeOutofstoreResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeOutofstoreResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeOutofstoreResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeOutofstoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreResponse) SetResultCode(v string) *ExecAasAntdaoExchangeOutofstoreResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeOutofstoreResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeOutofstoreResponse {
	s.ResultMsg = &v
	return s
}

type SendAasAntdaoExchangeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SendAasAntdaoExchangeRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAasAntdaoExchangeRequest) GoString() string {
	return s.String()
}

func (s *SendAasAntdaoExchangeRequest) SetAuthToken(v string) *SendAasAntdaoExchangeRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetProductInstanceId(v string) *SendAasAntdaoExchangeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetRegionName(v string) *SendAasAntdaoExchangeRequest {
	s.RegionName = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetChainId(v string) *SendAasAntdaoExchangeRequest {
	s.ChainId = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetDelegatedTenantId(v string) *SendAasAntdaoExchangeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetEquityId(v string) *SendAasAntdaoExchangeRequest {
	s.EquityId = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetMemo(v string) *SendAasAntdaoExchangeRequest {
	s.Memo = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetOriginTxId(v string) *SendAasAntdaoExchangeRequest {
	s.OriginTxId = &v
	return s
}

func (s *SendAasAntdaoExchangeRequest) SetOutTxId(v string) *SendAasAntdaoExchangeRequest {
	s.OutTxId = &v
	return s
}

type SendAasAntdaoExchangeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendAasAntdaoExchangeResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAasAntdaoExchangeResponse) GoString() string {
	return s.String()
}

func (s *SendAasAntdaoExchangeResponse) SetReqMsgId(v string) *SendAasAntdaoExchangeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAasAntdaoExchangeResponse) SetResultCode(v string) *SendAasAntdaoExchangeResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAasAntdaoExchangeResponse) SetResultMsg(v string) *SendAasAntdaoExchangeResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoExchangeReceivebyuserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoExchangeReceivebyuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeReceivebyuserRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetRegionName(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetChainId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetDelegatedTenantId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetMemo(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetOriginTxId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserRequest) SetUserId(v string) *ExecAasAntdaoExchangeReceivebyuserRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoExchangeReceivebyuserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeReceivebyuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeReceivebyuserResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeReceivebyuserResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeReceivebyuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserResponse) SetResultCode(v string) *ExecAasAntdaoExchangeReceivebyuserResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebyuserResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeReceivebyuserResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetExpireRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资产过期信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 过期的交易ID
	OriginalTxId *string `json:"original_tx_id,omitempty" xml:"original_tx_id,omitempty"`
	// 外部交易ID，每个租户保证唯一
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoAssetExpireRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetExpireRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetExpireRequest) SetAuthToken(v string) *ExecAasAntdaoAssetExpireRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetRegionName(v string) *ExecAasAntdaoAssetExpireRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetAmount(v int64) *ExecAasAntdaoAssetExpireRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetAssetId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetChainId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetInfo(v string) *ExecAasAntdaoAssetExpireRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetOriginalTxId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.OriginalTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetOutTxId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireRequest) SetUserId(v string) *ExecAasAntdaoAssetExpireRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoAssetExpireResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetExpireResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetExpireResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetExpireResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetExpireResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireResponse) SetResultCode(v string) *ExecAasAntdaoAssetExpireResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetExpireResponse) SetResultMsg(v string) *ExecAasAntdaoAssetExpireResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoAssetInstructionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资产流水ID
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryAasAntdaoAssetInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoAssetInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoAssetInstructionRequest) SetAuthToken(v string) *QueryAasAntdaoAssetInstructionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionRequest) SetProductInstanceId(v string) *QueryAasAntdaoAssetInstructionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionRequest) SetRegionName(v string) *QueryAasAntdaoAssetInstructionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionRequest) SetChainId(v string) *QueryAasAntdaoAssetInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionRequest) SetOriginTxId(v string) *QueryAasAntdaoAssetInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryAasAntdaoAssetInstructionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产流水完整信息的json字符串。
	// direction 交易方向:：0正向交易，1反向交易。
	// type 交易类型：0 资产发行；1资产赎回；2资产发放；3资产发放回退；4资产风控调整；5资产过期；6资产支付；7资产支付退款。
	// status流水状态(Complete)；0完成
	Instruction *string `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryAasAntdaoAssetInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoAssetInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoAssetInstructionResponse) SetReqMsgId(v string) *QueryAasAntdaoAssetInstructionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionResponse) SetResultCode(v string) *QueryAasAntdaoAssetInstructionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionResponse) SetResultMsg(v string) *QueryAasAntdaoAssetInstructionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoAssetInstructionResponse) SetInstruction(v string) *QueryAasAntdaoAssetInstructionResponse {
	s.Instruction = &v
	return s
}

type QueryAasAntdaoExchangeInstructionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 发起操作的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryAasAntdaoExchangeInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoExchangeInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetAuthToken(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetProductInstanceId(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetRegionName(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetChainId(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetEquityId(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.EquityId = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetOptTenantId(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionRequest) SetOriginTxId(v string) *QueryAasAntdaoExchangeInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryAasAntdaoExchangeInstructionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益兑换流水完整信息
	Instruction *EInstruction `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryAasAntdaoExchangeInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoExchangeInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoExchangeInstructionResponse) SetReqMsgId(v string) *QueryAasAntdaoExchangeInstructionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionResponse) SetResultCode(v string) *QueryAasAntdaoExchangeInstructionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionResponse) SetResultMsg(v string) *QueryAasAntdaoExchangeInstructionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoExchangeInstructionResponse) SetInstruction(v *EInstruction) *QueryAasAntdaoExchangeInstructionResponse {
	s.Instruction = v
	return s
}

type ExecAasAntdaoAssetIssueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 充值数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 备注信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 充值租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoAssetIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetIssueRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetIssueRequest) SetAuthToken(v string) *ExecAasAntdaoAssetIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetRegionName(v string) *ExecAasAntdaoAssetIssueRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetAmount(v int64) *ExecAasAntdaoAssetIssueRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetAssetId(v string) *ExecAasAntdaoAssetIssueRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetChainId(v string) *ExecAasAntdaoAssetIssueRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetInfo(v string) *ExecAasAntdaoAssetIssueRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetOptTenantId(v string) *ExecAasAntdaoAssetIssueRequest {
	s.OptTenantId = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueRequest) SetOutTxId(v string) *ExecAasAntdaoAssetIssueRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoAssetIssueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetIssueResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetIssueResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueResponse) SetResultCode(v string) *ExecAasAntdaoAssetIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetIssueResponse) SetResultMsg(v string) *ExecAasAntdaoAssetIssueResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetRedeemRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 赎回数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 备注信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 要赎回的充值交易ID
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoAssetRedeemRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetRedeemRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetAuthToken(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetRegionName(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetAmount(v int64) *ExecAasAntdaoAssetRedeemRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetAssetId(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetChainId(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetInfo(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetOriginTxId(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemRequest) SetOutTxId(v string) *ExecAasAntdaoAssetRedeemRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoAssetRedeemResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetRedeemResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetRedeemResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetRedeemResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetRedeemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemResponse) SetResultCode(v string) *ExecAasAntdaoAssetRedeemResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetRedeemResponse) SetResultMsg(v string) *ExecAasAntdaoAssetRedeemResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetGrantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 数量
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资产发放信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 商户ID
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 有效时间
	ValidityTime *string `json:"validity_time,omitempty" xml:"validity_time,omitempty"`
}

func (s ExecAasAntdaoAssetGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGrantRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGrantRequest) SetAuthToken(v string) *ExecAasAntdaoAssetGrantRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetRegionName(v string) *ExecAasAntdaoAssetGrantRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetAmount(v string) *ExecAasAntdaoAssetGrantRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetAssetId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetChainId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetInfo(v string) *ExecAasAntdaoAssetGrantRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetMerchantId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.MerchantId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetOutTxId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetUserId(v string) *ExecAasAntdaoAssetGrantRequest {
	s.UserId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantRequest) SetValidityTime(v string) *ExecAasAntdaoAssetGrantRequest {
	s.ValidityTime = &v
	return s
}

type ExecAasAntdaoAssetGrantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGrantResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGrantResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetGrantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantResponse) SetResultCode(v string) *ExecAasAntdaoAssetGrantResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantResponse) SetResultMsg(v string) *ExecAasAntdaoAssetGrantResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetGrantrefundRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 备注信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 要回退的交易ID
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoAssetGrantrefundRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGrantrefundRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetAuthToken(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetRegionName(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetAmount(v int64) *ExecAasAntdaoAssetGrantrefundRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetAssetId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetChainId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetInfo(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetOriginTxId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetOutTxId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundRequest) SetUserId(v string) *ExecAasAntdaoAssetGrantrefundRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoAssetGrantrefundResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetGrantrefundResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGrantrefundResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGrantrefundResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetGrantrefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundResponse) SetResultCode(v string) *ExecAasAntdaoAssetGrantrefundResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetGrantrefundResponse) SetResultMsg(v string) *ExecAasAntdaoAssetGrantrefundResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetAdjustRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 风控调整数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 风控调整信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 外部交易ID，每个租户保证唯一
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAasAntdaoAssetAdjustRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetAdjustRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetAuthToken(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetRegionName(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetAmount(v int64) *ExecAasAntdaoAssetAdjustRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetAssetId(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetChainId(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetInfo(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.Info = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetOutTxId(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustRequest) SetUserId(v string) *ExecAasAntdaoAssetAdjustRequest {
	s.UserId = &v
	return s
}

type ExecAasAntdaoAssetAdjustResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetAdjustResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetAdjustResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetAdjustResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetAdjustResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustResponse) SetResultCode(v string) *ExecAasAntdaoAssetAdjustResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetAdjustResponse) SetResultMsg(v string) *ExecAasAntdaoAssetAdjustResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoAssetRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资产查询相关的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 若要查询用户持有的资产数量，输入用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryAasAntdaoAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoAssetRequest) SetAuthToken(v string) *QueryAasAntdaoAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetProductInstanceId(v string) *QueryAasAntdaoAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetRegionName(v string) *QueryAasAntdaoAssetRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetAssetId(v string) *QueryAasAntdaoAssetRequest {
	s.AssetId = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetChainId(v string) *QueryAasAntdaoAssetRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetOptTenantId(v string) *QueryAasAntdaoAssetRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAasAntdaoAssetRequest) SetUserId(v string) *QueryAasAntdaoAssetRequest {
	s.UserId = &v
	return s
}

type QueryAasAntdaoAssetResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产完整信息
	// {
	//             "asset_id": "CT::Asset001",
	//             "asset_name": "CTPoints",
	//             "tenant_id": "OREDKOCN",
	//             "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
	//             "currency": "CNY",
	//             "asset_rate": "1000.0000",
	//             "total_issue_balance": "11111111.0000",
	//             "issue_account_balance": "0.0000",
	//             "relay_Account_balance": "0.0000",
	//             "receive_payment_account_balance": "0.0000",
	//             "overdue_recovery_account_balance": "",
	//             "status": 76,
	//             "asset_ext_info": {
	//                 "dispense_tenant_id": "",
	//                 "dispense_balance": "",
	//                 "user_id": "",
	//                 "user_credit_balance": ""
	//             }
	//         }
	Asset *Asset `json:"asset,omitempty" xml:"asset,omitempty"`
}

func (s QueryAasAntdaoAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoAssetResponse) SetReqMsgId(v string) *QueryAasAntdaoAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoAssetResponse) SetResultCode(v string) *QueryAasAntdaoAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoAssetResponse) SetResultMsg(v string) *QueryAasAntdaoAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoAssetResponse) SetAsset(v *Asset) *QueryAasAntdaoAssetResponse {
	s.Asset = v
	return s
}

type ExecAasAntdaoExchangeReceivebymerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoExchangeReceivebymerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeReceivebymerchantRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetRegionName(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetChainId(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetEquityId(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetMemo(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetOriginTxId(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeReceivebymerchantRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoExchangeReceivebymerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeReceivebymerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeReceivebymerchantResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeReceivebymerchantResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeReceivebymerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantResponse) SetResultCode(v string) *ExecAasAntdaoExchangeReceivebymerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeReceivebymerchantResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeReceivebymerchantResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoBlockRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryAasAntdaoBlockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockRequest) SetAuthToken(v string) *QueryAasAntdaoBlockRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockRequest) SetRegionName(v string) *QueryAasAntdaoBlockRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockRequest) SetBlockNumber(v int64) *QueryAasAntdaoBlockRequest {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoBlockRequest) SetChainId(v string) *QueryAasAntdaoBlockRequest {
	s.ChainId = &v
	return s
}

type QueryAasAntdaoBlockResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块信息
	Block *Block `json:"block,omitempty" xml:"block,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 过滤后的交易数量
	FilteredTxCount *int64 `json:"filtered_tx_count,omitempty" xml:"filtered_tx_count,omitempty"`
	// 区块中交易总数
	TotalTxCount *int64 `json:"total_tx_count,omitempty" xml:"total_tx_count,omitempty"`
}

func (s QueryAasAntdaoBlockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetResultCode(v string) *QueryAasAntdaoBlockResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetResultMsg(v string) *QueryAasAntdaoBlockResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetBlock(v *Block) *QueryAasAntdaoBlockResponse {
	s.Block = v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetBlockNumber(v int64) *QueryAasAntdaoBlockResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetChainId(v string) *QueryAasAntdaoBlockResponse {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetFilteredTxCount(v int64) *QueryAasAntdaoBlockResponse {
	s.FilteredTxCount = &v
	return s
}

func (s *QueryAasAntdaoBlockResponse) SetTotalTxCount(v int64) *QueryAasAntdaoBlockResponse {
	s.TotalTxCount = &v
	return s
}

type QueryAasAntdaoBlockLastblocknumberRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryAasAntdaoBlockLastblocknumberRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockLastblocknumberRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockLastblocknumberRequest) SetAuthToken(v string) *QueryAasAntdaoBlockLastblocknumberRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockLastblocknumberRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberRequest) SetRegionName(v string) *QueryAasAntdaoBlockLastblocknumberRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberRequest) SetChainId(v string) *QueryAasAntdaoBlockLastblocknumberRequest {
	s.ChainId = &v
	return s
}

type QueryAasAntdaoBlockLastblocknumberResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 最新区块高度
	LastBlockNumber *int64 `json:"last_block_number,omitempty" xml:"last_block_number,omitempty"`
}

func (s QueryAasAntdaoBlockLastblocknumberResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockLastblocknumberResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockLastblocknumberResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockLastblocknumberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberResponse) SetResultCode(v string) *QueryAasAntdaoBlockLastblocknumberResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberResponse) SetResultMsg(v string) *QueryAasAntdaoBlockLastblocknumberResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockLastblocknumberResponse) SetLastBlockNumber(v int64) *QueryAasAntdaoBlockLastblocknumberResponse {
	s.LastBlockNumber = &v
	return s
}

type UpdateAasAntdaoEquityRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 授权类型：0 Auto，1 Contract
	AuthType *int64 `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 货币类型
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 默认价格（单位：元）
	DefaultPrice *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	// 要代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品详细描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 描述图片信息(;分隔)
	DescImages *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 权益商品名称
	EquityName *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	// 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 权益商品是否公开
	IfPublic *bool `json:"if_public,omitempty" xml:"if_public,omitempty"`
	// 主图片信息(;分隔)
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 商户每日兑换上限
	LimitPerMerchantAndDay *int64 `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	// 商户每月兑换上限
	LimitPerMerchantAndMonth *int64 `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	// 用户每日兑换上限
	LimitPerUserAndDay *int64 `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	// 用户每月兑换上限
	LimitPerUserAndMonth *int64 `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	// 附言
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 库存
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 权益商品使用有效期右闭区间
	UseValidNotAfter *int64 `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	// 权益商品使用有效期左闭区间
	UseValidNotBefore *int64 `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	// 权益商品兑换有效期右闭区间
	ValidNotAfter *int64 `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	// 权益商品兑换有效期左闭区间
	ValidNotBefore *int64 `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	// 面值（单位：元）
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s UpdateAasAntdaoEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetRegionName(v string) *UpdateAasAntdaoEquityRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetAuthType(v int64) *UpdateAasAntdaoEquityRequest {
	s.AuthType = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetChainId(v string) *UpdateAasAntdaoEquityRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetCurrency(v string) *UpdateAasAntdaoEquityRequest {
	s.Currency = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetDefaultPrice(v string) *UpdateAasAntdaoEquityRequest {
	s.DefaultPrice = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetDescription(v string) *UpdateAasAntdaoEquityRequest {
	s.Description = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetDescImages(v string) *UpdateAasAntdaoEquityRequest {
	s.DescImages = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetEquityId(v string) *UpdateAasAntdaoEquityRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetEquityName(v string) *UpdateAasAntdaoEquityRequest {
	s.EquityName = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetEquityType(v int64) *UpdateAasAntdaoEquityRequest {
	s.EquityType = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetIfPublic(v bool) *UpdateAasAntdaoEquityRequest {
	s.IfPublic = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetImages(v string) *UpdateAasAntdaoEquityRequest {
	s.Images = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetLimitPerMerchantAndDay(v int64) *UpdateAasAntdaoEquityRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetLimitPerMerchantAndMonth(v int64) *UpdateAasAntdaoEquityRequest {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetLimitPerUserAndDay(v int64) *UpdateAasAntdaoEquityRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetLimitPerUserAndMonth(v int64) *UpdateAasAntdaoEquityRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetMemo(v string) *UpdateAasAntdaoEquityRequest {
	s.Memo = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetTotalCount(v string) *UpdateAasAntdaoEquityRequest {
	s.TotalCount = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetUseValidNotAfter(v int64) *UpdateAasAntdaoEquityRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetUseValidNotBefore(v int64) *UpdateAasAntdaoEquityRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetValidNotAfter(v int64) *UpdateAasAntdaoEquityRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetValidNotBefore(v int64) *UpdateAasAntdaoEquityRequest {
	s.ValidNotBefore = &v
	return s
}

func (s *UpdateAasAntdaoEquityRequest) SetValue(v string) *UpdateAasAntdaoEquityRequest {
	s.Value = &v
	return s
}

type UpdateAasAntdaoEquityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityResponse) SetResultCode(v string) *UpdateAasAntdaoEquityResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoEquityCreateresultRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 异步发布权益结果查询ID
	CreateEquityRequestId *string `json:"create_equity_request_id,omitempty" xml:"create_equity_request_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryAasAntdaoEquityCreateresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityCreateresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetAuthToken(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetProductInstanceId(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetRegionName(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetChainId(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetCreateEquityRequestId(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.CreateEquityRequestId = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoEquityCreateresultRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryAasAntdaoEquityCreateresultResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益商品创建成功，返回权益ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
}

func (s QueryAasAntdaoEquityCreateresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityCreateresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityCreateresultResponse) SetReqMsgId(v string) *QueryAasAntdaoEquityCreateresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultResponse) SetResultCode(v string) *QueryAasAntdaoEquityCreateresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultResponse) SetResultMsg(v string) *QueryAasAntdaoEquityCreateresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoEquityCreateresultResponse) SetEquityId(v string) *QueryAasAntdaoEquityCreateresultResponse {
	s.EquityId = &v
	return s
}

type QueryAasAntdaoEquityInstructionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理该租户调用接口，会使用该租户发送交易链上查询信息
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 发起操作的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 要查询的流水交易号
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryAasAntdaoEquityInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetAuthToken(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetProductInstanceId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetRegionName(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetChainId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetEquityId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.EquityId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetOptTenantId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionRequest) SetOriginTxId(v string) *QueryAasAntdaoEquityInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryAasAntdaoEquityInstructionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品兑换流水信息
	Instruction *EInstruction `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryAasAntdaoEquityInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoEquityInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoEquityInstructionResponse) SetReqMsgId(v string) *QueryAasAntdaoEquityInstructionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionResponse) SetResultCode(v string) *QueryAasAntdaoEquityInstructionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionResponse) SetResultMsg(v string) *QueryAasAntdaoEquityInstructionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoEquityInstructionResponse) SetInstruction(v *EInstruction) *QueryAasAntdaoEquityInstructionResponse {
	s.Instruction = v
	return s
}

type QueryAasAntdaoImageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 要查询的图片数组，填入不可访问的url
	Urls []*string `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoImageRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoImageRequest) SetAuthToken(v string) *QueryAasAntdaoImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoImageRequest) SetProductInstanceId(v string) *QueryAasAntdaoImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoImageRequest) SetRegionName(v string) *QueryAasAntdaoImageRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoImageRequest) SetUrls(v []*string) *QueryAasAntdaoImageRequest {
	s.Urls = v
	return s
}

type QueryAasAntdaoImageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时可访问的oss图片链接，每张图片会返回四个url，对应原图和不同的比例缩小，每一张图片的四个url用;隔开。
	Urls []*MultiURL `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoImageResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoImageResponse) SetReqMsgId(v string) *QueryAasAntdaoImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoImageResponse) SetResultCode(v string) *QueryAasAntdaoImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoImageResponse) SetResultMsg(v string) *QueryAasAntdaoImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoImageResponse) SetUrls(v []*MultiURL) *QueryAasAntdaoImageResponse {
	s.Urls = v
	return s
}

type UpdateAasAntdaoEquityStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 权益状态：0可用，1下线，2冻结
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UpdateAasAntdaoEquityStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetAuthToken(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetProductInstanceId(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetRegionName(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetChainId(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetEquityId(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetOutTxId(v string) *UpdateAasAntdaoEquityStatusRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusRequest) SetStatus(v int64) *UpdateAasAntdaoEquityStatusRequest {
	s.Status = &v
	return s
}

type UpdateAasAntdaoEquityStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoEquityStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoEquityStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoEquityStatusResponse) SetReqMsgId(v string) *UpdateAasAntdaoEquityStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusResponse) SetResultCode(v string) *UpdateAasAntdaoEquityStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoEquityStatusResponse) SetResultMsg(v string) *UpdateAasAntdaoEquityStatusResponse {
	s.ResultMsg = &v
	return s
}

type SetAasAntdaoMerchantProvisionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 新的授信上限（单位：元）
	CreditMaxAmount *string `json:"credit_max_amount,omitempty" xml:"credit_max_amount,omitempty"`
	// 新的授信已使用数额（单位：元）
	CreditUsedAmount *string `json:"credit_used_amount,omitempty" xml:"credit_used_amount,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 新的备付金余额（单位：元）
	DebitAmount *string `json:"debit_amount,omitempty" xml:"debit_amount,omitempty"`
	// 要设置备付金的商户租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 初始的授信上限（单位：元）
	OriginalCreditMaxAmount *string `json:"original_credit_max_amount,omitempty" xml:"original_credit_max_amount,omitempty"`
	// 初始的授信已使用数额（单位：元）
	OriginalCreditUsedAmount *string `json:"original_credit_used_amount,omitempty" xml:"original_credit_used_amount,omitempty"`
	// 初始的备付金余额（单位：元）
	OriginalDebitAmount *string `json:"original_debit_amount,omitempty" xml:"original_debit_amount,omitempty"`
	// 外部交易ID（确保幂等）
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetAasAntdaoMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetAuthToken(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetProductInstanceId(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetRegionName(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.RegionName = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetChainId(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetCreditMaxAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.CreditMaxAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetCreditUsedAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.CreditUsedAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetCurrency(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetDebitAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.DebitAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetOptTenantId(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetOriginalCreditMaxAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.OriginalCreditMaxAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetOriginalCreditUsedAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.OriginalCreditUsedAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetOriginalDebitAmount(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.OriginalDebitAmount = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionRequest) SetOutTxId(v string) *SetAasAntdaoMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type SetAasAntdaoMerchantProvisionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SetAasAntdaoMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoMerchantProvisionResponse) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoMerchantProvisionResponse) SetReqMsgId(v string) *SetAasAntdaoMerchantProvisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionResponse) SetResultCode(v string) *SetAasAntdaoMerchantProvisionResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAasAntdaoMerchantProvisionResponse) SetResultMsg(v string) *SetAasAntdaoMerchantProvisionResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoMerchantProvisionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 更新授信上限
	CreditMaxAmount *string `json:"credit_max_amount,omitempty" xml:"credit_max_amount,omitempty"`
	// 更新授信已使用数额
	CreditUsedAmount *string `json:"credit_used_amount,omitempty" xml:"credit_used_amount,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 更新余额
	DebitAmount *string `json:"debit_amount,omitempty" xml:"debit_amount,omitempty"`
	// 要设置备付金的商户租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 操作类型，ADD表示增加，SUB表示减少
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateAasAntdaoMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetAuthToken(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetProductInstanceId(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetRegionName(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetChainId(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetCreditMaxAmount(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.CreditMaxAmount = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetCreditUsedAmount(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.CreditUsedAmount = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetCurrency(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetDebitAmount(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.DebitAmount = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetOptTenantId(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetOptType(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.OptType = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionRequest) SetOutTxId(v string) *UpdateAasAntdaoMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type UpdateAasAntdaoMerchantProvisionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoMerchantProvisionResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoMerchantProvisionResponse) SetReqMsgId(v string) *UpdateAasAntdaoMerchantProvisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionResponse) SetResultCode(v string) *UpdateAasAntdaoMerchantProvisionResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoMerchantProvisionResponse) SetResultMsg(v string) *UpdateAasAntdaoMerchantProvisionResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoEquityInstructionwriteoffRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品ID
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 附言
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 兑换交易ID
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoEquityInstructionwriteoffRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoEquityInstructionwriteoffRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetAuthToken(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetProductInstanceId(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetRegionName(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetChainId(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetEquityId(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetMemo(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetOriginTxId(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffRequest) SetOutTxId(v string) *ExecAasAntdaoEquityInstructionwriteoffRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoEquityInstructionwriteoffResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoEquityInstructionwriteoffResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoEquityInstructionwriteoffResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoEquityInstructionwriteoffResponse) SetReqMsgId(v string) *ExecAasAntdaoEquityInstructionwriteoffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffResponse) SetResultCode(v string) *ExecAasAntdaoEquityInstructionwriteoffResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoEquityInstructionwriteoffResponse) SetResultMsg(v string) *ExecAasAntdaoEquityInstructionwriteoffResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoMerchantProvisionsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 行为
	BusinessAction *string `json:"business_action,omitempty" xml:"business_action,omitempty"`
	// 要查询的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s QueryAasAntdaoMerchantProvisionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantProvisionsRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetAuthToken(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetProductInstanceId(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetRegionName(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetBusinessAction(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.BusinessAction = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetOptTenantId(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsRequest) SetProductCode(v string) *QueryAasAntdaoMerchantProvisionsRequest {
	s.ProductCode = &v
	return s
}

type QueryAasAntdaoMerchantProvisionsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户的备付金列表信息
	DiscreteValues []*DiscreteValue `json:"discrete_values,omitempty" xml:"discrete_values,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoMerchantProvisionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantProvisionsResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantProvisionsResponse) SetReqMsgId(v string) *QueryAasAntdaoMerchantProvisionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsResponse) SetResultCode(v string) *QueryAasAntdaoMerchantProvisionsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsResponse) SetResultMsg(v string) *QueryAasAntdaoMerchantProvisionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMerchantProvisionsResponse) SetDiscreteValues(v []*DiscreteValue) *QueryAasAntdaoMerchantProvisionsResponse {
	s.DiscreteValues = v
	return s
}

type QueryAasAntdaoMerchantExchangeableequitylistRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 页码
	PageNumber *string `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 每页数量（不填默认返回50条数据）
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryAasAntdaoMerchantExchangeableequitylistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantExchangeableequitylistRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetAuthToken(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetProductInstanceId(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetRegionName(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetChainId(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetPageNumber(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.PageNumber = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistRequest) SetPageSize(v string) *QueryAasAntdaoMerchantExchangeableequitylistRequest {
	s.PageSize = &v
	return s
}

type QueryAasAntdaoMerchantExchangeableequitylistResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可兑换商品信息列表
	Object *ExchangeableEquityList `json:"object,omitempty" xml:"object,omitempty"`
}

func (s QueryAasAntdaoMerchantExchangeableequitylistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantExchangeableequitylistResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistResponse) SetReqMsgId(v string) *QueryAasAntdaoMerchantExchangeableequitylistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistResponse) SetResultCode(v string) *QueryAasAntdaoMerchantExchangeableequitylistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistResponse) SetResultMsg(v string) *QueryAasAntdaoMerchantExchangeableequitylistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitylistResponse) SetObject(v *ExchangeableEquityList) *QueryAasAntdaoMerchantExchangeableequitylistResponse {
	s.Object = v
	return s
}

type QueryAasAntdaoMerchantExchangeableequitydetailRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 商品SKUID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryAasAntdaoMerchantExchangeableequitydetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantExchangeableequitydetailRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailRequest) SetAuthToken(v string) *QueryAasAntdaoMerchantExchangeableequitydetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailRequest) SetProductInstanceId(v string) *QueryAasAntdaoMerchantExchangeableequitydetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailRequest) SetRegionName(v string) *QueryAasAntdaoMerchantExchangeableequitydetailRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailRequest) SetChainId(v string) *QueryAasAntdaoMerchantExchangeableequitydetailRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailRequest) SetSkuId(v string) *QueryAasAntdaoMerchantExchangeableequitydetailRequest {
	s.SkuId = &v
	return s
}

type QueryAasAntdaoMerchantExchangeableequitydetailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可兑换的商品详情信息
	Equity *EquityDetail `json:"equity,omitempty" xml:"equity,omitempty"`
}

func (s QueryAasAntdaoMerchantExchangeableequitydetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMerchantExchangeableequitydetailResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailResponse) SetReqMsgId(v string) *QueryAasAntdaoMerchantExchangeableequitydetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailResponse) SetResultCode(v string) *QueryAasAntdaoMerchantExchangeableequitydetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailResponse) SetResultMsg(v string) *QueryAasAntdaoMerchantExchangeableequitydetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMerchantExchangeableequitydetailResponse) SetEquity(v *EquityDetail) *QueryAasAntdaoMerchantExchangeableequitydetailResponse {
	s.Equity = v
	return s
}

type ExecAasAntdaoAssetCreateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资产绑定币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 为该租户创建新资产
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	// 资产汇率(等值一元钱的数量)
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty"`
}

func (s ExecAasAntdaoAssetCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetCreateRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetCreateRequest) SetAuthToken(v string) *ExecAasAntdaoAssetCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetRegionName(v string) *ExecAasAntdaoAssetCreateRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetAssetId(v string) *ExecAasAntdaoAssetCreateRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetAssetName(v string) *ExecAasAntdaoAssetCreateRequest {
	s.AssetName = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetChainId(v string) *ExecAasAntdaoAssetCreateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetCurrency(v string) *ExecAasAntdaoAssetCreateRequest {
	s.Currency = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetOptTenantId(v string) *ExecAasAntdaoAssetCreateRequest {
	s.OptTenantId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetOutTxId(v string) *ExecAasAntdaoAssetCreateRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateRequest) SetRate(v string) *ExecAasAntdaoAssetCreateRequest {
	s.Rate = &v
	return s
}

type ExecAasAntdaoAssetCreateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetCreateResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetCreateResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateResponse) SetResultCode(v string) *ExecAasAntdaoAssetCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetCreateResponse) SetResultMsg(v string) *ExecAasAntdaoAssetCreateResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoAssetGenerateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 铸币数量
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoAssetGenerateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGenerateRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetAuthToken(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetProductInstanceId(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetRegionName(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetAmount(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.Amount = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetAssetId(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetChainId(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateRequest) SetOutTxId(v string) *ExecAasAntdaoAssetGenerateRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoAssetGenerateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoAssetGenerateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoAssetGenerateResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoAssetGenerateResponse) SetReqMsgId(v string) *ExecAasAntdaoAssetGenerateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateResponse) SetResultCode(v string) *ExecAasAntdaoAssetGenerateResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoAssetGenerateResponse) SetResultMsg(v string) *ExecAasAntdaoAssetGenerateResponse {
	s.ResultMsg = &v
	return s
}

type CreateAasAntdaoMerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 商户描述，不超过2048
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 商户的资金管理员 归属的租户ID
	FundManagerTenantId *string `json:"fund_manager_tenant_id,omitempty" xml:"fund_manager_tenant_id,omitempty"`
	// 商户角色，是否是资产发行商
	IfAssetIssuer *bool `json:"if_asset_issuer,omitempty" xml:"if_asset_issuer,omitempty"`
	// 商户角色，是否是采购商
	IfEquityConsumer *bool `json:"if_equity_consumer,omitempty" xml:"if_equity_consumer,omitempty"`
	// 商户角色，是否是供应商
	IfEquityProvider *bool `json:"if_equity_provider,omitempty" xml:"if_equity_provider,omitempty"`
	// 商户归属的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID（确保幂等）
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateAasAntdaoMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantRequest) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantRequest) SetAuthToken(v string) *CreateAasAntdaoMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetProductInstanceId(v string) *CreateAasAntdaoMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetRegionName(v string) *CreateAasAntdaoMerchantRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetChainId(v string) *CreateAasAntdaoMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetDescription(v string) *CreateAasAntdaoMerchantRequest {
	s.Description = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetFundManagerTenantId(v string) *CreateAasAntdaoMerchantRequest {
	s.FundManagerTenantId = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetIfAssetIssuer(v bool) *CreateAasAntdaoMerchantRequest {
	s.IfAssetIssuer = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetIfEquityConsumer(v bool) *CreateAasAntdaoMerchantRequest {
	s.IfEquityConsumer = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetIfEquityProvider(v bool) *CreateAasAntdaoMerchantRequest {
	s.IfEquityProvider = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetOptTenantId(v string) *CreateAasAntdaoMerchantRequest {
	s.OptTenantId = &v
	return s
}

func (s *CreateAasAntdaoMerchantRequest) SetOutTxId(v string) *CreateAasAntdaoMerchantRequest {
	s.OutTxId = &v
	return s
}

type CreateAasAntdaoMerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAasAntdaoMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantResponse) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantResponse) SetReqMsgId(v string) *CreateAasAntdaoMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasAntdaoMerchantResponse) SetResultCode(v string) *CreateAasAntdaoMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasAntdaoMerchantResponse) SetResultMsg(v string) *CreateAasAntdaoMerchantResponse {
	s.ResultMsg = &v
	return s
}

type SetAasAntdaoMerchantFundmanagerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 资金管理员所属的租户ID
	FundManagerTenantId *string `json:"fund_manager_tenant_id,omitempty" xml:"fund_manager_tenant_id,omitempty"`
	// 要进行资金管理员设置的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetAasAntdaoMerchantFundmanagerRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoMerchantFundmanagerRequest) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetAuthToken(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetProductInstanceId(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetRegionName(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.RegionName = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetChainId(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.ChainId = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetFundManagerTenantId(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.FundManagerTenantId = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetOptTenantId(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerRequest) SetOutTxId(v string) *SetAasAntdaoMerchantFundmanagerRequest {
	s.OutTxId = &v
	return s
}

type SetAasAntdaoMerchantFundmanagerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SetAasAntdaoMerchantFundmanagerResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoMerchantFundmanagerResponse) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoMerchantFundmanagerResponse) SetReqMsgId(v string) *SetAasAntdaoMerchantFundmanagerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerResponse) SetResultCode(v string) *SetAasAntdaoMerchantFundmanagerResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAasAntdaoMerchantFundmanagerResponse) SetResultMsg(v string) *SetAasAntdaoMerchantFundmanagerResponse {
	s.ResultMsg = &v
	return s
}

type CreateAasAntdaoMerchantProvisionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 备付金账户币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 要创建备付金账户的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 外部交易ID，确保幂等
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateAasAntdaoMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetAuthToken(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetProductInstanceId(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetRegionName(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.RegionName = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetChainId(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetCurrency(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetOptTenantId(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionRequest) SetOutTxId(v string) *CreateAasAntdaoMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type CreateAasAntdaoMerchantProvisionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAasAntdaoMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAasAntdaoMerchantProvisionResponse) GoString() string {
	return s.String()
}

func (s *CreateAasAntdaoMerchantProvisionResponse) SetReqMsgId(v string) *CreateAasAntdaoMerchantProvisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionResponse) SetResultCode(v string) *CreateAasAntdaoMerchantProvisionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAasAntdaoMerchantProvisionResponse) SetResultMsg(v string) *CreateAasAntdaoMerchantProvisionResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoConfigDelegaterelationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryAasAntdaoConfigDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoConfigDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoConfigDelegaterelationRequest) SetAuthToken(v string) *QueryAasAntdaoConfigDelegaterelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationRequest) SetProductInstanceId(v string) *QueryAasAntdaoConfigDelegaterelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationRequest) SetRegionName(v string) *QueryAasAntdaoConfigDelegaterelationRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoConfigDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryAasAntdaoConfigDelegaterelationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代理授权关系信息
	DelegateRelationInfos []*DelegateRelationInfo `json:"delegate_relation_infos,omitempty" xml:"delegate_relation_infos,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoConfigDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoConfigDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoConfigDelegaterelationResponse) SetReqMsgId(v string) *QueryAasAntdaoConfigDelegaterelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationResponse) SetResultCode(v string) *QueryAasAntdaoConfigDelegaterelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationResponse) SetResultMsg(v string) *QueryAasAntdaoConfigDelegaterelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoConfigDelegaterelationResponse) SetDelegateRelationInfos(v []*DelegateRelationInfo) *QueryAasAntdaoConfigDelegaterelationResponse {
	s.DelegateRelationInfos = v
	return s
}

type UpdateAasAntdaoConfigDelegaterelationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 代理租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 操作类型，ADD表示添加，SUB表示撤销
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateAasAntdaoConfigDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoConfigDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetAuthToken(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetProductInstanceId(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetRegionName(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetOptTenantId(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationRequest) SetOptType(v string) *UpdateAasAntdaoConfigDelegaterelationRequest {
	s.OptType = &v
	return s
}

type UpdateAasAntdaoConfigDelegaterelationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoConfigDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoConfigDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoConfigDelegaterelationResponse) SetReqMsgId(v string) *UpdateAasAntdaoConfigDelegaterelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationResponse) SetResultCode(v string) *UpdateAasAntdaoConfigDelegaterelationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoConfigDelegaterelationResponse) SetResultMsg(v string) *UpdateAasAntdaoConfigDelegaterelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoConfigWhitelistRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 查询链的白名单信息
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 查询该租户的白名单信息
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryAasAntdaoConfigWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoConfigWhitelistRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoConfigWhitelistRequest) SetAuthToken(v string) *QueryAasAntdaoConfigWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistRequest) SetProductInstanceId(v string) *QueryAasAntdaoConfigWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistRequest) SetRegionName(v string) *QueryAasAntdaoConfigWhitelistRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistRequest) SetChainId(v string) *QueryAasAntdaoConfigWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistRequest) SetTenantId(v string) *QueryAasAntdaoConfigWhitelistRequest {
	s.TenantId = &v
	return s
}

type QueryAasAntdaoConfigWhitelistResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口白名单信息
	WhiteList []*APIWhiteListInfo `json:"white_list,omitempty" xml:"white_list,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoConfigWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoConfigWhitelistResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoConfigWhitelistResponse) SetReqMsgId(v string) *QueryAasAntdaoConfigWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistResponse) SetResultCode(v string) *QueryAasAntdaoConfigWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistResponse) SetResultMsg(v string) *QueryAasAntdaoConfigWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoConfigWhitelistResponse) SetWhiteList(v []*APIWhiteListInfo) *QueryAasAntdaoConfigWhitelistResponse {
	s.WhiteList = v
	return s
}

type UpdateAasAntdaoConfigWhitelistRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 操作类型
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateAasAntdaoConfigWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoConfigWhitelistRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetAuthToken(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetProductInstanceId(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetRegionName(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetChainId(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetOptTenantId(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistRequest) SetOptType(v string) *UpdateAasAntdaoConfigWhitelistRequest {
	s.OptType = &v
	return s
}

type UpdateAasAntdaoConfigWhitelistResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoConfigWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoConfigWhitelistResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoConfigWhitelistResponse) SetReqMsgId(v string) *UpdateAasAntdaoConfigWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistResponse) SetResultCode(v string) *UpdateAasAntdaoConfigWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoConfigWhitelistResponse) SetResultMsg(v string) *UpdateAasAntdaoConfigWhitelistResponse {
	s.ResultMsg = &v
	return s
}

type ApplyAasAntdaoExchangeAftersaleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 权益商品id
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 额外信息 可选
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ApplyAasAntdaoExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAasAntdaoExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetAuthToken(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetProductInstanceId(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetRegionName(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetChainId(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetEquityId(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetMemo(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetOriginTxId(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleRequest) SetOutTxId(v string) *ApplyAasAntdaoExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type ApplyAasAntdaoExchangeAftersaleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyAasAntdaoExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAasAntdaoExchangeAftersaleResponse) GoString() string {
	return s.String()
}

func (s *ApplyAasAntdaoExchangeAftersaleResponse) SetReqMsgId(v string) *ApplyAasAntdaoExchangeAftersaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleResponse) SetResultCode(v string) *ApplyAasAntdaoExchangeAftersaleResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAasAntdaoExchangeAftersaleResponse) SetResultMsg(v string) *ApplyAasAntdaoExchangeAftersaleResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoExchangeAgreeaftersaleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 权益id
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 额外信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAasAntdaoExchangeAgreeaftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeAgreeaftersaleRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetAuthToken(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetProductInstanceId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetRegionName(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetChainId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetDelegatedTenantId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetEquityId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetMemo(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetOriginTxId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleRequest) SetOutTxId(v string) *ExecAasAntdaoExchangeAgreeaftersaleRequest {
	s.OutTxId = &v
	return s
}

type ExecAasAntdaoExchangeAgreeaftersaleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAasAntdaoExchangeAgreeaftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoExchangeAgreeaftersaleResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleResponse) SetReqMsgId(v string) *ExecAasAntdaoExchangeAgreeaftersaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleResponse) SetResultCode(v string) *ExecAasAntdaoExchangeAgreeaftersaleResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoExchangeAgreeaftersaleResponse) SetResultMsg(v string) *ExecAasAntdaoExchangeAgreeaftersaleResponse {
	s.ResultMsg = &v
	return s
}

type RefuseAasAntdaoExchangeAftersaleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// l链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 商品id
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 额外信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易id
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s RefuseAasAntdaoExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseAasAntdaoExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetAuthToken(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetProductInstanceId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetRegionName(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.RegionName = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetChainId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetDelegatedTenantId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetEquityId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetMemo(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetOriginTxId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleRequest) SetOutTxId(v string) *RefuseAasAntdaoExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type RefuseAasAntdaoExchangeAftersaleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseAasAntdaoExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseAasAntdaoExchangeAftersaleResponse) GoString() string {
	return s.String()
}

func (s *RefuseAasAntdaoExchangeAftersaleResponse) SetReqMsgId(v string) *RefuseAasAntdaoExchangeAftersaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleResponse) SetResultCode(v string) *RefuseAasAntdaoExchangeAftersaleResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseAasAntdaoExchangeAftersaleResponse) SetResultMsg(v string) *RefuseAasAntdaoExchangeAftersaleResponse {
	s.ResultMsg = &v
	return s
}

type SendAasAntdaoExchangeAftersaleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要代理操作的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 商品id
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易id
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SendAasAntdaoExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAasAntdaoExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetAuthToken(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetProductInstanceId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetRegionName(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.RegionName = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetChainId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetDelegatedTenantId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetEquityId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetMemo(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetOriginTxId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleRequest) SetOutTxId(v string) *SendAasAntdaoExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type SendAasAntdaoExchangeAftersaleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendAasAntdaoExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAasAntdaoExchangeAftersaleResponse) GoString() string {
	return s.String()
}

func (s *SendAasAntdaoExchangeAftersaleResponse) SetReqMsgId(v string) *SendAasAntdaoExchangeAftersaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleResponse) SetResultCode(v string) *SendAasAntdaoExchangeAftersaleResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAasAntdaoExchangeAftersaleResponse) SetResultMsg(v string) *SendAasAntdaoExchangeAftersaleResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmAasAntdaoExchangeAftersaleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 商品id
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	// 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	// 外部交易id
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ConfirmAasAntdaoExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAasAntdaoExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetAuthToken(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetProductInstanceId(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetRegionName(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.RegionName = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetChainId(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetEquityId(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetMemo(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetOriginTxId(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleRequest) SetOutTxId(v string) *ConfirmAasAntdaoExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type ConfirmAasAntdaoExchangeAftersaleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmAasAntdaoExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAasAntdaoExchangeAftersaleResponse) GoString() string {
	return s.String()
}

func (s *ConfirmAasAntdaoExchangeAftersaleResponse) SetReqMsgId(v string) *ConfirmAasAntdaoExchangeAftersaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleResponse) SetResultCode(v string) *ConfirmAasAntdaoExchangeAftersaleResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmAasAntdaoExchangeAftersaleResponse) SetResultMsg(v string) *ConfirmAasAntdaoExchangeAftersaleResponse {
	s.ResultMsg = &v
	return s
}

type ExecAasAntdaoDataDepositRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易信息
	Tx *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecAasAntdaoDataDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoDataDepositRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoDataDepositRequest) SetAuthToken(v string) *ExecAasAntdaoDataDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoDataDepositRequest) SetProductInstanceId(v string) *ExecAasAntdaoDataDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoDataDepositRequest) SetRegionName(v string) *ExecAasAntdaoDataDepositRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoDataDepositRequest) SetChainId(v string) *ExecAasAntdaoDataDepositRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoDataDepositRequest) SetTx(v *Transaction) *ExecAasAntdaoDataDepositRequest {
	s.Tx = v
	return s
}

type ExecAasAntdaoDataDepositResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ExecAasAntdaoDataDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoDataDepositResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoDataDepositResponse) SetReqMsgId(v string) *ExecAasAntdaoDataDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoDataDepositResponse) SetResultCode(v string) *ExecAasAntdaoDataDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoDataDepositResponse) SetResultMsg(v string) *ExecAasAntdaoDataDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoDataDepositResponse) SetTxHash(v string) *ExecAasAntdaoDataDepositResponse {
	s.TxHash = &v
	return s
}

type SetAasAntdaoCommissionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 手续费列表，可传入多个
	Commissions []*Commission `json:"commissions,omitempty" xml:"commissions,omitempty" type:"Repeated"`
	// 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 是否设置全局手续费。若是false，需传入optTenantId
	IfGlobal *bool `json:"if_global,omitempty" xml:"if_global,omitempty"`
	// 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 交易幂等ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetAasAntdaoCommissionRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoCommissionRequest) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoCommissionRequest) SetAuthToken(v string) *SetAasAntdaoCommissionRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetProductInstanceId(v string) *SetAasAntdaoCommissionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetRegionName(v string) *SetAasAntdaoCommissionRequest {
	s.RegionName = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetChainId(v string) *SetAasAntdaoCommissionRequest {
	s.ChainId = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetCommissions(v []*Commission) *SetAasAntdaoCommissionRequest {
	s.Commissions = v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetEquityType(v int64) *SetAasAntdaoCommissionRequest {
	s.EquityType = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetIfGlobal(v bool) *SetAasAntdaoCommissionRequest {
	s.IfGlobal = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetOptTenantId(v string) *SetAasAntdaoCommissionRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetAasAntdaoCommissionRequest) SetOutTxId(v string) *SetAasAntdaoCommissionRequest {
	s.OutTxId = &v
	return s
}

type SetAasAntdaoCommissionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 手续费ID
	CommissionId *string `json:"commission_id,omitempty" xml:"commission_id,omitempty"`
}

func (s SetAasAntdaoCommissionResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoCommissionResponse) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoCommissionResponse) SetReqMsgId(v string) *SetAasAntdaoCommissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAasAntdaoCommissionResponse) SetResultCode(v string) *SetAasAntdaoCommissionResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAasAntdaoCommissionResponse) SetResultMsg(v string) *SetAasAntdaoCommissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetAasAntdaoCommissionResponse) SetCommissionId(v string) *SetAasAntdaoCommissionResponse {
	s.CommissionId = &v
	return s
}

type QueryAasAntdaoCommissionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 查询该租户的手续费信息
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
	EquityType *int64 `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	// 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
	IfCurrent *bool `json:"if_current,omitempty" xml:"if_current,omitempty"`
	// 是否查询全局的手续费信息
	IfGlobal *bool `json:"if_global,omitempty" xml:"if_global,omitempty"`
}

func (s QueryAasAntdaoCommissionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoCommissionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoCommissionRequest) SetAuthToken(v string) *QueryAasAntdaoCommissionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetProductInstanceId(v string) *QueryAasAntdaoCommissionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetRegionName(v string) *QueryAasAntdaoCommissionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetChainId(v string) *QueryAasAntdaoCommissionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoCommissionRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetEquityType(v int64) *QueryAasAntdaoCommissionRequest {
	s.EquityType = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetIfCurrent(v bool) *QueryAasAntdaoCommissionRequest {
	s.IfCurrent = &v
	return s
}

func (s *QueryAasAntdaoCommissionRequest) SetIfGlobal(v bool) *QueryAasAntdaoCommissionRequest {
	s.IfGlobal = &v
	return s
}

type QueryAasAntdaoCommissionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 手续费信息列表
	Commissions []*CommissionResult `json:"commissions,omitempty" xml:"commissions,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoCommissionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoCommissionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoCommissionResponse) SetReqMsgId(v string) *QueryAasAntdaoCommissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoCommissionResponse) SetResultCode(v string) *QueryAasAntdaoCommissionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoCommissionResponse) SetResultMsg(v string) *QueryAasAntdaoCommissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoCommissionResponse) SetCommissions(v []*CommissionResult) *QueryAasAntdaoCommissionResponse {
	s.Commissions = v
	return s
}

type SetAasAntdaoCommissionMerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 收取手续费的商户对应的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 交易幂等ID
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetAasAntdaoCommissionMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoCommissionMerchantRequest) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetAuthToken(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetProductInstanceId(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetRegionName(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.RegionName = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetChainId(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetOptTenantId(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantRequest) SetOutTxId(v string) *SetAasAntdaoCommissionMerchantRequest {
	s.OutTxId = &v
	return s
}

type SetAasAntdaoCommissionMerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SetAasAntdaoCommissionMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAasAntdaoCommissionMerchantResponse) GoString() string {
	return s.String()
}

func (s *SetAasAntdaoCommissionMerchantResponse) SetReqMsgId(v string) *SetAasAntdaoCommissionMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantResponse) SetResultCode(v string) *SetAasAntdaoCommissionMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAasAntdaoCommissionMerchantResponse) SetResultMsg(v string) *SetAasAntdaoCommissionMerchantResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoCommissionMerchantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryAasAntdaoCommissionMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoCommissionMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoCommissionMerchantRequest) SetAuthToken(v string) *QueryAasAntdaoCommissionMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantRequest) SetProductInstanceId(v string) *QueryAasAntdaoCommissionMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantRequest) SetRegionName(v string) *QueryAasAntdaoCommissionMerchantRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantRequest) SetChainId(v string) *QueryAasAntdaoCommissionMerchantRequest {
	s.ChainId = &v
	return s
}

type QueryAasAntdaoCommissionMerchantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收取手续费的商户 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryAasAntdaoCommissionMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoCommissionMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoCommissionMerchantResponse) SetReqMsgId(v string) *QueryAasAntdaoCommissionMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantResponse) SetResultCode(v string) *QueryAasAntdaoCommissionMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantResponse) SetResultMsg(v string) *QueryAasAntdaoCommissionMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoCommissionMerchantResponse) SetTenantId(v string) *QueryAasAntdaoCommissionMerchantResponse {
	s.TenantId = &v
	return s
}

type QueryAasAntdaoBlockanalysisBlockRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
	DelegatedTenantIds []*string `json:"delegated_tenant_ids,omitempty" xml:"delegated_tenant_ids,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoBlockanalysisBlockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisBlockRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetBlockNumber(v int64) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockRequest) SetDelegatedTenantIds(v []*string) *QueryAasAntdaoBlockanalysisBlockRequest {
	s.DelegatedTenantIds = v
	return s
}

type QueryAasAntdaoBlockanalysisBlockResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块信息
	Block *Block `json:"block,omitempty" xml:"block,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 过滤后的交易数量
	FilteredTxCount *int64 `json:"filtered_tx_count,omitempty" xml:"filtered_tx_count,omitempty"`
	// 区块中交易总数
	TotalTxCount *int64 `json:"total_tx_count,omitempty" xml:"total_tx_count,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisBlockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisBlockResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetBlock(v *Block) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.Block = v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetBlockNumber(v int64) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetChainId(v string) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetFilteredTxCount(v int64) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.FilteredTxCount = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisBlockResponse) SetTotalTxCount(v int64) *QueryAasAntdaoBlockanalysisBlockResponse {
	s.TotalTxCount = &v
	return s
}

type QueryAasAntdaoBlockanalysisLastblocknumberRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisLastblocknumberRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisLastblocknumberRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisLastblocknumberRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisLastblocknumberRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisLastblocknumberRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisLastblocknumberRequest {
	s.ChainId = &v
	return s
}

type QueryAasAntdaoBlockanalysisLastblocknumberResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链最高区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisLastblocknumberResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisLastblocknumberResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisLastblocknumberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisLastblocknumberResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisLastblocknumberResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisLastblocknumberResponse) SetBlockNumber(v int64) *QueryAasAntdaoBlockanalysisLastblocknumberResponse {
	s.BlockNumber = &v
	return s
}

type QueryAasAntdaoBlockanalysisOpenedequitiesRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 每页数据量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisOpenedequitiesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisOpenedequitiesRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetCount(v int64) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.Count = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) SetPage(v int64) *QueryAasAntdaoBlockanalysisOpenedequitiesRequest {
	s.Page = &v
	return s
}

type QueryAasAntdaoBlockanalysisOpenedequitiesResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益商品信息详细信息list
	Equities []*OpenedEquity `json:"equities,omitempty" xml:"equities,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoBlockanalysisOpenedequitiesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisOpenedequitiesResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisOpenedequitiesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisOpenedequitiesResponse) SetEquities(v []*OpenedEquity) *QueryAasAntdaoBlockanalysisOpenedequitiesResponse {
	s.Equities = v
	return s
}

type QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 每页数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 页码
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetCount(v int64) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.Count = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) SetPage(v int64) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest {
	s.Page = &v
	return s
}

type QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益商品信息详细信息list
	Equities []*UserPriceEquity `json:"equities,omitempty" xml:"equities,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse) SetEquities(v []*UserPriceEquity) *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse {
	s.Equities = v
	return s
}

type QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 要查询的租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetAssetId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.AssetId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) SetOptTenantId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest {
	s.OptTenantId = &v
	return s
}

type QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 未核销的资产总额（单位：元）
	TotalValue *string `json:"total_value,omitempty" xml:"total_value,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetAssetId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.AssetId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetTenantId(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.TenantId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse) SetTotalValue(v string) *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse {
	s.TotalValue = &v
	return s
}

type UpdateAasAntdaoBlockanalysisDelegaterelationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	// 代理租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 操作类型，ADD表示添加，SUB表示撤销
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateAasAntdaoBlockanalysisDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoBlockanalysisDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetAuthToken(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetProductInstanceId(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetRegionName(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetDelegatedTenantId(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetOptTenantId(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) SetOptType(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationRequest {
	s.OptType = &v
	return s
}

type UpdateAasAntdaoBlockanalysisDelegaterelationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoBlockanalysisDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoBlockanalysisDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationResponse) SetReqMsgId(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationResponse) SetResultCode(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisDelegaterelationResponse) SetResultMsg(v string) *UpdateAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ResultMsg = &v
	return s
}

type UpdateAasAntdaoBlockanalysisWhitelistRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 租户ID
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	// 操作类型
	OptType *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateAasAntdaoBlockanalysisWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoBlockanalysisWhitelistRequest) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetAuthToken(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetProductInstanceId(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetRegionName(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetChainId(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetOptTenantId(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistRequest) SetOptType(v string) *UpdateAasAntdaoBlockanalysisWhitelistRequest {
	s.OptType = &v
	return s
}

type UpdateAasAntdaoBlockanalysisWhitelistResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAasAntdaoBlockanalysisWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAasAntdaoBlockanalysisWhitelistResponse) GoString() string {
	return s.String()
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistResponse) SetReqMsgId(v string) *UpdateAasAntdaoBlockanalysisWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistResponse) SetResultCode(v string) *UpdateAasAntdaoBlockanalysisWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAasAntdaoBlockanalysisWhitelistResponse) SetResultMsg(v string) *UpdateAasAntdaoBlockanalysisWhitelistResponse {
	s.ResultMsg = &v
	return s
}

type QueryAasAntdaoBlockanalysisDelegaterelationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被代理的租户ID
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisDelegaterelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisDelegaterelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisDelegaterelationRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationRequest) SetDelegatedTenantId(v string) *QueryAasAntdaoBlockanalysisDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryAasAntdaoBlockanalysisDelegaterelationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代理授权关系信息
	DelegateRelationInfos []*DelegateRelationInfo `json:"delegate_relation_infos,omitempty" xml:"delegate_relation_infos,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoBlockanalysisDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisDelegaterelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisDelegaterelationResponse) SetDelegateRelationInfos(v []*DelegateRelationInfo) *QueryAasAntdaoBlockanalysisDelegaterelationResponse {
	s.DelegateRelationInfos = v
	return s
}

type QueryAasAntdaoBlockanalysisWhitelistRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 查询链的白名单信息
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 查询该租户的白名单信息
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisWhitelistRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisWhitelistRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisWhitelistRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistRequest) SetTenantId(v string) *QueryAasAntdaoBlockanalysisWhitelistRequest {
	s.TenantId = &v
	return s
}

type QueryAasAntdaoBlockanalysisWhitelistResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口白名单信息
	WhiteList []*APIWhiteListInfo `json:"white_list,omitempty" xml:"white_list,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoBlockanalysisWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisWhitelistResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisWhitelistResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisWhitelistResponse) SetWhiteList(v []*APIWhiteListInfo) *QueryAasAntdaoBlockanalysisWhitelistResponse {
	s.WhiteList = v
	return s
}

type QueryAasAntdaoBlockanalysisTransactionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisTransactionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisTransactionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisTransactionRequest) SetAuthToken(v string) *QueryAasAntdaoBlockanalysisTransactionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionRequest) SetProductInstanceId(v string) *QueryAasAntdaoBlockanalysisTransactionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionRequest) SetRegionName(v string) *QueryAasAntdaoBlockanalysisTransactionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionRequest) SetChainId(v string) *QueryAasAntdaoBlockanalysisTransactionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionRequest) SetTxHash(v string) *QueryAasAntdaoBlockanalysisTransactionRequest {
	s.TxHash = &v
	return s
}

type QueryAasAntdaoBlockanalysisTransactionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易数据，hex格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 交易发起方
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// 交易单据信息
	Receipt *BlockReceipt `json:"receipt,omitempty" xml:"receipt,omitempty"`
	// 交易时间戳
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 交易接收方
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 交易类型
	TxType *int64 `json:"tx_type,omitempty" xml:"tx_type,omitempty"`
}

func (s QueryAasAntdaoBlockanalysisTransactionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoBlockanalysisTransactionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetReqMsgId(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetResultCode(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetResultMsg(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetBlockNumber(v int64) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetData(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.Data = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetFrom(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.From = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetReceipt(v *BlockReceipt) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.Receipt = v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetTimestamp(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetTo(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.To = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetTxHash(v string) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.TxHash = &v
	return s
}

func (s *QueryAasAntdaoBlockanalysisTransactionResponse) SetTxType(v int64) *QueryAasAntdaoBlockanalysisTransactionResponse {
	s.TxType = &v
	return s
}

type QueryAasAntdaoMypointsSkuRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
}

func (s QueryAasAntdaoMypointsSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsSkuRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsSkuRequest) SetAuthToken(v string) *QueryAasAntdaoMypointsSkuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuRequest) SetProductInstanceId(v string) *QueryAasAntdaoMypointsSkuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuRequest) SetRegionName(v string) *QueryAasAntdaoMypointsSkuRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuRequest) SetChainId(v string) *QueryAasAntdaoMypointsSkuRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuRequest) SetEnv(v string) *QueryAasAntdaoMypointsSkuRequest {
	s.Env = &v
	return s
}

type QueryAasAntdaoMypointsSkuResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品列表
	Skus []*SKUItem `json:"skus,omitempty" xml:"skus,omitempty" type:"Repeated"`
}

func (s QueryAasAntdaoMypointsSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsSkuResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsSkuResponse) SetReqMsgId(v string) *QueryAasAntdaoMypointsSkuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuResponse) SetResultCode(v string) *QueryAasAntdaoMypointsSkuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuResponse) SetResultMsg(v string) *QueryAasAntdaoMypointsSkuResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkuResponse) SetSkus(v []*SKUItem) *QueryAasAntdaoMypointsSkuResponse {
	s.Skus = v
	return s
}

type QueryAasAntdaoMypointsMerchantbalanceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
}

func (s QueryAasAntdaoMypointsMerchantbalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsMerchantbalanceRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsMerchantbalanceRequest) SetAuthToken(v string) *QueryAasAntdaoMypointsMerchantbalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceRequest) SetProductInstanceId(v string) *QueryAasAntdaoMypointsMerchantbalanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceRequest) SetRegionName(v string) *QueryAasAntdaoMypointsMerchantbalanceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceRequest) SetChainId(v string) *QueryAasAntdaoMypointsMerchantbalanceRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceRequest) SetEnv(v string) *QueryAasAntdaoMypointsMerchantbalanceRequest {
	s.Env = &v
	return s
}

type QueryAasAntdaoMypointsMerchantbalanceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 积分库可用余额
	BudgetAvailableBalance *int64 `json:"budget_available_balance,omitempty" xml:"budget_available_balance,omitempty"`
	// 预算库余额
	BudgetBalance *int64 `json:"budget_balance,omitempty" xml:"budget_balance,omitempty"`
	// 预算库代码
	BudgetCode *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	// 商户的支付宝商家ID
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty"`
	// 积分库余额
	PointLibBalance *int64 `json:"point_lib_balance,omitempty" xml:"point_lib_balance,omitempty"`
	// 积分库代码
	PointLibCode *string `json:"point_lib_code,omitempty" xml:"point_lib_code,omitempty"`
	// 商户的金融云租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryAasAntdaoMypointsMerchantbalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsMerchantbalanceResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetReqMsgId(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetResultCode(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetResultMsg(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetBudgetAvailableBalance(v int64) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.BudgetAvailableBalance = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetBudgetBalance(v int64) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.BudgetBalance = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetBudgetCode(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.BudgetCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetPid(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.Pid = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetPointLibBalance(v int64) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.PointLibBalance = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetPointLibCode(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.PointLibCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsMerchantbalanceResponse) SetTenantId(v string) *QueryAasAntdaoMypointsMerchantbalanceResponse {
	s.TenantId = &v
	return s
}

type ExecAasAntdaoMypointsPreorderskuRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 预下单数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 备注
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 业务幂等号，商户需要保证每笔订单号唯一
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 总花费花费(询价接口结果)
	TotalCost *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s ExecAasAntdaoMypointsPreorderskuRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoMypointsPreorderskuRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetAuthToken(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetProductInstanceId(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetRegionName(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetChainId(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetCount(v int64) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.Count = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetEnv(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.Env = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetMemo(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.Memo = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetOrderNo(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetSkuId(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.SkuId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuRequest) SetTotalCost(v string) *ExecAasAntdaoMypointsPreorderskuRequest {
	s.TotalCost = &v
	return s
}

type ExecAasAntdaoMypointsPreorderskuResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 是否需要重试
	NeedRetry *bool `json:"need_retry,omitempty" xml:"need_retry,omitempty"`
	// 业务幂等ID
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 预下单Id
	PreOrderId *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 总集分宝数量(单位:个)
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 总费用
	TotalCost *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s ExecAasAntdaoMypointsPreorderskuResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoMypointsPreorderskuResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetReqMsgId(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetResultCode(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetResultMsg(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetCount(v int64) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.Count = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetNeedRetry(v bool) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.NeedRetry = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetOrderNo(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.OrderNo = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetPreOrderId(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.PreOrderId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetSkuId(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.SkuId = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetTotalAmount(v int64) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.TotalAmount = &v
	return s
}

func (s *ExecAasAntdaoMypointsPreorderskuResponse) SetTotalCost(v string) *ExecAasAntdaoMypointsPreorderskuResponse {
	s.TotalCost = &v
	return s
}

type ExecAasAntdaoMypointsOrderskuRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 业务幂等号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 预下单号
	PreOrderId *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s ExecAasAntdaoMypointsOrderskuRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoMypointsOrderskuRequest) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetAuthToken(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetProductInstanceId(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetRegionName(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetChainId(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetEnv(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.Env = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetOrderNo(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetPhoneNumber(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.PhoneNumber = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetPreOrderId(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.PreOrderId = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuRequest) SetSkuId(v string) *ExecAasAntdaoMypointsOrderskuRequest {
	s.SkuId = &v
	return s
}

type ExecAasAntdaoMypointsOrderskuResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 卡密ID
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	// 集分宝卡密的面值(单位:个)
	CardValue *int64 `json:"card_value,omitempty" xml:"card_value,omitempty"`
	// 是否需要重试
	NeedRetry *bool `json:"need_retry,omitempty" xml:"need_retry,omitempty"`
	// 业务幂等ID
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s ExecAasAntdaoMypointsOrderskuResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAasAntdaoMypointsOrderskuResponse) GoString() string {
	return s.String()
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetReqMsgId(v string) *ExecAasAntdaoMypointsOrderskuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetResultCode(v string) *ExecAasAntdaoMypointsOrderskuResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetResultMsg(v string) *ExecAasAntdaoMypointsOrderskuResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetCardId(v string) *ExecAasAntdaoMypointsOrderskuResponse {
	s.CardId = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetCardValue(v int64) *ExecAasAntdaoMypointsOrderskuResponse {
	s.CardValue = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetNeedRetry(v bool) *ExecAasAntdaoMypointsOrderskuResponse {
	s.NeedRetry = &v
	return s
}

func (s *ExecAasAntdaoMypointsOrderskuResponse) SetOrderNo(v string) *ExecAasAntdaoMypointsOrderskuResponse {
	s.OrderNo = &v
	return s
}

type QueryAasAntdaoMypointsSkufeeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 预下单数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 环境标识(sandbox/prod)
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 备注信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 业务幂等号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryAasAntdaoMypointsSkufeeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsSkufeeRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetAuthToken(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetProductInstanceId(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetRegionName(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetChainId(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetCount(v int64) *QueryAasAntdaoMypointsSkufeeRequest {
	s.Count = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetEnv(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.Env = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetMemo(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.Memo = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetOrderNo(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeRequest) SetSkuId(v string) *QueryAasAntdaoMypointsSkufeeRequest {
	s.SkuId = &v
	return s
}

type QueryAasAntdaoMypointsSkufeeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预下单的数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 费率
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 总集分宝数量（个）
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 总费用
	TotalCost *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s QueryAasAntdaoMypointsSkufeeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsSkufeeResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetReqMsgId(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetResultCode(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetResultMsg(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetCount(v int64) *QueryAasAntdaoMypointsSkufeeResponse {
	s.Count = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetRate(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.Rate = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetSkuId(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.SkuId = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetTotalAmount(v int64) *QueryAasAntdaoMypointsSkufeeResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryAasAntdaoMypointsSkufeeResponse) SetTotalCost(v string) *QueryAasAntdaoMypointsSkufeeResponse {
	s.TotalCost = &v
	return s
}

type QueryAasAntdaoMypointsPreorderinstructionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 业务幂等ID
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 商品ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryAasAntdaoMypointsPreorderinstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsPreorderinstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetAuthToken(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetProductInstanceId(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetRegionName(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetChainId(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetEnv(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.Env = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetOrderNo(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionRequest) SetSkuId(v string) *QueryAasAntdaoMypointsPreorderinstructionRequest {
	s.SkuId = &v
	return s
}

type QueryAasAntdaoMypointsPreorderinstructionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务请求单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 商家的预算库代码
	BudgetCode *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 备注信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 商家在支付宝域的标识
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty"`
	// 集分宝SKU预下单ID
	PreOrderId *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	// 集分宝产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 订单中剩余的可下单商品数量
	RemainCount *int64 `json:"remain_count,omitempty" xml:"remain_count,omitempty"`
	// 包含集分宝数量(个)
	SkuAmount *int64 `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	// 集分宝SKU的ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// SKU面值
	SkuValue *string `json:"sku_value,omitempty" xml:"sku_value,omitempty"`
	// 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 商户在金融云的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 总下单集分宝数量
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 集分宝SKU的预下单数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总下单金额
	TotalValue *string `json:"total_value,omitempty" xml:"total_value,omitempty"`
}

func (s QueryAasAntdaoMypointsPreorderinstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsPreorderinstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetReqMsgId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetResultCode(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetResultMsg(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetBizId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.BizId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetBudgetCode(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.BudgetCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetChainId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetEnv(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.Env = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetExtendInfo(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ExtendInfo = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetMemo(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.Memo = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetPid(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.Pid = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetPreOrderId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.PreOrderId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetProductCode(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.ProductCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetRemainCount(v int64) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.RemainCount = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetSkuAmount(v int64) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.SkuAmount = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetSkuId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.SkuId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetSkuValue(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.SkuValue = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetStatus(v int64) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.Status = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetTenantId(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.TenantId = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetTotalAmount(v int64) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetTotalCount(v int64) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryAasAntdaoMypointsPreorderinstructionResponse) SetTotalValue(v string) *QueryAasAntdaoMypointsPreorderinstructionResponse {
	s.TotalValue = &v
	return s
}

type QueryAasAntdaoMypointsOrderinstructionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 业务幂等号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// SKU ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryAasAntdaoMypointsOrderinstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsOrderinstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetAuthToken(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetProductInstanceId(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetRegionName(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetChainId(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetEnv(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.Env = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetOrderNo(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionRequest) SetSkuId(v string) *QueryAasAntdaoMypointsOrderinstructionRequest {
	s.SkuId = &v
	return s
}

type QueryAasAntdaoMypointsOrderinstructionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务请求单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 环境标识
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 预下单ID
	PreOrderId *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	// 包含集分宝数量(个)
	SkuAmount *int64 `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	// SKU ID
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// 面值
	SkuValue *string `json:"sku_value,omitempty" xml:"sku_value,omitempty"`
	// 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 商家在金融云的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryAasAntdaoMypointsOrderinstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasAntdaoMypointsOrderinstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetReqMsgId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetResultCode(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetResultMsg(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetBizId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.BizId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetChainId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.ChainId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetEnv(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.Env = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetExtendInfo(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.ExtendInfo = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetOrderId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.OrderId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetPreOrderId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.PreOrderId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetSkuAmount(v int64) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.SkuAmount = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetSkuId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.SkuId = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetSkuValue(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.SkuValue = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetStatus(v int64) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.Status = &v
	return s
}

func (s *QueryAasAntdaoMypointsOrderinstructionResponse) SetTenantId(v string) *QueryAasAntdaoMypointsOrderinstructionResponse {
	s.TenantId = &v
	return s
}

type Client struct {
	Endpoint        *string
	RegionId        *string
	AccessKeyId     *string
	AccessKeySecret *string
	Protocol        *string
	UserAgent       *string
	ReadTimeout     *int
	ConnectTimeout  *int
	HttpProxy       *string
	HttpsProxy      *string
	Socks5Proxy     *string
	Socks5NetWork   *string
	NoProxy         *string
	MaxIdleConns    *int
	SecurityToken   *string
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
	client.ReadTimeout = config.ReadTimeout
	client.ConnectTimeout = config.ConnectTimeout
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = config.MaxIdleConns
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":      "retry",
		"readTimeout":    tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout": tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":      tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":     tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":        tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":   tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
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
				"method":         action,
				"version":        version,
				"sign_type":      tea.String("HmacSHA1"),
				"req_time":       alipayutil.GetTimestamp(),
				"req_msg_id":     util.GetNonce(),
				"access_key":     client.AccessKeyId,
				"charset":        tea.String("UTF-8"),
				"baseSdkVersion": tea.String("Tea-SDK"),
				"sdkVersion":     tea.String("Tea-SDK-20200713"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = map[string]*string{
				"host":       client.Endpoint,
				"user-agent": client.GetUserAgent(),
			}
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = alipayutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			obj, _err := util.ReadAsJSON(response_.Body)
			if _err != nil {
				return _result, _err
			}

			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
			if tea.BoolValue(alipayutil.HasError(res)) {
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
 * Get user agent
 * @return user agent
 */
func (client *Client) GetUserAgent() (_result *string) {
	userAgent := tea.String("TeaClient/1.0.0")
	_body := util.GetUserAgent(userAgent)
	_result = _body
	return _result
}

/**
 * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-创建卡密
 */
func (client *Client) ExecAasAntdaoCardCreate(request *ExecAasAntdaoCardCreateRequest) (_result *ExecAasAntdaoCardCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardCreateResponse{}
	_body, _err := client.ExecAasAntdaoCardCreateEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-创建卡密
 */
func (client *Client) ExecAasAntdaoCardCreateEx(request *ExecAasAntdaoCardCreateRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.create.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-查询卡密
 */
func (client *Client) ExecAasAntdaoCardQuery(request *ExecAasAntdaoCardQueryRequest) (_result *ExecAasAntdaoCardQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardQueryResponse{}
	_body, _err := client.ExecAasAntdaoCardQueryEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-查询卡密
 */
func (client *Client) ExecAasAntdaoCardQueryEx(request *ExecAasAntdaoCardQueryRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardQueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.query.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-记名卡发行
 */
func (client *Client) ExecAasAntdaoCardBindname(request *ExecAasAntdaoCardBindnameRequest) (_result *ExecAasAntdaoCardBindnameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardBindnameResponse{}
	_body, _err := client.ExecAasAntdaoCardBindnameEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-记名卡发行
 */
func (client *Client) ExecAasAntdaoCardBindnameEx(request *ExecAasAntdaoCardBindnameRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardBindnameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardBindnameResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.bindname.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-充值卡密
 */
func (client *Client) ExecAasAntdaoCardCharge(request *ExecAasAntdaoCardChargeRequest) (_result *ExecAasAntdaoCardChargeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardChargeResponse{}
	_body, _err := client.ExecAasAntdaoCardChargeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-充值卡密
 */
func (client *Client) ExecAasAntdaoCardChargeEx(request *ExecAasAntdaoCardChargeRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardChargeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardChargeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.charge.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-核销卡密
 */
func (client *Client) ExecAasAntdaoCardWriteoff(request *ExecAasAntdaoCardWriteoffRequest) (_result *ExecAasAntdaoCardWriteoffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardWriteoffResponse{}
	_body, _err := client.ExecAasAntdaoCardWriteoffEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-核销卡密
 */
func (client *Client) ExecAasAntdaoCardWriteoffEx(request *ExecAasAntdaoCardWriteoffRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardWriteoffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardWriteoffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.writeoff.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-过期卡密
 */
func (client *Client) ExecAasAntdaoCardExpired(request *ExecAasAntdaoCardExpiredRequest) (_result *ExecAasAntdaoCardExpiredResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardExpiredResponse{}
	_body, _err := client.ExecAasAntdaoCardExpiredEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-过期卡密
 */
func (client *Client) ExecAasAntdaoCardExpiredEx(request *ExecAasAntdaoCardExpiredRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardExpiredResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardExpiredResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.expired.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-风控禁用卡密
 */
func (client *Client) ExecAasAntdaoCardForbidden(request *ExecAasAntdaoCardForbiddenRequest) (_result *ExecAasAntdaoCardForbiddenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardForbiddenResponse{}
	_body, _err := client.ExecAasAntdaoCardForbiddenEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-风控禁用卡密
 */
func (client *Client) ExecAasAntdaoCardForbiddenEx(request *ExecAasAntdaoCardForbiddenRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardForbiddenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardForbiddenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.forbidden.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-充值重置卡密
 */
func (client *Client) ExecAasAntdaoCardChargereset(request *ExecAasAntdaoCardChargeresetRequest) (_result *ExecAasAntdaoCardChargeresetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoCardChargeresetResponse{}
	_body, _err := client.ExecAasAntdaoCardChargeresetEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-充值重置卡密
 */
func (client *Client) ExecAasAntdaoCardChargeresetEx(request *ExecAasAntdaoCardChargeresetRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoCardChargeresetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoCardChargeresetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.card.chargereset.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询调用商户下的用户信息
 * Summary: 数字商品服务-商户管理-查询用户信息
 */
func (client *Client) QueryAasAntdaoMerchantUser(request *QueryAasAntdaoMerchantUserRequest) (_result *QueryAasAntdaoMerchantUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMerchantUserResponse{}
	_body, _err := client.QueryAasAntdaoMerchantUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询调用商户下的用户信息
 * Summary: 数字商品服务-商户管理-查询用户信息
 */
func (client *Client) QueryAasAntdaoMerchantUserEx(request *QueryAasAntdaoMerchantUserRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMerchantUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMerchantUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建商户管理下的用户
 * Summary: 数字商品服务-商户管理-商户创建用户
 */
func (client *Client) CreateAasAntdaoMerchantUser(request *CreateAasAntdaoMerchantUserRequest) (_result *CreateAasAntdaoMerchantUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasAntdaoMerchantUserResponse{}
	_body, _err := client.CreateAasAntdaoMerchantUserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建商户管理下的用户
 * Summary: 数字商品服务-商户管理-商户创建用户
 */
func (client *Client) CreateAasAntdaoMerchantUserEx(request *CreateAasAntdaoMerchantUserRequest, runtime *util.RuntimeOptions) (_result *CreateAasAntdaoMerchantUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasAntdaoMerchantUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
 * Summary: 数字商品服务-商户管理-查询商户信息
 */
func (client *Client) QueryAasAntdaoMerchant(request *QueryAasAntdaoMerchantRequest) (_result *QueryAasAntdaoMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMerchantResponse{}
	_body, _err := client.QueryAasAntdaoMerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
 * Summary: 数字商品服务-商户管理-查询商户信息
 */
func (client *Client) QueryAasAntdaoMerchantEx(request *QueryAasAntdaoMerchantRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
 * Summary: 数字商品服务-OSS服务-上传图片
 */
func (client *Client) UploadAasAntdaoImage(request *UploadAasAntdaoImageRequest) (_result *UploadAasAntdaoImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadAasAntdaoImageResponse{}
	_body, _err := client.UploadAasAntdaoImageEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
 * Summary: 数字商品服务-OSS服务-上传图片
 */
func (client *Client) UploadAasAntdaoImageEx(request *UploadAasAntdaoImageRequest, runtime *util.RuntimeOptions) (_result *UploadAasAntdaoImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAasAntdaoImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.image.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取kms中对应用户的公钥
 * Summary: 数字商品服务-密钥管理-获取用户公钥
 */
func (client *Client) GetAasAntdaoPkiPublickey(request *GetAasAntdaoPkiPublickeyRequest) (_result *GetAasAntdaoPkiPublickeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetAasAntdaoPkiPublickeyResponse{}
	_body, _err := client.GetAasAntdaoPkiPublickeyEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取kms中对应用户的公钥
 * Summary: 数字商品服务-密钥管理-获取用户公钥
 */
func (client *Client) GetAasAntdaoPkiPublickeyEx(request *GetAasAntdaoPkiPublickeyRequest, runtime *util.RuntimeOptions) (_result *GetAasAntdaoPkiPublickeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAasAntdaoPkiPublickeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.pki.publickey.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ECC公钥加密接口
 * Summary: 数字商品服务-密钥管理-公钥加密
 */
func (client *Client) ExecAasAntdaoPkiEncrypt(request *ExecAasAntdaoPkiEncryptRequest) (_result *ExecAasAntdaoPkiEncryptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoPkiEncryptResponse{}
	_body, _err := client.ExecAasAntdaoPkiEncryptEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ECC公钥加密接口
 * Summary: 数字商品服务-密钥管理-公钥加密
 */
func (client *Client) ExecAasAntdaoPkiEncryptEx(request *ExecAasAntdaoPkiEncryptRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoPkiEncryptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoPkiEncryptResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.pki.encrypt.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ECC解密算法接口
 * Summary: 数字商品服务-密钥管理-私钥解密
 */
func (client *Client) ExecAasAntdaoPkiDecrypt(request *ExecAasAntdaoPkiDecryptRequest) (_result *ExecAasAntdaoPkiDecryptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoPkiDecryptResponse{}
	_body, _err := client.ExecAasAntdaoPkiDecryptEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ECC解密算法接口
 * Summary: 数字商品服务-密钥管理-私钥解密
 */
func (client *Client) ExecAasAntdaoPkiDecryptEx(request *ExecAasAntdaoPkiDecryptRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoPkiDecryptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoPkiDecryptResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.pki.decrypt.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商户的友商信息
 * Summary: 数字商品服务-商户管理-更新商户友商
 */
func (client *Client) UpdateAasAntdaoMerchantFriend(request *UpdateAasAntdaoMerchantFriendRequest) (_result *UpdateAasAntdaoMerchantFriendResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoMerchantFriendResponse{}
	_body, _err := client.UpdateAasAntdaoMerchantFriendEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商户的友商信息
 * Summary: 数字商品服务-商户管理-更新商户友商
 */
func (client *Client) UpdateAasAntdaoMerchantFriendEx(request *UpdateAasAntdaoMerchantFriendRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoMerchantFriendResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoMerchantFriendResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.friend.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品供应商户发布一个商品
 * Summary: 数字商品服务-商品服务-创建商品
 */
func (client *Client) CreateAasAntdaoEquity(request *CreateAasAntdaoEquityRequest) (_result *CreateAasAntdaoEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasAntdaoEquityResponse{}
	_body, _err := client.CreateAasAntdaoEquityEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品供应商户发布一个商品
 * Summary: 数字商品服务-商品服务-创建商品
 */
func (client *Client) CreateAasAntdaoEquityEx(request *CreateAasAntdaoEquityRequest, runtime *util.RuntimeOptions) (_result *CreateAasAntdaoEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasAntdaoEquityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
下线商品
 * Summary: 数字商品服务-商品服务-下线商品
*/
func (client *Client) OfflineAasAntdaoEquity(request *OfflineAasAntdaoEquityRequest) (_result *OfflineAasAntdaoEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &OfflineAasAntdaoEquityResponse{}
	_body, _err := client.OfflineAasAntdaoEquityEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
下线商品
 * Summary: 数字商品服务-商品服务-下线商品
*/
func (client *Client) OfflineAasAntdaoEquityEx(request *OfflineAasAntdaoEquityRequest, runtime *util.RuntimeOptions) (_result *OfflineAasAntdaoEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineAasAntdaoEquityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至baas.antdao.equity.status.update
冻结权益
 * Summary: 数字商品服务-商品服务-冻结商品
*/
func (client *Client) FreezeAasAntdaoEquity(request *FreezeAasAntdaoEquityRequest) (_result *FreezeAasAntdaoEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FreezeAasAntdaoEquityResponse{}
	_body, _err := client.FreezeAasAntdaoEquityEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至baas.antdao.equity.status.update
冻结权益
 * Summary: 数字商品服务-商品服务-冻结商品
*/
func (client *Client) FreezeAasAntdaoEquityEx(request *FreezeAasAntdaoEquityRequest, runtime *util.RuntimeOptions) (_result *FreezeAasAntdaoEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FreezeAasAntdaoEquityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.freeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权兑换—非公开商品商户配置
 * Summary: 数字商品服务-商品服务-授权兑换
 */
func (client *Client) OpenAasAntdaoEquityMerchant(request *OpenAasAntdaoEquityMerchantRequest) (_result *OpenAasAntdaoEquityMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &OpenAasAntdaoEquityMerchantResponse{}
	_body, _err := client.OpenAasAntdaoEquityMerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权兑换—非公开商品商户配置
 * Summary: 数字商品服务-商品服务-授权兑换
 */
func (client *Client) OpenAasAntdaoEquityMerchantEx(request *OpenAasAntdaoEquityMerchantRequest, runtime *util.RuntimeOptions) (_result *OpenAasAntdaoEquityMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenAasAntdaoEquityMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.merchant.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户兑换价格设置
 * Summary: 数字商品服务-商品服务-用户兑换价格设置
 */
func (client *Client) AuthAasAntdaoEquityMerchantuserprice(request *AuthAasAntdaoEquityMerchantuserpriceRequest) (_result *AuthAasAntdaoEquityMerchantuserpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AuthAasAntdaoEquityMerchantuserpriceResponse{}
	_body, _err := client.AuthAasAntdaoEquityMerchantuserpriceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户兑换价格设置
 * Summary: 数字商品服务-商品服务-用户兑换价格设置
 */
func (client *Client) AuthAasAntdaoEquityMerchantuserpriceEx(request *AuthAasAntdaoEquityMerchantuserpriceRequest, runtime *util.RuntimeOptions) (_result *AuthAasAntdaoEquityMerchantuserpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAasAntdaoEquityMerchantuserpriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.merchantuserprice.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新商品价格
 * Summary: 数字商品服务-商品服务-更新商品价格
*/
func (client *Client) UpdateAasAntdaoEquityDefaultprice(request *UpdateAasAntdaoEquityDefaultpriceRequest) (_result *UpdateAasAntdaoEquityDefaultpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityDefaultpriceResponse{}
	_body, _err := client.UpdateAasAntdaoEquityDefaultpriceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新商品价格
 * Summary: 数字商品服务-商品服务-更新商品价格
*/
func (client *Client) UpdateAasAntdaoEquityDefaultpriceEx(request *UpdateAasAntdaoEquityDefaultpriceRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityDefaultpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityDefaultpriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.defaultprice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商品自定义定价
 * Summary: 数字商品服务-商品服务-更新自定义定价
 */
func (client *Client) UpdateAasAntdaoEquityTenantprice(request *UpdateAasAntdaoEquityTenantpriceRequest) (_result *UpdateAasAntdaoEquityTenantpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityTenantpriceResponse{}
	_body, _err := client.UpdateAasAntdaoEquityTenantpriceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商品自定义定价
 * Summary: 数字商品服务-商品服务-更新自定义定价
 */
func (client *Client) UpdateAasAntdaoEquityTenantpriceEx(request *UpdateAasAntdaoEquityTenantpriceRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityTenantpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityTenantpriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.tenantprice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
增加权益库存
 * Summary: 数字商品服务-商品服务-增加权益库存
*/
func (client *Client) AddAasAntdaoEquityCount(request *AddAasAntdaoEquityCountRequest) (_result *AddAasAntdaoEquityCountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddAasAntdaoEquityCountResponse{}
	_body, _err := client.AddAasAntdaoEquityCountEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
增加权益库存
 * Summary: 数字商品服务-商品服务-增加权益库存
*/
func (client *Client) AddAasAntdaoEquityCountEx(request *AddAasAntdaoEquityCountRequest, runtime *util.RuntimeOptions) (_result *AddAasAntdaoEquityCountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAasAntdaoEquityCountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.count.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新兑换限制规则
 * Summary: 数字商品服务-商品服务-更新兑换限制规则
*/
func (client *Client) UpdateAasAntdaoEquityExchangelimit(request *UpdateAasAntdaoEquityExchangelimitRequest) (_result *UpdateAasAntdaoEquityExchangelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityExchangelimitResponse{}
	_body, _err := client.UpdateAasAntdaoEquityExchangelimitEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新兑换限制规则
 * Summary: 数字商品服务-商品服务-更新兑换限制规则
*/
func (client *Client) UpdateAasAntdaoEquityExchangelimitEx(request *UpdateAasAntdaoEquityExchangelimitRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityExchangelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityExchangelimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.exchangelimit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新商品有效期
 * Summary: 数字商品服务-商品服务-更新有效期
*/
func (client *Client) UpdateAasAntdaoEquityValidtime(request *UpdateAasAntdaoEquityValidtimeRequest) (_result *UpdateAasAntdaoEquityValidtimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityValidtimeResponse{}
	_body, _err := client.UpdateAasAntdaoEquityValidtimeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口不使用，合并至 baas.antdao.equity.update
更新商品有效期
 * Summary: 数字商品服务-商品服务-更新有效期
*/
func (client *Client) UpdateAasAntdaoEquityValidtimeEx(request *UpdateAasAntdaoEquityValidtimeRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityValidtimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityValidtimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.validtime.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商品信息
 * Summary: 数字商品服务-商品服务-查询商品信息
 */
func (client *Client) QueryAasAntdaoEquity(request *QueryAasAntdaoEquityRequest) (_result *QueryAasAntdaoEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoEquityResponse{}
	_body, _err := client.QueryAasAntdaoEquityEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商品信息
 * Summary: 数字商品服务-商品服务-查询商品信息
 */
func (client *Client) QueryAasAntdaoEquityEx(request *QueryAasAntdaoEquityRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoEquityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户身份发起兑换
 * Summary: 数字商品服务-兑换服务-用户身份发起兑换
 */
func (client *Client) ExecAasAntdaoExchangeByuser(request *ExecAasAntdaoExchangeByuserRequest) (_result *ExecAasAntdaoExchangeByuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeByuserResponse{}
	_body, _err := client.ExecAasAntdaoExchangeByuserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户身份发起兑换
 * Summary: 数字商品服务-兑换服务-用户身份发起兑换
 */
func (client *Client) ExecAasAntdaoExchangeByuserEx(request *ExecAasAntdaoExchangeByuserRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeByuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeByuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.byuser.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户身份发起兑换
 * Summary: 数字商品服务-商品服务-商户身份发起兑换
 */
func (client *Client) ExecAasAntdaoExchangeBymerchant(request *ExecAasAntdaoExchangeBymerchantRequest) (_result *ExecAasAntdaoExchangeBymerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeBymerchantResponse{}
	_body, _err := client.ExecAasAntdaoExchangeBymerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户身份发起兑换
 * Summary: 数字商品服务-商品服务-商户身份发起兑换
 */
func (client *Client) ExecAasAntdaoExchangeBymerchantEx(request *ExecAasAntdaoExchangeBymerchantRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeBymerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeBymerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.bymerchant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
 * Summary: 数字商品服务-兑换服务-确认接单
 */
func (client *Client) ConfirmAasAntdaoExchange(request *ConfirmAasAntdaoExchangeRequest) (_result *ConfirmAasAntdaoExchangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmAasAntdaoExchangeResponse{}
	_body, _err := client.ConfirmAasAntdaoExchangeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
 * Summary: 数字商品服务-兑换服务-确认接单
 */
func (client *Client) ConfirmAasAntdaoExchangeEx(request *ConfirmAasAntdaoExchangeRequest, runtime *util.RuntimeOptions) (_result *ConfirmAasAntdaoExchangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmAasAntdaoExchangeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
 * Summary: 数字商品服务-兑换服务-拒绝发货
 */
func (client *Client) ExecAasAntdaoExchangeOutofstore(request *ExecAasAntdaoExchangeOutofstoreRequest) (_result *ExecAasAntdaoExchangeOutofstoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeOutofstoreResponse{}
	_body, _err := client.ExecAasAntdaoExchangeOutofstoreEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
 * Summary: 数字商品服务-兑换服务-拒绝发货
 */
func (client *Client) ExecAasAntdaoExchangeOutofstoreEx(request *ExecAasAntdaoExchangeOutofstoreRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeOutofstoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeOutofstoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.outofstore.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 兑换发货
 * Summary: 数字商品服务-兑换服务-兑换发货
 */
func (client *Client) SendAasAntdaoExchange(request *SendAasAntdaoExchangeRequest) (_result *SendAasAntdaoExchangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendAasAntdaoExchangeResponse{}
	_body, _err := client.SendAasAntdaoExchangeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 兑换发货
 * Summary: 数字商品服务-兑换服务-兑换发货
 */
func (client *Client) SendAasAntdaoExchangeEx(request *SendAasAntdaoExchangeRequest, runtime *util.RuntimeOptions) (_result *SendAasAntdaoExchangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAasAntdaoExchangeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户身份确认收货
 * Summary: 数字商品服务-兑换服务-用户身份确认收货
 */
func (client *Client) ExecAasAntdaoExchangeReceivebyuser(request *ExecAasAntdaoExchangeReceivebyuserRequest) (_result *ExecAasAntdaoExchangeReceivebyuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeReceivebyuserResponse{}
	_body, _err := client.ExecAasAntdaoExchangeReceivebyuserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户身份确认收货
 * Summary: 数字商品服务-兑换服务-用户身份确认收货
 */
func (client *Client) ExecAasAntdaoExchangeReceivebyuserEx(request *ExecAasAntdaoExchangeReceivebyuserRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeReceivebyuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeReceivebyuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.receivebyuser.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资产过期
 * Summary: 数字商品服务-资产服务-资产过期
 */
func (client *Client) ExecAasAntdaoAssetExpire(request *ExecAasAntdaoAssetExpireRequest) (_result *ExecAasAntdaoAssetExpireResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetExpireResponse{}
	_body, _err := client.ExecAasAntdaoAssetExpireEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资产过期
 * Summary: 数字商品服务-资产服务-资产过期
 */
func (client *Client) ExecAasAntdaoAssetExpireEx(request *ExecAasAntdaoAssetExpireRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetExpireResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetExpireResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.expire.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 检索资产流转流水
 * Summary: 数字商品服务-资产服务-查询资产流转流水
 */
func (client *Client) QueryAasAntdaoAssetInstruction(request *QueryAasAntdaoAssetInstructionRequest) (_result *QueryAasAntdaoAssetInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoAssetInstructionResponse{}
	_body, _err := client.QueryAasAntdaoAssetInstructionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检索资产流转流水
 * Summary: 数字商品服务-资产服务-查询资产流转流水
 */
func (client *Client) QueryAasAntdaoAssetInstructionEx(request *QueryAasAntdaoAssetInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoAssetInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoAssetInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口废弃不用！！！
查询商品兑换流水
 * Summary: 数字商品服务-兑换服务-查询商品兑换流水
*/
func (client *Client) QueryAasAntdaoExchangeInstruction(request *QueryAasAntdaoExchangeInstructionRequest) (_result *QueryAasAntdaoExchangeInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoExchangeInstructionResponse{}
	_body, _err := client.QueryAasAntdaoExchangeInstructionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口废弃不用！！！
查询商品兑换流水
 * Summary: 数字商品服务-兑换服务-查询商品兑换流水
*/
func (client *Client) QueryAasAntdaoExchangeInstructionEx(request *QueryAasAntdaoExchangeInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoExchangeInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoExchangeInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资产初始化发行
 * Summary: 数字商品服务-资产服务-资产初始化发行
 */
func (client *Client) ExecAasAntdaoAssetIssue(request *ExecAasAntdaoAssetIssueRequest) (_result *ExecAasAntdaoAssetIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetIssueResponse{}
	_body, _err := client.ExecAasAntdaoAssetIssueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资产初始化发行
 * Summary: 数字商品服务-资产服务-资产初始化发行
 */
func (client *Client) ExecAasAntdaoAssetIssueEx(request *ExecAasAntdaoAssetIssueRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.issue.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 赎回资产
 * Summary: 数字商品服务-资产服务-赎回资产
 */
func (client *Client) ExecAasAntdaoAssetRedeem(request *ExecAasAntdaoAssetRedeemRequest) (_result *ExecAasAntdaoAssetRedeemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetRedeemResponse{}
	_body, _err := client.ExecAasAntdaoAssetRedeemEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 赎回资产
 * Summary: 数字商品服务-资产服务-赎回资产
 */
func (client *Client) ExecAasAntdaoAssetRedeemEx(request *ExecAasAntdaoAssetRedeemRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetRedeemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetRedeemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.redeem.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发放资产
 * Summary: 数字商品服务-资产服务-发放资产
 */
func (client *Client) ExecAasAntdaoAssetGrant(request *ExecAasAntdaoAssetGrantRequest) (_result *ExecAasAntdaoAssetGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetGrantResponse{}
	_body, _err := client.ExecAasAntdaoAssetGrantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发放资产
 * Summary: 数字商品服务-资产服务-发放资产
 */
func (client *Client) ExecAasAntdaoAssetGrantEx(request *ExecAasAntdaoAssetGrantRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetGrantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.grant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发放回退资产
 * Summary: 数字商品服务-资产服务-发放回退资产
 */
func (client *Client) ExecAasAntdaoAssetGrantrefund(request *ExecAasAntdaoAssetGrantrefundRequest) (_result *ExecAasAntdaoAssetGrantrefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetGrantrefundResponse{}
	_body, _err := client.ExecAasAntdaoAssetGrantrefundEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发放回退资产
 * Summary: 数字商品服务-资产服务-发放回退资产
 */
func (client *Client) ExecAasAntdaoAssetGrantrefundEx(request *ExecAasAntdaoAssetGrantrefundRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetGrantrefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetGrantrefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.grantrefund.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风控调整资产
 * Summary: 数字商品服务-资产服务-风控调整资产
 */
func (client *Client) ExecAasAntdaoAssetAdjust(request *ExecAasAntdaoAssetAdjustRequest) (_result *ExecAasAntdaoAssetAdjustResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetAdjustResponse{}
	_body, _err := client.ExecAasAntdaoAssetAdjustEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风控调整资产
 * Summary: 数字商品服务-资产服务-风控调整资产
 */
func (client *Client) ExecAasAntdaoAssetAdjustEx(request *ExecAasAntdaoAssetAdjustRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetAdjustResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetAdjustResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.adjust.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资产查询
 * Summary: 数字商品服务-资产服务-资产查询
 */
func (client *Client) QueryAasAntdaoAsset(request *QueryAasAntdaoAssetRequest) (_result *QueryAasAntdaoAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoAssetResponse{}
	_body, _err := client.QueryAasAntdaoAssetEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资产查询
 * Summary: 数字商品服务-资产服务-资产查询
 */
func (client *Client) QueryAasAntdaoAssetEx(request *QueryAasAntdaoAssetRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户身份确认收货
 * Summary: 数字商品服务-兑换服务-商户身份确认收货
 */
func (client *Client) ExecAasAntdaoExchangeReceivebymerchant(request *ExecAasAntdaoExchangeReceivebymerchantRequest) (_result *ExecAasAntdaoExchangeReceivebymerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeReceivebymerchantResponse{}
	_body, _err := client.ExecAasAntdaoExchangeReceivebymerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户身份确认收货
 * Summary: 数字商品服务-兑换服务-商户身份确认收货
 */
func (client *Client) ExecAasAntdaoExchangeReceivebymerchantEx(request *ExecAasAntdaoExchangeReceivebymerchantRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeReceivebymerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeReceivebymerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.receivebymerchant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取特定高度的区块信息
 * Summary: 数字商品服务-拉块服务-获取区块信息
 */
func (client *Client) QueryAasAntdaoBlock(request *QueryAasAntdaoBlockRequest) (_result *QueryAasAntdaoBlockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockResponse{}
	_body, _err := client.QueryAasAntdaoBlockEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取特定高度的区块信息
 * Summary: 数字商品服务-拉块服务-获取区块信息
 */
func (client *Client) QueryAasAntdaoBlockEx(request *QueryAasAntdaoBlockRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.block.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取区块链最新区块高度
 * Summary: 数字商品服务-拉块服务-获取最新区块高度
 */
func (client *Client) QueryAasAntdaoBlockLastblocknumber(request *QueryAasAntdaoBlockLastblocknumberRequest) (_result *QueryAasAntdaoBlockLastblocknumberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockLastblocknumberResponse{}
	_body, _err := client.QueryAasAntdaoBlockLastblocknumberEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取区块链最新区块高度
 * Summary: 数字商品服务-拉块服务-获取最新区块高度
 */
func (client *Client) QueryAasAntdaoBlockLastblocknumberEx(request *QueryAasAntdaoBlockLastblocknumberRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockLastblocknumberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockLastblocknumberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.block.lastblocknumber.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商品信息
 * Summary: 数字商品服务-商品服务-更新商品属性信息
 */
func (client *Client) UpdateAasAntdaoEquity(request *UpdateAasAntdaoEquityRequest) (_result *UpdateAasAntdaoEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityResponse{}
	_body, _err := client.UpdateAasAntdaoEquityEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商品信息
 * Summary: 数字商品服务-商品服务-更新商品属性信息
 */
func (client *Client) UpdateAasAntdaoEquityEx(request *UpdateAasAntdaoEquityRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
 * Summary: 数字商品服务-商品服务-发布商品结果查询
 */
func (client *Client) QueryAasAntdaoEquityCreateresult(request *QueryAasAntdaoEquityCreateresultRequest) (_result *QueryAasAntdaoEquityCreateresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoEquityCreateresultResponse{}
	_body, _err := client.QueryAasAntdaoEquityCreateresultEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
 * Summary: 数字商品服务-商品服务-发布商品结果查询
 */
func (client *Client) QueryAasAntdaoEquityCreateresultEx(request *QueryAasAntdaoEquityCreateresultRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoEquityCreateresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoEquityCreateresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.createresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商品兑换流水交易号查询商品兑换流水详情
 * Summary: 数字商品服务-商品服务-查询商品兑换流水
 */
func (client *Client) QueryAasAntdaoEquityInstruction(request *QueryAasAntdaoEquityInstructionRequest) (_result *QueryAasAntdaoEquityInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoEquityInstructionResponse{}
	_body, _err := client.QueryAasAntdaoEquityInstructionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商品兑换流水交易号查询商品兑换流水详情
 * Summary: 数字商品服务-商品服务-查询商品兑换流水
 */
func (client *Client) QueryAasAntdaoEquityInstructionEx(request *QueryAasAntdaoEquityInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoEquityInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoEquityInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
 * Summary: 数字商品服务-OSS服务-获取图片URL
 */
func (client *Client) QueryAasAntdaoImage(request *QueryAasAntdaoImageRequest) (_result *QueryAasAntdaoImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoImageResponse{}
	_body, _err := client.QueryAasAntdaoImageEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
 * Summary: 数字商品服务-OSS服务-获取图片URL
 */
func (client *Client) QueryAasAntdaoImageEx(request *QueryAasAntdaoImageRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商品状态（可用，冻结，下线）
 * Summary: 数字商品服务-商品服务-更新商品状态
 */
func (client *Client) UpdateAasAntdaoEquityStatus(request *UpdateAasAntdaoEquityStatusRequest) (_result *UpdateAasAntdaoEquityStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoEquityStatusResponse{}
	_body, _err := client.UpdateAasAntdaoEquityStatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商品状态（可用，冻结，下线）
 * Summary: 数字商品服务-商品服务-更新商品状态
 */
func (client *Client) UpdateAasAntdaoEquityStatusEx(request *UpdateAasAntdaoEquityStatusRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoEquityStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoEquityStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置备付金金额（CAS接口）
 * Summary: 数字商品服务-商户管理-设置备付金金额
 */
func (client *Client) SetAasAntdaoMerchantProvision(request *SetAasAntdaoMerchantProvisionRequest) (_result *SetAasAntdaoMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.SetAasAntdaoMerchantProvisionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置备付金金额（CAS接口）
 * Summary: 数字商品服务-商户管理-设置备付金金额
 */
func (client *Client) SetAasAntdaoMerchantProvisionEx(request *SetAasAntdaoMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *SetAasAntdaoMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.provision.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商户的备付金金额，由资金管理员操作
 * Summary: 数字商品服务-商户管理-更新备付金金额
 */
func (client *Client) UpdateAasAntdaoMerchantProvision(request *UpdateAasAntdaoMerchantProvisionRequest) (_result *UpdateAasAntdaoMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.UpdateAasAntdaoMerchantProvisionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商户的备付金金额，由资金管理员操作
 * Summary: 数字商品服务-商户管理-更新备付金金额
 */
func (client *Client) UpdateAasAntdaoMerchantProvisionEx(request *UpdateAasAntdaoMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.provision.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核销商品兑换交易，由资金管理员操作
 * Summary: 数字商品服务-商品服务-核销商品兑换交易
 */
func (client *Client) ExecAasAntdaoEquityInstructionwriteoff(request *ExecAasAntdaoEquityInstructionwriteoffRequest) (_result *ExecAasAntdaoEquityInstructionwriteoffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoEquityInstructionwriteoffResponse{}
	_body, _err := client.ExecAasAntdaoEquityInstructionwriteoffEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核销商品兑换交易，由资金管理员操作
 * Summary: 数字商品服务-商品服务-核销商品兑换交易
 */
func (client *Client) ExecAasAntdaoEquityInstructionwriteoffEx(request *ExecAasAntdaoEquityInstructionwriteoffRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoEquityInstructionwriteoffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoEquityInstructionwriteoffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.equity.instructionwriteoff.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户的备付金列表
 * Summary: 数字商品服务-商户管理-查租户备付金列表
 */
func (client *Client) QueryAasAntdaoMerchantProvisions(request *QueryAasAntdaoMerchantProvisionsRequest) (_result *QueryAasAntdaoMerchantProvisionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMerchantProvisionsResponse{}
	_body, _err := client.QueryAasAntdaoMerchantProvisionsEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户的备付金列表
 * Summary: 数字商品服务-商户管理-查租户备付金列表
 */
func (client *Client) QueryAasAntdaoMerchantProvisionsEx(request *QueryAasAntdaoMerchantProvisionsRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMerchantProvisionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMerchantProvisionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.provisions.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
 * Summary: 数字商品服务-商户管理-查询可兑换商品
 */
func (client *Client) QueryAasAntdaoMerchantExchangeableequitylist(request *QueryAasAntdaoMerchantExchangeableequitylistRequest) (_result *QueryAasAntdaoMerchantExchangeableequitylistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMerchantExchangeableequitylistResponse{}
	_body, _err := client.QueryAasAntdaoMerchantExchangeableequitylistEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
 * Summary: 数字商品服务-商户管理-查询可兑换商品
 */
func (client *Client) QueryAasAntdaoMerchantExchangeableequitylistEx(request *QueryAasAntdaoMerchantExchangeableequitylistRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMerchantExchangeableequitylistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMerchantExchangeableequitylistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.exchangeableequitylist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
 * Summary: 数字商品服务-商户管理-查询可兑商品明细
 */
func (client *Client) QueryAasAntdaoMerchantExchangeableequitydetail(request *QueryAasAntdaoMerchantExchangeableequitydetailRequest) (_result *QueryAasAntdaoMerchantExchangeableequitydetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMerchantExchangeableequitydetailResponse{}
	_body, _err := client.QueryAasAntdaoMerchantExchangeableequitydetailEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
 * Summary: 数字商品服务-商户管理-查询可兑商品明细
 */
func (client *Client) QueryAasAntdaoMerchantExchangeableequitydetailEx(request *QueryAasAntdaoMerchantExchangeableequitydetailRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMerchantExchangeableequitydetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMerchantExchangeableequitydetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.exchangeableequitydetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建新资产
 * Summary: 数字商品服务-资产服务-创建资产
 */
func (client *Client) ExecAasAntdaoAssetCreate(request *ExecAasAntdaoAssetCreateRequest) (_result *ExecAasAntdaoAssetCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetCreateResponse{}
	_body, _err := client.ExecAasAntdaoAssetCreateEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建新资产
 * Summary: 数字商品服务-资产服务-创建资产
 */
func (client *Client) ExecAasAntdaoAssetCreateEx(request *ExecAasAntdaoAssetCreateRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.create.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资产铸币(不扣减备付金)，合约管理员操作
 * Summary: 数字商品服务-资产服务-资产铸币
 */
func (client *Client) ExecAasAntdaoAssetGenerate(request *ExecAasAntdaoAssetGenerateRequest) (_result *ExecAasAntdaoAssetGenerateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoAssetGenerateResponse{}
	_body, _err := client.ExecAasAntdaoAssetGenerateEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资产铸币(不扣减备付金)，合约管理员操作
 * Summary: 数字商品服务-资产服务-资产铸币
 */
func (client *Client) ExecAasAntdaoAssetGenerateEx(request *ExecAasAntdaoAssetGenerateRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoAssetGenerateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoAssetGenerateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.asset.generate.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建商户（合约管理员权限）
 * Summary: 数字商品服务-商户管理-创建商户
 */
func (client *Client) CreateAasAntdaoMerchant(request *CreateAasAntdaoMerchantRequest) (_result *CreateAasAntdaoMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasAntdaoMerchantResponse{}
	_body, _err := client.CreateAasAntdaoMerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建商户（合约管理员权限）
 * Summary: 数字商品服务-商户管理-创建商户
 */
func (client *Client) CreateAasAntdaoMerchantEx(request *CreateAasAntdaoMerchantRequest, runtime *util.RuntimeOptions) (_result *CreateAasAntdaoMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasAntdaoMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置商户的资金管理员，重要权限，谨慎操作！
 * Summary: 数字商品服务-商户管理-设置资金管理员
 */
func (client *Client) SetAasAntdaoMerchantFundmanager(request *SetAasAntdaoMerchantFundmanagerRequest) (_result *SetAasAntdaoMerchantFundmanagerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetAasAntdaoMerchantFundmanagerResponse{}
	_body, _err := client.SetAasAntdaoMerchantFundmanagerEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置商户的资金管理员，重要权限，谨慎操作！
 * Summary: 数字商品服务-商户管理-设置资金管理员
 */
func (client *Client) SetAasAntdaoMerchantFundmanagerEx(request *SetAasAntdaoMerchantFundmanagerRequest, runtime *util.RuntimeOptions) (_result *SetAasAntdaoMerchantFundmanagerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAasAntdaoMerchantFundmanagerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.fundmanager.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建备付金账户，合约管理员权限
 * Summary: 数字商品服务-商户管理-创建备付金账户
 */
func (client *Client) CreateAasAntdaoMerchantProvision(request *CreateAasAntdaoMerchantProvisionRequest) (_result *CreateAasAntdaoMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.CreateAasAntdaoMerchantProvisionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建备付金账户，合约管理员权限
 * Summary: 数字商品服务-商户管理-创建备付金账户
 */
func (client *Client) CreateAasAntdaoMerchantProvisionEx(request *CreateAasAntdaoMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *CreateAasAntdaoMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAasAntdaoMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.merchant.provision.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户的授权代理权限
 * Summary: 数字商品服务-管理服务-代理权限查询
 */
func (client *Client) QueryAasAntdaoConfigDelegaterelation(request *QueryAasAntdaoConfigDelegaterelationRequest) (_result *QueryAasAntdaoConfigDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoConfigDelegaterelationResponse{}
	_body, _err := client.QueryAasAntdaoConfigDelegaterelationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户的授权代理权限
 * Summary: 数字商品服务-管理服务-代理权限查询
 */
func (client *Client) QueryAasAntdaoConfigDelegaterelationEx(request *QueryAasAntdaoConfigDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoConfigDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoConfigDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.config.delegaterelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
 * Summary: 数字商品服务-管理服务-设置代理权限
 */
func (client *Client) UpdateAasAntdaoConfigDelegaterelation(request *UpdateAasAntdaoConfigDelegaterelationRequest) (_result *UpdateAasAntdaoConfigDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoConfigDelegaterelationResponse{}
	_body, _err := client.UpdateAasAntdaoConfigDelegaterelationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
 * Summary: 数字商品服务-管理服务-设置代理权限
 */
func (client *Client) UpdateAasAntdaoConfigDelegaterelationEx(request *UpdateAasAntdaoConfigDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoConfigDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoConfigDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.config.delegaterelation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询接口访问白名单信息
 * Summary: 数字商品服务-拉块服务-查询接口白名单
 */
func (client *Client) QueryAasAntdaoConfigWhitelist(request *QueryAasAntdaoConfigWhitelistRequest) (_result *QueryAasAntdaoConfigWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoConfigWhitelistResponse{}
	_body, _err := client.QueryAasAntdaoConfigWhitelistEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询接口访问白名单信息
 * Summary: 数字商品服务-拉块服务-查询接口白名单
 */
func (client *Client) QueryAasAntdaoConfigWhitelistEx(request *QueryAasAntdaoConfigWhitelistRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoConfigWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoConfigWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.config.whitelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置接口访问白名单
 * Summary: 数字商品服务-管理服务-设置访问白名单
 */
func (client *Client) UpdateAasAntdaoConfigWhitelist(request *UpdateAasAntdaoConfigWhitelistRequest) (_result *UpdateAasAntdaoConfigWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoConfigWhitelistResponse{}
	_body, _err := client.UpdateAasAntdaoConfigWhitelistEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置接口访问白名单
 * Summary: 数字商品服务-管理服务-设置访问白名单
 */
func (client *Client) UpdateAasAntdaoConfigWhitelistEx(request *UpdateAasAntdaoConfigWhitelistRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoConfigWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoConfigWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.config.whitelist.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 兑换单申请售后（采购商）
 * Summary: 数字商品服务-兑换服务-申请售后(商家)
 */
func (client *Client) ApplyAasAntdaoExchangeAftersale(request *ApplyAasAntdaoExchangeAftersaleRequest) (_result *ApplyAasAntdaoExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.ApplyAasAntdaoExchangeAftersaleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 兑换单申请售后（采购商）
 * Summary: 数字商品服务-兑换服务-申请售后(商家)
 */
func (client *Client) ApplyAasAntdaoExchangeAftersaleEx(request *ApplyAasAntdaoExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *ApplyAasAntdaoExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.aftersale.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同意售后（供应商）
 * Summary: 数字商品服务-兑换服务-同意售后
 */
func (client *Client) ExecAasAntdaoExchangeAgreeaftersale(request *ExecAasAntdaoExchangeAgreeaftersaleRequest) (_result *ExecAasAntdaoExchangeAgreeaftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoExchangeAgreeaftersaleResponse{}
	_body, _err := client.ExecAasAntdaoExchangeAgreeaftersaleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同意售后（供应商）
 * Summary: 数字商品服务-兑换服务-同意售后
 */
func (client *Client) ExecAasAntdaoExchangeAgreeaftersaleEx(request *ExecAasAntdaoExchangeAgreeaftersaleRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoExchangeAgreeaftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoExchangeAgreeaftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.agreeaftersale.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拒绝售后（供应商）
 * Summary: 数字商品服务-兑换服务-拒绝售后
 */
func (client *Client) RefuseAasAntdaoExchangeAftersale(request *RefuseAasAntdaoExchangeAftersaleRequest) (_result *RefuseAasAntdaoExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &RefuseAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.RefuseAasAntdaoExchangeAftersaleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拒绝售后（供应商）
 * Summary: 数字商品服务-兑换服务-拒绝售后
 */
func (client *Client) RefuseAasAntdaoExchangeAftersaleEx(request *RefuseAasAntdaoExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *RefuseAasAntdaoExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.aftersale.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 重新发货（供应商）
 * Summary: 数字商品服务-兑换服务-重新发货
 */
func (client *Client) SendAasAntdaoExchangeAftersale(request *SendAasAntdaoExchangeAftersaleRequest) (_result *SendAasAntdaoExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.SendAasAntdaoExchangeAftersaleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 重新发货（供应商）
 * Summary: 数字商品服务-兑换服务-重新发货
 */
func (client *Client) SendAasAntdaoExchangeAftersaleEx(request *SendAasAntdaoExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *SendAasAntdaoExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.aftersale.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户确认售后（供应商）comfirmaftersale
 * Summary:  数字商品服务-兑换服务-商户确认售后
 */
func (client *Client) ConfirmAasAntdaoExchangeAftersale(request *ConfirmAasAntdaoExchangeAftersaleRequest) (_result *ConfirmAasAntdaoExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.ConfirmAasAntdaoExchangeAftersaleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户确认售后（供应商）comfirmaftersale
 * Summary:  数字商品服务-兑换服务-商户确认售后
 */
func (client *Client) ConfirmAasAntdaoExchangeAftersaleEx(request *ConfirmAasAntdaoExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *ConfirmAasAntdaoExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmAasAntdaoExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.exchange.aftersale.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字消费卡链上发布
 * Summary: 数字商品服务-存证服务-消费卡链上发布
 */
func (client *Client) ExecAasAntdaoDataDeposit(request *ExecAasAntdaoDataDepositRequest) (_result *ExecAasAntdaoDataDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoDataDepositResponse{}
	_body, _err := client.ExecAasAntdaoDataDepositEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字消费卡链上发布
 * Summary: 数字商品服务-存证服务-消费卡链上发布
 */
func (client *Client) ExecAasAntdaoDataDepositEx(request *ExecAasAntdaoDataDepositRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoDataDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoDataDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.data.deposit.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置商品兑换手续费
 * Summary: 数字商品服务-商品服务-设置商品手续费
 */
func (client *Client) SetAasAntdaoCommission(request *SetAasAntdaoCommissionRequest) (_result *SetAasAntdaoCommissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetAasAntdaoCommissionResponse{}
	_body, _err := client.SetAasAntdaoCommissionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置商品兑换手续费
 * Summary: 数字商品服务-商品服务-设置商品手续费
 */
func (client *Client) SetAasAntdaoCommissionEx(request *SetAasAntdaoCommissionRequest, runtime *util.RuntimeOptions) (_result *SetAasAntdaoCommissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAasAntdaoCommissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.commission.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
 * Summary: 数字商品服务-商品服务-查询商品手续费
 */
func (client *Client) QueryAasAntdaoCommission(request *QueryAasAntdaoCommissionRequest) (_result *QueryAasAntdaoCommissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoCommissionResponse{}
	_body, _err := client.QueryAasAntdaoCommissionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
 * Summary: 数字商品服务-商品服务-查询商品手续费
 */
func (client *Client) QueryAasAntdaoCommissionEx(request *QueryAasAntdaoCommissionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoCommissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoCommissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.commission.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置收取手续费的商户信息（合约管理员权限）
 * Summary: 数字商品服务-商品服务-设置收手续费商户
 */
func (client *Client) SetAasAntdaoCommissionMerchant(request *SetAasAntdaoCommissionMerchantRequest) (_result *SetAasAntdaoCommissionMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetAasAntdaoCommissionMerchantResponse{}
	_body, _err := client.SetAasAntdaoCommissionMerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置收取手续费的商户信息（合约管理员权限）
 * Summary: 数字商品服务-商品服务-设置收手续费商户
 */
func (client *Client) SetAasAntdaoCommissionMerchantEx(request *SetAasAntdaoCommissionMerchantRequest, runtime *util.RuntimeOptions) (_result *SetAasAntdaoCommissionMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAasAntdaoCommissionMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.commission.merchant.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询收取手续费的商户信息
 * Summary: 数字商品服务-商品服务-查询收手续费商户
 */
func (client *Client) QueryAasAntdaoCommissionMerchant(request *QueryAasAntdaoCommissionMerchantRequest) (_result *QueryAasAntdaoCommissionMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoCommissionMerchantResponse{}
	_body, _err := client.QueryAasAntdaoCommissionMerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询收取手续费的商户信息
 * Summary: 数字商品服务-商品服务-查询收手续费商户
 */
func (client *Client) QueryAasAntdaoCommissionMerchantEx(request *QueryAasAntdaoCommissionMerchantRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoCommissionMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoCommissionMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.commission.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取特定高度的区块信息
 * Summary: 数字商品服务-拉块服务-获取区块信息
 */
func (client *Client) QueryAasAntdaoBlockanalysisBlock(request *QueryAasAntdaoBlockanalysisBlockRequest) (_result *QueryAasAntdaoBlockanalysisBlockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisBlockResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisBlockEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取特定高度的区块信息
 * Summary: 数字商品服务-拉块服务-获取区块信息
 */
func (client *Client) QueryAasAntdaoBlockanalysisBlockEx(request *QueryAasAntdaoBlockanalysisBlockRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisBlockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisBlockResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.block.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取最新区块高度
 * Summary: 数字商品服务-拉块服务-获取最新区块高度
 */
func (client *Client) QueryAasAntdaoBlockanalysisLastblocknumber(request *QueryAasAntdaoBlockanalysisLastblocknumberRequest) (_result *QueryAasAntdaoBlockanalysisLastblocknumberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisLastblocknumberResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisLastblocknumberEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取最新区块高度
 * Summary: 数字商品服务-拉块服务-获取最新区块高度
 */
func (client *Client) QueryAasAntdaoBlockanalysisLastblocknumberEx(request *QueryAasAntdaoBlockanalysisLastblocknumberRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisLastblocknumberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisLastblocknumberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.lastblocknumber.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取公开的或者已授权的权益商品信息
 * Summary: 数字商品服务-拉块服务-获取已授权商品
 */
func (client *Client) QueryAasAntdaoBlockanalysisOpenedequities(request *QueryAasAntdaoBlockanalysisOpenedequitiesRequest) (_result *QueryAasAntdaoBlockanalysisOpenedequitiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisOpenedequitiesResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisOpenedequitiesEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取公开的或者已授权的权益商品信息
 * Summary: 数字商品服务-拉块服务-获取已授权商品
 */
func (client *Client) QueryAasAntdaoBlockanalysisOpenedequitiesEx(request *QueryAasAntdaoBlockanalysisOpenedequitiesRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisOpenedequitiesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisOpenedequitiesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.openedequities.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询已设置过用户价格的有效权益商品信息
 * Summary: 数字商品服务-拉块服务-已设用户价格商品
 */
func (client *Client) QueryAasAntdaoBlockanalysisUserpriceupdatedequities(request *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest) (_result *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询已设置过用户价格的有效权益商品信息
 * Summary: 数字商品服务-拉块服务-已设用户价格商品
 */
func (client *Client) QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesEx(request *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.userpriceupdatedequities.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商户的可提现资产价值(单位:分)
 * Summary: 数字商品服务-拉块服务-查询可提现资产
 */
func (client *Client) QueryAasAntdaoBlockanalysisUnwriteoffvalue(request *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest) (_result *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisUnwriteoffvalueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商户的可提现资产价值(单位:分)
 * Summary: 数字商品服务-拉块服务-查询可提现资产
 */
func (client *Client) QueryAasAntdaoBlockanalysisUnwriteoffvalueEx(request *QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.unwriteoffvalue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
 * Summary: 数字商品服务-拉块服务-设置代理权限
 */
func (client *Client) UpdateAasAntdaoBlockanalysisDelegaterelation(request *UpdateAasAntdaoBlockanalysisDelegaterelationRequest) (_result *UpdateAasAntdaoBlockanalysisDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoBlockanalysisDelegaterelationResponse{}
	_body, _err := client.UpdateAasAntdaoBlockanalysisDelegaterelationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
 * Summary: 数字商品服务-拉块服务-设置代理权限
 */
func (client *Client) UpdateAasAntdaoBlockanalysisDelegaterelationEx(request *UpdateAasAntdaoBlockanalysisDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoBlockanalysisDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoBlockanalysisDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.delegaterelation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置接口访问白名单。
 * Summary: 数字商品服务-拉块服务-设置访问白名单
 */
func (client *Client) UpdateAasAntdaoBlockanalysisWhitelist(request *UpdateAasAntdaoBlockanalysisWhitelistRequest) (_result *UpdateAasAntdaoBlockanalysisWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateAasAntdaoBlockanalysisWhitelistResponse{}
	_body, _err := client.UpdateAasAntdaoBlockanalysisWhitelistEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置接口访问白名单。
 * Summary: 数字商品服务-拉块服务-设置访问白名单
 */
func (client *Client) UpdateAasAntdaoBlockanalysisWhitelistEx(request *UpdateAasAntdaoBlockanalysisWhitelistRequest, runtime *util.RuntimeOptions) (_result *UpdateAasAntdaoBlockanalysisWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAasAntdaoBlockanalysisWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.whitelist.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户的授权代理权限
 * Summary: 数字商品服务-拉块服务-代理权限查询
 */
func (client *Client) QueryAasAntdaoBlockanalysisDelegaterelation(request *QueryAasAntdaoBlockanalysisDelegaterelationRequest) (_result *QueryAasAntdaoBlockanalysisDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisDelegaterelationResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisDelegaterelationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户的授权代理权限
 * Summary: 数字商品服务-拉块服务-代理权限查询
 */
func (client *Client) QueryAasAntdaoBlockanalysisDelegaterelationEx(request *QueryAasAntdaoBlockanalysisDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.delegaterelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询接口访问白名单信息
 * Summary: 数字商品服务-拉块服务-查询接口白名单
 */
func (client *Client) QueryAasAntdaoBlockanalysisWhitelist(request *QueryAasAntdaoBlockanalysisWhitelistRequest) (_result *QueryAasAntdaoBlockanalysisWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisWhitelistResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisWhitelistEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询接口访问白名单信息
 * Summary: 数字商品服务-拉块服务-查询接口白名单
 */
func (client *Client) QueryAasAntdaoBlockanalysisWhitelistEx(request *QueryAasAntdaoBlockanalysisWhitelistRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.whitelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据交易hash获取交易信息
 * Summary: 数字商品服务-拉块服务-获取交易信息
 */
func (client *Client) QueryAasAntdaoBlockanalysisTransaction(request *QueryAasAntdaoBlockanalysisTransactionRequest) (_result *QueryAasAntdaoBlockanalysisTransactionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoBlockanalysisTransactionResponse{}
	_body, _err := client.QueryAasAntdaoBlockanalysisTransactionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据交易hash获取交易信息
 * Summary: 数字商品服务-拉块服务-获取交易信息
 */
func (client *Client) QueryAasAntdaoBlockanalysisTransactionEx(request *QueryAasAntdaoBlockanalysisTransactionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoBlockanalysisTransactionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoBlockanalysisTransactionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.blockanalysis.transaction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可订购的SKU列表查询
 * Summary: 数字商品服务-商品服务-商品列表查询
 */
func (client *Client) QueryAasAntdaoMypointsSku(request *QueryAasAntdaoMypointsSkuRequest) (_result *QueryAasAntdaoMypointsSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMypointsSkuResponse{}
	_body, _err := client.QueryAasAntdaoMypointsSkuEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可订购的SKU列表查询
 * Summary: 数字商品服务-商品服务-商品列表查询
 */
func (client *Client) QueryAasAntdaoMypointsSkuEx(request *QueryAasAntdaoMypointsSkuRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMypointsSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMypointsSkuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.sku.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商户的积分库和预算库
 * Summary: 数字商品服务-商品服务-积分预算库查询
 */
func (client *Client) QueryAasAntdaoMypointsMerchantbalance(request *QueryAasAntdaoMypointsMerchantbalanceRequest) (_result *QueryAasAntdaoMypointsMerchantbalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMypointsMerchantbalanceResponse{}
	_body, _err := client.QueryAasAntdaoMypointsMerchantbalanceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商户的积分库和预算库
 * Summary: 数字商品服务-商品服务-积分预算库查询
 */
func (client *Client) QueryAasAntdaoMypointsMerchantbalanceEx(request *QueryAasAntdaoMypointsMerchantbalanceRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMypointsMerchantbalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMypointsMerchantbalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.merchantbalance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 预下单商品
 * Summary: 数字商品服务-商品服务-商品预下单
 */
func (client *Client) ExecAasAntdaoMypointsPreordersku(request *ExecAasAntdaoMypointsPreorderskuRequest) (_result *ExecAasAntdaoMypointsPreorderskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoMypointsPreorderskuResponse{}
	_body, _err := client.ExecAasAntdaoMypointsPreorderskuEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 预下单商品
 * Summary: 数字商品服务-商品服务-商品预下单
 */
func (client *Client) ExecAasAntdaoMypointsPreorderskuEx(request *ExecAasAntdaoMypointsPreorderskuRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoMypointsPreorderskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoMypointsPreorderskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.preordersku.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品下单
 * Summary: 数字商品服务-商品服务-商品下单
 */
func (client *Client) ExecAasAntdaoMypointsOrdersku(request *ExecAasAntdaoMypointsOrderskuRequest) (_result *ExecAasAntdaoMypointsOrderskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAasAntdaoMypointsOrderskuResponse{}
	_body, _err := client.ExecAasAntdaoMypointsOrderskuEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品下单
 * Summary: 数字商品服务-商品服务-商品下单
 */
func (client *Client) ExecAasAntdaoMypointsOrderskuEx(request *ExecAasAntdaoMypointsOrderskuRequest, runtime *util.RuntimeOptions) (_result *ExecAasAntdaoMypointsOrderskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAasAntdaoMypointsOrderskuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.ordersku.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商品ID，查询批量购买的费率
 * Summary: 数字商品服务-商品服务-商品费率查询
 */
func (client *Client) QueryAasAntdaoMypointsSkufee(request *QueryAasAntdaoMypointsSkufeeRequest) (_result *QueryAasAntdaoMypointsSkufeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMypointsSkufeeResponse{}
	_body, _err := client.QueryAasAntdaoMypointsSkufeeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商品ID，查询批量购买的费率
 * Summary: 数字商品服务-商品服务-商品费率查询
 */
func (client *Client) QueryAasAntdaoMypointsSkufeeEx(request *QueryAasAntdaoMypointsSkufeeRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMypointsSkufeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMypointsSkufeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.skufee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询集分宝SKU的预下单流水记录
 * Summary: 数字商品服务-商品服务-预下单流水查询
 */
func (client *Client) QueryAasAntdaoMypointsPreorderinstruction(request *QueryAasAntdaoMypointsPreorderinstructionRequest) (_result *QueryAasAntdaoMypointsPreorderinstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMypointsPreorderinstructionResponse{}
	_body, _err := client.QueryAasAntdaoMypointsPreorderinstructionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询集分宝SKU的预下单流水记录
 * Summary: 数字商品服务-商品服务-预下单流水查询
 */
func (client *Client) QueryAasAntdaoMypointsPreorderinstructionEx(request *QueryAasAntdaoMypointsPreorderinstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMypointsPreorderinstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMypointsPreorderinstructionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.preorderinstruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询下单流水信息
 * Summary: 数字商品服务-商品服务-商品下单流水查询
 */
func (client *Client) QueryAasAntdaoMypointsOrderinstruction(request *QueryAasAntdaoMypointsOrderinstructionRequest) (_result *QueryAasAntdaoMypointsOrderinstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAasAntdaoMypointsOrderinstructionResponse{}
	_body, _err := client.QueryAasAntdaoMypointsOrderinstructionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询下单流水信息
 * Summary: 数字商品服务-商品服务-商品下单流水查询
 */
func (client *Client) QueryAasAntdaoMypointsOrderinstructionEx(request *QueryAasAntdaoMypointsOrderinstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAasAntdaoMypointsOrderinstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasAntdaoMypointsOrderinstructionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.antdao.mypoints.orderinstruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
