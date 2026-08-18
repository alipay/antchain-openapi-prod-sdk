<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class FileInfoDto extends Model {
    protected $_name = [
        'url' => 'url',
    ];
    public function validate() {
        Model::validateRequired('url', $this->url, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FileInfoDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    // 文件url
    /**
     * @example https://xxx.alipay.com/paths/xx.png
     * @var string
     */
    public $url;

}
