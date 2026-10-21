// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

export class OpenNode extends $tea.Model {
  // node ID
  /**
   * @example
   * N1
   */
  nodeId: string;
  // parent node ID
  parentNodeId: string;
  // slot key
  /**
   * @example
   * system:root
   */
  slotKey: string;
  // slot value
  /**
   * @example
   * 根节点
   */
  slotValue: string;
  // level
  /**
   * @example
   * 0
   */
  level: number;
  // sort订单
  /**
   * @example
   * 0
   */
  sortOrder: number;
  // gmt create
  /**
   * @example
   * 2026-08-01 10:00:00
   */
  gmtCreate: string;
  // children
  /**
   * @example
   * [{"node_id":"N2","parent_node_id":"N1","slot_key":"province","slot_value":"山东","level":1,"sort_order":0,"gmt_create":"2026-08-01 10:00:00","children":[]}]
   */
  children: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      parentNodeId: 'parent_node_id',
      slotKey: 'slot_key',
      slotValue: 'slot_value',
      level: 'level',
      sortOrder: 'sort_order',
      gmtCreate: 'gmt_create',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      parentNodeId: 'string',
      slotKey: 'string',
      slotValue: 'string',
      level: 'number',
      sortOrder: 'number',
      gmtCreate: 'string',
      children: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class KbUploadFileItem extends $tea.Model {
  // document ID
  /**
   * @example
   * D1
   */
  documentId: string;
  // file名称
  /**
   * @example
   * a.pdf
   */
  fileName: string;
  // original名称
  /**
   * @example
   * a.pdf
   */
  originalName: string;
  // file类型
  /**
   * @example
   * pdf
   */
  fileType: string;
  // file md5
  /**
   * @example
   * m1
   */
  fileMd5: string;
  // oss url
  /**
   * @example
   * https://oss.example/a.pdf
   */
  ossUrl: string;
  // oss provider
  /**
   * @example
   * antUpload
   */
  ossProvider: string;
  // source
  source: string;
  // source ext
  sourceExt: string;
  static names(): { [key: string]: string } {
    return {
      documentId: 'document_id',
      fileName: 'file_name',
      originalName: 'original_name',
      fileType: 'file_type',
      fileMd5: 'file_md5',
      ossUrl: 'oss_url',
      ossProvider: 'oss_provider',
      source: 'source',
      sourceExt: 'source_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentId: 'string',
      fileName: 'string',
      originalName: 'string',
      fileType: 'string',
      fileMd5: 'string',
      ossUrl: 'string',
      ossProvider: 'string',
      source: 'string',
      sourceExt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 召回出参明细
export class RecallDataDetail extends $tea.Model {
  // 文件名
  /**
   * @example
   * 浙江省电力交易细则
   */
  docname?: string;
  // 片段内容
  /**
   * @example
   * 浙江省交易细则
   */
  content?: string;
  // 重排得分
  /**
   * @example
   * 1.2
   */
  rerankscore?: number;
  // 重排位次
  /**
   * @example
   * 1
   */
  rerankrank?: number;
  // 综合得分
  /**
   * @example
   * 1
   */
  score?: number;
  // chunk标题
  /**
   * @example
   * 浙江省交易细则
   */
  title?: string;
  // 知识库id
  /**
   * @example
   * 1
   */
  knowledgebaseids?: string;
  // official 官方知识库、custom个人知识库
  /**
   * @example
   * official
   */
  knowledgebasetag?: string;
  static names(): { [key: string]: string } {
    return {
      docname: 'docname',
      content: 'content',
      rerankscore: 'rerankscore',
      rerankrank: 'rerankrank',
      score: 'score',
      title: 'title',
      knowledgebaseids: 'knowledgebaseids',
      knowledgebasetag: 'knowledgebasetag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docname: 'string',
      content: 'string',
      rerankscore: 'number',
      rerankrank: 'number',
      score: 'number',
      title: 'string',
      knowledgebaseids: 'string',
      knowledgebasetag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档DTO
export class DocumentDTO extends $tea.Model {
  // id
  /**
   * @example
   * 1
   */
  id?: string;
  // 文件名
  /**
   * @example
   * 123
   */
  name?: string;
  // 文件大小
  /**
   * @example
   * 1231
   */
  fileSize?: string;
  // 文件类型
  /**
   * @example
   * pdf
   */
  fileType?: string;
  // 文件地址
  /**
   * @example
   * 文件地址
   */
  ossUrl?: string;
  // md5
  /**
   * @example
   * 1231
   */
  md5?: string;
  // 状态
  /**
   * @example
   * 1
   */
  status?: string;
  // 创建时间
  /**
   * @example
   * 2026-01-01 00:00:00
   */
  gmtCreate?: string;
  // 修改时间
  /**
   * @example
   * 2026-01-01 00:00:00
   */
  gmtModified?: string;
  // 文件提供方
  /**
   * @example
   * oss
   */
  ossProvider?: string;
  // 向量库映射ID
  /**
   * @example
   * 向量库映射ID
   */
  vectorStoreMapId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      fileSize: 'file_size',
      fileType: 'file_type',
      ossUrl: 'oss_url',
      md5: 'md5',
      status: 'status',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      ossProvider: 'oss_provider',
      vectorStoreMapId: 'vector_store_map_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      fileSize: 'string',
      fileType: 'string',
      ossUrl: 'string',
      md5: 'string',
      status: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      ossProvider: 'string',
      vectorStoreMapId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件名字
export class FileItem extends $tea.Model {
  // 文件 id
  /**
   * @example
   * 文件 id
   */
  documentId: string;
  // 文件名
  /**
   * @example
   * 文件名
   */
  fileName?: string;
  // 文件类型
  /**
   * @example
   * pdf
   */
  fileType?: string;
  // OSS文件地址
  /**
   * @example
   * oss地址
   */
  ossUrl?: string;
  // OSS提供方
  /**
   * @example
   * OSS提供方
   */
  ossProvider?: string;
  // 文档来源
  /**
   * @example
   * 文档来源
   */
  source?: string;
  // 文档来源方对文档的额外描述信息
  /**
   * @example
   * 文档来源方对文档的额外描述信息
   */
  sourceExt?: string;
  static names(): { [key: string]: string } {
    return {
      documentId: 'document_id',
      fileName: 'file_name',
      fileType: 'file_type',
      ossUrl: 'oss_url',
      ossProvider: 'oss_provider',
      source: 'source',
      sourceExt: 'source_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentId: 'string',
      fileName: 'string',
      fileType: 'string',
      ossUrl: 'string',
      ossProvider: 'string',
      source: 'string',
      sourceExt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库列表数据详情
export class TreeDetailResponse extends $tea.Model {
  // 知识库名称
  /**
   * @example
   * 知识库名称
   */
  name?: string;
  // 知识库id
  /**
   * @example
   * tree_1231
   */
  id?: string;
  // 知识库描述
  /**
   * @example
   * 知识库描述
   */
  description?: string;
  // 当前最新版本
  /**
   * @example
   * V2026.08.1
   */
  version?: string;
  // 当前激活的版本号，未激活任何版本时为 null
  /**
   * @example
   * V2026.08.1
   */
  activeversion?: string;
  // 官方知识库数据为 "official",否则 null
  /**
   * @example
   * null
   */
  tenanttag?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      description: 'description',
      version: 'version',
      activeversion: 'activeversion',
      tenanttag: 'tenanttag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      description: 'string',
      version: 'string',
      activeversion: 'string',
      tenanttag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  /**
   * @example
   * key
   */
  name: string;
  // 键值
  /**
   * @example
   * value
   */
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKnowledgeRagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户问题
  query: string;
  // 知识库id
  knowledgeBaseIds?: string[];
  // 召回个数
  topk?: number;
  // 是否包含引用来源
  includeReferences?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      query: 'query',
      knowledgeBaseIds: 'knowledge_base_ids',
      topk: 'topk',
      includeReferences: 'include_references',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      query: 'string',
      knowledgeBaseIds: { 'type': 'array', 'itemType': 'string' },
      topk: 'number',
      includeReferences: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKnowledgeRagResponse extends $tea.Model {
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

export class QueryEnergyknowledgeRagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户问题
  query: string;
  // 指定查询的知识库id
  knowledgeBaseIds?: string[];
  // 召回数量
  topk?: number;
  // 是否返回引用docid
  includeReferences?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      query: 'query',
      knowledgeBaseIds: 'knowledge_base_ids',
      topk: 'topk',
      includeReferences: 'include_references',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      query: 'string',
      knowledgeBaseIds: { 'type': 'array', 'itemType': 'string' },
      topk: 'number',
      includeReferences: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnergyknowledgeRagResponse extends $tea.Model {
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

export class QueryEnergyknowledgeRagrecallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // rag检索问题
  query: string;
  // 召回的知识库id
  knowledgebaseids?: string[];
  // 是否包含召回文件名，默认true
  includereferences?: boolean;
  // 召回条数，默认5
  topk?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      query: 'query',
      knowledgebaseids: 'knowledgebaseids',
      includereferences: 'includereferences',
      topk: 'topk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      query: 'string',
      knowledgebaseids: { 'type': 'array', 'itemType': 'string' },
      includereferences: 'boolean',
      topk: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnergyknowledgeRagrecallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出参数据
  datalist?: RecallDataDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datalist: 'datalist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datalist: { 'type': 'array', 'itemType': RecallDataDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmKnowledgelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库名称搜索关键词
  keyword?: string;
  // 一页数据条数
  pageSize?: number;
  // 页号
  page?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      pageSize: 'page_size',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      pageSize: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmKnowledgelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库datalist
  datalist?: TreeDetailResponse;
  // 总数据量
  totalrecords?: number;
  // 知识库树列表JSON数组(元素字段见语雀文档)
  trees?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datalist: 'datalist',
      totalrecords: 'totalrecords',
      trees: 'trees',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datalist: TreeDetailResponse,
      totalrecords: 'number',
      trees: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class DetailKmTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailKmTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库ID
  treeId?: string;
  // 知识库名称
  name?: string;
  // 知识库描述
  description?: string;
  // 知识库图标
  icon?: string;
  // 最新版本号(无版本为空)
  version?: string;
  // 当前激活版本号(未激活为空)
  activeVersion?: string;
  // 节点总数
  nodeCount?: number;
  // 文档总数
  documentCount?: number;
  // 是否开启图谱编译
  graphEnabled?: boolean;
  // 处理中(未终态)编译任务数(仅图谱开启返回)
  compileTaskCount?: number;
  // 根节点树JSON文本(OpenNode字段定义见文档)
  rootNodeJson?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 租户标签(官方租户数据为official)
  tenantTag?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      treeId: 'tree_id',
      name: 'name',
      description: 'description',
      icon: 'icon',
      version: 'version',
      activeVersion: 'active_version',
      nodeCount: 'node_count',
      documentCount: 'document_count',
      graphEnabled: 'graph_enabled',
      compileTaskCount: 'compile_task_count',
      rootNodeJson: 'root_node_json',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      tenantTag: 'tenant_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      treeId: 'string',
      name: 'string',
      description: 'string',
      icon: 'string',
      version: 'string',
      activeVersion: 'string',
      nodeCount: 'number',
      documentCount: 'number',
      graphEnabled: 'boolean',
      compileTaskCount: 'number',
      rootNodeJson: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      tenantTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchimportKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 挂载目标节点ID
  nodeId: string;
  // 任务扩展号
  taskExt?: string;
  // 待入库文件列表(files.1.file_name点号形式)
  files: KbUploadFileItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
      taskExt: 'task_ext',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
      taskExt: 'string',
      files: { 'type': 'array', 'itemType': KbUploadFileItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchimportKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功数量
  successCount?: number;
  // 失败数量
  failedCount?: number;
  // 跳过数量(MD5重复)
  skipCount?: number;
  // 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
  documents?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      successCount: 'success_count',
      failedCount: 'failed_count',
      skipCount: 'skip_count',
      documents: 'documents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      successCount: 'number',
      failedCount: 'number',
      skipCount: 'number',
      documents: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库名称
  name: string;
  // 知识库描述
  description?: string;
  // 知识库图标
  icon?: string;
  // 图谱本体Schema JSON
  schemaJson?: string;
  // 是否开启图谱编译
  graphEnabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      description: 'description',
      icon: 'icon',
      schemaJson: 'schema_json',
      graphEnabled: 'graph_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      description: 'string',
      icon: 'string',
      schemaJson: 'string',
      graphEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库ID
  treeId?: string;
  // 根节点ID
  rootNodeId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      treeId: 'tree_id',
      rootNodeId: 'root_node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      treeId: 'string',
      rootNodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  // 节点键名
  slotKey?: string;
  // 节点值
  slotValue?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
      slotKey: 'slot_key',
      slotValue: 'slot_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
      slotKey: 'string',
      slotValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class UpdateKmTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 知识库名称
  name?: string;
  // 知识库描述
  description?: string;
  // 知识库图标
  icon?: string;
  // 图谱本体Schema JSON
  schemaJson?: string;
  // 是否开启图谱编译
  graphEnabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      name: 'name',
      description: 'description',
      icon: 'icon',
      schemaJson: 'schema_json',
      graphEnabled: 'graph_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      name: 'string',
      description: 'string',
      icon: 'string',
      schemaJson: 'string',
      graphEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateKmTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class SchemaKmTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SchemaKmTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库ID
  kbId?: string;
  // 图谱本体Schema JSON文本
  schemaJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      kbId: 'kb_id',
      schemaJson: 'schema_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      kbId: 'string',
      schemaJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 父节点ID
  parentNodeId: string;
  // 节点键名(最长50)
  slotKey: string;
  // 节点值(最长100)
  slotValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      parentNodeId: 'parent_node_id',
      slotKey: 'slot_key',
      slotValue: 'slot_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      parentNodeId: 'string',
      slotKey: 'string',
      slotValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 新节点ID
  nodeId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 节点文档JSON数组(KbDocumentDTO字段定义见文档)
  documents?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documents: 'documents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documents: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  // 向量库映射ID
  vectorStoreMapId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
      vectorStoreMapId: 'vector_store_map_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
      vectorStoreMapId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class PreviewKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  // 文档挂载映射ID
  docMapId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
      docMapId: 'doc_map_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
      docMapId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档ID
  documentId?: string;
  // 文档名
  documentName?: string;
  // 文件类型
  fileType?: string;
  // 文档Markdown正文
  content?: string;
  // OSS预览地址
  ossPreviewUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documentId: 'document_id',
      documentName: 'document_name',
      fileType: 'file_type',
      content: 'content',
      ossPreviewUrl: 'oss_preview_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documentId: 'string',
      documentName: 'string',
      fileType: 'string',
      content: 'string',
      ossPreviewUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SegmentsKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 节点ID
  nodeId: string;
  // 文档挂载映射ID
  docMapId: string;
  // 切片内容关键词
  keyword?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      nodeId: 'node_id',
      docMapId: 'doc_map_id',
      keyword: 'keyword',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      nodeId: 'string',
      docMapId: 'string',
      keyword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SegmentsKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 切片总数
  totalCount?: number;
  // 切片JSON数组(KbSegmentItem字段定义见文档)
  segments?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      segments: 'segments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      segments: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 搜索关键词
  keyword: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      keyword: 'keyword',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      keyword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 搜索结果JSON数组(KbSearchItem字段定义见文档)
  items?: string;
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
      items: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 版本描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本ID
  versionId?: string;
  // 知识库ID
  treeId?: string;
  // 版本号
  version?: string;
  // 版本状态
  status?: string;
  // 发布任务总数
  totalTaskCount?: number;
  // 已完成任务数
  completedCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      versionId: 'version_id',
      treeId: 'tree_id',
      version: 'version',
      status: 'status',
      totalTaskCount: 'total_task_count',
      completedCount: 'completed_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      versionId: 'string',
      treeId: 'string',
      version: 'string',
      status: 'string',
      totalTaskCount: 'number',
      completedCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 页码(1起)
  page?: number;
  // 每页条数(上限100)
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本总数
  totalRecords?: number;
  // 版本JSON数组(KbVersionItem字段定义见文档)
  versions?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalRecords: 'total_records',
      versions: 'versions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalRecords: 'number',
      versions: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 版本ID
  versionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      versionId: 'version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      versionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本ID
  versionId?: string;
  // 知识库ID
  treeId?: string;
  // 版本号
  version?: string;
  // 版本描述
  description?: string;
  // 版本快照JSON文本(树结构全文)
  snapshot?: string;
  // 文档数
  docCount?: number;
  // 节点数
  nodeCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      versionId: 'version_id',
      treeId: 'tree_id',
      version: 'version',
      description: 'description',
      snapshot: 'snapshot',
      docCount: 'doc_count',
      nodeCount: 'node_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      versionId: 'string',
      treeId: 'string',
      version: 'string',
      description: 'string',
      snapshot: 'string',
      docCount: 'number',
      nodeCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NextKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NextKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库ID
  treeId?: string;
  // 下一个版本号
  nextVersion?: string;
  // 节点数
  nodeCount?: number;
  // 文档数
  documentCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      treeId: 'tree_id',
      nextVersion: 'next_version',
      nodeCount: 'node_count',
      documentCount: 'document_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      treeId: 'string',
      nextVersion: 'string',
      nodeCount: 'number',
      documentCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ActivateKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 目标版本ID
  versionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      versionId: 'version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      versionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ActivateKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 当前激活版本ID
  activeVersionId?: string;
  // 激活时间
  activeTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      activeVersionId: 'active_version_id',
      activeTime: 'active_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      activeVersionId: 'string',
      activeTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NodeKgGraphRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  // 节点ID
  nodeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NodeKgGraphResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 节点详情JSON(KbGraphNode字段定义含邻域与属性)
  node?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      node: 'node',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      node: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CategoriesKgGraphRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CategoriesKgGraphResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分类JSON数组(KbGraphCategory字段定义见文档)
  categories?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      categories: 'categories',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      categories: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryKgCompileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 编译任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryKgCompileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 编译任务ID
  taskId?: string;
  // 知识库ID
  kbId?: string;
  // 关联文档ID
  documentId?: string;
  // 任务状态
  status?: string;
  // 已重试次数
  retryCount?: number;
  // 任务进度
  progress?: number;
  // 失败原因
  failedReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      kbId: 'kb_id',
      documentId: 'document_id',
      status: 'status',
      retryCount: 'retry_count',
      progress: 'progress',
      failedReason: 'failed_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      kbId: 'string',
      documentId: 'string',
      status: 'string',
      retryCount: 'number',
      progress: 'number',
      failedReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKgCompileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  // 文档名称关键词
  keyword?: string;
  // 任务标签
  taskTag?: string;
  // 页码(1起)
  page?: number;
  // 每页条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
      keyword: 'keyword',
      taskTag: 'task_tag',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
      keyword: 'string',
      taskTag: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListKgCompileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务总数
  total?: number;
  // 任务JSON数组(KbCompileTaskItem字段定义见文档)
  tasks?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      tasks: 'tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      tasks: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExtractschemaKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  // OSS文件Key
  fileKey: string;
  // 文件类型
  fileType: string;
  // OSS提供方
  ossProvider?: string;
  // 抽取目标描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
      fileKey: 'file_key',
      fileType: 'file_type',
      ossProvider: 'oss_provider',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
      fileKey: 'string',
      fileType: 'string',
      ossProvider: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExtractschemaKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的本体Schema JSON
  schemaJson?: string;
  // 文件内容摘要
  fileContent?: string;
  // 是否成功
  success?: boolean;
  // 失败原因
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      schemaJson: 'schema_json',
      fileContent: 'file_content',
      success: 'success',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      schemaJson: 'string',
      fileContent: 'string',
      success: 'boolean',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RankKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 父节点ID(空为顶层)
  parentNodeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      parentNodeId: 'parent_node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      parentNodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RankKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class ReorderKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 父节点ID(空为顶层)
  parentNodeId?: string;
  // 按新顺序排列的节点ID(逗号分隔)
  nodeIds: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      parentNodeId: 'parent_node_id',
      nodeIds: 'node_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      parentNodeId: 'string',
      nodeIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReorderKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class RetrieveKgGraphRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  // 限定实体类型集合(逗号分隔)
  entityTypes?: string;
  // 限定关系类型集合(逗号分隔)
  relationTypes?: string;
  // 是否包含孤立节点
  showIsolated?: boolean;
  // 是否包含锚点节点
  includeAnchors?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
      entityTypes: 'entity_types',
      relationTypes: 'relation_types',
      showIsolated: 'show_isolated',
      includeAnchors: 'include_anchors',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
      entityTypes: 'string',
      relationTypes: 'string',
      showIsolated: 'boolean',
      includeAnchors: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetrieveKgGraphResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果是否被截断
  truncated?: boolean;
  // 节点JSON数组(KbGraphNode字段定义见文档)
  nodes?: string;
  // 关系JSON数组(KbGraphEdge字段定义见文档)
  edges?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      truncated: 'truncated',
      nodes: 'nodes',
      edges: 'edges',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      truncated: 'boolean',
      nodes: 'string',
      edges: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SortKmNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  treeId: string;
  // 父节点ID(空为顶层)
  parentNodeId?: string;
  // 按新顺序排列的节点ID(逗号分隔)
  nodeIds: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      treeId: 'tree_id',
      parentNodeId: 'parent_node_id',
      nodeIds: 'node_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      treeId: 'string',
      parentNodeId: 'string',
      nodeIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SortKmNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class QueryKgGraphRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  kbId: string;
  // 限定实体类型集合(逗号分隔)
  entityTypes?: string;
  // 限定关系类型集合(逗号分隔)
  relationTypes?: string;
  // 是否包含孤立节点
  showIsolated?: boolean;
  // 是否包含锚点节点
  includeAnchors?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      kbId: 'kb_id',
      entityTypes: 'entity_types',
      relationTypes: 'relation_types',
      showIsolated: 'show_isolated',
      includeAnchors: 'include_anchors',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      kbId: 'string',
      entityTypes: 'string',
      relationTypes: 'string',
      showIsolated: 'boolean',
      includeAnchors: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKgGraphResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果是否被截断
  truncated?: boolean;
  // 节点JSON数组(KbGraphNode字段定义见文档)
  nodes?: string;
  // 关系JSON数组(KbGraphEdge字段定义见文档)
  edges?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      truncated: 'truncated',
      nodes: 'nodes',
      edges: 'edges',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      truncated: 'boolean',
      nodes: 'string',
      edges: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FileuploadKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FileuploadKmDocumentResponse extends $tea.Model {
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

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "1.0.4",
          _prod_code: "ENERGENT",
          _prod_channel: "default",
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
   * @remarks
   * Description: 知识库rag 检索
   * Summary: 知识库rag 检索
   */
  async queryKnowledgeRag(request: QueryKnowledgeRagRequest): Promise<QueryKnowledgeRagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKnowledgeRagEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识库rag 检索
   * Summary: 知识库rag 检索
   */
  async queryKnowledgeRagEx(request: QueryKnowledgeRagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKnowledgeRagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKnowledgeRagResponse>(await this.doRequest("1.0", "antdigital.energent.knowledge.rag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKnowledgeRagResponse({}));
  }

  /**
   * @remarks
   * Description: rag检索
   * Summary: rag检索
   */
  async queryEnergyknowledgeRag(request: QueryEnergyknowledgeRagRequest): Promise<QueryEnergyknowledgeRagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnergyknowledgeRagEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: rag检索
   * Summary: rag检索
   */
  async queryEnergyknowledgeRagEx(request: QueryEnergyknowledgeRagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnergyknowledgeRagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnergyknowledgeRagResponse>(await this.doRequest("1.0", "antdigital.energent.energyknowledge.rag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnergyknowledgeRagResponse({}));
  }

  /**
   * @remarks
   * Description: 知识图谱rag召回
   * Summary: 知识图谱rag召回
   */
  async queryEnergyknowledgeRagrecall(request: QueryEnergyknowledgeRagrecallRequest): Promise<QueryEnergyknowledgeRagrecallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnergyknowledgeRagrecallEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识图谱rag召回
   * Summary: 知识图谱rag召回
   */
  async queryEnergyknowledgeRagrecallEx(request: QueryEnergyknowledgeRagrecallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnergyknowledgeRagrecallResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnergyknowledgeRagrecallResponse>(await this.doRequest("1.0", "antdigital.energent.energyknowledge.ragrecall.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnergyknowledgeRagrecallResponse({}));
  }

  /**
   * @remarks
   * Description: 知识库列表
   * Summary: 知识库列表
   */
  async queryKmKnowledgelist(request: QueryKmKnowledgelistRequest): Promise<QueryKmKnowledgelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKmKnowledgelistEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识库列表
   * Summary: 知识库列表
   */
  async queryKmKnowledgelistEx(request: QueryKmKnowledgelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKmKnowledgelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKmKnowledgelistResponse>(await this.doRequest("1.0", "antdigital.energent.km.knowledgelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKmKnowledgelistResponse({}));
  }

  /**
   * @remarks
   * Description: 删除目录树节点(级联子节点与挂载)
   * Summary: 删除目录树节点(级联子节点与挂载)
   */
  async deleteKmNode(request: DeleteKmNodeRequest): Promise<DeleteKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 删除目录树节点(级联子节点与挂载)
   * Summary: 删除目录树节点(级联子节点与挂载)
   */
  async deleteKmNodeEx(request: DeleteKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
   * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
   */
  async detailKmTree(request: DetailKmTreeRequest): Promise<DetailKmTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailKmTreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
   * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
   */
  async detailKmTreeEx(request: DetailKmTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailKmTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailKmTreeResponse>(await this.doRequest("1.0", "antdigital.energent.km.tree.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailKmTreeResponse({}));
  }

  /**
   * @remarks
   * Description: 按OSS地址批量入库--
   * Summary: 按OSS地址批量入库--
   */
  async batchimportKmDocument(request: BatchimportKmDocumentRequest): Promise<BatchimportKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchimportKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 按OSS地址批量入库--
   * Summary: 按OSS地址批量入库--
   */
  async batchimportKmDocumentEx(request: BatchimportKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchimportKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchimportKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.batchimport", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchimportKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 创建知识库
   * Summary: 创建知识库
   */
  async createKmTree(request: CreateKmTreeRequest): Promise<CreateKmTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createKmTreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建知识库
   * Summary: 创建知识库
   */
  async createKmTreeEx(request: CreateKmTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateKmTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateKmTreeResponse>(await this.doRequest("1.0", "antdigital.energent.km.tree.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateKmTreeResponse({}));
  }

  /**
   * @remarks
   * Description: 编辑目录树节点槽位信息
   * Summary: 编辑目录树节点槽位信息
   */
  async updateKmNode(request: UpdateKmNodeRequest): Promise<UpdateKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 编辑目录树节点槽位信息
   * Summary: 编辑目录树节点槽位信息
   */
  async updateKmNodeEx(request: UpdateKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 更新知识库基础信息
   * Summary: 更新知识库基础信息
   */
  async updateKmTree(request: UpdateKmTreeRequest): Promise<UpdateKmTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateKmTreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新知识库基础信息
   * Summary: 更新知识库基础信息
   */
  async updateKmTreeEx(request: UpdateKmTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateKmTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateKmTreeResponse>(await this.doRequest("1.0", "antdigital.energent.km.tree.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateKmTreeResponse({}));
  }

  /**
   * @remarks
   * Description: 查询知识库图谱关系模板Schema
   * Summary: 查询知识库图谱关系模板Schema
   */
  async schemaKmTree(request: SchemaKmTreeRequest): Promise<SchemaKmTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.schemaKmTreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询知识库图谱关系模板Schema
   * Summary: 查询知识库图谱关系模板Schema
   */
  async schemaKmTreeEx(request: SchemaKmTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SchemaKmTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<SchemaKmTreeResponse>(await this.doRequest("1.0", "antdigital.energent.km.tree.schema", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SchemaKmTreeResponse({}));
  }

  /**
   * @remarks
   * Description: 目录树中创建节点(挂父节点槽位)
   * Summary: 目录树中创建节点(挂父节点槽位)
   */
  async createKmNode(request: CreateKmNodeRequest): Promise<CreateKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 目录树中创建节点(挂父节点槽位)
   * Summary: 目录树中创建节点(挂父节点槽位)
   */
  async createKmNodeEx(request: CreateKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 查询节点下挂载的文档列表(含是否处理中标记)
   * Summary: 查询节点下挂载的文档列表(含是否处理中标记)
   */
  async listKmDocument(request: ListKmDocumentRequest): Promise<ListKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询节点下挂载的文档列表(含是否处理中标记)
   * Summary: 查询节点下挂载的文档列表(含是否处理中标记)
   */
  async listKmDocumentEx(request: ListKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<ListKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 解除文档与节点的挂载关系(不删除文档记录)
   * Summary: 解除文档与节点的挂载关系(不删除文档记录)
   */
  async unmountKmDocument(request: UnmountKmDocumentRequest): Promise<UnmountKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 解除文档与节点的挂载关系(不删除文档记录)
   * Summary: 解除文档与节点的挂载关系(不删除文档记录)
   */
  async unmountKmDocumentEx(request: UnmountKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 查询文档预览内容(MD正文)
   * Summary: 查询文档预览内容(MD正文)
   */
  async previewKmDocument(request: PreviewKmDocumentRequest): Promise<PreviewKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询文档预览内容(MD正文)
   * Summary: 查询文档预览内容(MD正文)
   */
  async previewKmDocumentEx(request: PreviewKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 查询文档段落切片列表(支持关键词过滤)
   * Summary: 查询文档段落切片列表(支持关键词过滤)
   */
  async segmentsKmDocument(request: SegmentsKmDocumentRequest): Promise<SegmentsKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.segmentsKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询文档段落切片列表(支持关键词过滤)
   * Summary: 查询文档段落切片列表(支持关键词过滤)
   */
  async segmentsKmDocumentEx(request: SegmentsKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SegmentsKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SegmentsKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.segments", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SegmentsKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 树内节点与文档统一搜索
   * Summary: 树内节点与文档统一搜索
   */
  async searchKmDocument(request: SearchKmDocumentRequest): Promise<SearchKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.searchKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 树内节点与文档统一搜索
   * Summary: 树内节点与文档统一搜索
   */
  async searchKmDocumentEx(request: SearchKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SearchKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SearchKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.search", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SearchKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 创建并发布知识库新版本
   * Summary: 创建并发布知识库新版本
   */
  async createKmVersion(request: CreateKmVersionRequest): Promise<CreateKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建并发布知识库新版本
   * Summary: 创建并发布知识库新版本
   */
  async createKmVersionEx(request: CreateKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateKmVersionResponse>(await this.doRequest("1.0", "antdigital.energent.km.version.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 查询知识库版本列表(分页)
   * Summary: 查询知识库版本列表(分页)
   */
  async listKmVersion(request: ListKmVersionRequest): Promise<ListKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询知识库版本列表(分页)
   * Summary: 查询知识库版本列表(分页)
   */
  async listKmVersionEx(request: ListKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListKmVersionResponse>(await this.doRequest("1.0", "antdigital.energent.km.version.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 查询版本详情(含JSON快照)
   * Summary: 查询版本详情(含JSON快照)
   */
  async detailKmVersion(request: DetailKmVersionRequest): Promise<DetailKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询版本详情(含JSON快照)
   * Summary: 查询版本详情(含JSON快照)
   */
  async detailKmVersionEx(request: DetailKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailKmVersionResponse>(await this.doRequest("1.0", "antdigital.energent.km.version.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 查询知识库下一个可用版本号
   * Summary: 查询知识库下一个可用版本号
   */
  async nextKmVersion(request: NextKmVersionRequest): Promise<NextKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.nextKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询知识库下一个可用版本号
   * Summary: 查询知识库下一个可用版本号
   */
  async nextKmVersionEx(request: NextKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NextKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<NextKmVersionResponse>(await this.doRequest("1.0", "antdigital.energent.km.version.next", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NextKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 激活知识库指定版本(回滚用)
   * Summary: 激活知识库指定版本(回滚用)
   */
  async activateKmVersion(request: ActivateKmVersionRequest): Promise<ActivateKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.activateKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 激活知识库指定版本(回滚用)
   * Summary: 激活知识库指定版本(回滚用)
   */
  async activateKmVersionEx(request: ActivateKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ActivateKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<ActivateKmVersionResponse>(await this.doRequest("1.0", "antdigital.energent.km.version.activate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ActivateKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 图谱节点详情与邻域展开
   * Summary: 图谱节点详情与邻域展开
   */
  async nodeKgGraph(request: NodeKgGraphRequest): Promise<NodeKgGraphResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.nodeKgGraphEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图谱节点详情与邻域展开
   * Summary: 图谱节点详情与邻域展开
   */
  async nodeKgGraphEx(request: NodeKgGraphRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NodeKgGraphResponse> {
    Util.validateModel(request);
    return $tea.cast<NodeKgGraphResponse>(await this.doRequest("1.0", "antdigital.energent.kg.graph.node", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NodeKgGraphResponse({}));
  }

  /**
   * @remarks
   * Description: 图谱节点分类与图例配置
   * Summary: 图谱节点分类与图例配置
   */
  async categoriesKgGraph(request: CategoriesKgGraphRequest): Promise<CategoriesKgGraphResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.categoriesKgGraphEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图谱节点分类与图例配置
   * Summary: 图谱节点分类与图例配置
   */
  async categoriesKgGraphEx(request: CategoriesKgGraphRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CategoriesKgGraphResponse> {
    Util.validateModel(request);
    return $tea.cast<CategoriesKgGraphResponse>(await this.doRequest("1.0", "antdigital.energent.kg.graph.categories", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CategoriesKgGraphResponse({}));
  }

  /**
   * @remarks
   * Description: 重试失败的图谱编译任务
   * Summary: 重试失败的图谱编译任务
   */
  async retryKgCompile(request: RetryKgCompileRequest): Promise<RetryKgCompileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryKgCompileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 重试失败的图谱编译任务
   * Summary: 重试失败的图谱编译任务
   */
  async retryKgCompileEx(request: RetryKgCompileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryKgCompileResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryKgCompileResponse>(await this.doRequest("1.0", "antdigital.energent.kg.compile.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryKgCompileResponse({}));
  }

  /**
   * @remarks
   * Description: 查询图谱编译任务列表(分页)
   * Summary: 查询图谱编译任务列表(分页)
   */
  async listKgCompile(request: ListKgCompileRequest): Promise<ListKgCompileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listKgCompileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询图谱编译任务列表(分页)
   * Summary: 查询图谱编译任务列表(分页)
   */
  async listKgCompileEx(request: ListKgCompileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListKgCompileResponse> {
    Util.validateModel(request);
    return $tea.cast<ListKgCompileResponse>(await this.doRequest("1.0", "antdigital.energent.kg.compile.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListKgCompileResponse({}));
  }

  /**
   * @remarks
   * Description: 基于已上传文件生成图谱本体Schema(不落库)
   * Summary: 基于已上传文件生成图谱本体Schema(不落库)
   */
  async extractschemaKmDocument(request: ExtractschemaKmDocumentRequest): Promise<ExtractschemaKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.extractschemaKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 基于已上传文件生成图谱本体Schema(不落库)
   * Summary: 基于已上传文件生成图谱本体Schema(不落库)
   */
  async extractschemaKmDocumentEx(request: ExtractschemaKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExtractschemaKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<ExtractschemaKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.extractschema", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExtractschemaKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 同级目录树节点拖拽排序
   * Summary: 同级目录树节点拖拽排序
   */
  async rankKmNode(request: RankKmNodeRequest): Promise<RankKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rankKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同级目录树节点拖拽排序
   * Summary: 同级目录树节点拖拽排序
   */
  async rankKmNodeEx(request: RankKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RankKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<RankKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.rank", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RankKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 同级目录树节点按序重排
   * Summary: 同级目录树节点按序重排
   */
  async reorderKmNode(request: ReorderKmNodeRequest): Promise<ReorderKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reorderKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同级目录树节点按序重排
   * Summary: 同级目录树节点按序重排
   */
  async reorderKmNodeEx(request: ReorderKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReorderKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<ReorderKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.reorder", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReorderKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 知识图谱全图查询(节点与关系)
   * Summary: 知识图谱全图查询(节点与关系)
   */
  async retrieveKgGraph(request: RetrieveKgGraphRequest): Promise<RetrieveKgGraphResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retrieveKgGraphEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识图谱全图查询(节点与关系)
   * Summary: 知识图谱全图查询(节点与关系)
   */
  async retrieveKgGraphEx(request: RetrieveKgGraphRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetrieveKgGraphResponse> {
    Util.validateModel(request);
    return $tea.cast<RetrieveKgGraphResponse>(await this.doRequest("1.0", "antdigital.energent.kg.graph.retrieve", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetrieveKgGraphResponse({}));
  }

  /**
   * @remarks
   * Description: 同级目录树节点按序重排
   * Summary: 同级目录树节点按序重排
   */
  async sortKmNode(request: SortKmNodeRequest): Promise<SortKmNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sortKmNodeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同级目录树节点按序重排
   * Summary: 同级目录树节点按序重排
   */
  async sortKmNodeEx(request: SortKmNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SortKmNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<SortKmNodeResponse>(await this.doRequest("1.0", "antdigital.energent.km.node.sort", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SortKmNodeResponse({}));
  }

  /**
   * @remarks
   * Description: 知识图谱全图查询(节点与关系)
   * Summary: 知识图谱全图查询(节点与关系)
   */
  async queryKgGraph(request: QueryKgGraphRequest): Promise<QueryKgGraphResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKgGraphEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识图谱全图查询(节点与关系)
   * Summary: 知识图谱全图查询(节点与关系)
   */
  async queryKgGraphEx(request: QueryKgGraphRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKgGraphResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKgGraphResponse>(await this.doRequest("1.0", "antdigital.energent.kg.graph.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKgGraphResponse({}));
  }

  /**
   * @remarks
   * Description: 知识库文件上传接入
   * Summary: 知识库文件上传接入
   */
  async fileuploadKmDocument(request: FileuploadKmDocumentRequest): Promise<FileuploadKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.fileuploadKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识库文件上传接入
   * Summary: 知识库文件上传接入
   */
  async fileuploadKmDocumentEx(request: FileuploadKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FileuploadKmDocumentResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.energent.km.document.fileupload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let fileuploadKmDocumentResponse = new FileuploadKmDocumentResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return fileuploadKmDocumentResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<FileuploadKmDocumentResponse>(await this.doRequest("1.0", "antdigital.energent.km.document.fileupload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FileuploadKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
