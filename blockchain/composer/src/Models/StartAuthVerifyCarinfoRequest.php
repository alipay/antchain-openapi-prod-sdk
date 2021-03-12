<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVerifyCarinfoRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    /**
     * @var string
     */
    public $bizType;

    // 加密前身份证号最后一位为字母 X 时，请使用大写 X，SHA256 加密字符串(小写)，身份证需 18
    // 岁以上。
    /**
     * @var string
     */
    public $certNo;

    // 保留字段，待扩展使用的JSON字符串内容
    /**
     * @var string
     */
    public $extension;

    // 车牌号加密前车牌字母均为大写，SHA256 的加密后字符串(小写字母)
    /**
     * @var string
     */
    public $licenseNo;

    // 目标用户姓名的SHA256计算结果(小写字母)
    /**
     * @var string
     */
    public $name;

    // 姓名和身份证号拼接之后，SHA256加密的结果(小写字母)，身份证最后一位为字母 X 时， 请使用大写 X，加密后 SHA256 的 字符串(小写)， 身份证需 18 岁以上。
    /**
     * @var string
     */
    public $twoMeta;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'certNo'            => 'cert_no',
        'extension'         => 'extension',
        'licenseNo'         => 'license_no',
        'name'              => 'name',
        'twoMeta'           => 'two_meta',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('twoMeta', $this->twoMeta, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->twoMeta) {
            $res['two_meta'] = $this->twoMeta;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVerifyCarinfoRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['two_meta'])) {
            $model->twoMeta = $map['two_meta'];
        }

        return $model;
    }
}
