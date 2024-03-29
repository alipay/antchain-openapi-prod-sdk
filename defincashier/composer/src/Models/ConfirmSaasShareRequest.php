<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER\Models;

use AlibabaCloud\Tea\Model;

class ConfirmSaasShareRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // JSON请求参数，示例字数限制，完整可见：
    // {"org_order_id": "","out_payer_id": {"reference_id_type": "","reference_id": ""},"outRequestId": "","confirmAmount": {"cent": "","currency": "","currencyValue": ""},"share_info": {"payee_account": {"inst_id": "","account_no": "","account_name": "","offical_name": "","offical_number": ""},"out_payee_id": {"reference_id_type": "","reference_id": ""},"share_amount": "","share_currency":"","info_id":"","state":""},"platform_member_id": ""}
    /**
     * @var string
     */
    public $bizContent;

    // 版本号
    /**
     * @var string
     */
    public $serviceVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizContent'        => 'biz_content',
        'serviceVersion'    => 'service_version',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('serviceVersion', $this->serviceVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmSaasShareRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }

        return $model;
    }
}
