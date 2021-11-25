<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateUserCertRequest extends Model
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

    // 云蚂账户id
    /**
     * @var int
     */
    public $userId;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 个人证件类型
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNum;

    // 个人证件正面图片文件id，应用侧fileId
    /**
     * @var int
     */
    public $certFileFront;

    // 个人证件正面类型。JPG
    /**
     * @var string
     */
    public $certFileFrontType;

    // 个人证件反面图片文件id，应用侧fileId
    /**
     * @var int
     */
    public $certFileReverse;

    // 个人证件反面类型。JPG
    /**
     * @var string
     */
    public $certFileReverseType;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'userId'              => 'user_id',
        'name'                => 'name',
        'certType'            => 'cert_type',
        'certNum'             => 'cert_num',
        'certFileFront'       => 'cert_file_front',
        'certFileFrontType'   => 'cert_file_front_type',
        'certFileReverse'     => 'cert_file_reverse',
        'certFileReverseType' => 'cert_file_reverse_type',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNum', $this->certNum, true);
        Model::validateRequired('certFileFront', $this->certFileFront, true);
        Model::validateRequired('certFileFrontType', $this->certFileFrontType, true);
        Model::validateRequired('certFileReverse', $this->certFileReverse, true);
        Model::validateRequired('certFileReverseType', $this->certFileReverseType, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }
        if (null !== $this->certFileFront) {
            $res['cert_file_front'] = $this->certFileFront;
        }
        if (null !== $this->certFileFrontType) {
            $res['cert_file_front_type'] = $this->certFileFrontType;
        }
        if (null !== $this->certFileReverse) {
            $res['cert_file_reverse'] = $this->certFileReverse;
        }
        if (null !== $this->certFileReverseType) {
            $res['cert_file_reverse_type'] = $this->certFileReverseType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUserCertRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }
        if (isset($map['cert_file_front'])) {
            $model->certFileFront = $map['cert_file_front'];
        }
        if (isset($map['cert_file_front_type'])) {
            $model->certFileFrontType = $map['cert_file_front_type'];
        }
        if (isset($map['cert_file_reverse'])) {
            $model->certFileReverse = $map['cert_file_reverse'];
        }
        if (isset($map['cert_file_reverse_type'])) {
            $model->certFileReverseType = $map['cert_file_reverse_type'];
        }

        return $model;
    }
}
