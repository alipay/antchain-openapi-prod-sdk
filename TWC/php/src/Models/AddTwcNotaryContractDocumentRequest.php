<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractDoc;

class AddTwcNotaryContractDocumentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'docs' => 'docs',
        'flowId' => 'flow_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->docs) {
            $res['docs'] = [];
            if(null !== $this->docs && is_array($this->docs)){
                $n = 0;
                foreach($this->docs as $item){
                    $res['docs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddTwcNotaryContractDocumentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['docs'])){
            if(!empty($map['docs'])){
                $model->docs = [];
                $n = 0;
                foreach($map['docs'] as $item) {
                    $model->docs[$n++] = null !== $item ? ContractDoc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 文档列表数据
    /**
     * @var array
     */
    public $docs;

    // 流程ID
    /**
     * @var string
     */
    public $flowId;

}
