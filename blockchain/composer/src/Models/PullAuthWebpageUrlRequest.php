<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PullAuthWebpageUrlRequest extends Model
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

    // 实人认证使用的biz_id，长度不超过64字符的业务唯一id
    /**
     * @var string
     */
    public $bizId;

    // 实人认证使用的biz_type，通常为业务方自己在阿里云实人认证控制台创建。
    /**
     * @var string
     */
    public $bizType;

    // 业务方C端用户身份证信息，会进入可验证声明claim内容中。
    /**
     * @var string
     */
    public $certNo;

    // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明.
    /**
     * @var string
     */
    public $extension;

    // 业务方C端用户姓名信息，会进入可验证声明claim内容中。
    /**
     * @var string
     */
    public $name;

    // 业务方B类身份标识id，与创建的业务方B类DID（颁发可验证声明的subject目标）时baas.auth.corporate.did.create接口的入参owner_uid相同。
    /**
     * @var string
     */
    public $pkId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'certNo'            => 'cert_no',
        'extension'         => 'extension',
        'name'              => 'name',
        'pkId'              => 'pk_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('pkId', $this->pkId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pkId) {
            $res['pk_id'] = $this->pkId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullAuthWebpageUrlRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['pk_id'])) {
            $model->pkId = $map['pk_id'];
        }

        return $model;
    }
}
