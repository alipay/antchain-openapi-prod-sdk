<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SeriesDiagramErrorReason extends Model
{
    // 系列图单个图片所属页码
    /**
     * @example 1
     *
     * @var int
     */
    public $imagePdfPageIndex;

    // 错误原因英文
    /**
     * @example 错误原因英文
     *
     * @var string
     */
    public $error;

    // 错误原因中文
    /**
     * @example 错误原因中文
     *
     * @var string
     */
    public $errorCn;
    protected $_name = [
        'imagePdfPageIndex' => 'image_pdf_page_index',
        'error'             => 'error',
        'errorCn'           => 'error_cn',
    ];

    public function validate()
    {
        Model::validateRequired('imagePdfPageIndex', $this->imagePdfPageIndex, true);
        Model::validateRequired('error', $this->error, true);
        Model::validateRequired('errorCn', $this->errorCn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imagePdfPageIndex) {
            $res['image_pdf_page_index'] = $this->imagePdfPageIndex;
        }
        if (null !== $this->error) {
            $res['error'] = $this->error;
        }
        if (null !== $this->errorCn) {
            $res['error_cn'] = $this->errorCn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SeriesDiagramErrorReason
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image_pdf_page_index'])) {
            $model->imagePdfPageIndex = $map['image_pdf_page_index'];
        }
        if (isset($map['error'])) {
            $model->error = $map['error'];
        }
        if (isset($map['error_cn'])) {
            $model->errorCn = $map['error_cn'];
        }

        return $model;
    }
}
