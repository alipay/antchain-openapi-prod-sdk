<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDriverDisRequest extends Model
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

    // 司机身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 司机手机号码
    /**
     * @var string
     */
    public $mobile;

    // 司机姓名
    /**
     * @var string
     */
    public $name;

    // 所属承运平台did
    /**
     * @var string
     */
    public $platformDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'extensionInfo'     => 'extension_info',
        'mobile'            => 'mobile',
        'name'              => 'name',
        'platformDid'       => 'platform_did',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDriverDisRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }

        return $model;
    }
}
