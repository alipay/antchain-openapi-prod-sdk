<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessSignResult extends Model
{
    // 签名结果，外部用户签署返回
    /**
     * @example
     *
     * @var string
     */
    public $signResult;

    // 签署日志id，外部用户签署返回
    /**
     * @example
     *
     * @var string
     */
    public $signlogId;

    // 第三方文档id
    /**
     * @example
     *
     * @var string
     */
    public $thirdDocId;
    protected $_name = [
        'signResult' => 'sign_result',
        'signlogId'  => 'signlog_id',
        'thirdDocId' => 'third_doc_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        if (null !== $this->signlogId) {
            $res['signlog_id'] = $this->signlogId;
        }
        if (null !== $this->thirdDocId) {
            $res['third_doc_id'] = $this->thirdDocId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WitnessSignResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_result'])) {
            $model->signResult = $map['sign_result'];
        }
        if (isset($map['signlog_id'])) {
            $model->signlogId = $map['signlog_id'];
        }
        if (isset($map['third_doc_id'])) {
            $model->thirdDocId = $map['third_doc_id'];
        }

        return $model;
    }
}
