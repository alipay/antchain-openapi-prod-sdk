// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

type OpenNode struct {
	// node ID
	// example:
	//
	// N1
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// parent node ID
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty" require:"true"`
	// slot key
	// example:
	//
	// system:root
	SlotKey *string `json:"slot_key,omitempty" xml:"slot_key,omitempty" require:"true"`
	// slot value
	// example:
	//
	// 根节点
	SlotValue *string `json:"slot_value,omitempty" xml:"slot_value,omitempty" require:"true"`
	// level
	// example:
	//
	// 0
	Level *int64 `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// sort订单
	// example:
	//
	// 0
	SortOrder *int64 `json:"sort_order,omitempty" xml:"sort_order,omitempty" require:"true"`
	// gmt create
	// example:
	//
	// 2026-08-01 10:00:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// children
	// example:
	//
	// [{"node_id":"N2","parent_node_id":"N1","slot_key":"province","slot_value":"山东","level":1,"sort_order":0,"gmt_create":"2026-08-01 10:00:00","children":[]}]
	Children *string `json:"children,omitempty" xml:"children,omitempty" require:"true"`
}

func (s OpenNode) String() string {
	return tea.Prettify(s)
}

func (s OpenNode) GoString() string {
	return s.String()
}

func (s *OpenNode) SetNodeId(v string) *OpenNode {
	s.NodeId = &v
	return s
}

func (s *OpenNode) SetParentNodeId(v string) *OpenNode {
	s.ParentNodeId = &v
	return s
}

func (s *OpenNode) SetSlotKey(v string) *OpenNode {
	s.SlotKey = &v
	return s
}

func (s *OpenNode) SetSlotValue(v string) *OpenNode {
	s.SlotValue = &v
	return s
}

func (s *OpenNode) SetLevel(v int64) *OpenNode {
	s.Level = &v
	return s
}

func (s *OpenNode) SetSortOrder(v int64) *OpenNode {
	s.SortOrder = &v
	return s
}

func (s *OpenNode) SetGmtCreate(v string) *OpenNode {
	s.GmtCreate = &v
	return s
}

func (s *OpenNode) SetChildren(v string) *OpenNode {
	s.Children = &v
	return s
}

type KbUploadFileItem struct {
	// document ID
	// example:
	//
	// D1
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty" require:"true"`
	// file名称
	// example:
	//
	// a.pdf
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// original名称
	// example:
	//
	// a.pdf
	OriginalName *string `json:"original_name,omitempty" xml:"original_name,omitempty" require:"true"`
	// file类型
	// example:
	//
	// pdf
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// file md5
	// example:
	//
	// m1
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// oss url
	// example:
	//
	// https://oss.example/a.pdf
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty" require:"true"`
	// oss provider
	// example:
	//
	// antUpload
	OssProvider *string `json:"oss_provider,omitempty" xml:"oss_provider,omitempty" require:"true"`
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// source ext
	SourceExt *string `json:"source_ext,omitempty" xml:"source_ext,omitempty" require:"true"`
}

func (s KbUploadFileItem) String() string {
	return tea.Prettify(s)
}

func (s KbUploadFileItem) GoString() string {
	return s.String()
}

func (s *KbUploadFileItem) SetDocumentId(v string) *KbUploadFileItem {
	s.DocumentId = &v
	return s
}

func (s *KbUploadFileItem) SetFileName(v string) *KbUploadFileItem {
	s.FileName = &v
	return s
}

func (s *KbUploadFileItem) SetOriginalName(v string) *KbUploadFileItem {
	s.OriginalName = &v
	return s
}

func (s *KbUploadFileItem) SetFileType(v string) *KbUploadFileItem {
	s.FileType = &v
	return s
}

func (s *KbUploadFileItem) SetFileMd5(v string) *KbUploadFileItem {
	s.FileMd5 = &v
	return s
}

func (s *KbUploadFileItem) SetOssUrl(v string) *KbUploadFileItem {
	s.OssUrl = &v
	return s
}

func (s *KbUploadFileItem) SetOssProvider(v string) *KbUploadFileItem {
	s.OssProvider = &v
	return s
}

func (s *KbUploadFileItem) SetSource(v string) *KbUploadFileItem {
	s.Source = &v
	return s
}

func (s *KbUploadFileItem) SetSourceExt(v string) *KbUploadFileItem {
	s.SourceExt = &v
	return s
}

// 召回出参明细
type RecallDataDetail struct {
	// 文件名
	// example:
	//
	// 浙江省电力交易细则
	Docname *string `json:"docname,omitempty" xml:"docname,omitempty"`
	// 片段内容
	// example:
	//
	// 浙江省交易细则
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 重排得分
	// example:
	//
	// 1.2
	Rerankscore *int64 `json:"rerankscore,omitempty" xml:"rerankscore,omitempty"`
	// 重排位次
	// example:
	//
	// 1
	Rerankrank *int64 `json:"rerankrank,omitempty" xml:"rerankrank,omitempty"`
	// 综合得分
	// example:
	//
	// 1
	Score *int64 `json:"score,omitempty" xml:"score,omitempty"`
	// chunk标题
	// example:
	//
	// 浙江省交易细则
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 知识库id
	// example:
	//
	// 1
	Knowledgebaseids *string `json:"knowledgebaseids,omitempty" xml:"knowledgebaseids,omitempty"`
	// official 官方知识库、custom个人知识库
	// example:
	//
	// official
	Knowledgebasetag *string `json:"knowledgebasetag,omitempty" xml:"knowledgebasetag,omitempty"`
}

func (s RecallDataDetail) String() string {
	return tea.Prettify(s)
}

func (s RecallDataDetail) GoString() string {
	return s.String()
}

func (s *RecallDataDetail) SetDocname(v string) *RecallDataDetail {
	s.Docname = &v
	return s
}

func (s *RecallDataDetail) SetContent(v string) *RecallDataDetail {
	s.Content = &v
	return s
}

func (s *RecallDataDetail) SetRerankscore(v int64) *RecallDataDetail {
	s.Rerankscore = &v
	return s
}

func (s *RecallDataDetail) SetRerankrank(v int64) *RecallDataDetail {
	s.Rerankrank = &v
	return s
}

func (s *RecallDataDetail) SetScore(v int64) *RecallDataDetail {
	s.Score = &v
	return s
}

func (s *RecallDataDetail) SetTitle(v string) *RecallDataDetail {
	s.Title = &v
	return s
}

func (s *RecallDataDetail) SetKnowledgebaseids(v string) *RecallDataDetail {
	s.Knowledgebaseids = &v
	return s
}

func (s *RecallDataDetail) SetKnowledgebasetag(v string) *RecallDataDetail {
	s.Knowledgebasetag = &v
	return s
}

// 文档DTO
type DocumentDTO struct {
	// id
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 文件名
	// example:
	//
	// 123
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 文件大小
	// example:
	//
	// 1231
	FileSize *string `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 文件类型
	// example:
	//
	// pdf
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文件地址
	// example:
	//
	// 文件地址
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty"`
	// md5
	// example:
	//
	// 1231
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty"`
	// 状态
	// example:
	//
	// 1
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 创建时间
	// example:
	//
	// 2026-01-01 00:00:00
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 修改时间
	// example:
	//
	// 2026-01-01 00:00:00
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 文件提供方
	// example:
	//
	// oss
	OssProvider *string `json:"oss_provider,omitempty" xml:"oss_provider,omitempty"`
	// 向量库映射ID
	// example:
	//
	// 向量库映射ID
	VectorStoreMapId *string `json:"vector_store_map_id,omitempty" xml:"vector_store_map_id,omitempty"`
}

func (s DocumentDTO) String() string {
	return tea.Prettify(s)
}

func (s DocumentDTO) GoString() string {
	return s.String()
}

func (s *DocumentDTO) SetId(v string) *DocumentDTO {
	s.Id = &v
	return s
}

func (s *DocumentDTO) SetName(v string) *DocumentDTO {
	s.Name = &v
	return s
}

func (s *DocumentDTO) SetFileSize(v string) *DocumentDTO {
	s.FileSize = &v
	return s
}

func (s *DocumentDTO) SetFileType(v string) *DocumentDTO {
	s.FileType = &v
	return s
}

func (s *DocumentDTO) SetOssUrl(v string) *DocumentDTO {
	s.OssUrl = &v
	return s
}

func (s *DocumentDTO) SetMd5(v string) *DocumentDTO {
	s.Md5 = &v
	return s
}

func (s *DocumentDTO) SetStatus(v string) *DocumentDTO {
	s.Status = &v
	return s
}

func (s *DocumentDTO) SetGmtCreate(v string) *DocumentDTO {
	s.GmtCreate = &v
	return s
}

func (s *DocumentDTO) SetGmtModified(v string) *DocumentDTO {
	s.GmtModified = &v
	return s
}

func (s *DocumentDTO) SetOssProvider(v string) *DocumentDTO {
	s.OssProvider = &v
	return s
}

func (s *DocumentDTO) SetVectorStoreMapId(v string) *DocumentDTO {
	s.VectorStoreMapId = &v
	return s
}

// 文件名字
type FileItem struct {
	// 文件 id
	// example:
	//
	// 文件 id
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty" require:"true"`
	// 文件名
	// example:
	//
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件类型
	// example:
	//
	// pdf
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// OSS文件地址
	// example:
	//
	// oss地址
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty"`
	// OSS提供方
	// example:
	//
	// OSS提供方
	OssProvider *string `json:"oss_provider,omitempty" xml:"oss_provider,omitempty"`
	// 文档来源
	// example:
	//
	// 文档来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 文档来源方对文档的额外描述信息
	// example:
	//
	// 文档来源方对文档的额外描述信息
	SourceExt *string `json:"source_ext,omitempty" xml:"source_ext,omitempty"`
}

func (s FileItem) String() string {
	return tea.Prettify(s)
}

func (s FileItem) GoString() string {
	return s.String()
}

func (s *FileItem) SetDocumentId(v string) *FileItem {
	s.DocumentId = &v
	return s
}

func (s *FileItem) SetFileName(v string) *FileItem {
	s.FileName = &v
	return s
}

func (s *FileItem) SetFileType(v string) *FileItem {
	s.FileType = &v
	return s
}

func (s *FileItem) SetOssUrl(v string) *FileItem {
	s.OssUrl = &v
	return s
}

func (s *FileItem) SetOssProvider(v string) *FileItem {
	s.OssProvider = &v
	return s
}

func (s *FileItem) SetSource(v string) *FileItem {
	s.Source = &v
	return s
}

func (s *FileItem) SetSourceExt(v string) *FileItem {
	s.SourceExt = &v
	return s
}

// 知识库列表数据详情
type TreeDetailResponse struct {
	// 知识库名称
	// example:
	//
	// 知识库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 知识库id
	// example:
	//
	// tree_1231
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 知识库描述
	// example:
	//
	// 知识库描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 当前最新版本
	// example:
	//
	// V2026.08.1
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 当前激活的版本号，未激活任何版本时为 null
	// example:
	//
	// V2026.08.1
	Activeversion *string `json:"activeversion,omitempty" xml:"activeversion,omitempty"`
	// 官方知识库数据为 "official",否则 null
	// example:
	//
	// null
	Tenanttag *string `json:"tenanttag,omitempty" xml:"tenanttag,omitempty"`
}

func (s TreeDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s TreeDetailResponse) GoString() string {
	return s.String()
}

func (s *TreeDetailResponse) SetName(v string) *TreeDetailResponse {
	s.Name = &v
	return s
}

func (s *TreeDetailResponse) SetId(v string) *TreeDetailResponse {
	s.Id = &v
	return s
}

func (s *TreeDetailResponse) SetDescription(v string) *TreeDetailResponse {
	s.Description = &v
	return s
}

func (s *TreeDetailResponse) SetVersion(v string) *TreeDetailResponse {
	s.Version = &v
	return s
}

func (s *TreeDetailResponse) SetActiveversion(v string) *TreeDetailResponse {
	s.Activeversion = &v
	return s
}

func (s *TreeDetailResponse) SetTenanttag(v string) *TreeDetailResponse {
	s.Tenanttag = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	// example:
	//
	// key
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	// example:
	//
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type QueryKnowledgeRagRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户问题
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 知识库id
	KnowledgeBaseIds []*string `json:"knowledge_base_ids,omitempty" xml:"knowledge_base_ids,omitempty" type:"Repeated"`
	// 召回个数
	Topk *int64 `json:"topk,omitempty" xml:"topk,omitempty"`
	// 是否包含引用来源
	IncludeReferences *bool `json:"include_references,omitempty" xml:"include_references,omitempty"`
}

func (s QueryKnowledgeRagRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryKnowledgeRagRequest) GoString() string {
	return s.String()
}

func (s *QueryKnowledgeRagRequest) SetAuthToken(v string) *QueryKnowledgeRagRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryKnowledgeRagRequest) SetProductInstanceId(v string) *QueryKnowledgeRagRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryKnowledgeRagRequest) SetQuery(v string) *QueryKnowledgeRagRequest {
	s.Query = &v
	return s
}

func (s *QueryKnowledgeRagRequest) SetKnowledgeBaseIds(v []*string) *QueryKnowledgeRagRequest {
	s.KnowledgeBaseIds = v
	return s
}

func (s *QueryKnowledgeRagRequest) SetTopk(v int64) *QueryKnowledgeRagRequest {
	s.Topk = &v
	return s
}

func (s *QueryKnowledgeRagRequest) SetIncludeReferences(v bool) *QueryKnowledgeRagRequest {
	s.IncludeReferences = &v
	return s
}

type QueryKnowledgeRagResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryKnowledgeRagResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryKnowledgeRagResponse) GoString() string {
	return s.String()
}

func (s *QueryKnowledgeRagResponse) SetReqMsgId(v string) *QueryKnowledgeRagResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryKnowledgeRagResponse) SetResultCode(v string) *QueryKnowledgeRagResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryKnowledgeRagResponse) SetResultMsg(v string) *QueryKnowledgeRagResponse {
	s.ResultMsg = &v
	return s
}

type QueryEnergyknowledgeRagRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户问题
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 指定查询的知识库id
	KnowledgeBaseIds []*string `json:"knowledge_base_ids,omitempty" xml:"knowledge_base_ids,omitempty" type:"Repeated"`
	// 召回数量
	Topk *int64 `json:"topk,omitempty" xml:"topk,omitempty"`
	// 是否返回引用docid
	IncludeReferences *bool `json:"include_references,omitempty" xml:"include_references,omitempty"`
}

func (s QueryEnergyknowledgeRagRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnergyknowledgeRagRequest) GoString() string {
	return s.String()
}

func (s *QueryEnergyknowledgeRagRequest) SetAuthToken(v string) *QueryEnergyknowledgeRagRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnergyknowledgeRagRequest) SetProductInstanceId(v string) *QueryEnergyknowledgeRagRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnergyknowledgeRagRequest) SetQuery(v string) *QueryEnergyknowledgeRagRequest {
	s.Query = &v
	return s
}

func (s *QueryEnergyknowledgeRagRequest) SetKnowledgeBaseIds(v []*string) *QueryEnergyknowledgeRagRequest {
	s.KnowledgeBaseIds = v
	return s
}

func (s *QueryEnergyknowledgeRagRequest) SetTopk(v int64) *QueryEnergyknowledgeRagRequest {
	s.Topk = &v
	return s
}

func (s *QueryEnergyknowledgeRagRequest) SetIncludeReferences(v bool) *QueryEnergyknowledgeRagRequest {
	s.IncludeReferences = &v
	return s
}

type QueryEnergyknowledgeRagResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryEnergyknowledgeRagResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnergyknowledgeRagResponse) GoString() string {
	return s.String()
}

func (s *QueryEnergyknowledgeRagResponse) SetReqMsgId(v string) *QueryEnergyknowledgeRagResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnergyknowledgeRagResponse) SetResultCode(v string) *QueryEnergyknowledgeRagResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnergyknowledgeRagResponse) SetResultMsg(v string) *QueryEnergyknowledgeRagResponse {
	s.ResultMsg = &v
	return s
}

type QueryEnergyknowledgeRagrecallRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// rag检索问题
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 召回的知识库id
	Knowledgebaseids []*string `json:"knowledgebaseids,omitempty" xml:"knowledgebaseids,omitempty" type:"Repeated"`
	// 是否包含召回文件名，默认true
	Includereferences *bool `json:"includereferences,omitempty" xml:"includereferences,omitempty"`
	// 召回条数，默认5
	Topk *int64 `json:"topk,omitempty" xml:"topk,omitempty"`
}

func (s QueryEnergyknowledgeRagrecallRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnergyknowledgeRagrecallRequest) GoString() string {
	return s.String()
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetAuthToken(v string) *QueryEnergyknowledgeRagrecallRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetProductInstanceId(v string) *QueryEnergyknowledgeRagrecallRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetQuery(v string) *QueryEnergyknowledgeRagrecallRequest {
	s.Query = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetKnowledgebaseids(v []*string) *QueryEnergyknowledgeRagrecallRequest {
	s.Knowledgebaseids = v
	return s
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetIncludereferences(v bool) *QueryEnergyknowledgeRagrecallRequest {
	s.Includereferences = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallRequest) SetTopk(v int64) *QueryEnergyknowledgeRagrecallRequest {
	s.Topk = &v
	return s
}

type QueryEnergyknowledgeRagrecallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出参数据
	Datalist []*RecallDataDetail `json:"datalist,omitempty" xml:"datalist,omitempty" type:"Repeated"`
}

func (s QueryEnergyknowledgeRagrecallResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnergyknowledgeRagrecallResponse) GoString() string {
	return s.String()
}

func (s *QueryEnergyknowledgeRagrecallResponse) SetReqMsgId(v string) *QueryEnergyknowledgeRagrecallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallResponse) SetResultCode(v string) *QueryEnergyknowledgeRagrecallResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallResponse) SetResultMsg(v string) *QueryEnergyknowledgeRagrecallResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnergyknowledgeRagrecallResponse) SetDatalist(v []*RecallDataDetail) *QueryEnergyknowledgeRagrecallResponse {
	s.Datalist = v
	return s
}

type QueryKmKnowledgelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库名称搜索关键词
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
	// 一页数据条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 页号
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
}

func (s QueryKmKnowledgelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryKmKnowledgelistRequest) GoString() string {
	return s.String()
}

func (s *QueryKmKnowledgelistRequest) SetAuthToken(v string) *QueryKmKnowledgelistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryKmKnowledgelistRequest) SetProductInstanceId(v string) *QueryKmKnowledgelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryKmKnowledgelistRequest) SetKeyword(v string) *QueryKmKnowledgelistRequest {
	s.Keyword = &v
	return s
}

func (s *QueryKmKnowledgelistRequest) SetPageSize(v int64) *QueryKmKnowledgelistRequest {
	s.PageSize = &v
	return s
}

func (s *QueryKmKnowledgelistRequest) SetPage(v int64) *QueryKmKnowledgelistRequest {
	s.Page = &v
	return s
}

type QueryKmKnowledgelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库datalist
	Datalist *TreeDetailResponse `json:"datalist,omitempty" xml:"datalist,omitempty"`
	// 总数据量
	Totalrecords *int64 `json:"totalrecords,omitempty" xml:"totalrecords,omitempty"`
	// 知识库树列表JSON数组(元素字段见语雀文档)
	Trees *string `json:"trees,omitempty" xml:"trees,omitempty"`
}

func (s QueryKmKnowledgelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryKmKnowledgelistResponse) GoString() string {
	return s.String()
}

func (s *QueryKmKnowledgelistResponse) SetReqMsgId(v string) *QueryKmKnowledgelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryKmKnowledgelistResponse) SetResultCode(v string) *QueryKmKnowledgelistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryKmKnowledgelistResponse) SetResultMsg(v string) *QueryKmKnowledgelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryKmKnowledgelistResponse) SetDatalist(v *TreeDetailResponse) *QueryKmKnowledgelistResponse {
	s.Datalist = v
	return s
}

func (s *QueryKmKnowledgelistResponse) SetTotalrecords(v int64) *QueryKmKnowledgelistResponse {
	s.Totalrecords = &v
	return s
}

func (s *QueryKmKnowledgelistResponse) SetTrees(v string) *QueryKmKnowledgelistResponse {
	s.Trees = &v
	return s
}

type DeleteKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
}

func (s DeleteKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteKmNodeRequest) GoString() string {
	return s.String()
}

func (s *DeleteKmNodeRequest) SetAuthToken(v string) *DeleteKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteKmNodeRequest) SetProductInstanceId(v string) *DeleteKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteKmNodeRequest) SetTreeId(v string) *DeleteKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *DeleteKmNodeRequest) SetNodeId(v string) *DeleteKmNodeRequest {
	s.NodeId = &v
	return s
}

type DeleteKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteKmNodeResponse) GoString() string {
	return s.String()
}

func (s *DeleteKmNodeResponse) SetReqMsgId(v string) *DeleteKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteKmNodeResponse) SetResultCode(v string) *DeleteKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteKmNodeResponse) SetResultMsg(v string) *DeleteKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteKmNodeResponse) SetSuccess(v bool) *DeleteKmNodeResponse {
	s.Success = &v
	return s
}

type DetailKmTreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
}

func (s DetailKmTreeRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailKmTreeRequest) GoString() string {
	return s.String()
}

func (s *DetailKmTreeRequest) SetAuthToken(v string) *DetailKmTreeRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailKmTreeRequest) SetProductInstanceId(v string) *DetailKmTreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailKmTreeRequest) SetTreeId(v string) *DetailKmTreeRequest {
	s.TreeId = &v
	return s
}

type DetailKmTreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 知识库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 知识库描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 知识库图标
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty"`
	// 最新版本号(无版本为空)
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 当前激活版本号(未激活为空)
	ActiveVersion *string `json:"active_version,omitempty" xml:"active_version,omitempty"`
	// 节点总数
	NodeCount *int64 `json:"node_count,omitempty" xml:"node_count,omitempty"`
	// 文档总数
	DocumentCount *int64 `json:"document_count,omitempty" xml:"document_count,omitempty"`
	// 是否开启图谱编译
	GraphEnabled *bool `json:"graph_enabled,omitempty" xml:"graph_enabled,omitempty"`
	// 处理中(未终态)编译任务数(仅图谱开启返回)
	CompileTaskCount *int64 `json:"compile_task_count,omitempty" xml:"compile_task_count,omitempty"`
	// 根节点树JSON文本(OpenNode字段定义见文档)
	RootNodeJson *string `json:"root_node_json,omitempty" xml:"root_node_json,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 租户标签(官方租户数据为official)
	TenantTag *string `json:"tenant_tag,omitempty" xml:"tenant_tag,omitempty"`
}

func (s DetailKmTreeResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailKmTreeResponse) GoString() string {
	return s.String()
}

func (s *DetailKmTreeResponse) SetReqMsgId(v string) *DetailKmTreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailKmTreeResponse) SetResultCode(v string) *DetailKmTreeResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailKmTreeResponse) SetResultMsg(v string) *DetailKmTreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailKmTreeResponse) SetTreeId(v string) *DetailKmTreeResponse {
	s.TreeId = &v
	return s
}

func (s *DetailKmTreeResponse) SetName(v string) *DetailKmTreeResponse {
	s.Name = &v
	return s
}

func (s *DetailKmTreeResponse) SetDescription(v string) *DetailKmTreeResponse {
	s.Description = &v
	return s
}

func (s *DetailKmTreeResponse) SetIcon(v string) *DetailKmTreeResponse {
	s.Icon = &v
	return s
}

func (s *DetailKmTreeResponse) SetVersion(v string) *DetailKmTreeResponse {
	s.Version = &v
	return s
}

func (s *DetailKmTreeResponse) SetActiveVersion(v string) *DetailKmTreeResponse {
	s.ActiveVersion = &v
	return s
}

func (s *DetailKmTreeResponse) SetNodeCount(v int64) *DetailKmTreeResponse {
	s.NodeCount = &v
	return s
}

func (s *DetailKmTreeResponse) SetDocumentCount(v int64) *DetailKmTreeResponse {
	s.DocumentCount = &v
	return s
}

func (s *DetailKmTreeResponse) SetGraphEnabled(v bool) *DetailKmTreeResponse {
	s.GraphEnabled = &v
	return s
}

func (s *DetailKmTreeResponse) SetCompileTaskCount(v int64) *DetailKmTreeResponse {
	s.CompileTaskCount = &v
	return s
}

func (s *DetailKmTreeResponse) SetRootNodeJson(v string) *DetailKmTreeResponse {
	s.RootNodeJson = &v
	return s
}

func (s *DetailKmTreeResponse) SetGmtCreate(v string) *DetailKmTreeResponse {
	s.GmtCreate = &v
	return s
}

func (s *DetailKmTreeResponse) SetGmtModified(v string) *DetailKmTreeResponse {
	s.GmtModified = &v
	return s
}

func (s *DetailKmTreeResponse) SetTenantTag(v string) *DetailKmTreeResponse {
	s.TenantTag = &v
	return s
}

type BatchimportKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 挂载目标节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 任务扩展号
	TaskExt *string `json:"task_ext,omitempty" xml:"task_ext,omitempty"`
	// 待入库文件列表(files.1.file_name点号形式)
	Files []*KbUploadFileItem `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s BatchimportKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchimportKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *BatchimportKmDocumentRequest) SetAuthToken(v string) *BatchimportKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchimportKmDocumentRequest) SetProductInstanceId(v string) *BatchimportKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchimportKmDocumentRequest) SetTreeId(v string) *BatchimportKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *BatchimportKmDocumentRequest) SetNodeId(v string) *BatchimportKmDocumentRequest {
	s.NodeId = &v
	return s
}

func (s *BatchimportKmDocumentRequest) SetTaskExt(v string) *BatchimportKmDocumentRequest {
	s.TaskExt = &v
	return s
}

func (s *BatchimportKmDocumentRequest) SetFiles(v []*KbUploadFileItem) *BatchimportKmDocumentRequest {
	s.Files = v
	return s
}

type BatchimportKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功数量
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数量
	FailedCount *int64 `json:"failed_count,omitempty" xml:"failed_count,omitempty"`
	// 跳过数量(MD5重复)
	SkipCount *int64 `json:"skip_count,omitempty" xml:"skip_count,omitempty"`
	// 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
	Documents *string `json:"documents,omitempty" xml:"documents,omitempty"`
}

func (s BatchimportKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchimportKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *BatchimportKmDocumentResponse) SetReqMsgId(v string) *BatchimportKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetResultCode(v string) *BatchimportKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetResultMsg(v string) *BatchimportKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetSuccessCount(v int64) *BatchimportKmDocumentResponse {
	s.SuccessCount = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetFailedCount(v int64) *BatchimportKmDocumentResponse {
	s.FailedCount = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetSkipCount(v int64) *BatchimportKmDocumentResponse {
	s.SkipCount = &v
	return s
}

func (s *BatchimportKmDocumentResponse) SetDocuments(v string) *BatchimportKmDocumentResponse {
	s.Documents = &v
	return s
}

type CreateKmTreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 知识库描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 知识库图标
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty"`
	// 图谱本体Schema JSON
	SchemaJson *string `json:"schema_json,omitempty" xml:"schema_json,omitempty"`
	// 是否开启图谱编译
	GraphEnabled *bool `json:"graph_enabled,omitempty" xml:"graph_enabled,omitempty"`
}

func (s CreateKmTreeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateKmTreeRequest) GoString() string {
	return s.String()
}

func (s *CreateKmTreeRequest) SetAuthToken(v string) *CreateKmTreeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateKmTreeRequest) SetProductInstanceId(v string) *CreateKmTreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateKmTreeRequest) SetName(v string) *CreateKmTreeRequest {
	s.Name = &v
	return s
}

func (s *CreateKmTreeRequest) SetDescription(v string) *CreateKmTreeRequest {
	s.Description = &v
	return s
}

func (s *CreateKmTreeRequest) SetIcon(v string) *CreateKmTreeRequest {
	s.Icon = &v
	return s
}

func (s *CreateKmTreeRequest) SetSchemaJson(v string) *CreateKmTreeRequest {
	s.SchemaJson = &v
	return s
}

func (s *CreateKmTreeRequest) SetGraphEnabled(v bool) *CreateKmTreeRequest {
	s.GraphEnabled = &v
	return s
}

type CreateKmTreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 根节点ID
	RootNodeId *string `json:"root_node_id,omitempty" xml:"root_node_id,omitempty"`
}

func (s CreateKmTreeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateKmTreeResponse) GoString() string {
	return s.String()
}

func (s *CreateKmTreeResponse) SetReqMsgId(v string) *CreateKmTreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateKmTreeResponse) SetResultCode(v string) *CreateKmTreeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateKmTreeResponse) SetResultMsg(v string) *CreateKmTreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateKmTreeResponse) SetTreeId(v string) *CreateKmTreeResponse {
	s.TreeId = &v
	return s
}

func (s *CreateKmTreeResponse) SetRootNodeId(v string) *CreateKmTreeResponse {
	s.RootNodeId = &v
	return s
}

type UpdateKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点键名
	SlotKey *string `json:"slot_key,omitempty" xml:"slot_key,omitempty"`
	// 节点值
	SlotValue *string `json:"slot_value,omitempty" xml:"slot_value,omitempty"`
}

func (s UpdateKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateKmNodeRequest) GoString() string {
	return s.String()
}

func (s *UpdateKmNodeRequest) SetAuthToken(v string) *UpdateKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateKmNodeRequest) SetProductInstanceId(v string) *UpdateKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateKmNodeRequest) SetTreeId(v string) *UpdateKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *UpdateKmNodeRequest) SetNodeId(v string) *UpdateKmNodeRequest {
	s.NodeId = &v
	return s
}

func (s *UpdateKmNodeRequest) SetSlotKey(v string) *UpdateKmNodeRequest {
	s.SlotKey = &v
	return s
}

func (s *UpdateKmNodeRequest) SetSlotValue(v string) *UpdateKmNodeRequest {
	s.SlotValue = &v
	return s
}

type UpdateKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateKmNodeResponse) GoString() string {
	return s.String()
}

func (s *UpdateKmNodeResponse) SetReqMsgId(v string) *UpdateKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateKmNodeResponse) SetResultCode(v string) *UpdateKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateKmNodeResponse) SetResultMsg(v string) *UpdateKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateKmNodeResponse) SetSuccess(v bool) *UpdateKmNodeResponse {
	s.Success = &v
	return s
}

type UpdateKmTreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 知识库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 知识库描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 知识库图标
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty"`
	// 图谱本体Schema JSON
	SchemaJson *string `json:"schema_json,omitempty" xml:"schema_json,omitempty"`
	// 是否开启图谱编译
	GraphEnabled *bool `json:"graph_enabled,omitempty" xml:"graph_enabled,omitempty"`
}

func (s UpdateKmTreeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateKmTreeRequest) GoString() string {
	return s.String()
}

func (s *UpdateKmTreeRequest) SetAuthToken(v string) *UpdateKmTreeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateKmTreeRequest) SetProductInstanceId(v string) *UpdateKmTreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateKmTreeRequest) SetTreeId(v string) *UpdateKmTreeRequest {
	s.TreeId = &v
	return s
}

func (s *UpdateKmTreeRequest) SetName(v string) *UpdateKmTreeRequest {
	s.Name = &v
	return s
}

func (s *UpdateKmTreeRequest) SetDescription(v string) *UpdateKmTreeRequest {
	s.Description = &v
	return s
}

func (s *UpdateKmTreeRequest) SetIcon(v string) *UpdateKmTreeRequest {
	s.Icon = &v
	return s
}

func (s *UpdateKmTreeRequest) SetSchemaJson(v string) *UpdateKmTreeRequest {
	s.SchemaJson = &v
	return s
}

func (s *UpdateKmTreeRequest) SetGraphEnabled(v bool) *UpdateKmTreeRequest {
	s.GraphEnabled = &v
	return s
}

type UpdateKmTreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateKmTreeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateKmTreeResponse) GoString() string {
	return s.String()
}

func (s *UpdateKmTreeResponse) SetReqMsgId(v string) *UpdateKmTreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateKmTreeResponse) SetResultCode(v string) *UpdateKmTreeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateKmTreeResponse) SetResultMsg(v string) *UpdateKmTreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateKmTreeResponse) SetSuccess(v bool) *UpdateKmTreeResponse {
	s.Success = &v
	return s
}

type SchemaKmTreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
}

func (s SchemaKmTreeRequest) String() string {
	return tea.Prettify(s)
}

func (s SchemaKmTreeRequest) GoString() string {
	return s.String()
}

func (s *SchemaKmTreeRequest) SetAuthToken(v string) *SchemaKmTreeRequest {
	s.AuthToken = &v
	return s
}

func (s *SchemaKmTreeRequest) SetProductInstanceId(v string) *SchemaKmTreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SchemaKmTreeRequest) SetTreeId(v string) *SchemaKmTreeRequest {
	s.TreeId = &v
	return s
}

type SchemaKmTreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty"`
	// 图谱本体Schema JSON文本
	SchemaJson *string `json:"schema_json,omitempty" xml:"schema_json,omitempty"`
}

func (s SchemaKmTreeResponse) String() string {
	return tea.Prettify(s)
}

func (s SchemaKmTreeResponse) GoString() string {
	return s.String()
}

func (s *SchemaKmTreeResponse) SetReqMsgId(v string) *SchemaKmTreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SchemaKmTreeResponse) SetResultCode(v string) *SchemaKmTreeResponse {
	s.ResultCode = &v
	return s
}

func (s *SchemaKmTreeResponse) SetResultMsg(v string) *SchemaKmTreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SchemaKmTreeResponse) SetKbId(v string) *SchemaKmTreeResponse {
	s.KbId = &v
	return s
}

func (s *SchemaKmTreeResponse) SetSchemaJson(v string) *SchemaKmTreeResponse {
	s.SchemaJson = &v
	return s
}

type CreateKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 父节点ID
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty" require:"true"`
	// 节点键名(最长50)
	SlotKey *string `json:"slot_key,omitempty" xml:"slot_key,omitempty" require:"true"`
	// 节点值(最长100)
	SlotValue *string `json:"slot_value,omitempty" xml:"slot_value,omitempty" require:"true"`
}

func (s CreateKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateKmNodeRequest) GoString() string {
	return s.String()
}

func (s *CreateKmNodeRequest) SetAuthToken(v string) *CreateKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateKmNodeRequest) SetProductInstanceId(v string) *CreateKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateKmNodeRequest) SetTreeId(v string) *CreateKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *CreateKmNodeRequest) SetParentNodeId(v string) *CreateKmNodeRequest {
	s.ParentNodeId = &v
	return s
}

func (s *CreateKmNodeRequest) SetSlotKey(v string) *CreateKmNodeRequest {
	s.SlotKey = &v
	return s
}

func (s *CreateKmNodeRequest) SetSlotValue(v string) *CreateKmNodeRequest {
	s.SlotValue = &v
	return s
}

type CreateKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 新节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
}

func (s CreateKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateKmNodeResponse) GoString() string {
	return s.String()
}

func (s *CreateKmNodeResponse) SetReqMsgId(v string) *CreateKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateKmNodeResponse) SetResultCode(v string) *CreateKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateKmNodeResponse) SetResultMsg(v string) *CreateKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateKmNodeResponse) SetNodeId(v string) *CreateKmNodeResponse {
	s.NodeId = &v
	return s
}

type ListKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
}

func (s ListKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s ListKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *ListKmDocumentRequest) SetAuthToken(v string) *ListKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *ListKmDocumentRequest) SetProductInstanceId(v string) *ListKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListKmDocumentRequest) SetTreeId(v string) *ListKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *ListKmDocumentRequest) SetNodeId(v string) *ListKmDocumentRequest {
	s.NodeId = &v
	return s
}

type ListKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 节点文档JSON数组(KbDocumentDTO字段定义见文档)
	Documents *string `json:"documents,omitempty" xml:"documents,omitempty"`
}

func (s ListKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s ListKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *ListKmDocumentResponse) SetReqMsgId(v string) *ListKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListKmDocumentResponse) SetResultCode(v string) *ListKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *ListKmDocumentResponse) SetResultMsg(v string) *ListKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListKmDocumentResponse) SetDocuments(v string) *ListKmDocumentResponse {
	s.Documents = &v
	return s
}

type UnmountKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 向量库映射ID
	VectorStoreMapId *string `json:"vector_store_map_id,omitempty" xml:"vector_store_map_id,omitempty" require:"true"`
}

func (s UnmountKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *UnmountKmDocumentRequest) SetAuthToken(v string) *UnmountKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountKmDocumentRequest) SetProductInstanceId(v string) *UnmountKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountKmDocumentRequest) SetTreeId(v string) *UnmountKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *UnmountKmDocumentRequest) SetNodeId(v string) *UnmountKmDocumentRequest {
	s.NodeId = &v
	return s
}

func (s *UnmountKmDocumentRequest) SetVectorStoreMapId(v string) *UnmountKmDocumentRequest {
	s.VectorStoreMapId = &v
	return s
}

type UnmountKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UnmountKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *UnmountKmDocumentResponse) SetReqMsgId(v string) *UnmountKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountKmDocumentResponse) SetResultCode(v string) *UnmountKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountKmDocumentResponse) SetResultMsg(v string) *UnmountKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountKmDocumentResponse) SetSuccess(v bool) *UnmountKmDocumentResponse {
	s.Success = &v
	return s
}

type PreviewKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 文档挂载映射ID
	DocMapId *string `json:"doc_map_id,omitempty" xml:"doc_map_id,omitempty" require:"true"`
}

func (s PreviewKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *PreviewKmDocumentRequest) SetAuthToken(v string) *PreviewKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewKmDocumentRequest) SetProductInstanceId(v string) *PreviewKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewKmDocumentRequest) SetTreeId(v string) *PreviewKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *PreviewKmDocumentRequest) SetNodeId(v string) *PreviewKmDocumentRequest {
	s.NodeId = &v
	return s
}

func (s *PreviewKmDocumentRequest) SetDocMapId(v string) *PreviewKmDocumentRequest {
	s.DocMapId = &v
	return s
}

type PreviewKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档ID
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty"`
	// 文档名
	DocumentName *string `json:"document_name,omitempty" xml:"document_name,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文档Markdown正文
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// OSS预览地址
	OssPreviewUrl *string `json:"oss_preview_url,omitempty" xml:"oss_preview_url,omitempty"`
}

func (s PreviewKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *PreviewKmDocumentResponse) SetReqMsgId(v string) *PreviewKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetResultCode(v string) *PreviewKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetResultMsg(v string) *PreviewKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetDocumentId(v string) *PreviewKmDocumentResponse {
	s.DocumentId = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetDocumentName(v string) *PreviewKmDocumentResponse {
	s.DocumentName = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetFileType(v string) *PreviewKmDocumentResponse {
	s.FileType = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetContent(v string) *PreviewKmDocumentResponse {
	s.Content = &v
	return s
}

func (s *PreviewKmDocumentResponse) SetOssPreviewUrl(v string) *PreviewKmDocumentResponse {
	s.OssPreviewUrl = &v
	return s
}

type SegmentsKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 文档挂载映射ID
	DocMapId *string `json:"doc_map_id,omitempty" xml:"doc_map_id,omitempty" require:"true"`
	// 切片内容关键词
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
}

func (s SegmentsKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s SegmentsKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *SegmentsKmDocumentRequest) SetAuthToken(v string) *SegmentsKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *SegmentsKmDocumentRequest) SetProductInstanceId(v string) *SegmentsKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SegmentsKmDocumentRequest) SetTreeId(v string) *SegmentsKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *SegmentsKmDocumentRequest) SetNodeId(v string) *SegmentsKmDocumentRequest {
	s.NodeId = &v
	return s
}

func (s *SegmentsKmDocumentRequest) SetDocMapId(v string) *SegmentsKmDocumentRequest {
	s.DocMapId = &v
	return s
}

func (s *SegmentsKmDocumentRequest) SetKeyword(v string) *SegmentsKmDocumentRequest {
	s.Keyword = &v
	return s
}

type SegmentsKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 切片总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 切片JSON数组(KbSegmentItem字段定义见文档)
	Segments *string `json:"segments,omitempty" xml:"segments,omitempty"`
}

func (s SegmentsKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s SegmentsKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *SegmentsKmDocumentResponse) SetReqMsgId(v string) *SegmentsKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SegmentsKmDocumentResponse) SetResultCode(v string) *SegmentsKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *SegmentsKmDocumentResponse) SetResultMsg(v string) *SegmentsKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SegmentsKmDocumentResponse) SetTotalCount(v int64) *SegmentsKmDocumentResponse {
	s.TotalCount = &v
	return s
}

func (s *SegmentsKmDocumentResponse) SetSegments(v string) *SegmentsKmDocumentResponse {
	s.Segments = &v
	return s
}

type SearchKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 搜索关键词
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
}

func (s SearchKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s SearchKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *SearchKmDocumentRequest) SetAuthToken(v string) *SearchKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *SearchKmDocumentRequest) SetProductInstanceId(v string) *SearchKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SearchKmDocumentRequest) SetTreeId(v string) *SearchKmDocumentRequest {
	s.TreeId = &v
	return s
}

func (s *SearchKmDocumentRequest) SetKeyword(v string) *SearchKmDocumentRequest {
	s.Keyword = &v
	return s
}

type SearchKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 搜索结果JSON数组(KbSearchItem字段定义见文档)
	Items *string `json:"items,omitempty" xml:"items,omitempty"`
}

func (s SearchKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s SearchKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *SearchKmDocumentResponse) SetReqMsgId(v string) *SearchKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SearchKmDocumentResponse) SetResultCode(v string) *SearchKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *SearchKmDocumentResponse) SetResultMsg(v string) *SearchKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SearchKmDocumentResponse) SetItems(v string) *SearchKmDocumentResponse {
	s.Items = &v
	return s
}

type CreateKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 版本描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s CreateKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateKmVersionRequest) GoString() string {
	return s.String()
}

func (s *CreateKmVersionRequest) SetAuthToken(v string) *CreateKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateKmVersionRequest) SetProductInstanceId(v string) *CreateKmVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateKmVersionRequest) SetTreeId(v string) *CreateKmVersionRequest {
	s.TreeId = &v
	return s
}

func (s *CreateKmVersionRequest) SetDescription(v string) *CreateKmVersionRequest {
	s.Description = &v
	return s
}

type CreateKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本ID
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 版本状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 发布任务总数
	TotalTaskCount *int64 `json:"total_task_count,omitempty" xml:"total_task_count,omitempty"`
	// 已完成任务数
	CompletedCount *int64 `json:"completed_count,omitempty" xml:"completed_count,omitempty"`
}

func (s CreateKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateKmVersionResponse) GoString() string {
	return s.String()
}

func (s *CreateKmVersionResponse) SetReqMsgId(v string) *CreateKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateKmVersionResponse) SetResultCode(v string) *CreateKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateKmVersionResponse) SetResultMsg(v string) *CreateKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateKmVersionResponse) SetVersionId(v string) *CreateKmVersionResponse {
	s.VersionId = &v
	return s
}

func (s *CreateKmVersionResponse) SetTreeId(v string) *CreateKmVersionResponse {
	s.TreeId = &v
	return s
}

func (s *CreateKmVersionResponse) SetVersion(v string) *CreateKmVersionResponse {
	s.Version = &v
	return s
}

func (s *CreateKmVersionResponse) SetStatus(v string) *CreateKmVersionResponse {
	s.Status = &v
	return s
}

func (s *CreateKmVersionResponse) SetTotalTaskCount(v int64) *CreateKmVersionResponse {
	s.TotalTaskCount = &v
	return s
}

func (s *CreateKmVersionResponse) SetCompletedCount(v int64) *CreateKmVersionResponse {
	s.CompletedCount = &v
	return s
}

type ListKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 页码(1起)
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 每页条数(上限100)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s ListKmVersionRequest) GoString() string {
	return s.String()
}

func (s *ListKmVersionRequest) SetAuthToken(v string) *ListKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *ListKmVersionRequest) SetProductInstanceId(v string) *ListKmVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListKmVersionRequest) SetTreeId(v string) *ListKmVersionRequest {
	s.TreeId = &v
	return s
}

func (s *ListKmVersionRequest) SetPage(v int64) *ListKmVersionRequest {
	s.Page = &v
	return s
}

func (s *ListKmVersionRequest) SetPageSize(v int64) *ListKmVersionRequest {
	s.PageSize = &v
	return s
}

type ListKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本总数
	TotalRecords *int64 `json:"total_records,omitempty" xml:"total_records,omitempty"`
	// 版本JSON数组(KbVersionItem字段定义见文档)
	Versions *string `json:"versions,omitempty" xml:"versions,omitempty"`
}

func (s ListKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s ListKmVersionResponse) GoString() string {
	return s.String()
}

func (s *ListKmVersionResponse) SetReqMsgId(v string) *ListKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListKmVersionResponse) SetResultCode(v string) *ListKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *ListKmVersionResponse) SetResultMsg(v string) *ListKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListKmVersionResponse) SetTotalRecords(v int64) *ListKmVersionResponse {
	s.TotalRecords = &v
	return s
}

func (s *ListKmVersionResponse) SetVersions(v string) *ListKmVersionResponse {
	s.Versions = &v
	return s
}

type DetailKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 版本ID
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty" require:"true"`
}

func (s DetailKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailKmVersionRequest) GoString() string {
	return s.String()
}

func (s *DetailKmVersionRequest) SetAuthToken(v string) *DetailKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailKmVersionRequest) SetProductInstanceId(v string) *DetailKmVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailKmVersionRequest) SetVersionId(v string) *DetailKmVersionRequest {
	s.VersionId = &v
	return s
}

type DetailKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本ID
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 版本描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 版本快照JSON文本(树结构全文)
	Snapshot *string `json:"snapshot,omitempty" xml:"snapshot,omitempty"`
	// 文档数
	DocCount *int64 `json:"doc_count,omitempty" xml:"doc_count,omitempty"`
	// 节点数
	NodeCount *int64 `json:"node_count,omitempty" xml:"node_count,omitempty"`
}

func (s DetailKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailKmVersionResponse) GoString() string {
	return s.String()
}

func (s *DetailKmVersionResponse) SetReqMsgId(v string) *DetailKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailKmVersionResponse) SetResultCode(v string) *DetailKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailKmVersionResponse) SetResultMsg(v string) *DetailKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailKmVersionResponse) SetVersionId(v string) *DetailKmVersionResponse {
	s.VersionId = &v
	return s
}

func (s *DetailKmVersionResponse) SetTreeId(v string) *DetailKmVersionResponse {
	s.TreeId = &v
	return s
}

func (s *DetailKmVersionResponse) SetVersion(v string) *DetailKmVersionResponse {
	s.Version = &v
	return s
}

func (s *DetailKmVersionResponse) SetDescription(v string) *DetailKmVersionResponse {
	s.Description = &v
	return s
}

func (s *DetailKmVersionResponse) SetSnapshot(v string) *DetailKmVersionResponse {
	s.Snapshot = &v
	return s
}

func (s *DetailKmVersionResponse) SetDocCount(v int64) *DetailKmVersionResponse {
	s.DocCount = &v
	return s
}

func (s *DetailKmVersionResponse) SetNodeCount(v int64) *DetailKmVersionResponse {
	s.NodeCount = &v
	return s
}

type NextKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
}

func (s NextKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s NextKmVersionRequest) GoString() string {
	return s.String()
}

func (s *NextKmVersionRequest) SetAuthToken(v string) *NextKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *NextKmVersionRequest) SetProductInstanceId(v string) *NextKmVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NextKmVersionRequest) SetTreeId(v string) *NextKmVersionRequest {
	s.TreeId = &v
	return s
}

type NextKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 下一个版本号
	NextVersion *string `json:"next_version,omitempty" xml:"next_version,omitempty"`
	// 节点数
	NodeCount *int64 `json:"node_count,omitempty" xml:"node_count,omitempty"`
	// 文档数
	DocumentCount *int64 `json:"document_count,omitempty" xml:"document_count,omitempty"`
}

func (s NextKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s NextKmVersionResponse) GoString() string {
	return s.String()
}

func (s *NextKmVersionResponse) SetReqMsgId(v string) *NextKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NextKmVersionResponse) SetResultCode(v string) *NextKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *NextKmVersionResponse) SetResultMsg(v string) *NextKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *NextKmVersionResponse) SetTreeId(v string) *NextKmVersionResponse {
	s.TreeId = &v
	return s
}

func (s *NextKmVersionResponse) SetNextVersion(v string) *NextKmVersionResponse {
	s.NextVersion = &v
	return s
}

func (s *NextKmVersionResponse) SetNodeCount(v int64) *NextKmVersionResponse {
	s.NodeCount = &v
	return s
}

func (s *NextKmVersionResponse) SetDocumentCount(v int64) *NextKmVersionResponse {
	s.DocumentCount = &v
	return s
}

type ActivateKmVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 目标版本ID
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty" require:"true"`
}

func (s ActivateKmVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s ActivateKmVersionRequest) GoString() string {
	return s.String()
}

func (s *ActivateKmVersionRequest) SetAuthToken(v string) *ActivateKmVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *ActivateKmVersionRequest) SetProductInstanceId(v string) *ActivateKmVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ActivateKmVersionRequest) SetTreeId(v string) *ActivateKmVersionRequest {
	s.TreeId = &v
	return s
}

func (s *ActivateKmVersionRequest) SetVersionId(v string) *ActivateKmVersionRequest {
	s.VersionId = &v
	return s
}

type ActivateKmVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 当前激活版本ID
	ActiveVersionId *string `json:"active_version_id,omitempty" xml:"active_version_id,omitempty"`
	// 激活时间
	ActiveTime *string `json:"active_time,omitempty" xml:"active_time,omitempty"`
}

func (s ActivateKmVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s ActivateKmVersionResponse) GoString() string {
	return s.String()
}

func (s *ActivateKmVersionResponse) SetReqMsgId(v string) *ActivateKmVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ActivateKmVersionResponse) SetResultCode(v string) *ActivateKmVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *ActivateKmVersionResponse) SetResultMsg(v string) *ActivateKmVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ActivateKmVersionResponse) SetSuccess(v bool) *ActivateKmVersionResponse {
	s.Success = &v
	return s
}

func (s *ActivateKmVersionResponse) SetActiveVersionId(v string) *ActivateKmVersionResponse {
	s.ActiveVersionId = &v
	return s
}

func (s *ActivateKmVersionResponse) SetActiveTime(v string) *ActivateKmVersionResponse {
	s.ActiveTime = &v
	return s
}

type NodeKgGraphRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
	// 节点ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
}

func (s NodeKgGraphRequest) String() string {
	return tea.Prettify(s)
}

func (s NodeKgGraphRequest) GoString() string {
	return s.String()
}

func (s *NodeKgGraphRequest) SetAuthToken(v string) *NodeKgGraphRequest {
	s.AuthToken = &v
	return s
}

func (s *NodeKgGraphRequest) SetProductInstanceId(v string) *NodeKgGraphRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NodeKgGraphRequest) SetKbId(v string) *NodeKgGraphRequest {
	s.KbId = &v
	return s
}

func (s *NodeKgGraphRequest) SetNodeId(v string) *NodeKgGraphRequest {
	s.NodeId = &v
	return s
}

type NodeKgGraphResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 节点详情JSON(KbGraphNode字段定义含邻域与属性)
	Node *string `json:"node,omitempty" xml:"node,omitempty"`
}

func (s NodeKgGraphResponse) String() string {
	return tea.Prettify(s)
}

func (s NodeKgGraphResponse) GoString() string {
	return s.String()
}

func (s *NodeKgGraphResponse) SetReqMsgId(v string) *NodeKgGraphResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NodeKgGraphResponse) SetResultCode(v string) *NodeKgGraphResponse {
	s.ResultCode = &v
	return s
}

func (s *NodeKgGraphResponse) SetResultMsg(v string) *NodeKgGraphResponse {
	s.ResultMsg = &v
	return s
}

func (s *NodeKgGraphResponse) SetNode(v string) *NodeKgGraphResponse {
	s.Node = &v
	return s
}

type CategoriesKgGraphRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
}

func (s CategoriesKgGraphRequest) String() string {
	return tea.Prettify(s)
}

func (s CategoriesKgGraphRequest) GoString() string {
	return s.String()
}

func (s *CategoriesKgGraphRequest) SetAuthToken(v string) *CategoriesKgGraphRequest {
	s.AuthToken = &v
	return s
}

func (s *CategoriesKgGraphRequest) SetProductInstanceId(v string) *CategoriesKgGraphRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CategoriesKgGraphRequest) SetKbId(v string) *CategoriesKgGraphRequest {
	s.KbId = &v
	return s
}

type CategoriesKgGraphResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分类JSON数组(KbGraphCategory字段定义见文档)
	Categories *string `json:"categories,omitempty" xml:"categories,omitempty"`
}

func (s CategoriesKgGraphResponse) String() string {
	return tea.Prettify(s)
}

func (s CategoriesKgGraphResponse) GoString() string {
	return s.String()
}

func (s *CategoriesKgGraphResponse) SetReqMsgId(v string) *CategoriesKgGraphResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CategoriesKgGraphResponse) SetResultCode(v string) *CategoriesKgGraphResponse {
	s.ResultCode = &v
	return s
}

func (s *CategoriesKgGraphResponse) SetResultMsg(v string) *CategoriesKgGraphResponse {
	s.ResultMsg = &v
	return s
}

func (s *CategoriesKgGraphResponse) SetCategories(v string) *CategoriesKgGraphResponse {
	s.Categories = &v
	return s
}

type RetryKgCompileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 编译任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s RetryKgCompileRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryKgCompileRequest) GoString() string {
	return s.String()
}

func (s *RetryKgCompileRequest) SetAuthToken(v string) *RetryKgCompileRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryKgCompileRequest) SetProductInstanceId(v string) *RetryKgCompileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryKgCompileRequest) SetTaskId(v string) *RetryKgCompileRequest {
	s.TaskId = &v
	return s
}

type RetryKgCompileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 编译任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty"`
	// 关联文档ID
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 已重试次数
	RetryCount *int64 `json:"retry_count,omitempty" xml:"retry_count,omitempty"`
	// 任务进度
	Progress *int64 `json:"progress,omitempty" xml:"progress,omitempty"`
	// 失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
}

func (s RetryKgCompileResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryKgCompileResponse) GoString() string {
	return s.String()
}

func (s *RetryKgCompileResponse) SetReqMsgId(v string) *RetryKgCompileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryKgCompileResponse) SetResultCode(v string) *RetryKgCompileResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryKgCompileResponse) SetResultMsg(v string) *RetryKgCompileResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryKgCompileResponse) SetTaskId(v string) *RetryKgCompileResponse {
	s.TaskId = &v
	return s
}

func (s *RetryKgCompileResponse) SetKbId(v string) *RetryKgCompileResponse {
	s.KbId = &v
	return s
}

func (s *RetryKgCompileResponse) SetDocumentId(v string) *RetryKgCompileResponse {
	s.DocumentId = &v
	return s
}

func (s *RetryKgCompileResponse) SetStatus(v string) *RetryKgCompileResponse {
	s.Status = &v
	return s
}

func (s *RetryKgCompileResponse) SetRetryCount(v int64) *RetryKgCompileResponse {
	s.RetryCount = &v
	return s
}

func (s *RetryKgCompileResponse) SetProgress(v int64) *RetryKgCompileResponse {
	s.Progress = &v
	return s
}

func (s *RetryKgCompileResponse) SetFailedReason(v string) *RetryKgCompileResponse {
	s.FailedReason = &v
	return s
}

type ListKgCompileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
	// 文档名称关键词
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
	// 任务标签
	TaskTag *string `json:"task_tag,omitempty" xml:"task_tag,omitempty"`
	// 页码(1起)
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListKgCompileRequest) String() string {
	return tea.Prettify(s)
}

func (s ListKgCompileRequest) GoString() string {
	return s.String()
}

func (s *ListKgCompileRequest) SetAuthToken(v string) *ListKgCompileRequest {
	s.AuthToken = &v
	return s
}

func (s *ListKgCompileRequest) SetProductInstanceId(v string) *ListKgCompileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListKgCompileRequest) SetKbId(v string) *ListKgCompileRequest {
	s.KbId = &v
	return s
}

func (s *ListKgCompileRequest) SetKeyword(v string) *ListKgCompileRequest {
	s.Keyword = &v
	return s
}

func (s *ListKgCompileRequest) SetTaskTag(v string) *ListKgCompileRequest {
	s.TaskTag = &v
	return s
}

func (s *ListKgCompileRequest) SetPage(v int64) *ListKgCompileRequest {
	s.Page = &v
	return s
}

func (s *ListKgCompileRequest) SetPageSize(v int64) *ListKgCompileRequest {
	s.PageSize = &v
	return s
}

type ListKgCompileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 任务JSON数组(KbCompileTaskItem字段定义见文档)
	Tasks *string `json:"tasks,omitempty" xml:"tasks,omitempty"`
}

func (s ListKgCompileResponse) String() string {
	return tea.Prettify(s)
}

func (s ListKgCompileResponse) GoString() string {
	return s.String()
}

func (s *ListKgCompileResponse) SetReqMsgId(v string) *ListKgCompileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListKgCompileResponse) SetResultCode(v string) *ListKgCompileResponse {
	s.ResultCode = &v
	return s
}

func (s *ListKgCompileResponse) SetResultMsg(v string) *ListKgCompileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListKgCompileResponse) SetTotal(v int64) *ListKgCompileResponse {
	s.Total = &v
	return s
}

func (s *ListKgCompileResponse) SetTasks(v string) *ListKgCompileResponse {
	s.Tasks = &v
	return s
}

type ExtractschemaKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
	// OSS文件Key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// OSS提供方
	OssProvider *string `json:"oss_provider,omitempty" xml:"oss_provider,omitempty"`
	// 抽取目标描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s ExtractschemaKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s ExtractschemaKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *ExtractschemaKmDocumentRequest) SetAuthToken(v string) *ExtractschemaKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetProductInstanceId(v string) *ExtractschemaKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetKbId(v string) *ExtractschemaKmDocumentRequest {
	s.KbId = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetFileKey(v string) *ExtractschemaKmDocumentRequest {
	s.FileKey = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetFileType(v string) *ExtractschemaKmDocumentRequest {
	s.FileType = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetOssProvider(v string) *ExtractschemaKmDocumentRequest {
	s.OssProvider = &v
	return s
}

func (s *ExtractschemaKmDocumentRequest) SetDescription(v string) *ExtractschemaKmDocumentRequest {
	s.Description = &v
	return s
}

type ExtractschemaKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的本体Schema JSON
	SchemaJson *string `json:"schema_json,omitempty" xml:"schema_json,omitempty"`
	// 文件内容摘要
	FileContent *string `json:"file_content,omitempty" xml:"file_content,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 失败原因
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s ExtractschemaKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s ExtractschemaKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *ExtractschemaKmDocumentResponse) SetReqMsgId(v string) *ExtractschemaKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetResultCode(v string) *ExtractschemaKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetResultMsg(v string) *ExtractschemaKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetSchemaJson(v string) *ExtractschemaKmDocumentResponse {
	s.SchemaJson = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetFileContent(v string) *ExtractschemaKmDocumentResponse {
	s.FileContent = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetSuccess(v bool) *ExtractschemaKmDocumentResponse {
	s.Success = &v
	return s
}

func (s *ExtractschemaKmDocumentResponse) SetErrorMsg(v string) *ExtractschemaKmDocumentResponse {
	s.ErrorMsg = &v
	return s
}

type RankKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 父节点ID(空为顶层)
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty"`
}

func (s RankKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s RankKmNodeRequest) GoString() string {
	return s.String()
}

func (s *RankKmNodeRequest) SetAuthToken(v string) *RankKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *RankKmNodeRequest) SetProductInstanceId(v string) *RankKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RankKmNodeRequest) SetTreeId(v string) *RankKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *RankKmNodeRequest) SetParentNodeId(v string) *RankKmNodeRequest {
	s.ParentNodeId = &v
	return s
}

type RankKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s RankKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s RankKmNodeResponse) GoString() string {
	return s.String()
}

func (s *RankKmNodeResponse) SetReqMsgId(v string) *RankKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RankKmNodeResponse) SetResultCode(v string) *RankKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *RankKmNodeResponse) SetResultMsg(v string) *RankKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *RankKmNodeResponse) SetSuccess(v bool) *RankKmNodeResponse {
	s.Success = &v
	return s
}

type ReorderKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 父节点ID(空为顶层)
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty"`
	// 按新顺序排列的节点ID(逗号分隔)
	NodeIds *string `json:"node_ids,omitempty" xml:"node_ids,omitempty" require:"true"`
}

func (s ReorderKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s ReorderKmNodeRequest) GoString() string {
	return s.String()
}

func (s *ReorderKmNodeRequest) SetAuthToken(v string) *ReorderKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *ReorderKmNodeRequest) SetProductInstanceId(v string) *ReorderKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReorderKmNodeRequest) SetTreeId(v string) *ReorderKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *ReorderKmNodeRequest) SetParentNodeId(v string) *ReorderKmNodeRequest {
	s.ParentNodeId = &v
	return s
}

func (s *ReorderKmNodeRequest) SetNodeIds(v string) *ReorderKmNodeRequest {
	s.NodeIds = &v
	return s
}

type ReorderKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ReorderKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s ReorderKmNodeResponse) GoString() string {
	return s.String()
}

func (s *ReorderKmNodeResponse) SetReqMsgId(v string) *ReorderKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReorderKmNodeResponse) SetResultCode(v string) *ReorderKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *ReorderKmNodeResponse) SetResultMsg(v string) *ReorderKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReorderKmNodeResponse) SetSuccess(v bool) *ReorderKmNodeResponse {
	s.Success = &v
	return s
}

type RetrieveKgGraphRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
	// 限定实体类型集合(逗号分隔)
	EntityTypes *string `json:"entity_types,omitempty" xml:"entity_types,omitempty"`
	// 限定关系类型集合(逗号分隔)
	RelationTypes *string `json:"relation_types,omitempty" xml:"relation_types,omitempty"`
	// 是否包含孤立节点
	ShowIsolated *bool `json:"show_isolated,omitempty" xml:"show_isolated,omitempty"`
	// 是否包含锚点节点
	IncludeAnchors *bool `json:"include_anchors,omitempty" xml:"include_anchors,omitempty"`
}

func (s RetrieveKgGraphRequest) String() string {
	return tea.Prettify(s)
}

func (s RetrieveKgGraphRequest) GoString() string {
	return s.String()
}

func (s *RetrieveKgGraphRequest) SetAuthToken(v string) *RetrieveKgGraphRequest {
	s.AuthToken = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetProductInstanceId(v string) *RetrieveKgGraphRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetKbId(v string) *RetrieveKgGraphRequest {
	s.KbId = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetEntityTypes(v string) *RetrieveKgGraphRequest {
	s.EntityTypes = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetRelationTypes(v string) *RetrieveKgGraphRequest {
	s.RelationTypes = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetShowIsolated(v bool) *RetrieveKgGraphRequest {
	s.ShowIsolated = &v
	return s
}

func (s *RetrieveKgGraphRequest) SetIncludeAnchors(v bool) *RetrieveKgGraphRequest {
	s.IncludeAnchors = &v
	return s
}

type RetrieveKgGraphResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果是否被截断
	Truncated *bool `json:"truncated,omitempty" xml:"truncated,omitempty"`
	// 节点JSON数组(KbGraphNode字段定义见文档)
	Nodes *string `json:"nodes,omitempty" xml:"nodes,omitempty"`
	// 关系JSON数组(KbGraphEdge字段定义见文档)
	Edges *string `json:"edges,omitempty" xml:"edges,omitempty"`
}

func (s RetrieveKgGraphResponse) String() string {
	return tea.Prettify(s)
}

func (s RetrieveKgGraphResponse) GoString() string {
	return s.String()
}

func (s *RetrieveKgGraphResponse) SetReqMsgId(v string) *RetrieveKgGraphResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetrieveKgGraphResponse) SetResultCode(v string) *RetrieveKgGraphResponse {
	s.ResultCode = &v
	return s
}

func (s *RetrieveKgGraphResponse) SetResultMsg(v string) *RetrieveKgGraphResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetrieveKgGraphResponse) SetTruncated(v bool) *RetrieveKgGraphResponse {
	s.Truncated = &v
	return s
}

func (s *RetrieveKgGraphResponse) SetNodes(v string) *RetrieveKgGraphResponse {
	s.Nodes = &v
	return s
}

func (s *RetrieveKgGraphResponse) SetEdges(v string) *RetrieveKgGraphResponse {
	s.Edges = &v
	return s
}

type SortKmNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	TreeId *string `json:"tree_id,omitempty" xml:"tree_id,omitempty" require:"true"`
	// 父节点ID(空为顶层)
	ParentNodeId *string `json:"parent_node_id,omitempty" xml:"parent_node_id,omitempty"`
	// 按新顺序排列的节点ID(逗号分隔)
	NodeIds *string `json:"node_ids,omitempty" xml:"node_ids,omitempty" require:"true"`
}

func (s SortKmNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s SortKmNodeRequest) GoString() string {
	return s.String()
}

func (s *SortKmNodeRequest) SetAuthToken(v string) *SortKmNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *SortKmNodeRequest) SetProductInstanceId(v string) *SortKmNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SortKmNodeRequest) SetTreeId(v string) *SortKmNodeRequest {
	s.TreeId = &v
	return s
}

func (s *SortKmNodeRequest) SetParentNodeId(v string) *SortKmNodeRequest {
	s.ParentNodeId = &v
	return s
}

func (s *SortKmNodeRequest) SetNodeIds(v string) *SortKmNodeRequest {
	s.NodeIds = &v
	return s
}

type SortKmNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SortKmNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s SortKmNodeResponse) GoString() string {
	return s.String()
}

func (s *SortKmNodeResponse) SetReqMsgId(v string) *SortKmNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SortKmNodeResponse) SetResultCode(v string) *SortKmNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *SortKmNodeResponse) SetResultMsg(v string) *SortKmNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SortKmNodeResponse) SetSuccess(v bool) *SortKmNodeResponse {
	s.Success = &v
	return s
}

type QueryKgGraphRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 知识库ID
	KbId *string `json:"kb_id,omitempty" xml:"kb_id,omitempty" require:"true"`
	// 限定实体类型集合(逗号分隔)
	EntityTypes *string `json:"entity_types,omitempty" xml:"entity_types,omitempty"`
	// 限定关系类型集合(逗号分隔)
	RelationTypes *string `json:"relation_types,omitempty" xml:"relation_types,omitempty"`
	// 是否包含孤立节点
	ShowIsolated *bool `json:"show_isolated,omitempty" xml:"show_isolated,omitempty"`
	// 是否包含锚点节点
	IncludeAnchors *bool `json:"include_anchors,omitempty" xml:"include_anchors,omitempty"`
}

func (s QueryKgGraphRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryKgGraphRequest) GoString() string {
	return s.String()
}

func (s *QueryKgGraphRequest) SetAuthToken(v string) *QueryKgGraphRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryKgGraphRequest) SetProductInstanceId(v string) *QueryKgGraphRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryKgGraphRequest) SetKbId(v string) *QueryKgGraphRequest {
	s.KbId = &v
	return s
}

func (s *QueryKgGraphRequest) SetEntityTypes(v string) *QueryKgGraphRequest {
	s.EntityTypes = &v
	return s
}

func (s *QueryKgGraphRequest) SetRelationTypes(v string) *QueryKgGraphRequest {
	s.RelationTypes = &v
	return s
}

func (s *QueryKgGraphRequest) SetShowIsolated(v bool) *QueryKgGraphRequest {
	s.ShowIsolated = &v
	return s
}

func (s *QueryKgGraphRequest) SetIncludeAnchors(v bool) *QueryKgGraphRequest {
	s.IncludeAnchors = &v
	return s
}

type QueryKgGraphResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果是否被截断
	Truncated *bool `json:"truncated,omitempty" xml:"truncated,omitempty"`
	// 节点JSON数组(KbGraphNode字段定义见文档)
	Nodes *string `json:"nodes,omitempty" xml:"nodes,omitempty"`
	// 关系JSON数组(KbGraphEdge字段定义见文档)
	Edges *string `json:"edges,omitempty" xml:"edges,omitempty"`
}

func (s QueryKgGraphResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryKgGraphResponse) GoString() string {
	return s.String()
}

func (s *QueryKgGraphResponse) SetReqMsgId(v string) *QueryKgGraphResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryKgGraphResponse) SetResultCode(v string) *QueryKgGraphResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryKgGraphResponse) SetResultMsg(v string) *QueryKgGraphResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryKgGraphResponse) SetTruncated(v bool) *QueryKgGraphResponse {
	s.Truncated = &v
	return s
}

func (s *QueryKgGraphResponse) SetNodes(v string) *QueryKgGraphResponse {
	s.Nodes = &v
	return s
}

func (s *QueryKgGraphResponse) SetEdges(v string) *QueryKgGraphResponse {
	s.Edges = &v
	return s
}

type FileuploadKmDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// string
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s FileuploadKmDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s FileuploadKmDocumentRequest) GoString() string {
	return s.String()
}

func (s *FileuploadKmDocumentRequest) SetAuthToken(v string) *FileuploadKmDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *FileuploadKmDocumentRequest) SetProductInstanceId(v string) *FileuploadKmDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FileuploadKmDocumentRequest) SetFileObject(v io.Reader) *FileuploadKmDocumentRequest {
	s.FileObject = v
	return s
}

func (s *FileuploadKmDocumentRequest) SetFileObjectName(v string) *FileuploadKmDocumentRequest {
	s.FileObjectName = &v
	return s
}

func (s *FileuploadKmDocumentRequest) SetFileId(v string) *FileuploadKmDocumentRequest {
	s.FileId = &v
	return s
}

type FileuploadKmDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FileuploadKmDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s FileuploadKmDocumentResponse) GoString() string {
	return s.String()
}

func (s *FileuploadKmDocumentResponse) SetReqMsgId(v string) *FileuploadKmDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FileuploadKmDocumentResponse) SetResultCode(v string) *FileuploadKmDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *FileuploadKmDocumentResponse) SetResultMsg(v string) *FileuploadKmDocumentResponse {
	s.ResultMsg = &v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.0.4"),
				"_prod_code":       tea.String("ENERGENT"),
				"_prod_channel":    tea.String("default"),
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

// Description:
//
// Description: 知识库rag 检索
//
// Summary: 知识库rag 检索
func (client *Client) QueryKnowledgeRag(request *QueryKnowledgeRagRequest) (_result *QueryKnowledgeRagResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryKnowledgeRagResponse{}
	_body, _err := client.QueryKnowledgeRagEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识库rag 检索
//
// Summary: 知识库rag 检索
func (client *Client) QueryKnowledgeRagEx(request *QueryKnowledgeRagRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryKnowledgeRagResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryKnowledgeRagResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.knowledge.rag.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: rag检索
//
// Summary: rag检索
func (client *Client) QueryEnergyknowledgeRag(request *QueryEnergyknowledgeRagRequest) (_result *QueryEnergyknowledgeRagResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnergyknowledgeRagResponse{}
	_body, _err := client.QueryEnergyknowledgeRagEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: rag检索
//
// Summary: rag检索
func (client *Client) QueryEnergyknowledgeRagEx(request *QueryEnergyknowledgeRagRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnergyknowledgeRagResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnergyknowledgeRagResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.energyknowledge.rag.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识图谱rag召回
//
// Summary: 知识图谱rag召回
func (client *Client) QueryEnergyknowledgeRagrecall(request *QueryEnergyknowledgeRagrecallRequest) (_result *QueryEnergyknowledgeRagrecallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnergyknowledgeRagrecallResponse{}
	_body, _err := client.QueryEnergyknowledgeRagrecallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识图谱rag召回
//
// Summary: 知识图谱rag召回
func (client *Client) QueryEnergyknowledgeRagrecallEx(request *QueryEnergyknowledgeRagrecallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnergyknowledgeRagrecallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnergyknowledgeRagrecallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.energyknowledge.ragrecall.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识库列表
//
// Summary: 知识库列表
func (client *Client) QueryKmKnowledgelist(request *QueryKmKnowledgelistRequest) (_result *QueryKmKnowledgelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryKmKnowledgelistResponse{}
	_body, _err := client.QueryKmKnowledgelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识库列表
//
// Summary: 知识库列表
func (client *Client) QueryKmKnowledgelistEx(request *QueryKmKnowledgelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryKmKnowledgelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryKmKnowledgelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.knowledgelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 删除目录树节点(级联子节点与挂载)
//
// Summary: 删除目录树节点(级联子节点与挂载)
func (client *Client) DeleteKmNode(request *DeleteKmNodeRequest) (_result *DeleteKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteKmNodeResponse{}
	_body, _err := client.DeleteKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 删除目录树节点(级联子节点与挂载)
//
// Summary: 删除目录树节点(级联子节点与挂载)
func (client *Client) DeleteKmNodeEx(request *DeleteKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
//
// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
func (client *Client) DetailKmTree(request *DetailKmTreeRequest) (_result *DetailKmTreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailKmTreeResponse{}
	_body, _err := client.DetailKmTreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
//
// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
func (client *Client) DetailKmTreeEx(request *DetailKmTreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailKmTreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailKmTreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.tree.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 按OSS地址批量入库--
//
// Summary: 按OSS地址批量入库--
func (client *Client) BatchimportKmDocument(request *BatchimportKmDocumentRequest) (_result *BatchimportKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchimportKmDocumentResponse{}
	_body, _err := client.BatchimportKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 按OSS地址批量入库--
//
// Summary: 按OSS地址批量入库--
func (client *Client) BatchimportKmDocumentEx(request *BatchimportKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchimportKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchimportKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.batchimport"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建知识库
//
// Summary: 创建知识库
func (client *Client) CreateKmTree(request *CreateKmTreeRequest) (_result *CreateKmTreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateKmTreeResponse{}
	_body, _err := client.CreateKmTreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建知识库
//
// Summary: 创建知识库
func (client *Client) CreateKmTreeEx(request *CreateKmTreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateKmTreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateKmTreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.tree.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 编辑目录树节点槽位信息
//
// Summary: 编辑目录树节点槽位信息
func (client *Client) UpdateKmNode(request *UpdateKmNodeRequest) (_result *UpdateKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateKmNodeResponse{}
	_body, _err := client.UpdateKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 编辑目录树节点槽位信息
//
// Summary: 编辑目录树节点槽位信息
func (client *Client) UpdateKmNodeEx(request *UpdateKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新知识库基础信息
//
// Summary: 更新知识库基础信息
func (client *Client) UpdateKmTree(request *UpdateKmTreeRequest) (_result *UpdateKmTreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateKmTreeResponse{}
	_body, _err := client.UpdateKmTreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新知识库基础信息
//
// Summary: 更新知识库基础信息
func (client *Client) UpdateKmTreeEx(request *UpdateKmTreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateKmTreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateKmTreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.tree.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询知识库图谱关系模板Schema
//
// Summary: 查询知识库图谱关系模板Schema
func (client *Client) SchemaKmTree(request *SchemaKmTreeRequest) (_result *SchemaKmTreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SchemaKmTreeResponse{}
	_body, _err := client.SchemaKmTreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询知识库图谱关系模板Schema
//
// Summary: 查询知识库图谱关系模板Schema
func (client *Client) SchemaKmTreeEx(request *SchemaKmTreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SchemaKmTreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SchemaKmTreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.tree.schema"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 目录树中创建节点(挂父节点槽位)
//
// Summary: 目录树中创建节点(挂父节点槽位)
func (client *Client) CreateKmNode(request *CreateKmNodeRequest) (_result *CreateKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateKmNodeResponse{}
	_body, _err := client.CreateKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 目录树中创建节点(挂父节点槽位)
//
// Summary: 目录树中创建节点(挂父节点槽位)
func (client *Client) CreateKmNodeEx(request *CreateKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询节点下挂载的文档列表(含是否处理中标记)
//
// Summary: 查询节点下挂载的文档列表(含是否处理中标记)
func (client *Client) ListKmDocument(request *ListKmDocumentRequest) (_result *ListKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListKmDocumentResponse{}
	_body, _err := client.ListKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询节点下挂载的文档列表(含是否处理中标记)
//
// Summary: 查询节点下挂载的文档列表(含是否处理中标记)
func (client *Client) ListKmDocumentEx(request *ListKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 解除文档与节点的挂载关系(不删除文档记录)
//
// Summary: 解除文档与节点的挂载关系(不删除文档记录)
func (client *Client) UnmountKmDocument(request *UnmountKmDocumentRequest) (_result *UnmountKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountKmDocumentResponse{}
	_body, _err := client.UnmountKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 解除文档与节点的挂载关系(不删除文档记录)
//
// Summary: 解除文档与节点的挂载关系(不删除文档记录)
func (client *Client) UnmountKmDocumentEx(request *UnmountKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询文档预览内容(MD正文)
//
// Summary: 查询文档预览内容(MD正文)
func (client *Client) PreviewKmDocument(request *PreviewKmDocumentRequest) (_result *PreviewKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewKmDocumentResponse{}
	_body, _err := client.PreviewKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询文档预览内容(MD正文)
//
// Summary: 查询文档预览内容(MD正文)
func (client *Client) PreviewKmDocumentEx(request *PreviewKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询文档段落切片列表(支持关键词过滤)
//
// Summary: 查询文档段落切片列表(支持关键词过滤)
func (client *Client) SegmentsKmDocument(request *SegmentsKmDocumentRequest) (_result *SegmentsKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SegmentsKmDocumentResponse{}
	_body, _err := client.SegmentsKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询文档段落切片列表(支持关键词过滤)
//
// Summary: 查询文档段落切片列表(支持关键词过滤)
func (client *Client) SegmentsKmDocumentEx(request *SegmentsKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SegmentsKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SegmentsKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.segments"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 树内节点与文档统一搜索
//
// Summary: 树内节点与文档统一搜索
func (client *Client) SearchKmDocument(request *SearchKmDocumentRequest) (_result *SearchKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SearchKmDocumentResponse{}
	_body, _err := client.SearchKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 树内节点与文档统一搜索
//
// Summary: 树内节点与文档统一搜索
func (client *Client) SearchKmDocumentEx(request *SearchKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SearchKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SearchKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.search"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建并发布知识库新版本
//
// Summary: 创建并发布知识库新版本
func (client *Client) CreateKmVersion(request *CreateKmVersionRequest) (_result *CreateKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateKmVersionResponse{}
	_body, _err := client.CreateKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建并发布知识库新版本
//
// Summary: 创建并发布知识库新版本
func (client *Client) CreateKmVersionEx(request *CreateKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.version.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询知识库版本列表(分页)
//
// Summary: 查询知识库版本列表(分页)
func (client *Client) ListKmVersion(request *ListKmVersionRequest) (_result *ListKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListKmVersionResponse{}
	_body, _err := client.ListKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询知识库版本列表(分页)
//
// Summary: 查询知识库版本列表(分页)
func (client *Client) ListKmVersionEx(request *ListKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.version.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询版本详情(含JSON快照)
//
// Summary: 查询版本详情(含JSON快照)
func (client *Client) DetailKmVersion(request *DetailKmVersionRequest) (_result *DetailKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailKmVersionResponse{}
	_body, _err := client.DetailKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询版本详情(含JSON快照)
//
// Summary: 查询版本详情(含JSON快照)
func (client *Client) DetailKmVersionEx(request *DetailKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.version.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询知识库下一个可用版本号
//
// Summary: 查询知识库下一个可用版本号
func (client *Client) NextKmVersion(request *NextKmVersionRequest) (_result *NextKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NextKmVersionResponse{}
	_body, _err := client.NextKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询知识库下一个可用版本号
//
// Summary: 查询知识库下一个可用版本号
func (client *Client) NextKmVersionEx(request *NextKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NextKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NextKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.version.next"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 激活知识库指定版本(回滚用)
//
// Summary: 激活知识库指定版本(回滚用)
func (client *Client) ActivateKmVersion(request *ActivateKmVersionRequest) (_result *ActivateKmVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ActivateKmVersionResponse{}
	_body, _err := client.ActivateKmVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 激活知识库指定版本(回滚用)
//
// Summary: 激活知识库指定版本(回滚用)
func (client *Client) ActivateKmVersionEx(request *ActivateKmVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ActivateKmVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ActivateKmVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.version.activate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 图谱节点详情与邻域展开
//
// Summary: 图谱节点详情与邻域展开
func (client *Client) NodeKgGraph(request *NodeKgGraphRequest) (_result *NodeKgGraphResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NodeKgGraphResponse{}
	_body, _err := client.NodeKgGraphEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 图谱节点详情与邻域展开
//
// Summary: 图谱节点详情与邻域展开
func (client *Client) NodeKgGraphEx(request *NodeKgGraphRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NodeKgGraphResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NodeKgGraphResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.graph.node"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 图谱节点分类与图例配置
//
// Summary: 图谱节点分类与图例配置
func (client *Client) CategoriesKgGraph(request *CategoriesKgGraphRequest) (_result *CategoriesKgGraphResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CategoriesKgGraphResponse{}
	_body, _err := client.CategoriesKgGraphEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 图谱节点分类与图例配置
//
// Summary: 图谱节点分类与图例配置
func (client *Client) CategoriesKgGraphEx(request *CategoriesKgGraphRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CategoriesKgGraphResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CategoriesKgGraphResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.graph.categories"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 重试失败的图谱编译任务
//
// Summary: 重试失败的图谱编译任务
func (client *Client) RetryKgCompile(request *RetryKgCompileRequest) (_result *RetryKgCompileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryKgCompileResponse{}
	_body, _err := client.RetryKgCompileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 重试失败的图谱编译任务
//
// Summary: 重试失败的图谱编译任务
func (client *Client) RetryKgCompileEx(request *RetryKgCompileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryKgCompileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryKgCompileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.compile.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询图谱编译任务列表(分页)
//
// Summary: 查询图谱编译任务列表(分页)
func (client *Client) ListKgCompile(request *ListKgCompileRequest) (_result *ListKgCompileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListKgCompileResponse{}
	_body, _err := client.ListKgCompileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询图谱编译任务列表(分页)
//
// Summary: 查询图谱编译任务列表(分页)
func (client *Client) ListKgCompileEx(request *ListKgCompileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListKgCompileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListKgCompileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.compile.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 基于已上传文件生成图谱本体Schema(不落库)
//
// Summary: 基于已上传文件生成图谱本体Schema(不落库)
func (client *Client) ExtractschemaKmDocument(request *ExtractschemaKmDocumentRequest) (_result *ExtractschemaKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExtractschemaKmDocumentResponse{}
	_body, _err := client.ExtractschemaKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 基于已上传文件生成图谱本体Schema(不落库)
//
// Summary: 基于已上传文件生成图谱本体Schema(不落库)
func (client *Client) ExtractschemaKmDocumentEx(request *ExtractschemaKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExtractschemaKmDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExtractschemaKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.extractschema"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点拖拽排序
//
// Summary: 同级目录树节点拖拽排序
func (client *Client) RankKmNode(request *RankKmNodeRequest) (_result *RankKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RankKmNodeResponse{}
	_body, _err := client.RankKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点拖拽排序
//
// Summary: 同级目录树节点拖拽排序
func (client *Client) RankKmNodeEx(request *RankKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RankKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RankKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.rank"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点按序重排
//
// Summary: 同级目录树节点按序重排
func (client *Client) ReorderKmNode(request *ReorderKmNodeRequest) (_result *ReorderKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReorderKmNodeResponse{}
	_body, _err := client.ReorderKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点按序重排
//
// Summary: 同级目录树节点按序重排
func (client *Client) ReorderKmNodeEx(request *ReorderKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReorderKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReorderKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.reorder"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识图谱全图查询(节点与关系)
//
// Summary: 知识图谱全图查询(节点与关系)
func (client *Client) RetrieveKgGraph(request *RetrieveKgGraphRequest) (_result *RetrieveKgGraphResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetrieveKgGraphResponse{}
	_body, _err := client.RetrieveKgGraphEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识图谱全图查询(节点与关系)
//
// Summary: 知识图谱全图查询(节点与关系)
func (client *Client) RetrieveKgGraphEx(request *RetrieveKgGraphRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetrieveKgGraphResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetrieveKgGraphResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.graph.retrieve"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点按序重排
//
// Summary: 同级目录树节点按序重排
func (client *Client) SortKmNode(request *SortKmNodeRequest) (_result *SortKmNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SortKmNodeResponse{}
	_body, _err := client.SortKmNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 同级目录树节点按序重排
//
// Summary: 同级目录树节点按序重排
func (client *Client) SortKmNodeEx(request *SortKmNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SortKmNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SortKmNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.node.sort"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识图谱全图查询(节点与关系)
//
// Summary: 知识图谱全图查询(节点与关系)
func (client *Client) QueryKgGraph(request *QueryKgGraphRequest) (_result *QueryKgGraphResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryKgGraphResponse{}
	_body, _err := client.QueryKgGraphEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识图谱全图查询(节点与关系)
//
// Summary: 知识图谱全图查询(节点与关系)
func (client *Client) QueryKgGraphEx(request *QueryKgGraphRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryKgGraphResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryKgGraphResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.kg.graph.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 知识库文件上传接入
//
// Summary: 知识库文件上传接入
func (client *Client) FileuploadKmDocument(request *FileuploadKmDocumentRequest) (_result *FileuploadKmDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FileuploadKmDocumentResponse{}
	_body, _err := client.FileuploadKmDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 知识库文件上传接入
//
// Summary: 知识库文件上传接入
func (client *Client) FileuploadKmDocumentEx(request *FileuploadKmDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FileuploadKmDocumentResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antdigital.energent.km.document.fileupload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			fileuploadKmDocumentResponse := &FileuploadKmDocumentResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = fileuploadKmDocumentResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FileuploadKmDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.energent.km.document.fileupload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
