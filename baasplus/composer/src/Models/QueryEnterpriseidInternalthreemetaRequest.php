<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryEnterpriseidInternalthreemetaRequest extends Model
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

    // 用于内部统计的参数，外部用户请忽略
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    /**
     * @var string
     */
    public $epCertNo;

    // 证件类型
    /**
     * @var string
     */
    public $epCertType;

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'bizInfo'             => 'biz_info',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'epCertType'          => 'ep_cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertType', $this->epCertType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
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
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epCertType) {
            $res['ep_cert_type'] = $this->epCertType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEnterpriseidInternalthreemetaRequest
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
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['ep_cert_type'])) {
            $model->epCertType = $map['ep_cert_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }

        return $model;
    }
}
