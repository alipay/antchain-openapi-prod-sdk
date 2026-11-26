<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiKbInfo extends Model {
    protected $_name = [
        'kbId' => 'kb_id',
        'name' => 'name',
        'description' => 'description',
        'provider' => 'provider',
        'enable' => 'enable',
        'contentCount' => 'content_count',
        'paragraphCount' => 'paragraph_count',
        'associatedProductKeys' => 'associated_product_keys',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('contentCount', $this->contentCount, true);
        Model::validateRequired('paragraphCount', $this->paragraphCount, true);
        Model::validateRequired('associatedProductKeys', $this->associatedProductKeys, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->contentCount) {
            $res['content_count'] = $this->contentCount;
        }
        if (null !== $this->paragraphCount) {
            $res['paragraph_count'] = $this->paragraphCount;
        }
        if (null !== $this->associatedProductKeys) {
            $res['associated_product_keys'] = $this->associatedProductKeys;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiKbInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        if(isset($map['enable'])){
            $model->enable = $map['enable'];
        }
        if(isset($map['content_count'])){
            $model->contentCount = $map['content_count'];
        }
        if(isset($map['paragraph_count'])){
            $model->paragraphCount = $map['paragraph_count'];
        }
        if(isset($map['associated_product_keys'])){
            if(!empty($map['associated_product_keys'])){
                $model->associatedProductKeys = $map['associated_product_keys'];
            }
        }
        return $model;
    }
    /**
     * @example undefined
     * @var string
     */
    public $kbId;

    // 映射kbName
    /**
     * @example undefined
     * @var string
     */
    public $name;

    // 映射kbDescription
    /**
     * @example undefined
     * @var string
     */
    public $description;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * @example undefined
     * @var string
     */
    public $provider;

    /**
     * @example undefined
     * @var bool
     */
    public $enable;

    // 映射docCount
    /**
     * @example undefined
     * @var int
     */
    public $contentCount;

    /**
     * @example undefined
     * @var int
     */
    public $paragraphCount;

    // 沿现有关联查询聚合；不新增版本账本
    /**
     * @example undefined
     * @var string[]
     */
    public $associatedProductKeys;

}
