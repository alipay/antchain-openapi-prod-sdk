<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ENERGENT\Models\QueryKnowledgeRagRequest;
use AntChain\ENERGENT\Models\QueryKnowledgeRagResponse;
use AntChain\ENERGENT\Models\QueryEnergyknowledgeRagRequest;
use AntChain\ENERGENT\Models\QueryEnergyknowledgeRagResponse;
use AntChain\ENERGENT\Models\QueryEnergyknowledgeRagrecallRequest;
use AntChain\ENERGENT\Models\QueryEnergyknowledgeRagrecallResponse;
use AntChain\ENERGENT\Models\QueryKmKnowledgelistRequest;
use AntChain\ENERGENT\Models\QueryKmKnowledgelistResponse;
use AntChain\ENERGENT\Models\DeleteKmNodeRequest;
use AntChain\ENERGENT\Models\DeleteKmNodeResponse;
use AntChain\ENERGENT\Models\DetailKmTreeRequest;
use AntChain\ENERGENT\Models\DetailKmTreeResponse;
use AntChain\ENERGENT\Models\BatchimportKmDocumentRequest;
use AntChain\ENERGENT\Models\BatchimportKmDocumentResponse;
use AntChain\ENERGENT\Models\CreateKmTreeRequest;
use AntChain\ENERGENT\Models\CreateKmTreeResponse;
use AntChain\ENERGENT\Models\UpdateKmNodeRequest;
use AntChain\ENERGENT\Models\UpdateKmNodeResponse;
use AntChain\ENERGENT\Models\UpdateKmTreeRequest;
use AntChain\ENERGENT\Models\UpdateKmTreeResponse;
use AntChain\ENERGENT\Models\SchemaKmTreeRequest;
use AntChain\ENERGENT\Models\SchemaKmTreeResponse;
use AntChain\ENERGENT\Models\CreateKmNodeRequest;
use AntChain\ENERGENT\Models\CreateKmNodeResponse;
use AntChain\ENERGENT\Models\ListKmDocumentRequest;
use AntChain\ENERGENT\Models\ListKmDocumentResponse;
use AntChain\ENERGENT\Models\UnmountKmDocumentRequest;
use AntChain\ENERGENT\Models\UnmountKmDocumentResponse;
use AntChain\ENERGENT\Models\PreviewKmDocumentRequest;
use AntChain\ENERGENT\Models\PreviewKmDocumentResponse;
use AntChain\ENERGENT\Models\SegmentsKmDocumentRequest;
use AntChain\ENERGENT\Models\SegmentsKmDocumentResponse;
use AntChain\ENERGENT\Models\SearchKmDocumentRequest;
use AntChain\ENERGENT\Models\SearchKmDocumentResponse;
use AntChain\ENERGENT\Models\CreateKmVersionRequest;
use AntChain\ENERGENT\Models\CreateKmVersionResponse;
use AntChain\ENERGENT\Models\ListKmVersionRequest;
use AntChain\ENERGENT\Models\ListKmVersionResponse;
use AntChain\ENERGENT\Models\DetailKmVersionRequest;
use AntChain\ENERGENT\Models\DetailKmVersionResponse;
use AntChain\ENERGENT\Models\NextKmVersionRequest;
use AntChain\ENERGENT\Models\NextKmVersionResponse;
use AntChain\ENERGENT\Models\ActivateKmVersionRequest;
use AntChain\ENERGENT\Models\ActivateKmVersionResponse;
use AntChain\ENERGENT\Models\NodeKgGraphRequest;
use AntChain\ENERGENT\Models\NodeKgGraphResponse;
use AntChain\ENERGENT\Models\CategoriesKgGraphRequest;
use AntChain\ENERGENT\Models\CategoriesKgGraphResponse;
use AntChain\ENERGENT\Models\RetryKgCompileRequest;
use AntChain\ENERGENT\Models\RetryKgCompileResponse;
use AntChain\ENERGENT\Models\ListKgCompileRequest;
use AntChain\ENERGENT\Models\ListKgCompileResponse;
use AntChain\ENERGENT\Models\ExtractschemaKmDocumentRequest;
use AntChain\ENERGENT\Models\ExtractschemaKmDocumentResponse;
use AntChain\ENERGENT\Models\RankKmNodeRequest;
use AntChain\ENERGENT\Models\RankKmNodeResponse;
use AntChain\ENERGENT\Models\ReorderKmNodeRequest;
use AntChain\ENERGENT\Models\ReorderKmNodeResponse;
use AntChain\ENERGENT\Models\RetrieveKgGraphRequest;
use AntChain\ENERGENT\Models\RetrieveKgGraphResponse;
use AntChain\ENERGENT\Models\SortKmNodeRequest;
use AntChain\ENERGENT\Models\SortKmNodeResponse;
use AntChain\ENERGENT\Models\QueryKgGraphRequest;
use AntChain\ENERGENT\Models\QueryKgGraphResponse;
use AntChain\ENERGENT\Models\FileuploadKmDocumentRequest;
use AntChain\ENERGENT\Models\FileuploadKmDocumentResponse;
use AntChain\ENERGENT\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\ENERGENT\Models\CreateAntcloudGatewayxFileUploadResponse;

class Client {
    protected $_endpoint;

    protected $_regionId;

    protected $_accessKeyId;

    protected $_accessKeySecret;

    protected $_protocol;

    protected $_userAgent;

    protected $_readTimeout;

    protected $_connectTimeout;

    protected $_httpProxy;

    protected $_httpsProxy;

    protected $_socks5Proxy;

    protected $_socks5NetWork;

    protected $_noProxy;

    protected $_maxIdleConns;

    protected $_securityToken;

    protected $_maxIdleTimeMillis;

    protected $_keepAliveDurationMillis;

    protected $_maxRequests;

    protected $_maxRequestsPerHost;

    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct($config){
        if (Utils::isUnset($config)) {
            throw new TeaError([
                "code" => "ParameterMissing",
                "message" => "'config' can not be unset"
            ]);
        }
        $this->_accessKeyId = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken = $config->securityToken;
        $this->_endpoint = $config->endpoint;
        $this->_protocol = $config->protocol;
        $this->_userAgent = $config->userAgent;
        $this->_readTimeout = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param mixed[] $request which contains request params
     * @param string[] $headers
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            "maxIdleTimeMillis" => $this->_maxIdleTimeMillis,
            "keepAliveDuration" => $this->_keepAliveDurationMillis,
            "maxRequests" => $this->_maxRequests,
            "maxRequestsPerHost" => $this->_maxRequestsPerHost,
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry(@$_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime["backoff"], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;
            try {
                $_request = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method = $method;
                $_request->pathname = $pathname;
                $_request->query = [
                    "method" => $action,
                    "version" => $version,
                    "sign_type" => "HmacSHA1",
                    "req_time" => UtilClient::getTimestamp(),
                    "req_msg_id" => UtilClient::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "base_sdk_version" => "TeaSDK-2.0",
                    "sdk_version" => "1.0.4",
                    "_prod_code" => "ENERGENT",
                    "_prod_channel" => "default"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    "host" => Utils::defaultString($this->_endpoint, "openapi.antchain.antgroup.com"),
                    "user-agent" => Utils::getUserAgent($this->_userAgent)
                ], $headers);
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $raw = Utils::readAsString($_response->body);
                $obj = Utils::parseJSON($raw);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap(@$res["response"]);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        "message" => @$resp["result_msg"],
                        "data" => $resp,
                        "code" => @$resp["result_code"]
                    ]);
                }
                return $resp;
            }
            catch (Exception $e) {
                if (!($e instanceof TeaError)) {
                    $e = new TeaError([], $e->getMessage(), $e->getCode(), $e);
                }
                if (Tea::isRetryable($e)) {
                    $_lastException = $e;
                    continue;
                }
                throw $e;
            }
        }
        throw new TeaUnableRetryError($_lastRequest, $_lastException);
    }

    /**
     * Description: 知识库rag 检索
     * Summary: 知识库rag 检索
     * @param QueryKnowledgeRagRequest $request
     * @return QueryKnowledgeRagResponse
     */
    public function queryKnowledgeRag($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryKnowledgeRagEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库rag 检索
     * Summary: 知识库rag 检索
     * @param QueryKnowledgeRagRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryKnowledgeRagResponse
     */
    public function queryKnowledgeRagEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryKnowledgeRagResponse::fromMap($this->doRequest("1.0", "antdigital.energent.knowledge.rag.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: rag检索
     * Summary: rag检索
     * @param QueryEnergyknowledgeRagRequest $request
     * @return QueryEnergyknowledgeRagResponse
     */
    public function queryEnergyknowledgeRag($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryEnergyknowledgeRagEx($request, $headers, $runtime);
    }

    /**
     * Description: rag检索
     * Summary: rag检索
     * @param QueryEnergyknowledgeRagRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryEnergyknowledgeRagResponse
     */
    public function queryEnergyknowledgeRagEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryEnergyknowledgeRagResponse::fromMap($this->doRequest("1.0", "antdigital.energent.energyknowledge.rag.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识图谱rag召回
     * Summary: 知识图谱rag召回
     * @param QueryEnergyknowledgeRagrecallRequest $request
     * @return QueryEnergyknowledgeRagrecallResponse
     */
    public function queryEnergyknowledgeRagrecall($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryEnergyknowledgeRagrecallEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识图谱rag召回
     * Summary: 知识图谱rag召回
     * @param QueryEnergyknowledgeRagrecallRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryEnergyknowledgeRagrecallResponse
     */
    public function queryEnergyknowledgeRagrecallEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryEnergyknowledgeRagrecallResponse::fromMap($this->doRequest("1.0", "antdigital.energent.energyknowledge.ragrecall.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库列表
     * Summary: 知识库列表
     * @param QueryKmKnowledgelistRequest $request
     * @return QueryKmKnowledgelistResponse
     */
    public function queryKmKnowledgelist($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryKmKnowledgelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库列表
     * Summary: 知识库列表
     * @param QueryKmKnowledgelistRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryKmKnowledgelistResponse
     */
    public function queryKmKnowledgelistEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryKmKnowledgelistResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.knowledgelist.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除目录树节点(级联子节点与挂载)
     * Summary: 删除目录树节点(级联子节点与挂载)
     * @param DeleteKmNodeRequest $request
     * @return DeleteKmNodeResponse
     */
    public function deleteKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除目录树节点(级联子节点与挂载)
     * Summary: 删除目录树节点(级联子节点与挂载)
     * @param DeleteKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteKmNodeResponse
     */
    public function deleteKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * @param DetailKmTreeRequest $request
     * @return DetailKmTreeResponse
     */
    public function detailKmTree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailKmTreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * @param DetailKmTreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailKmTreeResponse
     */
    public function detailKmTreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailKmTreeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.tree.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按OSS地址批量入库--
     * Summary: 按OSS地址批量入库--
     * @param BatchimportKmDocumentRequest $request
     * @return BatchimportKmDocumentResponse
     */
    public function batchimportKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchimportKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 按OSS地址批量入库--
     * Summary: 按OSS地址批量入库--
     * @param BatchimportKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchimportKmDocumentResponse
     */
    public function batchimportKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchimportKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.batchimport", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建知识库
     * Summary: 创建知识库
     * @param CreateKmTreeRequest $request
     * @return CreateKmTreeResponse
     */
    public function createKmTree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createKmTreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建知识库
     * Summary: 创建知识库
     * @param CreateKmTreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateKmTreeResponse
     */
    public function createKmTreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateKmTreeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.tree.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑目录树节点槽位信息
     * Summary: 编辑目录树节点槽位信息
     * @param UpdateKmNodeRequest $request
     * @return UpdateKmNodeResponse
     */
    public function updateKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑目录树节点槽位信息
     * Summary: 编辑目录树节点槽位信息
     * @param UpdateKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateKmNodeResponse
     */
    public function updateKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新知识库基础信息
     * Summary: 更新知识库基础信息
     * @param UpdateKmTreeRequest $request
     * @return UpdateKmTreeResponse
     */
    public function updateKmTree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateKmTreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新知识库基础信息
     * Summary: 更新知识库基础信息
     * @param UpdateKmTreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateKmTreeResponse
     */
    public function updateKmTreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateKmTreeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.tree.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询知识库图谱关系模板Schema
     * Summary: 查询知识库图谱关系模板Schema
     * @param SchemaKmTreeRequest $request
     * @return SchemaKmTreeResponse
     */
    public function schemaKmTree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->schemaKmTreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询知识库图谱关系模板Schema
     * Summary: 查询知识库图谱关系模板Schema
     * @param SchemaKmTreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SchemaKmTreeResponse
     */
    public function schemaKmTreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SchemaKmTreeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.tree.schema", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目录树中创建节点(挂父节点槽位)
     * Summary: 目录树中创建节点(挂父节点槽位)
     * @param CreateKmNodeRequest $request
     * @return CreateKmNodeResponse
     */
    public function createKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 目录树中创建节点(挂父节点槽位)
     * Summary: 目录树中创建节点(挂父节点槽位)
     * @param CreateKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateKmNodeResponse
     */
    public function createKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询节点下挂载的文档列表(含是否处理中标记)
     * Summary: 查询节点下挂载的文档列表(含是否处理中标记)
     * @param ListKmDocumentRequest $request
     * @return ListKmDocumentResponse
     */
    public function listKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询节点下挂载的文档列表(含是否处理中标记)
     * Summary: 查询节点下挂载的文档列表(含是否处理中标记)
     * @param ListKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListKmDocumentResponse
     */
    public function listKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解除文档与节点的挂载关系(不删除文档记录)
     * Summary: 解除文档与节点的挂载关系(不删除文档记录)
     * @param UnmountKmDocumentRequest $request
     * @return UnmountKmDocumentResponse
     */
    public function unmountKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->unmountKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 解除文档与节点的挂载关系(不删除文档记录)
     * Summary: 解除文档与节点的挂载关系(不删除文档记录)
     * @param UnmountKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UnmountKmDocumentResponse
     */
    public function unmountKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UnmountKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.unmount", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文档预览内容(MD正文)
     * Summary: 查询文档预览内容(MD正文)
     * @param PreviewKmDocumentRequest $request
     * @return PreviewKmDocumentResponse
     */
    public function previewKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->previewKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文档预览内容(MD正文)
     * Summary: 查询文档预览内容(MD正文)
     * @param PreviewKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PreviewKmDocumentResponse
     */
    public function previewKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PreviewKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.preview", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文档段落切片列表(支持关键词过滤)
     * Summary: 查询文档段落切片列表(支持关键词过滤)
     * @param SegmentsKmDocumentRequest $request
     * @return SegmentsKmDocumentResponse
     */
    public function segmentsKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->segmentsKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文档段落切片列表(支持关键词过滤)
     * Summary: 查询文档段落切片列表(支持关键词过滤)
     * @param SegmentsKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SegmentsKmDocumentResponse
     */
    public function segmentsKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SegmentsKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.segments", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 树内节点与文档统一搜索
     * Summary: 树内节点与文档统一搜索
     * @param SearchKmDocumentRequest $request
     * @return SearchKmDocumentResponse
     */
    public function searchKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->searchKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 树内节点与文档统一搜索
     * Summary: 树内节点与文档统一搜索
     * @param SearchKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SearchKmDocumentResponse
     */
    public function searchKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SearchKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.search", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建并发布知识库新版本
     * Summary: 创建并发布知识库新版本
     * @param CreateKmVersionRequest $request
     * @return CreateKmVersionResponse
     */
    public function createKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建并发布知识库新版本
     * Summary: 创建并发布知识库新版本
     * @param CreateKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateKmVersionResponse
     */
    public function createKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateKmVersionResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.version.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询知识库版本列表(分页)
     * Summary: 查询知识库版本列表(分页)
     * @param ListKmVersionRequest $request
     * @return ListKmVersionResponse
     */
    public function listKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询知识库版本列表(分页)
     * Summary: 查询知识库版本列表(分页)
     * @param ListKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListKmVersionResponse
     */
    public function listKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListKmVersionResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.version.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版本详情(含JSON快照)
     * Summary: 查询版本详情(含JSON快照)
     * @param DetailKmVersionRequest $request
     * @return DetailKmVersionResponse
     */
    public function detailKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->detailKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版本详情(含JSON快照)
     * Summary: 查询版本详情(含JSON快照)
     * @param DetailKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DetailKmVersionResponse
     */
    public function detailKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DetailKmVersionResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.version.detail", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询知识库下一个可用版本号
     * Summary: 查询知识库下一个可用版本号
     * @param NextKmVersionRequest $request
     * @return NextKmVersionResponse
     */
    public function nextKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->nextKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询知识库下一个可用版本号
     * Summary: 查询知识库下一个可用版本号
     * @param NextKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return NextKmVersionResponse
     */
    public function nextKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return NextKmVersionResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.version.next", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 激活知识库指定版本(回滚用)
     * Summary: 激活知识库指定版本(回滚用)
     * @param ActivateKmVersionRequest $request
     * @return ActivateKmVersionResponse
     */
    public function activateKmVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->activateKmVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 激活知识库指定版本(回滚用)
     * Summary: 激活知识库指定版本(回滚用)
     * @param ActivateKmVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ActivateKmVersionResponse
     */
    public function activateKmVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ActivateKmVersionResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.version.activate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图谱节点详情与邻域展开
     * Summary: 图谱节点详情与邻域展开
     * @param NodeKgGraphRequest $request
     * @return NodeKgGraphResponse
     */
    public function nodeKgGraph($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->nodeKgGraphEx($request, $headers, $runtime);
    }

    /**
     * Description: 图谱节点详情与邻域展开
     * Summary: 图谱节点详情与邻域展开
     * @param NodeKgGraphRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return NodeKgGraphResponse
     */
    public function nodeKgGraphEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return NodeKgGraphResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.graph.node", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图谱节点分类与图例配置
     * Summary: 图谱节点分类与图例配置
     * @param CategoriesKgGraphRequest $request
     * @return CategoriesKgGraphResponse
     */
    public function categoriesKgGraph($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->categoriesKgGraphEx($request, $headers, $runtime);
    }

    /**
     * Description: 图谱节点分类与图例配置
     * Summary: 图谱节点分类与图例配置
     * @param CategoriesKgGraphRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CategoriesKgGraphResponse
     */
    public function categoriesKgGraphEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CategoriesKgGraphResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.graph.categories", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试失败的图谱编译任务
     * Summary: 重试失败的图谱编译任务
     * @param RetryKgCompileRequest $request
     * @return RetryKgCompileResponse
     */
    public function retryKgCompile($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryKgCompileEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试失败的图谱编译任务
     * Summary: 重试失败的图谱编译任务
     * @param RetryKgCompileRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryKgCompileResponse
     */
    public function retryKgCompileEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryKgCompileResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.compile.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询图谱编译任务列表(分页)
     * Summary: 查询图谱编译任务列表(分页)
     * @param ListKgCompileRequest $request
     * @return ListKgCompileResponse
     */
    public function listKgCompile($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listKgCompileEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询图谱编译任务列表(分页)
     * Summary: 查询图谱编译任务列表(分页)
     * @param ListKgCompileRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListKgCompileResponse
     */
    public function listKgCompileEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListKgCompileResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.compile.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于已上传文件生成图谱本体Schema(不落库)
     * Summary: 基于已上传文件生成图谱本体Schema(不落库)
     * @param ExtractschemaKmDocumentRequest $request
     * @return ExtractschemaKmDocumentResponse
     */
    public function extractschemaKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->extractschemaKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于已上传文件生成图谱本体Schema(不落库)
     * Summary: 基于已上传文件生成图谱本体Schema(不落库)
     * @param ExtractschemaKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExtractschemaKmDocumentResponse
     */
    public function extractschemaKmDocumentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExtractschemaKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.extractschema", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同级目录树节点拖拽排序
     * Summary: 同级目录树节点拖拽排序
     * @param RankKmNodeRequest $request
     * @return RankKmNodeResponse
     */
    public function rankKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rankKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 同级目录树节点拖拽排序
     * Summary: 同级目录树节点拖拽排序
     * @param RankKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RankKmNodeResponse
     */
    public function rankKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RankKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.rank", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排
     * @param ReorderKmNodeRequest $request
     * @return ReorderKmNodeResponse
     */
    public function reorderKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reorderKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排
     * @param ReorderKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReorderKmNodeResponse
     */
    public function reorderKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReorderKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.reorder", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)
     * @param RetrieveKgGraphRequest $request
     * @return RetrieveKgGraphResponse
     */
    public function retrieveKgGraph($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retrieveKgGraphEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)
     * @param RetrieveKgGraphRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetrieveKgGraphResponse
     */
    public function retrieveKgGraphEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetrieveKgGraphResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.graph.retrieve", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排
     * @param SortKmNodeRequest $request
     * @return SortKmNodeResponse
     */
    public function sortKmNode($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->sortKmNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排
     * @param SortKmNodeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SortKmNodeResponse
     */
    public function sortKmNodeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SortKmNodeResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.node.sort", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)
     * @param QueryKgGraphRequest $request
     * @return QueryKgGraphResponse
     */
    public function queryKgGraph($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryKgGraphEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)
     * @param QueryKgGraphRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryKgGraphResponse
     */
    public function queryKgGraphEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryKgGraphResponse::fromMap($this->doRequest("1.0", "antdigital.energent.kg.graph.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库文件上传接入
     * Summary: 知识库文件上传接入
     * @param FileuploadKmDocumentRequest $request
     * @return FileuploadKmDocumentResponse
     */
    public function fileuploadKmDocument($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->fileuploadKmDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库文件上传接入
     * Summary: 知识库文件上传接入
     * @param FileuploadKmDocumentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return FileuploadKmDocumentResponse
     */
    public function fileuploadKmDocumentEx($request, $headers, $runtime){
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                "authToken" => $request->authToken,
                "apiCode" => "antdigital.energent.km.document.fileupload",
                "fileName" => $request->fileObjectName
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, "ok")) {
                $fileuploadKmDocumentResponse = new FileuploadKmDocumentResponse([
                    "reqMsgId" => $uploadResp->reqMsgId,
                    "resultCode" => $uploadResp->resultCode,
                    "resultMsg" => $uploadResp->resultMsg
                ]);
                return $fileuploadKmDocumentResponse;
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);
        return FileuploadKmDocumentResponse::fromMap($this->doRequest("1.0", "antdigital.energent.km.document.fileupload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
