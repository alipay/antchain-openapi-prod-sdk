<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class NotaryRecord extends Model
{
    // 存证记录
    /**
     * @example
     *
     * @var NameValuePair[]
     */
    public $attributes;

    // 二维码链接
    /**
     * @example https://xxx.com/p/s/xxx-web/?bizid=a00e36c5
     *
     * @var string
     */
    public $qrCodeUrl;
    protected $_name = [
        'attributes' => 'attributes',
        'qrCodeUrl'  => 'qr_code_url',
    ];

    public function validate()
    {
        Model::validateRequired('attributes', $this->attributes, true);
        Model::validateRequired('qrCodeUrl', $this->qrCodeUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attributes) {
            $res['attributes'] = [];
            if (null !== $this->attributes && \is_array($this->attributes)) {
                $n = 0;
                foreach ($this->attributes as $item) {
                    $res['attributes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->qrCodeUrl) {
            $res['qr_code_url'] = $this->qrCodeUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attributes'])) {
            if (!empty($map['attributes'])) {
                $model->attributes = [];
                $n                 = 0;
                foreach ($map['attributes'] as $item) {
                    $model->attributes[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['qr_code_url'])) {
            $model->qrCodeUrl = $map['qr_code_url'];
        }

        return $model;
    }
}
