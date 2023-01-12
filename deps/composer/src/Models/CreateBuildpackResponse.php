<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateBuildpackResponse extends Model
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

    // 创建完成的技术栈ID
    /**
     * @var string
     */
    public $buildpackId;

    // 技术栈包上传地址信息
    /**
     * @var UploadEndpoint[]
     */
    public $uploadEndpoints;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'buildpackId'     => 'buildpack_id',
        'uploadEndpoints' => 'upload_endpoints',
    ];

    public function validate()
    {
        Model::validateRequired('buildpackId', $this->buildpackId, true);
        Model::validateRequired('uploadEndpoints', $this->uploadEndpoints, true);
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
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->uploadEndpoints) {
            $res['upload_endpoints'] = [];
            if (null !== $this->uploadEndpoints && \is_array($this->uploadEndpoints)) {
                $n = 0;
                foreach ($this->uploadEndpoints as $item) {
                    $res['upload_endpoints'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBuildpackResponse
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
        if (isset($map['buildpack_id'])) {
            $model->buildpackId = $map['buildpack_id'];
        }
        if (isset($map['upload_endpoints'])) {
            if (!empty($map['upload_endpoints'])) {
                $model->uploadEndpoints = [];
                $n                      = 0;
                foreach ($map['upload_endpoints'] as $item) {
                    $model->uploadEndpoints[$n++] = null !== $item ? UploadEndpoint::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
