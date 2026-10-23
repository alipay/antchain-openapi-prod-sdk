<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudMarketingagentFileUploadResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'fileId' => 'file_id',
        'ossFilePath' => 'oss_file_path',
        'accessUrl' => 'access_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->ossFilePath) {
            $res['oss_file_path'] = $this->ossFilePath;
        }
        if (null !== $this->accessUrl) {
            $res['access_url'] = $this->accessUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentFileUploadResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['oss_file_path'])){
            $model->ossFilePath = $map['oss_file_path'];
        }
        if(isset($map['access_url'])){
            $model->accessUrl = $map['access_url'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 上传后的 AFTS 文件 ID
    /**
     * @var string
     */
    public $fileId;

    // OSS 对象路径
    /**
     * @var string
     */
    public $ossFilePath;

    // 图片访问地址，可用于视频生成 input_elements[].url
    /**
     * @var string
     */
    public $accessUrl;

}
