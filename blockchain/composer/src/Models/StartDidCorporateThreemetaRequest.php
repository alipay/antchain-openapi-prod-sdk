<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidCorporateThreemetaRequest extends Model
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

    // 证书的subject did
    //
    /**
     * @var string
     */
    public $did;

    // 企业名称
    //
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    //
    /**
     * @var string
     */
    public $epCertNo;

    // 法人姓名
    //
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'did'                 => 'did',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'legalPersonCertName' => 'legal_person_cert_name',
        'bizCode'             => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidCorporateThreemetaRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
