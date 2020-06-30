<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadImageResponse extends Model {
    protected $_name = [
        'temporaryUrl' => 'temporary_url',
        'url' => 'url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->temporaryUrl) {
            $res['temporary_url'] = $this->temporaryUrl;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadImageResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['temporary_url'])){
            $model->temporaryUrl = $map['temporary_url'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    /**
     * @description 临时可访问的url，过期时间2小时
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/3dccde5f050ebebda7c2e97f1ac7d3678adb43be92d7eb2bf16bdd42ab055afd.jpeg?Expires=1581581946&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=Z5TQBAohn6RjvevJf1RfvjthlIM%3D
     * @var string
     */
    public $temporaryUrl;

    /**
     * @description 图片的不可访问url，发布权益时使用
     * @example oss://myexchange/1259371fc8f77d37aab22d949ea51f4982fea55dfb6d130facf32dd6d4257fa0.jpeg
     * @var string
     */
    public $url;

}
