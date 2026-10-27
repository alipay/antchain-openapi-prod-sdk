<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetMktExtresulturlResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'requestId' => 'request_id',
        'fileUrl' => 'file_url',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('fileUrl', $this->fileUrl, 1024);
    }
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetMktExtresulturlResponse
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
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
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

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 析出文件下载链接（OSS签名URL，当前有效期24小时）；为空表示析出结果尚未生成，请稍后重试。从底包上传开始7日内链接失效仍可继续获取
    /**
     * @var string
     */
    public $fileUrl;

}
