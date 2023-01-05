<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7186a91da6a6476b8d8f8f21b9ed79b4\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainBbpEnterpriseBusinessscopeRequest extends Model
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

    // 企业唯一编码
    /**
     * @var string
     */
    public $epCertNo;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'epCertNo'          => 'ep_cert_no',
        'epCertName'        => 'ep_cert_name',
    ];

    public function validate()
    {
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertName', $this->epCertName, true);
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
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainBbpEnterpriseBusinessscopeRequest
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
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }

        return $model;
    }
}
