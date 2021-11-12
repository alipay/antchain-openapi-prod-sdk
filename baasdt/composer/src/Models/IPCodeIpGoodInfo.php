<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeIpGoodInfo extends Model
{
    // IP名称
    /**
     * @example 飞天小女警
     *
     * @var string
     */
    public $ipName;

    // IP描述
    /**
     * @example 飞天小女警是深受90后喜欢的一款Ip。
     *
     * @var string
     */
    public $ipDescription;

    // IP主图oss地址
    /**
     * @example OSS://9ff608718f98f7c52746a6a1eda180ab55b1d5d008ba796f98b3cf484f275a36.jpeg;
     *
     * @var string
     */
    public $ipImgUrl;

    // IP主图，非oss地址，可直接访问的图片地址
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $ipImgUrlTmp;
    protected $_name = [
        'ipName'        => 'ip_name',
        'ipDescription' => 'ip_description',
        'ipImgUrl'      => 'ip_img_url',
        'ipImgUrlTmp'   => 'ip_img_url_tmp',
    ];

    public function validate()
    {
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validateRequired('ipDescription', $this->ipDescription, true);
        Model::validateRequired('ipImgUrl', $this->ipImgUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->ipDescription) {
            $res['ip_description'] = $this->ipDescription;
        }
        if (null !== $this->ipImgUrl) {
            $res['ip_img_url'] = $this->ipImgUrl;
        }
        if (null !== $this->ipImgUrlTmp) {
            $res['ip_img_url_tmp'] = $this->ipImgUrlTmp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeIpGoodInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['ip_description'])) {
            $model->ipDescription = $map['ip_description'];
        }
        if (isset($map['ip_img_url'])) {
            $model->ipImgUrl = $map['ip_img_url'];
        }
        if (isset($map['ip_img_url_tmp'])) {
            $model->ipImgUrlTmp = $map['ip_img_url_tmp'];
        }

        return $model;
    }
}
