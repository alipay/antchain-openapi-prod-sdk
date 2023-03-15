<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationEducationstatusRequest extends Model
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

    // 需求ID
    /**
     * @var string
     */
    public $dataSetId;

    // 用户是否已经授权
    /**
     * @var bool
     */
    public $userAuthed;

    // 授权文件索引
    /**
     * @var string
     */
    public $fileIndex;

    // 姓名
    /**
     * @var string
     */
    public $userName;

    // 身份证号
    /**
     * @var string
     */
    public $userCertNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSetId'         => 'data_set_id',
        'userAuthed'        => 'user_authed',
        'fileIndex'         => 'file_index',
        'userName'          => 'user_name',
        'userCertNo'        => 'user_cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('userAuthed', $this->userAuthed, true);
        Model::validateRequired('fileIndex', $this->fileIndex, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userCertNo', $this->userCertNo, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->userAuthed) {
            $res['user_authed'] = $this->userAuthed;
        }
        if (null !== $this->fileIndex) {
            $res['file_index'] = $this->fileIndex;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationEducationstatusRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['user_authed'])) {
            $model->userAuthed = $map['user_authed'];
        }
        if (isset($map['file_index'])) {
            $model->fileIndex = $map['file_index'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
        }

        return $model;
    }
}
