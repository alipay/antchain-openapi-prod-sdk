<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class OperationLogVO extends Model
{
    // ID主键
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $id;

    // 创建时间戳（毫秒）
    /**
     * @example 1755754919690
     *
     * @var string
     */
    public $gmtCreated;

    // 创建人
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $createdBy;

    // 更新时间戳（毫秒）
    /**
     * @example 1755754919690
     *
     * @var string
     */
    public $gmtModified;

    // 更新人
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $modifieBy;

    // 用户id
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $userId;

    // 用户地址
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $userAddress;

    // 发起操作的URL接口
    /**
     * @example /openapi/v1/trade/issuer/project/create
     *
     * @var string
     */
    public $requestUrl;

    // 发起操作的URL接口描述code值
    /**
     * @example OPENAPI_ISSUER_PROJECT_CREATE
     *
     * @var string
     */
    public $apiDesc;

    // 发起操作的URL接口中文描述
    /**
     * @example openapi创建项目
     *
     * @var string
     */
    public $chDesc;

    // 设备信息
    /**
     * @example Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
     *
     * @var string
     */
    public $deviceInfo;

    // 设备Hash
    /**
     * @example 30fdb4cb
     *
     * @var string
     */
    public $deviceHash;

    // 操作种类
    /**
     * @example QUERY
     *
     * @var string
     */
    public $operationType;

    // 请求输入
    /**
     * @example {"request":{"requestFrom":"inner","operatorBy":null,"projectId":"17cef416378c4f238ec42cdc142b54c7","targetChainName":null}}
     *
     * @var string
     */
    public $requestInput;

    // 请求输出
    /**
     * @example {"success":true,"data":[],"total":0,"errorMessage":null,"retry":false,"traceId":"T2ce514e6f60a409f9e3926115f9742dd"}
     *
     * @var string
     */
    public $requestOutput;

    // 操作状态0：失败   1：成功
    /**
     * @example 1
     *
     * @var string
     */
    public $success;

    // 操作来源
    /**
     * @example WEB
     *
     * @var string
     */
    public $requestFrom;

    // 发起IP地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $ip;

    // 扩展字段
    /**
     * @example {}
     *
     * @var string
     */
    public $extInfo;

    // 登录名类型(EMAIL)
    /**
     * @example EMAIL
     *
     * @var string
     */
    public $loginAccountType;

    // 登录名
    /**
     * @example alice
     *
     * @var string
     */
    public $loginAccount;
    protected $_name = [
        'id'               => 'id',
        'gmtCreated'       => 'gmt_created',
        'createdBy'        => 'created_by',
        'gmtModified'      => 'gmt_modified',
        'modifieBy'        => 'modifie_by',
        'userId'           => 'user_id',
        'userAddress'      => 'user_address',
        'requestUrl'       => 'request_url',
        'apiDesc'          => 'api_desc',
        'chDesc'           => 'ch_desc',
        'deviceInfo'       => 'device_info',
        'deviceHash'       => 'device_hash',
        'operationType'    => 'operation_type',
        'requestInput'     => 'request_input',
        'requestOutput'    => 'request_output',
        'success'          => 'success',
        'requestFrom'      => 'request_from',
        'ip'               => 'ip',
        'extInfo'          => 'ext_info',
        'loginAccountType' => 'login_account_type',
        'loginAccount'     => 'login_account',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->createdBy) {
            $res['created_by'] = $this->createdBy;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->modifieBy) {
            $res['modifie_by'] = $this->modifieBy;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->requestUrl) {
            $res['request_url'] = $this->requestUrl;
        }
        if (null !== $this->apiDesc) {
            $res['api_desc'] = $this->apiDesc;
        }
        if (null !== $this->chDesc) {
            $res['ch_desc'] = $this->chDesc;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = $this->deviceInfo;
        }
        if (null !== $this->deviceHash) {
            $res['device_hash'] = $this->deviceHash;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->requestInput) {
            $res['request_input'] = $this->requestInput;
        }
        if (null !== $this->requestOutput) {
            $res['request_output'] = $this->requestOutput;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->requestFrom) {
            $res['request_from'] = $this->requestFrom;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->loginAccountType) {
            $res['login_account_type'] = $this->loginAccountType;
        }
        if (null !== $this->loginAccount) {
            $res['login_account'] = $this->loginAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationLogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['created_by'])) {
            $model->createdBy = $map['created_by'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['modifie_by'])) {
            $model->modifieBy = $map['modifie_by'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['request_url'])) {
            $model->requestUrl = $map['request_url'];
        }
        if (isset($map['api_desc'])) {
            $model->apiDesc = $map['api_desc'];
        }
        if (isset($map['ch_desc'])) {
            $model->chDesc = $map['ch_desc'];
        }
        if (isset($map['device_info'])) {
            $model->deviceInfo = $map['device_info'];
        }
        if (isset($map['device_hash'])) {
            $model->deviceHash = $map['device_hash'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['request_input'])) {
            $model->requestInput = $map['request_input'];
        }
        if (isset($map['request_output'])) {
            $model->requestOutput = $map['request_output'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['request_from'])) {
            $model->requestFrom = $map['request_from'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['login_account_type'])) {
            $model->loginAccountType = $map['login_account_type'];
        }
        if (isset($map['login_account'])) {
            $model->loginAccount = $map['login_account'];
        }

        return $model;
    }
}
