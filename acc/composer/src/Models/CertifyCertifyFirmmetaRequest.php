<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CertifyCertifyFirmmetaRequest extends Model
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

    // 自定义唯一id
    /**
     * @var string
     */
    public $bizId;

    // 租户类型
    /**
     * @var string
     */
    public $tenantId;

    // 企业名称
    /**
     * @var string
     */
    public $firmName;

    // 企业营业执照号
    /**
     * @var string
     */
    public $certNo;

    // 法人姓名
    /**
     * @var string
     */
    public $lpCertName;

    // 法人身份证号
    /**
     * @var string
     */
    public $lpCertNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'tenantId'          => 'tenant_id',
        'firmName'          => 'firm_name',
        'certNo'            => 'cert_no',
        'lpCertName'        => 'lp_cert_name',
        'lpCertNo'          => 'lp_cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('firmName', $this->firmName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('lpCertName', $this->lpCertName, true);
        Model::validateRequired('lpCertNo', $this->lpCertNo, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->lpCertName) {
            $res['lp_cert_name'] = $this->lpCertName;
        }
        if (null !== $this->lpCertNo) {
            $res['lp_cert_no'] = $this->lpCertNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyCertifyFirmmetaRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['lp_cert_name'])) {
            $model->lpCertName = $map['lp_cert_name'];
        }
        if (isset($map['lp_cert_no'])) {
            $model->lpCertNo = $map['lp_cert_no'];
        }

        return $model;
    }
}
