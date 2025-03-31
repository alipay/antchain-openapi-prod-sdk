<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CustomerPersonInfo extends Model
{
    // 客诉处理员支付宝账号
    /**
     * @example 123123122134@163.com
     *
     * @var string
     */
    public $alipayLogonId;

    // 客诉处理员支付宝绑定手机号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $alipayBindMobile;

    // 客服人员名称
    /**
     * @example 客服人员名称
     *
     * @var string
     */
    public $customerServiceName;
    protected $_name = [
        'alipayLogonId'       => 'alipay_logon_id',
        'alipayBindMobile'    => 'alipay_bind_mobile',
        'customerServiceName' => 'customer_service_name',
    ];

    public function validate()
    {
        Model::validateRequired('alipayLogonId', $this->alipayLogonId, true);
        Model::validateRequired('alipayBindMobile', $this->alipayBindMobile, true);
        Model::validateRequired('customerServiceName', $this->customerServiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alipayLogonId) {
            $res['alipay_logon_id'] = $this->alipayLogonId;
        }
        if (null !== $this->alipayBindMobile) {
            $res['alipay_bind_mobile'] = $this->alipayBindMobile;
        }
        if (null !== $this->customerServiceName) {
            $res['customer_service_name'] = $this->customerServiceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerPersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alipay_logon_id'])) {
            $model->alipayLogonId = $map['alipay_logon_id'];
        }
        if (isset($map['alipay_bind_mobile'])) {
            $model->alipayBindMobile = $map['alipay_bind_mobile'];
        }
        if (isset($map['customer_service_name'])) {
            $model->customerServiceName = $map['customer_service_name'];
        }

        return $model;
    }
}
