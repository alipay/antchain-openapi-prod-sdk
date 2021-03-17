<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class CreateRealtytradeOrgRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 公司名称的全称
    /**
     * @var string
     */
    public $name;

    // 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
    /**
     * @var string
     */
    public $certType;

    // 证件类型对应的证件号码
    /**
     * @var string
     */
    public $certNo;

    // 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
    /**
     * @var string
     */
    public $managerCertType;

    // 经办人的证件号码
    //
    //
    /**
     * @var string
     */
    public $managerCertNo;

    // 经办人的姓名
    //
    //
    /**
     * @var string
     */
    public $managerName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'certType'          => 'cert_type',
        'certNo'            => 'cert_no',
        'managerCertType'   => 'manager_cert_type',
        'managerCertNo'     => 'manager_cert_no',
        'managerName'       => 'manager_name',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('managerCertNo', $this->managerCertNo, true);
        Model::validateRequired('managerName', $this->managerName, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->managerCertType) {
            $res['manager_cert_type'] = $this->managerCertType;
        }
        if (null !== $this->managerCertNo) {
            $res['manager_cert_no'] = $this->managerCertNo;
        }
        if (null !== $this->managerName) {
            $res['manager_name'] = $this->managerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRealtytradeOrgRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['manager_cert_type'])) {
            $model->managerCertType = $map['manager_cert_type'];
        }
        if (isset($map['manager_cert_no'])) {
            $model->managerCertNo = $map['manager_cert_no'];
        }
        if (isset($map['manager_name'])) {
            $model->managerName = $map['manager_name'];
        }

        return $model;
    }
}
