<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class BaseAuthRequest extends Model
{
    // 租户号
    /**
     * @example OCRGDSFD
     *
     * @var string
     */
    public $instCode;

    // 授权类型
    /**
     * @example 19
     *
     * @var string
     */
    public $authType;

    // xdsadsfsdf
    /**
     * @example 订单号
     *
     * @var string
     */
    public $orderNo;

    // 扩展信息
    /**
     * @example 扩展信息
     *
     * @var StandardAuthExtendInfoRequest
     */
    public $extendInfo;
    protected $_name = [
        'instCode'   => 'inst_code',
        'authType'   => 'auth_type',
        'orderNo'    => 'order_no',
        'extendInfo' => 'extend_info',
    ];

    public function validate()
    {
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = null !== $this->extendInfo ? $this->extendInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseAuthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = StandardAuthExtendInfoRequest::fromMap($map['extend_info']);
        }

        return $model;
    }
}
