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

// 承运人责任险保险标的信息
type InsureCarrierObjectInfo struct {
	// 厂牌型号
	CpModel *string `json:"cp_model,omitempty" xml:"cp_model,omitempty"`
	// 车架号
	FrameNo *string `json:"frame_no,omitempty" xml:"frame_no,omitempty"`
	// 车牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty"`
	// 吨位
	TonNage *string `json:"ton_nage,omitempty" xml:"ton_nage,omitempty"`
	// 行驶证车主
	DrivPer *string `json:"driv_per,omitempty" xml:"driv_per,omitempty"`
	// 运营证号
	RunNo *string `json:"run_no,omitempty" xml:"run_no,omitempty"`
	// 运输货物
	TsCarGo *string `json:"ts_car_go,omitempty" xml:"ts_car_go,omitempty"`
}

func (s InsureCarrierObjectInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureCarrierObjectInfo) GoString() string {
	return s.String()
}

func (s *InsureCarrierObjectInfo) SetCpModel(v string) *InsureCarrierObjectInfo {
	s.CpModel = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetFrameNo(v string) *InsureCarrierObjectInfo {
	s.FrameNo = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetLicenseNo(v string) *InsureCarrierObjectInfo {
	s.LicenseNo = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetTonNage(v string) *InsureCarrierObjectInfo {
	s.TonNage = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetDrivPer(v string) *InsureCarrierObjectInfo {
	s.DrivPer = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetRunNo(v string) *InsureCarrierObjectInfo {
	s.RunNo = &v
	return s
}

func (s *InsureCarrierObjectInfo) SetTsCarGo(v string) *InsureCarrierObjectInfo {
	s.TsCarGo = &v
	return s
}

// 货主支付方式
type PayAmount struct {
	// 支付金额（2位小数）
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 支付方式
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty"`
}

func (s PayAmount) String() string {
	return tea.Prettify(s)
}

func (s PayAmount) GoString() string {
	return s.String()
}

func (s *PayAmount) SetAmount(v string) *PayAmount {
	s.Amount = &v
	return s
}

func (s *PayAmount) SetPayType(v string) *PayAmount {
	s.PayType = &v
	return s
}

// 提单货物数据
type MasterBlGoodsDto struct {
	// 唛头
	Marks *string `json:"marks,omitempty" xml:"marks,omitempty"`
	// 货物
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 货物类型
	GoodsType *string `json:"goods_type,omitempty" xml:"goods_type,omitempty"`
	// 包装类型
	PackageType *string `json:"package_type,omitempty" xml:"package_type,omitempty"`
	// 委托件数
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 委托重量
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
	// 委托体积
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
}

func (s MasterBlGoodsDto) String() string {
	return tea.Prettify(s)
}

func (s MasterBlGoodsDto) GoString() string {
	return s.String()
}

func (s *MasterBlGoodsDto) SetMarks(v string) *MasterBlGoodsDto {
	s.Marks = &v
	return s
}

func (s *MasterBlGoodsDto) SetGoods(v string) *MasterBlGoodsDto {
	s.Goods = &v
	return s
}

func (s *MasterBlGoodsDto) SetGoodsType(v string) *MasterBlGoodsDto {
	s.GoodsType = &v
	return s
}

func (s *MasterBlGoodsDto) SetPackageType(v string) *MasterBlGoodsDto {
	s.PackageType = &v
	return s
}

func (s *MasterBlGoodsDto) SetNumber(v string) *MasterBlGoodsDto {
	s.Number = &v
	return s
}

func (s *MasterBlGoodsDto) SetWeight(v string) *MasterBlGoodsDto {
	s.Weight = &v
	return s
}

func (s *MasterBlGoodsDto) SetVolume(v string) *MasterBlGoodsDto {
	s.Volume = &v
	return s
}

// 电子提单批次下提单明细（无效）
type EblDeatil struct {
	// 电子提单copy文件hash
	EblCopyPdfFileHash *string `json:"ebl_copy_pdf_file_hash,omitempty" xml:"ebl_copy_pdf_file_hash,omitempty"`
	// 电子提单copy文件id
	EblCopyPdfFileId *string `json:"ebl_copy_pdf_file_id,omitempty" xml:"ebl_copy_pdf_file_id,omitempty"`
	// 电子提单编号
	EblNo *string `json:"ebl_no,omitempty" xml:"ebl_no,omitempty"`
}

func (s EblDeatil) String() string {
	return tea.Prettify(s)
}

func (s EblDeatil) GoString() string {
	return s.String()
}

func (s *EblDeatil) SetEblCopyPdfFileHash(v string) *EblDeatil {
	s.EblCopyPdfFileHash = &v
	return s
}

func (s *EblDeatil) SetEblCopyPdfFileId(v string) *EblDeatil {
	s.EblCopyPdfFileId = &v
	return s
}

func (s *EblDeatil) SetEblNo(v string) *EblDeatil {
	s.EblNo = &v
	return s
}

// 资费项发票
type ReceiptTariffInvoiceParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 发票金额 业务必填
	InvoiceAmount *string `json:"invoice_amount,omitempty" xml:"invoice_amount,omitempty"`
	// 资费项金额 业务必填
	ReceiptTariffAmount *string `json:"receipt_tariff_amount,omitempty" xml:"receipt_tariff_amount,omitempty"`
	// 资费单据编号 业务必填
	ReceiptTariffCode *string `json:"receipt_tariff_code,omitempty" xml:"receipt_tariff_code,omitempty"`
	// 资费项发票code
	ReceiptTariffInvoiceCode *string `json:"receipt_tariff_invoice_code,omitempty" xml:"receipt_tariff_invoice_code,omitempty"`
}

func (s ReceiptTariffInvoiceParam) String() string {
	return tea.Prettify(s)
}

func (s ReceiptTariffInvoiceParam) GoString() string {
	return s.String()
}

func (s *ReceiptTariffInvoiceParam) SetAction(v string) *ReceiptTariffInvoiceParam {
	s.Action = &v
	return s
}

func (s *ReceiptTariffInvoiceParam) SetInvoiceAmount(v string) *ReceiptTariffInvoiceParam {
	s.InvoiceAmount = &v
	return s
}

func (s *ReceiptTariffInvoiceParam) SetReceiptTariffAmount(v string) *ReceiptTariffInvoiceParam {
	s.ReceiptTariffAmount = &v
	return s
}

func (s *ReceiptTariffInvoiceParam) SetReceiptTariffCode(v string) *ReceiptTariffInvoiceParam {
	s.ReceiptTariffCode = &v
	return s
}

func (s *ReceiptTariffInvoiceParam) SetReceiptTariffInvoiceCode(v string) *ReceiptTariffInvoiceParam {
	s.ReceiptTariffInvoiceCode = &v
	return s
}

// 集装箱列表
type HouseBlContainerParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 集装箱ID
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 箱号
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
}

func (s HouseBlContainerParam) String() string {
	return tea.Prettify(s)
}

func (s HouseBlContainerParam) GoString() string {
	return s.String()
}

func (s *HouseBlContainerParam) SetAction(v string) *HouseBlContainerParam {
	s.Action = &v
	return s
}

func (s *HouseBlContainerParam) SetContainerId(v string) *HouseBlContainerParam {
	s.ContainerId = &v
	return s
}

func (s *HouseBlContainerParam) SetContainerNo(v string) *HouseBlContainerParam {
	s.ContainerNo = &v
	return s
}

// 订舱单
type MasterBlBookingParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
}

func (s MasterBlBookingParam) String() string {
	return tea.Prettify(s)
}

func (s MasterBlBookingParam) GoString() string {
	return s.String()
}

func (s *MasterBlBookingParam) SetAction(v string) *MasterBlBookingParam {
	s.Action = &v
	return s
}

func (s *MasterBlBookingParam) SetBookingNo(v string) *MasterBlBookingParam {
	s.BookingNo = &v
	return s
}

// 上传booking信息
type UploadOrderBooking struct {
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 集装箱号  json字符串上传
	ContainerNos *string `json:"container_nos,omitempty" xml:"container_nos,omitempty"`
}

func (s UploadOrderBooking) String() string {
	return tea.Prettify(s)
}

func (s UploadOrderBooking) GoString() string {
	return s.String()
}

func (s *UploadOrderBooking) SetBookingNo(v string) *UploadOrderBooking {
	s.BookingNo = &v
	return s
}

func (s *UploadOrderBooking) SetContainerNos(v string) *UploadOrderBooking {
	s.ContainerNos = &v
	return s
}

// 轨迹核验结果
type TrackCheckResult struct {
	// 轨迹核验状态code
	TrackCheckStatus *string `json:"track_check_status,omitempty" xml:"track_check_status,omitempty"`
	// 轨迹核验结果描述
	TrackCheckStatusMsg *string `json:"track_check_status_msg,omitempty" xml:"track_check_status_msg,omitempty"`
}

func (s TrackCheckResult) String() string {
	return tea.Prettify(s)
}

func (s TrackCheckResult) GoString() string {
	return s.String()
}

func (s *TrackCheckResult) SetTrackCheckStatus(v string) *TrackCheckResult {
	s.TrackCheckStatus = &v
	return s
}

func (s *TrackCheckResult) SetTrackCheckStatusMsg(v string) *TrackCheckResult {
	s.TrackCheckStatusMsg = &v
	return s
}

// 资费项账单
type PayBillTariffParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 账单金额 业务必填
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 应付账单、应付资费项 多对多code
	PayBillTariffCode *string `json:"pay_bill_tariff_code,omitempty" xml:"pay_bill_tariff_code,omitempty"`
	//  资费项金额 业务必填
	PayTariffAmount *string `json:"pay_tariff_amount,omitempty" xml:"pay_tariff_amount,omitempty"`
	// 应付资费项编号 业务必填
	PayTariffCode *string `json:"pay_tariff_code,omitempty" xml:"pay_tariff_code,omitempty"`
}

func (s PayBillTariffParam) String() string {
	return tea.Prettify(s)
}

func (s PayBillTariffParam) GoString() string {
	return s.String()
}

func (s *PayBillTariffParam) SetAction(v string) *PayBillTariffParam {
	s.Action = &v
	return s
}

func (s *PayBillTariffParam) SetBillAmount(v string) *PayBillTariffParam {
	s.BillAmount = &v
	return s
}

func (s *PayBillTariffParam) SetPayBillTariffCode(v string) *PayBillTariffParam {
	s.PayBillTariffCode = &v
	return s
}

func (s *PayBillTariffParam) SetPayTariffAmount(v string) *PayBillTariffParam {
	s.PayTariffAmount = &v
	return s
}

func (s *PayBillTariffParam) SetPayTariffCode(v string) *PayBillTariffParam {
	s.PayTariffCode = &v
	return s
}

// 箱子信息
type VehicleContainerParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 集装箱ID
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 箱号
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
	// 封号
	SealNo *string `json:"seal_no,omitempty" xml:"seal_no,omitempty"`
}

func (s VehicleContainerParam) String() string {
	return tea.Prettify(s)
}

func (s VehicleContainerParam) GoString() string {
	return s.String()
}

func (s *VehicleContainerParam) SetAction(v string) *VehicleContainerParam {
	s.Action = &v
	return s
}

func (s *VehicleContainerParam) SetContainerId(v string) *VehicleContainerParam {
	s.ContainerId = &v
	return s
}

func (s *VehicleContainerParam) SetContainerNo(v string) *VehicleContainerParam {
	s.ContainerNo = &v
	return s
}

func (s *VehicleContainerParam) SetSealNo(v string) *VehicleContainerParam {
	s.SealNo = &v
	return s
}

// 包含文件id、文件hash信息
type UploadFileInfo struct {
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件hash
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
}

func (s UploadFileInfo) String() string {
	return tea.Prettify(s)
}

func (s UploadFileInfo) GoString() string {
	return s.String()
}

func (s *UploadFileInfo) SetFileId(v string) *UploadFileInfo {
	s.FileId = &v
	return s
}

func (s *UploadFileInfo) SetFileHash(v string) *UploadFileInfo {
	s.FileHash = &v
	return s
}

// 货物
type ContainerGoodsParam struct {
	// 预计备货时间
	CargoReadyDate *int64 `json:"cargo_ready_date,omitempty" xml:"cargo_ready_date,omitempty"`
	// 危险品页号
	DgPageNo *string `json:"dg_page_no,omitempty" xml:"dg_page_no,omitempty"`
	// 危险品级别
	DgType *string `json:"dg_type,omitempty" xml:"dg_type,omitempty"`
	// 危险品闪点
	FlashPoint *string `json:"flash_point,omitempty" xml:"flash_point,omitempty"`
	// 货物
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 货物中文名
	GoodsCn *string `json:"goods_cn,omitempty" xml:"goods_cn,omitempty"`
	// 货物类型 业务必填
	GoodsType *string `json:"goods_type,omitempty" xml:"goods_type,omitempty"`
	// HS CODE
	HsCodes []*string `json:"hs_codes,omitempty" xml:"hs_codes,omitempty" type:"Repeated"`
	// 唛头
	Marks *string `json:"marks,omitempty" xml:"marks,omitempty"`
	// 件数 业务必填
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 包装类型
	PackageType *string `json:"package_type,omitempty" xml:"package_type,omitempty"`
	// 实际件数
	RealNumber *string `json:"real_number,omitempty" xml:"real_number,omitempty"`
	// 实际体积
	RealVolume *string `json:"real_volume,omitempty" xml:"real_volume,omitempty"`
	// 实际重量
	RealWeight *string `json:"real_weight,omitempty" xml:"real_weight,omitempty"`
	// 危险品联合国编号
	UnNo *string `json:"un_no,omitempty" xml:"un_no,omitempty"`
	// 体积 业务必填
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
	// 毛重 业务必填
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s ContainerGoodsParam) String() string {
	return tea.Prettify(s)
}

func (s ContainerGoodsParam) GoString() string {
	return s.String()
}

func (s *ContainerGoodsParam) SetCargoReadyDate(v int64) *ContainerGoodsParam {
	s.CargoReadyDate = &v
	return s
}

func (s *ContainerGoodsParam) SetDgPageNo(v string) *ContainerGoodsParam {
	s.DgPageNo = &v
	return s
}

func (s *ContainerGoodsParam) SetDgType(v string) *ContainerGoodsParam {
	s.DgType = &v
	return s
}

func (s *ContainerGoodsParam) SetFlashPoint(v string) *ContainerGoodsParam {
	s.FlashPoint = &v
	return s
}

func (s *ContainerGoodsParam) SetGoods(v string) *ContainerGoodsParam {
	s.Goods = &v
	return s
}

func (s *ContainerGoodsParam) SetGoodsCn(v string) *ContainerGoodsParam {
	s.GoodsCn = &v
	return s
}

func (s *ContainerGoodsParam) SetGoodsType(v string) *ContainerGoodsParam {
	s.GoodsType = &v
	return s
}

func (s *ContainerGoodsParam) SetHsCodes(v []*string) *ContainerGoodsParam {
	s.HsCodes = v
	return s
}

func (s *ContainerGoodsParam) SetMarks(v string) *ContainerGoodsParam {
	s.Marks = &v
	return s
}

func (s *ContainerGoodsParam) SetNumber(v string) *ContainerGoodsParam {
	s.Number = &v
	return s
}

func (s *ContainerGoodsParam) SetPackageType(v string) *ContainerGoodsParam {
	s.PackageType = &v
	return s
}

func (s *ContainerGoodsParam) SetRealNumber(v string) *ContainerGoodsParam {
	s.RealNumber = &v
	return s
}

func (s *ContainerGoodsParam) SetRealVolume(v string) *ContainerGoodsParam {
	s.RealVolume = &v
	return s
}

func (s *ContainerGoodsParam) SetRealWeight(v string) *ContainerGoodsParam {
	s.RealWeight = &v
	return s
}

func (s *ContainerGoodsParam) SetUnNo(v string) *ContainerGoodsParam {
	s.UnNo = &v
	return s
}

func (s *ContainerGoodsParam) SetVolume(v string) *ContainerGoodsParam {
	s.Volume = &v
	return s
}

func (s *ContainerGoodsParam) SetWeight(v string) *ContainerGoodsParam {
	s.Weight = &v
	return s
}

// 物流金融信用流转流水信息
type StatementInfo struct {
	// 信用流转批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 全局唯一业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 信用流转凭证
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 合同号（预留）
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 发行信用流转的运单号
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
	// 发行信用流转的支付单号
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 金额信息
	CreditLimit *string `json:"credit_limit,omitempty" xml:"credit_limit,omitempty"`
	// 流水类型
	StateType *string `json:"state_type,omitempty" xml:"state_type,omitempty"`
	// 流水类型说明
	StateMsg *string `json:"state_msg,omitempty" xml:"state_msg,omitempty"`
	// 凭证来源方did
	FromDid *string `json:"from_did,omitempty" xml:"from_did,omitempty"`
	// 凭证流转方did
	ToDid *string `json:"to_did,omitempty" xml:"to_did,omitempty"`
	// 信用凭证发起时间
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 信用凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
}

func (s StatementInfo) String() string {
	return tea.Prettify(s)
}

func (s StatementInfo) GoString() string {
	return s.String()
}

func (s *StatementInfo) SetBatchId(v string) *StatementInfo {
	s.BatchId = &v
	return s
}

func (s *StatementInfo) SetOutBizNo(v string) *StatementInfo {
	s.OutBizNo = &v
	return s
}

func (s *StatementInfo) SetIssueId(v string) *StatementInfo {
	s.IssueId = &v
	return s
}

func (s *StatementInfo) SetContractId(v string) *StatementInfo {
	s.ContractId = &v
	return s
}

func (s *StatementInfo) SetWaybillId(v string) *StatementInfo {
	s.WaybillId = &v
	return s
}

func (s *StatementInfo) SetPayOrder(v string) *StatementInfo {
	s.PayOrder = &v
	return s
}

func (s *StatementInfo) SetCreditLimit(v string) *StatementInfo {
	s.CreditLimit = &v
	return s
}

func (s *StatementInfo) SetStateType(v string) *StatementInfo {
	s.StateType = &v
	return s
}

func (s *StatementInfo) SetStateMsg(v string) *StatementInfo {
	s.StateMsg = &v
	return s
}

func (s *StatementInfo) SetFromDid(v string) *StatementInfo {
	s.FromDid = &v
	return s
}

func (s *StatementInfo) SetToDid(v string) *StatementInfo {
	s.ToDid = &v
	return s
}

func (s *StatementInfo) SetIssueDate(v string) *StatementInfo {
	s.IssueDate = &v
	return s
}

func (s *StatementInfo) SetExpireDate(v string) *StatementInfo {
	s.ExpireDate = &v
	return s
}

// 订舱单号
type CustomsOrderBookingParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
}

func (s CustomsOrderBookingParam) String() string {
	return tea.Prettify(s)
}

func (s CustomsOrderBookingParam) GoString() string {
	return s.String()
}

func (s *CustomsOrderBookingParam) SetAction(v string) *CustomsOrderBookingParam {
	s.Action = &v
	return s
}

func (s *CustomsOrderBookingParam) SetBookingNo(v string) *CustomsOrderBookingParam {
	s.BookingNo = &v
	return s
}

// 信用凭证数据集合
type IssueTransferData struct {
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 转出方did
	PayerDid *string `json:"payer_did,omitempty" xml:"payer_did,omitempty"`
	// 接收方did
	RcvDid *string `json:"rcv_did,omitempty" xml:"rcv_did,omitempty"`
}

func (s IssueTransferData) String() string {
	return tea.Prettify(s)
}

func (s IssueTransferData) GoString() string {
	return s.String()
}

func (s *IssueTransferData) SetIssueId(v string) *IssueTransferData {
	s.IssueId = &v
	return s
}

func (s *IssueTransferData) SetPayerDid(v string) *IssueTransferData {
	s.PayerDid = &v
	return s
}

func (s *IssueTransferData) SetRcvDid(v string) *IssueTransferData {
	s.RcvDid = &v
	return s
}

// 电子提单变更状态明细
type EblStatusDetail struct {
	// 当前提单状态
	CurrentEblStatus *string `json:"current_ebl_status,omitempty" xml:"current_ebl_status,omitempty"`
	// 电子提单编号
	EblNo *string `json:"ebl_no,omitempty" xml:"ebl_no,omitempty"`
	// 下一个提单状态
	NextEblStatus *string `json:"next_ebl_status,omitempty" xml:"next_ebl_status,omitempty"`
}

func (s EblStatusDetail) String() string {
	return tea.Prettify(s)
}

func (s EblStatusDetail) GoString() string {
	return s.String()
}

func (s *EblStatusDetail) SetCurrentEblStatus(v string) *EblStatusDetail {
	s.CurrentEblStatus = &v
	return s
}

func (s *EblStatusDetail) SetEblNo(v string) *EblStatusDetail {
	s.EblNo = &v
	return s
}

func (s *EblStatusDetail) SetNextEblStatus(v string) *EblStatusDetail {
	s.NextEblStatus = &v
	return s
}

// FinishWaybillOrderReq
type FinishWaybillOrderReq struct {
	// 运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 货主支付运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 运费增项
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 运费扣减
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单id
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s FinishWaybillOrderReq) String() string {
	return tea.Prettify(s)
}

func (s FinishWaybillOrderReq) GoString() string {
	return s.String()
}

func (s *FinishWaybillOrderReq) SetAllFreight(v string) *FinishWaybillOrderReq {
	s.AllFreight = &v
	return s
}

func (s *FinishWaybillOrderReq) SetBackFee(v string) *FinishWaybillOrderReq {
	s.BackFee = &v
	return s
}

func (s *FinishWaybillOrderReq) SetConsignorFreightAmount(v string) *FinishWaybillOrderReq {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *FinishWaybillOrderReq) SetFreightIncr(v string) *FinishWaybillOrderReq {
	s.FreightIncr = &v
	return s
}

func (s *FinishWaybillOrderReq) SetLossFee(v string) *FinishWaybillOrderReq {
	s.LossFee = &v
	return s
}

func (s *FinishWaybillOrderReq) SetPlatformDid(v string) *FinishWaybillOrderReq {
	s.PlatformDid = &v
	return s
}

func (s *FinishWaybillOrderReq) SetTaxWaybillId(v string) *FinishWaybillOrderReq {
	s.TaxWaybillId = &v
	return s
}

// 凭证id发行信息
type IssueIdInfo struct {
	// 信用流转凭证
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 全局唯一业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 合同号（预留）
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 发行信用流转的运单号
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
	// 支付订单
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 凭证金额
	TicketAmt *string `json:"ticket_amt,omitempty" xml:"ticket_amt,omitempty"`
	// 信用凭证发起时间
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 信用凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 失败原因信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
}

func (s IssueIdInfo) String() string {
	return tea.Prettify(s)
}

func (s IssueIdInfo) GoString() string {
	return s.String()
}

func (s *IssueIdInfo) SetIssueId(v string) *IssueIdInfo {
	s.IssueId = &v
	return s
}

func (s *IssueIdInfo) SetOutBizNo(v string) *IssueIdInfo {
	s.OutBizNo = &v
	return s
}

func (s *IssueIdInfo) SetContractId(v string) *IssueIdInfo {
	s.ContractId = &v
	return s
}

func (s *IssueIdInfo) SetWaybillId(v string) *IssueIdInfo {
	s.WaybillId = &v
	return s
}

func (s *IssueIdInfo) SetPayOrder(v string) *IssueIdInfo {
	s.PayOrder = &v
	return s
}

func (s *IssueIdInfo) SetTicketAmt(v string) *IssueIdInfo {
	s.TicketAmt = &v
	return s
}

func (s *IssueIdInfo) SetIssueDate(v string) *IssueIdInfo {
	s.IssueDate = &v
	return s
}

func (s *IssueIdInfo) SetExpireDate(v string) *IssueIdInfo {
	s.ExpireDate = &v
	return s
}

func (s *IssueIdInfo) SetStatus(v int64) *IssueIdInfo {
	s.Status = &v
	return s
}

func (s *IssueIdInfo) SetErrMsg(v string) *IssueIdInfo {
	s.ErrMsg = &v
	return s
}

// 运单号-司机运费
type WaybillAmount struct {
	// 运单金额（2位小数）
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 运单号
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
}

func (s WaybillAmount) String() string {
	return tea.Prettify(s)
}

func (s WaybillAmount) GoString() string {
	return s.String()
}

func (s *WaybillAmount) SetAmount(v string) *WaybillAmount {
	s.Amount = &v
	return s
}

func (s *WaybillAmount) SetWaybillId(v string) *WaybillAmount {
	s.WaybillId = &v
	return s
}

// so通知关联的订舱单
type SoNotifyBookingParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 船公司  业务必填
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 箱型箱量 json格式 业务必填
	// [{"containerVolume":"33","containerType":"22"}]
	// containerVolume--箱量 业务必填
	// containerType--箱型 业务必填
	ContainerParams *string `json:"container_params,omitempty" xml:"container_params,omitempty"`
	// 截关时间
	CustomsClearance *int64 `json:"customs_clearance,omitempty" xml:"customs_clearance,omitempty"`
	// 场站
	Cy *string `json:"cy,omitempty" xml:"cy,omitempty"`
	// 截港时间
	CyClosing *int64 `json:"cy_closing,omitempty" xml:"cy_closing,omitempty"`
	// 预计船期
	Etd *int64 `json:"etd,omitempty" xml:"etd,omitempty"`
	// 港口
	Port *string `json:"port,omitempty" xml:"port,omitempty"`
	// 截单时间
	SiClosing *int64 `json:"si_closing,omitempty" xml:"si_closing,omitempty"`
	// 船名  业务必填
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次 业务必填
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s SoNotifyBookingParam) String() string {
	return tea.Prettify(s)
}

func (s SoNotifyBookingParam) GoString() string {
	return s.String()
}

func (s *SoNotifyBookingParam) SetAction(v string) *SoNotifyBookingParam {
	s.Action = &v
	return s
}

func (s *SoNotifyBookingParam) SetBookingNo(v string) *SoNotifyBookingParam {
	s.BookingNo = &v
	return s
}

func (s *SoNotifyBookingParam) SetCarrier(v string) *SoNotifyBookingParam {
	s.Carrier = &v
	return s
}

func (s *SoNotifyBookingParam) SetContainerParams(v string) *SoNotifyBookingParam {
	s.ContainerParams = &v
	return s
}

func (s *SoNotifyBookingParam) SetCustomsClearance(v int64) *SoNotifyBookingParam {
	s.CustomsClearance = &v
	return s
}

func (s *SoNotifyBookingParam) SetCy(v string) *SoNotifyBookingParam {
	s.Cy = &v
	return s
}

func (s *SoNotifyBookingParam) SetCyClosing(v int64) *SoNotifyBookingParam {
	s.CyClosing = &v
	return s
}

func (s *SoNotifyBookingParam) SetEtd(v int64) *SoNotifyBookingParam {
	s.Etd = &v
	return s
}

func (s *SoNotifyBookingParam) SetPort(v string) *SoNotifyBookingParam {
	s.Port = &v
	return s
}

func (s *SoNotifyBookingParam) SetSiClosing(v int64) *SoNotifyBookingParam {
	s.SiClosing = &v
	return s
}

func (s *SoNotifyBookingParam) SetVessel(v string) *SoNotifyBookingParam {
	s.Vessel = &v
	return s
}

func (s *SoNotifyBookingParam) SetVoyage(v string) *SoNotifyBookingParam {
	s.Voyage = &v
	return s
}

// 电子回单查询凭证数据
type ScpTicketIssueDataParam struct {
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 凭证对应的司机/货主的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s ScpTicketIssueDataParam) String() string {
	return tea.Prettify(s)
}

func (s ScpTicketIssueDataParam) GoString() string {
	return s.String()
}

func (s *ScpTicketIssueDataParam) SetIssueId(v string) *ScpTicketIssueDataParam {
	s.IssueId = &v
	return s
}

func (s *ScpTicketIssueDataParam) SetDid(v string) *ScpTicketIssueDataParam {
	s.Did = &v
	return s
}

// saas模式发行信息
type SaasIssueApplyInfo struct {
	// 货源订单
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 合同号
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 全局唯一业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付单号
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 运单号
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
	// 司机did
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 发行费
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 到期时间戳
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
}

func (s SaasIssueApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s SaasIssueApplyInfo) GoString() string {
	return s.String()
}

func (s *SaasIssueApplyInfo) SetCargoOrder(v string) *SaasIssueApplyInfo {
	s.CargoOrder = &v
	return s
}

func (s *SaasIssueApplyInfo) SetContractId(v string) *SaasIssueApplyInfo {
	s.ContractId = &v
	return s
}

func (s *SaasIssueApplyInfo) SetOutBizNo(v string) *SaasIssueApplyInfo {
	s.OutBizNo = &v
	return s
}

func (s *SaasIssueApplyInfo) SetPayOrder(v string) *SaasIssueApplyInfo {
	s.PayOrder = &v
	return s
}

func (s *SaasIssueApplyInfo) SetWaybillId(v string) *SaasIssueApplyInfo {
	s.WaybillId = &v
	return s
}

func (s *SaasIssueApplyInfo) SetDriverDid(v string) *SaasIssueApplyInfo {
	s.DriverDid = &v
	return s
}

func (s *SaasIssueApplyInfo) SetFreight(v string) *SaasIssueApplyInfo {
	s.Freight = &v
	return s
}

func (s *SaasIssueApplyInfo) SetExpireDate(v string) *SaasIssueApplyInfo {
	s.ExpireDate = &v
	return s
}

// 资费项账单
type ReceiptBillTariffParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	//  账单金额 业务必填
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 应收账单 、应收资费项 多对多关联code
	ReceiptBillTariffCode *string `json:"receipt_bill_tariff_code,omitempty" xml:"receipt_bill_tariff_code,omitempty"`
	// 资费项金额 业务必填
	ReceiptTariffAmount *string `json:"receipt_tariff_amount,omitempty" xml:"receipt_tariff_amount,omitempty"`
	// 应收资费项编号 业务必填
	ReceiptTariffCode *string `json:"receipt_tariff_code,omitempty" xml:"receipt_tariff_code,omitempty"`
}

func (s ReceiptBillTariffParam) String() string {
	return tea.Prettify(s)
}

func (s ReceiptBillTariffParam) GoString() string {
	return s.String()
}

func (s *ReceiptBillTariffParam) SetAction(v string) *ReceiptBillTariffParam {
	s.Action = &v
	return s
}

func (s *ReceiptBillTariffParam) SetBillAmount(v string) *ReceiptBillTariffParam {
	s.BillAmount = &v
	return s
}

func (s *ReceiptBillTariffParam) SetReceiptBillTariffCode(v string) *ReceiptBillTariffParam {
	s.ReceiptBillTariffCode = &v
	return s
}

func (s *ReceiptBillTariffParam) SetReceiptTariffAmount(v string) *ReceiptBillTariffParam {
	s.ReceiptTariffAmount = &v
	return s
}

func (s *ReceiptBillTariffParam) SetReceiptTariffCode(v string) *ReceiptBillTariffParam {
	s.ReceiptTariffCode = &v
	return s
}

// 凭证开立申请信息
type IssueApplyInfo struct {
	// 货源订单
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 合同号（预留）
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 支付单运费，运费最多精确到小数点后2位
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 全局唯一业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付订单
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 运单id
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
	// 司机did
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
}

func (s IssueApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s IssueApplyInfo) GoString() string {
	return s.String()
}

func (s *IssueApplyInfo) SetCargoOrder(v string) *IssueApplyInfo {
	s.CargoOrder = &v
	return s
}

func (s *IssueApplyInfo) SetContractId(v string) *IssueApplyInfo {
	s.ContractId = &v
	return s
}

func (s *IssueApplyInfo) SetExpireDate(v string) *IssueApplyInfo {
	s.ExpireDate = &v
	return s
}

func (s *IssueApplyInfo) SetFreight(v string) *IssueApplyInfo {
	s.Freight = &v
	return s
}

func (s *IssueApplyInfo) SetOutBizNo(v string) *IssueApplyInfo {
	s.OutBizNo = &v
	return s
}

func (s *IssueApplyInfo) SetPayOrder(v string) *IssueApplyInfo {
	s.PayOrder = &v
	return s
}

func (s *IssueApplyInfo) SetWaybillId(v string) *IssueApplyInfo {
	s.WaybillId = &v
	return s
}

func (s *IssueApplyInfo) SetDriverDid(v string) *IssueApplyInfo {
	s.DriverDid = &v
	return s
}

// 货源单号-货主运费
type CargoAmount struct {
	// 货运单对应金额（2位小数）
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 货源单号
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
}

func (s CargoAmount) String() string {
	return tea.Prettify(s)
}

func (s CargoAmount) GoString() string {
	return s.String()
}

func (s *CargoAmount) SetAmount(v string) *CargoAmount {
	s.Amount = &v
	return s
}

func (s *CargoAmount) SetCargoOrder(v string) *CargoAmount {
	s.CargoOrder = &v
	return s
}

// 集装箱列表
type MasterBlContainerParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 集装箱ID
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 箱号
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
}

func (s MasterBlContainerParam) String() string {
	return tea.Prettify(s)
}

func (s MasterBlContainerParam) GoString() string {
	return s.String()
}

func (s *MasterBlContainerParam) SetAction(v string) *MasterBlContainerParam {
	s.Action = &v
	return s
}

func (s *MasterBlContainerParam) SetContainerId(v string) *MasterBlContainerParam {
	s.ContainerId = &v
	return s
}

func (s *MasterBlContainerParam) SetContainerNo(v string) *MasterBlContainerParam {
	s.ContainerNo = &v
	return s
}

// 物流轨迹位置
type LogisticLocation struct {
	// 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 行政区划代码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 纬度
	//
	Lat *string `json:"lat,omitempty" xml:"lat,omitempty"`
	// 经度
	Lon *string `json:"lon,omitempty" xml:"lon,omitempty"`
	// 轨迹时间戳
	TrackTime *int64 `json:"track_time,omitempty" xml:"track_time,omitempty"`
}

func (s LogisticLocation) String() string {
	return tea.Prettify(s)
}

func (s LogisticLocation) GoString() string {
	return s.String()
}

func (s *LogisticLocation) SetAddress(v string) *LogisticLocation {
	s.Address = &v
	return s
}

func (s *LogisticLocation) SetCityCode(v string) *LogisticLocation {
	s.CityCode = &v
	return s
}

func (s *LogisticLocation) SetLat(v string) *LogisticLocation {
	s.Lat = &v
	return s
}

func (s *LogisticLocation) SetLon(v string) *LogisticLocation {
	s.Lon = &v
	return s
}

func (s *LogisticLocation) SetTrackTime(v int64) *LogisticLocation {
	s.TrackTime = &v
	return s
}

// 订舱单
type HouseBlBookingParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
}

func (s HouseBlBookingParam) String() string {
	return tea.Prettify(s)
}

func (s HouseBlBookingParam) GoString() string {
	return s.String()
}

func (s *HouseBlBookingParam) SetAction(v string) *HouseBlBookingParam {
	s.Action = &v
	return s
}

func (s *HouseBlBookingParam) SetBookingNo(v string) *HouseBlBookingParam {
	s.BookingNo = &v
	return s
}

// 池融资授信额度信息
type PfCreditQuotaInfo struct {
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 授信到期日期
	CreditEnd *string `json:"credit_end,omitempty" xml:"credit_end,omitempty"`
	// 授信起始日期
	CreditStart *string `json:"credit_start,omitempty" xml:"credit_start,omitempty"`
	// 额度编号
	QuotaNo *string `json:"quota_no,omitempty" xml:"quota_no,omitempty"`
	// 剩余额度
	RemainingQuota *string `json:"remaining_quota,omitempty" xml:"remaining_quota,omitempty"`
	// SON:放款账号loanAccNo
	// 还款账号repayAcctNo
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 额度状态：
	// 0、停用 / 1、启用  /  2、冻结
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 授信额度
	TotalQuota *string `json:"total_quota,omitempty" xml:"total_quota,omitempty"`
	// 数据更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 总质押额度
	TotalPledgeQuota *string `json:"total_pledge_quota,omitempty" xml:"total_pledge_quota,omitempty"`
	// 剩余质押额度
	RemainPledgeQuota *string `json:"remain_pledge_quota,omitempty" xml:"remain_pledge_quota,omitempty"`
}

func (s PfCreditQuotaInfo) String() string {
	return tea.Prettify(s)
}

func (s PfCreditQuotaInfo) GoString() string {
	return s.String()
}

func (s *PfCreditQuotaInfo) SetCertNo(v string) *PfCreditQuotaInfo {
	s.CertNo = &v
	return s
}

func (s *PfCreditQuotaInfo) SetCertType(v string) *PfCreditQuotaInfo {
	s.CertType = &v
	return s
}

func (s *PfCreditQuotaInfo) SetCreditEnd(v string) *PfCreditQuotaInfo {
	s.CreditEnd = &v
	return s
}

func (s *PfCreditQuotaInfo) SetCreditStart(v string) *PfCreditQuotaInfo {
	s.CreditStart = &v
	return s
}

func (s *PfCreditQuotaInfo) SetQuotaNo(v string) *PfCreditQuotaInfo {
	s.QuotaNo = &v
	return s
}

func (s *PfCreditQuotaInfo) SetRemainingQuota(v string) *PfCreditQuotaInfo {
	s.RemainingQuota = &v
	return s
}

func (s *PfCreditQuotaInfo) SetRemark(v string) *PfCreditQuotaInfo {
	s.Remark = &v
	return s
}

func (s *PfCreditQuotaInfo) SetStatus(v string) *PfCreditQuotaInfo {
	s.Status = &v
	return s
}

func (s *PfCreditQuotaInfo) SetTotalQuota(v string) *PfCreditQuotaInfo {
	s.TotalQuota = &v
	return s
}

func (s *PfCreditQuotaInfo) SetUpdateTime(v string) *PfCreditQuotaInfo {
	s.UpdateTime = &v
	return s
}

func (s *PfCreditQuotaInfo) SetTotalPledgeQuota(v string) *PfCreditQuotaInfo {
	s.TotalPledgeQuota = &v
	return s
}

func (s *PfCreditQuotaInfo) SetRemainPledgeQuota(v string) *PfCreditQuotaInfo {
	s.RemainPledgeQuota = &v
	return s
}

// 资费项发票
type PayTariffInvoiceParam struct {
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 发票金额 业务必填
	InvoiceAmount *string `json:"invoice_amount,omitempty" xml:"invoice_amount,omitempty"`
	// 资费项金额 业务必填
	PayTariffAmount *string `json:"pay_tariff_amount,omitempty" xml:"pay_tariff_amount,omitempty"`
	// 资费单据编号 业务必填
	PayTariffCode *string `json:"pay_tariff_code,omitempty" xml:"pay_tariff_code,omitempty"`
	// 资费项发票code
	PayTariffInvoiceCode *string `json:"pay_tariff_invoice_code,omitempty" xml:"pay_tariff_invoice_code,omitempty"`
}

func (s PayTariffInvoiceParam) String() string {
	return tea.Prettify(s)
}

func (s PayTariffInvoiceParam) GoString() string {
	return s.String()
}

func (s *PayTariffInvoiceParam) SetAction(v string) *PayTariffInvoiceParam {
	s.Action = &v
	return s
}

func (s *PayTariffInvoiceParam) SetInvoiceAmount(v string) *PayTariffInvoiceParam {
	s.InvoiceAmount = &v
	return s
}

func (s *PayTariffInvoiceParam) SetPayTariffAmount(v string) *PayTariffInvoiceParam {
	s.PayTariffAmount = &v
	return s
}

func (s *PayTariffInvoiceParam) SetPayTariffCode(v string) *PayTariffInvoiceParam {
	s.PayTariffCode = &v
	return s
}

func (s *PayTariffInvoiceParam) SetPayTariffInvoiceCode(v string) *PayTariffInvoiceParam {
	s.PayTariffInvoiceCode = &v
	return s
}

// 应付账单发票关联项
type PayBillInvoiceParam struct {
	// 账单发票code
	PayBillInvoiceCode *string `json:"pay_bill_invoice_code,omitempty" xml:"pay_bill_invoice_code,omitempty"`
	// 账单编号
	PayBillOrderCode *string `json:"pay_bill_order_code,omitempty" xml:"pay_bill_order_code,omitempty"`
	// 账单金额
	PayBillAmount *string `json:"pay_bill_amount,omitempty" xml:"pay_bill_amount,omitempty"`
	// 发票金额
	InvoiceAmount *string `json:"invoice_amount,omitempty" xml:"invoice_amount,omitempty"`
	// 操作动作
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
}

func (s PayBillInvoiceParam) String() string {
	return tea.Prettify(s)
}

func (s PayBillInvoiceParam) GoString() string {
	return s.String()
}

func (s *PayBillInvoiceParam) SetPayBillInvoiceCode(v string) *PayBillInvoiceParam {
	s.PayBillInvoiceCode = &v
	return s
}

func (s *PayBillInvoiceParam) SetPayBillOrderCode(v string) *PayBillInvoiceParam {
	s.PayBillOrderCode = &v
	return s
}

func (s *PayBillInvoiceParam) SetPayBillAmount(v string) *PayBillInvoiceParam {
	s.PayBillAmount = &v
	return s
}

func (s *PayBillInvoiceParam) SetInvoiceAmount(v string) *PayBillInvoiceParam {
	s.InvoiceAmount = &v
	return s
}

func (s *PayBillInvoiceParam) SetAction(v string) *PayBillInvoiceParam {
	s.Action = &v
	return s
}

// 投保基本信息
type InsureBaseInfo struct {
	// 投保人姓名
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty"`
	// 投保人证件类型
	TbrIdType *string `json:"tbr_id_type,omitempty" xml:"tbr_id_type,omitempty"`
	// 投保人联系电话
	TbrTel *string `json:"tbr_tel,omitempty" xml:"tbr_tel,omitempty"`
	// 投保人地址
	TbrAddr *string `json:"tbr_addr,omitempty" xml:"tbr_addr,omitempty"`
	// 投保人邮箱
	TbrEmail *string `json:"tbr_email,omitempty" xml:"tbr_email,omitempty"`
	// 被保险人姓名
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty"`
	// 被保险人证件类型
	BbrIdType *string `json:"bbr_id_type,omitempty" xml:"bbr_id_type,omitempty"`
	// 被保险人证件号码
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty"`
	// 被保险人联系电话
	BbrTel *string `json:"bbr_tel,omitempty" xml:"bbr_tel,omitempty"`
	// 被保险人地址
	BbrAddr *string `json:"bbr_addr,omitempty" xml:"bbr_addr,omitempty"`
	// 含税保费(元)，小数点两位
	PreMium *string `json:"pre_mium,omitempty" xml:"pre_mium,omitempty"`
	// 保险起期
	EffDate *string `json:"eff_date,omitempty" xml:"eff_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保险止期
	TermDate *string `json:"term_date,omitempty" xml:"term_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 投保人证件类型有效起期
	IdenrifyPeriodStart *string `json:"idenrify_period_start,omitempty" xml:"idenrify_period_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 投保人证件类型有效止期
	IdentifyPeriodEnd *string `json:"identify_period_end,omitempty" xml:"identify_period_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s InsureBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureBaseInfo) GoString() string {
	return s.String()
}

func (s *InsureBaseInfo) SetTbrName(v string) *InsureBaseInfo {
	s.TbrName = &v
	return s
}

func (s *InsureBaseInfo) SetTbrIdNo(v string) *InsureBaseInfo {
	s.TbrIdNo = &v
	return s
}

func (s *InsureBaseInfo) SetTbrIdType(v string) *InsureBaseInfo {
	s.TbrIdType = &v
	return s
}

func (s *InsureBaseInfo) SetTbrTel(v string) *InsureBaseInfo {
	s.TbrTel = &v
	return s
}

func (s *InsureBaseInfo) SetTbrAddr(v string) *InsureBaseInfo {
	s.TbrAddr = &v
	return s
}

func (s *InsureBaseInfo) SetTbrEmail(v string) *InsureBaseInfo {
	s.TbrEmail = &v
	return s
}

func (s *InsureBaseInfo) SetBbrName(v string) *InsureBaseInfo {
	s.BbrName = &v
	return s
}

func (s *InsureBaseInfo) SetBbrIdType(v string) *InsureBaseInfo {
	s.BbrIdType = &v
	return s
}

func (s *InsureBaseInfo) SetBbrIdNo(v string) *InsureBaseInfo {
	s.BbrIdNo = &v
	return s
}

func (s *InsureBaseInfo) SetBbrTel(v string) *InsureBaseInfo {
	s.BbrTel = &v
	return s
}

func (s *InsureBaseInfo) SetBbrAddr(v string) *InsureBaseInfo {
	s.BbrAddr = &v
	return s
}

func (s *InsureBaseInfo) SetPreMium(v string) *InsureBaseInfo {
	s.PreMium = &v
	return s
}

func (s *InsureBaseInfo) SetEffDate(v string) *InsureBaseInfo {
	s.EffDate = &v
	return s
}

func (s *InsureBaseInfo) SetTermDate(v string) *InsureBaseInfo {
	s.TermDate = &v
	return s
}

func (s *InsureBaseInfo) SetIdenrifyPeriodStart(v string) *InsureBaseInfo {
	s.IdenrifyPeriodStart = &v
	return s
}

func (s *InsureBaseInfo) SetIdentifyPeriodEnd(v string) *InsureBaseInfo {
	s.IdentifyPeriodEnd = &v
	return s
}

// 电子回单查询，具体凭证数据
type ScpTicketIssueData struct {
	// 凭证对应的司机/货主的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	//
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
}

func (s ScpTicketIssueData) String() string {
	return tea.Prettify(s)
}

func (s ScpTicketIssueData) GoString() string {
	return s.String()
}

func (s *ScpTicketIssueData) SetDid(v string) *ScpTicketIssueData {
	s.Did = &v
	return s
}

func (s *ScpTicketIssueData) SetIssueId(v string) *ScpTicketIssueData {
	s.IssueId = &v
	return s
}

// 货物列表
type HouseBlGoodsParam struct {
	// 预计备货时间
	CargoReadyDate *int64 `json:"cargo_ready_date,omitempty" xml:"cargo_ready_date,omitempty"`
	// 危险品页号
	DgPageNo *string `json:"dg_page_no,omitempty" xml:"dg_page_no,omitempty"`
	// 危险品级别
	DgType *string `json:"dg_type,omitempty" xml:"dg_type,omitempty"`
	// 危险品闪点
	FlashPoint *string `json:"flash_point,omitempty" xml:"flash_point,omitempty"`
	// 货物名称 业务必填
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 货物中文名
	GoodsCn *string `json:"goods_cn,omitempty" xml:"goods_cn,omitempty"`
	// 货物类型 业务必填
	GoodsType *string `json:"goods_type,omitempty" xml:"goods_type,omitempty"`
	// HS CODE
	HsCodes []*string `json:"hs_codes,omitempty" xml:"hs_codes,omitempty" type:"Repeated"`
	// 唛头
	Marks *string `json:"marks,omitempty" xml:"marks,omitempty"`
	// 件数 业务必填
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 包装类型
	PackageType *string `json:"package_type,omitempty" xml:"package_type,omitempty"`
	// 实际件数
	RealNumber *string `json:"real_number,omitempty" xml:"real_number,omitempty"`
	// 实际体积
	RealVolume *string `json:"real_volume,omitempty" xml:"real_volume,omitempty"`
	// 实际重量
	RealWeight *string `json:"real_weight,omitempty" xml:"real_weight,omitempty"`
	// 危险品联合国编号
	UnNo *string `json:"un_no,omitempty" xml:"un_no,omitempty"`
	// 委托体积 业务必填
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
	// 委托重量 业务必填
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s HouseBlGoodsParam) String() string {
	return tea.Prettify(s)
}

func (s HouseBlGoodsParam) GoString() string {
	return s.String()
}

func (s *HouseBlGoodsParam) SetCargoReadyDate(v int64) *HouseBlGoodsParam {
	s.CargoReadyDate = &v
	return s
}

func (s *HouseBlGoodsParam) SetDgPageNo(v string) *HouseBlGoodsParam {
	s.DgPageNo = &v
	return s
}

func (s *HouseBlGoodsParam) SetDgType(v string) *HouseBlGoodsParam {
	s.DgType = &v
	return s
}

func (s *HouseBlGoodsParam) SetFlashPoint(v string) *HouseBlGoodsParam {
	s.FlashPoint = &v
	return s
}

func (s *HouseBlGoodsParam) SetGoods(v string) *HouseBlGoodsParam {
	s.Goods = &v
	return s
}

func (s *HouseBlGoodsParam) SetGoodsCn(v string) *HouseBlGoodsParam {
	s.GoodsCn = &v
	return s
}

func (s *HouseBlGoodsParam) SetGoodsType(v string) *HouseBlGoodsParam {
	s.GoodsType = &v
	return s
}

func (s *HouseBlGoodsParam) SetHsCodes(v []*string) *HouseBlGoodsParam {
	s.HsCodes = v
	return s
}

func (s *HouseBlGoodsParam) SetMarks(v string) *HouseBlGoodsParam {
	s.Marks = &v
	return s
}

func (s *HouseBlGoodsParam) SetNumber(v string) *HouseBlGoodsParam {
	s.Number = &v
	return s
}

func (s *HouseBlGoodsParam) SetPackageType(v string) *HouseBlGoodsParam {
	s.PackageType = &v
	return s
}

func (s *HouseBlGoodsParam) SetRealNumber(v string) *HouseBlGoodsParam {
	s.RealNumber = &v
	return s
}

func (s *HouseBlGoodsParam) SetRealVolume(v string) *HouseBlGoodsParam {
	s.RealVolume = &v
	return s
}

func (s *HouseBlGoodsParam) SetRealWeight(v string) *HouseBlGoodsParam {
	s.RealWeight = &v
	return s
}

func (s *HouseBlGoodsParam) SetUnNo(v string) *HouseBlGoodsParam {
	s.UnNo = &v
	return s
}

func (s *HouseBlGoodsParam) SetVolume(v string) *HouseBlGoodsParam {
	s.Volume = &v
	return s
}

func (s *HouseBlGoodsParam) SetWeight(v string) *HouseBlGoodsParam {
	s.Weight = &v
	return s
}

// 上传订单总金额
type UploadOrderAmount struct {
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 总金额
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
}

func (s UploadOrderAmount) String() string {
	return tea.Prettify(s)
}

func (s UploadOrderAmount) GoString() string {
	return s.String()
}

func (s *UploadOrderAmount) SetCurrency(v string) *UploadOrderAmount {
	s.Currency = &v
	return s
}

func (s *UploadOrderAmount) SetTotalAmount(v string) *UploadOrderAmount {
	s.TotalAmount = &v
	return s
}

// 电子提单批次下提单明细
type EblDetail struct {
	// 电子提单copy文件hash
	EblCopyPdfFileHash *string `json:"ebl_copy_pdf_file_hash,omitempty" xml:"ebl_copy_pdf_file_hash,omitempty"`
	// 电子提单copy文件id
	EblCopyPdfFileId *string `json:"ebl_copy_pdf_file_id,omitempty" xml:"ebl_copy_pdf_file_id,omitempty"`
	// 电子提单编号
	EblNo *string `json:"ebl_no,omitempty" xml:"ebl_no,omitempty"`
}

func (s EblDetail) String() string {
	return tea.Prettify(s)
}

func (s EblDetail) GoString() string {
	return s.String()
}

func (s *EblDetail) SetEblCopyPdfFileHash(v string) *EblDetail {
	s.EblCopyPdfFileHash = &v
	return s
}

func (s *EblDetail) SetEblCopyPdfFileId(v string) *EblDetail {
	s.EblCopyPdfFileId = &v
	return s
}

func (s *EblDetail) SetEblNo(v string) *EblDetail {
	s.EblNo = &v
	return s
}

// 货物列表
type MasterBlGoodsParam struct {
	// 预计备货时间
	CargoReadyDate *int64 `json:"cargo_ready_date,omitempty" xml:"cargo_ready_date,omitempty"`
	// 危险品页号
	DgPageNo *string `json:"dg_page_no,omitempty" xml:"dg_page_no,omitempty"`
	// 危险品级别
	DgType *string `json:"dg_type,omitempty" xml:"dg_type,omitempty"`
	// 危险品闪点
	FlashPoint *string `json:"flash_point,omitempty" xml:"flash_point,omitempty"`
	// 货物名称 业务必填
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 货物中文名
	GoodsCn *string `json:"goods_cn,omitempty" xml:"goods_cn,omitempty"`
	// 货物类型 业务必填
	GoodsType *string `json:"goods_type,omitempty" xml:"goods_type,omitempty"`
	// 毛重 业务必填
	GrossWeight *string `json:"gross_weight,omitempty" xml:"gross_weight,omitempty"`
	// HS CODE
	HsCodes []*string `json:"hs_codes,omitempty" xml:"hs_codes,omitempty" type:"Repeated"`
	// 唛头
	Marks *string `json:"marks,omitempty" xml:"marks,omitempty"`
	// 件数 业务必填
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 包装类型
	PackageType *string `json:"package_type,omitempty" xml:"package_type,omitempty"`
	// 实际件数
	RealNumber *string `json:"real_number,omitempty" xml:"real_number,omitempty"`
	// 实际体积
	RealVolume *string `json:"real_volume,omitempty" xml:"real_volume,omitempty"`
	// 实际重量
	RealWeight *string `json:"real_weight,omitempty" xml:"real_weight,omitempty"`
	// 危险品联合国编号
	UnNo *string `json:"un_no,omitempty" xml:"un_no,omitempty"`
	// 委托体积 业务必填
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
	// 委托重量 业务必填
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s MasterBlGoodsParam) String() string {
	return tea.Prettify(s)
}

func (s MasterBlGoodsParam) GoString() string {
	return s.String()
}

func (s *MasterBlGoodsParam) SetCargoReadyDate(v int64) *MasterBlGoodsParam {
	s.CargoReadyDate = &v
	return s
}

func (s *MasterBlGoodsParam) SetDgPageNo(v string) *MasterBlGoodsParam {
	s.DgPageNo = &v
	return s
}

func (s *MasterBlGoodsParam) SetDgType(v string) *MasterBlGoodsParam {
	s.DgType = &v
	return s
}

func (s *MasterBlGoodsParam) SetFlashPoint(v string) *MasterBlGoodsParam {
	s.FlashPoint = &v
	return s
}

func (s *MasterBlGoodsParam) SetGoods(v string) *MasterBlGoodsParam {
	s.Goods = &v
	return s
}

func (s *MasterBlGoodsParam) SetGoodsCn(v string) *MasterBlGoodsParam {
	s.GoodsCn = &v
	return s
}

func (s *MasterBlGoodsParam) SetGoodsType(v string) *MasterBlGoodsParam {
	s.GoodsType = &v
	return s
}

func (s *MasterBlGoodsParam) SetGrossWeight(v string) *MasterBlGoodsParam {
	s.GrossWeight = &v
	return s
}

func (s *MasterBlGoodsParam) SetHsCodes(v []*string) *MasterBlGoodsParam {
	s.HsCodes = v
	return s
}

func (s *MasterBlGoodsParam) SetMarks(v string) *MasterBlGoodsParam {
	s.Marks = &v
	return s
}

func (s *MasterBlGoodsParam) SetNumber(v string) *MasterBlGoodsParam {
	s.Number = &v
	return s
}

func (s *MasterBlGoodsParam) SetPackageType(v string) *MasterBlGoodsParam {
	s.PackageType = &v
	return s
}

func (s *MasterBlGoodsParam) SetRealNumber(v string) *MasterBlGoodsParam {
	s.RealNumber = &v
	return s
}

func (s *MasterBlGoodsParam) SetRealVolume(v string) *MasterBlGoodsParam {
	s.RealVolume = &v
	return s
}

func (s *MasterBlGoodsParam) SetRealWeight(v string) *MasterBlGoodsParam {
	s.RealWeight = &v
	return s
}

func (s *MasterBlGoodsParam) SetUnNo(v string) *MasterBlGoodsParam {
	s.UnNo = &v
	return s
}

func (s *MasterBlGoodsParam) SetVolume(v string) *MasterBlGoodsParam {
	s.Volume = &v
	return s
}

func (s *MasterBlGoodsParam) SetWeight(v string) *MasterBlGoodsParam {
	s.Weight = &v
	return s
}

// A+模式发行信息
type IssueApplyInfoPlus struct {
	// 订单中的BookingNo，以英文逗号分割
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 船公司did
	CarrierDid *string `json:"carrier_did,omitempty" xml:"carrier_did,omitempty"`
	// BookingNo中的箱号，以英文逗号分割
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
	// 到期时间戳
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 发行金额，精确到小数点后2位
	IssueAmt *string `json:"issue_amt,omitempty" xml:"issue_amt,omitempty"`
	// 全局唯一业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付单号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty"`
	// 运单订单id
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
}

func (s IssueApplyInfoPlus) String() string {
	return tea.Prettify(s)
}

func (s IssueApplyInfoPlus) GoString() string {
	return s.String()
}

func (s *IssueApplyInfoPlus) SetBookingNo(v string) *IssueApplyInfoPlus {
	s.BookingNo = &v
	return s
}

func (s *IssueApplyInfoPlus) SetCarrierDid(v string) *IssueApplyInfoPlus {
	s.CarrierDid = &v
	return s
}

func (s *IssueApplyInfoPlus) SetContainerNo(v string) *IssueApplyInfoPlus {
	s.ContainerNo = &v
	return s
}

func (s *IssueApplyInfoPlus) SetExpireDate(v string) *IssueApplyInfoPlus {
	s.ExpireDate = &v
	return s
}

func (s *IssueApplyInfoPlus) SetIssueAmt(v string) *IssueApplyInfoPlus {
	s.IssueAmt = &v
	return s
}

func (s *IssueApplyInfoPlus) SetOutBizNo(v string) *IssueApplyInfoPlus {
	s.OutBizNo = &v
	return s
}

func (s *IssueApplyInfoPlus) SetOutOrderNo(v string) *IssueApplyInfoPlus {
	s.OutOrderNo = &v
	return s
}

func (s *IssueApplyInfoPlus) SetWaybillId(v string) *IssueApplyInfoPlus {
	s.WaybillId = &v
	return s
}

// 历史数据
type UploadFinancingParam struct {
	// 订舱单量（票）
	BookingCount *int64 `json:"booking_count,omitempty" xml:"booking_count,omitempty"`
	// 唯一标识
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
	Teu *int64 `json:"teu,omitempty" xml:"teu,omitempty"`
	// 运输总额
	Amounts *string `json:"amounts,omitempty" xml:"amounts,omitempty"`
}

func (s UploadFinancingParam) String() string {
	return tea.Prettify(s)
}

func (s UploadFinancingParam) GoString() string {
	return s.String()
}

func (s *UploadFinancingParam) SetBookingCount(v int64) *UploadFinancingParam {
	s.BookingCount = &v
	return s
}

func (s *UploadFinancingParam) SetCode(v string) *UploadFinancingParam {
	s.Code = &v
	return s
}

func (s *UploadFinancingParam) SetEndDate(v string) *UploadFinancingParam {
	s.EndDate = &v
	return s
}

func (s *UploadFinancingParam) SetForwarderDid(v string) *UploadFinancingParam {
	s.ForwarderDid = &v
	return s
}

func (s *UploadFinancingParam) SetStartDate(v string) *UploadFinancingParam {
	s.StartDate = &v
	return s
}

func (s *UploadFinancingParam) SetTeu(v int64) *UploadFinancingParam {
	s.Teu = &v
	return s
}

func (s *UploadFinancingParam) SetAmounts(v string) *UploadFinancingParam {
	s.Amounts = &v
	return s
}

// 链上hash
type TxDto struct {
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
	// 链上存储结构对应类型
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
}

func (s TxDto) String() string {
	return tea.Prettify(s)
}

func (s TxDto) GoString() string {
	return s.String()
}

func (s *TxDto) SetTxCode(v string) *TxDto {
	s.TxCode = &v
	return s
}

func (s *TxDto) SetDataType(v string) *TxDto {
	s.DataType = &v
	return s
}

// 用户凭证信息
type UserIssueId struct {
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 凭证余额
	BalanceAmt *string `json:"balance_amt,omitempty" xml:"balance_amt,omitempty"`
}

func (s UserIssueId) String() string {
	return tea.Prettify(s)
}

func (s UserIssueId) GoString() string {
	return s.String()
}

func (s *UserIssueId) SetIssueId(v string) *UserIssueId {
	s.IssueId = &v
	return s
}

func (s *UserIssueId) SetBalanceAmt(v string) *UserIssueId {
	s.BalanceAmt = &v
	return s
}

// 电子提单变更状态明细（无效）
type EblStatusDeatil struct {
	// 当前提单状态
	CurrentEblStatus *string `json:"current_ebl_status,omitempty" xml:"current_ebl_status,omitempty"`
	// 电子提单编号
	EblNo *string `json:"ebl_no,omitempty" xml:"ebl_no,omitempty"`
	// 下一个提单状态
	NextEblStatus *string `json:"next_ebl_status,omitempty" xml:"next_ebl_status,omitempty"`
}

func (s EblStatusDeatil) String() string {
	return tea.Prettify(s)
}

func (s EblStatusDeatil) GoString() string {
	return s.String()
}

func (s *EblStatusDeatil) SetCurrentEblStatus(v string) *EblStatusDeatil {
	s.CurrentEblStatus = &v
	return s
}

func (s *EblStatusDeatil) SetEblNo(v string) *EblStatusDeatil {
	s.EblNo = &v
	return s
}

func (s *EblStatusDeatil) SetNextEblStatus(v string) *EblStatusDeatil {
	s.NextEblStatus = &v
	return s
}

type CreateDigitalLogisticPlatformDidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业信用号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
}

func (s CreateDigitalLogisticPlatformDidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticPlatformDidRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetAuthToken(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetProductInstanceId(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetRegionName(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetEpCertName(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetEpCertNo(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidRequest) SetExtensionInfo(v string) *CreateDigitalLogisticPlatformDidRequest {
	s.ExtensionInfo = &v
	return s
}

type CreateDigitalLogisticPlatformDidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 无车承运平台DIS
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticPlatformDidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticPlatformDidResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticPlatformDidResponse) SetReqMsgId(v string) *CreateDigitalLogisticPlatformDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidResponse) SetResultCode(v string) *CreateDigitalLogisticPlatformDidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidResponse) SetResultMsg(v string) *CreateDigitalLogisticPlatformDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticPlatformDidResponse) SetDid(v string) *CreateDigitalLogisticPlatformDidResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticAgentDidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 创建did的代理did
	AgentDid *string `json:"agent_did,omitempty" xml:"agent_did,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业信用号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s CreateDigitalLogisticAgentDidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticAgentDidRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticAgentDidRequest) SetAuthToken(v string) *CreateDigitalLogisticAgentDidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetProductInstanceId(v string) *CreateDigitalLogisticAgentDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetRegionName(v string) *CreateDigitalLogisticAgentDidRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetAgentDid(v string) *CreateDigitalLogisticAgentDidRequest {
	s.AgentDid = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetEpCertName(v string) *CreateDigitalLogisticAgentDidRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetEpCertNo(v string) *CreateDigitalLogisticAgentDidRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetExtensionInfo(v string) *CreateDigitalLogisticAgentDidRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticAgentDidRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticAgentDidRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CreateDigitalLogisticAgentDidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 无车承运平台did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticAgentDidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticAgentDidResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticAgentDidResponse) SetReqMsgId(v string) *CreateDigitalLogisticAgentDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidResponse) SetResultCode(v string) *CreateDigitalLogisticAgentDidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidResponse) SetResultMsg(v string) *CreateDigitalLogisticAgentDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticAgentDidResponse) SetDid(v string) *CreateDigitalLogisticAgentDidResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticConsignorDisRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业信用号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 所属承运平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
	CheckAll *bool `json:"check_all,omitempty" xml:"check_all,omitempty"`
}

func (s CreateDigitalLogisticConsignorDisRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticConsignorDisRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetAuthToken(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetProductInstanceId(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetRegionName(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetEpCertName(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetEpCertNo(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetExtensionInfo(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetPlatformDid(v string) *CreateDigitalLogisticConsignorDisRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisRequest) SetCheckAll(v bool) *CreateDigitalLogisticConsignorDisRequest {
	s.CheckAll = &v
	return s
}

type CreateDigitalLogisticConsignorDisResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货主did信息
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticConsignorDisResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticConsignorDisResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticConsignorDisResponse) SetReqMsgId(v string) *CreateDigitalLogisticConsignorDisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisResponse) SetResultCode(v string) *CreateDigitalLogisticConsignorDisResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisResponse) SetResultMsg(v string) *CreateDigitalLogisticConsignorDisResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticConsignorDisResponse) SetDid(v string) *CreateDigitalLogisticConsignorDisResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticDriverDisRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 司机身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 司机手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 司机姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 所属承运平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
}

func (s CreateDigitalLogisticDriverDisRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDriverDisRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDriverDisRequest) SetAuthToken(v string) *CreateDigitalLogisticDriverDisRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDriverDisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetRegionName(v string) *CreateDigitalLogisticDriverDisRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetCertNo(v string) *CreateDigitalLogisticDriverDisRequest {
	s.CertNo = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDriverDisRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetMobile(v string) *CreateDigitalLogisticDriverDisRequest {
	s.Mobile = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetName(v string) *CreateDigitalLogisticDriverDisRequest {
	s.Name = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisRequest) SetPlatformDid(v string) *CreateDigitalLogisticDriverDisRequest {
	s.PlatformDid = &v
	return s
}

type CreateDigitalLogisticDriverDisResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 司机did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticDriverDisResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDriverDisResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDriverDisResponse) SetReqMsgId(v string) *CreateDigitalLogisticDriverDisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisResponse) SetResultCode(v string) *CreateDigitalLogisticDriverDisResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisResponse) SetResultMsg(v string) *CreateDigitalLogisticDriverDisResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDriverDisResponse) SetDid(v string) *CreateDigitalLogisticDriverDisResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticCargoOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 货物行业编码
	CargoBusinessCode *string `json:"cargo_business_code,omitempty" xml:"cargo_business_code,omitempty"`
	// 货物商品编码
	CargoCode *string `json:"cargo_code,omitempty" xml:"cargo_code,omitempty"`
	// 货运险金额
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 货物名称
	CargoName *string `json:"cargo_name,omitempty" xml:"cargo_name,omitempty"`
	// 货源单号
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 货物类型
	CargoType *string `json:"cargo_type,omitempty" xml:"cargo_type,omitempty"`
	// 货物单位
	CargoUnit *string `json:"cargo_unit,omitempty" xml:"cargo_unit,omitempty"`
	// 货物体积，单位（方）
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货主did
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 卸货地，XX省-XX市-XX区
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 装货地，XX省-XX市-XX区
	LoadingPlace *string `json:"loading_place,omitempty" xml:"loading_place,omitempty"`
	// 所属承运平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 货源单创建时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 联系人电话
	UserPhone *string `json:"user_phone,omitempty" xml:"user_phone,omitempty"`
	// 货物重量，单位（吨）
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s CreateDigitalLogisticCargoOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetAuthToken(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetRegionName(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetAllFreight(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.AllFreight = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoBusinessCode(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoBusinessCode = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoCode(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoCode = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoInsuranceMoney(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoName(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoName = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoOrder(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoOrder = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoType(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoType = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoUnit(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoUnit = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetCargoVolume(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.CargoVolume = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetConsignorDid(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.ConsignorDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetDeliveryPlace(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.DeliveryPlace = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetLoadingPlace(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.LoadingPlace = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetPlatformDid(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetStartTime(v int64) *CreateDigitalLogisticCargoOrderRequest {
	s.StartTime = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetUserPhone(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.UserPhone = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderRequest) SetWeight(v string) *CreateDigitalLogisticCargoOrderRequest {
	s.Weight = &v
	return s
}

type CreateDigitalLogisticCargoOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticCargoOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoOrderResponse) SetReqMsgId(v string) *CreateDigitalLogisticCargoOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderResponse) SetResultCode(v string) *CreateDigitalLogisticCargoOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderResponse) SetResultMsg(v string) *CreateDigitalLogisticCargoOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCargoOrderResponse) SetTxCode(v string) *CreateDigitalLogisticCargoOrderResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticCargoPayRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	//  收款方银行账号
	BankAccountOfPayee *string `json:"bank_account_of_payee,omitempty" xml:"bank_account_of_payee,omitempty"`
	// 付款方银行账号,货主付款的开户银行账号
	BankAccountOfPayer *string `json:"bank_account_of_payer,omitempty" xml:"bank_account_of_payer,omitempty"`
	// 银行流水号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 收款方开户行（平台收款）
	// 取值：
	// MYBank_CloudCapital_2,  ## 云资金2.0
	BankOfPayee *string `json:"bank_of_payee,omitempty" xml:"bank_of_payee,omitempty"`
	// MYBank_CloudCapital_2,  ## 云资金2.0
	BankOfPayer *string `json:"bank_of_payer,omitempty" xml:"bank_of_payer,omitempty"`
	// 货源单号
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 核验渠道，请按取值约束值填入。
	//
	// YBank_CloudCapital_2,  ## 云资金2.0
	CheckChannel *string `json:"check_channel,omitempty" xml:"check_channel,omitempty"`
	// CNY、USD
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 费用类型 (运费、调度费、服务费)
	ExpenseType *string `json:"expense_type,omitempty" xml:"expense_type,omitempty"`
	// 收款方名称
	Payee *string `json:"payee,omitempty" xml:"payee,omitempty"`
	// 付款方名称
	Payer *string `json:"payer,omitempty" xml:"payer,omitempty"`
	// 费用金额
	Payment *string `json:"payment,omitempty" xml:"payment,omitempty"`
	// 是否核验
	PayCheck *bool `json:"pay_check,omitempty" xml:"pay_check,omitempty"`
	// 付款方did
	PayDid *string `json:"pay_did,omitempty" xml:"pay_did,omitempty"`
	// 平台支付单号
	PayId *string `json:"pay_id,omitempty" xml:"pay_id,omitempty"`
	// 支付备注
	PayNote *string `json:"pay_note,omitempty" xml:"pay_note,omitempty"`
	// 支付时间
	PayTime *int64 `json:"pay_time,omitempty" xml:"pay_time,omitempty"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty"`
	// 收款方did
	RecvDid *string `json:"recv_did,omitempty" xml:"recv_did,omitempty"`
	// 支持关联单个运单和多个运单
	TaxWaybillIds []*string `json:"tax_waybill_ids,omitempty" xml:"tax_waybill_ids,omitempty" type:"Repeated"`
}

func (s CreateDigitalLogisticCargoPayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoPayRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoPayRequest) SetAuthToken(v string) *CreateDigitalLogisticCargoPayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCargoPayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetRegionName(v string) *CreateDigitalLogisticCargoPayRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetBankAccountOfPayee(v string) *CreateDigitalLogisticCargoPayRequest {
	s.BankAccountOfPayee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetBankAccountOfPayer(v string) *CreateDigitalLogisticCargoPayRequest {
	s.BankAccountOfPayer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetBankNo(v string) *CreateDigitalLogisticCargoPayRequest {
	s.BankNo = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetBankOfPayee(v string) *CreateDigitalLogisticCargoPayRequest {
	s.BankOfPayee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetBankOfPayer(v string) *CreateDigitalLogisticCargoPayRequest {
	s.BankOfPayer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetCargoOrder(v string) *CreateDigitalLogisticCargoPayRequest {
	s.CargoOrder = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetCheckChannel(v string) *CreateDigitalLogisticCargoPayRequest {
	s.CheckChannel = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetCurrency(v string) *CreateDigitalLogisticCargoPayRequest {
	s.Currency = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetExpenseType(v string) *CreateDigitalLogisticCargoPayRequest {
	s.ExpenseType = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayee(v string) *CreateDigitalLogisticCargoPayRequest {
	s.Payee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayer(v string) *CreateDigitalLogisticCargoPayRequest {
	s.Payer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayment(v string) *CreateDigitalLogisticCargoPayRequest {
	s.Payment = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayCheck(v bool) *CreateDigitalLogisticCargoPayRequest {
	s.PayCheck = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayDid(v string) *CreateDigitalLogisticCargoPayRequest {
	s.PayDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayId(v string) *CreateDigitalLogisticCargoPayRequest {
	s.PayId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayNote(v string) *CreateDigitalLogisticCargoPayRequest {
	s.PayNote = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayTime(v int64) *CreateDigitalLogisticCargoPayRequest {
	s.PayTime = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetPayType(v string) *CreateDigitalLogisticCargoPayRequest {
	s.PayType = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetRecvDid(v string) *CreateDigitalLogisticCargoPayRequest {
	s.RecvDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayRequest) SetTaxWaybillIds(v []*string) *CreateDigitalLogisticCargoPayRequest {
	s.TaxWaybillIds = v
	return s
}

type CreateDigitalLogisticCargoPayResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源支付链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticCargoPayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoPayResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoPayResponse) SetReqMsgId(v string) *CreateDigitalLogisticCargoPayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayResponse) SetResultCode(v string) *CreateDigitalLogisticCargoPayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayResponse) SetResultMsg(v string) *CreateDigitalLogisticCargoPayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayResponse) SetTxCode(v string) *CreateDigitalLogisticCargoPayResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticWaybillOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户链上账户 与司机did 二选一填写
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 运费，单位（元），平台支付给司机的运费金额
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 业务类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 货物行业编码
	CargoBusinessCode *string `json:"cargo_business_code,omitempty" xml:"cargo_business_code,omitempty"`
	// 货物商品编码
	CargoCode *string `json:"cargo_code,omitempty" xml:"cargo_code,omitempty"`
	// 货运险金额
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 货源单号，关联货主订单
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 货源单号数组
	CargoOrders []*string `json:"cargo_orders,omitempty" xml:"cargo_orders,omitempty" type:"Repeated"`
	// 货物单位
	CargoUnit *string `json:"cargo_unit,omitempty" xml:"cargo_unit,omitempty"`
	// 货物体积，单位（方）
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货物重量，单位（吨）
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 车牌颜色，黄色、蓝色、绿色
	CartBadgeColor *string `json:"cart_badge_color,omitempty" xml:"cart_badge_color,omitempty"`
	// 车牌号
	//
	CartBadgeNo *string `json:"cart_badge_no,omitempty" xml:"cart_badge_no,omitempty"`
	// 承运商did
	CarCaptainDid *string `json:"car_captain_did,omitempty" xml:"car_captain_did,omitempty"`
	// 货主运费金额，单位（元），货主支付给平台的运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 建单时间，13位毫秒级时间戳
	//
	CreatedTime *int64 `json:"created_time,omitempty" xml:"created_time,omitempty"`
	// 到达门点时间，13位毫秒级时间戳
	DestDoorsEndTime *int64 `json:"dest_doors_end_time,omitempty" xml:"dest_doors_end_time,omitempty"`
	// 门点城市CODE，6位区域行政编码
	DoorsCityCode *string `json:"doors_city_code,omitempty" xml:"doors_city_code,omitempty"`
	// 门点城市名称
	DoorsCityName *string `json:"doors_city_name,omitempty" xml:"doors_city_name,omitempty"`
	// 门点区县CODE，6位区域行政编码
	DoorsCountyCode *string `json:"doors_county_code,omitempty" xml:"doors_county_code,omitempty"`
	// 门点区县名称
	DoorsCountyName *string `json:"doors_county_name,omitempty" xml:"doors_county_name,omitempty"`
	// 门点行政区划代码
	DoorsDivisionCode *string `json:"doors_division_code,omitempty" xml:"doors_division_code,omitempty"`
	// 门点省份CODE，6位区域行政编码
	DoorsProvinceCode *string `json:"doors_province_code,omitempty" xml:"doors_province_code,omitempty"`
	// 门点省份名称
	DoorsProvinceName *string `json:"doors_province_name,omitempty" xml:"doors_province_name,omitempty"`
	// 发货方名称
	//
	Drawee *string `json:"drawee,omitempty" xml:"drawee,omitempty"`
	// 发货方纳税人识别号
	//
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty"`
	// 司机分布式身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 司机姓名 已填司机分布式身份的情况下可不填
	//
	DriverName *string `json:"driver_name,omitempty" xml:"driver_name,omitempty"`
	// 目的地详细地址
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地城市CODE，6位区域行政编码
	//
	EndCityCode *string `json:"end_city_code,omitempty" xml:"end_city_code,omitempty"`
	// 目的地城市名称
	//
	EndCityName *string `json:"end_city_name,omitempty" xml:"end_city_name,omitempty"`
	// 目的地区县CODE，6位区域行政编码
	EndCountyCode *string `json:"end_county_code,omitempty" xml:"end_county_code,omitempty"`
	// 目的地区县名称
	//
	EndCountyName *string `json:"end_county_name,omitempty" xml:"end_county_name,omitempty"`
	// 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	EndDivisionCode *string `json:"end_division_code,omitempty" xml:"end_division_code,omitempty"`
	// 目的地省份CODE，6位区域行政编码
	//
	EndProvinceCode *string `json:"end_province_code,omitempty" xml:"end_province_code,omitempty"`
	// 目的地省份名称
	//
	EndProvinceName *string `json:"end_province_name,omitempty" xml:"end_province_name,omitempty"`
	// 目的地街道CODE，12区域行政编码
	EndStreetCode *string `json:"end_street_code,omitempty" xml:"end_street_code,omitempty"`
	// 目的地街道名称
	EndStreetName *string `json:"end_street_name,omitempty" xml:"end_street_name,omitempty"`
	// 运费增项
	//
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 货物数量
	//
	GoodsAmount *int64 `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	//
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 货物名称
	//
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
	// 司机身份证号 已填司机分布式身份的情况下可不填
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
	// 运费扣减
	//
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 司机手机号 已填司机分布式身份的情况下可不填
	//
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 系统识别id 网商识别号
	//
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预付款金额
	//
	Prepayments *string `json:"prepayments,omitempty" xml:"prepayments,omitempty"`
	// 线下预付ETC
	//
	PrepaymentsBuyEtc *string `json:"prepayments_buy_etc,omitempty" xml:"prepayments_buy_etc,omitempty"`
	// 线下气款金额
	//
	PrepaymentsBuyGas *string `json:"prepayments_buy_gas,omitempty" xml:"prepayments_buy_gas,omitempty"`
	// 线下油款预付
	//
	PrepaymentsBuyOil *string `json:"prepayments_buy_oil,omitempty" xml:"prepayments_buy_oil,omitempty"`
	// 预付ETC卡金额
	//
	PrepaymentsEtccard *string `json:"prepayments_etccard,omitempty" xml:"prepayments_etccard,omitempty"`
	// 预付油卡金额
	//
	PrepaymentsOilcard *string `json:"prepayments_oilcard,omitempty" xml:"prepayments_oilcard,omitempty"`
	// 油卡赠送金额
	//
	PresentAmountOil *string `json:"present_amount_oil,omitempty" xml:"present_amount_oil,omitempty"`
	// 起始地详细地址
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地城市CODE，6位区域行政编码
	StartCityCode *string `json:"start_city_code,omitempty" xml:"start_city_code,omitempty"`
	// 起始地城市名称
	//
	StartCityName *string `json:"start_city_name,omitempty" xml:"start_city_name,omitempty"`
	// 起始地区县CODE，6位区域行政编码
	StartCountyCode *string `json:"start_county_code,omitempty" xml:"start_county_code,omitempty"`
	// 起始地区县名称
	//
	StartCountyName *string `json:"start_county_name,omitempty" xml:"start_county_name,omitempty"`
	// 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	StartDivisionCode *string `json:"start_division_code,omitempty" xml:"start_division_code,omitempty"`
	// 起始地省份CODE，6位区域行政编码
	StartProvinceCode *string `json:"start_province_code,omitempty" xml:"start_province_code,omitempty"`
	// 起始地省份名称
	//
	StartProvinceName *string `json:"start_province_name,omitempty" xml:"start_province_name,omitempty"`
	// 起始地街道CODE，12区域行政编码
	StartStreetCode *string `json:"start_street_code,omitempty" xml:"start_street_code,omitempty"`
	// 起始地街道名称
	StartStreetName *string `json:"start_street_name,omitempty" xml:"start_street_name,omitempty"`
	// 起运时间戳，13位毫秒级时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 运单id
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
	TruckLength *string `json:"truck_length,omitempty" xml:"truck_length,omitempty"`
	// 可以填：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
	TruckType *string `json:"truck_type,omitempty" xml:"truck_type,omitempty"`
	// 运输单价
	//
	UnitPrice *string `json:"unit_price,omitempty" xml:"unit_price,omitempty"`
}

func (s CreateDigitalLogisticWaybillOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetAuthToken(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetRegionName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetAccountId(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.AccountId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetAllFreight(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.AllFreight = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetBackFee(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.BackFee = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetBusinessType(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.BusinessType = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoBusinessCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoBusinessCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoInsuranceMoney(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoOrder(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoOrder = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoOrders(v []*string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoOrders = v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoUnit(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoUnit = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoVolume(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoVolume = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCargoWeight(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CargoWeight = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCartBadgeColor(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CartBadgeColor = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCartBadgeNo(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CartBadgeNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCarCaptainDid(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.CarCaptainDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetConsignorFreightAmount(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetCreatedTime(v int64) *CreateDigitalLogisticWaybillOrderRequest {
	s.CreatedTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDestDoorsEndTime(v int64) *CreateDigitalLogisticWaybillOrderRequest {
	s.DestDoorsEndTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsCityCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsCityCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsCityName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsCityName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsCountyCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsCountyName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsDivisionCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsDivisionCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsProvinceCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDoorsProvinceName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDrawee(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.Drawee = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDraweeTaxNo(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DraweeTaxNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDriverDid(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DriverDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetDriverName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.DriverName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndAddress(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndAddress = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndCityCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndCityCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndCityName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndCityName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndCountyCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndCountyCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndCountyName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndCountyName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndDivisionCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndDivisionCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndProvinceCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndProvinceCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndProvinceName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndProvinceName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndStreetCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndStreetCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetEndStreetName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.EndStreetName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetFreightIncr(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.FreightIncr = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetGoodsAmount(v int64) *CreateDigitalLogisticWaybillOrderRequest {
	s.GoodsAmount = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetGoodsAmountType(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetGoodsName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.GoodsName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetIdCard(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.IdCard = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetLossFee(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.LossFee = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetMobileNo(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.MobileNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPartnerId(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PartnerId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPlatformDid(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepayments(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.Prepayments = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyEtc(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyEtc = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyGas(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyGas = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyOil(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyOil = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepaymentsEtccard(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsEtccard = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPrepaymentsOilcard(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsOilcard = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetPresentAmountOil(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.PresentAmountOil = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartAddress(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartAddress = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartCityCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartCityCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartCityName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartCityName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartCountyCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartCountyCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartCountyName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartCountyName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartDivisionCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartDivisionCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartProvinceCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartProvinceCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartProvinceName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartProvinceName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartStreetCode(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartStreetCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartStreetName(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartStreetName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetStartTime(v int64) *CreateDigitalLogisticWaybillOrderRequest {
	s.StartTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetTaxWaybillId(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetTruckLength(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.TruckLength = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetTruckType(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.TruckType = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderRequest) SetUnitPrice(v string) *CreateDigitalLogisticWaybillOrderRequest {
	s.UnitPrice = &v
	return s
}

type CreateDigitalLogisticWaybillOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticWaybillOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillOrderResponse) SetReqMsgId(v string) *CreateDigitalLogisticWaybillOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderResponse) SetResultCode(v string) *CreateDigitalLogisticWaybillOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderResponse) SetResultMsg(v string) *CreateDigitalLogisticWaybillOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticWaybillOrderResponse) SetTxCode(v string) *CreateDigitalLogisticWaybillOrderResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticWaybillPayRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 确认到账时间
	//
	ArriveTime *int64 `json:"arrive_time,omitempty" xml:"arrive_time,omitempty"`
	// 关联银行流水号
	//
	BankSn *string `json:"bank_sn,omitempty" xml:"bank_sn,omitempty"`
	// 付款金额
	//
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty"`
	// 付款方银行账号
	//
	PayBankCardNo *string `json:"pay_bank_card_no,omitempty" xml:"pay_bank_card_no,omitempty"`
	// 付款方开户行
	//
	PayBankName *string `json:"pay_bank_name,omitempty" xml:"pay_bank_name,omitempty"`
	// 是否核验
	PayCheck *bool `json:"pay_check,omitempty" xml:"pay_check,omitempty"`
	// 付款方did
	//
	PayDid *string `json:"pay_did,omitempty" xml:"pay_did,omitempty"`
	// 付款方名称
	//
	PayName *string `json:"pay_name,omitempty" xml:"pay_name,omitempty"`
	// 付款时间戳
	//
	PayTime *int64 `json:"pay_time,omitempty" xml:"pay_time,omitempty"`
	// 支付类型
	//
	PayTypeNew *string `json:"pay_type_new,omitempty" xml:"pay_type_new,omitempty"`
	// 支付方式
	//
	PayWay *string `json:"pay_way,omitempty" xml:"pay_way,omitempty"`
	// 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 支付订单ID
	//
	PosInfoId *string `json:"pos_info_id,omitempty" xml:"pos_info_id,omitempty"`
	// 实际付款方开户行
	//
	RealPayBank *string `json:"real_pay_bank,omitempty" xml:"real_pay_bank,omitempty"`
	// 实际付款方银行账号
	//
	RealPayBankCardNo *string `json:"real_pay_bank_card_no,omitempty" xml:"real_pay_bank_card_no,omitempty"`
	// 实际付款方名称
	//
	RealPayName *string `json:"real_pay_name,omitempty" xml:"real_pay_name,omitempty"`
	// 收款方银行账号
	//
	RecvBankCardNo *string `json:"recv_bank_card_no,omitempty" xml:"recv_bank_card_no,omitempty"`
	// 收款方开户行
	//
	RecvBankName *string `json:"recv_bank_name,omitempty" xml:"recv_bank_name,omitempty"`
	// 收款方did
	//
	RecvDid *string `json:"recv_did,omitempty" xml:"recv_did,omitempty"`
	// 收款方名称
	//
	RecvName *string `json:"recv_name,omitempty" xml:"recv_name,omitempty"`
	// 关联的运单ID
	//
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
	// MYBank_CloudCapital_1,  ## 云资金1.0
	// MYBank_CloudCapital_2,  ## 云资金2.0
	CheckChannel *string `json:"check_channel,omitempty" xml:"check_channel,omitempty"`
	// CNY, USD
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s CreateDigitalLogisticWaybillPayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillPayRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetAuthToken(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetProductInstanceId(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRegionName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetArriveTime(v int64) *CreateDigitalLogisticWaybillPayRequest {
	s.ArriveTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetBankSn(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.BankSn = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayAmount(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayAmount = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayBankCardNo(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayBankCardNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayBankName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayBankName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayCheck(v bool) *CreateDigitalLogisticWaybillPayRequest {
	s.PayCheck = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayDid(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayTime(v int64) *CreateDigitalLogisticWaybillPayRequest {
	s.PayTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayTypeNew(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayTypeNew = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPayWay(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PayWay = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPlatformDid(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetPosInfoId(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.PosInfoId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRealPayBank(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RealPayBank = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRealPayBankCardNo(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RealPayBankCardNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRealPayName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RealPayName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRecvBankCardNo(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RecvBankCardNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRecvBankName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RecvBankName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRecvDid(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RecvDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetRecvName(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.RecvName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetWaybillId(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.WaybillId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetCheckChannel(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.CheckChannel = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayRequest) SetCurrency(v string) *CreateDigitalLogisticWaybillPayRequest {
	s.Currency = &v
	return s
}

type CreateDigitalLogisticWaybillPayResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticWaybillPayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillPayResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillPayResponse) SetReqMsgId(v string) *CreateDigitalLogisticWaybillPayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayResponse) SetResultCode(v string) *CreateDigitalLogisticWaybillPayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayResponse) SetResultMsg(v string) *CreateDigitalLogisticWaybillPayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticWaybillPayResponse) SetTxCode(v string) *CreateDigitalLogisticWaybillPayResponse {
	s.TxCode = &v
	return s
}

type ImportDigitalLogisticWaybillLocationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 描述信息
	//
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 运单轨迹信息
	Location []*LogisticLocation `json:"location,omitempty" xml:"location,omitempty" type:"Repeated"`
	// 所属平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单id
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s ImportDigitalLogisticWaybillLocationRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDigitalLogisticWaybillLocationRequest) GoString() string {
	return s.String()
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetAuthToken(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetProductInstanceId(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetRegionName(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.RegionName = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetDesc(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.Desc = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetLocation(v []*LogisticLocation) *ImportDigitalLogisticWaybillLocationRequest {
	s.Location = v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetPlatformDid(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.PlatformDid = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationRequest) SetTaxWaybillId(v string) *ImportDigitalLogisticWaybillLocationRequest {
	s.TaxWaybillId = &v
	return s
}

type ImportDigitalLogisticWaybillLocationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportDigitalLogisticWaybillLocationResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDigitalLogisticWaybillLocationResponse) GoString() string {
	return s.String()
}

func (s *ImportDigitalLogisticWaybillLocationResponse) SetReqMsgId(v string) *ImportDigitalLogisticWaybillLocationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationResponse) SetResultCode(v string) *ImportDigitalLogisticWaybillLocationResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDigitalLogisticWaybillLocationResponse) SetResultMsg(v string) *ImportDigitalLogisticWaybillLocationResponse {
	s.ResultMsg = &v
	return s
}

type CreateDigitalLogisticWaybillBillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 受票方名称
	//
	Drawee *string `json:"drawee,omitempty" xml:"drawee,omitempty"`
	// 受票方纳税人识别号
	//
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty"`
	// 发票代码
	//
	Lzfpdm *string `json:"lzfpdm,omitempty" xml:"lzfpdm,omitempty"`
	// 发票号码
	//
	Lzfphm *string `json:"lzfphm,omitempty" xml:"lzfphm,omitempty"`
	// 开票时间戳
	//
	OpenTime *int64 `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 关联的运单ID
	//
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty"`
}

func (s CreateDigitalLogisticWaybillBillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillBillRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetAuthToken(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetProductInstanceId(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetRegionName(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetDrawee(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.Drawee = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetDraweeTaxNo(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.DraweeTaxNo = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetLzfpdm(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.Lzfpdm = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetLzfphm(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.Lzfphm = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetOpenTime(v int64) *CreateDigitalLogisticWaybillBillRequest {
	s.OpenTime = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetPlatformDid(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillRequest) SetWaybillId(v string) *CreateDigitalLogisticWaybillBillRequest {
	s.WaybillId = &v
	return s
}

type CreateDigitalLogisticWaybillBillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticWaybillBillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticWaybillBillResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticWaybillBillResponse) SetReqMsgId(v string) *CreateDigitalLogisticWaybillBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillResponse) SetResultCode(v string) *CreateDigitalLogisticWaybillBillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillResponse) SetResultMsg(v string) *CreateDigitalLogisticWaybillBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticWaybillBillResponse) SetTxCode(v string) *CreateDigitalLogisticWaybillBillResponse {
	s.TxCode = &v
	return s
}

type QueryDigitalLogisticWaybillStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单ID
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s QueryDigitalLogisticWaybillStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticWaybillStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticWaybillStatusRequest) SetAuthToken(v string) *QueryDigitalLogisticWaybillStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusRequest) SetProductInstanceId(v string) *QueryDigitalLogisticWaybillStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusRequest) SetRegionName(v string) *QueryDigitalLogisticWaybillStatusRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusRequest) SetPlatformDid(v string) *QueryDigitalLogisticWaybillStatusRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusRequest) SetTaxWaybillId(v string) *QueryDigitalLogisticWaybillStatusRequest {
	s.TaxWaybillId = &v
	return s
}

type QueryDigitalLogisticWaybillStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运单状态
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 轨迹核验结果
	TrackCheckResult *TrackCheckResult `json:"track_check_result,omitempty" xml:"track_check_result,omitempty"`
}

func (s QueryDigitalLogisticWaybillStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticWaybillStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticWaybillStatusResponse) SetReqMsgId(v string) *QueryDigitalLogisticWaybillStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusResponse) SetResultCode(v string) *QueryDigitalLogisticWaybillStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusResponse) SetResultMsg(v string) *QueryDigitalLogisticWaybillStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusResponse) SetStatus(v string) *QueryDigitalLogisticWaybillStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticWaybillStatusResponse) SetTrackCheckResult(v *TrackCheckResult) *QueryDigitalLogisticWaybillStatusResponse {
	s.TrackCheckResult = v
	return s
}

type FinishDigitalLogisticWaybillOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链上账号 与司机did 二选一填写
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 运费，单位（元），平台支付给司机的运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	//
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 业务类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 货物行业编码
	CargoBusinessCode *string `json:"cargo_business_code,omitempty" xml:"cargo_business_code,omitempty"`
	// 货物商品编码
	CargoCode *string `json:"cargo_code,omitempty" xml:"cargo_code,omitempty"`
	// 货物运费险
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 货源单号
	//
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 货物单位
	CargoUnit *string `json:"cargo_unit,omitempty" xml:"cargo_unit,omitempty"`
	// 货物体积，单位（方）
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货物重量，单位（吨）
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 车牌颜色，黄色、蓝色、绿色
	CartBadgeColor *string `json:"cart_badge_color,omitempty" xml:"cart_badge_color,omitempty"`
	// 车牌号
	//
	CartBadgeNo *string `json:"cart_badge_no,omitempty" xml:"cart_badge_no,omitempty"`
	// 承运商did
	CarCaptainDid *string `json:"car_captain_did,omitempty" xml:"car_captain_did,omitempty"`
	// 货主运费金额，货主支付给平台的运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 建单时间，13位毫秒级时间戳
	CreatedTime *int64 `json:"created_time,omitempty" xml:"created_time,omitempty"`
	// 到达门点时间，13位毫秒级时间戳
	DestDoorsEndTime *int64 `json:"dest_doors_end_time,omitempty" xml:"dest_doors_end_time,omitempty"`
	// 门点城市CODE，6位区域行政编码
	DoorsCityCode *string `json:"doors_city_code,omitempty" xml:"doors_city_code,omitempty"`
	// 门点城市名称
	DoorsCityName *string `json:"doors_city_name,omitempty" xml:"doors_city_name,omitempty"`
	// 门点区县CODE，6位区域行政编码
	DoorsCountyCode *string `json:"doors_county_code,omitempty" xml:"doors_county_code,omitempty"`
	// 门点区县名称
	DoorsCountyName *string `json:"doors_county_name,omitempty" xml:"doors_county_name,omitempty"`
	// 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	DoorsDivisionCode *string `json:"doors_division_code,omitempty" xml:"doors_division_code,omitempty"`
	// 门点省份CODE，6位区域行政编
	DoorsProvinceCode *string `json:"doors_province_code,omitempty" xml:"doors_province_code,omitempty"`
	// 门点省份名称
	DoorsProvinceName *string `json:"doors_province_name,omitempty" xml:"doors_province_name,omitempty"`
	// 发货方名称
	//
	Drawee *string `json:"drawee,omitempty" xml:"drawee,omitempty"`
	// 发货方纳税人识别号
	//
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty"`
	// 司机分布式数字身份
	//
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 司机姓名 已填司机分布式身份的情况下可不填
	//
	DriverName *string `json:"driver_name,omitempty" xml:"driver_name,omitempty"`
	// 目的地详细地址
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地城市CODE，6位区域行政编
	EndCityCode *string `json:"end_city_code,omitempty" xml:"end_city_code,omitempty"`
	// 目的地城市名称
	//
	EndCityName *string `json:"end_city_name,omitempty" xml:"end_city_name,omitempty"`
	// 目的地区县CODE，6位区域行政编
	EndCountyCode *string `json:"end_county_code,omitempty" xml:"end_county_code,omitempty"`
	// 目的地区县名称
	//
	EndCountyName *string `json:"end_county_name,omitempty" xml:"end_county_name,omitempty"`
	// 结束行政区划代码 ，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	EndDivisionCode *string `json:"end_division_code,omitempty" xml:"end_division_code,omitempty"`
	// 目的地省份CODE，6位区域行政编
	//
	EndProvinceCode *string `json:"end_province_code,omitempty" xml:"end_province_code,omitempty"`
	// 目的地省份名称
	//
	EndProvinceName *string `json:"end_province_name,omitempty" xml:"end_province_name,omitempty"`
	// 目的地街道CODE，12位行政区域编码
	EndStreetCode *string `json:"end_street_code,omitempty" xml:"end_street_code,omitempty"`
	// 目的地街道名称
	EndStreetName *string `json:"end_street_name,omitempty" xml:"end_street_name,omitempty"`
	// 终结时间，13位毫秒级时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 运费增项
	//
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 货物数量
	//
	GoodsAmount *int64 `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	//
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 货物名称
	//
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
	// 司机身份证号 已填司机分布式身份的情况下可不填
	//
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
	// 运费扣减
	//
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 司机手机号 已填司机分布式身份的情况下可不填
	//
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 系统识别id 网商识别号
	//
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty"`
	// 是否进行资金验证
	//
	PayCheck *bool `json:"pay_check,omitempty" xml:"pay_check,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预付款金额
	//
	Prepayments *string `json:"prepayments,omitempty" xml:"prepayments,omitempty"`
	// 线下预付ETC
	//
	PrepaymentsBuyEtc *string `json:"prepayments_buy_etc,omitempty" xml:"prepayments_buy_etc,omitempty"`
	// 线下气款金额
	//
	PrepaymentsBuyGas *string `json:"prepayments_buy_gas,omitempty" xml:"prepayments_buy_gas,omitempty"`
	// 线下油款预付
	//
	PrepaymentsBuyOil *string `json:"prepayments_buy_oil,omitempty" xml:"prepayments_buy_oil,omitempty"`
	// 预付ETC卡金额
	//
	PrepaymentsEtccard *string `json:"prepayments_etccard,omitempty" xml:"prepayments_etccard,omitempty"`
	// 预付油卡金额
	//
	PrepaymentsOilcard *string `json:"prepayments_oilcard,omitempty" xml:"prepayments_oilcard,omitempty"`
	// 油卡赠送金额
	//
	PresentAmountOil *string `json:"present_amount_oil,omitempty" xml:"present_amount_oil,omitempty"`
	// 起始地详细地址
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地CODE
	// ，6位区域行政编
	StartCityCode *string `json:"start_city_code,omitempty" xml:"start_city_code,omitempty"`
	// 起始地城市名称
	//
	StartCityName *string `json:"start_city_name,omitempty" xml:"start_city_name,omitempty"`
	// 起始地区县CODE
	// ，6位区域行政编
	StartCountyCode *string `json:"start_county_code,omitempty" xml:"start_county_code,omitempty"`
	// 起始地区县名称
	//
	StartCountyName *string `json:"start_county_name,omitempty" xml:"start_county_name,omitempty"`
	// 起始行政区划代码，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	StartDivisionCode *string `json:"start_division_code,omitempty" xml:"start_division_code,omitempty"`
	// 起始地省份CODE
	// ，6位区域行政编
	StartProvinceCode *string `json:"start_province_code,omitempty" xml:"start_province_code,omitempty"`
	// 起始地省份名称
	//
	StartProvinceName *string `json:"start_province_name,omitempty" xml:"start_province_name,omitempty"`
	// 起始地街道CODE，12位区域行政编
	StartStreetCode *string `json:"start_street_code,omitempty" xml:"start_street_code,omitempty"`
	// 起始地街道名称
	StartStreetName *string `json:"start_street_name,omitempty" xml:"start_street_name,omitempty"`
	// 起运时间，13位毫秒级时间戳
	//
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 运单ID
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
	TruckLength *string `json:"truck_length,omitempty" xml:"truck_length,omitempty"`
	// 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
	TruckType *string `json:"truck_type,omitempty" xml:"truck_type,omitempty"`
	// 运输单价
	//
	UnitPrice *string `json:"unit_price,omitempty" xml:"unit_price,omitempty"`
}

func (s FinishDigitalLogisticWaybillOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticWaybillOrderRequest) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetAuthToken(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetProductInstanceId(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetRegionName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.RegionName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetAccountId(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.AccountId = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetAllFreight(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.AllFreight = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetBackFee(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.BackFee = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetBusinessType(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.BusinessType = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoBusinessCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoBusinessCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoInsuranceMoney(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoOrder(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoOrder = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoUnit(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoUnit = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoVolume(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoVolume = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCargoWeight(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CargoWeight = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCartBadgeColor(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CartBadgeColor = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCartBadgeNo(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CartBadgeNo = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCarCaptainDid(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.CarCaptainDid = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetConsignorFreightAmount(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetCreatedTime(v int64) *FinishDigitalLogisticWaybillOrderRequest {
	s.CreatedTime = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDestDoorsEndTime(v int64) *FinishDigitalLogisticWaybillOrderRequest {
	s.DestDoorsEndTime = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsCityCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsCityCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsCityName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsCityName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsCountyCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsCountyName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsDivisionCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsDivisionCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsProvinceCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDoorsProvinceName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDrawee(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.Drawee = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDraweeTaxNo(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DraweeTaxNo = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDriverDid(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DriverDid = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetDriverName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.DriverName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndAddress(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndAddress = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndCityCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndCityCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndCityName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndCityName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndCountyCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndCountyCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndCountyName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndCountyName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndDivisionCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndDivisionCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndProvinceCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndProvinceCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndProvinceName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndProvinceName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndStreetCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndStreetCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndStreetName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndStreetName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetEndTime(v int64) *FinishDigitalLogisticWaybillOrderRequest {
	s.EndTime = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetFreightIncr(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.FreightIncr = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetGoodsAmount(v int64) *FinishDigitalLogisticWaybillOrderRequest {
	s.GoodsAmount = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetGoodsAmountType(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetGoodsName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.GoodsName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetIdCard(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.IdCard = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetLossFee(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.LossFee = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetMobileNo(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.MobileNo = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPartnerId(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PartnerId = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPayCheck(v bool) *FinishDigitalLogisticWaybillOrderRequest {
	s.PayCheck = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPlatformDid(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PlatformDid = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepayments(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.Prepayments = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyEtc(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyEtc = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyGas(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyGas = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyOil(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyOil = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepaymentsEtccard(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsEtccard = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPrepaymentsOilcard(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsOilcard = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetPresentAmountOil(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.PresentAmountOil = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartAddress(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartAddress = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartCityCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartCityCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartCityName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartCityName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartCountyCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartCountyCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartCountyName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartCountyName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartDivisionCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartDivisionCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartProvinceCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartProvinceCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartProvinceName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartProvinceName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartStreetCode(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartStreetCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartStreetName(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartStreetName = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetStartTime(v int64) *FinishDigitalLogisticWaybillOrderRequest {
	s.StartTime = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetTaxWaybillId(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetTruckLength(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.TruckLength = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetTruckType(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.TruckType = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderRequest) SetUnitPrice(v string) *FinishDigitalLogisticWaybillOrderRequest {
	s.UnitPrice = &v
	return s
}

type FinishDigitalLogisticWaybillOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	//
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s FinishDigitalLogisticWaybillOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticWaybillOrderResponse) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticWaybillOrderResponse) SetReqMsgId(v string) *FinishDigitalLogisticWaybillOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderResponse) SetResultCode(v string) *FinishDigitalLogisticWaybillOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderResponse) SetResultMsg(v string) *FinishDigitalLogisticWaybillOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishDigitalLogisticWaybillOrderResponse) SetTxCode(v string) *FinishDigitalLogisticWaybillOrderResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticCargoPayorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 收款方银行账号
	BankAccountOfPayee *string `json:"bank_account_of_payee,omitempty" xml:"bank_account_of_payee,omitempty"`
	// 付款方银行账号,货主付款的开户银行账号
	BankAccountOfPayer *string `json:"bank_account_of_payer,omitempty" xml:"bank_account_of_payer,omitempty"`
	// 银行流水号，云资金校验时 必传；
	//
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 收款方开户行（平台收款）
	//
	// MYBank_CloudCapital_2,  ## 云资金2.0
	//
	//
	BankOfPayee *string `json:"bank_of_payee,omitempty" xml:"bank_of_payee,omitempty"`
	// 付款方开户行(货主付款)  取值
	//
	// MYBank_CloudCapital_2,  ## 云资金2.0
	BankOfPayer *string `json:"bank_of_payer,omitempty" xml:"bank_of_payer,omitempty"`
	// 账单编号
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty"`
	// 货源单号
	//
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 核验渠道，请按取值约束值填入
	// MYBank_CloudCapital_2,  ## 云资金2.0
	CheckChannel *string `json:"check_channel,omitempty" xml:"check_channel,omitempty"`
	// 币种
	// 按下列取值：
	// CNY、USD
	//
	//
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 费用类型 (运费、调度费、服务费)
	//
	ExpenseType *string `json:"expense_type,omitempty" xml:"expense_type,omitempty"`
	// 收款方名称
	Payee *string `json:"payee,omitempty" xml:"payee,omitempty"`
	// 付款方名称
	Payer *string `json:"payer,omitempty" xml:"payer,omitempty"`
	// 费用金额（运单维度）
	//
	Payment *string `json:"payment,omitempty" xml:"payment,omitempty"`
	// 是否核验
	PayCheck *bool `json:"pay_check,omitempty" xml:"pay_check,omitempty"`
	// 付款方did
	//
	PayDid *string `json:"pay_did,omitempty" xml:"pay_did,omitempty"`
	// 支付单号
	//
	PayId *string `json:"pay_id,omitempty" xml:"pay_id,omitempty"`
	// 支付备注
	//
	PayNote *string `json:"pay_note,omitempty" xml:"pay_note,omitempty"`
	// 支付时间
	//
	PayTime *int64 `json:"pay_time,omitempty" xml:"pay_time,omitempty"`
	// 支付类型
	//
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty"`
	// 所属平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 收款方did
	RecvDid *string `json:"recv_did,omitempty" xml:"recv_did,omitempty"`
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 运单号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s CreateDigitalLogisticCargoPayorderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoPayorderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetAuthToken(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetRegionName(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBankAccountOfPayee(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BankAccountOfPayee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBankAccountOfPayer(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BankAccountOfPayer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBankNo(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BankNo = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBankOfPayee(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BankOfPayee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBankOfPayer(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BankOfPayer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetBillId(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.BillId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetCargoOrder(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.CargoOrder = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetCheckChannel(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.CheckChannel = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetCurrency(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.Currency = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetExpenseType(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.ExpenseType = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayee(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.Payee = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayer(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.Payer = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayment(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.Payment = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayCheck(v bool) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayCheck = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayDid(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayId(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayNote(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayNote = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayTime(v int64) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayTime = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPayType(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.PayType = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetPlatformDid(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetRecvDid(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.RecvDid = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetRequestId(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.RequestId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderRequest) SetTaxWaybillId(v string) *CreateDigitalLogisticCargoPayorderRequest {
	s.TaxWaybillId = &v
	return s
}

type CreateDigitalLogisticCargoPayorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源支付链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticCargoPayorderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargoPayorderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargoPayorderResponse) SetReqMsgId(v string) *CreateDigitalLogisticCargoPayorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderResponse) SetResultCode(v string) *CreateDigitalLogisticCargoPayorderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderResponse) SetResultMsg(v string) *CreateDigitalLogisticCargoPayorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCargoPayorderResponse) SetTxCode(v string) *CreateDigitalLogisticCargoPayorderResponse {
	s.TxCode = &v
	return s
}

type SaveDigitalLogisticWaybillOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 链上账号 与司机did 二选一填写
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 运费，单位（元），平台支付给司机的运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	//
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 业务类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 货物行业编码
	//
	CargoBusinessCode *string `json:"cargo_business_code,omitempty" xml:"cargo_business_code,omitempty"`
	// 货物商品编码
	//
	CargoCode *string `json:"cargo_code,omitempty" xml:"cargo_code,omitempty"`
	// 货物运费险
	//
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 货源单号
	//
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 货物单位
	//
	CargoUnit *string `json:"cargo_unit,omitempty" xml:"cargo_unit,omitempty"`
	// 货物体积，单位（方）
	//
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货物重量，单位（吨）
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 车牌颜色，黄色、蓝色、绿色
	CartBadgeColor *string `json:"cart_badge_color,omitempty" xml:"cart_badge_color,omitempty"`
	// 车牌号
	//
	CartBadgeNo *string `json:"cart_badge_no,omitempty" xml:"cart_badge_no,omitempty"`
	// 承运商did
	CarCaptainDid *string `json:"car_captain_did,omitempty" xml:"car_captain_did,omitempty"`
	// 货主运费金额，货主支付给平台的运费
	//
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 建单时间，13位毫秒级时间戳
	CreatedTime *int64 `json:"created_time,omitempty" xml:"created_time,omitempty"`
	// 到达门点时间，13位毫秒级时间戳
	DestDoorsEndTime *int64 `json:"dest_doors_end_time,omitempty" xml:"dest_doors_end_time,omitempty"`
	// 门点城市CODE，6位区域行政编码
	DoorsCityCode *string `json:"doors_city_code,omitempty" xml:"doors_city_code,omitempty"`
	// 门点城市名称
	DoorsCityName *string `json:"doors_city_name,omitempty" xml:"doors_city_name,omitempty"`
	// 门点区县CODE，6位区域行政编码
	DoorsCountyCode *string `json:"doors_county_code,omitempty" xml:"doors_county_code,omitempty"`
	// 门点区县名称
	DoorsCountyName *string `json:"doors_county_name,omitempty" xml:"doors_county_name,omitempty"`
	// 门点行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	DoorsDivisionCode *string `json:"doors_division_code,omitempty" xml:"doors_division_code,omitempty"`
	// 门点省份CODE，6位区域行政编码
	DoorsProvinceCode *string `json:"doors_province_code,omitempty" xml:"doors_province_code,omitempty"`
	// 门点省份名称
	DoorsProvinceName *string `json:"doors_province_name,omitempty" xml:"doors_province_name,omitempty"`
	// 发货方名称
	//
	Drawee *string `json:"drawee,omitempty" xml:"drawee,omitempty"`
	// 发货方纳税人识别号
	//
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty"`
	// 司机分布式数字身份
	//
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 司机姓名 已填司机分布式身份的情况下可不填
	//
	DriverName *string `json:"driver_name,omitempty" xml:"driver_name,omitempty"`
	// 目的地详细地址
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地城市CODE，6位区域行政编码
	//
	EndCityCode *string `json:"end_city_code,omitempty" xml:"end_city_code,omitempty"`
	// 目的地城市名称
	//
	EndCityName *string `json:"end_city_name,omitempty" xml:"end_city_name,omitempty"`
	// 目的地区县CODE，6位区域行政编码
	EndCountyCode *string `json:"end_county_code,omitempty" xml:"end_county_code,omitempty"`
	// 目的地区县名称
	//
	EndCountyName *string `json:"end_county_name,omitempty" xml:"end_county_name,omitempty"`
	// 结束行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	EndDivisionCode *string `json:"end_division_code,omitempty" xml:"end_division_code,omitempty"`
	// 目的地省份CODE，6位区域行政编码
	EndProvinceCode *string `json:"end_province_code,omitempty" xml:"end_province_code,omitempty"`
	// 目的地省份名称
	//
	EndProvinceName *string `json:"end_province_name,omitempty" xml:"end_province_name,omitempty"`
	// 目的地街道CODE，12位区域行政编码
	EndStreetCode *string `json:"end_street_code,omitempty" xml:"end_street_code,omitempty"`
	// 目的地街道名称
	EndStreetName *string `json:"end_street_name,omitempty" xml:"end_street_name,omitempty"`
	// 运达时间，13位毫秒级时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 运费增项
	//
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 货物数量
	//
	GoodsAmount *string `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	//
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 货物名称
	//
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
	// 司机身份证号 已填司机分布式身份的情况下可不填
	//
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
	// 运费扣减
	//
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 司机手机号 已填司机分布式身份的情况下可不填
	//
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 系统识别id 网商识别号
	//
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty"`
	// 是否进行资金验证
	//
	PayCheck *bool `json:"pay_check,omitempty" xml:"pay_check,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预付款金额
	//
	Prepayments *string `json:"prepayments,omitempty" xml:"prepayments,omitempty"`
	// 线下预付ETC
	//
	PrepaymentsBuyEtc *string `json:"prepayments_buy_etc,omitempty" xml:"prepayments_buy_etc,omitempty"`
	// 线下气款金额
	//
	PrepaymentsBuyGas *string `json:"prepayments_buy_gas,omitempty" xml:"prepayments_buy_gas,omitempty"`
	// 线下油款预付
	//
	PrepaymentsBuyOil *string `json:"prepayments_buy_oil,omitempty" xml:"prepayments_buy_oil,omitempty"`
	// 预付ETC卡金额
	//
	PrepaymentsEtccard *string `json:"prepayments_etccard,omitempty" xml:"prepayments_etccard,omitempty"`
	// 预付油卡金额
	//
	PrepaymentsOilcard *string `json:"prepayments_oilcard,omitempty" xml:"prepayments_oilcard,omitempty"`
	// 油卡赠送金额
	//
	PresentAmountOil *string `json:"present_amount_oil,omitempty" xml:"present_amount_oil,omitempty"`
	// 起始地详细地址
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地城市CODE，6位区域行政编码
	//
	StartCityCode *string `json:"start_city_code,omitempty" xml:"start_city_code,omitempty"`
	// 起始地城市名称
	//
	StartCityName *string `json:"start_city_name,omitempty" xml:"start_city_name,omitempty"`
	// 起始地区县CODE，6位区域行政编码
	//
	//
	StartCountyCode *string `json:"start_county_code,omitempty" xml:"start_county_code,omitempty"`
	// 起始地区县名称
	//
	StartCountyName *string `json:"start_county_name,omitempty" xml:"start_county_name,omitempty"`
	// 起始行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	//
	StartDivisionCode *string `json:"start_division_code,omitempty" xml:"start_division_code,omitempty"`
	// 起始地省份CODE，6位区域行政编码
	//
	//
	StartProvinceCode *string `json:"start_province_code,omitempty" xml:"start_province_code,omitempty"`
	// 起始地省份名称
	//
	StartProvinceName *string `json:"start_province_name,omitempty" xml:"start_province_name,omitempty"`
	// 起始地街道CODE，12位区域行政编码
	StartStreetCode *string `json:"start_street_code,omitempty" xml:"start_street_code,omitempty"`
	// 起始地街道名称
	StartStreetName *string `json:"start_street_name,omitempty" xml:"start_street_name,omitempty"`
	// 起运时间，13位毫秒级时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 运单ID
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
	TruckLength *string `json:"truck_length,omitempty" xml:"truck_length,omitempty"`
	// 车型
	TruckType *string `json:"truck_type,omitempty" xml:"truck_type,omitempty"`
	// 运输单价
	//
	UnitPrice *string `json:"unit_price,omitempty" xml:"unit_price,omitempty"`
}

func (s SaveDigitalLogisticWaybillOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticWaybillOrderRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetAuthToken(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetProductInstanceId(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetRegionName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetAccountId(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.AccountId = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetAllFreight(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.AllFreight = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetBackFee(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.BackFee = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetBusinessType(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.BusinessType = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoBusinessCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoBusinessCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoInsuranceMoney(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoOrder(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoOrder = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoUnit(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoUnit = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoVolume(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoVolume = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCargoWeight(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CargoWeight = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCartBadgeColor(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CartBadgeColor = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCartBadgeNo(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CartBadgeNo = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCarCaptainDid(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.CarCaptainDid = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetConsignorFreightAmount(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetCreatedTime(v int64) *SaveDigitalLogisticWaybillOrderRequest {
	s.CreatedTime = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDestDoorsEndTime(v int64) *SaveDigitalLogisticWaybillOrderRequest {
	s.DestDoorsEndTime = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsCityCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsCityCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsCityName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsCityName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsCountyCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsCountyName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsCountyName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsDivisionCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsDivisionCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsProvinceCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDoorsProvinceName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DoorsProvinceName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDrawee(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.Drawee = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDraweeTaxNo(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DraweeTaxNo = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDriverDid(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DriverDid = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetDriverName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.DriverName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndAddress(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndAddress = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndCityCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndCityCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndCityName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndCityName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndCountyCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndCountyCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndCountyName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndCountyName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndDivisionCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndDivisionCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndProvinceCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndProvinceCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndProvinceName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndProvinceName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndStreetCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndStreetCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndStreetName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndStreetName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetEndTime(v int64) *SaveDigitalLogisticWaybillOrderRequest {
	s.EndTime = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetFreightIncr(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.FreightIncr = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetGoodsAmount(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.GoodsAmount = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetGoodsAmountType(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetGoodsName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.GoodsName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetIdCard(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.IdCard = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetLossFee(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.LossFee = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetMobileNo(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.MobileNo = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPartnerId(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PartnerId = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPayCheck(v bool) *SaveDigitalLogisticWaybillOrderRequest {
	s.PayCheck = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPlatformDid(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PlatformDid = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepayments(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.Prepayments = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyEtc(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyEtc = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyGas(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyGas = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepaymentsBuyOil(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsBuyOil = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepaymentsEtccard(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsEtccard = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPrepaymentsOilcard(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PrepaymentsOilcard = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetPresentAmountOil(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.PresentAmountOil = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartAddress(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartAddress = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartCityCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartCityCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartCityName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartCityName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartCountyCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartCountyCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartCountyName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartCountyName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartDivisionCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartDivisionCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartProvinceCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartProvinceCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartProvinceName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartProvinceName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartStreetCode(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartStreetCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartStreetName(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartStreetName = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetStartTime(v int64) *SaveDigitalLogisticWaybillOrderRequest {
	s.StartTime = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetTaxWaybillId(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetTruckLength(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.TruckLength = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetTruckType(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.TruckType = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderRequest) SetUnitPrice(v string) *SaveDigitalLogisticWaybillOrderRequest {
	s.UnitPrice = &v
	return s
}

type SaveDigitalLogisticWaybillOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s SaveDigitalLogisticWaybillOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticWaybillOrderResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticWaybillOrderResponse) SetReqMsgId(v string) *SaveDigitalLogisticWaybillOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderResponse) SetResultCode(v string) *SaveDigitalLogisticWaybillOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderResponse) SetResultMsg(v string) *SaveDigitalLogisticWaybillOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticWaybillOrderResponse) SetTxCode(v string) *SaveDigitalLogisticWaybillOrderResponse {
	s.TxCode = &v
	return s
}

type CloseDigitalLogisticWaybillOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 无车承运平台分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单ID
	//
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s CloseDigitalLogisticWaybillOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseDigitalLogisticWaybillOrderRequest) GoString() string {
	return s.String()
}

func (s *CloseDigitalLogisticWaybillOrderRequest) SetAuthToken(v string) *CloseDigitalLogisticWaybillOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderRequest) SetProductInstanceId(v string) *CloseDigitalLogisticWaybillOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderRequest) SetRegionName(v string) *CloseDigitalLogisticWaybillOrderRequest {
	s.RegionName = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderRequest) SetPlatformDid(v string) *CloseDigitalLogisticWaybillOrderRequest {
	s.PlatformDid = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderRequest) SetTaxWaybillId(v string) *CloseDigitalLogisticWaybillOrderRequest {
	s.TaxWaybillId = &v
	return s
}

type CloseDigitalLogisticWaybillOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CloseDigitalLogisticWaybillOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseDigitalLogisticWaybillOrderResponse) GoString() string {
	return s.String()
}

func (s *CloseDigitalLogisticWaybillOrderResponse) SetReqMsgId(v string) *CloseDigitalLogisticWaybillOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderResponse) SetResultCode(v string) *CloseDigitalLogisticWaybillOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderResponse) SetResultMsg(v string) *CloseDigitalLogisticWaybillOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloseDigitalLogisticWaybillOrderResponse) SetTxCode(v string) *CloseDigitalLogisticWaybillOrderResponse {
	s.TxCode = &v
	return s
}

type FinishDigitalLogisticFinanceWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 货主支付运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 运费增项
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 运费扣减
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单id
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s FinishDigitalLogisticFinanceWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticFinanceWaybillRequest) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetAuthToken(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetProductInstanceId(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetRegionName(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetAllFreight(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.AllFreight = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetBackFee(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.BackFee = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetConsignorFreightAmount(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetFreightIncr(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.FreightIncr = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetLossFee(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.LossFee = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetPlatformDid(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.PlatformDid = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillRequest) SetTaxWaybillId(v string) *FinishDigitalLogisticFinanceWaybillRequest {
	s.TaxWaybillId = &v
	return s
}

type FinishDigitalLogisticFinanceWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s FinishDigitalLogisticFinanceWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticFinanceWaybillResponse) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticFinanceWaybillResponse) SetReqMsgId(v string) *FinishDigitalLogisticFinanceWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillResponse) SetResultCode(v string) *FinishDigitalLogisticFinanceWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillResponse) SetResultMsg(v string) *FinishDigitalLogisticFinanceWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishDigitalLogisticFinanceWaybillResponse) SetTxCode(v string) *FinishDigitalLogisticFinanceWaybillResponse {
	s.TxCode = &v
	return s
}

type FinishDigitalLogisticFinanceTransportRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 货主支付运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 到达门点时间
	DestDoorsEndTime *int64 `json:"dest_doors_end_time,omitempty" xml:"dest_doors_end_time,omitempty"`
	// 终结时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 运费增项
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 运费扣减
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 运单id
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s FinishDigitalLogisticFinanceTransportRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticFinanceTransportRequest) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetAuthToken(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetProductInstanceId(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetRegionName(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.RegionName = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetAllFreight(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.AllFreight = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetBackFee(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.BackFee = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetConsignorFreightAmount(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetDestDoorsEndTime(v int64) *FinishDigitalLogisticFinanceTransportRequest {
	s.DestDoorsEndTime = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetEndTime(v int64) *FinishDigitalLogisticFinanceTransportRequest {
	s.EndTime = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetFreightIncr(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.FreightIncr = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetLossFee(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.LossFee = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetPlatformDid(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.PlatformDid = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportRequest) SetTaxWaybillId(v string) *FinishDigitalLogisticFinanceTransportRequest {
	s.TaxWaybillId = &v
	return s
}

type FinishDigitalLogisticFinanceTransportResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源支付链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s FinishDigitalLogisticFinanceTransportResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticFinanceTransportResponse) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticFinanceTransportResponse) SetReqMsgId(v string) *FinishDigitalLogisticFinanceTransportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportResponse) SetResultCode(v string) *FinishDigitalLogisticFinanceTransportResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportResponse) SetResultMsg(v string) *FinishDigitalLogisticFinanceTransportResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishDigitalLogisticFinanceTransportResponse) SetTxCode(v string) *FinishDigitalLogisticFinanceTransportResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticFinanceWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费，单位（元），平台支付给司机的运费
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 回单押金
	BackFee *string `json:"back_fee,omitempty" xml:"back_fee,omitempty"`
	// 业务类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 货物行业编码
	CargoBusinessCode *string `json:"cargo_business_code,omitempty" xml:"cargo_business_code,omitempty"`
	// 货物商品编码
	CargoCode *string `json:"cargo_code,omitempty" xml:"cargo_code,omitempty"`
	// 货物运费险
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 货源单号
	CargoOrder *string `json:"cargo_order,omitempty" xml:"cargo_order,omitempty"`
	// 货物单位
	CargoUnit *string `json:"cargo_unit,omitempty" xml:"cargo_unit,omitempty"`
	// 货物体积，单位（方）
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货物重量，单位（吨）
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 车牌颜色，黄色、蓝色、绿色
	CartBadgeColor *string `json:"cart_badge_color,omitempty" xml:"cart_badge_color,omitempty"`
	// 车牌号
	CartBadgeNo *string `json:"cart_badge_no,omitempty" xml:"cart_badge_no,omitempty"`
	// 承运商did
	CarCaptainDid *string `json:"car_captain_did,omitempty" xml:"car_captain_did,omitempty"`
	// 货主支付运费金额，货主支付给平台的运费金额
	ConsignorFreightAmount *string `json:"consignor_freight_amount,omitempty" xml:"consignor_freight_amount,omitempty"`
	// 建单时间，13位毫秒级时间戳
	CreatedTime *int64 `json:"created_time,omitempty" xml:"created_time,omitempty"`
	// 到达门点时间，13位毫秒级时间戳
	DestDoorsEndTime *string `json:"dest_doors_end_time,omitempty" xml:"dest_doors_end_time,omitempty"`
	// 门点城市CODE，6位区域行政编码
	DoorsCityCode *string `json:"doors_city_code,omitempty" xml:"doors_city_code,omitempty"`
	// 门点城市名称
	DoorsCityName *string `json:"doors_city_name,omitempty" xml:"doors_city_name,omitempty"`
	// 门点区县CODE，6位区域行政编码
	DoorsCountyCode *string `json:"doors_county_code,omitempty" xml:"doors_county_code,omitempty"`
	// 门点区县名称
	DoorsCountyName *string `json:"doors_county_name,omitempty" xml:"doors_county_name,omitempty"`
	// 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	DoorsDivisionCode *string `json:"doors_division_code,omitempty" xml:"doors_division_code,omitempty"`
	// 门点省份CODE，6位行政区域编码
	DoorsProvinceCode *string `json:"doors_province_code,omitempty" xml:"doors_province_code,omitempty"`
	// 门点省份名称
	DoorsProvinceName *string `json:"doors_province_name,omitempty" xml:"doors_province_name,omitempty"`
	// 发货方名称
	Drawee *string `json:"drawee,omitempty" xml:"drawee,omitempty"`
	// 发货方纳税人识别号
	DraweeTaxNo *string `json:"drawee_tax_no,omitempty" xml:"drawee_tax_no,omitempty"`
	// 司机分布式数字身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 目的地详细地址
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地城市CODE，6位区域行政编码
	EndCityCode *string `json:"end_city_code,omitempty" xml:"end_city_code,omitempty"`
	// 目的地城市名称
	EndCityName *string `json:"end_city_name,omitempty" xml:"end_city_name,omitempty"`
	// 目的地区县CODE
	EndCountyCode *string `json:"end_county_code,omitempty" xml:"end_county_code,omitempty"`
	// 目的地区县名称，6位区域行政编码
	EndCountyName *string `json:"end_county_name,omitempty" xml:"end_county_name,omitempty"`
	// 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	EndDivisionCode *string `json:"end_division_code,omitempty" xml:"end_division_code,omitempty"`
	// 目的地省份CODE，6位区域行政编码
	EndProvinceCode *string `json:"end_province_code,omitempty" xml:"end_province_code,omitempty"`
	// 目的地省份名称
	EndProvinceName *string `json:"end_province_name,omitempty" xml:"end_province_name,omitempty"`
	// 目的地街道CODE，12位区域行政编码
	EndStreetCode *string `json:"end_street_code,omitempty" xml:"end_street_code,omitempty"`
	// 目的地街道名称
	EndStreetName *string `json:"end_street_name,omitempty" xml:"end_street_name,omitempty"`
	// 终结时间，13位毫秒级时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 运费增项
	FreightIncr *string `json:"freight_incr,omitempty" xml:"freight_incr,omitempty"`
	// 货物数量
	GoodsAmount *int64 `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 货物名称
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
	// 运费扣减
	LossFee *string `json:"loss_fee,omitempty" xml:"loss_fee,omitempty"`
	// 网商识别号
	PartnerId *string `json:"partner_id,omitempty" xml:"partner_id,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	//
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预付款金额
	Prepayments *string `json:"prepayments,omitempty" xml:"prepayments,omitempty"`
	// 线下预付ETC
	PrepaymentsBuyEtc *string `json:"prepayments_buy_etc,omitempty" xml:"prepayments_buy_etc,omitempty"`
	// 线下气款金额
	PrepaymentsBuyGas *string `json:"prepayments_buy_gas,omitempty" xml:"prepayments_buy_gas,omitempty"`
	// 线下油款预付
	PrepaymentsBuyOil *string `json:"prepayments_buy_oil,omitempty" xml:"prepayments_buy_oil,omitempty"`
	// 预付ETC卡金额
	PrepaymentsEtccard *string `json:"prepayments_etccard,omitempty" xml:"prepayments_etccard,omitempty"`
	// 预付油卡金额
	PrepaymentsOilcard *string `json:"prepayments_oilcard,omitempty" xml:"prepayments_oilcard,omitempty"`
	// 油卡赠送金额
	PresentAmountOil *string `json:"present_amount_oil,omitempty" xml:"present_amount_oil,omitempty"`
	// 起始地详细地址
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地CODE，6位区域行政编码
	StartCityCode *string `json:"start_city_code,omitempty" xml:"start_city_code,omitempty"`
	// 起始地城市名称
	StartCityName *string `json:"start_city_name,omitempty" xml:"start_city_name,omitempty"`
	// 起始地区县CODE，6位区域行政编码
	StartCountyCode *string `json:"start_county_code,omitempty" xml:"start_county_code,omitempty"`
	// 起始地区县名称
	StartCountyName *string `json:"start_county_name,omitempty" xml:"start_county_name,omitempty"`
	// 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
	StartDivisionCode *string `json:"start_division_code,omitempty" xml:"start_division_code,omitempty"`
	// 起始地省份CODE，6位区域行政编码
	StartProvinceCode *string `json:"start_province_code,omitempty" xml:"start_province_code,omitempty"`
	// 起始地省份名称
	StartProvinceName *string `json:"start_province_name,omitempty" xml:"start_province_name,omitempty"`
	// 起始地街道CODE，12位区域行政编码
	StartStreetCode *string `json:"start_street_code,omitempty" xml:"start_street_code,omitempty"`
	// 起始地街道名称
	StartStreetName *string `json:"start_street_name,omitempty" xml:"start_street_name,omitempty"`
	// 起运时间戳，13位毫秒级时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 运单id
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
	TruckLength *string `json:"truck_length,omitempty" xml:"truck_length,omitempty"`
	// 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
	TruckType *string `json:"truck_type,omitempty" xml:"truck_type,omitempty"`
	// 运输单价
	UnitPrice *string `json:"unit_price,omitempty" xml:"unit_price,omitempty"`
}

func (s UpdateDigitalLogisticFinanceWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticFinanceWaybillRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetAuthToken(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetRegionName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetAllFreight(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.AllFreight = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetBackFee(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.BackFee = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetBusinessType(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.BusinessType = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoBusinessCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoBusinessCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoInsuranceMoney(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoOrder(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoOrder = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoUnit(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoUnit = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoVolume(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoVolume = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCargoWeight(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CargoWeight = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCartBadgeColor(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CartBadgeColor = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCartBadgeNo(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CartBadgeNo = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCarCaptainDid(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CarCaptainDid = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetConsignorFreightAmount(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.ConsignorFreightAmount = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetCreatedTime(v int64) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.CreatedTime = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDestDoorsEndTime(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DestDoorsEndTime = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsCityCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsCityCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsCityName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsCityName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsCountyCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsCountyCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsCountyName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsCountyName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsDivisionCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsDivisionCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsProvinceCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsProvinceCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDoorsProvinceName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DoorsProvinceName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDrawee(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.Drawee = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDraweeTaxNo(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DraweeTaxNo = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetDriverDid(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.DriverDid = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndAddress(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndAddress = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndCityCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndCityCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndCityName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndCityName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndCountyCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndCountyCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndCountyName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndCountyName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndDivisionCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndDivisionCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndProvinceCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndProvinceCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndProvinceName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndProvinceName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndStreetCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndStreetCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndStreetName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndStreetName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetEndTime(v int64) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.EndTime = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetFreightIncr(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.FreightIncr = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetGoodsAmount(v int64) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.GoodsAmount = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetGoodsAmountType(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetGoodsName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.GoodsName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetLossFee(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.LossFee = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPartnerId(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PartnerId = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPlatformDid(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PlatformDid = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepayments(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.Prepayments = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepaymentsBuyEtc(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PrepaymentsBuyEtc = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepaymentsBuyGas(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PrepaymentsBuyGas = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepaymentsBuyOil(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PrepaymentsBuyOil = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepaymentsEtccard(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PrepaymentsEtccard = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPrepaymentsOilcard(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PrepaymentsOilcard = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetPresentAmountOil(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.PresentAmountOil = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartAddress(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartAddress = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartCityCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartCityCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartCityName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartCityName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartCountyCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartCountyCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartCountyName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartCountyName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartDivisionCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartDivisionCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartProvinceCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartProvinceCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartProvinceName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartProvinceName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartStreetCode(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartStreetCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartStreetName(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartStreetName = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetStartTime(v int64) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.StartTime = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetTaxWaybillId(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetTruckLength(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.TruckLength = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetTruckType(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.TruckType = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillRequest) SetUnitPrice(v string) *UpdateDigitalLogisticFinanceWaybillRequest {
	s.UnitPrice = &v
	return s
}

type UpdateDigitalLogisticFinanceWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源支付链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticFinanceWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticFinanceWaybillResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticFinanceWaybillResponse) SetReqMsgId(v string) *UpdateDigitalLogisticFinanceWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillResponse) SetResultCode(v string) *UpdateDigitalLogisticFinanceWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillResponse) SetResultMsg(v string) *UpdateDigitalLogisticFinanceWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticFinanceWaybillResponse) SetTxCode(v string) *UpdateDigitalLogisticFinanceWaybillResponse {
	s.TxCode = &v
	return s
}

type StartDigitalLogisticFinanceWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货物运费险
	CargoInsuranceMoney *string `json:"cargo_insurance_money,omitempty" xml:"cargo_insurance_money,omitempty"`
	// 车牌颜色
	CartBadgeColor *string `json:"cart_badge_color,omitempty" xml:"cart_badge_color,omitempty"`
	// 车牌号
	CartBadgeNo *string `json:"cart_badge_no,omitempty" xml:"cart_badge_no,omitempty"`
	// 承运商did
	CarCaptainDid *string `json:"car_captain_did,omitempty" xml:"car_captain_did,omitempty"`
	// 司机分布式数字身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 起运时间，13位毫秒级时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 运单id
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s StartDigitalLogisticFinanceWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s StartDigitalLogisticFinanceWaybillRequest) GoString() string {
	return s.String()
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetAuthToken(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetProductInstanceId(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetRegionName(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetCargoInsuranceMoney(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.CargoInsuranceMoney = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetCartBadgeColor(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.CartBadgeColor = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetCartBadgeNo(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.CartBadgeNo = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetCarCaptainDid(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.CarCaptainDid = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetDriverDid(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.DriverDid = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetPlatformDid(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.PlatformDid = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetStartTime(v int64) *StartDigitalLogisticFinanceWaybillRequest {
	s.StartTime = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillRequest) SetTaxWaybillId(v string) *StartDigitalLogisticFinanceWaybillRequest {
	s.TaxWaybillId = &v
	return s
}

type StartDigitalLogisticFinanceWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货源支付链上凭证
	//
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s StartDigitalLogisticFinanceWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s StartDigitalLogisticFinanceWaybillResponse) GoString() string {
	return s.String()
}

func (s *StartDigitalLogisticFinanceWaybillResponse) SetReqMsgId(v string) *StartDigitalLogisticFinanceWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillResponse) SetResultCode(v string) *StartDigitalLogisticFinanceWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillResponse) SetResultMsg(v string) *StartDigitalLogisticFinanceWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartDigitalLogisticFinanceWaybillResponse) SetTxCode(v string) *StartDigitalLogisticFinanceWaybillResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticCaptainDisRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 所属平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
}

func (s CreateDigitalLogisticCaptainDisRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCaptainDisRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetAuthToken(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetRegionName(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetCertNo(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.CertNo = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetExtensionInfo(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetMobile(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.Mobile = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetName(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.Name = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisRequest) SetPlatformDid(v string) *CreateDigitalLogisticCaptainDisRequest {
	s.PlatformDid = &v
	return s
}

type CreateDigitalLogisticCaptainDisResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 车队长did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticCaptainDisResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCaptainDisResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCaptainDisResponse) SetReqMsgId(v string) *CreateDigitalLogisticCaptainDisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisResponse) SetResultCode(v string) *CreateDigitalLogisticCaptainDisResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisResponse) SetResultMsg(v string) *CreateDigitalLogisticCaptainDisResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCaptainDisResponse) SetDid(v string) *CreateDigitalLogisticCaptainDisResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticCargowaybillBillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主账单总额（两位小数）
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 账单code（唯一标识）
	BillCode *string `json:"bill_code,omitempty" xml:"bill_code,omitempty"`
	// 账单生成时间(毫秒)
	BillCreateTime *int64 `json:"bill_create_time,omitempty" xml:"bill_create_time,omitempty"`
	// 账单期限
	BillDeadline *string `json:"bill_deadline,omitempty" xml:"bill_deadline,omitempty"`
	// 付款方did
	BillPayerDid *string `json:"bill_payer_did,omitempty" xml:"bill_payer_did,omitempty"`
	// 货源单号-货主运费列表
	CargoAmounts []*CargoAmount `json:"cargo_amounts,omitempty" xml:"cargo_amounts,omitempty" type:"Repeated"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 货主支付方式-支付金额列表
	PayAmounts []*PayAmount `json:"pay_amounts,omitempty" xml:"pay_amounts,omitempty" type:"Repeated"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预计货主付款日期
	PreConsignorPayDate *int64 `json:"pre_consignor_pay_date,omitempty" xml:"pre_consignor_pay_date,omitempty"`
	// 运单号-司机运费列表
	WaybillAmounts []*WaybillAmount `json:"waybill_amounts,omitempty" xml:"waybill_amounts,omitempty" type:"Repeated"`
	// 账单到期日期
	Deadline *int64 `json:"deadline,omitempty" xml:"deadline,omitempty"`
	// 运单上传状态，可填写：已完成、未完成
	WaybillUploadStatus *string `json:"waybill_upload_status,omitempty" xml:"waybill_upload_status,omitempty"`
}

func (s CreateDigitalLogisticCargowaybillBillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargowaybillBillRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetAuthToken(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetRegionName(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetBillAmount(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.BillAmount = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetBillCode(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.BillCode = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetBillCreateTime(v int64) *CreateDigitalLogisticCargowaybillBillRequest {
	s.BillCreateTime = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetBillDeadline(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.BillDeadline = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetBillPayerDid(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.BillPayerDid = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetCargoAmounts(v []*CargoAmount) *CreateDigitalLogisticCargowaybillBillRequest {
	s.CargoAmounts = v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetCurrency(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.Currency = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetPayAmounts(v []*PayAmount) *CreateDigitalLogisticCargowaybillBillRequest {
	s.PayAmounts = v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetPlatformDid(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetPreConsignorPayDate(v int64) *CreateDigitalLogisticCargowaybillBillRequest {
	s.PreConsignorPayDate = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetWaybillAmounts(v []*WaybillAmount) *CreateDigitalLogisticCargowaybillBillRequest {
	s.WaybillAmounts = v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetDeadline(v int64) *CreateDigitalLogisticCargowaybillBillRequest {
	s.Deadline = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillRequest) SetWaybillUploadStatus(v string) *CreateDigitalLogisticCargowaybillBillRequest {
	s.WaybillUploadStatus = &v
	return s
}

type CreateDigitalLogisticCargowaybillBillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticCargowaybillBillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargowaybillBillResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargowaybillBillResponse) SetReqMsgId(v string) *CreateDigitalLogisticCargowaybillBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillResponse) SetResultCode(v string) *CreateDigitalLogisticCargowaybillBillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillResponse) SetResultMsg(v string) *CreateDigitalLogisticCargowaybillBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillResponse) SetTxCode(v string) *CreateDigitalLogisticCargowaybillBillResponse {
	s.TxCode = &v
	return s
}

type ConfirmDigitalLogisticCargowaybillBillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账单金额（两位小数）
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 账单code（账单唯一标识）
	BillCode *string `json:"bill_code,omitempty" xml:"bill_code,omitempty"`
	// 账单确认货主did
	BillConsignorDid *string `json:"bill_consignor_did,omitempty" xml:"bill_consignor_did,omitempty"`
	// 账单确认日期（毫秒）
	BillSureDate *int64 `json:"bill_sure_date,omitempty" xml:"bill_sure_date,omitempty"`
	// 是否结算
	WhetherSettle *bool `json:"whether_settle,omitempty" xml:"whether_settle,omitempty"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
}

func (s ConfirmDigitalLogisticCargowaybillBillRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmDigitalLogisticCargowaybillBillRequest) GoString() string {
	return s.String()
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetAuthToken(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetProductInstanceId(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetRegionName(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.RegionName = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetBillAmount(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.BillAmount = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetBillCode(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.BillCode = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetBillConsignorDid(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.BillConsignorDid = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetBillSureDate(v int64) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.BillSureDate = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetWhetherSettle(v bool) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.WhetherSettle = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillRequest) SetPlatformDid(v string) *ConfirmDigitalLogisticCargowaybillBillRequest {
	s.PlatformDid = &v
	return s
}

type ConfirmDigitalLogisticCargowaybillBillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s ConfirmDigitalLogisticCargowaybillBillResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmDigitalLogisticCargowaybillBillResponse) GoString() string {
	return s.String()
}

func (s *ConfirmDigitalLogisticCargowaybillBillResponse) SetReqMsgId(v string) *ConfirmDigitalLogisticCargowaybillBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillResponse) SetResultCode(v string) *ConfirmDigitalLogisticCargowaybillBillResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillResponse) SetResultMsg(v string) *ConfirmDigitalLogisticCargowaybillBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmDigitalLogisticCargowaybillBillResponse) SetTxCode(v string) *ConfirmDigitalLogisticCargowaybillBillResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticCargowaybillBillsettleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 账单code（账单唯一标识）
	BillCode *string `json:"bill_code,omitempty" xml:"bill_code,omitempty"`
	// 结算金额（2位小数）
	SettleAmount *string `json:"settle_amount,omitempty" xml:"settle_amount,omitempty"`
	// 结算状态（只有2种状态：部分结算、已结清）
	SettleStatus *string `json:"settle_status,omitempty" xml:"settle_status,omitempty"`
}

func (s CreateDigitalLogisticCargowaybillBillsettleRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargowaybillBillsettleRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetAuthToken(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetRegionName(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetPlatformDid(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetBillCode(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.BillCode = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetSettleAmount(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.SettleAmount = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleRequest) SetSettleStatus(v string) *CreateDigitalLogisticCargowaybillBillsettleRequest {
	s.SettleStatus = &v
	return s
}

type CreateDigitalLogisticCargowaybillBillsettleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticCargowaybillBillsettleResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCargowaybillBillsettleResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCargowaybillBillsettleResponse) SetReqMsgId(v string) *CreateDigitalLogisticCargowaybillBillsettleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleResponse) SetResultCode(v string) *CreateDigitalLogisticCargowaybillBillsettleResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleResponse) SetResultMsg(v string) *CreateDigitalLogisticCargowaybillBillsettleResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCargowaybillBillsettleResponse) SetTxCode(v string) *CreateDigitalLogisticCargowaybillBillsettleResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticWaybillorderPlatformdidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 新平台diid
	NewPlatformDid *string `json:"new_platform_did,omitempty" xml:"new_platform_did,omitempty"`
	// 老平台did
	OldPlatformDid *string `json:"old_platform_did,omitempty" xml:"old_platform_did,omitempty"`
	// 运单号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
}

func (s UpdateDigitalLogisticWaybillorderPlatformdidRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticWaybillorderPlatformdidRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetAuthToken(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetRegionName(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetNewPlatformDid(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.NewPlatformDid = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetOldPlatformDid(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.OldPlatformDid = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidRequest) SetTaxWaybillId(v string) *UpdateDigitalLogisticWaybillorderPlatformdidRequest {
	s.TaxWaybillId = &v
	return s
}

type UpdateDigitalLogisticWaybillorderPlatformdidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticWaybillorderPlatformdidResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticWaybillorderPlatformdidResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidResponse) SetReqMsgId(v string) *UpdateDigitalLogisticWaybillorderPlatformdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidResponse) SetResultCode(v string) *UpdateDigitalLogisticWaybillorderPlatformdidResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidResponse) SetResultMsg(v string) *UpdateDigitalLogisticWaybillorderPlatformdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillorderPlatformdidResponse) SetTxCode(v string) *UpdateDigitalLogisticWaybillorderPlatformdidResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticCargowaybillBillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主账单总额（两位小数）
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 账单code（唯一标识）
	BillCode *string `json:"bill_code,omitempty" xml:"bill_code,omitempty"`
	// 账单生成时间(毫秒)
	BillCreateTime *int64 `json:"bill_create_time,omitempty" xml:"bill_create_time,omitempty"`
	// 账单期限
	BillDeadline *string `json:"bill_deadline,omitempty" xml:"bill_deadline,omitempty"`
	// 付款方did
	BillPayerDid *string `json:"bill_payer_did,omitempty" xml:"bill_payer_did,omitempty"`
	// 货源单号-货主运费列表
	CargoAmounts []*CargoAmount `json:"cargo_amounts,omitempty" xml:"cargo_amounts,omitempty" type:"Repeated"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 账单到期日期
	Deadline *int64 `json:"deadline,omitempty" xml:"deadline,omitempty"`
	// 货主支付方式-支付金额列表
	PayAmounts []*PayAmount `json:"pay_amounts,omitempty" xml:"pay_amounts,omitempty" type:"Repeated"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 预计货主付款日期
	PreConsignorPayDate *int64 `json:"pre_consignor_pay_date,omitempty" xml:"pre_consignor_pay_date,omitempty"`
	// 运单号-司机运费列表
	WaybillAmounts []*WaybillAmount `json:"waybill_amounts,omitempty" xml:"waybill_amounts,omitempty" type:"Repeated"`
	// 运单上传状态，可填写：已完成、未完成
	WaybillUploadStatus *string `json:"waybill_upload_status,omitempty" xml:"waybill_upload_status,omitempty"`
}

func (s UpdateDigitalLogisticCargowaybillBillRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticCargowaybillBillRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetAuthToken(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetRegionName(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetBillAmount(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.BillAmount = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetBillCode(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.BillCode = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetBillCreateTime(v int64) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.BillCreateTime = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetBillDeadline(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.BillDeadline = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetBillPayerDid(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.BillPayerDid = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetCargoAmounts(v []*CargoAmount) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.CargoAmounts = v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetCurrency(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.Currency = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetDeadline(v int64) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.Deadline = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetPayAmounts(v []*PayAmount) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.PayAmounts = v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetPlatformDid(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.PlatformDid = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetPreConsignorPayDate(v int64) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.PreConsignorPayDate = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetWaybillAmounts(v []*WaybillAmount) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.WaybillAmounts = v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillRequest) SetWaybillUploadStatus(v string) *UpdateDigitalLogisticCargowaybillBillRequest {
	s.WaybillUploadStatus = &v
	return s
}

type UpdateDigitalLogisticCargowaybillBillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticCargowaybillBillResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticCargowaybillBillResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticCargowaybillBillResponse) SetReqMsgId(v string) *UpdateDigitalLogisticCargowaybillBillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillResponse) SetResultCode(v string) *UpdateDigitalLogisticCargowaybillBillResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillResponse) SetResultMsg(v string) *UpdateDigitalLogisticCargowaybillBillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticCargowaybillBillResponse) SetTxCode(v string) *UpdateDigitalLogisticCargowaybillBillResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticDisDidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 个人身份证号。当组织类型为个人时，此字段为必填项
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 企业名称。当组织类型为企业时，此字段为必填项
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业信用号码。当组织类型为企业时，此字段为必填项
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 个人手机号码。当组织类型为个人时，此字段为必填项
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 个人姓名。当组织类型为个人时，此字段为必填项
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 组织类型。企业或者个人，二选一填入
	OrganizationType *string `json:"organization_type,omitempty" xml:"organization_type,omitempty"`
	// 所属承运平台did。在申请“网络货运平台”角色的时候，这个字段非必填；申请其他角色类型时，此字段必填
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 角色类型。
	// 当组织类型为个人时，可填角色：货主、司机、承运商；
	// 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
}

func (s CreateDigitalLogisticDisDidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDisDidRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDisDidRequest) SetAuthToken(v string) *CreateDigitalLogisticDisDidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDisDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetRegionName(v string) *CreateDigitalLogisticDisDidRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetCertNo(v string) *CreateDigitalLogisticDisDidRequest {
	s.CertNo = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetEpCertName(v string) *CreateDigitalLogisticDisDidRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetEpCertNo(v string) *CreateDigitalLogisticDisDidRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDisDidRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticDisDidRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticDisDidRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetMobile(v string) *CreateDigitalLogisticDisDidRequest {
	s.Mobile = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetName(v string) *CreateDigitalLogisticDisDidRequest {
	s.Name = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetOrganizationType(v string) *CreateDigitalLogisticDisDidRequest {
	s.OrganizationType = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetPlatformDid(v string) *CreateDigitalLogisticDisDidRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticDisDidRequest) SetRoleType(v string) *CreateDigitalLogisticDisDidRequest {
	s.RoleType = &v
	return s
}

type CreateDigitalLogisticDisDidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分布式数字身份did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 组织类型
	OrganizationType *string `json:"organization_type,omitempty" xml:"organization_type,omitempty"`
	// 现阶段此did下的所有授予的角色
	RoleTypes []*string `json:"role_types,omitempty" xml:"role_types,omitempty" type:"Repeated"`
}

func (s CreateDigitalLogisticDisDidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDisDidResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDisDidResponse) SetReqMsgId(v string) *CreateDigitalLogisticDisDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDisDidResponse) SetResultCode(v string) *CreateDigitalLogisticDisDidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDisDidResponse) SetResultMsg(v string) *CreateDigitalLogisticDisDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDisDidResponse) SetDid(v string) *CreateDigitalLogisticDisDidResponse {
	s.Did = &v
	return s
}

func (s *CreateDigitalLogisticDisDidResponse) SetOrganizationType(v string) *CreateDigitalLogisticDisDidResponse {
	s.OrganizationType = &v
	return s
}

func (s *CreateDigitalLogisticDisDidResponse) SetRoleTypes(v []*string) *CreateDigitalLogisticDisDidResponse {
	s.RoleTypes = v
	return s
}

type UploadDigitalLogisticTransportContractRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主did，一般为合同甲方的链上数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 运输合同生效日期，格式要求yyyy-MM-dd
	ContractEffectiveDate *string `json:"contract_effective_date,omitempty" xml:"contract_effective_date,omitempty"`
	// 运输合同到期日期，要求格式yyyy-MM-dd
	ContractExpiresDate *string `json:"contract_expires_date,omitempty" xml:"contract_expires_date,omitempty"`
	// 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
	FileInfos []*UploadFileInfo `json:"file_infos,omitempty" xml:"file_infos,omitempty" type:"Repeated"`
	// 3plDid，一般为合同乙方的链上数字身份
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
	// 运输合同编号
	TransportContractCode *string `json:"transport_contract_code,omitempty" xml:"transport_contract_code,omitempty"`
}

func (s UploadDigitalLogisticTransportContractRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportContractRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportContractRequest) SetAuthToken(v string) *UploadDigitalLogisticTransportContractRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetProductInstanceId(v string) *UploadDigitalLogisticTransportContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetRegionName(v string) *UploadDigitalLogisticTransportContractRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetConsignorDid(v string) *UploadDigitalLogisticTransportContractRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetContractEffectiveDate(v string) *UploadDigitalLogisticTransportContractRequest {
	s.ContractEffectiveDate = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetContractExpiresDate(v string) *UploadDigitalLogisticTransportContractRequest {
	s.ContractExpiresDate = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetFileInfos(v []*UploadFileInfo) *UploadDigitalLogisticTransportContractRequest {
	s.FileInfos = v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetThirdPartyLogisticsDid(v string) *UploadDigitalLogisticTransportContractRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractRequest) SetTransportContractCode(v string) *UploadDigitalLogisticTransportContractRequest {
	s.TransportContractCode = &v
	return s
}

type UploadDigitalLogisticTransportContractResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UploadDigitalLogisticTransportContractResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportContractResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportContractResponse) SetReqMsgId(v string) *UploadDigitalLogisticTransportContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractResponse) SetResultCode(v string) *UploadDigitalLogisticTransportContractResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractResponse) SetResultMsg(v string) *UploadDigitalLogisticTransportContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticTransportContractResponse) SetTxCode(v string) *UploadDigitalLogisticTransportContractResponse {
	s.TxCode = &v
	return s
}

type UploadDigitalLogisticTransportRouteRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地详细地址，街道村社区道路楼宇门牌号
	EndDetailedAddress *string `json:"end_detailed_address,omitempty" xml:"end_detailed_address,omitempty"`
	// 起始地省市区，要求格式  XX省-XX市-XX区。比如浙江省-杭州市-余杭区
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地详细地址，街道村社区道路楼宇门牌号
	StartDetailedAddress *string `json:"start_detailed_address,omitempty" xml:"start_detailed_address,omitempty"`
	// 3plDid
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
	// 运输合同编号
	TransportContractCode *string `json:"transport_contract_code,omitempty" xml:"transport_contract_code,omitempty"`
	// 运输线路编码
	TransportRouteCode *string `json:"transport_route_code,omitempty" xml:"transport_route_code,omitempty"`
}

func (s UploadDigitalLogisticTransportRouteRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportRouteRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetAuthToken(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetProductInstanceId(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetRegionName(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetEndAddress(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.EndAddress = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetEndDetailedAddress(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.EndDetailedAddress = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetStartAddress(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.StartAddress = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetStartDetailedAddress(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.StartDetailedAddress = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetThirdPartyLogisticsDid(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetTransportContractCode(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.TransportContractCode = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteRequest) SetTransportRouteCode(v string) *UploadDigitalLogisticTransportRouteRequest {
	s.TransportRouteCode = &v
	return s
}

type UploadDigitalLogisticTransportRouteResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UploadDigitalLogisticTransportRouteResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportRouteResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportRouteResponse) SetReqMsgId(v string) *UploadDigitalLogisticTransportRouteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteResponse) SetResultCode(v string) *UploadDigitalLogisticTransportRouteResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteResponse) SetResultMsg(v string) *UploadDigitalLogisticTransportRouteResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticTransportRouteResponse) SetTxCode(v string) *UploadDigitalLogisticTransportRouteResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticTransportWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 货物名称
	CargoName *string `json:"cargo_name,omitempty" xml:"cargo_name,omitempty"`
	// 货物体积，单位（方）。货物重量、货物体积二选一填写
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 货物重量，单位（吨）。货物重量、货物体积二选一填写
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 下游承运商did，一般为下一级承运商数字身份
	CarrierDid *string `json:"carrier_did,omitempty" xml:"carrier_did,omitempty"`
	// 车牌颜色，需填写黄色、蓝色、绿色中的一种
	CarBadgeColor *string `json:"car_badge_color,omitempty" xml:"car_badge_color,omitempty"`
	// 车牌号，承运车牌号
	CarBadgeNo *string `json:"car_badge_no,omitempty" xml:"car_badge_no,omitempty"`
	// 货主did，一般为合同甲方的链上数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 创建时间，13位毫秒级时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 实际承运司机did，实际承运司机的链上数字身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地详细地址，街道村社区道路楼宇门牌号
	EndDetailedAddress *string `json:"end_detailed_address,omitempty" xml:"end_detailed_address,omitempty"`
	// 货物数量
	GoodsAmount *int64 `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地详细地址，街道村社区道路楼宇门牌号
	StartDetailedAddress *string `json:"start_detailed_address,omitempty" xml:"start_detailed_address,omitempty"`
	// 客户系统内运单编号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 3plDid，一般为合同乙方的链上数字身份
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
	// 所属合同编号
	TransportContractCode *string `json:"transport_contract_code,omitempty" xml:"transport_contract_code,omitempty"`
	// 所属运输线路编码
	TransportRouteCode *string `json:"transport_route_code,omitempty" xml:"transport_route_code,omitempty"`
}

func (s CreateDigitalLogisticTransportWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticTransportWaybillRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetAuthToken(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetProductInstanceId(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetRegionName(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetAllFreight(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.AllFreight = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCargoName(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CargoName = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCargoVolume(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CargoVolume = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCargoWeight(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CargoWeight = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCarrierDid(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CarrierDid = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCarBadgeColor(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CarBadgeColor = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCarBadgeNo(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.CarBadgeNo = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetConsignorDid(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.ConsignorDid = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetCreateTime(v int64) *CreateDigitalLogisticTransportWaybillRequest {
	s.CreateTime = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetDriverDid(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.DriverDid = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetEndAddress(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.EndAddress = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetEndDetailedAddress(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.EndDetailedAddress = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetGoodsAmount(v int64) *CreateDigitalLogisticTransportWaybillRequest {
	s.GoodsAmount = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetGoodsAmountType(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetStartAddress(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.StartAddress = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetStartDetailedAddress(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.StartDetailedAddress = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetTaxWaybillId(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetThirdPartyLogisticsDid(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetTransportContractCode(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.TransportContractCode = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillRequest) SetTransportRouteCode(v string) *CreateDigitalLogisticTransportWaybillRequest {
	s.TransportRouteCode = &v
	return s
}

type CreateDigitalLogisticTransportWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticTransportWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticTransportWaybillResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticTransportWaybillResponse) SetReqMsgId(v string) *CreateDigitalLogisticTransportWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillResponse) SetResultCode(v string) *CreateDigitalLogisticTransportWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillResponse) SetResultMsg(v string) *CreateDigitalLogisticTransportWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticTransportWaybillResponse) SetTxCode(v string) *CreateDigitalLogisticTransportWaybillResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticWaybillActionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作类型，以下二选一填写：运单起运、运输完成
	OperateAction *string `json:"operate_action,omitempty" xml:"operate_action,omitempty"`
	// 运单起运或运输完成的时间，要求为13位毫秒级时间戳
	OperateActionTime *int64 `json:"operate_action_time,omitempty" xml:"operate_action_time,omitempty"`
	// 客户系统内运单编号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 3plDid，一般为合同乙方的链上数字身份
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
}

func (s UpdateDigitalLogisticWaybillActionRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticWaybillActionRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetAuthToken(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetRegionName(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetOperateAction(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.OperateAction = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetOperateActionTime(v int64) *UpdateDigitalLogisticWaybillActionRequest {
	s.OperateActionTime = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetTaxWaybillId(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionRequest) SetThirdPartyLogisticsDid(v string) *UpdateDigitalLogisticWaybillActionRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

type UpdateDigitalLogisticWaybillActionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticWaybillActionResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticWaybillActionResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticWaybillActionResponse) SetReqMsgId(v string) *UpdateDigitalLogisticWaybillActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionResponse) SetResultCode(v string) *UpdateDigitalLogisticWaybillActionResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionResponse) SetResultMsg(v string) *UpdateDigitalLogisticWaybillActionResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticWaybillActionResponse) SetTxCode(v string) *UpdateDigitalLogisticWaybillActionResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticTransportWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
	AllFreight *string `json:"all_freight,omitempty" xml:"all_freight,omitempty"`
	// 货物名称
	CargoName *string `json:"cargo_name,omitempty" xml:"cargo_name,omitempty"`
	// 单位（方），货物体积
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty"`
	// 单位（吨），货物重量
	CargoWeight *string `json:"cargo_weight,omitempty" xml:"cargo_weight,omitempty"`
	// 下游承运商did，一般为下一级承运商数字身份
	CarrierDid *string `json:"carrier_did,omitempty" xml:"carrier_did,omitempty"`
	// 车牌颜色，需填写黄色、蓝色、绿色中的一种
	CarBadgeColor *string `json:"car_badge_color,omitempty" xml:"car_badge_color,omitempty"`
	// 车牌号，承运车牌号
	CarBadgeNo *string `json:"car_badge_no,omitempty" xml:"car_badge_no,omitempty"`
	// 货主did，一般为合同甲方的链上数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 创建时间，13位毫秒级时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 实际承运司机did，实际承运司机的链上数字身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
	EndAddress *string `json:"end_address,omitempty" xml:"end_address,omitempty"`
	// 目的地详细地址，街道村社区道路楼宇门牌号
	EndDetailedAddress *string `json:"end_detailed_address,omitempty" xml:"end_detailed_address,omitempty"`
	// 到达时间，13位毫秒级时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 货物数量
	GoodsAmount *int64 `json:"goods_amount,omitempty" xml:"goods_amount,omitempty"`
	// 货物数量单位类型
	GoodsAmountType *string `json:"goods_amount_type,omitempty" xml:"goods_amount_type,omitempty"`
	// 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
	StartAddress *string `json:"start_address,omitempty" xml:"start_address,omitempty"`
	// 起始地详细地址，街道村社区道路楼宇门牌号
	StartDetailedAddress *string `json:"start_detailed_address,omitempty" xml:"start_detailed_address,omitempty"`
	// 起运时间，13位毫秒级时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 客户系统内运单编号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 3plDid，一般为合同乙方的链上数字身份
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
	// 所属合同编号
	TransportContractCode *string `json:"transport_contract_code,omitempty" xml:"transport_contract_code,omitempty"`
	// 所属运输线路编码
	TransportRouteCode *string `json:"transport_route_code,omitempty" xml:"transport_route_code,omitempty"`
}

func (s UpdateDigitalLogisticTransportWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticTransportWaybillRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetAuthToken(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetRegionName(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetAllFreight(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.AllFreight = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCargoName(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CargoName = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCargoVolume(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CargoVolume = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCargoWeight(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CargoWeight = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCarrierDid(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CarrierDid = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCarBadgeColor(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CarBadgeColor = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCarBadgeNo(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CarBadgeNo = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetConsignorDid(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetCreateTime(v int64) *UpdateDigitalLogisticTransportWaybillRequest {
	s.CreateTime = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetDriverDid(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.DriverDid = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetEndAddress(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.EndAddress = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetEndDetailedAddress(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.EndDetailedAddress = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetEndTime(v int64) *UpdateDigitalLogisticTransportWaybillRequest {
	s.EndTime = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetGoodsAmount(v int64) *UpdateDigitalLogisticTransportWaybillRequest {
	s.GoodsAmount = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetGoodsAmountType(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.GoodsAmountType = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetStartAddress(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.StartAddress = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetStartDetailedAddress(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.StartDetailedAddress = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetStartTime(v int64) *UpdateDigitalLogisticTransportWaybillRequest {
	s.StartTime = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetTaxWaybillId(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetThirdPartyLogisticsDid(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetTransportContractCode(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.TransportContractCode = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillRequest) SetTransportRouteCode(v string) *UpdateDigitalLogisticTransportWaybillRequest {
	s.TransportRouteCode = &v
	return s
}

type UpdateDigitalLogisticTransportWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticTransportWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticTransportWaybillResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticTransportWaybillResponse) SetReqMsgId(v string) *UpdateDigitalLogisticTransportWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillResponse) SetResultCode(v string) *UpdateDigitalLogisticTransportWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillResponse) SetResultMsg(v string) *UpdateDigitalLogisticTransportWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticTransportWaybillResponse) SetTxCode(v string) *UpdateDigitalLogisticTransportWaybillResponse {
	s.TxCode = &v
	return s
}

type UploadDigitalLogisticTransportReceiptRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主did，一般为合同甲方的链上数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
	FileInfo *UploadFileInfo `json:"file_info,omitempty" xml:"file_info,omitempty"`
	// 回单id，客户编辑的唯一回单编码
	ReceiptId *string `json:"receipt_id,omitempty" xml:"receipt_id,omitempty"`
	// 客户系统内运单编号
	TaxWaybillId *string `json:"tax_waybill_id,omitempty" xml:"tax_waybill_id,omitempty"`
	// 3plDid，一般为合同乙方的链上数字身份
	ThirdPartyLogisticsDid *string `json:"third_party_logistics_did,omitempty" xml:"third_party_logistics_did,omitempty"`
}

func (s UploadDigitalLogisticTransportReceiptRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportReceiptRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetAuthToken(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetProductInstanceId(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetRegionName(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetConsignorDid(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetFileInfo(v *UploadFileInfo) *UploadDigitalLogisticTransportReceiptRequest {
	s.FileInfo = v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetReceiptId(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.ReceiptId = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetTaxWaybillId(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.TaxWaybillId = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptRequest) SetThirdPartyLogisticsDid(v string) *UploadDigitalLogisticTransportReceiptRequest {
	s.ThirdPartyLogisticsDid = &v
	return s
}

type UploadDigitalLogisticTransportReceiptResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UploadDigitalLogisticTransportReceiptResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticTransportReceiptResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticTransportReceiptResponse) SetReqMsgId(v string) *UploadDigitalLogisticTransportReceiptResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptResponse) SetResultCode(v string) *UploadDigitalLogisticTransportReceiptResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptResponse) SetResultMsg(v string) *UploadDigitalLogisticTransportReceiptResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticTransportReceiptResponse) SetTxCode(v string) *UploadDigitalLogisticTransportReceiptResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticBillReceivablebillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 账单生成时间，13位毫秒级时间戳
	BillCreateTime *int64 `json:"bill_create_time,omitempty" xml:"bill_create_time,omitempty"`
	// 账单期限，单位（天），合同约定的结算周期
	BillDeadline *int64 `json:"bill_deadline,omitempty" xml:"bill_deadline,omitempty"`
	// 账单id，客户生成的账单唯一编号
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty"`
	// 收款方did，账单的收款方数字身份
	BillPayeeDid *string `json:"bill_payee_did,omitempty" xml:"bill_payee_did,omitempty"`
	// 付款方did，账单的付款方数字身份
	BillPayerDid *string `json:"bill_payer_did,omitempty" xml:"bill_payer_did,omitempty"`
	// 账单起始日期，13位毫秒级时间戳
	BillStartTime *int64 `json:"bill_start_time,omitempty" xml:"bill_start_time,omitempty"`
	// 关联合同编号，账单关联的合同编号，如为合同物流请填写
	//
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty"`
	// 账单到期日期，13位毫秒级时间戳
	Deadline *int64 `json:"deadline,omitempty" xml:"deadline,omitempty"`
	// 账单关联运单号数组，元素个数不能超过1000个
	WaybillIds []*string `json:"waybill_ids,omitempty" xml:"waybill_ids,omitempty" type:"Repeated"`
}

func (s CreateDigitalLogisticBillReceivablebillRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillReceivablebillRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetAuthToken(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetProductInstanceId(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetRegionName(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillAmount(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillAmount = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillCreateTime(v int64) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillCreateTime = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillDeadline(v int64) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillDeadline = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillId(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillId = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillPayeeDid(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillPayeeDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillPayerDid(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillPayerDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetBillStartTime(v int64) *CreateDigitalLogisticBillReceivablebillRequest {
	s.BillStartTime = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetContractCode(v string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.ContractCode = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetDeadline(v int64) *CreateDigitalLogisticBillReceivablebillRequest {
	s.Deadline = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillRequest) SetWaybillIds(v []*string) *CreateDigitalLogisticBillReceivablebillRequest {
	s.WaybillIds = v
	return s
}

type CreateDigitalLogisticBillReceivablebillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticBillReceivablebillResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillReceivablebillResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillReceivablebillResponse) SetReqMsgId(v string) *CreateDigitalLogisticBillReceivablebillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillResponse) SetResultCode(v string) *CreateDigitalLogisticBillReceivablebillResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillResponse) SetResultMsg(v string) *CreateDigitalLogisticBillReceivablebillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticBillReceivablebillResponse) SetTxCode(v string) *CreateDigitalLogisticBillReceivablebillResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticReceivablebillStatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账单id，客户生成的账单唯一编号
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty"`
	// 收款方did，账单的收款方数字身份
	BillPayeeDid *string `json:"bill_payee_did,omitempty" xml:"bill_payee_did,omitempty"`
	// 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
	//
	//
	UpdateStatus *string `json:"update_status,omitempty" xml:"update_status,omitempty"`
	// 更新状态时间，13位毫秒级时间戳
	UpdateStatusTime *int64 `json:"update_status_time,omitempty" xml:"update_status_time,omitempty"`
}

func (s UpdateDigitalLogisticReceivablebillStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticReceivablebillStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetAuthToken(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetRegionName(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetBillId(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.BillId = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetBillPayeeDid(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.BillPayeeDid = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetUpdateStatus(v string) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.UpdateStatus = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusRequest) SetUpdateStatusTime(v int64) *UpdateDigitalLogisticReceivablebillStatusRequest {
	s.UpdateStatusTime = &v
	return s
}

type UpdateDigitalLogisticReceivablebillStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticReceivablebillStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticReceivablebillStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticReceivablebillStatusResponse) SetReqMsgId(v string) *UpdateDigitalLogisticReceivablebillStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusResponse) SetResultCode(v string) *UpdateDigitalLogisticReceivablebillStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusResponse) SetResultMsg(v string) *UpdateDigitalLogisticReceivablebillStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticReceivablebillStatusResponse) SetTxCode(v string) *UpdateDigitalLogisticReceivablebillStatusResponse {
	s.TxCode = &v
	return s
}

type UpdateDigitalLogisticBillReceivablebillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
	BillAmount *string `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 账单生成时间，13位毫秒级时间戳
	BillCreateTime *int64 `json:"bill_create_time,omitempty" xml:"bill_create_time,omitempty"`
	// 账单期限，单位（天），合同约定的结算周期
	BillDeadline *int64 `json:"bill_deadline,omitempty" xml:"bill_deadline,omitempty"`
	// 账单id，客户生成的账单唯一编号
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty"`
	// 收款方did，账单的收款方数字身份
	BillPayeeDid *string `json:"bill_payee_did,omitempty" xml:"bill_payee_did,omitempty"`
	// 付款方did，账单的付款方数字身份
	BillPayerDid *string `json:"bill_payer_did,omitempty" xml:"bill_payer_did,omitempty"`
	// 账单起始日期，13位毫秒级时间戳
	BillStartTime *int64 `json:"bill_start_time,omitempty" xml:"bill_start_time,omitempty"`
	// 关联合同编号，账单关联的合同编号，如为合同物流请填写
	ContractCode *string `json:"contract_code,omitempty" xml:"contract_code,omitempty"`
	// 账单到期日期，13位毫秒级时间戳
	Deadline *int64 `json:"deadline,omitempty" xml:"deadline,omitempty"`
	// 账单关联运单号数组，元素个数不能超过1000个
	WaybillIds []*string `json:"waybill_ids,omitempty" xml:"waybill_ids,omitempty" type:"Repeated"`
}

func (s UpdateDigitalLogisticBillReceivablebillRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillReceivablebillRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetAuthToken(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetRegionName(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillAmount(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillAmount = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillCreateTime(v int64) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillCreateTime = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillDeadline(v int64) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillDeadline = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillId(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillId = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillPayeeDid(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillPayeeDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillPayerDid(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillPayerDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetBillStartTime(v int64) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.BillStartTime = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetContractCode(v string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.ContractCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetDeadline(v int64) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.Deadline = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillRequest) SetWaybillIds(v []*string) *UpdateDigitalLogisticBillReceivablebillRequest {
	s.WaybillIds = v
	return s
}

type UpdateDigitalLogisticBillReceivablebillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s UpdateDigitalLogisticBillReceivablebillResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillReceivablebillResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillReceivablebillResponse) SetReqMsgId(v string) *UpdateDigitalLogisticBillReceivablebillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillResponse) SetResultCode(v string) *UpdateDigitalLogisticBillReceivablebillResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillResponse) SetResultMsg(v string) *UpdateDigitalLogisticBillReceivablebillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceivablebillResponse) SetTxCode(v string) *UpdateDigitalLogisticBillReceivablebillResponse {
	s.TxCode = &v
	return s
}

type CreateDigitalLogisticHighwayInvoiceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 发票号码，8位发票号码
	InvoiceNo *string `json:"invoice_no,omitempty" xml:"invoice_no,omitempty"`
	// 发票代码，12位发票代码
	InvoiceCode *string `json:"invoice_code,omitempty" xml:"invoice_code,omitempty"`
	// 发票校验码后6位
	VerifyCode *string `json:"verify_code,omitempty" xml:"verify_code,omitempty"`
	// 收款方did，出票方，需要出票收钱的
	PayeeDid *string `json:"payee_did,omitempty" xml:"payee_did,omitempty"`
	// 付款方did，收票方，需要收票付钱的
	PayerDid *string `json:"payer_did,omitempty" xml:"payer_did,omitempty"`
	// 发票含税金额， 不超过2位小数的数字
	InvoiceContainsTax *string `json:"invoice_contains_tax,omitempty" xml:"invoice_contains_tax,omitempty"`
	// 发票不含税金额，不超过2位小数的数字
	InvoiceWithoutTax *string `json:"invoice_without_tax,omitempty" xml:"invoice_without_tax,omitempty"`
	// 开票日期，格式为yyyy-mm-dd
	InvoiceDate *string `json:"invoice_date,omitempty" xml:"invoice_date,omitempty"`
	// 发票类型，以下二选一填写：应收发票、应付发票
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty"`
	// 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 发票归属平台did，用以区分是哪家平台/企业的发票
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
}

func (s CreateDigitalLogisticHighwayInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticHighwayInvoiceRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetAuthToken(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetProductInstanceId(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetRegionName(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceNo(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceNo = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceCode(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceCode = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetVerifyCode(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.VerifyCode = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetPayeeDid(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.PayeeDid = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetPayerDid(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.PayerDid = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceContainsTax(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceContainsTax = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceWithoutTax(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceWithoutTax = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceDate(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceDate = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetInvoiceType(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetFileId(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.FileId = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetFileHash(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.FileHash = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceRequest) SetPlatformDid(v string) *CreateDigitalLogisticHighwayInvoiceRequest {
	s.PlatformDid = &v
	return s
}

type CreateDigitalLogisticHighwayInvoiceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCode *string `json:"tx_code,omitempty" xml:"tx_code,omitempty"`
}

func (s CreateDigitalLogisticHighwayInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticHighwayInvoiceResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticHighwayInvoiceResponse) SetReqMsgId(v string) *CreateDigitalLogisticHighwayInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceResponse) SetResultCode(v string) *CreateDigitalLogisticHighwayInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceResponse) SetResultMsg(v string) *CreateDigitalLogisticHighwayInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticHighwayInvoiceResponse) SetTxCode(v string) *CreateDigitalLogisticHighwayInvoiceResponse {
	s.TxCode = &v
	return s
}

type OpenDigitalLogisticCreditDriverRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 司机云资金商户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 开通结果回调url
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 司机分布式数字身份
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 产品id 目前填写 PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s OpenDigitalLogisticCreditDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenDigitalLogisticCreditDriverRequest) GoString() string {
	return s.String()
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetAuthToken(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetProductInstanceId(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetRegionName(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.RegionName = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetAccountId(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.AccountId = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetCallbackUrl(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.CallbackUrl = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetDriverDid(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.DriverDid = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetGroupPlatformDid(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverRequest) SetProductId(v string) *OpenDigitalLogisticCreditDriverRequest {
	s.ProductId = &v
	return s
}

type OpenDigitalLogisticCreditDriverResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署开通申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 协议签署开通url
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
	// 签署状态
	// -1:签署开通失败, 0:未签署开通, 1:已签署开通
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s OpenDigitalLogisticCreditDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenDigitalLogisticCreditDriverResponse) GoString() string {
	return s.String()
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetReqMsgId(v string) *OpenDigitalLogisticCreditDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetResultCode(v string) *OpenDigitalLogisticCreditDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetResultMsg(v string) *OpenDigitalLogisticCreditDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetApplyId(v string) *OpenDigitalLogisticCreditDriverResponse {
	s.ApplyId = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetSignUrl(v string) *OpenDigitalLogisticCreditDriverResponse {
	s.SignUrl = &v
	return s
}

func (s *OpenDigitalLogisticCreditDriverResponse) SetStatus(v int64) *OpenDigitalLogisticCreditDriverResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticCreditDriverRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 司机分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 产品id  目前填写PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditDriverRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetRegionName(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetApplyId(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.ApplyId = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetDid(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverRequest) SetProductId(v string) *QueryDigitalLogisticCreditDriverRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditDriverResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 开通失败信息
	QueryMsg *string `json:"query_msg,omitempty" xml:"query_msg,omitempty"`
	// 开通状态
	// -1:失败状态， 0:未完成状态， 1:已完成状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryDigitalLogisticCreditDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditDriverResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditDriverResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverResponse) SetResultCode(v string) *QueryDigitalLogisticCreditDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverResponse) SetQueryMsg(v string) *QueryDigitalLogisticCreditDriverResponse {
	s.QueryMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditDriverResponse) SetStatus(v int64) *QueryDigitalLogisticCreditDriverResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticCreditConsignorRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 货主分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 产品id
	// A模式： PRODUCT_MYBANK,
	// A+模式： PRODUCT_MYBANK_A_PLUS,
	// B模式： PRODUCT_MYBANK_B,
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditConsignorRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditConsignorRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetRegionName(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetApplyId(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.ApplyId = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetDid(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorRequest) SetProductId(v string) *QueryDigitalLogisticCreditConsignorRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditConsignorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 开通失败信息
	QueryMsg *string `json:"query_msg,omitempty" xml:"query_msg,omitempty"`
	// 开通状态
	// -1:失败状态， 0:未完成状态， 1:已完成状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryDigitalLogisticCreditConsignorResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditConsignorResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditConsignorResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditConsignorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorResponse) SetResultCode(v string) *QueryDigitalLogisticCreditConsignorResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditConsignorResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorResponse) SetQueryMsg(v string) *QueryDigitalLogisticCreditConsignorResponse {
	s.QueryMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditConsignorResponse) SetStatus(v int64) *QueryDigitalLogisticCreditConsignorResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticCreditBalanceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主分布式数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 支付单运费，运费最多精确到小数点后2位
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK,
	// A+模式：PRODUCT_MYBANK_A_PLUS,
	// B模式：PRODUCT_MYBANK_B,
	//
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditBalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditBalanceRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetRegionName(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetConsignorDid(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.ConsignorDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetFreight(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.Freight = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceRequest) SetProductId(v string) *QueryDigitalLogisticCreditBalanceRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditBalanceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否有信用流转额度
	HasBalance *bool `json:"has_balance,omitempty" xml:"has_balance,omitempty"`
}

func (s QueryDigitalLogisticCreditBalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditBalanceResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditBalanceResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditBalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceResponse) SetResultCode(v string) *QueryDigitalLogisticCreditBalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditBalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalanceResponse) SetHasBalance(v bool) *QueryDigitalLogisticCreditBalanceResponse {
	s.HasBalance = &v
	return s
}

type UploadDigitalLogisticCreditIssueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 发行结果回调url
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 货主分布式数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 发行信用流转信息列表
	IssueApplyInfos []*IssueApplyInfo `json:"issue_apply_infos,omitempty" xml:"issue_apply_infos,omitempty" type:"Repeated"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id 目前填PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s UploadDigitalLogisticCreditIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssueRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetRegionName(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetBatchId(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetCallbackUrl(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.CallbackUrl = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetConsignorDid(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetIssueApplyInfos(v []*IssueApplyInfo) *UploadDigitalLogisticCreditIssueRequest {
	s.IssueApplyInfos = v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetPlatformDid(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.PlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueRequest) SetProductId(v string) *UploadDigitalLogisticCreditIssueRequest {
	s.ProductId = &v
	return s
}

type UploadDigitalLogisticCreditIssueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchIdStatus *int64 `json:"batch_id_status,omitempty" xml:"batch_id_status,omitempty"`
	// 发行url
	IssueUrl *string `json:"issue_url,omitempty" xml:"issue_url,omitempty"`
}

func (s UploadDigitalLogisticCreditIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssueResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetResultCode(v string) *UploadDigitalLogisticCreditIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditIssueResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetBatchId(v string) *UploadDigitalLogisticCreditIssueResponse {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetBatchIdStatus(v int64) *UploadDigitalLogisticCreditIssueResponse {
	s.BatchIdStatus = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssueResponse) SetIssueUrl(v string) *UploadDigitalLogisticCreditIssueResponse {
	s.IssueUrl = &v
	return s
}

type QueryDigitalLogisticCreditIssuebatchstatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK，
	// A+模式：PRODUCT_MYBANK_A_PLUS，
	// A模式：PRODUCT_MYBANK_B，
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebatchstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebatchstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetBatchId(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.BatchId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuebatchstatusRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuebatchstatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchStatus *int64 `json:"batch_status,omitempty" xml:"batch_status,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebatchstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebatchstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuebatchstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuebatchstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuebatchstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusResponse) SetBatchId(v string) *QueryDigitalLogisticCreditIssuebatchstatusResponse {
	s.BatchId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebatchstatusResponse) SetBatchStatus(v int64) *QueryDigitalLogisticCreditIssuebatchstatusResponse {
	s.BatchStatus = &v
	return s
}

type CancelDigitalLogisticCreditIssuebatchRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 货主分布式数字身份
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK，
	// A+模式：PRODUCT_MYBANK_A_PLUS，
	// B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s CancelDigitalLogisticCreditIssuebatchRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticCreditIssuebatchRequest) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetAuthToken(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetProductInstanceId(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetRegionName(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.RegionName = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetBatchId(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.BatchId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetConsignorDid(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.ConsignorDid = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetGroupPlatformDid(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetPlatformDid(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.PlatformDid = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchRequest) SetProductId(v string) *CancelDigitalLogisticCreditIssuebatchRequest {
	s.ProductId = &v
	return s
}

type CancelDigitalLogisticCreditIssuebatchResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
}

func (s CancelDigitalLogisticCreditIssuebatchResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticCreditIssuebatchResponse) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticCreditIssuebatchResponse) SetReqMsgId(v string) *CancelDigitalLogisticCreditIssuebatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchResponse) SetResultCode(v string) *CancelDigitalLogisticCreditIssuebatchResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchResponse) SetResultMsg(v string) *CancelDigitalLogisticCreditIssuebatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchResponse) SetBatchId(v string) *CancelDigitalLogisticCreditIssuebatchResponse {
	s.BatchId = &v
	return s
}

type QueryDigitalLogisticCreditIssuebyidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 信用流转发行批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 是否只返回已发行凭证信息
	IssuedOnly *bool `json:"issued_only,omitempty" xml:"issued_only,omitempty"`
	// 信用流转发行凭证Id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量 不超过100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK，
	// A+模式：PRODUCT_MYBANK_A_PLUS，
	// B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebyidRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebyidRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetBatchId(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.BatchId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetIssuedOnly(v bool) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.IssuedOnly = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetIssueId(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetPageNum(v int64) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetPageSize(v int64) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuebyidRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuebyidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信用流转批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchIdStatus *string `json:"batch_id_status,omitempty" xml:"batch_id_status,omitempty"`
	// 凭证发行者did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 发行凭证列表
	IssueIds []*IssueIdInfo `json:"issue_ids,omitempty" xml:"issue_ids,omitempty" type:"Repeated"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 数据总量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebyidResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebyidResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetBatchId(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.BatchId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetBatchIdStatus(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.BatchIdStatus = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetDid(v string) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetIssueIds(v []*IssueIdInfo) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.IssueIds = v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetPageNum(v int64) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetPageSize(v int64) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebyidResponse) SetTotalCount(v int64) *QueryDigitalLogisticCreditIssuebyidResponse {
	s.TotalCount = &v
	return s
}

type QueryDigitalLogisticCreditIssuebytimeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 指定查询者分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 查询截止时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 是否只返回已发行凭证信息
	IssuedOnly *bool `json:"issued_only,omitempty" xml:"issued_only,omitempty"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量 不超过100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id 目前填PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 查询起始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebytimeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebytimeRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetDid(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetEndDate(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.EndDate = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetIssuedOnly(v bool) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.IssuedOnly = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetPageNum(v int64) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetPageSize(v int64) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeRequest) SetStartDate(v string) *QueryDigitalLogisticCreditIssuebytimeRequest {
	s.StartDate = &v
	return s
}

type QueryDigitalLogisticCreditIssuebytimeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信用流转批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchIdStatus *int64 `json:"batch_id_status,omitempty" xml:"batch_id_status,omitempty"`
	// 凭证发行者did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 凭证列表
	IssueIds []*IssueIdInfo `json:"issue_ids,omitempty" xml:"issue_ids,omitempty" type:"Repeated"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 数据总量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuebytimeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuebytimeResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetBatchId(v string) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.BatchId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetBatchIdStatus(v int64) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.BatchIdStatus = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetDid(v string) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetIssueIds(v []*IssueIdInfo) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.IssueIds = v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetPageNum(v int64) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetPageSize(v int64) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuebytimeResponse) SetTotalCount(v int64) *QueryDigitalLogisticCreditIssuebytimeResponse {
	s.TotalCount = &v
	return s
}

type QueryDigitalLogisticCreditUserissueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被查询方分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 页数
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示的最大条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditUserissueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditUserissueRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetRegionName(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetDid(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetPageNum(v int64) *QueryDigitalLogisticCreditUserissueRequest {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetPageSize(v int64) *QueryDigitalLogisticCreditUserissueRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueRequest) SetProductId(v string) *QueryDigitalLogisticCreditUserissueRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditUserissueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证所有者分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 信用流转凭证列表
	IssueIds []*UserIssueId `json:"issue_ids,omitempty" xml:"issue_ids,omitempty" type:"Repeated"`
	// 页数
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示最大条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryDigitalLogisticCreditUserissueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditUserissueResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditUserissueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetResultCode(v string) *QueryDigitalLogisticCreditUserissueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditUserissueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetDid(v string) *QueryDigitalLogisticCreditUserissueResponse {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetIssueIds(v []*UserIssueId) *QueryDigitalLogisticCreditUserissueResponse {
	s.IssueIds = v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetPageNum(v int64) *QueryDigitalLogisticCreditUserissueResponse {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetPageSize(v int64) *QueryDigitalLogisticCreditUserissueResponse {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditUserissueResponse) SetTotalCount(v int64) *QueryDigitalLogisticCreditUserissueResponse {
	s.TotalCount = &v
	return s
}

type QueryDigitalLogisticCreditStatementRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 需查询对象分布式数字身份不能为空
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 查询截止时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量 最多100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 查询起始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
}

func (s QueryDigitalLogisticCreditStatementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditStatementRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetRegionName(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetDid(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetEndDate(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.EndDate = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetPageNum(v int64) *QueryDigitalLogisticCreditStatementRequest {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetPageSize(v int64) *QueryDigitalLogisticCreditStatementRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetProductId(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementRequest) SetStartDate(v string) *QueryDigitalLogisticCreditStatementRequest {
	s.StartDate = &v
	return s
}

type QueryDigitalLogisticCreditStatementResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页数 从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页显示数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 流水列表
	StatementInfos []*StatementInfo `json:"statement_infos,omitempty" xml:"statement_infos,omitempty" type:"Repeated"`
	// 数据总量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryDigitalLogisticCreditStatementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditStatementResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditStatementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetResultCode(v string) *QueryDigitalLogisticCreditStatementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditStatementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetPageNum(v int64) *QueryDigitalLogisticCreditStatementResponse {
	s.PageNum = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetPageSize(v int64) *QueryDigitalLogisticCreditStatementResponse {
	s.PageSize = &v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetStatementInfos(v []*StatementInfo) *QueryDigitalLogisticCreditStatementResponse {
	s.StatementInfos = v
	return s
}

func (s *QueryDigitalLogisticCreditStatementResponse) SetTotalCount(v int64) *QueryDigitalLogisticCreditStatementResponse {
	s.TotalCount = &v
	return s
}

type CreateDigitalLogisticCreditIssuetransferRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 转让结果回调url
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 信用流转凭证
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 全局业务号，保证唯一性，如拆分转让业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 转入方分布式数字身份
	PayeeDid *string `json:"payee_did,omitempty" xml:"payee_did,omitempty"`
	// 转出方分布式数字身份
	PayerDid *string `json:"payer_did,omitempty" xml:"payer_did,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id 目前使用PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 转让金额
	TxAmt *string `json:"tx_amt,omitempty" xml:"tx_amt,omitempty"`
}

func (s CreateDigitalLogisticCreditIssuetransferRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditIssuetransferRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetAuthToken(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetRegionName(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetCallbackUrl(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetGroupPlatformDid(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetIssueId(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.IssueId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetOutBizNo(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetPayeeDid(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.PayeeDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetPayerDid(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.PayerDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetPlatformDid(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetProductId(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.ProductId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferRequest) SetTxAmt(v string) *CreateDigitalLogisticCreditIssuetransferRequest {
	s.TxAmt = &v
	return s
}

type CreateDigitalLogisticCreditIssuetransferResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 转让申请成功金额
	SuccessApplyAmt *string `json:"success_apply_amt,omitempty" xml:"success_apply_amt,omitempty"`
	// 请求时传入的全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
}

func (s CreateDigitalLogisticCreditIssuetransferResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditIssuetransferResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditIssuetransferResponse) SetReqMsgId(v string) *CreateDigitalLogisticCreditIssuetransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferResponse) SetResultCode(v string) *CreateDigitalLogisticCreditIssuetransferResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferResponse) SetResultMsg(v string) *CreateDigitalLogisticCreditIssuetransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferResponse) SetSuccessApplyAmt(v string) *CreateDigitalLogisticCreditIssuetransferResponse {
	s.SuccessApplyAmt = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuetransferResponse) SetOutBizNo(v string) *CreateDigitalLogisticCreditIssuetransferResponse {
	s.OutBizNo = &v
	return s
}

type QueryDigitalLogisticCreditIssuetransferRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 全局业务号，保证唯一性，如拆分转让业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id 目前使用PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuetransferRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuetransferRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetOutBizNo(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.OutBizNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuetransferRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuetransferResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 转让失败金额
	FailAmt *string `json:"fail_amt,omitempty" xml:"fail_amt,omitempty"`
	// 信用凭证号
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 请求时传入的全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 转入方分布式数字身份
	PayeeDid *string `json:"payee_did,omitempty" xml:"payee_did,omitempty"`
	// 转出方分布式数字身份
	PayerDid *string `json:"payer_did,omitempty" xml:"payer_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 转让成功金额
	SuccessAmt *string `json:"success_amt,omitempty" xml:"success_amt,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuetransferResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuetransferResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetErrMsg(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.ErrMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetFailAmt(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.FailAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetIssueId(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetOutBizNo(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.OutBizNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetPayeeDid(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.PayeeDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetPayerDid(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.PayerDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetProductId(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetStatus(v int64) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuetransferResponse) SetSuccessAmt(v string) *QueryDigitalLogisticCreditIssuetransferResponse {
	s.SuccessAmt = &v
	return s
}

type CreateDigitalLogisticCreditIssuefinanceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 转让结果回调url
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 信用流转凭证
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 融资申请方分布式数字身份
	LoanerDid *string `json:"loaner_did,omitempty" xml:"loaner_did,omitempty"`
	// 全局业务号，保证唯一性，如融资业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 融资金额
	TxAmt *string `json:"tx_amt,omitempty" xml:"tx_amt,omitempty"`
}

func (s CreateDigitalLogisticCreditIssuefinanceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditIssuefinanceRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetAuthToken(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetRegionName(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetCallbackUrl(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetGroupPlatformDid(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetIssueId(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.IssueId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetLoanerDid(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.LoanerDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetOutBizNo(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetPlatformDid(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.PlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetProductId(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.ProductId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceRequest) SetTxAmt(v string) *CreateDigitalLogisticCreditIssuefinanceRequest {
	s.TxAmt = &v
	return s
}

type CreateDigitalLogisticCreditIssuefinanceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 融资申请失败，回转至无车承运平台金额
	FailApplyAmt *string `json:"fail_apply_amt,omitempty" xml:"fail_apply_amt,omitempty"`
	// 请求时传入的全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 融资申请成功金额
	SuccessApplyAmt *string `json:"success_apply_amt,omitempty" xml:"success_apply_amt,omitempty"`
}

func (s CreateDigitalLogisticCreditIssuefinanceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditIssuefinanceResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetReqMsgId(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetResultCode(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetResultMsg(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetFailApplyAmt(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.FailApplyAmt = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetOutBizNo(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.OutBizNo = &v
	return s
}

func (s *CreateDigitalLogisticCreditIssuefinanceResponse) SetSuccessApplyAmt(v string) *CreateDigitalLogisticCreditIssuefinanceResponse {
	s.SuccessApplyAmt = &v
	return s
}

type QueryDigitalLogisticCreditIssuefinanceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 融资申请方分布式数字身份
	LoanerDid *string `json:"loaner_did,omitempty" xml:"loaner_did,omitempty"`
	// 全局业务号，保证唯一性，如融资业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuefinanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuefinanceRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetLoanerDid(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.LoanerDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetOutBizNo(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.OutBizNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuefinanceRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuefinanceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 融资失败，回转至无车承运平台失败金额
	FailAmt *string `json:"fail_amt,omitempty" xml:"fail_amt,omitempty"`
	// 融资失败，回转至无车承运平台成功金额
	FailTransferAmt *string `json:"fail_transfer_amt,omitempty" xml:"fail_transfer_amt,omitempty"`
	// 请求时传入的全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 融资成功金额
	SuccessAmt *string `json:"success_amt,omitempty" xml:"success_amt,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuefinanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuefinanceResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetErrMsg(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.ErrMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetFailAmt(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.FailAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetFailTransferAmt(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.FailTransferAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetOutBizNo(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.OutBizNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetStatus(v int64) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuefinanceResponse) SetSuccessAmt(v string) *QueryDigitalLogisticCreditIssuefinanceResponse {
	s.SuccessAmt = &v
	return s
}

type QueryDigitalLogisticCreditIssuereceivableRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 信用凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// PRODUCT_MYBANK  、PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuereceivableRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuereceivableRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetIssueId(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuereceivableRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuereceivableResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 已清分金额
	ClearAmt *string `json:"clear_amt,omitempty" xml:"clear_amt,omitempty"`
	// 代偿金额
	CompensateAmt *string `json:"compensate_amt,omitempty" xml:"compensate_amt,omitempty"`
	// 错误信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// 完成日期 long类型字符串
	FinishDate *string `json:"finish_date,omitempty" xml:"finish_date,omitempty"`
	// 是否代偿,true为代偿，false为不代偿
	HasCompensate *bool `json:"has_compensate,omitempty" xml:"has_compensate,omitempty"`
	// 信用凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 全局唯一业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 外部订单号，也就是凭证发行时传递的支付订单
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty"`
	// 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 清分结果状态--- 0：未清分， 1：清分完成
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 凭证总金额
	TotalAmt *string `json:"total_amt,omitempty" xml:"total_amt,omitempty"`
	// 清分类型--主动清分 、 到期清分
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuereceivableResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuereceivableResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetClearAmt(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ClearAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetCompensateAmt(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.CompensateAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetErrMsg(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ErrMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetFinishDate(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.FinishDate = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetHasCompensate(v bool) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.HasCompensate = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetIssueId(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetOutBizNo(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.OutBizNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetOutOrderNo(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.OutOrderNo = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetProductId(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetStatus(v int64) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetTotalAmt(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.TotalAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuereceivableResponse) SetType(v string) *QueryDigitalLogisticCreditIssuereceivableResponse {
	s.Type = &v
	return s
}

type QueryDigitalLogisticCreditIssueamountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 指定查询者分布式数字身份
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 信用凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id 目前填写PRODUCT_MYBANK
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssueamountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssueamountRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetDid(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.Did = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetIssueId(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssueamountRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssueamountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 剩余金额
	BalanceAmt *string `json:"balance_amt,omitempty" xml:"balance_amt,omitempty"`
	// 已经提现的金额
	CashAmt *string `json:"cash_amt,omitempty" xml:"cash_amt,omitempty"`
	// 欠的滞纳金金额
	DebtIntAmt *string `json:"debt_int_amt,omitempty" xml:"debt_int_amt,omitempty"`
	// 欠款本金金额
	DebtPrinAmt *string `json:"debt_prin_amt,omitempty" xml:"debt_prin_amt,omitempty"`
	// 该凭证下的总欠款金额
	DebtTotalAmt *string `json:"debt_total_amt,omitempty" xml:"debt_total_amt,omitempty"`
	// 信用凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 冻结的金额
	FreezeAmt *string `json:"freeze_amt,omitempty" xml:"freeze_amt,omitempty"`
	// 信用凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 累计已还滞纳金金额
	PaidIntAmt *string `json:"paid_int_amt,omitempty" xml:"paid_int_amt,omitempty"`
	// 凭证总金额
	TicketAmt *string `json:"ticket_amt,omitempty" xml:"ticket_amt,omitempty"`
}

func (s QueryDigitalLogisticCreditIssueamountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssueamountResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetBalanceAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.BalanceAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetCashAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.CashAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetDebtIntAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.DebtIntAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetDebtPrinAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.DebtPrinAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetDebtTotalAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.DebtTotalAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetExpireDate(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.ExpireDate = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetFreezeAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.FreezeAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetIssueId(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.IssueId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetPaidIntAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.PaidIntAmt = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssueamountResponse) SetTicketAmt(v string) *QueryDigitalLogisticCreditIssueamountResponse {
	s.TicketAmt = &v
	return s
}

type CallbackDigitalLogisticCreditCommonRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 回调数据，根据不同msg_method 返回不同结构
	MsgData *string `json:"msg_data,omitempty" xml:"msg_data,omitempty"`
	// 回调方法类型
	MsgMethod *string `json:"msg_method,omitempty" xml:"msg_method,omitempty"`
}

func (s CallbackDigitalLogisticCreditCommonRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackDigitalLogisticCreditCommonRequest) GoString() string {
	return s.String()
}

func (s *CallbackDigitalLogisticCreditCommonRequest) SetAuthToken(v string) *CallbackDigitalLogisticCreditCommonRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonRequest) SetProductInstanceId(v string) *CallbackDigitalLogisticCreditCommonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonRequest) SetRegionName(v string) *CallbackDigitalLogisticCreditCommonRequest {
	s.RegionName = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonRequest) SetMsgData(v string) *CallbackDigitalLogisticCreditCommonRequest {
	s.MsgData = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonRequest) SetMsgMethod(v string) *CallbackDigitalLogisticCreditCommonRequest {
	s.MsgMethod = &v
	return s
}

type CallbackDigitalLogisticCreditCommonResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否已接收
	Received *bool `json:"received,omitempty" xml:"received,omitempty"`
}

func (s CallbackDigitalLogisticCreditCommonResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackDigitalLogisticCreditCommonResponse) GoString() string {
	return s.String()
}

func (s *CallbackDigitalLogisticCreditCommonResponse) SetReqMsgId(v string) *CallbackDigitalLogisticCreditCommonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonResponse) SetResultCode(v string) *CallbackDigitalLogisticCreditCommonResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonResponse) SetResultMsg(v string) *CallbackDigitalLogisticCreditCommonResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackDigitalLogisticCreditCommonResponse) SetReceived(v bool) *CallbackDigitalLogisticCreditCommonResponse {
	s.Received = &v
	return s
}

type ApplyDigitalLogisticCreditIssueclearRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请日期，不输入则是当前时间
	ApplyDate *int64 `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 清分金额，当前只支持全额清分，不填就是默认全额清分
	ClearAmt *string `json:"clear_amt,omitempty" xml:"clear_amt,omitempty"`
	// 主动清分方分布式数字身份
	ClearDid *string `json:"clear_did,omitempty" xml:"clear_did,omitempty"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 全局唯一业务流水号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 外部订单号，此为支付单号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s ApplyDigitalLogisticCreditIssueclearRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticCreditIssueclearRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetAuthToken(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetRegionName(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetApplyDate(v int64) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ApplyDate = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetClearAmt(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ClearAmt = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetClearDid(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ClearDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetExtInfo(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ExtInfo = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetGroupPlatformDid(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetIssueId(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.IssueId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetOutBizNo(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.OutBizNo = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetOutOrderNo(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.OutOrderNo = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetPlatformDid(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.PlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearRequest) SetProductId(v string) *ApplyDigitalLogisticCreditIssueclearRequest {
	s.ProductId = &v
	return s
}

type ApplyDigitalLogisticCreditIssueclearResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 全局唯一业务流水号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
}

func (s ApplyDigitalLogisticCreditIssueclearResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticCreditIssueclearResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticCreditIssueclearResponse) SetReqMsgId(v string) *ApplyDigitalLogisticCreditIssueclearResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearResponse) SetResultCode(v string) *ApplyDigitalLogisticCreditIssueclearResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearResponse) SetResultMsg(v string) *ApplyDigitalLogisticCreditIssueclearResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticCreditIssueclearResponse) SetOutBizNo(v string) *ApplyDigitalLogisticCreditIssueclearResponse {
	s.OutBizNo = &v
	return s
}

type SendDigitalLogisticCreditProxyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理请求方法名
	ApplyMethod *string `json:"apply_method,omitempty" xml:"apply_method,omitempty"`
	// 代理请求数据
	ApplyData *string `json:"apply_data,omitempty" xml:"apply_data,omitempty"`
}

func (s SendDigitalLogisticCreditProxyRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDigitalLogisticCreditProxyRequest) GoString() string {
	return s.String()
}

func (s *SendDigitalLogisticCreditProxyRequest) SetAuthToken(v string) *SendDigitalLogisticCreditProxyRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyRequest) SetProductInstanceId(v string) *SendDigitalLogisticCreditProxyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyRequest) SetRegionName(v string) *SendDigitalLogisticCreditProxyRequest {
	s.RegionName = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyRequest) SetApplyMethod(v string) *SendDigitalLogisticCreditProxyRequest {
	s.ApplyMethod = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyRequest) SetApplyData(v string) *SendDigitalLogisticCreditProxyRequest {
	s.ApplyData = &v
	return s
}

type SendDigitalLogisticCreditProxyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendDigitalLogisticCreditProxyResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDigitalLogisticCreditProxyResponse) GoString() string {
	return s.String()
}

func (s *SendDigitalLogisticCreditProxyResponse) SetReqMsgId(v string) *SendDigitalLogisticCreditProxyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyResponse) SetResultCode(v string) *SendDigitalLogisticCreditProxyResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDigitalLogisticCreditProxyResponse) SetResultMsg(v string) *SendDigitalLogisticCreditProxyResponse {
	s.ResultMsg = &v
	return s
}

type CheckDigitalLogisticCreditWaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	// A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 运单列表
	WaybillList []*string `json:"waybill_list,omitempty" xml:"waybill_list,omitempty" type:"Repeated"`
}

func (s CheckDigitalLogisticCreditWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckDigitalLogisticCreditWaybillRequest) GoString() string {
	return s.String()
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetAuthToken(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetProductInstanceId(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetRegionName(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.RegionName = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetGroupPlatformDid(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetPlatformDid(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.PlatformDid = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetProductId(v string) *CheckDigitalLogisticCreditWaybillRequest {
	s.ProductId = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillRequest) SetWaybillList(v []*string) *CheckDigitalLogisticCreditWaybillRequest {
	s.WaybillList = v
	return s
}

type CheckDigitalLogisticCreditWaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果列表,  格式为 运单号:核验状态， 核验状态包含  0:运单未知状态   1:通过   2:不通过   3:未核验   4:没有指定信息
	CheckResult []*string `json:"check_result,omitempty" xml:"check_result,omitempty" type:"Repeated"`
}

func (s CheckDigitalLogisticCreditWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckDigitalLogisticCreditWaybillResponse) GoString() string {
	return s.String()
}

func (s *CheckDigitalLogisticCreditWaybillResponse) SetReqMsgId(v string) *CheckDigitalLogisticCreditWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillResponse) SetResultCode(v string) *CheckDigitalLogisticCreditWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillResponse) SetResultMsg(v string) *CheckDigitalLogisticCreditWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckDigitalLogisticCreditWaybillResponse) SetCheckResult(v []*string) *CheckDigitalLogisticCreditWaybillResponse {
	s.CheckResult = v
	return s
}

type ReopenDigitalLogisticCreditDriverRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 司机did
	DriverDid *string `json:"driver_did,omitempty" xml:"driver_did,omitempty"`
	// 云资金商户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
}

func (s ReopenDigitalLogisticCreditDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s ReopenDigitalLogisticCreditDriverRequest) GoString() string {
	return s.String()
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetAuthToken(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetProductInstanceId(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetRegionName(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.RegionName = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetProductId(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.ProductId = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetGroupPlatformDid(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetDriverDid(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.DriverDid = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetAccountId(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.AccountId = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverRequest) SetCallbackUrl(v string) *ReopenDigitalLogisticCreditDriverRequest {
	s.CallbackUrl = &v
	return s
}

type ReopenDigitalLogisticCreditDriverResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 会员注册状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ReopenDigitalLogisticCreditDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s ReopenDigitalLogisticCreditDriverResponse) GoString() string {
	return s.String()
}

func (s *ReopenDigitalLogisticCreditDriverResponse) SetReqMsgId(v string) *ReopenDigitalLogisticCreditDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverResponse) SetResultCode(v string) *ReopenDigitalLogisticCreditDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverResponse) SetResultMsg(v string) *ReopenDigitalLogisticCreditDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverResponse) SetApplyId(v string) *ReopenDigitalLogisticCreditDriverResponse {
	s.ApplyId = &v
	return s
}

func (s *ReopenDigitalLogisticCreditDriverResponse) SetStatus(v int64) *ReopenDigitalLogisticCreditDriverResponse {
	s.Status = &v
	return s
}

type UploadDigitalLogisticCreditAuthorizationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 签署货主统一社会信用代码
	ConsignorCertNo *string `json:"consignor_cert_no,omitempty" xml:"consignor_cert_no,omitempty"`
	// 签署货主did
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 签署货主企业名称
	ConsignorName *string `json:"consignor_name,omitempty" xml:"consignor_name,omitempty"`
	// 授权的货主平台账号
	ConsignorPlatformAccount *string `json:"consignor_platform_account,omitempty" xml:"consignor_platform_account,omitempty"`
	// 协议到期日
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 是否包含账号授权条款
	HasAuthorizationClause *bool `json:"has_authorization_clause,omitempty" xml:"has_authorization_clause,omitempty"`
	// 签署子公司统一社会信用代码
	PlatformCertNo *string `json:"platform_cert_no,omitempty" xml:"platform_cert_no,omitempty"`
	// 签署子公司did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 签署子公司企业名称
	//
	PlatformName *string `json:"platform_name,omitempty" xml:"platform_name,omitempty"`
	// 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
	ProtocolImgId *string `json:"protocol_img_id,omitempty" xml:"protocol_img_id,omitempty"`
	// 协议名称
	ProtocolName *string `json:"protocol_name,omitempty" xml:"protocol_name,omitempty"`
	// 线下协议编号
	ProtocolNo *string `json:"protocol_no,omitempty" xml:"protocol_no,omitempty"`
	// 签署时间
	SignDate *string `json:"sign_date,omitempty" xml:"sign_date,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s UploadDigitalLogisticCreditAuthorizationRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditAuthorizationRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetRegionName(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetConsignorCertNo(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ConsignorCertNo = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetConsignorDid(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetConsignorName(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ConsignorName = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetConsignorPlatformAccount(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ConsignorPlatformAccount = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetExpireDate(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ExpireDate = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetHasAuthorizationClause(v bool) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.HasAuthorizationClause = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetPlatformCertNo(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.PlatformCertNo = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetPlatformDid(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.PlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetPlatformName(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.PlatformName = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetProtocolImgId(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ProtocolImgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetProtocolName(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ProtocolName = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetProtocolNo(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ProtocolNo = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetSignDate(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.SignDate = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationRequest) SetProductId(v string) *UploadDigitalLogisticCreditAuthorizationRequest {
	s.ProductId = &v
	return s
}

type UploadDigitalLogisticCreditAuthorizationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议链上地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s UploadDigitalLogisticCreditAuthorizationResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditAuthorizationResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditAuthorizationResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditAuthorizationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationResponse) SetResultCode(v string) *UploadDigitalLogisticCreditAuthorizationResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditAuthorizationResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditAuthorizationResponse) SetTxHash(v string) *UploadDigitalLogisticCreditAuthorizationResponse {
	s.TxHash = &v
	return s
}

type UploadDigitalLogisticCreditConfirmRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货主云资金商户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 确认时间
	ConfirmDate *string `json:"confirm_date,omitempty" xml:"confirm_date,omitempty"`
	// 应收转让通知编号
	ConfirmNo *string `json:"confirm_no,omitempty" xml:"confirm_no,omitempty"`
	// 签署货主did
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 签署的货主平台账号
	ConsignorPlatformAccount *string `json:"consignor_platform_account,omitempty" xml:"consignor_platform_account,omitempty"`
	// 协议到期日
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 签署子公司did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 协议名称
	ProtocolName *string `json:"protocol_name,omitempty" xml:"protocol_name,omitempty"`
	// 协议PDF文件, 多个文件可用逗号分隔, 最多10个
	ProtocolPdfId *string `json:"protocol_pdf_id,omitempty" xml:"protocol_pdf_id,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s UploadDigitalLogisticCreditConfirmRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditConfirmRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetRegionName(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetAccountId(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.AccountId = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetConfirmDate(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ConfirmDate = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetConfirmNo(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ConfirmNo = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetConsignorDid(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetConsignorPlatformAccount(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ConsignorPlatformAccount = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetExpireDate(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ExpireDate = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetPlatformDid(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.PlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetProtocolName(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ProtocolName = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetProtocolPdfId(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ProtocolPdfId = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmRequest) SetProductId(v string) *UploadDigitalLogisticCreditConfirmRequest {
	s.ProductId = &v
	return s
}

type UploadDigitalLogisticCreditConfirmResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议链上地址
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s UploadDigitalLogisticCreditConfirmResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditConfirmResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditConfirmResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditConfirmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmResponse) SetResultCode(v string) *UploadDigitalLogisticCreditConfirmResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditConfirmResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditConfirmResponse) SetTxHash(v string) *UploadDigitalLogisticCreditConfirmResponse {
	s.TxHash = &v
	return s
}

type BatchcreateDigitalLogisticCreditmodeIssueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 发行列表
	IssueApplyInfos []*IssueApplyInfo `json:"issue_apply_infos,omitempty" xml:"issue_apply_infos,omitempty" type:"Repeated"`
	// 业务平台方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s BatchcreateDigitalLogisticCreditmodeIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDigitalLogisticCreditmodeIssueRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetAuthToken(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetProductInstanceId(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetRegionName(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.RegionName = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetBatchId(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.BatchId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetCallbackUrl(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.CallbackUrl = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetGroupPlatformDid(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetIssueApplyInfos(v []*IssueApplyInfo) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.IssueApplyInfos = v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetPlatformDid(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.PlatformDid = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueRequest) SetProductId(v string) *BatchcreateDigitalLogisticCreditmodeIssueRequest {
	s.ProductId = &v
	return s
}

type BatchcreateDigitalLogisticCreditmodeIssueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchStatus *string `json:"batch_status,omitempty" xml:"batch_status,omitempty"`
}

func (s BatchcreateDigitalLogisticCreditmodeIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDigitalLogisticCreditmodeIssueResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueResponse) SetReqMsgId(v string) *BatchcreateDigitalLogisticCreditmodeIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueResponse) SetResultCode(v string) *BatchcreateDigitalLogisticCreditmodeIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueResponse) SetResultMsg(v string) *BatchcreateDigitalLogisticCreditmodeIssueResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueResponse) SetBatchId(v string) *BatchcreateDigitalLogisticCreditmodeIssueResponse {
	s.BatchId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditmodeIssueResponse) SetBatchStatus(v string) *BatchcreateDigitalLogisticCreditmodeIssueResponse {
	s.BatchStatus = &v
	return s
}

type ApplyDigitalLogisticCreditmodeIssueclearRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务平台方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 主动清分方分布式数字身份
	ClearDid *string `json:"clear_did,omitempty" xml:"clear_did,omitempty"`
	// 凭证id
	IssueId *string `json:"issue_id,omitempty" xml:"issue_id,omitempty"`
	// 全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付单号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty"`
	// 清分金额
	ClearAmt *string `json:"clear_amt,omitempty" xml:"clear_amt,omitempty"`
	// 模式  B:b模式
	ModeType *string `json:"mode_type,omitempty" xml:"mode_type,omitempty"`
	// 申请日期
	ApplyDate *string `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s ApplyDigitalLogisticCreditmodeIssueclearRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticCreditmodeIssueclearRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetAuthToken(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetRegionName(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetProductId(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ProductId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetGroupPlatformDid(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetPlatformDid(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.PlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetClearDid(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ClearDid = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetIssueId(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.IssueId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetOutBizNo(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.OutBizNo = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetOutOrderNo(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.OutOrderNo = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetClearAmt(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ClearAmt = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetModeType(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ModeType = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetApplyDate(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ApplyDate = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearRequest) SetExtInfo(v string) *ApplyDigitalLogisticCreditmodeIssueclearRequest {
	s.ExtInfo = &v
	return s
}

type ApplyDigitalLogisticCreditmodeIssueclearResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 全局业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
}

func (s ApplyDigitalLogisticCreditmodeIssueclearResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticCreditmodeIssueclearResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearResponse) SetReqMsgId(v string) *ApplyDigitalLogisticCreditmodeIssueclearResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearResponse) SetResultCode(v string) *ApplyDigitalLogisticCreditmodeIssueclearResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearResponse) SetResultMsg(v string) *ApplyDigitalLogisticCreditmodeIssueclearResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticCreditmodeIssueclearResponse) SetOutBizNo(v string) *ApplyDigitalLogisticCreditmodeIssueclearResponse {
	s.OutBizNo = &v
	return s
}

type UploadDigitalLogisticCreditIssuebysaasRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 发行结果回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 发行信息
	IssueApplyInfos []*SaasIssueApplyInfo `json:"issue_apply_infos,omitempty" xml:"issue_apply_infos,omitempty" type:"Repeated"`
	// 凭证发行方did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s UploadDigitalLogisticCreditIssuebysaasRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssuebysaasRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetRegionName(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetBatchId(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetCallbackUrl(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.CallbackUrl = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetIssueApplyInfos(v []*SaasIssueApplyInfo) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.IssueApplyInfos = v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetPlatformDid(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.PlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasRequest) SetProductId(v string) *UploadDigitalLogisticCreditIssuebysaasRequest {
	s.ProductId = &v
	return s
}

type UploadDigitalLogisticCreditIssuebysaasResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchStatus *int64 `json:"batch_status,omitempty" xml:"batch_status,omitempty"`
	// 发行url
	IssueUrl *string `json:"issue_url,omitempty" xml:"issue_url,omitempty"`
}

func (s UploadDigitalLogisticCreditIssuebysaasResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssuebysaasResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetResultCode(v string) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetBatchId(v string) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetBatchStatus(v int64) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.BatchStatus = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebysaasResponse) SetIssueUrl(v string) *UploadDigitalLogisticCreditIssuebysaasResponse {
	s.IssueUrl = &v
	return s
}

type CancelDigitalLogisticCreditIssuebatchbysaasRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 凭证发行方did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s CancelDigitalLogisticCreditIssuebatchbysaasRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticCreditIssuebatchbysaasRequest) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetAuthToken(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetProductInstanceId(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetRegionName(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.RegionName = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetBatchId(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.BatchId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetGroupPlatformDid(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetPlatformDid(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.PlatformDid = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasRequest) SetProductId(v string) *CancelDigitalLogisticCreditIssuebatchbysaasRequest {
	s.ProductId = &v
	return s
}

type CancelDigitalLogisticCreditIssuebatchbysaasResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
}

func (s CancelDigitalLogisticCreditIssuebatchbysaasResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticCreditIssuebatchbysaasResponse) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasResponse) SetReqMsgId(v string) *CancelDigitalLogisticCreditIssuebatchbysaasResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasResponse) SetResultCode(v string) *CancelDigitalLogisticCreditIssuebatchbysaasResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasResponse) SetResultMsg(v string) *CancelDigitalLogisticCreditIssuebatchbysaasResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelDigitalLogisticCreditIssuebatchbysaasResponse) SetBatchId(v string) *CancelDigitalLogisticCreditIssuebatchbysaasResponse {
	s.BatchId = &v
	return s
}

type QueryDigitalLogisticCreditBalancebysaasRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 查询者did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 发行金额
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
}

func (s QueryDigitalLogisticCreditBalancebysaasRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditBalancebysaasRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetRegionName(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetProductId(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasRequest) SetFreight(v string) *QueryDigitalLogisticCreditBalancebysaasRequest {
	s.Freight = &v
	return s
}

type QueryDigitalLogisticCreditBalancebysaasResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否有信用流转额度
	HasBalance *bool `json:"has_balance,omitempty" xml:"has_balance,omitempty"`
}

func (s QueryDigitalLogisticCreditBalancebysaasResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditBalancebysaasResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditBalancebysaasResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditBalancebysaasResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasResponse) SetResultCode(v string) *QueryDigitalLogisticCreditBalancebysaasResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditBalancebysaasResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditBalancebysaasResponse) SetHasBalance(v bool) *QueryDigitalLogisticCreditBalancebysaasResponse {
	s.HasBalance = &v
	return s
}

type GetDigitalLogisticCreditIssuescpticketRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 电子回单查询凭证数据
	ScpTicketIssueData []*ScpTicketIssueData `json:"scp_ticket_issue_data,omitempty" xml:"scp_ticket_issue_data,omitempty" type:"Repeated"`
}

func (s GetDigitalLogisticCreditIssuescpticketRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDigitalLogisticCreditIssuescpticketRequest) GoString() string {
	return s.String()
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetAuthToken(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetProductInstanceId(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetRegionName(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.RegionName = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetApplyId(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.ApplyId = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetCallbackUrl(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.CallbackUrl = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetGroupPlatformDid(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetPlatformDid(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.PlatformDid = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetProductId(v string) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.ProductId = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketRequest) SetScpTicketIssueData(v []*ScpTicketIssueData) *GetDigitalLogisticCreditIssuescpticketRequest {
	s.ScpTicketIssueData = v
	return s
}

type GetDigitalLogisticCreditIssuescpticketResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s GetDigitalLogisticCreditIssuescpticketResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDigitalLogisticCreditIssuescpticketResponse) GoString() string {
	return s.String()
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetReqMsgId(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetResultCode(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetResultMsg(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetApplyId(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.ApplyId = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetGroupPlatformDid(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.GroupPlatformDid = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetPlatformDid(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.PlatformDid = &v
	return s
}

func (s *GetDigitalLogisticCreditIssuescpticketResponse) SetProductId(v string) *GetDigitalLogisticCreditIssuescpticketResponse {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuescpticketresultRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuescpticketresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuescpticketresultRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetRegionName(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetApplyId(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.ApplyId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultRequest) SetProductId(v string) *QueryDigitalLogisticCreditIssuescpticketresultRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditIssuescpticketresultResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 电子回单下载地址,链接有有效期
	FileDownloadUrl *string `json:"file_download_url,omitempty" xml:"file_download_url,omitempty"`
	// 集团平台方分布式数字身份
	//
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	//
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryDigitalLogisticCreditIssuescpticketresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditIssuescpticketresultResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetResultCode(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetApplyId(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.ApplyId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetFileDownloadUrl(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.FileDownloadUrl = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetPlatformDid(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetProductId(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditIssuescpticketresultResponse) SetStatus(v string) *QueryDigitalLogisticCreditIssuescpticketresultResponse {
	s.Status = &v
	return s
}

type UploadDigitalLogisticCreditAplusissueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 发行结果信息回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 货代did
	ConsignorDid *string `json:"consignor_did,omitempty" xml:"consignor_did,omitempty"`
	// 发行时直接进行快速提现：true ，
	// 发行后自主触发提现：false （默认）
	EasyFinance *bool `json:"easy_finance,omitempty" xml:"easy_finance,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 发行信息列表
	IssueApplyInfos []*IssueApplyInfoPlus `json:"issue_apply_infos,omitempty" xml:"issue_apply_infos,omitempty" type:"Repeated"`
	// 业务承接方did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 登录模式，返回的发行url指定使用何种模式登录。ORG:企业支付宝登录（缺省时默认ORG模式），USER_ACCOUNT:个人支付宝登录。
	LoginType *string `json:"login_type,omitempty" xml:"login_type,omitempty"`
}

func (s UploadDigitalLogisticCreditAplusissueRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditAplusissueRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetRegionName(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetBatchId(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetCallbackUrl(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.CallbackUrl = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetConsignorDid(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.ConsignorDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetEasyFinance(v bool) *UploadDigitalLogisticCreditAplusissueRequest {
	s.EasyFinance = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetIssueApplyInfos(v []*IssueApplyInfoPlus) *UploadDigitalLogisticCreditAplusissueRequest {
	s.IssueApplyInfos = v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetPlatformDid(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.PlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetProductId(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.ProductId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueRequest) SetLoginType(v string) *UploadDigitalLogisticCreditAplusissueRequest {
	s.LoginType = &v
	return s
}

type UploadDigitalLogisticCreditAplusissueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态 -1:失效， 0:初始化完成，1:进行中，2:部分成功，3:成功
	BatchIdStatus *int64 `json:"batch_id_status,omitempty" xml:"batch_id_status,omitempty"`
	// 凭证发行跳转url
	IssueUrl *string `json:"issue_url,omitempty" xml:"issue_url,omitempty"`
}

func (s UploadDigitalLogisticCreditAplusissueResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditAplusissueResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditAplusissueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetResultCode(v string) *UploadDigitalLogisticCreditAplusissueResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditAplusissueResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetBatchId(v string) *UploadDigitalLogisticCreditAplusissueResponse {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetBatchIdStatus(v int64) *UploadDigitalLogisticCreditAplusissueResponse {
	s.BatchIdStatus = &v
	return s
}

func (s *UploadDigitalLogisticCreditAplusissueResponse) SetIssueUrl(v string) *UploadDigitalLogisticCreditAplusissueResponse {
	s.IssueUrl = &v
	return s
}

type QueryDigitalLogisticCreditCreditamountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditCreditamountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditCreditamountRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetRegionName(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetPlatformDid(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountRequest) SetProductId(v string) *QueryDigitalLogisticCreditCreditamountRequest {
	s.ProductId = &v
	return s
}

type QueryDigitalLogisticCreditCreditamountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可用额度
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 平台did
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s QueryDigitalLogisticCreditCreditamountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditCreditamountResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetResultCode(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetCreditAmount(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.CreditAmount = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetPlatformDid(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.PlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCreditamountResponse) SetProductId(v string) *QueryDigitalLogisticCreditCreditamountResponse {
	s.ProductId = &v
	return s
}

type CreateDigitalLogisticCreditCommonsignRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty"`
	// 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
	BankCnaps *string `json:"bank_cnaps,omitempty" xml:"bank_cnaps,omitempty"`
	// 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 签约结果回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
	DrivingLicense *string `json:"driving_license,omitempty" xml:"driving_license,omitempty"`
	// 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
	DrivingLicenseFileId *string `json:"driving_license_file_id,omitempty" xml:"driving_license_file_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 法定代表人名称，签约方sign_did类型为企业时必填
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 签约方did
	SignDid *string `json:"sign_did,omitempty" xml:"sign_did,omitempty"`
	// 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
	VehicleLicense *string `json:"vehicle_license,omitempty" xml:"vehicle_license,omitempty"`
	// 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
	VehicleLicenseFileId *string `json:"vehicle_license_file_id,omitempty" xml:"vehicle_license_file_id,omitempty"`
}

func (s CreateDigitalLogisticCreditCommonsignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditCommonsignRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetAuthToken(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetProductInstanceId(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetRegionName(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetAccountId(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.AccountId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetAccountType(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.AccountType = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetBankCnaps(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.BankCnaps = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetBankName(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.BankName = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetCallbackUrl(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetDrivingLicense(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.DrivingLicense = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetDrivingLicenseFileId(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.DrivingLicenseFileId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetGroupPlatformDid(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetLegalName(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.LegalName = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetProductId(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.ProductId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetSignDid(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.SignDid = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetVehicleLicense(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.VehicleLicense = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignRequest) SetVehicleLicenseFileId(v string) *CreateDigitalLogisticCreditCommonsignRequest {
	s.VehicleLicenseFileId = &v
	return s
}

type CreateDigitalLogisticCreditCommonsignResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请id
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 签约状态，-1:签约失败，0:未签约，1:已签约，2:签约中
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateDigitalLogisticCreditCommonsignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticCreditCommonsignResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticCreditCommonsignResponse) SetReqMsgId(v string) *CreateDigitalLogisticCreditCommonsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignResponse) SetResultCode(v string) *CreateDigitalLogisticCreditCommonsignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignResponse) SetResultMsg(v string) *CreateDigitalLogisticCreditCommonsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignResponse) SetApplyId(v string) *CreateDigitalLogisticCreditCommonsignResponse {
	s.ApplyId = &v
	return s
}

func (s *CreateDigitalLogisticCreditCommonsignResponse) SetStatus(v int64) *CreateDigitalLogisticCreditCommonsignResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticCreditCommonsignRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 签约方did
	SignDid *string `json:"sign_did,omitempty" xml:"sign_did,omitempty"`
	// 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
}

func (s QueryDigitalLogisticCreditCommonsignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditCommonsignRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetAuthToken(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetProductInstanceId(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetRegionName(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetProductId(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.ProductId = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetGroupPlatformDid(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetSignDid(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.SignDid = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignRequest) SetApplyId(v string) *QueryDigitalLogisticCreditCommonsignRequest {
	s.ApplyId = &v
	return s
}

type QueryDigitalLogisticCreditCommonsignResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约结果，-1:签约失败，0:未签约，1:已签约，2:签约中
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// 查询信息
	QueryMsg *string `json:"query_msg,omitempty" xml:"query_msg,omitempty"`
}

func (s QueryDigitalLogisticCreditCommonsignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticCreditCommonsignResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticCreditCommonsignResponse) SetReqMsgId(v string) *QueryDigitalLogisticCreditCommonsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignResponse) SetResultCode(v string) *QueryDigitalLogisticCreditCommonsignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignResponse) SetResultMsg(v string) *QueryDigitalLogisticCreditCommonsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignResponse) SetStatus(v int64) *QueryDigitalLogisticCreditCommonsignResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticCreditCommonsignResponse) SetQueryMsg(v string) *QueryDigitalLogisticCreditCommonsignResponse {
	s.QueryMsg = &v
	return s
}

type BatchcreateDigitalLogisticCreditIssueRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 凭证发行方分布式身份
	CreateDid *string `json:"create_did,omitempty" xml:"create_did,omitempty"`
	// 凭证接收方分布式身份
	ReceiveDid *string `json:"receive_did,omitempty" xml:"receive_did,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 全局业务唯一号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付订单号
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 支付单运费总额，运费最多精确到小数点后2位
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
	EasyFinance *bool `json:"easy_finance,omitempty" xml:"easy_finance,omitempty"`
	// 凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 发行结果回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 需合并发行的运单id列表
	WaybillIds []*string `json:"waybill_ids,omitempty" xml:"waybill_ids,omitempty" type:"Repeated"`
}

func (s BatchcreateDigitalLogisticCreditIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDigitalLogisticCreditIssueRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetAuthToken(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetProductInstanceId(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetRegionName(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.RegionName = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetProductId(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.ProductId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetGroupPlatformDid(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetCreateDid(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.CreateDid = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetReceiveDid(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.ReceiveDid = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetBatchId(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.BatchId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetOutBizNo(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.OutBizNo = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetPayOrder(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.PayOrder = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetFreight(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.Freight = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetEasyFinance(v bool) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.EasyFinance = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetExpireDate(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.ExpireDate = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetCallbackUrl(v string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.CallbackUrl = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueRequest) SetWaybillIds(v []*string) *BatchcreateDigitalLogisticCreditIssueRequest {
	s.WaybillIds = v
	return s
}

type BatchcreateDigitalLogisticCreditIssueResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchStatus *int64 `json:"batch_status,omitempty" xml:"batch_status,omitempty"`
}

func (s BatchcreateDigitalLogisticCreditIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDigitalLogisticCreditIssueResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateDigitalLogisticCreditIssueResponse) SetReqMsgId(v string) *BatchcreateDigitalLogisticCreditIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueResponse) SetResultCode(v string) *BatchcreateDigitalLogisticCreditIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueResponse) SetResultMsg(v string) *BatchcreateDigitalLogisticCreditIssueResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueResponse) SetBatchId(v string) *BatchcreateDigitalLogisticCreditIssueResponse {
	s.BatchId = &v
	return s
}

func (s *BatchcreateDigitalLogisticCreditIssueResponse) SetBatchStatus(v int64) *BatchcreateDigitalLogisticCreditIssueResponse {
	s.BatchStatus = &v
	return s
}

type UploadDigitalLogisticCreditIssuebatchRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 凭证发行方did
	CreateDid *string `json:"create_did,omitempty" xml:"create_did,omitempty"`
	// 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
	EasyFinance *bool `json:"easy_finance,omitempty" xml:"easy_finance,omitempty"`
	// 凭证到期时间
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 支付单运费总额，运费最多精确到小数点后2位
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 集团平台did
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 全局业务唯一编号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 支付订单号
	PayOrder *string `json:"pay_order,omitempty" xml:"pay_order,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 凭证接收方did
	ReceiveDid *string `json:"receive_did,omitempty" xml:"receive_did,omitempty"`
	// 运单合并列表
	WaybillIds []*string `json:"waybill_ids,omitempty" xml:"waybill_ids,omitempty" type:"Repeated"`
}

func (s UploadDigitalLogisticCreditIssuebatchRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssuebatchRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetAuthToken(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetProductInstanceId(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetRegionName(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetBatchId(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetCallbackUrl(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.CallbackUrl = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetCreateDid(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.CreateDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetEasyFinance(v bool) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.EasyFinance = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetExpireDate(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.ExpireDate = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetFreight(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.Freight = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetGroupPlatformDid(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetOutBizNo(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.OutBizNo = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetPayOrder(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.PayOrder = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetProductId(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.ProductId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetReceiveDid(v string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.ReceiveDid = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchRequest) SetWaybillIds(v []*string) *UploadDigitalLogisticCreditIssuebatchRequest {
	s.WaybillIds = v
	return s
}

type UploadDigitalLogisticCreditIssuebatchResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批次id
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 批次状态
	BatchStatus *int64 `json:"batch_status,omitempty" xml:"batch_status,omitempty"`
	// 发行链接
	IssueUrl *string `json:"issue_url,omitempty" xml:"issue_url,omitempty"`
}

func (s UploadDigitalLogisticCreditIssuebatchResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticCreditIssuebatchResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetReqMsgId(v string) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetResultCode(v string) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetResultMsg(v string) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetBatchId(v string) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.BatchId = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetBatchStatus(v int64) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.BatchStatus = &v
	return s
}

func (s *UploadDigitalLogisticCreditIssuebatchResponse) SetIssueUrl(v string) *UploadDigitalLogisticCreditIssuebatchResponse {
	s.IssueUrl = &v
	return s
}

type GetDigitalLogisticIssueTransferfileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 回调地址
	//
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 信用流转凭证集合，最大长度支持30
	IssueTransferDatas []*IssueTransferData `json:"issue_transfer_datas,omitempty" xml:"issue_transfer_datas,omitempty" type:"Repeated"`
	// 业务发起方分布式数字身份
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	//
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s GetDigitalLogisticIssueTransferfileRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDigitalLogisticIssueTransferfileRequest) GoString() string {
	return s.String()
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetAuthToken(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetProductInstanceId(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetRegionName(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.RegionName = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetApplyId(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.ApplyId = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetCallbackUrl(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.CallbackUrl = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetGroupPlatformDid(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetIssueTransferDatas(v []*IssueTransferData) *GetDigitalLogisticIssueTransferfileRequest {
	s.IssueTransferDatas = v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetPlatformDid(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.PlatformDid = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileRequest) SetProductId(v string) *GetDigitalLogisticIssueTransferfileRequest {
	s.ProductId = &v
	return s
}

type GetDigitalLogisticIssueTransferfileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请唯一流水号
	ApplyId *string `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
	// 集团平台方分布式数字身份
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty"`
	// 业务发起方分布式数字身
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty"`
	// 产品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s GetDigitalLogisticIssueTransferfileResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDigitalLogisticIssueTransferfileResponse) GoString() string {
	return s.String()
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetReqMsgId(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetResultCode(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetResultMsg(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetApplyId(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.ApplyId = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetGroupPlatformDid(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.GroupPlatformDid = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetPlatformDid(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.PlatformDid = &v
	return s
}

func (s *GetDigitalLogisticIssueTransferfileResponse) SetProductId(v string) *GetDigitalLogisticIssueTransferfileResponse {
	s.ProductId = &v
	return s
}

type ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被保险人地址
	BbrAddr *string `json:"bbr_addr,omitempty" xml:"bbr_addr,omitempty" maxLength:"80"`
	// 被保险人证件号码
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty" maxLength:"40"`
	// 被保险人证件类型。按照如下值填写
	// 464001	身份证
	// 464002	护照
	// 464003	其他
	// 464004	组织机构代码
	// 464005	军人证
	// 464006	工商注册号码
	// 464007	统一社会信用代码
	// 464008	临时身份证
	// 464009	外国护照
	// 464010	中国人民武装警察身份证件
	// 464011	军官证
	// 464012	企业营业执照号码
	// 464013	统一社会信用代码（五证合一号码）
	// 464014	个体工商户营业执照号码
	// 464015	户口本
	// 464016	其他类境内个人身份有效证件
	// 464017	其他类境外个人身份有效证件
	// 464018	税务登记证
	// 464019	金融许可证号码
	// 464020	国家主管部门颁外国驻华机构批文号码
	// 464021	其他类境外机构代码
	BbrIdType *string `json:"bbr_id_type,omitempty" xml:"bbr_id_type,omitempty" maxLength:"40"`
	// 被保险人姓名
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty" maxLength:"40"`
	// 被保险人联系电话
	BbrTel *string `json:"bbr_tel,omitempty" xml:"bbr_tel,omitempty" maxLength:"40"`
	// 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
	Carriage *string `json:"carriage,omitempty" xml:"carriage,omitempty" maxLength:"20"`
	// 货物名称
	CarGo *string `json:"car_go,omitempty" xml:"car_go,omitempty" maxLength:"40"`
	// 厂牌型号
	CpModel *string `json:"cp_model,omitempty" xml:"cp_model,omitempty" maxLength:"80"`
	// 目的地
	Destination *string `json:"destination,omitempty" xml:"destination,omitempty" maxLength:"200"`
	// 行驶证车主
	DrivPer *string `json:"driv_per,omitempty" xml:"driv_per,omitempty" maxLength:"40"`
	// 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
	EffDate *string `json:"eff_date,omitempty" xml:"eff_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 发动机编号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" maxLength:"40"`
	// 车架号
	FrameNo *string `json:"frame_no,omitempty" xml:"frame_no,omitempty" maxLength:"40"`
	// 运单所属集团分布式身份标识
	GroupPlatformDid *string `json:"group_platform_did,omitempty" xml:"group_platform_did,omitempty" maxLength:"80"`
	// 投保人证件类型有效止期
	IdentifyPeriodEnd *string `json:"identify_period_end,omitempty" xml:"identify_period_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 投保人证件类型有效起期
	IdentifyPeriodStart *string `json:"identify_period_start,omitempty" xml:"identify_period_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 车牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" maxLength:"40"`
	// 运单所属平台分布式身份标识
	PlatformDid *string `json:"platform_did,omitempty" xml:"platform_did,omitempty" maxLength:"80"`
	// 运营证号
	RunNo *string `json:"run_no,omitempty" xml:"run_no,omitempty" maxLength:"40"`
	// 起运地
	StartPlace *string `json:"start_place,omitempty" xml:"start_place,omitempty" maxLength:"200"`
	// 投保人地址
	TbrAddr *string `json:"tbr_addr,omitempty" xml:"tbr_addr,omitempty" maxLength:"80"`
	// 投保人邮箱
	TbrEmail *string `json:"tbr_email,omitempty" xml:"tbr_email,omitempty" maxLength:"40"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty" maxLength:"40"`
	// 投保人证件类型，按照如下状态进行填写
	// 464001	身份证
	// 464002	护照
	// 464003	其他
	// 464004	组织机构代码
	// 464005	军人证
	// 464006	工商注册号码
	// 464007	统一社会信用代码
	// 464008	临时身份证
	// 464009	外国护照
	// 464010	中国人民武装警察身份证件
	// 464011	军官证
	// 464012	企业营业执照号码
	// 464013	统一社会信用代码（五证合一号码）
	// 464014	个体工商户营业执照号码
	// 464015	户口本
	// 464016	其他类境内个人身份有效证件
	// 464017	其他类境外个人身份有效证件
	// 464018	税务登记证
	// 464019	金融许可证号码
	// 464020	国家主管部门颁外国驻华机构批文号码
	// 464021	其他类境外机构代码
	TbrIdType *string `json:"tbr_id_type,omitempty" xml:"tbr_id_type,omitempty" maxLength:"40"`
	// 投保人姓名
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" maxLength:"40"`
	// 投保人联系电话
	TbrTel *string `json:"tbr_tel,omitempty" xml:"tbr_tel,omitempty" maxLength:"40"`
	// 保险止期，保期时间间隔为1-30天。
	TermDate *string `json:"term_date,omitempty" xml:"term_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 吨位
	TonNage *string `json:"ton_nage,omitempty" xml:"ton_nage,omitempty" maxLength:"20"`
	// 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"32" minLength:"32"`
	// 运输货物
	TsCarGo *string `json:"ts_car_go,omitempty" xml:"ts_car_go,omitempty" maxLength:"80"`
	// 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty" maxLength:"128"`
	// 重量
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty" maxLength:"20"`
}

func (s ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetAuthToken(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetRegionName(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetBbrAddr(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.BbrAddr = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetBbrIdNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.BbrIdNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetBbrIdType(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.BbrIdType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetBbrName(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.BbrName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetBbrTel(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.BbrTel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetCarriage(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.Carriage = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetCarGo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.CarGo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetCpModel(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.CpModel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetDestination(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.Destination = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetDrivPer(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.DrivPer = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetEffDate(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.EffDate = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetEngineNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.EngineNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetFrameNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.FrameNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetGroupPlatformDid(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.GroupPlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetIdentifyPeriodEnd(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.IdentifyPeriodEnd = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetIdentifyPeriodStart(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.IdentifyPeriodStart = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetLicenseNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.LicenseNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetPlatformDid(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.PlatformDid = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetRunNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.RunNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetStartPlace(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.StartPlace = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrAddr(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrAddr = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrEmail(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrEmail = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrIdNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrIdNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrIdType(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrIdType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrName(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTbrTel(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TbrTel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTermDate(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TermDate = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTonNage(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TonNage = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTradeNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TradeNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTsCarGo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TsCarGo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetWaybillId(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.WaybillId = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetWeight(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.Weight = &v
	return s
}

type ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty"`
	// 电子保单下载地址
	PolUrl *string `json:"pol_url,omitempty" xml:"pol_url,omitempty"`
	// 含税保费
	PreMium *string `json:"pre_mium,omitempty" xml:"pre_mium,omitempty"`
}

func (s ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetReqMsgId(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetResultCode(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetResultMsg(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetPolNo(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.PolNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetPolUrl(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.PolUrl = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetPreMium(v string) *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.PreMium = &v
	return s
}

type CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 保单号，投保成功后返回的
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty" maxLength:"60"`
	// 含税保费，精确到小数点后两位
	PreMium *string `json:"pre_mium,omitempty" xml:"pre_mium,omitempty"`
	// 全局唯一交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"32" minLength:"32"`
}

func (s CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetAuthToken(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetProductInstanceId(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetRegionName(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.RegionName = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetPolNo(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.PolNo = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetPreMium(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.PreMium = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) SetTradeNo(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest {
	s.TradeNo = &v
	return s
}

type CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 退保成功的对应的保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty"`
}

func (s CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetReqMsgId(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetResultCode(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetResultMsg(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse) SetPolNo(v string) *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse {
	s.PolNo = &v
	return s
}

type PushDigitalLogisticInsurancenotifyClaimRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 通知类型：
	// claims_pay:理赔支付信息
	// claims_info: 理赔信息
	Category *string `json:"category,omitempty" xml:"category,omitempty" maxLength:"16"`
	// 通知内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" maxLength:"3000"`
}

func (s PushDigitalLogisticInsurancenotifyClaimRequest) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticInsurancenotifyClaimRequest) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticInsurancenotifyClaimRequest) SetAuthToken(v string) *PushDigitalLogisticInsurancenotifyClaimRequest {
	s.AuthToken = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimRequest) SetProductInstanceId(v string) *PushDigitalLogisticInsurancenotifyClaimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimRequest) SetRegionName(v string) *PushDigitalLogisticInsurancenotifyClaimRequest {
	s.RegionName = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimRequest) SetCategory(v string) *PushDigitalLogisticInsurancenotifyClaimRequest {
	s.Category = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimRequest) SetContent(v string) *PushDigitalLogisticInsurancenotifyClaimRequest {
	s.Content = &v
	return s
}

type PushDigitalLogisticInsurancenotifyClaimResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回报文
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PushDigitalLogisticInsurancenotifyClaimResponse) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticInsurancenotifyClaimResponse) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticInsurancenotifyClaimResponse) SetReqMsgId(v string) *PushDigitalLogisticInsurancenotifyClaimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimResponse) SetResultCode(v string) *PushDigitalLogisticInsurancenotifyClaimResponse {
	s.ResultCode = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimResponse) SetResultMsg(v string) *PushDigitalLogisticInsurancenotifyClaimResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushDigitalLogisticInsurancenotifyClaimResponse) SetData(v string) *PushDigitalLogisticInsurancenotifyClaimResponse {
	s.Data = &v
	return s
}

type ApplyDigitalLogisticInsuranceFileurlRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 上传的文件名，要求文件名后缀必须以 _yyyyMMdd结尾
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"80"`
}

func (s ApplyDigitalLogisticInsuranceFileurlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsuranceFileurlRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsuranceFileurlRequest) SetAuthToken(v string) *ApplyDigitalLogisticInsuranceFileurlRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticInsuranceFileurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlRequest) SetRegionName(v string) *ApplyDigitalLogisticInsuranceFileurlRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlRequest) SetFileName(v string) *ApplyDigitalLogisticInsuranceFileurlRequest {
	s.FileName = &v
	return s
}

type ApplyDigitalLogisticInsuranceFileurlResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用于上传文件的连接
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
}

func (s ApplyDigitalLogisticInsuranceFileurlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsuranceFileurlResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsuranceFileurlResponse) SetReqMsgId(v string) *ApplyDigitalLogisticInsuranceFileurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlResponse) SetResultCode(v string) *ApplyDigitalLogisticInsuranceFileurlResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlResponse) SetResultMsg(v string) *ApplyDigitalLogisticInsuranceFileurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticInsuranceFileurlResponse) SetFileUrl(v string) *ApplyDigitalLogisticInsuranceFileurlResponse {
	s.FileUrl = &v
	return s
}

type ApplyDigitalLogisticInsurancepolicyUniversalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 投保人开户银行，当打印发票选择为“1”时，必填
	AccountBankName *string `json:"account_bank_name,omitempty" xml:"account_bank_name,omitempty" maxLength:"100"`
	// 投保人银行账户，当打印发票选择为“1”时，必填
	BankAccountInformation *string `json:"bank_account_information,omitempty" xml:"bank_account_information,omitempty" maxLength:"50"`
	// 被保人地址
	BbrAddr *string `json:"bbr_addr,omitempty" xml:"bbr_addr,omitempty" maxLength:"200"`
	// 被保人did（被保人所在链上分布式数字身份）
	BbrDid *string `json:"bbr_did,omitempty" xml:"bbr_did,omitempty" maxLength:"200"`
	// 被保人证件号
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty" maxLength:"50"`
	// 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
	//
	BbrIdType *string `json:"bbr_id_type,omitempty" xml:"bbr_id_type,omitempty" maxLength:"2"`
	// 被保人姓名
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty" maxLength:"100"`
	// 被保人电话号
	BbrTel *string `json:"bbr_tel,omitempty" xml:"bbr_tel,omitempty" maxLength:"20"`
	// 被保人类型, 1-个人 2-团队
	BbrType *string `json:"bbr_type,omitempty" xml:"bbr_type,omitempty" maxLength:"1"`
	// 货物名称
	CargoName *string `json:"cargo_name,omitempty" xml:"cargo_name,omitempty" maxLength:"100"`
	// 货物数量
	CargoQuantity *string `json:"cargo_quantity,omitempty" xml:"cargo_quantity,omitempty" maxLength:"20"`
	// 货物数量单位
	CargoQuantityUnit *string `json:"cargo_quantity_unit,omitempty" xml:"cargo_quantity_unit,omitempty" maxLength:"20"`
	// 货物吨位
	CargoTonnage *string `json:"cargo_tonnage,omitempty" xml:"cargo_tonnage,omitempty" maxLength:"20"`
	// 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
	CargoType *string `json:"cargo_type,omitempty" xml:"cargo_type,omitempty" maxLength:"50"`
	// 货物体积
	CargoVolume *string `json:"cargo_volume,omitempty" xml:"cargo_volume,omitempty" maxLength:"20"`
	// 货值
	CargoWorth *string `json:"cargo_worth,omitempty" xml:"cargo_worth,omitempty" maxLength:"50"`
	// 车长
	CarLength *string `json:"car_length,omitempty" xml:"car_length,omitempty" maxLength:"10"`
	// 车型
	CarModel *string `json:"car_model,omitempty" xml:"car_model,omitempty" maxLength:"20"`
	// 目的地，格式为"省-市-区"
	Destination *string `json:"destination,omitempty" xml:"destination,omitempty" maxLength:"100"`
	// 司机姓名
	DriverName *string `json:"driver_name,omitempty" xml:"driver_name,omitempty" maxLength:"50"`
	// 司机联系方式
	DriverTel *string `json:"driver_tel,omitempty" xml:"driver_tel,omitempty" maxLength:"20"`
	// 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
	EffDate *string `json:"eff_date,omitempty" xml:"eff_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保司, 01-华泰, 02-平安, 03-亚太
	ExternalChannelCode *string `json:"external_channel_code,omitempty" xml:"external_channel_code,omitempty" maxLength:"2"`
	// 险种, 01-承运人平台责任险
	//
	ExternalProductCode *string `json:"external_product_code,omitempty" xml:"external_product_code,omitempty" maxLength:"2"`
	// 车架号
	FrameNo *string `json:"frame_no,omitempty" xml:"frame_no,omitempty" maxLength:"50"`
	// 投保额，整数以元为单位
	//
	InsuredAmount *string `json:"insured_amount,omitempty" xml:"insured_amount,omitempty" maxLength:"12"`
	// 车牌号
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" maxLength:"20"`
	// 车牌颜色，01-黄牌，02-蓝牌
	LicensePlateColor *string `json:"license_plate_color,omitempty" xml:"license_plate_color,omitempty" maxLength:"2"`
	// 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
	NsrIdentifier *string `json:"nsr_identifier,omitempty" xml:"nsr_identifier,omitempty" maxLength:"50"`
	// 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
	Packing *string `json:"packing,omitempty" xml:"packing,omitempty" maxLength:"100"`
	// 是否打印发票，默认0-不开票  1-专票 2-电子发票
	PrintInvoice *string `json:"print_invoice,omitempty" xml:"print_invoice,omitempty" maxLength:"1"`
	// 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" maxLength:"8"`
	// 起运地，格式为"省-市-区"
	StartPlace *string `json:"start_place,omitempty" xml:"start_place,omitempty" maxLength:"100"`
	// 投保人地址，当打印发票选择为“1”时，必填
	TbrAddr *string `json:"tbr_addr,omitempty" xml:"tbr_addr,omitempty" maxLength:"200"`
	// 投保人-企业联系人联系方式
	TbrCorporateContract *string `json:"tbr_corporate_contract,omitempty" xml:"tbr_corporate_contract,omitempty" maxLength:"20"`
	// 投保人did（投保人所在链上分布式数字身份）
	TbrDid *string `json:"tbr_did,omitempty" xml:"tbr_did,omitempty" maxLength:"200"`
	// 投保人邮箱，用以接受电子发票的邮箱地址
	TbrEmail *string `json:"tbr_email,omitempty" xml:"tbr_email,omitempty" maxLength:"50"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty" maxLength:"50"`
	// 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
	TbrIdType *string `json:"tbr_id_type,omitempty" xml:"tbr_id_type,omitempty" maxLength:"2"`
	// 投保人名称
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" maxLength:"100"`
	// 投保人电话号
	TbrTel *string `json:"tbr_tel,omitempty" xml:"tbr_tel,omitempty" maxLength:"20"`
	// 投保人类型, 1-个人 2-团队
	TbrType *string `json:"tbr_type,omitempty" xml:"tbr_type,omitempty" maxLength:"1"`
	// 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
	TermDate *string `json:"term_date,omitempty" xml:"term_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 专票邮寄地址
	TicketAddr *string `json:"ticket_addr,omitempty" xml:"ticket_addr,omitempty" maxLength:"200"`
	// 订单号, 年月日+唯一字符ID
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"50"`
	// 中转地，格式为"省-市-区"
	TransitPoint *string `json:"transit_point,omitempty" xml:"transit_point,omitempty" maxLength:"100"`
	// 运单id（平台方运单id）
	WaybillId *string `json:"waybill_id,omitempty" xml:"waybill_id,omitempty" maxLength:"50"`
}

func (s ApplyDigitalLogisticInsurancepolicyUniversalRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsurancepolicyUniversalRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetAuthToken(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetRegionName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetAccountBankName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.AccountBankName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBankAccountInformation(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BankAccountInformation = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrAddr(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrAddr = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrDid(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrDid = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrIdNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrIdNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrIdType(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrIdType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrTel(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrTel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetBbrType(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.BbrType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoQuantity(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoQuantity = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoQuantityUnit(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoQuantityUnit = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoTonnage(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoTonnage = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoType(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoVolume(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoVolume = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCargoWorth(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CargoWorth = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCarLength(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CarLength = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetCarModel(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.CarModel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetDestination(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.Destination = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetDriverName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.DriverName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetDriverTel(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.DriverTel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetEffDate(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.EffDate = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetExternalChannelCode(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.ExternalChannelCode = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetExternalProductCode(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.ExternalProductCode = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetFrameNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.FrameNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetInsuredAmount(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.InsuredAmount = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetLicenseNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.LicenseNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetLicensePlateColor(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.LicensePlateColor = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetNsrIdentifier(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.NsrIdentifier = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetOrderTime(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.OrderTime = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetPacking(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.Packing = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetPrintInvoice(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.PrintInvoice = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetRate(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.Rate = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetStartPlace(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.StartPlace = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrAddr(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrAddr = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrCorporateContract(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrCorporateContract = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrDid(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrDid = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrEmail(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrEmail = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrIdNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrIdNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrIdType(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrIdType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrName(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrName = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrTel(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrTel = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTbrType(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TbrType = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTermDate(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TermDate = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTicketAddr(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TicketAddr = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTradeNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TradeNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetTransitPoint(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.TransitPoint = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalRequest) SetWaybillId(v string) *ApplyDigitalLogisticInsurancepolicyUniversalRequest {
	s.WaybillId = &v
	return s
}

type ApplyDigitalLogisticInsurancepolicyUniversalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty"`
	// 电子保单下载地址
	PolUrl *string `json:"pol_url,omitempty" xml:"pol_url,omitempty"`
	// 总保费
	TotalPremium *string `json:"total_premium,omitempty" xml:"total_premium,omitempty"`
	// 订单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s ApplyDigitalLogisticInsurancepolicyUniversalResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticInsurancepolicyUniversalResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetReqMsgId(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetResultCode(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetResultMsg(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetPolNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.PolNo = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetPolUrl(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.PolUrl = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetTotalPremium(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.TotalPremium = &v
	return s
}

func (s *ApplyDigitalLogisticInsurancepolicyUniversalResponse) SetTradeNo(v string) *ApplyDigitalLogisticInsurancepolicyUniversalResponse {
	s.TradeNo = &v
	return s
}

type CancelDigitalLogisticInsurancepolicyUniversalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 投保订单号
	ApplyTradeNo *string `json:"apply_trade_no,omitempty" xml:"apply_trade_no,omitempty" maxLength:"50"`
	// 保司, 01-华泰, 03-亚太
	ExternalChannelCode *string `json:"external_channel_code,omitempty" xml:"external_channel_code,omitempty" maxLength:"2"`
	// 险种, 01-承运人平台责任险
	//
	ExternalProductCode *string `json:"external_product_code,omitempty" xml:"external_product_code,omitempty" maxLength:"2"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty" maxLength:"50"`
	// 退保全局唯一流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"50"`
}

func (s CancelDigitalLogisticInsurancepolicyUniversalRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticInsurancepolicyUniversalRequest) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetAuthToken(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetProductInstanceId(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetRegionName(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.RegionName = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetApplyTradeNo(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.ApplyTradeNo = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetExternalChannelCode(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.ExternalChannelCode = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetExternalProductCode(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.ExternalProductCode = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetPolNo(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.PolNo = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalRequest) SetTradeNo(v string) *CancelDigitalLogisticInsurancepolicyUniversalRequest {
	s.TradeNo = &v
	return s
}

type CancelDigitalLogisticInsurancepolicyUniversalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 投保订单号
	ApplyTradeNo *string `json:"apply_trade_no,omitempty" xml:"apply_trade_no,omitempty"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty"`
	// 退还保费
	SendBackPremium *string `json:"send_back_premium,omitempty" xml:"send_back_premium,omitempty"`
	// 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
	SuccessSurrenderTime *string `json:"success_surrender_time,omitempty" xml:"success_surrender_time,omitempty"`
	// 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
	SurrenderEffectiveTime *string `json:"surrender_effective_time,omitempty" xml:"surrender_effective_time,omitempty"`
}

func (s CancelDigitalLogisticInsurancepolicyUniversalResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelDigitalLogisticInsurancepolicyUniversalResponse) GoString() string {
	return s.String()
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetReqMsgId(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetResultCode(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetResultMsg(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetApplyTradeNo(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.ApplyTradeNo = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetPolNo(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.PolNo = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetSendBackPremium(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.SendBackPremium = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetSuccessSurrenderTime(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.SuccessSurrenderTime = &v
	return s
}

func (s *CancelDigitalLogisticInsurancepolicyUniversalResponse) SetSurrenderEffectiveTime(v string) *CancelDigitalLogisticInsurancepolicyUniversalResponse {
	s.SurrenderEffectiveTime = &v
	return s
}

type PushDigitalLogisticInsuranceOlpRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被保人证件号
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty" maxLength:"50"`
	// 被保人名称
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty" maxLength:"100"`
	// 被保人类型, 1-个人 2-企业
	//
	BbrType *string `json:"bbr_type,omitempty" xml:"bbr_type,omitempty" maxLength:"10"`
	// 保险公司编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" maxLength:"50"`
	// 保险公司名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" maxLength:"100"`
	// 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
	ClaimStatus *string `json:"claim_status,omitempty" xml:"claim_status,omitempty" maxLength:"10"`
	// 投保时间
	InsureDate *string `json:"insure_date,omitempty" xml:"insure_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保险止期
	InsureEnd *string `json:"insure_end,omitempty" xml:"insure_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保险起期
	InsureStart *string `json:"insure_start,omitempty" xml:"insure_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 存证平台编码
	PlatformConsumerCode *string `json:"platform_consumer_code,omitempty" xml:"platform_consumer_code,omitempty" maxLength:"50"`
	// 存证平台名称
	PlatformConsumerName *string `json:"platform_consumer_name,omitempty" xml:"platform_consumer_name,omitempty" maxLength:"100"`
	// 保单文件id，可支持多个，逗号隔开
	PolFileIds *string `json:"pol_file_ids,omitempty" xml:"pol_file_ids,omitempty" maxLength:"3200"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty" maxLength:"100"`
	// 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
	PolStatus *string `json:"pol_status,omitempty" xml:"pol_status,omitempty" maxLength:"12"`
	// 电子保单url地址
	PolUrl *string `json:"pol_url,omitempty" xml:"pol_url,omitempty" maxLength:"500"`
	// 保费
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty" maxLength:"20"`
	// 险种代码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" maxLength:"50"`
	// 险种名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" maxLength:"100"`
	// 退保时间
	SurrenderTime *string `json:"surrender_time,omitempty" xml:"surrender_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty" maxLength:"50"`
	// 投保人名称
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" maxLength:"100"`
	// 投保人类型, 1-个人 2-企业
	TbrType *string `json:"tbr_type,omitempty" xml:"tbr_type,omitempty" maxLength:"10"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"200"`
}

func (s PushDigitalLogisticInsuranceOlpRequest) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticInsuranceOlpRequest) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetAuthToken(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.AuthToken = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetProductInstanceId(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetRegionName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.RegionName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetBbrIdNo(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.BbrIdNo = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetBbrName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.BbrName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetBbrType(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.BbrType = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetChannelCode(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ChannelCode = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetChannelName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ChannelName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetClaimStatus(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ClaimStatus = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetInsureDate(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.InsureDate = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetInsureEnd(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.InsureEnd = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetInsureStart(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.InsureStart = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPlatformConsumerCode(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PlatformConsumerCode = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPlatformConsumerName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PlatformConsumerName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPolFileIds(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PolFileIds = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPolNo(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PolNo = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPolStatus(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PolStatus = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPolUrl(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.PolUrl = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetPremium(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.Premium = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetProductCode(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ProductCode = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetProductName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.ProductName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetSurrenderTime(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.SurrenderTime = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetTbrIdNo(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.TbrIdNo = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetTbrName(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.TbrName = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetTbrType(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.TbrType = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpRequest) SetTradeNo(v string) *PushDigitalLogisticInsuranceOlpRequest {
	s.TradeNo = &v
	return s
}

type PushDigitalLogisticInsuranceOlpResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PushDigitalLogisticInsuranceOlpResponse) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticInsuranceOlpResponse) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticInsuranceOlpResponse) SetReqMsgId(v string) *PushDigitalLogisticInsuranceOlpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpResponse) SetResultCode(v string) *PushDigitalLogisticInsuranceOlpResponse {
	s.ResultCode = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpResponse) SetResultMsg(v string) *PushDigitalLogisticInsuranceOlpResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushDigitalLogisticInsuranceOlpResponse) SetStatus(v string) *PushDigitalLogisticInsuranceOlpResponse {
	s.Status = &v
	return s
}

type UpdateDigitalLogisticInsuranceOlpRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被保人证件号
	BbrIdNo *string `json:"bbr_id_no,omitempty" xml:"bbr_id_no,omitempty" maxLength:"50"`
	// 被保人名称
	BbrName *string `json:"bbr_name,omitempty" xml:"bbr_name,omitempty" maxLength:"100"`
	// 被保人类型, 1-个人 2-企业
	BbrType *string `json:"bbr_type,omitempty" xml:"bbr_type,omitempty" maxLength:"10"`
	// 保险公司编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" maxLength:"50"`
	// 保险公司名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" maxLength:"100"`
	// 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
	ClaimStatus *string `json:"claim_status,omitempty" xml:"claim_status,omitempty" maxLength:"10"`
	// 投保时间
	InsureDate *string `json:"insure_date,omitempty" xml:"insure_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保险止期
	InsureEnd *string `json:"insure_end,omitempty" xml:"insure_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 保险起期
	InsureStart *string `json:"insure_start,omitempty" xml:"insure_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 存证平台编码
	PlatformConsumerCode *string `json:"platform_consumer_code,omitempty" xml:"platform_consumer_code,omitempty" maxLength:"50"`
	// 存证平台名称
	PlatformConsumerName *string `json:"platform_consumer_name,omitempty" xml:"platform_consumer_name,omitempty" maxLength:"100"`
	// 保单文件id，可支持多个，逗号隔开
	PolFileIds *string `json:"pol_file_ids,omitempty" xml:"pol_file_ids,omitempty" maxLength:"3200"`
	// 保单号
	PolNo *string `json:"pol_no,omitempty" xml:"pol_no,omitempty" maxLength:"100"`
	// 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
	PolStatus *string `json:"pol_status,omitempty" xml:"pol_status,omitempty" maxLength:"12"`
	// 电子保单url地址
	PolUrl *string `json:"pol_url,omitempty" xml:"pol_url,omitempty" maxLength:"500"`
	// 保费
	//
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty" maxLength:"20"`
	// 险种代码
	//
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" maxLength:"50"`
	// 险种名称
	//
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" maxLength:"100"`
	// 退保时间
	SurrenderTime *string `json:"surrender_time,omitempty" xml:"surrender_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 投保人证件号
	TbrIdNo *string `json:"tbr_id_no,omitempty" xml:"tbr_id_no,omitempty" maxLength:"50"`
	// 投保人名称
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" maxLength:"100"`
	// 投保人类型, 1-个人 2-企业
	TbrType *string `json:"tbr_type,omitempty" xml:"tbr_type,omitempty" maxLength:"10"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"200"`
}

func (s UpdateDigitalLogisticInsuranceOlpRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticInsuranceOlpRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetAuthToken(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetRegionName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetBbrIdNo(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.BbrIdNo = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetBbrName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.BbrName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetBbrType(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.BbrType = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetChannelCode(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ChannelCode = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetChannelName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ChannelName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetClaimStatus(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ClaimStatus = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetInsureDate(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.InsureDate = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetInsureEnd(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.InsureEnd = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetInsureStart(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.InsureStart = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPlatformConsumerCode(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PlatformConsumerCode = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPlatformConsumerName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PlatformConsumerName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPolFileIds(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PolFileIds = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPolNo(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PolNo = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPolStatus(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PolStatus = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPolUrl(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.PolUrl = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetPremium(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.Premium = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetProductCode(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetProductName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.ProductName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetSurrenderTime(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.SurrenderTime = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetTbrIdNo(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.TbrIdNo = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetTbrName(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.TbrName = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetTbrType(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.TbrType = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpRequest) SetTradeNo(v string) *UpdateDigitalLogisticInsuranceOlpRequest {
	s.TradeNo = &v
	return s
}

type UpdateDigitalLogisticInsuranceOlpResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UpdateDigitalLogisticInsuranceOlpResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticInsuranceOlpResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticInsuranceOlpResponse) SetReqMsgId(v string) *UpdateDigitalLogisticInsuranceOlpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpResponse) SetResultCode(v string) *UpdateDigitalLogisticInsuranceOlpResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpResponse) SetResultMsg(v string) *UpdateDigitalLogisticInsuranceOlpResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticInsuranceOlpResponse) SetStatus(v string) *UpdateDigitalLogisticInsuranceOlpResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticPfPaymentRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务参考号
	BussRefrNo *string `json:"buss_refr_no,omitempty" xml:"buss_refr_no,omitempty" maxLength:"100"`
	// 支用id
	FinancingId *string `json:"financing_id,omitempty" xml:"financing_id,omitempty" maxLength:"32"`
}

func (s QueryDigitalLogisticPfPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfPaymentRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfPaymentRequest) SetAuthToken(v string) *QueryDigitalLogisticPfPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentRequest) SetProductInstanceId(v string) *QueryDigitalLogisticPfPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentRequest) SetRegionName(v string) *QueryDigitalLogisticPfPaymentRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentRequest) SetBussRefrNo(v string) *QueryDigitalLogisticPfPaymentRequest {
	s.BussRefrNo = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentRequest) SetFinancingId(v string) *QueryDigitalLogisticPfPaymentRequest {
	s.FinancingId = &v
	return s
}

type QueryDigitalLogisticPfPaymentResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 入账状态: 10-受理 20-在途 00-成功 99-失败
	AccountinStatus *string `json:"accountin_status,omitempty" xml:"accountin_status,omitempty"`
	// 交易时间
	TradeTime *string `json:"trade_time,omitempty" xml:"trade_time,omitempty"`
}

func (s QueryDigitalLogisticPfPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfPaymentResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfPaymentResponse) SetReqMsgId(v string) *QueryDigitalLogisticPfPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentResponse) SetResultCode(v string) *QueryDigitalLogisticPfPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentResponse) SetResultMsg(v string) *QueryDigitalLogisticPfPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentResponse) SetAccountinStatus(v string) *QueryDigitalLogisticPfPaymentResponse {
	s.AccountinStatus = &v
	return s
}

func (s *QueryDigitalLogisticPfPaymentResponse) SetTradeTime(v string) *QueryDigitalLogisticPfPaymentResponse {
	s.TradeTime = &v
	return s
}

type QueryDigitalLogisticPfIouRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty" maxLength:"20"`
	// 借据Id
	DebitId *string `json:"debit_id,omitempty" xml:"debit_id,omitempty" maxLength:"16"`
	// 支用Id
	FinancingId *string `json:"financing_id,omitempty" xml:"financing_id,omitempty" maxLength:"32"`
}

func (s QueryDigitalLogisticPfIouRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfIouRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfIouRequest) SetAuthToken(v string) *QueryDigitalLogisticPfIouRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticPfIouRequest) SetProductInstanceId(v string) *QueryDigitalLogisticPfIouRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticPfIouRequest) SetRegionName(v string) *QueryDigitalLogisticPfIouRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticPfIouRequest) SetCustomerNo(v string) *QueryDigitalLogisticPfIouRequest {
	s.CustomerNo = &v
	return s
}

func (s *QueryDigitalLogisticPfIouRequest) SetDebitId(v string) *QueryDigitalLogisticPfIouRequest {
	s.DebitId = &v
	return s
}

func (s *QueryDigitalLogisticPfIouRequest) SetFinancingId(v string) *QueryDigitalLogisticPfIouRequest {
	s.FinancingId = &v
	return s
}

type QueryDigitalLogisticPfIouResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行年利率
	AnnualInterestRate *string `json:"annual_interest_rate,omitempty" xml:"annual_interest_rate,omitempty"`
	// 借据Id
	CreditId *string `json:"credit_id,omitempty" xml:"credit_id,omitempty"`
	// 借据到期日
	InterestBearingEnd *string `json:"interest_bearing_end,omitempty" xml:"interest_bearing_end,omitempty"`
	// 借据起息日
	InterestBearingStart *string `json:"interest_bearing_start,omitempty" xml:"interest_bearing_start,omitempty"`
	// 发放金额
	IssuedAmount *string `json:"issued_amount,omitempty" xml:"issued_amount,omitempty"`
	// 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
	LoanNature *string `json:"loan_nature,omitempty" xml:"loan_nature,omitempty"`
	// 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
	LoanStatus *string `json:"loan_status,omitempty" xml:"loan_status,omitempty"`
	// 下次结息日期
	NextParsingDate *string `json:"next_parsing_date,omitempty" xml:"next_parsing_date,omitempty"`
	// 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
	OdiCalType *string `json:"odi_cal_type,omitempty" xml:"odi_cal_type,omitempty"`
	// 逾期罚息浮动比率
	OpiFloatingRatio *string `json:"opi_floating_ratio,omitempty" xml:"opi_floating_ratio,omitempty"`
	// 贷款入账账号
	PayAccount *string `json:"pay_account,omitempty" xml:"pay_account,omitempty"`
	// 本金余额
	PrincipalBalance *string `json:"principal_balance,omitempty" xml:"principal_balance,omitempty"`
	// 还款账号
	RepayAccount *string `json:"repay_account,omitempty" xml:"repay_account,omitempty"`
}

func (s QueryDigitalLogisticPfIouResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfIouResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfIouResponse) SetReqMsgId(v string) *QueryDigitalLogisticPfIouResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetResultCode(v string) *QueryDigitalLogisticPfIouResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetResultMsg(v string) *QueryDigitalLogisticPfIouResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetAnnualInterestRate(v string) *QueryDigitalLogisticPfIouResponse {
	s.AnnualInterestRate = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetCreditId(v string) *QueryDigitalLogisticPfIouResponse {
	s.CreditId = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetInterestBearingEnd(v string) *QueryDigitalLogisticPfIouResponse {
	s.InterestBearingEnd = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetInterestBearingStart(v string) *QueryDigitalLogisticPfIouResponse {
	s.InterestBearingStart = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetIssuedAmount(v string) *QueryDigitalLogisticPfIouResponse {
	s.IssuedAmount = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetLoanNature(v string) *QueryDigitalLogisticPfIouResponse {
	s.LoanNature = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetLoanStatus(v string) *QueryDigitalLogisticPfIouResponse {
	s.LoanStatus = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetNextParsingDate(v string) *QueryDigitalLogisticPfIouResponse {
	s.NextParsingDate = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetOdiCalType(v string) *QueryDigitalLogisticPfIouResponse {
	s.OdiCalType = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetOpiFloatingRatio(v string) *QueryDigitalLogisticPfIouResponse {
	s.OpiFloatingRatio = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetPayAccount(v string) *QueryDigitalLogisticPfIouResponse {
	s.PayAccount = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetPrincipalBalance(v string) *QueryDigitalLogisticPfIouResponse {
	s.PrincipalBalance = &v
	return s
}

func (s *QueryDigitalLogisticPfIouResponse) SetRepayAccount(v string) *QueryDigitalLogisticPfIouResponse {
	s.RepayAccount = &v
	return s
}

type QueryDigitalLogisticPfQuotaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" maxLength:"20"`
	// 证件类型;050 统一社会信用证代码
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" maxLength:"3"`
	// 银行端客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty" maxLength:"20"`
	// 融资主体did
	FinancingSubjectDid *string `json:"financing_subject_did,omitempty" xml:"financing_subject_did,omitempty"`
}

func (s QueryDigitalLogisticPfQuotaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfQuotaRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetAuthToken(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetProductInstanceId(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetRegionName(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetCertNo(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetCertType(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.CertType = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetCustomerNo(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.CustomerNo = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaRequest) SetFinancingSubjectDid(v string) *QueryDigitalLogisticPfQuotaRequest {
	s.FinancingSubjectDid = &v
	return s
}

type QueryDigitalLogisticPfQuotaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授信额度信息
	QuotaInfo []*PfCreditQuotaInfo `json:"quota_info,omitempty" xml:"quota_info,omitempty" type:"Repeated"`
}

func (s QueryDigitalLogisticPfQuotaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfQuotaResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfQuotaResponse) SetReqMsgId(v string) *QueryDigitalLogisticPfQuotaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaResponse) SetResultCode(v string) *QueryDigitalLogisticPfQuotaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaResponse) SetResultMsg(v string) *QueryDigitalLogisticPfQuotaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticPfQuotaResponse) SetQuotaInfo(v []*PfCreditQuotaInfo) *QueryDigitalLogisticPfQuotaResponse {
	s.QuotaInfo = v
	return s
}

type ApplyDigitalLogisticPfWaybillfinancingRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 承运商did
	CarrierDid *string `json:"carrier_did,omitempty" xml:"carrier_did,omitempty" maxLength:"80"`
	// 融资支用金额；总长度最长15位，保留2位小数，四舍五入
	FinancingAmount *string `json:"financing_amount,omitempty" xml:"financing_amount,omitempty"`
	// 支用币种，支持 CNY,USD
	FinancingCurrency *string `json:"financing_currency,omitempty" xml:"financing_currency,omitempty"`
	// 融资授信主体公司分布式数字身份
	FinancingSubjectDid *string `json:"financing_subject_did,omitempty" xml:"financing_subject_did,omitempty" maxLength:"80"`
	// 贷款期限，值为2~6，单位为月
	LoanTerm *string `json:"loan_term,omitempty" xml:"loan_term,omitempty" maxLength:"6" minLength:"2"`
	// 收款方开户行总行联行号
	PayeeBankNumber *string `json:"payee_bank_number,omitempty" xml:"payee_bank_number,omitempty" maxLength:"32"`
	// 收款方开户行名称
	PayeeBcb *string `json:"payee_bcb,omitempty" xml:"payee_bcb,omitempty" maxLength:"200"`
	// 收款方开户行银行卡号
	PayeeBcbCardNo *string `json:"payee_bcb_card_no,omitempty" xml:"payee_bcb_card_no,omitempty"`
	// 收款方证件号
	//
	//
	PayeeIdNumber *string `json:"payee_id_number,omitempty" xml:"payee_id_number,omitempty" maxLength:"40"`
	// 收款方证件类型
	PayeeIdType *string `json:"payee_id_type,omitempty" xml:"payee_id_type,omitempty" maxLength:"5"`
	// 收款方名称
	PayeeName *string `json:"payee_name,omitempty" xml:"payee_name,omitempty" maxLength:"200"`
	// 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2
	Purpose *string `json:"purpose,omitempty" xml:"purpose,omitempty"`
	// 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" maxLength:"23"`
	// 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" maxLength:"800"`
	// 转账附言
	// 1: 工资、奖金收入
	// 2：稿费、演出费等劳务收入
	// 3：债券、期货、信托等投资的本金和收益
	// 4：个人债券或产权转让收益
	// 该字段建议填写 2
	TransferPostscript *string `json:"transfer_postscript,omitempty" xml:"transfer_postscript,omitempty" maxLength:"3"`
	// 凭证类型，支持 WAYBILL,PAYABLE
	VoucherCategory *string `json:"voucher_category,omitempty" xml:"voucher_category,omitempty"`
	// 支用凭证ids，支持多个，逗号隔开；
	VoucherIds *string `json:"voucher_ids,omitempty" xml:"voucher_ids,omitempty" maxLength:"2000"`
	// 8位发票号，支持多个，逗号分隔
	VoucherInvoiceCodes *string `json:"voucher_invoice_codes,omitempty" xml:"voucher_invoice_codes,omitempty" maxLength:"800"`
}

func (s ApplyDigitalLogisticPfWaybillfinancingRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticPfWaybillfinancingRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetAuthToken(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetProductInstanceId(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetRegionName(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.RegionName = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetCarrierDid(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.CarrierDid = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetFinancingAmount(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.FinancingAmount = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetFinancingCurrency(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.FinancingCurrency = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetFinancingSubjectDid(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.FinancingSubjectDid = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetLoanTerm(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.LoanTerm = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeBankNumber(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeBankNumber = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeBcb(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeBcb = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeBcbCardNo(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeBcbCardNo = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeIdNumber(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeIdNumber = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeIdType(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeIdType = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPayeeName(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.PayeeName = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetPurpose(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.Purpose = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetRequestNo(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.RequestNo = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetSignature(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.Signature = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetTransferPostscript(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.TransferPostscript = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetVoucherCategory(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.VoucherCategory = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetVoucherIds(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.VoucherIds = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingRequest) SetVoucherInvoiceCodes(v string) *ApplyDigitalLogisticPfWaybillfinancingRequest {
	s.VoucherInvoiceCodes = &v
	return s
}

type ApplyDigitalLogisticPfWaybillfinancingResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 融资支用Id
	FinancingId *string `json:"financing_id,omitempty" xml:"financing_id,omitempty"`
	// 申请状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApplyDigitalLogisticPfWaybillfinancingResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalLogisticPfWaybillfinancingResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalLogisticPfWaybillfinancingResponse) SetReqMsgId(v string) *ApplyDigitalLogisticPfWaybillfinancingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingResponse) SetResultCode(v string) *ApplyDigitalLogisticPfWaybillfinancingResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingResponse) SetResultMsg(v string) *ApplyDigitalLogisticPfWaybillfinancingResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingResponse) SetFinancingId(v string) *ApplyDigitalLogisticPfWaybillfinancingResponse {
	s.FinancingId = &v
	return s
}

func (s *ApplyDigitalLogisticPfWaybillfinancingResponse) SetStatus(v string) *ApplyDigitalLogisticPfWaybillfinancingResponse {
	s.Status = &v
	return s
}

type PushDigitalLogisticPfPledgeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账单标识
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty" maxLength:"128" minLength:"1"`
	// 融资主体did
	FinancingSubjectDid *string `json:"financing_subject_did,omitempty" xml:"financing_subject_did,omitempty" maxLength:"128" minLength:"1"`
	// 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" maxLength:"32" minLength:"16"`
}

func (s PushDigitalLogisticPfPledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticPfPledgeRequest) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticPfPledgeRequest) SetAuthToken(v string) *PushDigitalLogisticPfPledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeRequest) SetProductInstanceId(v string) *PushDigitalLogisticPfPledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeRequest) SetRegionName(v string) *PushDigitalLogisticPfPledgeRequest {
	s.RegionName = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeRequest) SetBillId(v string) *PushDigitalLogisticPfPledgeRequest {
	s.BillId = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeRequest) SetFinancingSubjectDid(v string) *PushDigitalLogisticPfPledgeRequest {
	s.FinancingSubjectDid = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeRequest) SetRequestNo(v string) *PushDigitalLogisticPfPledgeRequest {
	s.RequestNo = &v
	return s
}

type PushDigitalLogisticPfPledgeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 质押标识，用于账单质押推送状态查询
	PledgeId *string `json:"pledge_id,omitempty" xml:"pledge_id,omitempty"`
	// 质押推送状态；applied：已申请；failure：失败；由于质押推送过程为异步，若通过了前期的业务校验，将返回已申请状态；后续可使用质押Id查询质押推送终态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PushDigitalLogisticPfPledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s PushDigitalLogisticPfPledgeResponse) GoString() string {
	return s.String()
}

func (s *PushDigitalLogisticPfPledgeResponse) SetReqMsgId(v string) *PushDigitalLogisticPfPledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeResponse) SetResultCode(v string) *PushDigitalLogisticPfPledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeResponse) SetResultMsg(v string) *PushDigitalLogisticPfPledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeResponse) SetDesc(v string) *PushDigitalLogisticPfPledgeResponse {
	s.Desc = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeResponse) SetPledgeId(v string) *PushDigitalLogisticPfPledgeResponse {
	s.PledgeId = &v
	return s
}

func (s *PushDigitalLogisticPfPledgeResponse) SetStatus(v string) *PushDigitalLogisticPfPledgeResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticPfPledgeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 质押id
	PledgeId *string `json:"pledge_id,omitempty" xml:"pledge_id,omitempty" maxLength:"32" minLength:"16"`
}

func (s QueryDigitalLogisticPfPledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfPledgeRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfPledgeRequest) SetAuthToken(v string) *QueryDigitalLogisticPfPledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeRequest) SetProductInstanceId(v string) *QueryDigitalLogisticPfPledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeRequest) SetRegionName(v string) *QueryDigitalLogisticPfPledgeRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeRequest) SetPledgeId(v string) *QueryDigitalLogisticPfPledgeRequest {
	s.PledgeId = &v
	return s
}

type QueryDigitalLogisticPfPledgeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账单id
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty"`
	// 状态描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 融资主体did
	FinancingSubjectDid *string `json:"financing_subject_did,omitempty" xml:"financing_subject_did,omitempty"`
	// 推送状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryDigitalLogisticPfPledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfPledgeResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetReqMsgId(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetResultCode(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetResultMsg(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetBillId(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.BillId = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetDesc(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.Desc = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetFinancingSubjectDid(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.FinancingSubjectDid = &v
	return s
}

func (s *QueryDigitalLogisticPfPledgeResponse) SetStatus(v string) *QueryDigitalLogisticPfPledgeResponse {
	s.Status = &v
	return s
}

type QueryDigitalLogisticPfFinancingRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 支用Id
	FinancingId *string `json:"financing_id,omitempty" xml:"financing_id,omitempty"`
}

func (s QueryDigitalLogisticPfFinancingRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfFinancingRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfFinancingRequest) SetAuthToken(v string) *QueryDigitalLogisticPfFinancingRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingRequest) SetProductInstanceId(v string) *QueryDigitalLogisticPfFinancingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingRequest) SetRegionName(v string) *QueryDigitalLogisticPfFinancingRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingRequest) SetFinancingId(v string) *QueryDigitalLogisticPfFinancingRequest {
	s.FinancingId = &v
	return s
}

type QueryDigitalLogisticPfFinancingResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 支用Id
	FinancingId *string `json:"financing_id,omitempty" xml:"financing_id,omitempty"`
}

func (s QueryDigitalLogisticPfFinancingResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticPfFinancingResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetReqMsgId(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetResultCode(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetResultMsg(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetStatus(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.Status = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetDesc(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.Desc = &v
	return s
}

func (s *QueryDigitalLogisticPfFinancingResponse) SetFinancingId(v string) *QueryDigitalLogisticPfFinancingResponse {
	s.FinancingId = &v
	return s
}

type CreateDigitalLogisticDidForwarderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理did
	AgentDid *string `json:"agent_did,omitempty" xml:"agent_did,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人身份证号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s CreateDigitalLogisticDidForwarderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidForwarderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetAuthToken(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetRegionName(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetAgentDid(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.AgentDid = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetEpCertName(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetEpCertNo(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticDidForwarderRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CreateDigitalLogisticDidForwarderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 货代did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticDidForwarderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidForwarderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidForwarderResponse) SetReqMsgId(v string) *CreateDigitalLogisticDidForwarderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderResponse) SetResultCode(v string) *CreateDigitalLogisticDidForwarderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderResponse) SetResultMsg(v string) *CreateDigitalLogisticDidForwarderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDidForwarderResponse) SetDid(v string) *CreateDigitalLogisticDidForwarderResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticDidSaasplatformRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人身份证
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s CreateDigitalLogisticDidSaasplatformRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidSaasplatformRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetAuthToken(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetRegionName(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetEpCertName(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetEpCertNo(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticDidSaasplatformRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CreateDigitalLogisticDidSaasplatformResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// saas平台did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticDidSaasplatformResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidSaasplatformResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidSaasplatformResponse) SetReqMsgId(v string) *CreateDigitalLogisticDidSaasplatformResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformResponse) SetResultCode(v string) *CreateDigitalLogisticDidSaasplatformResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformResponse) SetResultMsg(v string) *CreateDigitalLogisticDidSaasplatformResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDidSaasplatformResponse) SetDid(v string) *CreateDigitalLogisticDidSaasplatformResponse {
	s.Did = &v
	return s
}

type CreateDigitalLogisticDidClientRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理did
	AgentDid *string `json:"agent_did,omitempty" xml:"agent_did,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人身份证号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s CreateDigitalLogisticDidClientRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidClientRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidClientRequest) SetAuthToken(v string) *CreateDigitalLogisticDidClientRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDidClientRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetRegionName(v string) *CreateDigitalLogisticDidClientRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetAgentDid(v string) *CreateDigitalLogisticDidClientRequest {
	s.AgentDid = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetEpCertName(v string) *CreateDigitalLogisticDidClientRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetEpCertNo(v string) *CreateDigitalLogisticDidClientRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDidClientRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticDidClientRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidClientRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticDidClientRequest {
	s.LegalPersonCertNo = &v
	return s
}

type CreateDigitalLogisticDidClientResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 直客did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticDidClientResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidClientResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidClientResponse) SetReqMsgId(v string) *CreateDigitalLogisticDidClientResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDidClientResponse) SetResultCode(v string) *CreateDigitalLogisticDidClientResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDidClientResponse) SetResultMsg(v string) *CreateDigitalLogisticDidClientResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDidClientResponse) SetDid(v string) *CreateDigitalLogisticDidClientResponse {
	s.Did = &v
	return s
}

type SaveDigitalLogisticBizOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 提单要求
	BlRequest *string `json:"bl_request,omitempty" xml:"bl_request,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 船公司
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 客户did  业务必填
	ClientDid *string `json:"client_did,omitempty" xml:"client_did,omitempty"`
	// 收货人
	Consignee *string `json:"consignee,omitempty" xml:"consignee,omitempty"`
	// 约号
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty"`
	// 报关
	CustomsClearance *string `json:"customs_clearance,omitempty" xml:"customs_clearance,omitempty"`
	// 目的地 业务必填
	//
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 运输条款
	DeliveryTerms *string `json:"delivery_terms,omitempty" xml:"delivery_terms,omitempty"`
	// 卸货港. 业务必填
	//
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 运费
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 保险
	Insurance *string `json:"insurance,omitempty" xml:"insurance,omitempty"`
	// 放单地点
	IssuePlace *string `json:"issue_place,omitempty" xml:"issue_place,omitempty"`
	// 起运港. 业务必填
	//
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	// 裝卸方式
	Movement *string `json:"movement,omitempty" xml:"movement,omitempty"`
	// 通知方
	NotifyParty *string `json:"notify_party,omitempty" xml:"notify_party,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 付费方式 业务必填
	//
	PaymentTerms *string `json:"payment_terms,omitempty" xml:"payment_terms,omitempty"`
	// 拖车
	PickUp *string `json:"pick_up,omitempty" xml:"pick_up,omitempty"`
	// 收货地点
	ReceiptPlace *string `json:"receipt_place,omitempty" xml:"receipt_place,omitempty"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 发货人
	Shipper *string `json:"shipper,omitempty" xml:"shipper,omitempty"`
	// 任务单号
	TaskOrder *string `json:"task_order,omitempty" xml:"task_order,omitempty"`
	// 运输方式
	Transportation *string `json:"transportation,omitempty" xml:"transportation,omitempty"`
	// 船名
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s SaveDigitalLogisticBizOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizOrderRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizOrderRequest) SetAuthToken(v string) *SaveDigitalLogisticBizOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetRegionName(v string) *SaveDigitalLogisticBizOrderRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetAction(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetBlRequest(v string) *SaveDigitalLogisticBizOrderRequest {
	s.BlRequest = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetBookingNo(v string) *SaveDigitalLogisticBizOrderRequest {
	s.BookingNo = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetCarrier(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Carrier = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetClientDid(v string) *SaveDigitalLogisticBizOrderRequest {
	s.ClientDid = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetConsignee(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Consignee = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetContract(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Contract = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetCustomsClearance(v string) *SaveDigitalLogisticBizOrderRequest {
	s.CustomsClearance = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetDeliveryPlace(v string) *SaveDigitalLogisticBizOrderRequest {
	s.DeliveryPlace = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetDeliveryTerms(v string) *SaveDigitalLogisticBizOrderRequest {
	s.DeliveryTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetDischargePort(v string) *SaveDigitalLogisticBizOrderRequest {
	s.DischargePort = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizOrderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetFreight(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Freight = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetInsurance(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Insurance = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetIssuePlace(v string) *SaveDigitalLogisticBizOrderRequest {
	s.IssuePlace = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetLoadingPort(v string) *SaveDigitalLogisticBizOrderRequest {
	s.LoadingPort = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetMovement(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Movement = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetNotifyParty(v string) *SaveDigitalLogisticBizOrderRequest {
	s.NotifyParty = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetOrderNo(v string) *SaveDigitalLogisticBizOrderRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetPaymentTerms(v string) *SaveDigitalLogisticBizOrderRequest {
	s.PaymentTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetPickUp(v string) *SaveDigitalLogisticBizOrderRequest {
	s.PickUp = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetReceiptPlace(v string) *SaveDigitalLogisticBizOrderRequest {
	s.ReceiptPlace = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetRemark(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Remark = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetShipper(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Shipper = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetTaskOrder(v string) *SaveDigitalLogisticBizOrderRequest {
	s.TaskOrder = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetTransportation(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Transportation = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetVessel(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Vessel = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderRequest) SetVoyage(v string) *SaveDigitalLogisticBizOrderRequest {
	s.Voyage = &v
	return s
}

type SaveDigitalLogisticBizOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizOrderResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizOrderResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderResponse) SetResultCode(v string) *SaveDigitalLogisticBizOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderResponse) SetResultMsg(v string) *SaveDigitalLogisticBizOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizOrderResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizOrderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizConsignorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 托单code
	ConsignOrderCode *string `json:"consign_order_code,omitempty" xml:"consign_order_code,omitempty"`
	// 托单文件hash  业务必填
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 托单文件id  业务必填
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s SaveDigitalLogisticBizConsignorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizConsignorderRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetAuthToken(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetRegionName(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetAction(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetConsignOrderCode(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.ConsignOrderCode = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetFileHash(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.FileHash = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetFileId(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.FileId = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderRequest) SetOrderNo(v string) *SaveDigitalLogisticBizConsignorderRequest {
	s.OrderNo = &v
	return s
}

type SaveDigitalLogisticBizConsignorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizConsignorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizConsignorderResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizConsignorderResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizConsignorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderResponse) SetResultCode(v string) *SaveDigitalLogisticBizConsignorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderResponse) SetResultMsg(v string) *SaveDigitalLogisticBizConsignorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizConsignorderResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizConsignorderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizGoodsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 预计备货时间 毫秒值单位
	CargoReadyDate *int64 `json:"cargo_ready_date,omitempty" xml:"cargo_ready_date,omitempty"`
	// 危险品页号
	DgPageNo *string `json:"dg_page_no,omitempty" xml:"dg_page_no,omitempty"`
	// 危险品级别
	DgType *string `json:"dg_type,omitempty" xml:"dg_type,omitempty"`
	// 危险品闪点
	FlashPoint *string `json:"flash_point,omitempty" xml:"flash_point,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 货物 业务必填
	//
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 中文品名
	GoodsCn *string `json:"goods_cn,omitempty" xml:"goods_cn,omitempty"`
	// 货物ID
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty"`
	// 货物类型（业务必填）
	GoodsType *string `json:"goods_type,omitempty" xml:"goods_type,omitempty"`
	// HS CODE
	HsCodes []*string `json:"hs_codes,omitempty" xml:"hs_codes,omitempty" type:"Repeated"`
	// 唛头
	Marks *string `json:"marks,omitempty" xml:"marks,omitempty"`
	// 委托件数 业务必填
	//
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 包装类型
	PackageType *string `json:"package_type,omitempty" xml:"package_type,omitempty"`
	// 实际件数
	RealNumber *string `json:"real_number,omitempty" xml:"real_number,omitempty"`
	// 实际体积
	RealVolume *string `json:"real_volume,omitempty" xml:"real_volume,omitempty"`
	// 实际重量
	RealWeight *string `json:"real_weight,omitempty" xml:"real_weight,omitempty"`
	// 危险品联合国编号
	UnNo *string `json:"un_no,omitempty" xml:"un_no,omitempty"`
	// 委托体积（业务必填）
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
	// 委托重量（业务必填）
	Weight *string `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s SaveDigitalLogisticBizGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizGoodsRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetAuthToken(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetRegionName(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetAction(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetCargoReadyDate(v int64) *SaveDigitalLogisticBizGoodsRequest {
	s.CargoReadyDate = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetDgPageNo(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.DgPageNo = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetDgType(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.DgType = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetFlashPoint(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.FlashPoint = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetGoods(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Goods = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetGoodsCn(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.GoodsCn = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetGoodsId(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetGoodsType(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.GoodsType = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetHsCodes(v []*string) *SaveDigitalLogisticBizGoodsRequest {
	s.HsCodes = v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetMarks(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Marks = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetNumber(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Number = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetOrderNo(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetPackageType(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.PackageType = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetRealNumber(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.RealNumber = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetRealVolume(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.RealVolume = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetRealWeight(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.RealWeight = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetUnNo(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.UnNo = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetVolume(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Volume = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsRequest) SetWeight(v string) *SaveDigitalLogisticBizGoodsRequest {
	s.Weight = &v
	return s
}

type SaveDigitalLogisticBizGoodsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizGoodsResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizGoodsResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsResponse) SetResultCode(v string) *SaveDigitalLogisticBizGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsResponse) SetResultMsg(v string) *SaveDigitalLogisticBizGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizGoodsResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizGoodsResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizSonotifyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// so通知关联的订舱单 (业务必填)
	BookingParams []*SoNotifyBookingParam `json:"booking_params,omitempty" xml:"booking_params,omitempty" type:"Repeated"`
	// 联系人
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty"`
	// 联系方式
	ContactType *string `json:"contact_type,omitempty" xml:"contact_type,omitempty"`
	// 卸货港 业务必填
	//
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 起运港 业务必填
	//
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	//
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// soNotify 唯一标识code
	SoNotifyCode *string `json:"so_notify_code,omitempty" xml:"so_notify_code,omitempty"`
}

func (s SaveDigitalLogisticBizSonotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizSonotifyRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetAuthToken(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetRegionName(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetAction(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetBookingParams(v []*SoNotifyBookingParam) *SaveDigitalLogisticBizSonotifyRequest {
	s.BookingParams = v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetContactName(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.ContactName = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetContactType(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.ContactType = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetDischargePort(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.DischargePort = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetLoadingPort(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.LoadingPort = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetOrderNo(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyRequest) SetSoNotifyCode(v string) *SaveDigitalLogisticBizSonotifyRequest {
	s.SoNotifyCode = &v
	return s
}

type SaveDigitalLogisticBizSonotifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizSonotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizSonotifyResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizSonotifyResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizSonotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyResponse) SetResultCode(v string) *SaveDigitalLogisticBizSonotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyResponse) SetResultMsg(v string) *SaveDigitalLogisticBizSonotifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizSonotifyResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizSonotifyResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizBookingorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 船公司 业务必填
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 截关时间
	CustomsClearance *int64 `json:"customs_clearance,omitempty" xml:"customs_clearance,omitempty"`
	// 场站 业务必填
	Cy *string `json:"cy,omitempty" xml:"cy,omitempty"`
	// 截港时间 毫秒值单位
	CyClosing *int64 `json:"cy_closing,omitempty" xml:"cy_closing,omitempty"`
	// 目的地
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 卸货港
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	// 预计船期 毫秒值单位
	Etd *int64 `json:"etd,omitempty" xml:"etd,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 起运港
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 截单时间  毫秒值单位
	SiClosing *int64 `json:"si_closing,omitempty" xml:"si_closing,omitempty"`
	// 特殊字段无要求非必填
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 船名 业务必填
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次 业务必填
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
	// 订舱号
	BkgNo *string `json:"bkg_no,omitempty" xml:"bkg_no,omitempty"`
}

func (s SaveDigitalLogisticBizBookingorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizBookingorderRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetAuthToken(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetRegionName(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetAction(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetBookingNo(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.BookingNo = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetCarrier(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Carrier = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetCustomsClearance(v int64) *SaveDigitalLogisticBizBookingorderRequest {
	s.CustomsClearance = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetCy(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Cy = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetCyClosing(v int64) *SaveDigitalLogisticBizBookingorderRequest {
	s.CyClosing = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetDeliveryPlace(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.DeliveryPlace = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetDischargePort(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.DischargePort = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetEtd(v int64) *SaveDigitalLogisticBizBookingorderRequest {
	s.Etd = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetLoadingPort(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.LoadingPort = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetOrderNo(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetSiClosing(v int64) *SaveDigitalLogisticBizBookingorderRequest {
	s.SiClosing = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetSource(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Source = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetVessel(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Vessel = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetVoyage(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.Voyage = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderRequest) SetBkgNo(v string) *SaveDigitalLogisticBizBookingorderRequest {
	s.BkgNo = &v
	return s
}

type SaveDigitalLogisticBizBookingorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizBookingorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizBookingorderResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizBookingorderResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizBookingorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderResponse) SetResultCode(v string) *SaveDigitalLogisticBizBookingorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderResponse) SetResultMsg(v string) *SaveDigitalLogisticBizBookingorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizBookingorderResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizBookingorderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizContainerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	//
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 集装箱ID
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 箱号 业务必填
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
	//  箱型  业务必填
	ContainerType *string `json:"container_type,omitempty" xml:"container_type,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 货物列表
	GoodsList []*ContainerGoodsParam `json:"goods_list,omitempty" xml:"goods_list,omitempty" type:"Repeated"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 封铅号
	SealNo *string `json:"seal_no,omitempty" xml:"seal_no,omitempty"`
	// 是否SOC
	SocFlag *string `json:"soc_flag,omitempty" xml:"soc_flag,omitempty"`
	// 特殊字段无要求非必填
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s SaveDigitalLogisticBizContainerRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizContainerRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizContainerRequest) SetAuthToken(v string) *SaveDigitalLogisticBizContainerRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizContainerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetRegionName(v string) *SaveDigitalLogisticBizContainerRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetAction(v string) *SaveDigitalLogisticBizContainerRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetBookingNo(v string) *SaveDigitalLogisticBizContainerRequest {
	s.BookingNo = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetContainerId(v string) *SaveDigitalLogisticBizContainerRequest {
	s.ContainerId = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetContainerNo(v string) *SaveDigitalLogisticBizContainerRequest {
	s.ContainerNo = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetContainerType(v string) *SaveDigitalLogisticBizContainerRequest {
	s.ContainerType = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizContainerRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetGoodsList(v []*ContainerGoodsParam) *SaveDigitalLogisticBizContainerRequest {
	s.GoodsList = v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetOrderNo(v string) *SaveDigitalLogisticBizContainerRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetRemark(v string) *SaveDigitalLogisticBizContainerRequest {
	s.Remark = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetSealNo(v string) *SaveDigitalLogisticBizContainerRequest {
	s.SealNo = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetSocFlag(v string) *SaveDigitalLogisticBizContainerRequest {
	s.SocFlag = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerRequest) SetSource(v string) *SaveDigitalLogisticBizContainerRequest {
	s.Source = &v
	return s
}

type SaveDigitalLogisticBizContainerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizContainerResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizContainerResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizContainerResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizContainerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerResponse) SetResultCode(v string) *SaveDigitalLogisticBizContainerResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerResponse) SetResultMsg(v string) *SaveDigitalLogisticBizContainerResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizContainerResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizContainerResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizCustomsorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单号
	BookingParams []*CustomsOrderBookingParam `json:"booking_params,omitempty" xml:"booking_params,omitempty" type:"Repeated"`
	// 报关代理
	Broker *string `json:"broker,omitempty" xml:"broker,omitempty"`
	// 集装箱ID
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 箱号
	ContainerNo *string `json:"container_no,omitempty" xml:"container_no,omitempty"`
	// 报关单号
	CustomsCode *string `json:"customs_code,omitempty" xml:"customs_code,omitempty"`
	//  出口人
	Exporter *string `json:"exporter,omitempty" xml:"exporter,omitempty"`
	// 货代did
	//
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 货物名称
	Goods *string `json:"goods,omitempty" xml:"goods,omitempty"`
	// 毛重
	GrossWeight *string `json:"gross_weight,omitempty" xml:"gross_weight,omitempty"`
	// 订单号
	//
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 件数
	PackagesNo *string `json:"packages_no,omitempty" xml:"packages_no,omitempty"`
	// 报关状态  APPROVED--通关，UNAPPROVED-未通关
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 航名 业务必填
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次 业务必填
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s SaveDigitalLogisticBizCustomsorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizCustomsorderRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetAuthToken(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetRegionName(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetAction(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetBookingParams(v []*CustomsOrderBookingParam) *SaveDigitalLogisticBizCustomsorderRequest {
	s.BookingParams = v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetBroker(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Broker = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetContainerId(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.ContainerId = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetContainerNo(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.ContainerNo = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetCustomsCode(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.CustomsCode = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetExporter(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Exporter = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetGoods(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Goods = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetGrossWeight(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.GrossWeight = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetOrderNo(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetPackagesNo(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.PackagesNo = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetStatus(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Status = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetVessel(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Vessel = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderRequest) SetVoyage(v string) *SaveDigitalLogisticBizCustomsorderRequest {
	s.Voyage = &v
	return s
}

type SaveDigitalLogisticBizCustomsorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizCustomsorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizCustomsorderResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizCustomsorderResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizCustomsorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderResponse) SetResultCode(v string) *SaveDigitalLogisticBizCustomsorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderResponse) SetResultMsg(v string) *SaveDigitalLogisticBizCustomsorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizCustomsorderResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizCustomsorderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizVehicleRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 箱子信息 业务必填
	ContainerParams []*VehicleContainerParam `json:"container_params,omitempty" xml:"container_params,omitempty" type:"Repeated"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 拖车单号
	VehicleCode *string `json:"vehicle_code,omitempty" xml:"vehicle_code,omitempty"`
	// 车牌号
	VehicleNo *string `json:"vehicle_no,omitempty" xml:"vehicle_no,omitempty"`
}

func (s SaveDigitalLogisticBizVehicleRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizVehicleRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetAuthToken(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetRegionName(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetAction(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetContainerParams(v []*VehicleContainerParam) *SaveDigitalLogisticBizVehicleRequest {
	s.ContainerParams = v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetOrderNo(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetVehicleCode(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.VehicleCode = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleRequest) SetVehicleNo(v string) *SaveDigitalLogisticBizVehicleRequest {
	s.VehicleNo = &v
	return s
}

type SaveDigitalLogisticBizVehicleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizVehicleResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizVehicleResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizVehicleResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizVehicleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleResponse) SetResultCode(v string) *SaveDigitalLogisticBizVehicleResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleResponse) SetResultMsg(v string) *SaveDigitalLogisticBizVehicleResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizVehicleResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizVehicleResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizMasterblRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单
	BlBookingParams []*MasterBlBookingParam `json:"bl_booking_params,omitempty" xml:"bl_booking_params,omitempty" type:"Repeated"`
	// 提单要求
	BlRequest *string `json:"bl_request,omitempty" xml:"bl_request,omitempty"`
	// 提单类型
	BlType *string `json:"bl_type,omitempty" xml:"bl_type,omitempty"`
	// 船公司 业务必填
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 收货人 业务必填
	//
	Consignee *string `json:"consignee,omitempty" xml:"consignee,omitempty"`
	// 集装箱列表 业务必填
	//
	ContainerParams []*MasterBlContainerParam `json:"container_params,omitempty" xml:"container_params,omitempty" type:"Repeated"`
	// 约号
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty"`
	// 目的地. 业务必填
	//
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 运输条款
	DeliveryTerms *string `json:"delivery_terms,omitempty" xml:"delivery_terms,omitempty"`
	// 卸货港. 业务必填
	//
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	//
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 运费/约号
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 货物列表. 业务必填
	//
	GoodsParams []*MasterBlGoodsParam `json:"goods_params,omitempty" xml:"goods_params,omitempty" type:"Repeated"`
	// 出单日期
	IssueDate *int64 `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 放单地点
	IssuePlace *string `json:"issue_place,omitempty" xml:"issue_place,omitempty"`
	// 起运港  业务必填
	//
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	// master提单号
	MasterBlNo *string `json:"master_bl_no,omitempty" xml:"master_bl_no,omitempty"`
	// 裝卸方式
	Movement *string `json:"movement,omitempty" xml:"movement,omitempty"`
	// 通知方
	NotifyParty *string `json:"notify_party,omitempty" xml:"notify_party,omitempty"`
	// 开船日期
	OnBoardDate *int64 `json:"on_board_date,omitempty" xml:"on_board_date,omitempty"`
	// 船状态
	OnBoardStatus *string `json:"on_board_status,omitempty" xml:"on_board_status,omitempty"`
	//
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 付费方式  业务必填
	//
	PaymentTerms *string `json:"payment_terms,omitempty" xml:"payment_terms,omitempty"`
	// 前程运输
	PrCarriage *string `json:"pr_carriage,omitempty" xml:"pr_carriage,omitempty"`
	// 其他
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	//  发货人. 业务必填
	//
	Shipper *string `json:"shipper,omitempty" xml:"shipper,omitempty"`
	// 特殊字段无要求非必填
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 运输方式
	Transportation *string `json:"transportation,omitempty" xml:"transportation,omitempty"`
	// 航名 业务必填
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次 业务必填
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s SaveDigitalLogisticBizMasterblRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizMasterblRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetAuthToken(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetRegionName(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetAction(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetBlBookingParams(v []*MasterBlBookingParam) *SaveDigitalLogisticBizMasterblRequest {
	s.BlBookingParams = v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetBlRequest(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.BlRequest = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetBlType(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.BlType = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetCarrier(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Carrier = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetConsignee(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Consignee = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetContainerParams(v []*MasterBlContainerParam) *SaveDigitalLogisticBizMasterblRequest {
	s.ContainerParams = v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetContract(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Contract = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetDeliveryPlace(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.DeliveryPlace = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetDeliveryTerms(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.DeliveryTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetDischargePort(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.DischargePort = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetFreight(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Freight = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetGoodsParams(v []*MasterBlGoodsParam) *SaveDigitalLogisticBizMasterblRequest {
	s.GoodsParams = v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetIssueDate(v int64) *SaveDigitalLogisticBizMasterblRequest {
	s.IssueDate = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetIssuePlace(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.IssuePlace = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetLoadingPort(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.LoadingPort = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetMasterBlNo(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.MasterBlNo = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetMovement(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Movement = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetNotifyParty(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.NotifyParty = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetOnBoardDate(v int64) *SaveDigitalLogisticBizMasterblRequest {
	s.OnBoardDate = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetOnBoardStatus(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.OnBoardStatus = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetOrderNo(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetPaymentTerms(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.PaymentTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetPrCarriage(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.PrCarriage = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetRemark(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Remark = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetShipper(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Shipper = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetSource(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Source = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetTransportation(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Transportation = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetVessel(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Vessel = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblRequest) SetVoyage(v string) *SaveDigitalLogisticBizMasterblRequest {
	s.Voyage = &v
	return s
}

type SaveDigitalLogisticBizMasterblResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizMasterblResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizMasterblResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizMasterblResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizMasterblResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblResponse) SetResultCode(v string) *SaveDigitalLogisticBizMasterblResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblResponse) SetResultMsg(v string) *SaveDigitalLogisticBizMasterblResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizMasterblResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizMasterblResponse {
	s.TxCodes = v
	return s
}

type FinishDigitalLogisticBizAuditRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	//
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	//
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s FinishDigitalLogisticBizAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticBizAuditRequest) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticBizAuditRequest) SetAuthToken(v string) *FinishDigitalLogisticBizAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditRequest) SetProductInstanceId(v string) *FinishDigitalLogisticBizAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditRequest) SetRegionName(v string) *FinishDigitalLogisticBizAuditRequest {
	s.RegionName = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditRequest) SetForwarderDid(v string) *FinishDigitalLogisticBizAuditRequest {
	s.ForwarderDid = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditRequest) SetOrderNo(v string) *FinishDigitalLogisticBizAuditRequest {
	s.OrderNo = &v
	return s
}

type FinishDigitalLogisticBizAuditResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s FinishDigitalLogisticBizAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishDigitalLogisticBizAuditResponse) GoString() string {
	return s.String()
}

func (s *FinishDigitalLogisticBizAuditResponse) SetReqMsgId(v string) *FinishDigitalLogisticBizAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditResponse) SetResultCode(v string) *FinishDigitalLogisticBizAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditResponse) SetResultMsg(v string) *FinishDigitalLogisticBizAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishDigitalLogisticBizAuditResponse) SetTxCodes(v []*TxDto) *FinishDigitalLogisticBizAuditResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBizHouseblRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 订舱单
	BlBookingParams []*HouseBlBookingParam `json:"bl_booking_params,omitempty" xml:"bl_booking_params,omitempty" type:"Repeated"`
	// 提单签发单位
	BlIssuingAgency *string `json:"bl_issuing_agency,omitempty" xml:"bl_issuing_agency,omitempty"`
	// 提单要求
	BlRequest *string `json:"bl_request,omitempty" xml:"bl_request,omitempty"`
	// 提单类型
	BlType *string `json:"bl_type,omitempty" xml:"bl_type,omitempty"`
	// 船公司 业务必填
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 收货人 业务必填
	//
	Consignee *string `json:"consignee,omitempty" xml:"consignee,omitempty"`
	// 集装箱列表 业务必填
	//
	ContainerParams []*HouseBlContainerParam `json:"container_params,omitempty" xml:"container_params,omitempty" type:"Repeated"`
	// 约号
	Contract *string `json:"contract,omitempty" xml:"contract,omitempty"`
	// 目的地  业务必填
	//
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 运输条款
	DeliveryTerms *string `json:"delivery_terms,omitempty" xml:"delivery_terms,omitempty"`
	// 卸货港 业务必填
	//
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 运费
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 货物列表 业务必填
	//
	GoodsParams []*HouseBlGoodsParam `json:"goods_params,omitempty" xml:"goods_params,omitempty" type:"Repeated"`
	// house提单号
	HouseBlNo *string `json:"house_bl_no,omitempty" xml:"house_bl_no,omitempty"`
	// 出单日期
	IssueDate *int64 `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 放单地点
	IssuePlace *string `json:"issue_place,omitempty" xml:"issue_place,omitempty"`
	// 起运港 业务必填
	//
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	// master提单号
	MasterBlNo *string `json:"master_bl_no,omitempty" xml:"master_bl_no,omitempty"`
	// 裝卸方式
	Movement *string `json:"movement,omitempty" xml:"movement,omitempty"`
	// 通知方
	NotifyParty *string `json:"notify_party,omitempty" xml:"notify_party,omitempty"`
	// 开船日期
	OnBoardDate *int64 `json:"on_board_date,omitempty" xml:"on_board_date,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 付费方式 业务必填
	//
	PaymentTerms *string `json:"payment_terms,omitempty" xml:"payment_terms,omitempty"`
	// 其他
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 发货人 业务必填
	//
	Shipper *string `json:"shipper,omitempty" xml:"shipper,omitempty"`
	// 运输方式
	Transportation *string `json:"transportation,omitempty" xml:"transportation,omitempty"`
	// 航名 业务必填
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次 业务必填
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s SaveDigitalLogisticBizHouseblRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizHouseblRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetAuthToken(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetRegionName(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetAction(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetBlBookingParams(v []*HouseBlBookingParam) *SaveDigitalLogisticBizHouseblRequest {
	s.BlBookingParams = v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetBlIssuingAgency(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.BlIssuingAgency = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetBlRequest(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.BlRequest = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetBlType(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.BlType = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetCarrier(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Carrier = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetConsignee(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Consignee = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetContainerParams(v []*HouseBlContainerParam) *SaveDigitalLogisticBizHouseblRequest {
	s.ContainerParams = v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetContract(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Contract = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetDeliveryPlace(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.DeliveryPlace = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetDeliveryTerms(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.DeliveryTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetDischargePort(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.DischargePort = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetFreight(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Freight = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetGoodsParams(v []*HouseBlGoodsParam) *SaveDigitalLogisticBizHouseblRequest {
	s.GoodsParams = v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetHouseBlNo(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.HouseBlNo = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetIssueDate(v int64) *SaveDigitalLogisticBizHouseblRequest {
	s.IssueDate = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetIssuePlace(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.IssuePlace = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetLoadingPort(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.LoadingPort = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetMasterBlNo(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.MasterBlNo = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetMovement(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Movement = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetNotifyParty(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.NotifyParty = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetOnBoardDate(v int64) *SaveDigitalLogisticBizHouseblRequest {
	s.OnBoardDate = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetOrderNo(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetPaymentTerms(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.PaymentTerms = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetRemark(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Remark = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetShipper(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Shipper = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetTransportation(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Transportation = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetVessel(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Vessel = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblRequest) SetVoyage(v string) *SaveDigitalLogisticBizHouseblRequest {
	s.Voyage = &v
	return s
}

type SaveDigitalLogisticBizHouseblResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizHouseblResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizHouseblResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizHouseblResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizHouseblResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblResponse) SetResultCode(v string) *SaveDigitalLogisticBizHouseblResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblResponse) SetResultMsg(v string) *SaveDigitalLogisticBizHouseblResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizHouseblResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizHouseblResponse {
	s.TxCodes = v
	return s
}

type CreateDigitalLogisticBillPaybillorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 申请时间
	ApplyDate *int64 `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 银行收款账户
	BankReceiptAccount *string `json:"bank_receipt_account,omitempty" xml:"bank_receipt_account,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 开户行
	DepositBank *string `json:"deposit_bank,omitempty" xml:"deposit_bank,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应付总额
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty"`
	// 付款单编号
	PayBillOrderCode *string `json:"pay_bill_order_code,omitempty" xml:"pay_bill_order_code,omitempty"`
	// 应付账单资费项 业务必填
	PayBillTariffParams []*PayBillTariffParam `json:"pay_bill_tariff_params,omitempty" xml:"pay_bill_tariff_params,omitempty" type:"Repeated"`
	// 付款公司
	PayCompany *string `json:"pay_company,omitempty" xml:"pay_company,omitempty"`
	// 付款公司企业信用号
	//
	PayCompanyCertNo *string `json:"pay_company_cert_no,omitempty" xml:"pay_company_cert_no,omitempty"`
	// 付款公司did
	PayCompanyDid *string `json:"pay_company_did,omitempty" xml:"pay_company_did,omitempty"`
	// 付款期限
	PayDeadline *string `json:"pay_deadline,omitempty" xml:"pay_deadline,omitempty"`
	// 收款客户
	ReceiptClient *string `json:"receipt_client,omitempty" xml:"receipt_client,omitempty"`
	// 收款客户企业信用号
	//
	ReceiptClientCertNo *string `json:"receipt_client_cert_no,omitempty" xml:"receipt_client_cert_no,omitempty"`
	// 收款客户did
	ReceiptClientDid *string `json:"receipt_client_did,omitempty" xml:"receipt_client_did,omitempty"`
	// 对应应收资费项code
	ReceiptTariffCodes []*string `json:"receipt_tariff_codes,omitempty" xml:"receipt_tariff_codes,omitempty" type:"Repeated"`
	// 结算公司
	SettleCompany *string `json:"settle_company,omitempty" xml:"settle_company,omitempty"`
	// 结算公司企业信用号
	//
	SettleCompanyCertNo *string `json:"settle_company_cert_no,omitempty" xml:"settle_company_cert_no,omitempty"`
	// 结算公司did
	SettleCompanyDid *string `json:"settle_company_did,omitempty" xml:"settle_company_did,omitempty"`
	// 账单结算周期
	SettleCycle *string `json:"settle_cycle,omitempty" xml:"settle_cycle,omitempty"`
}

func (s CreateDigitalLogisticBillPaybillorderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillPaybillorderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetAuthToken(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetRegionName(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetApplyDate(v int64) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ApplyDate = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetBankReceiptAccount(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.BankReceiptAccount = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetCurrency(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.Currency = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetDepositBank(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.DepositBank = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetForwarderDid(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayAmount(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayAmount = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayBillOrderCode(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayBillOrderCode = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayBillTariffParams(v []*PayBillTariffParam) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayBillTariffParams = v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayCompany(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayCompany = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayCompanyCertNo(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayCompanyCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayCompanyDid(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayCompanyDid = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetPayDeadline(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.PayDeadline = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetReceiptClient(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClient = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetReceiptClientCertNo(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClientCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetReceiptClientDid(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClientDid = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetReceiptTariffCodes(v []*string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptTariffCodes = v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetSettleCompany(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompany = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetSettleCompanyCertNo(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompanyCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetSettleCompanyDid(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompanyDid = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderRequest) SetSettleCycle(v string) *CreateDigitalLogisticBillPaybillorderRequest {
	s.SettleCycle = &v
	return s
}

type CreateDigitalLogisticBillPaybillorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证hash
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s CreateDigitalLogisticBillPaybillorderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillPaybillorderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillPaybillorderResponse) SetReqMsgId(v string) *CreateDigitalLogisticBillPaybillorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderResponse) SetResultCode(v string) *CreateDigitalLogisticBillPaybillorderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderResponse) SetResultMsg(v string) *CreateDigitalLogisticBillPaybillorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticBillPaybillorderResponse) SetTxCodes(v []*TxDto) *CreateDigitalLogisticBillPaybillorderResponse {
	s.TxCodes = v
	return s
}

type CreateDigitalLogisticBillReceiptbillorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 实际收款结算公司
	ActualSettleCompany *string `json:"actual_settle_company,omitempty" xml:"actual_settle_company,omitempty"`
	// 实际收款结算公司企业信用号
	ActualSettleCompanyCertNo *string `json:"actual_settle_company_cert_no,omitempty" xml:"actual_settle_company_cert_no,omitempty"`
	// 实际收款结算公司did
	ActualSettleCompanyDid *string `json:"actual_settle_company_did,omitempty" xml:"actual_settle_company_did,omitempty"`
	// 确认时间  业务必填
	ApplyDate *int64 `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 揽货类型
	ClientType *string `json:"client_type,omitempty" xml:"client_type,omitempty"`
	// 币种 业务必填
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 开票抬头
	InvoiceTitle *string `json:"invoice_title,omitempty" xml:"invoice_title,omitempty"`
	// 含税价
	PriceIncludingTax *string `json:"price_including_tax,omitempty" xml:"price_including_tax,omitempty"`
	// 收款账号
	ReceiptAccount *string `json:"receipt_account,omitempty" xml:"receipt_account,omitempty"`
	// 收款总额 业务必填
	ReceiptAmount *string `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty"`
	// 收款账单编号
	ReceiptBillOrderCode *string `json:"receipt_bill_order_code,omitempty" xml:"receipt_bill_order_code,omitempty"`
	// 应收资费项账单 业务必填
	ReceiptBillTariffParams []*ReceiptBillTariffParam `json:"receipt_bill_tariff_params,omitempty" xml:"receipt_bill_tariff_params,omitempty" type:"Repeated"`
	// 结算客户名称
	SettleClient *string `json:"settle_client,omitempty" xml:"settle_client,omitempty"`
	// 结算客户企业信用号
	SettleClientCertNo *string `json:"settle_client_cert_no,omitempty" xml:"settle_client_cert_no,omitempty"`
	// 结算客户名称did
	SettleClientDid *string `json:"settle_client_did,omitempty" xml:"settle_client_did,omitempty"`
	// 结算公司
	SettleCompany *string `json:"settle_company,omitempty" xml:"settle_company,omitempty"`
	// 结算公司企业信用号
	SettleCompanyCertNo *string `json:"settle_company_cert_no,omitempty" xml:"settle_company_cert_no,omitempty"`
	// 结算公司did
	SettleCompanyDid *string `json:"settle_company_did,omitempty" xml:"settle_company_did,omitempty"`
	// 账单结算周期
	SettleCycle *string `json:"settle_cycle,omitempty" xml:"settle_cycle,omitempty"`
	// 税金
	Taxes *string `json:"taxes,omitempty" xml:"taxes,omitempty"`
	// 未税价
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
}

func (s CreateDigitalLogisticBillReceiptbillorderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillReceiptbillorderRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetAuthToken(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetProductInstanceId(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetRegionName(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompany(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompany = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompanyCertNo(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompanyCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompanyDid(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompanyDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetApplyDate(v int64) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ApplyDate = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetClientType(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ClientType = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetCurrency(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.Currency = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetForwarderDid(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetInvoiceTitle(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.InvoiceTitle = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetPriceIncludingTax(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.PriceIncludingTax = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetReceiptAccount(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptAccount = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetReceiptAmount(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptAmount = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetReceiptBillOrderCode(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptBillOrderCode = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetReceiptBillTariffParams(v []*ReceiptBillTariffParam) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptBillTariffParams = v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleClient(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClient = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleClientCertNo(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClientCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleClientDid(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClientDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompany(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompany = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompanyCertNo(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompanyCertNo = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompanyDid(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompanyDid = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetSettleCycle(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCycle = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetTaxes(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.Taxes = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderRequest) SetUntaxedPrice(v string) *CreateDigitalLogisticBillReceiptbillorderRequest {
	s.UntaxedPrice = &v
	return s
}

type CreateDigitalLogisticBillReceiptbillorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s CreateDigitalLogisticBillReceiptbillorderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticBillReceiptbillorderResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticBillReceiptbillorderResponse) SetReqMsgId(v string) *CreateDigitalLogisticBillReceiptbillorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderResponse) SetResultCode(v string) *CreateDigitalLogisticBillReceiptbillorderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderResponse) SetResultMsg(v string) *CreateDigitalLogisticBillReceiptbillorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticBillReceiptbillorderResponse) SetTxCodes(v []*TxDto) *CreateDigitalLogisticBillReceiptbillorderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBillPaybilltariffRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 计费数量 业务必填
	BillingNumber *string `json:"billing_number,omitempty" xml:"billing_number,omitempty"`
	// 计费类型 业务必填
	BillingType *string `json:"billing_type,omitempty" xml:"billing_type,omitempty"`
	// 航运订舱号[业务必填]
	BkgNo *string `json:"bkg_no,omitempty" xml:"bkg_no,omitempty"`
	// 订舱单号[业务必填]
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 币种 业务必填
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 收支  INCOME--收入， EXPENSES--支出
	// 业务必填
	IncomeOrExpenses *string `json:"income_or_expenses,omitempty" xml:"income_or_expenses,omitempty"`
	// 电子发票网址
	InvoiceUrl *string `json:"invoice_url,omitempty" xml:"invoice_url,omitempty"`
	// 工作单号 业务必填
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 资费单据编号
	PayTariffCode *string `json:"pay_tariff_code,omitempty" xml:"pay_tariff_code,omitempty"`
	// 资费项中文描述 业务必填
	PayTariffDesc *string `json:"pay_tariff_desc,omitempty" xml:"pay_tariff_desc,omitempty"`
	// 资费项目 业务必填
	PayTariffProject *string `json:"pay_tariff_project,omitempty" xml:"pay_tariff_project,omitempty"`
	// 含税价 业务必填
	PriceIncludingTax *string `json:"price_including_tax,omitempty" xml:"price_including_tax,omitempty"`
	// 结算客户名称
	SettleClient *string `json:"settle_client,omitempty" xml:"settle_client,omitempty"`
	// 结算客户企业信用号
	SettleClientCertNo *string `json:"settle_client_cert_no,omitempty" xml:"settle_client_cert_no,omitempty"`
	// 结算客户did
	SettleClientDid *string `json:"settle_client_did,omitempty" xml:"settle_client_did,omitempty"`
	// 税金
	Taxes *string `json:"taxes,omitempty" xml:"taxes,omitempty"`
	// 未税价 业务必填
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
}

func (s SaveDigitalLogisticBillPaybilltariffRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillPaybilltariffRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetAuthToken(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetRegionName(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetAction(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetBillingNumber(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.BillingNumber = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetBillingType(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.BillingType = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetBkgNo(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.BkgNo = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetBookingNo(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.BookingNo = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetCurrency(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.Currency = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetForwarderDid(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetIncomeOrExpenses(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.IncomeOrExpenses = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetInvoiceUrl(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.InvoiceUrl = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetOrderNo(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetPayTariffCode(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.PayTariffCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetPayTariffDesc(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.PayTariffDesc = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetPayTariffProject(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.PayTariffProject = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetPriceIncludingTax(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.PriceIncludingTax = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetSettleClient(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.SettleClient = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetSettleClientCertNo(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.SettleClientCertNo = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetSettleClientDid(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.SettleClientDid = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetTaxes(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.Taxes = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffRequest) SetUntaxedPrice(v string) *SaveDigitalLogisticBillPaybilltariffRequest {
	s.UntaxedPrice = &v
	return s
}

type SaveDigitalLogisticBillPaybilltariffResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBillPaybilltariffResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillPaybilltariffResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillPaybilltariffResponse) SetReqMsgId(v string) *SaveDigitalLogisticBillPaybilltariffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffResponse) SetResultCode(v string) *SaveDigitalLogisticBillPaybilltariffResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffResponse) SetResultMsg(v string) *SaveDigitalLogisticBillPaybilltariffResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBillPaybilltariffResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBillPaybilltariffResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBillReceiptbilltariffRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 计费数量  业务必填
	BillingNumber *string `json:"billing_number,omitempty" xml:"billing_number,omitempty"`
	// 计费类型 业务必填
	BillingType *string `json:"billing_type,omitempty" xml:"billing_type,omitempty"`
	// 航运订舱号[业务必填]
	BkgNo *string `json:"bkg_no,omitempty" xml:"bkg_no,omitempty"`
	// 订舱单号[业务必填]
	BookingNo *string `json:"booking_no,omitempty" xml:"booking_no,omitempty"`
	// 币种 [业务必填]
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 收支  INCOME--收入， EXPENSES--支出
	// 业务必填
	IncomeOrExpenses *string `json:"income_or_expenses,omitempty" xml:"income_or_expenses,omitempty"`
	// 电子发票网址
	InvoiceUrl *string `json:"invoice_url,omitempty" xml:"invoice_url,omitempty"`
	// 工作单号 业务必填
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 含税价 业务必填
	PriceIncludingTax *string `json:"price_including_tax,omitempty" xml:"price_including_tax,omitempty"`
	// 资费单据编号
	ReceiptTariffCode *string `json:"receipt_tariff_code,omitempty" xml:"receipt_tariff_code,omitempty"`
	// 中文描述 业务必填
	ReceiptTariffDesc *string `json:"receipt_tariff_desc,omitempty" xml:"receipt_tariff_desc,omitempty"`
	// 资费项目 业务必填
	ReceiptTariffProject *string `json:"receipt_tariff_project,omitempty" xml:"receipt_tariff_project,omitempty"`
	// 结算客户名称
	SettleClient *string `json:"settle_client,omitempty" xml:"settle_client,omitempty"`
	// 结算客户企业信用号
	SettleClientCertNo *string `json:"settle_client_cert_no,omitempty" xml:"settle_client_cert_no,omitempty"`
	// 结算客户did
	SettleClientDid *string `json:"settle_client_did,omitempty" xml:"settle_client_did,omitempty"`
	// 税金
	Taxes *string `json:"taxes,omitempty" xml:"taxes,omitempty"`
	// 未税价 业务必填
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
}

func (s SaveDigitalLogisticBillReceiptbilltariffRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillReceiptbilltariffRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetAuthToken(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetRegionName(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetAction(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetBillingNumber(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.BillingNumber = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetBillingType(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.BillingType = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetBkgNo(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.BkgNo = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetBookingNo(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.BookingNo = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetCurrency(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.Currency = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetForwarderDid(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetIncomeOrExpenses(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.IncomeOrExpenses = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetInvoiceUrl(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.InvoiceUrl = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetOrderNo(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.OrderNo = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetPriceIncludingTax(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.PriceIncludingTax = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetReceiptTariffCode(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.ReceiptTariffCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetReceiptTariffDesc(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.ReceiptTariffDesc = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetReceiptTariffProject(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.ReceiptTariffProject = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetSettleClient(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.SettleClient = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetSettleClientCertNo(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.SettleClientCertNo = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetSettleClientDid(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.SettleClientDid = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetTaxes(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.Taxes = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffRequest) SetUntaxedPrice(v string) *SaveDigitalLogisticBillReceiptbilltariffRequest {
	s.UntaxedPrice = &v
	return s
}

type SaveDigitalLogisticBillReceiptbilltariffResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBillReceiptbilltariffResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillReceiptbilltariffResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillReceiptbilltariffResponse) SetReqMsgId(v string) *SaveDigitalLogisticBillReceiptbilltariffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffResponse) SetResultCode(v string) *SaveDigitalLogisticBillReceiptbilltariffResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffResponse) SetResultMsg(v string) *SaveDigitalLogisticBillReceiptbilltariffResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptbilltariffResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBillReceiptbilltariffResponse {
	s.TxCodes = v
	return s
}

type VerifyDigitalLogisticBillPaybillRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应付资费项编号
	PayTariffCode *string `json:"pay_tariff_code,omitempty" xml:"pay_tariff_code,omitempty"`
	// 核销金额 业务必填
	VerifyAmount *string `json:"verify_amount,omitempty" xml:"verify_amount,omitempty"`
	// 核销应付资费项编号
	VerifyPayTariffCode *string `json:"verify_pay_tariff_code,omitempty" xml:"verify_pay_tariff_code,omitempty"`
	// 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销
	// 业务必填
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
}

func (s VerifyDigitalLogisticBillPaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDigitalLogisticBillPaybillRequest) GoString() string {
	return s.String()
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetAuthToken(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetProductInstanceId(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetRegionName(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.RegionName = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetAction(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.Action = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetForwarderDid(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.ForwarderDid = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetPayTariffCode(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.PayTariffCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetVerifyAmount(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.VerifyAmount = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetVerifyPayTariffCode(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.VerifyPayTariffCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillRequest) SetVerifyStatus(v string) *VerifyDigitalLogisticBillPaybillRequest {
	s.VerifyStatus = &v
	return s
}

type VerifyDigitalLogisticBillPaybillResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s VerifyDigitalLogisticBillPaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDigitalLogisticBillPaybillResponse) GoString() string {
	return s.String()
}

func (s *VerifyDigitalLogisticBillPaybillResponse) SetReqMsgId(v string) *VerifyDigitalLogisticBillPaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillResponse) SetResultCode(v string) *VerifyDigitalLogisticBillPaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillResponse) SetResultMsg(v string) *VerifyDigitalLogisticBillPaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDigitalLogisticBillPaybillResponse) SetTxCodes(v []*TxDto) *VerifyDigitalLogisticBillPaybillResponse {
	s.TxCodes = v
	return s
}

type VerifyDigitalLogisticBillReceiptbillorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应收资费项编号
	ReceiptTariffCode *string `json:"receipt_tariff_code,omitempty" xml:"receipt_tariff_code,omitempty"`
	// 核销金额 业务必填
	VerifyAmount *string `json:"verify_amount,omitempty" xml:"verify_amount,omitempty"`
	// 核销应收资费项编号
	VerifyReceiptTariffCode *string `json:"verify_receipt_tariff_code,omitempty" xml:"verify_receipt_tariff_code,omitempty"`
	// 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
}

func (s VerifyDigitalLogisticBillReceiptbillorderRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDigitalLogisticBillReceiptbillorderRequest) GoString() string {
	return s.String()
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetAuthToken(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetProductInstanceId(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetRegionName(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.RegionName = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetAction(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.Action = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetForwarderDid(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetReceiptTariffCode(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptTariffCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetVerifyAmount(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.VerifyAmount = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetVerifyReceiptTariffCode(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.VerifyReceiptTariffCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderRequest) SetVerifyStatus(v string) *VerifyDigitalLogisticBillReceiptbillorderRequest {
	s.VerifyStatus = &v
	return s
}

type VerifyDigitalLogisticBillReceiptbillorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s VerifyDigitalLogisticBillReceiptbillorderResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDigitalLogisticBillReceiptbillorderResponse) GoString() string {
	return s.String()
}

func (s *VerifyDigitalLogisticBillReceiptbillorderResponse) SetReqMsgId(v string) *VerifyDigitalLogisticBillReceiptbillorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderResponse) SetResultCode(v string) *VerifyDigitalLogisticBillReceiptbillorderResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderResponse) SetResultMsg(v string) *VerifyDigitalLogisticBillReceiptbillorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDigitalLogisticBillReceiptbillorderResponse) SetTxCodes(v []*TxDto) *VerifyDigitalLogisticBillReceiptbillorderResponse {
	s.TxCodes = v
	return s
}

type UpdateDigitalLogisticBillPaybillorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	//
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 申请时间 毫秒值 业务必填
	ApplyDate *int64 `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 银行收款账户
	BankReceiptAccount *string `json:"bank_receipt_account,omitempty" xml:"bank_receipt_account,omitempty"`
	// 币种 业务必填
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 开户行
	DepositBank *string `json:"deposit_bank,omitempty" xml:"deposit_bank,omitempty"`
	// 账单到期日
	ExpireDate *int64 `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应付总额 业务必填
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty"`
	// 付款单编号
	PayBillOrderCode *string `json:"pay_bill_order_code,omitempty" xml:"pay_bill_order_code,omitempty"`
	// 应付账单资费项 业务必填
	PayBillTariffParams []*PayBillTariffParam `json:"pay_bill_tariff_params,omitempty" xml:"pay_bill_tariff_params,omitempty" type:"Repeated"`
	// 付款公司
	PayCompany *string `json:"pay_company,omitempty" xml:"pay_company,omitempty"`
	// 付款公司企业信用号
	PayCompanyCertNo *string `json:"pay_company_cert_no,omitempty" xml:"pay_company_cert_no,omitempty"`
	// 付款公司did
	PayCompanyDid *string `json:"pay_company_did,omitempty" xml:"pay_company_did,omitempty"`
	// 付款期限
	PayDeadline *string `json:"pay_deadline,omitempty" xml:"pay_deadline,omitempty"`
	// 收款客户[业务必填]
	ReceiptClient *string `json:"receipt_client,omitempty" xml:"receipt_client,omitempty"`
	// 收款客户企业信用号[业务必填]
	ReceiptClientCertNo *string `json:"receipt_client_cert_no,omitempty" xml:"receipt_client_cert_no,omitempty"`
	// 收款客户did[业务必填]
	ReceiptClientDid *string `json:"receipt_client_did,omitempty" xml:"receipt_client_did,omitempty"`
	// 对应应收资费项code
	ReceiptTariffCodes []*string `json:"receipt_tariff_codes,omitempty" xml:"receipt_tariff_codes,omitempty" type:"Repeated"`
	// 结算公司
	SettleCompany *string `json:"settle_company,omitempty" xml:"settle_company,omitempty"`
	// 结算公司企业信用号
	SettleCompanyCertNo *string `json:"settle_company_cert_no,omitempty" xml:"settle_company_cert_no,omitempty"`
	// 结算公司did
	SettleCompanyDid *string `json:"settle_company_did,omitempty" xml:"settle_company_did,omitempty"`
	// 账单结算周期
	SettleCycle *string `json:"settle_cycle,omitempty" xml:"settle_cycle,omitempty"`
	// 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
	SettleStatus *string `json:"settle_status,omitempty" xml:"settle_status,omitempty"`
}

func (s UpdateDigitalLogisticBillPaybillorderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillPaybillorderRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetAuthToken(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetRegionName(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetAction(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.Action = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetApplyDate(v int64) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ApplyDate = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetBankReceiptAccount(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.BankReceiptAccount = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetCurrency(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.Currency = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetDepositBank(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.DepositBank = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetExpireDate(v int64) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ExpireDate = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetForwarderDid(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayAmount(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayAmount = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayBillOrderCode(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayBillOrderCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayBillTariffParams(v []*PayBillTariffParam) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayBillTariffParams = v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayCompany(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayCompany = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayCompanyCertNo(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayCompanyCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayCompanyDid(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayCompanyDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetPayDeadline(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.PayDeadline = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetReceiptClient(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClient = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetReceiptClientCertNo(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClientCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetReceiptClientDid(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptClientDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetReceiptTariffCodes(v []*string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.ReceiptTariffCodes = v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetSettleCompany(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompany = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetSettleCompanyCertNo(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompanyCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetSettleCompanyDid(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.SettleCompanyDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetSettleCycle(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.SettleCycle = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderRequest) SetSettleStatus(v string) *UpdateDigitalLogisticBillPaybillorderRequest {
	s.SettleStatus = &v
	return s
}

type UpdateDigitalLogisticBillPaybillorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s UpdateDigitalLogisticBillPaybillorderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillPaybillorderResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillPaybillorderResponse) SetReqMsgId(v string) *UpdateDigitalLogisticBillPaybillorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderResponse) SetResultCode(v string) *UpdateDigitalLogisticBillPaybillorderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderResponse) SetResultMsg(v string) *UpdateDigitalLogisticBillPaybillorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticBillPaybillorderResponse) SetTxCodes(v []*TxDto) *UpdateDigitalLogisticBillPaybillorderResponse {
	s.TxCodes = v
	return s
}

type UpdateDigitalLogisticBillReceiptbillorderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 实际收款结算公司
	ActualSettleCompany *string `json:"actual_settle_company,omitempty" xml:"actual_settle_company,omitempty"`
	// 实际收款结算公司企业信用号
	ActualSettleCompanyCertNo *string `json:"actual_settle_company_cert_no,omitempty" xml:"actual_settle_company_cert_no,omitempty"`
	// 实际收款结算公司did
	ActualSettleCompanyDid *string `json:"actual_settle_company_did,omitempty" xml:"actual_settle_company_did,omitempty"`
	// 确认时间
	ApplyDate *int64 `json:"apply_date,omitempty" xml:"apply_date,omitempty"`
	// 揽货类型
	ClientType *string `json:"client_type,omitempty" xml:"client_type,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 账单到期日
	ExpireDate *int64 `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 开票抬头
	InvoiceTitle *string `json:"invoice_title,omitempty" xml:"invoice_title,omitempty"`
	// 含税价
	PriceIncludingTax *string `json:"price_including_tax,omitempty" xml:"price_including_tax,omitempty"`
	// 收款账号
	ReceiptAccount *string `json:"receipt_account,omitempty" xml:"receipt_account,omitempty"`
	// 收款总额
	ReceiptAmount *string `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty"`
	// 收款账单编号
	ReceiptBillOrderCode *string `json:"receipt_bill_order_code,omitempty" xml:"receipt_bill_order_code,omitempty"`
	// 应收资费项账单 业务必填
	ReceiptBillTariffParams []*ReceiptBillTariffParam `json:"receipt_bill_tariff_params,omitempty" xml:"receipt_bill_tariff_params,omitempty" type:"Repeated"`
	// 结算客户名称
	SettleClient *string `json:"settle_client,omitempty" xml:"settle_client,omitempty"`
	// 结算客户名称企业信用号
	SettleClientCertNo *string `json:"settle_client_cert_no,omitempty" xml:"settle_client_cert_no,omitempty"`
	// 结算客户did
	SettleClientDid *string `json:"settle_client_did,omitempty" xml:"settle_client_did,omitempty"`
	// 结算公司 [业务必填]
	SettleCompany *string `json:"settle_company,omitempty" xml:"settle_company,omitempty"`
	// 结算公司企业信用号[业务必填]
	SettleCompanyCertNo *string `json:"settle_company_cert_no,omitempty" xml:"settle_company_cert_no,omitempty"`
	// 结算公司did[业务必填]
	SettleCompanyDid *string `json:"settle_company_did,omitempty" xml:"settle_company_did,omitempty"`
	// 账单结算周期
	SettleCycle *string `json:"settle_cycle,omitempty" xml:"settle_cycle,omitempty"`
	// SETTLED(已结算) UNSETTLE（未结算）[业务必填]
	SettleStatus *string `json:"settle_status,omitempty" xml:"settle_status,omitempty"`
	// 税金
	Taxes *string `json:"taxes,omitempty" xml:"taxes,omitempty"`
	// 未税价
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
}

func (s UpdateDigitalLogisticBillReceiptbillorderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillReceiptbillorderRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetAuthToken(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetRegionName(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetAction(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.Action = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompany(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompany = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompanyCertNo(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompanyCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetActualSettleCompanyDid(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ActualSettleCompanyDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetApplyDate(v int64) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ApplyDate = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetClientType(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ClientType = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetCurrency(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.Currency = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetExpireDate(v int64) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ExpireDate = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetForwarderDid(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetInvoiceTitle(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.InvoiceTitle = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetPriceIncludingTax(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.PriceIncludingTax = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetReceiptAccount(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptAccount = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetReceiptAmount(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptAmount = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetReceiptBillOrderCode(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptBillOrderCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetReceiptBillTariffParams(v []*ReceiptBillTariffParam) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.ReceiptBillTariffParams = v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleClient(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClient = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleClientCertNo(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClientCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleClientDid(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleClientDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompany(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompany = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompanyCertNo(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompanyCertNo = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleCompanyDid(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCompanyDid = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleCycle(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleCycle = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetSettleStatus(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.SettleStatus = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetTaxes(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.Taxes = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderRequest) SetUntaxedPrice(v string) *UpdateDigitalLogisticBillReceiptbillorderRequest {
	s.UntaxedPrice = &v
	return s
}

type UpdateDigitalLogisticBillReceiptbillorderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s UpdateDigitalLogisticBillReceiptbillorderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticBillReceiptbillorderResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticBillReceiptbillorderResponse) SetReqMsgId(v string) *UpdateDigitalLogisticBillReceiptbillorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderResponse) SetResultCode(v string) *UpdateDigitalLogisticBillReceiptbillorderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderResponse) SetResultMsg(v string) *UpdateDigitalLogisticBillReceiptbillorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDigitalLogisticBillReceiptbillorderResponse) SetTxCodes(v []*TxDto) *UpdateDigitalLogisticBillReceiptbillorderResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBillPayinvoiceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 总金额 业务必填
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 校验码后六位
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty"`
	// 币种 CNY/USD [业务必填]
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 美元金额
	DollarAmount *string `json:"dollar_amount,omitempty" xml:"dollar_amount,omitempty"`
	// 开票方名称  业务必填
	DrawerName *string `json:"drawer_name,omitempty" xml:"drawer_name,omitempty"`
	// 开票纳税人识别号 业务必填
	DrawerTaxpayerCode *string `json:"drawer_taxpayer_code,omitempty" xml:"drawer_taxpayer_code,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 发票唯一标识
	InvoiceCode *string `json:"invoice_code,omitempty" xml:"invoice_code,omitempty"`
	// 发票抬头did[业务必填]
	InvoiceHeaderDid *string `json:"invoice_header_did,omitempty" xml:"invoice_header_did,omitempty"`
	// 发票抬头企业名称[业务必填]
	InvoiceHeaderName *string `json:"invoice_header_name,omitempty" xml:"invoice_header_name,omitempty"`
	// 发票抬头企业信用代码[业务必填]
	InvoiceHeaderSocialNo *string `json:"invoice_header_social_no,omitempty" xml:"invoice_header_social_no,omitempty"`
	// 发票号码 业务必填
	InvoiceNumber *string `json:"invoice_number,omitempty" xml:"invoice_number,omitempty"`
	// 发票税务号
	InvoiceTaxCode *string `json:"invoice_tax_code,omitempty" xml:"invoice_tax_code,omitempty"`
	// 开票类型 业务必填
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty"`
	// 开票日期 业务必填
	MakeInvoiceDate *int64 `json:"make_invoice_date,omitempty" xml:"make_invoice_date,omitempty"`
	// 账单关联项目
	PayBillInvoiceParams []*PayBillInvoiceParam `json:"pay_bill_invoice_params,omitempty" xml:"pay_bill_invoice_params,omitempty" type:"Repeated"`
	// 资费项发票 业务必填
	PayTariffInvoiceParams []*PayTariffInvoiceParam `json:"pay_tariff_invoice_params,omitempty" xml:"pay_tariff_invoice_params,omitempty" type:"Repeated"`
	// 不含税金额 业务必填
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
}

func (s SaveDigitalLogisticBillPayinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillPayinvoiceRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetAuthToken(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetRegionName(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetAction(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetAmount(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.Amount = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetCheckCode(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.CheckCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetCurrency(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.Currency = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetDollarAmount(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.DollarAmount = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetDrawerName(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.DrawerName = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetDrawerTaxpayerCode(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.DrawerTaxpayerCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetForwarderDid(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceCode(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceHeaderDid(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceHeaderDid = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceHeaderName(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceHeaderName = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceHeaderSocialNo(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceHeaderSocialNo = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceNumber(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceNumber = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceTaxCode(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceTaxCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetInvoiceType(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetMakeInvoiceDate(v int64) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.MakeInvoiceDate = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetPayBillInvoiceParams(v []*PayBillInvoiceParam) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.PayBillInvoiceParams = v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetPayTariffInvoiceParams(v []*PayTariffInvoiceParam) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.PayTariffInvoiceParams = v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceRequest) SetUntaxedPrice(v string) *SaveDigitalLogisticBillPayinvoiceRequest {
	s.UntaxedPrice = &v
	return s
}

type SaveDigitalLogisticBillPayinvoiceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBillPayinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillPayinvoiceResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillPayinvoiceResponse) SetReqMsgId(v string) *SaveDigitalLogisticBillPayinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceResponse) SetResultCode(v string) *SaveDigitalLogisticBillPayinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceResponse) SetResultMsg(v string) *SaveDigitalLogisticBillPayinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBillPayinvoiceResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBillPayinvoiceResponse {
	s.TxCodes = v
	return s
}

type SaveDigitalLogisticBillReceiptinvoiceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 总金额 业务必填
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 校验码后六位
	CheckCode *string `json:"check_code,omitempty" xml:"check_code,omitempty"`
	// 开票方名称 业务必填
	DrawerName *string `json:"drawer_name,omitempty" xml:"drawer_name,omitempty"`
	// 开票纳税人识别号 业务必填
	DrawerTaxpayerCode *string `json:"drawer_taxpayer_code,omitempty" xml:"drawer_taxpayer_code,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应收发票唯一标识
	InvoiceCode *string `json:"invoice_code,omitempty" xml:"invoice_code,omitempty"`
	// 发票号码 业务必填
	InvoiceNumber *string `json:"invoice_number,omitempty" xml:"invoice_number,omitempty"`
	// 开票类型 业务必填
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty"`
	// 开票日期 毫秒值 业务必填
	MakeInvoiceDate *int64 `json:"make_invoice_date,omitempty" xml:"make_invoice_date,omitempty"`
	// 资费项发票 业务必填
	ReceiptTariffInvoiceParams []*ReceiptTariffInvoiceParam `json:"receipt_tariff_invoice_params,omitempty" xml:"receipt_tariff_invoice_params,omitempty" type:"Repeated"`
	// 不含税金额 业务必填
	UntaxedPrice *string `json:"untaxed_price,omitempty" xml:"untaxed_price,omitempty"`
	// 发票税务号
	InvoiceTaxCode *string `json:"invoice_tax_code,omitempty" xml:"invoice_tax_code,omitempty"`
}

func (s SaveDigitalLogisticBillReceiptinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillReceiptinvoiceRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetAuthToken(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetRegionName(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetAction(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetAmount(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.Amount = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetCheckCode(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.CheckCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetDrawerName(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.DrawerName = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetDrawerTaxpayerCode(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.DrawerTaxpayerCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetForwarderDid(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetInvoiceCode(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.InvoiceCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetInvoiceNumber(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.InvoiceNumber = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetInvoiceType(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetMakeInvoiceDate(v int64) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.MakeInvoiceDate = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetReceiptTariffInvoiceParams(v []*ReceiptTariffInvoiceParam) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.ReceiptTariffInvoiceParams = v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetUntaxedPrice(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.UntaxedPrice = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceRequest) SetInvoiceTaxCode(v string) *SaveDigitalLogisticBillReceiptinvoiceRequest {
	s.InvoiceTaxCode = &v
	return s
}

type SaveDigitalLogisticBillReceiptinvoiceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBillReceiptinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBillReceiptinvoiceResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBillReceiptinvoiceResponse) SetReqMsgId(v string) *SaveDigitalLogisticBillReceiptinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceResponse) SetResultCode(v string) *SaveDigitalLogisticBillReceiptinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceResponse) SetResultMsg(v string) *SaveDigitalLogisticBillReceiptinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBillReceiptinvoiceResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBillReceiptinvoiceResponse {
	s.TxCodes = v
	return s
}

type UploadDigitalLogisticBizFinancingRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 融资数据
	FinancingData []*UploadFinancingParam `json:"financing_data,omitempty" xml:"financing_data,omitempty" type:"Repeated"`
}

func (s UploadDigitalLogisticBizFinancingRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticBizFinancingRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticBizFinancingRequest) SetAuthToken(v string) *UploadDigitalLogisticBizFinancingRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingRequest) SetProductInstanceId(v string) *UploadDigitalLogisticBizFinancingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingRequest) SetRegionName(v string) *UploadDigitalLogisticBizFinancingRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingRequest) SetFinancingData(v []*UploadFinancingParam) *UploadDigitalLogisticBizFinancingRequest {
	s.FinancingData = v
	return s
}

type UploadDigitalLogisticBizFinancingResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链hash
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s UploadDigitalLogisticBizFinancingResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticBizFinancingResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticBizFinancingResponse) SetReqMsgId(v string) *UploadDigitalLogisticBizFinancingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingResponse) SetResultCode(v string) *UploadDigitalLogisticBizFinancingResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingResponse) SetResultMsg(v string) *UploadDigitalLogisticBizFinancingResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticBizFinancingResponse) SetTxCodes(v []*TxDto) *UploadDigitalLogisticBizFinancingResponse {
	s.TxCodes = v
	return s
}

type UploadDigitalLogisticBizOrderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 船公司did
	CarrierDid *string `json:"carrier_did,omitempty" xml:"carrier_did,omitempty"`
	// 尾款金额
	DeadlineAmount *string `json:"deadline_amount,omitempty" xml:"deadline_amount,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 订单总额
	OrderAmounts []*UploadOrderAmount `json:"order_amounts,omitempty" xml:"order_amounts,omitempty" type:"Repeated"`
	// 订单booking信息
	OrderBookings []*UploadOrderBooking `json:"order_bookings,omitempty" xml:"order_bookings,omitempty" type:"Repeated"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 结算did
	SettleDid *string `json:"settle_did,omitempty" xml:"settle_did,omitempty"`
}

func (s UploadDigitalLogisticBizOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticBizOrderRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticBizOrderRequest) SetAuthToken(v string) *UploadDigitalLogisticBizOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetProductInstanceId(v string) *UploadDigitalLogisticBizOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetRegionName(v string) *UploadDigitalLogisticBizOrderRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetCarrierDid(v string) *UploadDigitalLogisticBizOrderRequest {
	s.CarrierDid = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetDeadlineAmount(v string) *UploadDigitalLogisticBizOrderRequest {
	s.DeadlineAmount = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetForwarderDid(v string) *UploadDigitalLogisticBizOrderRequest {
	s.ForwarderDid = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetOrderAmounts(v []*UploadOrderAmount) *UploadDigitalLogisticBizOrderRequest {
	s.OrderAmounts = v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetOrderBookings(v []*UploadOrderBooking) *UploadDigitalLogisticBizOrderRequest {
	s.OrderBookings = v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetOrderNo(v string) *UploadDigitalLogisticBizOrderRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderRequest) SetSettleDid(v string) *UploadDigitalLogisticBizOrderRequest {
	s.SettleDid = &v
	return s
}

type UploadDigitalLogisticBizOrderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链hash
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s UploadDigitalLogisticBizOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticBizOrderResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticBizOrderResponse) SetReqMsgId(v string) *UploadDigitalLogisticBizOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderResponse) SetResultCode(v string) *UploadDigitalLogisticBizOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderResponse) SetResultMsg(v string) *UploadDigitalLogisticBizOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDigitalLogisticBizOrderResponse) SetTxCodes(v []*TxDto) *UploadDigitalLogisticBizOrderResponse {
	s.TxCodes = v
	return s
}

type CreateDigitalLogisticDidCarrierRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理did
	AgentDid *string `json:"agent_did,omitempty" xml:"agent_did,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人身份证
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 船公司编号
	Scac *string `json:"scac,omitempty" xml:"scac,omitempty"`
}

func (s CreateDigitalLogisticDidCarrierRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidCarrierRequest) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetAuthToken(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetProductInstanceId(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetRegionName(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetAgentDid(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.AgentDid = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetEpCertName(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetEpCertNo(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetExtensionInfo(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetLegalPersonCertName(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetLegalPersonCertNo(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierRequest) SetScac(v string) *CreateDigitalLogisticDidCarrierRequest {
	s.Scac = &v
	return s
}

type CreateDigitalLogisticDidCarrierResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 船公司did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDigitalLogisticDidCarrierResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDigitalLogisticDidCarrierResponse) GoString() string {
	return s.String()
}

func (s *CreateDigitalLogisticDidCarrierResponse) SetReqMsgId(v string) *CreateDigitalLogisticDidCarrierResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierResponse) SetResultCode(v string) *CreateDigitalLogisticDidCarrierResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierResponse) SetResultMsg(v string) *CreateDigitalLogisticDidCarrierResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDigitalLogisticDidCarrierResponse) SetDid(v string) *CreateDigitalLogisticDidCarrierResponse {
	s.Did = &v
	return s
}

type AuthDigitalLogisticSysForwarderRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 客户端id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// 密钥
	ClientSecret *string `json:"client_secret,omitempty" xml:"client_secret,omitempty"`
	// 货代did
	IntRefId *string `json:"int_ref_id,omitempty" xml:"int_ref_id,omitempty"`
	// For HOME application internal
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 渠道source
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s AuthDigitalLogisticSysForwarderRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthDigitalLogisticSysForwarderRequest) GoString() string {
	return s.String()
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetAuthToken(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetProductInstanceId(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetRegionName(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.RegionName = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetClientId(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.ClientId = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetClientSecret(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.ClientSecret = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetIntRefId(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.IntRefId = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetTenantId(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.TenantId = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderRequest) SetSource(v string) *AuthDigitalLogisticSysForwarderRequest {
	s.Source = &v
	return s
}

type AuthDigitalLogisticSysForwarderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 推送结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AuthDigitalLogisticSysForwarderResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthDigitalLogisticSysForwarderResponse) GoString() string {
	return s.String()
}

func (s *AuthDigitalLogisticSysForwarderResponse) SetReqMsgId(v string) *AuthDigitalLogisticSysForwarderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderResponse) SetResultCode(v string) *AuthDigitalLogisticSysForwarderResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderResponse) SetResultMsg(v string) *AuthDigitalLogisticSysForwarderResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthDigitalLogisticSysForwarderResponse) SetResult(v bool) *AuthDigitalLogisticSysForwarderResponse {
	s.Result = &v
	return s
}

type QueryDigitalLogisticBizMasterblRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// master提单号
	MasterBlNo *string `json:"master_bl_no,omitempty" xml:"master_bl_no,omitempty"`
}

func (s QueryDigitalLogisticBizMasterblRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticBizMasterblRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticBizMasterblRequest) SetAuthToken(v string) *QueryDigitalLogisticBizMasterblRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblRequest) SetProductInstanceId(v string) *QueryDigitalLogisticBizMasterblRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblRequest) SetRegionName(v string) *QueryDigitalLogisticBizMasterblRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblRequest) SetForwarderDid(v string) *QueryDigitalLogisticBizMasterblRequest {
	s.ForwarderDid = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblRequest) SetMasterBlNo(v string) *QueryDigitalLogisticBizMasterblRequest {
	s.MasterBlNo = &v
	return s
}

type QueryDigitalLogisticBizMasterblResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 船公司
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 收货人
	Consignee *string `json:"consignee,omitempty" xml:"consignee,omitempty"`
	// 目的地
	DeliveryPlace *string `json:"delivery_place,omitempty" xml:"delivery_place,omitempty"`
	// 卸货港
	DischargePort *string `json:"discharge_port,omitempty" xml:"discharge_port,omitempty"`
	// 货代did
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 运费
	Freight *string `json:"freight,omitempty" xml:"freight,omitempty"`
	// 提单货物数据列表
	GoodsDtos []*MasterBlGoodsDto `json:"goods_dtos,omitempty" xml:"goods_dtos,omitempty" type:"Repeated"`
	// 起运港
	LoadingPort *string `json:"loading_port,omitempty" xml:"loading_port,omitempty"`
	// master提单号
	MasterBlNo *string `json:"master_bl_no,omitempty" xml:"master_bl_no,omitempty"`
	// 通知方
	NotifyParty *string `json:"notify_party,omitempty" xml:"notify_party,omitempty"`
	// 前程运输
	PrCarriage *string `json:"pr_carriage,omitempty" xml:"pr_carriage,omitempty"`
	// 发货人
	Shipper *string `json:"shipper,omitempty" xml:"shipper,omitempty"`
	// 航名
	Vessel *string `json:"vessel,omitempty" xml:"vessel,omitempty"`
	// 航次
	Voyage *string `json:"voyage,omitempty" xml:"voyage,omitempty"`
}

func (s QueryDigitalLogisticBizMasterblResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalLogisticBizMasterblResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetReqMsgId(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetResultCode(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetResultMsg(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetCarrier(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Carrier = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetConsignee(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Consignee = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetDeliveryPlace(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.DeliveryPlace = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetDischargePort(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.DischargePort = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetForwarderDid(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.ForwarderDid = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetFreight(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Freight = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetGoodsDtos(v []*MasterBlGoodsDto) *QueryDigitalLogisticBizMasterblResponse {
	s.GoodsDtos = v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetLoadingPort(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.LoadingPort = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetMasterBlNo(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.MasterBlNo = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetNotifyParty(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.NotifyParty = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetPrCarriage(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.PrCarriage = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetShipper(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Shipper = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetVessel(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Vessel = &v
	return s
}

func (s *QueryDigitalLogisticBizMasterblResponse) SetVoyage(v string) *QueryDigitalLogisticBizMasterblResponse {
	s.Voyage = &v
	return s
}

type SaveDigitalLogisticBizPayinvoicefileRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
	Action *string `json:"action,omitempty" xml:"action,omitempty"`
	// 发票文件hash [业务必填]
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 发票文件ID [业务必填]
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 货代DID
	ForwarderDid *string `json:"forwarder_did,omitempty" xml:"forwarder_did,omitempty"`
	// 应付发票code
	InvoiceCode *string `json:"invoice_code,omitempty" xml:"invoice_code,omitempty"`
}

func (s SaveDigitalLogisticBizPayinvoicefileRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizPayinvoicefileRequest) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetAuthToken(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetProductInstanceId(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetRegionName(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.RegionName = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetAction(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.Action = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetFileHash(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.FileHash = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetFileId(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.FileId = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetForwarderDid(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.ForwarderDid = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileRequest) SetInvoiceCode(v string) *SaveDigitalLogisticBizPayinvoicefileRequest {
	s.InvoiceCode = &v
	return s
}

type SaveDigitalLogisticBizPayinvoicefileResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上凭证
	TxCodes []*TxDto `json:"tx_codes,omitempty" xml:"tx_codes,omitempty" type:"Repeated"`
}

func (s SaveDigitalLogisticBizPayinvoicefileResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDigitalLogisticBizPayinvoicefileResponse) GoString() string {
	return s.String()
}

func (s *SaveDigitalLogisticBizPayinvoicefileResponse) SetReqMsgId(v string) *SaveDigitalLogisticBizPayinvoicefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileResponse) SetResultCode(v string) *SaveDigitalLogisticBizPayinvoicefileResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileResponse) SetResultMsg(v string) *SaveDigitalLogisticBizPayinvoicefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDigitalLogisticBizPayinvoicefileResponse) SetTxCodes(v []*TxDto) *SaveDigitalLogisticBizPayinvoicefileResponse {
	s.TxCodes = v
	return s
}

type UploadDigitalLogisticShippingEblRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 船公司名称
	CarrierName *string `json:"carrier_name,omitempty" xml:"carrier_name,omitempty"`
	// 收货人did
	ConsigneeDid *string `json:"consignee_did,omitempty" xml:"consignee_did,omitempty"`
	// 电子提单类型
	EblCategory *string `json:"ebl_category,omitempty" xml:"ebl_category,omitempty"`
	// 电子提单copy文件hash
	EblCopyPdfFileHash *string `json:"ebl_copy_pdf_file_hash,omitempty" xml:"ebl_copy_pdf_file_hash,omitempty"`
	// copy电子提单pdf文件id
	EblCopyPdfFileId *string `json:"ebl_copy_pdf_file_id,omitempty" xml:"ebl_copy_pdf_file_id,omitempty"`
	// 电子提单编号
	EblNo *string `json:"ebl_no,omitempty" xml:"ebl_no,omitempty"`
	// 电子甜的原文件hash
	EblOriginalPdfFileHash *string `json:"ebl_original_pdf_file_hash,omitempty" xml:"ebl_original_pdf_file_hash,omitempty"`
	// 原电子提单pdf文件id
	EblOriginalPdfFileId *string `json:"ebl_original_pdf_file_id,omitempty" xml:"ebl_original_pdf_file_id,omitempty"`
	// 议付行did
	NegotiatingBankDid *string `json:"negotiating_bank_did,omitempty" xml:"negotiating_bank_did,omitempty"`
	// 托运人did
	ShipperDid *string `json:"shipper_did,omitempty" xml:"shipper_did,omitempty"`
}

func (s UploadDigitalLogisticShippingEblRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticShippingEblRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticShippingEblRequest) SetAuthToken(v string) *UploadDigitalLogisticShippingEblRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetProductInstanceId(v string) *UploadDigitalLogisticShippingEblRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetRegionName(v string) *UploadDigitalLogisticShippingEblRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetCarrierName(v string) *UploadDigitalLogisticShippingEblRequest {
	s.CarrierName = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetConsigneeDid(v string) *UploadDigitalLogisticShippingEblRequest {
	s.ConsigneeDid = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblCategory(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblCategory = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblCopyPdfFileHash(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblCopyPdfFileHash = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblCopyPdfFileId(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblCopyPdfFileId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblNo(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblNo = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblOriginalPdfFileHash(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblOriginalPdfFileHash = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetEblOriginalPdfFileId(v string) *UploadDigitalLogisticShippingEblRequest {
	s.EblOriginalPdfFileId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetNegotiatingBankDid(v string) *UploadDigitalLogisticShippingEblRequest {
	s.NegotiatingBankDid = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblRequest) SetShipperDid(v string) *UploadDigitalLogisticShippingEblRequest {
	s.ShipperDid = &v
	return s
}

type UploadDigitalLogisticShippingEblResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadDigitalLogisticShippingEblResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticShippingEblResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticShippingEblResponse) SetReqMsgId(v string) *UploadDigitalLogisticShippingEblResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblResponse) SetResultCode(v string) *UploadDigitalLogisticShippingEblResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblResponse) SetResultMsg(v string) *UploadDigitalLogisticShippingEblResponse {
	s.ResultMsg = &v
	return s
}

type UploadDigitalLogisticShippingEblbatchRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 代理人did
	AgentDid *string `json:"agent_did,omitempty" xml:"agent_did,omitempty"`
	// 是否为代理操作
	AgentFlag *bool `json:"agent_flag,omitempty" xml:"agent_flag,omitempty"`
	// 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
	// 船公司名称
	CarrierName *string `json:"carrier_name,omitempty" xml:"carrier_name,omitempty"`
	// 收货人did
	ConsigneeDid *string `json:"consignee_did,omitempty" xml:"consignee_did,omitempty"`
	// 电子提单类型
	EblCategory *string `json:"ebl_category,omitempty" xml:"ebl_category,omitempty"`
	// 批次下的提单明细
	//
	//
	EblDetails []*EblDetail `json:"ebl_details,omitempty" xml:"ebl_details,omitempty" type:"Repeated"`
	// 议付行did
	NegotiatingBankDid *string `json:"negotiating_bank_did,omitempty" xml:"negotiating_bank_did,omitempty"`
	// 托运人did
	ShipperDid *string `json:"shipper_did,omitempty" xml:"shipper_did,omitempty"`
}

func (s UploadDigitalLogisticShippingEblbatchRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticShippingEblbatchRequest) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetAuthToken(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetProductInstanceId(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetRegionName(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.RegionName = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetAgentDid(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.AgentDid = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetAgentFlag(v bool) *UploadDigitalLogisticShippingEblbatchRequest {
	s.AgentFlag = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetBatchNo(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.BatchNo = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetCarrierName(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.CarrierName = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetConsigneeDid(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.ConsigneeDid = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetEblCategory(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.EblCategory = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetEblDetails(v []*EblDetail) *UploadDigitalLogisticShippingEblbatchRequest {
	s.EblDetails = v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetNegotiatingBankDid(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.NegotiatingBankDid = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchRequest) SetShipperDid(v string) *UploadDigitalLogisticShippingEblbatchRequest {
	s.ShipperDid = &v
	return s
}

type UploadDigitalLogisticShippingEblbatchResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadDigitalLogisticShippingEblbatchResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDigitalLogisticShippingEblbatchResponse) GoString() string {
	return s.String()
}

func (s *UploadDigitalLogisticShippingEblbatchResponse) SetReqMsgId(v string) *UploadDigitalLogisticShippingEblbatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchResponse) SetResultCode(v string) *UploadDigitalLogisticShippingEblbatchResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDigitalLogisticShippingEblbatchResponse) SetResultMsg(v string) *UploadDigitalLogisticShippingEblbatchResponse {
	s.ResultMsg = &v
	return s
}

type UpdateDigitalLogisticShippingEblbatchstatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 电子提单批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
	// 批次下的提单状态变更明细
	EblStatusDetails []*EblStatusDetail `json:"ebl_status_details,omitempty" xml:"ebl_status_details,omitempty" type:"Repeated"`
}

func (s UpdateDigitalLogisticShippingEblbatchstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticShippingEblbatchstatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusRequest) SetAuthToken(v string) *UpdateDigitalLogisticShippingEblbatchstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusRequest) SetProductInstanceId(v string) *UpdateDigitalLogisticShippingEblbatchstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusRequest) SetRegionName(v string) *UpdateDigitalLogisticShippingEblbatchstatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusRequest) SetBatchNo(v string) *UpdateDigitalLogisticShippingEblbatchstatusRequest {
	s.BatchNo = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusRequest) SetEblStatusDetails(v []*EblStatusDetail) *UpdateDigitalLogisticShippingEblbatchstatusRequest {
	s.EblStatusDetails = v
	return s
}

type UpdateDigitalLogisticShippingEblbatchstatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDigitalLogisticShippingEblbatchstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDigitalLogisticShippingEblbatchstatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusResponse) SetReqMsgId(v string) *UpdateDigitalLogisticShippingEblbatchstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusResponse) SetResultCode(v string) *UpdateDigitalLogisticShippingEblbatchstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDigitalLogisticShippingEblbatchstatusResponse) SetResultMsg(v string) *UpdateDigitalLogisticShippingEblbatchstatusResponse {
	s.ResultMsg = &v
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
				"sdkVersion":     tea.String("Tea-SDK-20201209"),
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
 * Description: 无车承运平台为自身申请DIS分布式数字身份
 * Summary: 无车承运平台DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticPlatformDid(request *CreateDigitalLogisticPlatformDidRequest) (_result *CreateDigitalLogisticPlatformDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticPlatformDidResponse{}
	_body, _err := client.CreateDigitalLogisticPlatformDidEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 无车承运平台为自身申请DIS分布式数字身份
 * Summary: 无车承运平台DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticPlatformDidEx(request *CreateDigitalLogisticPlatformDidRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticPlatformDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticPlatformDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.platform.did.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
 * Summary: 无车承运平台DIS分布式数字身份代理申请
 */
func (client *Client) CreateDigitalLogisticAgentDid(request *CreateDigitalLogisticAgentDidRequest) (_result *CreateDigitalLogisticAgentDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticAgentDidResponse{}
	_body, _err := client.CreateDigitalLogisticAgentDidEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
 * Summary: 无车承运平台DIS分布式数字身份代理申请
 */
func (client *Client) CreateDigitalLogisticAgentDidEx(request *CreateDigitalLogisticAgentDidRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticAgentDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticAgentDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.agent.did.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
 * Summary: 货主DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticConsignorDis(request *CreateDigitalLogisticConsignorDisRequest) (_result *CreateDigitalLogisticConsignorDisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticConsignorDisResponse{}
	_body, _err := client.CreateDigitalLogisticConsignorDisEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
 * Summary: 货主DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticConsignorDisEx(request *CreateDigitalLogisticConsignorDisRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticConsignorDisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticConsignorDisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.consignor.dis.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
 * Summary: 司机DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticDriverDis(request *CreateDigitalLogisticDriverDisRequest) (_result *CreateDigitalLogisticDriverDisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDriverDisResponse{}
	_body, _err := client.CreateDigitalLogisticDriverDisEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
 * Summary: 司机DIS分布式数字身份申请
 */
func (client *Client) CreateDigitalLogisticDriverDisEx(request *CreateDigitalLogisticDriverDisRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDriverDisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDriverDisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.driver.dis.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 货源订单创建，货主发货给平台时的订单信息
 * Summary: 货源订单创建
 */
func (client *Client) CreateDigitalLogisticCargoOrder(request *CreateDigitalLogisticCargoOrderRequest) (_result *CreateDigitalLogisticCargoOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCargoOrderResponse{}
	_body, _err := client.CreateDigitalLogisticCargoOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 货源订单创建，货主发货给平台时的订单信息
 * Summary: 货源订单创建
 */
func (client *Client) CreateDigitalLogisticCargoOrderEx(request *CreateDigitalLogisticCargoOrderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCargoOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCargoOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargo.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 货源支付订单创建,货源订单需存在。
 * Summary: 货源支付订单创建
 */
func (client *Client) CreateDigitalLogisticCargoPay(request *CreateDigitalLogisticCargoPayRequest) (_result *CreateDigitalLogisticCargoPayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCargoPayResponse{}
	_body, _err := client.CreateDigitalLogisticCargoPayEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 货源支付订单创建,货源订单需存在。
 * Summary: 货源支付订单创建
 */
func (client *Client) CreateDigitalLogisticCargoPayEx(request *CreateDigitalLogisticCargoPayRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCargoPayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCargoPayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargo.pay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流平台将运单指派给下游（承运商、司机）时产生
 * Summary: 运单创建
 */
func (client *Client) CreateDigitalLogisticWaybillOrder(request *CreateDigitalLogisticWaybillOrderRequest) (_result *CreateDigitalLogisticWaybillOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.CreateDigitalLogisticWaybillOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流平台将运单指派给下游（承运商、司机）时产生
 * Summary: 运单创建
 */
func (client *Client) CreateDigitalLogisticWaybillOrderEx(request *CreateDigitalLogisticWaybillOrderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticWaybillOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建物流支付订单，运单需已存在并且未结束
 * Summary: 运单支付订单创建
 */
func (client *Client) CreateDigitalLogisticWaybillPay(request *CreateDigitalLogisticWaybillPayRequest) (_result *CreateDigitalLogisticWaybillPayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticWaybillPayResponse{}
	_body, _err := client.CreateDigitalLogisticWaybillPayEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建物流支付订单，运单需已存在并且未结束
 * Summary: 运单支付订单创建
 */
func (client *Client) CreateDigitalLogisticWaybillPayEx(request *CreateDigitalLogisticWaybillPayRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticWaybillPayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticWaybillPayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.pay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
 * Summary: 第三方位置信息上报
 */
func (client *Client) ImportDigitalLogisticWaybillLocation(request *ImportDigitalLogisticWaybillLocationRequest) (_result *ImportDigitalLogisticWaybillLocationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ImportDigitalLogisticWaybillLocationResponse{}
	_body, _err := client.ImportDigitalLogisticWaybillLocationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
 * Summary: 第三方位置信息上报
 */
func (client *Client) ImportDigitalLogisticWaybillLocationEx(request *ImportDigitalLogisticWaybillLocationRequest, runtime *util.RuntimeOptions) (_result *ImportDigitalLogisticWaybillLocationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDigitalLogisticWaybillLocationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.location.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发票订单创建
 * Summary: 发票订单创建
 */
func (client *Client) CreateDigitalLogisticWaybillBill(request *CreateDigitalLogisticWaybillBillRequest) (_result *CreateDigitalLogisticWaybillBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticWaybillBillResponse{}
	_body, _err := client.CreateDigitalLogisticWaybillBillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发票订单创建
 * Summary: 发票订单创建
 */
func (client *Client) CreateDigitalLogisticWaybillBillEx(request *CreateDigitalLogisticWaybillBillRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticWaybillBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticWaybillBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.bill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询物流运单状态
 * Summary: 查询运单状态
 */
func (client *Client) QueryDigitalLogisticWaybillStatus(request *QueryDigitalLogisticWaybillStatusRequest) (_result *QueryDigitalLogisticWaybillStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticWaybillStatusResponse{}
	_body, _err := client.QueryDigitalLogisticWaybillStatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询物流运单状态
 * Summary: 查询运单状态
 */
func (client *Client) QueryDigitalLogisticWaybillStatusEx(request *QueryDigitalLogisticWaybillStatusRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticWaybillStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticWaybillStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
完成后的运单无法再调用支付订单与轨迹位置上传接口。
 * Summary: 运单完成
*/
func (client *Client) FinishDigitalLogisticWaybillOrder(request *FinishDigitalLogisticWaybillOrderRequest) (_result *FinishDigitalLogisticWaybillOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FinishDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.FinishDigitalLogisticWaybillOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
完成后的运单无法再调用支付订单与轨迹位置上传接口。
 * Summary: 运单完成
*/
func (client *Client) FinishDigitalLogisticWaybillOrderEx(request *FinishDigitalLogisticWaybillOrderRequest, runtime *util.RuntimeOptions) (_result *FinishDigitalLogisticWaybillOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.order.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 货源支付订单创建,货源订单需存在。
 * Summary: 货源支付订单创建
 */
func (client *Client) CreateDigitalLogisticCargoPayorder(request *CreateDigitalLogisticCargoPayorderRequest) (_result *CreateDigitalLogisticCargoPayorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCargoPayorderResponse{}
	_body, _err := client.CreateDigitalLogisticCargoPayorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 货源支付订单创建,货源订单需存在。
 * Summary: 货源支付订单创建
 */
func (client *Client) CreateDigitalLogisticCargoPayorderEx(request *CreateDigitalLogisticCargoPayorderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCargoPayorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCargoPayorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargo.payorder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当货物到达目的地时，调用此接口
 * Summary: 运单运输完成
 */
func (client *Client) SaveDigitalLogisticWaybillOrder(request *SaveDigitalLogisticWaybillOrderRequest) (_result *SaveDigitalLogisticWaybillOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.SaveDigitalLogisticWaybillOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当货物到达目的地时，调用此接口
 * Summary: 运单运输完成
 */
func (client *Client) SaveDigitalLogisticWaybillOrderEx(request *SaveDigitalLogisticWaybillOrderRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticWaybillOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.order.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运单关闭
 * Summary: 运单关闭
 */
func (client *Client) CloseDigitalLogisticWaybillOrder(request *CloseDigitalLogisticWaybillOrderRequest) (_result *CloseDigitalLogisticWaybillOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CloseDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.CloseDigitalLogisticWaybillOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运单关闭
 * Summary: 运单关闭
 */
func (client *Client) CloseDigitalLogisticWaybillOrderEx(request *CloseDigitalLogisticWaybillOrderRequest, runtime *util.RuntimeOptions) (_result *CloseDigitalLogisticWaybillOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseDigitalLogisticWaybillOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.order.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 完成物流运单
 * Summary: 完成物流运单
 */
func (client *Client) FinishDigitalLogisticFinanceWaybill(request *FinishDigitalLogisticFinanceWaybillRequest) (_result *FinishDigitalLogisticFinanceWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FinishDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.FinishDigitalLogisticFinanceWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 完成物流运单
 * Summary: 完成物流运单
 */
func (client *Client) FinishDigitalLogisticFinanceWaybillEx(request *FinishDigitalLogisticFinanceWaybillRequest, runtime *util.RuntimeOptions) (_result *FinishDigitalLogisticFinanceWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.finance.waybill.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运输完成
 * Summary: 运输完成
 */
func (client *Client) FinishDigitalLogisticFinanceTransport(request *FinishDigitalLogisticFinanceTransportRequest) (_result *FinishDigitalLogisticFinanceTransportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FinishDigitalLogisticFinanceTransportResponse{}
	_body, _err := client.FinishDigitalLogisticFinanceTransportEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运输完成
 * Summary: 运输完成
 */
func (client *Client) FinishDigitalLogisticFinanceTransportEx(request *FinishDigitalLogisticFinanceTransportRequest, runtime *util.RuntimeOptions) (_result *FinishDigitalLogisticFinanceTransportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishDigitalLogisticFinanceTransportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.finance.transport.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对运单信息项需更新时调用
 * Summary: 更新运单
 */
func (client *Client) UpdateDigitalLogisticFinanceWaybill(request *UpdateDigitalLogisticFinanceWaybillRequest) (_result *UpdateDigitalLogisticFinanceWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.UpdateDigitalLogisticFinanceWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对运单信息项需更新时调用
 * Summary: 更新运单
 */
func (client *Client) UpdateDigitalLogisticFinanceWaybillEx(request *UpdateDigitalLogisticFinanceWaybillRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticFinanceWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.finance.waybill.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当司机到达货主装货地后，调用此接口
 * Summary: 起运运单
 */
func (client *Client) StartDigitalLogisticFinanceWaybill(request *StartDigitalLogisticFinanceWaybillRequest) (_result *StartDigitalLogisticFinanceWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &StartDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.StartDigitalLogisticFinanceWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当司机到达货主装货地后，调用此接口
 * Summary: 起运运单
 */
func (client *Client) StartDigitalLogisticFinanceWaybillEx(request *StartDigitalLogisticFinanceWaybillRequest, runtime *util.RuntimeOptions) (_result *StartDigitalLogisticFinanceWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartDigitalLogisticFinanceWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.finance.waybill.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建承运商账户
 * Summary: 创建承运商账户
 */
func (client *Client) CreateDigitalLogisticCaptainDis(request *CreateDigitalLogisticCaptainDisRequest) (_result *CreateDigitalLogisticCaptainDisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCaptainDisResponse{}
	_body, _err := client.CreateDigitalLogisticCaptainDisEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建承运商账户
 * Summary: 创建承运商账户
 */
func (client *Client) CreateDigitalLogisticCaptainDisEx(request *CreateDigitalLogisticCaptainDisRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCaptainDisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCaptainDisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.captain.dis.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建货主账单
 * Summary: 货主账单创建
 */
func (client *Client) CreateDigitalLogisticCargowaybillBill(request *CreateDigitalLogisticCargowaybillBillRequest) (_result *CreateDigitalLogisticCargowaybillBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.CreateDigitalLogisticCargowaybillBillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建货主账单
 * Summary: 货主账单创建
 */
func (client *Client) CreateDigitalLogisticCargowaybillBillEx(request *CreateDigitalLogisticCargowaybillBillRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCargowaybillBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargowaybill.bill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认货主账单
 * Summary: 货主账单确认
 */
func (client *Client) ConfirmDigitalLogisticCargowaybillBill(request *ConfirmDigitalLogisticCargowaybillBillRequest) (_result *ConfirmDigitalLogisticCargowaybillBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.ConfirmDigitalLogisticCargowaybillBillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认货主账单
 * Summary: 货主账单确认
 */
func (client *Client) ConfirmDigitalLogisticCargowaybillBillEx(request *ConfirmDigitalLogisticCargowaybillBillRequest, runtime *util.RuntimeOptions) (_result *ConfirmDigitalLogisticCargowaybillBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargowaybill.bill.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 结算货主账单
 * Summary: 货主账单结算
 */
func (client *Client) CreateDigitalLogisticCargowaybillBillsettle(request *CreateDigitalLogisticCargowaybillBillsettleRequest) (_result *CreateDigitalLogisticCargowaybillBillsettleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCargowaybillBillsettleResponse{}
	_body, _err := client.CreateDigitalLogisticCargowaybillBillsettleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 结算货主账单
 * Summary: 货主账单结算
 */
func (client *Client) CreateDigitalLogisticCargowaybillBillsettleEx(request *CreateDigitalLogisticCargowaybillBillsettleRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCargowaybillBillsettleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCargowaybillBillsettleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargowaybill.billsettle.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运单平台did更新
 * Summary: 运单平台did更新
 */
func (client *Client) UpdateDigitalLogisticWaybillorderPlatformdid(request *UpdateDigitalLogisticWaybillorderPlatformdidRequest) (_result *UpdateDigitalLogisticWaybillorderPlatformdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticWaybillorderPlatformdidResponse{}
	_body, _err := client.UpdateDigitalLogisticWaybillorderPlatformdidEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运单平台did更新
 * Summary: 运单平台did更新
 */
func (client *Client) UpdateDigitalLogisticWaybillorderPlatformdidEx(request *UpdateDigitalLogisticWaybillorderPlatformdidRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticWaybillorderPlatformdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticWaybillorderPlatformdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybillorder.platformdid.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新货主账单
 * Summary: 货主账单更新
 */
func (client *Client) UpdateDigitalLogisticCargowaybillBill(request *UpdateDigitalLogisticCargowaybillBillRequest) (_result *UpdateDigitalLogisticCargowaybillBillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.UpdateDigitalLogisticCargowaybillBillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新货主账单
 * Summary: 货主账单更新
 */
func (client *Client) UpdateDigitalLogisticCargowaybillBillEx(request *UpdateDigitalLogisticCargowaybillBillRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticCargowaybillBillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticCargowaybillBillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.cargowaybill.bill.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
 * Summary: 分布式数字身份申请did集合
 */
func (client *Client) CreateDigitalLogisticDisDid(request *CreateDigitalLogisticDisDidRequest) (_result *CreateDigitalLogisticDisDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDisDidResponse{}
	_body, _err := client.CreateDigitalLogisticDisDidEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
 * Summary: 分布式数字身份申请did集合
 */
func (client *Client) CreateDigitalLogisticDisDidEx(request *CreateDigitalLogisticDisDidRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDisDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDisDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.dis.did.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL运输合同上传
 * Summary: 3PL运输合同上传
 */
func (client *Client) UploadDigitalLogisticTransportContract(request *UploadDigitalLogisticTransportContractRequest) (_result *UploadDigitalLogisticTransportContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticTransportContractResponse{}
	_body, _err := client.UploadDigitalLogisticTransportContractEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL运输合同上传
 * Summary: 3PL运输合同上传
 */
func (client *Client) UploadDigitalLogisticTransportContractEx(request *UploadDigitalLogisticTransportContractRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticTransportContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticTransportContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.transport.contract.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL运输线路上传
 * Summary: 3PL运输线路上传
 */
func (client *Client) UploadDigitalLogisticTransportRoute(request *UploadDigitalLogisticTransportRouteRequest) (_result *UploadDigitalLogisticTransportRouteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticTransportRouteResponse{}
	_body, _err := client.UploadDigitalLogisticTransportRouteEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL运输线路上传
 * Summary: 3PL运输线路上传
 */
func (client *Client) UploadDigitalLogisticTransportRouteEx(request *UploadDigitalLogisticTransportRouteRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticTransportRouteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticTransportRouteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.transport.route.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL运单创建
 * Summary: 3PL运单创建
 */
func (client *Client) CreateDigitalLogisticTransportWaybill(request *CreateDigitalLogisticTransportWaybillRequest) (_result *CreateDigitalLogisticTransportWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticTransportWaybillResponse{}
	_body, _err := client.CreateDigitalLogisticTransportWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL运单创建
 * Summary: 3PL运单创建
 */
func (client *Client) CreateDigitalLogisticTransportWaybillEx(request *CreateDigitalLogisticTransportWaybillRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticTransportWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticTransportWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.transport.waybill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL运单状态更新
 * Summary: 3PL运单状态更新
 */
func (client *Client) UpdateDigitalLogisticWaybillAction(request *UpdateDigitalLogisticWaybillActionRequest) (_result *UpdateDigitalLogisticWaybillActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticWaybillActionResponse{}
	_body, _err := client.UpdateDigitalLogisticWaybillActionEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL运单状态更新
 * Summary: 3PL运单状态更新
 */
func (client *Client) UpdateDigitalLogisticWaybillActionEx(request *UpdateDigitalLogisticWaybillActionRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticWaybillActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticWaybillActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.waybill.action.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL运单修改
 * Summary: 3PL运单修改
 */
func (client *Client) UpdateDigitalLogisticTransportWaybill(request *UpdateDigitalLogisticTransportWaybillRequest) (_result *UpdateDigitalLogisticTransportWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticTransportWaybillResponse{}
	_body, _err := client.UpdateDigitalLogisticTransportWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL运单修改
 * Summary: 3PL运单修改
 */
func (client *Client) UpdateDigitalLogisticTransportWaybillEx(request *UpdateDigitalLogisticTransportWaybillRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticTransportWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticTransportWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.transport.waybill.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 3PL回单上传
 * Summary: 3PL回单上传
 */
func (client *Client) UploadDigitalLogisticTransportReceipt(request *UploadDigitalLogisticTransportReceiptRequest) (_result *UploadDigitalLogisticTransportReceiptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticTransportReceiptResponse{}
	_body, _err := client.UploadDigitalLogisticTransportReceiptEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 3PL回单上传
 * Summary: 3PL回单上传
 */
func (client *Client) UploadDigitalLogisticTransportReceiptEx(request *UploadDigitalLogisticTransportReceiptRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticTransportReceiptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticTransportReceiptResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.transport.receipt.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应收账单创建
 * Summary: 应收账单创建
 */
func (client *Client) CreateDigitalLogisticBillReceivablebill(request *CreateDigitalLogisticBillReceivablebillRequest) (_result *CreateDigitalLogisticBillReceivablebillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticBillReceivablebillResponse{}
	_body, _err := client.CreateDigitalLogisticBillReceivablebillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应收账单创建
 * Summary: 应收账单创建
 */
func (client *Client) CreateDigitalLogisticBillReceivablebillEx(request *CreateDigitalLogisticBillReceivablebillRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticBillReceivablebillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticBillReceivablebillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receivablebill.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应收账单状态更新
 * Summary: 应收账单状态更新
 */
func (client *Client) UpdateDigitalLogisticReceivablebillStatus(request *UpdateDigitalLogisticReceivablebillStatusRequest) (_result *UpdateDigitalLogisticReceivablebillStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticReceivablebillStatusResponse{}
	_body, _err := client.UpdateDigitalLogisticReceivablebillStatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应收账单状态更新
 * Summary: 应收账单状态更新
 */
func (client *Client) UpdateDigitalLogisticReceivablebillStatusEx(request *UpdateDigitalLogisticReceivablebillStatusRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticReceivablebillStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticReceivablebillStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.receivablebill.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应收账单修改
 * Summary: 应收账单修改
 */
func (client *Client) UpdateDigitalLogisticBillReceivablebill(request *UpdateDigitalLogisticBillReceivablebillRequest) (_result *UpdateDigitalLogisticBillReceivablebillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticBillReceivablebillResponse{}
	_body, _err := client.UpdateDigitalLogisticBillReceivablebillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应收账单修改
 * Summary: 应收账单修改
 */
func (client *Client) UpdateDigitalLogisticBillReceivablebillEx(request *UpdateDigitalLogisticBillReceivablebillRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticBillReceivablebillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticBillReceivablebillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receivablebill.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 路运发票创建
 * Summary: 路运发票创建
 */
func (client *Client) CreateDigitalLogisticHighwayInvoice(request *CreateDigitalLogisticHighwayInvoiceRequest) (_result *CreateDigitalLogisticHighwayInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticHighwayInvoiceResponse{}
	_body, _err := client.CreateDigitalLogisticHighwayInvoiceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 路运发票创建
 * Summary: 路运发票创建
 */
func (client *Client) CreateDigitalLogisticHighwayInvoiceEx(request *CreateDigitalLogisticHighwayInvoiceRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticHighwayInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticHighwayInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.highway.invoice.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 司机信用流转协议签署并开通流转能力
 * Summary: 司机信用流转协议签署并开通流转能力
 */
func (client *Client) OpenDigitalLogisticCreditDriver(request *OpenDigitalLogisticCreditDriverRequest) (_result *OpenDigitalLogisticCreditDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &OpenDigitalLogisticCreditDriverResponse{}
	_body, _err := client.OpenDigitalLogisticCreditDriverEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 司机信用流转协议签署并开通流转能力
 * Summary: 司机信用流转协议签署并开通流转能力
 */
func (client *Client) OpenDigitalLogisticCreditDriverEx(request *OpenDigitalLogisticCreditDriverRequest, runtime *util.RuntimeOptions) (_result *OpenDigitalLogisticCreditDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenDigitalLogisticCreditDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.driver.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询司机信用流转能力开通情况
 * Summary: 查询司机信用流转能力开通情况
 */
func (client *Client) QueryDigitalLogisticCreditDriver(request *QueryDigitalLogisticCreditDriverRequest) (_result *QueryDigitalLogisticCreditDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditDriverResponse{}
	_body, _err := client.QueryDigitalLogisticCreditDriverEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询司机信用流转能力开通情况
 * Summary: 查询司机信用流转能力开通情况
 */
func (client *Client) QueryDigitalLogisticCreditDriverEx(request *QueryDigitalLogisticCreditDriverRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.driver.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询货主信用流转能力开通情况
 * Summary: 查询货主信用流转能力开通情况
 */
func (client *Client) QueryDigitalLogisticCreditConsignor(request *QueryDigitalLogisticCreditConsignorRequest) (_result *QueryDigitalLogisticCreditConsignorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditConsignorResponse{}
	_body, _err := client.QueryDigitalLogisticCreditConsignorEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询货主信用流转能力开通情况
 * Summary: 查询货主信用流转能力开通情况
 */
func (client *Client) QueryDigitalLogisticCreditConsignorEx(request *QueryDigitalLogisticCreditConsignorRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditConsignorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditConsignorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.consignor.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询货主信用流转额度
 * Summary: 查询货主信用流转额度
 */
func (client *Client) QueryDigitalLogisticCreditBalance(request *QueryDigitalLogisticCreditBalanceRequest) (_result *QueryDigitalLogisticCreditBalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditBalanceResponse{}
	_body, _err := client.QueryDigitalLogisticCreditBalanceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询货主信用流转额度
 * Summary: 查询货主信用流转额度
 */
func (client *Client) QueryDigitalLogisticCreditBalanceEx(request *QueryDigitalLogisticCreditBalanceRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditBalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditBalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.balance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
 * Summary: 发行信用流转批次信息上传
 */
func (client *Client) UploadDigitalLogisticCreditIssue(request *UploadDigitalLogisticCreditIssueRequest) (_result *UploadDigitalLogisticCreditIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditIssueResponse{}
	_body, _err := client.UploadDigitalLogisticCreditIssueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
 * Summary: 发行信用流转批次信息上传
 */
func (client *Client) UploadDigitalLogisticCreditIssueEx(request *UploadDigitalLogisticCreditIssueRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issue.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转批次状态查询
 * Summary: 信用流转批次状态查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuebatchstatus(request *QueryDigitalLogisticCreditIssuebatchstatusRequest) (_result *QueryDigitalLogisticCreditIssuebatchstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuebatchstatusResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuebatchstatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转批次状态查询
 * Summary: 信用流转批次状态查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuebatchstatusEx(request *QueryDigitalLogisticCreditIssuebatchstatusRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuebatchstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuebatchstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebatchstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付批次撤销
 * Summary: 支付批次撤销
 */
func (client *Client) CancelDigitalLogisticCreditIssuebatch(request *CancelDigitalLogisticCreditIssuebatchRequest) (_result *CancelDigitalLogisticCreditIssuebatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelDigitalLogisticCreditIssuebatchResponse{}
	_body, _err := client.CancelDigitalLogisticCreditIssuebatchEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付批次撤销
 * Summary: 支付批次撤销
 */
func (client *Client) CancelDigitalLogisticCreditIssuebatchEx(request *CancelDigitalLogisticCreditIssuebatchRequest, runtime *util.RuntimeOptions) (_result *CancelDigitalLogisticCreditIssuebatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelDigitalLogisticCreditIssuebatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebatch.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据id查询信用凭证信息
 * Summary: 根据id查询信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditIssuebyid(request *QueryDigitalLogisticCreditIssuebyidRequest) (_result *QueryDigitalLogisticCreditIssuebyidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuebyidResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuebyidEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据id查询信用凭证信息
 * Summary: 根据id查询信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditIssuebyidEx(request *QueryDigitalLogisticCreditIssuebyidRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuebyidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuebyidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebyid.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据时间查询信用凭证信息
 * Summary: 根据时间查询信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditIssuebytime(request *QueryDigitalLogisticCreditIssuebytimeRequest) (_result *QueryDigitalLogisticCreditIssuebytimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuebytimeResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuebytimeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据时间查询信用凭证信息
 * Summary: 根据时间查询信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditIssuebytimeEx(request *QueryDigitalLogisticCreditIssuebytimeRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuebytimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuebytimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebytime.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户持有的信用凭证信息
 * Summary: 查询用户持有的信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditUserissue(request *QueryDigitalLogisticCreditUserissueRequest) (_result *QueryDigitalLogisticCreditUserissueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditUserissueResponse{}
	_body, _err := client.QueryDigitalLogisticCreditUserissueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户持有的信用凭证信息
 * Summary: 查询用户持有的信用凭证信息
 */
func (client *Client) QueryDigitalLogisticCreditUserissueEx(request *QueryDigitalLogisticCreditUserissueRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditUserissueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditUserissueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.userissue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户信用流转流水记录
 * Summary: 查询用户信用流转流水记录
 */
func (client *Client) QueryDigitalLogisticCreditStatement(request *QueryDigitalLogisticCreditStatementRequest) (_result *QueryDigitalLogisticCreditStatementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditStatementResponse{}
	_body, _err := client.QueryDigitalLogisticCreditStatementEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户信用流转流水记录
 * Summary: 查询用户信用流转流水记录
 */
func (client *Client) QueryDigitalLogisticCreditStatementEx(request *QueryDigitalLogisticCreditStatementRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditStatementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditStatementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.statement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证拆分转让申请
 * Summary: 信用凭证拆分转让申请
 */
func (client *Client) CreateDigitalLogisticCreditIssuetransfer(request *CreateDigitalLogisticCreditIssuetransferRequest) (_result *CreateDigitalLogisticCreditIssuetransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCreditIssuetransferResponse{}
	_body, _err := client.CreateDigitalLogisticCreditIssuetransferEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证拆分转让申请
 * Summary: 信用凭证拆分转让申请
 */
func (client *Client) CreateDigitalLogisticCreditIssuetransferEx(request *CreateDigitalLogisticCreditIssuetransferRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCreditIssuetransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCreditIssuetransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuetransfer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证拆分转让结果查询
 * Summary: 信用凭证拆分转让结果查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuetransfer(request *QueryDigitalLogisticCreditIssuetransferRequest) (_result *QueryDigitalLogisticCreditIssuetransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuetransferResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuetransferEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证拆分转让结果查询
 * Summary: 信用凭证拆分转让结果查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuetransferEx(request *QueryDigitalLogisticCreditIssuetransferRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuetransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuetransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuetransfer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证融资申请
 * Summary: 信用凭证融资申请
 */
func (client *Client) CreateDigitalLogisticCreditIssuefinance(request *CreateDigitalLogisticCreditIssuefinanceRequest) (_result *CreateDigitalLogisticCreditIssuefinanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCreditIssuefinanceResponse{}
	_body, _err := client.CreateDigitalLogisticCreditIssuefinanceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证融资申请
 * Summary: 信用凭证融资申请
 */
func (client *Client) CreateDigitalLogisticCreditIssuefinanceEx(request *CreateDigitalLogisticCreditIssuefinanceRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCreditIssuefinanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCreditIssuefinanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuefinance.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证融资结果查询
 * Summary: 信用凭证融资结果查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuefinance(request *QueryDigitalLogisticCreditIssuefinanceRequest) (_result *QueryDigitalLogisticCreditIssuefinanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuefinanceResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuefinanceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证融资结果查询
 * Summary: 信用凭证融资结果查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuefinanceEx(request *QueryDigitalLogisticCreditIssuefinanceRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuefinanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuefinanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuefinance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证清分信息查询
 * Summary: 信用凭证清分信息查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuereceivable(request *QueryDigitalLogisticCreditIssuereceivableRequest) (_result *QueryDigitalLogisticCreditIssuereceivableResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuereceivableResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuereceivableEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证清分信息查询
 * Summary: 信用凭证清分信息查询
 */
func (client *Client) QueryDigitalLogisticCreditIssuereceivableEx(request *QueryDigitalLogisticCreditIssuereceivableRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuereceivableResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuereceivableResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuereceivable.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证资产查询
 * Summary: 信用凭证资产查询
 */
func (client *Client) QueryDigitalLogisticCreditIssueamount(request *QueryDigitalLogisticCreditIssueamountRequest) (_result *QueryDigitalLogisticCreditIssueamountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssueamountResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssueamountEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证资产查询
 * Summary: 信用凭证资产查询
 */
func (client *Client) QueryDigitalLogisticCreditIssueamountEx(request *QueryDigitalLogisticCreditIssueamountRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssueamountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssueamountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issueamount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流金融统一回调接口
 * Summary: 物流金融统一回调接口
 */
func (client *Client) CallbackDigitalLogisticCreditCommon(request *CallbackDigitalLogisticCreditCommonRequest) (_result *CallbackDigitalLogisticCreditCommonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CallbackDigitalLogisticCreditCommonResponse{}
	_body, _err := client.CallbackDigitalLogisticCreditCommonEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流金融统一回调接口
 * Summary: 物流金融统一回调接口
 */
func (client *Client) CallbackDigitalLogisticCreditCommonEx(request *CallbackDigitalLogisticCreditCommonRequest, runtime *util.RuntimeOptions) (_result *CallbackDigitalLogisticCreditCommonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackDigitalLogisticCreditCommonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.common.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证主动清分
 * Summary: 信用凭证主动清分
 */
func (client *Client) ApplyDigitalLogisticCreditIssueclear(request *ApplyDigitalLogisticCreditIssueclearRequest) (_result *ApplyDigitalLogisticCreditIssueclearResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticCreditIssueclearResponse{}
	_body, _err := client.ApplyDigitalLogisticCreditIssueclearEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证主动清分
 * Summary: 信用凭证主动清分
 */
func (client *Client) ApplyDigitalLogisticCreditIssueclearEx(request *ApplyDigitalLogisticCreditIssueclearRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticCreditIssueclearResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticCreditIssueclearResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issueclear.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流金融代理消息
 * Summary: 物流金融代理消息
 */
func (client *Client) SendDigitalLogisticCreditProxy(request *SendDigitalLogisticCreditProxyRequest) (_result *SendDigitalLogisticCreditProxyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendDigitalLogisticCreditProxyResponse{}
	_body, _err := client.SendDigitalLogisticCreditProxyEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流金融代理消息
 * Summary: 物流金融代理消息
 */
func (client *Client) SendDigitalLogisticCreditProxyEx(request *SendDigitalLogisticCreditProxyRequest, runtime *util.RuntimeOptions) (_result *SendDigitalLogisticCreditProxyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDigitalLogisticCreditProxyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.proxy.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运单信用流转核验结果查询
 * Summary: 运单信用流转核验结果查询
 */
func (client *Client) CheckDigitalLogisticCreditWaybill(request *CheckDigitalLogisticCreditWaybillRequest) (_result *CheckDigitalLogisticCreditWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CheckDigitalLogisticCreditWaybillResponse{}
	_body, _err := client.CheckDigitalLogisticCreditWaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运单信用流转核验结果查询
 * Summary: 运单信用流转核验结果查询
 */
func (client *Client) CheckDigitalLogisticCreditWaybillEx(request *CheckDigitalLogisticCreditWaybillRequest, runtime *util.RuntimeOptions) (_result *CheckDigitalLogisticCreditWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckDigitalLogisticCreditWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.waybill.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流金融信用流转司机换绑
 * Summary: 物流金融信用流转司机换绑
 */
func (client *Client) ReopenDigitalLogisticCreditDriver(request *ReopenDigitalLogisticCreditDriverRequest) (_result *ReopenDigitalLogisticCreditDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ReopenDigitalLogisticCreditDriverResponse{}
	_body, _err := client.ReopenDigitalLogisticCreditDriverEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流金融信用流转司机换绑
 * Summary: 物流金融信用流转司机换绑
 */
func (client *Client) ReopenDigitalLogisticCreditDriverEx(request *ReopenDigitalLogisticCreditDriverRequest, runtime *util.RuntimeOptions) (_result *ReopenDigitalLogisticCreditDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReopenDigitalLogisticCreditDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.driver.reopen"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线下协议授权关系上传
 * Summary: 线下协议授权关系上传
 */
func (client *Client) UploadDigitalLogisticCreditAuthorization(request *UploadDigitalLogisticCreditAuthorizationRequest) (_result *UploadDigitalLogisticCreditAuthorizationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditAuthorizationResponse{}
	_body, _err := client.UploadDigitalLogisticCreditAuthorizationEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线下协议授权关系上传
 * Summary: 线下协议授权关系上传
 */
func (client *Client) UploadDigitalLogisticCreditAuthorizationEx(request *UploadDigitalLogisticCreditAuthorizationRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditAuthorizationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditAuthorizationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.authorization.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线上应收转让确认关系
 * Summary: 线上应收转让确认关系
 */
func (client *Client) UploadDigitalLogisticCreditConfirm(request *UploadDigitalLogisticCreditConfirmRequest) (_result *UploadDigitalLogisticCreditConfirmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditConfirmResponse{}
	_body, _err := client.UploadDigitalLogisticCreditConfirmEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线上应收转让确认关系
 * Summary: 线上应收转让确认关系
 */
func (client *Client) UploadDigitalLogisticCreditConfirmEx(request *UploadDigitalLogisticCreditConfirmRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditConfirmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditConfirmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.confirm.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流信用流转凭证批量发行
 * Summary: 物流信用流转凭证批量发行
 */
func (client *Client) BatchcreateDigitalLogisticCreditmodeIssue(request *BatchcreateDigitalLogisticCreditmodeIssueRequest) (_result *BatchcreateDigitalLogisticCreditmodeIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &BatchcreateDigitalLogisticCreditmodeIssueResponse{}
	_body, _err := client.BatchcreateDigitalLogisticCreditmodeIssueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流信用流转凭证批量发行
 * Summary: 物流信用流转凭证批量发行
 */
func (client *Client) BatchcreateDigitalLogisticCreditmodeIssueEx(request *BatchcreateDigitalLogisticCreditmodeIssueRequest, runtime *util.RuntimeOptions) (_result *BatchcreateDigitalLogisticCreditmodeIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateDigitalLogisticCreditmodeIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.creditmode.issue.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物流信用流转按模式主动清分
 * Summary: 物流信用流转按模式主动清分
 */
func (client *Client) ApplyDigitalLogisticCreditmodeIssueclear(request *ApplyDigitalLogisticCreditmodeIssueclearRequest) (_result *ApplyDigitalLogisticCreditmodeIssueclearResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticCreditmodeIssueclearResponse{}
	_body, _err := client.ApplyDigitalLogisticCreditmodeIssueclearEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物流信用流转按模式主动清分
 * Summary: 物流信用流转按模式主动清分
 */
func (client *Client) ApplyDigitalLogisticCreditmodeIssueclearEx(request *ApplyDigitalLogisticCreditmodeIssueclearRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticCreditmodeIssueclearResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticCreditmodeIssueclearResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.creditmode.issueclear.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转发行信息上传SAAS版
 * Summary: 信用流转发行信息上传SAAS版
 */
func (client *Client) UploadDigitalLogisticCreditIssuebysaas(request *UploadDigitalLogisticCreditIssuebysaasRequest) (_result *UploadDigitalLogisticCreditIssuebysaasResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditIssuebysaasResponse{}
	_body, _err := client.UploadDigitalLogisticCreditIssuebysaasEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转发行信息上传SAAS版
 * Summary: 信用流转发行信息上传SAAS版
 */
func (client *Client) UploadDigitalLogisticCreditIssuebysaasEx(request *UploadDigitalLogisticCreditIssuebysaasRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditIssuebysaasResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditIssuebysaasResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebysaas.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转B模式发行批次撤销SAAS版
 * Summary: 信用流转B模式发行批次撤销SAAS版
 */
func (client *Client) CancelDigitalLogisticCreditIssuebatchbysaas(request *CancelDigitalLogisticCreditIssuebatchbysaasRequest) (_result *CancelDigitalLogisticCreditIssuebatchbysaasResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelDigitalLogisticCreditIssuebatchbysaasResponse{}
	_body, _err := client.CancelDigitalLogisticCreditIssuebatchbysaasEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转B模式发行批次撤销SAAS版
 * Summary: 信用流转B模式发行批次撤销SAAS版
 */
func (client *Client) CancelDigitalLogisticCreditIssuebatchbysaasEx(request *CancelDigitalLogisticCreditIssuebatchbysaasRequest, runtime *util.RuntimeOptions) (_result *CancelDigitalLogisticCreditIssuebatchbysaasResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelDigitalLogisticCreditIssuebatchbysaasResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebatchbysaas.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转可用额度查询SAAS版
 * Summary: 信用流转可用额度查询SAAS版
 */
func (client *Client) QueryDigitalLogisticCreditBalancebysaas(request *QueryDigitalLogisticCreditBalancebysaasRequest) (_result *QueryDigitalLogisticCreditBalancebysaasResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditBalancebysaasResponse{}
	_body, _err := client.QueryDigitalLogisticCreditBalancebysaasEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转可用额度查询SAAS版
 * Summary: 信用流转可用额度查询SAAS版
 */
func (client *Client) QueryDigitalLogisticCreditBalancebysaasEx(request *QueryDigitalLogisticCreditBalancebysaasRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditBalancebysaasResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditBalancebysaasResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.balancebysaas.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取
 * Summary: 信用凭证电子回单获取
 */
func (client *Client) GetDigitalLogisticCreditIssuescpticket(request *GetDigitalLogisticCreditIssuescpticketRequest) (_result *GetDigitalLogisticCreditIssuescpticketResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetDigitalLogisticCreditIssuescpticketResponse{}
	_body, _err := client.GetDigitalLogisticCreditIssuescpticketEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取
 * Summary: 信用凭证电子回单获取
 */
func (client *Client) GetDigitalLogisticCreditIssuescpticketEx(request *GetDigitalLogisticCreditIssuescpticketRequest, runtime *util.RuntimeOptions) (_result *GetDigitalLogisticCreditIssuescpticketResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDigitalLogisticCreditIssuescpticketResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuescpticket.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取结果查询接口
 * Summary: 信用凭证电子回单获取结果查询接口
 */
func (client *Client) QueryDigitalLogisticCreditIssuescpticketresult(request *QueryDigitalLogisticCreditIssuescpticketresultRequest) (_result *QueryDigitalLogisticCreditIssuescpticketresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditIssuescpticketresultResponse{}
	_body, _err := client.QueryDigitalLogisticCreditIssuescpticketresultEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取结果查询接口
 * Summary: 信用凭证电子回单获取结果查询接口
 */
func (client *Client) QueryDigitalLogisticCreditIssuescpticketresultEx(request *QueryDigitalLogisticCreditIssuescpticketresultRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditIssuescpticketresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditIssuescpticketresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuescpticketresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转A+模式发行信息上传
 * Summary: 信用流转A+模式发行信息上传
 */
func (client *Client) UploadDigitalLogisticCreditAplusissue(request *UploadDigitalLogisticCreditAplusissueRequest) (_result *UploadDigitalLogisticCreditAplusissueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditAplusissueResponse{}
	_body, _err := client.UploadDigitalLogisticCreditAplusissueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转A+模式发行信息上传
 * Summary: 信用流转A+模式发行信息上传
 */
func (client *Client) UploadDigitalLogisticCreditAplusissueEx(request *UploadDigitalLogisticCreditAplusissueRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditAplusissueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditAplusissueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.aplusissue.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转可用额度查询接口
 * Summary: 信用流转可用额度查询接口
 */
func (client *Client) QueryDigitalLogisticCreditCreditamount(request *QueryDigitalLogisticCreditCreditamountRequest) (_result *QueryDigitalLogisticCreditCreditamountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditCreditamountResponse{}
	_body, _err := client.QueryDigitalLogisticCreditCreditamountEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转可用额度查询接口
 * Summary: 信用流转可用额度查询接口
 */
func (client *Client) QueryDigitalLogisticCreditCreditamountEx(request *QueryDigitalLogisticCreditCreditamountRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditCreditamountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditCreditamountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.creditamount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转非授信通用签约接口
 * Summary: 信用流转非授信通用签约接口
 */
func (client *Client) CreateDigitalLogisticCreditCommonsign(request *CreateDigitalLogisticCreditCommonsignRequest) (_result *CreateDigitalLogisticCreditCommonsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticCreditCommonsignResponse{}
	_body, _err := client.CreateDigitalLogisticCreditCommonsignEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转非授信通用签约接口
 * Summary: 信用流转非授信通用签约接口
 */
func (client *Client) CreateDigitalLogisticCreditCommonsignEx(request *CreateDigitalLogisticCreditCommonsignRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticCreditCommonsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticCreditCommonsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.commonsign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转非授信通用签约查询接口
 * Summary: 信用流转非授信通用签约查询接口
 */
func (client *Client) QueryDigitalLogisticCreditCommonsign(request *QueryDigitalLogisticCreditCommonsignRequest) (_result *QueryDigitalLogisticCreditCommonsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticCreditCommonsignResponse{}
	_body, _err := client.QueryDigitalLogisticCreditCommonsignEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转非授信通用签约查询接口
 * Summary: 信用流转非授信通用签约查询接口
 */
func (client *Client) QueryDigitalLogisticCreditCommonsignEx(request *QueryDigitalLogisticCreditCommonsignRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticCreditCommonsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticCreditCommonsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.commonsign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转凭证合并发行接口
 * Summary: 信用流转凭证合并发行接口
 */
func (client *Client) BatchcreateDigitalLogisticCreditIssue(request *BatchcreateDigitalLogisticCreditIssueRequest) (_result *BatchcreateDigitalLogisticCreditIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &BatchcreateDigitalLogisticCreditIssueResponse{}
	_body, _err := client.BatchcreateDigitalLogisticCreditIssueEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转凭证合并发行接口
 * Summary: 信用流转凭证合并发行接口
 */
func (client *Client) BatchcreateDigitalLogisticCreditIssueEx(request *BatchcreateDigitalLogisticCreditIssueRequest, runtime *util.RuntimeOptions) (_result *BatchcreateDigitalLogisticCreditIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateDigitalLogisticCreditIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issue.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用流转凭证合并发行信息上传接口
 * Summary: 信用流转凭证合并发行信息上传接口
 */
func (client *Client) UploadDigitalLogisticCreditIssuebatch(request *UploadDigitalLogisticCreditIssuebatchRequest) (_result *UploadDigitalLogisticCreditIssuebatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticCreditIssuebatchResponse{}
	_body, _err := client.UploadDigitalLogisticCreditIssuebatchEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用流转凭证合并发行信息上传接口
 * Summary: 信用流转凭证合并发行信息上传接口
 */
func (client *Client) UploadDigitalLogisticCreditIssuebatchEx(request *UploadDigitalLogisticCreditIssuebatchRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticCreditIssuebatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticCreditIssuebatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.credit.issuebatch.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
 * Summary: 信用凭证电子回单获取(新)
 */
func (client *Client) GetDigitalLogisticIssueTransferfile(request *GetDigitalLogisticIssueTransferfileRequest) (_result *GetDigitalLogisticIssueTransferfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetDigitalLogisticIssueTransferfileResponse{}
	_body, _err := client.GetDigitalLogisticIssueTransferfileEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
 * Summary: 信用凭证电子回单获取(新)
 */
func (client *Client) GetDigitalLogisticIssueTransferfileEx(request *GetDigitalLogisticIssueTransferfileRequest, runtime *util.RuntimeOptions) (_result *GetDigitalLogisticIssueTransferfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDigitalLogisticIssueTransferfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.issue.transferfile.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
 * Summary: 投保接口-中华财险-承运人责任险
 */
func (client *Client) ApplyDigitalLogisticInsurancepolicyZhonghuacaixian(request *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest) (_result *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse{}
	_body, _err := client.ApplyDigitalLogisticInsurancepolicyZhonghuacaixianEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
 * Summary: 投保接口-中华财险-承运人责任险
 */
func (client *Client) ApplyDigitalLogisticInsurancepolicyZhonghuacaixianEx(request *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurancepolicy.zhonghuacaixian.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字物流保险，退保接口
 * Summary: 退保接口-中华财险-承运人责任险
 */
func (client *Client) CancelDigitalLogisticInsurancepolicyZhonghuacaixian(request *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest) (_result *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse{}
	_body, _err := client.CancelDigitalLogisticInsurancepolicyZhonghuacaixianEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字物流保险，退保接口
 * Summary: 退保接口-中华财险-承运人责任险
 */
func (client *Client) CancelDigitalLogisticInsurancepolicyZhonghuacaixianEx(request *CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest, runtime *util.RuntimeOptions) (_result *CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurancepolicy.zhonghuacaixian.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险理赔通知
 * Summary: 保险理赔通知
 */
func (client *Client) PushDigitalLogisticInsurancenotifyClaim(request *PushDigitalLogisticInsurancenotifyClaimRequest) (_result *PushDigitalLogisticInsurancenotifyClaimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &PushDigitalLogisticInsurancenotifyClaimResponse{}
	_body, _err := client.PushDigitalLogisticInsurancenotifyClaimEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险理赔通知
 * Summary: 保险理赔通知
 */
func (client *Client) PushDigitalLogisticInsurancenotifyClaimEx(request *PushDigitalLogisticInsurancenotifyClaimRequest, runtime *util.RuntimeOptions) (_result *PushDigitalLogisticInsurancenotifyClaimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushDigitalLogisticInsurancenotifyClaimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurancenotify.claim.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
 * Summary: 上传文件链接申请
 */
func (client *Client) ApplyDigitalLogisticInsuranceFileurl(request *ApplyDigitalLogisticInsuranceFileurlRequest) (_result *ApplyDigitalLogisticInsuranceFileurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticInsuranceFileurlResponse{}
	_body, _err := client.ApplyDigitalLogisticInsuranceFileurlEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
 * Summary: 上传文件链接申请
 */
func (client *Client) ApplyDigitalLogisticInsuranceFileurlEx(request *ApplyDigitalLogisticInsuranceFileurlRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticInsuranceFileurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticInsuranceFileurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurance.fileurl.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
 * Summary: 投保接口-承运人平台责任险
*/
func (client *Client) ApplyDigitalLogisticInsurancepolicyUniversal(request *ApplyDigitalLogisticInsurancepolicyUniversalRequest) (_result *ApplyDigitalLogisticInsurancepolicyUniversalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticInsurancepolicyUniversalResponse{}
	_body, _err := client.ApplyDigitalLogisticInsurancepolicyUniversalEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
 * Summary: 投保接口-承运人平台责任险
*/
func (client *Client) ApplyDigitalLogisticInsurancepolicyUniversalEx(request *ApplyDigitalLogisticInsurancepolicyUniversalRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticInsurancepolicyUniversalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticInsurancepolicyUniversalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurancepolicy.universal.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字物流保险，退保接口
 * Summary: 退保接口-承运人平台责任险
 */
func (client *Client) CancelDigitalLogisticInsurancepolicyUniversal(request *CancelDigitalLogisticInsurancepolicyUniversalRequest) (_result *CancelDigitalLogisticInsurancepolicyUniversalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelDigitalLogisticInsurancepolicyUniversalResponse{}
	_body, _err := client.CancelDigitalLogisticInsurancepolicyUniversalEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字物流保险，退保接口
 * Summary: 退保接口-承运人平台责任险
 */
func (client *Client) CancelDigitalLogisticInsurancepolicyUniversalEx(request *CancelDigitalLogisticInsurancepolicyUniversalRequest, runtime *util.RuntimeOptions) (_result *CancelDigitalLogisticInsurancepolicyUniversalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelDigitalLogisticInsurancepolicyUniversalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurancepolicy.universal.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 利用区块链智能合约进行离线保单存证
 * Summary: 离线保单存证推送
 */
func (client *Client) PushDigitalLogisticInsuranceOlp(request *PushDigitalLogisticInsuranceOlpRequest) (_result *PushDigitalLogisticInsuranceOlpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &PushDigitalLogisticInsuranceOlpResponse{}
	_body, _err := client.PushDigitalLogisticInsuranceOlpEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 利用区块链智能合约进行离线保单存证
 * Summary: 离线保单存证推送
 */
func (client *Client) PushDigitalLogisticInsuranceOlpEx(request *PushDigitalLogisticInsuranceOlpRequest, runtime *util.RuntimeOptions) (_result *PushDigitalLogisticInsuranceOlpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushDigitalLogisticInsuranceOlpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurance.olp.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 利用区块链智能合约进行离线保单信息更新追踪
 * Summary: 离线保单更新
 */
func (client *Client) UpdateDigitalLogisticInsuranceOlp(request *UpdateDigitalLogisticInsuranceOlpRequest) (_result *UpdateDigitalLogisticInsuranceOlpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticInsuranceOlpResponse{}
	_body, _err := client.UpdateDigitalLogisticInsuranceOlpEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 利用区块链智能合约进行离线保单信息更新追踪
 * Summary: 离线保单更新
 */
func (client *Client) UpdateDigitalLogisticInsuranceOlpEx(request *UpdateDigitalLogisticInsuranceOlpRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticInsuranceOlpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticInsuranceOlpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.insurance.olp.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 池融资委托支付入账查询
 * Summary: 委托支付入账查询
 */
func (client *Client) QueryDigitalLogisticPfPayment(request *QueryDigitalLogisticPfPaymentRequest) (_result *QueryDigitalLogisticPfPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticPfPaymentResponse{}
	_body, _err := client.QueryDigitalLogisticPfPaymentEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 池融资委托支付入账查询
 * Summary: 委托支付入账查询
 */
func (client *Client) QueryDigitalLogisticPfPaymentEx(request *QueryDigitalLogisticPfPaymentRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticPfPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticPfPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.payment.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 池融资借据信息查询
 * Summary: 借据信息查询
 */
func (client *Client) QueryDigitalLogisticPfIou(request *QueryDigitalLogisticPfIouRequest) (_result *QueryDigitalLogisticPfIouResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticPfIouResponse{}
	_body, _err := client.QueryDigitalLogisticPfIouEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 池融资借据信息查询
 * Summary: 借据信息查询
 */
func (client *Client) QueryDigitalLogisticPfIouEx(request *QueryDigitalLogisticPfIouRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticPfIouResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticPfIouResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.iou.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 池融资授信额度查询
 * Summary: 授信额度查询
 */
func (client *Client) QueryDigitalLogisticPfQuota(request *QueryDigitalLogisticPfQuotaRequest) (_result *QueryDigitalLogisticPfQuotaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticPfQuotaResponse{}
	_body, _err := client.QueryDigitalLogisticPfQuotaEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 池融资授信额度查询
 * Summary: 授信额度查询
 */
func (client *Client) QueryDigitalLogisticPfQuotaEx(request *QueryDigitalLogisticPfQuotaRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticPfQuotaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticPfQuotaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.quota.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于运单的融资申请
 * Summary: 运单融资申请
 */
func (client *Client) ApplyDigitalLogisticPfWaybillfinancing(request *ApplyDigitalLogisticPfWaybillfinancingRequest) (_result *ApplyDigitalLogisticPfWaybillfinancingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ApplyDigitalLogisticPfWaybillfinancingResponse{}
	_body, _err := client.ApplyDigitalLogisticPfWaybillfinancingEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于运单的融资申请
 * Summary: 运单融资申请
 */
func (client *Client) ApplyDigitalLogisticPfWaybillfinancingEx(request *ApplyDigitalLogisticPfWaybillfinancingRequest, runtime *util.RuntimeOptions) (_result *ApplyDigitalLogisticPfWaybillfinancingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalLogisticPfWaybillfinancingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.waybillfinancing.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 池融资账单质押，用于入池
 * Summary: 池融资账单质押
 */
func (client *Client) PushDigitalLogisticPfPledge(request *PushDigitalLogisticPfPledgeRequest) (_result *PushDigitalLogisticPfPledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &PushDigitalLogisticPfPledgeResponse{}
	_body, _err := client.PushDigitalLogisticPfPledgeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 池融资账单质押，用于入池
 * Summary: 池融资账单质押
 */
func (client *Client) PushDigitalLogisticPfPledgeEx(request *PushDigitalLogisticPfPledgeRequest, runtime *util.RuntimeOptions) (_result *PushDigitalLogisticPfPledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushDigitalLogisticPfPledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.pledge.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 入池账单质押状态查询
 * Summary: 质押状态查询
 */
func (client *Client) QueryDigitalLogisticPfPledge(request *QueryDigitalLogisticPfPledgeRequest) (_result *QueryDigitalLogisticPfPledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticPfPledgeResponse{}
	_body, _err := client.QueryDigitalLogisticPfPledgeEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 入池账单质押状态查询
 * Summary: 质押状态查询
 */
func (client *Client) QueryDigitalLogisticPfPledgeEx(request *QueryDigitalLogisticPfPledgeRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticPfPledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticPfPledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.pledge.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 池融资融资支用状态查询
 * Summary: 池融资融资支用状态查询
 */
func (client *Client) QueryDigitalLogisticPfFinancing(request *QueryDigitalLogisticPfFinancingRequest) (_result *QueryDigitalLogisticPfFinancingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticPfFinancingResponse{}
	_body, _err := client.QueryDigitalLogisticPfFinancingEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 池融资融资支用状态查询
 * Summary: 池融资融资支用状态查询
 */
func (client *Client) QueryDigitalLogisticPfFinancingEx(request *QueryDigitalLogisticPfFinancingRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticPfFinancingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticPfFinancingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.pf.financing.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建货代did
 * Summary: 创建货代did
 */
func (client *Client) CreateDigitalLogisticDidForwarder(request *CreateDigitalLogisticDidForwarderRequest) (_result *CreateDigitalLogisticDidForwarderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDidForwarderResponse{}
	_body, _err := client.CreateDigitalLogisticDidForwarderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建货代did
 * Summary: 创建货代did
 */
func (client *Client) CreateDigitalLogisticDidForwarderEx(request *CreateDigitalLogisticDidForwarderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDidForwarderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDidForwarderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.did.forwarder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建saas平台did
 * Summary: 创建saas平台did
 */
func (client *Client) CreateDigitalLogisticDidSaasplatform(request *CreateDigitalLogisticDidSaasplatformRequest) (_result *CreateDigitalLogisticDidSaasplatformResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDidSaasplatformResponse{}
	_body, _err := client.CreateDigitalLogisticDidSaasplatformEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建saas平台did
 * Summary: 创建saas平台did
 */
func (client *Client) CreateDigitalLogisticDidSaasplatformEx(request *CreateDigitalLogisticDidSaasplatformRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDidSaasplatformResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDidSaasplatformResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.did.saasplatform.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建直客did
 * Summary: 创建直客did
 */
func (client *Client) CreateDigitalLogisticDidClient(request *CreateDigitalLogisticDidClientRequest) (_result *CreateDigitalLogisticDidClientResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDidClientResponse{}
	_body, _err := client.CreateDigitalLogisticDidClientEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建直客did
 * Summary: 创建直客did
 */
func (client *Client) CreateDigitalLogisticDidClientEx(request *CreateDigitalLogisticDidClientRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDidClientResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDidClientResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.did.client.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存订单
 * Summary: 保存订单
 */
func (client *Client) SaveDigitalLogisticBizOrder(request *SaveDigitalLogisticBizOrderRequest) (_result *SaveDigitalLogisticBizOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizOrderResponse{}
	_body, _err := client.SaveDigitalLogisticBizOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存订单
 * Summary: 保存订单
 */
func (client *Client) SaveDigitalLogisticBizOrderEx(request *SaveDigitalLogisticBizOrderRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.order.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存托单文件
 * Summary: 保存托单文件
 */
func (client *Client) SaveDigitalLogisticBizConsignorder(request *SaveDigitalLogisticBizConsignorderRequest) (_result *SaveDigitalLogisticBizConsignorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizConsignorderResponse{}
	_body, _err := client.SaveDigitalLogisticBizConsignorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存托单文件
 * Summary: 保存托单文件
 */
func (client *Client) SaveDigitalLogisticBizConsignorderEx(request *SaveDigitalLogisticBizConsignorderRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizConsignorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizConsignorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.consignorder.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存货物
 * Summary: 保存货物
 */
func (client *Client) SaveDigitalLogisticBizGoods(request *SaveDigitalLogisticBizGoodsRequest) (_result *SaveDigitalLogisticBizGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizGoodsResponse{}
	_body, _err := client.SaveDigitalLogisticBizGoodsEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存货物
 * Summary: 保存货物
 */
func (client *Client) SaveDigitalLogisticBizGoodsEx(request *SaveDigitalLogisticBizGoodsRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.goods.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存SO入货通知
 * Summary: 保存SO入货通知
 */
func (client *Client) SaveDigitalLogisticBizSonotify(request *SaveDigitalLogisticBizSonotifyRequest) (_result *SaveDigitalLogisticBizSonotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizSonotifyResponse{}
	_body, _err := client.SaveDigitalLogisticBizSonotifyEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存SO入货通知
 * Summary: 保存SO入货通知
 */
func (client *Client) SaveDigitalLogisticBizSonotifyEx(request *SaveDigitalLogisticBizSonotifyRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizSonotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizSonotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.sonotify.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存订舱单
 * Summary: 保存订舱单
 */
func (client *Client) SaveDigitalLogisticBizBookingorder(request *SaveDigitalLogisticBizBookingorderRequest) (_result *SaveDigitalLogisticBizBookingorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizBookingorderResponse{}
	_body, _err := client.SaveDigitalLogisticBizBookingorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存订舱单
 * Summary: 保存订舱单
 */
func (client *Client) SaveDigitalLogisticBizBookingorderEx(request *SaveDigitalLogisticBizBookingorderRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizBookingorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizBookingorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.bookingorder.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存集装箱
 * Summary: 保存集装箱
 */
func (client *Client) SaveDigitalLogisticBizContainer(request *SaveDigitalLogisticBizContainerRequest) (_result *SaveDigitalLogisticBizContainerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizContainerResponse{}
	_body, _err := client.SaveDigitalLogisticBizContainerEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存集装箱
 * Summary: 保存集装箱
 */
func (client *Client) SaveDigitalLogisticBizContainerEx(request *SaveDigitalLogisticBizContainerRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizContainerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizContainerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.container.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存报关单
 * Summary: 保存报关单
 */
func (client *Client) SaveDigitalLogisticBizCustomsorder(request *SaveDigitalLogisticBizCustomsorderRequest) (_result *SaveDigitalLogisticBizCustomsorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizCustomsorderResponse{}
	_body, _err := client.SaveDigitalLogisticBizCustomsorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存报关单
 * Summary: 保存报关单
 */
func (client *Client) SaveDigitalLogisticBizCustomsorderEx(request *SaveDigitalLogisticBizCustomsorderRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizCustomsorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizCustomsorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.customsorder.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存拖车单
 * Summary: 保存拖车单
 */
func (client *Client) SaveDigitalLogisticBizVehicle(request *SaveDigitalLogisticBizVehicleRequest) (_result *SaveDigitalLogisticBizVehicleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizVehicleResponse{}
	_body, _err := client.SaveDigitalLogisticBizVehicleEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存拖车单
 * Summary: 保存拖车单
 */
func (client *Client) SaveDigitalLogisticBizVehicleEx(request *SaveDigitalLogisticBizVehicleRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizVehicleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizVehicleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.vehicle.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存master提单
 * Summary: 保存master提单
 */
func (client *Client) SaveDigitalLogisticBizMasterbl(request *SaveDigitalLogisticBizMasterblRequest) (_result *SaveDigitalLogisticBizMasterblResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizMasterblResponse{}
	_body, _err := client.SaveDigitalLogisticBizMasterblEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存master提单
 * Summary: 保存master提单
 */
func (client *Client) SaveDigitalLogisticBizMasterblEx(request *SaveDigitalLogisticBizMasterblRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizMasterblResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizMasterblResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.masterbl.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内审完成
 * Summary: 内审完成
 */
func (client *Client) FinishDigitalLogisticBizAudit(request *FinishDigitalLogisticBizAuditRequest) (_result *FinishDigitalLogisticBizAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &FinishDigitalLogisticBizAuditResponse{}
	_body, _err := client.FinishDigitalLogisticBizAuditEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内审完成
 * Summary: 内审完成
 */
func (client *Client) FinishDigitalLogisticBizAuditEx(request *FinishDigitalLogisticBizAuditRequest, runtime *util.RuntimeOptions) (_result *FinishDigitalLogisticBizAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishDigitalLogisticBizAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.audit.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存house提单
 * Summary: 保存house提单
 */
func (client *Client) SaveDigitalLogisticBizHousebl(request *SaveDigitalLogisticBizHouseblRequest) (_result *SaveDigitalLogisticBizHouseblResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizHouseblResponse{}
	_body, _err := client.SaveDigitalLogisticBizHouseblEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存house提单
 * Summary: 保存house提单
 */
func (client *Client) SaveDigitalLogisticBizHouseblEx(request *SaveDigitalLogisticBizHouseblRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizHouseblResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizHouseblResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.housebl.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建应付账单
 * Summary: 创建应付账单(已下)
 */
func (client *Client) CreateDigitalLogisticBillPaybillorder(request *CreateDigitalLogisticBillPaybillorderRequest) (_result *CreateDigitalLogisticBillPaybillorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticBillPaybillorderResponse{}
	_body, _err := client.CreateDigitalLogisticBillPaybillorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建应付账单
 * Summary: 创建应付账单(已下)
 */
func (client *Client) CreateDigitalLogisticBillPaybillorderEx(request *CreateDigitalLogisticBillPaybillorderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticBillPaybillorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticBillPaybillorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.paybillorder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建应收账单
 * Summary: 创建应收账单(已下)
 */
func (client *Client) CreateDigitalLogisticBillReceiptbillorder(request *CreateDigitalLogisticBillReceiptbillorderRequest) (_result *CreateDigitalLogisticBillReceiptbillorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.CreateDigitalLogisticBillReceiptbillorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建应收账单
 * Summary: 创建应收账单(已下)
 */
func (client *Client) CreateDigitalLogisticBillReceiptbillorderEx(request *CreateDigitalLogisticBillReceiptbillorderRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticBillReceiptbillorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receiptbillorder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存应付资费项
 * Summary: 保存应付资费项
 */
func (client *Client) SaveDigitalLogisticBillPaybilltariff(request *SaveDigitalLogisticBillPaybilltariffRequest) (_result *SaveDigitalLogisticBillPaybilltariffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBillPaybilltariffResponse{}
	_body, _err := client.SaveDigitalLogisticBillPaybilltariffEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存应付资费项
 * Summary: 保存应付资费项
 */
func (client *Client) SaveDigitalLogisticBillPaybilltariffEx(request *SaveDigitalLogisticBillPaybilltariffRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBillPaybilltariffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBillPaybilltariffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.paybilltariff.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存应收资费项
 * Summary: 保存应收资费项
 */
func (client *Client) SaveDigitalLogisticBillReceiptbilltariff(request *SaveDigitalLogisticBillReceiptbilltariffRequest) (_result *SaveDigitalLogisticBillReceiptbilltariffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBillReceiptbilltariffResponse{}
	_body, _err := client.SaveDigitalLogisticBillReceiptbilltariffEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存应收资费项
 * Summary: 保存应收资费项
 */
func (client *Client) SaveDigitalLogisticBillReceiptbilltariffEx(request *SaveDigitalLogisticBillReceiptbilltariffRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBillReceiptbilltariffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBillReceiptbilltariffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receiptbilltariff.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核销应付资费项
 * Summary: 核销应付资费项
 */
func (client *Client) VerifyDigitalLogisticBillPaybill(request *VerifyDigitalLogisticBillPaybillRequest) (_result *VerifyDigitalLogisticBillPaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &VerifyDigitalLogisticBillPaybillResponse{}
	_body, _err := client.VerifyDigitalLogisticBillPaybillEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核销应付资费项
 * Summary: 核销应付资费项
 */
func (client *Client) VerifyDigitalLogisticBillPaybillEx(request *VerifyDigitalLogisticBillPaybillRequest, runtime *util.RuntimeOptions) (_result *VerifyDigitalLogisticBillPaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDigitalLogisticBillPaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.paybill.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核销应收资费项
 * Summary: 核销应收资费项
 */
func (client *Client) VerifyDigitalLogisticBillReceiptbillorder(request *VerifyDigitalLogisticBillReceiptbillorderRequest) (_result *VerifyDigitalLogisticBillReceiptbillorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &VerifyDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.VerifyDigitalLogisticBillReceiptbillorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核销应收资费项
 * Summary: 核销应收资费项
 */
func (client *Client) VerifyDigitalLogisticBillReceiptbillorderEx(request *VerifyDigitalLogisticBillReceiptbillorderRequest, runtime *util.RuntimeOptions) (_result *VerifyDigitalLogisticBillReceiptbillorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receiptbillorder.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新应付账单
 * Summary: 更新应付账单
 */
func (client *Client) UpdateDigitalLogisticBillPaybillorder(request *UpdateDigitalLogisticBillPaybillorderRequest) (_result *UpdateDigitalLogisticBillPaybillorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticBillPaybillorderResponse{}
	_body, _err := client.UpdateDigitalLogisticBillPaybillorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新应付账单
 * Summary: 更新应付账单
 */
func (client *Client) UpdateDigitalLogisticBillPaybillorderEx(request *UpdateDigitalLogisticBillPaybillorderRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticBillPaybillorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticBillPaybillorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.paybillorder.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新应收账单
 * Summary: 更新应收账单
 */
func (client *Client) UpdateDigitalLogisticBillReceiptbillorder(request *UpdateDigitalLogisticBillReceiptbillorderRequest) (_result *UpdateDigitalLogisticBillReceiptbillorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.UpdateDigitalLogisticBillReceiptbillorderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新应收账单
 * Summary: 更新应收账单
 */
func (client *Client) UpdateDigitalLogisticBillReceiptbillorderEx(request *UpdateDigitalLogisticBillReceiptbillorderRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticBillReceiptbillorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticBillReceiptbillorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receiptbillorder.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存应付发票
 * Summary: 保存应付发票
 */
func (client *Client) SaveDigitalLogisticBillPayinvoice(request *SaveDigitalLogisticBillPayinvoiceRequest) (_result *SaveDigitalLogisticBillPayinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBillPayinvoiceResponse{}
	_body, _err := client.SaveDigitalLogisticBillPayinvoiceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存应付发票
 * Summary: 保存应付发票
 */
func (client *Client) SaveDigitalLogisticBillPayinvoiceEx(request *SaveDigitalLogisticBillPayinvoiceRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBillPayinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBillPayinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.payinvoice.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存应收发票
 * Summary: 保存应收发票
 */
func (client *Client) SaveDigitalLogisticBillReceiptinvoice(request *SaveDigitalLogisticBillReceiptinvoiceRequest) (_result *SaveDigitalLogisticBillReceiptinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBillReceiptinvoiceResponse{}
	_body, _err := client.SaveDigitalLogisticBillReceiptinvoiceEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存应收发票
 * Summary: 保存应收发票
 */
func (client *Client) SaveDigitalLogisticBillReceiptinvoiceEx(request *SaveDigitalLogisticBillReceiptinvoiceRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBillReceiptinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBillReceiptinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.bill.receiptinvoice.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传历史数据
 * Summary: 上传历史数据
 */
func (client *Client) UploadDigitalLogisticBizFinancing(request *UploadDigitalLogisticBizFinancingRequest) (_result *UploadDigitalLogisticBizFinancingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticBizFinancingResponse{}
	_body, _err := client.UploadDigitalLogisticBizFinancingEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传历史数据
 * Summary: 上传历史数据
 */
func (client *Client) UploadDigitalLogisticBizFinancingEx(request *UploadDigitalLogisticBizFinancingRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticBizFinancingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticBizFinancingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.financing.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传订单
 * Summary: 上传订单
 */
func (client *Client) UploadDigitalLogisticBizOrder(request *UploadDigitalLogisticBizOrderRequest) (_result *UploadDigitalLogisticBizOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticBizOrderResponse{}
	_body, _err := client.UploadDigitalLogisticBizOrderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传订单
 * Summary: 上传订单
 */
func (client *Client) UploadDigitalLogisticBizOrderEx(request *UploadDigitalLogisticBizOrderRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticBizOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticBizOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.order.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建船公司did账户
 * Summary: 创建船公司did账户
 */
func (client *Client) CreateDigitalLogisticDidCarrier(request *CreateDigitalLogisticDidCarrierRequest) (_result *CreateDigitalLogisticDidCarrierResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDigitalLogisticDidCarrierResponse{}
	_body, _err := client.CreateDigitalLogisticDidCarrierEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建船公司did账户
 * Summary: 创建船公司did账户
 */
func (client *Client) CreateDigitalLogisticDidCarrierEx(request *CreateDigitalLogisticDidCarrierRequest, runtime *util.RuntimeOptions) (_result *CreateDigitalLogisticDidCarrierResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDigitalLogisticDidCarrierResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.did.carrier.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  货代授权
 * Summary:  货代授权
 */
func (client *Client) AuthDigitalLogisticSysForwarder(request *AuthDigitalLogisticSysForwarderRequest) (_result *AuthDigitalLogisticSysForwarderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AuthDigitalLogisticSysForwarderResponse{}
	_body, _err := client.AuthDigitalLogisticSysForwarderEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  货代授权
 * Summary:  货代授权
 */
func (client *Client) AuthDigitalLogisticSysForwarderEx(request *AuthDigitalLogisticSysForwarderRequest, runtime *util.RuntimeOptions) (_result *AuthDigitalLogisticSysForwarderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthDigitalLogisticSysForwarderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.sys.forwarder.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: master提单信息查询
 * Summary: master提单信息查询
 */
func (client *Client) QueryDigitalLogisticBizMasterbl(request *QueryDigitalLogisticBizMasterblRequest) (_result *QueryDigitalLogisticBizMasterblResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDigitalLogisticBizMasterblResponse{}
	_body, _err := client.QueryDigitalLogisticBizMasterblEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: master提单信息查询
 * Summary: master提单信息查询
 */
func (client *Client) QueryDigitalLogisticBizMasterblEx(request *QueryDigitalLogisticBizMasterblRequest, runtime *util.RuntimeOptions) (_result *QueryDigitalLogisticBizMasterblResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalLogisticBizMasterblResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.masterbl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应付发票文件上传接口
 * Summary: 应付发票文件上传接口
 */
func (client *Client) SaveDigitalLogisticBizPayinvoicefile(request *SaveDigitalLogisticBizPayinvoicefileRequest) (_result *SaveDigitalLogisticBizPayinvoicefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveDigitalLogisticBizPayinvoicefileResponse{}
	_body, _err := client.SaveDigitalLogisticBizPayinvoicefileEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应付发票文件上传接口
 * Summary: 应付发票文件上传接口
 */
func (client *Client) SaveDigitalLogisticBizPayinvoicefileEx(request *SaveDigitalLogisticBizPayinvoicefileRequest, runtime *util.RuntimeOptions) (_result *SaveDigitalLogisticBizPayinvoicefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDigitalLogisticBizPayinvoicefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.biz.payinvoicefile.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传电子提单
 * Summary: 上传电子提单
 */
func (client *Client) UploadDigitalLogisticShippingEbl(request *UploadDigitalLogisticShippingEblRequest) (_result *UploadDigitalLogisticShippingEblResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticShippingEblResponse{}
	_body, _err := client.UploadDigitalLogisticShippingEblEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传电子提单
 * Summary: 上传电子提单
 */
func (client *Client) UploadDigitalLogisticShippingEblEx(request *UploadDigitalLogisticShippingEblRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticShippingEblResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticShippingEblResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.shipping.ebl.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子提单批次上传，一个I批次下传递多个提单
 * Summary: 电子提单批次上传
 */
func (client *Client) UploadDigitalLogisticShippingEblbatch(request *UploadDigitalLogisticShippingEblbatchRequest) (_result *UploadDigitalLogisticShippingEblbatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UploadDigitalLogisticShippingEblbatchResponse{}
	_body, _err := client.UploadDigitalLogisticShippingEblbatchEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子提单批次上传，一个I批次下传递多个提单
 * Summary: 电子提单批次上传
 */
func (client *Client) UploadDigitalLogisticShippingEblbatchEx(request *UploadDigitalLogisticShippingEblbatchRequest, runtime *util.RuntimeOptions) (_result *UploadDigitalLogisticShippingEblbatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDigitalLogisticShippingEblbatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.shipping.eblbatch.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 感知收货人提单状态的变更
 * Summary: 电子提单批次状态变更
 */
func (client *Client) UpdateDigitalLogisticShippingEblbatchstatus(request *UpdateDigitalLogisticShippingEblbatchstatusRequest) (_result *UpdateDigitalLogisticShippingEblbatchstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateDigitalLogisticShippingEblbatchstatusResponse{}
	_body, _err := client.UpdateDigitalLogisticShippingEblbatchstatusEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 感知收货人提单状态的变更
 * Summary: 电子提单批次状态变更
 */
func (client *Client) UpdateDigitalLogisticShippingEblbatchstatusEx(request *UpdateDigitalLogisticShippingEblbatchstatusRequest, runtime *util.RuntimeOptions) (_result *UpdateDigitalLogisticShippingEblbatchstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDigitalLogisticShippingEblbatchstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("digital.logistic.shipping.eblbatchstatus.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
