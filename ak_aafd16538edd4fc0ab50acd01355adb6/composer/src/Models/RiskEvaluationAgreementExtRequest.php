<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class RiskEvaluationAgreementExtRequest extends Model
{
    // URL：文件地址
    // CONTENT:Base64的文件流
    //
    /**
     * @example URL
     *
     * @var string
     */
    public $type;

    // 文件类型
    // PDF
    /**
     * @example PDF
     *
     * @var string
     */
    public $fileType;

    // type为url是传入文件地址
    // type为CONTENT时传入Base64文件内容编码
    //
    /**
     * @example ewronvdnfidonfsidfis
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'type'     => 'type',
        'fileType' => 'file_type',
        'content'  => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskEvaluationAgreementExtRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
