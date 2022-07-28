<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateDirectmonitorTaskRequest extends Model
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

    // 提交类型，FILE/URL
    //
    /**
     * @var string
     */
    public $submitType;

    // submitType 是FILE就传 oss fileId，是URL就传url地址
    /**
     * @var string
     */
    public $submitContent;

    // 文件名称
    /**
     * @var string
     */
    public $fileName;

    // 文件类别 IMAGE/TEXT/VIDEO/AUDIO
    //
    /**
     * @var string
     */
    public $fileType;

    // 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
    /**
     * @var string
     */
    public $detailFileType;

    // 定向监测任务名称
    /**
     * @var string
     */
    public $taskName;

    // 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'submitType'        => 'submit_type',
        'submitContent'     => 'submit_content',
        'fileName'          => 'file_name',
        'fileType'          => 'file_type',
        'detailFileType'    => 'detail_file_type',
        'taskName'          => 'task_name',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('submitType', $this->submitType, true);
        Model::validateRequired('submitContent', $this->submitContent, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('detailFileType', $this->detailFileType, true);
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
        if (null !== $this->submitType) {
            $res['submit_type'] = $this->submitType;
        }
        if (null !== $this->submitContent) {
            $res['submit_content'] = $this->submitContent;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->detailFileType) {
            $res['detail_file_type'] = $this->detailFileType;
        }
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDirectmonitorTaskRequest
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
        if (isset($map['submit_type'])) {
            $model->submitType = $map['submit_type'];
        }
        if (isset($map['submit_content'])) {
            $model->submitContent = $map['submit_content'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['detail_file_type'])) {
            $model->detailFileType = $map['detail_file_type'];
        }
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
