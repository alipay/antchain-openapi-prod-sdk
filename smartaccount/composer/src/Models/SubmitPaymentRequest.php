<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SMARTACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class SubmitPaymentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 系统参数
    /**
     * @var SystemParam
     */
    public $sysParam;

    // 业务参数，与function定义相匹配
    /**
     * @var string
     */
    public $encodedBizParam;
    protected $_name = [
        'authToken'       => 'auth_token',
        'sysParam'        => 'sys_param',
        'encodedBizParam' => 'encoded_biz_param',
    ];

    public function validate()
    {
        Model::validateRequired('sysParam', $this->sysParam, true);
        Model::validateRequired('encodedBizParam', $this->encodedBizParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sysParam) {
            $res['sys_param'] = null !== $this->sysParam ? $this->sysParam->toMap() : null;
        }
        if (null !== $this->encodedBizParam) {
            $res['encoded_biz_param'] = $this->encodedBizParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitPaymentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sys_param'])) {
            $model->sysParam = SystemParam::fromMap($map['sys_param']);
        }
        if (isset($map['encoded_biz_param'])) {
            $model->encodedBizParam = $map['encoded_biz_param'];
        }

        return $model;
    }
}
