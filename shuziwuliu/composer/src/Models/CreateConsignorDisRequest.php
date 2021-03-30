<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateConsignorDisRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业信用号码
    /**
     * @var string
     */
    public $epCertNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 企业法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人身份证号码
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 所属承运平台did
    /**
     * @var string
     */
    public $platformDid;

    // 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
    /**
     * @var bool
     */
    public $checkAll;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'extensionInfo'       => 'extension_info',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'platformDid'         => 'platform_did',
        'checkAll'            => 'check_all',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('checkAll', $this->checkAll, true);
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
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->checkAll) {
            $res['check_all'] = $this->checkAll;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsignorDisRequest
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
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['check_all'])) {
            $model->checkAll = $map['check_all'];
        }

        return $model;
    }
}
