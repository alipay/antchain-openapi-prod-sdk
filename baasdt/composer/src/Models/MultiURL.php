<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class MultiURL extends Model
{
    // 上传的图片正常大小
    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=REH79oOsx5MK4%2BEGcFmaSXq6XsM%3D
     *
     * @var string
     */
    public $normal;

    // style200
    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=LoirSoaWnC5bhIP%2BWZT0OqLlSy4%3D&x-oss-process=style%2Fscale_image_200
     *
     * @var string
     */
    public $style200;

    // style150
    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=A1f%2FtKicryG8VOG%2BpAdSyUNLmCs%3D&x-oss-process=style%2Fscale_image_150
     *
     * @var string
     */
    public $style150;

    // style70
    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=QxDxjfSFlpjxB7nKdYr%2BISoMPCI%3D&x-oss-process=style%2Fscale_image_70
     *
     * @var string
     */
    public $style70;
    protected $_name = [
        'normal'   => 'normal',
        'style200' => 'style_200',
        'style150' => 'style_150',
        'style70'  => 'style_70',
    ];

    public function validate()
    {
        Model::validateRequired('normal', $this->normal, true);
        Model::validateRequired('style200', $this->style200, true);
        Model::validateRequired('style150', $this->style150, true);
        Model::validateRequired('style70', $this->style70, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->normal) {
            $res['normal'] = $this->normal;
        }
        if (null !== $this->style200) {
            $res['style_200'] = $this->style200;
        }
        if (null !== $this->style150) {
            $res['style_150'] = $this->style150;
        }
        if (null !== $this->style70) {
            $res['style_70'] = $this->style70;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiURL
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['normal'])) {
            $model->normal = $map['normal'];
        }
        if (isset($map['style_200'])) {
            $model->style200 = $map['style_200'];
        }
        if (isset($map['style_150'])) {
            $model->style150 = $map['style_150'];
        }
        if (isset($map['style_70'])) {
            $model->style70 = $map['style_70'];
        }

        return $model;
    }
}
