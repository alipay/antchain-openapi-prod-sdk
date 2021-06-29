<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ConfirmCpfDatauseResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 使用方ID
    /**
     * @var string
     */
    public $dataUserIdentity;

    // 使用方名称
    /**
     * @var string
     */
    public $dataUserName;

    // 数据拥有者ID，用户身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 数据拥有者名称，用户名称
    /**
     * @var string
     */
    public $dataOwnerName;

    // 数据源ID
    /**
     * @var string
     */
    public $providerId;

    // 数据源名称
    /**
     * @var string
     */
    public $providerName;

    // 存证端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 业务描述
    /**
     * @var string
     */
    public $dataDesc;

    // 存证数据hash
    /**
     * @var string
     */
    public $dataHash;

    // 链信息
    /**
     * @var ChainInfo
     */
    public $chainInfo;

    // 扩展字段
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'dataUserIdentity'  => 'data_user_identity',
        'dataUserName'      => 'data_user_name',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataOwnerName'     => 'data_owner_name',
        'providerId'        => 'provider_id',
        'providerName'      => 'provider_name',
        'terminalIdentity'  => 'terminal_identity',
        'dataDesc'          => 'data_desc',
        'dataHash'          => 'data_hash',
        'chainInfo'         => 'chain_info',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->dataDesc) {
            $res['data_desc'] = $this->dataDesc;
        }
        if (null !== $this->dataHash) {
            $res['data_hash'] = $this->dataHash;
        }
        if (null !== $this->chainInfo) {
            $res['chain_info'] = null !== $this->chainInfo ? $this->chainInfo->toMap() : null;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmCpfDatauseResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['data_desc'])) {
            $model->dataDesc = $map['data_desc'];
        }
        if (isset($map['data_hash'])) {
            $model->dataHash = $map['data_hash'];
        }
        if (isset($map['chain_info'])) {
            $model->chainInfo = ChainInfo::fromMap($map['chain_info']);
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
