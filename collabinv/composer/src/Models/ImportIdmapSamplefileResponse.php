<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ImportIdmapSamplefileResponse extends Model
{
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

    // 上传结果地址路径
    /**
     * @var string
     */
    public $resultFilePath;

    // oss结果文件名称
    /**
     * @var string
     */
    public $resultFileName;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'resultFilePath' => 'result_file_path',
        'resultFileName' => 'result_file_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->resultFilePath) {
            $res['result_file_path'] = $this->resultFilePath;
        }
        if (null !== $this->resultFileName) {
            $res['result_file_name'] = $this->resultFileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIdmapSamplefileResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['result_file_path'])) {
            $model->resultFilePath = $map['result_file_path'];
        }
        if (isset($map['result_file_name'])) {
            $model->resultFileName = $map['result_file_name'];
        }

        return $model;
    }
}
