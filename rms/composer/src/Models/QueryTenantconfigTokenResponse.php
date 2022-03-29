<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTenantconfigTokenResponse extends Model
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

    // token_config
    /**
     * @var TokenConfig
     */
    public $configValue;

    // entity_name
    /**
     * @var string
     */
    public $entityName;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'configValue' => 'config_value',
        'entityName'  => 'entity_name',
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
        if (null !== $this->configValue) {
            $res['config_value'] = null !== $this->configValue ? $this->configValue->toMap() : null;
        }
        if (null !== $this->entityName) {
            $res['entity_name'] = $this->entityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTenantconfigTokenResponse
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
        if (isset($map['config_value'])) {
            $model->configValue = TokenConfig::fromMap($map['config_value']);
        }
        if (isset($map['entity_name'])) {
            $model->entityName = $map['entity_name'];
        }

        return $model;
    }
}
