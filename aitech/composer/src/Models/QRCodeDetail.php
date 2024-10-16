<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QRCodeDetail extends Model
{
    // 位置，Top、Left、Width、Height
    /**
     * @example
     *
     * @var int[]
     */
    public $location;

    // 二维码类型
    /**
     * @example 二维码类型
     *
     * @var string
     */
    public $type;

    // 二维码内容
    /**
     * @example 二维码内容
     *
     * @var string
     */
    public $content;

    // 置信度
    /**
     * @example 置信度
     *
     * @var string
     */
    public $probability;
    protected $_name = [
        'location'    => 'location',
        'type'        => 'type',
        'content'     => 'content',
        'probability' => 'probability',
    ];

    public function validate()
    {
        Model::validateRequired('location', $this->location, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('probability', $this->probability, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->probability) {
            $res['probability'] = $this->probability;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QRCodeDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location'])) {
            if (!empty($map['location'])) {
                $model->location = $map['location'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['probability'])) {
            $model->probability = $map['probability'];
        }

        return $model;
    }
}
