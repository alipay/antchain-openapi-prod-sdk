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
	AuthToken       *string `json:"authToken,omitempty" xml:"authToken,omitempty"`
	Protocol        *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	RegionId        *string `json:"regionId,omitempty" xml:"regionId,omitempty"`
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
	Tenant          *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	Workspace       *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
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

func (s *Config) SetAuthToken(v string) *Config {
	s.AuthToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetRegionId(v string) *Config {
	s.RegionId = &v
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

func (s *Config) SetTenant(v string) *Config {
	s.Tenant = &v
	return s
}

func (s *Config) SetWorkspace(v string) *Config {
	s.Workspace = &v
	return s
}

type LogEntry struct {
	From    *string   `json:"from,omitempty" xml:"from,omitempty"`
	LogData *string   `json:"log_data,omitempty" xml:"log_data,omitempty"`
	To      *string   `json:"to,omitempty" xml:"to,omitempty"`
	Topics  []*string `json:"topics,omitempty" xml:"topics,omitempty" type:"Repeated"`
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

type Extension struct {
	Key   *int64  `json:"key,omitempty" xml:"key,omitempty"`
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

type UserPrice struct {
	Price               *string `json:"price,omitempty" xml:"price,omitempty"`
	Ratio               *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	SnapshotTenantPrice *string `json:"snapshot_tenant_price,omitempty" xml:"snapshot_tenant_price,omitempty"`
	UserPriceType       *int64  `json:"user_price_type,omitempty" xml:"user_price_type,omitempty"`
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

type BlockTransaction struct {
	Data      *string      `json:"data,omitempty" xml:"data,omitempty"`
	Extension []*Extension `json:"extension,omitempty" xml:"extension,omitempty" type:"Repeated"`
	From      *string      `json:"from,omitempty" xml:"from,omitempty"`
	Gas       *int64       `json:"gas,omitempty" xml:"gas,omitempty"`
	GroupId   *string      `json:"group_id,omitempty" xml:"group_id,omitempty"`
	Hash      *string      `json:"hash,omitempty" xml:"hash,omitempty"`
	Nonce     *string      `json:"nonce,omitempty" xml:"nonce,omitempty"`
	Period    *int64       `json:"period,omitempty" xml:"period,omitempty"`
	Signature []*string    `json:"signature,omitempty" xml:"signature,omitempty" type:"Repeated"`
	Timestamp *int64       `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	To        *string      `json:"to,omitempty" xml:"to,omitempty"`
	Type      *int64       `json:"type,omitempty" xml:"type,omitempty"`
	Value     *int64       `json:"value,omitempty" xml:"value,omitempty"`
	Version   *int64       `json:"version,omitempty" xml:"version,omitempty"`
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

type BlockReceipt struct {
	GasUsed *int64      `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	Logs    []*LogEntry `json:"logs,omitempty" xml:"logs,omitempty" type:"Repeated"`
	Output  *string     `json:"output,omitempty" xml:"output,omitempty"`
	Result  *int64      `json:"result,omitempty" xml:"result,omitempty"`
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

type BlockBody struct {
	ConsensusProof  *string             `json:"consensus_proof,omitempty" xml:"consensus_proof,omitempty"`
	ReceiptList     []*BlockReceipt     `json:"receipt_list,omitempty" xml:"receipt_list,omitempty" type:"Repeated"`
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

type Provision struct {
	CreditMax  *string `json:"credit_max,omitempty" xml:"credit_max,omitempty"`
	CreditUsed *string `json:"credit_used,omitempty" xml:"credit_used,omitempty"`
	Currency   *string `json:"currency,omitempty" xml:"currency,omitempty"`
	Debit      *string `json:"debit,omitempty" xml:"debit,omitempty"`
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

type EquityExtInfo struct {
	LimitPerDayUsed   *int64     `json:"limit_per_day_used,omitempty" xml:"limit_per_day_used,omitempty"`
	LimitPerMonthUsed *int64     `json:"limit_per_month_used,omitempty" xml:"limit_per_month_used,omitempty"`
	OpenToTenantId    *string    `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	TargetDate        *string    `json:"target_date,omitempty" xml:"target_date,omitempty"`
	TenantPrice       *string    `json:"tenant_price,omitempty" xml:"tenant_price,omitempty"`
	TenantUserPrice   *UserPrice `json:"tenant_user_price,omitempty" xml:"tenant_user_price,omitempty"`
}

func (s EquityExtInfo) String() string {
	return tea.Prettify(s)
}

func (s EquityExtInfo) GoString() string {
	return s.String()
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

func (s *EquityExtInfo) SetTenantUserPrice(v *UserPrice) *EquityExtInfo {
	s.TenantUserPrice = v
	return s
}

type EquityDetail struct {
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	DescImages  *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityId    *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityName  *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType  *string `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	EquityValue *string `json:"equity_value,omitempty" xml:"equity_value,omitempty"`
	Images      *string `json:"images,omitempty" xml:"images,omitempty"`
	Price       *string `json:"price,omitempty" xml:"price,omitempty"`
	SkuId       *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
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

type AssetExtInfo struct {
	DispenseBalance   *string `json:"dispense_balance,omitempty" xml:"dispense_balance,omitempty"`
	DispenseTenantId  *string `json:"dispense_tenant_id,omitempty" xml:"dispense_tenant_id,omitempty"`
	UserCreditBalance *string `json:"user_credit_balance,omitempty" xml:"user_credit_balance,omitempty"`
	UserId            *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
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

type BlockHeader struct {
	GasUsed         *int64  `json:"gas_used,omitempty" xml:"gas_used,omitempty"`
	Hash            *string `json:"hash,omitempty" xml:"hash,omitempty"`
	LogBloom        *string `json:"log_bloom,omitempty" xml:"log_bloom,omitempty"`
	Number          *int64  `json:"number,omitempty" xml:"number,omitempty"`
	ParentHash      *string `json:"parent_hash,omitempty" xml:"parent_hash,omitempty"`
	ReceiptRoot     *string `json:"receipt_root,omitempty" xml:"receipt_root,omitempty"`
	StateRoot       *string `json:"state_root,omitempty" xml:"state_root,omitempty"`
	Timestamp       *int64  `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	TransactionRoot *string `json:"transaction_root,omitempty" xml:"transaction_root,omitempty"`
	Version         *int64  `json:"version,omitempty" xml:"version,omitempty"`
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

type Card struct {
	CalStatus       *int64  `json:"cal_status,omitempty" xml:"cal_status,omitempty"`
	CardId          *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	ChargeTime      *int64  `json:"charge_time,omitempty" xml:"charge_time,omitempty"`
	CountOfMinUnit  *int64  `json:"count_of_min_unit,omitempty" xml:"count_of_min_unit,omitempty"`
	CreateTime      *int64  `json:"create_time,omitempty" xml:"create_time,omitempty"`
	CreateTxHash    *string `json:"create_tx_hash,omitempty" xml:"create_tx_hash,omitempty"`
	DesensitizedUid *string `json:"desensitized_uid,omitempty" xml:"desensitized_uid,omitempty"`
	ExtInfo         *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	MinUnit         *int64  `json:"min_unit,omitempty" xml:"min_unit,omitempty"`
	PublicKey       *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	Status          *int64  `json:"status,omitempty" xml:"status,omitempty"`
	UidPublicKey    *string `json:"uid_public_key,omitempty" xml:"uid_public_key,omitempty"`
	ValidAfter      *int64  `json:"valid_after,omitempty" xml:"valid_after,omitempty"`
	ValidBefore     *int64  `json:"valid_before,omitempty" xml:"valid_before,omitempty"`
	ValidDays       *int64  `json:"valid_days,omitempty" xml:"valid_days,omitempty"`
	Value           *int64  `json:"value,omitempty" xml:"value,omitempty"`
	Version         *int64  `json:"version,omitempty" xml:"version,omitempty"`
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

type SKUItem struct {
	Rate      *string `json:"rate,omitempty" xml:"rate,omitempty"`
	SkuAmount *int64  `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	SkuId     *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	SkuName   *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	SkuPrice  *string `json:"sku_price,omitempty" xml:"sku_price,omitempty"`
	Status    *int64  `json:"status,omitempty" xml:"status,omitempty"`
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

type MultiURL struct {
	Normal   *string `json:"normal,omitempty" xml:"normal,omitempty"`
	Style150 *string `json:"style_150,omitempty" xml:"style_150,omitempty"`
	Style200 *string `json:"style_200,omitempty" xml:"style_200,omitempty"`
	Style70  *string `json:"style_70,omitempty" xml:"style_70,omitempty"`
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

type EInstruction struct {
	AssetId            *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	AssetRate          *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	DeductAssetAmount  *string `json:"deduct_asset_amount,omitempty" xml:"deduct_asset_amount,omitempty"`
	DeductCreditAmount *string `json:"deduct_credit_amount,omitempty" xml:"deduct_credit_amount,omitempty"`
	DeductDebitAmount  *string `json:"deduct_debit_amount,omitempty" xml:"deduct_debit_amount,omitempty"`
	DeductTenantId     *string `json:"deduct_tenant_id,omitempty" xml:"deduct_tenant_id,omitempty"`
	EquityId           *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityName         *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityPrice        *string `json:"equity_price,omitempty" xml:"equity_price,omitempty"`
	EquityValue        *string `json:"equity_value,omitempty" xml:"equity_value,omitempty"`
	Memo               *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OptTenantId        *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId            *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	Status             *int64  `json:"status,omitempty" xml:"status,omitempty"`
	TenantId           *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TimeStamp          *int64  `json:"time_stamp,omitempty" xml:"time_stamp,omitempty"`
	Type               *int64  `json:"type,omitempty" xml:"type,omitempty"`
	UserId             *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
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

type APIWhiteListInfo struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Extension  *string `json:"extension,omitempty" xml:"extension,omitempty"`
	Level      *int64  `json:"level,omitempty" xml:"level,omitempty"`
	TenantId   *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
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

type Transaction struct {
	Data      *string `json:"data,omitempty" xml:"data,omitempty"`
	From      *string `json:"from,omitempty" xml:"from,omitempty"`
	Hash      *string `json:"hash,omitempty" xml:"hash,omitempty"`
	Nonce     *int64  `json:"nonce,omitempty" xml:"nonce,omitempty"`
	Period    *int64  `json:"period,omitempty" xml:"period,omitempty"`
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	Timestamp *int64  `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	To        *string `json:"to,omitempty" xml:"to,omitempty"`
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

type DiscreteValue struct {
	SortId *int64  `json:"sort_id,omitempty" xml:"sort_id,omitempty"`
	Text   *string `json:"text,omitempty" xml:"text,omitempty"`
	Value  *string `json:"value,omitempty" xml:"value,omitempty"`
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

type Equity struct {
	AdminId                  *string        `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	AuthType                 *int64         `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	Currency                 *string        `json:"currency,omitempty" xml:"currency,omitempty"`
	DefaultPrice             *string        `json:"default_price,omitempty" xml:"default_price,omitempty"`
	Description              *string        `json:"description,omitempty" xml:"description,omitempty"`
	DescImages               *string        `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityExtInfo            *EquityExtInfo `json:"equity_ext_info,omitempty" xml:"equity_ext_info,omitempty"`
	EquityId                 *string        `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityName               *string        `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType               *string        `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	Images                   *string        `json:"images,omitempty" xml:"images,omitempty"`
	IsPublic                 *bool          `json:"is_public,omitempty" xml:"is_public,omitempty"`
	LimitPerMerchantAndDay   *int64         `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMonth *int64         `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	LimitPerUserAndDay       *int64         `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int64         `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	Memo                     *string        `json:"memo,omitempty" xml:"memo,omitempty"`
	Status                   *int64         `json:"status,omitempty" xml:"status,omitempty"`
	TenantId                 *string        `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TotalCount               *string        `json:"total_count,omitempty" xml:"total_count,omitempty"`
	UseValidNotAfter         *int64         `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore        *int64         `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter            *int64         `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore           *int64         `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	Value                    *string        `json:"value,omitempty" xml:"value,omitempty"`
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

type Block struct {
	Body   *BlockBody   `json:"body,omitempty" xml:"body,omitempty"`
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

type OpenedEquity struct {
	AdminId                  *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	AuthType                 *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	Currency                 *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DefaultPrice             *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	Description              *string `json:"description,omitempty" xml:"description,omitempty"`
	DescImages               *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityD                  *string `json:"equity_d,omitempty" xml:"equity_d,omitempty"`
	EquityName               *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType               *int64  `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	Images                   *string `json:"images,omitempty" xml:"images,omitempty"`
	IsPublic                 *bool   `json:"is_public,omitempty" xml:"is_public,omitempty"`
	LimitPerMerchantAndDay   *int64  `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMonth *int64  `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	LimitPerUserAndDay       *int64  `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int64  `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	Memo                     *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OpenToTenantId           *string `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	Status                   *int64  `json:"status,omitempty" xml:"status,omitempty"`
	TenantId                 *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TenantPrice              *string `json:"tenant_price,omitempty" xml:"tenant_price,omitempty"`
	TotalCount               *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	UseValidNotAfter         *int64  `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore        *int64  `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter            *int64  `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore           *int64  `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	Value                    *string `json:"value,omitempty" xml:"value,omitempty"`
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

type Asset struct {
	AdminId                       *string       `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	AssetExtInfo                  *AssetExtInfo `json:"asset_ext_info,omitempty" xml:"asset_ext_info,omitempty"`
	AssetId                       *string       `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	AssetName                     *string       `json:"asset_name,omitempty" xml:"asset_name,omitempty"`
	AssetRate                     *string       `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	Currency                      *string       `json:"currency,omitempty" xml:"currency,omitempty"`
	IssueAccountBalance           *string       `json:"issue_account_balance,omitempty" xml:"issue_account_balance,omitempty"`
	OverdueRecoveryAccountBalance *string       `json:"overdue_recovery_account_balance,omitempty" xml:"overdue_recovery_account_balance,omitempty"`
	ReceivePaymentAccountBalance  *string       `json:"receive_payment_account_balance,omitempty" xml:"receive_payment_account_balance,omitempty"`
	RelayAccountBalance           *string       `json:"relay_account_balance,omitempty" xml:"relay_account_balance,omitempty"`
	Status                        *int64        `json:"status,omitempty" xml:"status,omitempty"`
	TenantId                      *string       `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TotalIssueBalance             *string       `json:"total_issue_balance,omitempty" xml:"total_issue_balance,omitempty"`
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

type DelegateRelationInfo struct {
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	Extension         *string `json:"extension,omitempty" xml:"extension,omitempty"`
	Status            *bool   `json:"status,omitempty" xml:"status,omitempty"`
	TenantId          *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	UpdateTime        *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
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

type MerchantBudget struct {
	BudgetCode      *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	BudgetDesc      *string `json:"budget_desc,omitempty" xml:"budget_desc,omitempty"`
	BudgetEndTime   *string `json:"budget_end_time,omitempty" xml:"budget_end_time,omitempty"`
	BudgetStartTime *string `json:"budget_start_time,omitempty" xml:"budget_start_time,omitempty"`
	PointLibCode    *string `json:"point_lib_code,omitempty" xml:"point_lib_code,omitempty"`
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

type ExchangeableEquityList struct {
	EndRow          *int64          `json:"end_row,omitempty" xml:"end_row,omitempty"`
	EquityList      []*EquityDetail `json:"equity_list,omitempty" xml:"equity_list,omitempty" type:"Repeated"`
	FirstPage       *int64          `json:"first_page,omitempty" xml:"first_page,omitempty"`
	HasNextPage     *bool           `json:"has_next_page,omitempty" xml:"has_next_page,omitempty"`
	HasPreviousPage *bool           `json:"has_previous_page,omitempty" xml:"has_previous_page,omitempty"`
	IsFirstPage     *bool           `json:"is_first_page,omitempty" xml:"is_first_page,omitempty"`
	IsLastPage      *bool           `json:"is_last_page,omitempty" xml:"is_last_page,omitempty"`
	LastPage        *int64          `json:"last_page,omitempty" xml:"last_page,omitempty"`
	NextPage        *int64          `json:"next_page,omitempty" xml:"next_page,omitempty"`
	OrderBy         *string         `json:"order_by,omitempty" xml:"order_by,omitempty"`
	Pages           *int64          `json:"pages,omitempty" xml:"pages,omitempty"`
	PageNumber      *int64          `json:"page_number,omitempty" xml:"page_number,omitempty"`
	PageSize        *int64          `json:"page_size,omitempty" xml:"page_size,omitempty"`
	PrePage         *int64          `json:"pre_page,omitempty" xml:"pre_page,omitempty"`
	Size            *int64          `json:"size,omitempty" xml:"size,omitempty"`
	StartRow        *int64          `json:"start_row,omitempty" xml:"start_row,omitempty"`
	Total           *int64          `json:"total,omitempty" xml:"total,omitempty"`
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

type UserPriceEquity struct {
	AdminId                  *string `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	AuthType                 *int64  `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	Currency                 *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DefaultPrice             *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	Description              *string `json:"description,omitempty" xml:"description,omitempty"`
	DescImages               *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityD                  *string `json:"equity_d,omitempty" xml:"equity_d,omitempty"`
	EquityName               *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType               *int64  `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	Images                   *string `json:"images,omitempty" xml:"images,omitempty"`
	IsPublic                 *bool   `json:"is_public,omitempty" xml:"is_public,omitempty"`
	LimitPerMerchantAndDay   *int64  `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMonth *int64  `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	LimitPerUserAndDay       *int64  `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int64  `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	Memo                     *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OpenToTenantId           *string `json:"open_to_tenant_id,omitempty" xml:"open_to_tenant_id,omitempty"`
	Price                    *string `json:"price,omitempty" xml:"price,omitempty"`
	Ratio                    *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	SnapshotTenantPrice      *string `json:"snapshot_tenant_price,omitempty" xml:"snapshot_tenant_price,omitempty"`
	Status                   *int64  `json:"status,omitempty" xml:"status,omitempty"`
	TenantId                 *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TotalCount               *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	UserPriceType            *int64  `json:"user_price_type,omitempty" xml:"user_price_type,omitempty"`
	UseValidNotAfter         *int64  `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore        *int64  `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter            *int64  `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore           *int64  `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	Value                    *string `json:"value,omitempty" xml:"value,omitempty"`
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

type Merchant struct {
	AdminId           *string    `json:"admin_id,omitempty" xml:"admin_id,omitempty"`
	Description       *string    `json:"description,omitempty" xml:"description,omitempty"`
	Did               *string    `json:"did,omitempty" xml:"did,omitempty"`
	FundManagerId     *string    `json:"fund_manager_id,omitempty" xml:"fund_manager_id,omitempty"`
	IsAssetIssuer     *bool      `json:"is_asset_issuer,omitempty" xml:"is_asset_issuer,omitempty"`
	IsEquityConsumer  *bool      `json:"is_equity_consumer,omitempty" xml:"is_equity_consumer,omitempty"`
	IsEquityProvider  *bool      `json:"is_equity_provider,omitempty" xml:"is_equity_provider,omitempty"`
	ProfitLossBalance *string    `json:"profit_loss_balance,omitempty" xml:"profit_loss_balance,omitempty"`
	Provision         *Provision `json:"provision,omitempty" xml:"provision,omitempty"`
	Status            *int64     `json:"status,omitempty" xml:"status,omitempty"`
	TenantId          *string    `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
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

type User struct {
	Did      *string `json:"did,omitempty" xml:"did,omitempty"`
	LocalId  *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
	Pk       *string `json:"pk,omitempty" xml:"pk,omitempty"`
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	UserId   *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	Vc       *string `json:"vc,omitempty" xml:"vc,omitempty"`
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

type ExecCardForbiddenRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardForbiddenRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardForbiddenRequest) GoString() string {
	return s.String()
}

func (s *ExecCardForbiddenRequest) SetChainId(v string) *ExecCardForbiddenRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardForbiddenRequest) SetTx(v *Transaction) *ExecCardForbiddenRequest {
	s.Tx = v
	return s
}

type ExecCardForbiddenResponse struct {
}

func (s ExecCardForbiddenResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardForbiddenResponse) GoString() string {
	return s.String()
}

type QueryMypointsOrderinstructionRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env     *string `json:"env,omitempty" xml:"env,omitempty"`
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	SkuId   *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryMypointsOrderinstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsOrderinstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryMypointsOrderinstructionRequest) SetChainId(v string) *QueryMypointsOrderinstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsOrderinstructionRequest) SetEnv(v string) *QueryMypointsOrderinstructionRequest {
	s.Env = &v
	return s
}

func (s *QueryMypointsOrderinstructionRequest) SetOrderNo(v string) *QueryMypointsOrderinstructionRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryMypointsOrderinstructionRequest) SetSkuId(v string) *QueryMypointsOrderinstructionRequest {
	s.SkuId = &v
	return s
}

type QueryMypointsOrderinstructionResponse struct {
	BizId      *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	BudgetCode *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env        *string `json:"env,omitempty" xml:"env,omitempty"`
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	OrderId    *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	SkuAmount  *int    `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	SkuId      *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	SkuValue   *string `json:"sku_value,omitempty" xml:"sku_value,omitempty"`
	Status     *int    `json:"status,omitempty" xml:"status,omitempty"`
	TenantId   *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryMypointsOrderinstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsOrderinstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryMypointsOrderinstructionResponse) SetBizId(v string) *QueryMypointsOrderinstructionResponse {
	s.BizId = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetBudgetCode(v string) *QueryMypointsOrderinstructionResponse {
	s.BudgetCode = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetChainId(v string) *QueryMypointsOrderinstructionResponse {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetEnv(v string) *QueryMypointsOrderinstructionResponse {
	s.Env = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetExtendInfo(v string) *QueryMypointsOrderinstructionResponse {
	s.ExtendInfo = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetOrderId(v string) *QueryMypointsOrderinstructionResponse {
	s.OrderId = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetSkuAmount(v int) *QueryMypointsOrderinstructionResponse {
	s.SkuAmount = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetSkuId(v string) *QueryMypointsOrderinstructionResponse {
	s.SkuId = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetSkuValue(v string) *QueryMypointsOrderinstructionResponse {
	s.SkuValue = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetStatus(v int) *QueryMypointsOrderinstructionResponse {
	s.Status = &v
	return s
}

func (s *QueryMypointsOrderinstructionResponse) SetTenantId(v string) *QueryMypointsOrderinstructionResponse {
	s.TenantId = &v
	return s
}

type QueryBlockanalysisBlockRequest struct {
	BlockNumber        *int      `json:"block_number,omitempty" xml:"block_number,omitempty"`
	ChainId            *string   `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantIds []*string `json:"delegated_tenant_ids,omitempty" xml:"delegated_tenant_ids,omitempty" type:"Repeated"`
}

func (s QueryBlockanalysisBlockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisBlockRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisBlockRequest) SetBlockNumber(v int) *QueryBlockanalysisBlockRequest {
	s.BlockNumber = &v
	return s
}

func (s *QueryBlockanalysisBlockRequest) SetChainId(v string) *QueryBlockanalysisBlockRequest {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisBlockRequest) SetDelegatedTenantIds(v []*string) *QueryBlockanalysisBlockRequest {
	s.DelegatedTenantIds = v
	return s
}

type QueryBlockanalysisBlockResponse struct {
	Block           *Block  `json:"block,omitempty" xml:"block,omitempty"`
	BlockNumber     *int    `json:"block_number,omitempty" xml:"block_number,omitempty"`
	ChainId         *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	FilteredTxCount *int    `json:"filtered_tx_count,omitempty" xml:"filtered_tx_count,omitempty"`
	TotalTxCount    *int    `json:"total_tx_count,omitempty" xml:"total_tx_count,omitempty"`
}

func (s QueryBlockanalysisBlockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisBlockResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisBlockResponse) SetBlock(v *Block) *QueryBlockanalysisBlockResponse {
	s.Block = v
	return s
}

func (s *QueryBlockanalysisBlockResponse) SetBlockNumber(v int) *QueryBlockanalysisBlockResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryBlockanalysisBlockResponse) SetChainId(v string) *QueryBlockanalysisBlockResponse {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisBlockResponse) SetFilteredTxCount(v int) *QueryBlockanalysisBlockResponse {
	s.FilteredTxCount = &v
	return s
}

func (s *QueryBlockanalysisBlockResponse) SetTotalTxCount(v int) *QueryBlockanalysisBlockResponse {
	s.TotalTxCount = &v
	return s
}

type UpdateEquityDefaultpriceRequest struct {
	Amount            *string `json:"amount,omitempty" xml:"amount,omitempty"`
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateEquityDefaultpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityDefaultpriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityDefaultpriceRequest) SetAmount(v string) *UpdateEquityDefaultpriceRequest {
	s.Amount = &v
	return s
}

func (s *UpdateEquityDefaultpriceRequest) SetChainId(v string) *UpdateEquityDefaultpriceRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityDefaultpriceRequest) SetDelegatedTenantId(v string) *UpdateEquityDefaultpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityDefaultpriceRequest) SetEquityId(v string) *UpdateEquityDefaultpriceRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityDefaultpriceRequest) SetOutTxId(v string) *UpdateEquityDefaultpriceRequest {
	s.OutTxId = &v
	return s
}

type UpdateEquityDefaultpriceResponse struct {
}

func (s UpdateEquityDefaultpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityDefaultpriceResponse) GoString() string {
	return s.String()
}

type CreateMerchantProvisionRequest struct {
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Currency    *string `json:"currency,omitempty" xml:"currency,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId     *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *CreateMerchantProvisionRequest) SetChainId(v string) *CreateMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *CreateMerchantProvisionRequest) SetCurrency(v string) *CreateMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *CreateMerchantProvisionRequest) SetOptTenantId(v string) *CreateMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *CreateMerchantProvisionRequest) SetOutTxId(v string) *CreateMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type CreateMerchantProvisionResponse struct {
}

func (s CreateMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantProvisionResponse) GoString() string {
	return s.String()
}

type ExecMypointsOrderskuRequest struct {
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env         *string `json:"env,omitempty" xml:"env,omitempty"`
	OrderNo     *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	PreOrderId  *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	SkuId       *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s ExecMypointsOrderskuRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecMypointsOrderskuRequest) GoString() string {
	return s.String()
}

func (s *ExecMypointsOrderskuRequest) SetChainId(v string) *ExecMypointsOrderskuRequest {
	s.ChainId = &v
	return s
}

func (s *ExecMypointsOrderskuRequest) SetEnv(v string) *ExecMypointsOrderskuRequest {
	s.Env = &v
	return s
}

func (s *ExecMypointsOrderskuRequest) SetOrderNo(v string) *ExecMypointsOrderskuRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecMypointsOrderskuRequest) SetPhoneNumber(v string) *ExecMypointsOrderskuRequest {
	s.PhoneNumber = &v
	return s
}

func (s *ExecMypointsOrderskuRequest) SetPreOrderId(v string) *ExecMypointsOrderskuRequest {
	s.PreOrderId = &v
	return s
}

func (s *ExecMypointsOrderskuRequest) SetSkuId(v string) *ExecMypointsOrderskuRequest {
	s.SkuId = &v
	return s
}

type ExecMypointsOrderskuResponse struct {
	CardId    *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	CardValue *int    `json:"card_value,omitempty" xml:"card_value,omitempty"`
	OrderNo   *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	Url       *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s ExecMypointsOrderskuResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecMypointsOrderskuResponse) GoString() string {
	return s.String()
}

func (s *ExecMypointsOrderskuResponse) SetCardId(v string) *ExecMypointsOrderskuResponse {
	s.CardId = &v
	return s
}

func (s *ExecMypointsOrderskuResponse) SetCardValue(v int) *ExecMypointsOrderskuResponse {
	s.CardValue = &v
	return s
}

func (s *ExecMypointsOrderskuResponse) SetOrderNo(v string) *ExecMypointsOrderskuResponse {
	s.OrderNo = &v
	return s
}

func (s *ExecMypointsOrderskuResponse) SetUrl(v string) *ExecMypointsOrderskuResponse {
	s.Url = &v
	return s
}

type SetMerchantProvisionRequest struct {
	ChainId                  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	CreditMaxAmount          *string `json:"credit_max_amount,omitempty" xml:"credit_max_amount,omitempty"`
	CreditUsedAmount         *string `json:"credit_used_amount,omitempty" xml:"credit_used_amount,omitempty"`
	Currency                 *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DebitAmount              *string `json:"debit_amount,omitempty" xml:"debit_amount,omitempty"`
	OptTenantId              *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OriginalCreditMaxAmount  *string `json:"original_credit_max_amount,omitempty" xml:"original_credit_max_amount,omitempty"`
	OriginalCreditUsedAmount *string `json:"original_credit_used_amount,omitempty" xml:"original_credit_used_amount,omitempty"`
	OriginalDebitAmount      *string `json:"original_debit_amount,omitempty" xml:"original_debit_amount,omitempty"`
	OutTxId                  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s SetMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *SetMerchantProvisionRequest) SetChainId(v string) *SetMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetCreditMaxAmount(v string) *SetMerchantProvisionRequest {
	s.CreditMaxAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetCreditUsedAmount(v string) *SetMerchantProvisionRequest {
	s.CreditUsedAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetCurrency(v string) *SetMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetDebitAmount(v string) *SetMerchantProvisionRequest {
	s.DebitAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetOptTenantId(v string) *SetMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetOriginalCreditMaxAmount(v string) *SetMerchantProvisionRequest {
	s.OriginalCreditMaxAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetOriginalCreditUsedAmount(v string) *SetMerchantProvisionRequest {
	s.OriginalCreditUsedAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetOriginalDebitAmount(v string) *SetMerchantProvisionRequest {
	s.OriginalDebitAmount = &v
	return s
}

func (s *SetMerchantProvisionRequest) SetOutTxId(v string) *SetMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type SetMerchantProvisionResponse struct {
}

func (s SetMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s SetMerchantProvisionResponse) GoString() string {
	return s.String()
}

type QueryBlockanalysisDelegaterelationRequest struct {
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryBlockanalysisDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisDelegaterelationRequest) SetDelegatedTenantId(v string) *QueryBlockanalysisDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryBlockanalysisDelegaterelationResponse struct {
	DelegateRelationInfos []*DelegateRelationInfo `json:"delegate_relation_infos,omitempty" xml:"delegate_relation_infos,omitempty" type:"Repeated"`
}

func (s QueryBlockanalysisDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisDelegaterelationResponse) SetDelegateRelationInfos(v []*DelegateRelationInfo) *QueryBlockanalysisDelegaterelationResponse {
	s.DelegateRelationInfos = v
	return s
}

type ExecCardQueryRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardQueryRequest) GoString() string {
	return s.String()
}

func (s *ExecCardQueryRequest) SetChainId(v string) *ExecCardQueryRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardQueryRequest) SetTx(v *Transaction) *ExecCardQueryRequest {
	s.Tx = v
	return s
}

type ExecCardQueryResponse struct {
	Card *Card `json:"card,omitempty" xml:"card,omitempty"`
}

func (s ExecCardQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardQueryResponse) GoString() string {
	return s.String()
}

func (s *ExecCardQueryResponse) SetCard(v *Card) *ExecCardQueryResponse {
	s.Card = v
	return s
}

type UpdateEquityExchangelimitRequest struct {
	ChainId                  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId        *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId                 *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	LimitPerMerchantAndDay   *int    `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMontn *int    `json:"limit_per_merchant_and_montn,omitempty" xml:"limit_per_merchant_and_montn,omitempty"`
	LimitPerUserAndDay       *int    `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int    `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	OutTxId                  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateEquityExchangelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityExchangelimitRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityExchangelimitRequest) SetChainId(v string) *UpdateEquityExchangelimitRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetDelegatedTenantId(v string) *UpdateEquityExchangelimitRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetEquityId(v string) *UpdateEquityExchangelimitRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetLimitPerMerchantAndDay(v int) *UpdateEquityExchangelimitRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetLimitPerMerchantAndMontn(v int) *UpdateEquityExchangelimitRequest {
	s.LimitPerMerchantAndMontn = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetLimitPerUserAndDay(v int) *UpdateEquityExchangelimitRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetLimitPerUserAndMonth(v int) *UpdateEquityExchangelimitRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *UpdateEquityExchangelimitRequest) SetOutTxId(v string) *UpdateEquityExchangelimitRequest {
	s.OutTxId = &v
	return s
}

type UpdateEquityExchangelimitResponse struct {
}

func (s UpdateEquityExchangelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityExchangelimitResponse) GoString() string {
	return s.String()
}

type QueryMypointsPreorderinstructionRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env     *string `json:"env,omitempty" xml:"env,omitempty"`
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	SkuId   *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryMypointsPreorderinstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsPreorderinstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryMypointsPreorderinstructionRequest) SetChainId(v string) *QueryMypointsPreorderinstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionRequest) SetEnv(v string) *QueryMypointsPreorderinstructionRequest {
	s.Env = &v
	return s
}

func (s *QueryMypointsPreorderinstructionRequest) SetOrderNo(v string) *QueryMypointsPreorderinstructionRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryMypointsPreorderinstructionRequest) SetSkuId(v string) *QueryMypointsPreorderinstructionRequest {
	s.SkuId = &v
	return s
}

type QueryMypointsPreorderinstructionResponse struct {
	BizId        *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	BudgetCode   *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	ChainId      *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env          *string `json:"env,omitempty" xml:"env,omitempty"`
	ExtendInfo   *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	Pid          *string `json:"pid,omitempty" xml:"pid,omitempty"`
	PointLibCode *string `json:"point_lib_code,omitempty" xml:"point_lib_code,omitempty"`
	PreOrderId   *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	RemainCount  *int    `json:"remain_count,omitempty" xml:"remain_count,omitempty"`
	SkuAmount    *int    `json:"sku_amount,omitempty" xml:"sku_amount,omitempty"`
	SkuId        *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	SkuValue     *string `json:"sku_value,omitempty" xml:"sku_value,omitempty"`
	Status       *int    `json:"status,omitempty" xml:"status,omitempty"`
	TenantId     *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TotalAmount  *int    `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	TotalCount   *int    `json:"total_count,omitempty" xml:"total_count,omitempty"`
	TotalValue   *string `json:"total_value,omitempty" xml:"total_value,omitempty"`
}

func (s QueryMypointsPreorderinstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsPreorderinstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryMypointsPreorderinstructionResponse) SetBizId(v string) *QueryMypointsPreorderinstructionResponse {
	s.BizId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetBudgetCode(v string) *QueryMypointsPreorderinstructionResponse {
	s.BudgetCode = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetChainId(v string) *QueryMypointsPreorderinstructionResponse {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetEnv(v string) *QueryMypointsPreorderinstructionResponse {
	s.Env = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetExtendInfo(v string) *QueryMypointsPreorderinstructionResponse {
	s.ExtendInfo = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetPid(v string) *QueryMypointsPreorderinstructionResponse {
	s.Pid = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetPointLibCode(v string) *QueryMypointsPreorderinstructionResponse {
	s.PointLibCode = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetPreOrderId(v string) *QueryMypointsPreorderinstructionResponse {
	s.PreOrderId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetRemainCount(v int) *QueryMypointsPreorderinstructionResponse {
	s.RemainCount = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetSkuAmount(v int) *QueryMypointsPreorderinstructionResponse {
	s.SkuAmount = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetSkuId(v string) *QueryMypointsPreorderinstructionResponse {
	s.SkuId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetSkuValue(v string) *QueryMypointsPreorderinstructionResponse {
	s.SkuValue = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetStatus(v int) *QueryMypointsPreorderinstructionResponse {
	s.Status = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetTenantId(v string) *QueryMypointsPreorderinstructionResponse {
	s.TenantId = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetTotalAmount(v int) *QueryMypointsPreorderinstructionResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetTotalCount(v int) *QueryMypointsPreorderinstructionResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryMypointsPreorderinstructionResponse) SetTotalValue(v string) *QueryMypointsPreorderinstructionResponse {
	s.TotalValue = &v
	return s
}

type UpdateBlockanalysisDelegaterelationRequest struct {
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OptType           *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateBlockanalysisDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBlockanalysisDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateBlockanalysisDelegaterelationRequest) SetDelegatedTenantId(v string) *UpdateBlockanalysisDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateBlockanalysisDelegaterelationRequest) SetOptTenantId(v string) *UpdateBlockanalysisDelegaterelationRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateBlockanalysisDelegaterelationRequest) SetOptType(v string) *UpdateBlockanalysisDelegaterelationRequest {
	s.OptType = &v
	return s
}

type UpdateBlockanalysisDelegaterelationResponse struct {
}

func (s UpdateBlockanalysisDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBlockanalysisDelegaterelationResponse) GoString() string {
	return s.String()
}

type UpdateMerchantProvisionRequest struct {
	ChainId          *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	CreditMaxAmount  *string `json:"credit_max_amount,omitempty" xml:"credit_max_amount,omitempty"`
	CreditUsedAmount *string `json:"credit_used_amount,omitempty" xml:"credit_used_amount,omitempty"`
	Currency         *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DebitAmount      *string `json:"debit_amount,omitempty" xml:"debit_amount,omitempty"`
	OptTenantId      *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OptType          *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
	OutTxId          *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateMerchantProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantProvisionRequest) GoString() string {
	return s.String()
}

func (s *UpdateMerchantProvisionRequest) SetChainId(v string) *UpdateMerchantProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetCreditMaxAmount(v string) *UpdateMerchantProvisionRequest {
	s.CreditMaxAmount = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetCreditUsedAmount(v string) *UpdateMerchantProvisionRequest {
	s.CreditUsedAmount = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetCurrency(v string) *UpdateMerchantProvisionRequest {
	s.Currency = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetDebitAmount(v string) *UpdateMerchantProvisionRequest {
	s.DebitAmount = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetOptTenantId(v string) *UpdateMerchantProvisionRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetOptType(v string) *UpdateMerchantProvisionRequest {
	s.OptType = &v
	return s
}

func (s *UpdateMerchantProvisionRequest) SetOutTxId(v string) *UpdateMerchantProvisionRequest {
	s.OutTxId = &v
	return s
}

type UpdateMerchantProvisionResponse struct {
}

func (s UpdateMerchantProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantProvisionResponse) GoString() string {
	return s.String()
}

type FreezeEquityRequest struct {
	ChainId  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s FreezeEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s FreezeEquityRequest) GoString() string {
	return s.String()
}

func (s *FreezeEquityRequest) SetChainId(v string) *FreezeEquityRequest {
	s.ChainId = &v
	return s
}

func (s *FreezeEquityRequest) SetEquityId(v string) *FreezeEquityRequest {
	s.EquityId = &v
	return s
}

func (s *FreezeEquityRequest) SetOutTxId(v string) *FreezeEquityRequest {
	s.OutTxId = &v
	return s
}

type FreezeEquityResponse struct {
}

func (s FreezeEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s FreezeEquityResponse) GoString() string {
	return s.String()
}

type ExecCardWriteoffRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardWriteoffRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardWriteoffRequest) GoString() string {
	return s.String()
}

func (s *ExecCardWriteoffRequest) SetChainId(v string) *ExecCardWriteoffRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardWriteoffRequest) SetTx(v *Transaction) *ExecCardWriteoffRequest {
	s.Tx = v
	return s
}

type ExecCardWriteoffResponse struct {
}

func (s ExecCardWriteoffResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardWriteoffResponse) GoString() string {
	return s.String()
}

type QueryMerchantUserRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	LocalId *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
}

func (s QueryMerchantUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantUserRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantUserRequest) SetChainId(v string) *QueryMerchantUserRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMerchantUserRequest) SetLocalId(v string) *QueryMerchantUserRequest {
	s.LocalId = &v
	return s
}

type QueryMerchantUserResponse struct {
	User *User `json:"user,omitempty" xml:"user,omitempty"`
}

func (s QueryMerchantUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantUserResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantUserResponse) SetUser(v *User) *QueryMerchantUserResponse {
	s.User = v
	return s
}

type QueryBlockLastblocknumberRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryBlockLastblocknumberRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockLastblocknumberRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockLastblocknumberRequest) SetChainId(v string) *QueryBlockLastblocknumberRequest {
	s.ChainId = &v
	return s
}

type QueryBlockLastblocknumberResponse struct {
	LastBlockNumber *int `json:"last_block_number,omitempty" xml:"last_block_number,omitempty"`
}

func (s QueryBlockLastblocknumberResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockLastblocknumberResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockLastblocknumberResponse) SetLastBlockNumber(v int) *QueryBlockLastblocknumberResponse {
	s.LastBlockNumber = &v
	return s
}

type QueryEquityInstructionRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryEquityInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryEquityInstructionRequest) SetChainId(v string) *QueryEquityInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryEquityInstructionRequest) SetDelegatedTenantId(v string) *QueryEquityInstructionRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *QueryEquityInstructionRequest) SetEquityId(v string) *QueryEquityInstructionRequest {
	s.EquityId = &v
	return s
}

func (s *QueryEquityInstructionRequest) SetOptTenantId(v string) *QueryEquityInstructionRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryEquityInstructionRequest) SetOriginTxId(v string) *QueryEquityInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryEquityInstructionResponse struct {
	Instruction *EInstruction `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryEquityInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryEquityInstructionResponse) SetInstruction(v *EInstruction) *QueryEquityInstructionResponse {
	s.Instruction = v
	return s
}

type QueryMerchantProvisionsRequest struct {
	BusinessAction *string `json:"business_action,omitempty" xml:"business_action,omitempty"`
	OptTenantId    *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	ProductCode    *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s QueryMerchantProvisionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantProvisionsRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantProvisionsRequest) SetBusinessAction(v string) *QueryMerchantProvisionsRequest {
	s.BusinessAction = &v
	return s
}

func (s *QueryMerchantProvisionsRequest) SetOptTenantId(v string) *QueryMerchantProvisionsRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryMerchantProvisionsRequest) SetProductCode(v string) *QueryMerchantProvisionsRequest {
	s.ProductCode = &v
	return s
}

type QueryMerchantProvisionsResponse struct {
	DiscreteValues []*DiscreteValue `json:"discrete_values,omitempty" xml:"discrete_values,omitempty" type:"Repeated"`
}

func (s QueryMerchantProvisionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantProvisionsResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantProvisionsResponse) SetDiscreteValues(v []*DiscreteValue) *QueryMerchantProvisionsResponse {
	s.DiscreteValues = v
	return s
}

type QueryConfigDelegaterelationRequest struct {
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryConfigDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryConfigDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *QueryConfigDelegaterelationRequest) SetDelegatedTenantId(v string) *QueryConfigDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryConfigDelegaterelationResponse struct {
	DelegateRelationInfos []*DelegateRelationInfo `json:"delegate_relation_infos,omitempty" xml:"delegate_relation_infos,omitempty" type:"Repeated"`
}

func (s QueryConfigDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryConfigDelegaterelationResponse) GoString() string {
	return s.String()
}

func (s *QueryConfigDelegaterelationResponse) SetDelegateRelationInfos(v []*DelegateRelationInfo) *QueryConfigDelegaterelationResponse {
	s.DelegateRelationInfos = v
	return s
}

type ExecExchangeByuserRequest struct {
	AssetId           *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	AssetIssuer       *string `json:"asset_issuer,omitempty" xml:"asset_issuer,omitempty"`
	AssetRate         *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityProvider    *string `json:"equity_provider,omitempty" xml:"equity_provider,omitempty"`
	EquityRate        *string `json:"equity_rate,omitempty" xml:"equity_rate,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId            *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecExchangeByuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeByuserRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeByuserRequest) SetAssetId(v string) *ExecExchangeByuserRequest {
	s.AssetId = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetAssetIssuer(v string) *ExecExchangeByuserRequest {
	s.AssetIssuer = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetAssetRate(v string) *ExecExchangeByuserRequest {
	s.AssetRate = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetChainId(v string) *ExecExchangeByuserRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetDelegatedTenantId(v string) *ExecExchangeByuserRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetEquityId(v string) *ExecExchangeByuserRequest {
	s.EquityId = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetEquityProvider(v string) *ExecExchangeByuserRequest {
	s.EquityProvider = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetEquityRate(v string) *ExecExchangeByuserRequest {
	s.EquityRate = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetMemo(v string) *ExecExchangeByuserRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetOutTxId(v string) *ExecExchangeByuserRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecExchangeByuserRequest) SetUserId(v string) *ExecExchangeByuserRequest {
	s.UserId = &v
	return s
}

type ExecExchangeByuserResponse struct {
}

func (s ExecExchangeByuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeByuserResponse) GoString() string {
	return s.String()
}

type QueryMypointsMerchantbalanceRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env     *string `json:"env,omitempty" xml:"env,omitempty"`
}

func (s QueryMypointsMerchantbalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsMerchantbalanceRequest) GoString() string {
	return s.String()
}

func (s *QueryMypointsMerchantbalanceRequest) SetChainId(v string) *QueryMypointsMerchantbalanceRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsMerchantbalanceRequest) SetEnv(v string) *QueryMypointsMerchantbalanceRequest {
	s.Env = &v
	return s
}

type QueryMypointsMerchantbalanceResponse struct {
	BudgetAvailableBalance *int    `json:"budget_available_balance,omitempty" xml:"budget_available_balance,omitempty"`
	BudgetBalance          *int    `json:"budget_balance,omitempty" xml:"budget_balance,omitempty"`
	BudgetCode             *string `json:"budget_code,omitempty" xml:"budget_code,omitempty"`
	Pid                    *string `json:"pid,omitempty" xml:"pid,omitempty"`
	PointLibBalance        *int    `json:"point_lib_balance,omitempty" xml:"point_lib_balance,omitempty"`
	PointLibCode           *string `json:"point_lib_code,omitempty" xml:"point_lib_code,omitempty"`
	TenantId               *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryMypointsMerchantbalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsMerchantbalanceResponse) GoString() string {
	return s.String()
}

func (s *QueryMypointsMerchantbalanceResponse) SetBudgetAvailableBalance(v int) *QueryMypointsMerchantbalanceResponse {
	s.BudgetAvailableBalance = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetBudgetBalance(v int) *QueryMypointsMerchantbalanceResponse {
	s.BudgetBalance = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetBudgetCode(v string) *QueryMypointsMerchantbalanceResponse {
	s.BudgetCode = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetPid(v string) *QueryMypointsMerchantbalanceResponse {
	s.Pid = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetPointLibBalance(v int) *QueryMypointsMerchantbalanceResponse {
	s.PointLibBalance = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetPointLibCode(v string) *QueryMypointsMerchantbalanceResponse {
	s.PointLibCode = &v
	return s
}

func (s *QueryMypointsMerchantbalanceResponse) SetTenantId(v string) *QueryMypointsMerchantbalanceResponse {
	s.TenantId = &v
	return s
}

type QueryBlockRequest struct {
	BlockNumber *int    `json:"block_number,omitempty" xml:"block_number,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryBlockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockRequest) SetBlockNumber(v int) *QueryBlockRequest {
	s.BlockNumber = &v
	return s
}

func (s *QueryBlockRequest) SetChainId(v string) *QueryBlockRequest {
	s.ChainId = &v
	return s
}

type QueryBlockResponse struct {
	Block           *Block  `json:"block,omitempty" xml:"block,omitempty"`
	BlockNumber     *int    `json:"block_number,omitempty" xml:"block_number,omitempty"`
	ChainId         *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	FilteredTxCount *int    `json:"filtered_tx_count,omitempty" xml:"filtered_tx_count,omitempty"`
	TotalTxCount    *int    `json:"total_tx_count,omitempty" xml:"total_tx_count,omitempty"`
}

func (s QueryBlockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockResponse) SetBlock(v *Block) *QueryBlockResponse {
	s.Block = v
	return s
}

func (s *QueryBlockResponse) SetBlockNumber(v int) *QueryBlockResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryBlockResponse) SetChainId(v string) *QueryBlockResponse {
	s.ChainId = &v
	return s
}

func (s *QueryBlockResponse) SetFilteredTxCount(v int) *QueryBlockResponse {
	s.FilteredTxCount = &v
	return s
}

func (s *QueryBlockResponse) SetTotalTxCount(v int) *QueryBlockResponse {
	s.TotalTxCount = &v
	return s
}

type QueryMerchantRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Currency          *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantRequest) SetChainId(v string) *QueryMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMerchantRequest) SetCurrency(v string) *QueryMerchantRequest {
	s.Currency = &v
	return s
}

func (s *QueryMerchantRequest) SetDelegatedTenantId(v string) *QueryMerchantRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryMerchantResponse struct {
	BlockNumber *int      `json:"block_number,omitempty" xml:"block_number,omitempty"`
	Merchant    *Merchant `json:"merchant,omitempty" xml:"merchant,omitempty"`
}

func (s QueryMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantResponse) SetBlockNumber(v int) *QueryMerchantResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryMerchantResponse) SetMerchant(v *Merchant) *QueryMerchantResponse {
	s.Merchant = v
	return s
}

type UpdateConfigDelegaterelationRequest struct {
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OptType           *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateConfigDelegaterelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateConfigDelegaterelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateConfigDelegaterelationRequest) SetDelegatedTenantId(v string) *UpdateConfigDelegaterelationRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateConfigDelegaterelationRequest) SetOptTenantId(v string) *UpdateConfigDelegaterelationRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateConfigDelegaterelationRequest) SetOptType(v string) *UpdateConfigDelegaterelationRequest {
	s.OptType = &v
	return s
}

type UpdateConfigDelegaterelationResponse struct {
}

func (s UpdateConfigDelegaterelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateConfigDelegaterelationResponse) GoString() string {
	return s.String()
}

type ExecPkiDecryptRequest struct {
	AccountId         *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EncryptedContent  *string `json:"encrypted_content,omitempty" xml:"encrypted_content,omitempty"`
}

func (s ExecPkiDecryptRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecPkiDecryptRequest) GoString() string {
	return s.String()
}

func (s *ExecPkiDecryptRequest) SetAccountId(v string) *ExecPkiDecryptRequest {
	s.AccountId = &v
	return s
}

func (s *ExecPkiDecryptRequest) SetDelegatedTenantId(v string) *ExecPkiDecryptRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecPkiDecryptRequest) SetEncryptedContent(v string) *ExecPkiDecryptRequest {
	s.EncryptedContent = &v
	return s
}

type ExecPkiDecryptResponse struct {
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ExecPkiDecryptResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecPkiDecryptResponse) GoString() string {
	return s.String()
}

func (s *ExecPkiDecryptResponse) SetContent(v string) *ExecPkiDecryptResponse {
	s.Content = &v
	return s
}

type QueryBlockanalysisUserpriceupdatedequitiesRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Count   *int    `json:"count,omitempty" xml:"count,omitempty"`
	Page    *int    `json:"page,omitempty" xml:"page,omitempty"`
}

func (s QueryBlockanalysisUserpriceupdatedequitiesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisUserpriceupdatedequitiesRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisUserpriceupdatedequitiesRequest) SetChainId(v string) *QueryBlockanalysisUserpriceupdatedequitiesRequest {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisUserpriceupdatedequitiesRequest) SetCount(v int) *QueryBlockanalysisUserpriceupdatedequitiesRequest {
	s.Count = &v
	return s
}

func (s *QueryBlockanalysisUserpriceupdatedequitiesRequest) SetPage(v int) *QueryBlockanalysisUserpriceupdatedequitiesRequest {
	s.Page = &v
	return s
}

type QueryBlockanalysisUserpriceupdatedequitiesResponse struct {
	Equities []*UserPriceEquity `json:"equities,omitempty" xml:"equities,omitempty" type:"Repeated"`
}

func (s QueryBlockanalysisUserpriceupdatedequitiesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisUserpriceupdatedequitiesResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisUserpriceupdatedequitiesResponse) SetEquities(v []*UserPriceEquity) *QueryBlockanalysisUserpriceupdatedequitiesResponse {
	s.Equities = v
	return s
}

type CreateMerchantUserRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Did     *string `json:"did,omitempty" xml:"did,omitempty"`
	LocalId *string `json:"local_id,omitempty" xml:"local_id,omitempty"`
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateMerchantUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantUserRequest) GoString() string {
	return s.String()
}

func (s *CreateMerchantUserRequest) SetChainId(v string) *CreateMerchantUserRequest {
	s.ChainId = &v
	return s
}

func (s *CreateMerchantUserRequest) SetDid(v string) *CreateMerchantUserRequest {
	s.Did = &v
	return s
}

func (s *CreateMerchantUserRequest) SetLocalId(v string) *CreateMerchantUserRequest {
	s.LocalId = &v
	return s
}

func (s *CreateMerchantUserRequest) SetOutTxId(v string) *CreateMerchantUserRequest {
	s.OutTxId = &v
	return s
}

type CreateMerchantUserResponse struct {
}

func (s CreateMerchantUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantUserResponse) GoString() string {
	return s.String()
}

type QueryConfigWhitelistRequest struct {
	ChainId  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryConfigWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryConfigWhitelistRequest) GoString() string {
	return s.String()
}

func (s *QueryConfigWhitelistRequest) SetChainId(v string) *QueryConfigWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryConfigWhitelistRequest) SetTenantId(v string) *QueryConfigWhitelistRequest {
	s.TenantId = &v
	return s
}

type QueryConfigWhitelistResponse struct {
	WhiteList []*APIWhiteListInfo `json:"white_list,omitempty" xml:"white_list,omitempty" type:"Repeated"`
}

func (s QueryConfigWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryConfigWhitelistResponse) GoString() string {
	return s.String()
}

func (s *QueryConfigWhitelistResponse) SetWhiteList(v []*APIWhiteListInfo) *QueryConfigWhitelistResponse {
	s.WhiteList = v
	return s
}

type ExecPkiEncryptRequest struct {
	AccountId   *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	Content     *string `json:"content,omitempty" xml:"content,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s ExecPkiEncryptRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecPkiEncryptRequest) GoString() string {
	return s.String()
}

func (s *ExecPkiEncryptRequest) SetAccountId(v string) *ExecPkiEncryptRequest {
	s.AccountId = &v
	return s
}

func (s *ExecPkiEncryptRequest) SetContent(v string) *ExecPkiEncryptRequest {
	s.Content = &v
	return s
}

func (s *ExecPkiEncryptRequest) SetOptTenantId(v string) *ExecPkiEncryptRequest {
	s.OptTenantId = &v
	return s
}

type ExecPkiEncryptResponse struct {
	EncryptedContent *string `json:"encrypted_content,omitempty" xml:"encrypted_content,omitempty"`
}

func (s ExecPkiEncryptResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecPkiEncryptResponse) GoString() string {
	return s.String()
}

func (s *ExecPkiEncryptResponse) SetEncryptedContent(v string) *ExecPkiEncryptResponse {
	s.EncryptedContent = &v
	return s
}

type QueryBlockanalysisWhitelistRequest struct {
	ChainId  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryBlockanalysisWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisWhitelistRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisWhitelistRequest) SetChainId(v string) *QueryBlockanalysisWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisWhitelistRequest) SetTenantId(v string) *QueryBlockanalysisWhitelistRequest {
	s.TenantId = &v
	return s
}

type QueryBlockanalysisWhitelistResponse struct {
	WhiteList []*APIWhiteListInfo `json:"white_list,omitempty" xml:"white_list,omitempty" type:"Repeated"`
}

func (s QueryBlockanalysisWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisWhitelistResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisWhitelistResponse) SetWhiteList(v []*APIWhiteListInfo) *QueryBlockanalysisWhitelistResponse {
	s.WhiteList = v
	return s
}

type QueryMerchantExchangeableequitylistRequest struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	PageNumber *string `json:"page_number,omitempty" xml:"page_number,omitempty"`
	PageSize   *string `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryMerchantExchangeableequitylistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantExchangeableequitylistRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantExchangeableequitylistRequest) SetChainId(v string) *QueryMerchantExchangeableequitylistRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMerchantExchangeableequitylistRequest) SetPageNumber(v string) *QueryMerchantExchangeableequitylistRequest {
	s.PageNumber = &v
	return s
}

func (s *QueryMerchantExchangeableequitylistRequest) SetPageSize(v string) *QueryMerchantExchangeableequitylistRequest {
	s.PageSize = &v
	return s
}

type QueryMerchantExchangeableequitylistResponse struct {
	Object *ExchangeableEquityList `json:"object,omitempty" xml:"object,omitempty"`
}

func (s QueryMerchantExchangeableequitylistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantExchangeableequitylistResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantExchangeableequitylistResponse) SetObject(v *ExchangeableEquityList) *QueryMerchantExchangeableequitylistResponse {
	s.Object = v
	return s
}

type AddEquityCountRequest struct {
	Amount            *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s AddEquityCountRequest) String() string {
	return tea.Prettify(s)
}

func (s AddEquityCountRequest) GoString() string {
	return s.String()
}

func (s *AddEquityCountRequest) SetAmount(v int) *AddEquityCountRequest {
	s.Amount = &v
	return s
}

func (s *AddEquityCountRequest) SetChainId(v string) *AddEquityCountRequest {
	s.ChainId = &v
	return s
}

func (s *AddEquityCountRequest) SetDelegatedTenantId(v string) *AddEquityCountRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *AddEquityCountRequest) SetEquityId(v string) *AddEquityCountRequest {
	s.EquityId = &v
	return s
}

func (s *AddEquityCountRequest) SetOutTxId(v string) *AddEquityCountRequest {
	s.OutTxId = &v
	return s
}

type AddEquityCountResponse struct {
}

func (s AddEquityCountResponse) String() string {
	return tea.Prettify(s)
}

func (s AddEquityCountResponse) GoString() string {
	return s.String()
}

type ExecCardChargeresetRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardChargeresetRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardChargeresetRequest) GoString() string {
	return s.String()
}

func (s *ExecCardChargeresetRequest) SetChainId(v string) *ExecCardChargeresetRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardChargeresetRequest) SetTx(v *Transaction) *ExecCardChargeresetRequest {
	s.Tx = v
	return s
}

type ExecCardChargeresetResponse struct {
}

func (s ExecCardChargeresetResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardChargeresetResponse) GoString() string {
	return s.String()
}

type GetPkiPublickeyRequest struct {
	AccountId   *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s GetPkiPublickeyRequest) String() string {
	return tea.Prettify(s)
}

func (s GetPkiPublickeyRequest) GoString() string {
	return s.String()
}

func (s *GetPkiPublickeyRequest) SetAccountId(v string) *GetPkiPublickeyRequest {
	s.AccountId = &v
	return s
}

func (s *GetPkiPublickeyRequest) SetOptTenantId(v string) *GetPkiPublickeyRequest {
	s.OptTenantId = &v
	return s
}

type GetPkiPublickeyResponse struct {
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
}

func (s GetPkiPublickeyResponse) String() string {
	return tea.Prettify(s)
}

func (s GetPkiPublickeyResponse) GoString() string {
	return s.String()
}

func (s *GetPkiPublickeyResponse) SetPublicKey(v string) *GetPkiPublickeyResponse {
	s.PublicKey = &v
	return s
}

type UpdateBlockanalysisWhitelistRequest struct {
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OptType     *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateBlockanalysisWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBlockanalysisWhitelistRequest) GoString() string {
	return s.String()
}

func (s *UpdateBlockanalysisWhitelistRequest) SetChainId(v string) *UpdateBlockanalysisWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateBlockanalysisWhitelistRequest) SetOptTenantId(v string) *UpdateBlockanalysisWhitelistRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateBlockanalysisWhitelistRequest) SetOptType(v string) *UpdateBlockanalysisWhitelistRequest {
	s.OptType = &v
	return s
}

type UpdateBlockanalysisWhitelistResponse struct {
}

func (s UpdateBlockanalysisWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBlockanalysisWhitelistResponse) GoString() string {
	return s.String()
}

type UpdateMerchantFriendRequest struct {
	ChainId        *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	FriendTenantId *string `json:"friend_tenant_id,omitempty" xml:"friend_tenant_id,omitempty"`
	OutTxId        *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	Type           *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s UpdateMerchantFriendRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantFriendRequest) GoString() string {
	return s.String()
}

func (s *UpdateMerchantFriendRequest) SetChainId(v string) *UpdateMerchantFriendRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateMerchantFriendRequest) SetFriendTenantId(v string) *UpdateMerchantFriendRequest {
	s.FriendTenantId = &v
	return s
}

func (s *UpdateMerchantFriendRequest) SetOutTxId(v string) *UpdateMerchantFriendRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateMerchantFriendRequest) SetType(v string) *UpdateMerchantFriendRequest {
	s.Type = &v
	return s
}

type UpdateMerchantFriendResponse struct {
}

func (s UpdateMerchantFriendResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantFriendResponse) GoString() string {
	return s.String()
}

type CreateEquityRequest struct {
	AuthType                 *int    `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	ChainId                  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Currency                 *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DefaultPrice             *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	DelegatedTenantId        *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	Description              *string `json:"description,omitempty" xml:"description,omitempty"`
	DescImages               *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityName               *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType               *int    `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	IfPublic                 *bool   `json:"if_public,omitempty" xml:"if_public,omitempty"`
	Images                   *string `json:"images,omitempty" xml:"images,omitempty"`
	LimitPerMerchantAndDay   *int    `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMonth *int    `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	LimitPerUserAndDay       *int    `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int    `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	Memo                     *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OutTxId                  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	TotalCount               *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	UseValidNotAfter         *int    `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore        *int    `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter            *int    `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore           *int    `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	Value                    *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s CreateEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEquityRequest) GoString() string {
	return s.String()
}

func (s *CreateEquityRequest) SetAuthType(v int) *CreateEquityRequest {
	s.AuthType = &v
	return s
}

func (s *CreateEquityRequest) SetChainId(v string) *CreateEquityRequest {
	s.ChainId = &v
	return s
}

func (s *CreateEquityRequest) SetCurrency(v string) *CreateEquityRequest {
	s.Currency = &v
	return s
}

func (s *CreateEquityRequest) SetDefaultPrice(v string) *CreateEquityRequest {
	s.DefaultPrice = &v
	return s
}

func (s *CreateEquityRequest) SetDelegatedTenantId(v string) *CreateEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *CreateEquityRequest) SetDescription(v string) *CreateEquityRequest {
	s.Description = &v
	return s
}

func (s *CreateEquityRequest) SetDescImages(v string) *CreateEquityRequest {
	s.DescImages = &v
	return s
}

func (s *CreateEquityRequest) SetEquityName(v string) *CreateEquityRequest {
	s.EquityName = &v
	return s
}

func (s *CreateEquityRequest) SetEquityType(v int) *CreateEquityRequest {
	s.EquityType = &v
	return s
}

func (s *CreateEquityRequest) SetIfPublic(v bool) *CreateEquityRequest {
	s.IfPublic = &v
	return s
}

func (s *CreateEquityRequest) SetImages(v string) *CreateEquityRequest {
	s.Images = &v
	return s
}

func (s *CreateEquityRequest) SetLimitPerMerchantAndDay(v int) *CreateEquityRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *CreateEquityRequest) SetLimitPerMerchantAndMonth(v int) *CreateEquityRequest {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *CreateEquityRequest) SetLimitPerUserAndDay(v int) *CreateEquityRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *CreateEquityRequest) SetLimitPerUserAndMonth(v int) *CreateEquityRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *CreateEquityRequest) SetMemo(v string) *CreateEquityRequest {
	s.Memo = &v
	return s
}

func (s *CreateEquityRequest) SetOutTxId(v string) *CreateEquityRequest {
	s.OutTxId = &v
	return s
}

func (s *CreateEquityRequest) SetTotalCount(v string) *CreateEquityRequest {
	s.TotalCount = &v
	return s
}

func (s *CreateEquityRequest) SetUseValidNotAfter(v int) *CreateEquityRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *CreateEquityRequest) SetUseValidNotBefore(v int) *CreateEquityRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *CreateEquityRequest) SetValidNotAfter(v int) *CreateEquityRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *CreateEquityRequest) SetValidNotBefore(v int) *CreateEquityRequest {
	s.ValidNotBefore = &v
	return s
}

func (s *CreateEquityRequest) SetValue(v string) *CreateEquityRequest {
	s.Value = &v
	return s
}

type CreateEquityResponse struct {
	CreateEquityRequestId *string `json:"create_equity_request_id,omitempty" xml:"create_equity_request_id,omitempty"`
}

func (s CreateEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEquityResponse) GoString() string {
	return s.String()
}

func (s *CreateEquityResponse) SetCreateEquityRequestId(v string) *CreateEquityResponse {
	s.CreateEquityRequestId = &v
	return s
}

type ExecCardCreateRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardCreateRequest) GoString() string {
	return s.String()
}

func (s *ExecCardCreateRequest) SetChainId(v string) *ExecCardCreateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardCreateRequest) SetTx(v *Transaction) *ExecCardCreateRequest {
	s.Tx = v
	return s
}

type ExecCardCreateResponse struct {
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ExecCardCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardCreateResponse) GoString() string {
	return s.String()
}

func (s *ExecCardCreateResponse) SetCardId(v string) *ExecCardCreateResponse {
	s.CardId = &v
	return s
}

func (s *ExecCardCreateResponse) SetTxHash(v string) *ExecCardCreateResponse {
	s.TxHash = &v
	return s
}

type ExecMypointsPreorderskuRequest struct {
	ChainId   *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Count     *int    `json:"count,omitempty" xml:"count,omitempty"`
	Env       *string `json:"env,omitempty" xml:"env,omitempty"`
	Memo      *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OrderNo   *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	SkuId     *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	TotalCost *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s ExecMypointsPreorderskuRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecMypointsPreorderskuRequest) GoString() string {
	return s.String()
}

func (s *ExecMypointsPreorderskuRequest) SetChainId(v string) *ExecMypointsPreorderskuRequest {
	s.ChainId = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetCount(v int) *ExecMypointsPreorderskuRequest {
	s.Count = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetEnv(v string) *ExecMypointsPreorderskuRequest {
	s.Env = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetMemo(v string) *ExecMypointsPreorderskuRequest {
	s.Memo = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetOrderNo(v string) *ExecMypointsPreorderskuRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetSkuId(v string) *ExecMypointsPreorderskuRequest {
	s.SkuId = &v
	return s
}

func (s *ExecMypointsPreorderskuRequest) SetTotalCost(v string) *ExecMypointsPreorderskuRequest {
	s.TotalCost = &v
	return s
}

type ExecMypointsPreorderskuResponse struct {
	Count       *int    `json:"count,omitempty" xml:"count,omitempty"`
	OrderNo     *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	PreOrderId  *string `json:"pre_order_id,omitempty" xml:"pre_order_id,omitempty"`
	SkuId       *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	TotalAmount *int    `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	TotalCost   *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s ExecMypointsPreorderskuResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecMypointsPreorderskuResponse) GoString() string {
	return s.String()
}

func (s *ExecMypointsPreorderskuResponse) SetCount(v int) *ExecMypointsPreorderskuResponse {
	s.Count = &v
	return s
}

func (s *ExecMypointsPreorderskuResponse) SetOrderNo(v string) *ExecMypointsPreorderskuResponse {
	s.OrderNo = &v
	return s
}

func (s *ExecMypointsPreorderskuResponse) SetPreOrderId(v string) *ExecMypointsPreorderskuResponse {
	s.PreOrderId = &v
	return s
}

func (s *ExecMypointsPreorderskuResponse) SetSkuId(v string) *ExecMypointsPreorderskuResponse {
	s.SkuId = &v
	return s
}

func (s *ExecMypointsPreorderskuResponse) SetTotalAmount(v int) *ExecMypointsPreorderskuResponse {
	s.TotalAmount = &v
	return s
}

func (s *ExecMypointsPreorderskuResponse) SetTotalCost(v string) *ExecMypointsPreorderskuResponse {
	s.TotalCost = &v
	return s
}

type QueryBlockanalysisLastblocknumberRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
}

func (s QueryBlockanalysisLastblocknumberRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisLastblocknumberRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisLastblocknumberRequest) SetChainId(v string) *QueryBlockanalysisLastblocknumberRequest {
	s.ChainId = &v
	return s
}

type QueryBlockanalysisLastblocknumberResponse struct {
	BlockNumber *int `json:"block_number,omitempty" xml:"block_number,omitempty"`
}

func (s QueryBlockanalysisLastblocknumberResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisLastblocknumberResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisLastblocknumberResponse) SetBlockNumber(v int) *QueryBlockanalysisLastblocknumberResponse {
	s.BlockNumber = &v
	return s
}

type SetMerchantFundmanagerRequest struct {
	ChainId             *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	FundManagerTenantId *string `json:"fund_manager_tenant_id,omitempty" xml:"fund_manager_tenant_id,omitempty"`
	OptTenantId         *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId             *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SetMerchantFundmanagerRequest) String() string {
	return tea.Prettify(s)
}

func (s SetMerchantFundmanagerRequest) GoString() string {
	return s.String()
}

func (s *SetMerchantFundmanagerRequest) SetChainId(v string) *SetMerchantFundmanagerRequest {
	s.ChainId = &v
	return s
}

func (s *SetMerchantFundmanagerRequest) SetFundManagerTenantId(v string) *SetMerchantFundmanagerRequest {
	s.FundManagerTenantId = &v
	return s
}

func (s *SetMerchantFundmanagerRequest) SetOptTenantId(v string) *SetMerchantFundmanagerRequest {
	s.OptTenantId = &v
	return s
}

func (s *SetMerchantFundmanagerRequest) SetOutTxId(v string) *SetMerchantFundmanagerRequest {
	s.OutTxId = &v
	return s
}

type SetMerchantFundmanagerResponse struct {
}

func (s SetMerchantFundmanagerResponse) String() string {
	return tea.Prettify(s)
}

func (s SetMerchantFundmanagerResponse) GoString() string {
	return s.String()
}

type QueryEquityCreateresultRequest struct {
	ChainId               *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	CreateEquityRequestId *string `json:"create_equity_request_id,omitempty" xml:"create_equity_request_id,omitempty"`
	DelegatedTenantId     *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
}

func (s QueryEquityCreateresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityCreateresultRequest) GoString() string {
	return s.String()
}

func (s *QueryEquityCreateresultRequest) SetChainId(v string) *QueryEquityCreateresultRequest {
	s.ChainId = &v
	return s
}

func (s *QueryEquityCreateresultRequest) SetCreateEquityRequestId(v string) *QueryEquityCreateresultRequest {
	s.CreateEquityRequestId = &v
	return s
}

func (s *QueryEquityCreateresultRequest) SetDelegatedTenantId(v string) *QueryEquityCreateresultRequest {
	s.DelegatedTenantId = &v
	return s
}

type QueryEquityCreateresultResponse struct {
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
}

func (s QueryEquityCreateresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityCreateresultResponse) GoString() string {
	return s.String()
}

func (s *QueryEquityCreateresultResponse) SetEquityId(v string) *QueryEquityCreateresultResponse {
	s.EquityId = &v
	return s
}

type QueryMypointsSkuRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Env     *string `json:"env,omitempty" xml:"env,omitempty"`
}

func (s QueryMypointsSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsSkuRequest) GoString() string {
	return s.String()
}

func (s *QueryMypointsSkuRequest) SetChainId(v string) *QueryMypointsSkuRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsSkuRequest) SetEnv(v string) *QueryMypointsSkuRequest {
	s.Env = &v
	return s
}

type QueryMypointsSkuResponse struct {
	Skus []*SKUItem `json:"skus,omitempty" xml:"skus,omitempty" type:"Repeated"`
}

func (s QueryMypointsSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsSkuResponse) GoString() string {
	return s.String()
}

func (s *QueryMypointsSkuResponse) SetSkus(v []*SKUItem) *QueryMypointsSkuResponse {
	s.Skus = v
	return s
}

type ConfirmExchangeRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ConfirmExchangeRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExchangeRequest) GoString() string {
	return s.String()
}

func (s *ConfirmExchangeRequest) SetChainId(v string) *ConfirmExchangeRequest {
	s.ChainId = &v
	return s
}

func (s *ConfirmExchangeRequest) SetDelegatedTenantId(v string) *ConfirmExchangeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ConfirmExchangeRequest) SetEquityId(v string) *ConfirmExchangeRequest {
	s.EquityId = &v
	return s
}

func (s *ConfirmExchangeRequest) SetMemo(v string) *ConfirmExchangeRequest {
	s.Memo = &v
	return s
}

func (s *ConfirmExchangeRequest) SetOriginTxId(v string) *ConfirmExchangeRequest {
	s.OriginTxId = &v
	return s
}

func (s *ConfirmExchangeRequest) SetOutTxId(v string) *ConfirmExchangeRequest {
	s.OutTxId = &v
	return s
}

type ConfirmExchangeResponse struct {
}

func (s ConfirmExchangeResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExchangeResponse) GoString() string {
	return s.String()
}

type QueryBlockanalysisOpenedequitiesRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Count   *int    `json:"count,omitempty" xml:"count,omitempty"`
	Page    *int    `json:"page,omitempty" xml:"page,omitempty"`
}

func (s QueryBlockanalysisOpenedequitiesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisOpenedequitiesRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisOpenedequitiesRequest) SetChainId(v string) *QueryBlockanalysisOpenedequitiesRequest {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisOpenedequitiesRequest) SetCount(v int) *QueryBlockanalysisOpenedequitiesRequest {
	s.Count = &v
	return s
}

func (s *QueryBlockanalysisOpenedequitiesRequest) SetPage(v int) *QueryBlockanalysisOpenedequitiesRequest {
	s.Page = &v
	return s
}

type QueryBlockanalysisOpenedequitiesResponse struct {
	Equities []*OpenedEquity `json:"equities,omitempty" xml:"equities,omitempty" type:"Repeated"`
}

func (s QueryBlockanalysisOpenedequitiesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisOpenedequitiesResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisOpenedequitiesResponse) SetEquities(v []*OpenedEquity) *QueryBlockanalysisOpenedequitiesResponse {
	s.Equities = v
	return s
}

type CreateMerchantRequest struct {
	ChainId             *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Description         *string `json:"description,omitempty" xml:"description,omitempty"`
	FundManagerTenantId *string `json:"fund_manager_tenant_id,omitempty" xml:"fund_manager_tenant_id,omitempty"`
	IfAssetIssuer       *bool   `json:"if_asset_issuer,omitempty" xml:"if_asset_issuer,omitempty"`
	IfEquityConsumer    *bool   `json:"if_equity_consumer,omitempty" xml:"if_equity_consumer,omitempty"`
	IfEquityProvider    *bool   `json:"if_equity_provider,omitempty" xml:"if_equity_provider,omitempty"`
	OptTenantId         *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId             *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s CreateMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantRequest) GoString() string {
	return s.String()
}

func (s *CreateMerchantRequest) SetChainId(v string) *CreateMerchantRequest {
	s.ChainId = &v
	return s
}

func (s *CreateMerchantRequest) SetDescription(v string) *CreateMerchantRequest {
	s.Description = &v
	return s
}

func (s *CreateMerchantRequest) SetFundManagerTenantId(v string) *CreateMerchantRequest {
	s.FundManagerTenantId = &v
	return s
}

func (s *CreateMerchantRequest) SetIfAssetIssuer(v bool) *CreateMerchantRequest {
	s.IfAssetIssuer = &v
	return s
}

func (s *CreateMerchantRequest) SetIfEquityConsumer(v bool) *CreateMerchantRequest {
	s.IfEquityConsumer = &v
	return s
}

func (s *CreateMerchantRequest) SetIfEquityProvider(v bool) *CreateMerchantRequest {
	s.IfEquityProvider = &v
	return s
}

func (s *CreateMerchantRequest) SetOptTenantId(v string) *CreateMerchantRequest {
	s.OptTenantId = &v
	return s
}

func (s *CreateMerchantRequest) SetOutTxId(v string) *CreateMerchantRequest {
	s.OutTxId = &v
	return s
}

type CreateMerchantResponse struct {
}

func (s CreateMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantResponse) GoString() string {
	return s.String()
}

type UpdateConfigWhitelistRequest struct {
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OptType     *string `json:"opt_type,omitempty" xml:"opt_type,omitempty"`
}

func (s UpdateConfigWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateConfigWhitelistRequest) GoString() string {
	return s.String()
}

func (s *UpdateConfigWhitelistRequest) SetChainId(v string) *UpdateConfigWhitelistRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateConfigWhitelistRequest) SetOptTenantId(v string) *UpdateConfigWhitelistRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateConfigWhitelistRequest) SetOptType(v string) *UpdateConfigWhitelistRequest {
	s.OptType = &v
	return s
}

type UpdateConfigWhitelistResponse struct {
}

func (s UpdateConfigWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateConfigWhitelistResponse) GoString() string {
	return s.String()
}

type ExecCardBindnameRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardBindnameRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardBindnameRequest) GoString() string {
	return s.String()
}

func (s *ExecCardBindnameRequest) SetChainId(v string) *ExecCardBindnameRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardBindnameRequest) SetTx(v *Transaction) *ExecCardBindnameRequest {
	s.Tx = v
	return s
}

type ExecCardBindnameResponse struct {
}

func (s ExecCardBindnameResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardBindnameResponse) GoString() string {
	return s.String()
}

type QueryMypointsSkufeeRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Count   *int    `json:"count,omitempty" xml:"count,omitempty"`
	Env     *string `json:"env,omitempty" xml:"env,omitempty"`
	Memo    *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	SkuId   *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryMypointsSkufeeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsSkufeeRequest) GoString() string {
	return s.String()
}

func (s *QueryMypointsSkufeeRequest) SetChainId(v string) *QueryMypointsSkufeeRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMypointsSkufeeRequest) SetCount(v int) *QueryMypointsSkufeeRequest {
	s.Count = &v
	return s
}

func (s *QueryMypointsSkufeeRequest) SetEnv(v string) *QueryMypointsSkufeeRequest {
	s.Env = &v
	return s
}

func (s *QueryMypointsSkufeeRequest) SetMemo(v string) *QueryMypointsSkufeeRequest {
	s.Memo = &v
	return s
}

func (s *QueryMypointsSkufeeRequest) SetOrderNo(v string) *QueryMypointsSkufeeRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryMypointsSkufeeRequest) SetSkuId(v string) *QueryMypointsSkufeeRequest {
	s.SkuId = &v
	return s
}

type QueryMypointsSkufeeResponse struct {
	Count       *int    `json:"count,omitempty" xml:"count,omitempty"`
	Rate        *string `json:"rate,omitempty" xml:"rate,omitempty"`
	SkuId       *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	TotalAmount *int    `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	TotalCost   *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s QueryMypointsSkufeeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypointsSkufeeResponse) GoString() string {
	return s.String()
}

func (s *QueryMypointsSkufeeResponse) SetCount(v int) *QueryMypointsSkufeeResponse {
	s.Count = &v
	return s
}

func (s *QueryMypointsSkufeeResponse) SetRate(v string) *QueryMypointsSkufeeResponse {
	s.Rate = &v
	return s
}

func (s *QueryMypointsSkufeeResponse) SetSkuId(v string) *QueryMypointsSkufeeResponse {
	s.SkuId = &v
	return s
}

func (s *QueryMypointsSkufeeResponse) SetTotalAmount(v int) *QueryMypointsSkufeeResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryMypointsSkufeeResponse) SetTotalCost(v string) *QueryMypointsSkufeeResponse {
	s.TotalCost = &v
	return s
}

type QueryBlockanalysisUnwriteoffvalueRequest struct {
	AssetId     *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
}

func (s QueryBlockanalysisUnwriteoffvalueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisUnwriteoffvalueRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisUnwriteoffvalueRequest) SetAssetId(v string) *QueryBlockanalysisUnwriteoffvalueRequest {
	s.AssetId = &v
	return s
}

func (s *QueryBlockanalysisUnwriteoffvalueRequest) SetChainId(v string) *QueryBlockanalysisUnwriteoffvalueRequest {
	s.ChainId = &v
	return s
}

func (s *QueryBlockanalysisUnwriteoffvalueRequest) SetOptTenantId(v string) *QueryBlockanalysisUnwriteoffvalueRequest {
	s.OptTenantId = &v
	return s
}

type QueryBlockanalysisUnwriteoffvalueResponse struct {
	AssetId    *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	TenantId   *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	TotalValue *string `json:"total_value,omitempty" xml:"total_value,omitempty"`
}

func (s QueryBlockanalysisUnwriteoffvalueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockanalysisUnwriteoffvalueResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockanalysisUnwriteoffvalueResponse) SetAssetId(v string) *QueryBlockanalysisUnwriteoffvalueResponse {
	s.AssetId = &v
	return s
}

func (s *QueryBlockanalysisUnwriteoffvalueResponse) SetTenantId(v string) *QueryBlockanalysisUnwriteoffvalueResponse {
	s.TenantId = &v
	return s
}

func (s *QueryBlockanalysisUnwriteoffvalueResponse) SetTotalValue(v string) *QueryBlockanalysisUnwriteoffvalueResponse {
	s.TotalValue = &v
	return s
}

type QueryMerchantExchangeableequitydetailRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	SkuId   *string `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryMerchantExchangeableequitydetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantExchangeableequitydetailRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantExchangeableequitydetailRequest) SetChainId(v string) *QueryMerchantExchangeableequitydetailRequest {
	s.ChainId = &v
	return s
}

func (s *QueryMerchantExchangeableequitydetailRequest) SetSkuId(v string) *QueryMerchantExchangeableequitydetailRequest {
	s.SkuId = &v
	return s
}

type QueryMerchantExchangeableequitydetailResponse struct {
	Equity *EquityDetail `json:"equity,omitempty" xml:"equity,omitempty"`
}

func (s QueryMerchantExchangeableequitydetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantExchangeableequitydetailResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantExchangeableequitydetailResponse) SetEquity(v *EquityDetail) *QueryMerchantExchangeableequitydetailResponse {
	s.Equity = v
	return s
}

type ExecDataDepositRequest struct {
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Data    *string `json:"data,omitempty" xml:"data,omitempty"`
	To      *string `json:"to,omitempty" xml:"to,omitempty"`
}

func (s ExecDataDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecDataDepositRequest) GoString() string {
	return s.String()
}

func (s *ExecDataDepositRequest) SetChainId(v string) *ExecDataDepositRequest {
	s.ChainId = &v
	return s
}

func (s *ExecDataDepositRequest) SetData(v string) *ExecDataDepositRequest {
	s.Data = &v
	return s
}

func (s *ExecDataDepositRequest) SetTo(v string) *ExecDataDepositRequest {
	s.To = &v
	return s
}

type ExecDataDepositResponse struct {
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ExecDataDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecDataDepositResponse) GoString() string {
	return s.String()
}

func (s *ExecDataDepositResponse) SetTxHash(v string) *ExecDataDepositResponse {
	s.TxHash = &v
	return s
}

type ExecCardChargeRequest struct {
	ChainId *string      `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Tx      *Transaction `json:"tx,omitempty" xml:"tx,omitempty"`
}

func (s ExecCardChargeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecCardChargeRequest) GoString() string {
	return s.String()
}

func (s *ExecCardChargeRequest) SetChainId(v string) *ExecCardChargeRequest {
	s.ChainId = &v
	return s
}

func (s *ExecCardChargeRequest) SetTx(v *Transaction) *ExecCardChargeRequest {
	s.Tx = v
	return s
}

type ExecCardChargeResponse struct {
}

func (s ExecCardChargeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecCardChargeResponse) GoString() string {
	return s.String()
}

type ExecAssetGrantrefundRequest struct {
	Amount     *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId    *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info       *string `json:"info,omitempty" xml:"info,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId    *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId     *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAssetGrantrefundRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGrantrefundRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetGrantrefundRequest) SetAmount(v int) *ExecAssetGrantrefundRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetAssetId(v string) *ExecAssetGrantrefundRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetChainId(v string) *ExecAssetGrantrefundRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetInfo(v string) *ExecAssetGrantrefundRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetOriginTxId(v string) *ExecAssetGrantrefundRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetOutTxId(v string) *ExecAssetGrantrefundRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAssetGrantrefundRequest) SetUserId(v string) *ExecAssetGrantrefundRequest {
	s.UserId = &v
	return s
}

type ExecAssetGrantrefundResponse struct {
}

func (s ExecAssetGrantrefundResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGrantrefundResponse) GoString() string {
	return s.String()
}

type ExecAssetExpireRequest struct {
	Amount       *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId      *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId      *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info         *string `json:"info,omitempty" xml:"info,omitempty"`
	OriginalTxId *string `json:"original_tx_id,omitempty" xml:"original_tx_id,omitempty"`
	OutTxId      *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId       *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAssetExpireRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetExpireRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetExpireRequest) SetAmount(v int) *ExecAssetExpireRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetExpireRequest) SetAssetId(v string) *ExecAssetExpireRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetExpireRequest) SetChainId(v string) *ExecAssetExpireRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetExpireRequest) SetInfo(v string) *ExecAssetExpireRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetExpireRequest) SetOriginalTxId(v string) *ExecAssetExpireRequest {
	s.OriginalTxId = &v
	return s
}

func (s *ExecAssetExpireRequest) SetOutTxId(v string) *ExecAssetExpireRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAssetExpireRequest) SetUserId(v string) *ExecAssetExpireRequest {
	s.UserId = &v
	return s
}

type ExecAssetExpireResponse struct {
}

func (s ExecAssetExpireResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetExpireResponse) GoString() string {
	return s.String()
}

type ExecAssetIssueRequest struct {
	Amount      *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId     *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info        *string `json:"info,omitempty" xml:"info,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId     *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAssetIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetIssueRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetIssueRequest) SetAmount(v int) *ExecAssetIssueRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetIssueRequest) SetAssetId(v string) *ExecAssetIssueRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetIssueRequest) SetChainId(v string) *ExecAssetIssueRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetIssueRequest) SetInfo(v string) *ExecAssetIssueRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetIssueRequest) SetOptTenantId(v string) *ExecAssetIssueRequest {
	s.OptTenantId = &v
	return s
}

func (s *ExecAssetIssueRequest) SetOutTxId(v string) *ExecAssetIssueRequest {
	s.OutTxId = &v
	return s
}

type ExecAssetIssueResponse struct {
}

func (s ExecAssetIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetIssueResponse) GoString() string {
	return s.String()
}

type ExecAssetAdjustRequest struct {
	Amount  *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info    *string `json:"info,omitempty" xml:"info,omitempty"`
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId  *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecAssetAdjustRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetAdjustRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetAdjustRequest) SetAmount(v int) *ExecAssetAdjustRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetAdjustRequest) SetAssetId(v string) *ExecAssetAdjustRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetAdjustRequest) SetChainId(v string) *ExecAssetAdjustRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetAdjustRequest) SetInfo(v string) *ExecAssetAdjustRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetAdjustRequest) SetOutTxId(v string) *ExecAssetAdjustRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAssetAdjustRequest) SetUserId(v string) *ExecAssetAdjustRequest {
	s.UserId = &v
	return s
}

type ExecAssetAdjustResponse struct {
}

func (s ExecAssetAdjustResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetAdjustResponse) GoString() string {
	return s.String()
}

type UpdateEquityRequest struct {
	AuthType                 *int    `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	ChainId                  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Currency                 *string `json:"currency,omitempty" xml:"currency,omitempty"`
	DefaultPrice             *string `json:"default_price,omitempty" xml:"default_price,omitempty"`
	DelegatedTenantId        *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	Description              *string `json:"description,omitempty" xml:"description,omitempty"`
	DescImages               *string `json:"desc_images,omitempty" xml:"desc_images,omitempty"`
	EquityId                 *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityName               *string `json:"equity_name,omitempty" xml:"equity_name,omitempty"`
	EquityType               *int    `json:"equity_type,omitempty" xml:"equity_type,omitempty"`
	IfPublic                 *bool   `json:"if_public,omitempty" xml:"if_public,omitempty"`
	Images                   *string `json:"images,omitempty" xml:"images,omitempty"`
	LimitPerMerchantAndDay   *int    `json:"limit_per_merchant_and_day,omitempty" xml:"limit_per_merchant_and_day,omitempty"`
	LimitPerMerchantAndMonth *int    `json:"limit_per_merchant_and_month,omitempty" xml:"limit_per_merchant_and_month,omitempty"`
	LimitPerUserAndDay       *int    `json:"limit_per_user_and_day,omitempty" xml:"limit_per_user_and_day,omitempty"`
	LimitPerUserAndMonth     *int    `json:"limit_per_user_and_month,omitempty" xml:"limit_per_user_and_month,omitempty"`
	Memo                     *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OutTxId                  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	TotalCount               *string `json:"total_count,omitempty" xml:"total_count,omitempty"`
	UseValidNotAfter         *int    `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore        *int    `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter            *int    `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore           *int    `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
	Value                    *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s UpdateEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityRequest) SetAuthType(v int) *UpdateEquityRequest {
	s.AuthType = &v
	return s
}

func (s *UpdateEquityRequest) SetChainId(v string) *UpdateEquityRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityRequest) SetCurrency(v string) *UpdateEquityRequest {
	s.Currency = &v
	return s
}

func (s *UpdateEquityRequest) SetDefaultPrice(v string) *UpdateEquityRequest {
	s.DefaultPrice = &v
	return s
}

func (s *UpdateEquityRequest) SetDelegatedTenantId(v string) *UpdateEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityRequest) SetDescription(v string) *UpdateEquityRequest {
	s.Description = &v
	return s
}

func (s *UpdateEquityRequest) SetDescImages(v string) *UpdateEquityRequest {
	s.DescImages = &v
	return s
}

func (s *UpdateEquityRequest) SetEquityId(v string) *UpdateEquityRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityRequest) SetEquityName(v string) *UpdateEquityRequest {
	s.EquityName = &v
	return s
}

func (s *UpdateEquityRequest) SetEquityType(v int) *UpdateEquityRequest {
	s.EquityType = &v
	return s
}

func (s *UpdateEquityRequest) SetIfPublic(v bool) *UpdateEquityRequest {
	s.IfPublic = &v
	return s
}

func (s *UpdateEquityRequest) SetImages(v string) *UpdateEquityRequest {
	s.Images = &v
	return s
}

func (s *UpdateEquityRequest) SetLimitPerMerchantAndDay(v int) *UpdateEquityRequest {
	s.LimitPerMerchantAndDay = &v
	return s
}

func (s *UpdateEquityRequest) SetLimitPerMerchantAndMonth(v int) *UpdateEquityRequest {
	s.LimitPerMerchantAndMonth = &v
	return s
}

func (s *UpdateEquityRequest) SetLimitPerUserAndDay(v int) *UpdateEquityRequest {
	s.LimitPerUserAndDay = &v
	return s
}

func (s *UpdateEquityRequest) SetLimitPerUserAndMonth(v int) *UpdateEquityRequest {
	s.LimitPerUserAndMonth = &v
	return s
}

func (s *UpdateEquityRequest) SetMemo(v string) *UpdateEquityRequest {
	s.Memo = &v
	return s
}

func (s *UpdateEquityRequest) SetOutTxId(v string) *UpdateEquityRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateEquityRequest) SetTotalCount(v string) *UpdateEquityRequest {
	s.TotalCount = &v
	return s
}

func (s *UpdateEquityRequest) SetUseValidNotAfter(v int) *UpdateEquityRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *UpdateEquityRequest) SetUseValidNotBefore(v int) *UpdateEquityRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *UpdateEquityRequest) SetValidNotAfter(v int) *UpdateEquityRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *UpdateEquityRequest) SetValidNotBefore(v int) *UpdateEquityRequest {
	s.ValidNotBefore = &v
	return s
}

func (s *UpdateEquityRequest) SetValue(v string) *UpdateEquityRequest {
	s.Value = &v
	return s
}

type UpdateEquityResponse struct {
}

func (s UpdateEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityResponse) GoString() string {
	return s.String()
}

type QueryAssetInstructionRequest struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryAssetInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryAssetInstructionRequest) SetChainId(v string) *QueryAssetInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAssetInstructionRequest) SetOriginTxId(v string) *QueryAssetInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryAssetInstructionResponse struct {
	Instruction *string `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryAssetInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryAssetInstructionResponse) SetInstruction(v string) *QueryAssetInstructionResponse {
	s.Instruction = &v
	return s
}

type ExecAssetGenerateRequest struct {
	Amount  *string `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OutTxId *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAssetGenerateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGenerateRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetGenerateRequest) SetAmount(v string) *ExecAssetGenerateRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetGenerateRequest) SetAssetId(v string) *ExecAssetGenerateRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetGenerateRequest) SetChainId(v string) *ExecAssetGenerateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetGenerateRequest) SetOutTxId(v string) *ExecAssetGenerateRequest {
	s.OutTxId = &v
	return s
}

type ExecAssetGenerateResponse struct {
}

func (s ExecAssetGenerateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGenerateResponse) GoString() string {
	return s.String()
}

type QueryAssetRequest struct {
	AssetId     *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	UserId      *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryAssetRequest) SetAssetId(v string) *QueryAssetRequest {
	s.AssetId = &v
	return s
}

func (s *QueryAssetRequest) SetChainId(v string) *QueryAssetRequest {
	s.ChainId = &v
	return s
}

func (s *QueryAssetRequest) SetOptTenantId(v string) *QueryAssetRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryAssetRequest) SetUserId(v string) *QueryAssetRequest {
	s.UserId = &v
	return s
}

type QueryAssetResponse struct {
	Asset *Asset `json:"asset,omitempty" xml:"asset,omitempty"`
}

func (s QueryAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryAssetResponse) SetAsset(v *Asset) *QueryAssetResponse {
	s.Asset = v
	return s
}

type ExecAssetCreateRequest struct {
	AssetId     *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	AssetName   *string `json:"asset_name,omitempty" xml:"asset_name,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Currency    *string `json:"currency,omitempty" xml:"currency,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId     *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	Rate        *string `json:"rate,omitempty" xml:"rate,omitempty"`
}

func (s ExecAssetCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetCreateRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetCreateRequest) SetAssetId(v string) *ExecAssetCreateRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetCreateRequest) SetAssetName(v string) *ExecAssetCreateRequest {
	s.AssetName = &v
	return s
}

func (s *ExecAssetCreateRequest) SetChainId(v string) *ExecAssetCreateRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetCreateRequest) SetCurrency(v string) *ExecAssetCreateRequest {
	s.Currency = &v
	return s
}

func (s *ExecAssetCreateRequest) SetOptTenantId(v string) *ExecAssetCreateRequest {
	s.OptTenantId = &v
	return s
}

func (s *ExecAssetCreateRequest) SetOutTxId(v string) *ExecAssetCreateRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAssetCreateRequest) SetRate(v string) *ExecAssetCreateRequest {
	s.Rate = &v
	return s
}

type ExecAssetCreateResponse struct {
}

func (s ExecAssetCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetCreateResponse) GoString() string {
	return s.String()
}

type UpdateEquityValidtimeRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UseValidNotAfter  *string `json:"use_valid_not_after,omitempty" xml:"use_valid_not_after,omitempty"`
	UseValidNotBefore *string `json:"use_valid_not_before,omitempty" xml:"use_valid_not_before,omitempty"`
	ValidNotAfter     *string `json:"valid_not_after,omitempty" xml:"valid_not_after,omitempty"`
	ValidNotBefore    *string `json:"valid_not_before,omitempty" xml:"valid_not_before,omitempty"`
}

func (s UpdateEquityValidtimeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityValidtimeRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityValidtimeRequest) SetChainId(v string) *UpdateEquityValidtimeRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetDelegatedTenantId(v string) *UpdateEquityValidtimeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetEquityId(v string) *UpdateEquityValidtimeRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetOutTxId(v string) *UpdateEquityValidtimeRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetUseValidNotAfter(v string) *UpdateEquityValidtimeRequest {
	s.UseValidNotAfter = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetUseValidNotBefore(v string) *UpdateEquityValidtimeRequest {
	s.UseValidNotBefore = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetValidNotAfter(v string) *UpdateEquityValidtimeRequest {
	s.ValidNotAfter = &v
	return s
}

func (s *UpdateEquityValidtimeRequest) SetValidNotBefore(v string) *UpdateEquityValidtimeRequest {
	s.ValidNotBefore = &v
	return s
}

type UpdateEquityValidtimeResponse struct {
}

func (s UpdateEquityValidtimeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityValidtimeResponse) GoString() string {
	return s.String()
}

type QueryEquityRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	TargetDate        *string `json:"target_date,omitempty" xml:"target_date,omitempty"`
	UserId            *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s QueryEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityRequest) GoString() string {
	return s.String()
}

func (s *QueryEquityRequest) SetChainId(v string) *QueryEquityRequest {
	s.ChainId = &v
	return s
}

func (s *QueryEquityRequest) SetDelegatedTenantId(v string) *QueryEquityRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *QueryEquityRequest) SetEquityId(v string) *QueryEquityRequest {
	s.EquityId = &v
	return s
}

func (s *QueryEquityRequest) SetOptTenantId(v string) *QueryEquityRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryEquityRequest) SetTargetDate(v string) *QueryEquityRequest {
	s.TargetDate = &v
	return s
}

func (s *QueryEquityRequest) SetUserId(v string) *QueryEquityRequest {
	s.UserId = &v
	return s
}

type QueryEquityResponse struct {
	Equity *Equity   `json:"equity,omitempty" xml:"equity,omitempty"`
	Urls   []*string `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEquityResponse) GoString() string {
	return s.String()
}

func (s *QueryEquityResponse) SetEquity(v *Equity) *QueryEquityResponse {
	s.Equity = v
	return s
}

func (s *QueryEquityResponse) SetUrls(v []*string) *QueryEquityResponse {
	s.Urls = v
	return s
}

type ExecAssetGrantRequest struct {
	Amount       *string `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId      *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId      *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info         *string `json:"info,omitempty" xml:"info,omitempty"`
	MerchantId   *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	OutTxId      *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId       *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	ValidityTime *string `json:"validity_time,omitempty" xml:"validity_time,omitempty"`
}

func (s ExecAssetGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGrantRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetGrantRequest) SetAmount(v string) *ExecAssetGrantRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetGrantRequest) SetAssetId(v string) *ExecAssetGrantRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetGrantRequest) SetChainId(v string) *ExecAssetGrantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetGrantRequest) SetInfo(v string) *ExecAssetGrantRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetGrantRequest) SetMerchantId(v string) *ExecAssetGrantRequest {
	s.MerchantId = &v
	return s
}

func (s *ExecAssetGrantRequest) SetOutTxId(v string) *ExecAssetGrantRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecAssetGrantRequest) SetUserId(v string) *ExecAssetGrantRequest {
	s.UserId = &v
	return s
}

func (s *ExecAssetGrantRequest) SetValidityTime(v string) *ExecAssetGrantRequest {
	s.ValidityTime = &v
	return s
}

type ExecAssetGrantResponse struct {
}

func (s ExecAssetGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetGrantResponse) GoString() string {
	return s.String()
}

type ExecAssetRedeemRequest struct {
	Amount     *int    `json:"amount,omitempty" xml:"amount,omitempty"`
	AssetId    *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	Info       *string `json:"info,omitempty" xml:"info,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId    *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecAssetRedeemRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetRedeemRequest) GoString() string {
	return s.String()
}

func (s *ExecAssetRedeemRequest) SetAmount(v int) *ExecAssetRedeemRequest {
	s.Amount = &v
	return s
}

func (s *ExecAssetRedeemRequest) SetAssetId(v string) *ExecAssetRedeemRequest {
	s.AssetId = &v
	return s
}

func (s *ExecAssetRedeemRequest) SetChainId(v string) *ExecAssetRedeemRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAssetRedeemRequest) SetInfo(v string) *ExecAssetRedeemRequest {
	s.Info = &v
	return s
}

func (s *ExecAssetRedeemRequest) SetOriginTxId(v string) *ExecAssetRedeemRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecAssetRedeemRequest) SetOutTxId(v string) *ExecAssetRedeemRequest {
	s.OutTxId = &v
	return s
}

type ExecAssetRedeemResponse struct {
}

func (s ExecAssetRedeemResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAssetRedeemResponse) GoString() string {
	return s.String()
}

type ConfirmExchangeAftersaleRequest struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId   *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo       *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId    *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ConfirmExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *ConfirmExchangeAftersaleRequest) SetChainId(v string) *ConfirmExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ConfirmExchangeAftersaleRequest) SetEquityId(v string) *ConfirmExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ConfirmExchangeAftersaleRequest) SetMemo(v string) *ConfirmExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ConfirmExchangeAftersaleRequest) SetOriginTxId(v string) *ConfirmExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ConfirmExchangeAftersaleRequest) SetOutTxId(v string) *ConfirmExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type ConfirmExchangeAftersaleResponse struct {
}

func (s ConfirmExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExchangeAftersaleResponse) GoString() string {
	return s.String()
}

type ApplyExchangeAftersaleRequest struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId   *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo       *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId    *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ApplyExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *ApplyExchangeAftersaleRequest) SetChainId(v string) *ApplyExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ApplyExchangeAftersaleRequest) SetEquityId(v string) *ApplyExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ApplyExchangeAftersaleRequest) SetMemo(v string) *ApplyExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ApplyExchangeAftersaleRequest) SetOriginTxId(v string) *ApplyExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ApplyExchangeAftersaleRequest) SetOutTxId(v string) *ApplyExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type ApplyExchangeAftersaleResponse struct {
}

func (s ApplyExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyExchangeAftersaleResponse) GoString() string {
	return s.String()
}

type UpdateEquityStatusRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	Status            *int    `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UpdateEquityStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityStatusRequest) SetChainId(v string) *UpdateEquityStatusRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityStatusRequest) SetDelegatedTenantId(v string) *UpdateEquityStatusRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityStatusRequest) SetEquityId(v string) *UpdateEquityStatusRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityStatusRequest) SetOutTxId(v string) *UpdateEquityStatusRequest {
	s.OutTxId = &v
	return s
}

func (s *UpdateEquityStatusRequest) SetStatus(v int) *UpdateEquityStatusRequest {
	s.Status = &v
	return s
}

type UpdateEquityStatusResponse struct {
}

func (s UpdateEquityStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityStatusResponse) GoString() string {
	return s.String()
}

type QueryExchangeInstructionRequest struct {
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId    *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OptTenantId *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OriginTxId  *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
}

func (s QueryExchangeInstructionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryExchangeInstructionRequest) GoString() string {
	return s.String()
}

func (s *QueryExchangeInstructionRequest) SetChainId(v string) *QueryExchangeInstructionRequest {
	s.ChainId = &v
	return s
}

func (s *QueryExchangeInstructionRequest) SetEquityId(v string) *QueryExchangeInstructionRequest {
	s.EquityId = &v
	return s
}

func (s *QueryExchangeInstructionRequest) SetOptTenantId(v string) *QueryExchangeInstructionRequest {
	s.OptTenantId = &v
	return s
}

func (s *QueryExchangeInstructionRequest) SetOriginTxId(v string) *QueryExchangeInstructionRequest {
	s.OriginTxId = &v
	return s
}

type QueryExchangeInstructionResponse struct {
	Instruction *EInstruction `json:"instruction,omitempty" xml:"instruction,omitempty"`
}

func (s QueryExchangeInstructionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryExchangeInstructionResponse) GoString() string {
	return s.String()
}

func (s *QueryExchangeInstructionResponse) SetInstruction(v *EInstruction) *QueryExchangeInstructionResponse {
	s.Instruction = v
	return s
}

type SendExchangeRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SendExchangeRequest) String() string {
	return tea.Prettify(s)
}

func (s SendExchangeRequest) GoString() string {
	return s.String()
}

func (s *SendExchangeRequest) SetChainId(v string) *SendExchangeRequest {
	s.ChainId = &v
	return s
}

func (s *SendExchangeRequest) SetDelegatedTenantId(v string) *SendExchangeRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *SendExchangeRequest) SetEquityId(v string) *SendExchangeRequest {
	s.EquityId = &v
	return s
}

func (s *SendExchangeRequest) SetMemo(v string) *SendExchangeRequest {
	s.Memo = &v
	return s
}

func (s *SendExchangeRequest) SetOriginTxId(v string) *SendExchangeRequest {
	s.OriginTxId = &v
	return s
}

func (s *SendExchangeRequest) SetOutTxId(v string) *SendExchangeRequest {
	s.OutTxId = &v
	return s
}

type SendExchangeResponse struct {
}

func (s SendExchangeResponse) String() string {
	return tea.Prettify(s)
}

func (s SendExchangeResponse) GoString() string {
	return s.String()
}

type AuthEquityMerchantuserpriceRequest struct {
	Amount            *string `json:"amount,omitempty" xml:"amount,omitempty"`
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	Ratio             *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
}

func (s AuthEquityMerchantuserpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthEquityMerchantuserpriceRequest) GoString() string {
	return s.String()
}

func (s *AuthEquityMerchantuserpriceRequest) SetAmount(v string) *AuthEquityMerchantuserpriceRequest {
	s.Amount = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetChainId(v string) *AuthEquityMerchantuserpriceRequest {
	s.ChainId = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetDelegatedTenantId(v string) *AuthEquityMerchantuserpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetEquityId(v string) *AuthEquityMerchantuserpriceRequest {
	s.EquityId = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetOptTenantId(v string) *AuthEquityMerchantuserpriceRequest {
	s.OptTenantId = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetOutTxId(v string) *AuthEquityMerchantuserpriceRequest {
	s.OutTxId = &v
	return s
}

func (s *AuthEquityMerchantuserpriceRequest) SetRatio(v string) *AuthEquityMerchantuserpriceRequest {
	s.Ratio = &v
	return s
}

type AuthEquityMerchantuserpriceResponse struct {
}

func (s AuthEquityMerchantuserpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthEquityMerchantuserpriceResponse) GoString() string {
	return s.String()
}

type RefuseExchangeAftersaleRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s RefuseExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *RefuseExchangeAftersaleRequest) SetChainId(v string) *RefuseExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *RefuseExchangeAftersaleRequest) SetDelegatedTenantId(v string) *RefuseExchangeAftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *RefuseExchangeAftersaleRequest) SetEquityId(v string) *RefuseExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *RefuseExchangeAftersaleRequest) SetMemo(v string) *RefuseExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *RefuseExchangeAftersaleRequest) SetOriginTxId(v string) *RefuseExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *RefuseExchangeAftersaleRequest) SetOutTxId(v string) *RefuseExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type RefuseExchangeAftersaleResponse struct {
}

func (s RefuseExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseExchangeAftersaleResponse) GoString() string {
	return s.String()
}

type ExecExchangeAgreeaftersaleRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecExchangeAgreeaftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeAgreeaftersaleRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeAgreeaftersaleRequest) SetChainId(v string) *ExecExchangeAgreeaftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeAgreeaftersaleRequest) SetDelegatedTenantId(v string) *ExecExchangeAgreeaftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecExchangeAgreeaftersaleRequest) SetEquityId(v string) *ExecExchangeAgreeaftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *ExecExchangeAgreeaftersaleRequest) SetMemo(v string) *ExecExchangeAgreeaftersaleRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeAgreeaftersaleRequest) SetOriginTxId(v string) *ExecExchangeAgreeaftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecExchangeAgreeaftersaleRequest) SetOutTxId(v string) *ExecExchangeAgreeaftersaleRequest {
	s.OutTxId = &v
	return s
}

type ExecExchangeAgreeaftersaleResponse struct {
}

func (s ExecExchangeAgreeaftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeAgreeaftersaleResponse) GoString() string {
	return s.String()
}

type UpdateEquityTenantpriceRequest struct {
	Amount            *string `json:"amount,omitempty" xml:"amount,omitempty"`
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OptTenantId       *string `json:"opt_tenant_id,omitempty" xml:"opt_tenant_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s UpdateEquityTenantpriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityTenantpriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateEquityTenantpriceRequest) SetAmount(v string) *UpdateEquityTenantpriceRequest {
	s.Amount = &v
	return s
}

func (s *UpdateEquityTenantpriceRequest) SetChainId(v string) *UpdateEquityTenantpriceRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateEquityTenantpriceRequest) SetDelegatedTenantId(v string) *UpdateEquityTenantpriceRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UpdateEquityTenantpriceRequest) SetEquityId(v string) *UpdateEquityTenantpriceRequest {
	s.EquityId = &v
	return s
}

func (s *UpdateEquityTenantpriceRequest) SetOptTenantId(v string) *UpdateEquityTenantpriceRequest {
	s.OptTenantId = &v
	return s
}

func (s *UpdateEquityTenantpriceRequest) SetOutTxId(v string) *UpdateEquityTenantpriceRequest {
	s.OutTxId = &v
	return s
}

type UpdateEquityTenantpriceResponse struct {
}

func (s UpdateEquityTenantpriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateEquityTenantpriceResponse) GoString() string {
	return s.String()
}

type QueryImageRequest struct {
	Urls []*string `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImageRequest) GoString() string {
	return s.String()
}

func (s *QueryImageRequest) SetUrls(v []*string) *QueryImageRequest {
	s.Urls = v
	return s
}

type QueryImageResponse struct {
	Urls []*MultiURL `json:"urls,omitempty" xml:"urls,omitempty" type:"Repeated"`
}

func (s QueryImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImageResponse) GoString() string {
	return s.String()
}

func (s *QueryImageResponse) SetUrls(v []*MultiURL) *QueryImageResponse {
	s.Urls = v
	return s
}

type OfflineEquityRequest struct {
	ChainId  *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	OutTxId  *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s OfflineEquityRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineEquityRequest) GoString() string {
	return s.String()
}

func (s *OfflineEquityRequest) SetChainId(v string) *OfflineEquityRequest {
	s.ChainId = &v
	return s
}

func (s *OfflineEquityRequest) SetEquityId(v string) *OfflineEquityRequest {
	s.EquityId = &v
	return s
}

func (s *OfflineEquityRequest) SetOutTxId(v string) *OfflineEquityRequest {
	s.OutTxId = &v
	return s
}

type OfflineEquityResponse struct {
}

func (s OfflineEquityResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineEquityResponse) GoString() string {
	return s.String()
}

type SendExchangeAftersaleRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s SendExchangeAftersaleRequest) String() string {
	return tea.Prettify(s)
}

func (s SendExchangeAftersaleRequest) GoString() string {
	return s.String()
}

func (s *SendExchangeAftersaleRequest) SetChainId(v string) *SendExchangeAftersaleRequest {
	s.ChainId = &v
	return s
}

func (s *SendExchangeAftersaleRequest) SetDelegatedTenantId(v string) *SendExchangeAftersaleRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *SendExchangeAftersaleRequest) SetEquityId(v string) *SendExchangeAftersaleRequest {
	s.EquityId = &v
	return s
}

func (s *SendExchangeAftersaleRequest) SetMemo(v string) *SendExchangeAftersaleRequest {
	s.Memo = &v
	return s
}

func (s *SendExchangeAftersaleRequest) SetOriginTxId(v string) *SendExchangeAftersaleRequest {
	s.OriginTxId = &v
	return s
}

func (s *SendExchangeAftersaleRequest) SetOutTxId(v string) *SendExchangeAftersaleRequest {
	s.OutTxId = &v
	return s
}

type SendExchangeAftersaleResponse struct {
}

func (s SendExchangeAftersaleResponse) String() string {
	return tea.Prettify(s)
}

func (s SendExchangeAftersaleResponse) GoString() string {
	return s.String()
}

type ExecExchangeBymerchantRequest struct {
	AssetId     *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	AssetRate   *string `json:"asset_rate,omitempty" xml:"asset_rate,omitempty"`
	ChainId     *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId    *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	EquityPrice *string `json:"equity_price,omitempty" xml:"equity_price,omitempty"`
	Memo        *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OutTxId     *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	TxSig       *string `json:"tx_sig,omitempty" xml:"tx_sig,omitempty"`
	UserId      *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecExchangeBymerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeBymerchantRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeBymerchantRequest) SetAssetId(v string) *ExecExchangeBymerchantRequest {
	s.AssetId = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetAssetRate(v string) *ExecExchangeBymerchantRequest {
	s.AssetRate = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetChainId(v string) *ExecExchangeBymerchantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetEquityId(v string) *ExecExchangeBymerchantRequest {
	s.EquityId = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetEquityPrice(v string) *ExecExchangeBymerchantRequest {
	s.EquityPrice = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetMemo(v string) *ExecExchangeBymerchantRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetOutTxId(v string) *ExecExchangeBymerchantRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetTxSig(v string) *ExecExchangeBymerchantRequest {
	s.TxSig = &v
	return s
}

func (s *ExecExchangeBymerchantRequest) SetUserId(v string) *ExecExchangeBymerchantRequest {
	s.UserId = &v
	return s
}

type ExecExchangeBymerchantResponse struct {
}

func (s ExecExchangeBymerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeBymerchantResponse) GoString() string {
	return s.String()
}

type UploadImageRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	ContentType       *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	Image             *string `json:"image,omitempty" xml:"image,omitempty"`
}

func (s UploadImageRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadImageRequest) GoString() string {
	return s.String()
}

func (s *UploadImageRequest) SetChainId(v string) *UploadImageRequest {
	s.ChainId = &v
	return s
}

func (s *UploadImageRequest) SetContentType(v string) *UploadImageRequest {
	s.ContentType = &v
	return s
}

func (s *UploadImageRequest) SetDelegatedTenantId(v string) *UploadImageRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *UploadImageRequest) SetImage(v string) *UploadImageRequest {
	s.Image = &v
	return s
}

type UploadImageResponse struct {
	TemporaryUrl *string `json:"temporary_url,omitempty" xml:"temporary_url,omitempty"`
	Url          *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s UploadImageResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadImageResponse) GoString() string {
	return s.String()
}

func (s *UploadImageResponse) SetTemporaryUrl(v string) *UploadImageResponse {
	s.TemporaryUrl = &v
	return s
}

func (s *UploadImageResponse) SetUrl(v string) *UploadImageResponse {
	s.Url = &v
	return s
}

type ExecExchangeOutofstoreRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	EquityId          *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecExchangeOutofstoreRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeOutofstoreRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeOutofstoreRequest) SetChainId(v string) *ExecExchangeOutofstoreRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeOutofstoreRequest) SetDelegatedTenantId(v string) *ExecExchangeOutofstoreRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecExchangeOutofstoreRequest) SetEquityId(v string) *ExecExchangeOutofstoreRequest {
	s.EquityId = &v
	return s
}

func (s *ExecExchangeOutofstoreRequest) SetMemo(v string) *ExecExchangeOutofstoreRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeOutofstoreRequest) SetOriginTxId(v string) *ExecExchangeOutofstoreRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecExchangeOutofstoreRequest) SetOutTxId(v string) *ExecExchangeOutofstoreRequest {
	s.OutTxId = &v
	return s
}

type ExecExchangeOutofstoreResponse struct {
}

func (s ExecExchangeOutofstoreResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeOutofstoreResponse) GoString() string {
	return s.String()
}

type ExecExchangeReceivebymerchantRequest struct {
	ChainId    *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	EquityId   *string `json:"equity_id,omitempty" xml:"equity_id,omitempty"`
	Memo       *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId    *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
}

func (s ExecExchangeReceivebymerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeReceivebymerchantRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeReceivebymerchantRequest) SetChainId(v string) *ExecExchangeReceivebymerchantRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeReceivebymerchantRequest) SetEquityId(v string) *ExecExchangeReceivebymerchantRequest {
	s.EquityId = &v
	return s
}

func (s *ExecExchangeReceivebymerchantRequest) SetMemo(v string) *ExecExchangeReceivebymerchantRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeReceivebymerchantRequest) SetOriginTxId(v string) *ExecExchangeReceivebymerchantRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecExchangeReceivebymerchantRequest) SetOutTxId(v string) *ExecExchangeReceivebymerchantRequest {
	s.OutTxId = &v
	return s
}

type ExecExchangeReceivebymerchantResponse struct {
}

func (s ExecExchangeReceivebymerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeReceivebymerchantResponse) GoString() string {
	return s.String()
}

type ExecExchangeReceivebyuserRequest struct {
	ChainId           *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	DelegatedTenantId *string `json:"delegated_tenant_id,omitempty" xml:"delegated_tenant_id,omitempty"`
	Memo              *string `json:"memo,omitempty" xml:"memo,omitempty"`
	OriginTxId        *string `json:"origin_tx_id,omitempty" xml:"origin_tx_id,omitempty"`
	OutTxId           *string `json:"out_tx_id,omitempty" xml:"out_tx_id,omitempty"`
	UserId            *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ExecExchangeReceivebyuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeReceivebyuserRequest) GoString() string {
	return s.String()
}

func (s *ExecExchangeReceivebyuserRequest) SetChainId(v string) *ExecExchangeReceivebyuserRequest {
	s.ChainId = &v
	return s
}

func (s *ExecExchangeReceivebyuserRequest) SetDelegatedTenantId(v string) *ExecExchangeReceivebyuserRequest {
	s.DelegatedTenantId = &v
	return s
}

func (s *ExecExchangeReceivebyuserRequest) SetMemo(v string) *ExecExchangeReceivebyuserRequest {
	s.Memo = &v
	return s
}

func (s *ExecExchangeReceivebyuserRequest) SetOriginTxId(v string) *ExecExchangeReceivebyuserRequest {
	s.OriginTxId = &v
	return s
}

func (s *ExecExchangeReceivebyuserRequest) SetOutTxId(v string) *ExecExchangeReceivebyuserRequest {
	s.OutTxId = &v
	return s
}

func (s *ExecExchangeReceivebyuserRequest) SetUserId(v string) *ExecExchangeReceivebyuserRequest {
	s.UserId = &v
	return s
}

type ExecExchangeReceivebyuserResponse struct {
}

func (s ExecExchangeReceivebyuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecExchangeReceivebyuserResponse) GoString() string {
	return s.String()
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
	AuthToken       *string
	Tenant          *string
	Workspace       *string
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
	client.Tenant = config.Tenant
	client.Workspace = config.Workspace
	client.Endpoint = config.Endpoint
	client.AuthToken = config.AuthToken
	client.Protocol = config.Protocol
	client.RegionId = config.RegionId
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
func (client *Client) DoRequest(action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
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
				"method":     action,
				"version":    tea.String("1.0"),
				"sign_type":  tea.String("HmacSHA1"),
				"req_time":   alipayutil.GetTimestamp(),
				"req_msg_id": util.GetNonce(),
			}
			if !tea.BoolValue(util.Empty(client.Tenant)) {
				request_.Query["tenant"] = client.Tenant
			}

			if !tea.BoolValue(util.Empty(client.Workspace)) {
				request_.Query["workspace"] = client.Workspace
			}

			if !tea.BoolValue(util.Empty(client.AuthToken)) {
				request_.Query["auth_token"] = client.AuthToken
			} else {
				request_.Query["access_key"] = client.AccessKeyId
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
	userAgent := util.GetUserAgent(client.UserAgent)
	_result = userAgent
	return _result
}

/**
 * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-风控禁用卡密
 */
func (client *Client) ExecCardForbidden(request *ExecCardForbiddenRequest) (_result *ExecCardForbiddenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardForbiddenResponse{}
	_body, _err := client.ExecCardForbiddenEx(request, runtime)
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
func (client *Client) ExecCardForbiddenEx(request *ExecCardForbiddenRequest, runtime *util.RuntimeOptions) (_result *ExecCardForbiddenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardForbiddenResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.forbidden.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMypointsOrderinstruction(request *QueryMypointsOrderinstructionRequest) (_result *QueryMypointsOrderinstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMypointsOrderinstructionResponse{}
	_body, _err := client.QueryMypointsOrderinstructionEx(request, runtime)
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
func (client *Client) QueryMypointsOrderinstructionEx(request *QueryMypointsOrderinstructionRequest, runtime *util.RuntimeOptions) (_result *QueryMypointsOrderinstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypointsOrderinstructionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.orderinstruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisBlock(request *QueryBlockanalysisBlockRequest) (_result *QueryBlockanalysisBlockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisBlockResponse{}
	_body, _err := client.QueryBlockanalysisBlockEx(request, runtime)
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
func (client *Client) QueryBlockanalysisBlockEx(request *QueryBlockanalysisBlockRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisBlockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisBlockResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.block.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquityDefaultprice(request *UpdateEquityDefaultpriceRequest) (_result *UpdateEquityDefaultpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityDefaultpriceResponse{}
	_body, _err := client.UpdateEquityDefaultpriceEx(request, runtime)
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
func (client *Client) UpdateEquityDefaultpriceEx(request *UpdateEquityDefaultpriceRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityDefaultpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityDefaultpriceResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.defaultprice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateMerchantProvision(request *CreateMerchantProvisionRequest) (_result *CreateMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateMerchantProvisionResponse{}
	_body, _err := client.CreateMerchantProvisionEx(request, runtime)
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
func (client *Client) CreateMerchantProvisionEx(request *CreateMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *CreateMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.provision.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecMypointsOrdersku(request *ExecMypointsOrderskuRequest) (_result *ExecMypointsOrderskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecMypointsOrderskuResponse{}
	_body, _err := client.ExecMypointsOrderskuEx(request, runtime)
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
func (client *Client) ExecMypointsOrderskuEx(request *ExecMypointsOrderskuRequest, runtime *util.RuntimeOptions) (_result *ExecMypointsOrderskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecMypointsOrderskuResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.ordersku.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SetMerchantProvision(request *SetMerchantProvisionRequest) (_result *SetMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetMerchantProvisionResponse{}
	_body, _err := client.SetMerchantProvisionEx(request, runtime)
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
func (client *Client) SetMerchantProvisionEx(request *SetMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *SetMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.provision.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisDelegaterelation(request *QueryBlockanalysisDelegaterelationRequest) (_result *QueryBlockanalysisDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisDelegaterelationResponse{}
	_body, _err := client.QueryBlockanalysisDelegaterelationEx(request, runtime)
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
func (client *Client) QueryBlockanalysisDelegaterelationEx(request *QueryBlockanalysisDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.delegaterelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecCardQuery(request *ExecCardQueryRequest) (_result *ExecCardQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardQueryResponse{}
	_body, _err := client.ExecCardQueryEx(request, runtime)
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
func (client *Client) ExecCardQueryEx(request *ExecCardQueryRequest, runtime *util.RuntimeOptions) (_result *ExecCardQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardQueryResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.query.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquityExchangelimit(request *UpdateEquityExchangelimitRequest) (_result *UpdateEquityExchangelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityExchangelimitResponse{}
	_body, _err := client.UpdateEquityExchangelimitEx(request, runtime)
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
func (client *Client) UpdateEquityExchangelimitEx(request *UpdateEquityExchangelimitRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityExchangelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityExchangelimitResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.exchangelimit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMypointsPreorderinstruction(request *QueryMypointsPreorderinstructionRequest) (_result *QueryMypointsPreorderinstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMypointsPreorderinstructionResponse{}
	_body, _err := client.QueryMypointsPreorderinstructionEx(request, runtime)
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
func (client *Client) QueryMypointsPreorderinstructionEx(request *QueryMypointsPreorderinstructionRequest, runtime *util.RuntimeOptions) (_result *QueryMypointsPreorderinstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypointsPreorderinstructionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.preorderinstruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBlockanalysisDelegaterelation(request *UpdateBlockanalysisDelegaterelationRequest) (_result *UpdateBlockanalysisDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBlockanalysisDelegaterelationResponse{}
	_body, _err := client.UpdateBlockanalysisDelegaterelationEx(request, runtime)
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
func (client *Client) UpdateBlockanalysisDelegaterelationEx(request *UpdateBlockanalysisDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *UpdateBlockanalysisDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBlockanalysisDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.delegaterelation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateMerchantProvision(request *UpdateMerchantProvisionRequest) (_result *UpdateMerchantProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateMerchantProvisionResponse{}
	_body, _err := client.UpdateMerchantProvisionEx(request, runtime)
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
func (client *Client) UpdateMerchantProvisionEx(request *UpdateMerchantProvisionRequest, runtime *util.RuntimeOptions) (_result *UpdateMerchantProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMerchantProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.provision.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) FreezeEquity(request *FreezeEquityRequest) (_result *FreezeEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FreezeEquityResponse{}
	_body, _err := client.FreezeEquityEx(request, runtime)
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
func (client *Client) FreezeEquityEx(request *FreezeEquityRequest, runtime *util.RuntimeOptions) (_result *FreezeEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FreezeEquityResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.freeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecCardWriteoff(request *ExecCardWriteoffRequest) (_result *ExecCardWriteoffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardWriteoffResponse{}
	_body, _err := client.ExecCardWriteoffEx(request, runtime)
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
func (client *Client) ExecCardWriteoffEx(request *ExecCardWriteoffRequest, runtime *util.RuntimeOptions) (_result *ExecCardWriteoffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardWriteoffResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.writeoff.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMerchantUser(request *QueryMerchantUserRequest) (_result *QueryMerchantUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMerchantUserResponse{}
	_body, _err := client.QueryMerchantUserEx(request, runtime)
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
func (client *Client) QueryMerchantUserEx(request *QueryMerchantUserRequest, runtime *util.RuntimeOptions) (_result *QueryMerchantUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockLastblocknumber(request *QueryBlockLastblocknumberRequest) (_result *QueryBlockLastblocknumberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockLastblocknumberResponse{}
	_body, _err := client.QueryBlockLastblocknumberEx(request, runtime)
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
func (client *Client) QueryBlockLastblocknumberEx(request *QueryBlockLastblocknumberRequest, runtime *util.RuntimeOptions) (_result *QueryBlockLastblocknumberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockLastblocknumberResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.block.lastblocknumber.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryEquityInstruction(request *QueryEquityInstructionRequest) (_result *QueryEquityInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryEquityInstructionResponse{}
	_body, _err := client.QueryEquityInstructionEx(request, runtime)
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
func (client *Client) QueryEquityInstructionEx(request *QueryEquityInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryEquityInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEquityInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMerchantProvisions(request *QueryMerchantProvisionsRequest) (_result *QueryMerchantProvisionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMerchantProvisionsResponse{}
	_body, _err := client.QueryMerchantProvisionsEx(request, runtime)
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
func (client *Client) QueryMerchantProvisionsEx(request *QueryMerchantProvisionsRequest, runtime *util.RuntimeOptions) (_result *QueryMerchantProvisionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantProvisionsResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.provisions.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryConfigDelegaterelation(request *QueryConfigDelegaterelationRequest) (_result *QueryConfigDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryConfigDelegaterelationResponse{}
	_body, _err := client.QueryConfigDelegaterelationEx(request, runtime)
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
func (client *Client) QueryConfigDelegaterelationEx(request *QueryConfigDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *QueryConfigDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryConfigDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.config.delegaterelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecExchangeByuser(request *ExecExchangeByuserRequest) (_result *ExecExchangeByuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeByuserResponse{}
	_body, _err := client.ExecExchangeByuserEx(request, runtime)
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
func (client *Client) ExecExchangeByuserEx(request *ExecExchangeByuserRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeByuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeByuserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.byuser.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMypointsMerchantbalance(request *QueryMypointsMerchantbalanceRequest) (_result *QueryMypointsMerchantbalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMypointsMerchantbalanceResponse{}
	_body, _err := client.QueryMypointsMerchantbalanceEx(request, runtime)
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
func (client *Client) QueryMypointsMerchantbalanceEx(request *QueryMypointsMerchantbalanceRequest, runtime *util.RuntimeOptions) (_result *QueryMypointsMerchantbalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypointsMerchantbalanceResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.merchantbalance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlock(request *QueryBlockRequest) (_result *QueryBlockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockResponse{}
	_body, _err := client.QueryBlockEx(request, runtime)
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
func (client *Client) QueryBlockEx(request *QueryBlockRequest, runtime *util.RuntimeOptions) (_result *QueryBlockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.block.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMerchant(request *QueryMerchantRequest) (_result *QueryMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMerchantResponse{}
	_body, _err := client.QueryMerchantEx(request, runtime)
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
func (client *Client) QueryMerchantEx(request *QueryMerchantRequest, runtime *util.RuntimeOptions) (_result *QueryMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateConfigDelegaterelation(request *UpdateConfigDelegaterelationRequest) (_result *UpdateConfigDelegaterelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateConfigDelegaterelationResponse{}
	_body, _err := client.UpdateConfigDelegaterelationEx(request, runtime)
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
func (client *Client) UpdateConfigDelegaterelationEx(request *UpdateConfigDelegaterelationRequest, runtime *util.RuntimeOptions) (_result *UpdateConfigDelegaterelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateConfigDelegaterelationResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.config.delegaterelation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecPkiDecrypt(request *ExecPkiDecryptRequest) (_result *ExecPkiDecryptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecPkiDecryptResponse{}
	_body, _err := client.ExecPkiDecryptEx(request, runtime)
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
func (client *Client) ExecPkiDecryptEx(request *ExecPkiDecryptRequest, runtime *util.RuntimeOptions) (_result *ExecPkiDecryptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecPkiDecryptResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.pki.decrypt.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisUserpriceupdatedequities(request *QueryBlockanalysisUserpriceupdatedequitiesRequest) (_result *QueryBlockanalysisUserpriceupdatedequitiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisUserpriceupdatedequitiesResponse{}
	_body, _err := client.QueryBlockanalysisUserpriceupdatedequitiesEx(request, runtime)
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
func (client *Client) QueryBlockanalysisUserpriceupdatedequitiesEx(request *QueryBlockanalysisUserpriceupdatedequitiesRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisUserpriceupdatedequitiesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisUserpriceupdatedequitiesResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.userpriceupdatedequities.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateMerchantUser(request *CreateMerchantUserRequest) (_result *CreateMerchantUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateMerchantUserResponse{}
	_body, _err := client.CreateMerchantUserEx(request, runtime)
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
func (client *Client) CreateMerchantUserEx(request *CreateMerchantUserRequest, runtime *util.RuntimeOptions) (_result *CreateMerchantUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMerchantUserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryConfigWhitelist(request *QueryConfigWhitelistRequest) (_result *QueryConfigWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryConfigWhitelistResponse{}
	_body, _err := client.QueryConfigWhitelistEx(request, runtime)
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
func (client *Client) QueryConfigWhitelistEx(request *QueryConfigWhitelistRequest, runtime *util.RuntimeOptions) (_result *QueryConfigWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryConfigWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.config.whitelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecPkiEncrypt(request *ExecPkiEncryptRequest) (_result *ExecPkiEncryptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecPkiEncryptResponse{}
	_body, _err := client.ExecPkiEncryptEx(request, runtime)
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
func (client *Client) ExecPkiEncryptEx(request *ExecPkiEncryptRequest, runtime *util.RuntimeOptions) (_result *ExecPkiEncryptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecPkiEncryptResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.pki.encrypt.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisWhitelist(request *QueryBlockanalysisWhitelistRequest) (_result *QueryBlockanalysisWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisWhitelistResponse{}
	_body, _err := client.QueryBlockanalysisWhitelistEx(request, runtime)
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
func (client *Client) QueryBlockanalysisWhitelistEx(request *QueryBlockanalysisWhitelistRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.whitelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMerchantExchangeableequitylist(request *QueryMerchantExchangeableequitylistRequest) (_result *QueryMerchantExchangeableequitylistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMerchantExchangeableequitylistResponse{}
	_body, _err := client.QueryMerchantExchangeableequitylistEx(request, runtime)
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
func (client *Client) QueryMerchantExchangeableequitylistEx(request *QueryMerchantExchangeableequitylistRequest, runtime *util.RuntimeOptions) (_result *QueryMerchantExchangeableequitylistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantExchangeableequitylistResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.exchangeableequitylist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddEquityCount(request *AddEquityCountRequest) (_result *AddEquityCountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddEquityCountResponse{}
	_body, _err := client.AddEquityCountEx(request, runtime)
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
func (client *Client) AddEquityCountEx(request *AddEquityCountRequest, runtime *util.RuntimeOptions) (_result *AddEquityCountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddEquityCountResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.count.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecCardChargereset(request *ExecCardChargeresetRequest) (_result *ExecCardChargeresetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardChargeresetResponse{}
	_body, _err := client.ExecCardChargeresetEx(request, runtime)
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
func (client *Client) ExecCardChargeresetEx(request *ExecCardChargeresetRequest, runtime *util.RuntimeOptions) (_result *ExecCardChargeresetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardChargeresetResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.chargereset.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetPkiPublickey(request *GetPkiPublickeyRequest) (_result *GetPkiPublickeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetPkiPublickeyResponse{}
	_body, _err := client.GetPkiPublickeyEx(request, runtime)
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
func (client *Client) GetPkiPublickeyEx(request *GetPkiPublickeyRequest, runtime *util.RuntimeOptions) (_result *GetPkiPublickeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetPkiPublickeyResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.pki.publickey.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBlockanalysisWhitelist(request *UpdateBlockanalysisWhitelistRequest) (_result *UpdateBlockanalysisWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBlockanalysisWhitelistResponse{}
	_body, _err := client.UpdateBlockanalysisWhitelistEx(request, runtime)
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
func (client *Client) UpdateBlockanalysisWhitelistEx(request *UpdateBlockanalysisWhitelistRequest, runtime *util.RuntimeOptions) (_result *UpdateBlockanalysisWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBlockanalysisWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.whitelist.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateMerchantFriend(request *UpdateMerchantFriendRequest) (_result *UpdateMerchantFriendResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateMerchantFriendResponse{}
	_body, _err := client.UpdateMerchantFriendEx(request, runtime)
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
func (client *Client) UpdateMerchantFriendEx(request *UpdateMerchantFriendRequest, runtime *util.RuntimeOptions) (_result *UpdateMerchantFriendResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMerchantFriendResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.friend.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateEquity(request *CreateEquityRequest) (_result *CreateEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateEquityResponse{}
	_body, _err := client.CreateEquityEx(request, runtime)
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
func (client *Client) CreateEquityEx(request *CreateEquityRequest, runtime *util.RuntimeOptions) (_result *CreateEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEquityResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
 * Summary: 数字商品服务-消费卡服务-创建卡密
 */
func (client *Client) ExecCardCreate(request *ExecCardCreateRequest) (_result *ExecCardCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardCreateResponse{}
	_body, _err := client.ExecCardCreateEx(request, runtime)
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
func (client *Client) ExecCardCreateEx(request *ExecCardCreateRequest, runtime *util.RuntimeOptions) (_result *ExecCardCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardCreateResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.create.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecMypointsPreordersku(request *ExecMypointsPreorderskuRequest) (_result *ExecMypointsPreorderskuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecMypointsPreorderskuResponse{}
	_body, _err := client.ExecMypointsPreorderskuEx(request, runtime)
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
func (client *Client) ExecMypointsPreorderskuEx(request *ExecMypointsPreorderskuRequest, runtime *util.RuntimeOptions) (_result *ExecMypointsPreorderskuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecMypointsPreorderskuResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.preordersku.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisLastblocknumber(request *QueryBlockanalysisLastblocknumberRequest) (_result *QueryBlockanalysisLastblocknumberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisLastblocknumberResponse{}
	_body, _err := client.QueryBlockanalysisLastblocknumberEx(request, runtime)
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
func (client *Client) QueryBlockanalysisLastblocknumberEx(request *QueryBlockanalysisLastblocknumberRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisLastblocknumberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisLastblocknumberResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.lastblocknumber.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SetMerchantFundmanager(request *SetMerchantFundmanagerRequest) (_result *SetMerchantFundmanagerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SetMerchantFundmanagerResponse{}
	_body, _err := client.SetMerchantFundmanagerEx(request, runtime)
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
func (client *Client) SetMerchantFundmanagerEx(request *SetMerchantFundmanagerRequest, runtime *util.RuntimeOptions) (_result *SetMerchantFundmanagerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetMerchantFundmanagerResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.fundmanager.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryEquityCreateresult(request *QueryEquityCreateresultRequest) (_result *QueryEquityCreateresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryEquityCreateresultResponse{}
	_body, _err := client.QueryEquityCreateresultEx(request, runtime)
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
func (client *Client) QueryEquityCreateresultEx(request *QueryEquityCreateresultRequest, runtime *util.RuntimeOptions) (_result *QueryEquityCreateresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEquityCreateresultResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.createresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMypointsSku(request *QueryMypointsSkuRequest) (_result *QueryMypointsSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMypointsSkuResponse{}
	_body, _err := client.QueryMypointsSkuEx(request, runtime)
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
func (client *Client) QueryMypointsSkuEx(request *QueryMypointsSkuRequest, runtime *util.RuntimeOptions) (_result *QueryMypointsSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypointsSkuResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.sku.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ConfirmExchange(request *ConfirmExchangeRequest) (_result *ConfirmExchangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmExchangeResponse{}
	_body, _err := client.ConfirmExchangeEx(request, runtime)
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
func (client *Client) ConfirmExchangeEx(request *ConfirmExchangeRequest, runtime *util.RuntimeOptions) (_result *ConfirmExchangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmExchangeResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisOpenedequities(request *QueryBlockanalysisOpenedequitiesRequest) (_result *QueryBlockanalysisOpenedequitiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisOpenedequitiesResponse{}
	_body, _err := client.QueryBlockanalysisOpenedequitiesEx(request, runtime)
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
func (client *Client) QueryBlockanalysisOpenedequitiesEx(request *QueryBlockanalysisOpenedequitiesRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisOpenedequitiesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisOpenedequitiesResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.openedequities.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateMerchant(request *CreateMerchantRequest) (_result *CreateMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateMerchantResponse{}
	_body, _err := client.CreateMerchantEx(request, runtime)
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
func (client *Client) CreateMerchantEx(request *CreateMerchantRequest, runtime *util.RuntimeOptions) (_result *CreateMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateConfigWhitelist(request *UpdateConfigWhitelistRequest) (_result *UpdateConfigWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateConfigWhitelistResponse{}
	_body, _err := client.UpdateConfigWhitelistEx(request, runtime)
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
func (client *Client) UpdateConfigWhitelistEx(request *UpdateConfigWhitelistRequest, runtime *util.RuntimeOptions) (_result *UpdateConfigWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateConfigWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.config.whitelist.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecCardBindname(request *ExecCardBindnameRequest) (_result *ExecCardBindnameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardBindnameResponse{}
	_body, _err := client.ExecCardBindnameEx(request, runtime)
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
func (client *Client) ExecCardBindnameEx(request *ExecCardBindnameRequest, runtime *util.RuntimeOptions) (_result *ExecCardBindnameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardBindnameResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.bindname.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMypointsSkufee(request *QueryMypointsSkufeeRequest) (_result *QueryMypointsSkufeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMypointsSkufeeResponse{}
	_body, _err := client.QueryMypointsSkufeeEx(request, runtime)
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
func (client *Client) QueryMypointsSkufeeEx(request *QueryMypointsSkufeeRequest, runtime *util.RuntimeOptions) (_result *QueryMypointsSkufeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypointsSkufeeResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.mypoints.skufee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBlockanalysisUnwriteoffvalue(request *QueryBlockanalysisUnwriteoffvalueRequest) (_result *QueryBlockanalysisUnwriteoffvalueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBlockanalysisUnwriteoffvalueResponse{}
	_body, _err := client.QueryBlockanalysisUnwriteoffvalueEx(request, runtime)
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
func (client *Client) QueryBlockanalysisUnwriteoffvalueEx(request *QueryBlockanalysisUnwriteoffvalueRequest, runtime *util.RuntimeOptions) (_result *QueryBlockanalysisUnwriteoffvalueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockanalysisUnwriteoffvalueResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.blockanalysis.unwriteoffvalue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryMerchantExchangeableequitydetail(request *QueryMerchantExchangeableequitydetailRequest) (_result *QueryMerchantExchangeableequitydetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryMerchantExchangeableequitydetailResponse{}
	_body, _err := client.QueryMerchantExchangeableequitydetailEx(request, runtime)
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
func (client *Client) QueryMerchantExchangeableequitydetailEx(request *QueryMerchantExchangeableequitydetailRequest, runtime *util.RuntimeOptions) (_result *QueryMerchantExchangeableequitydetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantExchangeableequitydetailResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.merchant.exchangeableequitydetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 原生存证接口
 * Summary: 数字商品服务-存证服务-原生存证
 */
func (client *Client) ExecDataDeposit(request *ExecDataDepositRequest) (_result *ExecDataDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecDataDepositResponse{}
	_body, _err := client.ExecDataDepositEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 原生存证接口
 * Summary: 数字商品服务-存证服务-原生存证
 */
func (client *Client) ExecDataDepositEx(request *ExecDataDepositRequest, runtime *util.RuntimeOptions) (_result *ExecDataDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecDataDepositResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.data.deposit.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecCardCharge(request *ExecCardChargeRequest) (_result *ExecCardChargeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecCardChargeResponse{}
	_body, _err := client.ExecCardChargeEx(request, runtime)
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
func (client *Client) ExecCardChargeEx(request *ExecCardChargeRequest, runtime *util.RuntimeOptions) (_result *ExecCardChargeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecCardChargeResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.card.charge.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetGrantrefund(request *ExecAssetGrantrefundRequest) (_result *ExecAssetGrantrefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetGrantrefundResponse{}
	_body, _err := client.ExecAssetGrantrefundEx(request, runtime)
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
func (client *Client) ExecAssetGrantrefundEx(request *ExecAssetGrantrefundRequest, runtime *util.RuntimeOptions) (_result *ExecAssetGrantrefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetGrantrefundResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.grantrefund.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetExpire(request *ExecAssetExpireRequest) (_result *ExecAssetExpireResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetExpireResponse{}
	_body, _err := client.ExecAssetExpireEx(request, runtime)
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
func (client *Client) ExecAssetExpireEx(request *ExecAssetExpireRequest, runtime *util.RuntimeOptions) (_result *ExecAssetExpireResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetExpireResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.expire.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetIssue(request *ExecAssetIssueRequest) (_result *ExecAssetIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetIssueResponse{}
	_body, _err := client.ExecAssetIssueEx(request, runtime)
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
func (client *Client) ExecAssetIssueEx(request *ExecAssetIssueRequest, runtime *util.RuntimeOptions) (_result *ExecAssetIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetIssueResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.issue.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetAdjust(request *ExecAssetAdjustRequest) (_result *ExecAssetAdjustResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetAdjustResponse{}
	_body, _err := client.ExecAssetAdjustEx(request, runtime)
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
func (client *Client) ExecAssetAdjustEx(request *ExecAssetAdjustRequest, runtime *util.RuntimeOptions) (_result *ExecAssetAdjustResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetAdjustResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.adjust.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquity(request *UpdateEquityRequest) (_result *UpdateEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityResponse{}
	_body, _err := client.UpdateEquityEx(request, runtime)
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
func (client *Client) UpdateEquityEx(request *UpdateEquityRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryAssetInstruction(request *QueryAssetInstructionRequest) (_result *QueryAssetInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAssetInstructionResponse{}
	_body, _err := client.QueryAssetInstructionEx(request, runtime)
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
func (client *Client) QueryAssetInstructionEx(request *QueryAssetInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryAssetInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAssetInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetGenerate(request *ExecAssetGenerateRequest) (_result *ExecAssetGenerateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetGenerateResponse{}
	_body, _err := client.ExecAssetGenerateEx(request, runtime)
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
func (client *Client) ExecAssetGenerateEx(request *ExecAssetGenerateRequest, runtime *util.RuntimeOptions) (_result *ExecAssetGenerateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetGenerateResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.generate.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryAsset(request *QueryAssetRequest) (_result *QueryAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAssetResponse{}
	_body, _err := client.QueryAssetEx(request, runtime)
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
func (client *Client) QueryAssetEx(request *QueryAssetRequest, runtime *util.RuntimeOptions) (_result *QueryAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAssetResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetCreate(request *ExecAssetCreateRequest) (_result *ExecAssetCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetCreateResponse{}
	_body, _err := client.ExecAssetCreateEx(request, runtime)
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
func (client *Client) ExecAssetCreateEx(request *ExecAssetCreateRequest, runtime *util.RuntimeOptions) (_result *ExecAssetCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetCreateResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.create.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquityValidtime(request *UpdateEquityValidtimeRequest) (_result *UpdateEquityValidtimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityValidtimeResponse{}
	_body, _err := client.UpdateEquityValidtimeEx(request, runtime)
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
func (client *Client) UpdateEquityValidtimeEx(request *UpdateEquityValidtimeRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityValidtimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityValidtimeResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.validtime.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryEquity(request *QueryEquityRequest) (_result *QueryEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryEquityResponse{}
	_body, _err := client.QueryEquityEx(request, runtime)
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
func (client *Client) QueryEquityEx(request *QueryEquityRequest, runtime *util.RuntimeOptions) (_result *QueryEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEquityResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetGrant(request *ExecAssetGrantRequest) (_result *ExecAssetGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetGrantResponse{}
	_body, _err := client.ExecAssetGrantEx(request, runtime)
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
func (client *Client) ExecAssetGrantEx(request *ExecAssetGrantRequest, runtime *util.RuntimeOptions) (_result *ExecAssetGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetGrantResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.grant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAssetRedeem(request *ExecAssetRedeemRequest) (_result *ExecAssetRedeemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAssetRedeemResponse{}
	_body, _err := client.ExecAssetRedeemEx(request, runtime)
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
func (client *Client) ExecAssetRedeemEx(request *ExecAssetRedeemRequest, runtime *util.RuntimeOptions) (_result *ExecAssetRedeemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAssetRedeemResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.asset.redeem.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ConfirmExchangeAftersale(request *ConfirmExchangeAftersaleRequest) (_result *ConfirmExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmExchangeAftersaleResponse{}
	_body, _err := client.ConfirmExchangeAftersaleEx(request, runtime)
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
func (client *Client) ConfirmExchangeAftersaleEx(request *ConfirmExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *ConfirmExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.aftersale.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ApplyExchangeAftersale(request *ApplyExchangeAftersaleRequest) (_result *ApplyExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyExchangeAftersaleResponse{}
	_body, _err := client.ApplyExchangeAftersaleEx(request, runtime)
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
func (client *Client) ApplyExchangeAftersaleEx(request *ApplyExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *ApplyExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.aftersale.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquityStatus(request *UpdateEquityStatusRequest) (_result *UpdateEquityStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityStatusResponse{}
	_body, _err := client.UpdateEquityStatusEx(request, runtime)
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
func (client *Client) UpdateEquityStatusEx(request *UpdateEquityStatusRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityStatusResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryExchangeInstruction(request *QueryExchangeInstructionRequest) (_result *QueryExchangeInstructionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryExchangeInstructionResponse{}
	_body, _err := client.QueryExchangeInstructionEx(request, runtime)
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
func (client *Client) QueryExchangeInstructionEx(request *QueryExchangeInstructionRequest, runtime *util.RuntimeOptions) (_result *QueryExchangeInstructionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryExchangeInstructionResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.instruction.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendExchange(request *SendExchangeRequest) (_result *SendExchangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendExchangeResponse{}
	_body, _err := client.SendExchangeEx(request, runtime)
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
func (client *Client) SendExchangeEx(request *SendExchangeRequest, runtime *util.RuntimeOptions) (_result *SendExchangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendExchangeResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AuthEquityMerchantuserprice(request *AuthEquityMerchantuserpriceRequest) (_result *AuthEquityMerchantuserpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AuthEquityMerchantuserpriceResponse{}
	_body, _err := client.AuthEquityMerchantuserpriceEx(request, runtime)
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
func (client *Client) AuthEquityMerchantuserpriceEx(request *AuthEquityMerchantuserpriceRequest, runtime *util.RuntimeOptions) (_result *AuthEquityMerchantuserpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthEquityMerchantuserpriceResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.merchantuserprice.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) RefuseExchangeAftersale(request *RefuseExchangeAftersaleRequest) (_result *RefuseExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &RefuseExchangeAftersaleResponse{}
	_body, _err := client.RefuseExchangeAftersaleEx(request, runtime)
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
func (client *Client) RefuseExchangeAftersaleEx(request *RefuseExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *RefuseExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.aftersale.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecExchangeAgreeaftersale(request *ExecExchangeAgreeaftersaleRequest) (_result *ExecExchangeAgreeaftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeAgreeaftersaleResponse{}
	_body, _err := client.ExecExchangeAgreeaftersaleEx(request, runtime)
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
func (client *Client) ExecExchangeAgreeaftersaleEx(request *ExecExchangeAgreeaftersaleRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeAgreeaftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeAgreeaftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.agreeaftersale.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateEquityTenantprice(request *UpdateEquityTenantpriceRequest) (_result *UpdateEquityTenantpriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateEquityTenantpriceResponse{}
	_body, _err := client.UpdateEquityTenantpriceEx(request, runtime)
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
func (client *Client) UpdateEquityTenantpriceEx(request *UpdateEquityTenantpriceRequest, runtime *util.RuntimeOptions) (_result *UpdateEquityTenantpriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateEquityTenantpriceResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.tenantprice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryImage(request *QueryImageRequest) (_result *QueryImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryImageResponse{}
	_body, _err := client.QueryImageEx(request, runtime)
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
func (client *Client) QueryImageEx(request *QueryImageRequest, runtime *util.RuntimeOptions) (_result *QueryImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImageResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) OfflineEquity(request *OfflineEquityRequest) (_result *OfflineEquityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &OfflineEquityResponse{}
	_body, _err := client.OfflineEquityEx(request, runtime)
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
func (client *Client) OfflineEquityEx(request *OfflineEquityRequest, runtime *util.RuntimeOptions) (_result *OfflineEquityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineEquityResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.equity.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendExchangeAftersale(request *SendExchangeAftersaleRequest) (_result *SendExchangeAftersaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendExchangeAftersaleResponse{}
	_body, _err := client.SendExchangeAftersaleEx(request, runtime)
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
func (client *Client) SendExchangeAftersaleEx(request *SendExchangeAftersaleRequest, runtime *util.RuntimeOptions) (_result *SendExchangeAftersaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendExchangeAftersaleResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.aftersale.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户发起兑换
 * Summary: 数字商品服务-商品服务-商户发起兑换
 */
func (client *Client) ExecExchangeBymerchant(request *ExecExchangeBymerchantRequest) (_result *ExecExchangeBymerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeBymerchantResponse{}
	_body, _err := client.ExecExchangeBymerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户发起兑换
 * Summary: 数字商品服务-商品服务-商户发起兑换
 */
func (client *Client) ExecExchangeBymerchantEx(request *ExecExchangeBymerchantRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeBymerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeBymerchantResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.bymerchant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UploadImage(request *UploadImageRequest) (_result *UploadImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadImageResponse{}
	_body, _err := client.UploadImageEx(request, runtime)
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
func (client *Client) UploadImageEx(request *UploadImageRequest, runtime *util.RuntimeOptions) (_result *UploadImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadImageResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.image.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 缺货回执
 * Summary: 数字商品服务-兑换服务-缺货回执
 */
func (client *Client) ExecExchangeOutofstore(request *ExecExchangeOutofstoreRequest) (_result *ExecExchangeOutofstoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeOutofstoreResponse{}
	_body, _err := client.ExecExchangeOutofstoreEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 缺货回执
 * Summary: 数字商品服务-兑换服务-缺货回执
 */
func (client *Client) ExecExchangeOutofstoreEx(request *ExecExchangeOutofstoreRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeOutofstoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeOutofstoreResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.outofstore.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户确认收货
 * Summary: 数字商品服务-兑换服务-商户确认收货
 */
func (client *Client) ExecExchangeReceivebymerchant(request *ExecExchangeReceivebymerchantRequest) (_result *ExecExchangeReceivebymerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeReceivebymerchantResponse{}
	_body, _err := client.ExecExchangeReceivebymerchantEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户确认收货
 * Summary: 数字商品服务-兑换服务-商户确认收货
 */
func (client *Client) ExecExchangeReceivebymerchantEx(request *ExecExchangeReceivebymerchantRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeReceivebymerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeReceivebymerchantResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.receivebymerchant.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户确认收货
 * Summary: 数字商品服务-兑换服务-用户确认收货
 */
func (client *Client) ExecExchangeReceivebyuser(request *ExecExchangeReceivebyuserRequest) (_result *ExecExchangeReceivebyuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecExchangeReceivebyuserResponse{}
	_body, _err := client.ExecExchangeReceivebyuserEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户确认收货
 * Summary: 数字商品服务-兑换服务-用户确认收货
 */
func (client *Client) ExecExchangeReceivebyuserEx(request *ExecExchangeReceivebyuserRequest, runtime *util.RuntimeOptions) (_result *ExecExchangeReceivebyuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecExchangeReceivebyuserResponse{}
	_body, _err := client.DoRequest(tea.String("baas.antdao.exchange.receivebyuser.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
