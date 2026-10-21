# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_energent import models as energent_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from alibabacloud_rpc_util.client import Client as RPCUtilClient


class Client:
    _endpoint: str = None
    _region_id: str = None
    _access_key_id: str = None
    _access_key_secret: str = None
    _protocol: str = None
    _user_agent: str = None
    _read_timeout: int = None
    _connect_timeout: int = None
    _http_proxy: str = None
    _https_proxy: str = None
    _socks_5proxy: str = None
    _socks_5net_work: str = None
    _no_proxy: str = None
    _max_idle_conns: int = None
    _security_token: str = None
    _max_idle_time_millis: int = None
    _keep_alive_duration_millis: int = None
    _max_requests: int = None
    _max_requests_per_host: int = None

    def __init__(
        self, 
        config: energent_models.Config,
    ):
        """
        Init client with Config
        @param config: config contains the necessary information to create a client
        """
        if UtilClient.is_unset(config):
            raise TeaException({
                'code': 'ParameterMissing',
                'message': "'config' can not be unset"
            })
        self._access_key_id = config.access_key_id
        self._access_key_secret = config.access_key_secret
        self._security_token = config.security_token
        self._endpoint = config.endpoint
        self._protocol = config.protocol
        self._user_agent = config.user_agent
        self._read_timeout = UtilClient.default_number(config.read_timeout, 20000)
        self._connect_timeout = UtilClient.default_number(config.connect_timeout, 20000)
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = UtilClient.default_number(config.max_idle_conns, 60000)
        self._max_idle_time_millis = UtilClient.default_number(config.max_idle_time_millis, 5)
        self._keep_alive_duration_millis = UtilClient.default_number(config.keep_alive_duration_millis, 5000)
        self._max_requests = UtilClient.default_number(config.max_requests, 100)
        self._max_requests_per_host = UtilClient.default_number(config.max_requests_per_host, 100)

    def do_request(
        self,
        version: str,
        action: str,
        protocol: str,
        method: str,
        pathname: str,
        request: dict,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dict:
        """
        Encapsulate the request and invoke the network
        @param action: api name
        @param protocol: http or https
        @param method: e.g. GET
        @param pathname: pathname of every api
        @param request: which contains request params
        @param runtime: which controls some details of call api, such as retry times
        @return: the response
        """
        runtime.validate()
        _runtime = {
            'timeouted': 'retry',
            'readTimeout': UtilClient.default_number(runtime.read_timeout, self._read_timeout),
            'connectTimeout': UtilClient.default_number(runtime.connect_timeout, self._connect_timeout),
            'httpProxy': UtilClient.default_string(runtime.http_proxy, self._http_proxy),
            'httpsProxy': UtilClient.default_string(runtime.https_proxy, self._https_proxy),
            'noProxy': UtilClient.default_string(runtime.no_proxy, self._no_proxy),
            'maxIdleConns': UtilClient.default_number(runtime.max_idle_conns, self._max_idle_conns),
            'maxIdleTimeMillis': self._max_idle_time_millis,
            'keepAliveDuration': self._keep_alive_duration_millis,
            'maxRequests': self._max_requests,
            'maxRequestsPerHost': self._max_requests_per_host,
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl
        }
        _last_request = None
        _last_exception = None
        _now = time.time()
        _retry_times = 0
        while TeaCore.allow_retry(_runtime.get('retry'), _retry_times, _now):
            if _retry_times > 0:
                _backoff_time = TeaCore.get_backoff_time(_runtime.get('backoff'), _retry_times)
                if _backoff_time > 0:
                    TeaCore.sleep(_backoff_time)
            _retry_times = _retry_times + 1
            try:
                _request = TeaRequest()
                _request.protocol = UtilClient.default_string(self._protocol, protocol)
                _request.method = method
                _request.pathname = pathname
                _request.query = {
                    'method': action,
                    'version': version,
                    'sign_type': 'HmacSHA1',
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.0.4',
                    '_prod_code': 'ENERGENT',
                    '_prod_channel': 'default'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtils.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtils.has_error(raw, self._access_key_secret):
                    raise TeaException({
                        'message': resp.get('result_msg'),
                        'data': resp,
                        'code': resp.get('result_code')
                    })
                return resp
            except Exception as e:
                if TeaCore.is_retryable(e):
                    _last_exception = e
                    continue
                raise e
        raise UnretryableException(_last_request, _last_exception)

    async def do_request_async(
        self,
        version: str,
        action: str,
        protocol: str,
        method: str,
        pathname: str,
        request: dict,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dict:
        """
        Encapsulate the request and invoke the network
        @param action: api name
        @param protocol: http or https
        @param method: e.g. GET
        @param pathname: pathname of every api
        @param request: which contains request params
        @param runtime: which controls some details of call api, such as retry times
        @return: the response
        """
        runtime.validate()
        _runtime = {
            'timeouted': 'retry',
            'readTimeout': UtilClient.default_number(runtime.read_timeout, self._read_timeout),
            'connectTimeout': UtilClient.default_number(runtime.connect_timeout, self._connect_timeout),
            'httpProxy': UtilClient.default_string(runtime.http_proxy, self._http_proxy),
            'httpsProxy': UtilClient.default_string(runtime.https_proxy, self._https_proxy),
            'noProxy': UtilClient.default_string(runtime.no_proxy, self._no_proxy),
            'maxIdleConns': UtilClient.default_number(runtime.max_idle_conns, self._max_idle_conns),
            'maxIdleTimeMillis': self._max_idle_time_millis,
            'keepAliveDuration': self._keep_alive_duration_millis,
            'maxRequests': self._max_requests,
            'maxRequestsPerHost': self._max_requests_per_host,
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl
        }
        _last_request = None
        _last_exception = None
        _now = time.time()
        _retry_times = 0
        while TeaCore.allow_retry(_runtime.get('retry'), _retry_times, _now):
            if _retry_times > 0:
                _backoff_time = TeaCore.get_backoff_time(_runtime.get('backoff'), _retry_times)
                if _backoff_time > 0:
                    TeaCore.sleep(_backoff_time)
            _retry_times = _retry_times + 1
            try:
                _request = TeaRequest()
                _request.protocol = UtilClient.default_string(self._protocol, protocol)
                _request.method = method
                _request.pathname = pathname
                _request.query = {
                    'method': action,
                    'version': version,
                    'sign_type': 'HmacSHA1',
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.0.4',
                    '_prod_code': 'ENERGENT',
                    '_prod_channel': 'default'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtils.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtils.has_error(raw, self._access_key_secret):
                    raise TeaException({
                        'message': resp.get('result_msg'),
                        'data': resp,
                        'code': resp.get('result_code')
                    })
                return resp
            except Exception as e:
                if TeaCore.is_retryable(e):
                    _last_exception = e
                    continue
                raise e
        raise UnretryableException(_last_request, _last_exception)

    def query_knowledge_rag(
        self,
        request: energent_models.QueryKnowledgeRagRequest,
    ) -> energent_models.QueryKnowledgeRagResponse:
        """
        Description: 知识库rag 检索
        Summary: 知识库rag 检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_knowledge_rag_ex(request, headers, runtime)

    async def query_knowledge_rag_async(
        self,
        request: energent_models.QueryKnowledgeRagRequest,
    ) -> energent_models.QueryKnowledgeRagResponse:
        """
        Description: 知识库rag 检索
        Summary: 知识库rag 检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_knowledge_rag_ex_async(request, headers, runtime)

    def query_knowledge_rag_ex(
        self,
        request: energent_models.QueryKnowledgeRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKnowledgeRagResponse:
        """
        Description: 知识库rag 检索
        Summary: 知识库rag 检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKnowledgeRagResponse(),
            self.do_request('1.0', 'antdigital.energent.knowledge.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_knowledge_rag_ex_async(
        self,
        request: energent_models.QueryKnowledgeRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKnowledgeRagResponse:
        """
        Description: 知识库rag 检索
        Summary: 知识库rag 检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKnowledgeRagResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.knowledge.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_energyknowledge_rag(
        self,
        request: energent_models.QueryEnergyknowledgeRagRequest,
    ) -> energent_models.QueryEnergyknowledgeRagResponse:
        """
        Description: rag检索
        Summary: rag检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_energyknowledge_rag_ex(request, headers, runtime)

    async def query_energyknowledge_rag_async(
        self,
        request: energent_models.QueryEnergyknowledgeRagRequest,
    ) -> energent_models.QueryEnergyknowledgeRagResponse:
        """
        Description: rag检索
        Summary: rag检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_energyknowledge_rag_ex_async(request, headers, runtime)

    def query_energyknowledge_rag_ex(
        self,
        request: energent_models.QueryEnergyknowledgeRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryEnergyknowledgeRagResponse:
        """
        Description: rag检索
        Summary: rag检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryEnergyknowledgeRagResponse(),
            self.do_request('1.0', 'antdigital.energent.energyknowledge.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_energyknowledge_rag_ex_async(
        self,
        request: energent_models.QueryEnergyknowledgeRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryEnergyknowledgeRagResponse:
        """
        Description: rag检索
        Summary: rag检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryEnergyknowledgeRagResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.energyknowledge.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_energyknowledge_ragrecall(
        self,
        request: energent_models.QueryEnergyknowledgeRagrecallRequest,
    ) -> energent_models.QueryEnergyknowledgeRagrecallResponse:
        """
        Description: 知识图谱rag召回
        Summary: 知识图谱rag召回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_energyknowledge_ragrecall_ex(request, headers, runtime)

    async def query_energyknowledge_ragrecall_async(
        self,
        request: energent_models.QueryEnergyknowledgeRagrecallRequest,
    ) -> energent_models.QueryEnergyknowledgeRagrecallResponse:
        """
        Description: 知识图谱rag召回
        Summary: 知识图谱rag召回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_energyknowledge_ragrecall_ex_async(request, headers, runtime)

    def query_energyknowledge_ragrecall_ex(
        self,
        request: energent_models.QueryEnergyknowledgeRagrecallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryEnergyknowledgeRagrecallResponse:
        """
        Description: 知识图谱rag召回
        Summary: 知识图谱rag召回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryEnergyknowledgeRagrecallResponse(),
            self.do_request('1.0', 'antdigital.energent.energyknowledge.ragrecall.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_energyknowledge_ragrecall_ex_async(
        self,
        request: energent_models.QueryEnergyknowledgeRagrecallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryEnergyknowledgeRagrecallResponse:
        """
        Description: 知识图谱rag召回
        Summary: 知识图谱rag召回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryEnergyknowledgeRagrecallResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.energyknowledge.ragrecall.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_km_knowledgelist(
        self,
        request: energent_models.QueryKmKnowledgelistRequest,
    ) -> energent_models.QueryKmKnowledgelistResponse:
        """
        Description: 知识库列表
        Summary: 知识库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_km_knowledgelist_ex(request, headers, runtime)

    async def query_km_knowledgelist_async(
        self,
        request: energent_models.QueryKmKnowledgelistRequest,
    ) -> energent_models.QueryKmKnowledgelistResponse:
        """
        Description: 知识库列表
        Summary: 知识库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_km_knowledgelist_ex_async(request, headers, runtime)

    def query_km_knowledgelist_ex(
        self,
        request: energent_models.QueryKmKnowledgelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKmKnowledgelistResponse:
        """
        Description: 知识库列表
        Summary: 知识库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKmKnowledgelistResponse(),
            self.do_request('1.0', 'antdigital.energent.km.knowledgelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_km_knowledgelist_ex_async(
        self,
        request: energent_models.QueryKmKnowledgelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKmKnowledgelistResponse:
        """
        Description: 知识库列表
        Summary: 知识库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKmKnowledgelistResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.knowledgelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_km_node(
        self,
        request: energent_models.DeleteKmNodeRequest,
    ) -> energent_models.DeleteKmNodeResponse:
        """
        Description: 删除目录树节点(级联子节点与挂载)
        Summary: 删除目录树节点(级联子节点与挂载)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_km_node_ex(request, headers, runtime)

    async def delete_km_node_async(
        self,
        request: energent_models.DeleteKmNodeRequest,
    ) -> energent_models.DeleteKmNodeResponse:
        """
        Description: 删除目录树节点(级联子节点与挂载)
        Summary: 删除目录树节点(级联子节点与挂载)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_km_node_ex_async(request, headers, runtime)

    def delete_km_node_ex(
        self,
        request: energent_models.DeleteKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DeleteKmNodeResponse:
        """
        Description: 删除目录树节点(级联子节点与挂载)
        Summary: 删除目录树节点(级联子节点与挂载)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DeleteKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_km_node_ex_async(
        self,
        request: energent_models.DeleteKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DeleteKmNodeResponse:
        """
        Description: 删除目录树节点(级联子节点与挂载)
        Summary: 删除目录树节点(级联子节点与挂载)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DeleteKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_km_tree(
        self,
        request: energent_models.DetailKmTreeRequest,
    ) -> energent_models.DetailKmTreeResponse:
        """
        Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_km_tree_ex(request, headers, runtime)

    async def detail_km_tree_async(
        self,
        request: energent_models.DetailKmTreeRequest,
    ) -> energent_models.DetailKmTreeResponse:
        """
        Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_km_tree_ex_async(request, headers, runtime)

    def detail_km_tree_ex(
        self,
        request: energent_models.DetailKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DetailKmTreeResponse:
        """
        Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DetailKmTreeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.tree.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_km_tree_ex_async(
        self,
        request: energent_models.DetailKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DetailKmTreeResponse:
        """
        Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DetailKmTreeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.tree.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchimport_km_document(
        self,
        request: energent_models.BatchimportKmDocumentRequest,
    ) -> energent_models.BatchimportKmDocumentResponse:
        """
        Description: 按OSS地址批量入库--\
        Summary: 按OSS地址批量入库--\
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchimport_km_document_ex(request, headers, runtime)

    async def batchimport_km_document_async(
        self,
        request: energent_models.BatchimportKmDocumentRequest,
    ) -> energent_models.BatchimportKmDocumentResponse:
        """
        Description: 按OSS地址批量入库--\
        Summary: 按OSS地址批量入库--\
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchimport_km_document_ex_async(request, headers, runtime)

    def batchimport_km_document_ex(
        self,
        request: energent_models.BatchimportKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.BatchimportKmDocumentResponse:
        """
        Description: 按OSS地址批量入库--\
        Summary: 按OSS地址批量入库--\
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.BatchimportKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.batchimport', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchimport_km_document_ex_async(
        self,
        request: energent_models.BatchimportKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.BatchimportKmDocumentResponse:
        """
        Description: 按OSS地址批量入库--\
        Summary: 按OSS地址批量入库--\
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.BatchimportKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.batchimport', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_km_tree(
        self,
        request: energent_models.CreateKmTreeRequest,
    ) -> energent_models.CreateKmTreeResponse:
        """
        Description: 创建知识库
        Summary: 创建知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_km_tree_ex(request, headers, runtime)

    async def create_km_tree_async(
        self,
        request: energent_models.CreateKmTreeRequest,
    ) -> energent_models.CreateKmTreeResponse:
        """
        Description: 创建知识库
        Summary: 创建知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_km_tree_ex_async(request, headers, runtime)

    def create_km_tree_ex(
        self,
        request: energent_models.CreateKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmTreeResponse:
        """
        Description: 创建知识库
        Summary: 创建知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmTreeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.tree.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_km_tree_ex_async(
        self,
        request: energent_models.CreateKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmTreeResponse:
        """
        Description: 创建知识库
        Summary: 创建知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmTreeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.tree.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_km_node(
        self,
        request: energent_models.UpdateKmNodeRequest,
    ) -> energent_models.UpdateKmNodeResponse:
        """
        Description: 编辑目录树节点槽位信息
        Summary: 编辑目录树节点槽位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_km_node_ex(request, headers, runtime)

    async def update_km_node_async(
        self,
        request: energent_models.UpdateKmNodeRequest,
    ) -> energent_models.UpdateKmNodeResponse:
        """
        Description: 编辑目录树节点槽位信息
        Summary: 编辑目录树节点槽位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_km_node_ex_async(request, headers, runtime)

    def update_km_node_ex(
        self,
        request: energent_models.UpdateKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UpdateKmNodeResponse:
        """
        Description: 编辑目录树节点槽位信息
        Summary: 编辑目录树节点槽位信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UpdateKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_km_node_ex_async(
        self,
        request: energent_models.UpdateKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UpdateKmNodeResponse:
        """
        Description: 编辑目录树节点槽位信息
        Summary: 编辑目录树节点槽位信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UpdateKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_km_tree(
        self,
        request: energent_models.UpdateKmTreeRequest,
    ) -> energent_models.UpdateKmTreeResponse:
        """
        Description: 更新知识库基础信息
        Summary: 更新知识库基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_km_tree_ex(request, headers, runtime)

    async def update_km_tree_async(
        self,
        request: energent_models.UpdateKmTreeRequest,
    ) -> energent_models.UpdateKmTreeResponse:
        """
        Description: 更新知识库基础信息
        Summary: 更新知识库基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_km_tree_ex_async(request, headers, runtime)

    def update_km_tree_ex(
        self,
        request: energent_models.UpdateKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UpdateKmTreeResponse:
        """
        Description: 更新知识库基础信息
        Summary: 更新知识库基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UpdateKmTreeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.tree.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_km_tree_ex_async(
        self,
        request: energent_models.UpdateKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UpdateKmTreeResponse:
        """
        Description: 更新知识库基础信息
        Summary: 更新知识库基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UpdateKmTreeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.tree.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def schema_km_tree(
        self,
        request: energent_models.SchemaKmTreeRequest,
    ) -> energent_models.SchemaKmTreeResponse:
        """
        Description: 查询知识库图谱关系模板Schema
        Summary: 查询知识库图谱关系模板Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.schema_km_tree_ex(request, headers, runtime)

    async def schema_km_tree_async(
        self,
        request: energent_models.SchemaKmTreeRequest,
    ) -> energent_models.SchemaKmTreeResponse:
        """
        Description: 查询知识库图谱关系模板Schema
        Summary: 查询知识库图谱关系模板Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.schema_km_tree_ex_async(request, headers, runtime)

    def schema_km_tree_ex(
        self,
        request: energent_models.SchemaKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SchemaKmTreeResponse:
        """
        Description: 查询知识库图谱关系模板Schema
        Summary: 查询知识库图谱关系模板Schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SchemaKmTreeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.tree.schema', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def schema_km_tree_ex_async(
        self,
        request: energent_models.SchemaKmTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SchemaKmTreeResponse:
        """
        Description: 查询知识库图谱关系模板Schema
        Summary: 查询知识库图谱关系模板Schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SchemaKmTreeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.tree.schema', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_km_node(
        self,
        request: energent_models.CreateKmNodeRequest,
    ) -> energent_models.CreateKmNodeResponse:
        """
        Description: 目录树中创建节点(挂父节点槽位)
        Summary: 目录树中创建节点(挂父节点槽位)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_km_node_ex(request, headers, runtime)

    async def create_km_node_async(
        self,
        request: energent_models.CreateKmNodeRequest,
    ) -> energent_models.CreateKmNodeResponse:
        """
        Description: 目录树中创建节点(挂父节点槽位)
        Summary: 目录树中创建节点(挂父节点槽位)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_km_node_ex_async(request, headers, runtime)

    def create_km_node_ex(
        self,
        request: energent_models.CreateKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmNodeResponse:
        """
        Description: 目录树中创建节点(挂父节点槽位)
        Summary: 目录树中创建节点(挂父节点槽位)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_km_node_ex_async(
        self,
        request: energent_models.CreateKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmNodeResponse:
        """
        Description: 目录树中创建节点(挂父节点槽位)
        Summary: 目录树中创建节点(挂父节点槽位)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_km_document(
        self,
        request: energent_models.ListKmDocumentRequest,
    ) -> energent_models.ListKmDocumentResponse:
        """
        Description: 查询节点下挂载的文档列表(含是否处理中标记)
        Summary: 查询节点下挂载的文档列表(含是否处理中标记)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_km_document_ex(request, headers, runtime)

    async def list_km_document_async(
        self,
        request: energent_models.ListKmDocumentRequest,
    ) -> energent_models.ListKmDocumentResponse:
        """
        Description: 查询节点下挂载的文档列表(含是否处理中标记)
        Summary: 查询节点下挂载的文档列表(含是否处理中标记)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_km_document_ex_async(request, headers, runtime)

    def list_km_document_ex(
        self,
        request: energent_models.ListKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKmDocumentResponse:
        """
        Description: 查询节点下挂载的文档列表(含是否处理中标记)
        Summary: 查询节点下挂载的文档列表(含是否处理中标记)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_km_document_ex_async(
        self,
        request: energent_models.ListKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKmDocumentResponse:
        """
        Description: 查询节点下挂载的文档列表(含是否处理中标记)
        Summary: 查询节点下挂载的文档列表(含是否处理中标记)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_km_document(
        self,
        request: energent_models.UnmountKmDocumentRequest,
    ) -> energent_models.UnmountKmDocumentResponse:
        """
        Description: 解除文档与节点的挂载关系(不删除文档记录)
        Summary: 解除文档与节点的挂载关系(不删除文档记录)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_km_document_ex(request, headers, runtime)

    async def unmount_km_document_async(
        self,
        request: energent_models.UnmountKmDocumentRequest,
    ) -> energent_models.UnmountKmDocumentResponse:
        """
        Description: 解除文档与节点的挂载关系(不删除文档记录)
        Summary: 解除文档与节点的挂载关系(不删除文档记录)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_km_document_ex_async(request, headers, runtime)

    def unmount_km_document_ex(
        self,
        request: energent_models.UnmountKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UnmountKmDocumentResponse:
        """
        Description: 解除文档与节点的挂载关系(不删除文档记录)
        Summary: 解除文档与节点的挂载关系(不删除文档记录)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UnmountKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_km_document_ex_async(
        self,
        request: energent_models.UnmountKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.UnmountKmDocumentResponse:
        """
        Description: 解除文档与节点的挂载关系(不删除文档记录)
        Summary: 解除文档与节点的挂载关系(不删除文档记录)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.UnmountKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_km_document(
        self,
        request: energent_models.PreviewKmDocumentRequest,
    ) -> energent_models.PreviewKmDocumentResponse:
        """
        Description: 查询文档预览内容(MD正文)
        Summary: 查询文档预览内容(MD正文)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_km_document_ex(request, headers, runtime)

    async def preview_km_document_async(
        self,
        request: energent_models.PreviewKmDocumentRequest,
    ) -> energent_models.PreviewKmDocumentResponse:
        """
        Description: 查询文档预览内容(MD正文)
        Summary: 查询文档预览内容(MD正文)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_km_document_ex_async(request, headers, runtime)

    def preview_km_document_ex(
        self,
        request: energent_models.PreviewKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.PreviewKmDocumentResponse:
        """
        Description: 查询文档预览内容(MD正文)
        Summary: 查询文档预览内容(MD正文)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.PreviewKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_km_document_ex_async(
        self,
        request: energent_models.PreviewKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.PreviewKmDocumentResponse:
        """
        Description: 查询文档预览内容(MD正文)
        Summary: 查询文档预览内容(MD正文)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.PreviewKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def segments_km_document(
        self,
        request: energent_models.SegmentsKmDocumentRequest,
    ) -> energent_models.SegmentsKmDocumentResponse:
        """
        Description: 查询文档段落切片列表(支持关键词过滤)
        Summary: 查询文档段落切片列表(支持关键词过滤)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.segments_km_document_ex(request, headers, runtime)

    async def segments_km_document_async(
        self,
        request: energent_models.SegmentsKmDocumentRequest,
    ) -> energent_models.SegmentsKmDocumentResponse:
        """
        Description: 查询文档段落切片列表(支持关键词过滤)
        Summary: 查询文档段落切片列表(支持关键词过滤)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.segments_km_document_ex_async(request, headers, runtime)

    def segments_km_document_ex(
        self,
        request: energent_models.SegmentsKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SegmentsKmDocumentResponse:
        """
        Description: 查询文档段落切片列表(支持关键词过滤)
        Summary: 查询文档段落切片列表(支持关键词过滤)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SegmentsKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.segments', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def segments_km_document_ex_async(
        self,
        request: energent_models.SegmentsKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SegmentsKmDocumentResponse:
        """
        Description: 查询文档段落切片列表(支持关键词过滤)
        Summary: 查询文档段落切片列表(支持关键词过滤)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SegmentsKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.segments', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_km_document(
        self,
        request: energent_models.SearchKmDocumentRequest,
    ) -> energent_models.SearchKmDocumentResponse:
        """
        Description: 树内节点与文档统一搜索
        Summary: 树内节点与文档统一搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_km_document_ex(request, headers, runtime)

    async def search_km_document_async(
        self,
        request: energent_models.SearchKmDocumentRequest,
    ) -> energent_models.SearchKmDocumentResponse:
        """
        Description: 树内节点与文档统一搜索
        Summary: 树内节点与文档统一搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_km_document_ex_async(request, headers, runtime)

    def search_km_document_ex(
        self,
        request: energent_models.SearchKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SearchKmDocumentResponse:
        """
        Description: 树内节点与文档统一搜索
        Summary: 树内节点与文档统一搜索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SearchKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_km_document_ex_async(
        self,
        request: energent_models.SearchKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SearchKmDocumentResponse:
        """
        Description: 树内节点与文档统一搜索
        Summary: 树内节点与文档统一搜索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SearchKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_km_version(
        self,
        request: energent_models.CreateKmVersionRequest,
    ) -> energent_models.CreateKmVersionResponse:
        """
        Description: 创建并发布知识库新版本
        Summary: 创建并发布知识库新版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_km_version_ex(request, headers, runtime)

    async def create_km_version_async(
        self,
        request: energent_models.CreateKmVersionRequest,
    ) -> energent_models.CreateKmVersionResponse:
        """
        Description: 创建并发布知识库新版本
        Summary: 创建并发布知识库新版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_km_version_ex_async(request, headers, runtime)

    def create_km_version_ex(
        self,
        request: energent_models.CreateKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmVersionResponse:
        """
        Description: 创建并发布知识库新版本
        Summary: 创建并发布知识库新版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmVersionResponse(),
            self.do_request('1.0', 'antdigital.energent.km.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_km_version_ex_async(
        self,
        request: energent_models.CreateKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateKmVersionResponse:
        """
        Description: 创建并发布知识库新版本
        Summary: 创建并发布知识库新版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateKmVersionResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_km_version(
        self,
        request: energent_models.ListKmVersionRequest,
    ) -> energent_models.ListKmVersionResponse:
        """
        Description: 查询知识库版本列表(分页)
        Summary: 查询知识库版本列表(分页)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_km_version_ex(request, headers, runtime)

    async def list_km_version_async(
        self,
        request: energent_models.ListKmVersionRequest,
    ) -> energent_models.ListKmVersionResponse:
        """
        Description: 查询知识库版本列表(分页)
        Summary: 查询知识库版本列表(分页)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_km_version_ex_async(request, headers, runtime)

    def list_km_version_ex(
        self,
        request: energent_models.ListKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKmVersionResponse:
        """
        Description: 查询知识库版本列表(分页)
        Summary: 查询知识库版本列表(分页)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKmVersionResponse(),
            self.do_request('1.0', 'antdigital.energent.km.version.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_km_version_ex_async(
        self,
        request: energent_models.ListKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKmVersionResponse:
        """
        Description: 查询知识库版本列表(分页)
        Summary: 查询知识库版本列表(分页)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKmVersionResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.version.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_km_version(
        self,
        request: energent_models.DetailKmVersionRequest,
    ) -> energent_models.DetailKmVersionResponse:
        """
        Description: 查询版本详情(含JSON快照)
        Summary: 查询版本详情(含JSON快照)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_km_version_ex(request, headers, runtime)

    async def detail_km_version_async(
        self,
        request: energent_models.DetailKmVersionRequest,
    ) -> energent_models.DetailKmVersionResponse:
        """
        Description: 查询版本详情(含JSON快照)
        Summary: 查询版本详情(含JSON快照)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_km_version_ex_async(request, headers, runtime)

    def detail_km_version_ex(
        self,
        request: energent_models.DetailKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DetailKmVersionResponse:
        """
        Description: 查询版本详情(含JSON快照)
        Summary: 查询版本详情(含JSON快照)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DetailKmVersionResponse(),
            self.do_request('1.0', 'antdigital.energent.km.version.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_km_version_ex_async(
        self,
        request: energent_models.DetailKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.DetailKmVersionResponse:
        """
        Description: 查询版本详情(含JSON快照)
        Summary: 查询版本详情(含JSON快照)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.DetailKmVersionResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.version.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def next_km_version(
        self,
        request: energent_models.NextKmVersionRequest,
    ) -> energent_models.NextKmVersionResponse:
        """
        Description: 查询知识库下一个可用版本号
        Summary: 查询知识库下一个可用版本号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.next_km_version_ex(request, headers, runtime)

    async def next_km_version_async(
        self,
        request: energent_models.NextKmVersionRequest,
    ) -> energent_models.NextKmVersionResponse:
        """
        Description: 查询知识库下一个可用版本号
        Summary: 查询知识库下一个可用版本号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.next_km_version_ex_async(request, headers, runtime)

    def next_km_version_ex(
        self,
        request: energent_models.NextKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.NextKmVersionResponse:
        """
        Description: 查询知识库下一个可用版本号
        Summary: 查询知识库下一个可用版本号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.NextKmVersionResponse(),
            self.do_request('1.0', 'antdigital.energent.km.version.next', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def next_km_version_ex_async(
        self,
        request: energent_models.NextKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.NextKmVersionResponse:
        """
        Description: 查询知识库下一个可用版本号
        Summary: 查询知识库下一个可用版本号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.NextKmVersionResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.version.next', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def activate_km_version(
        self,
        request: energent_models.ActivateKmVersionRequest,
    ) -> energent_models.ActivateKmVersionResponse:
        """
        Description: 激活知识库指定版本(回滚用)
        Summary: 激活知识库指定版本(回滚用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.activate_km_version_ex(request, headers, runtime)

    async def activate_km_version_async(
        self,
        request: energent_models.ActivateKmVersionRequest,
    ) -> energent_models.ActivateKmVersionResponse:
        """
        Description: 激活知识库指定版本(回滚用)
        Summary: 激活知识库指定版本(回滚用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.activate_km_version_ex_async(request, headers, runtime)

    def activate_km_version_ex(
        self,
        request: energent_models.ActivateKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ActivateKmVersionResponse:
        """
        Description: 激活知识库指定版本(回滚用)
        Summary: 激活知识库指定版本(回滚用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ActivateKmVersionResponse(),
            self.do_request('1.0', 'antdigital.energent.km.version.activate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def activate_km_version_ex_async(
        self,
        request: energent_models.ActivateKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ActivateKmVersionResponse:
        """
        Description: 激活知识库指定版本(回滚用)
        Summary: 激活知识库指定版本(回滚用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ActivateKmVersionResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.version.activate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def node_kg_graph(
        self,
        request: energent_models.NodeKgGraphRequest,
    ) -> energent_models.NodeKgGraphResponse:
        """
        Description: 图谱节点详情与邻域展开
        Summary: 图谱节点详情与邻域展开
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.node_kg_graph_ex(request, headers, runtime)

    async def node_kg_graph_async(
        self,
        request: energent_models.NodeKgGraphRequest,
    ) -> energent_models.NodeKgGraphResponse:
        """
        Description: 图谱节点详情与邻域展开
        Summary: 图谱节点详情与邻域展开
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.node_kg_graph_ex_async(request, headers, runtime)

    def node_kg_graph_ex(
        self,
        request: energent_models.NodeKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.NodeKgGraphResponse:
        """
        Description: 图谱节点详情与邻域展开
        Summary: 图谱节点详情与邻域展开
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.NodeKgGraphResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.graph.node', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def node_kg_graph_ex_async(
        self,
        request: energent_models.NodeKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.NodeKgGraphResponse:
        """
        Description: 图谱节点详情与邻域展开
        Summary: 图谱节点详情与邻域展开
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.NodeKgGraphResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.graph.node', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def categories_kg_graph(
        self,
        request: energent_models.CategoriesKgGraphRequest,
    ) -> energent_models.CategoriesKgGraphResponse:
        """
        Description: 图谱节点分类与图例配置
        Summary: 图谱节点分类与图例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.categories_kg_graph_ex(request, headers, runtime)

    async def categories_kg_graph_async(
        self,
        request: energent_models.CategoriesKgGraphRequest,
    ) -> energent_models.CategoriesKgGraphResponse:
        """
        Description: 图谱节点分类与图例配置
        Summary: 图谱节点分类与图例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.categories_kg_graph_ex_async(request, headers, runtime)

    def categories_kg_graph_ex(
        self,
        request: energent_models.CategoriesKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CategoriesKgGraphResponse:
        """
        Description: 图谱节点分类与图例配置
        Summary: 图谱节点分类与图例配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CategoriesKgGraphResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.graph.categories', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def categories_kg_graph_ex_async(
        self,
        request: energent_models.CategoriesKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CategoriesKgGraphResponse:
        """
        Description: 图谱节点分类与图例配置
        Summary: 图谱节点分类与图例配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CategoriesKgGraphResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.graph.categories', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_kg_compile(
        self,
        request: energent_models.RetryKgCompileRequest,
    ) -> energent_models.RetryKgCompileResponse:
        """
        Description: 重试失败的图谱编译任务
        Summary: 重试失败的图谱编译任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_kg_compile_ex(request, headers, runtime)

    async def retry_kg_compile_async(
        self,
        request: energent_models.RetryKgCompileRequest,
    ) -> energent_models.RetryKgCompileResponse:
        """
        Description: 重试失败的图谱编译任务
        Summary: 重试失败的图谱编译任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_kg_compile_ex_async(request, headers, runtime)

    def retry_kg_compile_ex(
        self,
        request: energent_models.RetryKgCompileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RetryKgCompileResponse:
        """
        Description: 重试失败的图谱编译任务
        Summary: 重试失败的图谱编译任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RetryKgCompileResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.compile.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_kg_compile_ex_async(
        self,
        request: energent_models.RetryKgCompileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RetryKgCompileResponse:
        """
        Description: 重试失败的图谱编译任务
        Summary: 重试失败的图谱编译任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RetryKgCompileResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.compile.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_kg_compile(
        self,
        request: energent_models.ListKgCompileRequest,
    ) -> energent_models.ListKgCompileResponse:
        """
        Description: 查询图谱编译任务列表(分页)
        Summary: 查询图谱编译任务列表(分页)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_kg_compile_ex(request, headers, runtime)

    async def list_kg_compile_async(
        self,
        request: energent_models.ListKgCompileRequest,
    ) -> energent_models.ListKgCompileResponse:
        """
        Description: 查询图谱编译任务列表(分页)
        Summary: 查询图谱编译任务列表(分页)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_kg_compile_ex_async(request, headers, runtime)

    def list_kg_compile_ex(
        self,
        request: energent_models.ListKgCompileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKgCompileResponse:
        """
        Description: 查询图谱编译任务列表(分页)
        Summary: 查询图谱编译任务列表(分页)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKgCompileResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.compile.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_kg_compile_ex_async(
        self,
        request: energent_models.ListKgCompileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ListKgCompileResponse:
        """
        Description: 查询图谱编译任务列表(分页)
        Summary: 查询图谱编译任务列表(分页)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ListKgCompileResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.compile.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def extractschema_km_document(
        self,
        request: energent_models.ExtractschemaKmDocumentRequest,
    ) -> energent_models.ExtractschemaKmDocumentResponse:
        """
        Description: 基于已上传文件生成图谱本体Schema(不落库)
        Summary: 基于已上传文件生成图谱本体Schema(不落库)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.extractschema_km_document_ex(request, headers, runtime)

    async def extractschema_km_document_async(
        self,
        request: energent_models.ExtractschemaKmDocumentRequest,
    ) -> energent_models.ExtractschemaKmDocumentResponse:
        """
        Description: 基于已上传文件生成图谱本体Schema(不落库)
        Summary: 基于已上传文件生成图谱本体Schema(不落库)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.extractschema_km_document_ex_async(request, headers, runtime)

    def extractschema_km_document_ex(
        self,
        request: energent_models.ExtractschemaKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ExtractschemaKmDocumentResponse:
        """
        Description: 基于已上传文件生成图谱本体Schema(不落库)
        Summary: 基于已上传文件生成图谱本体Schema(不落库)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ExtractschemaKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.extractschema', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def extractschema_km_document_ex_async(
        self,
        request: energent_models.ExtractschemaKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ExtractschemaKmDocumentResponse:
        """
        Description: 基于已上传文件生成图谱本体Schema(不落库)
        Summary: 基于已上传文件生成图谱本体Schema(不落库)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ExtractschemaKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.extractschema', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rank_km_node(
        self,
        request: energent_models.RankKmNodeRequest,
    ) -> energent_models.RankKmNodeResponse:
        """
        Description: 同级目录树节点拖拽排序
        Summary: 同级目录树节点拖拽排序
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rank_km_node_ex(request, headers, runtime)

    async def rank_km_node_async(
        self,
        request: energent_models.RankKmNodeRequest,
    ) -> energent_models.RankKmNodeResponse:
        """
        Description: 同级目录树节点拖拽排序
        Summary: 同级目录树节点拖拽排序
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rank_km_node_ex_async(request, headers, runtime)

    def rank_km_node_ex(
        self,
        request: energent_models.RankKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RankKmNodeResponse:
        """
        Description: 同级目录树节点拖拽排序
        Summary: 同级目录树节点拖拽排序
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RankKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.rank', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rank_km_node_ex_async(
        self,
        request: energent_models.RankKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RankKmNodeResponse:
        """
        Description: 同级目录树节点拖拽排序
        Summary: 同级目录树节点拖拽排序
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RankKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.rank', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reorder_km_node(
        self,
        request: energent_models.ReorderKmNodeRequest,
    ) -> energent_models.ReorderKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reorder_km_node_ex(request, headers, runtime)

    async def reorder_km_node_async(
        self,
        request: energent_models.ReorderKmNodeRequest,
    ) -> energent_models.ReorderKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reorder_km_node_ex_async(request, headers, runtime)

    def reorder_km_node_ex(
        self,
        request: energent_models.ReorderKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ReorderKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ReorderKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.reorder', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reorder_km_node_ex_async(
        self,
        request: energent_models.ReorderKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.ReorderKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.ReorderKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.reorder', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retrieve_kg_graph(
        self,
        request: energent_models.RetrieveKgGraphRequest,
    ) -> energent_models.RetrieveKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retrieve_kg_graph_ex(request, headers, runtime)

    async def retrieve_kg_graph_async(
        self,
        request: energent_models.RetrieveKgGraphRequest,
    ) -> energent_models.RetrieveKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retrieve_kg_graph_ex_async(request, headers, runtime)

    def retrieve_kg_graph_ex(
        self,
        request: energent_models.RetrieveKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RetrieveKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RetrieveKgGraphResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.graph.retrieve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retrieve_kg_graph_ex_async(
        self,
        request: energent_models.RetrieveKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.RetrieveKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.RetrieveKgGraphResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.graph.retrieve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sort_km_node(
        self,
        request: energent_models.SortKmNodeRequest,
    ) -> energent_models.SortKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sort_km_node_ex(request, headers, runtime)

    async def sort_km_node_async(
        self,
        request: energent_models.SortKmNodeRequest,
    ) -> energent_models.SortKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sort_km_node_ex_async(request, headers, runtime)

    def sort_km_node_ex(
        self,
        request: energent_models.SortKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SortKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SortKmNodeResponse(),
            self.do_request('1.0', 'antdigital.energent.km.node.sort', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sort_km_node_ex_async(
        self,
        request: energent_models.SortKmNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.SortKmNodeResponse:
        """
        Description: 同级目录树节点按序重排
        Summary: 同级目录树节点按序重排
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.SortKmNodeResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.node.sort', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_kg_graph(
        self,
        request: energent_models.QueryKgGraphRequest,
    ) -> energent_models.QueryKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_kg_graph_ex(request, headers, runtime)

    async def query_kg_graph_async(
        self,
        request: energent_models.QueryKgGraphRequest,
    ) -> energent_models.QueryKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_kg_graph_ex_async(request, headers, runtime)

    def query_kg_graph_ex(
        self,
        request: energent_models.QueryKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKgGraphResponse(),
            self.do_request('1.0', 'antdigital.energent.kg.graph.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_kg_graph_ex_async(
        self,
        request: energent_models.QueryKgGraphRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.QueryKgGraphResponse:
        """
        Description: 知识图谱全图查询(节点与关系)
        Summary: 知识图谱全图查询(节点与关系)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.QueryKgGraphResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.kg.graph.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def fileupload_km_document(
        self,
        request: energent_models.FileuploadKmDocumentRequest,
    ) -> energent_models.FileuploadKmDocumentResponse:
        """
        Description: 知识库文件上传接入
        Summary: 知识库文件上传接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.fileupload_km_document_ex(request, headers, runtime)

    async def fileupload_km_document_async(
        self,
        request: energent_models.FileuploadKmDocumentRequest,
    ) -> energent_models.FileuploadKmDocumentResponse:
        """
        Description: 知识库文件上传接入
        Summary: 知识库文件上传接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.fileupload_km_document_ex_async(request, headers, runtime)

    def fileupload_km_document_ex(
        self,
        request: energent_models.FileuploadKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.FileuploadKmDocumentResponse:
        """
        Description: 知识库文件上传接入
        Summary: 知识库文件上传接入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = energent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.energent.km.document.fileupload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                fileupload_km_document_response = energent_models.FileuploadKmDocumentResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return fileupload_km_document_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.FileuploadKmDocumentResponse(),
            self.do_request('1.0', 'antdigital.energent.km.document.fileupload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def fileupload_km_document_ex_async(
        self,
        request: energent_models.FileuploadKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.FileuploadKmDocumentResponse:
        """
        Description: 知识库文件上传接入
        Summary: 知识库文件上传接入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = energent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.energent.km.document.fileupload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                fileupload_km_document_response = energent_models.FileuploadKmDocumentResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return fileupload_km_document_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.FileuploadKmDocumentResponse(),
            await self.do_request_async('1.0', 'antdigital.energent.km.document.fileupload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: energent_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> energent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: energent_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> energent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: energent_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: energent_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energent_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
