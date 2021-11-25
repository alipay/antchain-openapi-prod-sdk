<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CertifyLPDTO extends Model
{
    // 认证id
    /**
     * @example 认证id
     *
     * @var string
     */
    public $certifyId;

    // 二维码url
    /**
     * @example 二维码url
     *
     * @var string
     */
    public $qrUrl;

    // 二维码中的Logo的图片地址
    /**
     * @example  二维码中的Logo的图片地址
     *
     * @var string
     */
    public $imgUrl;

    // 二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
    /**
     * @example  二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
     *
     * @var string
     */
    public $ratio;

    // 过期时间戳，单位毫秒
    /**
     * @example 过期时间戳，单位毫秒
     *
     * @var int
     */
    public $expires;
    protected $_name = [
        'certifyId' => 'certify_id',
        'qrUrl'     => 'qr_url',
        'imgUrl'    => 'img_url',
        'ratio'     => 'ratio',
        'expires'   => 'expires',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('qrUrl', $this->qrUrl, true);
        Model::validateRequired('imgUrl', $this->imgUrl, true);
        Model::validateRequired('ratio', $this->ratio, true);
        Model::validateRequired('expires', $this->expires, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->qrUrl) {
            $res['qr_url'] = $this->qrUrl;
        }
        if (null !== $this->imgUrl) {
            $res['img_url'] = $this->imgUrl;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->expires) {
            $res['expires'] = $this->expires;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyLPDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['qr_url'])) {
            $model->qrUrl = $map['qr_url'];
        }
        if (isset($map['img_url'])) {
            $model->imgUrl = $map['img_url'];
        }
        if (isset($map['ratio'])) {
            $model->ratio = $map['ratio'];
        }
        if (isset($map['expires'])) {
            $model->expires = $map['expires'];
        }

        return $model;
    }
}
