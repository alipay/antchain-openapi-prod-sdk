<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\DemoClass;

class ApiCreateFileResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'outputString' => 'output_string',
        'fileUrl' => 'file_url',
        'outputDemo' => 'output_demo',
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
        if (null !== $this->outputString) {
            $res['output_string'] = $this->outputString;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->outputDemo) {
            $res['output_demo'] = null !== $this->outputDemo ? $this->outputDemo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApiCreateFileResponse
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
        if(isset($map['output_string'])){
            $model->outputString = $map['output_string'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['output_demo'])){
            $model->outputDemo = DemoClass::fromMap($map['output_demo']);
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

    // output_string
    /**
     * @var string
     */
    public $outputString;

    // file_url
    /**
     * @var string
     */
    public $fileUrl;

    // output_demo
    /**
     * @var DemoClass
     */
    public $outputDemo;

}
