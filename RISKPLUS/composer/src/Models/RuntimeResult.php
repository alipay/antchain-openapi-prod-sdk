<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RuntimeResult extends Model
{
    // 上传成功
    /**
     * @example 0
     *
     * @var int
     */
    public $code;

    // true代表上传成功，false代表上传失败
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 上文件传成功
    /**
     * @example OK
     *
     * @var string
     */
    public $resultmsg;

    // 文件上传结果
    /**
     * @example [fileInfoReceive api success!]
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'code'      => 'code',
        'success'   => 'success',
        'resultmsg' => 'resultmsg',
        'data'      => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('resultmsg', $this->resultmsg, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->resultmsg) {
            $res['resultmsg'] = $this->resultmsg;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RuntimeResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['resultmsg'])) {
            $model->resultmsg = $map['resultmsg'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
